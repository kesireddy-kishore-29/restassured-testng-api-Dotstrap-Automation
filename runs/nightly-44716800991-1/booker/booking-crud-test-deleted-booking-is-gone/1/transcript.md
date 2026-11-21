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
| 1 | `POST /booking` | 200 | 101 | `qa-82526677-53a7-4372-9f74-300636283b95` |
| 2 | `DELETE /booking/{id}` | 201 | 110 | `qa-66270785-dbc8-4feb-806d-accf48f6e6db` |
| 3 | `GET /booking/{id}` | 404 | 93 | `qa-c7f3d9c9-d899-465e-9596-66f9ea0be50e` |
| 4 | `GET /booking/{id}` | 404 | 102 | `qa-15e844ed-8572-4b0c-9c53-060693f2e10e` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-82526677-53a7-4372-9f74-300636283b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82526677-53a7-4372-9f74-300636283b95
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-c5ec1cb1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}

--- response: 200 in 101 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"cd-QwtXfZx6VnrbO1GYEQUAmUg3pf4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4506,"booking":{"firstname":"QA","lastname":"Guest-c5ec1cb1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/4506
correlation: qa-66270785-dbc8-4feb-806d-accf48f6e6db

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-66270785-dbc8-4feb-806d-accf48f6e6db
Content-Type: application/json

--- response: 201 in 110 ms ---
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

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4506
correlation: qa-c7f3d9c9-d899-465e-9596-66f9ea0be50e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7f3d9c9-d899-465e-9596-66f9ea0be50e
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4506
correlation: qa-15e844ed-8572-4b0c-9c53-060693f2e10e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15e844ed-8572-4b0c-9c53-060693f2e10e
Content-Type: application/json

--- response: 404 in 102 ms ---
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
