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
| 1 | `POST /booking` | 200 | 32 | `qa-90cd4f69-90d6-484c-9e03-8cee31ec9b51` |
| 2 | `DELETE /booking/{id}` | 201 | 32 | `qa-868d4d10-7af6-4b0c-99a0-441998dc965a` |
| 3 | `GET /booking/{id}` | 404 | 29 | `qa-f4e8b75e-205f-4406-867e-9658789aa5ba` |
| 4 | `GET /booking/{id}` | 404 | 31 | `qa-c6cd3ed2-3fef-4ca5-a487-a602606956e1` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-90cd4f69-90d6-484c-9e03-8cee31ec9b51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90cd4f69-90d6-484c-9e03-8cee31ec9b51
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-7980170a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}

--- response: 200 in 32 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"cd-pxxlWEKZ7mhL5bkQwlrZ5Fwnd2w"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1443,"booking":{"firstname":"QA","lastname":"Guest-7980170a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/1443
correlation: qa-868d4d10-7af6-4b0c-99a0-441998dc965a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-868d4d10-7af6-4b0c-99a0-441998dc965a
Content-Type: application/json

--- response: 201 in 32 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1443
correlation: qa-f4e8b75e-205f-4406-867e-9658789aa5ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4e8b75e-205f-4406-867e-9658789aa5ba
Content-Type: application/json

--- response: 404 in 29 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1443
correlation: qa-c6cd3ed2-3fef-4ca5-a487-a602606956e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6cd3ed2-3fef-4ca5-a487-a602606956e1
Content-Type: application/json

--- response: 404 in 31 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
