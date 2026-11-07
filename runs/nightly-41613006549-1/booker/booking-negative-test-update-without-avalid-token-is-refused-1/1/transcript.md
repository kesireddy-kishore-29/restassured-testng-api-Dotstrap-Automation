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
| 1 | `POST /booking` | 200 | 181 | `qa-23258491-a673-48da-95f1-54fc9e304715` |
| 2 | `PUT /booking/{id}` | 403 | 181 | `qa-e258be05-c081-45f4-9146-c39940087848` |
| 3 | `GET /booking/{id}` | 200 | 181 | `qa-ee772ffb-c801-41ab-9e3b-d0525e53f415` |
| 4 | `DELETE /booking/{id}` | 201 | 180 | `qa-89c03124-ba35-4726-841d-76d3b191ab12` |
| 5 | `GET /booking/{id}` | 404 | 186 | `qa-7f1e174c-dc00-4106-8be4-117ff2b85f9a` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-23258491-a673-48da-95f1-54fc9e304715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23258491-a673-48da-95f1-54fc9e304715
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-b06ac235","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}

--- response: 200 in 181 ms ---
Content-Length: 206
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"ce-NdKL4nZr1PnE1WFXAJT4XIo5YuM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":449,"booking":{"firstname":"Keep","lastname":"Guest-b06ac235","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/449
correlation: qa-e258be05-c081-45f4-9146-c39940087848

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e258be05-c081-45f4-9146-c39940087848
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-40257801","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}

--- response: 403 in 181 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/449
correlation: qa-ee772ffb-c801-41ab-9e3b-d0525e53f415

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee772ffb-c801-41ab-9e3b-d0525e53f415
Content-Type: application/json

--- response: 200 in 181 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"b2-IXqQkNRqFnGQ7MEH4JTyVwCreY0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-b06ac235","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-03","checkout":"2026-12-06"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/449
correlation: qa-89c03124-ba35-4726-841d-76d3b191ab12

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-89c03124-ba35-4726-841d-76d3b191ab12
Content-Type: application/json

--- response: 201 in 180 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 03 Nov 2026 09:41:43 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793698903"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=z2kzEcgoRVsrodd6OQqjhR1SZT9Rvp6euzwmn4AezFk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793698903"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/449
correlation: qa-7f1e174c-dc00-4106-8be4-117ff2b85f9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1e174c-dc00-4106-8be4-117ff2b85f9a
Content-Type: application/json

--- response: 404 in 186 ms ---
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
