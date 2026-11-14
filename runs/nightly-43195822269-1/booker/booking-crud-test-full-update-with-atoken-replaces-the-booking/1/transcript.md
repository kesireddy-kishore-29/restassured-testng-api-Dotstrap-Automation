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
| 1 | `POST /booking` | 200 | 178 | `qa-b63ea3a2-9760-428a-acb7-ab6b8b295cc4` |
| 2 | `PUT /booking/{id}` | 200 | 178 | `qa-e13fc9cb-fb27-4a2f-b239-ff6419b3f50e` |
| 3 | `DELETE /booking/{id}` | 201 | 177 | `qa-2d82ead7-0a08-413b-96ea-25b8f7ab0006` |
| 4 | `GET /booking/{id}` | 404 | 177 | `qa-26ffe71d-11b6-498b-b273-a6e7f57fd61a` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-b63ea3a2-9760-428a-acb7-ab6b8b295cc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b63ea3a2-9760-428a-acb7-ab6b8b295cc4
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-47bb546c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}

--- response: 200 in 178 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"cd-OLy0da5/5hT2nb6nj04GhGPLcro"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2974,"booking":{"firstname":"QA","lastname":"Guest-47bb546c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2974
correlation: qa-e13fc9cb-fb27-4a2f-b239-ff6419b3f50e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e13fc9cb-fb27-4a2f-b239-ff6419b3f50e
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-a902b133","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}

--- response: 200 in 178 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"b3-HCA0exjZrci2i0DfKOQMyaaVnak"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-a902b133","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2974
correlation: qa-2d82ead7-0a08-413b-96ea-25b8f7ab0006

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2d82ead7-0a08-413b-96ea-25b8f7ab0006
Content-Type: application/json

--- response: 201 in 177 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:36 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477396"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477396"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2974
correlation: qa-26ffe71d-11b6-498b-b273-a6e7f57fd61a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26ffe71d-11b6-498b-b273-a6e7f57fd61a
Content-Type: application/json

--- response: 404 in 177 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:36 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477396"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477396"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
