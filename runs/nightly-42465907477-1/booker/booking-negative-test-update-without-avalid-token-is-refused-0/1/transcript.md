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
| 1 | `POST /booking` | 200 | 474 | `qa-044f5f5a-234a-4c81-bb47-e81073bd0aee` |
| 2 | `PUT /booking/{id}` | 403 | 33 | `qa-3afddb51-ef5e-4595-8ea0-6ee0428ffda5` |
| 3 | `GET /booking/{id}` | 200 | 33 | `qa-228a1c67-63d9-4e48-b4d6-ee69c4e6bb70` |
| 4 | `POST /auth` | 200 | 27 | `qa-fe3941d4-5f6a-4548-9dfa-51aef6a6b2ee` |
| 5 | `DELETE /booking/{id}` | 201 | 26 | `qa-002457a5-2251-47cf-beb0-d15235a36e5a` |
| 6 | `GET /booking/{id}` | 404 | 38 | `qa-242b5d52-35ba-4273-9e85-063a4498c0bc` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-044f5f5a-234a-4c81-bb47-e81073bd0aee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-044f5f5a-234a-4c81-bb47-e81073bd0aee
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-dc0d4198","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}

--- response: 200 in 474 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:03 GMT
Etag: W/"cf-xWpvDlC0g4YD8XOvhduEroR6FMs"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GbYboOpcqy%2BECOnAIsy9oS%2BcpvBv5td7tRX6JCbNe4M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128943"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GbYboOpcqy%2BECOnAIsy9oS%2BcpvBv5td7tRX6JCbNe4M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128943"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3941,"booking":{"firstname":"Keep","lastname":"Guest-dc0d4198","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3941
correlation: qa-3afddb51-ef5e-4595-8ea0-6ee0428ffda5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3afddb51-ef5e-4595-8ea0-6ee0428ffda5
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-aa5339f1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}

--- response: 403 in 33 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:03 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GbYboOpcqy%2BECOnAIsy9oS%2BcpvBv5td7tRX6JCbNe4M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128943"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GbYboOpcqy%2BECOnAIsy9oS%2BcpvBv5td7tRX6JCbNe4M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128943"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3941
correlation: qa-228a1c67-63d9-4e48-b4d6-ee69c4e6bb70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-228a1c67-63d9-4e48-b4d6-ee69c4e6bb70
Content-Type: application/json

--- response: 200 in 33 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"b2-sAmetUoqRBBAJ39V83BBjymGyXY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-dc0d4198","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-fe3941d4-5f6a-4548-9dfa-51aef6a6b2ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe3941d4-5f6a-4548-9dfa-51aef6a6b2ee
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 27 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"1b-xvH5jEDNARwV+FbNtzPbstQQdUo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/3941
correlation: qa-002457a5-2251-47cf-beb0-d15235a36e5a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-002457a5-2251-47cf-beb0-d15235a36e5a
Content-Type: application/json

--- response: 201 in 26 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/3941
correlation: qa-242b5d52-35ba-4273-9e85-063a4498c0bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-242b5d52-35ba-4273-9e85-063a4498c0bc
Content-Type: application/json

--- response: 404 in 38 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
