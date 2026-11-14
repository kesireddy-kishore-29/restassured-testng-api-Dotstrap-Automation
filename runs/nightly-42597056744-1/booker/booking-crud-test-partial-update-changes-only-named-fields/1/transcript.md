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
| 1 | `POST /booking` | 200 | 236 | `qa-a2db08a3-a4f3-4fbc-9994-3f8ba13a67ad` |
| 2 | `PATCH /booking/{id}` | 200 | 274 | `qa-85db8a18-2f96-4fa3-849a-220ff907714b` |
| 3 | `DELETE /booking/{id}` | 201 | 264 | `qa-6f833386-2b5e-4ab4-a3d7-c7577d0dcfed` |
| 4 | `GET /booking/{id}` | 404 | 242 | `qa-486a84b2-7c42-49ec-b620-d02b8d6b84cb` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a2db08a3-a4f3-4fbc-9994-3f8ba13a67ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2db08a3-a4f3-4fbc-9994-3f8ba13a67ad
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-1a36befc","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}

--- response: 200 in 236 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:56 GMT
Etag: W/"d0-Gi/95K+6ARrpuJs1/X+nGTY647g"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218156"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218156"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2628,"booking":{"firstname":"Linus","lastname":"Guest-1a36befc","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/2628
correlation: qa-85db8a18-2f96-4fa3-849a-220ff907714b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-85db8a18-2f96-4fa3-849a-220ff907714b
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 274 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:56 GMT
Etag: W/"b3-AVEf/ruKRamnYKryXej1e2UULFQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218156"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218156"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-1a36befc","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2628
correlation: qa-6f833386-2b5e-4ab4-a3d7-c7577d0dcfed

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-6f833386-2b5e-4ab4-a3d7-c7577d0dcfed
Content-Type: application/json

--- response: 201 in 264 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:56 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218156"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218156"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2628
correlation: qa-486a84b2-7c42-49ec-b620-d02b8d6b84cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-486a84b2-7c42-49ec-b620-d02b8d6b84cb
Content-Type: application/json

--- response: 404 in 242 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=3mx0jfyKT0q%2BUtHFiKRmmfTeCpFPrSyctLFXYOjI3EE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218157"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=3mx0jfyKT0q%2BUtHFiKRmmfTeCpFPrSyctLFXYOjI3EE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218157"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
