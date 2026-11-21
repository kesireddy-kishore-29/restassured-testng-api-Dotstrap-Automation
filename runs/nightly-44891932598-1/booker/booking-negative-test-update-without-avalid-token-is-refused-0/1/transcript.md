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
| 1 | `POST /booking` | 200 | 481 | `qa-caac1df0-19cd-44a4-baa3-da27542bfc60` |
| 2 | `PUT /booking/{id}` | 403 | 33 | `qa-279a6c18-7b36-4150-a077-85d5a5796168` |
| 3 | `GET /booking/{id}` | 200 | 33 | `qa-8a2e103e-cf12-434d-a372-e00f48e06055` |
| 4 | `POST /auth` | 200 | 23 | `qa-ac4c7403-bbd6-4532-a304-c5efd5cfc79b` |
| 5 | `DELETE /booking/{id}` | 201 | 22 | `qa-fb79555e-8e18-4dd6-81f6-656544c740af` |
| 6 | `GET /booking/{id}` | 404 | 25 | `qa-7ab2c3d8-1f59-4f1a-9f0c-80e6ba2fbbe7` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-caac1df0-19cd-44a4-baa3-da27542bfc60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caac1df0-19cd-44a4-baa3-da27542bfc60
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-1aadf075","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}

--- response: 200 in 481 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:03 GMT
Etag: W/"cf-GHRa4jpPBlxzte3rduVop6OK2Yw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AauCsjYO7mcazz23mCr33QR2qtF4ioafzg%2Fy7VeN9fk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255023"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AauCsjYO7mcazz23mCr33QR2qtF4ioafzg%2Fy7VeN9fk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255023"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3155,"booking":{"firstname":"Keep","lastname":"Guest-1aadf075","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3155
correlation: qa-279a6c18-7b36-4150-a077-85d5a5796168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-279a6c18-7b36-4150-a077-85d5a5796168
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-acc247e4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}

--- response: 403 in 33 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:03 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AauCsjYO7mcazz23mCr33QR2qtF4ioafzg%2Fy7VeN9fk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255023"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AauCsjYO7mcazz23mCr33QR2qtF4ioafzg%2Fy7VeN9fk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255023"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3155
correlation: qa-8a2e103e-cf12-434d-a372-e00f48e06055

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a2e103e-cf12-434d-a372-e00f48e06055
Content-Type: application/json

--- response: 200 in 33 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:03 GMT
Etag: W/"b2-jpd6mCg9YqfxzTPyHy71sIjMBJk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AauCsjYO7mcazz23mCr33QR2qtF4ioafzg%2Fy7VeN9fk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255023"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AauCsjYO7mcazz23mCr33QR2qtF4ioafzg%2Fy7VeN9fk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255023"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-1aadf075","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-ac4c7403-bbd6-4532-a304-c5efd5cfc79b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac4c7403-bbd6-4532-a304-c5efd5cfc79b
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 23 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"1b-PbFd7UWryBwfuAM9ykgIhqoTAKo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/3155
correlation: qa-fb79555e-8e18-4dd6-81f6-656544c740af

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-fb79555e-8e18-4dd6-81f6-656544c740af
Content-Type: application/json

--- response: 201 in 22 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/3155
correlation: qa-7ab2c3d8-1f59-4f1a-9f0c-80e6ba2fbbe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ab2c3d8-1f59-4f1a-9f0c-80e6ba2fbbe7
Content-Type: application/json

--- response: 404 in 25 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
