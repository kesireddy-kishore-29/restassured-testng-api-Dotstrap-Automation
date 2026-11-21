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
| 1 | `POST /booking` | 200 | 28 | `qa-d7e147a3-6172-4e06-872a-d5902567d854` |
| 2 | `PATCH /booking/{id}` | 200 | 35 | `qa-679e38a6-e117-444a-bcd0-2ad683c78bf7` |
| 3 | `DELETE /booking/{id}` | 201 | 33 | `qa-daf78593-1ce8-4b83-a888-1493e47a2b2e` |
| 4 | `GET /booking/{id}` | 404 | 27 | `qa-b1720903-5291-4e71-bc94-c4ab07a9c39c` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d7e147a3-6172-4e06-872a-d5902567d854

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e147a3-6172-4e06-872a-d5902567d854
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-ccb08932","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}

--- response: 200 in 28 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"d0-bhLRT9JB/02gAn2v+oOKLsA/5YQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2814,"booking":{"firstname":"Linus","lastname":"Guest-ccb08932","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/2814
correlation: qa-679e38a6-e117-444a-bcd0-2ad683c78bf7

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-679e38a6-e117-444a-bcd0-2ad683c78bf7
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 35 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"b3-reKZzybK3BbdDAsSefV0m5nDzZw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-ccb08932","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-15","checkout":"2026-12-18"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2814
correlation: qa-daf78593-1ce8-4b83-a888-1493e47a2b2e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-daf78593-1ce8-4b83-a888-1493e47a2b2e
Content-Type: application/json

--- response: 201 in 33 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2814
correlation: qa-b1720903-5291-4e71-bc94-c4ab07a9c39c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1720903-5291-4e71-bc94-c4ab07a9c39c
Content-Type: application/json

--- response: 404 in 27 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:13 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735373"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7Vgh%2FJ3%2BZIAel1jdvtGsx4Wla0lBKRSpZwcEX0Ks49Y%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735373"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
