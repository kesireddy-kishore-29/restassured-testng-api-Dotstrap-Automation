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
| 1 | `POST /booking` | 200 | 196 | `qa-4c1c9a84-1a2d-49e3-aeea-438522b781a8` |
| 2 | `PUT /booking/{id}` | 200 | 204 | `qa-df7bef6c-62a7-4487-9c78-ceb5d6600632` |
| 3 | `DELETE /booking/{id}` | 201 | 201 | `qa-1b2ff950-687b-4ac4-a625-aa765cb319ab` |
| 4 | `GET /booking/{id}` | 404 | 200 | `qa-ef3d08f8-1184-46a8-80a6-1c061db33800` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-4c1c9a84-1a2d-49e3-aeea-438522b781a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c1c9a84-1a2d-49e3-aeea-438522b781a8
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-fe054b68","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 196 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:35 GMT
Etag: W/"cc-QseVOt2RsLJUBBHn0rS46RZvBwo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":327,"booking":{"firstname":"QA","lastname":"Guest-fe054b68","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/327
correlation: qa-df7bef6c-62a7-4487-9c78-ceb5d6600632

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-df7bef6c-62a7-4487-9c78-ceb5d6600632
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-e6462df4","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 204 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:35 GMT
Etag: W/"b3-uUB9iHoLiskfsVKQmw+R/QvkJ8Y"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-e6462df4","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/327
correlation: qa-1b2ff950-687b-4ac4-a625-aa765cb319ab

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1b2ff950-687b-4ac4-a625-aa765cb319ab
Content-Type: application/json

--- response: 201 in 201 ms ---
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
#4 GET https://restful-booker.herokuapp.com/booking/327
correlation: qa-ef3d08f8-1184-46a8-80a6-1c061db33800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef3d08f8-1184-46a8-80a6-1c061db33800
Content-Type: application/json

--- response: 404 in 200 ms ---
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
