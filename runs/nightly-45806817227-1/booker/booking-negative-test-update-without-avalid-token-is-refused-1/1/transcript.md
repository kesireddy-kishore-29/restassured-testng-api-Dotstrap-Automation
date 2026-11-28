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
| 1 | `POST /booking` | 200 | 93 | `qa-7808a1a1-8e2a-48a5-8ea1-eb1c65ef9963` |
| 2 | `PUT /booking/{id}` | 403 | 107 | `qa-cc60b406-d2bb-4045-846f-9ac1a5d00b47` |
| 3 | `GET /booking/{id}` | 200 | 89 | `qa-310f9c8c-4de0-4030-b45b-58525027c6e2` |
| 4 | `DELETE /booking/{id}` | 201 | 108 | `qa-715b8962-9c00-496c-9235-a35bdb20b583` |
| 5 | `GET /booking/{id}` | 404 | 132 | `qa-541ba671-088e-4af1-a265-68c5812d0f6d` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-7808a1a1-8e2a-48a5-8ea1-eb1c65ef9963

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7808a1a1-8e2a-48a5-8ea1-eb1c65ef9963
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-cbb4e71e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 93 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"ce-lP4mJfKpPNy3FlIQK9PDnyGELMY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":652,"booking":{"firstname":"Keep","lastname":"Guest-cbb4e71e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/652
correlation: qa-cc60b406-d2bb-4045-846f-9ac1a5d00b47

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-cc60b406-d2bb-4045-846f-9ac1a5d00b47
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-8a9a81e3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}

--- response: 403 in 107 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/652
correlation: qa-310f9c8c-4de0-4030-b45b-58525027c6e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-310f9c8c-4de0-4030-b45b-58525027c6e2
Content-Type: application/json

--- response: 200 in 89 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"b2-uv34r3tM9wZT/sO7s3gpx5wjORM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-cbb4e71e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/652
correlation: qa-715b8962-9c00-496c-9235-a35bdb20b583

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-715b8962-9c00-496c-9235-a35bdb20b583
Content-Type: application/json

--- response: 201 in 108 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/652
correlation: qa-541ba671-088e-4af1-a265-68c5812d0f6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-541ba671-088e-4af1-a265-68c5812d0f6d
Content-Type: application/json

--- response: 404 in 132 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
