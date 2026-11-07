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
| 1 | `POST /booking` | 200 | 210 | `qa-b71151c8-93c8-4511-b8c0-9168bcf09c96` |
| 2 | `PUT /booking/{id}` | 200 | 204 | `qa-a0ba9543-785c-404d-88c3-8ebe8587c4ab` |
| 3 | `DELETE /booking/{id}` | 201 | 203 | `qa-0426afd5-b7f6-44cb-99a7-f4d07760c181` |
| 4 | `GET /booking/{id}` | 404 | 207 | `qa-3d069423-40ed-4954-8e69-b5e8d793e37b` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-b71151c8-93c8-4511-b8c0-9168bcf09c96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b71151c8-93c8-4511-b8c0-9168bcf09c96
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-ce5e7e15","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}

--- response: 200 in 210 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:17 GMT
Etag: W/"cd-T3Q9xFQVEnvrpcPjPySzFVUF/Do"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3874,"booking":{"firstname":"QA","lastname":"Guest-ce5e7e15","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3874
correlation: qa-a0ba9543-785c-404d-88c3-8ebe8587c4ab

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a0ba9543-785c-404d-88c3-8ebe8587c4ab
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-4a52cec8","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}

--- response: 200 in 204 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:17 GMT
Etag: W/"b3-TvTCk1LOf7Qky+yEm7Z0eCGujiU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-4a52cec8","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3874
correlation: qa-0426afd5-b7f6-44cb-99a7-f4d07760c181

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0426afd5-b7f6-44cb-99a7-f4d07760c181
Content-Type: application/json

--- response: 201 in 203 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:18 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=rHRz4z6j26vhp2W0loWwStVJWz8LFu0i64Ia6tJMWus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784498"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=rHRz4z6j26vhp2W0loWwStVJWz8LFu0i64Ia6tJMWus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784498"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3874
correlation: qa-3d069423-40ed-4954-8e69-b5e8d793e37b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d069423-40ed-4954-8e69-b5e8d793e37b
Content-Type: application/json

--- response: 404 in 207 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:18 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=rHRz4z6j26vhp2W0loWwStVJWz8LFu0i64Ia6tJMWus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784498"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=rHRz4z6j26vhp2W0loWwStVJWz8LFu0i64Ia6tJMWus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784498"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
