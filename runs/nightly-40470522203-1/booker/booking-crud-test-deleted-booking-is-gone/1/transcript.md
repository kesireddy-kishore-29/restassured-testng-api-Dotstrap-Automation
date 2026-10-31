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
| 1 | `POST /booking` | 200 | 773 | `qa-9e8d6376-b59c-4a9d-aa05-8c84cabee0c0` |
| 2 | `POST /auth` | 200 | 41 | `qa-7b279e83-86b6-4c60-ae13-dc93f23c3981` |
| 3 | `DELETE /booking/{id}` | 201 | 55 | `qa-fd5d06dd-0f86-499c-90c9-845161b4fe0e` |
| 4 | `GET /booking/{id}` | 404 | 38 | `qa-f793dfd5-0b5b-48cd-8f04-cd66ba23e43e` |
| 5 | `GET /booking/{id}` | 404 | 33 | `qa-e805b405-29e7-494f-9d50-b2138e9b2636` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-9e8d6376-b59c-4a9d-aa05-8c84cabee0c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e8d6376-b59c-4a9d-aa05-8c84cabee0c0
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-8cb06e17","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 773 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:28 GMT
Etag: W/"cd-/KdBlTn3524GpUW96OEPlG3dlFk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=t9dWNi%2BvhcZA89RTvRfY1IpeWzQ58GPcYzwhEHbKZYY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=t9dWNi%2BvhcZA89RTvRfY1IpeWzQ58GPcYzwhEHbKZYY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5117,"booking":{"firstname":"QA","lastname":"Guest-8cb06e17","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}}
```

## 2. POST /auth

```text
#2 POST https://restful-booker.herokuapp.com/auth
correlation: qa-7b279e83-86b6-4c60-ae13-dc93f23c3981

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b279e83-86b6-4c60-ae13-dc93f23c3981
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 41 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"1b-VHKJueEusdxn9kUSoA+qb+W+ThM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5117
correlation: qa-fd5d06dd-0f86-499c-90c9-845161b4fe0e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-fd5d06dd-0f86-499c-90c9-845161b4fe0e
Content-Type: application/json

--- response: 201 in 55 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5117
correlation: qa-f793dfd5-0b5b-48cd-8f04-cd66ba23e43e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f793dfd5-0b5b-48cd-8f04-cd66ba23e43e
Content-Type: application/json

--- response: 404 in 38 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5117
correlation: qa-e805b405-29e7-494f-9d50-b2138e9b2636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e805b405-29e7-494f-9d50-b2138e9b2636
Content-Type: application/json

--- response: 404 in 33 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
