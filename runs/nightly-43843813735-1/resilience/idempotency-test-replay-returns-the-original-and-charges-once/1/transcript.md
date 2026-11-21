# Transcript: Same key + same body replays the original purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 532 | `qa-a98b6f1a-0aa2-40f5-a116-052a0d3a7cf4` |
| 2 | `POST /v1/auth/token` | 200 | 73 | `qa-04da05d7-62d5-4ba0-8ee1-bfa0e07a83fa` |
| 3 | `POST /v1/credits/purchases` | 201 | 75 | `qa-34f68983-f1d6-44b5-af8c-7335faff2519` |
| 4 | `POST /v1/credits/purchases` | 200 | 42 | `qa-b6b0231f-192c-4bcb-82a0-a00eb996bdc0` |
| 5 | `GET /v1/credits/balance` | 200 | 49 | `qa-d9fee704-3b04-48f0-8c17-71a07c7f10d8` |
| 6 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-27cd7805-442d-4d18-9984-e1a46603bed7` |
| 7 | `POST /v1/auth/token` | 401 | 18 | `qa-778943e6-87a8-476c-b79a-258eb4370271` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a98b6f1a-0aa2-40f5-a116-052a0d3a7cf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a98b6f1a-0aa2-40f5-a116-052a0d3a7cf4
Content-Type: application/json

--- request body ---
{"handle":"qa-69464f57d217","displayName":"QA 69464f57d217","password":"****","region":"eu"}

--- response: 201 in 532 ms ---
Date: Mon, 16 Nov 2026 09:53:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a98b6f1a-0aa2-40f5-a116-052a0d3a7cf4
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
Location: /v1/accounts/qa-69464f57d217
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3845de1c-ef92-4ae3-9994-1657650617a3","handle":"qa-69464f57d217","displayName":"QA 69464f57d217","region":"eu","role":"user","createdAt":"2026-11-16T09:53:59.649610275Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-04da05d7-62d5-4ba0-8ee1-bfa0e07a83fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04da05d7-62d5-4ba0-8ee1-bfa0e07a83fa
Content-Type: application/json

--- request body ---
{"handle":"qa-69464f57d217","password":"****"}

--- response: 200 in 73 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-04da05d7-62d5-4ba0-8ee1-bfa0e07a83fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3845de1c-ef92-4ae3-9994-1657650617a3"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-34f68983-f1d6-44b5-af8c-7335faff2519

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dca33ff75ede4091922a6b30b8a43fe8
X-Correlation-Id: qa-34f68983-f1d6-44b5-af8c-7335faff2519
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 75 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-34f68983-f1d6-44b5-af8c-7335faff2519
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
Location: /v1/credits/purchases/pur_05f7625e-0346-4253-9d07-95502e615be9
Content-Length: 144

{"id":"pur_05f7625e-0346-4253-9d07-95502e615be9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.369204182Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b6b0231f-192c-4bcb-82a0-a00eb996bdc0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dca33ff75ede4091922a6b30b8a43fe8
X-Correlation-Id: qa-b6b0231f-192c-4bcb-82a0-a00eb996bdc0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 42 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6b0231f-192c-4bcb-82a0-a00eb996bdc0
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
Location: /v1/credits/purchases/pur_05f7625e-0346-4253-9d07-95502e615be9
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05f7625e-0346-4253-9d07-95502e615be9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.369204182Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-d9fee704-3b04-48f0-8c17-71a07c7f10d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9fee704-3b04-48f0-8c17-71a07c7f10d8
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9fee704-3b04-48f0-8c17-71a07c7f10d8
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
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_3845de1c-ef92-4ae3-9994-1657650617a3"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27cd7805-442d-4d18-9984-e1a46603bed7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27cd7805-442d-4d18-9984-e1a46603bed7
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27cd7805-442d-4d18-9984-e1a46603bed7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-778943e6-87a8-476c-b79a-258eb4370271

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-778943e6-87a8-476c-b79a-258eb4370271
Content-Type: application/json

--- request body ---
{"handle":"qa-69464f57d217","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-778943e6-87a8-476c-b79a-258eb4370271
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-778943e6-87a8-476c-b79a-258eb4370271"}
```
