# Transcript: An update without a valid token is refused and changes nothing [Optional[not-a-real-token]]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[1]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 255 | `qa-b7a0ca47-6c92-4960-a21e-ca9395f75fbc` |
| 2 | `PUT /booking/{id}` | 403 | 238 | `qa-a8bacedf-ebc5-4c09-9529-df862baa61e1` |
| 3 | `GET /booking/{id}` | 200 | 258 | `qa-4c044cb9-6532-40f2-ae97-fc3b722e3826` |
| 4 | `DELETE /booking/{id}` | 201 | 254 | `qa-66c63893-f614-49a8-a64a-cc36a241f0ef` |
| 5 | `GET /booking/{id}` | 404 | 233 | `qa-9b54008d-8189-43f4-9502-ff53125144d2` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-b7a0ca47-6c92-4960-a21e-ca9395f75fbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7a0ca47-6c92-4960-a21e-ca9395f75fbc
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-e4a8a75a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}

--- response: 200 in 255 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:15 GMT
Etag: W/"cf-E6KpBLSEI2EyQYiXNMf6Mr+/0R0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647115"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647115"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2081,"booking":{"firstname":"Keep","lastname":"Guest-e4a8a75a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2081
correlation: qa-a8bacedf-ebc5-4c09-9529-df862baa61e1

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a8bacedf-ebc5-4c09-9529-df862baa61e1
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-8541a0ab","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}

--- response: 403 in 238 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:15 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647115"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647115"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2081
correlation: qa-4c044cb9-6532-40f2-ae97-fc3b722e3826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c044cb9-6532-40f2-ae97-fc3b722e3826
Content-Type: application/json

--- response: 200 in 258 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:16 GMT
Etag: W/"b2-jwgFXJcIO1zKD0IsKGonY+ilH+k"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647116"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647116"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-e4a8a75a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2081
correlation: qa-66c63893-f614-49a8-a64a-cc36a241f0ef

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-66c63893-f614-49a8-a64a-cc36a241f0ef
Content-Type: application/json

--- response: 201 in 254 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:16 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647116"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647116"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2081
correlation: qa-9b54008d-8189-43f4-9502-ff53125144d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b54008d-8189-43f4-9502-ff53125144d2
Content-Type: application/json

--- response: 404 in 233 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:16 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647116"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647116"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
