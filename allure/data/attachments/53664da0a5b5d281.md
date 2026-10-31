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
| 1 | `POST /booking` | 200 | 186 | `qa-734fb0a7-a479-43b0-a1dd-58cd6789e060` |
| 2 | `DELETE /booking/{id}` | 201 | 183 | `qa-cec28929-e565-4b0e-83d2-aede7aab9303` |
| 3 | `GET /booking/{id}` | 404 | 176 | `qa-0078ccce-2367-40d0-b039-0dea739f73f4` |
| 4 | `GET /booking/{id}` | 404 | 182 | `qa-7eed0804-bd1c-43bb-bb13-f511c69c25d5` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-734fb0a7-a479-43b0-a1dd-58cd6789e060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-734fb0a7-a479-43b0-a1dd-58cd6789e060
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-3bf48787","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}

--- response: 200 in 186 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:36 GMT
Etag: W/"cc-DPHGcNd4P/ekM4IeaIdou5KsCpo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":269,"booking":{"firstname":"QA","lastname":"Guest-3bf48787","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/269
correlation: qa-cec28929-e565-4b0e-83d2-aede7aab9303

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-cec28929-e565-4b0e-83d2-aede7aab9303
Content-Type: application/json

--- response: 201 in 183 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:37 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/269
correlation: qa-0078ccce-2367-40d0-b039-0dea739f73f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0078ccce-2367-40d0-b039-0dea739f73f4
Content-Type: application/json

--- response: 404 in 176 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/269
correlation: qa-7eed0804-bd1c-43bb-bb13-f511c69c25d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eed0804-bd1c-43bb-bb13-f511c69c25d5
Content-Type: application/json

--- response: 404 in 182 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
