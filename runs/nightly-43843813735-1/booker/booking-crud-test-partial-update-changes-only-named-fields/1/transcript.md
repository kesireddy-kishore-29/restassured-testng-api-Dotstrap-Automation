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
| 1 | `POST /booking` | 200 | 32 | `qa-7ff548bf-2d49-4565-acc8-574b472c3815` |
| 2 | `PATCH /booking/{id}` | 200 | 27 | `qa-682fd5e8-0a11-457e-803f-d96a3217b199` |
| 3 | `DELETE /booking/{id}` | 201 | 31 | `qa-52a98199-9785-46ee-9f29-815064c5f4d1` |
| 4 | `GET /booking/{id}` | 404 | 32 | `qa-f86694ec-ab2d-4580-b530-51a59ed6561b` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-7ff548bf-2d49-4565-acc8-574b472c3815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ff548bf-2d49-4565-acc8-574b472c3815
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-0d4ab0d3","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}

--- response: 200 in 32 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"d0-VJsqapJUrYiD68flR6+cWC1gdl0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1446,"booking":{"firstname":"Linus","lastname":"Guest-0d4ab0d3","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/1446
correlation: qa-682fd5e8-0a11-457e-803f-d96a3217b199

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-682fd5e8-0a11-457e-803f-d96a3217b199
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 27 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"b3-rE0e/aU5rhk2epayHzogGt4EJ1o"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-0d4ab0d3","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/1446
correlation: qa-52a98199-9785-46ee-9f29-815064c5f4d1

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-52a98199-9785-46ee-9f29-815064c5f4d1
Content-Type: application/json

--- response: 201 in 31 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/1446
correlation: qa-f86694ec-ab2d-4580-b530-51a59ed6561b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f86694ec-ab2d-4580-b530-51a59ed6561b
Content-Type: application/json

--- response: 404 in 32 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
