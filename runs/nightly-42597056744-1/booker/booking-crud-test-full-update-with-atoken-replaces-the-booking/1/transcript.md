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
| 1 | `POST /booking` | 200 | 256 | `qa-5d23ebc3-ee67-455d-894b-ca46eeb0de39` |
| 2 | `PUT /booking/{id}` | 200 | 230 | `qa-f5ec1501-6cad-4dd8-bdea-0a61406aee0d` |
| 3 | `DELETE /booking/{id}` | 201 | 262 | `qa-0bfbcf79-0d1a-4a66-917f-6f0426f55bab` |
| 4 | `GET /booking/{id}` | 404 | 253 | `qa-2c7a9a8b-ecc9-4865-bf0b-c890698278a7` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-5d23ebc3-ee67-455d-894b-ca46eeb0de39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d23ebc3-ee67-455d-894b-ca46eeb0de39
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-474be8e3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}

--- response: 200 in 256 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:56 GMT
Etag: W/"cd-XxPdrfK52fdjdBC0J+Q24GzBvjU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218156"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218156"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2625,"booking":{"firstname":"QA","lastname":"Guest-474be8e3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2625
correlation: qa-f5ec1501-6cad-4dd8-bdea-0a61406aee0d

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-f5ec1501-6cad-4dd8-bdea-0a61406aee0d
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-65c85212","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}

--- response: 200 in 230 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:56 GMT
Etag: W/"b3-6aQjZ/ZF/Z78jFY/3K9RXr9DuGo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218156"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218156"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-65c85212","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-09","checkout":"2026-12-12"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/2625
correlation: qa-0bfbcf79-0d1a-4a66-917f-6f0426f55bab

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-0bfbcf79-0d1a-4a66-917f-6f0426f55bab
Content-Type: application/json

--- response: 201 in 262 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:56 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218156"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218156"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2625
correlation: qa-2c7a9a8b-ecc9-4865-bf0b-c890698278a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c7a9a8b-ecc9-4865-bf0b-c890698278a7
Content-Type: application/json

--- response: 404 in 253 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:56 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218156"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=NNcTYm7sQvPFBSWImH6sbR6yQxV%2B4Yc0V2QeHUPjYvs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218156"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
