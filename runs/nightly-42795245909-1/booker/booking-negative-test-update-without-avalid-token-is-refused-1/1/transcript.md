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
| 1 | `POST /booking` | 200 | 25 | `qa-50dcafe1-c9c3-413e-9fc0-d3ccce7ca9fd` |
| 2 | `PUT /booking/{id}` | 403 | 25 | `qa-11cabaf5-d2c4-42dd-b360-c668301c73ce` |
| 3 | `GET /booking/{id}` | 200 | 25 | `qa-fedd6b21-20ea-425a-8486-c8405d1d84a3` |
| 4 | `DELETE /booking/{id}` | 201 | 24 | `qa-8c8d553c-18b6-4a82-bb16-a33da100c5c8` |
| 5 | `GET /booking/{id}` | 404 | 20 | `qa-3f0478c4-8ebc-4643-9047-8dac46a77810` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-50dcafe1-c9c3-413e-9fc0-d3ccce7ca9fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50dcafe1-c9c3-413e-9fc0-d3ccce7ca9fd
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-16d4d3c5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}

--- response: 200 in 25 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"cf-q+FtkXpYT/nJ1ObMGn38MGl+x4c"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4618,"booking":{"firstname":"Keep","lastname":"Guest-16d4d3c5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4618
correlation: qa-11cabaf5-d2c4-42dd-b360-c668301c73ce

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-11cabaf5-d2c4-42dd-b360-c668301c73ce
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-7ce661f8","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}

--- response: 403 in 25 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4618
correlation: qa-fedd6b21-20ea-425a-8486-c8405d1d84a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fedd6b21-20ea-425a-8486-c8405d1d84a3
Content-Type: application/json

--- response: 200 in 25 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"b2-NxPVEM81HjGQNAOmxe/tZs4s9WU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-16d4d3c5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4618
correlation: qa-8c8d553c-18b6-4a82-bb16-a33da100c5c8

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8c8d553c-18b6-4a82-bb16-a33da100c5c8
Content-Type: application/json

--- response: 201 in 24 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4618
correlation: qa-3f0478c4-8ebc-4643-9047-8dac46a77810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f0478c4-8ebc-4643-9047-8dac46a77810
Content-Type: application/json

--- response: 404 in 20 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
