# Transcript: An update without a valid token is refused and changes nothing [Optional.empty]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[0]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 589 | `qa-177c07ec-6ccf-4e1f-8c5a-241c3d43e3a6` |
| 2 | `PUT /booking/{id}` | 403 | 98 | `qa-5e2e6948-8848-4183-822e-2a82cd86afd0` |
| 3 | `GET /booking/{id}` | 200 | 130 | `qa-255c0306-9bb8-4d97-a702-e30f546ef878` |
| 4 | `POST /auth` | 200 | 116 | `qa-af3bb2b7-d437-45e6-a422-cd897ce4b5ed` |
| 5 | `DELETE /booking/{id}` | 201 | 121 | `qa-19eb25d0-33af-4fbf-9bb4-b6180ec57c59` |
| 6 | `GET /booking/{id}` | 404 | 104 | `qa-0edc071f-ee71-455c-bd7d-972d8050f9b3` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-177c07ec-6ccf-4e1f-8c5a-241c3d43e3a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-177c07ec-6ccf-4e1f-8c5a-241c3d43e3a6
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-d8ed25c3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}

--- response: 200 in 589 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:09:58 GMT
Etag: W/"cf-Mg1mTOIudq90LWufEhenrhLUIBM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=e47PjxWJtBEI0K28g%2BMmS6egQ2GOPbXt%2Bd7G1KQSXh8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169398"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=e47PjxWJtBEI0K28g%2BMmS6egQ2GOPbXt%2Bd7G1KQSXh8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169398"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4486,"booking":{"firstname":"Keep","lastname":"Guest-d8ed25c3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4486
correlation: qa-5e2e6948-8848-4183-822e-2a82cd86afd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e2e6948-8848-4183-822e-2a82cd86afd0
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-c2b52c8d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}

--- response: 403 in 98 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:09:59 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169399"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169399"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4486
correlation: qa-255c0306-9bb8-4d97-a702-e30f546ef878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-255c0306-9bb8-4d97-a702-e30f546ef878
Content-Type: application/json

--- response: 200 in 130 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:09:59 GMT
Etag: W/"b2-TpyI38Czn+1pOZhW0+05QVc72qM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169399"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169399"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-d8ed25c3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-af3bb2b7-d437-45e6-a422-cd897ce4b5ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af3bb2b7-d437-45e6-a422-cd897ce4b5ed
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 116 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:09:59 GMT
Etag: W/"1b-Rn2rMTOUdtDzWvvO0MIL9MsrsMI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169399"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169399"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/4486
correlation: qa-19eb25d0-33af-4fbf-9bb4-b6180ec57c59

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-19eb25d0-33af-4fbf-9bb4-b6180ec57c59
Content-Type: application/json

--- response: 201 in 121 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:09:59 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169399"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=8rnqInX7iS0qpaQLXXLdHqxOnWlRU7xZ3NCcwA7Boo8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169399"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/4486
correlation: qa-0edc071f-ee71-455c-bd7d-972d8050f9b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0edc071f-ee71-455c-bd7d-972d8050f9b3
Content-Type: application/json

--- response: 404 in 104 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
