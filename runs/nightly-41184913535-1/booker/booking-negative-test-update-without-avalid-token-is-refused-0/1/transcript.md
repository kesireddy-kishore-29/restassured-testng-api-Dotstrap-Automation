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
| 1 | `POST /booking` | 200 | 794 | `qa-f05ec335-3f6c-4297-8fd9-4f6417fd4b09` |
| 2 | `PUT /booking/{id}` | 403 | 223 | `qa-3d460070-a2c0-49e5-a6cd-47c7d64aa650` |
| 3 | `GET /booking/{id}` | 200 | 239 | `qa-2a617a79-820d-49ce-8c00-72b09879db46` |
| 4 | `POST /auth` | 200 | 192 | `qa-d8658f3a-1981-4c42-8ca8-61cc8c0e8852` |
| 5 | `DELETE /booking/{id}` | 201 | 182 | `qa-21d89834-95bd-4b8b-99a1-13f547cf5597` |
| 6 | `GET /booking/{id}` | 404 | 188 | `qa-c496e41a-47c3-4594-89b3-bc878f558af9` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f05ec335-3f6c-4297-8fd9-4f6417fd4b09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f05ec335-3f6c-4297-8fd9-4f6417fd4b09
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-2e32e8b4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}

--- response: 200 in 794 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:34 GMT
Etag: W/"ce-lTCEYL6Fi+TulkbfLwCJI0pQtOI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DApZKTVKc165%2ByMnDHU%2BvEtGJxtBooPD6NmCwjJWc5U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435494"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DApZKTVKc165%2ByMnDHU%2BvEtGJxtBooPD6NmCwjJWc5U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435494"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":244,"booking":{"firstname":"Keep","lastname":"Guest-2e32e8b4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/244
correlation: qa-3d460070-a2c0-49e5-a6cd-47c7d64aa650

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d460070-a2c0-49e5-a6cd-47c7d64aa650
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-77d01560","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}

--- response: 403 in 223 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:34 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DApZKTVKc165%2ByMnDHU%2BvEtGJxtBooPD6NmCwjJWc5U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435494"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DApZKTVKc165%2ByMnDHU%2BvEtGJxtBooPD6NmCwjJWc5U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435494"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/244
correlation: qa-2a617a79-820d-49ce-8c00-72b09879db46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a617a79-820d-49ce-8c00-72b09879db46
Content-Type: application/json

--- response: 200 in 239 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:35 GMT
Etag: W/"b2-d8YpYZqvjRklA5YfdrVPfd0Cjhk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OKHZ24zmQ5jvnIjc11T2h3E7rWfodWgZODkiPbmYq8A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435495"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OKHZ24zmQ5jvnIjc11T2h3E7rWfodWgZODkiPbmYq8A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435495"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-2e32e8b4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-d8658f3a-1981-4c42-8ca8-61cc8c0e8852

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8658f3a-1981-4c42-8ca8-61cc8c0e8852
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 192 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:35 GMT
Etag: W/"1b-xMmroPdAbENyXWI/8g2sv02CyH4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OKHZ24zmQ5jvnIjc11T2h3E7rWfodWgZODkiPbmYq8A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435495"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OKHZ24zmQ5jvnIjc11T2h3E7rWfodWgZODkiPbmYq8A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435495"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/244
correlation: qa-21d89834-95bd-4b8b-99a1-13f547cf5597

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-21d89834-95bd-4b8b-99a1-13f547cf5597
Content-Type: application/json

--- response: 201 in 182 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:36 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/244
correlation: qa-c496e41a-47c3-4594-89b3-bc878f558af9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c496e41a-47c3-4594-89b3-bc878f558af9
Content-Type: application/json

--- response: 404 in 188 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:36 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
