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
| 1 | `POST /booking` | 200 | 193 | `qa-d37dafab-c0c2-4093-8bd8-f38cd041f372` |
| 2 | `PUT /booking/{id}` | 403 | 194 | `qa-a6884f96-d3d3-4943-86d6-3969170c4946` |
| 3 | `GET /booking/{id}` | 200 | 199 | `qa-781d2548-3ba6-4c81-846a-b29a37c570e9` |
| 4 | `DELETE /booking/{id}` | 201 | 198 | `qa-10e611cd-72a7-4ad1-a6ff-a7450802bebc` |
| 5 | `GET /booking/{id}` | 404 | 207 | `qa-6226d125-18f0-414d-81cf-1ed54d996cba` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d37dafab-c0c2-4093-8bd8-f38cd041f372

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d37dafab-c0c2-4093-8bd8-f38cd041f372
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-0ea8de90","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 193 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:36 GMT
Etag: W/"ce-Fmc745hyLRsl2N/gg+g9mzd5Qho"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NsBwuFMrxMUmCG34gISLVLTq4ICB%2Fb0%2BFavPEO4A1Xw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741296"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NsBwuFMrxMUmCG34gISLVLTq4ICB%2Fb0%2BFavPEO4A1Xw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741296"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":336,"booking":{"firstname":"Keep","lastname":"Guest-0ea8de90","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/336
correlation: qa-a6884f96-d3d3-4943-86d6-3969170c4946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6884f96-d3d3-4943-86d6-3969170c4946
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-1647e35b","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}

--- response: 403 in 194 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:36 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NsBwuFMrxMUmCG34gISLVLTq4ICB%2Fb0%2BFavPEO4A1Xw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741296"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NsBwuFMrxMUmCG34gISLVLTq4ICB%2Fb0%2BFavPEO4A1Xw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741296"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/336
correlation: qa-781d2548-3ba6-4c81-846a-b29a37c570e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-781d2548-3ba6-4c81-846a-b29a37c570e9
Content-Type: application/json

--- response: 200 in 199 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:36 GMT
Etag: W/"b2-Aj0vPyExXGOYiSu9UUB1mTn4fSk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NsBwuFMrxMUmCG34gISLVLTq4ICB%2Fb0%2BFavPEO4A1Xw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741296"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NsBwuFMrxMUmCG34gISLVLTq4ICB%2Fb0%2BFavPEO4A1Xw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741296"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-0ea8de90","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/336
correlation: qa-10e611cd-72a7-4ad1-a6ff-a7450802bebc

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-10e611cd-72a7-4ad1-a6ff-a7450802bebc
Content-Type: application/json

--- response: 201 in 198 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:37 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=32YczEKDVEdHel5B9eNIDRAj3LKufqYiQTWVikXy8jc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741297"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=32YczEKDVEdHel5B9eNIDRAj3LKufqYiQTWVikXy8jc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741297"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/336
correlation: qa-6226d125-18f0-414d-81cf-1ed54d996cba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6226d125-18f0-414d-81cf-1ed54d996cba
Content-Type: application/json

--- response: 404 in 207 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=32YczEKDVEdHel5B9eNIDRAj3LKufqYiQTWVikXy8jc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741297"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=32YczEKDVEdHel5B9eNIDRAj3LKufqYiQTWVikXy8jc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741297"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
