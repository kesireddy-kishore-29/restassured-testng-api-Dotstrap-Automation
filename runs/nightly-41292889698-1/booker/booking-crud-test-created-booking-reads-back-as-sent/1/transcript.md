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
| 1 | `POST /booking` | 200 | 265 | `qa-4e57241f-2437-4108-a6a5-5bd79eef1ad3` |
| 2 | `GET /booking/{id}` | 200 | 266 | `qa-24dae304-2a90-4660-8e99-643b76a9cb59` |
| 3 | `POST /auth` | 200 | 261 | `qa-34c61c38-e879-459c-8804-256a88f8bcd6` |
| 4 | `DELETE /booking/{id}` | 201 | 260 | `qa-9ac99dfd-194e-432a-9f30-3e9ff8bfd11b` |
| 5 | `GET /booking/{id}` | 404 | 143 | `qa-63c5c5e6-947c-4ac6-b213-755b5963faad` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-4e57241f-2437-4108-a6a5-5bd79eef1ad3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e57241f-2437-4108-a6a5-5bd79eef1ad3
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-56cbc73c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Late check-in"}

--- response: 200 in 265 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:27 GMT
Etag: W/"d2-GwGfZ9QgBFkkk335rKh3PJWdo24"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525007"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525007"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1354,"booking":{"firstname":"Ada","lastname":"Guest-56cbc73c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/1354
correlation: qa-24dae304-2a90-4660-8e99-643b76a9cb59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24dae304-2a90-4660-8e99-643b76a9cb59
Content-Type: application/json

--- response: 200 in 266 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:27 GMT
Etag: W/"b5-a2oq5i5SnHp6+9kB2QUcrcWHPes"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525007"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525007"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-56cbc73c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-34c61c38-e879-459c-8804-256a88f8bcd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34c61c38-e879-459c-8804-256a88f8bcd6
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 261 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:27 GMT
Etag: W/"1b-+Vii1z7gmO4Vx9xAXWhHefEh0J8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525007"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525007"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/1354
correlation: qa-9ac99dfd-194e-432a-9f30-3e9ff8bfd11b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-9ac99dfd-194e-432a-9f30-3e9ff8bfd11b
Content-Type: application/json

--- response: 201 in 260 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:28 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525008"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525008"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/1354
correlation: qa-63c5c5e6-947c-4ac6-b213-755b5963faad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63c5c5e6-947c-4ac6-b213-755b5963faad
Content-Type: application/json

--- response: 404 in 143 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:28 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525008"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525008"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
