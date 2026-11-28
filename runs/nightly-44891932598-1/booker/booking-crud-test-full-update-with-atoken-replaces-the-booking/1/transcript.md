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
| 1 | `POST /booking` | 200 | 17 | `qa-3d6c1893-4f3b-4472-a5e5-325567f1b326` |
| 2 | `PUT /booking/{id}` | 200 | 20 | `qa-0a67a1d0-1afa-4609-ae0b-0183cc337b6f` |
| 3 | `DELETE /booking/{id}` | 201 | 18 | `qa-619e225b-a5df-41bd-8819-3b59592d66c0` |
| 4 | `GET /booking/{id}` | 404 | 19 | `qa-8085ddb8-d869-42ca-84c2-4dd41a4e78f9` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-3d6c1893-4f3b-4472-a5e5-325567f1b326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d6c1893-4f3b-4472-a5e5-325567f1b326
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-bbc7d742","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}

--- response: 200 in 17 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"cd-YJb5lFhziHBEz/SXa40q08rh6hM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3168,"booking":{"firstname":"QA","lastname":"Guest-bbc7d742","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3168
correlation: qa-0a67a1d0-1afa-4609-ae0b-0183cc337b6f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0a67a1d0-1afa-4609-ae0b-0183cc337b6f
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-206e4e91","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}

--- response: 200 in 20 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"b3-F4xzooORvUCBvQiQ/m/MyAtdCvY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-206e4e91","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-21","checkout":"2026-12-24"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3168
correlation: qa-619e225b-a5df-41bd-8819-3b59592d66c0

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-619e225b-a5df-41bd-8819-3b59592d66c0
Content-Type: application/json

--- response: 201 in 18 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3168
correlation: qa-8085ddb8-d869-42ca-84c2-4dd41a4e78f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8085ddb8-d869-42ca-84c2-4dd41a4e78f9
Content-Type: application/json

--- response: 404 in 19 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 21 Nov 2026 09:57:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795255024"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=AjBivoHz%2FAsuFjcBadkbY7lK7HYBbxWlSAJN6hh2ByY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795255024"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
