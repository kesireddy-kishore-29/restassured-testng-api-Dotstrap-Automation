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
| 1 | `POST /booking` | 200 | 579 | `qa-a5030136-49fd-4986-8469-9f6d9d2c0f73` |
| 2 | `PUT /booking/{id}` | 403 | 110 | `qa-c1b12f4d-fa85-408e-9025-8c7a68447c07` |
| 3 | `GET /booking/{id}` | 200 | 98 | `qa-14e34754-a353-43dd-8c59-bdee4d76e427` |
| 4 | `POST /auth` | 200 | 109 | `qa-947d783a-e2b6-44df-8126-65aa1be8b7ee` |
| 5 | `DELETE /booking/{id}` | 201 | 92 | `qa-ce0cdca5-52ca-4cff-b251-3fc2b7ac9563` |
| 6 | `GET /booking/{id}` | 404 | 102 | `qa-018dd313-83bc-4012-bc2a-ecc62502a906` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a5030136-49fd-4986-8469-9f6d9d2c0f73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5030136-49fd-4986-8469-9f6d9d2c0f73
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-78c9b384","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 579 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:43 GMT
Etag: W/"cf-Qgp25Ap2Jpromj47DSRCAOUk7qI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jJ6M6ewN7hSSOeAO8rjBTYkRA%2FXZ8aOssh53Zv5wT68%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606063"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jJ6M6ewN7hSSOeAO8rjBTYkRA%2FXZ8aOssh53Zv5wT68%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606063"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3505,"booking":{"firstname":"Keep","lastname":"Guest-78c9b384","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3505
correlation: qa-c1b12f4d-fa85-408e-9025-8c7a68447c07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1b12f4d-fa85-408e-9025-8c7a68447c07
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-b30df183","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}

--- response: 403 in 110 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:43 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jJ6M6ewN7hSSOeAO8rjBTYkRA%2FXZ8aOssh53Zv5wT68%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606063"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jJ6M6ewN7hSSOeAO8rjBTYkRA%2FXZ8aOssh53Zv5wT68%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606063"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3505
correlation: qa-14e34754-a353-43dd-8c59-bdee4d76e427

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14e34754-a353-43dd-8c59-bdee4d76e427
Content-Type: application/json

--- response: 200 in 98 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:43 GMT
Etag: W/"b2-RdnkW0cTTPl+wLgeNhbVFptqWLc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jJ6M6ewN7hSSOeAO8rjBTYkRA%2FXZ8aOssh53Zv5wT68%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606063"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jJ6M6ewN7hSSOeAO8rjBTYkRA%2FXZ8aOssh53Zv5wT68%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606063"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-78c9b384","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-947d783a-e2b6-44df-8126-65aa1be8b7ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-947d783a-e2b6-44df-8126-65aa1be8b7ee
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 109 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"1b-nk62aKXDXRPuj08/mtrDscde/mU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/3505
correlation: qa-ce0cdca5-52ca-4cff-b251-3fc2b7ac9563

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-ce0cdca5-52ca-4cff-b251-3fc2b7ac9563
Content-Type: application/json

--- response: 201 in 92 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/3505
correlation: qa-018dd313-83bc-4012-bc2a-ecc62502a906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-018dd313-83bc-4012-bc2a-ecc62502a906
Content-Type: application/json

--- response: 404 in 102 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
