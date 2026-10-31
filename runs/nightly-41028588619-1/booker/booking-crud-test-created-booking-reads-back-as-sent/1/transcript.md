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
| 1 | `POST /booking` | 200 | 177 | `qa-4416ae14-e5c9-4641-ba5e-cbf52bd6c084` |
| 2 | `GET /booking/{id}` | 200 | 185 | `qa-a8927889-80f0-4d7f-92ed-154a2bad82d3` |
| 3 | `POST /auth` | 200 | 179 | `qa-77d5e431-1103-4bb1-b987-967e3a987064` |
| 4 | `DELETE /booking/{id}` | 201 | 181 | `qa-9413410a-95b1-40c6-b371-42c93375e88e` |
| 5 | `GET /booking/{id}` | 404 | 177 | `qa-b10f0afd-be23-47b5-b8b0-da114fd6ad9f` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-4416ae14-e5c9-4641-ba5e-cbf52bd6c084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4416ae14-e5c9-4641-ba5e-cbf52bd6c084
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-6f5c4b4c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Late check-in"}

--- response: 200 in 177 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:55 GMT
Etag: W/"d2-KEwn4XIldzP/eXYAiprsUQMDNUE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RyGFiBOHUILKSs143DzaTxU3JMxVlGRHgfzF3EM7ex4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RyGFiBOHUILKSs143DzaTxU3JMxVlGRHgfzF3EM7ex4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2679,"booking":{"firstname":"Ada","lastname":"Guest-6f5c4b4c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/2679
correlation: qa-a8927889-80f0-4d7f-92ed-154a2bad82d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8927889-80f0-4d7f-92ed-154a2bad82d3
Content-Type: application/json

--- response: 200 in 185 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"b5-4r3DbxylzkqZnjt14T2AsOvgKs4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-6f5c4b4c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-77d5e431-1103-4bb1-b987-967e3a987064

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77d5e431-1103-4bb1-b987-967e3a987064
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 179 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"1b-mWX/UmAPXiCgALvY3IDLrna0U04"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2679
correlation: qa-9413410a-95b1-40c6-b371-42c93375e88e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-9413410a-95b1-40c6-b371-42c93375e88e
Content-Type: application/json

--- response: 201 in 181 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2679
correlation: qa-b10f0afd-be23-47b5-b8b0-da114fd6ad9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b10f0afd-be23-47b5-b8b0-da114fd6ad9f
Content-Type: application/json

--- response: 404 in 177 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
