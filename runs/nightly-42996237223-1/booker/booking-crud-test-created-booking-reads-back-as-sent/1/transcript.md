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
| 1 | `POST /booking` | 200 | 125 | `qa-e359ab36-39bb-47bc-819e-f850c3e04193` |
| 2 | `GET /booking/{id}` | 200 | 131 | `qa-21a89293-08e4-40a9-bd06-7001f4143c21` |
| 3 | `POST /auth` | 200 | 132 | `qa-d7a0bb0d-36d2-48c6-aaf2-296bb97d5c5f` |
| 4 | `DELETE /booking/{id}` | 201 | 125 | `qa-a8c59377-b179-44d6-ba5e-c297f850103c` |
| 5 | `GET /booking/{id}` | 404 | 125 | `qa-5e479b5c-1245-4eb5-99ce-2805e1e5ba2d` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-e359ab36-39bb-47bc-819e-f850c3e04193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e359ab36-39bb-47bc-819e-f850c3e04193
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-007c5c5d","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Late check-in"}

--- response: 200 in 125 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:18 GMT
Etag: W/"d2-MIkcIXKQVD9lZHS48/pOAAXXqIo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389658"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389658"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1896,"booking":{"firstname":"Ada","lastname":"Guest-007c5c5d","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/1896
correlation: qa-21a89293-08e4-40a9-bd06-7001f4143c21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21a89293-08e4-40a9-bd06-7001f4143c21
Content-Type: application/json

--- response: 200 in 131 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"b5-GYU9illGguHRe5kHWo2ueCa8ZA0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-007c5c5d","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-d7a0bb0d-36d2-48c6-aaf2-296bb97d5c5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7a0bb0d-36d2-48c6-aaf2-296bb97d5c5f
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 132 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"1b-U5S7XvMteEYYCEa/csDaecThN7M"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/1896
correlation: qa-a8c59377-b179-44d6-ba5e-c297f850103c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a8c59377-b179-44d6-ba5e-c297f850103c
Content-Type: application/json

--- response: 201 in 125 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/1896
correlation: qa-5e479b5c-1245-4eb5-99ce-2805e1e5ba2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e479b5c-1245-4eb5-99ce-2805e1e5ba2d
Content-Type: application/json

--- response: 404 in 125 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
