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
| 1 | `POST /booking` | 200 | 237 | `qa-bd9f6ba9-541d-44f4-89f7-0c5ea7029672` |
| 2 | `PUT /booking/{id}` | 403 | 255 | `qa-1ddb315c-d5f8-48db-85b5-8d7f549d630a` |
| 3 | `GET /booking/{id}` | 200 | 238 | `qa-30df6c0d-fced-4073-9333-7898c4e0bcbb` |
| 4 | `DELETE /booking/{id}` | 201 | 234 | `qa-a4b2f8c3-ea66-44cb-a56c-c39a8b547d20` |
| 5 | `GET /booking/{id}` | 404 | 230 | `qa-bfb1181b-bfa4-489c-8de3-cbe942fd3f80` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-bd9f6ba9-541d-44f4-89f7-0c5ea7029672

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd9f6ba9-541d-44f4-89f7-0c5ea7029672
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-047f05ea","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}

--- response: 200 in 237 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:54 GMT
Etag: W/"cf-N4WuHcrD5bqzJirVHIvzuBXTOJs"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218154"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218154"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2613,"booking":{"firstname":"Keep","lastname":"Guest-047f05ea","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2613
correlation: qa-1ddb315c-d5f8-48db-85b5-8d7f549d630a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1ddb315c-d5f8-48db-85b5-8d7f549d630a
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-2c40458d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}

--- response: 403 in 255 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:55 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218155"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218155"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2613
correlation: qa-30df6c0d-fced-4073-9333-7898c4e0bcbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30df6c0d-fced-4073-9333-7898c4e0bcbb
Content-Type: application/json

--- response: 200 in 238 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:55 GMT
Etag: W/"b2-ImY52XeCcLoXhxF11mWy2E0uQSg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218155"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218155"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-047f05ea","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2613
correlation: qa-a4b2f8c3-ea66-44cb-a56c-c39a8b547d20

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a4b2f8c3-ea66-44cb-a56c-c39a8b547d20
Content-Type: application/json

--- response: 201 in 234 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:55 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218155"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218155"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2613
correlation: qa-bfb1181b-bfa4-489c-8de3-cbe942fd3f80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfb1181b-bfa4-489c-8de3-cbe942fd3f80
Content-Type: application/json

--- response: 404 in 230 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:55 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218155"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218155"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
