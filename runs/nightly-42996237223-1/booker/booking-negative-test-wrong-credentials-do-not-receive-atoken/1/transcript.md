# Transcript: Wrong credentials do not receive a token

| | |
|---|---|
| Test | `com.qaautomation.tests.booker.BookingNegativeTest#wrongCredentialsDoNotReceiveAToken` |
| Features | FEAT-AUTH-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /auth` | 200 | 139 | `qa-92c93380-c5cc-42b6-b668-48844960e096` |

## 1. POST /auth

```text
#1 POST https://restful-booker.herokuapp.com/auth
correlation: qa-92c93380-c5cc-42b6-b668-48844960e096

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92c93380-c5cc-42b6-b668-48844960e096
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 139 ms ---
Content-Length: 28
Content-Type: application/json; charset=utf-8
Date: Wed, 11 Nov 2026 09:34:18 GMT
Etag: W/"1c-J3EiwfZwVQjKTKvpvazUfTni8fI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794389658"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=BNDcEa%2BxubcF4mW1goauF%2FIHdwAVJGkbBgAmznH58%2Bk%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794389658"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"reason":"Bad credentials"}
```
