# Transcript: A created booking reads back exactly as sent

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#createdBookingReadsBackAsSent` |
| Features | FEAT-BOOK-01, FEAT-BOOK-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 933 | `qa-c105a3b7-2660-4797-9978-4f9a6b2b4b98` |
| 2 | `GET /booking/{id}` | 200 | 239 | `qa-cc408fa6-19f4-4d13-a26f-d21c41513326` |
| 3 | `POST /auth` | 200 | 198 | `qa-df19e356-327e-4e21-a745-39241f067337` |
| 4 | `DELETE /booking/{id}` | 201 | 206 | `qa-d473c9c0-c502-464a-8b61-2e0fc5a52214` |
| 5 | `GET /booking/{id}` | 404 | 206 | `qa-904d7ffe-e9eb-4bdf-b1b1-30e5164ce5d0` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-c105a3b7-2660-4797-9978-4f9a6b2b4b98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c105a3b7-2660-4797-9978-4f9a6b2b4b98
Content-Type: application/json

--- request body ---
{"firstname":"Ada","lastname":"Guest-46d2f56a","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Late check-in"}

--- response: 200 in 933 ms ---
Content-Length: 209
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:33 GMT
Etag: W/"d1-g/7H6QZ2cm4NBfyjTgiq8EwOFl8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=00NbBYWAIzQm8hkxTE1pJ5Yq9QDrjwleeh9wD0YYlmU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741293"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=00NbBYWAIzQm8hkxTE1pJ5Yq9QDrjwleeh9wD0YYlmU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741293"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":312,"booking":{"firstname":"Ada","lastname":"Guest-46d2f56a","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Late check-in"}}
```

## 2. GET /booking/{id}

```text
#2 GET https://restful-booker.herokuapp.com/booking/312
correlation: qa-cc408fa6-19f4-4d13-a26f-d21c41513326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc408fa6-19f4-4d13-a26f-d21c41513326
Content-Type: application/json

--- response: 200 in 239 ms ---
Content-Length: 181
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:34 GMT
Etag: W/"b5-SG3BmPGMrZOx3LY6+ZymgxL9PFU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Ada","lastname":"Guest-46d2f56a","totalprice":240,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Late check-in"}
```

## 3. POST /auth

```text
#3 POST https://restful-booker.herokuapp.com/auth
correlation: qa-df19e356-327e-4e21-a745-39241f067337

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df19e356-327e-4e21-a745-39241f067337
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 198 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:34 GMT
Etag: W/"1b-NI9EbNsl46RyRZoM1xRi7rzviy4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/312
correlation: qa-d473c9c0-c502-464a-8b61-2e0fc5a52214

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-d473c9c0-c502-464a-8b61-2e0fc5a52214
Content-Type: application/json

--- response: 201 in 206 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:34 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/312
correlation: qa-904d7ffe-e9eb-4bdf-b1b1-30e5164ce5d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-904d7ffe-e9eb-4bdf-b1b1-30e5164ce5d0
Content-Type: application/json

--- response: 404 in 206 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:35 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741295"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=IBn0WYi8%2FUOPos93v%2FiCg7Blgi%2BTYigxY8CLJmflWnE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741295"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
