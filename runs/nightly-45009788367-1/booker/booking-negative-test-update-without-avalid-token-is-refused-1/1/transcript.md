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
| 1 | `POST /booking` | 200 | 257 | `qa-7dc7498b-4d23-4f3d-aee5-5583bc0e5bb8` |
| 2 | `PUT /booking/{id}` | 403 | 258 | `qa-73ecdfd7-5020-4497-a447-fca10284629f` |
| 3 | `GET /booking/{id}` | 200 | 259 | `qa-ea80169b-e788-4189-b91a-dfe42661dc63` |
| 4 | `DELETE /booking/{id}` | 201 | 252 | `qa-f2d4e670-ee30-4558-bb66-88d25609d5ed` |
| 5 | `GET /booking/{id}` | 404 | 214 | `qa-2bfdfe1f-f0c3-47c7-a8ad-65b291b561cd` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-7dc7498b-4d23-4f3d-aee5-5583bc0e5bb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dc7498b-4d23-4f3d-aee5-5583bc0e5bb8
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-4eb3b60f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 257 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:55 GMT
Etag: W/"cf-duVOnmMHKedHx+JprqSyRpN7VZM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2136,"booking":{"firstname":"Keep","lastname":"Guest-4eb3b60f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2136
correlation: qa-73ecdfd7-5020-4497-a447-fca10284629f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-73ecdfd7-5020-4497-a447-fca10284629f
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-dd3484f1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}

--- response: 403 in 258 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:55 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2136
correlation: qa-ea80169b-e788-4189-b91a-dfe42661dc63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea80169b-e788-4189-b91a-dfe42661dc63
Content-Type: application/json

--- response: 200 in 259 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:56 GMT
Etag: W/"b2-qDsYUqbOIDq5n6sfPcga8Q9P9Os"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=PZyfTABGTXiZF7PEgPoZ4V0jPP74BbJgNpY5bPLsAOc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341296"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=PZyfTABGTXiZF7PEgPoZ4V0jPP74BbJgNpY5bPLsAOc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341296"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-4eb3b60f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2136
correlation: qa-f2d4e670-ee30-4558-bb66-88d25609d5ed

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f2d4e670-ee30-4558-bb66-88d25609d5ed
Content-Type: application/json

--- response: 201 in 252 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:56 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=PZyfTABGTXiZF7PEgPoZ4V0jPP74BbJgNpY5bPLsAOc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341296"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=PZyfTABGTXiZF7PEgPoZ4V0jPP74BbJgNpY5bPLsAOc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341296"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2136
correlation: qa-2bfdfe1f-f0c3-47c7-a8ad-65b291b561cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bfdfe1f-f0c3-47c7-a8ad-65b291b561cd
Content-Type: application/json

--- response: 404 in 214 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:56 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=PZyfTABGTXiZF7PEgPoZ4V0jPP74BbJgNpY5bPLsAOc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341296"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=PZyfTABGTXiZF7PEgPoZ4V0jPP74BbJgNpY5bPLsAOc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341296"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
