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
| 1 | `POST /booking` | 200 | 23 | `qa-a0cb0469-becf-4af6-b2fa-be24be60927d` |
| 2 | `PUT /booking/{id}` | 200 | 20 | `qa-11348da2-ad0e-4a95-a25e-6f35d078467f` |
| 3 | `DELETE /booking/{id}` | 201 | 23 | `qa-a70f28c0-6298-4d69-9193-8cb7f520f6f2` |
| 4 | `GET /booking/{id}` | 404 | 23 | `qa-1c938304-5ea8-4501-af82-aeafe1ada0d9` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a0cb0469-becf-4af6-b2fa-be24be60927d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0cb0469-becf-4af6-b2fa-be24be60927d
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-ef371d6c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}

--- response: 200 in 23 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"cd-O3n0BofTipmv57lqs4eV61gvzw4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5737,"booking":{"firstname":"QA","lastname":"Guest-ef371d6c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5737
correlation: qa-11348da2-ad0e-4a95-a25e-6f35d078467f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-11348da2-ad0e-4a95-a25e-6f35d078467f
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-eae80e2c","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}

--- response: 200 in 20 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"b3-Qy/eE83hFQ50ztYPggKP3VGV+ms"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-eae80e2c","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5737
correlation: qa-a70f28c0-6298-4d69-9193-8cb7f520f6f2

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a70f28c0-6298-4d69-9193-8cb7f520f6f2
Content-Type: application/json

--- response: 201 in 23 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5737
correlation: qa-1c938304-5ea8-4501-af82-aeafe1ada0d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c938304-5ea8-4501-af82-aeafe1ada0d9
Content-Type: application/json

--- response: 404 in 23 ms ---
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
