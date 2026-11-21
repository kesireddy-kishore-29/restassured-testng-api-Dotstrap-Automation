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
| 1 | `POST /booking` | 200 | 33 | `qa-57b36e67-c061-4671-b99b-1e2113d7f783` |
| 2 | `GET /booking/{id}` | 200 | 38 | `qa-9d5faab7-a482-440d-9254-121dac5c9d2f` |
| 3 | `POST /auth` | 200 | 30 | `qa-17c81176-86d4-4bc1-be69-0c91eb45af62` |
| 4 | `DELETE /booking/{id}` | 201 | 29 | `qa-b9f07bf0-9b26-4678-8e52-522f5c00d377` |
| 5 | `GET /booking/{id}` | 404 | 29 | `qa-e4dc8baf-fbd9-4453-a710-667ed28a399d` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-57b36e67-c061-4671-b99b-1e2113d7f783

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57b36e67-c061-4671-b99b-1e2113d7f783
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-8721edd8","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Late check-in"}

--- response: 200 in 33 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"d2-obovfLn2N+WyvROZLcr5dAs9gLU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4445,"booking":{"firstname":"Ada","lastname":"Guest-8721edd8","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/4445
correlation: qa-9d5faab7-a482-440d-9254-121dac5c9d2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d5faab7-a482-440d-9254-121dac5c9d2f
Content-Type: application/json

--- response: 200 in 38 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"b5-vcA04BGwqQe8PSNzE2I8s9DpPNQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-8721edd8","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-17c81176-86d4-4bc1-be69-0c91eb45af62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17c81176-86d4-4bc1-be69-0c91eb45af62
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 30 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"1b-t+op4qP9JEdKjV/CZBEH1goub8o"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4445
correlation: qa-b9f07bf0-9b26-4678-8e52-522f5c00d377

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b9f07bf0-9b26-4678-8e52-522f5c00d377
Content-Type: application/json

--- response: 201 in 29 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4445
correlation: qa-e4dc8baf-fbd9-4453-a710-667ed28a399d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4dc8baf-fbd9-4453-a710-667ed28a399d
Content-Type: application/json

--- response: 404 in 29 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
