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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-8da93c3c-df13-4fc3-ada8-db33ee8cde3e` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-55ec0b4c-0db5-435c-aec6-d7e72fb82b23` |
| 3 | `POST /v1/credits/purchases` | 400 | 18 | `qa-b79e03d5-62f2-4002-b9d4-5a253d68dd6f` |
| 4 | `GET /v1/credits/balance` | 200 | 25 | `qa-b5352be7-fe93-4f86-ac29-90dea6963032` |
| 5 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-eacee60a-69b2-4b14-808c-c558bd119dbc` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-a886b2de-1b97-4b28-99e2-e21acd9aad3a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8da93c3c-df13-4fc3-ada8-db33ee8cde3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8da93c3c-df13-4fc3-ada8-db33ee8cde3e
Content-Type: application/json

--- request body ---
{"handle":"qa-710fe94f6baa","displayName":"QA 710fe94f6baa","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8da93c3c-df13-4fc3-ada8-db33ee8cde3e
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
Location: /v1/accounts/qa-710fe94f6baa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54165773-6186-431c-9176-d477f92695f6","handle":"qa-710fe94f6baa","displayName":"QA 710fe94f6baa","region":"eu","role":"user","createdAt":"2026-11-26T11:02:36.158911625Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-55ec0b4c-0db5-435c-aec6-d7e72fb82b23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55ec0b4c-0db5-435c-aec6-d7e72fb82b23
Content-Type: application/json

--- request body ---
{"handle":"qa-710fe94f6baa","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-55ec0b4c-0db5-435c-aec6-d7e72fb82b23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54165773-6186-431c-9176-d477f92695f6"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b79e03d5-62f2-4002-b9d4-5a253d68dd6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b79e03d5-62f2-4002-b9d4-5a253d68dd6f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b79e03d5-62f2-4002-b9d4-5a253d68dd6f
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-b79e03d5-62f2-4002-b9d4-5a253d68dd6f"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-b5352be7-fe93-4f86-ac29-90dea6963032

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5352be7-fe93-4f86-ac29-90dea6963032
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5352be7-fe93-4f86-ac29-90dea6963032
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

{"balance":5,"currency":"credits","accountId":"acc_54165773-6186-431c-9176-d477f92695f6"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eacee60a-69b2-4b14-808c-c558bd119dbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eacee60a-69b2-4b14-808c-c558bd119dbc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eacee60a-69b2-4b14-808c-c558bd119dbc
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
correlation: qa-a886b2de-1b97-4b28-99e2-e21acd9aad3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a886b2de-1b97-4b28-99e2-e21acd9aad3a
Content-Type: application/json

--- request body ---
{"handle":"qa-710fe94f6baa","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a886b2de-1b97-4b28-99e2-e21acd9aad3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a886b2de-1b97-4b28-99e2-e21acd9aad3a"}
```
