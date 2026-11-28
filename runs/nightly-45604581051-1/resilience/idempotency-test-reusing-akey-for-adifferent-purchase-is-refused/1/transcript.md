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
| 1 | `POST /v1/accounts` | 201 | 434 | `qa-c47b75c0-68e3-44d2-ad1b-78d8d9498442` |
| 2 | `POST /v1/auth/token` | 200 | 89 | `qa-ba32e00a-b1e0-43be-9b2a-d519ecf82511` |
| 3 | `POST /v1/credits/purchases` | 201 | 52 | `qa-f2a42977-2dfb-489e-a067-189b161b3cd9` |
| 4 | `POST /v1/credits/purchases` | 409 | 38 | `qa-41be7bdd-5dc3-40ba-b0c6-7c37ad6dd223` |
| 5 | `GET /v1/credits/balance` | 200 | 12 | `qa-ef885699-d570-4a7f-a6fb-889129681f67` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-2e8545c8-af32-4108-9c0d-5d880254c9bb` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-cd6beb31-269b-45f8-a5a5-5fd248e5d52d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c47b75c0-68e3-44d2-ad1b-78d8d9498442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c47b75c0-68e3-44d2-ad1b-78d8d9498442
Content-Type: application/json

--- request body ---
{"handle":"qa-5798f91112a1","displayName":"QA 5798f91112a1","password":"****","region":"eu"}

--- response: 201 in 434 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c47b75c0-68e3-44d2-ad1b-78d8d9498442
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
Location: /v1/accounts/qa-5798f91112a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7379d8b3-e63e-4003-8bb8-1493b25e2251","handle":"qa-5798f91112a1","displayName":"QA 5798f91112a1","region":"eu","role":"user","createdAt":"2026-11-25T11:27:49.237142136Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ba32e00a-b1e0-43be-9b2a-d519ecf82511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba32e00a-b1e0-43be-9b2a-d519ecf82511
Content-Type: application/json

--- request body ---
{"handle":"qa-5798f91112a1","password":"****"}

--- response: 200 in 89 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba32e00a-b1e0-43be-9b2a-d519ecf82511
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7379d8b3-e63e-4003-8bb8-1493b25e2251"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f2a42977-2dfb-489e-a067-189b161b3cd9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-85dda08ff13846f3a23d685a1e200d7c
X-Correlation-Id: qa-f2a42977-2dfb-489e-a067-189b161b3cd9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 52 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2a42977-2dfb-489e-a067-189b161b3cd9
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
Location: /v1/credits/purchases/pur_98973c69-6fca-48e5-abf6-f7adf8595775
Content-Length: 144

{"id":"pur_98973c69-6fca-48e5-abf6-f7adf8595775","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.829159661Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-41be7bdd-5dc3-40ba-b0c6-7c37ad6dd223

--- request headers ---
Accept: application/json
Idempotency-Key: qa-85dda08ff13846f3a23d685a1e200d7c
X-Correlation-Id: qa-41be7bdd-5dc3-40ba-b0c6-7c37ad6dd223
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41be7bdd-5dc3-40ba-b0c6-7c37ad6dd223
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-41be7bdd-5dc3-40ba-b0c6-7c37ad6dd223"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-ef885699-d570-4a7f-a6fb-889129681f67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef885699-d570-4a7f-a6fb-889129681f67
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef885699-d570-4a7f-a6fb-889129681f67
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

{"balance":15,"currency":"credits","accountId":"acc_7379d8b3-e63e-4003-8bb8-1493b25e2251"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e8545c8-af32-4108-9c0d-5d880254c9bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e8545c8-af32-4108-9c0d-5d880254c9bb
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e8545c8-af32-4108-9c0d-5d880254c9bb
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
correlation: qa-cd6beb31-269b-45f8-a5a5-5fd248e5d52d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd6beb31-269b-45f8-a5a5-5fd248e5d52d
Content-Type: application/json

--- request body ---
{"handle":"qa-5798f91112a1","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd6beb31-269b-45f8-a5a5-5fd248e5d52d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd6beb31-269b-45f8-a5a5-5fd248e5d52d"}
```
