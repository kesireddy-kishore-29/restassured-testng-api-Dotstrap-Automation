# Transcript: A partial update changes only the named fields

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#partialUpdateChangesOnlyNamedFields` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 24 | `qa-c12d4558-e76d-40bc-8a4a-7a3946735e9e` |
| 2 | `PATCH /booking/{id}` | 200 | 21 | `qa-0098af92-eb1f-4a74-a6bd-afbeeef6d116` |
| 3 | `DELETE /booking/{id}` | 201 | 23 | `qa-95ec94d2-919a-482c-8875-a34d32ac685f` |
| 4 | `GET /booking/{id}` | 404 | 21 | `qa-9b402ac8-0209-4c9c-b515-8591003c8a65` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-c12d4558-e76d-40bc-8a4a-7a3946735e9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c12d4558-e76d-40bc-8a4a-7a3946735e9e
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-8008ff69","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}

--- response: 200 in 24 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"d0-LJ0B4TnFsEt220yQEkzsNqyj8no"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5738,"booking":{"firstname":"Linus","lastname":"Guest-8008ff69","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/5738
correlation: qa-0098af92-eb1f-4a74-a6bd-afbeeef6d116

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0098af92-eb1f-4a74-a6bd-afbeeef6d116
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 21 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"b3-u1r4pI+3Z2RtWp6o+NBzWdoklfk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-8008ff69","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5738
correlation: qa-95ec94d2-919a-482c-8875-a34d32ac685f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-95ec94d2-919a-482c-8875-a34d32ac685f
Content-Type: application/json

--- response: 201 in 23 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5738
correlation: qa-9b402ac8-0209-4c9c-b515-8591003c8a65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b402ac8-0209-4c9c-b515-8591003c8a65
Content-Type: application/json

--- response: 404 in 21 ms ---
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
