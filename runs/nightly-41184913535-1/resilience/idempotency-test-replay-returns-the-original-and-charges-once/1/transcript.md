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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-86afed80-9637-4f66-b349-b8b8e7f7c7bc` |
| 2 | `POST /v1/auth/token` | 200 | 7 | `qa-cd763b00-b289-4797-91a1-fa94c8c12a1f` |
| 3 | `POST /v1/credits/purchases` | 201 | 4 | `qa-8c61d9d0-bf84-4fd2-9fb2-9013f5df58b4` |
| 4 | `POST /v1/credits/purchases` | 200 | 5 | `qa-e60bdd6d-9f54-4737-a2dd-3355441253cb` |
| 5 | `GET /v1/credits/balance` | 200 | 5 | `qa-ece049f1-53be-40ea-998b-7a6a22b24429` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-63543ae6-360a-4b92-95e8-97c5c8badb7c` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-d7580168-09df-4082-ba3a-b0af89ebe076` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-86afed80-9637-4f66-b349-b8b8e7f7c7bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86afed80-9637-4f66-b349-b8b8e7f7c7bc
Content-Type: application/json

--- request body ---
{"handle":"qa-751908f6b863","displayName":"QA 751908f6b863","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-86afed80-9637-4f66-b349-b8b8e7f7c7bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Location: /v1/accounts/qa-751908f6b863
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78bd4531-5fe7-4027-9130-dcb811077b36","handle":"qa-751908f6b863","displayName":"QA 751908f6b863","region":"eu","role":"user","createdAt":"2026-10-31T08:31:30.160339050Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cd763b00-b289-4797-91a1-fa94c8c12a1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd763b00-b289-4797-91a1-fa94c8c12a1f
Content-Type: application/json

--- request body ---
{"handle":"qa-751908f6b863","password":"****"}

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd763b00-b289-4797-91a1-fa94c8c12a1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78bd4531-5fe7-4027-9130-dcb811077b36"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8c61d9d0-bf84-4fd2-9fb2-9013f5df58b4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ab0751a1768f4eaab82091a2ef0a0af0
X-Correlation-Id: qa-8c61d9d0-bf84-4fd2-9fb2-9013f5df58b4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c61d9d0-bf84-4fd2-9fb2-9013f5df58b4
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
Location: /v1/credits/purchases/pur_d1a7a1a4-49af-42a8-82ee-ec6c371d6219
Content-Length: 144

{"id":"pur_d1a7a1a4-49af-42a8-82ee-ec6c371d6219","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:30.183941164Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e60bdd6d-9f54-4737-a2dd-3355441253cb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ab0751a1768f4eaab82091a2ef0a0af0
X-Correlation-Id: qa-e60bdd6d-9f54-4737-a2dd-3355441253cb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e60bdd6d-9f54-4737-a2dd-3355441253cb
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
Location: /v1/credits/purchases/pur_d1a7a1a4-49af-42a8-82ee-ec6c371d6219
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_d1a7a1a4-49af-42a8-82ee-ec6c371d6219","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:30.183941164Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-ece049f1-53be-40ea-998b-7a6a22b24429

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ece049f1-53be-40ea-998b-7a6a22b24429
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ece049f1-53be-40ea-998b-7a6a22b24429
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

{"balance":15,"currency":"credits","accountId":"acc_78bd4531-5fe7-4027-9130-dcb811077b36"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63543ae6-360a-4b92-95e8-97c5c8badb7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63543ae6-360a-4b92-95e8-97c5c8badb7c
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63543ae6-360a-4b92-95e8-97c5c8badb7c
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
correlation: qa-d7580168-09df-4082-ba3a-b0af89ebe076

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7580168-09df-4082-ba3a-b0af89ebe076
Content-Type: application/json

--- request body ---
{"handle":"qa-751908f6b863","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7580168-09df-4082-ba3a-b0af89ebe076
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7580168-09df-4082-ba3a-b0af89ebe076"}
```
