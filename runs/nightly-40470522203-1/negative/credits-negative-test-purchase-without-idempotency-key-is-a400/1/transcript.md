# Transcript: A purchase without an Idempotency-Key is refused with 400

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#purchaseWithoutIdempotencyKeyIsA400` |
| Features | FEAT-IDEMP-03, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-fab494f8-fe00-4448-9ce2-910368d1ea93` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-058d4fa7-21b3-433a-b560-4e8dc3a77559` |
| 3 | `POST /v1/credits/purchases` | 400 | 26 | `qa-5c04d099-b322-48da-8f8f-3771f73109e7` |
| 4 | `GET /v1/credits/balance` | 200 | 42 | `qa-4409bec6-42bb-4318-ad84-37cab0b9ec1a` |
| 5 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-8d97fe02-4db5-491a-bfe2-64fbc9f7c4a1` |
| 6 | `POST /v1/auth/token` | 401 | 14 | `qa-2bb9bb1c-c2ca-440c-b499-51c0ad1c9538` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fab494f8-fe00-4448-9ce2-910368d1ea93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fab494f8-fe00-4448-9ce2-910368d1ea93
Content-Type: application/json

--- request body ---
{"handle":"qa-f3177634cd6e","displayName":"QA f3177634cd6e","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-fab494f8-fe00-4448-9ce2-910368d1ea93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Location: /v1/accounts/qa-f3177634cd6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f04b0fc7-f689-4c8e-b266-6f076c1cfc32","handle":"qa-f3177634cd6e","displayName":"QA f3177634cd6e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.465388559Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-058d4fa7-21b3-433a-b560-4e8dc3a77559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-058d4fa7-21b3-433a-b560-4e8dc3a77559
Content-Type: application/json

--- request body ---
{"handle":"qa-f3177634cd6e","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-058d4fa7-21b3-433a-b560-4e8dc3a77559
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f04b0fc7-f689-4c8e-b266-6f076c1cfc32"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5c04d099-b322-48da-8f8f-3771f73109e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c04d099-b322-48da-8f8f-3771f73109e7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c04d099-b322-48da-8f8f-3771f73109e7
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
Content-Length: 319

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-5c04d099-b322-48da-8f8f-3771f73109e7"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-4409bec6-42bb-4318-ad84-37cab0b9ec1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4409bec6-42bb-4318-ad84-37cab0b9ec1a
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-4409bec6-42bb-4318-ad84-37cab0b9ec1a
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
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_f04b0fc7-f689-4c8e-b266-6f076c1cfc32"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d97fe02-4db5-491a-bfe2-64fbc9f7c4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d97fe02-4db5-491a-bfe2-64fbc9f7c4a1
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d97fe02-4db5-491a-bfe2-64fbc9f7c4a1
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2bb9bb1c-c2ca-440c-b499-51c0ad1c9538

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bb9bb1c-c2ca-440c-b499-51c0ad1c9538
Content-Type: application/json

--- request body ---
{"handle":"qa-f3177634cd6e","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bb9bb1c-c2ca-440c-b499-51c0ad1c9538
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2bb9bb1c-c2ca-440c-b499-51c0ad1c9538"}
```
