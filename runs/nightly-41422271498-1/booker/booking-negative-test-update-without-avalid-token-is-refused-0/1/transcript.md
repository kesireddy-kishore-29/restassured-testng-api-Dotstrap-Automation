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
| 1 | `POST /booking` | 200 | 599 | `qa-11b74216-37b6-4d43-95ae-d0825e0374f0` |
| 2 | `PUT /booking/{id}` | 403 | 96 | `qa-2f41702b-bde0-499d-9f45-500d0cd8cfcb` |
| 3 | `GET /booking/{id}` | 200 | 132 | `qa-0fb150f5-84ac-4b8f-900d-a9a86a3efc47` |
| 4 | `POST /auth` | 200 | 110 | `qa-d6c90d0c-5ada-4af7-87f9-9d979acbebe6` |
| 5 | `DELETE /booking/{id}` | 201 | 108 | `qa-97ea9c3e-7c4f-4dad-9337-99f8b9392650` |
| 6 | `GET /booking/{id}` | 404 | 102 | `qa-845c87db-612e-4a3f-af85-7da7b388c37b` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-11b74216-37b6-4d43-95ae-d0825e0374f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11b74216-37b6-4d43-95ae-d0825e0374f0
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-919dda0d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}

--- response: 200 in 599 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:35 GMT
Etag: W/"cf-jA/FIbfP9LzDSMCGC3TFh2yO9cs"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EvNmKjm%2FSrKJZ7Cku4nbQRUc5Llo0VKDx%2BJfOyuGCUk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612315"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EvNmKjm%2FSrKJZ7Cku4nbQRUc5Llo0VKDx%2BJfOyuGCUk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612315"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4141,"booking":{"firstname":"Keep","lastname":"Guest-919dda0d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4141
correlation: qa-2f41702b-bde0-499d-9f45-500d0cd8cfcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f41702b-bde0-499d-9f45-500d0cd8cfcb
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-a366e50f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}

--- response: 403 in 96 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:35 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EvNmKjm%2FSrKJZ7Cku4nbQRUc5Llo0VKDx%2BJfOyuGCUk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612315"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EvNmKjm%2FSrKJZ7Cku4nbQRUc5Llo0VKDx%2BJfOyuGCUk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612315"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4141
correlation: qa-0fb150f5-84ac-4b8f-900d-a9a86a3efc47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fb150f5-84ac-4b8f-900d-a9a86a3efc47
Content-Type: application/json

--- response: 200 in 132 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:35 GMT
Etag: W/"b2-6b6IVlHycfCdkH1R/xddBN9e4y8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EvNmKjm%2FSrKJZ7Cku4nbQRUc5Llo0VKDx%2BJfOyuGCUk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612315"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EvNmKjm%2FSrKJZ7Cku4nbQRUc5Llo0VKDx%2BJfOyuGCUk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612315"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-919dda0d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-d6c90d0c-5ada-4af7-87f9-9d979acbebe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6c90d0c-5ada-4af7-87f9-9d979acbebe6
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 110 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:36 GMT
Etag: W/"1b-0iU0I2WCIA2+lgq6UPB6IIpZNHQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612316"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612316"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/4141
correlation: qa-97ea9c3e-7c4f-4dad-9337-99f8b9392650

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-97ea9c3e-7c4f-4dad-9337-99f8b9392650
Content-Type: application/json

--- response: 201 in 108 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:36 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612316"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612316"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/4141
correlation: qa-845c87db-612e-4a3f-af85-7da7b388c37b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-845c87db-612e-4a3f-af85-7da7b388c37b
Content-Type: application/json

--- response: 404 in 102 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:36 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612316"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612316"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
