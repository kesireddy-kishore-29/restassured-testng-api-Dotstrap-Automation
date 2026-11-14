# Transcript: Same key + different body is a 409 and charges nothing

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#reusingAKeyForADifferentPurchaseIsRefused` |
| Features | FEAT-IDEMP-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 274 | `qa-335c3082-97f0-4eb8-877f-a940b07d8a19` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-cf040967-8a0d-49f8-b854-64008be8c922` |
| 3 | `POST /v1/credits/purchases` | 201 | 28 | `qa-d37c072b-ba92-4f8c-951d-50afdd7c4dac` |
| 4 | `POST /v1/credits/purchases` | 409 | 28 | `qa-0246a938-f082-4b1c-8760-66d5d939fe54` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-94de751f-d842-4e65-9ec9-1c4fa77cd6b5` |
| 6 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-7fd4113b-3410-469e-8d64-ceb2cb4b7834` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-acd86685-7bcf-4c88-bae4-4a9828e4e6e8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-335c3082-97f0-4eb8-877f-a940b07d8a19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-335c3082-97f0-4eb8-877f-a940b07d8a19
Content-Type: application/json

--- request body ---
{"handle":"qa-f08785e3ff7a","displayName":"QA f08785e3ff7a","password":"****","region":"eu"}

--- response: 201 in 274 ms ---
Date: Tue, 10 Nov 2026 09:59:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-335c3082-97f0-4eb8-877f-a940b07d8a19
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
Location: /v1/accounts/qa-f08785e3ff7a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3da5a789-8978-46d7-9e13-4d98dca8ab30","handle":"qa-f08785e3ff7a","displayName":"QA f08785e3ff7a","region":"eu","role":"user","createdAt":"2026-11-10T09:59:27.972611056Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cf040967-8a0d-49f8-b854-64008be8c922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf040967-8a0d-49f8-b854-64008be8c922
Content-Type: application/json

--- request body ---
{"handle":"qa-f08785e3ff7a","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf040967-8a0d-49f8-b854-64008be8c922
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3da5a789-8978-46d7-9e13-4d98dca8ab30"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d37c072b-ba92-4f8c-951d-50afdd7c4dac

--- request headers ---
Accept: application/json
Idempotency-Key: qa-160dda9e81e24337b1c2bf718436245d
X-Correlation-Id: qa-d37c072b-ba92-4f8c-951d-50afdd7c4dac
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-d37c072b-ba92-4f8c-951d-50afdd7c4dac
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
Location: /v1/credits/purchases/pur_c8bdf050-6e5c-4f8e-96f0-20e70065347f
Content-Length: 144

{"id":"pur_c8bdf050-6e5c-4f8e-96f0-20e70065347f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.360762664Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0246a938-f082-4b1c-8760-66d5d939fe54

--- request headers ---
Accept: application/json
Idempotency-Key: qa-160dda9e81e24337b1c2bf718436245d
X-Correlation-Id: qa-0246a938-f082-4b1c-8760-66d5d939fe54
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0246a938-f082-4b1c-8760-66d5d939fe54
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
Content-Length: 334

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-0246a938-f082-4b1c-8760-66d5d939fe54"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-94de751f-d842-4e65-9ec9-1c4fa77cd6b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94de751f-d842-4e65-9ec9-1c4fa77cd6b5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-94de751f-d842-4e65-9ec9-1c4fa77cd6b5
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

{"balance":15,"currency":"credits","accountId":"acc_3da5a789-8978-46d7-9e13-4d98dca8ab30"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7fd4113b-3410-469e-8d64-ceb2cb4b7834

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fd4113b-3410-469e-8d64-ceb2cb4b7834
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7fd4113b-3410-469e-8d64-ceb2cb4b7834
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
correlation: qa-acd86685-7bcf-4c88-bae4-4a9828e4e6e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acd86685-7bcf-4c88-bae4-4a9828e4e6e8
Content-Type: application/json

--- request body ---
{"handle":"qa-f08785e3ff7a","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acd86685-7bcf-4c88-bae4-4a9828e4e6e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-acd86685-7bcf-4c88-bae4-4a9828e4e6e8"}
```
