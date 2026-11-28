# Transcript: A full update with a token replaces the booking

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#fullUpdateWithATokenReplacesTheBooking` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 28 | `qa-eaa72aeb-044b-448e-8dce-6920fdcb0f0b` |
| 2 | `PUT /booking/{id}` | 200 | 29 | `qa-fe6a744f-69a7-4432-a100-5de6611c5bfe` |
| 3 | `DELETE /booking/{id}` | 201 | 25 | `qa-a41b5e9c-8c5d-4ca6-bebb-03ecf0888302` |
| 4 | `GET /booking/{id}` | 404 | 30 | `qa-da131ac0-c727-4710-b866-2e9699c79a13` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-eaa72aeb-044b-448e-8dce-6920fdcb0f0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaa72aeb-044b-448e-8dce-6920fdcb0f0b
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-eb89bbaf","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}

--- response: 200 in 28 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"cd-opiYzy+Sh700TPYu+fGyirAP0Pw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4451,"booking":{"firstname":"QA","lastname":"Guest-eb89bbaf","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4451
correlation: qa-fe6a744f-69a7-4432-a100-5de6611c5bfe

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-fe6a744f-69a7-4432-a100-5de6611c5bfe
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-70dacd6a","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}

--- response: 200 in 29 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"b3-3oqaSQf3B3viqAFseClRnYbylL8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-70dacd6a","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4451
correlation: qa-a41b5e9c-8c5d-4ca6-bebb-03ecf0888302

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a41b5e9c-8c5d-4ca6-bebb-03ecf0888302
Content-Type: application/json

--- response: 201 in 25 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:22 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=E5i61Kw4ygJi2WoD1SLNgxwICEHNGq9dw0isj3jKY2I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084162"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=E5i61Kw4ygJi2WoD1SLNgxwICEHNGq9dw0isj3jKY2I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084162"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4451
correlation: qa-da131ac0-c727-4710-b866-2e9699c79a13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da131ac0-c727-4710-b866-2e9699c79a13
Content-Type: application/json

--- response: 404 in 30 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:22 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=E5i61Kw4ygJi2WoD1SLNgxwICEHNGq9dw0isj3jKY2I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084162"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=E5i61Kw4ygJi2WoD1SLNgxwICEHNGq9dw0isj3jKY2I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084162"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
