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
| 1 | `POST /booking` | 200 | 193 | `qa-51eb4264-2b52-4812-a2e0-fbdb3ba43358` |
| 2 | `PUT /booking/{id}` | 403 | 203 | `qa-4a7bf912-c2be-4f28-ad51-92490630a578` |
| 3 | `GET /booking/{id}` | 200 | 193 | `qa-b007f863-3850-401d-bfe2-3d14b4f0ac36` |
| 4 | `DELETE /booking/{id}` | 201 | 194 | `qa-43b13182-072b-43dd-8d10-e2a22b355ade` |
| 5 | `GET /booking/{id}` | 404 | 192 | `qa-d2871a20-4015-464f-a860-06441b813bf2` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-51eb4264-2b52-4812-a2e0-fbdb3ba43358

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51eb4264-2b52-4812-a2e0-fbdb3ba43358
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-57b7ba09","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 193 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:31 GMT
Etag: W/"cf-mgMUUErdf7LVopzzVCfcNmrKNAg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CT8JeQ%2FC75jG%2BfKg7HmOGZ%2F8t7h6AdHl8Rf4ng5I0pU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914031"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CT8JeQ%2FC75jG%2BfKg7HmOGZ%2F8t7h6AdHl8Rf4ng5I0pU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914031"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5112,"booking":{"firstname":"Keep","lastname":"Guest-57b7ba09","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5112
correlation: qa-4a7bf912-c2be-4f28-ad51-92490630a578

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-4a7bf912-c2be-4f28-ad51-92490630a578
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-23df47a8","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}

--- response: 403 in 203 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:31 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CT8JeQ%2FC75jG%2BfKg7HmOGZ%2F8t7h6AdHl8Rf4ng5I0pU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914031"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CT8JeQ%2FC75jG%2BfKg7HmOGZ%2F8t7h6AdHl8Rf4ng5I0pU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914031"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5112
correlation: qa-b007f863-3850-401d-bfe2-3d14b4f0ac36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b007f863-3850-401d-bfe2-3d14b4f0ac36
Content-Type: application/json

--- response: 200 in 193 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:31 GMT
Etag: W/"b2-Yw4Le3jB5lUY+RMqrS3DY3OZTlE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CT8JeQ%2FC75jG%2BfKg7HmOGZ%2F8t7h6AdHl8Rf4ng5I0pU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914031"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CT8JeQ%2FC75jG%2BfKg7HmOGZ%2F8t7h6AdHl8Rf4ng5I0pU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914031"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-57b7ba09","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5112
correlation: qa-43b13182-072b-43dd-8d10-e2a22b355ade

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-43b13182-072b-43dd-8d10-e2a22b355ade
Content-Type: application/json

--- response: 201 in 194 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:32 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EWcewhJC6JDy4Z8BwY3DUJ81kLAY1oK1fNFhykBVllo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914032"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EWcewhJC6JDy4Z8BwY3DUJ81kLAY1oK1fNFhykBVllo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914032"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5112
correlation: qa-d2871a20-4015-464f-a860-06441b813bf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2871a20-4015-464f-a860-06441b813bf2
Content-Type: application/json

--- response: 404 in 192 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:32 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EWcewhJC6JDy4Z8BwY3DUJ81kLAY1oK1fNFhykBVllo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914032"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EWcewhJC6JDy4Z8BwY3DUJ81kLAY1oK1fNFhykBVllo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914032"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
