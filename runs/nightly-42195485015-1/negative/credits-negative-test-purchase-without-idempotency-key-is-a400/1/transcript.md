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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-e4c7c5e6-9dbd-406c-8728-7622ba5b791e` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-8dd94a8b-97ba-4b3c-bd6b-440176b85f7b` |
| 3 | `POST /v1/credits/purchases` | 400 | 16 | `qa-b5adf2e6-4c05-41ff-a999-4d07a80e2dcb` |
| 4 | `GET /v1/credits/balance` | 200 | 9 | `qa-3c8c28e4-d2d1-40a3-b012-b65b57988eb1` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-99ba21f7-62e7-4647-9fb8-e47580919740` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-ccafe9d4-bcac-4309-bf2e-ee45294a8bc4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e4c7c5e6-9dbd-406c-8728-7622ba5b791e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4c7c5e6-9dbd-406c-8728-7622ba5b791e
Content-Type: application/json

--- request body ---
{"handle":"qa-15d5d622fa2a","displayName":"QA 15d5d622fa2a","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4c7c5e6-9dbd-406c-8728-7622ba5b791e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-15d5d622fa2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac293da8-f386-4905-9b13-1eed42855071","handle":"qa-15d5d622fa2a","displayName":"QA 15d5d622fa2a","region":"eu","role":"user","createdAt":"2026-11-06T09:30:29.586001674Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8dd94a8b-97ba-4b3c-bd6b-440176b85f7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dd94a8b-97ba-4b3c-bd6b-440176b85f7b
Content-Type: application/json

--- request body ---
{"handle":"qa-15d5d622fa2a","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dd94a8b-97ba-4b3c-bd6b-440176b85f7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac293da8-f386-4905-9b13-1eed42855071"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b5adf2e6-4c05-41ff-a999-4d07a80e2dcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5adf2e6-4c05-41ff-a999-4d07a80e2dcb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5adf2e6-4c05-41ff-a999-4d07a80e2dcb
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-b5adf2e6-4c05-41ff-a999-4d07a80e2dcb"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-3c8c28e4-d2d1-40a3-b012-b65b57988eb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c8c28e4-d2d1-40a3-b012-b65b57988eb1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c8c28e4-d2d1-40a3-b012-b65b57988eb1
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

{"balance":5,"currency":"credits","accountId":"acc_ac293da8-f386-4905-9b13-1eed42855071"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99ba21f7-62e7-4647-9fb8-e47580919740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99ba21f7-62e7-4647-9fb8-e47580919740
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99ba21f7-62e7-4647-9fb8-e47580919740
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
correlation: qa-ccafe9d4-bcac-4309-bf2e-ee45294a8bc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccafe9d4-bcac-4309-bf2e-ee45294a8bc4
Content-Type: application/json

--- request body ---
{"handle":"qa-15d5d622fa2a","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccafe9d4-bcac-4309-bf2e-ee45294a8bc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccafe9d4-bcac-4309-bf2e-ee45294a8bc4"}
```
