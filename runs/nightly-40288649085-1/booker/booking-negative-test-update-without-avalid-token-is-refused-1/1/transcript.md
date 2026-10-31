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
| 1 | `POST /booking` | 200 | 108 | `qa-df7a57ff-393f-4b9f-b6f1-40945df11826` |
| 2 | `PUT /booking/{id}` | 403 | 104 | `qa-c351d41e-bbfb-47a8-b42f-a92333cee8ac` |
| 3 | `GET /booking/{id}` | 200 | 104 | `qa-5195c866-2f24-4f02-b739-d37543555c89` |
| 4 | `DELETE /booking/{id}` | 201 | 96 | `qa-87773334-646b-45c0-ae53-605cd8166804` |
| 5 | `GET /booking/{id}` | 404 | 102 | `qa-9aa2c1b5-937b-4de8-9612-d0881e34633a` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-df7a57ff-393f-4b9f-b6f1-40945df11826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df7a57ff-393f-4b9f-b6f1-40945df11826
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-938e4547","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 108 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:49 GMT
Etag: W/"cf-vuXLpZn3/tnEH/9b5FbADhydxFc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001289"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001289"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3346,"booking":{"firstname":"Keep","lastname":"Guest-938e4547","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3346
correlation: qa-c351d41e-bbfb-47a8-b42f-a92333cee8ac

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c351d41e-bbfb-47a8-b42f-a92333cee8ac
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-46a618aa","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}

--- response: 403 in 104 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:49 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001289"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001289"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3346
correlation: qa-5195c866-2f24-4f02-b739-d37543555c89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5195c866-2f24-4f02-b739-d37543555c89
Content-Type: application/json

--- response: 200 in 104 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:49 GMT
Etag: W/"b2-MzVH2qY4wDYY9IY0M7HIr3soLXE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001289"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001289"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-938e4547","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3346
correlation: qa-87773334-646b-45c0-ae53-605cd8166804

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-87773334-646b-45c0-ae53-605cd8166804
Content-Type: application/json

--- response: 201 in 96 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:49 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001289"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001289"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3346
correlation: qa-9aa2c1b5-937b-4de8-9612-d0881e34633a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aa2c1b5-937b-4de8-9612-d0881e34633a
Content-Type: application/json

--- response: 404 in 102 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:49 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001289"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001289"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
