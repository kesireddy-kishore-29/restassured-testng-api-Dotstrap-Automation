# Transcript: A partial update changes only the named fields

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#partialUpdateChangesOnlyNamedFields` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 103 | `qa-96c874eb-f240-4bd5-b21a-4ffe2faacfd8` |
| 2 | `PATCH /booking/{id}` | 200 | 91 | `qa-2acbbb1f-274f-49d6-ade3-dae5b11b4d55` |
| 3 | `DELETE /booking/{id}` | 201 | 112 | `qa-285e132a-073d-4b0b-a3ba-189461bb6e19` |
| 4 | `GET /booking/{id}` | 404 | 88 | `qa-4dde2cc9-ac47-41d6-93d0-251e67e503ec` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-96c874eb-f240-4bd5-b21a-4ffe2faacfd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96c874eb-f240-4bd5-b21a-4ffe2faacfd8
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-d959aa78","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 103 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"cf-iKKCrwBDbE5KzjhPjdr3ViEUCK4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":662,"booking":{"firstname":"Linus","lastname":"Guest-d959aa78","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/662
correlation: qa-2acbbb1f-274f-49d6-ade3-dae5b11b4d55

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2acbbb1f-274f-49d6-ade3-dae5b11b4d55
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 91 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:35 GMT
Etag: W/"b3-0px91/1nkxABd1yyrFPgHwbfJEA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TTEE6NxiGG645FligboG3HxJOph%2F5kJDxEMYPUBLNow%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-d959aa78","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/662
correlation: qa-285e132a-073d-4b0b-a3ba-189461bb6e19

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-285e132a-073d-4b0b-a3ba-189461bb6e19
Content-Type: application/json

--- response: 201 in 112 ms ---
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
#4 GET https://restful-booker.herokuapp.com/booking/662
correlation: qa-4dde2cc9-ac47-41d6-93d0-251e67e503ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dde2cc9-ac47-41d6-93d0-251e67e503ec
Content-Type: application/json

--- response: 404 in 88 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:36 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=f1AbQeHMUSDV7pNP44IMg4bmC9UQXPAyYb1ERDBsJ00%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=f1AbQeHMUSDV7pNP44IMg4bmC9UQXPAyYb1ERDBsJ00%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
