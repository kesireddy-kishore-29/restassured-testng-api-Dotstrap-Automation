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
| 1 | `POST /booking` | 200 | 261 | `qa-99ca521a-2707-4405-9ce8-2de639652903` |
| 2 | `PATCH /booking/{id}` | 200 | 157 | `qa-c7e2a0c3-eba9-43e4-8f38-08df6370ea57` |
| 3 | `DELETE /booking/{id}` | 201 | 145 | `qa-f81ee12c-c056-4ba1-949b-60a2c795adb8` |
| 4 | `GET /booking/{id}` | 404 | 156 | `qa-27efb217-76bd-4d0a-aac9-e80d96a4d712` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-99ca521a-2707-4405-9ce8-2de639652903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99ca521a-2707-4405-9ce8-2de639652903
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-22e5f19f","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}

--- response: 200 in 261 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:16 GMT
Etag: W/"cf-MY3TtSwY2u+Hy9B5mKgP8v/kCDo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562936"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562936"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":739,"booking":{"firstname":"Linus","lastname":"Guest-22e5f19f","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/739
correlation: qa-c7e2a0c3-eba9-43e4-8f38-08df6370ea57

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c7e2a0c3-eba9-43e4-8f38-08df6370ea57
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 157 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:16 GMT
Etag: W/"b3-QjMFtd2FisW7SqMFovIzvphwe/c"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562936"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562936"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-22e5f19f","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-13","checkout":"2026-12-16"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/739
correlation: qa-f81ee12c-c056-4ba1-949b-60a2c795adb8

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f81ee12c-c056-4ba1-949b-60a2c795adb8
Content-Type: application/json

--- response: 201 in 145 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:16 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562936"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562936"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/739
correlation: qa-27efb217-76bd-4d0a-aac9-e80d96a4d712

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27efb217-76bd-4d0a-aac9-e80d96a4d712
Content-Type: application/json

--- response: 404 in 156 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 13 Nov 2026 09:42:16 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794562936"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=UW%2FNEbhVUcn3La4VmBSCWpGBgc6euLWfffVQY6QIO7I%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794562936"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
