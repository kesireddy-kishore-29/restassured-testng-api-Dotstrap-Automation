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
| 1 | `POST /booking` | 200 | 594 | `qa-5fdc8847-c13e-4c6b-aa7b-bc315b1a5455` |
| 2 | `PUT /booking/{id}` | 403 | 108 | `qa-f0ec0615-2d8a-42a1-8fb9-01e4ae9e019e` |
| 3 | `GET /booking/{id}` | 200 | 130 | `qa-8e14c1ee-87cf-40f2-b75f-8b5239c1ce5f` |
| 4 | `POST /auth` | 200 | 120 | `qa-5b1d7a27-24d9-4f5c-bb70-e4466ffbd3ec` |
| 5 | `DELETE /booking/{id}` | 201 | 116 | `qa-68d2c8e4-c824-443b-b46c-844d67a08a61` |
| 6 | `GET /booking/{id}` | 404 | 113 | `qa-389b01df-05f5-4426-97c2-55334e09ada9` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-5fdc8847-c13e-4c6b-aa7b-bc315b1a5455

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fdc8847-c13e-4c6b-aa7b-bc315b1a5455
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-b8d73263","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 594 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:51 GMT
Etag: W/"cf-JQ2mcpmPb+cxGCG45i6K8+AimY8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=q6fXzmV%2Bxu%2FajUAGrsAJPMc8diMs8qYl7hgWXLkC%2FEo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777191"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=q6fXzmV%2Bxu%2FajUAGrsAJPMc8diMs8qYl7hgWXLkC%2FEo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777191"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5884,"booking":{"firstname":"Keep","lastname":"Guest-b8d73263","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5884
correlation: qa-f0ec0615-2d8a-42a1-8fb9-01e4ae9e019e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0ec0615-2d8a-42a1-8fb9-01e4ae9e019e
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-f1846a9d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}

--- response: 403 in 108 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:51 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=q6fXzmV%2Bxu%2FajUAGrsAJPMc8diMs8qYl7hgWXLkC%2FEo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777191"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=q6fXzmV%2Bxu%2FajUAGrsAJPMc8diMs8qYl7hgWXLkC%2FEo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777191"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5884
correlation: qa-8e14c1ee-87cf-40f2-b75f-8b5239c1ce5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e14c1ee-87cf-40f2-b75f-8b5239c1ce5f
Content-Type: application/json

--- response: 200 in 130 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:51 GMT
Etag: W/"b2-Kuk2rlkgX7g1mKZ5gylKyzdstAA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=q6fXzmV%2Bxu%2FajUAGrsAJPMc8diMs8qYl7hgWXLkC%2FEo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777191"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=q6fXzmV%2Bxu%2FajUAGrsAJPMc8diMs8qYl7hgWXLkC%2FEo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777191"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-b8d73263","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-5b1d7a27-24d9-4f5c-bb70-e4466ffbd3ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b1d7a27-24d9-4f5c-bb70-e4466ffbd3ec
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 120 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"1b-VsPMP0CXtW1wdBvYDwXxzN7UDCE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/5884
correlation: qa-68d2c8e4-c824-443b-b46c-844d67a08a61

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-68d2c8e4-c824-443b-b46c-844d67a08a61
Content-Type: application/json

--- response: 201 in 116 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/5884
correlation: qa-389b01df-05f5-4426-97c2-55334e09ada9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-389b01df-05f5-4426-97c2-55334e09ada9
Content-Type: application/json

--- response: 404 in 113 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
