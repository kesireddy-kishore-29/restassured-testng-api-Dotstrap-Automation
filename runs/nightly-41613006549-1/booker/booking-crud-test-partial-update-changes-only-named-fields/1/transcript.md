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
| 1 | `POST /booking` | 200 | 179 | `qa-fa0053e4-d732-428e-86ce-3b4c6c41e5fb` |
| 2 | `PATCH /booking/{id}` | 200 | 182 | `qa-e6fbdda0-4add-4b25-8984-f73a6f84914b` |
| 3 | `DELETE /booking/{id}` | 201 | 175 | `qa-df8cef71-1985-4cd6-af15-1d5c771b0a17` |
| 4 | `GET /booking/{id}` | 404 | 179 | `qa-40c0273d-8ce4-4e9b-b8c2-36bc4a1aeb3f` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-fa0053e4-d732-428e-86ce-3b4c6c41e5fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa0053e4-d732-428e-86ce-3b4c6c41e5fb
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-46c2db2b","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}

--- response: 200 in 179 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:44 GMT
Etag: W/"cf-jNTNvXY73NS7EWgJLLfemVAvZ+0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698904"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698904"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":463,"booking":{"firstname":"Linus","lastname":"Guest-46c2db2b","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/463
correlation: qa-e6fbdda0-4add-4b25-8984-f73a6f84914b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e6fbdda0-4add-4b25-8984-f73a6f84914b
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 182 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:44 GMT
Etag: W/"b3-BZmb8vAh7AcKtTNb9UBufZ7ndnw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698904"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698904"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-46c2db2b","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/463
correlation: qa-df8cef71-1985-4cd6-af15-1d5c771b0a17

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-df8cef71-1985-4cd6-af15-1d5c771b0a17
Content-Type: application/json

--- response: 201 in 175 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:44 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698904"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698904"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/463
correlation: qa-40c0273d-8ce4-4e9b-b8c2-36bc4a1aeb3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c0273d-8ce4-4e9b-b8c2-36bc4a1aeb3f
Content-Type: application/json

--- response: 404 in 179 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:45 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=266mQpGh8s24AAzhW13jBpw04s%2BVXvfp1pgGO3nT9%2BI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698905"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=266mQpGh8s24AAzhW13jBpw04s%2BVXvfp1pgGO3nT9%2BI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698905"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
