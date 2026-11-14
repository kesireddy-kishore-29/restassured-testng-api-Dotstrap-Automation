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
| 1 | `POST /v1/accounts` | 201 | 492 | `qa-07c5227d-bcca-41bc-9127-3fc59a01b146` |
| 2 | `POST /v1/auth/token` | 200 | 62 | `qa-6a929265-8cb9-4da9-875b-de0dd3ba3593` |
| 3 | `POST /v1/credits/purchases` | 201 | 30 | `qa-bc01b7fd-6522-4d22-9336-446b3d975d1e` |
| 4 | `POST /v1/credits/purchases` | 200 | 11 | `qa-b38ffc76-00c3-4ebe-9f8f-da239625a23f` |
| 5 | `GET /v1/credits/balance` | 200 | 37 | `qa-f2fe51e9-252c-4de6-8f89-855bb77ee31e` |
| 6 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c4f1630c-0c72-4aad-ae4d-e6ac1b24aba7` |
| 7 | `POST /v1/auth/token` | 401 | 15 | `qa-ce591fda-1c42-43a5-be52-507422e32738` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-07c5227d-bcca-41bc-9127-3fc59a01b146

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07c5227d-bcca-41bc-9127-3fc59a01b146
Content-Type: application/json

--- request body ---
{"handle":"qa-d8cee689bd69","displayName":"QA d8cee689bd69","password":"****","region":"eu"}

--- response: 201 in 492 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-07c5227d-bcca-41bc-9127-3fc59a01b146
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
Location: /v1/accounts/qa-d8cee689bd69
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c23e1e6c-eeef-4c0c-9a10-12b19e40c730","handle":"qa-d8cee689bd69","displayName":"QA d8cee689bd69","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.783419008Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6a929265-8cb9-4da9-875b-de0dd3ba3593

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a929265-8cb9-4da9-875b-de0dd3ba3593
Content-Type: application/json

--- request body ---
{"handle":"qa-d8cee689bd69","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a929265-8cb9-4da9-875b-de0dd3ba3593
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c23e1e6c-eeef-4c0c-9a10-12b19e40c730"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bc01b7fd-6522-4d22-9336-446b3d975d1e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a44049745f984528ad61ad6809a266dc
X-Correlation-Id: qa-bc01b7fd-6522-4d22-9336-446b3d975d1e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc01b7fd-6522-4d22-9336-446b3d975d1e
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
Location: /v1/credits/purchases/pur_a9b97854-cf60-46b2-a2e4-6aeb1d42ed3d
Content-Length: 144

{"id":"pur_a9b97854-cf60-46b2-a2e4-6aeb1d42ed3d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.326270934Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b38ffc76-00c3-4ebe-9f8f-da239625a23f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a44049745f984528ad61ad6809a266dc
X-Correlation-Id: qa-b38ffc76-00c3-4ebe-9f8f-da239625a23f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b38ffc76-00c3-4ebe-9f8f-da239625a23f
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
Location: /v1/credits/purchases/pur_a9b97854-cf60-46b2-a2e4-6aeb1d42ed3d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_a9b97854-cf60-46b2-a2e4-6aeb1d42ed3d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.326270934Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-f2fe51e9-252c-4de6-8f89-855bb77ee31e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2fe51e9-252c-4de6-8f89-855bb77ee31e
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2fe51e9-252c-4de6-8f89-855bb77ee31e
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

{"balance":15,"currency":"credits","accountId":"acc_c23e1e6c-eeef-4c0c-9a10-12b19e40c730"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4f1630c-0c72-4aad-ae4d-e6ac1b24aba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4f1630c-0c72-4aad-ae4d-e6ac1b24aba7
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4f1630c-0c72-4aad-ae4d-e6ac1b24aba7
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
correlation: qa-ce591fda-1c42-43a5-be52-507422e32738

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce591fda-1c42-43a5-be52-507422e32738
Content-Type: application/json

--- request body ---
{"handle":"qa-d8cee689bd69","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce591fda-1c42-43a5-be52-507422e32738
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce591fda-1c42-43a5-be52-507422e32738"}
```
