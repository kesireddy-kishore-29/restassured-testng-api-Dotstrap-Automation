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
| 1 | `POST /booking` | 200 | 634 | `qa-2733604c-8bed-403c-8083-13dc156fc1af` |
| 2 | `PUT /booking/{id}` | 403 | 123 | `qa-60ad57a4-333e-43de-968f-2eeb823afe8b` |
| 3 | `GET /booking/{id}` | 200 | 120 | `qa-2a94c787-3ce6-4d8d-af58-3b640dab1b89` |
| 4 | `POST /auth` | 200 | 104 | `qa-b3e29249-611e-40dd-addd-715d5d3e3ca2` |
| 5 | `DELETE /booking/{id}` | 201 | 99 | `qa-0b1ce21d-5bfc-43f5-95db-cfd8682d4731` |
| 6 | `GET /booking/{id}` | 404 | 116 | `qa-d9938ac6-b2f2-45bf-a885-0c4bb920e4b1` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-2733604c-8bed-403c-8083-13dc156fc1af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2733604c-8bed-403c-8083-13dc156fc1af
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-f2902b69","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}

--- response: 200 in 634 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:56 GMT
Etag: W/"cf-gi3Newsf9qc0HcaiAJb8B54IylY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=onU4ZZDCrMTRhtKbXGYy52ErcVezZGpOdJ8KJNAb6ak%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871476"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=onU4ZZDCrMTRhtKbXGYy52ErcVezZGpOdJ8KJNAb6ak%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871476"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3865,"booking":{"firstname":"Keep","lastname":"Guest-f2902b69","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3865
correlation: qa-60ad57a4-333e-43de-968f-2eeb823afe8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60ad57a4-333e-43de-968f-2eeb823afe8b
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-88ab9b57","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}

--- response: 403 in 123 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:56 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=onU4ZZDCrMTRhtKbXGYy52ErcVezZGpOdJ8KJNAb6ak%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871476"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=onU4ZZDCrMTRhtKbXGYy52ErcVezZGpOdJ8KJNAb6ak%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871476"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3865
correlation: qa-2a94c787-3ce6-4d8d-af58-3b640dab1b89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a94c787-3ce6-4d8d-af58-3b640dab1b89
Content-Type: application/json

--- response: 200 in 120 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:56 GMT
Etag: W/"b2-Z4CVc+3EB8Xnp6O0kPWYJvOmzbU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=onU4ZZDCrMTRhtKbXGYy52ErcVezZGpOdJ8KJNAb6ak%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871476"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=onU4ZZDCrMTRhtKbXGYy52ErcVezZGpOdJ8KJNAb6ak%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871476"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-f2902b69","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-b3e29249-611e-40dd-addd-715d5d3e3ca2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3e29249-611e-40dd-addd-715d5d3e3ca2
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 104 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"1b-AiDSmhwEtcW6VBi0aNwouVGc0pQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/3865
correlation: qa-0b1ce21d-5bfc-43f5-95db-cfd8682d4731

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0b1ce21d-5bfc-43f5-95db-cfd8682d4731
Content-Type: application/json

--- response: 201 in 99 ms ---
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

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/3865
correlation: qa-d9938ac6-b2f2-45bf-a885-0c4bb920e4b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9938ac6-b2f2-45bf-a885-0c4bb920e4b1
Content-Type: application/json

--- response: 404 in 116 ms ---
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
