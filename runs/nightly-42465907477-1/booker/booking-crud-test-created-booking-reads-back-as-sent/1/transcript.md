# Transcript: A created booking reads back exactly as sent

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#createdBookingReadsBackAsSent` |
| Features | FEAT-BOOK-01, FEAT-BOOK-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 28 | `qa-47b5606a-c563-4318-b5a8-33ee8f488083` |
| 2 | `GET /booking/{id}` | 200 | 30 | `qa-e5d1d034-8874-4205-9bb3-34004fe07ddf` |
| 3 | `POST /auth` | 200 | 25 | `qa-eea4af39-db44-492f-a0cf-1e6e6d4c5c8d` |
| 4 | `DELETE /booking/{id}` | 201 | 33 | `qa-5d8a4cbc-6634-4fab-86fc-f76540ca2ada` |
| 5 | `GET /booking/{id}` | 404 | 27 | `qa-1307e892-17a6-4f77-8675-41223ca5ca46` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-47b5606a-c563-4318-b5a8-33ee8f488083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47b5606a-c563-4318-b5a8-33ee8f488083
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-02751c12","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Late check-in"}

--- response: 200 in 28 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"d2-3pSbB+/DfFKJk1AXCwkU2fsZdt0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3952,"booking":{"firstname":"Ada","lastname":"Guest-02751c12","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/3952
correlation: qa-e5d1d034-8874-4205-9bb3-34004fe07ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5d1d034-8874-4205-9bb3-34004fe07ddf
Content-Type: application/json

--- response: 200 in 30 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"b5-YuFrghth2xrD3sBwn9Yo251kBDA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-02751c12","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-eea4af39-db44-492f-a0cf-1e6e6d4c5c8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eea4af39-db44-492f-a0cf-1e6e6d4c5c8d
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 25 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"1b-uttth3MvzzXRUdwsCLXnXGh8N7c"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3952
correlation: qa-5d8a4cbc-6634-4fab-86fc-f76540ca2ada

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5d8a4cbc-6634-4fab-86fc-f76540ca2ada
Content-Type: application/json

--- response: 201 in 33 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3952
correlation: qa-1307e892-17a6-4f77-8675-41223ca5ca46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1307e892-17a6-4f77-8675-41223ca5ca46
Content-Type: application/json

--- response: 404 in 27 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
