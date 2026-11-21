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
| 1 | `POST /booking` | 200 | 32 | `qa-0f1294f8-e416-49df-98d7-2c304f5fc510` |
| 2 | `GET /booking/{id}` | 200 | 30 | `qa-cf0a95a4-59e1-4adb-801d-e636f1efcfd6` |
| 3 | `POST /auth` | 200 | 39 | `qa-c674a604-e197-435b-82d4-5b555f210523` |
| 4 | `DELETE /booking/{id}` | 201 | 33 | `qa-a28b9b5d-c200-4750-b510-f13843b814c4` |
| 5 | `GET /booking/{id}` | 404 | 37 | `qa-1197ff1a-fd5a-4b80-b373-5244990d4090` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-0f1294f8-e416-49df-98d7-2c304f5fc510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f1294f8-e416-49df-98d7-2c304f5fc510
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-de89a204","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Late check-in"}

--- response: 200 in 32 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"d2-l+BMBSXbhrTjdwbbuWlY9LgpbtI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2806,"booking":{"firstname":"Ada","lastname":"Guest-de89a204","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/2806
correlation: qa-cf0a95a4-59e1-4adb-801d-e636f1efcfd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf0a95a4-59e1-4adb-801d-e636f1efcfd6
Content-Type: application/json

--- response: 200 in 30 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"b5-qXXfvPbmRhXzBh9I4EFR7Tz88K8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-de89a204","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-c674a604-e197-435b-82d4-5b555f210523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c674a604-e197-435b-82d4-5b555f210523
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 39 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"1b-yDPHARMc3gWtWA9E1vNX+fodhxM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2806
correlation: qa-a28b9b5d-c200-4750-b510-f13843b814c4

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a28b9b5d-c200-4750-b510-f13843b814c4
Content-Type: application/json

--- response: 201 in 33 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2806
correlation: qa-1197ff1a-fd5a-4b80-b373-5244990d4090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1197ff1a-fd5a-4b80-b373-5244990d4090
Content-Type: application/json

--- response: 404 in 37 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
