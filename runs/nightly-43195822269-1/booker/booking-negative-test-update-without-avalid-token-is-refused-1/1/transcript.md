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
| 1 | `POST /booking` | 200 | 180 | `qa-75f88584-3ca1-4777-a3d4-e02006569ca3` |
| 2 | `PUT /booking/{id}` | 403 | 181 | `qa-2d2332da-ca6c-44bd-857a-269e5db1924b` |
| 3 | `GET /booking/{id}` | 200 | 180 | `qa-be9bdb94-8482-4a89-b362-6153bbd6fcaf` |
| 4 | `DELETE /booking/{id}` | 201 | 180 | `qa-828879ef-f549-4506-9782-f4210aedac72` |
| 5 | `GET /booking/{id}` | 404 | 178 | `qa-66168611-d0da-4ab6-8c6d-91f1fcb41328` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-75f88584-3ca1-4777-a3d4-e02006569ca3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75f88584-3ca1-4777-a3d4-e02006569ca3
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-0ab2aa70","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}

--- response: 200 in 180 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:34 GMT
Etag: W/"cf-KG6V/XhX5irC8Qdi2mREwTpTH8k"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477394"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477394"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2963,"booking":{"firstname":"Keep","lastname":"Guest-0ab2aa70","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2963
correlation: qa-2d2332da-ca6c-44bd-857a-269e5db1924b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2d2332da-ca6c-44bd-857a-269e5db1924b
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-b493efcd","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}

--- response: 403 in 181 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2963
correlation: qa-be9bdb94-8482-4a89-b362-6153bbd6fcaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be9bdb94-8482-4a89-b362-6153bbd6fcaf
Content-Type: application/json

--- response: 200 in 180 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"b2-7M9wQ82izX1gHBKKI3n0HrOTP/4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-0ab2aa70","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/2963
correlation: qa-828879ef-f549-4506-9782-f4210aedac72

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-828879ef-f549-4506-9782-f4210aedac72
Content-Type: application/json

--- response: 201 in 180 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/2963
correlation: qa-66168611-d0da-4ab6-8c6d-91f1fcb41328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66168611-d0da-4ab6-8c6d-91f1fcb41328
Content-Type: application/json

--- response: 404 in 178 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:35 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477395"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=xCrnprVTdAPUnJZz5HeXVuHCElDvaMfIb7KxnC4b%2B%2FU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477395"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
