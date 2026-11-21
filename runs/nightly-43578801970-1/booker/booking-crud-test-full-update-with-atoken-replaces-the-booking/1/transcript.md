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
| 1 | `POST /booking` | 200 | 253 | `qa-76d9956a-49b4-469d-8858-e7ee4ba7798a` |
| 2 | `PUT /booking/{id}` | 200 | 252 | `qa-48cb3cc4-f812-42a7-a74d-b07612b14f8b` |
| 3 | `DELETE /booking/{id}` | 201 | 214 | `qa-19988025-7474-4d75-9ea1-1a99b38943e3` |
| 4 | `GET /booking/{id}` | 404 | 255 | `qa-0d724f23-5a7c-4312-b8d5-c64b3317e501` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-76d9956a-49b4-469d-8858-e7ee4ba7798a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76d9956a-49b4-469d-8858-e7ee4ba7798a
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-2751e13f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}

--- response: 200 in 253 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:16 GMT
Etag: W/"cd-YAFuzGSZhZpeCFrpe99UjDLAoAE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647116"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647116"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2094,"booking":{"firstname":"QA","lastname":"Guest-2751e13f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2094
correlation: qa-48cb3cc4-f812-42a7-a74d-b07612b14f8b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-48cb3cc4-f812-42a7-a74d-b07612b14f8b
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-22aa3f71","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}

--- response: 200 in 252 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:17 GMT
Etag: W/"b3-GmVl74ncVh4sEOLqJnp/oc64zOE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647117"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647117"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-22aa3f71","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2094
correlation: qa-19988025-7474-4d75-9ea1-1a99b38943e3

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-19988025-7474-4d75-9ea1-1a99b38943e3
Content-Type: application/json

--- response: 201 in 214 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:17 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647117"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647117"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2094
correlation: qa-0d724f23-5a7c-4312-b8d5-c64b3317e501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d724f23-5a7c-4312-b8d5-c64b3317e501
Content-Type: application/json

--- response: 404 in 255 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:17 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647117"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647117"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
