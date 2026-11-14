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
| 1 | `POST /booking` | 200 | 754 | `qa-5f84f994-be10-4d52-aad0-406570a9d896` |
| 2 | `PUT /booking/{id}` | 403 | 277 | `qa-70263e66-dd10-452b-b4d9-7d2e5ffa25ff` |
| 3 | `GET /booking/{id}` | 200 | 247 | `qa-49386732-673c-489f-8868-6c4c5e9d5f9e` |
| 4 | `POST /auth` | 200 | 259 | `qa-5656ae90-98de-4122-b40b-d2b9ebf95ed3` |
| 5 | `DELETE /booking/{id}` | 201 | 260 | `qa-45a70ffb-693d-4b7a-9e27-04fda372fb22` |
| 6 | `GET /booking/{id}` | 404 | 261 | `qa-f1d9f343-d8e2-4c0d-acc8-12cda1f1ff1d` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-5f84f994-be10-4d52-aad0-406570a9d896

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f84f994-be10-4d52-aad0-406570a9d896
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-36fc5151","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}

--- response: 200 in 754 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:52 GMT
Etag: W/"cf-Q2Pys2CkOXBLykjmOrDAqlchOAA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=fHWYHhlK2PV0nTWSwOrBr15POIlmWKwUR3R13neopZw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218152"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=fHWYHhlK2PV0nTWSwOrBr15POIlmWKwUR3R13neopZw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218152"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2589,"booking":{"firstname":"Keep","lastname":"Guest-36fc5151","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2589
correlation: qa-70263e66-dd10-452b-b4d9-7d2e5ffa25ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70263e66-dd10-452b-b4d9-7d2e5ffa25ff
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-f9a44046","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}

--- response: 403 in 277 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:53 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7bkQ73C2%2B0JbLv9VHERTk2e3jDA0KdeUVjd8TPbB5WQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218153"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7bkQ73C2%2B0JbLv9VHERTk2e3jDA0KdeUVjd8TPbB5WQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218153"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2589
correlation: qa-49386732-673c-489f-8868-6c4c5e9d5f9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49386732-673c-489f-8868-6c4c5e9d5f9e
Content-Type: application/json

--- response: 200 in 247 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:53 GMT
Etag: W/"b2-FMASV/xqgRbVBERc9BtjdSqH6bQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7bkQ73C2%2B0JbLv9VHERTk2e3jDA0KdeUVjd8TPbB5WQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218153"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7bkQ73C2%2B0JbLv9VHERTk2e3jDA0KdeUVjd8TPbB5WQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218153"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-36fc5151","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-5656ae90-98de-4122-b40b-d2b9ebf95ed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5656ae90-98de-4122-b40b-d2b9ebf95ed3
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 259 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:54 GMT
Etag: W/"1b-eKgOoRPK9ljMvzNMwy0gBtejldw"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218154"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218154"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/2589
correlation: qa-45a70ffb-693d-4b7a-9e27-04fda372fb22

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-45a70ffb-693d-4b7a-9e27-04fda372fb22
Content-Type: application/json

--- response: 201 in 260 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:54 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218154"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218154"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/2589
correlation: qa-f1d9f343-d8e2-4c0d-acc8-12cda1f1ff1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1d9f343-d8e2-4c0d-acc8-12cda1f1ff1d
Content-Type: application/json

--- response: 404 in 261 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:54 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218154"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=CSF97bhFCfpfPvn7UD1qN3eZo3wMyR3qTR6K3cJQ0fM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218154"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
