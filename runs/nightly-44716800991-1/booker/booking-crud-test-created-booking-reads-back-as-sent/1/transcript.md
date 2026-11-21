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
| 1 | `POST /booking` | 200 | 114 | `qa-8548981d-8f24-49c6-b635-e76ea1023baf` |
| 2 | `GET /booking/{id}` | 200 | 109 | `qa-9d09c925-a43b-464c-9893-0d1a976cc1fd` |
| 3 | `POST /auth` | 200 | 102 | `qa-3e9050f4-bec5-4154-895b-0feba820507f` |
| 4 | `DELETE /booking/{id}` | 201 | 101 | `qa-7e4e33b5-2a99-4017-a539-e11ee1f039e0` |
| 5 | `GET /booking/{id}` | 404 | 93 | `qa-e5499434-33b1-4b99-8869-9092698c2737` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-8548981d-8f24-49c6-b635-e76ea1023baf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8548981d-8f24-49c6-b635-e76ea1023baf
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-ee09fb44","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Late check-in"}

--- response: 200 in 114 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:09:59 GMT
Etag: W/"d2-7bIJtcjHnOkR6LrMHmCljlcMgzo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169399"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169399"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4499,"booking":{"firstname":"Ada","lastname":"Guest-ee09fb44","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/4499
correlation: qa-9d09c925-a43b-464c-9893-0d1a976cc1fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d09c925-a43b-464c-9893-0d1a976cc1fd
Content-Type: application/json

--- response: 200 in 109 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:09:59 GMT
Etag: W/"b5-oNBIk/IBGk62OjGAgkHAghg8gpk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169399"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169399"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-ee09fb44","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-3e9050f4-bec5-4154-895b-0feba820507f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e9050f4-bec5-4154-895b-0feba820507f
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 102 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"1b-aE6iibXMVpNP+tO4um+aob2k8Fg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4499
correlation: qa-7e4e33b5-2a99-4017-a539-e11ee1f039e0

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-7e4e33b5-2a99-4017-a539-e11ee1f039e0
Content-Type: application/json

--- response: 201 in 101 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4499
correlation: qa-e5499434-33b1-4b99-8869-9092698c2737

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5499434-33b1-4b99-8869-9092698c2737
Content-Type: application/json

--- response: 404 in 93 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
