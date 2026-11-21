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
| 1 | `POST /booking` | 200 | 688 | `qa-d04c8163-fdb8-423e-8bb7-9dd50c9fb0f9` |
| 2 | `PUT /booking/{id}` | 403 | 51 | `qa-8700b1bc-b323-41be-ab35-d00f24f1d45c` |
| 3 | `GET /booking/{id}` | 200 | 51 | `qa-f25a2b67-68e2-4fde-801a-3d5dcf912b50` |
| 4 | `POST /auth` | 200 | 36 | `qa-fb6275e7-80b7-49a2-a7dd-8da4614ed424` |
| 5 | `DELETE /booking/{id}` | 201 | 33 | `qa-8e5ba164-6190-4b7d-8da8-5e7611960c8b` |
| 6 | `GET /booking/{id}` | 404 | 31 | `qa-6e515969-704d-43f0-ad0f-1b9106a68b93` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-d04c8163-fdb8-423e-8bb7-9dd50c9fb0f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d04c8163-fdb8-423e-8bb7-9dd50c9fb0f9
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-60ed87a7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}

--- response: 200 in 688 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:20 GMT
Etag: W/"cf-rireB1mahz5m4mo1T01M9sNqgV4"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Tbh1ryqte9Oq8d0GdNTGSfQ8zQopPnQtgA8hc01kJKI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084160"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Tbh1ryqte9Oq8d0GdNTGSfQ8zQopPnQtgA8hc01kJKI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084160"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4437,"booking":{"firstname":"Keep","lastname":"Guest-60ed87a7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/4437
correlation: qa-8700b1bc-b323-41be-ab35-d00f24f1d45c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8700b1bc-b323-41be-ab35-d00f24f1d45c
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-0347540f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}

--- response: 403 in 51 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:20 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Tbh1ryqte9Oq8d0GdNTGSfQ8zQopPnQtgA8hc01kJKI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084160"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Tbh1ryqte9Oq8d0GdNTGSfQ8zQopPnQtgA8hc01kJKI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084160"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/4437
correlation: qa-f25a2b67-68e2-4fde-801a-3d5dcf912b50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f25a2b67-68e2-4fde-801a-3d5dcf912b50
Content-Type: application/json

--- response: 200 in 51 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:20 GMT
Etag: W/"b2-Z/G2REU9eZfoUkjnhJD7eSFDCiI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Tbh1ryqte9Oq8d0GdNTGSfQ8zQopPnQtgA8hc01kJKI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084160"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Tbh1ryqte9Oq8d0GdNTGSfQ8zQopPnQtgA8hc01kJKI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084160"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-60ed87a7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-19","checkout":"2026-12-22"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-fb6275e7-80b7-49a2-a7dd-8da4614ed424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb6275e7-80b7-49a2-a7dd-8da4614ed424
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 36 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"1b-Wdlk98Ls41fwQs1xzyz+wiGm3bE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/4437
correlation: qa-8e5ba164-6190-4b7d-8da8-5e7611960c8b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8e5ba164-6190-4b7d-8da8-5e7611960c8b
Content-Type: application/json

--- response: 201 in 33 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/4437
correlation: qa-6e515969-704d-43f0-ad0f-1b9106a68b93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e515969-704d-43f0-ad0f-1b9106a68b93
Content-Type: application/json

--- response: 404 in 31 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 19 Nov 2026 10:29:21 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795084161"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=6uilHUtRSFnD7adu4yMT7Q6%2Fkwne80Z3nn8wehu5Jjw%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795084161"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
