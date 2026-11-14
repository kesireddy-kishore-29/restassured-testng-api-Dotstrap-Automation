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
| 1 | `POST /booking` | 200 | 759 | `qa-743fc007-715e-4707-818c-f0829c4dda5a` |
| 2 | `PUT /booking/{id}` | 403 | 273 | `qa-15b0ab18-4b26-46fd-9d90-7d2ff06ee02b` |
| 3 | `GET /booking/{id}` | 200 | 249 | `qa-3e1f48ee-d9b3-417a-82ac-9a81587a9c23` |
| 4 | `POST /auth` | 200 | 268 | `qa-d9da14ee-243c-41f4-832f-9bd0a37a78f9` |
| 5 | `DELETE /booking/{id}` | 201 | 257 | `qa-c5dccf3f-d69f-442a-936d-04f0ca4ba1ab` |
| 6 | `GET /booking/{id}` | 404 | 235 | `qa-9358ae93-52c8-46cd-b571-bbb947489416` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-743fc007-715e-4707-818c-f0829c4dda5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-743fc007-715e-4707-818c-f0829c4dda5a
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-3b052d19","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}

--- response: 200 in 759 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:13 GMT
Etag: W/"cf-lY68Do3/S4dXlOk9tq15kk6sT2Q"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ubmGOD5wXRwpXnwP1JPnbmSZg7z9FOrJQJBIed99KKg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647113"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ubmGOD5wXRwpXnwP1JPnbmSZg7z9FOrJQJBIed99KKg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647113"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2062,"booking":{"firstname":"Keep","lastname":"Guest-3b052d19","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2062
correlation: qa-15b0ab18-4b26-46fd-9d90-7d2ff06ee02b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15b0ab18-4b26-46fd-9d90-7d2ff06ee02b
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-a0759163","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}

--- response: 403 in 273 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:13 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ubmGOD5wXRwpXnwP1JPnbmSZg7z9FOrJQJBIed99KKg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647113"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ubmGOD5wXRwpXnwP1JPnbmSZg7z9FOrJQJBIed99KKg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647113"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2062
correlation: qa-3e1f48ee-d9b3-417a-82ac-9a81587a9c23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e1f48ee-d9b3-417a-82ac-9a81587a9c23
Content-Type: application/json

--- response: 200 in 249 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:14 GMT
Etag: W/"b2-z1xuxUFcusZZL3TnwUrwZwYWoi4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FkRYtj9nY%2BiWNvw64D%2B1bSjSbv6Y%2BH8FonnQuN9hQc0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647114"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FkRYtj9nY%2BiWNvw64D%2B1bSjSbv6Y%2BH8FonnQuN9hQc0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647114"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-3b052d19","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-d9da14ee-243c-41f4-832f-9bd0a37a78f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9da14ee-243c-41f4-832f-9bd0a37a78f9
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 268 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:14 GMT
Etag: W/"1b-JwHYzoSHaEaEU9W6e4HB74tCJEo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FkRYtj9nY%2BiWNvw64D%2B1bSjSbv6Y%2BH8FonnQuN9hQc0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647114"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FkRYtj9nY%2BiWNvw64D%2B1bSjSbv6Y%2BH8FonnQuN9hQc0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647114"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/2062
correlation: qa-c5dccf3f-d69f-442a-936d-04f0ca4ba1ab

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c5dccf3f-d69f-442a-936d-04f0ca4ba1ab
Content-Type: application/json

--- response: 201 in 257 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:15 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647115"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647115"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/2062
correlation: qa-9358ae93-52c8-46cd-b571-bbb947489416

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9358ae93-52c8-46cd-b571-bbb947489416
Content-Type: application/json

--- response: 404 in 235 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:15 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647115"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iuKnHNn04Z0ChA4iT5Rmphss6EcN6RnYysZdIU4Kk5E%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647115"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
