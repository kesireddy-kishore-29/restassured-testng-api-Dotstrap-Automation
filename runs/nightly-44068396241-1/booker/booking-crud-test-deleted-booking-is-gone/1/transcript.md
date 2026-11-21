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
| 1 | `POST /booking` | 200 | 23 | `qa-a55b1bb0-cd76-4531-98e4-690468171359` |
| 2 | `DELETE /booking/{id}` | 201 | 22 | `qa-b7d8f948-d678-4771-b61a-6c93c5daaf94` |
| 3 | `GET /booking/{id}` | 404 | 19 | `qa-be14eb03-cbe1-4d16-b45b-fe0ac5efbe19` |
| 4 | `GET /booking/{id}` | 404 | 22 | `qa-7906d1f2-7094-490a-8d7f-4cd98bb439f9` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a55b1bb0-cd76-4531-98e4-690468171359

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a55b1bb0-cd76-4531-98e4-690468171359
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-ae64b071","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}

--- response: 200 in 23 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"cd-XCK+DPcRAYUobLz8pietjIFH4dY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5736,"booking":{"firstname":"QA","lastname":"Guest-ae64b071","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/5736
correlation: qa-b7d8f948-d678-4771-b61a-6c93c5daaf94

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b7d8f948-d678-4771-b61a-6c93c5daaf94
Content-Type: application/json

--- response: 201 in 22 ms ---
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

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5736
correlation: qa-be14eb03-cbe1-4d16-b45b-fe0ac5efbe19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be14eb03-cbe1-4d16-b45b-fe0ac5efbe19
Content-Type: application/json

--- response: 404 in 19 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5736
correlation: qa-7906d1f2-7094-490a-8d7f-4cd98bb439f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7906d1f2-7094-490a-8d7f-4cd98bb439f9
Content-Type: application/json

--- response: 404 in 22 ms ---
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
