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
| 1 | `GET /booking/{id}` | 404 | 974 | `qa-8c1f2fc9-c4f4-407c-9283-61125d007630` |

## 1. GET /booking/{id}

```text
#1 GET https://restful-booker.herokuapp.com/booking/999999999
correlation: qa-8c1f2fc9-c4f4-407c-9283-61125d007630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c1f2fc9-c4f4-407c-9283-61125d007630
Content-Type: application/json

--- response: 404 in 974 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sat, 07 Nov 2026 08:55:04 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=iCEjjct1%2BdBuBNubA9wDoiI%2Fl%2BOwmDXj3W6A30u5I6w%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794041704"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=iCEjjct1%2BdBuBNubA9wDoiI%2Fl%2BOwmDXj3W6A30u5I6w%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794041704"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
