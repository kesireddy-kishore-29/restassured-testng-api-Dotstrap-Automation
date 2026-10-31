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
| 1 | `POST /booking` | 200 | 196 | `qa-18a67461-4590-43db-b000-5fcc0521f7b2` |
| 2 | `PATCH /booking/{id}` | 200 | 198 | `qa-1a354510-ceb3-44e9-a201-cd1d04ea22a5` |
| 3 | `DELETE /booking/{id}` | 201 | 197 | `qa-0936e9fc-7f0b-4cf6-8159-841948260ef2` |
| 4 | `GET /booking/{id}` | 404 | 196 | `qa-40a4f42f-acf9-4c6a-83c4-c8515fcc2652` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-18a67461-4590-43db-b000-5fcc0521f7b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18a67461-4590-43db-b000-5fcc0521f7b2
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-f4bc9919","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 196 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:35 GMT
Etag: W/"cf-JA4JqM7x9smIwNQqVi7YLLjWZuA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":328,"booking":{"firstname":"Linus","lastname":"Guest-f4bc9919","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/328
correlation: qa-1a354510-ceb3-44e9-a201-cd1d04ea22a5

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1a354510-ceb3-44e9-a201-cd1d04ea22a5
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 198 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:35 GMT
Etag: W/"b3-wnd7V8uRPZVCpGPopVw64ugRX9M"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-f4bc9919","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/328
correlation: qa-0936e9fc-7f0b-4cf6-8159-841948260ef2

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0936e9fc-7f0b-4cf6-8159-841948260ef2
Content-Type: application/json

--- response: 201 in 197 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:35 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/328
correlation: qa-40a4f42f-acf9-4c6a-83c4-c8515fcc2652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40a4f42f-acf9-4c6a-83c4-c8515fcc2652
Content-Type: application/json

--- response: 404 in 196 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:35 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
