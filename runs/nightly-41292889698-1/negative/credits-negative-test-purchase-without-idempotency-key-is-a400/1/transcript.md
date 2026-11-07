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
| 1 | `POST /v1/accounts` | 201 | 301 | `qa-a0254680-d17c-4d58-81aa-d0a3ffdc337b` |
| 2 | `POST /v1/auth/token` | 200 | 53 | `qa-04498a0f-c698-4550-be10-587f6d311cd8` |
| 3 | `POST /v1/credits/purchases` | 400 | 15 | `qa-94a8060b-1800-43b7-9c38-1ce86e1a5a91` |
| 4 | `GET /v1/credits/balance` | 200 | 15 | `qa-e60abf27-f777-4150-8569-4add2fe411cb` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c0b26380-3d01-4be1-8d04-9d4da2b659db` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-1d4f18a1-aca2-42c0-8797-d0134ba30968` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a0254680-d17c-4d58-81aa-d0a3ffdc337b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0254680-d17c-4d58-81aa-d0a3ffdc337b
Content-Type: application/json

--- request body ---
{"handle":"qa-d36da032b3f0","displayName":"QA d36da032b3f0","password":"****","region":"eu"}

--- response: 201 in 301 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0254680-d17c-4d58-81aa-d0a3ffdc337b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-d36da032b3f0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dbc8997f-f9ce-4ea7-97a1-eb6fadb8e74c","handle":"qa-d36da032b3f0","displayName":"QA d36da032b3f0","region":"eu","role":"user","createdAt":"2026-11-01T09:23:21.373824149Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-04498a0f-c698-4550-be10-587f6d311cd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04498a0f-c698-4550-be10-587f6d311cd8
Content-Type: application/json

--- request body ---
{"handle":"qa-d36da032b3f0","password":"****"}

--- response: 200 in 53 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-04498a0f-c698-4550-be10-587f6d311cd8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbc8997f-f9ce-4ea7-97a1-eb6fadb8e74c"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-94a8060b-1800-43b7-9c38-1ce86e1a5a91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94a8060b-1800-43b7-9c38-1ce86e1a5a91
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94a8060b-1800-43b7-9c38-1ce86e1a5a91
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-94a8060b-1800-43b7-9c38-1ce86e1a5a91"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-e60abf27-f777-4150-8569-4add2fe411cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e60abf27-f777-4150-8569-4add2fe411cb
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e60abf27-f777-4150-8569-4add2fe411cb
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

{"balance":5,"currency":"credits","accountId":"acc_dbc8997f-f9ce-4ea7-97a1-eb6fadb8e74c"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c0b26380-3d01-4be1-8d04-9d4da2b659db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0b26380-3d01-4be1-8d04-9d4da2b659db
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c0b26380-3d01-4be1-8d04-9d4da2b659db
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
correlation: qa-1d4f18a1-aca2-42c0-8797-d0134ba30968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d4f18a1-aca2-42c0-8797-d0134ba30968
Content-Type: application/json

--- request body ---
{"handle":"qa-d36da032b3f0","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d4f18a1-aca2-42c0-8797-d0134ba30968
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d4f18a1-aca2-42c0-8797-d0134ba30968"}
```
