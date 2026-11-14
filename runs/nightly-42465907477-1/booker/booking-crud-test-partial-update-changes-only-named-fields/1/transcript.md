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
| 1 | `POST /booking` | 200 | 24 | `qa-dabb8fca-b3fb-431d-b4c5-1f6c5d1bb906` |
| 2 | `PATCH /booking/{id}` | 200 | 24 | `qa-9f1da004-36bc-4828-9cc1-8abfe3874c45` |
| 3 | `DELETE /booking/{id}` | 201 | 19 | `qa-40d37fe8-3e22-4ddf-a913-aa4ab82add8a` |
| 4 | `GET /booking/{id}` | 404 | 20 | `qa-01de3e09-a8e1-4f7d-b905-f034ce83b25c` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-dabb8fca-b3fb-431d-b4c5-1f6c5d1bb906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dabb8fca-b3fb-431d-b4c5-1f6c5d1bb906
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-e591f623","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}

--- response: 200 in 24 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"d0-LXcux1djrRp6cMpJIBSShHRKD0w"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3960,"booking":{"firstname":"Linus","lastname":"Guest-e591f623","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/3960
correlation: qa-9f1da004-36bc-4828-9cc1-8abfe3874c45

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-9f1da004-36bc-4828-9cc1-8abfe3874c45
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 24 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"b3-BajYEidLClTsjrCR7h4W86YhgX0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-e591f623","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3960
correlation: qa-40d37fe8-3e22-4ddf-a913-aa4ab82add8a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-40d37fe8-3e22-4ddf-a913-aa4ab82add8a
Content-Type: application/json

--- response: 201 in 19 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3960
correlation: qa-01de3e09-a8e1-4f7d-b905-f034ce83b25c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01de3e09-a8e1-4f7d-b905-f034ce83b25c
Content-Type: application/json

--- response: 404 in 20 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:05 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
