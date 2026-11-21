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
| 1 | `POST /booking` | 200 | 28 | `qa-f1266978-f2c9-471a-9f3b-780a7130e464` |
| 2 | `PUT /booking/{id}` | 200 | 32 | `qa-a08ffade-fc40-48a6-8b46-be5f28994ffc` |
| 3 | `DELETE /booking/{id}` | 201 | 27 | `qa-18e96ea9-19a0-4576-b0da-ecbb3983b4b5` |
| 4 | `GET /booking/{id}` | 404 | 28 | `qa-3e3b4b73-2007-4317-8888-35ecdf91415e` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f1266978-f2c9-471a-9f3b-780a7130e464

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1266978-f2c9-471a-9f3b-780a7130e464
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-79d148a0","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}

--- response: 200 in 28 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"cd-6z8zHNo6vTvHFfCpEG4DHpUSFy8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2812,"booking":{"firstname":"QA","lastname":"Guest-79d148a0","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2812
correlation: qa-a08ffade-fc40-48a6-8b46-be5f28994ffc

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a08ffade-fc40-48a6-8b46-be5f28994ffc
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-304c5814","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}

--- response: 200 in 32 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"b3-Df0GxR2ZvfmCnhMCYncN+aPEy64"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-304c5814","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2812
correlation: qa-18e96ea9-19a0-4576-b0da-ecbb3983b4b5

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-18e96ea9-19a0-4576-b0da-ecbb3983b4b5
Content-Type: application/json

--- response: 201 in 27 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2812
correlation: qa-3e3b4b73-2007-4317-8888-35ecdf91415e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e3b4b73-2007-4317-8888-35ecdf91415e
Content-Type: application/json

--- response: 404 in 28 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
