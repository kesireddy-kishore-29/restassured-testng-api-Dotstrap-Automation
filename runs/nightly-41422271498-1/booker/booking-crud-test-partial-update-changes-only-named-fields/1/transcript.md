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
| 1 | `POST /booking` | 200 | 90 | `qa-4c0a70d1-1d4c-458c-ba3f-2ccb4014874c` |
| 2 | `PATCH /booking/{id}` | 200 | 98 | `qa-04619e5e-6bfd-491a-91b1-da897e56ebd5` |
| 3 | `DELETE /booking/{id}` | 201 | 104 | `qa-c7d5a529-8542-482f-a043-baa127fbc44f` |
| 4 | `GET /booking/{id}` | 404 | 88 | `qa-60997538-c46f-4f87-8973-6e5577553766` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-4c0a70d1-1d4c-458c-ba3f-2ccb4014874c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c0a70d1-1d4c-458c-ba3f-2ccb4014874c
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-9b2125de","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}

--- response: 200 in 90 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"d0-ogAu1vSWsigDdta9SBj4LpAigLo"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":4165,"booking":{"firstname":"Linus","lastname":"Guest-9b2125de","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/4165
correlation: qa-04619e5e-6bfd-491a-91b1-da897e56ebd5

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-04619e5e-6bfd-491a-91b1-da897e56ebd5
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 98 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"b3-ey3I6KbFOQWKiyWuJ3BG2hFmr9g"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-9b2125de","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-02","checkout":"2026-12-05"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/4165
correlation: qa-c7d5a529-8542-482f-a043-baa127fbc44f

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-c7d5a529-8542-482f-a043-baa127fbc44f
Content-Type: application/json

--- response: 201 in 104 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/4165
correlation: qa-60997538-c46f-4f87-8973-6e5577553766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60997538-c46f-4f87-8973-6e5577553766
Content-Type: application/json

--- response: 404 in 88 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 02 Nov 2026 09:38:37 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793612317"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=39XfKxp4odotmE0lRIwMIZU0HmIEr5Cptgeq68GVvXI%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793612317"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
