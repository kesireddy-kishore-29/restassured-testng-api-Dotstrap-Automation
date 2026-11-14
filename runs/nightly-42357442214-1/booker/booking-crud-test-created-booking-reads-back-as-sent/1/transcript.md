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
| 1 | `POST /booking` | 200 | 177 | `qa-d85d7c59-80a2-4af2-a5c4-768f01c31305` |
| 2 | `GET /booking/{id}` | 200 | 270 | `qa-8c3e213c-41ca-4c4d-8564-79a2756addcd` |
| 3 | `POST /auth` | 200 | 174 | `qa-b49070d9-3338-488f-a66d-add8a466acbf` |
| 4 | `DELETE /booking/{id}` | 201 | 274 | `qa-77ad9008-544d-41a5-8f1e-6c98dae6568a` |
| 5 | `GET /booking/{id}` | 404 | 262 | `qa-40ef2afe-6a64-45f4-a496-f1d3782dcc6b` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d85d7c59-80a2-4af2-a5c4-768f01c31305

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d85d7c59-80a2-4af2-a5c4-768f01c31305
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-94d50c66","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Late check-in"}

--- response: 200 in 177 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:06 GMT
Etag: W/"d2-Ju873xuPEFOo19Qhpx5kLqOJF88"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2186,"booking":{"firstname":"Ada","lastname":"Guest-94d50c66","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/2186
correlation: qa-8c3e213c-41ca-4c4d-8564-79a2756addcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c3e213c-41ca-4c4d-8564-79a2756addcd
Content-Type: application/json

--- response: 200 in 270 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:06 GMT
Etag: W/"b5-y9cEXRWhMqDHq64bGAAAZJ9IPfg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-94d50c66","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-b49070d9-3338-488f-a66d-add8a466acbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b49070d9-3338-488f-a66d-add8a466acbf
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 174 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:06 GMT
Etag: W/"1b-krif2jUH+uQYLbvLOE7pDZEYGgs"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2186
correlation: qa-77ad9008-544d-41a5-8f1e-6c98dae6568a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-77ad9008-544d-41a5-8f1e-6c98dae6568a
Content-Type: application/json

--- response: 201 in 274 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:06 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2186
correlation: qa-40ef2afe-6a64-45f4-a496-f1d3782dcc6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40ef2afe-6a64-45f4-a496-f1d3782dcc6b
Content-Type: application/json

--- response: 404 in 262 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
