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
| 1 | `POST /booking` | 200 | 722 | `qa-fb4993ca-5821-48ec-8998-7395c741c88c` |
| 2 | `PUT /booking/{id}` | 403 | 50 | `qa-1d1d7a3d-031a-4b4a-871f-59b1791a9583` |
| 3 | `GET /booking/{id}` | 200 | 50 | `qa-50a0b84b-4f17-4022-b749-7cc4937bf578` |
| 4 | `POST /auth` | 200 | 44 | `qa-827f5701-4ec9-4daa-a4b1-af924f49d154` |
| 5 | `DELETE /booking/{id}` | 201 | 42 | `qa-29a67110-a5e5-4d0c-8cd1-6cc48c48012b` |
| 6 | `GET /booking/{id}` | 404 | 38 | `qa-e9f05071-32b5-4996-9b06-5347a7b4d24c` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-fb4993ca-5821-48ec-8998-7395c741c88c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb4993ca-5821-48ec-8998-7395c741c88c
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-9c57316a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}

--- response: 200 in 722 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:28 GMT
Etag: W/"cf-CbyJdoCqa9kc6iCeOSMf833Jufc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ejYOz7r21O6C7yu7HVjNIqu8Df5zJYSRCa1v79nSAmU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957428"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ejYOz7r21O6C7yu7HVjNIqu8Df5zJYSRCa1v79nSAmU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957428"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5027,"booking":{"firstname":"Keep","lastname":"Guest-9c57316a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5027
correlation: qa-1d1d7a3d-031a-4b4a-871f-59b1791a9583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d1d7a3d-031a-4b4a-871f-59b1791a9583
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-228528ef","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}

--- response: 403 in 50 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:29 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=HEBa7fNlB5fBKKbNMTWoJidSX3wLt6xaZACJaSGZlyI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957429"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=HEBa7fNlB5fBKKbNMTWoJidSX3wLt6xaZACJaSGZlyI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957429"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5027
correlation: qa-50a0b84b-4f17-4022-b749-7cc4937bf578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50a0b84b-4f17-4022-b749-7cc4937bf578
Content-Type: application/json

--- response: 200 in 50 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:29 GMT
Etag: W/"b2-UtbHcxHF4KZMn/oGub86hidvrAU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=HEBa7fNlB5fBKKbNMTWoJidSX3wLt6xaZACJaSGZlyI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957429"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=HEBa7fNlB5fBKKbNMTWoJidSX3wLt6xaZACJaSGZlyI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957429"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-9c57316a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-827f5701-4ec9-4daa-a4b1-af924f49d154

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-827f5701-4ec9-4daa-a4b1-af924f49d154
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 44 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"1b-mjc2nFiJbpQUz2KS164x+yntDcQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/5027
correlation: qa-29a67110-a5e5-4d0c-8cd1-6cc48c48012b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-29a67110-a5e5-4d0c-8cd1-6cc48c48012b
Content-Type: application/json

--- response: 201 in 42 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/5027
correlation: qa-e9f05071-32b5-4996-9b06-5347a7b4d24c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9f05071-32b5-4996-9b06-5347a7b4d24c
Content-Type: application/json

--- response: 404 in 38 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
