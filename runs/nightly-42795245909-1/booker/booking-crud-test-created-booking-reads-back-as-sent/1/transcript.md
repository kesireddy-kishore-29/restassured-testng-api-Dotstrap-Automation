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
| 1 | `POST /booking` | 200 | 23 | `qa-b9ff8d2c-3727-4329-9123-4ce6254c0924` |
| 2 | `GET /booking/{id}` | 200 | 27 | `qa-44fef494-8cee-4f3b-81a8-5691fe0976e5` |
| 3 | `POST /auth` | 200 | 24 | `qa-a3ded3be-9bbe-4b4c-bc08-7ef642f7f9b3` |
| 4 | `DELETE /booking/{id}` | 201 | 22 | `qa-21b51eaa-5a1c-44f6-b727-8d9572f9695c` |
| 5 | `GET /booking/{id}` | 404 | 22 | `qa-37cbba6a-8245-4170-aec5-1b4e6a8c25da` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-b9ff8d2c-3727-4329-9123-4ce6254c0924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9ff8d2c-3727-4329-9123-4ce6254c0924
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-94c27469","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Late check-in"}

--- response: 200 in 23 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"d2-efPoneOdi4fOPUbKXerK/VVyYyo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4616,"booking":{"firstname":"Ada","lastname":"Guest-94c27469","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/4616
correlation: qa-44fef494-8cee-4f3b-81a8-5691fe0976e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44fef494-8cee-4f3b-81a8-5691fe0976e5
Content-Type: application/json

--- response: 200 in 27 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"b5-uOZs8XCwl33rRodVcA7pOqIZROE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-94c27469","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-a3ded3be-9bbe-4b4c-bc08-7ef642f7f9b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3ded3be-9bbe-4b4c-bc08-7ef642f7f9b3
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 24 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"1b-/0K7gJzPdvGSchDqddD5p0Rreb8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4616
correlation: qa-21b51eaa-5a1c-44f6-b727-8d9572f9695c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-21b51eaa-5a1c-44f6-b727-8d9572f9695c
Content-Type: application/json

--- response: 201 in 22 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4616
correlation: qa-37cbba6a-8245-4170-aec5-1b4e6a8c25da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37cbba6a-8245-4170-aec5-1b4e6a8c25da
Content-Type: application/json

--- response: 404 in 22 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
