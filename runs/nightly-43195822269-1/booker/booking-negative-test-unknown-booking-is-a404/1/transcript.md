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
| 1 | `GET /booking/{id}` | 404 | 858 | `qa-fed9d22c-49a0-4976-83dd-c5df4654af0a` |

## 1. GET /booking/{id}

```text
#1 GET https://restful-booker.herokuapp.com/booking/999999999
correlation: qa-fed9d22c-49a0-4976-83dd-c5df4654af0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fed9d22c-49a0-4976-83dd-c5df4654af0a
Content-Type: application/json

--- response: 404 in 858 ms ---
Content-Length: 9
Content-Type: text/plain; charset=utf-8
Date: Thu, 12 Nov 2026 09:56:32 GMT
Etag: W/"9-0gXL1ngzMqISxa6S1zx3F4wtLyg"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=nt%2FGyz%2BDwUcYxWxz2HiAgNulOCsZzMFBxulimxa%2BlGA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794477392"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=nt%2FGyz%2BDwUcYxWxz2HiAgNulOCsZzMFBxulimxa%2BlGA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794477392"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

Not Found
```
