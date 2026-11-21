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
| 1 | `POST /booking` | 200 | 22 | `qa-5ecc6a93-0544-485c-9f98-dfd7202e86a1` |
| 2 | `GET /booking/{id}` | 200 | 20 | `qa-692fe38c-1a2f-4559-85f7-18c576d85f7b` |
| 3 | `POST /auth` | 200 | 22 | `qa-c6cd444b-d04c-4903-854e-3aac04786f92` |
| 4 | `DELETE /booking/{id}` | 201 | 23 | `qa-5894abad-70ed-4f4e-8cc4-d1f064134d81` |
| 5 | `GET /booking/{id}` | 404 | 21 | `qa-d0f77344-a941-47a9-857e-9117f2875940` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-5ecc6a93-0544-485c-9f98-dfd7202e86a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ecc6a93-0544-485c-9f98-dfd7202e86a1
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-2ffbe078","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Late check-in"}

--- response: 200 in 22 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"d2-WzqpwwT6QlMGGejOzZQTmUrQIBY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3162,"booking":{"firstname":"Ada","lastname":"Guest-2ffbe078","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/3162
correlation: qa-692fe38c-1a2f-4559-85f7-18c576d85f7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-692fe38c-1a2f-4559-85f7-18c576d85f7b
Content-Type: application/json

--- response: 200 in 20 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"b5-pXeDIa4u8zF2B2VHxX7BkvpoudQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-2ffbe078","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-c6cd444b-d04c-4903-854e-3aac04786f92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6cd444b-d04c-4903-854e-3aac04786f92
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 22 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"1b-7T6p0O/x60LvRI/ygNiyIjMijO8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3162
correlation: qa-5894abad-70ed-4f4e-8cc4-d1f064134d81

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5894abad-70ed-4f4e-8cc4-d1f064134d81
Content-Type: application/json

--- response: 201 in 23 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3162
correlation: qa-d0f77344-a941-47a9-857e-9117f2875940

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0f77344-a941-47a9-857e-9117f2875940
Content-Type: application/json

--- response: 404 in 21 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
