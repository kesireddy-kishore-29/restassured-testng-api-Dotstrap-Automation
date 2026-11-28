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
| 1 | `POST /booking` | 200 | 40 | `qa-e6b6647e-22e1-4e40-b1bb-af6fbed0c830` |
| 2 | `PUT /booking/{id}` | 200 | 33 | `qa-105e99ab-75fc-4c0c-b251-83aa3dd22437` |
| 3 | `DELETE /booking/{id}` | 201 | 40 | `qa-0a3f5c35-9bf0-4815-85e7-a08e61109b1b` |
| 4 | `GET /booking/{id}` | 404 | 37 | `qa-84f21aad-dbba-4b21-88ce-9f3bf020a7ab` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-e6b6647e-22e1-4e40-b1bb-af6fbed0c830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6b6647e-22e1-4e40-b1bb-af6fbed0c830
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-60e7897d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}

--- response: 200 in 40 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"cd-Q95ss7WKqrmGWCtAgYMH970WsGw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3199,"booking":{"firstname":"QA","lastname":"Guest-60e7897d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3199
correlation: qa-105e99ab-75fc-4c0c-b251-83aa3dd22437

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-105e99ab-75fc-4c0c-b251-83aa3dd22437
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-3031d3df","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}

--- response: 200 in 33 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"b3-jOLnc2v2uewtTW1tT/LpJ9BqHzk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-3031d3df","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3199
correlation: qa-0a3f5c35-9bf0-4815-85e7-a08e61109b1b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0a3f5c35-9bf0-4815-85e7-a08e61109b1b
Content-Type: application/json

--- response: 201 in 40 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3199
correlation: qa-84f21aad-dbba-4b21-88ce-9f3bf020a7ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84f21aad-dbba-4b21-88ce-9f3bf020a7ab
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
