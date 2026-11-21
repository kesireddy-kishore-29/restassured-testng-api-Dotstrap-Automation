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
| 1 | `GET /booking/{id}` | 404 | 811 | `qa-c24411c2-10d9-4b03-bb19-a97bf383a8c2` |

## 1. GET /booking/{id}

```text
#1 GET https://restful-booker.herokuapp.com/booking/999999999
correlation: qa-c24411c2-10d9-4b03-bb19-a97bf383a8c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c24411c2-10d9-4b03-bb19-a97bf383a8c2
Content-Type: application/json

--- response: 404 in 811 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Sun, 15 Nov 2026 09:36:11 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Bkw6FAZn8kvkA3Xh1KTl1oP8JUpsvfS%2BI%2Foz6kMETcU%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794735371"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Bkw6FAZn8kvkA3Xh1KTl1oP8JUpsvfS%2BI%2Foz6kMETcU%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794735371"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
