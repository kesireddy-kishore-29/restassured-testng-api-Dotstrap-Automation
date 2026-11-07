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
| 1 | `POST /booking` | 200 | 113 | `qa-82c4a816-ee6a-4429-af7a-6ee48e8cd1c0` |
| 2 | `PUT /booking/{id}` | 403 | 111 | `qa-dacfeed8-d1f7-4957-8e28-6cc3e5c0a133` |
| 3 | `GET /booking/{id}` | 200 | 98 | `qa-5005d381-c800-4c1b-92ac-e0e250664c3b` |
| 4 | `DELETE /booking/{id}` | 201 | 87 | `qa-50281511-32bd-4758-bb6d-56fee7d31093` |
| 5 | `GET /booking/{id}` | 404 | 115 | `qa-952530a6-db3a-42b2-8167-984f43911c65` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-82c4a816-ee6a-4429-af7a-6ee48e8cd1c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82c4a816-ee6a-4429-af7a-6ee48e8cd1c0
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-7269eee4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}

--- response: 200 in 113 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:36 GMT
Etag: W/"cf-6mbRZmUWTRGusPsuawwyIo6/x+c"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612316"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=0rSPLCXFWd1WquGoImUAsytwiY%2BbArGwvr3xd%2Bp108U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612316"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4155,"booking":{"firstname":"Keep","lastname":"Guest-7269eee4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4155
correlation: qa-dacfeed8-d1f7-4957-8e28-6cc3e5c0a133

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-dacfeed8-d1f7-4957-8e28-6cc3e5c0a133
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-a0c593f8","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}

--- response: 403 in 111 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4155
correlation: qa-5005d381-c800-4c1b-92ac-e0e250664c3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5005d381-c800-4c1b-92ac-e0e250664c3b
Content-Type: application/json

--- response: 200 in 98 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"b2-MLMMmI2PDF+zhQeKyyxN57IrJm4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-7269eee4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4155
correlation: qa-50281511-32bd-4758-bb6d-56fee7d31093

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-50281511-32bd-4758-bb6d-56fee7d31093
Content-Type: application/json

--- response: 201 in 87 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4155
correlation: qa-952530a6-db3a-42b2-8167-984f43911c65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-952530a6-db3a-42b2-8167-984f43911c65
Content-Type: application/json

--- response: 404 in 115 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
