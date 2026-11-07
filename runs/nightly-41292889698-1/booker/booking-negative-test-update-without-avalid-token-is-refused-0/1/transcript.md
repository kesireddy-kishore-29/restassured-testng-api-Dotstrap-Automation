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
| 1 | `POST /booking` | 200 | 804 | `qa-90b70128-0e7d-45ff-905a-356c14af6d9f` |
| 2 | `PUT /booking/{id}` | 403 | 151 | `qa-4b8028ac-d9e7-4a74-a2d7-d6495880f92e` |
| 3 | `GET /booking/{id}` | 200 | 279 | `qa-e706e20a-5f21-4d6d-a33d-1768c116ac48` |
| 4 | `POST /auth` | 200 | 175 | `qa-e2fd0f5f-93bc-4588-8233-63ffb8baa570` |
| 5 | `DELETE /booking/{id}` | 201 | 265 | `qa-971a8c96-1988-489a-93d4-421621163714` |
| 6 | `GET /booking/{id}` | 404 | 150 | `qa-d922eb9d-aeae-48f2-a7d2-4d58f9082aee` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-90b70128-0e7d-45ff-905a-356c14af6d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90b70128-0e7d-45ff-905a-356c14af6d9f
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-0ad31ea7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}

--- response: 200 in 804 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:25 GMT
Etag: W/"cf-E0BKwwuZsp2wPV0IkGcdpgX/bww"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=mLOTWp5khhMw%2FB%2BHclP3VBX1pxWSauV55EK98A%2BX534%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525005"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=mLOTWp5khhMw%2FB%2BHclP3VBX1pxWSauV55EK98A%2BX534%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525005"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1341,"booking":{"firstname":"Keep","lastname":"Guest-0ad31ea7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1341
correlation: qa-4b8028ac-d9e7-4a74-a2d7-d6495880f92e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b8028ac-d9e7-4a74-a2d7-d6495880f92e
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-cdd38edc","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}

--- response: 403 in 151 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:26 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=yLgyV4xJ2BZ5RDTF3QTj3WqtnAOc8tZr3MAizu%2BRPC8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525006"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=yLgyV4xJ2BZ5RDTF3QTj3WqtnAOc8tZr3MAizu%2BRPC8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525006"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1341
correlation: qa-e706e20a-5f21-4d6d-a33d-1768c116ac48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e706e20a-5f21-4d6d-a33d-1768c116ac48
Content-Type: application/json

--- response: 200 in 279 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:26 GMT
Etag: W/"b2-3QSsMSkPqczD++vGdBdjmEgcGTA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=yLgyV4xJ2BZ5RDTF3QTj3WqtnAOc8tZr3MAizu%2BRPC8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525006"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=yLgyV4xJ2BZ5RDTF3QTj3WqtnAOc8tZr3MAizu%2BRPC8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525006"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-0ad31ea7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-e2fd0f5f-93bc-4588-8233-63ffb8baa570

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2fd0f5f-93bc-4588-8233-63ffb8baa570
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 175 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:27 GMT
Etag: W/"1b-ceqfjPZZAKJx37CHz1jtCINlbZg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525007"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525007"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/1341
correlation: qa-971a8c96-1988-489a-93d4-421621163714

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-971a8c96-1988-489a-93d4-421621163714
Content-Type: application/json

--- response: 201 in 265 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:27 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525007"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525007"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/1341
correlation: qa-d922eb9d-aeae-48f2-a7d2-4d58f9082aee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d922eb9d-aeae-48f2-a7d2-4d58f9082aee
Content-Type: application/json

--- response: 404 in 150 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:27 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525007"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NZ7UdKvbMmoBn6Cx9HQMqHzg31RHqzgM%2FOBiCTxCJQg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525007"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
