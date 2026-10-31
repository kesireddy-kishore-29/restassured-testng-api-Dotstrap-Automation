# Transcript: An update without a valid token is refused and changes nothing [Optional.empty]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[0]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 99 | `qa-05aa235b-372e-4530-bcc1-d1b59f7b8c9f` |
| 2 | `PUT /booking/{id}` | 403 | 106 | `qa-73792031-a96b-4e86-b049-8cefad83484a` |
| 3 | `GET /booking/{id}` | 200 | 110 | `qa-94f66b24-be15-4b5b-bd9c-9b613a57b855` |
| 4 | `DELETE /booking/{id}` | 201 | 112 | `qa-bc75b3ee-c737-40d0-865f-36e244ba73ec` |
| 5 | `GET /booking/{id}` | 404 | 102 | `qa-89f31294-63d9-4d5d-9fa0-88076f177dbf` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-05aa235b-372e-4530-bcc1-d1b59f7b8c9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05aa235b-372e-4530-bcc1-d1b59f7b8c9f
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-98cdbf82","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 99 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:48 GMT
Etag: W/"cf-VpdDxGrogHlqEN1GbaQq01Bcx9g"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001288"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001288"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3335,"booking":{"firstname":"Keep","lastname":"Guest-98cdbf82","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3335
correlation: qa-73792031-a96b-4e86-b049-8cefad83484a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73792031-a96b-4e86-b049-8cefad83484a
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-2eee3292","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}

--- response: 403 in 106 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:48 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001288"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001288"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3335
correlation: qa-94f66b24-be15-4b5b-bd9c-9b613a57b855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f66b24-be15-4b5b-bd9c-9b613a57b855
Content-Type: application/json

--- response: 200 in 110 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:48 GMT
Etag: W/"b2-zI0J8Q2sE30Rf0Ya6c0tcBkdpZM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001288"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001288"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-98cdbf82","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/3335
correlation: qa-bc75b3ee-c737-40d0-865f-36e244ba73ec

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-bc75b3ee-c737-40d0-865f-36e244ba73ec
Content-Type: application/json

--- response: 201 in 112 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:49 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001289"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001289"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/3335
correlation: qa-89f31294-63d9-4d5d-9fa0-88076f177dbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89f31294-63d9-4d5d-9fa0-88076f177dbf
Content-Type: application/json

--- response: 404 in 102 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:49 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001289"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=4f5zzTEZlYOktQ1W3RvEBPRohuhnSpfeI5ESHN9wMD8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001289"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
