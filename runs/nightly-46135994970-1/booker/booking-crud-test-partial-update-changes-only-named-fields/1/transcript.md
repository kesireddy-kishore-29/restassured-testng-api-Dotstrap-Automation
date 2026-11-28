# Transcript: A partial update changes only the named fields

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingCrudTest#partialUpdateChangesOnlyNamedFields` |
| Features | FEAT-BOOK-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 4 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 33 | `qa-2b2f00f6-4d41-43ee-b2c6-b3763e9c08d3` |
| 2 | `PATCH /booking/{id}` | 200 | 38 | `qa-eec26c8e-dfea-4533-9742-88ebe5532cd1` |
| 3 | `DELETE /booking/{id}` | 201 | 35 | `qa-a02a42aa-d818-4987-9db8-9c0f9d5449ad` |
| 4 | `GET /booking/{id}` | 404 | 34 | `qa-1ad5a8f5-7401-460a-942e-16ce1aecb2b6` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-2b2f00f6-4d41-43ee-b2c6-b3763e9c08d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b2f00f6-4d41-43ee-b2c6-b3763e9c08d3
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-489ef472","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}

--- response: 200 in 33 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"d0-x5HBAr6X6NMvHxJqCup7t7wIj+0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3200,"booking":{"firstname":"Linus","lastname":"Guest-489ef472","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/3200
correlation: qa-eec26c8e-dfea-4533-9742-88ebe5532cd1

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-eec26c8e-dfea-4533-9742-88ebe5532cd1
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 38 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"b3-VhsuS+Sb86cfmKJDzg92rsMazNo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-489ef472","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-28","checkout":"2026-12-31"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3200
correlation: qa-a02a42aa-d818-4987-9db8-9c0f9d5449ad

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-a02a42aa-d818-4987-9db8-9c0f9d5449ad
Content-Type: application/json

--- response: 201 in 35 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3200
correlation: qa-1ad5a8f5-7401-460a-942e-16ce1aecb2b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ad5a8f5-7401-460a-942e-16ce1aecb2b6
Content-Type: application/json

--- response: 404 in 34 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 28 Nov 2026 10:37:12 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795862232"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=KQBDu9fVUJLI9A%2FQL%2Fx1DU2rPR7qgpWypDb4%2FQdLTNs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795862232"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
