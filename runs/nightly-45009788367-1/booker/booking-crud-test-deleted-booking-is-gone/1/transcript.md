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
| 1 | `POST /booking` | 200 | 255 | `qa-d661cb6d-01c0-422a-972b-483d56ef7fa5` |
| 2 | `DELETE /booking/{id}` | 201 | 255 | `qa-080aa7b2-dfdb-4a23-b709-e5cadd56536b` |
| 3 | `GET /booking/{id}` | 404 | 243 | `qa-b75a2202-d657-472e-ab46-79f6ddee1ac1` |
| 4 | `GET /booking/{id}` | 404 | 258 | `qa-0173318a-57a4-4a7b-9135-c40618d8e4b5` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d661cb6d-01c0-422a-972b-483d56ef7fa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d661cb6d-01c0-422a-972b-483d56ef7fa5
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-08f831f4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 255 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:55 GMT
Etag: W/"cd-7tfFlMeFpIdRgC1w8jE8WGg0p78"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2141,"booking":{"firstname":"QA","lastname":"Guest-08f831f4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/2141
correlation: qa-080aa7b2-dfdb-4a23-b709-e5cadd56536b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-080aa7b2-dfdb-4a23-b709-e5cadd56536b
Content-Type: application/json

--- response: 201 in 255 ms ---
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

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2141
correlation: qa-b75a2202-d657-472e-ab46-79f6ddee1ac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b75a2202-d657-472e-ab46-79f6ddee1ac1
Content-Type: application/json

--- response: 404 in 243 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2141
correlation: qa-0173318a-57a4-4a7b-9135-c40618d8e4b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0173318a-57a4-4a7b-9135-c40618d8e4b5
Content-Type: application/json

--- response: 404 in 258 ms ---
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
