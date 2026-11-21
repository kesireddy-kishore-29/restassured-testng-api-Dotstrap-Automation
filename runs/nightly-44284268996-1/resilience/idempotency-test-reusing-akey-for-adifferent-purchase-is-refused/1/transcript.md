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
| 1 | `POST /v1/accounts` | 201 | 290 | `qa-053a4fd6-ffd0-4897-9df5-0d3b29ad3d25` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-952bf35e-f78e-42ee-834b-90f80bdf8727` |
| 3 | `POST /v1/credits/purchases` | 201 | 43 | `qa-19f1df90-5a6d-4c8e-92d3-0b0dc88398c2` |
| 4 | `POST /v1/credits/purchases` | 409 | 34 | `qa-f2edd989-fe70-4c44-8c72-31aae26b717b` |
| 5 | `GET /v1/credits/balance` | 200 | 9 | `qa-ffe3c136-277d-4df9-a72a-4b7bb55a5605` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-00415d95-5307-42b4-97bb-6fda8f144861` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-1cde51bb-f5b8-4533-b270-738c861d9200` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-053a4fd6-ffd0-4897-9df5-0d3b29ad3d25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-053a4fd6-ffd0-4897-9df5-0d3b29ad3d25
Content-Type: application/json

--- request body ---
{"handle":"qa-86c1a3135f04","displayName":"QA 86c1a3135f04","password":"****","region":"eu"}

--- response: 201 in 290 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-053a4fd6-ffd0-4897-9df5-0d3b29ad3d25
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
Location: /v1/accounts/qa-86c1a3135f04
X-Served-Region: eu
Content-Length: 181

{"id":"acc_872c6ca4-7f43-4ad6-a359-44fea4c4f5ea","handle":"qa-86c1a3135f04","displayName":"QA 86c1a3135f04","region":"eu","role":"user","createdAt":"2026-11-18T10:19:37.681133282Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-952bf35e-f78e-42ee-834b-90f80bdf8727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-952bf35e-f78e-42ee-834b-90f80bdf8727
Content-Type: application/json

--- request body ---
{"handle":"qa-86c1a3135f04","password":"****"}

--- response: 200 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-952bf35e-f78e-42ee-834b-90f80bdf8727
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_872c6ca4-7f43-4ad6-a359-44fea4c4f5ea"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-19f1df90-5a6d-4c8e-92d3-0b0dc88398c2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7af3114d069c43ff8f552f91733caec5
X-Correlation-Id: qa-19f1df90-5a6d-4c8e-92d3-0b0dc88398c2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 43 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-19f1df90-5a6d-4c8e-92d3-0b0dc88398c2
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
Location: /v1/credits/purchases/pur_d6ba0376-f0f3-46f8-a6ca-b52268d220d4
Content-Length: 144

{"id":"pur_d6ba0376-f0f3-46f8-a6ca-b52268d220d4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.064594922Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f2edd989-fe70-4c44-8c72-31aae26b717b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7af3114d069c43ff8f552f91733caec5
X-Correlation-Id: qa-f2edd989-fe70-4c44-8c72-31aae26b717b
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2edd989-fe70-4c44-8c72-31aae26b717b
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-f2edd989-fe70-4c44-8c72-31aae26b717b"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-ffe3c136-277d-4df9-a72a-4b7bb55a5605

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffe3c136-277d-4df9-a72a-4b7bb55a5605
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffe3c136-277d-4df9-a72a-4b7bb55a5605
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

{"balance":15,"currency":"credits","accountId":"acc_872c6ca4-7f43-4ad6-a359-44fea4c4f5ea"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00415d95-5307-42b4-97bb-6fda8f144861

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00415d95-5307-42b4-97bb-6fda8f144861
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00415d95-5307-42b4-97bb-6fda8f144861
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
correlation: qa-1cde51bb-f5b8-4533-b270-738c861d9200

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cde51bb-f5b8-4533-b270-738c861d9200
Content-Type: application/json

--- request body ---
{"handle":"qa-86c1a3135f04","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1cde51bb-f5b8-4533-b270-738c861d9200
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1cde51bb-f5b8-4533-b270-738c861d9200"}
```
