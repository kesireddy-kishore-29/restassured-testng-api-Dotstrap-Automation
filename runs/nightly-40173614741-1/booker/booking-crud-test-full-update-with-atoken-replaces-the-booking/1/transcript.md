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
| 1 | `POST /booking` | 200 | 194 | `qa-431dd7fa-7df6-4a89-a87e-0d03a4713d89` |
| 2 | `PUT /booking/{id}` | 200 | 198 | `qa-f47f2e5d-fcc6-47b9-b366-dd5980bfff06` |
| 3 | `DELETE /booking/{id}` | 201 | 196 | `qa-5a9d7cec-86d7-4f50-90bf-f2173dae17c2` |
| 4 | `GET /booking/{id}` | 404 | 195 | `qa-333d4307-adb7-4427-8403-52fc2394a810` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-431dd7fa-7df6-4a89-a87e-0d03a4713d89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-431dd7fa-7df6-4a89-a87e-0d03a4713d89
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-5bae3c50","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 194 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:29 GMT
Etag: W/"cd-bex7d2Emp/bgrbXRpDppUIeQzPA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5093,"booking":{"firstname":"QA","lastname":"Guest-5bae3c50","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5093
correlation: qa-f47f2e5d-fcc6-47b9-b366-dd5980bfff06

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f47f2e5d-fcc6-47b9-b366-dd5980bfff06
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-796c5e61","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 198 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:29 GMT
Etag: W/"b3-FcYjrBR+ttLLz1M17zffMBIdIpA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-796c5e61","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5093
correlation: qa-5a9d7cec-86d7-4f50-90bf-f2173dae17c2

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5a9d7cec-86d7-4f50-90bf-f2173dae17c2
Content-Type: application/json

--- response: 201 in 196 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:29 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5093
correlation: qa-333d4307-adb7-4427-8403-52fc2394a810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-333d4307-adb7-4427-8403-52fc2394a810
Content-Type: application/json

--- response: 404 in 195 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:29 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
