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
| 1 | `POST /booking` | 200 | 126 | `qa-5db24000-68f5-4167-ae74-db0cd73f8c30` |
| 2 | `GET /booking/{id}` | 200 | 101 | `qa-b3961228-3a72-437e-859e-0ab3ff9527a7` |
| 3 | `POST /auth` | 200 | 111 | `qa-aad74d2e-258a-49ea-bc7b-dd4be91bffc3` |
| 4 | `DELETE /booking/{id}` | 201 | 108 | `qa-20db5b75-640a-4f76-842f-949ecfc669d6` |
| 5 | `GET /booking/{id}` | 404 | 123 | `qa-2a13ebb1-7cb9-4b69-9e5a-bdda71e8bea3` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-5db24000-68f5-4167-ae74-db0cd73f8c30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5db24000-68f5-4167-ae74-db0cd73f8c30
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-64591dee","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Late check-in"}

--- response: 200 in 126 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"d2-HtnNTlITi1kt6UNali1lgjIV+kk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5894,"booking":{"firstname":"Ada","lastname":"Guest-64591dee","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/5894
correlation: qa-b3961228-3a72-437e-859e-0ab3ff9527a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3961228-3a72-437e-859e-0ab3ff9527a7
Content-Type: application/json

--- response: 200 in 101 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"b5-ddnjjwz/zUWwuVkTNq3MadhpFRo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-64591dee","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-aad74d2e-258a-49ea-bc7b-dd4be91bffc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aad74d2e-258a-49ea-bc7b-dd4be91bffc3
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 111 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"1b-S8zp819FMfdaBipCgrf2RahCIBk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5894
correlation: qa-20db5b75-640a-4f76-842f-949ecfc669d6

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-20db5b75-640a-4f76-842f-949ecfc669d6
Content-Type: application/json

--- response: 201 in 108 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5894
correlation: qa-2a13ebb1-7cb9-4b69-9e5a-bdda71e8bea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a13ebb1-7cb9-4b69-9e5a-bdda71e8bea3
Content-Type: application/json

--- response: 404 in 123 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
