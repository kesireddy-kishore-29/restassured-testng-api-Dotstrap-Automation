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
| 1 | `POST /booking` | 200 | 28 | `qa-46f7dca0-6929-48b6-afba-396e16482f77` |
| 2 | `PATCH /booking/{id}` | 200 | 24 | `qa-90738ee1-df41-4537-83af-dacb8509024f` |
| 3 | `DELETE /booking/{id}` | 201 | 37 | `qa-a784b7b9-eb8e-4053-8aaf-308777356ab2` |
| 4 | `GET /booking/{id}` | 404 | 31 | `qa-0cfb1cab-8557-4aff-9cc8-8494213a3934` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-46f7dca0-6929-48b6-afba-396e16482f77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46f7dca0-6929-48b6-afba-396e16482f77
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-bc2c3b41","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 28 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"d0-+VC21iLnoJ/lW9ccw6COY9l0oIA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5130,"booking":{"firstname":"Linus","lastname":"Guest-bc2c3b41","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/5130
correlation: qa-90738ee1-df41-4537-83af-dacb8509024f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-90738ee1-df41-4537-83af-dacb8509024f
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 24 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"b3-lh5yHgMe+gBG7xytN+w8UflOIHU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-bc2c3b41","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-11-26","checkout":"2026-11-29"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5130
correlation: qa-a784b7b9-eb8e-4053-8aaf-308777356ab2

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a784b7b9-eb8e-4053-8aaf-308777356ab2
Content-Type: application/json

--- response: 201 in 37 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5130
correlation: qa-0cfb1cab-8557-4aff-9cc8-8494213a3934

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cfb1cab-8557-4aff-9cc8-8494213a3934
Content-Type: application/json

--- response: 404 in 31 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 27 Oct 2026 08:00:29 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793088029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=LFxxkV9OBKMldDC315PsgU31r00%2BKbfUV1hEn73KuPg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793088029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
