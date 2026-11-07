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
| 1 | `POST /booking` | 200 | 176 | `qa-2991d372-4a84-459e-8703-54b4e5b280ec` |
| 2 | `PUT /booking/{id}` | 200 | 186 | `qa-ce80e589-7a7e-4a6b-bb9c-3cff827bc18d` |
| 3 | `DELETE /booking/{id}` | 201 | 187 | `qa-2898eec0-5717-48c2-97a9-62118e968fe4` |
| 4 | `GET /booking/{id}` | 404 | 195 | `qa-0b5690a0-d9b6-46d7-9888-8da1f5ffb920` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-2991d372-4a84-459e-8703-54b4e5b280ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2991d372-4a84-459e-8703-54b4e5b280ec
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-44854406","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}

--- response: 200 in 176 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:37 GMT
Etag: W/"cc-4vKA9QY+/1uYjeJup+gOaHM1OK0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":275,"booking":{"firstname":"QA","lastname":"Guest-44854406","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/275
correlation: qa-ce80e589-7a7e-4a6b-bb9c-3cff827bc18d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-ce80e589-7a7e-4a6b-bb9c-3cff827bc18d
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-b064e863","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}

--- response: 200 in 186 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:37 GMT
Etag: W/"b3-vOIP9JcF5ohfO6BTr86bgLG3CJs"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-b064e863","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/275
correlation: qa-2898eec0-5717-48c2-97a9-62118e968fe4

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2898eec0-5717-48c2-97a9-62118e968fe4
Content-Type: application/json

--- response: 201 in 187 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/275
correlation: qa-0b5690a0-d9b6-46d7-9888-8da1f5ffb920

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b5690a0-d9b6-46d7-9888-8da1f5ffb920
Content-Type: application/json

--- response: 404 in 195 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:38 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TIiuNP26pftWaN2qO1A55hI9EWWKpXHo%2FyWvAjnPckk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435498"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TIiuNP26pftWaN2qO1A55hI9EWWKpXHo%2FyWvAjnPckk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435498"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
