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
| 1 | `POST /booking` | 200 | 222 | `qa-1bef2237-dc83-4d3a-bd55-03a41a030611` |
| 2 | `GET /booking/{id}` | 200 | 243 | `qa-4ae1eee5-99c2-4f72-a40b-e85374cd7cf3` |
| 3 | `POST /auth` | 200 | 225 | `qa-c2868645-35ed-4c4e-83be-234ef616720a` |
| 4 | `DELETE /booking/{id}` | 201 | 228 | `qa-6e2d9a46-5ea2-42f1-8c2a-1ce0a2e9e334` |
| 5 | `GET /booking/{id}` | 404 | 243 | `qa-a4bacc5c-a2b0-45b8-a1e3-57bb7590e328` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-1bef2237-dc83-4d3a-bd55-03a41a030611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bef2237-dc83-4d3a-bd55-03a41a030611
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-38ce7527","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Late check-in"}

--- response: 200 in 222 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:04 GMT
Etag: W/"d2-NcOwfStGoosn5vlhJrft8h4BOm0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263144"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263144"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4307,"booking":{"firstname":"Ada","lastname":"Guest-38ce7527","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/4307
correlation: qa-4ae1eee5-99c2-4f72-a40b-e85374cd7cf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ae1eee5-99c2-4f72-a40b-e85374cd7cf3
Content-Type: application/json

--- response: 200 in 243 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:04 GMT
Etag: W/"b5-wuSznyz+HYvWF8VxLm8ByfnIK5M"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263144"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263144"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-38ce7527","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-c2868645-35ed-4c4e-83be-234ef616720a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2868645-35ed-4c4e-83be-234ef616720a
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 225 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:04 GMT
Etag: W/"1b-8LG87zSPMmob1NAT6fILu7WRexs"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263144"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263144"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4307
correlation: qa-6e2d9a46-5ea2-42f1-8c2a-1ce0a2e9e334

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-6e2d9a46-5ea2-42f1-8c2a-1ce0a2e9e334
Content-Type: application/json

--- response: 201 in 228 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263144"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263144"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4307
correlation: qa-a4bacc5c-a2b0-45b8-a1e3-57bb7590e328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4bacc5c-a2b0-45b8-a1e3-57bb7590e328
Content-Type: application/json

--- response: 404 in 243 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:05 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263145"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2BOuAl3sxaNS3qts2OkDZiPKXxG7ADOmCN17vI8F5lAk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263145"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
