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
| 1 | `POST /booking` | 200 | 129 | `qa-a5ba6a19-65f4-44d9-a5c9-e3b47072174d` |
| 2 | `DELETE /booking/{id}` | 201 | 130 | `qa-1031422d-e498-4470-99be-313016b34605` |
| 3 | `GET /booking/{id}` | 404 | 120 | `qa-3fe47c58-637a-4e3a-902c-f5023edef764` |
| 4 | `GET /booking/{id}` | 404 | 134 | `qa-1c94ed98-89dd-4b0f-bd91-dfe7286e1f4b` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a5ba6a19-65f4-44d9-a5c9-e3b47072174d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5ba6a19-65f4-44d9-a5c9-e3b47072174d
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-a8bf000a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}

--- response: 200 in 129 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"cd-5/sdSCi5TB+vgI3d5bgJlgvrSPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1906,"booking":{"firstname":"QA","lastname":"Guest-a8bf000a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/1906
correlation: qa-1031422d-e498-4470-99be-313016b34605

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1031422d-e498-4470-99be-313016b34605
Content-Type: application/json

--- response: 201 in 130 ms ---
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

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1906
correlation: qa-3fe47c58-637a-4e3a-902c-f5023edef764

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fe47c58-637a-4e3a-902c-f5023edef764
Content-Type: application/json

--- response: 404 in 120 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1906
correlation: qa-1c94ed98-89dd-4b0f-bd91-dfe7286e1f4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c94ed98-89dd-4b0f-bd91-dfe7286e1f4b
Content-Type: application/json

--- response: 404 in 134 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:20 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389660"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389660"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
