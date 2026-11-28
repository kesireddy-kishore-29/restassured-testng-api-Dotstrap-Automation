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
| 1 | `POST /v1/accounts` | 201 | 455 | `qa-4430fff8-fdca-4d41-bfa7-f4c8db81a68a` |
| 2 | `POST /v1/auth/token` | 200 | 88 | `qa-e39d418f-9615-43c8-88aa-8728cd0bebcc` |
| 3 | `POST /v1/credits/purchases` | 201 | 54 | `qa-217f3af0-814d-4bf1-b174-8123f1c49a6d` |
| 4 | `POST /v1/credits/purchases` | 409 | 57 | `qa-c17477e8-46c5-4d3c-8b59-3ce49dd7a5d6` |
| 5 | `GET /v1/credits/balance` | 200 | 11 | `qa-4100b6c2-51ac-41f0-8f0a-7ec4628c6494` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-512821d5-8a8a-4ee5-968e-d6faf9218f31` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-f58cfe16-13ce-454d-9a1d-d9f66d1b89ca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4430fff8-fdca-4d41-bfa7-f4c8db81a68a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4430fff8-fdca-4d41-bfa7-f4c8db81a68a
Content-Type: application/json

--- request body ---
{"handle":"qa-85a2395cc443","displayName":"QA 85a2395cc443","password":"****","region":"eu"}

--- response: 201 in 455 ms ---
Date: Sun, 22 Nov 2026 09:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4430fff8-fdca-4d41-bfa7-f4c8db81a68a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-85a2395cc443
X-Served-Region: eu
Content-Length: 181

{"id":"acc_98287570-ae54-4122-8347-06dc8f0cd076","handle":"qa-85a2395cc443","displayName":"QA 85a2395cc443","region":"eu","role":"user","createdAt":"2026-11-22T09:54:53.107366433Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e39d418f-9615-43c8-88aa-8728cd0bebcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e39d418f-9615-43c8-88aa-8728cd0bebcc
Content-Type: application/json

--- request body ---
{"handle":"qa-85a2395cc443","password":"****"}

--- response: 200 in 88 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e39d418f-9615-43c8-88aa-8728cd0bebcc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98287570-ae54-4122-8347-06dc8f0cd076"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-217f3af0-814d-4bf1-b174-8123f1c49a6d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-61de3627cfe34276b9da35e69b2d9858
X-Correlation-Id: qa-217f3af0-814d-4bf1-b174-8123f1c49a6d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-217f3af0-814d-4bf1-b174-8123f1c49a6d
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
Location: /v1/credits/purchases/pur_c3f925b4-8b84-430d-ad5f-70272f1b14a7
Content-Length: 144

{"id":"pur_c3f925b4-8b84-430d-ad5f-70272f1b14a7","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.692940062Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c17477e8-46c5-4d3c-8b59-3ce49dd7a5d6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-61de3627cfe34276b9da35e69b2d9858
X-Correlation-Id: qa-c17477e8-46c5-4d3c-8b59-3ce49dd7a5d6
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 57 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c17477e8-46c5-4d3c-8b59-3ce49dd7a5d6
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-c17477e8-46c5-4d3c-8b59-3ce49dd7a5d6"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-4100b6c2-51ac-41f0-8f0a-7ec4628c6494

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4100b6c2-51ac-41f0-8f0a-7ec4628c6494
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-4100b6c2-51ac-41f0-8f0a-7ec4628c6494
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

{"balance":15,"currency":"credits","accountId":"acc_98287570-ae54-4122-8347-06dc8f0cd076"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-512821d5-8a8a-4ee5-968e-d6faf9218f31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-512821d5-8a8a-4ee5-968e-d6faf9218f31
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-512821d5-8a8a-4ee5-968e-d6faf9218f31
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
correlation: qa-f58cfe16-13ce-454d-9a1d-d9f66d1b89ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f58cfe16-13ce-454d-9a1d-d9f66d1b89ca
Content-Type: application/json

--- request body ---
{"handle":"qa-85a2395cc443","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f58cfe16-13ce-454d-9a1d-d9f66d1b89ca
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f58cfe16-13ce-454d-9a1d-d9f66d1b89ca"}
```
