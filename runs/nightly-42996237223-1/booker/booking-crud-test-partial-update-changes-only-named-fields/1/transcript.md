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
| 1 | `POST /booking` | 200 | 131 | `qa-69e9eb5d-697b-4a99-8841-851f2c83090c` |
| 2 | `PATCH /booking/{id}` | 200 | 129 | `qa-15ae3bc9-0e72-45d1-b6f0-fffd653dbbd6` |
| 3 | `DELETE /booking/{id}` | 201 | 124 | `qa-77414c1e-fc59-4286-8339-1c6ea9f291e2` |
| 4 | `GET /booking/{id}` | 404 | 116 | `qa-fa1d7545-404d-46c6-b191-0b668a1d6a2c` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-69e9eb5d-697b-4a99-8841-851f2c83090c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69e9eb5d-697b-4a99-8841-851f2c83090c
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-186d2dbe","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}

--- response: 200 in 131 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:20 GMT
Etag: W/"d0-zm2Baou2bC3t0283uGSk+FwAUGI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389660"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389660"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1915,"booking":{"firstname":"Linus","lastname":"Guest-186d2dbe","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/1915
correlation: qa-15ae3bc9-0e72-45d1-b6f0-fffd653dbbd6

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-15ae3bc9-0e72-45d1-b6f0-fffd653dbbd6
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 129 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:20 GMT
Etag: W/"b3-vXIM3wLNWYMymZ69m31exPCTBes"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389660"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389660"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-186d2dbe","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-11","checkout":"2026-12-14"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/1915
correlation: qa-77414c1e-fc59-4286-8339-1c6ea9f291e2

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-77414c1e-fc59-4286-8339-1c6ea9f291e2
Content-Type: application/json

--- response: 201 in 124 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:20 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389660"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389660"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1915
correlation: qa-fa1d7545-404d-46c6-b191-0b668a1d6a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa1d7545-404d-46c6-b191-0b668a1d6a2c
Content-Type: application/json

--- response: 404 in 116 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:20 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389660"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8LPZzKu54hETpHMtY1BrTQcoULhHYMhIlGj41zLGthY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389660"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
