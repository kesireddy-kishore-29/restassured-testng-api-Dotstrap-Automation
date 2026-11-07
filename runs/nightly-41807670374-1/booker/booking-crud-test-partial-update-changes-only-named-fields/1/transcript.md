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
| 1 | `POST /booking` | 200 | 210 | `qa-d80bf4dc-0a5b-4a5c-8331-ccbc70ff5451` |
| 2 | `PATCH /booking/{id}` | 200 | 200 | `qa-68318a9c-a2e6-482a-91ba-49fb7007653d` |
| 3 | `DELETE /booking/{id}` | 201 | 203 | `qa-afdbf9a2-1c4e-495d-ba2c-d8a593a11555` |
| 4 | `GET /booking/{id}` | 404 | 214 | `qa-be4e6616-83fe-429e-8efb-5454ebe9d879` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d80bf4dc-0a5b-4a5c-8331-ccbc70ff5451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d80bf4dc-0a5b-4a5c-8331-ccbc70ff5451
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-f1dfa112","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}

--- response: 200 in 210 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:17 GMT
Etag: W/"d0-2bYzq2L+TkPs6exL1RccpKMYHkg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3877,"booking":{"firstname":"Linus","lastname":"Guest-f1dfa112","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/3877
correlation: qa-68318a9c-a2e6-482a-91ba-49fb7007653d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-68318a9c-a2e6-482a-91ba-49fb7007653d
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 200 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:18 GMT
Etag: W/"b3-JbzQgDhxFnKm3o5O0IwSdRqhDec"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=rHRz4z6j26vhp2W0loWwStVJWz8LFu0i64Ia6tJMWus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784498"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=rHRz4z6j26vhp2W0loWwStVJWz8LFu0i64Ia6tJMWus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784498"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-f1dfa112","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3877
correlation: qa-afdbf9a2-1c4e-495d-ba2c-d8a593a11555

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-afdbf9a2-1c4e-495d-ba2c-d8a593a11555
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
#4 GET https://restful-booker.herokuapp.com/booking/3877
correlation: qa-be4e6616-83fe-429e-8efb-5454ebe9d879

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be4e6616-83fe-429e-8efb-5454ebe9d879
Content-Type: application/json

--- response: 404 in 214 ms ---
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
