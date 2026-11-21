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
| 1 | `POST /booking` | 200 | 613 | `qa-21c55212-7b73-4061-997c-4bb18470453b` |
| 2 | `PUT /booking/{id}` | 403 | 31 | `qa-95a0f182-dcb8-4a15-8270-102ca0f4256f` |
| 3 | `GET /booking/{id}` | 200 | 36 | `qa-05dc43f1-f8aa-4e90-8e37-81131da0f216` |
| 4 | `POST /auth` | 200 | 34 | `qa-59936aea-7d17-4787-8b4e-e1261954308a` |
| 5 | `DELETE /booking/{id}` | 201 | 25 | `qa-8fe6045d-dfb8-4b1b-8a46-256376fb03f4` |
| 6 | `GET /booking/{id}` | 404 | 29 | `qa-60e52c51-75f1-458b-8bb7-1ae34238ca9b` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-21c55212-7b73-4061-997c-4bb18470453b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21c55212-7b73-4061-997c-4bb18470453b
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-aa67956d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}

--- response: 200 in 613 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:07 GMT
Etag: W/"cf-azGjPba3+GY4qWe6yXOjqFM2dyA"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912607"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912607"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":5723,"booking":{"firstname":"Keep","lastname":"Guest-aa67956d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/5723
correlation: qa-95a0f182-dcb8-4a15-8270-102ca0f4256f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95a0f182-dcb8-4a15-8270-102ca0f4256f
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-4ff6f782","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}

--- response: 403 in 31 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:07 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912607"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912607"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/5723
correlation: qa-05dc43f1-f8aa-4e90-8e37-81131da0f216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05dc43f1-f8aa-4e90-8e37-81131da0f216
Content-Type: application/json

--- response: 200 in 36 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:07 GMT
Etag: W/"b2-+nDe1NABBmeCiv1Z1vAP6uGr72g"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912607"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912607"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-aa67956d","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-17","checkout":"2026-12-20"},"additionalneeds":"Breakfast"}
```

## 4. POST /auth

```text
#4 POST https://restful-booker.herokuapp.com/auth
correlation: qa-59936aea-7d17-4787-8b4e-e1261954308a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59936aea-7d17-4787-8b4e-e1261954308a
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 34 ms ---
Content-Length: 27
Content-Type: application/json; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:07 GMT
Etag: W/"1b-n/1l6bse1CdjCSIktYWSbFU+Ic0"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912607"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912607"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"token":"****"}
```

## 5. DELETE /booking/{id}

```text
#5 DELETE https://restful-booker.herokuapp.com/booking/5723
correlation: qa-8fe6045d-dfb8-4b1b-8a46-256376fb03f4

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-8fe6045d-dfb8-4b1b-8a46-256376fb03f4
Content-Type: application/json

--- response: 201 in 25 ms ---
Content-Length: 7
Content-Type: text/plain; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:07 GMT
Etag: W/"7-rM9AyJuqT6iOan/xHh+AW+7K/T8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912607"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=HUfToSdHUuggNFhKPkjoE%2BmwnRTNnCnpDIOUn1n3JnU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912607"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Created
```

## 6. GET /booking/{id}

```text
#6 GET https://restful-booker.herokuapp.com/booking/5723
correlation: qa-60e52c51-75f1-458b-8bb7-1ae34238ca9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60e52c51-75f1-458b-8bb7-1ae34238ca9b
Content-Type: application/json

--- response: 404 in 29 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 17 Nov 2026 10:50:08 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794912608"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=gJbVAVLg9ya5ZnnhNfWOF8any8NZ5mw8%2F5xvRQx7uvY%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794912608"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
