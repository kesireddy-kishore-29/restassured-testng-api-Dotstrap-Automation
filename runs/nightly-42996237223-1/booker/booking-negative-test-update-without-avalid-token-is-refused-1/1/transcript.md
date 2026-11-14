# Transcript: An update without a valid token is refused and changes nothing [Optional[not-a-real-token]]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[1]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 127 | `qa-2e9bc48b-ce58-4a41-b823-9924ee8c9fad` |
| 2 | `PUT /booking/{id}` | 403 | 120 | `qa-8583246e-7380-47f1-af5f-c1005b86de30` |
| 3 | `GET /booking/{id}` | 200 | 123 | `qa-219b28a4-f608-4eb6-87b9-3d1c4722c3c0` |
| 4 | `DELETE /booking/{id}` | 201 | 121 | `qa-34512527-4a1f-4466-9c6a-7f0b205e79b1` |
| 5 | `GET /booking/{id}` | 404 | 133 | `qa-97debfa2-0bd9-4758-9e07-41973112ef47` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-2e9bc48b-ce58-4a41-b823-9924ee8c9fad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e9bc48b-ce58-4a41-b823-9924ee8c9fad
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-ef0d7bdd","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}

--- response: 200 in 127 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"cf-QhTa/DhwQRK881oy/dpfWel4MRc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1901,"booking":{"firstname":"Keep","lastname":"Guest-ef0d7bdd","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1901
correlation: qa-8583246e-7380-47f1-af5f-c1005b86de30

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8583246e-7380-47f1-af5f-c1005b86de30
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-4a566825","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}

--- response: 403 in 120 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1901
correlation: qa-219b28a4-f608-4eb6-87b9-3d1c4722c3c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-219b28a4-f608-4eb6-87b9-3d1c4722c3c0
Content-Type: application/json

--- response: 200 in 123 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"b2-3Oc6zndshsuUFxfjAVZFc9OeBLI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-ef0d7bdd","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/1901
correlation: qa-34512527-4a1f-4466-9c6a-7f0b205e79b1

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-34512527-4a1f-4466-9c6a-7f0b205e79b1
Content-Type: application/json

--- response: 201 in 121 ms ---
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
#5 GET https://restful-booker.herokuapp.com/booking/1901
correlation: qa-97debfa2-0bd9-4758-9e07-41973112ef47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97debfa2-0bd9-4758-9e07-41973112ef47
Content-Type: application/json

--- response: 404 in 133 ms ---
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
