# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 499 | `qa-ed9b8ea2-c92e-4da1-aae5-f1be50f1ba6e` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-e182ce64-d1a2-470b-b735-ca6c89c733c6` |
| 3 | `PATCH /v1/accounts/me` | 200 | 49 | `qa-dea9efe5-8a83-4649-ae14-8046a130d658` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-8593d28b-de78-4eae-8cc4-c3d816662bdf` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-30036545-f2e2-49a4-8141-8907e6ba372f` |
| 6 | `POST /v1/auth/token` | 401 | 47 | `qa-5590d444-d015-4dec-b031-e81500b12f33` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ed9b8ea2-c92e-4da1-aae5-f1be50f1ba6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed9b8ea2-c92e-4da1-aae5-f1be50f1ba6e
Content-Type: application/json

--- request body ---
{"handle":"qa-d4f0c0e82aff","displayName":"QA d4f0c0e82aff","password":"****","region":"eu"}

--- response: 201 in 499 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed9b8ea2-c92e-4da1-aae5-f1be50f1ba6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-d4f0c0e82aff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb6bb76f-4cd5-43b2-b276-9c86d3f940dc","handle":"qa-d4f0c0e82aff","displayName":"QA d4f0c0e82aff","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.385410893Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e182ce64-d1a2-470b-b735-ca6c89c733c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e182ce64-d1a2-470b-b735-ca6c89c733c6
Content-Type: application/json

--- request body ---
{"handle":"qa-d4f0c0e82aff","password":"****"}

--- response: 200 in 81 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-e182ce64-d1a2-470b-b735-ca6c89c733c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb6bb76f-4cd5-43b2-b276-9c86d3f940dc"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-dea9efe5-8a83-4649-ae14-8046a130d658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea9efe5-8a83-4649-ae14-8046a130d658
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-dea9efe5-8a83-4649-ae14-8046a130d658
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
Content-Length: 179

{"id":"acc_eb6bb76f-4cd5-43b2-b276-9c86d3f940dc","handle":"qa-d4f0c0e82aff","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.385410893Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-8593d28b-de78-4eae-8cc4-c3d816662bdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8593d28b-de78-4eae-8cc4-c3d816662bdf
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8593d28b-de78-4eae-8cc4-c3d816662bdf
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
Content-Length: 179

{"id":"acc_eb6bb76f-4cd5-43b2-b276-9c86d3f940dc","handle":"qa-d4f0c0e82aff","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.385410893Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30036545-f2e2-49a4-8141-8907e6ba372f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30036545-f2e2-49a4-8141-8907e6ba372f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30036545-f2e2-49a4-8141-8907e6ba372f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5590d444-d015-4dec-b031-e81500b12f33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5590d444-d015-4dec-b031-e81500b12f33
Content-Type: application/json

--- request body ---
{"handle":"qa-d4f0c0e82aff","password":"****"}

--- response: 401 in 47 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5590d444-d015-4dec-b031-e81500b12f33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5590d444-d015-4dec-b031-e81500b12f33"}
```
