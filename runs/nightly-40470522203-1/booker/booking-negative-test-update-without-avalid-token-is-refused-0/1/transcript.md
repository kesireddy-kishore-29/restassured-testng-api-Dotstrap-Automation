# Transcript: An update without a valid token is refused and changes nothing [Optional.empty]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[0]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 28 | `qa-66ea029f-a266-4a03-adb2-cde578b6ab40` |
| 2 | `PUT /booking/{id}` | 403 | 25 | `qa-1555fc61-d584-428d-bea0-e06934a2b463` |
| 3 | `GET /booking/{id}` | 200 | 23 | `qa-dcdf0e83-dfc1-4563-a5f0-c19ccfbaba5d` |
| 4 | `DELETE /booking/{id}` | 201 | 24 | `qa-84563eac-b153-497d-881a-94430214d93e` |
| 5 | `GET /booking/{id}` | 404 | 22 | `qa-779eea6b-dc4c-4817-bfbb-4d4c5ad8bd5d` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-66ea029f-a266-4a03-adb2-cde578b6ab40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ea029f-a266-4a03-adb2-cde578b6ab40
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-2062c2f8","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 28 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"cf-zsSp9gtAK96n3JEOkJPSV20xeEw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5132,"booking":{"firstname":"Keep","lastname":"Guest-2062c2f8","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5132
correlation: qa-1555fc61-d584-428d-bea0-e06934a2b463

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1555fc61-d584-428d-bea0-e06934a2b463
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-4472eed0","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}

--- response: 403 in 25 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5132
correlation: qa-dcdf0e83-dfc1-4563-a5f0-c19ccfbaba5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcdf0e83-dfc1-4563-a5f0-c19ccfbaba5d
Content-Type: application/json

--- response: 200 in 23 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:30 GMT
Etag: W/"b2-Talr3GSga/wat0/l/eRbjVFQMj4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088030"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2Fvbr%2Bh8dDrCxkznAoIQ25%2BjdOXEvpUkagAYdw%2BNgOcg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088030"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-2062c2f8","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5132
correlation: qa-84563eac-b153-497d-881a-94430214d93e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-84563eac-b153-497d-881a-94430214d93e
Content-Type: application/json

--- response: 201 in 24 ms ---
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
#5 GET https://restful-booker.herokuapp.com/booking/5132
correlation: qa-779eea6b-dc4c-4817-bfbb-4d4c5ad8bd5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-779eea6b-dc4c-4817-bfbb-4d4c5ad8bd5d
Content-Type: application/json

--- response: 404 in 22 ms ---
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
