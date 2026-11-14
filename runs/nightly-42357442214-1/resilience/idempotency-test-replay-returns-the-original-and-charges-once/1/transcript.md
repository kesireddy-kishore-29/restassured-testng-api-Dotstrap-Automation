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
| 1 | `POST /v1/accounts` | 201 | 450 | `qa-ce8c2641-1f08-465e-b2fd-3b0426b41086` |
| 2 | `POST /v1/auth/token` | 200 | 57 | `qa-3bd4e566-05e0-47f8-beee-477cc1334433` |
| 3 | `POST /v1/credits/purchases` | 201 | 61 | `qa-de960f36-d2ae-4727-8bc2-2fa328a01590` |
| 4 | `POST /v1/credits/purchases` | 200 | 24 | `qa-a047f417-edbf-4a0e-a8be-f2518cc7144d` |
| 5 | `GET /v1/credits/balance` | 200 | 42 | `qa-06310ffa-6a49-4bb3-a23e-c77e894c61cc` |
| 6 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-b94a22b6-d58b-4e36-9467-b62e3736bae8` |
| 7 | `POST /v1/auth/token` | 401 | 13 | `qa-4cea3d8f-af50-4501-b049-87b915356e95` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ce8c2641-1f08-465e-b2fd-3b0426b41086

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce8c2641-1f08-465e-b2fd-3b0426b41086
Content-Type: application/json

--- request body ---
{"handle":"qa-79695e4567d5","displayName":"QA 79695e4567d5","password":"****","region":"eu"}

--- response: 201 in 450 ms ---
Date: Sat, 07 Nov 2026 08:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce8c2641-1f08-465e-b2fd-3b0426b41086
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-79695e4567d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6dff56d-1e29-46ff-9da9-3728deeaff68","handle":"qa-79695e4567d5","displayName":"QA 79695e4567d5","region":"eu","role":"user","createdAt":"2026-11-07T08:55:02.768658669Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3bd4e566-05e0-47f8-beee-477cc1334433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bd4e566-05e0-47f8-beee-477cc1334433
Content-Type: application/json

--- request body ---
{"handle":"qa-79695e4567d5","password":"****"}

--- response: 200 in 57 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bd4e566-05e0-47f8-beee-477cc1334433
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6dff56d-1e29-46ff-9da9-3728deeaff68"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-de960f36-d2ae-4727-8bc2-2fa328a01590

--- request headers ---
Accept: application/json
Idempotency-Key: qa-29e405d5f3424d45ac1d58c9f0ba3e0b
X-Correlation-Id: qa-de960f36-d2ae-4727-8bc2-2fa328a01590
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 61 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-de960f36-d2ae-4727-8bc2-2fa328a01590
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
Location: /v1/credits/purchases/pur_de174c94-8326-4c44-816c-a244701c46b7
Content-Length: 144

{"id":"pur_de174c94-8326-4c44-816c-a244701c46b7","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.404024758Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a047f417-edbf-4a0e-a8be-f2518cc7144d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-29e405d5f3424d45ac1d58c9f0ba3e0b
X-Correlation-Id: qa-a047f417-edbf-4a0e-a8be-f2518cc7144d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 24 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a047f417-edbf-4a0e-a8be-f2518cc7144d
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
Location: /v1/credits/purchases/pur_de174c94-8326-4c44-816c-a244701c46b7
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_de174c94-8326-4c44-816c-a244701c46b7","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.404024758Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-06310ffa-6a49-4bb3-a23e-c77e894c61cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06310ffa-6a49-4bb3-a23e-c77e894c61cc
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-06310ffa-6a49-4bb3-a23e-c77e894c61cc
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

{"balance":15,"currency":"credits","accountId":"acc_a6dff56d-1e29-46ff-9da9-3728deeaff68"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b94a22b6-d58b-4e36-9467-b62e3736bae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b94a22b6-d58b-4e36-9467-b62e3736bae8
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b94a22b6-d58b-4e36-9467-b62e3736bae8
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
correlation: qa-4cea3d8f-af50-4501-b049-87b915356e95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cea3d8f-af50-4501-b049-87b915356e95
Content-Type: application/json

--- request body ---
{"handle":"qa-79695e4567d5","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cea3d8f-af50-4501-b049-87b915356e95
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4cea3d8f-af50-4501-b049-87b915356e95"}
```
