# Transcript: An unknown booking is a 404

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#unknownBookingIsA404` |
| Features | FEAT-NEG-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /booking/{id}` | 404 | 596 | `qa-6f222098-7393-49eb-9a66-0fa04b5f8af5` |

## 1. GET /booking/{id}

```text
#1 GET https://restful-booker.herokuapp.com/booking/999999999
correlation: qa-6f222098-7393-49eb-9a66-0fa04b5f8af5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f222098-7393-49eb-9a66-0fa04b5f8af5
Content-Type: application/json

--- response: 404 in 596 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 10 Nov 2026 09:59:36 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=PihVVQGZ6HqlDMBTQFanLZTILoyTd3YaUGcE8yQUDLk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794304776"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=PihVVQGZ6HqlDMBTQFanLZTILoyTd3YaUGcE8yQUDLk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794304776"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
