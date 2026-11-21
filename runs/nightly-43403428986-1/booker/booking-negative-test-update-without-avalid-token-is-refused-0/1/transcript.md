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
| 1 | `POST /booking` | 200 | 725 | `qa-62737d41-b805-4af7-a092-fa5cfb189773` |
| 2 | `PUT /booking/{id}` | 403 | 156 | `qa-14d11f77-6357-4afb-ad88-eed2590b9fe6` |
| 3 | `GET /booking/{id}` | 200 | 277 | `qa-cee61d39-5b3f-4ac1-88c7-e175da6f9a11` |
| 4 | `POST /auth` | 200 | 167 | `qa-f6a9799d-2397-42e2-b0c4-923f29684d9e` |
| 5 | `DELETE /booking/{id}` | 201 | 151 | `qa-5ae311d3-2554-4cd9-ad83-74332a4f01d8` |
| 6 | `GET /booking/{id}` | 404 | 150 | `qa-f0dac5cf-18ee-46d1-a064-cba2befdb48a` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-62737d41-b805-4af7-a092-fa5cfb189773

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62737d41-b805-4af7-a092-fa5cfb189773
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-180dd08d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}

--- response: 200 in 725 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:12 GMT
Etag: W/"ce-RekUBKgMJOZoGN5aajdXkbBxO2w"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=y80lAye7X6ZJr6Ql2DvKHOJnPvJiYM9H2ijkuYVg38E%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562932"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=y80lAye7X6ZJr6Ql2DvKHOJnPvJiYM9H2ijkuYVg38E%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562932"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":704,"booking":{"firstname":"Keep","lastname":"Guest-180dd08d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/704
correlation: qa-14d11f77-6357-4afb-ad88-eed2590b9fe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14d11f77-6357-4afb-ad88-eed2590b9fe6
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-4b8a1ac2","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}

--- response: 403 in 156 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:13 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7omg9bLh3aSV%2BqwvIC7q1rssAtiBeGy3QPVMWwZS7Mk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562933"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7omg9bLh3aSV%2BqwvIC7q1rssAtiBeGy3QPVMWwZS7Mk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562933"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/704
correlation: qa-cee61d39-5b3f-4ac1-88c7-e175da6f9a11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cee61d39-5b3f-4ac1-88c7-e175da6f9a11
Content-Type: application/json

--- response: 200 in 277 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:13 GMT
Etag: W/"b2-VKmAIdtaK+v5U+EPW/Q4+2SQVtA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7omg9bLh3aSV%2BqwvIC7q1rssAtiBeGy3QPVMWwZS7Mk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562933"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7omg9bLh3aSV%2BqwvIC7q1rssAtiBeGy3QPVMWwZS7Mk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562933"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-180dd08d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-f6a9799d-2397-42e2-b0c4-923f29684d9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6a9799d-2397-42e2-b0c4-923f29684d9e
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 167 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:14 GMT
Etag: W/"1b-rcDjAOuog2L14Q00jejwJjhwAEo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562934"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562934"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/704
correlation: qa-5ae311d3-2554-4cd9-ad83-74332a4f01d8

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5ae311d3-2554-4cd9-ad83-74332a4f01d8
Content-Type: application/json

--- response: 201 in 151 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:14 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562934"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562934"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/704
correlation: qa-f0dac5cf-18ee-46d1-a064-cba2befdb48a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0dac5cf-18ee-46d1-a064-cba2befdb48a
Content-Type: application/json

--- response: 404 in 150 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:14 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562934"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562934"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
