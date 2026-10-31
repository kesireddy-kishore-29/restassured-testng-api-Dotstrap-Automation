# Transcript: An update without a valid token is refused and changes nothing [Optional.empty]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[0]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 697 | `qa-d0c53ee1-d712-4bd7-b932-5a056b0204ff` |
| 2 | `PUT /booking/{id}` | 403 | 45 | `qa-fc81f28c-6ebd-419c-8669-57374d79b55f` |
| 3 | `GET /booking/{id}` | 200 | 38 | `qa-d7a68a9e-73b2-4323-bb95-0547e6198acd` |
| 4 | `POST /auth` | 200 | 41 | `qa-15504123-0e9c-4e1a-9708-324422c12398` |
| 5 | `DELETE /booking/{id}` | 201 | 34 | `qa-adc6cba8-6293-4431-95bf-83d3688204de` |
| 6 | `GET /booking/{id}` | 404 | 29 | `qa-ffaa8e27-7dfd-434b-a0b5-357e3c22a259` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d0c53ee1-d712-4bd7-b932-5a056b0204ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0c53ee1-d712-4bd7-b932-5a056b0204ff
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-0778aa1a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 697 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:56 GMT
Etag: W/"cf-wFuiYjc+nrRnqhnuyRfWk/qF6gw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=C1NwHNIhYKmOb7LJCDcUGNO9uM3fcRBx%2Fwb3AnLAGoY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176976"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=C1NwHNIhYKmOb7LJCDcUGNO9uM3fcRBx%2Fwb3AnLAGoY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176976"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1091,"booking":{"firstname":"Keep","lastname":"Guest-0778aa1a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1091
correlation: qa-fc81f28c-6ebd-419c-8669-57374d79b55f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc81f28c-6ebd-419c-8669-57374d79b55f
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-a90a296d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}

--- response: 403 in 45 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:56 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=C1NwHNIhYKmOb7LJCDcUGNO9uM3fcRBx%2Fwb3AnLAGoY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176976"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=C1NwHNIhYKmOb7LJCDcUGNO9uM3fcRBx%2Fwb3AnLAGoY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176976"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1091
correlation: qa-d7a68a9e-73b2-4323-bb95-0547e6198acd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7a68a9e-73b2-4323-bb95-0547e6198acd
Content-Type: application/json

--- response: 200 in 38 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:56 GMT
Etag: W/"b2-CVzJMN6Am1udNkYeMrDAx7Tvo0g"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=C1NwHNIhYKmOb7LJCDcUGNO9uM3fcRBx%2Fwb3AnLAGoY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176976"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=C1NwHNIhYKmOb7LJCDcUGNO9uM3fcRBx%2Fwb3AnLAGoY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176976"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-0778aa1a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-15504123-0e9c-4e1a-9708-324422c12398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15504123-0e9c-4e1a-9708-324422c12398
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 41 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"1b-C7+3Z2TV5GLFXLN4my7QHoey0dE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/1091
correlation: qa-adc6cba8-6293-4431-95bf-83d3688204de

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-adc6cba8-6293-4431-95bf-83d3688204de
Content-Type: application/json

--- response: 201 in 34 ms ---
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

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/1091
correlation: qa-ffaa8e27-7dfd-434b-a0b5-357e3c22a259

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffaa8e27-7dfd-434b-a0b5-357e3c22a259
Content-Type: application/json

--- response: 404 in 29 ms ---
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
