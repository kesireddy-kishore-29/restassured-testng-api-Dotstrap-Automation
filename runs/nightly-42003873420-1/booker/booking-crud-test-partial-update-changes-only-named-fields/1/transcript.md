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
| 1 | `POST /booking` | 200 | 100 | `qa-7ec44d72-e184-44ec-95ad-56b58bbb05cb` |
| 2 | `PATCH /booking/{id}` | 200 | 102 | `qa-7cfe715d-bca8-429b-a47b-36dd661b029a` |
| 3 | `DELETE /booking/{id}` | 201 | 108 | `qa-c10c7f74-bfa6-4a35-985a-0735576ead40` |
| 4 | `GET /booking/{id}` | 404 | 104 | `qa-3d8a28ab-bb44-4d92-bef7-53e3a8e730c0` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-7ec44d72-e184-44ec-95ad-56b58bbb05cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ec44d72-e184-44ec-95ad-56b58bbb05cb
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-c99974d1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}

--- response: 200 in 100 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:58 GMT
Etag: W/"d0-6fHE9S4gV/imT/LVH4mYjeiOzOk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871478"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871478"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3891,"booking":{"firstname":"Linus","lastname":"Guest-c99974d1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/3891
correlation: qa-7cfe715d-bca8-429b-a47b-36dd661b029a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-7cfe715d-bca8-429b-a47b-36dd661b029a
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 102 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:58 GMT
Etag: W/"b3-YyABDYymWZY0P30yPrt8ZbZW7f8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871478"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871478"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-c99974d1","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-05","checkout":"2026-12-08"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3891
correlation: qa-c10c7f74-bfa6-4a35-985a-0735576ead40

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c10c7f74-bfa6-4a35-985a-0735576ead40
Content-Type: application/json

--- response: 201 in 108 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:58 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871478"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871478"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3891
correlation: qa-3d8a28ab-bb44-4d92-bef7-53e3a8e730c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d8a28ab-bb44-4d92-bef7-53e3a8e730c0
Content-Type: application/json

--- response: 404 in 104 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 05 Nov 2026 09:37:58 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793871478"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=EIsJPK%2FDx8JQ9JJ8TGPGmWr0h%2BzHAGbGZAnng%2F4nJ1U%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793871478"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
