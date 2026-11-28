# Transcript: A full update with a token replaces the booking

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#fullUpdateWithATokenReplacesTheBooking` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 102 | `qa-f2945f25-6426-489d-b6f5-deab026eaaf1` |
| 2 | `PUT /booking/{id}` | 200 | 107 | `qa-9a245240-2aac-4339-af5d-1ee2de5eaee6` |
| 3 | `DELETE /booking/{id}` | 201 | 109 | `qa-bc4fc533-aaf5-4762-a024-1efdc04ea0f3` |
| 4 | `GET /booking/{id}` | 404 | 113 | `qa-43625111-7de3-4267-b710-a6a221919496` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f2945f25-6426-489d-b6f5-deab026eaaf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2945f25-6426-489d-b6f5-deab026eaaf1
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-bab5ea9f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 102 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"cd-uNZS7eyLZycwBQjBsuX/zYv/SHY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5907,"booking":{"firstname":"QA","lastname":"Guest-bab5ea9f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5907
correlation: qa-9a245240-2aac-4339-af5d-1ee2de5eaee6

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-9a245240-2aac-4339-af5d-1ee2de5eaee6
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-c0fbf527","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 107 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"b3-hoC5OQtsAFM35bp103MF6EVK7sc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-c0fbf527","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5907
correlation: qa-bc4fc533-aaf5-4762-a024-1efdc04ea0f3

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-bc4fc533-aaf5-4762-a024-1efdc04ea0f3
Content-Type: application/json

--- response: 201 in 109 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5907
correlation: qa-43625111-7de3-4267-b710-a6a221919496

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43625111-7de3-4267-b710-a6a221919496
Content-Type: application/json

--- response: 404 in 113 ms ---
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
