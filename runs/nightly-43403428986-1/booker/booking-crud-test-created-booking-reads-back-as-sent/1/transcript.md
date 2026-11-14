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
| 1 | `POST /booking` | 200 | 266 | `qa-b2fb88a7-0bca-474e-87f4-b2fde19821e9` |
| 2 | `GET /booking/{id}` | 200 | 183 | `qa-e02cfc9e-de93-4d90-8405-3d5ae1b9f85f` |
| 3 | `POST /auth` | 200 | 137 | `qa-3438fc51-adbb-4ffc-94fd-02fc7260c6c6` |
| 4 | `DELETE /booking/{id}` | 201 | 179 | `qa-08633bde-69de-432d-a3dc-fd2ee818ac26` |
| 5 | `GET /booking/{id}` | 404 | 162 | `qa-950f01d0-460e-4808-b6b9-9efbd9b1f0aa` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-b2fb88a7-0bca-474e-87f4-b2fde19821e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2fb88a7-0bca-474e-87f4-b2fde19821e9
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-cb77625f","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Late check-in"}

--- response: 200 in 266 ms ---
Content-Length: 209
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:14 GMT
Etag: W/"d1-kPm5t+Ag6nIsmOq2WL8hbeh67l8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562934"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562934"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":718,"booking":{"firstname":"Ada","lastname":"Guest-cb77625f","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/718
correlation: qa-e02cfc9e-de93-4d90-8405-3d5ae1b9f85f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e02cfc9e-de93-4d90-8405-3d5ae1b9f85f
Content-Type: application/json

--- response: 200 in 183 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:14 GMT
Etag: W/"b5-/h4UzAIrzUncgZlp0fjjnO61qGQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562934"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562934"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-cb77625f","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-3438fc51-adbb-4ffc-94fd-02fc7260c6c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3438fc51-adbb-4ffc-94fd-02fc7260c6c6
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 137 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:14 GMT
Etag: W/"1b-SUlKmIqlM8pF7PztXaAJY0ZqblA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562934"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562934"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/718
correlation: qa-08633bde-69de-432d-a3dc-fd2ee818ac26

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-08633bde-69de-432d-a3dc-fd2ee818ac26
Content-Type: application/json

--- response: 201 in 179 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:14 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562934"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562934"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/718
correlation: qa-950f01d0-460e-4808-b6b9-9efbd9b1f0aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-950f01d0-460e-4808-b6b9-9efbd9b1f0aa
Content-Type: application/json

--- response: 404 in 162 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:15 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562935"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562935"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
