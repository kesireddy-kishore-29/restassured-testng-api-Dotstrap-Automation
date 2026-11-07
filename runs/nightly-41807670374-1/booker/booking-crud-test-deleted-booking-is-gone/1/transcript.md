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
| 1 | `POST /booking` | 200 | 212 | `qa-6aa916f0-a631-4270-833e-c2d90f1253d2` |
| 2 | `DELETE /booking/{id}` | 201 | 209 | `qa-329d5266-64ea-4c79-8963-05bf5105d419` |
| 3 | `GET /booking/{id}` | 404 | 198 | `qa-18294805-5100-4871-a733-0ed57c09549c` |
| 4 | `GET /booking/{id}` | 404 | 204 | `qa-b1b4d370-5f31-43ed-a9aa-ac68a9c6fcca` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-6aa916f0-a631-4270-833e-c2d90f1253d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aa916f0-a631-4270-833e-c2d90f1253d2
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-4358c8aa","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}

--- response: 200 in 212 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:17 GMT
Etag: W/"cd-lBa7RE9e5/gpdAf0/QrLTNgEhBY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3866,"booking":{"firstname":"QA","lastname":"Guest-4358c8aa","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/3866
correlation: qa-329d5266-64ea-4c79-8963-05bf5105d419

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-329d5266-64ea-4c79-8963-05bf5105d419
Content-Type: application/json

--- response: 201 in 209 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:17 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3866
correlation: qa-18294805-5100-4871-a733-0ed57c09549c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18294805-5100-4871-a733-0ed57c09549c
Content-Type: application/json

--- response: 404 in 198 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:17 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3866
correlation: qa-b1b4d370-5f31-43ed-a9aa-ac68a9c6fcca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1b4d370-5f31-43ed-a9aa-ac68a9c6fcca
Content-Type: application/json

--- response: 404 in 204 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:17 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
