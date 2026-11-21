# Transcript: A full update with a token replaces the booking

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#fullUpdateWithATokenReplacesTheBooking` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 31 | `qa-74908570-106e-4787-8fcd-035cee2e9bc2` |
| 2 | `PUT /booking/{id}` | 200 | 30 | `qa-5e3978de-a160-48d3-b04d-999da43dcc07` |
| 3 | `DELETE /booking/{id}` | 201 | 29 | `qa-a549a2e5-e290-43a9-a42a-52f2e9c4d6a1` |
| 4 | `GET /booking/{id}` | 404 | 35 | `qa-9800bfc8-d841-480b-a7be-ddf79ae66119` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-74908570-106e-4787-8fcd-035cee2e9bc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74908570-106e-4787-8fcd-035cee2e9bc2
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-4b0df645","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}

--- response: 200 in 31 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"cd-irr02EAvW+WZGAXrjDA1jkqS78A"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1445,"booking":{"firstname":"QA","lastname":"Guest-4b0df645","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1445
correlation: qa-5e3978de-a160-48d3-b04d-999da43dcc07

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5e3978de-a160-48d3-b04d-999da43dcc07
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-38c57606","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}

--- response: 200 in 30 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"b3-il1R98rmRIQcl69KAXE3+0+yYA8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-38c57606","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/1445
correlation: qa-a549a2e5-e290-43a9-a42a-52f2e9c4d6a1

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a549a2e5-e290-43a9-a42a-52f2e9c4d6a1
Content-Type: application/json

--- response: 201 in 29 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1445
correlation: qa-9800bfc8-d841-480b-a7be-ddf79ae66119

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9800bfc8-d841-480b-a7be-ddf79ae66119
Content-Type: application/json

--- response: 404 in 35 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
