# Transcript: An update without a valid token is refused and changes nothing [Optional[not-a-real-token]]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[1]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 177 | `qa-8ce4c834-a17b-4ffc-939c-66f964678e70` |
| 2 | `PUT /booking/{id}` | 403 | 181 | `qa-42fdae88-4338-45fa-88a7-5e703e39e7bb` |
| 3 | `GET /booking/{id}` | 200 | 176 | `qa-7dd04417-e703-4a9b-9564-21a6472a76fe` |
| 4 | `DELETE /booking/{id}` | 201 | 182 | `qa-541d6bd8-772e-4614-bc4d-8c7d66121663` |
| 5 | `GET /booking/{id}` | 404 | 181 | `qa-25a25783-e9e1-4c06-b7ec-0b19eb1eacc7` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-8ce4c834-a17b-4ffc-939c-66f964678e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ce4c834-a17b-4ffc-939c-66f964678e70
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-8c3afec9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}

--- response: 200 in 177 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"cf-Vq0vBjXNWpzvrx5j24i5PxnN5Cw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2684,"booking":{"firstname":"Keep","lastname":"Guest-8c3afec9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2684
correlation: qa-42fdae88-4338-45fa-88a7-5e703e39e7bb

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-42fdae88-4338-45fa-88a7-5e703e39e7bb
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-317d1e51","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}

--- response: 403 in 181 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2684
correlation: qa-7dd04417-e703-4a9b-9564-21a6472a76fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dd04417-e703-4a9b-9564-21a6472a76fe
Content-Type: application/json

--- response: 200 in 176 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"b2-oT+BW1MR1XXOM2u6+bmTPt5v5cA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-8c3afec9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2684
correlation: qa-541d6bd8-772e-4614-bc4d-8c7d66121663

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-541d6bd8-772e-4614-bc4d-8c7d66121663
Content-Type: application/json

--- response: 201 in 182 ms ---
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2684
correlation: qa-25a25783-e9e1-4c06-b7ec-0b19eb1eacc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25a25783-e9e1-4c06-b7ec-0b19eb1eacc7
Content-Type: application/json

--- response: 404 in 181 ms ---
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
