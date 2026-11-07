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
| 1 | `POST /booking` | 200 | 770 | `qa-219f139b-5b74-4324-b920-37acd82dda6b` |
| 2 | `PUT /booking/{id}` | 403 | 189 | `qa-5327b110-8a69-4a3f-8800-a0b29859153b` |
| 3 | `GET /booking/{id}` | 200 | 207 | `qa-0371da19-7fc0-49de-bf70-6ff2028bdc3a` |
| 4 | `POST /auth` | 200 | 187 | `qa-00b2aa28-4a99-4d1b-a092-4e5fed221325` |
| 5 | `DELETE /booking/{id}` | 201 | 193 | `qa-5c2eee09-3461-4604-921d-2f3dc013fa43` |
| 6 | `GET /booking/{id}` | 404 | 186 | `qa-7639f135-c938-46f3-ae69-510f96d745a0` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-219f139b-5b74-4324-b920-37acd82dda6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-219f139b-5b74-4324-b920-37acd82dda6b
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-54cb78d5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}

--- response: 200 in 770 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:41 GMT
Etag: W/"ce-e1pUbOOQAJ5Swh1Ep1h9R2FLQKQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=L01nQ%2FGsyf3iAOZ8%2FSp4baRMXg2qw30xriTVeibpE18%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698901"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=L01nQ%2FGsyf3iAOZ8%2FSp4baRMXg2qw30xriTVeibpE18%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698901"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":432,"booking":{"firstname":"Keep","lastname":"Guest-54cb78d5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/432
correlation: qa-5327b110-8a69-4a3f-8800-a0b29859153b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5327b110-8a69-4a3f-8800-a0b29859153b
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-488e6cb1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}

--- response: 403 in 189 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:41 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=L01nQ%2FGsyf3iAOZ8%2FSp4baRMXg2qw30xriTVeibpE18%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698901"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=L01nQ%2FGsyf3iAOZ8%2FSp4baRMXg2qw30xriTVeibpE18%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698901"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/432
correlation: qa-0371da19-7fc0-49de-bf70-6ff2028bdc3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0371da19-7fc0-49de-bf70-6ff2028bdc3a
Content-Type: application/json

--- response: 200 in 207 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:42 GMT
Etag: W/"b2-b9zVciaegBJ8mFQnQ4Dxvarrk+U"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nljFKTLgSRWSfyJaQRPw4rdGeZAUYHmgQLA%2FTBMIOvE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698902"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nljFKTLgSRWSfyJaQRPw4rdGeZAUYHmgQLA%2FTBMIOvE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698902"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-54cb78d5","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-00b2aa28-4a99-4d1b-a092-4e5fed221325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00b2aa28-4a99-4d1b-a092-4e5fed221325
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 187 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:42 GMT
Etag: W/"1b-htt7c3+ryS6u0HD5nVtGkyRtPEM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nljFKTLgSRWSfyJaQRPw4rdGeZAUYHmgQLA%2FTBMIOvE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698902"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nljFKTLgSRWSfyJaQRPw4rdGeZAUYHmgQLA%2FTBMIOvE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698902"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/432
correlation: qa-5c2eee09-3461-4604-921d-2f3dc013fa43

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5c2eee09-3461-4604-921d-2f3dc013fa43
Content-Type: application/json

--- response: 201 in 193 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/432
correlation: qa-7639f135-c938-46f3-ae69-510f96d745a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7639f135-c938-46f3-ae69-510f96d745a0
Content-Type: application/json

--- response: 404 in 186 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
