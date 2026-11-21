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
| 1 | `POST /booking` | 200 | 257 | `qa-a44cc70a-6444-4001-a2ea-14bf26d10bad` |
| 2 | `DELETE /booking/{id}` | 201 | 156 | `qa-ca87591b-5674-453a-a123-f753035e2471` |
| 3 | `GET /booking/{id}` | 404 | 255 | `qa-a8b5e64d-5cf8-49f1-b080-dfd534c4fa9c` |
| 4 | `GET /booking/{id}` | 404 | 269 | `qa-0b466da0-c210-4b68-8690-7cbe17737e55` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a44cc70a-6444-4001-a2ea-14bf26d10bad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a44cc70a-6444-4001-a2ea-14bf26d10bad
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-48640e97","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}

--- response: 200 in 257 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:15 GMT
Etag: W/"cc-fEC0ri+31Xc3mwWFzWKqdWbO19U"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562935"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562935"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":729,"booking":{"firstname":"QA","lastname":"Guest-48640e97","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/729
correlation: qa-ca87591b-5674-453a-a123-f753035e2471

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-ca87591b-5674-453a-a123-f753035e2471
Content-Type: application/json

--- response: 201 in 156 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:15 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562935"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562935"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/729
correlation: qa-a8b5e64d-5cf8-49f1-b080-dfd534c4fa9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8b5e64d-5cf8-49f1-b080-dfd534c4fa9c
Content-Type: application/json

--- response: 404 in 255 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:15 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562935"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562935"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/729
correlation: qa-0b466da0-c210-4b68-8690-7cbe17737e55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b466da0-c210-4b68-8690-7cbe17737e55
Content-Type: application/json

--- response: 404 in 269 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:16 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562936"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562936"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
