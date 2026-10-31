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
| 1 | `POST /booking` | 200 | 914 | `qa-1affda97-5dc7-4950-85d7-4c77cc15bbe0` |
| 2 | `PUT /booking/{id}` | 403 | 247 | `qa-ee8ff3b8-695a-4fbb-9d81-7f54194fbf3e` |
| 3 | `GET /booking/{id}` | 200 | 240 | `qa-1377ec00-1dd5-4b66-b2d3-9383a570a2d7` |
| 4 | `POST /auth` | 200 | 243 | `qa-3b62fd3e-9174-4e3a-b3a5-5870aeb25e21` |
| 5 | `DELETE /booking/{id}` | 201 | 244 | `qa-0cb892a1-b9d2-4d27-8b42-20c4d9dd3302` |
| 6 | `GET /booking/{id}` | 404 | 246 | `qa-0dcca20b-87c1-4317-a194-e5664ad09e73` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-1affda97-5dc7-4950-85d7-4c77cc15bbe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1affda97-5dc7-4950-85d7-4c77cc15bbe0
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-d6c1958d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}

--- response: 200 in 914 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:02 GMT
Etag: W/"cf-lajJQwWASvz01PIKp34ArzvdyQg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Qsp4PSa%2FWXKquf7fGe6KAIdtk2Q%2FkR5JakkypsPMzm4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263142"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Qsp4PSa%2FWXKquf7fGe6KAIdtk2Q%2FkR5JakkypsPMzm4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263142"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4295,"booking":{"firstname":"Keep","lastname":"Guest-d6c1958d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4295
correlation: qa-ee8ff3b8-695a-4fbb-9d81-7f54194fbf3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee8ff3b8-695a-4fbb-9d81-7f54194fbf3e
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-8c07fe9c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}

--- response: 403 in 247 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:03 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LG6DrnHVLqNZwKIUVGYEgvEWnC0qS9eHiQ6zsbptimU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263143"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LG6DrnHVLqNZwKIUVGYEgvEWnC0qS9eHiQ6zsbptimU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263143"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4295
correlation: qa-1377ec00-1dd5-4b66-b2d3-9383a570a2d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1377ec00-1dd5-4b66-b2d3-9383a570a2d7
Content-Type: application/json

--- response: 200 in 240 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:03 GMT
Etag: W/"b2-rbvA6tK0VClpxNpYOW00dDbL2Po"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LG6DrnHVLqNZwKIUVGYEgvEWnC0qS9eHiQ6zsbptimU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263143"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LG6DrnHVLqNZwKIUVGYEgvEWnC0qS9eHiQ6zsbptimU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263143"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-d6c1958d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-3b62fd3e-9174-4e3a-b3a5-5870aeb25e21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b62fd3e-9174-4e3a-b3a5-5870aeb25e21
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 243 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:04 GMT
Etag: W/"1b-TG/O6r6y1dtjmXZWJvi9oKR/TAE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263144"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263144"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/4295
correlation: qa-0cb892a1-b9d2-4d27-8b42-20c4d9dd3302

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0cb892a1-b9d2-4d27-8b42-20c4d9dd3302
Content-Type: application/json

--- response: 201 in 244 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263144"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263144"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/4295
correlation: qa-0dcca20b-87c1-4317-a194-e5664ad09e73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dcca20b-87c1-4317-a194-e5664ad09e73
Content-Type: application/json

--- response: 404 in 246 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263144"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=hUpquIHrRd0veaW2hut4FNE3xWq5UYa84%2BGM9eTwK44%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263144"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
