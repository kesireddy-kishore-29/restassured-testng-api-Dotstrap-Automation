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
| 1 | `POST /booking` | 200 | 180 | `qa-f55f28eb-1462-4456-b026-94980e4693c4` |
| 2 | `DELETE /booking/{id}` | 201 | 178 | `qa-1fb74f33-79fc-4585-8f8f-67c2c2b717ce` |
| 3 | `GET /booking/{id}` | 404 | 177 | `qa-f9880ca2-ebce-4a1d-8df8-18341da2b568` |
| 4 | `GET /booking/{id}` | 404 | 186 | `qa-c172d622-d9d8-42bd-a8ab-220bceb78ea5` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f55f28eb-1462-4456-b026-94980e4693c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f55f28eb-1462-4456-b026-94980e4693c4
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-3ca77f35","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}

--- response: 200 in 180 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"cd-NRdzOoUnw6KPUTL4Fddz9V0jwaM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2967,"booking":{"firstname":"QA","lastname":"Guest-3ca77f35","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/2967
correlation: qa-1fb74f33-79fc-4585-8f8f-67c2c2b717ce

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1fb74f33-79fc-4585-8f8f-67c2c2b717ce
Content-Type: application/json

--- response: 201 in 178 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2967
correlation: qa-f9880ca2-ebce-4a1d-8df8-18341da2b568

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9880ca2-ebce-4a1d-8df8-18341da2b568
Content-Type: application/json

--- response: 404 in 177 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2967
correlation: qa-c172d622-d9d8-42bd-a8ab-220bceb78ea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c172d622-d9d8-42bd-a8ab-220bceb78ea5
Content-Type: application/json

--- response: 404 in 186 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
