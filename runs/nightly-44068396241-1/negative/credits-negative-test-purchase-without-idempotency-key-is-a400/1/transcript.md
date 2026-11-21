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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-fbb19a2a-a806-4a80-8fad-5c3030a79297` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-e9c63090-3920-4167-8d57-3c7cc4af8b1b` |
| 3 | `POST /v1/credits/purchases` | 400 | 17 | `qa-d12e50ac-9882-45c1-b5aa-59078ecdb4f2` |
| 4 | `GET /v1/credits/balance` | 200 | 12 | `qa-931c9392-61ac-45ee-a2f2-39fd65b08330` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ed6fa453-0609-4111-b73d-6b3bd99c9654` |
| 6 | `POST /v1/auth/token` | 401 | 12 | `qa-a07c3770-813e-47eb-bd3d-48a19f61f5e2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fbb19a2a-a806-4a80-8fad-5c3030a79297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbb19a2a-a806-4a80-8fad-5c3030a79297
Content-Type: application/json

--- request body ---
{"handle":"qa-dcb2908c21ae","displayName":"QA dcb2908c21ae","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbb19a2a-a806-4a80-8fad-5c3030a79297
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
Location: /v1/accounts/qa-dcb2908c21ae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13c15dd7-dbe6-4f7a-8b74-d84b029d9e79","handle":"qa-dcb2908c21ae","displayName":"QA dcb2908c21ae","region":"eu","role":"user","createdAt":"2026-11-17T10:50:11.719738462Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e9c63090-3920-4167-8d57-3c7cc4af8b1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9c63090-3920-4167-8d57-3c7cc4af8b1b
Content-Type: application/json

--- request body ---
{"handle":"qa-dcb2908c21ae","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9c63090-3920-4167-8d57-3c7cc4af8b1b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13c15dd7-dbe6-4f7a-8b74-d84b029d9e79"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d12e50ac-9882-45c1-b5aa-59078ecdb4f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d12e50ac-9882-45c1-b5aa-59078ecdb4f2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d12e50ac-9882-45c1-b5aa-59078ecdb4f2
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-d12e50ac-9882-45c1-b5aa-59078ecdb4f2"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-931c9392-61ac-45ee-a2f2-39fd65b08330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-931c9392-61ac-45ee-a2f2-39fd65b08330
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-931c9392-61ac-45ee-a2f2-39fd65b08330
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

{"balance":5,"currency":"credits","accountId":"acc_13c15dd7-dbe6-4f7a-8b74-d84b029d9e79"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed6fa453-0609-4111-b73d-6b3bd99c9654

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed6fa453-0609-4111-b73d-6b3bd99c9654
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed6fa453-0609-4111-b73d-6b3bd99c9654
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
correlation: qa-a07c3770-813e-47eb-bd3d-48a19f61f5e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a07c3770-813e-47eb-bd3d-48a19f61f5e2
Content-Type: application/json

--- request body ---
{"handle":"qa-dcb2908c21ae","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a07c3770-813e-47eb-bd3d-48a19f61f5e2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a07c3770-813e-47eb-bd3d-48a19f61f5e2"}
```
