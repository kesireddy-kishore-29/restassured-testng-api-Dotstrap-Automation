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
| 1 | `POST /booking` | 200 | 105 | `qa-8bc5f09e-cb7c-4a68-b7c3-a720fe177e0c` |
| 2 | `DELETE /booking/{id}` | 201 | 98 | `qa-f1be13e7-6d31-4f50-aeb7-db47e087bc94` |
| 3 | `GET /booking/{id}` | 404 | 88 | `qa-42aa7dde-389c-4b58-b218-88c09822f9c0` |
| 4 | `GET /booking/{id}` | 404 | 97 | `qa-90c623e7-9112-42dd-b3d1-abb272baa140` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-8bc5f09e-cb7c-4a68-b7c3-a720fe177e0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bc5f09e-cb7c-4a68-b7c3-a720fe177e0c
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-321884e9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 105 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"cd-2wVi5SgbVJESdxlFLEKuL79+ZCw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3527,"booking":{"firstname":"QA","lastname":"Guest-321884e9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/3527
correlation: qa-f1be13e7-6d31-4f50-aeb7-db47e087bc94

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f1be13e7-6d31-4f50-aeb7-db47e087bc94
Content-Type: application/json

--- response: 201 in 98 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3527
correlation: qa-42aa7dde-389c-4b58-b218-88c09822f9c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42aa7dde-389c-4b58-b218-88c09822f9c0
Content-Type: application/json

--- response: 404 in 88 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:45 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606065"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606065"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3527
correlation: qa-90c623e7-9112-42dd-b3d1-abb272baa140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90c623e7-9112-42dd-b3d1-abb272baa140
Content-Type: application/json

--- response: 404 in 97 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:45 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606065"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606065"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
