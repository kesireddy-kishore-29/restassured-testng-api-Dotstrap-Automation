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
| 1 | `POST /booking` | 200 | 399 | `qa-357907e5-2caf-4cfd-9e16-0f66b1ff52c0` |
| 2 | `PUT /booking/{id}` | 403 | 45 | `qa-f6898e45-7358-46f4-be2b-6d6a2938c00d` |
| 3 | `GET /booking/{id}` | 200 | 41 | `qa-55847526-114e-4240-8346-5117f2da4109` |
| 4 | `POST /auth` | 200 | 43 | `qa-67d7ae07-059e-4e97-9b45-17e9054766ff` |
| 5 | `DELETE /booking/{id}` | 201 | 37 | `qa-c67869b8-ccb5-48ec-a41a-35f0488b34c3` |
| 6 | `GET /booking/{id}` | 404 | 35 | `qa-fbd25d9f-3a31-4ae5-830a-8ed2ac7fab34` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-357907e5-2caf-4cfd-9e16-0f66b1ff52c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-357907e5-2caf-4cfd-9e16-0f66b1ff52c0
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-501fcc7b","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}

--- response: 200 in 399 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:38 GMT
Etag: W/"cf-0WOxy5xLhvdNfCXs91lzGOTtsNo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=5Lq0MdVTplNUMancFkZCU6Z9USj%2Bbg%2FHlZVVGqiscVA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822818"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=5Lq0MdVTplNUMancFkZCU6Z9USj%2Bbg%2FHlZVVGqiscVA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822818"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1431,"booking":{"firstname":"Keep","lastname":"Guest-501fcc7b","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1431
correlation: qa-f6898e45-7358-46f4-be2b-6d6a2938c00d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6898e45-7358-46f4-be2b-6d6a2938c00d
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-55b11e19","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}

--- response: 403 in 45 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:38 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=5Lq0MdVTplNUMancFkZCU6Z9USj%2Bbg%2FHlZVVGqiscVA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822818"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=5Lq0MdVTplNUMancFkZCU6Z9USj%2Bbg%2FHlZVVGqiscVA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822818"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1431
correlation: qa-55847526-114e-4240-8346-5117f2da4109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55847526-114e-4240-8346-5117f2da4109
Content-Type: application/json

--- response: 200 in 41 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:38 GMT
Etag: W/"b2-5XyDUeEVhn2naGuGOLKAHp8GJ0g"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=5Lq0MdVTplNUMancFkZCU6Z9USj%2Bbg%2FHlZVVGqiscVA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822818"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=5Lq0MdVTplNUMancFkZCU6Z9USj%2Bbg%2FHlZVVGqiscVA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822818"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-501fcc7b","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-67d7ae07-059e-4e97-9b45-17e9054766ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67d7ae07-059e-4e97-9b45-17e9054766ff
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 43 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"1b-pm5nszeN2IwkHUcaidRlrqjBiso"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/1431
correlation: qa-c67869b8-ccb5-48ec-a41a-35f0488b34c3

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c67869b8-ccb5-48ec-a41a-35f0488b34c3
Content-Type: application/json

--- response: 201 in 37 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/1431
correlation: qa-fbd25d9f-3a31-4ae5-830a-8ed2ac7fab34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbd25d9f-3a31-4ae5-830a-8ed2ac7fab34
Content-Type: application/json

--- response: 404 in 35 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
