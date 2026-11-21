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
| 1 | `POST /v1/accounts` | 201 | 375 | `qa-3eea31fb-0515-4456-9cfe-21c2378b6572` |
| 2 | `POST /v1/auth/token` | 200 | 67 | `qa-bb93855a-c390-4991-a90d-9a6373110441` |
| 3 | `POST /v1/credits/purchases` | 201 | 66 | `qa-4efb63c4-8ead-4960-be79-e1b9d529d882` |
| 4 | `POST /v1/credits/purchases` | 409 | 51 | `qa-b071f5d2-8432-4902-84cc-a6e5217e32a8` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-95dae616-1ff7-49d2-ace8-e835b3dedc81` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-496b7133-6185-417d-906f-e3fe7839d77c` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-117e267a-b9b8-4dd6-9d14-f4a5bc9ca5a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3eea31fb-0515-4456-9cfe-21c2378b6572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eea31fb-0515-4456-9cfe-21c2378b6572
Content-Type: application/json

--- request body ---
{"handle":"qa-1b8cbd670469","displayName":"QA 1b8cbd670469","password":"****","region":"eu"}

--- response: 201 in 375 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eea31fb-0515-4456-9cfe-21c2378b6572
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
Location: /v1/accounts/qa-1b8cbd670469
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1882d2a0-0c78-4870-81ef-62170a08faff","handle":"qa-1b8cbd670469","displayName":"QA 1b8cbd670469","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.457100706Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bb93855a-c390-4991-a90d-9a6373110441

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb93855a-c390-4991-a90d-9a6373110441
Content-Type: application/json

--- request body ---
{"handle":"qa-1b8cbd670469","password":"****"}

--- response: 200 in 67 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb93855a-c390-4991-a90d-9a6373110441
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1882d2a0-0c78-4870-81ef-62170a08faff"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4efb63c4-8ead-4960-be79-e1b9d529d882

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6f3f1848ae2d426391aa49503bca3a85
X-Correlation-Id: qa-4efb63c4-8ead-4960-be79-e1b9d529d882
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 66 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4efb63c4-8ead-4960-be79-e1b9d529d882
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
Location: /v1/credits/purchases/pur_44c374e5-509f-463b-bc83-8b51e9bcbc84
Content-Length: 144

{"id":"pur_44c374e5-509f-463b-bc83-8b51e9bcbc84","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.008289606Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b071f5d2-8432-4902-84cc-a6e5217e32a8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6f3f1848ae2d426391aa49503bca3a85
X-Correlation-Id: qa-b071f5d2-8432-4902-84cc-a6e5217e32a8
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 51 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b071f5d2-8432-4902-84cc-a6e5217e32a8
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-b071f5d2-8432-4902-84cc-a6e5217e32a8"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-95dae616-1ff7-49d2-ace8-e835b3dedc81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95dae616-1ff7-49d2-ace8-e835b3dedc81
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-95dae616-1ff7-49d2-ace8-e835b3dedc81
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

{"balance":15,"currency":"credits","accountId":"acc_1882d2a0-0c78-4870-81ef-62170a08faff"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-496b7133-6185-417d-906f-e3fe7839d77c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-496b7133-6185-417d-906f-e3fe7839d77c
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-496b7133-6185-417d-906f-e3fe7839d77c
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
correlation: qa-117e267a-b9b8-4dd6-9d14-f4a5bc9ca5a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-117e267a-b9b8-4dd6-9d14-f4a5bc9ca5a3
Content-Type: application/json

--- request body ---
{"handle":"qa-1b8cbd670469","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-117e267a-b9b8-4dd6-9d14-f4a5bc9ca5a3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-117e267a-b9b8-4dd6-9d14-f4a5bc9ca5a3"}
```
