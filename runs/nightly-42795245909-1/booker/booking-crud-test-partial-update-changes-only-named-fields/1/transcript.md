# Transcript: A partial update changes only the named fields

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#partialUpdateChangesOnlyNamedFields` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 25 | `qa-3519c477-4c41-4cee-a153-2326f909845d` |
| 2 | `PATCH /booking/{id}` | 200 | 23 | `qa-78f27e95-9234-497c-8647-af267c5c4785` |
| 3 | `DELETE /booking/{id}` | 201 | 21 | `qa-e771301b-f0b4-476a-9378-636f513beb40` |
| 4 | `GET /booking/{id}` | 404 | 19 | `qa-30a708e2-89e4-4e0d-a7c9-098e06a3b188` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-3519c477-4c41-4cee-a153-2326f909845d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3519c477-4c41-4cee-a153-2326f909845d
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-4dda27d1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}

--- response: 200 in 25 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"d0-8Hz3d7LVRC5Exa+zG/nu8z2OXwM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4623,"booking":{"firstname":"Linus","lastname":"Guest-4dda27d1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/4623
correlation: qa-78f27e95-9234-497c-8647-af267c5c4785

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-78f27e95-9234-497c-8647-af267c5c4785
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 23 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:37 GMT
Etag: W/"b3-67gbjdb/xpHD4qYfd1ehXhszo+c"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304777"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=kvC0mOLdggv5eA0a%2BUQ6dwjUcoMj3FG%2Fz2ogUx27eCM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304777"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-4dda27d1","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-10","checkout":"2026-12-13"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4623
correlation: qa-e771301b-f0b4-476a-9378-636f513beb40

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e771301b-f0b4-476a-9378-636f513beb40
Content-Type: application/json

--- response: 201 in 21 ms ---
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
#4 GET https://restful-booker.herokuapp.com/booking/4623
correlation: qa-30a708e2-89e4-4e0d-a7c9-098e06a3b188

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30a708e2-89e4-4e0d-a7c9-098e06a3b188
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
