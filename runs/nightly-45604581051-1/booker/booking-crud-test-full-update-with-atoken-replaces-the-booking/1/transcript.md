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
| 1 | `POST /booking` | 200 | 92 | `qa-a2d6fc71-186c-4c9b-8409-67391fdbfd89` |
| 2 | `PUT /booking/{id}` | 200 | 99 | `qa-8b6ccc0c-eb6c-4cbc-b521-b6d0bbc53197` |
| 3 | `DELETE /booking/{id}` | 201 | 106 | `qa-8c9ba03d-ce05-457b-a39b-ee919154762d` |
| 4 | `GET /booking/{id}` | 404 | 98 | `qa-3865f12c-0dae-4da4-ba35-0c6f59870a2a` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a2d6fc71-186c-4c9b-8409-67391fdbfd89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2d6fc71-186c-4c9b-8409-67391fdbfd89
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-14419c38","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 92 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:45 GMT
Etag: W/"cd-bgwZ9s37fgiIq29uJmrIPZA00HM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606065"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606065"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3529,"booking":{"firstname":"QA","lastname":"Guest-14419c38","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3529
correlation: qa-8b6ccc0c-eb6c-4cbc-b521-b6d0bbc53197

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8b6ccc0c-eb6c-4cbc-b521-b6d0bbc53197
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-1548e088","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 99 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 25 Nov 2026 11:27:45 GMT
Etag: W/"b3-ny0kJlhaVn6BXxx8iiw5+Usd67o"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795606065"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UtMHrdg8SwKEMAazhGUR6lytPDRCAtFBvm%2Bo%2FoaTM9I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795606065"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-1548e088","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-25","checkout":"2026-12-28"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3529
correlation: qa-8c9ba03d-ce05-457b-a39b-ee919154762d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8c9ba03d-ce05-457b-a39b-ee919154762d
Content-Type: application/json

--- response: 201 in 106 ms ---
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
#4 GET https://restful-booker.herokuapp.com/booking/3529
correlation: qa-3865f12c-0dae-4da4-ba35-0c6f59870a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3865f12c-0dae-4da4-ba35-0c6f59870a2a
Content-Type: application/json

--- response: 404 in 98 ms ---
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
