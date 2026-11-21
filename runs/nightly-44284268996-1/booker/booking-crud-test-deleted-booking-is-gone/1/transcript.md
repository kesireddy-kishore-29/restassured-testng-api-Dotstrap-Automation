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
| 1 | `POST /booking` | 200 | 288 | `qa-61d74d00-54e8-4d46-9fc1-956aea528cb7` |
| 2 | `DELETE /booking/{id}` | 201 | 288 | `qa-c8d6b8f7-dc62-472d-bc36-38ba40f9d2ce` |
| 3 | `GET /booking/{id}` | 404 | 291 | `qa-a0883f48-4ffd-4463-8aa6-6a876cc8301d` |
| 4 | `GET /booking/{id}` | 404 | 288 | `qa-0dc5d46e-d8ed-4802-bf3f-c442ca209085` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-61d74d00-54e8-4d46-9fc1-956aea528cb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61d74d00-54e8-4d46-9fc1-956aea528cb7
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-0ab5e8ff","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}

--- response: 200 in 288 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:56 GMT
Etag: W/"cd-/KkWGGY7iDLoL4W1iLleCD4AQdU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997196"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997196"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4700,"booking":{"firstname":"QA","lastname":"Guest-0ab5e8ff","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/4700
correlation: qa-c8d6b8f7-dc62-472d-bc36-38ba40f9d2ce

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c8d6b8f7-dc62-472d-bc36-38ba40f9d2ce
Content-Type: application/json

--- response: 201 in 288 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:56 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997196"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997196"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4700
correlation: qa-a0883f48-4ffd-4463-8aa6-6a876cc8301d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0883f48-4ffd-4463-8aa6-6a876cc8301d
Content-Type: application/json

--- response: 404 in 291 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:56 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997196"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997196"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4700
correlation: qa-0dc5d46e-d8ed-4802-bf3f-c442ca209085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dc5d46e-d8ed-4802-bf3f-c442ca209085
Content-Type: application/json

--- response: 404 in 288 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997197"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997197"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
