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
| 1 | `POST /v1/accounts` | 201 | 524 | `qa-f6e089df-4248-48d3-9acc-5d2245d4a084` |
| 2 | `POST /v1/auth/token` | 200 | 80 | `qa-9ff938ce-cb09-48a8-813e-375233feb556` |
| 3 | `POST /v1/credits/purchases` | 201 | 48 | `qa-afd2521b-b6d3-4cd0-8652-49dd91b09540` |
| 4 | `POST /v1/credits/purchases` | 409 | 38 | `qa-e1dc49a2-7f07-4621-8ad9-692c46f35069` |
| 5 | `GET /v1/credits/balance` | 200 | 9 | `qa-4c1c6308-357a-446a-a7b0-fe14fe89b862` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-65208667-2765-4d58-8309-ff0e51da9674` |
| 7 | `POST /v1/auth/token` | 401 | 9 | `qa-8ff73e14-af09-415c-a6e4-ef8f8bbc4926` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6e089df-4248-48d3-9acc-5d2245d4a084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6e089df-4248-48d3-9acc-5d2245d4a084
Content-Type: application/json

--- request body ---
{"handle":"qa-168f8f96f0ec","displayName":"QA 168f8f96f0ec","password":"****","region":"eu"}

--- response: 201 in 524 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6e089df-4248-48d3-9acc-5d2245d4a084
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
Location: /v1/accounts/qa-168f8f96f0ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3c19ec49-4c48-4ed3-982e-83bfbecd22c1","handle":"qa-168f8f96f0ec","displayName":"QA 168f8f96f0ec","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.814455406Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9ff938ce-cb09-48a8-813e-375233feb556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ff938ce-cb09-48a8-813e-375233feb556
Content-Type: application/json

--- request body ---
{"handle":"qa-168f8f96f0ec","password":"****"}

--- response: 200 in 80 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ff938ce-cb09-48a8-813e-375233feb556
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3c19ec49-4c48-4ed3-982e-83bfbecd22c1"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-afd2521b-b6d3-4cd0-8652-49dd91b09540

--- request headers ---
Accept: application/json
Idempotency-Key: qa-557a5f6f07b847c1acb18b1f6a76db1a
X-Correlation-Id: qa-afd2521b-b6d3-4cd0-8652-49dd91b09540
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-afd2521b-b6d3-4cd0-8652-49dd91b09540
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
Location: /v1/credits/purchases/pur_8666ef0d-ae17-41f0-8849-295ee5982e83
Content-Length: 144

{"id":"pur_8666ef0d-ae17-41f0-8849-295ee5982e83","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.325901914Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e1dc49a2-7f07-4621-8ad9-692c46f35069

--- request headers ---
Accept: application/json
Idempotency-Key: qa-557a5f6f07b847c1acb18b1f6a76db1a
X-Correlation-Id: qa-e1dc49a2-7f07-4621-8ad9-692c46f35069
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 38 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1dc49a2-7f07-4621-8ad9-692c46f35069
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-e1dc49a2-7f07-4621-8ad9-692c46f35069"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-4c1c6308-357a-446a-a7b0-fe14fe89b862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c1c6308-357a-446a-a7b0-fe14fe89b862
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c1c6308-357a-446a-a7b0-fe14fe89b862
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_3c19ec49-4c48-4ed3-982e-83bfbecd22c1"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65208667-2765-4d58-8309-ff0e51da9674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65208667-2765-4d58-8309-ff0e51da9674
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65208667-2765-4d58-8309-ff0e51da9674
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 9
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-8ff73e14-af09-415c-a6e4-ef8f8bbc4926

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ff73e14-af09-415c-a6e4-ef8f8bbc4926
Content-Type: application/json

--- request body ---
{"handle":"qa-168f8f96f0ec","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ff73e14-af09-415c-a6e4-ef8f8bbc4926
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ff73e14-af09-415c-a6e4-ef8f8bbc4926"}
```
