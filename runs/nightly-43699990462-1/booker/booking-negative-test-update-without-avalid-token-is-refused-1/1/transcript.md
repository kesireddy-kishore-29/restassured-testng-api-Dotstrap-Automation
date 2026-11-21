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
| 1 | `POST /booking` | 200 | 30 | `qa-42cfba50-9e3f-4f88-a3f4-7609b736ec2b` |
| 2 | `PUT /booking/{id}` | 403 | 35 | `qa-5cc3dfb8-bafc-4297-9ff0-91a529019e24` |
| 3 | `GET /booking/{id}` | 200 | 31 | `qa-32057df3-f54f-479c-ab8f-685c84f1da9d` |
| 4 | `DELETE /booking/{id}` | 201 | 30 | `qa-dd6ca5f6-4166-41aa-9765-d9809635e613` |
| 5 | `GET /booking/{id}` | 404 | 30 | `qa-92de5d5d-203c-42f7-8968-d943fc85a99d` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-42cfba50-9e3f-4f88-a3f4-7609b736ec2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42cfba50-9e3f-4f88-a3f4-7609b736ec2b
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-08a5da07","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}

--- response: 200 in 30 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"cf-O2P8mNm1YQyiRGmKxqJjUUJ+U74"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2809,"booking":{"firstname":"Keep","lastname":"Guest-08a5da07","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2809
correlation: qa-5cc3dfb8-bafc-4297-9ff0-91a529019e24

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5cc3dfb8-bafc-4297-9ff0-91a529019e24
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-4fbb812d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}

--- response: 403 in 35 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2809
correlation: qa-32057df3-f54f-479c-ab8f-685c84f1da9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32057df3-f54f-479c-ab8f-685c84f1da9d
Content-Type: application/json

--- response: 200 in 31 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"b2-bs1LgdKzU/JdkEDlUOZNIgsS/fA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-08a5da07","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2809
correlation: qa-dd6ca5f6-4166-41aa-9765-d9809635e613

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-dd6ca5f6-4166-41aa-9765-d9809635e613
Content-Type: application/json

--- response: 201 in 30 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2809
correlation: qa-92de5d5d-203c-42f7-8968-d943fc85a99d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92de5d5d-203c-42f7-8968-d943fc85a99d
Content-Type: application/json

--- response: 404 in 30 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
