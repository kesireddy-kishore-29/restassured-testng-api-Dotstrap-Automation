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
| 1 | `POST /booking` | 200 | 43 | `qa-9a530403-9593-4a73-b6fd-2aaa9bf1f1f3` |
| 2 | `GET /booking/{id}` | 200 | 30 | `qa-6b358d5a-9f62-4efb-877a-0dec9b214150` |
| 3 | `POST /auth` | 200 | 33 | `qa-2202f07b-751f-42db-8216-5c8ddb0d0c3c` |
| 4 | `DELETE /booking/{id}` | 201 | 31 | `qa-b052f255-b7e2-4cf7-877d-3637cb92e9e3` |
| 5 | `GET /booking/{id}` | 404 | 32 | `qa-ef63c31a-34d4-43ff-b8b0-eea076fbe4a1` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-9a530403-9593-4a73-b6fd-2aaa9bf1f1f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a530403-9593-4a73-b6fd-2aaa9bf1f1f3
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-33041dd6","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Late check-in"}

--- response: 200 in 43 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"d2-ByKgUrBMOS1g1VXog3LMPJsJwm0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3801,"booking":{"firstname":"Ada","lastname":"Guest-33041dd6","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/3801
correlation: qa-6b358d5a-9f62-4efb-877a-0dec9b214150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b358d5a-9f62-4efb-877a-0dec9b214150
Content-Type: application/json

--- response: 200 in 30 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"b5-fvw0CqMtB0Ec9VrPUAB1Cprla2Y"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-33041dd6","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-2202f07b-751f-42db-8216-5c8ddb0d0c3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2202f07b-751f-42db-8216-5c8ddb0d0c3c
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 33 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"1b-irwT+PCqJtiY1hVea1z/U23wjNc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3801
correlation: qa-b052f255-b7e2-4cf7-877d-3637cb92e9e3

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b052f255-b7e2-4cf7-877d-3637cb92e9e3
Content-Type: application/json

--- response: 201 in 31 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3801
correlation: qa-ef63c31a-34d4-43ff-b8b0-eea076fbe4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef63c31a-34d4-43ff-b8b0-eea076fbe4a1
Content-Type: application/json

--- response: 404 in 32 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
