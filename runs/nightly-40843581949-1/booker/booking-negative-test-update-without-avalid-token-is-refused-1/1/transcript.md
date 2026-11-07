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
| 1 | `POST /booking` | 200 | 249 | `qa-ed2a06ac-921b-4c0e-86e0-c9cbfef6ebbe` |
| 2 | `PUT /booking/{id}` | 403 | 226 | `qa-400b7c95-c871-4770-a2e6-d4ed6dd358e6` |
| 3 | `GET /booking/{id}` | 200 | 240 | `qa-d4048a25-e3c4-42fc-bbc2-425521d4b26e` |
| 4 | `DELETE /booking/{id}` | 201 | 260 | `qa-0545e618-beea-4751-97d0-2ccfafdef952` |
| 5 | `GET /booking/{id}` | 404 | 235 | `qa-d7ff8839-bdf9-427f-9188-f02c7320f451` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-ed2a06ac-921b-4c0e-86e0-c9cbfef6ebbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed2a06ac-921b-4c0e-86e0-c9cbfef6ebbe
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-244687cc","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}

--- response: 200 in 249 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:04 GMT
Etag: W/"cf-8wQPyKkvr1faerFYghZgUmGqhwg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263144"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263144"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4315,"booking":{"firstname":"Keep","lastname":"Guest-244687cc","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4315
correlation: qa-400b7c95-c871-4770-a2e6-d4ed6dd358e6

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-400b7c95-c871-4770-a2e6-d4ed6dd358e6
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-c205a02f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}

--- response: 403 in 226 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:05 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263145"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263145"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4315
correlation: qa-d4048a25-e3c4-42fc-bbc2-425521d4b26e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4048a25-e3c4-42fc-bbc2-425521d4b26e
Content-Type: application/json

--- response: 200 in 240 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:05 GMT
Etag: W/"b2-bYwTL0QXJUS5FdcJHaBoEij3RhY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263145"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263145"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-244687cc","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4315
correlation: qa-0545e618-beea-4751-97d0-2ccfafdef952

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0545e618-beea-4751-97d0-2ccfafdef952
Content-Type: application/json

--- response: 201 in 260 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:05 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263145"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263145"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4315
correlation: qa-d7ff8839-bdf9-427f-9188-f02c7320f451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7ff8839-bdf9-427f-9188-f02c7320f451
Content-Type: application/json

--- response: 404 in 235 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:05 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263145"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263145"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
