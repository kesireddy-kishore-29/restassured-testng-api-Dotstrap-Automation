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
| 1 | `POST /booking` | 200 | 109 | `qa-2dd0d9a7-ad6b-4492-a28f-72769f7df5d2` |
| 2 | `PATCH /booking/{id}` | 200 | 115 | `qa-9356ecf9-4d18-456b-9204-8ac8482115d1` |
| 3 | `DELETE /booking/{id}` | 201 | 104 | `qa-c75daee5-0e36-45dc-a7f7-f7cac1256583` |
| 4 | `GET /booking/{id}` | 404 | 112 | `qa-54db0d82-e237-4117-9f78-eec8294a2663` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-2dd0d9a7-ad6b-4492-a28f-72769f7df5d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dd0d9a7-ad6b-4492-a28f-72769f7df5d2
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-db853de1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}

--- response: 200 in 109 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:47 GMT
Etag: W/"d0-ycZ525roHgqOLQs5D5uU30vSoXI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001287"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=YMFFfTpZtOpF9S8SJWmKhXZUqDBEjf1%2FS6229Hzpbh8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001287"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3331,"booking":{"firstname":"Linus","lastname":"Guest-db853de1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/3331
correlation: qa-9356ecf9-4d18-456b-9204-8ac8482115d1

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-9356ecf9-4d18-456b-9204-8ac8482115d1
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 115 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Mon, 26 Oct 2026 07:54:48 GMT
Etag: W/"b3-VRjWMWUnD8OA0BIgANpVAlCmPRU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793001288"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Pni7eOtweOsxwR8zDqKpYski0rqLF6IlS9wgVlZ6QVg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793001288"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-db853de1","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-11-25","checkout":"2026-11-28"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/3331
correlation: qa-c75daee5-0e36-45dc-a7f7-f7cac1256583

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c75daee5-0e36-45dc-a7f7-f7cac1256583
Content-Type: application/json

--- response: 201 in 104 ms ---
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
#4 GET https://restful-booker.herokuapp.com/booking/3331
correlation: qa-54db0d82-e237-4117-9f78-eec8294a2663

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54db0d82-e237-4117-9f78-eec8294a2663
Content-Type: application/json

--- response: 404 in 112 ms ---
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
