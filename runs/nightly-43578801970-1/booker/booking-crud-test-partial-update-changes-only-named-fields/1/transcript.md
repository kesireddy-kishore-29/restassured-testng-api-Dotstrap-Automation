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
| 1 | `POST /booking` | 200 | 252 | `qa-f56757ce-4f73-40fa-b148-be576f008500` |
| 2 | `PATCH /booking/{id}` | 200 | 237 | `qa-c565cd35-d20b-4a77-9586-06cba6d69361` |
| 3 | `DELETE /booking/{id}` | 201 | 235 | `qa-46669be5-c080-4148-831f-b26bae4ba249` |
| 4 | `GET /booking/{id}` | 404 | 253 | `qa-cfc6a0da-2809-44a0-92a0-814a60776fa9` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f56757ce-4f73-40fa-b148-be576f008500

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f56757ce-4f73-40fa-b148-be576f008500
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-7e70a2b1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}

--- response: 200 in 252 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:17 GMT
Etag: W/"d0-lFtj/1RBQFObV6NaMZTmwgMb77Q"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647117"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647117"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2098,"booking":{"firstname":"Linus","lastname":"Guest-7e70a2b1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/2098
correlation: qa-c565cd35-d20b-4a77-9586-06cba6d69361

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c565cd35-d20b-4a77-9586-06cba6d69361
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 237 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:17 GMT
Etag: W/"b3-bjnv4p6SCFDMv0VqWfteFKWt7nY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647117"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647117"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-7e70a2b1","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2098
correlation: qa-46669be5-c080-4148-831f-b26bae4ba249

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-46669be5-c080-4148-831f-b26bae4ba249
Content-Type: application/json

--- response: 201 in 235 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:17 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647117"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647117"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2098
correlation: qa-cfc6a0da-2809-44a0-92a0-814a60776fa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfc6a0da-2809-44a0-92a0-814a60776fa9
Content-Type: application/json

--- response: 404 in 253 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:17 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647117"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GoiOLItBB2Fgi5O38tGdRHJfzntdPnnYLnRKOT%2BBpyQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647117"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
