# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 379 | `qa-7f94a650-a257-43ca-b104-5f6adff649c3` |
| 2 | `POST /v1/auth/token` | 200 | 51 | `qa-38f74888-90bb-4f02-9deb-d6ae714ad096` |
| 3 | `GET /v1/admin/stats` | 403 | 53 | `qa-1b553caa-a2de-4309-b2f4-0d0eaa2be755` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d710c640-3859-48c0-813c-7c181d13c1e0` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-a97cc180-5e98-4acf-9e8c-30a9aa396c9e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7f94a650-a257-43ca-b104-5f6adff649c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f94a650-a257-43ca-b104-5f6adff649c3
Content-Type: application/json

--- request body ---
{"handle":"qa-4de5a70c92b7","displayName":"QA 4de5a70c92b7","password":"****","region":"eu"}

--- response: 201 in 379 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f94a650-a257-43ca-b104-5f6adff649c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-4de5a70c92b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1d6a292a-f0d1-481b-bdb6-ef972477e0b9","handle":"qa-4de5a70c92b7","displayName":"QA 4de5a70c92b7","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.862804034Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-38f74888-90bb-4f02-9deb-d6ae714ad096

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38f74888-90bb-4f02-9deb-d6ae714ad096
Content-Type: application/json

--- request body ---
{"handle":"qa-4de5a70c92b7","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-38f74888-90bb-4f02-9deb-d6ae714ad096
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d6a292a-f0d1-481b-bdb6-ef972477e0b9"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-1b553caa-a2de-4309-b2f4-0d0eaa2be755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b553caa-a2de-4309-b2f4-0d0eaa2be755
Content-Type: application/json

--- response: 403 in 53 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b553caa-a2de-4309-b2f4-0d0eaa2be755
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-1b553caa-a2de-4309-b2f4-0d0eaa2be755"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d710c640-3859-48c0-813c-7c181d13c1e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d710c640-3859-48c0-813c-7c181d13c1e0
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d710c640-3859-48c0-813c-7c181d13c1e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a97cc180-5e98-4acf-9e8c-30a9aa396c9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a97cc180-5e98-4acf-9e8c-30a9aa396c9e
Content-Type: application/json

--- request body ---
{"handle":"qa-4de5a70c92b7","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a97cc180-5e98-4acf-9e8c-30a9aa396c9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a97cc180-5e98-4acf-9e8c-30a9aa396c9e"}
```
