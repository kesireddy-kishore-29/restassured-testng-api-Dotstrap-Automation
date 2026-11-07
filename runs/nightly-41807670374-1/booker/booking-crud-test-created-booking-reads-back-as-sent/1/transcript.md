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
| 1 | `POST /booking` | 200 | 208 | `qa-dbeac529-a8e9-4a68-8341-3edc3bf9e429` |
| 2 | `GET /booking/{id}` | 200 | 210 | `qa-a9a09789-2652-4376-a76e-a80e9afe49ec` |
| 3 | `POST /auth` | 200 | 205 | `qa-277aafcc-c611-4e73-9386-03fd164d5dd2` |
| 4 | `DELETE /booking/{id}` | 201 | 209 | `qa-c77decb3-e6de-4617-a2ca-3337dd560343` |
| 5 | `GET /booking/{id}` | 404 | 221 | `qa-ff3cbf55-4200-4c79-9a58-a03c5a1105c2` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-dbeac529-a8e9-4a68-8341-3edc3bf9e429

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbeac529-a8e9-4a68-8341-3edc3bf9e429
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-e6645d9a","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Late check-in"}

--- response: 200 in 208 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:15 GMT
Etag: W/"d2-QkNLQIiJGIi8eXhvcDSdz1M0jxg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=F27nDeLRQlm7lNKxhf3iLnHETzn2k%2BFdZXY9W%2Bqomtc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784495"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=F27nDeLRQlm7lNKxhf3iLnHETzn2k%2BFdZXY9W%2Bqomtc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784495"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3854,"booking":{"firstname":"Ada","lastname":"Guest-e6645d9a","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/3854
correlation: qa-a9a09789-2652-4376-a76e-a80e9afe49ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9a09789-2652-4376-a76e-a80e9afe49ec
Content-Type: application/json

--- response: 200 in 210 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:16 GMT
Etag: W/"b5-hMtxCI/CPsyPZki4UB3luoeROvY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-e6645d9a","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-277aafcc-c611-4e73-9386-03fd164d5dd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-277aafcc-c611-4e73-9386-03fd164d5dd2
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 205 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:16 GMT
Etag: W/"1b-QxL+dqEvoaGE1QaxvwS4CC0YGFM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3854
correlation: qa-c77decb3-e6de-4617-a2ca-3337dd560343

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c77decb3-e6de-4617-a2ca-3337dd560343
Content-Type: application/json

--- response: 201 in 209 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:16 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3854
correlation: qa-ff3cbf55-4200-4c79-9a58-a03c5a1105c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff3cbf55-4200-4c79-9a58-a03c5a1105c2
Content-Type: application/json

--- response: 404 in 221 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:16 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
