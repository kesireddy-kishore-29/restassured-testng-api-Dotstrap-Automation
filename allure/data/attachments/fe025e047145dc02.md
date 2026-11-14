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
| 1 | `POST /booking` | 200 | 237 | `qa-678b57b3-ea00-493b-ac5c-71d9ac9633bb` |
| 2 | `DELETE /booking/{id}` | 201 | 235 | `qa-4f979d91-9393-438f-a2f4-4c850450f991` |
| 3 | `GET /booking/{id}` | 404 | 229 | `qa-263e06cf-9c36-4c73-83b6-ad4af785b87e` |
| 4 | `GET /booking/{id}` | 404 | 237 | `qa-de5ec7bd-513f-4ea6-acf0-7fc7b1a3cc1a` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-678b57b3-ea00-493b-ac5c-71d9ac9633bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-678b57b3-ea00-493b-ac5c-71d9ac9633bb
Content-Type: application/json

--- request body ---
{"firstname":"QA","lastname":"Guest-eb2dcb06","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}

--- response: 200 in 237 ms ---
Content-Length: 205
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:16 GMT
Etag: W/"cd-TpEWPa/+QjbGodswJfXfa8+exfk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647116"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647116"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2086,"booking":{"firstname":"QA","lastname":"Guest-eb2dcb06","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-14","checkout":"2026-12-17"},"additionalneeds":"Breakfast"}}
```

## 2. DELETE /booking/{id}

```text
#2 DELETE https://restful-booker.herokuapp.com/booking/2086
correlation: qa-4f979d91-9393-438f-a2f4-4c850450f991

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-4f979d91-9393-438f-a2f4-4c850450f991
Content-Type: application/json

--- response: 201 in 235 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:16 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647116"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647116"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2086
correlation: qa-263e06cf-9c36-4c73-83b6-ad4af785b87e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-263e06cf-9c36-4c73-83b6-ad4af785b87e
Content-Type: application/json

--- response: 404 in 229 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:16 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647116"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647116"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/2086
correlation: qa-de5ec7bd-513f-4ea6-acf0-7fc7b1a3cc1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de5ec7bd-513f-4ea6-acf0-7fc7b1a3cc1a
Content-Type: application/json

--- response: 404 in 237 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:16 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647116"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=vrAPVh7xU3BLtoH0WijYW8UhBAxJebbyGCAtL6UNpv8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647116"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
