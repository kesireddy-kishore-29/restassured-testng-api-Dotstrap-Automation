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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-6e4f8c85-b5c2-458b-a6ab-3489a7c57dbb` |
| 2 | `POST /v1/auth/token` | 200 | 41 | `qa-33d0c113-119c-4da0-97a0-c6c29bbe7bf9` |
| 3 | `POST /v1/credits/purchases` | 400 | 20 | `qa-f8834df7-193d-46f9-a5fd-15e5941b4511` |
| 4 | `GET /v1/credits/balance` | 200 | 25 | `qa-1faf13f3-5259-42fe-bd30-e4251a49ee5e` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f6520e93-8938-42cb-a719-a930e3524b95` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-ae6f13e0-4275-4aba-83f6-02119d2d0789` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e4f8c85-b5c2-458b-a6ab-3489a7c57dbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4f8c85-b5c2-458b-a6ab-3489a7c57dbb
Content-Type: application/json

--- request body ---
{"handle":"qa-96d69dc71ab5","displayName":"QA 96d69dc71ab5","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e4f8c85-b5c2-458b-a6ab-3489a7c57dbb
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
Location: /v1/accounts/qa-96d69dc71ab5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d62da70-fa0c-4f0c-88b6-3fe6e340bb32","handle":"qa-96d69dc71ab5","displayName":"QA 96d69dc71ab5","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.526131454Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-33d0c113-119c-4da0-97a0-c6c29bbe7bf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33d0c113-119c-4da0-97a0-c6c29bbe7bf9
Content-Type: application/json

--- request body ---
{"handle":"qa-96d69dc71ab5","password":"****"}

--- response: 200 in 41 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-33d0c113-119c-4da0-97a0-c6c29bbe7bf9
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d62da70-fa0c-4f0c-88b6-3fe6e340bb32"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f8834df7-193d-46f9-a5fd-15e5941b4511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8834df7-193d-46f9-a5fd-15e5941b4511
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8834df7-193d-46f9-a5fd-15e5941b4511
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-f8834df7-193d-46f9-a5fd-15e5941b4511"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-1faf13f3-5259-42fe-bd30-e4251a49ee5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1faf13f3-5259-42fe-bd30-e4251a49ee5e
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-1faf13f3-5259-42fe-bd30-e4251a49ee5e
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

{"balance":5,"currency":"credits","accountId":"acc_8d62da70-fa0c-4f0c-88b6-3fe6e340bb32"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f6520e93-8938-42cb-a719-a930e3524b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6520e93-8938-42cb-a719-a930e3524b95
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f6520e93-8938-42cb-a719-a930e3524b95
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
correlation: qa-ae6f13e0-4275-4aba-83f6-02119d2d0789

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae6f13e0-4275-4aba-83f6-02119d2d0789
Content-Type: application/json

--- request body ---
{"handle":"qa-96d69dc71ab5","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae6f13e0-4275-4aba-83f6-02119d2d0789
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae6f13e0-4275-4aba-83f6-02119d2d0789"}
```
