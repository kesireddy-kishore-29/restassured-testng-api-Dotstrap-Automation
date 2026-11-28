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
| 1 | `GET /booking/{id}` | 404 | 824 | `qa-4c010a7c-c721-4e19-8a93-964db2ea67ce` |

## 1. GET /booking/{id}

```text
#1 GET https://restful-booker.herokuapp.com/booking/999999999
correlation: qa-4c010a7c-c721-4e19-8a93-964db2ea67ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c010a7c-c721-4e19-8a93-964db2ea67ce
Content-Type: application/json

--- response: 404 in 824 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Tue, 24 Nov 2026 12:38:06 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=yE65Spk41D%2B%2B%2F%2BXf2wX8WLtwy%2FgKVWrHxyW54rGY7U0%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795523886"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=yE65Spk41D%2B%2B%2F%2BXf2wX8WLtwy%2FgKVWrHxyW54rGY7U0%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795523886"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
