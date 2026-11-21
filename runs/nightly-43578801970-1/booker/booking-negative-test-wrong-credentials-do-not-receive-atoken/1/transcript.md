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
| 1 | `POST /auth` | 200 | 245 | `qa-d7c0b6d5-34e3-49b9-9b2e-74d59e45c383` |

## 1. POST /auth

```text
#1 POST https://restful-booker.herokuapp.com/auth
correlation: qa-d7c0b6d5-34e3-49b9-9b2e-74d59e45c383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7c0b6d5-34e3-49b9-9b2e-74d59e45c383
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 245 ms ---
Content-Length: 28
Content-Type: application/json; charset=utf-8
Date: Sat, 14 Nov 2026 09:05:13 GMT
Etag: W/"1c-J3EiwfZwVQjKTKvpvazUfTni8fI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=ubmGOD5wXRwpXnwP1JPnbmSZg7z9FOrJQJBIed99KKg%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794647113"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=ubmGOD5wXRwpXnwP1JPnbmSZg7z9FOrJQJBIed99KKg%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794647113"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"reason":"Bad credentials"}
```
