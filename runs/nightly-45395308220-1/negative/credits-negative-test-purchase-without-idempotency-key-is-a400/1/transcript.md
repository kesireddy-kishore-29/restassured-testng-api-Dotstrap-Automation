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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-49f0f7a1-8f03-47bc-bda6-5e137b8982b0` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-f8306649-7404-44b7-9294-f658a4cbe78c` |
| 3 | `POST /v1/credits/purchases` | 400 | 14 | `qa-3e20ea99-5a8b-4e89-9189-612a80a2d83c` |
| 4 | `GET /v1/credits/balance` | 200 | 12 | `qa-76b7fb67-c024-4936-a985-a21841bbb460` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-8f1e65fb-f6f4-41f9-912e-1d5eb23e712c` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-fb95e077-2d00-4070-8665-4cc4a6802d57` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49f0f7a1-8f03-47bc-bda6-5e137b8982b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49f0f7a1-8f03-47bc-bda6-5e137b8982b0
Content-Type: application/json

--- request body ---
{"handle":"qa-2622067a881d","displayName":"QA 2622067a881d","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-49f0f7a1-8f03-47bc-bda6-5e137b8982b0
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
Location: /v1/accounts/qa-2622067a881d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_feee8031-0493-4edc-9285-83aafe7cfbf3","handle":"qa-2622067a881d","displayName":"QA 2622067a881d","region":"eu","role":"user","createdAt":"2026-11-24T12:38:00.672204270Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f8306649-7404-44b7-9294-f658a4cbe78c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8306649-7404-44b7-9294-f658a4cbe78c
Content-Type: application/json

--- request body ---
{"handle":"qa-2622067a881d","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8306649-7404-44b7-9294-f658a4cbe78c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_feee8031-0493-4edc-9285-83aafe7cfbf3"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3e20ea99-5a8b-4e89-9189-612a80a2d83c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e20ea99-5a8b-4e89-9189-612a80a2d83c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e20ea99-5a8b-4e89-9189-612a80a2d83c
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-3e20ea99-5a8b-4e89-9189-612a80a2d83c"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-76b7fb67-c024-4936-a985-a21841bbb460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76b7fb67-c024-4936-a985-a21841bbb460
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-76b7fb67-c024-4936-a985-a21841bbb460
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

{"balance":5,"currency":"credits","accountId":"acc_feee8031-0493-4edc-9285-83aafe7cfbf3"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f1e65fb-f6f4-41f9-912e-1d5eb23e712c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f1e65fb-f6f4-41f9-912e-1d5eb23e712c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f1e65fb-f6f4-41f9-912e-1d5eb23e712c
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
correlation: qa-fb95e077-2d00-4070-8665-4cc4a6802d57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb95e077-2d00-4070-8665-4cc4a6802d57
Content-Type: application/json

--- request body ---
{"handle":"qa-2622067a881d","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb95e077-2d00-4070-8665-4cc4a6802d57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb95e077-2d00-4070-8665-4cc4a6802d57"}
```
