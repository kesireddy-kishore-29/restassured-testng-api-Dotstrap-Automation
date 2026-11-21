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
| 1 | `POST /booking` | 200 | 23 | `qa-2a3c2868-c41f-4ed0-b962-805725a1eef3` |
| 2 | `PUT /booking/{id}` | 403 | 27 | `qa-8aa7a522-02f6-4d80-87f9-c83bfea0aec1` |
| 3 | `GET /booking/{id}` | 200 | 26 | `qa-5c1b8c37-0862-425c-8ac1-61aeda5aeeb1` |
| 4 | `DELETE /booking/{id}` | 201 | 26 | `qa-ff8290bc-76f7-4aa1-a524-166120d95bac` |
| 5 | `GET /booking/{id}` | 404 | 30 | `qa-838d8a0f-fa4a-47bd-9efc-6833c7f6b781` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-2a3c2868-c41f-4ed0-b962-805725a1eef3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a3c2868-c41f-4ed0-b962-805725a1eef3
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-30f61346","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}

--- response: 200 in 23 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"cf-B0YhekQbqf97ndmoG204kYe4M9o"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5734,"booking":{"firstname":"Keep","lastname":"Guest-30f61346","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5734
correlation: qa-8aa7a522-02f6-4d80-87f9-c83bfea0aec1

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8aa7a522-02f6-4d80-87f9-c83bfea0aec1
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-3268b59e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}

--- response: 403 in 27 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5734
correlation: qa-5c1b8c37-0862-425c-8ac1-61aeda5aeeb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c1b8c37-0862-425c-8ac1-61aeda5aeeb1
Content-Type: application/json

--- response: 200 in 26 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"b2-9IQemYfQBJE8zE+/aspMj96ioOM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-30f61346","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5734
correlation: qa-ff8290bc-76f7-4aa1-a524-166120d95bac

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-ff8290bc-76f7-4aa1-a524-166120d95bac
Content-Type: application/json

--- response: 201 in 26 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5734
correlation: qa-838d8a0f-fa4a-47bd-9efc-6833c7f6b781

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-838d8a0f-fa4a-47bd-9efc-6833c7f6b781
Content-Type: application/json

--- response: 404 in 30 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
