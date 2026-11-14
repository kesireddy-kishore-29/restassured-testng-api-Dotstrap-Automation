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
| 1 | `POST /v1/accounts` | 201 | 418 | `qa-68cddca7-3dc0-4ff8-b0e9-665fbaca00ad` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-4d0b2ab2-9cdb-4b6a-8e1e-a3c297ed4d73` |
| 3 | `POST /v1/credits/purchases` | 201 | 78 | `qa-0b67dfc2-033f-4a71-86d2-baaabd158e69` |
| 4 | `POST /v1/credits/purchases` | 409 | 46 | `qa-604404ef-bc13-47ab-b1b3-29592c7b8a06` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-cd7786ce-3fdb-4aff-99d6-ebeee08193d1` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-0e067aae-c44e-4ee4-aab4-f8aaeddefa35` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-019f660a-1ca9-4be1-95eb-68ca8fef5800` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-68cddca7-3dc0-4ff8-b0e9-665fbaca00ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68cddca7-3dc0-4ff8-b0e9-665fbaca00ad
Content-Type: application/json

--- request body ---
{"handle":"qa-3797a6a30abb","displayName":"QA 3797a6a30abb","password":"****","region":"eu"}

--- response: 201 in 418 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-68cddca7-3dc0-4ff8-b0e9-665fbaca00ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-3797a6a30abb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e3e9f208-f1fd-43e1-b9b7-434f72547349","handle":"qa-3797a6a30abb","displayName":"QA 3797a6a30abb","region":"eu","role":"user","createdAt":"2026-11-08T09:09:11.438714173Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4d0b2ab2-9cdb-4b6a-8e1e-a3c297ed4d73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d0b2ab2-9cdb-4b6a-8e1e-a3c297ed4d73
Content-Type: application/json

--- request body ---
{"handle":"qa-3797a6a30abb","password":"****"}

--- response: 200 in 81 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d0b2ab2-9cdb-4b6a-8e1e-a3c297ed4d73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3e9f208-f1fd-43e1-b9b7-434f72547349"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0b67dfc2-033f-4a71-86d2-baaabd158e69

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fb4a158fb7a846daadb338b85a8b6447
X-Correlation-Id: qa-0b67dfc2-033f-4a71-86d2-baaabd158e69
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b67dfc2-033f-4a71-86d2-baaabd158e69
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
Location: /v1/credits/purchases/pur_a706fa8a-de6e-445f-9ebc-69c99fd53ab9
Content-Length: 144

{"id":"pur_a706fa8a-de6e-445f-9ebc-69c99fd53ab9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.161708224Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-604404ef-bc13-47ab-b1b3-29592c7b8a06

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fb4a158fb7a846daadb338b85a8b6447
X-Correlation-Id: qa-604404ef-bc13-47ab-b1b3-29592c7b8a06
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 46 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-604404ef-bc13-47ab-b1b3-29592c7b8a06
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-604404ef-bc13-47ab-b1b3-29592c7b8a06"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-cd7786ce-3fdb-4aff-99d6-ebeee08193d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd7786ce-3fdb-4aff-99d6-ebeee08193d1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd7786ce-3fdb-4aff-99d6-ebeee08193d1
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

{"balance":15,"currency":"credits","accountId":"acc_e3e9f208-f1fd-43e1-b9b7-434f72547349"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e067aae-c44e-4ee4-aab4-f8aaeddefa35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e067aae-c44e-4ee4-aab4-f8aaeddefa35
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e067aae-c44e-4ee4-aab4-f8aaeddefa35
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
correlation: qa-019f660a-1ca9-4be1-95eb-68ca8fef5800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-019f660a-1ca9-4be1-95eb-68ca8fef5800
Content-Type: application/json

--- request body ---
{"handle":"qa-3797a6a30abb","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-019f660a-1ca9-4be1-95eb-68ca8fef5800
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-019f660a-1ca9-4be1-95eb-68ca8fef5800"}
```
