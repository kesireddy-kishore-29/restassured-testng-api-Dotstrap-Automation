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
| 1 | `POST /booking` | 200 | 299 | `qa-71adb07c-121a-4432-9b59-42184d0a7532` |
| 2 | `GET /booking/{id}` | 200 | 293 | `qa-f8759af0-f455-4b73-9837-9c9f01a7250b` |
| 3 | `POST /auth` | 200 | 292 | `qa-ae325e27-d7cd-4d9e-b83a-7b907b40d5ac` |
| 4 | `DELETE /booking/{id}` | 201 | 288 | `qa-0c621773-caee-4d10-873a-26e5bab2cd8b` |
| 5 | `GET /booking/{id}` | 404 | 285 | `qa-4059c565-491d-4297-8635-f9fe93291ab3` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-71adb07c-121a-4432-9b59-42184d0a7532

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71adb07c-121a-4432-9b59-42184d0a7532
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-295f2c90","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Late check-in"}

--- response: 200 in 299 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:54 GMT
Etag: W/"d2-RLhzdg7ivFAeR75fJiywe+iYLsY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997194"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997194"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4687,"booking":{"firstname":"Ada","lastname":"Guest-295f2c90","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/4687
correlation: qa-f8759af0-f455-4b73-9837-9c9f01a7250b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8759af0-f455-4b73-9837-9c9f01a7250b
Content-Type: application/json

--- response: 200 in 293 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:54 GMT
Etag: W/"b5-gNWXFLB5UFY822QjBPZ+pE617Fg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997194"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=i8SI74MCIeBhriXIilIuQooBznIAx5iLFKnlhh6ABY0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997194"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-295f2c90","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-ae325e27-d7cd-4d9e-b83a-7b907b40d5ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae325e27-d7cd-4d9e-b83a-7b907b40d5ac
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 292 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:55 GMT
Etag: W/"1b-XqWzEyR4EQQav1Qr29bQR91uEP8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997195"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997195"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4687
correlation: qa-0c621773-caee-4d10-873a-26e5bab2cd8b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0c621773-caee-4d10-873a-26e5bab2cd8b
Content-Type: application/json

--- response: 201 in 288 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:55 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997195"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997195"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4687
correlation: qa-4059c565-491d-4297-8635-f9fe93291ab3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4059c565-491d-4297-8635-f9fe93291ab3
Content-Type: application/json

--- response: 404 in 285 ms ---
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
