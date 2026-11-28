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
| 1 | `POST /booking` | 200 | 97 | `qa-e74d434f-88e3-4af2-b61e-6168543cc45c` |
| 2 | `PATCH /booking/{id}` | 200 | 106 | `qa-48517d70-7d05-44ad-b081-e99ff45aa8f4` |
| 3 | `DELETE /booking/{id}` | 201 | 89 | `qa-6a7e0ff8-951a-4e11-8e70-f37e26a147be` |
| 4 | `GET /booking/{id}` | 404 | 110 | `qa-4c3dc707-f595-445d-a877-1643ee9cc217` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-e74d434f-88e3-4af2-b61e-6168543cc45c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e74d434f-88e3-4af2-b61e-6168543cc45c
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-3660e449","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 97 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:45 GMT
Etag: W/"d0-jPpfoUtCx8DWompv3caDbJYgHsI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606065"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606065"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3531,"booking":{"firstname":"Linus","lastname":"Guest-3660e449","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/3531
correlation: qa-48517d70-7d05-44ad-b081-e99ff45aa8f4

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-48517d70-7d05-44ad-b081-e99ff45aa8f4
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 106 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:45 GMT
Etag: W/"b3-8gP34jMI9+jbsYDcjpjfGu+eazY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606065"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606065"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-3660e449","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3531
correlation: qa-6a7e0ff8-951a-4e11-8e70-f37e26a147be

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-6a7e0ff8-951a-4e11-8e70-f37e26a147be
Content-Type: application/json

--- response: 201 in 89 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:45 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606065"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606065"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3531
correlation: qa-4c3dc707-f595-445d-a877-1643ee9cc217

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c3dc707-f595-445d-a877-1643ee9cc217
Content-Type: application/json

--- response: 404 in 110 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:45 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606065"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606065"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
