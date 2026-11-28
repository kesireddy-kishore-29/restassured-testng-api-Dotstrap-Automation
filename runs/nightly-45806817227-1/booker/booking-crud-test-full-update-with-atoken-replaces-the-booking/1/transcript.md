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
| 1 | `POST /booking` | 200 | 102 | `qa-9bd59f9a-9a82-4425-b9cc-a59e1d4ca931` |
| 2 | `PUT /booking/{id}` | 200 | 107 | `qa-cb3ca8c8-2c8d-4725-93de-039ca7c85dda` |
| 3 | `DELETE /booking/{id}` | 201 | 93 | `qa-10224429-57af-4db1-b7b0-400c48fe2c9b` |
| 4 | `GET /booking/{id}` | 404 | 103 | `qa-661549ba-2bf8-4eed-8a0c-55b5142dfe67` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-9bd59f9a-9a82-4425-b9cc-a59e1d4ca931

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bd59f9a-9a82-4425-b9cc-a59e1d4ca931
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-dedd5517","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 102 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"cc-PAjSIwm7jaMeGqC5U3hRYe/Ku8E"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":661,"booking":{"firstname":"QA","lastname":"Guest-dedd5517","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/661
correlation: qa-cb3ca8c8-2c8d-4725-93de-039ca7c85dda

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-cb3ca8c8-2c8d-4725-93de-039ca7c85dda
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-cddd68f7","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 107 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"b3-yP8EvLKQfpLOfi4zpOKqBLoJxxc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-cddd68f7","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/661
correlation: qa-10224429-57af-4db1-b7b0-400c48fe2c9b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-10224429-57af-4db1-b7b0-400c48fe2c9b
Content-Type: application/json

--- response: 201 in 93 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/661
correlation: qa-661549ba-2bf8-4eed-8a0c-55b5142dfe67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-661549ba-2bf8-4eed-8a0c-55b5142dfe67
Content-Type: application/json

--- response: 404 in 103 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
