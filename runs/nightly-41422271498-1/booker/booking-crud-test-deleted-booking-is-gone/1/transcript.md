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
| 1 | `POST /booking` | 200 | 109 | `qa-8fed8419-1b73-4d88-b313-6f7d1724fdf4` |
| 2 | `DELETE /booking/{id}` | 201 | 112 | `qa-9d86673f-e5db-4d99-8ea7-02a15dc819aa` |
| 3 | `GET /booking/{id}` | 404 | 105 | `qa-c16827e3-61fa-4852-967b-2a77b45700c1` |
| 4 | `GET /booking/{id}` | 404 | 96 | `qa-7ef79048-fde7-40f9-87f0-f2757c650ba8` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-8fed8419-1b73-4d88-b313-6f7d1724fdf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fed8419-1b73-4d88-b313-6f7d1724fdf4
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-80802f0a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}

--- response: 200 in 109 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"cd-CfZcJxfe1Y+yviSLeFN7tJ1QUP8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4159,"booking":{"firstname":"QA","lastname":"Guest-80802f0a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/4159
correlation: qa-9d86673f-e5db-4d99-8ea7-02a15dc819aa

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-9d86673f-e5db-4d99-8ea7-02a15dc819aa
Content-Type: application/json

--- response: 201 in 112 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4159
correlation: qa-c16827e3-61fa-4852-967b-2a77b45700c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c16827e3-61fa-4852-967b-2a77b45700c1
Content-Type: application/json

--- response: 404 in 105 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4159
correlation: qa-7ef79048-fde7-40f9-87f0-f2757c650ba8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ef79048-fde7-40f9-87f0-f2757c650ba8
Content-Type: application/json

--- response: 404 in 96 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
