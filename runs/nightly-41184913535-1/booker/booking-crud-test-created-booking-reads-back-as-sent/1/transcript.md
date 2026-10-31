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
| 1 | `POST /booking` | 200 | 184 | `qa-9f1a3d9b-dcc7-49bd-9b9c-2ae8bdf9e09d` |
| 2 | `GET /booking/{id}` | 200 | 196 | `qa-e4c261a4-5d48-4e5e-a09b-cc8bdb77da92` |
| 3 | `POST /auth` | 200 | 181 | `qa-b51a5616-c4b8-432c-b4dd-3bc617a343fa` |
| 4 | `DELETE /booking/{id}` | 201 | 183 | `qa-08fdc48c-a6ef-4e07-90b2-188091d0d4bb` |
| 5 | `GET /booking/{id}` | 404 | 188 | `qa-5f7340c7-e7ec-4311-ac96-ccc085eaab0f` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-9f1a3d9b-dcc7-49bd-9b9c-2ae8bdf9e09d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f1a3d9b-dcc7-49bd-9b9c-2ae8bdf9e09d
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-6756c9db","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Late check-in"}

--- response: 200 in 184 ms ---
Content-Length: 209
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:35 GMT
Etag: W/"d1-RjX44RwlIseJfgmAoMfBjbG7VTk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OKHZ24zmQ5jvnIjc11T2h3E7rWfodWgZODkiPbmYq8A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435495"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OKHZ24zmQ5jvnIjc11T2h3E7rWfodWgZODkiPbmYq8A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435495"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":259,"booking":{"firstname":"Ada","lastname":"Guest-6756c9db","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/259
correlation: qa-e4c261a4-5d48-4e5e-a09b-cc8bdb77da92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4c261a4-5d48-4e5e-a09b-cc8bdb77da92
Content-Type: application/json

--- response: 200 in 196 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:36 GMT
Etag: W/"b5-18oBhPwZaxhxZ9YiZvcNL1Pings"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-6756c9db","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-b51a5616-c4b8-432c-b4dd-3bc617a343fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b51a5616-c4b8-432c-b4dd-3bc617a343fa
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 181 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:36 GMT
Etag: W/"1b-rK1ZQrrXkcQDVdrTYESr6PpUGQo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/259
correlation: qa-08fdc48c-a6ef-4e07-90b2-188091d0d4bb

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-08fdc48c-a6ef-4e07-90b2-188091d0d4bb
Content-Type: application/json

--- response: 201 in 183 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/259
correlation: qa-5f7340c7-e7ec-4311-ac96-ccc085eaab0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f7340c7-e7ec-4311-ac96-ccc085eaab0f
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
