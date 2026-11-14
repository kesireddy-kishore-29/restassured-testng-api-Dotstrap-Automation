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
| 1 | `POST /v1/accounts` | 201 | 481 | `qa-c4b0a9a3-b4bc-4d5c-a7f4-e7294b6c1583` |
| 2 | `POST /v1/auth/token` | 200 | 69 | `qa-9edfe55d-4b4e-4833-bbde-b7944ea171c2` |
| 3 | `POST /v1/credits/purchases` | 201 | 64 | `qa-ab585695-0606-4738-8695-f7cf60f58b98` |
| 4 | `POST /v1/credits/purchases` | 200 | 27 | `qa-5872c32b-676d-468b-a27d-46075a455cc3` |
| 5 | `GET /v1/credits/balance` | 200 | 51 | `qa-2118ce48-7741-434d-9fce-8cbf5881660e` |
| 6 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-15f71694-0c9a-42f2-8332-2750ec392fab` |
| 7 | `POST /v1/auth/token` | 401 | 27 | `qa-217895c8-3d80-423a-bfa3-911136ba7176` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c4b0a9a3-b4bc-4d5c-a7f4-e7294b6c1583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4b0a9a3-b4bc-4d5c-a7f4-e7294b6c1583
Content-Type: application/json

--- request body ---
{"handle":"qa-b5040733926f","displayName":"QA b5040733926f","password":"****","region":"eu"}

--- response: 201 in 481 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4b0a9a3-b4bc-4d5c-a7f4-e7294b6c1583
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
Location: /v1/accounts/qa-b5040733926f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_94720a62-86a6-4ae3-82bb-b3946f896a5e","handle":"qa-b5040733926f","displayName":"QA b5040733926f","region":"eu","role":"user","createdAt":"2026-11-14T09:05:14.216395879Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9edfe55d-4b4e-4833-bbde-b7944ea171c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9edfe55d-4b4e-4833-bbde-b7944ea171c2
Content-Type: application/json

--- request body ---
{"handle":"qa-b5040733926f","password":"****"}

--- response: 200 in 69 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9edfe55d-4b4e-4833-bbde-b7944ea171c2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_94720a62-86a6-4ae3-82bb-b3946f896a5e"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ab585695-0606-4738-8695-f7cf60f58b98

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0487794567c241728185e2a5cf99d95e
X-Correlation-Id: qa-ab585695-0606-4738-8695-f7cf60f58b98
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 64 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab585695-0606-4738-8695-f7cf60f58b98
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
Location: /v1/credits/purchases/pur_f44ac975-0f7b-4caa-bc46-140df040ff36
Content-Length: 144

{"id":"pur_f44ac975-0f7b-4caa-bc46-140df040ff36","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.816200554Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5872c32b-676d-468b-a27d-46075a455cc3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0487794567c241728185e2a5cf99d95e
X-Correlation-Id: qa-5872c32b-676d-468b-a27d-46075a455cc3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5872c32b-676d-468b-a27d-46075a455cc3
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
Location: /v1/credits/purchases/pur_f44ac975-0f7b-4caa-bc46-140df040ff36
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_f44ac975-0f7b-4caa-bc46-140df040ff36","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.816200554Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-2118ce48-7741-434d-9fce-8cbf5881660e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2118ce48-7741-434d-9fce-8cbf5881660e
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2118ce48-7741-434d-9fce-8cbf5881660e
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

{"balance":15,"currency":"credits","accountId":"acc_94720a62-86a6-4ae3-82bb-b3946f896a5e"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15f71694-0c9a-42f2-8332-2750ec392fab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15f71694-0c9a-42f2-8332-2750ec392fab
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15f71694-0c9a-42f2-8332-2750ec392fab
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
correlation: qa-217895c8-3d80-423a-bfa3-911136ba7176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-217895c8-3d80-423a-bfa3-911136ba7176
Content-Type: application/json

--- request body ---
{"handle":"qa-b5040733926f","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-217895c8-3d80-423a-bfa3-911136ba7176
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-217895c8-3d80-423a-bfa3-911136ba7176"}
```
