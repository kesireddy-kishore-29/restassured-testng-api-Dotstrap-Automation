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
| 1 | `POST /booking` | 200 | 733 | `qa-1e5a465f-dcf4-4bc3-9686-24c95d63fe0f` |
| 2 | `PUT /booking/{id}` | 403 | 31 | `qa-4cfbe4cd-e316-4108-8099-cf8b5b34ffac` |
| 3 | `GET /booking/{id}` | 200 | 41 | `qa-983bcaa4-948d-4cdf-b931-0b126c225e82` |
| 4 | `POST /auth` | 200 | 55 | `qa-4881aee0-754d-4088-b9e6-d0e7d565f84d` |
| 5 | `DELETE /booking/{id}` | 201 | 39 | `qa-ab7caf1f-44d4-4d40-9578-1bc21a5cddb2` |
| 6 | `GET /booking/{id}` | 404 | 43 | `qa-feda3a40-90fc-4cf4-ade7-2da4c170f3aa` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-1e5a465f-dcf4-4bc3-9686-24c95d63fe0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e5a465f-dcf4-4bc3-9686-24c95d63fe0f
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-ded90a95","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 733 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:06 GMT
Etag: W/"cf-BcFiRJpanDoCm2ScMaYZ1YWj1cc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=yE65Spk41D%2B%2B%2F%2BXf2wX8WLtwy%2FgKVWrHxyW54rGY7U0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523886"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=yE65Spk41D%2B%2B%2F%2BXf2wX8WLtwy%2FgKVWrHxyW54rGY7U0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523886"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3787,"booking":{"firstname":"Keep","lastname":"Guest-ded90a95","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3787
correlation: qa-4cfbe4cd-e316-4108-8099-cf8b5b34ffac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cfbe4cd-e316-4108-8099-cf8b5b34ffac
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-ee1e70b9","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}

--- response: 403 in 31 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:07 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=02AY5At5oC4Cqr7aKA6zz77PjBqhnngIRKlbrW3SCrw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523887"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=02AY5At5oC4Cqr7aKA6zz77PjBqhnngIRKlbrW3SCrw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523887"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3787
correlation: qa-983bcaa4-948d-4cdf-b931-0b126c225e82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-983bcaa4-948d-4cdf-b931-0b126c225e82
Content-Type: application/json

--- response: 200 in 41 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:07 GMT
Etag: W/"b2-Sy5PmRYzoFyOKTRQqTCwXjOfy8I"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=02AY5At5oC4Cqr7aKA6zz77PjBqhnngIRKlbrW3SCrw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523887"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=02AY5At5oC4Cqr7aKA6zz77PjBqhnngIRKlbrW3SCrw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523887"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-ded90a95","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-24","checkout":"2026-12-27"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-4881aee0-754d-4088-b9e6-d0e7d565f84d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4881aee0-754d-4088-b9e6-d0e7d565f84d
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 55 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:08 GMT
Etag: W/"1b-zcAFeiJrp2nIbH0U5Dev6l0grbo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523888"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=va%2FprfjwuuDG8pm4nstDJXj4LER1P6FV51%2FtILfMvPo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523888"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/3787
correlation: qa-ab7caf1f-44d4-4d40-9578-1bc21a5cddb2

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-ab7caf1f-44d4-4d40-9578-1bc21a5cddb2
Content-Type: application/json

--- response: 201 in 39 ms ---
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

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/3787
correlation: qa-feda3a40-90fc-4cf4-ade7-2da4c170f3aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feda3a40-90fc-4cf4-ade7-2da4c170f3aa
Content-Type: application/json

--- response: 404 in 43 ms ---
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
