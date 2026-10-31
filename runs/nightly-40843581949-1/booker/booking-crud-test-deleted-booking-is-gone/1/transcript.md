# Transcript: A deleted booking is gone (404 on read)

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#deletedBookingIsGone` |
| Features | FEAT-BOOK-04 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 225 | `qa-6426479e-cc19-44b8-a174-436427188234` |
| 2 | `DELETE /booking/{id}` | 201 | 240 | `qa-544ca6fa-ffff-47ae-adf9-fc6032e743de` |
| 3 | `GET /booking/{id}` | 404 | 235 | `qa-678e21de-6588-4670-9649-ee3e43c1c984` |
| 4 | `GET /booking/{id}` | 404 | 239 | `qa-d203403f-6fbe-443b-ab4c-dd41622b71ab` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-6426479e-cc19-44b8-a174-436427188234

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6426479e-cc19-44b8-a174-436427188234
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-14720447","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}

--- response: 200 in 225 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:05 GMT
Etag: W/"cd-+pfjzcVOVjHH6psQCsjCA1pviJY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263145"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263145"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4321,"booking":{"firstname":"QA","lastname":"Guest-14720447","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/4321
correlation: qa-544ca6fa-ffff-47ae-adf9-fc6032e743de

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-544ca6fa-ffff-47ae-adf9-fc6032e743de
Content-Type: application/json

--- response: 201 in 240 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:05 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263145"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263145"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4321
correlation: qa-678e21de-6588-4670-9649-ee3e43c1c984

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-678e21de-6588-4670-9649-ee3e43c1c984
Content-Type: application/json

--- response: 404 in 235 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:05 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263145"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263145"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4321
correlation: qa-d203403f-6fbe-443b-ab4c-dd41622b71ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d203403f-6fbe-443b-ab4c-dd41622b71ab
Content-Type: application/json

--- response: 404 in 239 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:06 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263146"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263146"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
