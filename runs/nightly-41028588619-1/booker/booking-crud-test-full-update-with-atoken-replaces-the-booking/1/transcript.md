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
| 1 | `POST /booking` | 200 | 173 | `qa-ca2cf3eb-1e40-46b7-93fb-62c49ee24056` |
| 2 | `PUT /booking/{id}` | 200 | 181 | `qa-147e6863-4ec3-4ad7-b7dc-87f5a6c80309` |
| 3 | `DELETE /booking/{id}` | 201 | 176 | `qa-d5b3d3fe-6e46-44d4-9590-282bc02f5197` |
| 4 | `GET /booking/{id}` | 404 | 176 | `qa-8f9cc434-f5af-44f1-9893-f6a31cd50a74` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-ca2cf3eb-1e40-46b7-93fb-62c49ee24056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca2cf3eb-1e40-46b7-93fb-62c49ee24056
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-162ad5d7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}

--- response: 200 in 173 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:57 GMT
Etag: W/"cd-xsMUGbDjFsIAaf/QyroBARv/tVI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349957"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349957"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2695,"booking":{"firstname":"QA","lastname":"Guest-162ad5d7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2695
correlation: qa-147e6863-4ec3-4ad7-b7dc-87f5a6c80309

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-147e6863-4ec3-4ad7-b7dc-87f5a6c80309
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-2b06827d","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}

--- response: 200 in 181 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:57 GMT
Etag: W/"b3-KpqPcG/TME9/H8Xl8WjGbquQ/Ig"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349957"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349957"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-2b06827d","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2695
correlation: qa-d5b3d3fe-6e46-44d4-9590-282bc02f5197

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-d5b3d3fe-6e46-44d4-9590-282bc02f5197
Content-Type: application/json

--- response: 201 in 176 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:57 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349957"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349957"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2695
correlation: qa-8f9cc434-f5af-44f1-9893-f6a31cd50a74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f9cc434-f5af-44f1-9893-f6a31cd50a74
Content-Type: application/json

--- response: 404 in 176 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349957"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349957"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
