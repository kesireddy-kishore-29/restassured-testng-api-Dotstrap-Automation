# Transcript: A partial update changes only the named fields

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#partialUpdateChangesOnlyNamedFields` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 257 | `qa-99599823-869b-43fd-affc-86f4f3708dc8` |
| 2 | `PATCH /booking/{id}` | 200 | 234 | `qa-5bf04e6f-d70b-477b-9728-084d322e325d` |
| 3 | `DELETE /booking/{id}` | 201 | 225 | `qa-a2c95cea-1eec-416d-a56a-caea56530a2c` |
| 4 | `GET /booking/{id}` | 404 | 238 | `qa-1a95452e-f714-43da-93fa-adba731ce0c7` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-99599823-869b-43fd-affc-86f4f3708dc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99599823-869b-43fd-affc-86f4f3708dc8
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-c2c10992","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}

--- response: 200 in 257 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:06 GMT
Etag: W/"d0-iLsYkS/2eft9VT/E3/8T8LhJmP0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263146"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263146"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4332,"booking":{"firstname":"Linus","lastname":"Guest-c2c10992","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/4332
correlation: qa-5bf04e6f-d70b-477b-9728-084d322e325d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5bf04e6f-d70b-477b-9728-084d322e325d
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 234 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:06 GMT
Etag: W/"b3-pirMXn9D5XEOWfJUUsbkswEt7+U"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263146"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263146"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-c2c10992","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4332
correlation: qa-a2c95cea-1eec-416d-a56a-caea56530a2c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a2c95cea-1eec-416d-a56a-caea56530a2c
Content-Type: application/json

--- response: 201 in 225 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:06 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263146"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263146"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4332
correlation: qa-1a95452e-f714-43da-93fa-adba731ce0c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a95452e-f714-43da-93fa-adba731ce0c7
Content-Type: application/json

--- response: 404 in 238 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:07 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Qe2yBPBgiaQUP0i1FAX4Z4Y9ZvtbvOCqsKFheWawYpw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263147"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Qe2yBPBgiaQUP0i1FAX4Z4Y9ZvtbvOCqsKFheWawYpw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263147"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
