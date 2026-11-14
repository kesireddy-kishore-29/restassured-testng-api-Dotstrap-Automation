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
| 1 | `POST /booking` | 200 | 539 | `qa-8c603515-635a-44c0-99c2-10fa14c9c3f0` |
| 2 | `PUT /booking/{id}` | 403 | 31 | `qa-53cc6888-223a-459c-b329-39cdb5855926` |
| 3 | `GET /booking/{id}` | 200 | 38 | `qa-4702f3e6-3ff5-49f6-9b11-654a2788e964` |
| 4 | `POST /auth` | 200 | 34 | `qa-bc12b47c-0a1d-47e0-ac08-7ec332408ca6` |
| 5 | `DELETE /booking/{id}` | 201 | 23 | `qa-2f24d162-33df-4797-9191-a926a2c69c4d` |
| 6 | `GET /booking/{id}` | 404 | 31 | `qa-30c46fe9-4f74-4804-9580-29ed88a0d5f2` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-8c603515-635a-44c0-99c2-10fa14c9c3f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c603515-635a-44c0-99c2-10fa14c9c3f0
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-55ef70ed","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}

--- response: 200 in 539 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:36 GMT
Etag: W/"cf-QSaaNGt8LYS+aPe/YHhXuN/vZdA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=PihVVQGZ6HqlDMBTQFanLZTILoyTd3YaUGcE8yQUDLk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304776"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=PihVVQGZ6HqlDMBTQFanLZTILoyTd3YaUGcE8yQUDLk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304776"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4607,"booking":{"firstname":"Keep","lastname":"Guest-55ef70ed","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4607
correlation: qa-53cc6888-223a-459c-b329-39cdb5855926

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53cc6888-223a-459c-b329-39cdb5855926
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-64847e3f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}

--- response: 403 in 31 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:36 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=PihVVQGZ6HqlDMBTQFanLZTILoyTd3YaUGcE8yQUDLk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304776"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=PihVVQGZ6HqlDMBTQFanLZTILoyTd3YaUGcE8yQUDLk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304776"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4607
correlation: qa-4702f3e6-3ff5-49f6-9b11-654a2788e964

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4702f3e6-3ff5-49f6-9b11-654a2788e964
Content-Type: application/json

--- response: 200 in 38 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:36 GMT
Etag: W/"b2-a7zBqaAuE0q3ubfeF17pPBhRhX4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=PihVVQGZ6HqlDMBTQFanLZTILoyTd3YaUGcE8yQUDLk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304776"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=PihVVQGZ6HqlDMBTQFanLZTILoyTd3YaUGcE8yQUDLk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304776"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-55ef70ed","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-bc12b47c-0a1d-47e0-ac08-7ec332408ca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc12b47c-0a1d-47e0-ac08-7ec332408ca6
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 34 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"1b-dRj8kD9JdvLFcFVcn+oHntuYQfE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/4607
correlation: qa-2f24d162-33df-4797-9191-a926a2c69c4d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2f24d162-33df-4797-9191-a926a2c69c4d
Content-Type: application/json

--- response: 201 in 23 ms ---
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

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/4607
correlation: qa-30c46fe9-4f74-4804-9580-29ed88a0d5f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30c46fe9-4f74-4804-9580-29ed88a0d5f2
Content-Type: application/json

--- response: 404 in 31 ms ---
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
