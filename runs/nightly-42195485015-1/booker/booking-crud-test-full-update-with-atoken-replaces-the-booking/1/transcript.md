# Transcript: A full update with a token replaces the booking

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#fullUpdateWithATokenReplacesTheBooking` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 38 | `qa-a631091b-b819-4838-9923-53cba7d97f2c` |
| 2 | `PUT /booking/{id}` | 200 | 40 | `qa-e8be335c-598b-4ecf-97ea-5ab29f8cea47` |
| 3 | `DELETE /booking/{id}` | 201 | 37 | `qa-84d116dc-e6da-4b0e-bc62-5a0414e62419` |
| 4 | `GET /booking/{id}` | 404 | 34 | `qa-934ef74e-ec52-4b76-bfa2-ecab1fd9f0ed` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a631091b-b819-4838-9923-53cba7d97f2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a631091b-b819-4838-9923-53cba7d97f2c
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-ffea5cc4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}

--- response: 200 in 38 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"cd-nSaG31xHPTFulaSzOsXb3mGSBHk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5042,"booking":{"firstname":"QA","lastname":"Guest-ffea5cc4","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5042
correlation: qa-e8be335c-598b-4ecf-97ea-5ab29f8cea47

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e8be335c-598b-4ecf-97ea-5ab29f8cea47
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-cfd69ab7","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}

--- response: 200 in 40 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 06 Nov 2026 09:30:30 GMT
Etag: W/"b3-bp5pCw+L+qA9Uhse6MGCHnJI61c"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793957430"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QpAqrVPWdp7swblglX0m2Q6m%2FLPoTnyuGcXcWzBUrLg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793957430"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-cfd69ab7","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-06","checkout":"2026-12-09"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5042
correlation: qa-84d116dc-e6da-4b0e-bc62-5a0414e62419

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-84d116dc-e6da-4b0e-bc62-5a0414e62419
Content-Type: application/json

--- response: 201 in 37 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5042
correlation: qa-934ef74e-ec52-4b76-bfa2-ecab1fd9f0ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-934ef74e-ec52-4b76-bfa2-ecab1fd9f0ed
Content-Type: application/json

--- response: 404 in 34 ms ---
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
