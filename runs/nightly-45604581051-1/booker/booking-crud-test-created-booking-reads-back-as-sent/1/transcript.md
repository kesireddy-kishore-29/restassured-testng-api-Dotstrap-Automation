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
| 1 | `POST /booking` | 200 | 113 | `qa-93f4b5bd-d36a-420b-9a05-32da8e874771` |
| 2 | `GET /booking/{id}` | 200 | 117 | `qa-6c722736-ca8e-45c1-8e3b-da0425b6833c` |
| 3 | `POST /auth` | 200 | 118 | `qa-abf20bb7-980f-452b-b93a-58222c7b693a` |
| 4 | `DELETE /booking/{id}` | 201 | 110 | `qa-7a8e03a3-fb53-4b44-8be5-d60aa717e6fd` |
| 5 | `GET /booking/{id}` | 404 | 106 | `qa-c39fa9b1-1a52-43c0-bdae-08cf7938ffde` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-93f4b5bd-d36a-420b-9a05-32da8e874771

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93f4b5bd-d36a-420b-9a05-32da8e874771
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-6cf91914","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Late check-in"}

--- response: 200 in 113 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"d2-rI1krW+bzcyy/GpsQnOruaGlvtk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3518,"booking":{"firstname":"Ada","lastname":"Guest-6cf91914","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/3518
correlation: qa-6c722736-ca8e-45c1-8e3b-da0425b6833c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c722736-ca8e-45c1-8e3b-da0425b6833c
Content-Type: application/json

--- response: 200 in 117 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"b5-0d19PZU3/nirIxI2yty+b1lLjJ8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-6cf91914","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-abf20bb7-980f-452b-b93a-58222c7b693a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abf20bb7-980f-452b-b93a-58222c7b693a
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 118 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"1b-XBpZh+r1aKUdXd+10TMz/FjMuaY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3518
correlation: qa-7a8e03a3-fb53-4b44-8be5-d60aa717e6fd

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-7a8e03a3-fb53-4b44-8be5-d60aa717e6fd
Content-Type: application/json

--- response: 201 in 110 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3518
correlation: qa-c39fa9b1-1a52-43c0-bdae-08cf7938ffde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39fa9b1-1a52-43c0-bdae-08cf7938ffde
Content-Type: application/json

--- response: 404 in 106 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
