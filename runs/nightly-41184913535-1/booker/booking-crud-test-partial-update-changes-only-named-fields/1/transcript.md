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
| 1 | `POST /booking` | 200 | 181 | `qa-b63b0d4e-ddf0-41c2-a676-49bd29215b64` |
| 2 | `PATCH /booking/{id}` | 200 | 176 | `qa-e5b48d3c-7dd5-419a-89c5-8708522a9dac` |
| 3 | `DELETE /booking/{id}` | 201 | 179 | `qa-00ebe22b-3630-4fa3-a920-c9d595a90e89` |
| 4 | `GET /booking/{id}` | 404 | 176 | `qa-375cf05b-01f2-47c3-8924-c90f2b9fc0b8` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-b63b0d4e-ddf0-41c2-a676-49bd29215b64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b63b0d4e-ddf0-41c2-a676-49bd29215b64
Content-Type: application/json

--- request body ---
{"firstname":"Linus","lastname":"Guest-aea7f614","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}

--- response: 200 in 181 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:37 GMT
Etag: W/"cf-2p3yI2ZzoEU/MrqedFgozsJddfE"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":278,"booking":{"firstname":"Linus","lastname":"Guest-aea7f614","totalprice":150,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}}
```

## 2. PATCH /booking/{id}

```text
#2 PATCH https://restful-booker.herokuapp.com/booking/278
correlation: qa-e5b48d3c-7dd5-419a-89c5-8708522a9dac

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-e5b48d3c-7dd5-419a-89c5-8708522a9dac
Content-Type: application/json

--- request body ---
{"totalprice":175}

--- response: 200 in 176 ms ---
Content-Length: 179
Content-Type: application/json; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:37 GMT
Etag: W/"b3-wR0Q+Gxo7IRK929IhpWmGyI5TO0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435497"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=%2FFr0GToCXAGg0l2iUVidNoy0vN%2F2qBP3egMM9qzK0mc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435497"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Linus","lastname":"Guest-aea7f614","totalprice":175,"depositpaid":true,"bookingdates":{"checkin":"2026-11-30","checkout":"2026-12-03"},"additionalneeds":"Breakfast"}
```

## 3. DELETE /booking/{id}

```text
#3 DELETE https://restful-booker.herokuapp.com/booking/278
correlation: qa-00ebe22b-3630-4fa3-a920-c9d595a90e89

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-00ebe22b-3630-4fa3-a920-c9d595a90e89
Content-Type: application/json

--- response: 201 in 179 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:38 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TIiuNP26pftWaN2qO1A55hI9EWWKpXHo%2FyWvAjnPckk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435498"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TIiuNP26pftWaN2qO1A55hI9EWWKpXHo%2FyWvAjnPckk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435498"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 4. GET /booking/{id}

```text
#4 GET https://restful-booker.herokuapp.com/booking/278
correlation: qa-375cf05b-01f2-47c3-8924-c90f2b9fc0b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-375cf05b-01f2-47c3-8924-c90f2b9fc0b8
Content-Type: application/json

--- response: 404 in 176 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 31 Oct 2026 08:31:38 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=TIiuNP26pftWaN2qO1A55hI9EWWKpXHo%2FyWvAjnPckk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793435498"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=TIiuNP26pftWaN2qO1A55hI9EWWKpXHo%2FyWvAjnPckk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793435498"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
