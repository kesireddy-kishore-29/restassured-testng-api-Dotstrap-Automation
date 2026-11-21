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
| 1 | `POST /booking` | 200 | 917 | `qa-c6349332-9666-4d57-a629-0542a5898baa` |
| 2 | `PUT /booking/{id}` | 403 | 301 | `qa-58735226-d973-4443-8eaa-3f2e50b74d8a` |
| 3 | `GET /booking/{id}` | 200 | 301 | `qa-ab19cf44-cae8-4550-a24c-baeb03d66255` |
| 4 | `POST /auth` | 200 | 302 | `qa-782a5670-5d68-46e7-8527-d17d4b58c30f` |
| 5 | `DELETE /booking/{id}` | 201 | 294 | `qa-a96420fc-256b-4094-b5ed-3238f3b80e27` |
| 6 | `GET /booking/{id}` | 404 | 289 | `qa-4b53ce6f-ef5e-49ee-a64e-3332c04d5bdc` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-c6349332-9666-4d57-a629-0542a5898baa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6349332-9666-4d57-a629-0542a5898baa
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-bcd68dca","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}

--- response: 200 in 917 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:53 GMT
Etag: W/"cf-15QzahbZDOQRXiCaxMJN2ytt57I"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NFGGsWPcQv4MOVyxHQ%2FUPKxM0IjSEJPj7vT3QFqGJtk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NFGGsWPcQv4MOVyxHQ%2FUPKxM0IjSEJPj7vT3QFqGJtk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4669,"booking":{"firstname":"Keep","lastname":"Guest-bcd68dca","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4669
correlation: qa-58735226-d973-4443-8eaa-3f2e50b74d8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58735226-d973-4443-8eaa-3f2e50b74d8a
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-f340f8cb","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}

--- response: 403 in 301 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:53 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NFGGsWPcQv4MOVyxHQ%2FUPKxM0IjSEJPj7vT3QFqGJtk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NFGGsWPcQv4MOVyxHQ%2FUPKxM0IjSEJPj7vT3QFqGJtk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4669
correlation: qa-ab19cf44-cae8-4550-a24c-baeb03d66255

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab19cf44-cae8-4550-a24c-baeb03d66255
Content-Type: application/json

--- response: 200 in 301 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:54 GMT
Etag: W/"b2-uDZF8OGp+/uS36ky3IdSwydmX9U"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997194"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997194"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-bcd68dca","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-782a5670-5d68-46e7-8527-d17d4b58c30f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-782a5670-5d68-46e7-8527-d17d4b58c30f
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 302 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:54 GMT
Etag: W/"1b-5yVZvzus407KrgPV/OdoRzV8PIY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997194"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997194"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/4669
correlation: qa-a96420fc-256b-4094-b5ed-3238f3b80e27

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a96420fc-256b-4094-b5ed-3238f3b80e27
Content-Type: application/json

--- response: 201 in 294 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:54 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997194"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997194"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/4669
correlation: qa-4b53ce6f-ef5e-49ee-a64e-3332c04d5bdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b53ce6f-ef5e-49ee-a64e-3332c04d5bdc
Content-Type: application/json

--- response: 404 in 289 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:55 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997195"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997195"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
