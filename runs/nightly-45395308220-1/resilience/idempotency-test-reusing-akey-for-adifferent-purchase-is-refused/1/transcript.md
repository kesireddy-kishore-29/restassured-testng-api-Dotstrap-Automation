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
| 1 | `POST /v1/accounts` | 201 | 318 | `qa-490d71d9-72a8-4238-88c7-682e23f2de40` |
| 2 | `POST /v1/auth/token` | 200 | 50 | `qa-5dd24ecd-209e-4d40-b488-2a5fb23c4157` |
| 3 | `POST /v1/credits/purchases` | 201 | 31 | `qa-786f696a-ecb9-4187-8075-86f7cb7fb440` |
| 4 | `POST /v1/credits/purchases` | 409 | 28 | `qa-1277df62-b3bd-4617-b8da-54c5d63b4bf7` |
| 5 | `GET /v1/credits/balance` | 200 | 9 | `qa-b1987bc4-6318-45b4-b278-8731e4e89dc5` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-95d5465e-5600-4e24-b568-3143064cde90` |
| 7 | `POST /v1/auth/token` | 401 | 4 | `qa-d4dac21f-f851-420b-a7c2-9a651ca52fc5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-490d71d9-72a8-4238-88c7-682e23f2de40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-490d71d9-72a8-4238-88c7-682e23f2de40
Content-Type: application/json

--- request body ---
{"handle":"qa-499634105309","displayName":"QA 499634105309","password":"****","region":"eu"}

--- response: 201 in 318 ms ---
Date: Tue, 24 Nov 2026 12:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-490d71d9-72a8-4238-88c7-682e23f2de40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-499634105309
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78f9cd9c-c9e0-4998-b9d2-4518e23c9e43","handle":"qa-499634105309","displayName":"QA 499634105309","region":"eu","role":"user","createdAt":"2026-11-24T12:37:58.832503022Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5dd24ecd-209e-4d40-b488-2a5fb23c4157

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dd24ecd-209e-4d40-b488-2a5fb23c4157
Content-Type: application/json

--- request body ---
{"handle":"qa-499634105309","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dd24ecd-209e-4d40-b488-2a5fb23c4157
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78f9cd9c-c9e0-4998-b9d2-4518e23c9e43"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-786f696a-ecb9-4187-8075-86f7cb7fb440

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c7cee19d90b843e483cfa2a8bd06185e
X-Correlation-Id: qa-786f696a-ecb9-4187-8075-86f7cb7fb440
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 31 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-786f696a-ecb9-4187-8075-86f7cb7fb440
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
Location: /v1/credits/purchases/pur_fe73a937-739b-4a22-946e-670fe9d6f976
Content-Length: 144

{"id":"pur_fe73a937-739b-4a22-946e-670fe9d6f976","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.200303215Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1277df62-b3bd-4617-b8da-54c5d63b4bf7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c7cee19d90b843e483cfa2a8bd06185e
X-Correlation-Id: qa-1277df62-b3bd-4617-b8da-54c5d63b4bf7
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 28 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1277df62-b3bd-4617-b8da-54c5d63b4bf7
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-1277df62-b3bd-4617-b8da-54c5d63b4bf7"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-b1987bc4-6318-45b4-b278-8731e4e89dc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1987bc4-6318-45b4-b278-8731e4e89dc5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1987bc4-6318-45b4-b278-8731e4e89dc5
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

{"balance":15,"currency":"credits","accountId":"acc_78f9cd9c-c9e0-4998-b9d2-4518e23c9e43"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95d5465e-5600-4e24-b568-3143064cde90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d5465e-5600-4e24-b568-3143064cde90
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95d5465e-5600-4e24-b568-3143064cde90
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
correlation: qa-d4dac21f-f851-420b-a7c2-9a651ca52fc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4dac21f-f851-420b-a7c2-9a651ca52fc5
Content-Type: application/json

--- request body ---
{"handle":"qa-499634105309","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4dac21f-f851-420b-a7c2-9a651ca52fc5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4dac21f-f851-420b-a7c2-9a651ca52fc5"}
```
