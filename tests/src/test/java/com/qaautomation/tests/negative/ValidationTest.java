package com.qaautomation.tests.negative;

import static com.qaautomation.framework.assertions.ApiAssertions.assertThatResponse;

import com.qaautomation.framework.annotations.Feature;
import com.qaautomation.framework.clients.Sut;
import com.qaautomation.framework.clients.model.NewAccount;
import com.qaautomation.framework.data.Region;
import com.qaautomation.framework.data.TestAccount;
import com.qaautomation.framework.data.TestData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/** Every invalid input is a precise RFC 7807 problem that names what is wrong. */
public class ValidationTest {

  private final Sut sut = Sut.connect();

  @DataProvider(name = "invalidAccounts", parallel = true)
  public Object[][] invalidAccounts() {
    String handle = TestData.uniqueHandle();
    String password = TestData.password();
    return new Object[][] {
      {"handle too short", new NewAccount("ab", "Name", password, "eu"), "handle"},
      {"handle with capitals", new NewAccount("Bad-Handle", "Name", password, "eu"), "handle"},
      {"blank display name", new NewAccount(handle, "   ", password, "eu"), "displayName"},
      {"password too short", new NewAccount(handle, "Name", "short", "eu"), "password"},
      {"unknown region", new NewAccount(handle, "Name", password, "mars"), "region"},
    };
  }

  @Test(
      groups = {"regression"},
      dataProvider = "invalidAccounts",
      description = "An invalid account request is a 422 naming the field")
  @Feature({"FEAT-ACCT-02", "FEAT-ERR-01"})
  public void invalidAccountIsA422NamingTheField(String why, NewAccount request, String field) {
    assertThatResponse(sut.accounts().create(request)).hasFieldError(field);
  }

  @Test(
      groups = {"regression"},
      description = "A body that is not JSON is a 400 malformed-json problem")
  @Feature("FEAT-ERR-01")
  public void malformedJsonIsA400() {
    assertThatResponse(sut.accounts().createRaw("{\"handle\": ", "application/json"))
        .isProblem(400, "malformed-json");
  }

  @Test(
      groups = {"regression"},
      description = "A body that is not application/json is a 415")
  @Feature("FEAT-ERR-01")
  public void wrongContentTypeIsA415() {
    assertThatResponse(sut.accounts().createRaw("handle=qa-x", "text/plain"))
        .isProblem(415, "unsupported-media-type");
  }

  @Test(
      groups = {"regression"},
      description = "A handle that is already taken is a 409")
  @Feature({"FEAT-ACCT-01", "FEAT-ERR-01"})
  public void takenHandleIsA409() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      NewAccount duplicate = new NewAccount(ava.handle(), "Copy", TestData.password(), "eu");

      assertThatResponse(sut.accounts().create(duplicate)).isProblem(409, "handle-taken");
    }
  }

  @Test(
      groups = {"regression"},
      description = "Unknown conversations and handles are 404 problems")
  @Feature("FEAT-ERR-01")
  public void unknownResourcesAre404() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      assertThatResponse(sut.conversations(ava).get("cnv_does-not-exist"))
          .isProblem(404, "not-found");
      assertThatResponse(sut.accounts(ava).publicProfile("qa-nobody-here"))
          .isProblem(404, "not-found");
    }
  }
}
