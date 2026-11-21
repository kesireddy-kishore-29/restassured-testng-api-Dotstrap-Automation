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
| 1 | `POST /booking` | 200 | 284 | `qa-9c4f5e3e-1cbf-454b-b48e-533b21888b5b` |
| 2 | `PATCH /booking/{id}` | 200 | 298 | `qa-1b66fd16-52ce-4e46-80f8-a317f9e44366` |
| 3 | `DELETE /booking/{id}` | 201 | 280 | `qa-b28e669e-8f37-43da-9e04-f00f836b3705` |
| 4 | `GET /booking/{id}` | 404 | 294 | `qa-6578cdef-8073-499b-8339-62134d2ff317` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-9c4f5e3e-1cbf-454b-b48e-533b21888b5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c4f5e3e-1cbf-454b-b48e-533b21888b5b
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-67eb51b1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}

--- response: 200 in 284 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:57 GMT
Etag: W/"d0-Wm7ZmCgOIMakhsNaoRLiQux3PoM"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997197"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997197"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4713,"booking":{"firstname":"Linus","lastname":"Guest-67eb51b1","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/4713
correlation: qa-1b66fd16-52ce-4e46-80f8-a317f9e44366

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-1b66fd16-52ce-4e46-80f8-a317f9e44366
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 298 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:57 GMT
Etag: W/"b3-le7/kNCO2ja9ekDuUIHxSsZk6ow"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997197"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=oKrhDSzt7JAoKhWlP9s%2BopZHPqHWM6UmHXYxXXzpeNk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997197"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-67eb51b1","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-18","checkout":"2026-12-21"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4713
correlation: qa-b28e669e-8f37-43da-9e04-f00f836b3705

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-b28e669e-8f37-43da-9e04-f00f836b3705
Content-Type: application/json

--- response: 201 in 280 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:58 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ns7BW9VcMnFeEhWFaPUdMkqmPsYWMDsTeSzMMUinqgs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997198"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ns7BW9VcMnFeEhWFaPUdMkqmPsYWMDsTeSzMMUinqgs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997198"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4713
correlation: qa-6578cdef-8073-499b-8339-62134d2ff317

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6578cdef-8073-499b-8339-62134d2ff317
Content-Type: application/json

--- response: 404 in 294 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 18 Nov 2026 10:19:58 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ns7BW9VcMnFeEhWFaPUdMkqmPsYWMDsTeSzMMUinqgs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794997198"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ns7BW9VcMnFeEhWFaPUdMkqmPsYWMDsTeSzMMUinqgs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794997198"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
