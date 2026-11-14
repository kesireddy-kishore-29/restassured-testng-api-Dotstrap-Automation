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
| 1 | `GET /booking/{id}` | 404 | 631 | `qa-daa36680-15d8-4ae6-a5e3-9c9d9e689fa4` |

## 1. GET /booking/{id}

```text
#1 GET https://restful-booker.herokuapp.com/booking/999999999
correlation: qa-daa36680-15d8-4ae6-a5e3-9c9d9e689fa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daa36680-15d8-4ae6-a5e3-9c9d9e689fa4
Content-Type: application/json

--- response: 404 in 631 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 08 Nov 2026 09:09:03 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=GbYboOpcqy%2BECOnAIsy9oS%2BcpvBv5td7tRX6JCbNe4M%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794128943"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=GbYboOpcqy%2BECOnAIsy9oS%2BcpvBv5td7tRX6JCbNe4M%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794128943"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
