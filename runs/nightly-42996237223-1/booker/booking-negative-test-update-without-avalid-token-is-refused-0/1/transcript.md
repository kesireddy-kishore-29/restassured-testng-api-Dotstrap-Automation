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
| 1 | `POST /booking` | 200 | 508 | `qa-25a6b49b-1328-4a43-bdbf-48eccc5b645d` |
| 2 | `PUT /booking/{id}` | 403 | 126 | `qa-9617b6b7-e013-4e11-a542-77eac93c0115` |
| 3 | `GET /booking/{id}` | 200 | 142 | `qa-27f85a0e-74eb-437a-8fc1-393f15657c56` |
| 4 | `POST /auth` | 200 | 134 | `qa-81ed675b-7442-44aa-b62b-c9cdc91a82aa` |
| 5 | `DELETE /booking/{id}` | 201 | 123 | `qa-a66fe86d-e1ad-4e7d-bca9-f141aca40505` |
| 6 | `GET /booking/{id}` | 404 | 124 | `qa-0a758508-78da-4816-91aa-990d396566cc` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-25a6b49b-1328-4a43-bdbf-48eccc5b645d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25a6b49b-1328-4a43-bdbf-48eccc5b645d
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-c9ae36c1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}

--- response: 200 in 508 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:18 GMT
Etag: W/"cf-Ia699d5I0gcmdfQFpJYJujLWW1E"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389658"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389658"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1887,"booking":{"firstname":"Keep","lastname":"Guest-c9ae36c1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1887
correlation: qa-9617b6b7-e013-4e11-a542-77eac93c0115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9617b6b7-e013-4e11-a542-77eac93c0115
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-8ca0f092","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}

--- response: 403 in 126 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:18 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389658"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389658"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1887
correlation: qa-27f85a0e-74eb-437a-8fc1-393f15657c56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27f85a0e-74eb-437a-8fc1-393f15657c56
Content-Type: application/json

--- response: 200 in 142 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:18 GMT
Etag: W/"b2-oICjP34CweTlMqi866vMnm0J99I"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389658"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389658"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-c9ae36c1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-81ed675b-7442-44aa-b62b-c9cdc91a82aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81ed675b-7442-44aa-b62b-c9cdc91a82aa
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 134 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:18 GMT
Etag: W/"1b-9HuW0gMdIbu16UXGO8GsHd5hwLI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389658"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389658"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/1887
correlation: qa-a66fe86d-e1ad-4e7d-bca9-f141aca40505

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a66fe86d-e1ad-4e7d-bca9-f141aca40505
Content-Type: application/json

--- response: 201 in 123 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/1887
correlation: qa-0a758508-78da-4816-91aa-990d396566cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a758508-78da-4816-91aa-990d396566cc
Content-Type: application/json

--- response: 404 in 124 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:19 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389659"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DMiaDkU8O%2BLej%2FQPJndqpVGb60zEnMcZzsa4GyI05fw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389659"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
