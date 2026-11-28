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
| 1 | `POST /booking` | 200 | 35 | `qa-99225df6-1916-46e6-addc-2a96e3e24ada` |
| 2 | `GET /booking/{id}` | 200 | 43 | `qa-d56f2562-4d17-411e-9ab5-8eeccf582b7b` |
| 3 | `POST /auth` | 200 | 36 | `qa-66b9ace4-8bbf-4f73-a5ec-3e7e9eafb11a` |
| 4 | `DELETE /booking/{id}` | 201 | 40 | `qa-9d1ce0bf-bc8a-43e1-8bf4-ebc3e59795f3` |
| 5 | `GET /booking/{id}` | 404 | 33 | `qa-4d0aa69c-8b20-4b0a-ae0d-8334f9a8ea20` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-99225df6-1916-46e6-addc-2a96e3e24ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99225df6-1916-46e6-addc-2a96e3e24ada
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-6cb2c973","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Late check-in"}

--- response: 200 in 35 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:11 GMT
Etag: W/"d2-WO1G7WyhQs07o6DAC1TwJB7LTfc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862231"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862231"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3194,"booking":{"firstname":"Ada","lastname":"Guest-6cb2c973","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/3194
correlation: qa-d56f2562-4d17-411e-9ab5-8eeccf582b7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d56f2562-4d17-411e-9ab5-8eeccf582b7b
Content-Type: application/json

--- response: 200 in 43 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:11 GMT
Etag: W/"b5-09jLdJnQ/jgaN9P9YRF6Nz2HNT0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862231"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862231"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-6cb2c973","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-66b9ace4-8bbf-4f73-a5ec-3e7e9eafb11a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66b9ace4-8bbf-4f73-a5ec-3e7e9eafb11a
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 36 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"1b-Aa3r3acLYpHaH5AWh8SZID1NUpU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3194
correlation: qa-9d1ce0bf-bc8a-43e1-8bf4-ebc3e59795f3

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-9d1ce0bf-bc8a-43e1-8bf4-ebc3e59795f3
Content-Type: application/json

--- response: 201 in 40 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3194
correlation: qa-4d0aa69c-8b20-4b0a-ae0d-8334f9a8ea20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d0aa69c-8b20-4b0a-ae0d-8334f9a8ea20
Content-Type: application/json

--- response: 404 in 33 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
