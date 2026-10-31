# Transcript: A deleted booking is gone (404 on read)

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#deletedBookingIsGone` |
| Features | FEAT-BOOK-04 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 933 | `qa-2c1b3e9e-a02d-4f30-84b6-1760302f8a94` |
| 2 | `POST /auth` | 200 | 214 | `qa-879b5817-f943-4d4c-8b03-cc6cbfa896a3` |
| 3 | `DELETE /booking/{id}` | 201 | 200 | `qa-eca8b717-3e27-4fd4-9651-d5411031097f` |
| 4 | `GET /booking/{id}` | 404 | 199 | `qa-dce32385-53cf-48de-81e7-72e0d96aee38` |
| 5 | `GET /booking/{id}` | 404 | 197 | `qa-476914c3-3ca0-4c40-a64f-3816dda11aef` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-2c1b3e9e-a02d-4f30-84b6-1760302f8a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c1b3e9e-a02d-4f30-84b6-1760302f8a94
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-c3f4297c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}

--- response: 200 in 933 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:33 GMT
Etag: W/"cc-dQyIqFzk9EIVXpPkMMp1azDTJTY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=00NbBYWAIzQm8hkxTE1pJ5Yq9QDrjwleeh9wD0YYlmU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741293"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=00NbBYWAIzQm8hkxTE1pJ5Yq9QDrjwleeh9wD0YYlmU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741293"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":313,"booking":{"firstname":"QA","lastname":"Guest-c3f4297c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-22","checkout":"2026-11-25"},"additionalneeds":"Breakfast"}}
```

## 2. POST /auth

```text
#2 POST https://restful-booker.herokuapp.com/auth
correlation: qa-879b5817-f943-4d4c-8b03-cc6cbfa896a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-879b5817-f943-4d4c-8b03-cc6cbfa896a3
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 214 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:34 GMT
Etag: W/"1b-Fju/6Y9MKisL/0VpI4JHnHzlM+Y"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/313
correlation: qa-eca8b717-3e27-4fd4-9651-d5411031097f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-eca8b717-3e27-4fd4-9651-d5411031097f
Content-Type: application/json

--- response: 201 in 200 ms ---
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

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/313
correlation: qa-dce32385-53cf-48de-81e7-72e0d96aee38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dce32385-53cf-48de-81e7-72e0d96aee38
Content-Type: application/json

--- response: 404 in 199 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:34 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/313
correlation: qa-476914c3-3ca0-4c40-a64f-3816dda11aef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-476914c3-3ca0-4c40-a64f-3816dda11aef
Content-Type: application/json

--- response: 404 in 197 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 23 Oct 2026 07:41:34 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792741294"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=rsnYJkY1lXuPn2sMQTli5VlWp8D3kdshuPFWVcOXYGU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792741294"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
