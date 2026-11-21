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
| 1 | `POST /booking` | 200 | 36 | `qa-d84bcb87-7d46-47ef-8097-3375e681633e` |
| 2 | `GET /booking/{id}` | 200 | 33 | `qa-f26300c0-bfdb-4e88-a919-92de44902219` |
| 3 | `POST /auth` | 200 | 39 | `qa-4bca8466-7e5c-47da-9c41-3eac820d111e` |
| 4 | `DELETE /booking/{id}` | 201 | 29 | `qa-997031a7-348c-4143-9452-55e6e39b3cf5` |
| 5 | `GET /booking/{id}` | 404 | 31 | `qa-a639c142-bbae-422b-a293-8b910fcc6e92` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d84bcb87-7d46-47ef-8097-3375e681633e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d84bcb87-7d46-47ef-8097-3375e681633e
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-4de1586c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Late check-in"}

--- response: 200 in 36 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"d2-0DPZLsuvabPQEg9RQjcGptWBu+s"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1440,"booking":{"firstname":"Ada","lastname":"Guest-4de1586c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/1440
correlation: qa-f26300c0-bfdb-4e88-a919-92de44902219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26300c0-bfdb-4e88-a919-92de44902219
Content-Type: application/json

--- response: 200 in 33 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"b5-1OgzgHyQfrzce4Zx3asj3Tgd+Ps"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-4de1586c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-4bca8466-7e5c-47da-9c41-3eac820d111e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bca8466-7e5c-47da-9c41-3eac820d111e
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 39 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"1b-9rtGmN5uFJ9YGYNbv4B4hbTeCrc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/1440
correlation: qa-997031a7-348c-4143-9452-55e6e39b3cf5

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-997031a7-348c-4143-9452-55e6e39b3cf5
Content-Type: application/json

--- response: 201 in 29 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/1440
correlation: qa-a639c142-bbae-422b-a293-8b910fcc6e92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a639c142-bbae-422b-a293-8b910fcc6e92
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
