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
| 1 | `POST /booking` | 200 | 770 | `qa-f4320fd1-f4bf-46af-8b87-a58d784f0dec` |
| 2 | `GET /booking/{id}` | 200 | 62 | `qa-cb3846f2-6154-45e0-8ebd-188d07b5f7e9` |
| 3 | `POST /auth` | 200 | 31 | `qa-9600b5cd-07de-4c47-8ccf-a27d68bc1bac` |
| 4 | `DELETE /booking/{id}` | 201 | 38 | `qa-d6118579-08ab-49db-ac12-bba8b480ded8` |
| 5 | `GET /booking/{id}` | 404 | 32 | `qa-9650a1cf-8e82-44ee-9622-bbc8fc7d96cf` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f4320fd1-f4bf-46af-8b87-a58d784f0dec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4320fd1-f4bf-46af-8b87-a58d784f0dec
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-83283a98","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Late check-in"}

--- response: 200 in 770 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:28 GMT
Etag: W/"d2-iQQ+eXDrNRVnLBn0rXvk+UmzOnU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=t9dWNi%2BvhcZA89RTvRfY1IpeWzQ58GPcYzwhEHbKZYY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088028"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=t9dWNi%2BvhcZA89RTvRfY1IpeWzQ58GPcYzwhEHbKZYY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088028"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5116,"booking":{"firstname":"Ada","lastname":"Guest-83283a98","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/5116
correlation: qa-cb3846f2-6154-45e0-8ebd-188d07b5f7e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb3846f2-6154-45e0-8ebd-188d07b5f7e9
Content-Type: application/json

--- response: 200 in 62 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"b5-J+C5lt3gar3FIf47uWIDv4G4w34"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-83283a98","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-9600b5cd-07de-4c47-8ccf-a27d68bc1bac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9600b5cd-07de-4c47-8ccf-a27d68bc1bac
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 31 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"1b-sGA2XhLxaii3mYzZk8ODmPUqSqk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5116
correlation: qa-d6118579-08ab-49db-ac12-bba8b480ded8

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-d6118579-08ab-49db-ac12-bba8b480ded8
Content-Type: application/json

--- response: 201 in 38 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5116
correlation: qa-9650a1cf-8e82-44ee-9622-bbc8fc7d96cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9650a1cf-8e82-44ee-9622-bbc8fc7d96cf
Content-Type: application/json

--- response: 404 in 32 ms ---
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
