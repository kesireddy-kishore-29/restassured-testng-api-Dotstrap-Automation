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
| 1 | `POST /booking` | 200 | 926 | `qa-3ffa59ad-fb4f-4cf3-addb-ae1a431661e1` |
| 2 | `PUT /booking/{id}` | 403 | 176 | `qa-5b6aaa6c-0ac3-446b-9290-c77f74c90fb8` |
| 3 | `GET /booking/{id}` | 200 | 285 | `qa-03797a73-dd96-4b67-9293-64be1f081c68` |
| 4 | `POST /auth` | 200 | 178 | `qa-f727d4dd-26a9-4dd4-8075-3ceb029fadf9` |
| 5 | `DELETE /booking/{id}` | 201 | 269 | `qa-bcb52a39-248d-4763-b5b3-52c9daff77f7` |
| 6 | `GET /booking/{id}` | 404 | 175 | `qa-620e71b8-f7fd-43a8-b814-84f8ce64d201` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-3ffa59ad-fb4f-4cf3-addb-ae1a431661e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ffa59ad-fb4f-4cf3-addb-ae1a431661e1
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-e7956ec7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}

--- response: 200 in 926 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:04 GMT
Etag: W/"cf-UeaiUN7ism58CyqGxfUqEDRgUxc"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iCEjjct1%2BdBuBNubA9wDoiI%2Fl%2BOwmDXj3W6A30u5I6w%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041704"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iCEjjct1%2BdBuBNubA9wDoiI%2Fl%2BOwmDXj3W6A30u5I6w%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041704"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2175,"booking":{"firstname":"Keep","lastname":"Guest-e7956ec7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2175
correlation: qa-5b6aaa6c-0ac3-446b-9290-c77f74c90fb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6aaa6c-0ac3-446b-9290-c77f74c90fb8
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-38c70a5d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}

--- response: 403 in 176 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:05 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2B07e%2Fud%2F4%2FHf9hPOsFmNAK0zgX6%2BGqVu67OgSs62IIM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2B07e%2Fud%2F4%2FHf9hPOsFmNAK0zgX6%2BGqVu67OgSs62IIM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2175
correlation: qa-03797a73-dd96-4b67-9293-64be1f081c68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03797a73-dd96-4b67-9293-64be1f081c68
Content-Type: application/json

--- response: 200 in 285 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:05 GMT
Etag: W/"b2-WKDvNhOOWRPvAX7Wp67ppeuFPR8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2B07e%2Fud%2F4%2FHf9hPOsFmNAK0zgX6%2BGqVu67OgSs62IIM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2B07e%2Fud%2F4%2FHf9hPOsFmNAK0zgX6%2BGqVu67OgSs62IIM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-e7956ec7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-f727d4dd-26a9-4dd4-8075-3ceb029fadf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f727d4dd-26a9-4dd4-8075-3ceb029fadf9
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 178 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:05 GMT
Etag: W/"1b-YQ/sV0z18yV13NUAxvTZYZgD8pg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2B07e%2Fud%2F4%2FHf9hPOsFmNAK0zgX6%2BGqVu67OgSs62IIM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041705"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2B07e%2Fud%2F4%2FHf9hPOsFmNAK0zgX6%2BGqVu67OgSs62IIM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041705"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/2175
correlation: qa-bcb52a39-248d-4763-b5b3-52c9daff77f7

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-bcb52a39-248d-4763-b5b3-52c9daff77f7
Content-Type: application/json

--- response: 201 in 269 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:06 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/2175
correlation: qa-620e71b8-f7fd-43a8-b814-84f8ce64d201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-620e71b8-f7fd-43a8-b814-84f8ce64d201
Content-Type: application/json

--- response: 404 in 175 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:06 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041706"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=j8XvqD4QYt8lZ8mcE8vYiXci16uT2zh%2BYnQASknDEus%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041706"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
