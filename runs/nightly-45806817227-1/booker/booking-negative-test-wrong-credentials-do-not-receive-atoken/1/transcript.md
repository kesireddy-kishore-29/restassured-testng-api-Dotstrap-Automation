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
| 1 | `POST /auth` | 200 | 99 | `qa-ecc17db3-6b0d-40fa-8e65-c809e6f9001c` |

## 1. POST /auth

```text
#1 POST https://restful-booker.herokuapp.com/auth
correlation: qa-ecc17db3-6b0d-40fa-8e65-c809e6f9001c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecc17db3-6b0d-40fa-8e65-c809e6f9001c
Content-Type: application/json

--- request body ---
{"username":"admin","password":"****"}

--- response: 200 in 99 ms ---
Content-Length: 28
Content-Type: application/json; charset=utf-8
Date: Thu, 26 Nov 2026 11:02:33 GMT
Etag: W/"1c-J3EiwfZwVQjKTKvpvazUfTni8fI"
Nel: {"report_to":"heroku-nel","response_headers":["Via"],"max_age":3600,"success_fraction":0.01,"failure_fraction":0.1}
Report-To: {"group":"heroku-nel","endpoints":[{"url":"https://nel.heroku.com/reports?s=Fl0SJuNZOjKVvNumxUb0W0uVNVxAgug6r0H5jve%2F4OE%3D\u0026sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add\u0026ts=1795690953"}],"max_age":3600}
Reporting-Endpoints: heroku-nel="https://nel.heroku.com/reports?s=Fl0SJuNZOjKVvNumxUb0W0uVNVxAgug6r0H5jve%2F4OE%3D&sid=c46efe9b-d3d2-4a0c-8c76-bfafa16c5add&ts=1795690953"
Server: Heroku
Via: 1.1 heroku-router
X-Powered-By: Express

{"reason":"Bad credentials"}
```
