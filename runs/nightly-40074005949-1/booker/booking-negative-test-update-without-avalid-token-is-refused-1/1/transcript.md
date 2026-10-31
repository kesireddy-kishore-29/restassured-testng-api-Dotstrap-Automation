# Transcript: An update without a valid token is refused and changes nothing [Optional[not-a-real-token]]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[1]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 259 | `qa-0b7beb10-1f6e-4145-a8a2-5d0c4e425c3e` |
| 2 | `PUT /booking/{id}` | 403 | 235 | `qa-9d0a6725-8ea2-4a11-9f3a-84357bc8f534` |
| 3 | `GET /booking/{id}` | 200 | 230 | `qa-03adb898-b91b-4e7c-8592-790a4dce2153` |
| 4 | `DELETE /booking/{id}` | 201 | 235 | `qa-a2606ace-a578-49a9-afaa-8835b1b0d343` |
| 5 | `GET /booking/{id}` | 404 | 219 | `qa-b022b5e7-17c8-4851-8740-53e0decbcfcc` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-0b7beb10-1f6e-4145-a8a2-5d0c4e425c3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b7beb10-1f6e-4145-a8a2-5d0c4e425c3e
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-9e061eb9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}

--- response: 200 in 259 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:08 GMT
Etag: W/"cf-NpRGDqiox5KdbqckLUtYW6ZveIY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=yIpkzFyV8EwqH8eTzmdvurGTG8nK9c%2BthjH%2Bx8Fz%2FrE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=yIpkzFyV8EwqH8eTzmdvurGTG8nK9c%2BthjH%2Bx8Fz%2FrE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2251,"booking":{"firstname":"Keep","lastname":"Guest-9e061eb9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2251
correlation: qa-9d0a6725-8ea2-4a11-9f3a-84357bc8f534

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-9d0a6725-8ea2-4a11-9f3a-84357bc8f534
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-64d88d14","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}

--- response: 403 in 235 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:08 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=yIpkzFyV8EwqH8eTzmdvurGTG8nK9c%2BthjH%2Bx8Fz%2FrE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=yIpkzFyV8EwqH8eTzmdvurGTG8nK9c%2BthjH%2Bx8Fz%2FrE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2251
correlation: qa-03adb898-b91b-4e7c-8592-790a4dce2153

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03adb898-b91b-4e7c-8592-790a4dce2153
Content-Type: application/json

--- response: 200 in 230 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:08 GMT
Etag: W/"b2-7eqVKCjDR5MrB1jYUazPv8wV90I"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=yIpkzFyV8EwqH8eTzmdvurGTG8nK9c%2BthjH%2Bx8Fz%2FrE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=yIpkzFyV8EwqH8eTzmdvurGTG8nK9c%2BthjH%2Bx8Fz%2FrE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-9e061eb9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2251
correlation: qa-a2606ace-a578-49a9-afaa-8835b1b0d343

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a2606ace-a578-49a9-afaa-8835b1b0d343
Content-Type: application/json

--- response: 201 in 235 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:08 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=yIpkzFyV8EwqH8eTzmdvurGTG8nK9c%2BthjH%2Bx8Fz%2FrE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=yIpkzFyV8EwqH8eTzmdvurGTG8nK9c%2BthjH%2Bx8Fz%2FrE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2251
correlation: qa-b022b5e7-17c8-4851-8740-53e0decbcfcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b022b5e7-17c8-4851-8740-53e0decbcfcc
Content-Type: application/json

--- response: 404 in 219 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:09 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=fWonHlSIRE%2BVsOW40pNL2NuatYIBP1YagdxpJrlZSXQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826709"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=fWonHlSIRE%2BVsOW40pNL2NuatYIBP1YagdxpJrlZSXQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826709"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
