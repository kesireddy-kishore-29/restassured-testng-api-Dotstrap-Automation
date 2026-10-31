# Transcript: A full update with a token replaces the booking

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#fullUpdateWithATokenReplacesTheBooking` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 23 | `qa-fd4ae773-2c10-4cf9-8d5e-d3cd36773242` |
| 2 | `PUT /booking/{id}` | 200 | 26 | `qa-bbae4af2-abd4-40de-a4f4-c5bdd7eb1b8c` |
| 3 | `DELETE /booking/{id}` | 201 | 28 | `qa-2ebc0a3d-ff16-474c-829f-7b719d45ea77` |
| 4 | `GET /booking/{id}` | 404 | 26 | `qa-190f012c-0ff6-471c-a568-9a1d5b15b9b2` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-fd4ae773-2c10-4cf9-8d5e-d3cd36773242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd4ae773-2c10-4cf9-8d5e-d3cd36773242
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-34302ab3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 23 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"cd-w5zzbgHOGQdQd09gD+AVq+o066M"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1106,"booking":{"firstname":"QA","lastname":"Guest-34302ab3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1106
correlation: qa-bbae4af2-abd4-40de-a4f4-c5bdd7eb1b8c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-bbae4af2-abd4-40de-a4f4-c5bdd7eb1b8c
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-6e683e57","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 26 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"b3-18wcv7nIU1eDIwTbKPyIOmGxw28"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-6e683e57","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/1106
correlation: qa-2ebc0a3d-ff16-474c-829f-7b719d45ea77

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2ebc0a3d-ff16-474c-829f-7b719d45ea77
Content-Type: application/json

--- response: 201 in 28 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1106
correlation: qa-190f012c-0ff6-471c-a568-9a1d5b15b9b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-190f012c-0ff6-471c-a568-9a1d5b15b9b2
Content-Type: application/json

--- response: 404 in 26 ms ---
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
