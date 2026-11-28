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
| 1 | `POST /booking` | 200 | 40 | `qa-a2d36cb9-3d85-495d-917d-81cb5d4a937a` |
| 2 | `PUT /booking/{id}` | 403 | 49 | `qa-6f993277-88b6-4c8d-a125-9fd4e6d1cc54` |
| 3 | `GET /booking/{id}` | 200 | 37 | `qa-431818da-96dd-48ea-bbb2-b9a7b8f28a91` |
| 4 | `DELETE /booking/{id}` | 201 | 32 | `qa-f302ba17-5833-4887-ae3f-e3654e818ebf` |
| 5 | `GET /booking/{id}` | 404 | 34 | `qa-2742ce46-1455-4462-a938-d80c7fe590cd` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a2d36cb9-3d85-495d-917d-81cb5d4a937a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2d36cb9-3d85-495d-917d-81cb5d4a937a
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-e24e4d83","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}

--- response: 200 in 40 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"cf-wdGR6ypEZE+TktZTw7PyatqWO0o"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3196,"booking":{"firstname":"Keep","lastname":"Guest-e24e4d83","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3196
correlation: qa-6f993277-88b6-4c8d-a125-9fd4e6d1cc54

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-6f993277-88b6-4c8d-a125-9fd4e6d1cc54
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-610d1df6","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}

--- response: 403 in 49 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3196
correlation: qa-431818da-96dd-48ea-bbb2-b9a7b8f28a91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-431818da-96dd-48ea-bbb2-b9a7b8f28a91
Content-Type: application/json

--- response: 200 in 37 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"b2-v9fbxw32QxKRVvdLAsvVhEmdcC8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-e24e4d83","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3196
correlation: qa-f302ba17-5833-4887-ae3f-e3654e818ebf

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f302ba17-5833-4887-ae3f-e3654e818ebf
Content-Type: application/json

--- response: 201 in 32 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3196
correlation: qa-2742ce46-1455-4462-a938-d80c7fe590cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2742ce46-1455-4462-a938-d80c7fe590cd
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
