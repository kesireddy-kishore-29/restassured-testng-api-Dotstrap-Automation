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
| 1 | `POST /booking` | 200 | 27 | `qa-75f4f64d-0cc0-41fa-8041-e973b4579ffc` |
| 2 | `DELETE /booking/{id}` | 201 | 26 | `qa-b0fac811-cf63-4552-8450-8563cd877c59` |
| 3 | `GET /booking/{id}` | 404 | 26 | `qa-39800d37-22e3-4b9d-a2b6-7294e3a1d07c` |
| 4 | `GET /booking/{id}` | 404 | 29 | `qa-6f4307c9-ca07-4645-a7bb-f0b8f30a76a3` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-75f4f64d-0cc0-41fa-8041-e973b4579ffc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75f4f64d-0cc0-41fa-8041-e973b4579ffc
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-23bd2123","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 27 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"cd-loC9JCYBWS/VtTGX7qapOFM/FkY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3805,"booking":{"firstname":"QA","lastname":"Guest-23bd2123","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/3805
correlation: qa-b0fac811-cf63-4552-8450-8563cd877c59

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b0fac811-cf63-4552-8450-8563cd877c59
Content-Type: application/json

--- response: 201 in 26 ms ---
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

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3805
correlation: qa-39800d37-22e3-4b9d-a2b6-7294e3a1d07c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39800d37-22e3-4b9d-a2b6-7294e3a1d07c
Content-Type: application/json

--- response: 404 in 26 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3805
correlation: qa-6f4307c9-ca07-4645-a7bb-f0b8f30a76a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f4307c9-ca07-4645-a7bb-f0b8f30a76a3
Content-Type: application/json

--- response: 404 in 29 ms ---
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
