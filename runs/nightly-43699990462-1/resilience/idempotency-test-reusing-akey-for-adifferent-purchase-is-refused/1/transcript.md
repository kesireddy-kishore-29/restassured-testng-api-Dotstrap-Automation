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
| 1 | `POST /v1/accounts` | 201 | 477 | `qa-aa9ce681-f943-466f-bf2c-855afd8f60eb` |
| 2 | `POST /v1/auth/token` | 200 | 70 | `qa-fa3bd1c7-de1d-46e7-9423-405a6d97cd91` |
| 3 | `POST /v1/credits/purchases` | 201 | 57 | `qa-96109a44-7ee4-467b-b413-7250b2a5cfca` |
| 4 | `POST /v1/credits/purchases` | 409 | 54 | `qa-d6820d79-869a-40f6-a6c9-64f6768af0b0` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-89b80750-ced1-45e9-93bf-0b1abd5dd1ce` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-82086044-39e9-4985-8aac-bb09175e93ff` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-9d702dca-ce4d-4bdd-b40b-d6f4f1522018` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa9ce681-f943-466f-bf2c-855afd8f60eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa9ce681-f943-466f-bf2c-855afd8f60eb
Content-Type: application/json

--- request body ---
{"handle":"qa-5645286d11cc","displayName":"QA 5645286d11cc","password":"****","region":"eu"}

--- response: 201 in 477 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa9ce681-f943-466f-bf2c-855afd8f60eb
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
Location: /v1/accounts/qa-5645286d11cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_066fb524-ab2d-471e-9068-0eabf58dfb78","handle":"qa-5645286d11cc","displayName":"QA 5645286d11cc","region":"eu","role":"user","createdAt":"2026-11-15T09:36:13.548391647Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fa3bd1c7-de1d-46e7-9423-405a6d97cd91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa3bd1c7-de1d-46e7-9423-405a6d97cd91
Content-Type: application/json

--- request body ---
{"handle":"qa-5645286d11cc","password":"****"}

--- response: 200 in 70 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa3bd1c7-de1d-46e7-9423-405a6d97cd91
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_066fb524-ab2d-471e-9068-0eabf58dfb78"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-96109a44-7ee4-467b-b413-7250b2a5cfca

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b0cc32238517471aa484bf292d74ab41
X-Correlation-Id: qa-96109a44-7ee4-467b-b413-7250b2a5cfca
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 57 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-96109a44-7ee4-467b-b413-7250b2a5cfca
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
Location: /v1/credits/purchases/pur_f6b634bd-d1ac-4879-9535-5c3862468fa2
Content-Length: 144

{"id":"pur_f6b634bd-d1ac-4879-9535-5c3862468fa2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.053640331Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d6820d79-869a-40f6-a6c9-64f6768af0b0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b0cc32238517471aa484bf292d74ab41
X-Correlation-Id: qa-d6820d79-869a-40f6-a6c9-64f6768af0b0
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 54 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6820d79-869a-40f6-a6c9-64f6768af0b0
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-d6820d79-869a-40f6-a6c9-64f6768af0b0"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-89b80750-ced1-45e9-93bf-0b1abd5dd1ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b80750-ced1-45e9-93bf-0b1abd5dd1ce
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-89b80750-ced1-45e9-93bf-0b1abd5dd1ce
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

{"balance":15,"currency":"credits","accountId":"acc_066fb524-ab2d-471e-9068-0eabf58dfb78"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82086044-39e9-4985-8aac-bb09175e93ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82086044-39e9-4985-8aac-bb09175e93ff
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82086044-39e9-4985-8aac-bb09175e93ff
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
correlation: qa-9d702dca-ce4d-4bdd-b40b-d6f4f1522018

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d702dca-ce4d-4bdd-b40b-d6f4f1522018
Content-Type: application/json

--- request body ---
{"handle":"qa-5645286d11cc","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d702dca-ce4d-4bdd-b40b-d6f4f1522018
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d702dca-ce4d-4bdd-b40b-d6f4f1522018"}
```
