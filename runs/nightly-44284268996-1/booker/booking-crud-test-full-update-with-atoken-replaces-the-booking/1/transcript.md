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
| 1 | `POST /booking` | 200 | 288 | `qa-50b4d1f1-d552-402f-a0fc-b0fe6d05d24b` |
| 2 | `PUT /booking/{id}` | 200 | 296 | `qa-20c60b89-5a8f-4eab-8573-3774e056045e` |
| 3 | `DELETE /booking/{id}` | 201 | 283 | `qa-e9fe0e4a-ae9e-4397-ae85-a4c67516b1ca` |
| 4 | `GET /booking/{id}` | 404 | 285 | `qa-f467802d-d567-46ef-9ee4-4f312c110552` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-50b4d1f1-d552-402f-a0fc-b0fe6d05d24b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50b4d1f1-d552-402f-a0fc-b0fe6d05d24b
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-9990c87e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}

--- response: 200 in 288 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:57 GMT
Etag: W/"cd-r3+RxMPTazCHvkS65+TQm+l/Kes"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997197"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997197"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4709,"booking":{"firstname":"QA","lastname":"Guest-9990c87e","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4709
correlation: qa-20c60b89-5a8f-4eab-8573-3774e056045e

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-20c60b89-5a8f-4eab-8573-3774e056045e
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-401363c1","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}

--- response: 200 in 296 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:57 GMT
Etag: W/"b3-DxVjbJCrXVecYpe6+HVXJGXAgL0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997197"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997197"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-401363c1","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4709
correlation: qa-e9fe0e4a-ae9e-4397-ae85-a4c67516b1ca

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e9fe0e4a-ae9e-4397-ae85-a4c67516b1ca
Content-Type: application/json

--- response: 201 in 283 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:57 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997197"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997197"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4709
correlation: qa-f467802d-d567-46ef-9ee4-4f312c110552

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f467802d-d567-46ef-9ee4-4f312c110552
Content-Type: application/json

--- response: 404 in 285 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:57 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997197"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997197"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
