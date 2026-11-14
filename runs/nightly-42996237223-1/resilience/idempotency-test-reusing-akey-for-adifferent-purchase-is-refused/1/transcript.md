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
| 1 | `POST /v1/accounts` | 201 | 303 | `qa-8b959466-3462-4c7c-af7b-7ebe05dfd771` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-60d0345b-785f-441c-9e2a-ebf245c1263b` |
| 3 | `POST /v1/credits/purchases` | 201 | 35 | `qa-35c12f03-d6a8-434a-b164-52068fee37a2` |
| 4 | `POST /v1/credits/purchases` | 409 | 28 | `qa-ddd7efef-2290-46df-a2d2-5c0414f3ac2c` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-1554376b-cf6a-4693-bca5-ea5caf882209` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-dff96b70-f536-48c3-9567-80f5acd80c02` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-b394bb1f-352c-43d2-bbc5-f758f7416e17` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8b959466-3462-4c7c-af7b-7ebe05dfd771

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b959466-3462-4c7c-af7b-7ebe05dfd771
Content-Type: application/json

--- request body ---
{"handle":"qa-47e1a6b56611","displayName":"QA 47e1a6b56611","password":"****","region":"eu"}

--- response: 201 in 303 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b959466-3462-4c7c-af7b-7ebe05dfd771
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
Location: /v1/accounts/qa-47e1a6b56611
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b3b1eee-f8b1-4bb5-9194-5aabad80c77a","handle":"qa-47e1a6b56611","displayName":"QA 47e1a6b56611","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.471974481Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-60d0345b-785f-441c-9e2a-ebf245c1263b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60d0345b-785f-441c-9e2a-ebf245c1263b
Content-Type: application/json

--- request body ---
{"handle":"qa-47e1a6b56611","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-60d0345b-785f-441c-9e2a-ebf245c1263b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b3b1eee-f8b1-4bb5-9194-5aabad80c77a"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-35c12f03-d6a8-434a-b164-52068fee37a2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4fe5631e82e14298814a21424eacde64
X-Correlation-Id: qa-35c12f03-d6a8-434a-b164-52068fee37a2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-35c12f03-d6a8-434a-b164-52068fee37a2
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
Location: /v1/credits/purchases/pur_df9e9053-85a6-4e37-9b8d-e189d1b7cdbe
Content-Length: 144

{"id":"pur_df9e9053-85a6-4e37-9b8d-e189d1b7cdbe","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.871440366Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ddd7efef-2290-46df-a2d2-5c0414f3ac2c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4fe5631e82e14298814a21424eacde64
X-Correlation-Id: qa-ddd7efef-2290-46df-a2d2-5c0414f3ac2c
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddd7efef-2290-46df-a2d2-5c0414f3ac2c
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-ddd7efef-2290-46df-a2d2-5c0414f3ac2c"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-1554376b-cf6a-4693-bca5-ea5caf882209

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1554376b-cf6a-4693-bca5-ea5caf882209
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1554376b-cf6a-4693-bca5-ea5caf882209
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

{"balance":15,"currency":"credits","accountId":"acc_6b3b1eee-f8b1-4bb5-9194-5aabad80c77a"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dff96b70-f536-48c3-9567-80f5acd80c02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dff96b70-f536-48c3-9567-80f5acd80c02
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dff96b70-f536-48c3-9567-80f5acd80c02
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
correlation: qa-b394bb1f-352c-43d2-bbc5-f758f7416e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b394bb1f-352c-43d2-bbc5-f758f7416e17
Content-Type: application/json

--- request body ---
{"handle":"qa-47e1a6b56611","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b394bb1f-352c-43d2-bbc5-f758f7416e17
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b394bb1f-352c-43d2-bbc5-f758f7416e17"}
```
