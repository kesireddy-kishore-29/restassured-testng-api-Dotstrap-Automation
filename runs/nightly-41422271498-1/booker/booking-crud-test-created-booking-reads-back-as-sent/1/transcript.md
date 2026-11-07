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
| 1 | `POST /booking` | 200 | 104 | `qa-f7306570-f0bb-4e61-ab79-542b0c806e73` |
| 2 | `GET /booking/{id}` | 200 | 114 | `qa-e5be3e4a-edba-42f0-a470-9aaa366c6bf2` |
| 3 | `POST /auth` | 200 | 92 | `qa-d92aaa5a-6658-48bc-b140-dea129dca041` |
| 4 | `DELETE /booking/{id}` | 201 | 105 | `qa-03e9d7ae-1bf4-4311-90b3-355a05d37647` |
| 5 | `GET /booking/{id}` | 404 | 90 | `qa-9c0d8a6b-43fb-4f0b-9fbd-93c9f0611422` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f7306570-f0bb-4e61-ab79-542b0c806e73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7306570-f0bb-4e61-ab79-542b0c806e73
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-7cd5ec1d","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Late check-in"}

--- response: 200 in 104 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:36 GMT
Etag: W/"d2-UYBtr71snk8cqVxy3NMgAQK9HJE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612316"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612316"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4151,"booking":{"firstname":"Ada","lastname":"Guest-7cd5ec1d","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/4151
correlation: qa-e5be3e4a-edba-42f0-a470-9aaa366c6bf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5be3e4a-edba-42f0-a470-9aaa366c6bf2
Content-Type: application/json

--- response: 200 in 114 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:36 GMT
Etag: W/"b5-37mlkCGK8aMsFueNrEKxoL78gug"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612316"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612316"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-7cd5ec1d","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-d92aaa5a-6658-48bc-b140-dea129dca041

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d92aaa5a-6658-48bc-b140-dea129dca041
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 92 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:36 GMT
Etag: W/"1b-ryrBjemdzIGrnJj027NPce1DVhg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612316"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612316"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4151
correlation: qa-03e9d7ae-1bf4-4311-90b3-355a05d37647

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-03e9d7ae-1bf4-4311-90b3-355a05d37647
Content-Type: application/json

--- response: 201 in 105 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:36 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612316"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612316"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4151
correlation: qa-9c0d8a6b-43fb-4f0b-9fbd-93c9f0611422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c0d8a6b-43fb-4f0b-9fbd-93c9f0611422
Content-Type: application/json

--- response: 404 in 90 ms ---
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
