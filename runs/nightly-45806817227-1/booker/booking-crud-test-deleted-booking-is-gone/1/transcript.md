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
| 1 | `POST /booking` | 200 | 102 | `qa-88e42111-7dd5-4eb3-972f-cd7c2245fe36` |
| 2 | `DELETE /booking/{id}` | 201 | 94 | `qa-7da9c52e-48c6-429c-8a3c-cfa0484c1ff6` |
| 3 | `GET /booking/{id}` | 404 | 97 | `qa-215d74ef-8a70-4965-9c81-62b8c8b6edfa` |
| 4 | `GET /booking/{id}` | 404 | 107 | `qa-c4172d83-62d4-4dcf-9b69-a64efe70446f` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-88e42111-7dd5-4eb3-972f-cd7c2245fe36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88e42111-7dd5-4eb3-972f-cd7c2245fe36
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-ffb7655c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 102 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"cc-S0Rp0E6mJPZQEdoVI81/NKIeB+E"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":656,"booking":{"firstname":"QA","lastname":"Guest-ffb7655c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/656
correlation: qa-7da9c52e-48c6-429c-8a3c-cfa0484c1ff6

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-7da9c52e-48c6-429c-8a3c-cfa0484c1ff6
Content-Type: application/json

--- response: 201 in 94 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/656
correlation: qa-215d74ef-8a70-4965-9c81-62b8c8b6edfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-215d74ef-8a70-4965-9c81-62b8c8b6edfa
Content-Type: application/json

--- response: 404 in 97 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/656
correlation: qa-c4172d83-62d4-4dcf-9b69-a64efe70446f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4172d83-62d4-4dcf-9b69-a64efe70446f
Content-Type: application/json

--- response: 404 in 107 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
