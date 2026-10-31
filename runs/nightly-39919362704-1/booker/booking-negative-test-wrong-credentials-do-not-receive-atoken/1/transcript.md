# Transcript: Wrong credentials do not receive a token

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#wrongCredentialsDoNotReceiveAToken` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /auth` | 200 | 194 | `qa-dcf3d7dc-58fa-493f-b6cc-4f5007ac130b` |

## 1. POST /auth

```text
#1 POST https://restful-booker.herokuapp.com/auth
correlation: qa-dcf3d7dc-58fa-493f-b6cc-4f5007ac130b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcf3d7dc-58fa-493f-b6cc-4f5007ac130b
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 194 ms ---
Content-Length: 28
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:36 GMT
Etag: W/"1c-J3EiwfZwVQjKTKvpvazUfTni8fI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NsBwuFMrxMUmCG34gISLVLTq4ICB%2Fb0%2BFavPEO4A1Xw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741296"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NsBwuFMrxMUmCG34gISLVLTq4ICB%2Fb0%2BFavPEO4A1Xw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741296"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"reason":"Bad credentials"}
```
