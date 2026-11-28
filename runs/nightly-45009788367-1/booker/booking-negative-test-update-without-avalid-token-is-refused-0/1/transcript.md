# Transcript: An update without a valid token is refused and changes nothing [Optional.empty]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[0]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 895 | `qa-9943c680-e513-4186-a8cd-47487a00f997` |
| 2 | `PUT /booking/{id}` | 403 | 262 | `qa-351eaedc-7857-47c7-970c-98c0a1cd64f4` |
| 3 | `GET /booking/{id}` | 200 | 242 | `qa-00365e39-09a5-4876-8a96-d60b662385f9` |
| 4 | `POST /auth` | 200 | 227 | `qa-0bad5c34-013a-4535-8fdd-ace5b96ada5c` |
| 5 | `DELETE /booking/{id}` | 201 | 225 | `qa-293338a1-e8dd-4c28-bd9a-bc49a656b8d2` |
| 6 | `GET /booking/{id}` | 404 | 260 | `qa-3e3c4e4e-7e59-4b54-afc2-dc6306e379d4` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-9943c680-e513-4186-a8cd-47487a00f997

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9943c680-e513-4186-a8cd-47487a00f997
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-3d5529b0","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 895 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:53 GMT
Etag: W/"cf-8FqxgLmEfqv2Wz9NpBAGnNsJZRU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ys28fPBpoy2x0UiJOeI6XdcuKuXRq4hnqIe0iUS7wMQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341293"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ys28fPBpoy2x0UiJOeI6XdcuKuXRq4hnqIe0iUS7wMQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341293"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2112,"booking":{"firstname":"Keep","lastname":"Guest-3d5529b0","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2112
correlation: qa-351eaedc-7857-47c7-970c-98c0a1cd64f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-351eaedc-7857-47c7-970c-98c0a1cd64f4
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-6c450622","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}

--- response: 403 in 262 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:53 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ys28fPBpoy2x0UiJOeI6XdcuKuXRq4hnqIe0iUS7wMQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341293"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ys28fPBpoy2x0UiJOeI6XdcuKuXRq4hnqIe0iUS7wMQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341293"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2112
correlation: qa-00365e39-09a5-4876-8a96-d60b662385f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00365e39-09a5-4876-8a96-d60b662385f9
Content-Type: application/json

--- response: 200 in 242 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:53 GMT
Etag: W/"b2-VX9bLLyz8r/GDLaKwTu6w7b+FBY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ys28fPBpoy2x0UiJOeI6XdcuKuXRq4hnqIe0iUS7wMQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341293"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ys28fPBpoy2x0UiJOeI6XdcuKuXRq4hnqIe0iUS7wMQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341293"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-3d5529b0","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-0bad5c34-013a-4535-8fdd-ace5b96ada5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bad5c34-013a-4535-8fdd-ace5b96ada5c
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 227 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:54 GMT
Etag: W/"1b-em8wzXNnBZwIqaVs9w9sLTsPeCw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hCQVhKI1OFsHdlfEUIjp3i%2BvNbtuZiVvIYp49CfzcBU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hCQVhKI1OFsHdlfEUIjp3i%2BvNbtuZiVvIYp49CfzcBU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/2112
correlation: qa-293338a1-e8dd-4c28-bd9a-bc49a656b8d2

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-293338a1-e8dd-4c28-bd9a-bc49a656b8d2
Content-Type: application/json

--- response: 201 in 225 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:54 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hCQVhKI1OFsHdlfEUIjp3i%2BvNbtuZiVvIYp49CfzcBU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hCQVhKI1OFsHdlfEUIjp3i%2BvNbtuZiVvIYp49CfzcBU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/2112
correlation: qa-3e3c4e4e-7e59-4b54-afc2-dc6306e379d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e3c4e4e-7e59-4b54-afc2-dc6306e379d4
Content-Type: application/json

--- response: 404 in 260 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:55 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=P4A9IrrikPrrf7Qfklg3GEcLKcn%2FkWE%2BmzVXxiVOtG0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
