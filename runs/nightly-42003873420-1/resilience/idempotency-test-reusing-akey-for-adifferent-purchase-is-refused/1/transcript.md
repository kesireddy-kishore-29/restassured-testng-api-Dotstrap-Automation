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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-fa2e4314-e6f5-431e-9263-085b7f124e7f` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-c14917fa-a570-4997-b13a-12e610c5410b` |
| 3 | `POST /v1/credits/purchases` | 201 | 5 | `qa-9d9dc96e-aad7-499f-9da6-20d6189ca8c8` |
| 4 | `POST /v1/credits/purchases` | 409 | 6 | `qa-68bae35f-307a-4f09-9f49-120595af4936` |
| 5 | `GET /v1/credits/balance` | 200 | 5 | `qa-d6560aca-30e8-4034-9d20-66583efcaf51` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-767736e5-d28e-464a-a509-676825ac4cc5` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-a5c8ca8b-e608-4b9f-9e8c-6e1abb14870a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fa2e4314-e6f5-431e-9263-085b7f124e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa2e4314-e6f5-431e-9263-085b7f124e7f
Content-Type: application/json

--- request body ---
{"handle":"qa-d0bde8514986","displayName":"QA d0bde8514986","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa2e4314-e6f5-431e-9263-085b7f124e7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-d0bde8514986
X-Served-Region: eu
Content-Length: 181

{"id":"acc_32182a18-c1a3-40a1-8e4e-69d0aca4bd6a","handle":"qa-d0bde8514986","displayName":"QA d0bde8514986","region":"eu","role":"user","createdAt":"2026-11-05T09:37:43.478776640Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c14917fa-a570-4997-b13a-12e610c5410b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c14917fa-a570-4997-b13a-12e610c5410b
Content-Type: application/json

--- request body ---
{"handle":"qa-d0bde8514986","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c14917fa-a570-4997-b13a-12e610c5410b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_32182a18-c1a3-40a1-8e4e-69d0aca4bd6a"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9d9dc96e-aad7-499f-9da6-20d6189ca8c8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-16e48e9d74a74a11adcd0ec8763e030c
X-Correlation-Id: qa-9d9dc96e-aad7-499f-9da6-20d6189ca8c8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d9dc96e-aad7-499f-9da6-20d6189ca8c8
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
Location: /v1/credits/purchases/pur_7265e340-a2b4-4c73-bfc6-2dac6485f3c3
Content-Length: 144

{"id":"pur_7265e340-a2b4-4c73-bfc6-2dac6485f3c3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.506814465Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-68bae35f-307a-4f09-9f49-120595af4936

--- request headers ---
Accept: application/json
Idempotency-Key: qa-16e48e9d74a74a11adcd0ec8763e030c
X-Correlation-Id: qa-68bae35f-307a-4f09-9f49-120595af4936
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68bae35f-307a-4f09-9f49-120595af4936
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-68bae35f-307a-4f09-9f49-120595af4936"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-d6560aca-30e8-4034-9d20-66583efcaf51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6560aca-30e8-4034-9d20-66583efcaf51
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6560aca-30e8-4034-9d20-66583efcaf51
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

{"balance":15,"currency":"credits","accountId":"acc_32182a18-c1a3-40a1-8e4e-69d0aca4bd6a"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-767736e5-d28e-464a-a509-676825ac4cc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-767736e5-d28e-464a-a509-676825ac4cc5
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-767736e5-d28e-464a-a509-676825ac4cc5
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
correlation: qa-a5c8ca8b-e608-4b9f-9e8c-6e1abb14870a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5c8ca8b-e608-4b9f-9e8c-6e1abb14870a
Content-Type: application/json

--- request body ---
{"handle":"qa-d0bde8514986","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5c8ca8b-e608-4b9f-9e8c-6e1abb14870a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5c8ca8b-e608-4b9f-9e8c-6e1abb14870a"}
```
