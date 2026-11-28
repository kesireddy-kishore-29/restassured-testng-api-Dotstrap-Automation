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
| 1 | `POST /booking` | 200 | 691 | `qa-a4015cba-64d3-46e5-a6ce-fe2b1168aa10` |
| 2 | `PUT /booking/{id}` | 403 | 114 | `qa-2abce791-309e-4b0c-838e-e1abab441258` |
| 3 | `GET /booking/{id}` | 200 | 119 | `qa-04d7a6b2-cd8d-44c1-88fc-4ff75284deb8` |
| 4 | `POST /auth` | 200 | 113 | `qa-a7685c26-caa6-41bb-ae9d-ae9340491f80` |
| 5 | `DELETE /booking/{id}` | 201 | 103 | `qa-823d5d01-4b03-4c8e-8aa0-fa0b9611eab0` |
| 6 | `GET /booking/{id}` | 404 | 122 | `qa-153a9008-a751-4949-859e-a69d92838341` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-a4015cba-64d3-46e5-a6ce-fe2b1168aa10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4015cba-64d3-46e5-a6ce-fe2b1168aa10
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-0766caf6","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}

--- response: 200 in 691 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:33 GMT
Etag: W/"ce-IwVfYFmCM/vTCtnclvEe24cqhms"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Fl0SJuNZOjKVvNumxUb0W0uVNVxAgug6r0H5jve%2F4OE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690953"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Fl0SJuNZOjKVvNumxUb0W0uVNVxAgug6r0H5jve%2F4OE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690953"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":634,"booking":{"firstname":"Keep","lastname":"Guest-0766caf6","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/634
correlation: qa-2abce791-309e-4b0c-838e-e1abab441258

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2abce791-309e-4b0c-838e-e1abab441258
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-68cae71b","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}

--- response: 403 in 114 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:34 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690954"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690954"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/634
correlation: qa-04d7a6b2-cd8d-44c1-88fc-4ff75284deb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d7a6b2-cd8d-44c1-88fc-4ff75284deb8
Content-Type: application/json

--- response: 200 in 119 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:34 GMT
Etag: W/"b2-u2Jnkh+dUsJjgAJRMMoqbof5S+E"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690954"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690954"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-0766caf6","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-26","checkout":"2026-12-29"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-a7685c26-caa6-41bb-ae9d-ae9340491f80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7685c26-caa6-41bb-ae9d-ae9340491f80
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 113 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:34 GMT
Etag: W/"1b-XsOZTbdXh5LySwLs2ybBqZX1lp0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690954"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690954"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/634
correlation: qa-823d5d01-4b03-4c8e-8aa0-fa0b9611eab0

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-823d5d01-4b03-4c8e-8aa0-fa0b9611eab0
Content-Type: application/json

--- response: 201 in 103 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:34 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690954"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690954"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/634
correlation: qa-153a9008-a751-4949-859e-a69d92838341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-153a9008-a751-4949-859e-a69d92838341
Content-Type: application/json

--- response: 404 in 122 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:34 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690954"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=FRep%2BBruE4RZc0vn3u1RpEeH8YF5g7gmJbB5P00%2BcCw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690954"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
