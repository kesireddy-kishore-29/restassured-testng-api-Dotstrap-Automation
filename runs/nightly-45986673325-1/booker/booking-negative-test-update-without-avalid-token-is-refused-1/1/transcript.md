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
| 1 | `POST /booking` | 200 | 117 | `qa-691143c5-aa2a-48e0-bbe9-4cabd2bbbc57` |
| 2 | `PUT /booking/{id}` | 403 | 119 | `qa-81bd8c53-1851-499e-9dac-3df10a3cd9eb` |
| 3 | `GET /booking/{id}` | 200 | 104 | `qa-57432952-f69e-47ab-af94-0a5e7f7d374d` |
| 4 | `DELETE /booking/{id}` | 201 | 130 | `qa-4d184845-851f-44a8-b046-a30c40a4cfbe` |
| 5 | `GET /booking/{id}` | 404 | 104 | `qa-7d8d95e3-52c7-49a3-a8bf-bddf3edb365f` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-691143c5-aa2a-48e0-bbe9-4cabd2bbbc57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-691143c5-aa2a-48e0-bbe9-4cabd2bbbc57
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-31cbb93e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 117 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"cf-/zyNc/9R3q+wkxkC12o3SI2QTso"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5899,"booking":{"firstname":"Keep","lastname":"Guest-31cbb93e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5899
correlation: qa-81bd8c53-1851-499e-9dac-3df10a3cd9eb

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-81bd8c53-1851-499e-9dac-3df10a3cd9eb
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-319e76fd","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}

--- response: 403 in 119 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:52 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777192"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=2M4DqkLDPyDLggCM9sVlUqPuE89vqWK3PXOJIE%2F%2BWOU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777192"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5899
correlation: qa-57432952-f69e-47ab-af94-0a5e7f7d374d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57432952-f69e-47ab-af94-0a5e7f7d374d
Content-Type: application/json

--- response: 200 in 104 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"b2-jlgspN+edcaTWmIe+zD6Zc3IUgI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-31cbb93e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5899
correlation: qa-4d184845-851f-44a8-b046-a30c40a4cfbe

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-4d184845-851f-44a8-b046-a30c40a4cfbe
Content-Type: application/json

--- response: 201 in 130 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5899
correlation: qa-7d8d95e3-52c7-49a3-a8bf-bddf3edb365f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d8d95e3-52c7-49a3-a8bf-bddf3edb365f
Content-Type: application/json

--- response: 404 in 104 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
