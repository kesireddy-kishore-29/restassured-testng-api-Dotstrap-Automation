# Transcript: An update without a valid token is refused and changes nothing [Optional.empty]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[0]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 198 | `qa-f4018915-76b5-48dc-b86c-cc090841fecf` |
| 2 | `PUT /booking/{id}` | 403 | 198 | `qa-be048850-c4f1-427b-9774-a48490086352` |
| 3 | `GET /booking/{id}` | 200 | 208 | `qa-fe1f5203-e69b-43c5-9ab4-2fd8e97a442f` |
| 4 | `DELETE /booking/{id}` | 201 | 194 | `qa-69795638-dd5a-484c-bd2f-8374869de563` |
| 5 | `GET /booking/{id}` | 404 | 196 | `qa-8e4b8926-d400-4f6c-ba3b-2f838b3355ca` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-f4018915-76b5-48dc-b86c-cc090841fecf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4018915-76b5-48dc-b86c-cc090841fecf
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-07f9bb7c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 198 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:29 GMT
Etag: W/"cf-J5pABiV98O7YTVq+rPW5tKifGMY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5100,"booking":{"firstname":"Keep","lastname":"Guest-07f9bb7c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5100
correlation: qa-be048850-c4f1-427b-9774-a48490086352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be048850-c4f1-427b-9774-a48490086352
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-70dcacfd","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}

--- response: 403 in 198 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:30 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FBtXgbMWA%2BGn4txOjN1ptFoP8b7XIam7PkApmO4BWUE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914030"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FBtXgbMWA%2BGn4txOjN1ptFoP8b7XIam7PkApmO4BWUE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914030"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5100
correlation: qa-fe1f5203-e69b-43c5-9ab4-2fd8e97a442f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe1f5203-e69b-43c5-9ab4-2fd8e97a442f
Content-Type: application/json

--- response: 200 in 208 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:30 GMT
Etag: W/"b2-8rs5I/YffrjF1AyaIht8Abt/4Yo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FBtXgbMWA%2BGn4txOjN1ptFoP8b7XIam7PkApmO4BWUE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914030"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FBtXgbMWA%2BGn4txOjN1ptFoP8b7XIam7PkApmO4BWUE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914030"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-07f9bb7c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/5100
correlation: qa-69795638-dd5a-484c-bd2f-8374869de563

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-69795638-dd5a-484c-bd2f-8374869de563
Content-Type: application/json

--- response: 201 in 194 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:30 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FBtXgbMWA%2BGn4txOjN1ptFoP8b7XIam7PkApmO4BWUE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914030"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FBtXgbMWA%2BGn4txOjN1ptFoP8b7XIam7PkApmO4BWUE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914030"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/5100
correlation: qa-8e4b8926-d400-4f6c-ba3b-2f838b3355ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e4b8926-d400-4f6c-ba3b-2f838b3355ca
Content-Type: application/json

--- response: 404 in 196 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:31 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CT8JeQ%2FC75jG%2BfKg7HmOGZ%2F8t7h6AdHl8Rf4ng5I0pU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914031"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CT8JeQ%2FC75jG%2BfKg7HmOGZ%2F8t7h6AdHl8Rf4ng5I0pU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914031"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
