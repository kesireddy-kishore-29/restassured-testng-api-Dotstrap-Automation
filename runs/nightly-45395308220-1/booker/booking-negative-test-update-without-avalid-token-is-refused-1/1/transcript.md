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
| 1 | `POST /booking` | 200 | 32 | `qa-577e83eb-c647-4fdd-98b4-9840bdaa4d41` |
| 2 | `PUT /booking/{id}` | 403 | 36 | `qa-2a0b8c2d-74ed-43c6-93b9-3198750f38cb` |
| 3 | `GET /booking/{id}` | 200 | 31 | `qa-1079f4c5-c66f-400b-86cb-69e91c1b8246` |
| 4 | `DELETE /booking/{id}` | 201 | 22 | `qa-f89dee01-d87d-49a4-ad1d-5bac57fb8e8b` |
| 5 | `GET /booking/{id}` | 404 | 31 | `qa-101db9f1-5475-450d-a5b5-cae42df87325` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-577e83eb-c647-4fdd-98b4-9840bdaa4d41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-577e83eb-c647-4fdd-98b4-9840bdaa4d41
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-0cdc533b","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 32 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"cf-LZQcPjvCCI/zGIW5gYvWqeDJ2QU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3802,"booking":{"firstname":"Keep","lastname":"Guest-0cdc533b","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3802
correlation: qa-2a0b8c2d-74ed-43c6-93b9-3198750f38cb

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2a0b8c2d-74ed-43c6-93b9-3198750f38cb
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-266b6580","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}

--- response: 403 in 36 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3802
correlation: qa-1079f4c5-c66f-400b-86cb-69e91c1b8246

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1079f4c5-c66f-400b-86cb-69e91c1b8246
Content-Type: application/json

--- response: 200 in 31 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"b2-YsNxo52ao9UITVazRjdA7z7vZ4o"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-0cdc533b","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3802
correlation: qa-f89dee01-d87d-49a4-ad1d-5bac57fb8e8b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f89dee01-d87d-49a4-ad1d-5bac57fb8e8b
Content-Type: application/json

--- response: 201 in 22 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3802
correlation: qa-101db9f1-5475-450d-a5b5-cae42df87325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-101db9f1-5475-450d-a5b5-cae42df87325
Content-Type: application/json

--- response: 404 in 31 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
