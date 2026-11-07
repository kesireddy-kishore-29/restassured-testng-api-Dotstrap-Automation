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
| 1 | `POST /booking` | 200 | 259 | `qa-56ae61ec-c7ec-4646-a47e-33aaca52ee30` |
| 2 | `PATCH /booking/{id}` | 200 | 138 | `qa-30636751-edcf-409f-a4a8-34deeea2deb6` |
| 3 | `DELETE /booking/{id}` | 201 | 149 | `qa-8218f507-7440-4d8a-af31-3e9e9c60833f` |
| 4 | `GET /booking/{id}` | 404 | 134 | `qa-39af4f57-537d-4ec6-8ab6-a9d5a9efedc7` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-56ae61ec-c7ec-4646-a47e-33aaca52ee30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56ae61ec-c7ec-4646-a47e-33aaca52ee30
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-ee452e46","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}

--- response: 200 in 259 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:29 GMT
Etag: W/"d0-hPqp/doKiPWVBT8vrSZywbWitAg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525009"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525009"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1387,"booking":{"firstname":"Linus","lastname":"Guest-ee452e46","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/1387
correlation: qa-30636751-edcf-409f-a4a8-34deeea2deb6

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-30636751-edcf-409f-a4a8-34deeea2deb6
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 138 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 01 Nov 2026 09:23:29 GMT
Etag: W/"b3-56ebKGI4kx+n9yxc2vEcyTuXmIA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793525009"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=uBXrHAmbPN3FmWmDD0%2BS54scMwMiMiimPHX3om3jiDM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793525009"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-ee452e46","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-01","checkout":"2026-12-04"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/1387
correlation: qa-8218f507-7440-4d8a-af31-3e9e9c60833f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8218f507-7440-4d8a-af31-3e9e9c60833f
Content-Type: application/json

--- response: 201 in 149 ms ---
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
#4 GET https://restful-booker.herokuapp.com/booking/1387
correlation: qa-39af4f57-537d-4ec6-8ab6-a9d5a9efedc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39af4f57-537d-4ec6-8ab6-a9d5a9efedc7
Content-Type: application/json

--- response: 404 in 134 ms ---
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
