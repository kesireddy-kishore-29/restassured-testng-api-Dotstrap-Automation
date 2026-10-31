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
| 1 | `POST /booking` | 200 | 24 | `qa-d0ecb46b-c30d-4c64-ae86-c728b137ec30` |
| 2 | `PUT /booking/{id}` | 403 | 24 | `qa-aa760588-b0e6-4d14-8229-579f98c423db` |
| 3 | `GET /booking/{id}` | 200 | 26 | `qa-6a5b70d9-1226-4a2b-8dde-6438a04eff38` |
| 4 | `DELETE /booking/{id}` | 201 | 22 | `qa-d5e8cf5f-8c20-46e2-a2e1-6a23b7d5e8da` |
| 5 | `GET /booking/{id}` | 404 | 21 | `qa-00eee48c-8a69-4f3c-ab70-a1032e2e1efd` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d0ecb46b-c30d-4c64-ae86-c728b137ec30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0ecb46b-c30d-4c64-ae86-c728b137ec30
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-f43812d5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 24 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:30 GMT
Etag: W/"cf-DjLITzFRRW7a5zDvp4SLjEw1n1w"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088030"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088030"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5138,"booking":{"firstname":"Keep","lastname":"Guest-f43812d5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5138
correlation: qa-aa760588-b0e6-4d14-8229-579f98c423db

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-aa760588-b0e6-4d14-8229-579f98c423db
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-15f3071f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}

--- response: 403 in 24 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:30 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088030"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088030"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5138
correlation: qa-6a5b70d9-1226-4a2b-8dde-6438a04eff38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a5b70d9-1226-4a2b-8dde-6438a04eff38
Content-Type: application/json

--- response: 200 in 26 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:30 GMT
Etag: W/"b2-tyS2FayAAgGO7xxsknJOjfFUal4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088030"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088030"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-f43812d5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5138
correlation: qa-d5e8cf5f-8c20-46e2-a2e1-6a23b7d5e8da

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-d5e8cf5f-8c20-46e2-a2e1-6a23b7d5e8da
Content-Type: application/json

--- response: 201 in 22 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:30 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088030"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088030"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5138
correlation: qa-00eee48c-8a69-4f3c-ab70-a1032e2e1efd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00eee48c-8a69-4f3c-ab70-a1032e2e1efd
Content-Type: application/json

--- response: 404 in 21 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:30 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088030"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088030"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
