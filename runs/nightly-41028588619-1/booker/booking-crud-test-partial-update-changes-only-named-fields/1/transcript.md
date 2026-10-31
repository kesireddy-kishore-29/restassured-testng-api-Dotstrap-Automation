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
| 1 | `POST /booking` | 200 | 174 | `qa-30beec92-69b0-40ae-9da3-778cf98c3b4b` |
| 2 | `PATCH /booking/{id}` | 200 | 178 | `qa-f632c383-152e-4ffe-b0e7-11b77ba97eb4` |
| 3 | `DELETE /booking/{id}` | 201 | 176 | `qa-019c2ce1-6d15-4493-86ee-bb1a4bc4a97b` |
| 4 | `GET /booking/{id}` | 404 | 179 | `qa-126e6055-bf7a-4d16-8b1a-2b9288722dc7` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-30beec92-69b0-40ae-9da3-778cf98c3b4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30beec92-69b0-40ae-9da3-778cf98c3b4b
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-2830cc58","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}

--- response: 200 in 174 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:57 GMT
Etag: W/"d0-b6w3Z4kvSz6BQgqdbIJNmTzTr3E"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349957"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349957"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2698,"booking":{"firstname":"Linus","lastname":"Guest-2830cc58","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/2698
correlation: qa-f632c383-152e-4ffe-b0e7-11b77ba97eb4

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f632c383-152e-4ffe-b0e7-11b77ba97eb4
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 178 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:57 GMT
Etag: W/"b3-rpVHE1M7hJV34CX6X6tJKThS1lU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349957"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=WAtaFuW2C321nwCbZSEwfckIKSmS%2FGSZoixRAefA48A%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349957"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-2830cc58","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2698
correlation: qa-019c2ce1-6d15-4493-86ee-bb1a4bc4a97b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-019c2ce1-6d15-4493-86ee-bb1a4bc4a97b
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
#4 GET https://restful-booker.herokuapp.com/booking/2698
correlation: qa-126e6055-bf7a-4d16-8b1a-2b9288722dc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-126e6055-bf7a-4d16-8b1a-2b9288722dc7
Content-Type: application/json

--- response: 404 in 179 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:58 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Vtys%2Bwovp6AzlOuDvkVJYcHXcz81fpwwslD%2BiXELqhc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349958"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Vtys%2Bwovp6AzlOuDvkVJYcHXcz81fpwwslD%2BiXELqhc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349958"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
