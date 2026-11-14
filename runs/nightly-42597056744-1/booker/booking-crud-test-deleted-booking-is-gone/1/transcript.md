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
| 1 | `POST /booking` | 200 | 262 | `qa-0e76ecf1-5047-4d54-b64d-4f3332a6a88d` |
| 2 | `DELETE /booking/{id}` | 201 | 218 | `qa-7c782310-d3aa-443e-a179-239f7d29b07c` |
| 3 | `GET /booking/{id}` | 404 | 238 | `qa-0a52a499-3043-444a-8e15-37f1cdff3073` |
| 4 | `GET /booking/{id}` | 404 | 239 | `qa-ad5031bc-3590-4956-b8f9-ecfd1008e59f` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-0e76ecf1-5047-4d54-b64d-4f3332a6a88d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e76ecf1-5047-4d54-b64d-4f3332a6a88d
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-2fa3dc41","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}

--- response: 200 in 262 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:55 GMT
Etag: W/"cd-Z0VhlK7L6jnwEp7CM0qewJ3LXkM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218155"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218155"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2618,"booking":{"firstname":"QA","lastname":"Guest-2fa3dc41","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/2618
correlation: qa-7c782310-d3aa-443e-a179-239f7d29b07c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-7c782310-d3aa-443e-a179-239f7d29b07c
Content-Type: application/json

--- response: 201 in 218 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:55 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218155"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218155"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2618
correlation: qa-0a52a499-3043-444a-8e15-37f1cdff3073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a52a499-3043-444a-8e15-37f1cdff3073
Content-Type: application/json

--- response: 404 in 238 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:55 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218155"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ceqzIwnUmUBMuL1CJUwN2dJqqbb2cWv0rVV9O4zNM20%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218155"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2618
correlation: qa-ad5031bc-3590-4956-b8f9-ecfd1008e59f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad5031bc-3590-4956-b8f9-ecfd1008e59f
Content-Type: application/json

--- response: 404 in 239 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:56 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218156"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218156"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
