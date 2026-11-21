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
| 1 | `POST /booking` | 200 | 17 | `qa-ae24dcf6-50a2-44c5-9336-3347b1e58174` |
| 2 | `DELETE /booking/{id}` | 201 | 20 | `qa-b5e9a0f4-c2c0-4974-a78e-4af2976e9da0` |
| 3 | `GET /booking/{id}` | 404 | 20 | `qa-35c89232-fbad-4655-bf67-ed2538be5364` |
| 4 | `GET /booking/{id}` | 404 | 18 | `qa-102fe9f6-c2cf-4c56-9226-0251b037a947` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-ae24dcf6-50a2-44c5-9336-3347b1e58174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae24dcf6-50a2-44c5-9336-3347b1e58174
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-eff90a85","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}

--- response: 200 in 17 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"cd-VzwwUdb6ExJkzPdvCRHouK5LLVc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3167,"booking":{"firstname":"QA","lastname":"Guest-eff90a85","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/3167
correlation: qa-b5e9a0f4-c2c0-4974-a78e-4af2976e9da0

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b5e9a0f4-c2c0-4974-a78e-4af2976e9da0
Content-Type: application/json

--- response: 201 in 20 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3167
correlation: qa-35c89232-fbad-4655-bf67-ed2538be5364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c89232-fbad-4655-bf67-ed2538be5364
Content-Type: application/json

--- response: 404 in 20 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3167
correlation: qa-102fe9f6-c2cf-4c56-9226-0251b037a947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-102fe9f6-c2cf-4c56-9226-0251b037a947
Content-Type: application/json

--- response: 404 in 18 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
