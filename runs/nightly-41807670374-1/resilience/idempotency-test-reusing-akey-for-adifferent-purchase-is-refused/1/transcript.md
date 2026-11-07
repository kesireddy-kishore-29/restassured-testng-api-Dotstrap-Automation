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
| 1 | `POST /v1/accounts` | 201 | 380 | `qa-0480cddf-31bf-4965-bbc2-ca81faf85899` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-c5a1d600-440c-47bf-b76e-53303dce10e4` |
| 3 | `POST /v1/credits/purchases` | 201 | 33 | `qa-f90bfd5a-db18-4b06-85ca-be3e097eec3f` |
| 4 | `POST /v1/credits/purchases` | 409 | 41 | `qa-9fc72ef7-37ce-4bd3-86a5-65168f09111b` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-8b5bf7dd-00bd-41b1-a274-7cedba232a83` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-19ca809d-f5c6-439a-b79d-304d3db7c267` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-9f5ef5a5-d803-4446-8ae1-380e205f4509` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0480cddf-31bf-4965-bbc2-ca81faf85899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0480cddf-31bf-4965-bbc2-ca81faf85899
Content-Type: application/json

--- request body ---
{"handle":"qa-6e063a4ee4bc","displayName":"QA 6e063a4ee4bc","password":"****","region":"eu"}

--- response: 201 in 380 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0480cddf-31bf-4965-bbc2-ca81faf85899
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-6e063a4ee4bc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04d741d5-c280-4a48-856e-e9cbe8cfb5aa","handle":"qa-6e063a4ee4bc","displayName":"QA 6e063a4ee4bc","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.324793357Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c5a1d600-440c-47bf-b76e-53303dce10e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5a1d600-440c-47bf-b76e-53303dce10e4
Content-Type: application/json

--- request body ---
{"handle":"qa-6e063a4ee4bc","password":"****"}

--- response: 200 in 55 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5a1d600-440c-47bf-b76e-53303dce10e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04d741d5-c280-4a48-856e-e9cbe8cfb5aa"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f90bfd5a-db18-4b06-85ca-be3e097eec3f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ff607e0d25874f58a80bcba1e921c1fb
X-Correlation-Id: qa-f90bfd5a-db18-4b06-85ca-be3e097eec3f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 33 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f90bfd5a-db18-4b06-85ca-be3e097eec3f
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
Location: /v1/credits/purchases/pur_40586141-559f-458d-97b7-2a5e81ad6e86
Content-Length: 144

{"id":"pur_40586141-559f-458d-97b7-2a5e81ad6e86","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.778663321Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9fc72ef7-37ce-4bd3-86a5-65168f09111b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ff607e0d25874f58a80bcba1e921c1fb
X-Correlation-Id: qa-9fc72ef7-37ce-4bd3-86a5-65168f09111b
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 41 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fc72ef7-37ce-4bd3-86a5-65168f09111b
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-9fc72ef7-37ce-4bd3-86a5-65168f09111b"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-8b5bf7dd-00bd-41b1-a274-7cedba232a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b5bf7dd-00bd-41b1-a274-7cedba232a83
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b5bf7dd-00bd-41b1-a274-7cedba232a83
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

{"balance":15,"currency":"credits","accountId":"acc_04d741d5-c280-4a48-856e-e9cbe8cfb5aa"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19ca809d-f5c6-439a-b79d-304d3db7c267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19ca809d-f5c6-439a-b79d-304d3db7c267
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19ca809d-f5c6-439a-b79d-304d3db7c267
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
correlation: qa-9f5ef5a5-d803-4446-8ae1-380e205f4509

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f5ef5a5-d803-4446-8ae1-380e205f4509
Content-Type: application/json

--- request body ---
{"handle":"qa-6e063a4ee4bc","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f5ef5a5-d803-4446-8ae1-380e205f4509
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f5ef5a5-d803-4446-8ae1-380e205f4509"}
```
