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
| 1 | `POST /booking` | 200 | 98 | `qa-c0507bc2-1b73-4873-ad62-58efb742ff97` |
| 2 | `PATCH /booking/{id}` | 200 | 103 | `qa-1093c2c6-583d-4c18-aaa0-32271bacd1ff` |
| 3 | `DELETE /booking/{id}` | 201 | 95 | `qa-b49c19f1-e829-4d0e-9600-21189694e2ab` |
| 4 | `GET /booking/{id}` | 404 | 96 | `qa-5aebfb43-b5ca-41dd-805a-e22125f6f400` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-c0507bc2-1b73-4873-ad62-58efb742ff97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0507bc2-1b73-4873-ad62-58efb742ff97
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-d18bb6c1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}

--- response: 200 in 98 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"d0-1bWww/TxfSEQqvrk6WTfpK39Sug"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4511,"booking":{"firstname":"Linus","lastname":"Guest-d18bb6c1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/4511
correlation: qa-1093c2c6-583d-4c18-aaa0-32271bacd1ff

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1093c2c6-583d-4c18-aaa0-32271bacd1ff
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 103 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"b3-0e7++tebADVXDqfbiWQfr11Xinc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-d18bb6c1","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4511
correlation: qa-b49c19f1-e829-4d0e-9600-21189694e2ab

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b49c19f1-e829-4d0e-9600-21189694e2ab
Content-Type: application/json

--- response: 201 in 95 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:01 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DUsqyKbhpB%2B7hStaqaAS9U%2BNjZyD0fGs9zNHTEg6TC4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169401"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DUsqyKbhpB%2B7hStaqaAS9U%2BNjZyD0fGs9zNHTEg6TC4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169401"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4511
correlation: qa-5aebfb43-b5ca-41dd-805a-e22125f6f400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aebfb43-b5ca-41dd-805a-e22125f6f400
Content-Type: application/json

--- response: 404 in 96 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:01 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=DUsqyKbhpB%2B7hStaqaAS9U%2BNjZyD0fGs9zNHTEg6TC4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169401"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=DUsqyKbhpB%2B7hStaqaAS9U%2BNjZyD0fGs9zNHTEg6TC4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169401"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
