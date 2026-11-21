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
| 1 | `POST /booking` | 200 | 175 | `qa-8dcbd302-4d4b-4976-9516-46e71e8c9f0c` |
| 2 | `PATCH /booking/{id}` | 200 | 173 | `qa-d1fd340c-40b0-4997-8c7e-ccf9d0904fcb` |
| 3 | `DELETE /booking/{id}` | 201 | 176 | `qa-27b16c1e-46af-48ba-804c-803185e3489c` |
| 4 | `GET /booking/{id}` | 404 | 178 | `qa-fc6b9021-4d60-494e-bb31-31ae5f687543` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-8dcbd302-4d4b-4976-9516-46e71e8c9f0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dcbd302-4d4b-4976-9516-46e71e8c9f0c
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-8aeb6645","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}

--- response: 200 in 175 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"d0-vLQH994tVBv2fxqqvrzYxWPUMOE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2975,"booking":{"firstname":"Linus","lastname":"Guest-8aeb6645","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/2975
correlation: qa-d1fd340c-40b0-4997-8c7e-ccf9d0904fcb

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-d1fd340c-40b0-4997-8c7e-ccf9d0904fcb
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 173 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:36 GMT
Etag: W/"b3-Z6lRzkabiKYa+Q7G3gZhhx9w6yk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477396"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477396"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-8aeb6645","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2975
correlation: qa-27b16c1e-46af-48ba-804c-803185e3489c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-27b16c1e-46af-48ba-804c-803185e3489c
Content-Type: application/json

--- response: 201 in 176 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:36 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477396"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477396"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2975
correlation: qa-fc6b9021-4d60-494e-bb31-31ae5f687543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc6b9021-4d60-494e-bb31-31ae5f687543
Content-Type: application/json

--- response: 404 in 178 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:36 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477396"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nQH0XQLUJU80kKwiVM40rhL0OYB9L2VKZVOUWjK7X1c%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477396"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
