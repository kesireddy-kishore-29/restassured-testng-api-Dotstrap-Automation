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
| 1 | `POST /booking` | 200 | 108 | `qa-c6c9e781-cee0-4564-8fb4-4b5a3ed68d56` |
| 2 | `PATCH /booking/{id}` | 200 | 112 | `qa-3bde59fe-66e0-4a05-be37-f49989dc8e69` |
| 3 | `DELETE /booking/{id}` | 201 | 125 | `qa-92586ac0-9efa-4171-8a89-9ceeaf56ab4c` |
| 4 | `GET /booking/{id}` | 404 | 108 | `qa-bb1cd7d4-d7e4-476a-aaca-d929eb693f16` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-c6c9e781-cee0-4564-8fb4-4b5a3ed68d56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c9e781-cee0-4564-8fb4-4b5a3ed68d56
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-14afa270","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}

--- response: 200 in 108 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"d0-NAmShEume3vIu+3fLsbrR4cH6mQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5908,"booking":{"firstname":"Linus","lastname":"Guest-14afa270","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/5908
correlation: qa-3bde59fe-66e0-4a05-be37-f49989dc8e69

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-3bde59fe-66e0-4a05-be37-f49989dc8e69
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 112 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"b3-Ekji/3a3YJbjFW6NmK21m+rHTeI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-14afa270","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-27","checkout":"2026-12-30"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5908
correlation: qa-92586ac0-9efa-4171-8a89-9ceeaf56ab4c

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-92586ac0-9efa-4171-8a89-9ceeaf56ab4c
Content-Type: application/json

--- response: 201 in 125 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5908
correlation: qa-bb1cd7d4-d7e4-476a-aaca-d929eb693f16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb1cd7d4-d7e4-476a-aaca-d929eb693f16
Content-Type: application/json

--- response: 404 in 108 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:53 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777193"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=wdsVFZRugR6O0%2BJZTPdLSiS%2FbsjRff7MQe%2Bb7Tid26M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777193"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
