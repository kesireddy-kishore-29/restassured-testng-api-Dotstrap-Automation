# Transcript: An update without a valid token is refused and changes nothing [Optional.empty]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[0]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 813 | `qa-08586689-a327-4657-9be6-2cffc255ee5f` |
| 2 | `PUT /booking/{id}` | 403 | 210 | `qa-5d42db3c-1e32-4f42-ba08-715f35c0d79b` |
| 3 | `GET /booking/{id}` | 200 | 217 | `qa-21e05a55-e42e-4f01-8955-6e5c9a601ed1` |
| 4 | `POST /auth` | 200 | 218 | `qa-e7450d24-a226-4707-9ab5-134855376333` |
| 5 | `DELETE /booking/{id}` | 201 | 208 | `qa-5e1384fd-4753-463e-b88d-8ba18074dbe7` |
| 6 | `GET /booking/{id}` | 404 | 228 | `qa-3cd9a26b-e9c2-41da-b070-af10798e1329` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-08586689-a327-4657-9be6-2cffc255ee5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08586689-a327-4657-9be6-2cffc255ee5f
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-6fd508d7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}

--- response: 200 in 813 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:14 GMT
Etag: W/"cf-rg/QnX3E+CUdzDEgYXf+L65nSM8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=cUkcbdFGNaxA4lBKUVfSSgQZU6LKhZ121Q798zH%2Belo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784494"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=cUkcbdFGNaxA4lBKUVfSSgQZU6LKhZ121Q798zH%2Belo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784494"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":3841,"booking":{"firstname":"Keep","lastname":"Guest-6fd508d7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/3841
correlation: qa-5d42db3c-1e32-4f42-ba08-715f35c0d79b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d42db3c-1e32-4f42-ba08-715f35c0d79b
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-0f2ba75f","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}

--- response: 403 in 210 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:14 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=cUkcbdFGNaxA4lBKUVfSSgQZU6LKhZ121Q798zH%2Belo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784494"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=cUkcbdFGNaxA4lBKUVfSSgQZU6LKhZ121Q798zH%2Belo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784494"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/3841
correlation: qa-21e05a55-e42e-4f01-8955-6e5c9a601ed1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21e05a55-e42e-4f01-8955-6e5c9a601ed1
Content-Type: application/json

--- response: 200 in 217 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:15 GMT
Etag: W/"b2-MHVw3BdMEUEtS7FAWhyT0LJhe20"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=F27nDeLRQlm7lNKxhf3iLnHETzn2k%2BFdZXY9W%2Bqomtc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784495"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=F27nDeLRQlm7lNKxhf3iLnHETzn2k%2BFdZXY9W%2Bqomtc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784495"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-6fd508d7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-04","checkout":"2026-12-07"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-e7450d24-a226-4707-9ab5-134855376333

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7450d24-a226-4707-9ab5-134855376333
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 218 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:15 GMT
Etag: W/"1b-NwptjKrIi+ytChcdYGMjUQ5OzyY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=F27nDeLRQlm7lNKxhf3iLnHETzn2k%2BFdZXY9W%2Bqomtc%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784495"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=F27nDeLRQlm7lNKxhf3iLnHETzn2k%2BFdZXY9W%2Bqomtc%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784495"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/3841
correlation: qa-5e1384fd-4753-463e-b88d-8ba18074dbe7

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-5e1384fd-4753-463e-b88d-8ba18074dbe7
Content-Type: application/json

--- response: 201 in 208 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:16 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/3841
correlation: qa-3cd9a26b-e9c2-41da-b070-af10798e1329

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cd9a26b-e9c2-41da-b070-af10798e1329
Content-Type: application/json

--- response: 404 in 228 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Wed, 04 Nov 2026 09:28:16 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793784496"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=N8R%2FGFojPydUE1adyQ5SfDyciYO81%2Ff1aQvovBDpfaM%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793784496"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
