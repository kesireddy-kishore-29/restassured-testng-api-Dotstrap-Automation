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
| 1 | `POST /booking` | 200 | 259 | `qa-a55b21c1-120b-416f-b3e9-fb79cd58c7b7` |
| 2 | `PUT /booking/{id}` | 200 | 134 | `qa-2e17c259-d04d-459e-9cfb-8cf1c4bc691f` |
| 3 | `DELETE /booking/{id}` | 201 | 139 | `qa-0e0f9ba5-6be3-4598-9103-97362fc18419` |
| 4 | `GET /booking/{id}` | 404 | 144 | `qa-09acb530-dcaa-427d-a4dc-13ab26c21ca7` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a55b21c1-120b-416f-b3e9-fb79cd58c7b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a55b21c1-120b-416f-b3e9-fb79cd58c7b7
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-a65580cc","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}

--- response: 200 in 259 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:28 GMT
Etag: W/"cd-5VOokZ+FcSztsXJU8UD8i03QrK8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525008"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=1nj6tlnqTZ0gTR738f6cCggpHJ%2F6bYXwXjCOSFh%2BlwU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525008"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1377,"booking":{"firstname":"QA","lastname":"Guest-a65580cc","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1377
correlation: qa-2e17c259-d04d-459e-9cfb-8cf1c4bc691f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2e17c259-d04d-459e-9cfb-8cf1c4bc691f
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-40a77ee5","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}

--- response: 200 in 134 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:29 GMT
Etag: W/"b3-ni5cJZydweDCAM2675mNO3DPxjc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525009"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525009"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-40a77ee5","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/1377
correlation: qa-0e0f9ba5-6be3-4598-9103-97362fc18419

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0e0f9ba5-6be3-4598-9103-97362fc18419
Content-Type: application/json

--- response: 201 in 139 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:29 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525009"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525009"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1377
correlation: qa-09acb530-dcaa-427d-a4dc-13ab26c21ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09acb530-dcaa-427d-a4dc-13ab26c21ca7
Content-Type: application/json

--- response: 404 in 144 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:29 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525009"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525009"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
