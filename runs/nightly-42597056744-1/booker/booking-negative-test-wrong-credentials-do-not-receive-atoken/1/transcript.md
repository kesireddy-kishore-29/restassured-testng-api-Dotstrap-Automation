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
| 1 | `POST /auth` | 200 | 226 | `qa-713f3c3d-1be9-40a2-92fb-602573cf711e` |

## 1. POST /auth

```text
#1 POST https://restful-booker.herokuapp.com/auth
correlation: qa-713f3c3d-1be9-40a2-92fb-602573cf711e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-713f3c3d-1be9-40a2-92fb-602573cf711e
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 226 ms ---
Content-Length: 28
Content-Type: application/json; charset=utf-8
Date: Mon, 09 Nov 2026 09:55:53 GMT
Etag: W/"1c-J3EiwfZwVQjKTKvpvazUfTni8fI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=7bkQ73C2%2B0JbLv9VHERTk2e3jDA0KdeUVjd8TPbB5WQ%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794218153"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=7bkQ73C2%2B0JbLv9VHERTk2e3jDA0KdeUVjd8TPbB5WQ%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794218153"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"reason":"Bad credentials"}
```
