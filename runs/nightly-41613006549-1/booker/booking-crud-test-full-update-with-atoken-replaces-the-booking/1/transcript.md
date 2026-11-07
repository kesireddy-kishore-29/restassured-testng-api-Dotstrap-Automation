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
| 1 | `POST /booking` | 200 | 180 | `qa-54e8f7e6-8b58-498c-b84d-ac69095198bc` |
| 2 | `PUT /booking/{id}` | 200 | 178 | `qa-605ce245-5862-4f6e-90cb-b99efe5c5919` |
| 3 | `DELETE /booking/{id}` | 201 | 178 | `qa-26fe6d05-954b-4cc5-957f-3e9e5db85874` |
| 4 | `GET /booking/{id}` | 404 | 180 | `qa-1fda7ec8-f04b-4188-a799-8dbefc36461f` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-54e8f7e6-8b58-498c-b84d-ac69095198bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54e8f7e6-8b58-498c-b84d-ac69095198bc
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-81578487","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}

--- response: 200 in 180 ms ---
Content-Length: 204
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:44 GMT
Etag: W/"cc-48rwH4/dzQGbRcAyA1QUqcuAIYU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698904"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698904"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":460,"booking":{"firstname":"QA","lastname":"Guest-81578487","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/460
correlation: qa-605ce245-5862-4f6e-90cb-b99efe5c5919

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-605ce245-5862-4f6e-90cb-b99efe5c5919
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-e8b656ce","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}

--- response: 200 in 178 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:44 GMT
Etag: W/"b3-LNGCAjnyP/QMrGYk+sATqliEpZk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698904"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698904"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-e8b656ce","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/460
correlation: qa-26fe6d05-954b-4cc5-957f-3e9e5db85874

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-26fe6d05-954b-4cc5-957f-3e9e5db85874
Content-Type: application/json

--- response: 201 in 178 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:44 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698904"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698904"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/460
correlation: qa-1fda7ec8-f04b-4188-a799-8dbefc36461f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fda7ec8-f04b-4188-a799-8dbefc36461f
Content-Type: application/json

--- response: 404 in 180 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:44 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698904"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YtncPSNf1I5wHJOhKkkLqA8H4ah6GPm13f75wAHcHYw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698904"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
