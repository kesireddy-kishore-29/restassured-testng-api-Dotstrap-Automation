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
| 1 | `POST /booking` | 200 | 183 | `qa-f1a5b8e3-6ace-412b-84b6-981d47bb8bb9` |
| 2 | `PUT /booking/{id}` | 403 | 180 | `qa-e886d684-ff4f-43e8-ad66-1bf80dcf2519` |
| 3 | `GET /booking/{id}` | 200 | 211 | `qa-3780b289-0b9a-4eb7-bd26-1cb90bd09e5b` |
| 4 | `DELETE /booking/{id}` | 201 | 181 | `qa-38d2e7af-ac88-4755-b00c-8c0794eb2928` |
| 5 | `GET /booking/{id}` | 404 | 178 | `qa-d38be95b-df89-4bf0-9732-1e7181326c07` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f1a5b8e3-6ace-412b-84b6-981d47bb8bb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1a5b8e3-6ace-412b-84b6-981d47bb8bb9
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-f5300165","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}

--- response: 200 in 183 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:36 GMT
Etag: W/"ce-buRiclIHxuqY9UF7EXHHOaIssyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":265,"booking":{"firstname":"Keep","lastname":"Guest-f5300165","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/265
correlation: qa-e886d684-ff4f-43e8-ad66-1bf80dcf2519

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e886d684-ff4f-43e8-ad66-1bf80dcf2519
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-da6213bd","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}

--- response: 403 in 180 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:36 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/265
correlation: qa-3780b289-0b9a-4eb7-bd26-1cb90bd09e5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3780b289-0b9a-4eb7-bd26-1cb90bd09e5b
Content-Type: application/json

--- response: 200 in 211 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:36 GMT
Etag: W/"b2-m0wboebguqjkFJf2YdaDrN22Q/E"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=jmol7ns3f7bfgETJOpPvmDFD%2FSyZcRcSEmhNdujhKF4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-f5300165","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/265
correlation: qa-38d2e7af-ac88-4755-b00c-8c0794eb2928

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-38d2e7af-ac88-4755-b00c-8c0794eb2928
Content-Type: application/json

--- response: 201 in 181 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/265
correlation: qa-d38be95b-df89-4bf0-9732-1e7181326c07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d38be95b-df89-4bf0-9732-1e7181326c07
Content-Type: application/json

--- response: 404 in 178 ms ---
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
