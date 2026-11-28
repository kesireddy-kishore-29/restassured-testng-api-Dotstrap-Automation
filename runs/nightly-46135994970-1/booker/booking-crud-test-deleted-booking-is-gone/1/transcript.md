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
| 1 | `POST /booking` | 200 | 32 | `qa-002e85d7-f636-4ed3-895b-bd8f695dbf9a` |
| 2 | `DELETE /booking/{id}` | 201 | 37 | `qa-1c342565-3120-4ba3-b83c-2f51265d4c46` |
| 3 | `GET /booking/{id}` | 404 | 33 | `qa-dc9ac47d-e4d6-4769-90f5-39cd4ea31d91` |
| 4 | `GET /booking/{id}` | 404 | 37 | `qa-26bcc3d3-7e3f-4137-b5a8-f582e6c02d2f` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-002e85d7-f636-4ed3-895b-bd8f695dbf9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-002e85d7-f636-4ed3-895b-bd8f695dbf9a
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-ddad5a4c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}

--- response: 200 in 32 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"cd-VSeK2NpihomMmGepaYtMlOEDDis"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3197,"booking":{"firstname":"QA","lastname":"Guest-ddad5a4c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/3197
correlation: qa-1c342565-3120-4ba3-b83c-2f51265d4c46

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1c342565-3120-4ba3-b83c-2f51265d4c46
Content-Type: application/json

--- response: 201 in 37 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3197
correlation: qa-dc9ac47d-e4d6-4769-90f5-39cd4ea31d91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc9ac47d-e4d6-4769-90f5-39cd4ea31d91
Content-Type: application/json

--- response: 404 in 33 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3197
correlation: qa-26bcc3d3-7e3f-4137-b5a8-f582e6c02d2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26bcc3d3-7e3f-4137-b5a8-f582e6c02d2f
Content-Type: application/json

--- response: 404 in 37 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
