# Transcript: A deleted booking is gone (404 on read)

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#deletedBookingIsGone` |
| Features | FEAT-BOOK-04 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 854 | `qa-f0987727-e4e2-4b4b-80ed-5a4cf75f8e2a` |
| 2 | `POST /auth` | 200 | 208 | `qa-e985a51f-4551-4a57-afd7-ba7b584e5b2c` |
| 3 | `DELETE /booking/{id}` | 201 | 212 | `qa-3ee84418-c90f-419b-b4da-b712a3b71349` |
| 4 | `GET /booking/{id}` | 404 | 199 | `qa-171e112f-e3ca-48dc-8bfa-c7ab0f7f7466` |
| 5 | `GET /booking/{id}` | 404 | 201 | `qa-5bed2e8a-a0be-40ad-ac3a-82265e94bc13` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f0987727-e4e2-4b4b-80ed-5a4cf75f8e2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0987727-e4e2-4b4b-80ed-5a4cf75f8e2a
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-1b221616","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 854 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:27 GMT
Etag: W/"cd-88blPl58itCgpM1T/H5wHSdWigA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nynmSVWxX4MWeZBrCh%2BByhn3iA6yoi4uIS3Om3pUr%2F4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914027"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nynmSVWxX4MWeZBrCh%2BByhn3iA6yoi4uIS3Om3pUr%2F4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914027"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5072,"booking":{"firstname":"QA","lastname":"Guest-1b221616","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}}
```

## 2. POST /auth

```text
#2 POST https://restful-booker.herokuapp.com/auth
correlation: qa-e985a51f-4551-4a57-afd7-ba7b584e5b2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e985a51f-4551-4a57-afd7-ba7b584e5b2c
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 208 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:28 GMT
Etag: W/"1b-7N46n79nSka5wwkd8YCyUSOl8W4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5072
correlation: qa-3ee84418-c90f-419b-b4da-b712a3b71349

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-3ee84418-c90f-419b-b4da-b712a3b71349
Content-Type: application/json

--- response: 201 in 212 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:28 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5072
correlation: qa-171e112f-e3ca-48dc-8bfa-c7ab0f7f7466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-171e112f-e3ca-48dc-8bfa-c7ab0f7f7466
Content-Type: application/json

--- response: 404 in 199 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:28 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5072
correlation: qa-5bed2e8a-a0be-40ad-ac3a-82265e94bc13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bed2e8a-a0be-40ad-ac3a-82265e94bc13
Content-Type: application/json

--- response: 404 in 201 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:28 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=37MFguRKlQYmagx1%2Bv2MGvGQeTqWAIhNPMYE5eBkb10%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
