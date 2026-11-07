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
| 1 | `POST /booking` | 200 | 595 | `qa-6e5ee504-88d0-4165-b9fe-ef53a2330468` |
| 2 | `PUT /booking/{id}` | 403 | 185 | `qa-c228351a-9175-49ec-bf6e-40cea6b5c2c7` |
| 3 | `GET /booking/{id}` | 200 | 193 | `qa-3acd3747-a345-40bc-8c76-714acf9fefb9` |
| 4 | `POST /auth` | 200 | 185 | `qa-44ce28d5-9684-483d-99e8-04a5159f537d` |
| 5 | `DELETE /booking/{id}` | 201 | 183 | `qa-71b211c3-480b-42a0-9561-a24078efaf90` |
| 6 | `GET /booking/{id}` | 404 | 177 | `qa-b5e027bf-b52a-4b8f-94dd-5edd4ca87028` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-6e5ee504-88d0-4165-b9fe-ef53a2330468

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e5ee504-88d0-4165-b9fe-ef53a2330468
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-a9c275ec","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}

--- response: 200 in 595 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:54 GMT
Etag: W/"cf-BebdWl/beYZ95Xy7YF0PnM7kRBQ"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=egY81%2BAzAtOZdmsp%2FlTPM93nrg1SLVvDVukS5nwHMB8%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349954"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=egY81%2BAzAtOZdmsp%2FlTPM93nrg1SLVvDVukS5nwHMB8%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349954"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":2666,"booking":{"firstname":"Keep","lastname":"Guest-a9c275ec","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/2666
correlation: qa-c228351a-9175-49ec-bf6e-40cea6b5c2c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c228351a-9175-49ec-bf6e-40cea6b5c2c7
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-05a2ccf3","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}

--- response: 403 in 185 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:55 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RyGFiBOHUILKSs143DzaTxU3JMxVlGRHgfzF3EM7ex4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RyGFiBOHUILKSs143DzaTxU3JMxVlGRHgfzF3EM7ex4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/2666
correlation: qa-3acd3747-a345-40bc-8c76-714acf9fefb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3acd3747-a345-40bc-8c76-714acf9fefb9
Content-Type: application/json

--- response: 200 in 193 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:55 GMT
Etag: W/"b2-8VJkEJNVE6zUEKVOYwOadXuiPx0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RyGFiBOHUILKSs143DzaTxU3JMxVlGRHgfzF3EM7ex4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RyGFiBOHUILKSs143DzaTxU3JMxVlGRHgfzF3EM7ex4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-a9c275ec","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-11-29","checkout":"2026-12-02"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-44ce28d5-9684-483d-99e8-04a5159f537d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44ce28d5-9684-483d-99e8-04a5159f537d
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 185 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:55 GMT
Etag: W/"1b-RxdDxTyMFF2Uc6Mjom0Fe5SSP0E"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=RyGFiBOHUILKSs143DzaTxU3JMxVlGRHgfzF3EM7ex4%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349955"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=RyGFiBOHUILKSs143DzaTxU3JMxVlGRHgfzF3EM7ex4%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349955"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/2666
correlation: qa-71b211c3-480b-42a0-9561-a24078efaf90

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-71b211c3-480b-42a0-9561-a24078efaf90
Content-Type: application/json

--- response: 201 in 183 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/2666
correlation: qa-b5e027bf-b52a-4b8f-94dd-5edd4ca87028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5e027bf-b52a-4b8f-94dd-5edd4ca87028
Content-Type: application/json

--- response: 404 in 177 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Fri, 30 Oct 2026 08:45:56 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1793349956"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Zyju1q%2FQ7DHlVFW5z841l7LRfi%2BeLDwnouQhxSqpqHQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1793349956"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
