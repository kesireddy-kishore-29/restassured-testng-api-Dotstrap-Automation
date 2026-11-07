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
| 1 | `POST /booking` | 200 | 46 | `qa-ad9c1993-43c6-47fc-8ba9-34ee1af27c08` |
| 2 | `GET /booking/{id}` | 200 | 43 | `qa-3dd3b147-2de3-4d9c-8a79-6f40ddebf888` |
| 3 | `POST /auth` | 200 | 38 | `qa-9c937e39-9262-452e-885e-0ee73237e8eb` |
| 4 | `DELETE /booking/{id}` | 201 | 37 | `qa-5c71cce4-e590-4403-af6f-9c7ec176bd5b` |
| 5 | `GET /booking/{id}` | 404 | 42 | `qa-f7110836-d309-4160-941e-e4cd3dff6c0a` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-ad9c1993-43c6-47fc-8ba9-34ee1af27c08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad9c1993-43c6-47fc-8ba9-34ee1af27c08
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-a3ae1cc8","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Late check-in"}

--- response: 200 in 46 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"d2-aI5VIoH9oNtwN6noBUpG5BIH32s"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5037,"booking":{"firstname":"Ada","lastname":"Guest-a3ae1cc8","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/5037
correlation: qa-3dd3b147-2de3-4d9c-8a79-6f40ddebf888

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dd3b147-2de3-4d9c-8a79-6f40ddebf888
Content-Type: application/json

--- response: 200 in 43 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"b5-BblYJkq7w+MCfpaWnFjEvslgP4A"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-a3ae1cc8","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-9c937e39-9262-452e-885e-0ee73237e8eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c937e39-9262-452e-885e-0ee73237e8eb
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 38 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"1b-YXEcSsDwrhA81Kr0R70n6MtXQ5I"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5037
correlation: qa-5c71cce4-e590-4403-af6f-9c7ec176bd5b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5c71cce4-e590-4403-af6f-9c7ec176bd5b
Content-Type: application/json

--- response: 201 in 37 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5037
correlation: qa-f7110836-d309-4160-941e-e4cd3dff6c0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7110836-d309-4160-941e-e4cd3dff6c0a
Content-Type: application/json

--- response: 404 in 42 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
