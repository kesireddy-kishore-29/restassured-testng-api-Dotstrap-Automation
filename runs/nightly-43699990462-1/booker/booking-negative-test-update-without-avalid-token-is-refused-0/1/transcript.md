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
| 1 | `POST /booking` | 200 | 794 | `qa-9ea3e932-73aa-49ff-83fc-25b1d5fd755a` |
| 2 | `PUT /booking/{id}` | 403 | 47 | `qa-f286aa2a-b698-4eb4-b85f-565f3e3f8014` |
| 3 | `GET /booking/{id}` | 200 | 41 | `qa-2dce17d6-10d5-4972-8cbe-f8c7c305b6a0` |
| 4 | `POST /auth` | 200 | 54 | `qa-62d77f5b-29b5-4a24-a245-8384efc6cd7c` |
| 5 | `DELETE /booking/{id}` | 201 | 37 | `qa-e32df7e1-2d30-45ba-83d4-e86766eb5f1e` |
| 6 | `GET /booking/{id}` | 404 | 39 | `qa-f2e36c9f-1788-46fe-875f-7d8e5ce0356a` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-9ea3e932-73aa-49ff-83fc-25b1d5fd755a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ea3e932-73aa-49ff-83fc-25b1d5fd755a
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-f49e9318","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}

--- response: 200 in 794 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:11 GMT
Etag: W/"cf-tgt30EP2KpqPMS9R8QOWVbfoj6A"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Bkw6FAZn8kvkA3Xh1KTl1oP8JUpsvfS%2BI%2Foz6kMETcU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735371"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Bkw6FAZn8kvkA3Xh1KTl1oP8JUpsvfS%2BI%2Foz6kMETcU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735371"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2798,"booking":{"firstname":"Keep","lastname":"Guest-f49e9318","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2798
correlation: qa-f286aa2a-b698-4eb4-b85f-565f3e3f8014

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f286aa2a-b698-4eb4-b85f-565f3e3f8014
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-d9bf7530","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}

--- response: 403 in 47 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:12 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=MlHHDcmWXfBHmE4VB%2BanlF3s2JURHlycSwDX0YjgSQo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735372"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=MlHHDcmWXfBHmE4VB%2BanlF3s2JURHlycSwDX0YjgSQo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735372"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2798
correlation: qa-2dce17d6-10d5-4972-8cbe-f8c7c305b6a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dce17d6-10d5-4972-8cbe-f8c7c305b6a0
Content-Type: application/json

--- response: 200 in 41 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:12 GMT
Etag: W/"b2-f4PCfhJ8fXaSABfCdd5sFVhVaOc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=MlHHDcmWXfBHmE4VB%2BanlF3s2JURHlycSwDX0YjgSQo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735372"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=MlHHDcmWXfBHmE4VB%2BanlF3s2JURHlycSwDX0YjgSQo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735372"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-f49e9318","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-62d77f5b-29b5-4a24-a245-8384efc6cd7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62d77f5b-29b5-4a24-a245-8384efc6cd7c
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 54 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"1b-gjIJPQ+Km3WUr6b8v52kJZs2B4U"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/2798
correlation: qa-e32df7e1-2d30-45ba-83d4-e86766eb5f1e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e32df7e1-2d30-45ba-83d4-e86766eb5f1e
Content-Type: application/json

--- response: 201 in 37 ms ---
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

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/2798
correlation: qa-f2e36c9f-1788-46fe-875f-7d8e5ce0356a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2e36c9f-1788-46fe-875f-7d8e5ce0356a
Content-Type: application/json

--- response: 404 in 39 ms ---
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
