# Transcript: A deleted booking is gone (404 on read)

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#deletedBookingIsGone` |
| Features | FEAT-BOOK-04 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 39 | `qa-e60f0e73-5f88-4ab9-bdf5-ef22cdc51171` |
| 2 | `DELETE /booking/{id}` | 201 | 36 | `qa-ea298898-0778-4b30-8eca-2150a6f2646d` |
| 3 | `GET /booking/{id}` | 404 | 38 | `qa-a1df69f3-d6b5-4b27-b8f6-18ca96d1c90b` |
| 4 | `GET /booking/{id}` | 404 | 40 | `qa-9a1db322-13bd-46a1-8d69-dc2dbe192e1b` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-e60f0e73-5f88-4ab9-bdf5-ef22cdc51171

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e60f0e73-5f88-4ab9-bdf5-ef22cdc51171
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-d9bfc95f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}

--- response: 200 in 39 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"cd-W81gHTVJO/WCwObzciFm+63iTk4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5041,"booking":{"firstname":"QA","lastname":"Guest-d9bfc95f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/5041
correlation: qa-ea298898-0778-4b30-8eca-2150a6f2646d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-ea298898-0778-4b30-8eca-2150a6f2646d
Content-Type: application/json

--- response: 201 in 36 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5041
correlation: qa-a1df69f3-d6b5-4b27-b8f6-18ca96d1c90b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1df69f3-d6b5-4b27-b8f6-18ca96d1c90b
Content-Type: application/json

--- response: 404 in 38 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5041
correlation: qa-9a1db322-13bd-46a1-8d69-dc2dbe192e1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a1db322-13bd-46a1-8d69-dc2dbe192e1b
Content-Type: application/json

--- response: 404 in 40 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
