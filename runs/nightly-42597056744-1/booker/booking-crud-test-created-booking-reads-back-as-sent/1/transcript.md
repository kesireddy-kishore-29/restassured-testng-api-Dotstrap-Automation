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
| 1 | `POST /booking` | 200 | 259 | `qa-e6b9e833-e735-452c-a0f5-929f76c193c5` |
| 2 | `GET /booking/{id}` | 200 | 235 | `qa-d1abf227-5a2f-4435-91de-7673cdfc8e3f` |
| 3 | `POST /auth` | 200 | 257 | `qa-1b5ad623-8530-4f28-b7fb-8a03b0996b53` |
| 4 | `DELETE /booking/{id}` | 201 | 228 | `qa-f5cfb03c-d25f-4fcd-83ca-2031a1f07d29` |
| 5 | `GET /booking/{id}` | 404 | 238 | `qa-4c1e31d7-9089-454d-a21e-b9012eb1e463` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-e6b9e833-e735-452c-a0f5-929f76c193c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6b9e833-e735-452c-a0f5-929f76c193c5
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-88308ddb","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Late check-in"}

--- response: 200 in 259 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:54 GMT
Etag: W/"d2-ydROUfj9V7v1jO7+NGdyDKhzC54"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218154"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218154"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2604,"booking":{"firstname":"Ada","lastname":"Guest-88308ddb","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/2604
correlation: qa-d1abf227-5a2f-4435-91de-7673cdfc8e3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1abf227-5a2f-4435-91de-7673cdfc8e3f
Content-Type: application/json

--- response: 200 in 235 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:54 GMT
Etag: W/"b5-zkJSGHgWPHna7VrPBjSyGgcUTSo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218154"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218154"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-88308ddb","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-1b5ad623-8530-4f28-b7fb-8a03b0996b53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b5ad623-8530-4f28-b7fb-8a03b0996b53
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 257 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:54 GMT
Etag: W/"1b-4Syv+0Kxka/URaAR8o7zQc0U6u4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218154"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218154"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2604
correlation: qa-f5cfb03c-d25f-4fcd-83ca-2031a1f07d29

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f5cfb03c-d25f-4fcd-83ca-2031a1f07d29
Content-Type: application/json

--- response: 201 in 228 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:54 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218154"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218154"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2604
correlation: qa-4c1e31d7-9089-454d-a21e-b9012eb1e463

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c1e31d7-9089-454d-a21e-b9012eb1e463
Content-Type: application/json

--- response: 404 in 238 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:55 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218155"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218155"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
