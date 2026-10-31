# Transcript: A partial update changes only the named fields

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#partialUpdateChangesOnlyNamedFields` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 23 | `qa-50918fb3-d5f5-4de3-8e5f-c1c96a11aa34` |
| 2 | `PATCH /booking/{id}` | 200 | 33 | `qa-a8a149fc-c802-4444-8df4-112986783b45` |
| 3 | `DELETE /booking/{id}` | 201 | 20 | `qa-cf03987a-11e5-4b8a-8e57-3a5ad22523de` |
| 4 | `GET /booking/{id}` | 404 | 22 | `qa-8d926066-3f1b-4049-aaa0-d82a137751b1` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-50918fb3-d5f5-4de3-8e5f-c1c96a11aa34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50918fb3-d5f5-4de3-8e5f-c1c96a11aa34
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-3f994be7","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 23 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"d0-Q/qsyONQ1RjGdEFWvYUuvhd2KgA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1108,"booking":{"firstname":"Linus","lastname":"Guest-3f994be7","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/1108
correlation: qa-a8a149fc-c802-4444-8df4-112986783b45

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a8a149fc-c802-4444-8df4-112986783b45
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 33 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"b3-S46Q4uq3mkTou92jsU0XdSSrlEc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-3f994be7","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/1108
correlation: qa-cf03987a-11e5-4b8a-8e57-3a5ad22523de

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-cf03987a-11e5-4b8a-8e57-3a5ad22523de
Content-Type: application/json

--- response: 201 in 20 ms ---
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
#4 GET https://restful-booker.herokuapp.com/booking/1108
correlation: qa-8d926066-3f1b-4049-aaa0-d82a137751b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d926066-3f1b-4049-aaa0-d82a137751b1
Content-Type: application/json

--- response: 404 in 22 ms ---
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
