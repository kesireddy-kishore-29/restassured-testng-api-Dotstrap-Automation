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
| 1 | `POST /booking` | 200 | 233 | `qa-a869c121-f9f9-47c6-8e2b-6374343ec307` |
| 2 | `GET /booking/{id}` | 200 | 218 | `qa-2379d9eb-2de4-4fb0-8b0a-e4e437251627` |
| 3 | `POST /auth` | 200 | 233 | `qa-e027aa69-458b-4129-8f7a-87a0e6c519e7` |
| 4 | `DELETE /booking/{id}` | 201 | 230 | `qa-dbb6e138-ca94-4abe-80a6-3bb483b08879` |
| 5 | `GET /booking/{id}` | 404 | 242 | `qa-11a5e923-42f9-4d52-956a-acc8b82f2512` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a869c121-f9f9-47c6-8e2b-6374343ec307

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a869c121-f9f9-47c6-8e2b-6374343ec307
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-8f7333b4","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Late check-in"}

--- response: 200 in 233 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:54 GMT
Etag: W/"d2-ZkK8YvzZ+sb9ZMjsGC4vjYXzdcU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hCQVhKI1OFsHdlfEUIjp3i%2BvNbtuZiVvIYp49CfzcBU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hCQVhKI1OFsHdlfEUIjp3i%2BvNbtuZiVvIYp49CfzcBU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2128,"booking":{"firstname":"Ada","lastname":"Guest-8f7333b4","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/2128
correlation: qa-2379d9eb-2de4-4fb0-8b0a-e4e437251627

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2379d9eb-2de4-4fb0-8b0a-e4e437251627
Content-Type: application/json

--- response: 200 in 218 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:54 GMT
Etag: W/"b5-gu/5jfPFSQol+2cYVtUCzHcena0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hCQVhKI1OFsHdlfEUIjp3i%2BvNbtuZiVvIYp49CfzcBU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hCQVhKI1OFsHdlfEUIjp3i%2BvNbtuZiVvIYp49CfzcBU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-8f7333b4","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-e027aa69-458b-4129-8f7a-87a0e6c519e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e027aa69-458b-4129-8f7a-87a0e6c519e7
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 233 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:55 GMT
Etag: W/"1b-x5r8Q8OE6Mh1JSZi8/jbI2yj/DU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2128
correlation: qa-dbb6e138-ca94-4abe-80a6-3bb483b08879

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-dbb6e138-ca94-4abe-80a6-3bb483b08879
Content-Type: application/json

--- response: 201 in 230 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:55 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2128
correlation: qa-11a5e923-42f9-4d52-956a-acc8b82f2512

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11a5e923-42f9-4d52-956a-acc8b82f2512
Content-Type: application/json

--- response: 404 in 242 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:55 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
