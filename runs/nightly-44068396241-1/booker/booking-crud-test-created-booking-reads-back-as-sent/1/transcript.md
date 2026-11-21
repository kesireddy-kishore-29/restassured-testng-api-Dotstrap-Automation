# Transcript: A created booking reads back exactly as sent

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#createdBookingReadsBackAsSent` |
| Features | FEAT-BOOK-01, FEAT-BOOK-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 28 | `qa-711b65ee-1eac-4433-bbd5-6616aff0d575` |
| 2 | `GET /booking/{id}` | 200 | 28 | `qa-d78341b6-5091-4dcf-ba1e-3af8b3a26e7e` |
| 3 | `POST /auth` | 200 | 28 | `qa-6c2c6068-f452-4455-ac3c-6b3775a08bbc` |
| 4 | `DELETE /booking/{id}` | 201 | 30 | `qa-187a57a5-966e-44da-bf43-219e16eb69f7` |
| 5 | `GET /booking/{id}` | 404 | 29 | `qa-273cfa64-e7a1-4347-ab9b-f55d4778e2b5` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-711b65ee-1eac-4433-bbd5-6616aff0d575

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-711b65ee-1eac-4433-bbd5-6616aff0d575
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-130da454","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Late check-in"}

--- response: 200 in 28 ms ---
Content-Length: 210
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:07 GMT
Etag: W/"d2-TFNJ07X0vUCNF/Am3YfHnLwcZ+Y"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912607"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912607"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5731,"booking":{"firstname":"Ada","lastname":"Guest-130da454","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/5731
correlation: qa-d78341b6-5091-4dcf-ba1e-3af8b3a26e7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d78341b6-5091-4dcf-ba1e-3af8b3a26e7e
Content-Type: application/json

--- response: 200 in 28 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"b5-e3nO6O2uBIYaohJ3aSc7ChlD6co"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-130da454","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-6c2c6068-f452-4455-ac3c-6b3775a08bbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2c6068-f452-4455-ac3c-6b3775a08bbc
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 28 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"1b-YN7OjwuGUvNKVbYxOrNKdpgT9Ck"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5731
correlation: qa-187a57a5-966e-44da-bf43-219e16eb69f7

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-187a57a5-966e-44da-bf43-219e16eb69f7
Content-Type: application/json

--- response: 201 in 30 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5731
correlation: qa-273cfa64-e7a1-4347-ab9b-f55d4778e2b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-273cfa64-e7a1-4347-ab9b-f55d4778e2b5
Content-Type: application/json

--- response: 404 in 29 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
