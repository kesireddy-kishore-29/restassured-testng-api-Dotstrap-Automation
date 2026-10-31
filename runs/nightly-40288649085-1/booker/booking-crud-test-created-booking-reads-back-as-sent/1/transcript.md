# Transcript: A created booking reads back exactly as sent

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#createdBookingReadsBackAsSent` |
| Features | FEAT-BOOK-01, FEAT-BOOK-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 848 | `qa-921db2e6-322e-40ac-9589-0ce8302b7568` |
| 2 | `GET /booking/{id}` | 200 | 124 | `qa-3825f808-3838-4000-aa06-9bfcb3e74887` |
| 3 | `POST /auth` | 200 | 112 | `qa-76f01cf0-d92f-4153-ad46-d6069618a426` |
| 4 | `DELETE /booking/{id}` | 201 | 104 | `qa-8c421ac3-9fe0-4d03-ad86-01e646922fab` |
| 5 | `GET /booking/{id}` | 404 | 120 | `qa-d165958a-8871-4a41-b061-ee79125f4957` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-921db2e6-322e-40ac-9589-0ce8302b7568

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-921db2e6-322e-40ac-9589-0ce8302b7568
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-24037997","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Late check-in"}

--- response: 200 in 848 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:46 GMT
Etag: W/"d2-FIxHVTtqcg4Zyhxg1IBy4denlzA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=SWMeqsw23cRKcg3K94uKJ33Ahv3kFCVjlDBvi8xSdTc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001286"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=SWMeqsw23cRKcg3K94uKJ33Ahv3kFCVjlDBvi8xSdTc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001286"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3318,"booking":{"firstname":"Ada","lastname":"Guest-24037997","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/3318
correlation: qa-3825f808-3838-4000-aa06-9bfcb3e74887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3825f808-3838-4000-aa06-9bfcb3e74887
Content-Type: application/json

--- response: 200 in 124 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:47 GMT
Etag: W/"b5-rjFhaAGmtG0dczNcwYTWKCmFf0Q"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001287"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001287"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-24037997","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-76f01cf0-d92f-4153-ad46-d6069618a426

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76f01cf0-d92f-4153-ad46-d6069618a426
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 112 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:47 GMT
Etag: W/"1b-mvv3I9ihzNaw1WzQy/mKyaA9ep4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001287"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001287"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3318
correlation: qa-8c421ac3-9fe0-4d03-ad86-01e646922fab

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8c421ac3-9fe0-4d03-ad86-01e646922fab
Content-Type: application/json

--- response: 201 in 104 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3318
correlation: qa-d165958a-8871-4a41-b061-ee79125f4957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d165958a-8871-4a41-b061-ee79125f4957
Content-Type: application/json

--- response: 404 in 120 ms ---
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
