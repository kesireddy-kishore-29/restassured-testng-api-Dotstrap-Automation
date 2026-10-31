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
| 1 | `POST /booking` | 200 | 194 | `qa-382a51ea-c3e9-477b-ad25-5b30f042ecc8` |
| 2 | `PUT /booking/{id}` | 403 | 205 | `qa-6693489f-8978-43d4-b108-6d3fe838e551` |
| 3 | `GET /booking/{id}` | 200 | 199 | `qa-dc2669b7-3f08-45dc-9720-453a9176d156` |
| 4 | `DELETE /booking/{id}` | 201 | 193 | `qa-c717b1ee-e16b-4156-90b2-a768d5d8726f` |
| 5 | `GET /booking/{id}` | 404 | 193 | `qa-d2debe21-a14c-4aec-ba87-daadb15405c2` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-382a51ea-c3e9-477b-ad25-5b30f042ecc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-382a51ea-c3e9-477b-ad25-5b30f042ecc8
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-de8c1b39","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 194 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:37 GMT
Etag: W/"ce-IO2g5wHMbI9st0nB8fl2NSO0eVk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=32YczEKDVEdHel5B9eNIDRAj3LKufqYiQTWVikXy8jc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741297"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=32YczEKDVEdHel5B9eNIDRAj3LKufqYiQTWVikXy8jc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741297"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":350,"booking":{"firstname":"Keep","lastname":"Guest-de8c1b39","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/350
correlation: qa-6693489f-8978-43d4-b108-6d3fe838e551

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-6693489f-8978-43d4-b108-6d3fe838e551
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-db42b74c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}

--- response: 403 in 205 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:37 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=32YczEKDVEdHel5B9eNIDRAj3LKufqYiQTWVikXy8jc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741297"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=32YczEKDVEdHel5B9eNIDRAj3LKufqYiQTWVikXy8jc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741297"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/350
correlation: qa-dc2669b7-3f08-45dc-9720-453a9176d156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc2669b7-3f08-45dc-9720-453a9176d156
Content-Type: application/json

--- response: 200 in 199 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:38 GMT
Etag: W/"b2-98dDCFBcLfBzYWtvZYx/saN2YcA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=o%2F4ZpNxTs1UI4phiTRZkeqxwgqVykySlsPQj83vbhiY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741298"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=o%2F4ZpNxTs1UI4phiTRZkeqxwgqVykySlsPQj83vbhiY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741298"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-de8c1b39","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/350
correlation: qa-c717b1ee-e16b-4156-90b2-a768d5d8726f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c717b1ee-e16b-4156-90b2-a768d5d8726f
Content-Type: application/json

--- response: 201 in 193 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:38 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=o%2F4ZpNxTs1UI4phiTRZkeqxwgqVykySlsPQj83vbhiY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741298"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=o%2F4ZpNxTs1UI4phiTRZkeqxwgqVykySlsPQj83vbhiY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741298"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/350
correlation: qa-d2debe21-a14c-4aec-ba87-daadb15405c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2debe21-a14c-4aec-ba87-daadb15405c2
Content-Type: application/json

--- response: 404 in 193 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:38 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=o%2F4ZpNxTs1UI4phiTRZkeqxwgqVykySlsPQj83vbhiY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741298"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=o%2F4ZpNxTs1UI4phiTRZkeqxwgqVykySlsPQj83vbhiY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741298"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
