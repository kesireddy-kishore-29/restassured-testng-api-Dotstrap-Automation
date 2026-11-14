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
| 1 | `POST /booking` | 200 | 264 | `qa-7b234644-52f5-4f43-8f72-4b37216abe25` |
| 2 | `PUT /booking/{id}` | 403 | 285 | `qa-d4e6f1d4-3db1-440d-9724-4d18574994cc` |
| 3 | `GET /booking/{id}` | 200 | 174 | `qa-5476c40d-e09b-4a0b-9bc9-c51ce0a42423` |
| 4 | `DELETE /booking/{id}` | 201 | 260 | `qa-d1485f1d-e17a-44c9-9291-b2d128379f9c` |
| 5 | `GET /booking/{id}` | 404 | 164 | `qa-e4f8e076-b33d-404c-ac44-109b9d5d4897` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-7b234644-52f5-4f43-8f72-4b37216abe25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b234644-52f5-4f43-8f72-4b37216abe25
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-8dc0c93e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}

--- response: 200 in 264 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:06 GMT
Etag: W/"cf-eYQNnykXCnxgEo7vVqPypaMRsk8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2193,"booking":{"firstname":"Keep","lastname":"Guest-8dc0c93e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2193
correlation: qa-d4e6f1d4-3db1-440d-9724-4d18574994cc

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-d4e6f1d4-3db1-440d-9724-4d18574994cc
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-e3a6fa7f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}

--- response: 403 in 285 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2193
correlation: qa-5476c40d-e09b-4a0b-9bc9-c51ce0a42423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5476c40d-e09b-4a0b-9bc9-c51ce0a42423
Content-Type: application/json

--- response: 200 in 174 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"b2-XlIqFpvxbAjSoi+M7Q3R9/xuuqE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-8dc0c93e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2193
correlation: qa-d1485f1d-e17a-44c9-9291-b2d128379f9c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-d1485f1d-e17a-44c9-9291-b2d128379f9c
Content-Type: application/json

--- response: 201 in 260 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2193
correlation: qa-e4f8e076-b33d-404c-ac44-109b9d5d4897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4f8e076-b33d-404c-ac44-109b9d5d4897
Content-Type: application/json

--- response: 404 in 164 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
