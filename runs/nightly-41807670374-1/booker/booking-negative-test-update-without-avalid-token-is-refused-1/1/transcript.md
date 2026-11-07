# Transcript: An update without a valid token is refused and changes nothing [Optional[not-a-real-token]]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[1]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 202 | `qa-de005f6e-4aed-441a-b457-1e3395a51522` |
| 2 | `PUT /booking/{id}` | 403 | 217 | `qa-7388466d-3f81-457c-84c1-c0ba9e961b51` |
| 3 | `GET /booking/{id}` | 200 | 203 | `qa-83976ac7-d6ef-4e89-b78d-f1ab68bfc0b2` |
| 4 | `DELETE /booking/{id}` | 201 | 215 | `qa-a0c616de-8196-4754-a1b9-3708e2f9a9ba` |
| 5 | `GET /booking/{id}` | 404 | 210 | `qa-c27ec043-e327-42aa-8289-989abc74b437` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-de005f6e-4aed-441a-b457-1e3395a51522

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de005f6e-4aed-441a-b457-1e3395a51522
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-807f7b22","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}

--- response: 200 in 202 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:16 GMT
Etag: W/"cf-K3nu4iEn/SacRj1qzYyPgsyMcOg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3861,"booking":{"firstname":"Keep","lastname":"Guest-807f7b22","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3861
correlation: qa-7388466d-3f81-457c-84c1-c0ba9e961b51

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-7388466d-3f81-457c-84c1-c0ba9e961b51
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-465f81b8","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}

--- response: 403 in 217 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:16 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3861
correlation: qa-83976ac7-d6ef-4e89-b78d-f1ab68bfc0b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83976ac7-d6ef-4e89-b78d-f1ab68bfc0b2
Content-Type: application/json

--- response: 200 in 203 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:17 GMT
Etag: W/"b2-kviGjieBEANgRFHkGaPhhph5luc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eiKgLcMQFnTCNE6hgbuGLCPcbRztExOKbLMm%2FhHsbi4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-807f7b22","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3861
correlation: qa-a0c616de-8196-4754-a1b9-3708e2f9a9ba

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a0c616de-8196-4754-a1b9-3708e2f9a9ba
Content-Type: application/json

--- response: 201 in 215 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3861
correlation: qa-c27ec043-e327-42aa-8289-989abc74b437

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c27ec043-e327-42aa-8289-989abc74b437
Content-Type: application/json

--- response: 404 in 210 ms ---
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
