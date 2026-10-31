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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-01185b95-3aa1-41df-926b-f07d13e325da` |
| 2 | `POST /v1/auth/token` | 200 | 7 | `qa-8bed772c-1aca-4088-a841-1ee6947f5988` |
| 3 | `POST /v1/credits/purchases` | 201 | 4 | `qa-4056f8fa-9639-4c9f-add9-e7c274c9b1f6` |
| 4 | `POST /v1/credits/purchases` | 409 | 6 | `qa-5e91c5a9-267d-4df1-9432-7a5ee6e9a14e` |
| 5 | `GET /v1/credits/balance` | 200 | 4 | `qa-a2d042dd-c670-4f0d-a17f-148c2e34fa46` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-346e6def-a5dd-4594-9aff-268fb938a356` |
| 7 | `POST /v1/auth/token` | 401 | 4 | `qa-b4c8736c-8cfe-40a5-ab2e-b51dd2138bb7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01185b95-3aa1-41df-926b-f07d13e325da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01185b95-3aa1-41df-926b-f07d13e325da
Content-Type: application/json

--- request body ---
{"handle":"qa-0b035659b63a","displayName":"QA 0b035659b63a","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-01185b95-3aa1-41df-926b-f07d13e325da
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
Location: /v1/accounts/qa-0b035659b63a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b228e31-3bf1-40ab-a456-f80641e3a683","handle":"qa-0b035659b63a","displayName":"QA 0b035659b63a","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.089217076Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8bed772c-1aca-4088-a841-1ee6947f5988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bed772c-1aca-4088-a841-1ee6947f5988
Content-Type: application/json

--- request body ---
{"handle":"qa-0b035659b63a","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bed772c-1aca-4088-a841-1ee6947f5988
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b228e31-3bf1-40ab-a456-f80641e3a683"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4056f8fa-9639-4c9f-add9-e7c274c9b1f6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fb7a57d29aff4af3ac6ec51e8f45ad81
X-Correlation-Id: qa-4056f8fa-9639-4c9f-add9-e7c274c9b1f6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4056f8fa-9639-4c9f-add9-e7c274c9b1f6
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
Location: /v1/credits/purchases/pur_76b97ecb-d06d-47f2-b633-144dcd0d277d
Content-Length: 144

{"id":"pur_76b97ecb-d06d-47f2-b633-144dcd0d277d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:52.111956886Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5e91c5a9-267d-4df1-9432-7a5ee6e9a14e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fb7a57d29aff4af3ac6ec51e8f45ad81
X-Correlation-Id: qa-5e91c5a9-267d-4df1-9432-7a5ee6e9a14e
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e91c5a9-267d-4df1-9432-7a5ee6e9a14e
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-5e91c5a9-267d-4df1-9432-7a5ee6e9a14e"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-a2d042dd-c670-4f0d-a17f-148c2e34fa46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2d042dd-c670-4f0d-a17f-148c2e34fa46
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2d042dd-c670-4f0d-a17f-148c2e34fa46
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

{"balance":15,"currency":"credits","accountId":"acc_7b228e31-3bf1-40ab-a456-f80641e3a683"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-346e6def-a5dd-4594-9aff-268fb938a356

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-346e6def-a5dd-4594-9aff-268fb938a356
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-346e6def-a5dd-4594-9aff-268fb938a356
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
correlation: qa-b4c8736c-8cfe-40a5-ab2e-b51dd2138bb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4c8736c-8cfe-40a5-ab2e-b51dd2138bb7
Content-Type: application/json

--- request body ---
{"handle":"qa-0b035659b63a","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4c8736c-8cfe-40a5-ab2e-b51dd2138bb7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4c8736c-8cfe-40a5-ab2e-b51dd2138bb7"}
```
