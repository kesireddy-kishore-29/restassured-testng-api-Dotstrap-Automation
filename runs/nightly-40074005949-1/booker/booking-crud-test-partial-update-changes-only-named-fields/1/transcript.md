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
| 1 | `POST /booking` | 200 | 238 | `qa-91c0338b-73f8-48ca-bfaf-bb031d81d639` |
| 2 | `PATCH /booking/{id}` | 200 | 224 | `qa-783408d7-0c03-4be1-812e-9248fca1b9dc` |
| 3 | `DELETE /booking/{id}` | 201 | 226 | `qa-8776b10b-c3b9-415b-9149-4f26309bae55` |
| 4 | `GET /booking/{id}` | 404 | 260 | `qa-0ba721e3-aaa9-4586-a44c-5d22d982fdad` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-91c0338b-73f8-48ca-bfaf-bb031d81d639

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91c0338b-73f8-48ca-bfaf-bb031d81d639
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-39fd16a5","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}

--- response: 200 in 238 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:05 GMT
Etag: W/"d0-ZyNAzBbX5cHjjejmpT2hXXY3I2A"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2222,"booking":{"firstname":"Linus","lastname":"Guest-39fd16a5","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/2222
correlation: qa-783408d7-0c03-4be1-812e-9248fca1b9dc

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-783408d7-0c03-4be1-812e-9248fca1b9dc
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 224 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:05 GMT
Etag: W/"b3-RTSPIyzGs6Zq/Z6SpGtulN7Ejc8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-39fd16a5","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2222
correlation: qa-8776b10b-c3b9-415b-9149-4f26309bae55

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8776b10b-c3b9-415b-9149-4f26309bae55
Content-Type: application/json

--- response: 201 in 226 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:05 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2222
correlation: qa-0ba721e3-aaa9-4586-a44c-5d22d982fdad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ba721e3-aaa9-4586-a44c-5d22d982fdad
Content-Type: application/json

--- response: 404 in 260 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:06 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=fEZYMJI76TBggV7ouCBInL4kUCki41ukW9MwNhyHH1A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=fEZYMJI76TBggV7ouCBInL4kUCki41ukW9MwNhyHH1A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
