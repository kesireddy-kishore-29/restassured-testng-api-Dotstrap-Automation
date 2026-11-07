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
| 1 | `POST /booking` | 200 | 177 | `qa-d5d5b745-43ae-4187-908d-70378c7104c9` |
| 2 | `DELETE /booking/{id}` | 201 | 178 | `qa-933a477c-04f1-4057-9556-234f5fd0ca25` |
| 3 | `GET /booking/{id}` | 404 | 178 | `qa-0ef22cdf-c67a-4e3d-ad7a-0ae97cf39bad` |
| 4 | `GET /booking/{id}` | 404 | 179 | `qa-b78193d4-2128-4afa-af61-8200dbe85fec` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d5d5b745-43ae-4187-908d-70378c7104c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5d5b745-43ae-4187-908d-70378c7104c9
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-e100c1cc","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}

--- response: 200 in 177 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"cc-pKB+wmK3cTtV8xxagt/qe+95850"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":454,"booking":{"firstname":"QA","lastname":"Guest-e100c1cc","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/454
correlation: qa-933a477c-04f1-4057-9556-234f5fd0ca25

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-933a477c-04f1-4057-9556-234f5fd0ca25
Content-Type: application/json

--- response: 201 in 178 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/454
correlation: qa-0ef22cdf-c67a-4e3d-ad7a-0ae97cf39bad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ef22cdf-c67a-4e3d-ad7a-0ae97cf39bad
Content-Type: application/json

--- response: 404 in 178 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:44 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698904"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698904"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/454
correlation: qa-b78193d4-2128-4afa-af61-8200dbe85fec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b78193d4-2128-4afa-af61-8200dbe85fec
Content-Type: application/json

--- response: 404 in 179 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:44 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698904"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698904"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
