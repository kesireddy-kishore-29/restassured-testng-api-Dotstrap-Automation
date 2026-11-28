# Transcript: A partial update changes only the named fields

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#partialUpdateChangesOnlyNamedFields` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 26 | `qa-ac850de8-4212-4c78-bec5-c03d0b208cf7` |
| 2 | `PATCH /booking/{id}` | 200 | 37 | `qa-4d06b5c7-31ec-4361-be7b-7a67e6ca273d` |
| 3 | `DELETE /booking/{id}` | 201 | 26 | `qa-cd5f02f3-7ccc-4793-a3d9-ed3ed3ede230` |
| 4 | `GET /booking/{id}` | 404 | 24 | `qa-9ca6dd94-c94a-4b8b-9eab-e5c5d90919f0` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-ac850de8-4212-4c78-bec5-c03d0b208cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac850de8-4212-4c78-bec5-c03d0b208cf7
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-aa43d7b0","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}

--- response: 200 in 26 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"d0-x5mrY6KV6bFbGqWxEJk5PnqZC1w"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4453,"booking":{"firstname":"Linus","lastname":"Guest-aa43d7b0","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/4453
correlation: qa-4d06b5c7-31ec-4361-be7b-7a67e6ca273d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-4d06b5c7-31ec-4361-be7b-7a67e6ca273d
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 37 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:22 GMT
Etag: W/"b3-cJAQtQIBha4kVM82ckTkN0jX3yI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=E5i61Kw4ygJi2WoD1SLNgxwICEHNGq9dw0isj3jKY2I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084162"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=E5i61Kw4ygJi2WoD1SLNgxwICEHNGq9dw0isj3jKY2I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084162"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-aa43d7b0","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4453
correlation: qa-cd5f02f3-7ccc-4793-a3d9-ed3ed3ede230

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-cd5f02f3-7ccc-4793-a3d9-ed3ed3ede230
Content-Type: application/json

--- response: 201 in 26 ms ---
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
#4 GET https://restful-booker.herokuapp.com/booking/4453
correlation: qa-9ca6dd94-c94a-4b8b-9eab-e5c5d90919f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ca6dd94-c94a-4b8b-9eab-e5c5d90919f0
Content-Type: application/json

--- response: 404 in 24 ms ---
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
