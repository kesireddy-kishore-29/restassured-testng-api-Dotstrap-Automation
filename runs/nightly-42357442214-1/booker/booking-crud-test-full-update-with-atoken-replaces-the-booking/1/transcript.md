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
| 1 | `POST /booking` | 200 | 176 | `qa-a3d78486-d107-44ad-910f-454d58c7d94b` |
| 2 | `PUT /booking/{id}` | 200 | 283 | `qa-5d9bd767-ff69-4df1-b80c-451b75bf2c9c` |
| 3 | `DELETE /booking/{id}` | 201 | 166 | `qa-317a109f-5d65-4f19-b09f-48eb3defb538` |
| 4 | `GET /booking/{id}` | 404 | 265 | `qa-47da4d4f-615e-4ef7-a6b2-4ee460ae4daf` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a3d78486-d107-44ad-910f-454d58c7d94b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3d78486-d107-44ad-910f-454d58c7d94b
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-c7e17967","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}

--- response: 200 in 176 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"cd-sYTEWxPZu6cHX4d+aMecZSfyjQU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2211,"booking":{"firstname":"QA","lastname":"Guest-c7e17967","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2211
correlation: qa-5d9bd767-ff69-4df1-b80c-451b75bf2c9c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5d9bd767-ff69-4df1-b80c-451b75bf2c9c
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-55ed631c","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}

--- response: 200 in 283 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:08 GMT
Etag: W/"b3-nwDOEEJIt0dIrpcsvQ0b+C00vBY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-55ed631c","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2211
correlation: qa-317a109f-5d65-4f19-b09f-48eb3defb538

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-317a109f-5d65-4f19-b09f-48eb3defb538
Content-Type: application/json

--- response: 201 in 166 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:08 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2211
correlation: qa-47da4d4f-615e-4ef7-a6b2-4ee460ae4daf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47da4d4f-615e-4ef7-a6b2-4ee460ae4daf
Content-Type: application/json

--- response: 404 in 265 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:08 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041708"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=eXCGrPkHt5N5WOH%2B0F95cIKgPTXEobi5z3BeJZqkXp4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041708"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
