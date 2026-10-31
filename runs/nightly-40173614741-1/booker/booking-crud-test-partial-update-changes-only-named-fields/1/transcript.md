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
| 1 | `POST /booking` | 200 | 193 | `qa-088493a5-9383-439c-b64b-f338567578c2` |
| 2 | `PATCH /booking/{id}` | 200 | 197 | `qa-65720beb-f3b0-4e25-9159-3b67c1930c2b` |
| 3 | `DELETE /booking/{id}` | 201 | 193 | `qa-2db72b40-3843-4436-b36f-5c60695bf924` |
| 4 | `GET /booking/{id}` | 404 | 193 | `qa-2827253d-e502-4155-9eac-bdd4158b0237` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-088493a5-9383-439c-b64b-f338567578c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-088493a5-9383-439c-b64b-f338567578c2
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-74d5cede","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}

--- response: 200 in 193 ms ---
Content-Length: 208
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:29 GMT
Etag: W/"d0-3Lhdx/1S3KKVrAETEqMG8FOZowk"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5094,"booking":{"firstname":"Linus","lastname":"Guest-74d5cede","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/5094
correlation: qa-65720beb-f3b0-4e25-9159-3b67c1930c2b

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-65720beb-f3b0-4e25-9159-3b67c1930c2b
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 197 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:29 GMT
Etag: W/"b3-cOwVocbzHecy899nq2RHgJvIj+A"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-74d5cede","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-11-24","checkout":"2026-11-27"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/5094
correlation: qa-2db72b40-3843-4436-b36f-5c60695bf924

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-2db72b40-3843-4436-b36f-5c60695bf924
Content-Type: application/json

--- response: 201 in 193 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:29 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/5094
correlation: qa-2827253d-e502-4155-9eac-bdd4158b0237

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2827253d-e502-4155-9eac-bdd4158b0237
Content-Type: application/json

--- response: 404 in 193 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 25 Oct 2026 07:40:29 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1792914029"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=QQGr57mMd7L77KUFYu11bHPq%2BtWOHpV9JU333aBCH6k%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1792914029"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
