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
| 1 | `POST /booking` | 200 | 183 | `qa-f2dc1155-2cbe-4749-9118-82e5d3da0ced` |
| 2 | `GET /booking/{id}` | 200 | 186 | `qa-7ab30a2f-0e80-4c29-a576-30f6c8dac6fa` |
| 3 | `POST /auth` | 200 | 182 | `qa-7dfb844d-22de-4059-ab69-019ef2307da3` |
| 4 | `DELETE /booking/{id}` | 201 | 180 | `qa-23056fea-b83c-4e48-aa15-9525df6c71c8` |
| 5 | `GET /booking/{id}` | 404 | 179 | `qa-66e77828-7667-40b4-ac46-96e62747e074` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f2dc1155-2cbe-4749-9118-82e5d3da0ced

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2dc1155-2cbe-4749-9118-82e5d3da0ced
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-887f544c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Late check-in"}

--- response: 200 in 183 ms ---
Content-Length: 209
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:42 GMT
Etag: W/"d1-9T9E6dx/kJKtW9DsGu0L3qbr1hU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nljFKTLgSRWSfyJaQRPw4rdGeZAUYHmgQLA%2FTBMIOvE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698902"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nljFKTLgSRWSfyJaQRPw4rdGeZAUYHmgQLA%2FTBMIOvE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698902"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":442,"booking":{"firstname":"Ada","lastname":"Guest-887f544c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/442
correlation: qa-7ab30a2f-0e80-4c29-a576-30f6c8dac6fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ab30a2f-0e80-4c29-a576-30f6c8dac6fa
Content-Type: application/json

--- response: 200 in 186 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"b5-aY+M94J9YtfORzYvZoIQHXym/Ng"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-887f544c","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-7dfb844d-22de-4059-ab69-019ef2307da3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dfb844d-22de-4059-ab69-019ef2307da3
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 182 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"1b-qeMG18zuzBQY1dCInLof8K6l8oo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/442
correlation: qa-23056fea-b83c-4e48-aa15-9525df6c71c8

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-23056fea-b83c-4e48-aa15-9525df6c71c8
Content-Type: application/json

--- response: 201 in 180 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/442
correlation: qa-66e77828-7667-40b4-ac46-96e62747e074

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66e77828-7667-40b4-ac46-96e62747e074
Content-Type: application/json

--- response: 404 in 179 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
