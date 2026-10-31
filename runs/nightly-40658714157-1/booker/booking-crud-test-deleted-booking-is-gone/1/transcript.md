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
| 1 | `POST /booking` | 200 | 25 | `qa-89390bcb-11d8-4a08-910d-103bc2329c59` |
| 2 | `DELETE /booking/{id}` | 201 | 26 | `qa-5ecf1495-45b6-4fb0-9bbd-8411a63a54d7` |
| 3 | `GET /booking/{id}` | 404 | 28 | `qa-a4288c5f-0cea-41fb-a389-7721d7a6eb8a` |
| 4 | `GET /booking/{id}` | 404 | 27 | `qa-7ad496cb-ab05-4f43-b170-f2465605c9f6` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-89390bcb-11d8-4a08-910d-103bc2329c59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89390bcb-11d8-4a08-910d-103bc2329c59
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-791427c5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 25 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"cd-+W47t3knQVMfXpA05HqQy1G03mM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1104,"booking":{"firstname":"QA","lastname":"Guest-791427c5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/1104
correlation: qa-5ecf1495-45b6-4fb0-9bbd-8411a63a54d7

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5ecf1495-45b6-4fb0-9bbd-8411a63a54d7
Content-Type: application/json

--- response: 201 in 26 ms ---
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

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1104
correlation: qa-a4288c5f-0cea-41fb-a389-7721d7a6eb8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4288c5f-0cea-41fb-a389-7721d7a6eb8a
Content-Type: application/json

--- response: 404 in 28 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1104
correlation: qa-7ad496cb-ab05-4f43-b170-f2465605c9f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ad496cb-ab05-4f43-b170-f2465605c9f6
Content-Type: application/json

--- response: 404 in 27 ms ---
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
