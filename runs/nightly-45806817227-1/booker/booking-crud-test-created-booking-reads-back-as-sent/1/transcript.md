# Transcript: A created booking reads back exactly as sent

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#createdBookingReadsBackAsSent` |
| Features | FEAT-BOOK-01, FEAT-BOOK-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 99 | `qa-3fbd8686-9f5a-4700-ad85-aebc645d3932` |
| 2 | `GET /booking/{id}` | 200 | 100 | `qa-a7f00973-3619-495c-8b86-aa2051d2778e` |
| 3 | `POST /auth` | 200 | 97 | `qa-309c47ac-d208-4a5e-92a0-5ba8324d9098` |
| 4 | `DELETE /booking/{id}` | 201 | 114 | `qa-307659eb-3c3b-49d3-bb61-9c12a8d75771` |
| 5 | `GET /booking/{id}` | 404 | 98 | `qa-66f14e24-a3e9-4ba4-bb19-b73ae14d9e95` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-3fbd8686-9f5a-4700-ad85-aebc645d3932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fbd8686-9f5a-4700-ad85-aebc645d3932
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-38470510","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Late check-in"}

--- response: 200 in 99 ms ---
Content-Length: 209
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:34 GMT
Etag: W/"d1-c9E+IOrSZV/2S+HFiqa5j/OsHoQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690954"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690954"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":646,"booking":{"firstname":"Ada","lastname":"Guest-38470510","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/646
correlation: qa-a7f00973-3619-495c-8b86-aa2051d2778e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7f00973-3619-495c-8b86-aa2051d2778e
Content-Type: application/json

--- response: 200 in 100 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:34 GMT
Etag: W/"b5-QMtPeDlhv8CjFdhsq1HYlvOJ0/Q"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690954"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690954"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-38470510","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-309c47ac-d208-4a5e-92a0-5ba8324d9098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-309c47ac-d208-4a5e-92a0-5ba8324d9098
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 97 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:34 GMT
Etag: W/"1b-nJXjXdEI3qxFiRG2BlGzaH3czq4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690954"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690954"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/646
correlation: qa-307659eb-3c3b-49d3-bb61-9c12a8d75771

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-307659eb-3c3b-49d3-bb61-9c12a8d75771
Content-Type: application/json

--- response: 201 in 114 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/646
correlation: qa-66f14e24-a3e9-4ba4-bb19-b73ae14d9e95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66f14e24-a3e9-4ba4-bb19-b73ae14d9e95
Content-Type: application/json

--- response: 404 in 98 ms ---
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
