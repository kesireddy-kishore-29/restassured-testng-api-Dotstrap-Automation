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
| 1 | `POST /booking` | 200 | 32 | `qa-8c54f8fc-7f0b-4194-969b-03b3ef109352` |
| 2 | `GET /booking/{id}` | 200 | 27 | `qa-d7fb04cd-2723-4b79-85d1-d469765cc0ac` |
| 3 | `POST /auth` | 200 | 28 | `qa-b75e0637-f64b-4736-9d95-d5423f049e5c` |
| 4 | `DELETE /booking/{id}` | 201 | 29 | `qa-3b4eb839-02d8-4cb4-b3f1-51efe34b0ea0` |
| 5 | `GET /booking/{id}` | 404 | 24 | `qa-88680f4e-11d6-4f62-84bd-e2683107c59c` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-8c54f8fc-7f0b-4194-969b-03b3ef109352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c54f8fc-7f0b-4194-969b-03b3ef109352
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-1a0b18a4","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Late check-in"}

--- response: 200 in 32 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"d2-A3ceLKIQVNS3cV3Mdfqhk7WPSrg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1099,"booking":{"firstname":"Ada","lastname":"Guest-1a0b18a4","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/1099
correlation: qa-d7fb04cd-2723-4b79-85d1-d469765cc0ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7fb04cd-2723-4b79-85d1-d469765cc0ac
Content-Type: application/json

--- response: 200 in 27 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"b5-SKi5UmfPj4SDDje9lVXVP/5TrWA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-1a0b18a4","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-b75e0637-f64b-4736-9d95-d5423f049e5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b75e0637-f64b-4736-9d95-d5423f049e5c
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 28 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"1b-qz5fLZqPj6vI7KRpOrbKp49hA9A"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/1099
correlation: qa-3b4eb839-02d8-4cb4-b3f1-51efe34b0ea0

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-3b4eb839-02d8-4cb4-b3f1-51efe34b0ea0
Content-Type: application/json

--- response: 201 in 29 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/1099
correlation: qa-88680f4e-11d6-4f62-84bd-e2683107c59c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88680f4e-11d6-4f62-84bd-e2683107c59c
Content-Type: application/json

--- response: 404 in 24 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
