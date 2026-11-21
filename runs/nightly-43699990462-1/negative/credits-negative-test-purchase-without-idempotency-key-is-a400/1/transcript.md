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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-1bc38084-7cc7-4972-b632-4d43e955e51d` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-c7efe8cf-3f8d-45c4-ad85-fe3481305b1f` |
| 3 | `POST /v1/credits/purchases` | 400 | 19 | `qa-495461fd-d86e-4e73-9b31-9296b8e3b0ec` |
| 4 | `GET /v1/credits/balance` | 200 | 20 | `qa-db872cfe-f56d-4fab-b73f-d9531e951987` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-f826a1a2-360a-4553-bb6b-075c5ceaa43e` |
| 6 | `POST /v1/auth/token` | 401 | 12 | `qa-bb7dfaa6-c500-4aa7-ac31-3dd9e515589f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1bc38084-7cc7-4972-b632-4d43e955e51d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bc38084-7cc7-4972-b632-4d43e955e51d
Content-Type: application/json

--- request body ---
{"handle":"qa-89df453b2837","displayName":"QA 89df453b2837","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bc38084-7cc7-4972-b632-4d43e955e51d
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
Location: /v1/accounts/qa-89df453b2837
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ffd2c773-ca90-4f7c-9673-bf84ab5a3f79","handle":"qa-89df453b2837","displayName":"QA 89df453b2837","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.898836006Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c7efe8cf-3f8d-45c4-ad85-fe3481305b1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7efe8cf-3f8d-45c4-ad85-fe3481305b1f
Content-Type: application/json

--- request body ---
{"handle":"qa-89df453b2837","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7efe8cf-3f8d-45c4-ad85-fe3481305b1f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ffd2c773-ca90-4f7c-9673-bf84ab5a3f79"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-495461fd-d86e-4e73-9b31-9296b8e3b0ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-495461fd-d86e-4e73-9b31-9296b8e3b0ec
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-495461fd-d86e-4e73-9b31-9296b8e3b0ec
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-495461fd-d86e-4e73-9b31-9296b8e3b0ec"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-db872cfe-f56d-4fab-b73f-d9531e951987

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db872cfe-f56d-4fab-b73f-d9531e951987
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-db872cfe-f56d-4fab-b73f-d9531e951987
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

{"balance":5,"currency":"credits","accountId":"acc_ffd2c773-ca90-4f7c-9673-bf84ab5a3f79"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f826a1a2-360a-4553-bb6b-075c5ceaa43e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f826a1a2-360a-4553-bb6b-075c5ceaa43e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f826a1a2-360a-4553-bb6b-075c5ceaa43e
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
correlation: qa-bb7dfaa6-c500-4aa7-ac31-3dd9e515589f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb7dfaa6-c500-4aa7-ac31-3dd9e515589f
Content-Type: application/json

--- request body ---
{"handle":"qa-89df453b2837","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb7dfaa6-c500-4aa7-ac31-3dd9e515589f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb7dfaa6-c500-4aa7-ac31-3dd9e515589f"}
```
