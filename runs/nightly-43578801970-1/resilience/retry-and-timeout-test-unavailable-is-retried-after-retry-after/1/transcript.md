# Transcript: A 503 with Retry-After is retried after the wait

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#unavailableIsRetriedAfterRetryAfter` |
| Features | FEAT-RES-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-b9729e46-b528-4d3c-a779-e9e1c4cb9358` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-3a7ba9ff-4cad-4e27-9eb4-0f745651e163` |
| 3 | `GET /v1/accounts/me` | 503 | 13 | `qa-c4987d8c-7c63-4e58-aca9-4f18178aaf2c` |
| 4 | `GET /v1/accounts/me` | 200 | 8 | `qa-acdffbc0-3625-47c3-8edb-7543370952d2` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-5ebc0bfb-defb-4717-a498-264aa4b1869d` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-baee820c-dc4e-42f4-b2ca-533caa91b424` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9729e46-b528-4d3c-a779-e9e1c4cb9358

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9729e46-b528-4d3c-a779-e9e1c4cb9358
Content-Type: application/json

--- request body ---
{"handle":"qa-03a108fd6db0","displayName":"QA 03a108fd6db0","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9729e46-b528-4d3c-a779-e9e1c4cb9358
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-03a108fd6db0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b3cd297-fab2-4ab9-8754-0b4fd09628ce","handle":"qa-03a108fd6db0","displayName":"QA 03a108fd6db0","region":"eu","role":"user","createdAt":"2026-11-14T09:05:15.481939420Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3a7ba9ff-4cad-4e27-9eb4-0f745651e163

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a7ba9ff-4cad-4e27-9eb4-0f745651e163
Content-Type: application/json

--- request body ---
{"handle":"qa-03a108fd6db0","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a7ba9ff-4cad-4e27-9eb4-0f745651e163
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b3cd297-fab2-4ab9-8754-0b4fd09628ce"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c4987d8c-7c63-4e58-aca9-4f18178aaf2c

--- request headers ---
Accept: application/json
X-Fault-Key: a78733d1-04ef-4cb5-8f21-4e2d6d3c2ef8
X-Fault: unavailable-once
X-Correlation-Id: qa-c4987d8c-7c63-4e58-aca9-4f18178aaf2c
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4987d8c-7c63-4e58-aca9-4f18178aaf2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-c4987d8c-7c63-4e58-aca9-4f18178aaf2c"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-acdffbc0-3625-47c3-8edb-7543370952d2

--- request headers ---
Accept: application/json
X-Fault-Key: a78733d1-04ef-4cb5-8f21-4e2d6d3c2ef8
X-Fault: unavailable-once
X-Correlation-Id: qa-acdffbc0-3625-47c3-8edb-7543370952d2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-acdffbc0-3625-47c3-8edb-7543370952d2
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
Content-Length: 181

{"id":"acc_6b3cd297-fab2-4ab9-8754-0b4fd09628ce","handle":"qa-03a108fd6db0","displayName":"QA 03a108fd6db0","region":"eu","role":"user","createdAt":"2026-11-14T09:05:15.481939420Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ebc0bfb-defb-4717-a498-264aa4b1869d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ebc0bfb-defb-4717-a498-264aa4b1869d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ebc0bfb-defb-4717-a498-264aa4b1869d
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-baee820c-dc4e-42f4-b2ca-533caa91b424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baee820c-dc4e-42f4-b2ca-533caa91b424
Content-Type: application/json

--- request body ---
{"handle":"qa-03a108fd6db0","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-baee820c-dc4e-42f4-b2ca-533caa91b424
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-baee820c-dc4e-42f4-b2ca-533caa91b424"}
```
