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
| 1 | `POST /v1/accounts` | 201 | 383 | `qa-de2151fc-024d-4ecf-9556-d54a315d68f9` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-6d9f4bc3-b704-4824-a7d9-2fc9cf66f2af` |
| 3 | `POST /v1/credits/purchases` | 400 | 24 | `qa-f6997d0c-6526-418e-bcd2-3972bf9b8919` |
| 4 | `GET /v1/credits/balance` | 200 | 26 | `qa-ce014cf8-a956-4bd4-a94d-2f13acba45f7` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-434702cb-d8b1-46c1-8492-9eb5d7d99463` |
| 6 | `POST /v1/auth/token` | 401 | 12 | `qa-e35eabc1-1f99-46de-a32a-bf15d1d32fd1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-de2151fc-024d-4ecf-9556-d54a315d68f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de2151fc-024d-4ecf-9556-d54a315d68f9
Content-Type: application/json

--- request body ---
{"handle":"qa-7b276ba7d5c0","displayName":"QA 7b276ba7d5c0","password":"****","region":"eu"}

--- response: 201 in 383 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-de2151fc-024d-4ecf-9556-d54a315d68f9
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
Location: /v1/accounts/qa-7b276ba7d5c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2249f2b-e7c2-48a2-8e49-af3e779404e7","handle":"qa-7b276ba7d5c0","displayName":"QA 7b276ba7d5c0","region":"eu","role":"user","createdAt":"2026-11-03T09:41:36.433590151Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6d9f4bc3-b704-4824-a7d9-2fc9cf66f2af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d9f4bc3-b704-4824-a7d9-2fc9cf66f2af
Content-Type: application/json

--- request body ---
{"handle":"qa-7b276ba7d5c0","password":"****"}

--- response: 200 in 40 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d9f4bc3-b704-4824-a7d9-2fc9cf66f2af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2249f2b-e7c2-48a2-8e49-af3e779404e7"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f6997d0c-6526-418e-bcd2-3972bf9b8919

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6997d0c-6526-418e-bcd2-3972bf9b8919
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6997d0c-6526-418e-bcd2-3972bf9b8919
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-f6997d0c-6526-418e-bcd2-3972bf9b8919"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-ce014cf8-a956-4bd4-a94d-2f13acba45f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce014cf8-a956-4bd4-a94d-2f13acba45f7
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce014cf8-a956-4bd4-a94d-2f13acba45f7
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

{"balance":5,"currency":"credits","accountId":"acc_e2249f2b-e7c2-48a2-8e49-af3e779404e7"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-434702cb-d8b1-46c1-8492-9eb5d7d99463

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-434702cb-d8b1-46c1-8492-9eb5d7d99463
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-434702cb-d8b1-46c1-8492-9eb5d7d99463
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
correlation: qa-e35eabc1-1f99-46de-a32a-bf15d1d32fd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e35eabc1-1f99-46de-a32a-bf15d1d32fd1
Content-Type: application/json

--- request body ---
{"handle":"qa-7b276ba7d5c0","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e35eabc1-1f99-46de-a32a-bf15d1d32fd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e35eabc1-1f99-46de-a32a-bf15d1d32fd1"}
```
