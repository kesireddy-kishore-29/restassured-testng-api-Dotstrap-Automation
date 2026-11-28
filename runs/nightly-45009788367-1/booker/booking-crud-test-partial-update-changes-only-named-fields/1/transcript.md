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
| 1 | `POST /booking` | 200 | 240 | `qa-56ca2f46-675e-41c6-b120-801bd4a984e4` |
| 2 | `PATCH /booking/{id}` | 200 | 256 | `qa-38e0b073-a3d6-4ceb-a86e-65d8f10a1830` |
| 3 | `DELETE /booking/{id}` | 201 | 253 | `qa-d90fc3a1-98ac-41e9-8305-b7ea39ed65ad` |
| 4 | `GET /booking/{id}` | 404 | 237 | `qa-fedd459b-88df-4113-a57c-b895b7b54d94` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-56ca2f46-675e-41c6-b120-801bd4a984e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56ca2f46-675e-41c6-b120-801bd4a984e4
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-046998d9","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 240 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:57 GMT
Etag: W/"d0-Le2MW0IRTDxsW/lga9Q8L+awEUg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341297"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341297"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2155,"booking":{"firstname":"Linus","lastname":"Guest-046998d9","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/2155
correlation: qa-38e0b073-a3d6-4ceb-a86e-65d8f10a1830

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-38e0b073-a3d6-4ceb-a86e-65d8f10a1830
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 256 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:57 GMT
Etag: W/"b3-O4MJQAlWaBYAnD0i9gbTdrSPJKM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341297"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341297"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-046998d9","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2155
correlation: qa-d90fc3a1-98ac-41e9-8305-b7ea39ed65ad

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-d90fc3a1-98ac-41e9-8305-b7ea39ed65ad
Content-Type: application/json

--- response: 201 in 253 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:57 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341297"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341297"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2155
correlation: qa-fedd459b-88df-4113-a57c-b895b7b54d94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fedd459b-88df-4113-a57c-b895b7b54d94
Content-Type: application/json

--- response: 404 in 237 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341297"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341297"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
