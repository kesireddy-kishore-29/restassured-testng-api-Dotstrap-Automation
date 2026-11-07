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
| 1 | `POST /booking` | 200 | 161 | `qa-9078142a-56ea-449d-97be-01b14a77ff1c` |
| 2 | `PATCH /booking/{id}` | 200 | 269 | `qa-0cbf8037-dfe6-45e1-8810-07866d0df017` |
| 3 | `DELETE /booking/{id}` | 201 | 168 | `qa-6078e9f3-24a6-4810-aee2-6b7f5859f494` |
| 4 | `GET /booking/{id}` | 404 | 176 | `qa-dd690f97-09fd-4dcd-a54e-77d052b84990` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-9078142a-56ea-449d-97be-01b14a77ff1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9078142a-56ea-449d-97be-01b14a77ff1c
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-48f52e06","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}

--- response: 200 in 161 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:08 GMT
Etag: W/"d0-kbBoAO/Ui6z2j8wHfVRxoiOGZgQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2215,"booking":{"firstname":"Linus","lastname":"Guest-48f52e06","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/2215
correlation: qa-0cbf8037-dfe6-45e1-8810-07866d0df017

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0cbf8037-dfe6-45e1-8810-07866d0df017
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 269 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:08 GMT
Etag: W/"b3-jKLzCaClUXr/drkvP4Cc8g8qNDY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-48f52e06","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2215
correlation: qa-6078e9f3-24a6-4810-aee2-6b7f5859f494

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-6078e9f3-24a6-4810-aee2-6b7f5859f494
Content-Type: application/json

--- response: 201 in 168 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:08 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2215
correlation: qa-dd690f97-09fd-4dcd-a54e-77d052b84990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd690f97-09fd-4dcd-a54e-77d052b84990
Content-Type: application/json

--- response: 404 in 176 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:08 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
