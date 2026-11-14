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
| 1 | `POST /booking` | 200 | 100 | `qa-64e37cbd-f47d-4061-b12a-26e973bd75bf` |
| 2 | `PUT /booking/{id}` | 200 | 90 | `qa-1ea84736-4b31-4362-a08c-b271b0b2e1a6` |
| 3 | `DELETE /booking/{id}` | 201 | 122 | `qa-3d51a09a-c56a-4e85-a014-f4e3caf00d0f` |
| 4 | `GET /booking/{id}` | 404 | 107 | `qa-3e139316-4a81-4b5e-9a76-c3097542d94c` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-64e37cbd-f47d-4061-b12a-26e973bd75bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64e37cbd-f47d-4061-b12a-26e973bd75bf
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-64888084","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}

--- response: 200 in 100 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:58 GMT
Etag: W/"cd-ISc1jZoKc/rvGBvO8VfzkSJjRQw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871478"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871478"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3889,"booking":{"firstname":"QA","lastname":"Guest-64888084","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3889
correlation: qa-1ea84736-4b31-4362-a08c-b271b0b2e1a6

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1ea84736-4b31-4362-a08c-b271b0b2e1a6
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-738f45a0","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}

--- response: 200 in 90 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:58 GMT
Etag: W/"b3-ei0sZXmB2n0+TmaVw/02fGt8JVY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871478"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871478"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-738f45a0","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3889
correlation: qa-3d51a09a-c56a-4e85-a014-f4e3caf00d0f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-3d51a09a-c56a-4e85-a014-f4e3caf00d0f
Content-Type: application/json

--- response: 201 in 122 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:58 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871478"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871478"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3889
correlation: qa-3e139316-4a81-4b5e-9a76-c3097542d94c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e139316-4a81-4b5e-9a76-c3097542d94c
Content-Type: application/json

--- response: 404 in 107 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:58 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871478"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871478"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
