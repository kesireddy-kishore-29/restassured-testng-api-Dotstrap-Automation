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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-b7770db6-5ad3-43ef-a616-96074e0a1cf4` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-50bbf0e6-8039-4b3d-ba40-53835c081935` |
| 3 | `GET /v1/accounts/me` | 503 | 7 | `qa-338b301b-23b9-45f3-b8e7-8fc5857ea8e8` |
| 4 | `GET /v1/accounts/me` | 200 | 7 | `qa-c48ae6b0-a3ad-4396-8476-76e8281e81d0` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-408de1ed-4c32-4c2b-80ec-9c9cc151c5d8` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-201d4130-2b68-4fdf-8aba-69d412a5e08c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b7770db6-5ad3-43ef-a616-96074e0a1cf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7770db6-5ad3-43ef-a616-96074e0a1cf4
Content-Type: application/json

--- request body ---
{"handle":"qa-230682efa0a1","displayName":"QA 230682efa0a1","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7770db6-5ad3-43ef-a616-96074e0a1cf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-230682efa0a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8646026c-04cf-4230-af9a-4ebd7f2a1a22","handle":"qa-230682efa0a1","displayName":"QA 230682efa0a1","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.283424788Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-50bbf0e6-8039-4b3d-ba40-53835c081935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50bbf0e6-8039-4b3d-ba40-53835c081935
Content-Type: application/json

--- request body ---
{"handle":"qa-230682efa0a1","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-50bbf0e6-8039-4b3d-ba40-53835c081935
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8646026c-04cf-4230-af9a-4ebd7f2a1a22"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-338b301b-23b9-45f3-b8e7-8fc5857ea8e8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 2d9939fa-cceb-4c9c-9bd2-1df318dcb1ff
X-Correlation-Id: qa-338b301b-23b9-45f3-b8e7-8fc5857ea8e8
Content-Type: application/json

--- response: 503 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-338b301b-23b9-45f3-b8e7-8fc5857ea8e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-338b301b-23b9-45f3-b8e7-8fc5857ea8e8"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-c48ae6b0-a3ad-4396-8476-76e8281e81d0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 2d9939fa-cceb-4c9c-9bd2-1df318dcb1ff
X-Correlation-Id: qa-c48ae6b0-a3ad-4396-8476-76e8281e81d0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-c48ae6b0-a3ad-4396-8476-76e8281e81d0
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

{"id":"acc_8646026c-04cf-4230-af9a-4ebd7f2a1a22","handle":"qa-230682efa0a1","displayName":"QA 230682efa0a1","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.283424788Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-408de1ed-4c32-4c2b-80ec-9c9cc151c5d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-408de1ed-4c32-4c2b-80ec-9c9cc151c5d8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-408de1ed-4c32-4c2b-80ec-9c9cc151c5d8
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
correlation: qa-201d4130-2b68-4fdf-8aba-69d412a5e08c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-201d4130-2b68-4fdf-8aba-69d412a5e08c
Content-Type: application/json

--- request body ---
{"handle":"qa-230682efa0a1","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-201d4130-2b68-4fdf-8aba-69d412a5e08c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-201d4130-2b68-4fdf-8aba-69d412a5e08c"}
```
