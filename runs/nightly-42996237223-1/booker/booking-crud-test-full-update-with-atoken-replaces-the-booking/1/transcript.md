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
| 1 | `POST /booking` | 200 | 118 | `qa-bf181bda-2871-447c-8c82-264ac1a1cba0` |
| 2 | `PUT /booking/{id}` | 200 | 131 | `qa-1373e3c0-4b54-4d96-8228-edbcf3e1e161` |
| 3 | `DELETE /booking/{id}` | 201 | 121 | `qa-fb2d2386-291c-4799-bb32-b9dea64c4eb4` |
| 4 | `GET /booking/{id}` | 404 | 122 | `qa-3cd020f4-d73a-405d-8246-e5982226d64f` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-bf181bda-2871-447c-8c82-264ac1a1cba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf181bda-2871-447c-8c82-264ac1a1cba0
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-d92a7d8d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}

--- response: 200 in 118 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:20 GMT
Etag: W/"cd-2rbDhhijMw3/Qi7PE07hTzhV49g"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389660"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389660"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1912,"booking":{"firstname":"QA","lastname":"Guest-d92a7d8d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1912
correlation: qa-1373e3c0-4b54-4d96-8228-edbcf3e1e161

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1373e3c0-4b54-4d96-8228-edbcf3e1e161
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-3c7436fa","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}

--- response: 200 in 131 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:20 GMT
Etag: W/"b3-3x4C+fPFqqEyfp0nZACernaJJSc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389660"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389660"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-3c7436fa","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/1912
correlation: qa-fb2d2386-291c-4799-bb32-b9dea64c4eb4

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-fb2d2386-291c-4799-bb32-b9dea64c4eb4
Content-Type: application/json

--- response: 201 in 121 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:20 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389660"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389660"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1912
correlation: qa-3cd020f4-d73a-405d-8246-e5982226d64f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cd020f4-d73a-405d-8246-e5982226d64f
Content-Type: application/json

--- response: 404 in 122 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:20 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389660"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389660"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
