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
| 1 | `POST /booking` | 200 | 258 | `qa-29c822d4-049e-4840-b501-7befaaa60749` |
| 2 | `GET /booking/{id}` | 200 | 259 | `qa-e1d7d356-9e07-4134-a6c6-6a1844780465` |
| 3 | `POST /auth` | 200 | 256 | `qa-402c88c2-57b4-4de8-8c54-1435d8cda4d9` |
| 4 | `DELETE /booking/{id}` | 201 | 259 | `qa-f2df37a2-1ad8-4c95-b120-8bf110396a8f` |
| 5 | `GET /booking/{id}` | 404 | 237 | `qa-0a432647-670e-4cc4-92e0-e44f86a36871` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-29c822d4-049e-4840-b501-7befaaa60749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29c822d4-049e-4840-b501-7befaaa60749
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-71a53d3a","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Late check-in"}

--- response: 200 in 258 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:14 GMT
Etag: W/"d2-ysh2tmm4OYw5K4qRq4zex7XLlnc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FkRYtj9nY%2BiWNvw64D%2B1bSjSbv6Y%2BH8FonnQuN9hQc0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647114"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FkRYtj9nY%2BiWNvw64D%2B1bSjSbv6Y%2BH8FonnQuN9hQc0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647114"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2074,"booking":{"firstname":"Ada","lastname":"Guest-71a53d3a","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/2074
correlation: qa-e1d7d356-9e07-4134-a6c6-6a1844780465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1d7d356-9e07-4134-a6c6-6a1844780465
Content-Type: application/json

--- response: 200 in 259 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:15 GMT
Etag: W/"b5-adHU1wYIk7+SvvJvfu8Xgyeae5w"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647115"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647115"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-71a53d3a","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-402c88c2-57b4-4de8-8c54-1435d8cda4d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-402c88c2-57b4-4de8-8c54-1435d8cda4d9
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 256 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:15 GMT
Etag: W/"1b-zIO7/dLLj0KbDXkPKTkVHbS2jT0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647115"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647115"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2074
correlation: qa-f2df37a2-1ad8-4c95-b120-8bf110396a8f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f2df37a2-1ad8-4c95-b120-8bf110396a8f
Content-Type: application/json

--- response: 201 in 259 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:15 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647115"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647115"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2074
correlation: qa-0a432647-670e-4cc4-92e0-e44f86a36871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a432647-670e-4cc4-92e0-e44f86a36871
Content-Type: application/json

--- response: 404 in 237 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:15 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647115"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647115"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
