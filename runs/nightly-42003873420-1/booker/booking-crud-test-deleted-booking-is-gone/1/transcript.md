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
| 1 | `POST /booking` | 200 | 106 | `qa-5e5cdf3a-11a4-4b82-9fcb-f7157a021b2c` |
| 2 | `DELETE /booking/{id}` | 201 | 112 | `qa-83badd84-0b84-42a8-9e9a-15c2ac66c063` |
| 3 | `GET /booking/{id}` | 404 | 97 | `qa-f9c36823-267e-4af1-8778-5705055be1df` |
| 4 | `GET /booking/{id}` | 404 | 106 | `qa-242b4040-e263-4802-ae15-fa779ba784ef` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-5e5cdf3a-11a4-4b82-9fcb-f7157a021b2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e5cdf3a-11a4-4b82-9fcb-f7157a021b2c
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-923fb232","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}

--- response: 200 in 106 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"cd-fF2hHrhQY+BaxGVWBpAiGDlfjAI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3885,"booking":{"firstname":"QA","lastname":"Guest-923fb232","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/3885
correlation: qa-83badd84-0b84-42a8-9e9a-15c2ac66c063

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-83badd84-0b84-42a8-9e9a-15c2ac66c063
Content-Type: application/json

--- response: 201 in 112 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3885
correlation: qa-f9c36823-267e-4af1-8778-5705055be1df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9c36823-267e-4af1-8778-5705055be1df
Content-Type: application/json

--- response: 404 in 97 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871477"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=w5TP2CHS%2B6IlASwyDD7tDuClcZG5e9vXjv3yV413qM0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871477"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3885
correlation: qa-242b4040-e263-4802-ae15-fa779ba784ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-242b4040-e263-4802-ae15-fa779ba784ef
Content-Type: application/json

--- response: 404 in 106 ms ---
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
