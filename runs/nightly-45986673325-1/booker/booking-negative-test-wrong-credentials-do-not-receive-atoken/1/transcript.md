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
| 1 | `POST /auth` | 200 | 128 | `qa-12e5ab15-894a-4301-a13f-e05fde8b8bec` |

## 1. POST /auth

```text
#1 POST https://restful-booker.herokuapp.com/auth
correlation: qa-12e5ab15-894a-4301-a13f-e05fde8b8bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12e5ab15-894a-4301-a13f-e05fde8b8bec
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 128 ms ---
Content-Length: 28
Content-Type: application/json; charset=utf-8
Date: Fri, 27 Nov 2026 10:59:51 GMT
Etag: W/"1c-J3EiwfZwVQjKTKvpvazUfTni8fI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=q6fXzmV%2Bxu%2FajUAGrsAJPMc8diMs8qYl7hgWXLkC%2FEo%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795777191"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=q6fXzmV%2Bxu%2FajUAGrsAJPMc8diMs8qYl7hgWXLkC%2FEo%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795777191"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"reason":"Bad credentials"}
```
