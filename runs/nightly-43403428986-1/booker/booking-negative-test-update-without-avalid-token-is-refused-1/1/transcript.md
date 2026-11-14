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
| 1 | `POST /booking` | 200 | 278 | `qa-bf443a38-2f46-4c77-8d1e-b8276b73f3c8` |
| 2 | `PUT /booking/{id}` | 403 | 163 | `qa-29dc7f94-60d8-40f7-b25c-c90cebf18c19` |
| 3 | `GET /booking/{id}` | 200 | 274 | `qa-6840b1e5-6945-482c-a6b3-9f2c0e11a495` |
| 4 | `DELETE /booking/{id}` | 201 | 148 | `qa-8b04e3d6-23ac-4c5a-8ee0-3c119aca30dc` |
| 5 | `GET /booking/{id}` | 404 | 145 | `qa-e818765b-32de-47ab-9196-930eb8eec9ac` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-bf443a38-2f46-4c77-8d1e-b8276b73f3c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf443a38-2f46-4c77-8d1e-b8276b73f3c8
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-626731bb","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}

--- response: 200 in 278 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:14 GMT
Etag: W/"ce-7JJY6s1OzjbWMLMYBbcUEDiXgk8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562934"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BCLkxbqN%2Fa0KxIBQyQfpM1%2BjSZijkDmHy6brvXxA99M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562934"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":725,"booking":{"firstname":"Keep","lastname":"Guest-626731bb","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/725
correlation: qa-29dc7f94-60d8-40f7-b25c-c90cebf18c19

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-29dc7f94-60d8-40f7-b25c-c90cebf18c19
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-4e06df5c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}

--- response: 403 in 163 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:15 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562935"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562935"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/725
correlation: qa-6840b1e5-6945-482c-a6b3-9f2c0e11a495

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6840b1e5-6945-482c-a6b3-9f2c0e11a495
Content-Type: application/json

--- response: 200 in 274 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:15 GMT
Etag: W/"b2-weUnnRVn0gq0xO1UymAfgU8ZO6s"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562935"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562935"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-626731bb","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/725
correlation: qa-8b04e3d6-23ac-4c5a-8ee0-3c119aca30dc

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8b04e3d6-23ac-4c5a-8ee0-3c119aca30dc
Content-Type: application/json

--- response: 201 in 148 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:15 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562935"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562935"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/725
correlation: qa-e818765b-32de-47ab-9196-930eb8eec9ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e818765b-32de-47ab-9196-930eb8eec9ac
Content-Type: application/json

--- response: 404 in 145 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:15 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562935"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562935"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
