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
| 1 | `POST /booking` | 200 | 149 | `qa-c6533bda-b654-48f6-83cb-8004d19a71b0` |
| 2 | `PUT /booking/{id}` | 200 | 263 | `qa-0caf980d-c0ae-4698-bd4d-54da24505b5d` |
| 3 | `DELETE /booking/{id}` | 201 | 256 | `qa-91da4046-555a-4f4a-89f7-c327b422d54a` |
| 4 | `GET /booking/{id}` | 404 | 144 | `qa-641e49aa-643b-4ba9-8eef-a49b3b33d106` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-c6533bda-b654-48f6-83cb-8004d19a71b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6533bda-b654-48f6-83cb-8004d19a71b0
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-939ab844","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}

--- response: 200 in 149 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:15 GMT
Etag: W/"cc-R5Jkbe26vMrIEgPhD8VL54DXEEI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562935"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=zFPbKYt1q1Vm%2Fs3wnE6zRqyr2smf22gH%2FnqcLGQI1Qw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562935"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":734,"booking":{"firstname":"QA","lastname":"Guest-939ab844","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/734
correlation: qa-0caf980d-c0ae-4698-bd4d-54da24505b5d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0caf980d-c0ae-4698-bd4d-54da24505b5d
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-c26c8a97","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}

--- response: 200 in 263 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:16 GMT
Etag: W/"b3-f2wqyviYeb1HpOtNyTw1ZuiMyu4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562936"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562936"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-c26c8a97","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/734
correlation: qa-91da4046-555a-4f4a-89f7-c327b422d54a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-91da4046-555a-4f4a-89f7-c327b422d54a
Content-Type: application/json

--- response: 201 in 256 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:16 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562936"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562936"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/734
correlation: qa-641e49aa-643b-4ba9-8eef-a49b3b33d106

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-641e49aa-643b-4ba9-8eef-a49b3b33d106
Content-Type: application/json

--- response: 404 in 144 ms ---
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
