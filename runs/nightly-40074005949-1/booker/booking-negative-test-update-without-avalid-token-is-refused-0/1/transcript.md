# Transcript: An update without a valid token is refused and changes nothing [Optional.empty]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[0]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 223 | `qa-530b5ad9-f26d-4721-85ed-d20c50ad292a` |
| 2 | `PUT /booking/{id}` | 403 | 255 | `qa-bff1594a-5b77-4e90-89b4-cb7d4c4f8c0b` |
| 3 | `GET /booking/{id}` | 200 | 241 | `qa-a8675009-eaf0-4900-8d22-801988ae12e7` |
| 4 | `DELETE /booking/{id}` | 201 | 243 | `qa-ab34738c-bacd-4d80-9d54-e5780813b5ae` |
| 5 | `GET /booking/{id}` | 404 | 224 | `qa-5410982d-6cd3-4881-9e0c-c8cc2bcd62c3` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-530b5ad9-f26d-4721-85ed-d20c50ad292a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-530b5ad9-f26d-4721-85ed-d20c50ad292a
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-6a7826ee","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}

--- response: 200 in 223 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:06 GMT
Etag: W/"cf-2tkCl0BdGfArdOFQHojozlZTmoQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=fEZYMJI76TBggV7ouCBInL4kUCki41ukW9MwNhyHH1A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=fEZYMJI76TBggV7ouCBInL4kUCki41ukW9MwNhyHH1A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2232,"booking":{"firstname":"Keep","lastname":"Guest-6a7826ee","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2232
correlation: qa-bff1594a-5b77-4e90-89b4-cb7d4c4f8c0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bff1594a-5b77-4e90-89b4-cb7d4c4f8c0b
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-32ccd0c4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}

--- response: 403 in 255 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:06 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=fEZYMJI76TBggV7ouCBInL4kUCki41ukW9MwNhyHH1A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=fEZYMJI76TBggV7ouCBInL4kUCki41ukW9MwNhyHH1A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2232
correlation: qa-a8675009-eaf0-4900-8d22-801988ae12e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8675009-eaf0-4900-8d22-801988ae12e7
Content-Type: application/json

--- response: 200 in 241 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:07 GMT
Etag: W/"b2-yCmEWWiMvUIRpdginsJGnM95OI0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BmyGwvwC2tiVNauriWgaiPLCAxKDfzHu%2BvVnXBFD5nQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BmyGwvwC2tiVNauriWgaiPLCAxKDfzHu%2BvVnXBFD5nQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-6a7826ee","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2232
correlation: qa-ab34738c-bacd-4d80-9d54-e5780813b5ae

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-ab34738c-bacd-4d80-9d54-e5780813b5ae
Content-Type: application/json

--- response: 201 in 243 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:07 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BmyGwvwC2tiVNauriWgaiPLCAxKDfzHu%2BvVnXBFD5nQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BmyGwvwC2tiVNauriWgaiPLCAxKDfzHu%2BvVnXBFD5nQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2232
correlation: qa-5410982d-6cd3-4881-9e0c-c8cc2bcd62c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5410982d-6cd3-4881-9e0c-c8cc2bcd62c3
Content-Type: application/json

--- response: 404 in 224 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:07 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BmyGwvwC2tiVNauriWgaiPLCAxKDfzHu%2BvVnXBFD5nQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BmyGwvwC2tiVNauriWgaiPLCAxKDfzHu%2BvVnXBFD5nQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
