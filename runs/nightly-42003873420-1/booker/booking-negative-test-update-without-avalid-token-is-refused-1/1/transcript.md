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
| 1 | `POST /booking` | 200 | 96 | `qa-a944d203-9360-4afb-9067-e7b766762cea` |
| 2 | `PUT /booking/{id}` | 403 | 97 | `qa-e0cf7610-2bf5-4915-b4f0-b753504d895c` |
| 3 | `GET /booking/{id}` | 200 | 110 | `qa-6b6fa28a-4ecd-4bee-9104-e7302242a1d8` |
| 4 | `DELETE /booking/{id}` | 201 | 99 | `qa-64516776-2443-44be-b0fc-4a8c1d2cee19` |
| 5 | `GET /booking/{id}` | 404 | 97 | `qa-3c233fd0-01e5-4f44-818d-48550a5b83c8` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a944d203-9360-4afb-9067-e7b766762cea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a944d203-9360-4afb-9067-e7b766762cea
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-9cedb88a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}

--- response: 200 in 96 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"cf-qXYQtgx9r/Q5xoQHhe5WIc66wkQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3881,"booking":{"firstname":"Keep","lastname":"Guest-9cedb88a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3881
correlation: qa-e0cf7610-2bf5-4915-b4f0-b753504d895c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e0cf7610-2bf5-4915-b4f0-b753504d895c
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-2217813c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}

--- response: 403 in 97 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3881
correlation: qa-6b6fa28a-4ecd-4bee-9104-e7302242a1d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b6fa28a-4ecd-4bee-9104-e7302242a1d8
Content-Type: application/json

--- response: 200 in 110 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"b2-dSBNblUgCEjaAw3zEdi6iCWRI7I"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-9cedb88a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3881
correlation: qa-64516776-2443-44be-b0fc-4a8c1d2cee19

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-64516776-2443-44be-b0fc-4a8c1d2cee19
Content-Type: application/json

--- response: 201 in 99 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3881
correlation: qa-3c233fd0-01e5-4f44-818d-48550a5b83c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c233fd0-01e5-4f44-818d-48550a5b83c8
Content-Type: application/json

--- response: 404 in 97 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
