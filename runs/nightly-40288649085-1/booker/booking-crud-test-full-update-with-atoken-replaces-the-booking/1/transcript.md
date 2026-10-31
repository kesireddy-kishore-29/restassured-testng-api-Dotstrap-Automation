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
| 1 | `POST /booking` | 200 | 112 | `qa-101c03e0-9c67-4f57-8521-e6a0da900878` |
| 2 | `PUT /booking/{id}` | 200 | 105 | `qa-55ac4f1b-5744-4eb3-94fd-89f876322494` |
| 3 | `DELETE /booking/{id}` | 201 | 110 | `qa-dfc5acb0-1426-407d-94f9-b9d7331f8df3` |
| 4 | `GET /booking/{id}` | 404 | 105 | `qa-9d97b965-3694-46cc-9c51-679535a83139` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-101c03e0-9c67-4f57-8521-e6a0da900878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-101c03e0-9c67-4f57-8521-e6a0da900878
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-9fee688c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 112 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:47 GMT
Etag: W/"cd-p2ha+xED1ma3y+97cTn6BQyl8Eo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001287"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001287"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3329,"booking":{"firstname":"QA","lastname":"Guest-9fee688c","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3329
correlation: qa-55ac4f1b-5744-4eb3-94fd-89f876322494

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-55ac4f1b-5744-4eb3-94fd-89f876322494
Content-Type: application/json

--- request body ---
{"firstname":"Grace","lastname":"Guest-c77da89a","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 105 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:48 GMT
Etag: W/"b3-xG9o8GYj0Ipp0lvF0gpEscWT2mA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001288"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001288"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Grace","lastname":"Guest-c77da89a","totalprice":99,"depositpaid":false,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3329
correlation: qa-dfc5acb0-1426-407d-94f9-b9d7331f8df3

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-dfc5acb0-1426-407d-94f9-b9d7331f8df3
Content-Type: application/json

--- response: 201 in 110 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:48 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001288"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001288"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/3329
correlation: qa-9d97b965-3694-46cc-9c51-679535a83139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d97b965-3694-46cc-9c51-679535a83139
Content-Type: application/json

--- response: 404 in 105 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:48 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001288"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001288"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
