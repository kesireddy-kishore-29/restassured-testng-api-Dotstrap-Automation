# Transcript: A deleted booking is gone (404 on read)

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#deletedBookingIsGone` |
| Features | FEAT-BOOK-04 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 101 | `qa-3224267d-8ade-431b-a362-6a703f78b952` |
| 2 | `DELETE /booking/{id}` | 201 | 116 | `qa-ff760b2e-973a-4906-b97c-a43178d1d4b9` |
| 3 | `GET /booking/{id}` | 404 | 97 | `qa-693e06d3-1cf3-4b7e-a7b5-a2034710e173` |
| 4 | `GET /booking/{id}` | 404 | 121 | `qa-9f9b4a94-9697-451a-8094-029d08fea13d` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-3224267d-8ade-431b-a362-6a703f78b952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3224267d-8ade-431b-a362-6a703f78b952
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-a2a8b844","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 101 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"cd-z1XuwtxTyWW0xiH5ksSkvAwVjfE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5904,"booking":{"firstname":"QA","lastname":"Guest-a2a8b844","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/5904
correlation: qa-ff760b2e-973a-4906-b97c-a43178d1d4b9

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-ff760b2e-973a-4906-b97c-a43178d1d4b9
Content-Type: application/json

--- response: 201 in 116 ms ---
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

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5904
correlation: qa-693e06d3-1cf3-4b7e-a7b5-a2034710e173

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-693e06d3-1cf3-4b7e-a7b5-a2034710e173
Content-Type: application/json

--- response: 404 in 97 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5904
correlation: qa-9f9b4a94-9697-451a-8094-029d08fea13d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f9b4a94-9697-451a-8094-029d08fea13d
Content-Type: application/json

--- response: 404 in 121 ms ---
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
