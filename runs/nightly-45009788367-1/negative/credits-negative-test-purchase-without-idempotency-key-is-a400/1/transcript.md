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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-c922b43d-89c0-4eec-a110-0c7e326e23de` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-922a0143-2020-42d7-b964-9edd15f0c039` |
| 3 | `POST /v1/credits/purchases` | 400 | 29 | `qa-be7e7ad2-92cc-4f8b-9ffd-9f33e5460b1a` |
| 4 | `GET /v1/credits/balance` | 200 | 29 | `qa-63596d19-4836-4f5b-81a4-b0fe30f1ee63` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-66f2585a-cebd-4689-b5b1-629b5788b501` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-24966359-ff98-423e-b438-70afe3df0030` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c922b43d-89c0-4eec-a110-0c7e326e23de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c922b43d-89c0-4eec-a110-0c7e326e23de
Content-Type: application/json

--- request body ---
{"handle":"qa-9d15cad7e670","displayName":"QA 9d15cad7e670","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c922b43d-89c0-4eec-a110-0c7e326e23de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-9d15cad7e670
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1cd59876-237c-4f96-8733-b872dfc9ecb8","handle":"qa-9d15cad7e670","displayName":"QA 9d15cad7e670","region":"eu","role":"user","createdAt":"2026-11-22T09:54:51.293173165Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-922a0143-2020-42d7-b964-9edd15f0c039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-922a0143-2020-42d7-b964-9edd15f0c039
Content-Type: application/json

--- request body ---
{"handle":"qa-9d15cad7e670","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-922a0143-2020-42d7-b964-9edd15f0c039
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cd59876-237c-4f96-8733-b872dfc9ecb8"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-be7e7ad2-92cc-4f8b-9ffd-9f33e5460b1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be7e7ad2-92cc-4f8b-9ffd-9f33e5460b1a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be7e7ad2-92cc-4f8b-9ffd-9f33e5460b1a
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-be7e7ad2-92cc-4f8b-9ffd-9f33e5460b1a"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-63596d19-4836-4f5b-81a4-b0fe30f1ee63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63596d19-4836-4f5b-81a4-b0fe30f1ee63
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-63596d19-4836-4f5b-81a4-b0fe30f1ee63
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

{"balance":5,"currency":"credits","accountId":"acc_1cd59876-237c-4f96-8733-b872dfc9ecb8"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66f2585a-cebd-4689-b5b1-629b5788b501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66f2585a-cebd-4689-b5b1-629b5788b501
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66f2585a-cebd-4689-b5b1-629b5788b501
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
correlation: qa-24966359-ff98-423e-b438-70afe3df0030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24966359-ff98-423e-b438-70afe3df0030
Content-Type: application/json

--- request body ---
{"handle":"qa-9d15cad7e670","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24966359-ff98-423e-b438-70afe3df0030
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-24966359-ff98-423e-b438-70afe3df0030"}
```
