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
| 1 | `POST /booking` | 200 | 102 | `qa-6820427e-df2f-4b52-ac1d-79549ac254cc` |
| 2 | `PUT /booking/{id}` | 403 | 91 | `qa-e1a2a3c8-694f-476b-a064-24d11034c7d4` |
| 3 | `GET /booking/{id}` | 200 | 101 | `qa-75509ad9-f347-42c2-be7a-0e5ae1675011` |
| 4 | `DELETE /booking/{id}` | 201 | 102 | `qa-70420e72-7401-4927-9416-fbf90ac6f890` |
| 5 | `GET /booking/{id}` | 404 | 101 | `qa-28057469-df85-4102-889b-69d3e94bbbd3` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-6820427e-df2f-4b52-ac1d-79549ac254cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6820427e-df2f-4b52-ac1d-79549ac254cc
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-4d9c5666","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}

--- response: 200 in 102 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"cf-VtxliWIThdB84BA8OzwtssCvmU0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4503,"booking":{"firstname":"Keep","lastname":"Guest-4d9c5666","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4503
correlation: qa-e1a2a3c8-694f-476b-a064-24d11034c7d4

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e1a2a3c8-694f-476b-a064-24d11034c7d4
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-a1c51a69","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}

--- response: 403 in 91 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4503
correlation: qa-75509ad9-f347-42c2-be7a-0e5ae1675011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75509ad9-f347-42c2-be7a-0e5ae1675011
Content-Type: application/json

--- response: 200 in 101 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"b2-SZpr7evr/nUfk/IFe/L+AHh/mf4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-4d9c5666","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-20","checkout":"2026-12-23"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/4503
correlation: qa-70420e72-7401-4927-9416-fbf90ac6f890

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-70420e72-7401-4927-9416-fbf90ac6f890
Content-Type: application/json

--- response: 201 in 102 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/4503
correlation: qa-28057469-df85-4102-889b-69d3e94bbbd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28057469-df85-4102-889b-69d3e94bbbd3
Content-Type: application/json

--- response: 404 in 101 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 20 Nov 2026 10:10:00 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795169400"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3%2B3QEkoqZA67bCidnBpEMG01SaSo2NGXy686p%2BIzp14%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795169400"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
