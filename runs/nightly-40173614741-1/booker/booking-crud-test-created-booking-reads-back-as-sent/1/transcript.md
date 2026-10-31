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
| 1 | `POST /booking` | 200 | 854 | `qa-c138f9d5-3b7d-43c0-8f03-d8bc0646020b` |
| 2 | `GET /booking/{id}` | 200 | 237 | `qa-8c98744b-ce05-4ea2-90a4-43fd94126fb2` |
| 3 | `POST /auth` | 200 | 203 | `qa-1040cac0-ae26-46bf-a33b-a322f0fd0f99` |
| 4 | `DELETE /booking/{id}` | 201 | 203 | `qa-0cd37f1a-4eea-4cae-a703-6298cb52c640` |
| 5 | `GET /booking/{id}` | 404 | 202 | `qa-31c3c0da-5895-466a-9e07-530c964a9bde` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-c138f9d5-3b7d-43c0-8f03-d8bc0646020b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c138f9d5-3b7d-43c0-8f03-d8bc0646020b
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-048aad62","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Late check-in"}

--- response: 200 in 854 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:27 GMT
Etag: W/"d2-5sR2g+ArbGIyl6djzPvP3s4j1Pk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nynmSVWxX4MWeZBrCh%2BByhn3iA6yoi4uIS3Om3pUr%2F4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914027"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nynmSVWxX4MWeZBrCh%2BByhn3iA6yoi4uIS3Om3pUr%2F4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914027"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5073,"booking":{"firstname":"Ada","lastname":"Guest-048aad62","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/5073
correlation: qa-8c98744b-ce05-4ea2-90a4-43fd94126fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c98744b-ce05-4ea2-90a4-43fd94126fb2
Content-Type: application/json

--- response: 200 in 237 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:28 GMT
Etag: W/"b5-2JMMYsSsJnf4YToIu/I89w6eqK0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-048aad62","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-1040cac0-ae26-46bf-a33b-a322f0fd0f99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1040cac0-ae26-46bf-a33b-a322f0fd0f99
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 203 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:28 GMT
Etag: W/"1b-p8LJ55WSLfGZ6Sb24dcjJ/3zOjY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5073
correlation: qa-0cd37f1a-4eea-4cae-a703-6298cb52c640

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0cd37f1a-4eea-4cae-a703-6298cb52c640
Content-Type: application/json

--- response: 201 in 203 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:28 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5073
correlation: qa-31c3c0da-5895-466a-9e07-530c964a9bde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31c3c0da-5895-466a-9e07-530c964a9bde
Content-Type: application/json

--- response: 404 in 202 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:28 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
