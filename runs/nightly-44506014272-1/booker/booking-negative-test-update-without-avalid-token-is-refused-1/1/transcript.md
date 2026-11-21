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
| 1 | `POST /booking` | 200 | 28 | `qa-04b872a7-465b-4a3c-a678-13608ce6dc4e` |
| 2 | `PUT /booking/{id}` | 403 | 28 | `qa-470a32cb-996d-4e6c-9142-f79a2de46616` |
| 3 | `GET /booking/{id}` | 200 | 37 | `qa-885a4281-77fa-49c0-b391-d7e35173ce3f` |
| 4 | `DELETE /booking/{id}` | 201 | 30 | `qa-5d950431-0586-4a2f-a4e1-2a1fe03adf4a` |
| 5 | `GET /booking/{id}` | 404 | 23 | `qa-03191445-fbb8-4086-a606-fbc4be9f0e86` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-04b872a7-465b-4a3c-a678-13608ce6dc4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04b872a7-465b-4a3c-a678-13608ce6dc4e
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-c23908d3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}

--- response: 200 in 28 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"cf-KfmIfbo8+kS6koypY0lXk7JIurc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4448,"booking":{"firstname":"Keep","lastname":"Guest-c23908d3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4448
correlation: qa-470a32cb-996d-4e6c-9142-f79a2de46616

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-470a32cb-996d-4e6c-9142-f79a2de46616
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-3f7eac29","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}

--- response: 403 in 28 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4448
correlation: qa-885a4281-77fa-49c0-b391-d7e35173ce3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-885a4281-77fa-49c0-b391-d7e35173ce3f
Content-Type: application/json

--- response: 200 in 37 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"b2-Thdsj8gArwBw0GaypbkzetDsRvA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-c23908d3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4448
correlation: qa-5d950431-0586-4a2f-a4e1-2a1fe03adf4a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5d950431-0586-4a2f-a4e1-2a1fe03adf4a
Content-Type: application/json

--- response: 201 in 30 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4448
correlation: qa-03191445-fbb8-4086-a606-fbc4be9f0e86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03191445-fbb8-4086-a606-fbc4be9f0e86
Content-Type: application/json

--- response: 404 in 23 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
