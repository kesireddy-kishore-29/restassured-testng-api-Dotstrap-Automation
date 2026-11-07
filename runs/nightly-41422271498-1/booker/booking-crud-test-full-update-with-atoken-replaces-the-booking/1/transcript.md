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
| 1 | `POST /booking` | 200 | 104 | `qa-84584c42-158d-4b20-b3de-37d34601daf9` |
| 2 | `PUT /booking/{id}` | 200 | 98 | `qa-901ba323-6c39-44af-bed1-80a43be2cb4d` |
| 3 | `DELETE /booking/{id}` | 201 | 101 | `qa-7fb347be-e30b-4004-947b-7d5ba079175c` |
| 4 | `GET /booking/{id}` | 404 | 97 | `qa-9b63194c-281a-4275-8402-65dbd01fb512` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-84584c42-158d-4b20-b3de-37d34601daf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84584c42-158d-4b20-b3de-37d34601daf9
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-5394f2e1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}

--- response: 200 in 104 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"cd-FrX1DGqvuyX9aUJkZE4mDjFG66g"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4163,"booking":{"firstname":"QA","lastname":"Guest-5394f2e1","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4163
correlation: qa-901ba323-6c39-44af-bed1-80a43be2cb4d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-901ba323-6c39-44af-bed1-80a43be2cb4d
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-84494575","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}

--- response: 200 in 98 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"b3-IuVkJiwaOI1AS1at2q53W4bVr2o"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-84494575","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4163
correlation: qa-7fb347be-e30b-4004-947b-7d5ba079175c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-7fb347be-e30b-4004-947b-7d5ba079175c
Content-Type: application/json

--- response: 201 in 101 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4163
correlation: qa-9b63194c-281a-4275-8402-65dbd01fb512

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b63194c-281a-4275-8402-65dbd01fb512
Content-Type: application/json

--- response: 404 in 97 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
