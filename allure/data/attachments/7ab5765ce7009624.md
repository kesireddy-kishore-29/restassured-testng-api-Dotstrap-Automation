# Transcript: A deleted booking is gone (404 on read)

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#deletedBookingIsGone` |
| Features | FEAT-BOOK-04 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 166 | `qa-349071f7-259c-4e21-8ba0-1ddc56b1e113` |
| 2 | `DELETE /booking/{id}` | 201 | 259 | `qa-1438c7a5-ed23-4254-8c1f-3527574def54` |
| 3 | `GET /booking/{id}` | 404 | 172 | `qa-960734db-fc08-49c5-833a-2c793e8c6813` |
| 4 | `GET /booking/{id}` | 404 | 159 | `qa-d9ebb345-c9b6-45ec-88bb-eeb7cb3e3937` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-349071f7-259c-4e21-8ba0-1ddc56b1e113

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-349071f7-259c-4e21-8ba0-1ddc56b1e113
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-2876f1ab","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}

--- response: 200 in 166 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"cd-UJnTulGFUrWQ5po90n5wnjjWaLg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2201,"booking":{"firstname":"QA","lastname":"Guest-2876f1ab","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-07","checkout":"2026-12-10"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/2201
correlation: qa-1438c7a5-ed23-4254-8c1f-3527574def54

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1438c7a5-ed23-4254-8c1f-3527574def54
Content-Type: application/json

--- response: 201 in 259 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2201
correlation: qa-960734db-fc08-49c5-833a-2c793e8c6813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-960734db-fc08-49c5-833a-2c793e8c6813
Content-Type: application/json

--- response: 404 in 172 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2201
correlation: qa-d9ebb345-c9b6-45ec-88bb-eeb7cb3e3937

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9ebb345-c9b6-45ec-88bb-eeb7cb3e3937
Content-Type: application/json

--- response: 404 in 159 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:07 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041707"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=G3Ypq6sr1Fj7K8G43UrJ7EfwivebVUPy8QkKmhAKMAE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041707"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
