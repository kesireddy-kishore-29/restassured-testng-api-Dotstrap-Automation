# Transcript: A deleted booking is gone (404 on read)

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#deletedBookingIsGone` |
| Features | FEAT-BOOK-04 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 851 | `qa-176c536f-85c7-48cc-bb16-72ebdd8414f1` |
| 2 | `POST /auth` | 200 | 117 | `qa-50fe9d09-3326-4a2d-8be9-91be72b72a6e` |
| 3 | `DELETE /booking/{id}` | 201 | 108 | `qa-f4213373-ef38-483e-8175-48b03ac31e12` |
| 4 | `GET /booking/{id}` | 404 | 108 | `qa-fd2e1b12-4019-4035-b5ee-b6fb101c88f1` |
| 5 | `GET /booking/{id}` | 404 | 104 | `qa-5fd1786e-8a57-4c16-bac1-edc7a2666cf7` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-176c536f-85c7-48cc-bb16-72ebdd8414f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-176c536f-85c7-48cc-bb16-72ebdd8414f1
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-bcdd9a69","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 851 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:46 GMT
Etag: W/"cd-8rsC71DLRhlebzxjPDm3Ve/JtwE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=SWMeqsw23cRKcg3K94uKJ33Ahv3kFCVjlDBvi8xSdTc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001286"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=SWMeqsw23cRKcg3K94uKJ33Ahv3kFCVjlDBvi8xSdTc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001286"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3319,"booking":{"firstname":"QA","lastname":"Guest-bcdd9a69","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}}
```

## 2. POST /auth

```text
#2 POST https://restful-booker.herokuapp.com/auth
correlation: qa-50fe9d09-3326-4a2d-8be9-91be72b72a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50fe9d09-3326-4a2d-8be9-91be72b72a6e
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 117 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:47 GMT
Etag: W/"1b-hqOSgqqSLS/gqDqfxsD4j37drDc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001287"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001287"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3319
correlation: qa-f4213373-ef38-483e-8175-48b03ac31e12

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f4213373-ef38-483e-8175-48b03ac31e12
Content-Type: application/json

--- response: 201 in 108 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:47 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001287"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001287"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3319
correlation: qa-fd2e1b12-4019-4035-b5ee-b6fb101c88f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd2e1b12-4019-4035-b5ee-b6fb101c88f1
Content-Type: application/json

--- response: 404 in 108 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:47 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001287"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001287"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3319
correlation: qa-5fd1786e-8a57-4c16-bac1-edc7a2666cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fd1786e-8a57-4c16-bac1-edc7a2666cf7
Content-Type: application/json

--- response: 404 in 104 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:47 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001287"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001287"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
