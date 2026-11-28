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
| 1 | `POST /booking` | 200 | 252 | `qa-dba7faeb-5238-41b3-b06c-f9cc796a1cf2` |
| 2 | `PUT /booking/{id}` | 200 | 254 | `qa-3d464b20-f786-443a-aefa-0fc5153d3a6b` |
| 3 | `DELETE /booking/{id}` | 201 | 253 | `qa-3eb694f8-e75f-423e-9ac8-f7527e1c29e5` |
| 4 | `GET /booking/{id}` | 404 | 228 | `qa-563d6c28-b3c4-48d6-a41c-7df30bfdfad1` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-dba7faeb-5238-41b3-b06c-f9cc796a1cf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dba7faeb-5238-41b3-b06c-f9cc796a1cf2
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-81f52344","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 252 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:56 GMT
Etag: W/"cd-83KBD4diCTcaAdY7TzLpeB1MxVw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=PZyfTABGTXiZF7PEgPoZ4V0jPP74BbJgNpY5bPLsAOc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341296"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=PZyfTABGTXiZF7PEgPoZ4V0jPP74BbJgNpY5bPLsAOc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341296"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2150,"booking":{"firstname":"QA","lastname":"Guest-81f52344","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2150
correlation: qa-3d464b20-f786-443a-aefa-0fc5153d3a6b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-3d464b20-f786-443a-aefa-0fc5153d3a6b
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-f8332c0e","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 254 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 22 Nov 2026 09:54:57 GMT
Etag: W/"b3-SeTTWrvIipJtW2deaI9/E/hjDgM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795341297"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=JU%2BL2eLkpq6s8Xm8j6244ZVb8OnJGp3nMnrRoecBCxU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795341297"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-f8332c0e","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-22","checkout":"2026-12-25"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2150
correlation: qa-3eb694f8-e75f-423e-9ac8-f7527e1c29e5

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-3eb694f8-e75f-423e-9ac8-f7527e1c29e5
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
#4 GET https://restful-booker.herokuapp.com/booking/2150
correlation: qa-563d6c28-b3c4-48d6-a41c-7df30bfdfad1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-563d6c28-b3c4-48d6-a41c-7df30bfdfad1
Content-Type: application/json

--- response: 404 in 228 ms ---
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
