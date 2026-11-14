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
| 1 | `POST /v1/accounts` | 201 | 347 | `qa-2b9c663d-240d-4816-99a3-b9d56d1eacbf` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-0636d2e9-85d5-4fa1-98c2-164a0d5e642e` |
| 3 | `GET /v1/admin/stats` | 403 | 45 | `qa-682f54ea-a4e0-4160-a0d6-3006b8a15f5f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ea8b4ccb-79f6-4a62-a633-fb6ce80bd803` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-fed470fc-e898-42b2-a728-b23a9f63a1d4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2b9c663d-240d-4816-99a3-b9d56d1eacbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b9c663d-240d-4816-99a3-b9d56d1eacbf
Content-Type: application/json

--- request body ---
{"handle":"qa-991e30d62d5f","displayName":"QA 991e30d62d5f","password":"****","region":"eu"}

--- response: 201 in 347 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b9c663d-240d-4816-99a3-b9d56d1eacbf
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
Location: /v1/accounts/qa-991e30d62d5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b677efc5-77d2-49d3-98c7-98e5b94f17be","handle":"qa-991e30d62d5f","displayName":"QA 991e30d62d5f","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.057371772Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0636d2e9-85d5-4fa1-98c2-164a0d5e642e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0636d2e9-85d5-4fa1-98c2-164a0d5e642e
Content-Type: application/json

--- request body ---
{"handle":"qa-991e30d62d5f","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-0636d2e9-85d5-4fa1-98c2-164a0d5e642e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b677efc5-77d2-49d3-98c7-98e5b94f17be"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-682f54ea-a4e0-4160-a0d6-3006b8a15f5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-682f54ea-a4e0-4160-a0d6-3006b8a15f5f
Content-Type: application/json

--- response: 403 in 45 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-682f54ea-a4e0-4160-a0d6-3006b8a15f5f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-682f54ea-a4e0-4160-a0d6-3006b8a15f5f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea8b4ccb-79f6-4a62-a633-fb6ce80bd803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea8b4ccb-79f6-4a62-a633-fb6ce80bd803
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea8b4ccb-79f6-4a62-a633-fb6ce80bd803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fed470fc-e898-42b2-a728-b23a9f63a1d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fed470fc-e898-42b2-a728-b23a9f63a1d4
Content-Type: application/json

--- request body ---
{"handle":"qa-991e30d62d5f","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fed470fc-e898-42b2-a728-b23a9f63a1d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fed470fc-e898-42b2-a728-b23a9f63a1d4"}
```
