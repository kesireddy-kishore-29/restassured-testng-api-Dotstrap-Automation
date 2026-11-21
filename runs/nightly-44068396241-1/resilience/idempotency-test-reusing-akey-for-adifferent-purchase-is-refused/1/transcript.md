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
| 1 | `POST /v1/accounts` | 201 | 458 | `qa-272d6307-b811-4e0a-b446-3366a00ed874` |
| 2 | `POST /v1/auth/token` | 200 | 75 | `qa-a7e4171a-6261-4fa8-845c-4f1a5ae7fb42` |
| 3 | `POST /v1/credits/purchases` | 201 | 58 | `qa-1a07e509-3ca2-4f73-9d00-0ee8bd3110d8` |
| 4 | `POST /v1/credits/purchases` | 409 | 31 | `qa-4043ae3f-0e7b-406e-8606-0611200d2816` |
| 5 | `GET /v1/credits/balance` | 200 | 9 | `qa-bcc9fe4d-24a0-40de-a59a-5eab31229db9` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-566c4361-ea63-4ea9-b486-1bdba8d456ab` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-1551bded-da46-424e-ac7d-973ce0fe20d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-272d6307-b811-4e0a-b446-3366a00ed874

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-272d6307-b811-4e0a-b446-3366a00ed874
Content-Type: application/json

--- request body ---
{"handle":"qa-f677b563049d","displayName":"QA f677b563049d","password":"****","region":"eu"}

--- response: 201 in 458 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-272d6307-b811-4e0a-b446-3366a00ed874
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
Location: /v1/accounts/qa-f677b563049d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_311c0b68-82e2-47a5-acda-ac7545fddeda","handle":"qa-f677b563049d","displayName":"QA f677b563049d","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.144460795Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a7e4171a-6261-4fa8-845c-4f1a5ae7fb42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7e4171a-6261-4fa8-845c-4f1a5ae7fb42
Content-Type: application/json

--- request body ---
{"handle":"qa-f677b563049d","password":"****"}

--- response: 200 in 75 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7e4171a-6261-4fa8-845c-4f1a5ae7fb42
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_311c0b68-82e2-47a5-acda-ac7545fddeda"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1a07e509-3ca2-4f73-9d00-0ee8bd3110d8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-02ff6fb19407412383b045b2d4ff129f
X-Correlation-Id: qa-1a07e509-3ca2-4f73-9d00-0ee8bd3110d8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a07e509-3ca2-4f73-9d00-0ee8bd3110d8
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
Location: /v1/credits/purchases/pur_f67cad8d-6a3f-4a75-bd88-68e44c6cf35a
Content-Length: 144

{"id":"pur_f67cad8d-6a3f-4a75-bd88-68e44c6cf35a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.673752813Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4043ae3f-0e7b-406e-8606-0611200d2816

--- request headers ---
Accept: application/json
Idempotency-Key: qa-02ff6fb19407412383b045b2d4ff129f
X-Correlation-Id: qa-4043ae3f-0e7b-406e-8606-0611200d2816
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4043ae3f-0e7b-406e-8606-0611200d2816
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-4043ae3f-0e7b-406e-8606-0611200d2816"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-bcc9fe4d-24a0-40de-a59a-5eab31229db9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcc9fe4d-24a0-40de-a59a-5eab31229db9
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcc9fe4d-24a0-40de-a59a-5eab31229db9
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

{"balance":15,"currency":"credits","accountId":"acc_311c0b68-82e2-47a5-acda-ac7545fddeda"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-566c4361-ea63-4ea9-b486-1bdba8d456ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-566c4361-ea63-4ea9-b486-1bdba8d456ab
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-566c4361-ea63-4ea9-b486-1bdba8d456ab
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
correlation: qa-1551bded-da46-424e-ac7d-973ce0fe20d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1551bded-da46-424e-ac7d-973ce0fe20d9
Content-Type: application/json

--- request body ---
{"handle":"qa-f677b563049d","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1551bded-da46-424e-ac7d-973ce0fe20d9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1551bded-da46-424e-ac7d-973ce0fe20d9"}
```
