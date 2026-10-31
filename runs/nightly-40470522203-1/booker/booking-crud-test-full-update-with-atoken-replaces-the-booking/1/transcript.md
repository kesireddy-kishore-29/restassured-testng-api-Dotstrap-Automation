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
| 1 | `POST /booking` | 200 | 28 | `qa-a276dd3b-aa8b-4be1-b5ec-9734860a9c05` |
| 2 | `PUT /booking/{id}` | 200 | 28 | `qa-339f3489-ee6f-4d6e-8ce1-c860654f4278` |
| 3 | `DELETE /booking/{id}` | 201 | 27 | `qa-55b640fb-4311-4dc3-865c-c63eb30f63a1` |
| 4 | `GET /booking/{id}` | 404 | 30 | `qa-79913c20-6535-43c4-87ac-455dcb7d21f6` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a276dd3b-aa8b-4be1-b5ec-9734860a9c05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a276dd3b-aa8b-4be1-b5ec-9734860a9c05
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-bd7fc6e1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 28 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"cd-qIv+l6zF1j49xVIFn01WMLMIdHg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5128,"booking":{"firstname":"QA","lastname":"Guest-bd7fc6e1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5128
correlation: qa-339f3489-ee6f-4d6e-8ce1-c860654f4278

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-339f3489-ee6f-4d6e-8ce1-c860654f4278
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-c9237509","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 28 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"b3-d2/r3Ip8xtaFq2ZDXtQcrYV09Ic"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-c9237509","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5128
correlation: qa-55b640fb-4311-4dc3-865c-c63eb30f63a1

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-55b640fb-4311-4dc3-865c-c63eb30f63a1
Content-Type: application/json

--- response: 201 in 27 ms ---
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
#4 GET https://restful-booker.herokuapp.com/booking/5128
correlation: qa-79913c20-6535-43c4-87ac-455dcb7d21f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79913c20-6535-43c4-87ac-455dcb7d21f6
Content-Type: application/json

--- response: 404 in 30 ms ---
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
