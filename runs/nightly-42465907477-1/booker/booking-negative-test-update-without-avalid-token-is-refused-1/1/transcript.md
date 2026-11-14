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
| 1 | `POST /booking` | 200 | 26 | `qa-2df5dfcb-dbc9-45c7-8fab-94ba55479feb` |
| 2 | `PUT /booking/{id}` | 403 | 24 | `qa-15ecb734-c15c-4fd9-a1f6-1747cfebb2d2` |
| 3 | `GET /booking/{id}` | 200 | 23 | `qa-2680f691-7069-4fd3-b26d-7c86c4792aae` |
| 4 | `DELETE /booking/{id}` | 201 | 25 | `qa-097fa1e6-7655-4229-9c59-ef5dd7a60579` |
| 5 | `GET /booking/{id}` | 404 | 25 | `qa-32885fea-5996-490c-95ef-14ea6ac94176` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-2df5dfcb-dbc9-45c7-8fab-94ba55479feb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2df5dfcb-dbc9-45c7-8fab-94ba55479feb
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-6d23ad78","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}

--- response: 200 in 26 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"cf-t9tNpOnxLObgRiuUbUp3ocQcxAM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3955,"booking":{"firstname":"Keep","lastname":"Guest-6d23ad78","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3955
correlation: qa-15ecb734-c15c-4fd9-a1f6-1747cfebb2d2

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-15ecb734-c15c-4fd9-a1f6-1747cfebb2d2
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-ca7b91a3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}

--- response: 403 in 24 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3955
correlation: qa-2680f691-7069-4fd3-b26d-7c86c4792aae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2680f691-7069-4fd3-b26d-7c86c4792aae
Content-Type: application/json

--- response: 200 in 23 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"b2-N/qzuXIpOo/zVVt4cTWNshz7D5I"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-6d23ad78","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-08","checkout":"2026-12-11"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3955
correlation: qa-097fa1e6-7655-4229-9c59-ef5dd7a60579

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-097fa1e6-7655-4229-9c59-ef5dd7a60579
Content-Type: application/json

--- response: 201 in 25 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3955
correlation: qa-32885fea-5996-490c-95ef-14ea6ac94176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32885fea-5996-490c-95ef-14ea6ac94176
Content-Type: application/json

--- response: 404 in 25 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128944"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=psWBIwCgFaqM2ouwWroDibMR%2BrnBk6ZgMKR2UhCgGQs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128944"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
