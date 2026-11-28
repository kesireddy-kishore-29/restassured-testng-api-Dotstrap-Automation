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
| 1 | `POST /v1/accounts` | 201 | 353 | `qa-5c70561b-73e4-41ff-b6c4-1313be1d2739` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-1fa15f75-b60e-431e-8c28-7d4eed0bd501` |
| 3 | `POST /v1/credits/purchases` | 201 | 45 | `qa-63ee76c7-54b8-402d-8c51-ce67936f7578` |
| 4 | `POST /v1/credits/purchases` | 409 | 27 | `qa-278e9df8-797c-4cea-905a-a788b2fabc0d` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-fed65e6e-2f14-4da2-8a50-95a251a4c31d` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ac06a3f4-5a35-4cd0-8ea4-d561afcff130` |
| 7 | `POST /v1/auth/token` | 401 | 4 | `qa-f5d8dedb-cbde-4f23-a2ad-3fe2448d7f9a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5c70561b-73e4-41ff-b6c4-1313be1d2739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c70561b-73e4-41ff-b6c4-1313be1d2739
Content-Type: application/json

--- request body ---
{"handle":"qa-04645c4cae9b","displayName":"QA 04645c4cae9b","password":"****","region":"eu"}

--- response: 201 in 353 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c70561b-73e4-41ff-b6c4-1313be1d2739
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
Location: /v1/accounts/qa-04645c4cae9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2b2b5ec2-c123-474e-bd6f-47d593f5fdc3","handle":"qa-04645c4cae9b","displayName":"QA 04645c4cae9b","region":"eu","role":"user","createdAt":"2026-11-28T10:37:12.279053178Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1fa15f75-b60e-431e-8c28-7d4eed0bd501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fa15f75-b60e-431e-8c28-7d4eed0bd501
Content-Type: application/json

--- request body ---
{"handle":"qa-04645c4cae9b","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fa15f75-b60e-431e-8c28-7d4eed0bd501
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2b2b5ec2-c123-474e-bd6f-47d593f5fdc3"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-63ee76c7-54b8-402d-8c51-ce67936f7578

--- request headers ---
Accept: application/json
Idempotency-Key: qa-99f8a297bd3447acb400fb2481a46ed8
X-Correlation-Id: qa-63ee76c7-54b8-402d-8c51-ce67936f7578
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-63ee76c7-54b8-402d-8c51-ce67936f7578
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
Location: /v1/credits/purchases/pur_d6757c8b-b952-4af5-a07f-0230832fe095
Content-Length: 144

{"id":"pur_d6757c8b-b952-4af5-a07f-0230832fe095","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.694643150Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-278e9df8-797c-4cea-905a-a788b2fabc0d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-99f8a297bd3447acb400fb2481a46ed8
X-Correlation-Id: qa-278e9df8-797c-4cea-905a-a788b2fabc0d
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-278e9df8-797c-4cea-905a-a788b2fabc0d
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-278e9df8-797c-4cea-905a-a788b2fabc0d"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-fed65e6e-2f14-4da2-8a50-95a251a4c31d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fed65e6e-2f14-4da2-8a50-95a251a4c31d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-fed65e6e-2f14-4da2-8a50-95a251a4c31d
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

{"balance":15,"currency":"credits","accountId":"acc_2b2b5ec2-c123-474e-bd6f-47d593f5fdc3"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac06a3f4-5a35-4cd0-8ea4-d561afcff130

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac06a3f4-5a35-4cd0-8ea4-d561afcff130
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac06a3f4-5a35-4cd0-8ea4-d561afcff130
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
correlation: qa-f5d8dedb-cbde-4f23-a2ad-3fe2448d7f9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5d8dedb-cbde-4f23-a2ad-3fe2448d7f9a
Content-Type: application/json

--- request body ---
{"handle":"qa-04645c4cae9b","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5d8dedb-cbde-4f23-a2ad-3fe2448d7f9a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f5d8dedb-cbde-4f23-a2ad-3fe2448d7f9a"}
```
