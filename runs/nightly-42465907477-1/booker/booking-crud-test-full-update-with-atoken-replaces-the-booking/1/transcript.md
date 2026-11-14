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
| 1 | `POST /booking` | 200 | 21 | `qa-1582927a-0946-4790-b571-76195e163fb7` |
| 2 | `PUT /booking/{id}` | 200 | 23 | `qa-fc7c6000-3fe1-4557-9f3f-a4c5b2d7c938` |
| 3 | `DELETE /booking/{id}` | 201 | 21 | `qa-a3f73c7c-92d2-4810-8e6e-b82400993e6f` |
| 4 | `GET /booking/{id}` | 404 | 19 | `qa-0787312d-f236-4116-a8f8-7c87ec5f0638` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-1582927a-0946-4790-b571-76195e163fb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1582927a-0946-4790-b571-76195e163fb7
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-44a6a4df","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}

--- response: 200 in 21 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"cd-K5eTOlzyyjmiU11b2T/97mDIO+s"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3958,"booking":{"firstname":"QA","lastname":"Guest-44a6a4df","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3958
correlation: qa-fc7c6000-3fe1-4557-9f3f-a4c5b2d7c938

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-fc7c6000-3fe1-4557-9f3f-a4c5b2d7c938
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-fc2aa80e","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}

--- response: 200 in 23 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"b3-Kbw3WlQTOLP0ZQb2U0dLhe/prCQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-fc2aa80e","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3958
correlation: qa-a3f73c7c-92d2-4810-8e6e-b82400993e6f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a3f73c7c-92d2-4810-8e6e-b82400993e6f
Content-Type: application/json

--- response: 201 in 21 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3958
correlation: qa-0787312d-f236-4116-a8f8-7c87ec5f0638

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0787312d-f236-4116-a8f8-7c87ec5f0638
Content-Type: application/json

--- response: 404 in 19 ms ---
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
