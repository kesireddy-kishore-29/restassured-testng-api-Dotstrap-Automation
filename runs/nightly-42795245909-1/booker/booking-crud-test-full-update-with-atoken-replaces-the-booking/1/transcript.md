# Transcript: A full update with a token replaces the booking

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#fullUpdateWithATokenReplacesTheBooking` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 22 | `qa-b921e534-08a1-4aca-98cb-9921d8250779` |
| 2 | `PUT /booking/{id}` | 200 | 24 | `qa-bd2a2fe7-0b2c-4895-8576-e0de9aac2031` |
| 3 | `DELETE /booking/{id}` | 201 | 19 | `qa-931ff92b-b941-47d9-bb42-508d6c65ee6e` |
| 4 | `GET /booking/{id}` | 404 | 19 | `qa-8f8defdd-3917-4377-b285-73408f54065a` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-b921e534-08a1-4aca-98cb-9921d8250779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b921e534-08a1-4aca-98cb-9921d8250779
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-4ff62736","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}

--- response: 200 in 22 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"cd-N0CwKkDbKT/KavLzugIvc/W2o6o"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4621,"booking":{"firstname":"QA","lastname":"Guest-4ff62736","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4621
correlation: qa-bd2a2fe7-0b2c-4895-8576-e0de9aac2031

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-bd2a2fe7-0b2c-4895-8576-e0de9aac2031
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-66bb27a0","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}

--- response: 200 in 24 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"b3-64oqIEszyrQh7UOMwEDDgkbvgNg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-66bb27a0","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4621
correlation: qa-931ff92b-b941-47d9-bb42-508d6c65ee6e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-931ff92b-b941-47d9-bb42-508d6c65ee6e
Content-Type: application/json

--- response: 201 in 19 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4621
correlation: qa-8f8defdd-3917-4377-b285-73408f54065a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f8defdd-3917-4377-b285-73408f54065a
Content-Type: application/json

--- response: 404 in 19 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
