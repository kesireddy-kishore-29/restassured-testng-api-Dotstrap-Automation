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
| 1 | `POST /booking` | 200 | 223 | `qa-3340cc74-9ed7-4425-9934-1bcdf4c14601` |
| 2 | `PUT /booking/{id}` | 200 | 259 | `qa-1eec2e5e-55fd-4237-9cb5-1984740c3ac8` |
| 3 | `DELETE /booking/{id}` | 201 | 260 | `qa-bc5df320-ff3f-4945-9568-123b5f314aa5` |
| 4 | `GET /booking/{id}` | 404 | 237 | `qa-b9552f19-b09b-458d-a6e4-06938e90210d` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-3340cc74-9ed7-4425-9934-1bcdf4c14601

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3340cc74-9ed7-4425-9934-1bcdf4c14601
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-739ba772","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}

--- response: 200 in 223 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:05 GMT
Etag: W/"cd-A76NNrNsI7rLEdxjXXuuSYANOLc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2221,"booking":{"firstname":"QA","lastname":"Guest-739ba772","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2221
correlation: qa-1eec2e5e-55fd-4237-9cb5-1984740c3ac8

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1eec2e5e-55fd-4237-9cb5-1984740c3ac8
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-8d41af57","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}

--- response: 200 in 259 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:05 GMT
Etag: W/"b3-21NmwoP+uFT5qB46kaAnXiZEpiE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-8d41af57","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-23","checkout":"2026-11-26"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2221
correlation: qa-bc5df320-ff3f-4945-9568-123b5f314aa5

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-bc5df320-ff3f-4945-9568-123b5f314aa5
Content-Type: application/json

--- response: 201 in 260 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:05 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=pvKXOLNfH7KSYrwITJDwli1Ka1d2RF%2F9wqiy2YSk7y8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2221
correlation: qa-b9552f19-b09b-458d-a6e4-06938e90210d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9552f19-b09b-458d-a6e4-06938e90210d
Content-Type: application/json

--- response: 404 in 237 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 24 Oct 2026 07:25:06 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=fEZYMJI76TBggV7ouCBInL4kUCki41ukW9MwNhyHH1A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792826706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=fEZYMJI76TBggV7ouCBInL4kUCki41ukW9MwNhyHH1A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792826706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
