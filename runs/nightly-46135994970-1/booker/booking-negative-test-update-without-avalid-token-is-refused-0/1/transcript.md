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
| 1 | `POST /booking` | 200 | 616 | `qa-0a14dc95-9cb4-40d7-af86-169128700a7e` |
| 2 | `PUT /booking/{id}` | 403 | 41 | `qa-73523577-f847-4398-aaa4-558d110cc136` |
| 3 | `GET /booking/{id}` | 200 | 46 | `qa-f7151530-f987-4f0d-b7b9-3e2dba4caa4f` |
| 4 | `POST /auth` | 200 | 53 | `qa-9ba8de38-27fd-4c28-997f-e43033f48d01` |
| 5 | `DELETE /booking/{id}` | 201 | 40 | `qa-a75c25e9-1c73-48a1-a9ec-11a0a41c2f15` |
| 6 | `GET /booking/{id}` | 404 | 34 | `qa-d4ce4855-65d4-4ace-b213-0bf079f3d644` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-0a14dc95-9cb4-40d7-af86-169128700a7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a14dc95-9cb4-40d7-af86-169128700a7e
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-8c5d4fc9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}

--- response: 200 in 616 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:10 GMT
Etag: W/"cf-x9WDpEaRRf5LFED0Pm61VcvFDOw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=XLxPBEWkZCBiHCr%2F74qFZtK0Z9M9DWrm2wd5jx0guM8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862230"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=XLxPBEWkZCBiHCr%2F74qFZtK0Z9M9DWrm2wd5jx0guM8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862230"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3187,"booking":{"firstname":"Keep","lastname":"Guest-8c5d4fc9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3187
correlation: qa-73523577-f847-4398-aaa4-558d110cc136

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73523577-f847-4398-aaa4-558d110cc136
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-c6f863bf","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}

--- response: 403 in 41 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:11 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862231"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862231"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3187
correlation: qa-f7151530-f987-4f0d-b7b9-3e2dba4caa4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7151530-f987-4f0d-b7b9-3e2dba4caa4f
Content-Type: application/json

--- response: 200 in 46 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:11 GMT
Etag: W/"b2-AC8Zn9LsIRBZetXutKIJvt52++U"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862231"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862231"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-8c5d4fc9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-9ba8de38-27fd-4c28-997f-e43033f48d01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba8de38-27fd-4c28-997f-e43033f48d01
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 53 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:11 GMT
Etag: W/"1b-WHgJSyefqjE1NNNlvevKNVdhgIo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862231"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862231"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/3187
correlation: qa-a75c25e9-1c73-48a1-a9ec-11a0a41c2f15

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a75c25e9-1c73-48a1-a9ec-11a0a41c2f15
Content-Type: application/json

--- response: 201 in 40 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:11 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862231"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=V8xWdhpElpGzrnCn8W%2BpmG704ydLsjXcdbaoq6D%2Fnts%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862231"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/3187
correlation: qa-d4ce4855-65d4-4ace-b213-0bf079f3d644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4ce4855-65d4-4ace-b213-0bf079f3d644
Content-Type: application/json

--- response: 404 in 34 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
