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
| 1 | `POST /booking` | 200 | 22 | `qa-da052e4c-7ce6-450c-98e5-64978a61a33f` |
| 2 | `PUT /booking/{id}` | 403 | 19 | `qa-4fbcc7a9-23a6-4b37-aba1-87c3b86e5693` |
| 3 | `GET /booking/{id}` | 200 | 23 | `qa-0bfc3b0e-bb88-4e64-a424-8837439cb8fb` |
| 4 | `DELETE /booking/{id}` | 201 | 19 | `qa-b7b1f8a8-ad35-4a00-bf7c-95db213c2fb3` |
| 5 | `GET /booking/{id}` | 404 | 17 | `qa-9b06b962-1631-4982-937a-2c94663fca09` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-da052e4c-7ce6-450c-98e5-64978a61a33f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da052e4c-7ce6-450c-98e5-64978a61a33f
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-3b3f1486","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}

--- response: 200 in 22 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"cf-C3tA+CqW9PAkKk2MOPX380weV8o"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3165,"booking":{"firstname":"Keep","lastname":"Guest-3b3f1486","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3165
correlation: qa-4fbcc7a9-23a6-4b37-aba1-87c3b86e5693

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-4fbcc7a9-23a6-4b37-aba1-87c3b86e5693
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-3e2b74f7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}

--- response: 403 in 19 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3165
correlation: qa-0bfc3b0e-bb88-4e64-a424-8837439cb8fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bfc3b0e-bb88-4e64-a424-8837439cb8fb
Content-Type: application/json

--- response: 200 in 23 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"b2-zi3G3AfiR5aD8cxpXZC1hoTQjAc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-3b3f1486","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3165
correlation: qa-b7b1f8a8-ad35-4a00-bf7c-95db213c2fb3

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b7b1f8a8-ad35-4a00-bf7c-95db213c2fb3
Content-Type: application/json

--- response: 201 in 19 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3165
correlation: qa-9b06b962-1631-4982-937a-2c94663fca09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b06b962-1631-4982-937a-2c94663fca09
Content-Type: application/json

--- response: 404 in 17 ms ---
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
