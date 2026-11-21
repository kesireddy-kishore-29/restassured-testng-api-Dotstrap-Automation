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
| 1 | `POST /auth` | 200 | 52 | `qa-58508738-fe05-4e56-807a-b3d7c496f740` |

## 1. POST /auth

```text
#1 POST https://restful-booker.herokuapp.com/auth
correlation: qa-58508738-fe05-4e56-807a-b3d7c496f740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58508738-fe05-4e56-807a-b3d7c496f740
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 52 ms ---
Content-Length: 28
Content-Type: application/json; charset=utf-8
Date: Mon, 16 Nov 2026 09:53:38 GMT
Etag: W/"1c-J3EiwfZwVQjKTKvpvazUfTni8fI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=5Lq0MdVTplNUMancFkZCU6Z9USj%2Bbg%2FHlZVVGqiscVA%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1794822818"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=5Lq0MdVTplNUMancFkZCU6Z9USj%2Bbg%2FHlZVVGqiscVA%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1794822818"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"reason":"Bad credentials"}
```
