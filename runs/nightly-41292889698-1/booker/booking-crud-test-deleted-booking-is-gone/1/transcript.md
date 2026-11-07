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
| 1 | `POST /booking` | 200 | 263 | `qa-013b8da4-f01e-45ac-8f27-c41cdac991dc` |
| 2 | `DELETE /booking/{id}` | 201 | 272 | `qa-0ec093f5-d13c-4619-88ce-590263cdb718` |
| 3 | `GET /booking/{id}` | 404 | 257 | `qa-9da53534-0301-4a67-9928-b65b2e217c81` |
| 4 | `GET /booking/{id}` | 404 | 141 | `qa-9a28fcf9-c903-48d0-b804-89b33600a043` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-013b8da4-f01e-45ac-8f27-c41cdac991dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-013b8da4-f01e-45ac-8f27-c41cdac991dc
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-e9c9bd3e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}

--- response: 200 in 263 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:28 GMT
Etag: W/"cd-HKYatZ+u+WGDiN6oMslWLA1KlhA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525008"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525008"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1368,"booking":{"firstname":"QA","lastname":"Guest-e9c9bd3e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/1368
correlation: qa-0ec093f5-d13c-4619-88ce-590263cdb718

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0ec093f5-d13c-4619-88ce-590263cdb718
Content-Type: application/json

--- response: 201 in 272 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:28 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525008"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525008"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1368
correlation: qa-9da53534-0301-4a67-9928-b65b2e217c81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9da53534-0301-4a67-9928-b65b2e217c81
Content-Type: application/json

--- response: 404 in 257 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:29 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525009"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525009"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1368
correlation: qa-9a28fcf9-c903-48d0-b804-89b33600a043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a28fcf9-c903-48d0-b804-89b33600a043
Content-Type: application/json

--- response: 404 in 141 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:29 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525009"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525009"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
