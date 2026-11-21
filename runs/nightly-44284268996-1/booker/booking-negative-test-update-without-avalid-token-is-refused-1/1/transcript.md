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
| 1 | `POST /booking` | 200 | 290 | `qa-75c4b795-9d9c-45cc-945c-462fc8dd71e4` |
| 2 | `PUT /booking/{id}` | 403 | 295 | `qa-773e8a28-7243-4e06-8145-79a31b9e813a` |
| 3 | `GET /booking/{id}` | 200 | 287 | `qa-915f91a8-877d-4860-9d1c-c40c4cae6611` |
| 4 | `DELETE /booking/{id}` | 201 | 291 | `qa-5f6d494b-bc1e-49b6-a2ae-e18735197053` |
| 5 | `GET /booking/{id}` | 404 | 294 | `qa-8be95bf4-0e6e-419a-9de6-49cbba760f88` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-75c4b795-9d9c-45cc-945c-462fc8dd71e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75c4b795-9d9c-45cc-945c-462fc8dd71e4
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-d6a2264f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}

--- response: 200 in 290 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:55 GMT
Etag: W/"cf-x3Lub3yL/ohnnEyO7OWcLADH3HU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997195"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997195"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4693,"booking":{"firstname":"Keep","lastname":"Guest-d6a2264f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4693
correlation: qa-773e8a28-7243-4e06-8145-79a31b9e813a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-773e8a28-7243-4e06-8145-79a31b9e813a
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-3e2571e8","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}

--- response: 403 in 295 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:55 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997195"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8pZ1z2boHMeEZ9Fp%2Fb2P7AVCjUqoAw8vFyuSIFywSWk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997195"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4693
correlation: qa-915f91a8-877d-4860-9d1c-c40c4cae6611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-915f91a8-877d-4860-9d1c-c40c4cae6611
Content-Type: application/json

--- response: 200 in 287 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:56 GMT
Etag: W/"b2-neD5Co+FzrFY0t3tfnHZ7ICniPw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997196"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997196"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-d6a2264f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4693
correlation: qa-5f6d494b-bc1e-49b6-a2ae-e18735197053

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5f6d494b-bc1e-49b6-a2ae-e18735197053
Content-Type: application/json

--- response: 201 in 291 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:56 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997196"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997196"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4693
correlation: qa-8be95bf4-0e6e-419a-9de6-49cbba760f88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8be95bf4-0e6e-419a-9de6-49cbba760f88
Content-Type: application/json

--- response: 404 in 294 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:56 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997196"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RtIfgoLS%2FSikJSdrQh4A%2BYdccc3FMIhlg5EToQGOofA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997196"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
