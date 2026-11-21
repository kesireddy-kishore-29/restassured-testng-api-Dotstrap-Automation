# Transcript: An update without a valid token is refused and changes nothing [Optional.empty]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[0]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 803 | `qa-d9ffb6b4-0951-4e76-b834-aabe0f54c55a` |
| 2 | `PUT /booking/{id}` | 403 | 189 | `qa-0c164077-46a3-4662-a2bd-7920f65968a3` |
| 3 | `GET /booking/{id}` | 200 | 201 | `qa-3b3b1a2e-789a-4ed2-9512-5759b738efb6` |
| 4 | `POST /auth` | 200 | 189 | `qa-f8e64012-5dd9-4767-be06-91e19b3480a8` |
| 5 | `DELETE /booking/{id}` | 201 | 184 | `qa-098ba8d5-9545-447b-8638-ea12ba293867` |
| 6 | `GET /booking/{id}` | 404 | 180 | `qa-5a5f4475-1ace-4fa6-9772-2f1f0f58729b` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d9ffb6b4-0951-4e76-b834-aabe0f54c55a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9ffb6b4-0951-4e76-b834-aabe0f54c55a
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-a0f8d325","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}

--- response: 200 in 803 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:32 GMT
Etag: W/"cf-7yiqHvrl6eh6hujjg++7RXMvzJg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nt%2FGyz%2BDwUcYxWxz2HiAgNulOCsZzMFBxulimxa%2BlGA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477392"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nt%2FGyz%2BDwUcYxWxz2HiAgNulOCsZzMFBxulimxa%2BlGA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477392"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2942,"booking":{"firstname":"Keep","lastname":"Guest-a0f8d325","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2942
correlation: qa-0c164077-46a3-4662-a2bd-7920f65968a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c164077-46a3-4662-a2bd-7920f65968a3
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-28294574","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}

--- response: 403 in 189 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:33 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=5xjL70WHVp%2B0C9334deQgt67G8atQsRRjcCNaT7XN%2Fs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477393"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=5xjL70WHVp%2B0C9334deQgt67G8atQsRRjcCNaT7XN%2Fs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477393"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2942
correlation: qa-3b3b1a2e-789a-4ed2-9512-5759b738efb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b3b1a2e-789a-4ed2-9512-5759b738efb6
Content-Type: application/json

--- response: 200 in 201 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:33 GMT
Etag: W/"b2-D6w6UEvamdVd+IcpcBoKTWx//qU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=5xjL70WHVp%2B0C9334deQgt67G8atQsRRjcCNaT7XN%2Fs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477393"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=5xjL70WHVp%2B0C9334deQgt67G8atQsRRjcCNaT7XN%2Fs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477393"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-a0f8d325","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-12","checkout":"2026-12-15"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-f8e64012-5dd9-4767-be06-91e19b3480a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8e64012-5dd9-4767-be06-91e19b3480a8
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 189 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:34 GMT
Etag: W/"1b-mznj7LWY4+4ejUFo66J9UnJtYFA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477394"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477394"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/2942
correlation: qa-098ba8d5-9545-447b-8638-ea12ba293867

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-098ba8d5-9545-447b-8638-ea12ba293867
Content-Type: application/json

--- response: 201 in 184 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:34 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477394"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477394"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/2942
correlation: qa-5a5f4475-1ace-4fa6-9772-2f1f0f58729b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a5f4475-1ace-4fa6-9772-2f1f0f58729b
Content-Type: application/json

--- response: 404 in 180 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:34 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477394"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BBhWQAH%2FNhVNELyJ0uo%2FRIpHdtIT912Fymn9EVSKQm0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477394"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
