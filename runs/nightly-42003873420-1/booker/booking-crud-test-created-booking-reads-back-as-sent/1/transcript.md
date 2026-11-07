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
| 1 | `POST /booking` | 200 | 106 | `qa-d5cb9be3-a82c-43d0-a3c4-d11ee7a67ab9` |
| 2 | `GET /booking/{id}` | 200 | 107 | `qa-64634b21-5d84-4cc9-9f02-12b655cdf90e` |
| 3 | `POST /auth` | 200 | 118 | `qa-3f98f5b6-e8c1-4bb3-997d-d69ae5ce2562` |
| 4 | `DELETE /booking/{id}` | 201 | 97 | `qa-8f9c132b-6f78-4734-949f-926b149d497e` |
| 5 | `GET /booking/{id}` | 404 | 97 | `qa-30c3c108-d28a-447a-ac9f-ac08f3dde254` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d5cb9be3-a82c-43d0-a3c4-d11ee7a67ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5cb9be3-a82c-43d0-a3c4-d11ee7a67ab9
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-6bb962b5","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Late check-in"}

--- response: 200 in 106 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"d2-lyIul4wbnvLCzzdlS2qM1/uVDMg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3875,"booking":{"firstname":"Ada","lastname":"Guest-6bb962b5","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/3875
correlation: qa-64634b21-5d84-4cc9-9f02-12b655cdf90e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64634b21-5d84-4cc9-9f02-12b655cdf90e
Content-Type: application/json

--- response: 200 in 107 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"b5-7AG4JArbt5palgeaARTE1BPsYzo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-6bb962b5","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-3f98f5b6-e8c1-4bb3-997d-d69ae5ce2562

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f98f5b6-e8c1-4bb3-997d-d69ae5ce2562
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 118 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"1b-6t/KGKQ8oGGW8S112vfjxm89P+k"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3875
correlation: qa-8f9c132b-6f78-4734-949f-926b149d497e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8f9c132b-6f78-4734-949f-926b149d497e
Content-Type: application/json

--- response: 201 in 97 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3875
correlation: qa-30c3c108-d28a-447a-ac9f-ac08f3dde254

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30c3c108-d28a-447a-ac9f-ac08f3dde254
Content-Type: application/json

--- response: 404 in 97 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
