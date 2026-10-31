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
| 1 | `POST /booking` | 200 | 919 | `qa-4afb2b90-977a-4948-bdc5-da6e92c7c032` |
| 2 | `GET /booking/{id}` | 200 | 262 | `qa-14d2c448-09fc-4c7f-b63f-d67d3cfc1b0c` |
| 3 | `POST /auth` | 200 | 238 | `qa-b520cb34-34d6-4e3c-aee1-1d57fbfa3075` |
| 4 | `DELETE /booking/{id}` | 201 | 264 | `qa-b5e6f561-d532-415a-919e-7766abfece41` |
| 5 | `GET /booking/{id}` | 404 | 230 | `qa-d4afae9c-a6d9-498d-9bc3-f4e577e343bf` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-4afb2b90-977a-4948-bdc5-da6e92c7c032

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4afb2b90-977a-4948-bdc5-da6e92c7c032
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-2dc8bdf4","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Late check-in"}

--- response: 200 in 919 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:03 GMT
Etag: W/"d2-YoYXMVo1FlC44as0lON0k1zwxeo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Gkq6DoaXTHVN977gIQ%2F3WJeIuI2M3xFAAD8nmVHPr1k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826703"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Gkq6DoaXTHVN977gIQ%2F3WJeIuI2M3xFAAD8nmVHPr1k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826703"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2202,"booking":{"firstname":"Ada","lastname":"Guest-2dc8bdf4","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/2202
correlation: qa-14d2c448-09fc-4c7f-b63f-d67d3cfc1b0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14d2c448-09fc-4c7f-b63f-d67d3cfc1b0c
Content-Type: application/json

--- response: 200 in 262 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:04 GMT
Etag: W/"b5-oP5zX6CYghtWuBHl+bguFUIUKc4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ingr2iNOCCjo67H4HtudDbG21PL7olOqCC4vxwOLXvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826704"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ingr2iNOCCjo67H4HtudDbG21PL7olOqCC4vxwOLXvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826704"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-2dc8bdf4","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-b520cb34-34d6-4e3c-aee1-1d57fbfa3075

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b520cb34-34d6-4e3c-aee1-1d57fbfa3075
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 238 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:04 GMT
Etag: W/"1b-i7LxNF/SFykTgCGDearkWgvkHAg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ingr2iNOCCjo67H4HtudDbG21PL7olOqCC4vxwOLXvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826704"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ingr2iNOCCjo67H4HtudDbG21PL7olOqCC4vxwOLXvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826704"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2202
correlation: qa-b5e6f561-d532-415a-919e-7766abfece41

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b5e6f561-d532-415a-919e-7766abfece41
Content-Type: application/json

--- response: 201 in 264 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:05 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2202
correlation: qa-d4afae9c-a6d9-498d-9bc3-f4e577e343bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4afae9c-a6d9-498d-9bc3-f4e577e343bf
Content-Type: application/json

--- response: 404 in 230 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:05 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
