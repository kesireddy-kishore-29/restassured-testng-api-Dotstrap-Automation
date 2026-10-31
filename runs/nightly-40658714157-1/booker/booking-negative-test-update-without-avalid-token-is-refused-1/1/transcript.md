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
| 1 | `POST /booking` | 200 | 31 | `qa-02098360-97bd-490a-a08f-95e8da8eada6` |
| 2 | `PUT /booking/{id}` | 403 | 31 | `qa-c03dd378-6376-483c-a13d-ed8e27c54b54` |
| 3 | `GET /booking/{id}` | 200 | 26 | `qa-e77a7dec-9254-4e2c-a532-4788c7cd1858` |
| 4 | `DELETE /booking/{id}` | 201 | 24 | `qa-03fd6d99-7152-4628-b990-71a41d3cd8a7` |
| 5 | `GET /booking/{id}` | 404 | 29 | `qa-9cef9992-ab06-4326-9c12-c722c3243098` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-02098360-97bd-490a-a08f-95e8da8eada6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02098360-97bd-490a-a08f-95e8da8eada6
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-88077f0a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 31 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"cf-vFaZcJ3VTwxkyNqGid73b42eGkA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1102,"booking":{"firstname":"Keep","lastname":"Guest-88077f0a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1102
correlation: qa-c03dd378-6376-483c-a13d-ed8e27c54b54

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c03dd378-6376-483c-a13d-ed8e27c54b54
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-97d757d0","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}

--- response: 403 in 31 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1102
correlation: qa-e77a7dec-9254-4e2c-a532-4788c7cd1858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e77a7dec-9254-4e2c-a532-4788c7cd1858
Content-Type: application/json

--- response: 200 in 26 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"b2-CNb8gLHIzfi6+sxilfJ2pfR3qJw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-88077f0a","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-27","checkout":"2026-11-30"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/1102
correlation: qa-03fd6d99-7152-4628-b990-71a41d3cd8a7

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-03fd6d99-7152-4628-b990-71a41d3cd8a7
Content-Type: application/json

--- response: 201 in 24 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/1102
correlation: qa-9cef9992-ab06-4326-9c12-c722c3243098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cef9992-ab06-4326-9c12-c722c3243098
Content-Type: application/json

--- response: 404 in 29 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 28 Oct 2026 08:42:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793176977"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gaj%2FJ%2FAPs7y8ggD44pa1xhG%2FHhSt0JVWKKKtNnBYpOg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793176977"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
