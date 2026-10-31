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
| 1 | `POST /booking` | 200 | 222 | `qa-e3eca776-4d48-476d-b27f-8abecc404572` |
| 2 | `PUT /booking/{id}` | 200 | 252 | `qa-3f462400-3486-4533-8f78-a5670b5cffea` |
| 3 | `DELETE /booking/{id}` | 201 | 218 | `qa-2df4b9da-283d-49fd-891b-f3ae7503f58a` |
| 4 | `GET /booking/{id}` | 404 | 256 | `qa-76d741ab-2dc8-4f50-af8b-9f1b2a1d0538` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-e3eca776-4d48-476d-b27f-8abecc404572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3eca776-4d48-476d-b27f-8abecc404572
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-0355e0bf","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}

--- response: 200 in 222 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:06 GMT
Etag: W/"cd-U1eQBLVqkTIKaHNZYnOrmr2V95I"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263146"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263146"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4329,"booking":{"firstname":"QA","lastname":"Guest-0355e0bf","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4329
correlation: qa-3f462400-3486-4533-8f78-a5670b5cffea

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-3f462400-3486-4533-8f78-a5670b5cffea
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-1d2ccc9f","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}

--- response: 200 in 252 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:06 GMT
Etag: W/"b3-q7ckYDCDM5Kwyp7hL9k4kOLPnEo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263146"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263146"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-1d2ccc9f","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-28","checkout":"2026-12-01"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4329
correlation: qa-2df4b9da-283d-49fd-891b-f3ae7503f58a

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2df4b9da-283d-49fd-891b-f3ae7503f58a
Content-Type: application/json

--- response: 201 in 218 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:06 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263146"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263146"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4329
correlation: qa-76d741ab-2dc8-4f50-af8b-9f1b2a1d0538

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76d741ab-2dc8-4f50-af8b-9f1b2a1d0538
Content-Type: application/json

--- response: 404 in 256 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 29 Oct 2026 08:39:06 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793263146"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=imiGb3ba0ssLgyRuCWgb7EDGlIXxTGIKLD37bLKv3RE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793263146"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
