# Transcript: A purchase without an Idempotency-Key is refused with 400

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#purchaseWithoutIdempotencyKeyIsA400` |
| Features | FEAT-IDEMP-03, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-1bd15853-41df-4d3d-941e-e812a5ef1797` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-e3f3fa4f-481f-494a-bccd-f9ca249c6109` |
| 3 | `POST /v1/credits/purchases` | 400 | 8 | `qa-833b1cc8-878d-4faa-9380-999cdfb6ce20` |
| 4 | `GET /v1/credits/balance` | 200 | 14 | `qa-fc325a15-d6b9-494f-beb5-b3c0df0626e5` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0d9ad825-b72c-4a08-af49-21d794fe3e04` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-cbe6c3d1-0963-4e0d-afd1-f81d89b9b439` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1bd15853-41df-4d3d-941e-e812a5ef1797

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bd15853-41df-4d3d-941e-e812a5ef1797
Content-Type: application/json

--- request body ---
{"handle":"qa-39d133de9e58","displayName":"QA 39d133de9e58","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bd15853-41df-4d3d-941e-e812a5ef1797
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
Location: /v1/accounts/qa-39d133de9e58
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c55a93e-413f-43a1-b3de-00d4c5ae75ae","handle":"qa-39d133de9e58","displayName":"QA 39d133de9e58","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.962034255Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e3f3fa4f-481f-494a-bccd-f9ca249c6109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3f3fa4f-481f-494a-bccd-f9ca249c6109
Content-Type: application/json

--- request body ---
{"handle":"qa-39d133de9e58","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3f3fa4f-481f-494a-bccd-f9ca249c6109
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c55a93e-413f-43a1-b3de-00d4c5ae75ae"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-833b1cc8-878d-4faa-9380-999cdfb6ce20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-833b1cc8-878d-4faa-9380-999cdfb6ce20
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-833b1cc8-878d-4faa-9380-999cdfb6ce20
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
Content-Length: 319

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-833b1cc8-878d-4faa-9380-999cdfb6ce20"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-fc325a15-d6b9-494f-beb5-b3c0df0626e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc325a15-d6b9-494f-beb5-b3c0df0626e5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc325a15-d6b9-494f-beb5-b3c0df0626e5
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
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_6c55a93e-413f-43a1-b3de-00d4c5ae75ae"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d9ad825-b72c-4a08-af49-21d794fe3e04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d9ad825-b72c-4a08-af49-21d794fe3e04
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d9ad825-b72c-4a08-af49-21d794fe3e04
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
correlation: qa-cbe6c3d1-0963-4e0d-afd1-f81d89b9b439

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbe6c3d1-0963-4e0d-afd1-f81d89b9b439
Content-Type: application/json

--- request body ---
{"handle":"qa-39d133de9e58","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbe6c3d1-0963-4e0d-afd1-f81d89b9b439
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbe6c3d1-0963-4e0d-afd1-f81d89b9b439"}
```
