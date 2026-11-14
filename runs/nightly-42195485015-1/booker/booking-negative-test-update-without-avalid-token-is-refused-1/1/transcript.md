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
| 1 | `POST /booking` | 200 | 36 | `qa-453a0b01-7988-4433-81c9-856593a4fc27` |
| 2 | `PUT /booking/{id}` | 403 | 38 | `qa-81d6a680-6cba-4f7c-8680-573a27691c37` |
| 3 | `GET /booking/{id}` | 200 | 39 | `qa-1f2c060d-9749-407d-a676-08859c681c30` |
| 4 | `DELETE /booking/{id}` | 201 | 36 | `qa-dd392680-9d54-4c3b-a148-a950a54e4100` |
| 5 | `GET /booking/{id}` | 404 | 38 | `qa-46b7869a-7bf9-4158-84f3-7ad8c4eb79bc` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-453a0b01-7988-4433-81c9-856593a4fc27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-453a0b01-7988-4433-81c9-856593a4fc27
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-20dacf6d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}

--- response: 200 in 36 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"cf-k7O4mq65cOuGPeHzgHNnouzWioA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5038,"booking":{"firstname":"Keep","lastname":"Guest-20dacf6d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5038
correlation: qa-81d6a680-6cba-4f7c-8680-573a27691c37

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-81d6a680-6cba-4f7c-8680-573a27691c37
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-5dbeb3b3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}

--- response: 403 in 38 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5038
correlation: qa-1f2c060d-9749-407d-a676-08859c681c30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f2c060d-9749-407d-a676-08859c681c30
Content-Type: application/json

--- response: 200 in 39 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"b2-pkT0zYVDfaEzdMD+O/FWWyDBafo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-20dacf6d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5038
correlation: qa-dd392680-9d54-4c3b-a148-a950a54e4100

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-dd392680-9d54-4c3b-a148-a950a54e4100
Content-Type: application/json

--- response: 201 in 36 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5038
correlation: qa-46b7869a-7bf9-4158-84f3-7ad8c4eb79bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46b7869a-7bf9-4158-84f3-7ad8c4eb79bc
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
