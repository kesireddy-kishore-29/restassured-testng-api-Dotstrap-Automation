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
| 1 | `POST /booking` | 200 | 144 | `qa-87bd6f7c-964a-4b9b-a4b8-aa97f1a5db02` |
| 2 | `PUT /booking/{id}` | 403 | 259 | `qa-31ff2e3d-098e-458c-9ba7-37d5cf502941` |
| 3 | `GET /booking/{id}` | 200 | 260 | `qa-97f02f99-8c58-4773-b180-970c4f01467a` |
| 4 | `DELETE /booking/{id}` | 201 | 128 | `qa-f27086cb-157a-4bf4-af1a-d622c175a440` |
| 5 | `GET /booking/{id}` | 404 | 142 | `qa-d858d012-071e-4070-a4b5-d81cfb43cee1` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-87bd6f7c-964a-4b9b-a4b8-aa97f1a5db02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87bd6f7c-964a-4b9b-a4b8-aa97f1a5db02
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-33af92d6","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}

--- response: 200 in 144 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:27 GMT
Etag: W/"cf-mj3x/O17Eu2lhJdZcJttk82Ctow"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525007"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525007"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1361,"booking":{"firstname":"Keep","lastname":"Guest-33af92d6","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1361
correlation: qa-31ff2e3d-098e-458c-9ba7-37d5cf502941

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-31ff2e3d-098e-458c-9ba7-37d5cf502941
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-43194a0a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}

--- response: 403 in 259 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:28 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525008"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525008"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1361
correlation: qa-97f02f99-8c58-4773-b180-970c4f01467a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97f02f99-8c58-4773-b180-970c4f01467a
Content-Type: application/json

--- response: 200 in 260 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:28 GMT
Etag: W/"b2-lEAi6ux/d8XdlcifGTOXW/rYev0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525008"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525008"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-33af92d6","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/1361
correlation: qa-f27086cb-157a-4bf4-af1a-d622c175a440

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f27086cb-157a-4bf4-af1a-d622c175a440
Content-Type: application/json

--- response: 201 in 128 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:28 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525008"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525008"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/1361
correlation: qa-d858d012-071e-4070-a4b5-d81cfb43cee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d858d012-071e-4070-a4b5-d81cfb43cee1
Content-Type: application/json

--- response: 404 in 142 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:28 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525008"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525008"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
