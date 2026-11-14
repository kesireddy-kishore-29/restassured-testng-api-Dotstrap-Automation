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
| 1 | `POST /booking` | 200 | 186 | `qa-28123e43-09b5-4b91-a7b1-64cf942f0747` |
| 2 | `GET /booking/{id}` | 200 | 185 | `qa-4559b394-d3ca-4acf-bcbc-c780f7a38c67` |
| 3 | `POST /auth` | 200 | 180 | `qa-28bfbcfb-b765-461e-9dbd-1fbc38575371` |
| 4 | `DELETE /booking/{id}` | 201 | 183 | `qa-b4843f50-29ce-463e-b75c-5ff68faeea5e` |
| 5 | `GET /booking/{id}` | 404 | 181 | `qa-36aef3d4-22c1-40de-9841-24e51a383ce1` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-28123e43-09b5-4b91-a7b1-64cf942f0747

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28123e43-09b5-4b91-a7b1-64cf942f0747
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-ea7a2c81","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Late check-in"}

--- response: 200 in 186 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:34 GMT
Etag: W/"d2-/RJrmK9HisRlFlheBwpX6CLMp0I"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477394"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477394"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2956,"booking":{"firstname":"Ada","lastname":"Guest-ea7a2c81","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/2956
correlation: qa-4559b394-d3ca-4acf-bcbc-c780f7a38c67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4559b394-d3ca-4acf-bcbc-c780f7a38c67
Content-Type: application/json

--- response: 200 in 185 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:34 GMT
Etag: W/"b5-Nj36P1JwS0GMY0SqZsTTY1GJ8Uw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477394"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477394"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-ea7a2c81","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-28bfbcfb-b765-461e-9dbd-1fbc38575371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28bfbcfb-b765-461e-9dbd-1fbc38575371
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 180 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:34 GMT
Etag: W/"1b-2cvMF4lqSlyPod6Nfr3+19umLNs"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477394"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477394"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2956
correlation: qa-b4843f50-29ce-463e-b75c-5ff68faeea5e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b4843f50-29ce-463e-b75c-5ff68faeea5e
Content-Type: application/json

--- response: 201 in 183 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:34 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477394"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477394"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2956
correlation: qa-36aef3d4-22c1-40de-9841-24e51a383ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36aef3d4-22c1-40de-9841-24e51a383ce1
Content-Type: application/json

--- response: 404 in 181 ms ---
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
