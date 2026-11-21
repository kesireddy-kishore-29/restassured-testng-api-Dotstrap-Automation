# Transcript: An update without a valid token is refused and changes nothing [Optional[not-a-real-token]]

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#updateWithoutAValidTokenIsRefused[1]` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /booking` | 200 | 35 | `qa-311cc484-f4a6-41b1-b448-7222967651ef` |
| 2 | `PUT /booking/{id}` | 403 | 42 | `qa-442b097b-de2d-40b1-a9a4-17cc3886c278` |
| 3 | `GET /booking/{id}` | 200 | 32 | `qa-8a539aa0-a3b9-4225-8b8a-e5e281037bbd` |
| 4 | `DELETE /booking/{id}` | 201 | 31 | `qa-56123b1b-1cd4-4571-80ba-2d8bcbc26192` |
| 5 | `GET /booking/{id}` | 404 | 34 | `qa-7780919c-eac1-4e2b-93ca-846e6b5d9c22` |

## 1. POST /booking

```text
#1 POST https://restful-booker.herokuapp.com/booking
correlation: qa-311cc484-f4a6-41b1-b448-7222967651ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-311cc484-f4a6-41b1-b448-7222967651ef
Content-Type: application/json

--- request body ---
{"firstname":"Keep","lastname":"Guest-51c09377","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}

--- response: 200 in 35 ms ---
Content-Length: 207
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"cf-9OwGai5JMZ7iENe8qh6NjZ8VmT8"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"bookingid":1442,"booking":{"firstname":"Keep","lastname":"Guest-51c09377","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}}
```

## 2. PUT /booking/{id}

```text
#2 PUT https://restful-booker.herokuapp.com/booking/1442
correlation: qa-442b097b-de2d-40b1-a9a4-17cc3886c278

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-442b097b-de2d-40b1-a9a4-17cc3886c278
Content-Type: application/json

--- request body ---
{"firstname":"Changed","lastname":"Guest-332db8d7","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}

--- response: 403 in 42 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"9-PatfYBLj4Um1qTm5zrukoLhNyPU"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Forbidden
```

## 3. GET /booking/{id}

```text
#3 GET https://restful-booker.herokuapp.com/booking/1442
correlation: qa-8a539aa0-a3b9-4225-8b8a-e5e281037bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a539aa0-a3b9-4225-8b8a-e5e281037bbd
Content-Type: application/json

--- response: 200 in 32 ms ---
Content-Length: 178
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:39 GMT
Etag: W/"b2-VRzm9mghZ7/rEr8ztcIeR5OmzkY"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822819"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=OqI8wIa%2BnV%2FQorke%2F%2FkpeU287wZCGMo2axMvLWEaRbs%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822819"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"firstname":"Keep","lastname":"Guest-51c09377","totalprice":120,"depositpaid":true,"bookingdates":{"checkin":"2026-12-16","checkout":"2026-12-19"},"additionalneeds":"Breakfast"}
```

## 4. DELETE /booking/{id}

```text
#4 DELETE https://restful-booker.herokuapp.com/booking/1442
correlation: qa-56123b1b-1cd4-4571-80ba-2d8bcbc26192

--- request headers ---
Accept: application/json
Cookie: ****
X-Correlation-Id: qa-56123b1b-1cd4-4571-80ba-2d8bcbc26192
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

## 5. GET /booking/{id}

```text
#5 GET https://restful-booker.herokuapp.com/booking/1442
correlation: qa-7780919c-eac1-4e2b-93ca-846e6b5d9c22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7780919c-eac1-4e2b-93ca-846e6b5d9c22
Content-Type: application/json

--- response: 404 in 34 ms ---
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
