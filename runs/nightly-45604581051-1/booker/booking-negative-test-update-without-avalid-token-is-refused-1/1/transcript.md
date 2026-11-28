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
| 1 | `POST /booking` | 200 | 113 | `qa-01fe639b-be2e-47f7-a272-bbc382a97e59` |
| 2 | `PUT /booking/{id}` | 403 | 94 | `qa-8003f56a-3cae-4723-b684-da95ce764b6b` |
| 3 | `GET /booking/{id}` | 200 | 103 | `qa-506cd622-3d38-4f32-b7fb-a130c42d9ea5` |
| 4 | `DELETE /booking/{id}` | 201 | 98 | `qa-29596841-9612-4115-bc06-4a65de8df084` |
| 5 | `GET /booking/{id}` | 404 | 89 | `qa-6d0b1797-bfde-4957-aaa2-00e16d4ad324` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-01fe639b-be2e-47f7-a272-bbc382a97e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01fe639b-be2e-47f7-a272-bbc382a97e59
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-ddc96c4c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 113 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"cf-Zeq8feVZ3fZBD8dwNAdCPa1k5fc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3522,"booking":{"firstname":"Keep","lastname":"Guest-ddc96c4c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3522
correlation: qa-8003f56a-3cae-4723-b684-da95ce764b6b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8003f56a-3cae-4723-b684-da95ce764b6b
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-4d32f028","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}

--- response: 403 in 94 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3522
correlation: qa-506cd622-3d38-4f32-b7fb-a130c42d9ea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506cd622-3d38-4f32-b7fb-a130c42d9ea5
Content-Type: application/json

--- response: 200 in 103 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:44 GMT
Etag: W/"b2-6RDSPJ6JsIiKvXEjUM7GJxK9FGg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606064"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=qYjwbWQ%2BkLQLj16aCfnAsln82hKf%2FHRb4yHVpU5RWoU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606064"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-ddc96c4c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3522
correlation: qa-29596841-9612-4115-bc06-4a65de8df084

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-29596841-9612-4115-bc06-4a65de8df084
Content-Type: application/json

--- response: 201 in 98 ms ---
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
#5 GET https://restful-booker.herokuapp.com/booking/3522
correlation: qa-6d0b1797-bfde-4957-aaa2-00e16d4ad324

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d0b1797-bfde-4957-aaa2-00e16d4ad324
Content-Type: application/json

--- response: 404 in 89 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:45 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606065"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606065"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
