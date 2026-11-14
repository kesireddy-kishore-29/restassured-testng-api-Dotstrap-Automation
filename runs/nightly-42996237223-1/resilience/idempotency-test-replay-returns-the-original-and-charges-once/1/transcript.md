# Transcript: Same key + same body replays the original purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 303 | `qa-36531dee-c502-41df-a231-6382e588bdce` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-086f7a28-acb7-4d2e-9eaf-d2cfe9f73c4c` |
| 3 | `POST /v1/credits/purchases` | 201 | 41 | `qa-9cdf2b8d-f5f1-493f-b64b-45846239f283` |
| 4 | `POST /v1/credits/purchases` | 200 | 11 | `qa-2353be95-c805-4085-84ef-e48629f48bf2` |
| 5 | `GET /v1/credits/balance` | 200 | 24 | `qa-c9191456-a0a0-482d-93d3-b9c0da4dc66c` |
| 6 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-1717d300-90d2-4934-8801-1f0085eec9de` |
| 7 | `POST /v1/auth/token` | 401 | 18 | `qa-c87365f7-bf0f-434c-b18b-a4fe8cbc50ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-36531dee-c502-41df-a231-6382e588bdce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36531dee-c502-41df-a231-6382e588bdce
Content-Type: application/json

--- request body ---
{"handle":"qa-580440188b6d","displayName":"QA 580440188b6d","password":"****","region":"eu"}

--- response: 201 in 303 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-36531dee-c502-41df-a231-6382e588bdce
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
Location: /v1/accounts/qa-580440188b6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3349b99e-ab4b-447a-aaef-807aeea97085","handle":"qa-580440188b6d","displayName":"QA 580440188b6d","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.478264052Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-086f7a28-acb7-4d2e-9eaf-d2cfe9f73c4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-086f7a28-acb7-4d2e-9eaf-d2cfe9f73c4c
Content-Type: application/json

--- request body ---
{"handle":"qa-580440188b6d","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-086f7a28-acb7-4d2e-9eaf-d2cfe9f73c4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3349b99e-ab4b-447a-aaef-807aeea97085"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9cdf2b8d-f5f1-493f-b64b-45846239f283

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e2ffcdb46f4b478392a6f4899aed3e5f
X-Correlation-Id: qa-9cdf2b8d-f5f1-493f-b64b-45846239f283
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 41 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cdf2b8d-f5f1-493f-b64b-45846239f283
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
Location: /v1/credits/purchases/pur_91256beb-1697-40c4-9e08-bc1af7d83d91
Content-Length: 144

{"id":"pur_91256beb-1697-40c4-9e08-bc1af7d83d91","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.873537667Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2353be95-c805-4085-84ef-e48629f48bf2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e2ffcdb46f4b478392a6f4899aed3e5f
X-Correlation-Id: qa-2353be95-c805-4085-84ef-e48629f48bf2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2353be95-c805-4085-84ef-e48629f48bf2
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
Location: /v1/credits/purchases/pur_91256beb-1697-40c4-9e08-bc1af7d83d91
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_91256beb-1697-40c4-9e08-bc1af7d83d91","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.873537667Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-c9191456-a0a0-482d-93d3-b9c0da4dc66c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9191456-a0a0-482d-93d3-b9c0da4dc66c
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9191456-a0a0-482d-93d3-b9c0da4dc66c
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

{"balance":15,"currency":"credits","accountId":"acc_3349b99e-ab4b-447a-aaef-807aeea97085"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1717d300-90d2-4934-8801-1f0085eec9de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1717d300-90d2-4934-8801-1f0085eec9de
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1717d300-90d2-4934-8801-1f0085eec9de
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
correlation: qa-c87365f7-bf0f-434c-b18b-a4fe8cbc50ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c87365f7-bf0f-434c-b18b-a4fe8cbc50ee
Content-Type: application/json

--- request body ---
{"handle":"qa-580440188b6d","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c87365f7-bf0f-434c-b18b-a4fe8cbc50ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c87365f7-bf0f-434c-b18b-a4fe8cbc50ee"}
```
