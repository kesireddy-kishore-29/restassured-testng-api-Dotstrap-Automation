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
| 1 | `POST /booking` | 200 | 27 | `qa-aaf0732c-7c78-42a4-980b-7510749a28c1` |
| 2 | `PUT /booking/{id}` | 200 | 26 | `qa-9527eeee-8e3c-4a5e-a820-bb7a81f8e679` |
| 3 | `DELETE /booking/{id}` | 201 | 22 | `qa-b42429ca-960a-4087-8363-1b9aa3d5384f` |
| 4 | `GET /booking/{id}` | 404 | 23 | `qa-75ed1513-e1ce-4507-abd7-87a984f4db2c` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-aaf0732c-7c78-42a4-980b-7510749a28c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaf0732c-7c78-42a4-980b-7510749a28c1
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-49a3998f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 27 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"cd-MsWWWsqgGH7THQl1NLSnmiS3jCs"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3806,"booking":{"firstname":"QA","lastname":"Guest-49a3998f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3806
correlation: qa-9527eeee-8e3c-4a5e-a820-bb7a81f8e679

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-9527eeee-8e3c-4a5e-a820-bb7a81f8e679
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-1a52609d","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 26 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"b3-DeR01oeqfKb6ZBjxcQhde0DP3Ps"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-1a52609d","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3806
correlation: qa-b42429ca-960a-4087-8363-1b9aa3d5384f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b42429ca-960a-4087-8363-1b9aa3d5384f
Content-Type: application/json

--- response: 201 in 22 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3806
correlation: qa-75ed1513-e1ce-4507-abd7-87a984f4db2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75ed1513-e1ce-4507-abd7-87a984f4db2c
Content-Type: application/json

--- response: 404 in 23 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
