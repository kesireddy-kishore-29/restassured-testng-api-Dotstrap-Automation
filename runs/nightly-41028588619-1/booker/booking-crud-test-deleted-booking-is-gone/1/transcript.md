# Transcript: A deleted booking is gone (404 on read)

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#deletedBookingIsGone` |
| Features | FEAT-BOOK-04 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 175 | `qa-712aecca-537d-4687-8677-b27724d6f4f0` |
| 2 | `DELETE /booking/{id}` | 201 | 177 | `qa-d92049d9-a4e2-45c2-ab30-eff13fae0845` |
| 3 | `GET /booking/{id}` | 404 | 174 | `qa-5cae7d2c-4190-40f4-8e4a-e4119cb97e90` |
| 4 | `GET /booking/{id}` | 404 | 177 | `qa-f0b69d4a-f387-4dae-8fa4-9098ce0f29b1` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-712aecca-537d-4687-8677-b27724d6f4f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-712aecca-537d-4687-8677-b27724d6f4f0
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-4fd1a5c1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}

--- response: 200 in 175 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"cd-1+OSpxBjclvp6LnQkG/W+VwkGvI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2690,"booking":{"firstname":"QA","lastname":"Guest-4fd1a5c1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/2690
correlation: qa-d92049d9-a4e2-45c2-ab30-eff13fae0845

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-d92049d9-a4e2-45c2-ab30-eff13fae0845
Content-Type: application/json

--- response: 201 in 177 ms ---
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

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2690
correlation: qa-5cae7d2c-4190-40f4-8e4a-e4119cb97e90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cae7d2c-4190-40f4-8e4a-e4119cb97e90
Content-Type: application/json

--- response: 404 in 174 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2690
correlation: qa-f0b69d4a-f387-4dae-8fa4-9098ce0f29b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0b69d4a-f387-4dae-8fa4-9098ce0f29b1
Content-Type: application/json

--- response: 404 in 177 ms ---
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
