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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-412fd86d-ead9-4570-aca4-7ca1b1e69aaa` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-12622176-5e1c-42d3-9e24-24951059b31e` |
| 3 | `POST /v1/credits/purchases` | 400 | 20 | `qa-59d12806-5493-4ecf-8d98-16cfee6264ff` |
| 4 | `GET /v1/credits/balance` | 200 | 6 | `qa-928b4b88-75ba-434e-a93e-243b9b29d834` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3dd1a1f3-2e6d-4a4b-9787-21a7cecf2a0c` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-ba53bc23-eb33-4a66-b860-7340a1206afc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-412fd86d-ead9-4570-aca4-7ca1b1e69aaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-412fd86d-ead9-4570-aca4-7ca1b1e69aaa
Content-Type: application/json

--- request body ---
{"handle":"qa-5b9afdf2469d","displayName":"QA 5b9afdf2469d","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-412fd86d-ead9-4570-aca4-7ca1b1e69aaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-5b9afdf2469d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5710bf20-e27a-4f30-a9b7-0ce02ea1657b","handle":"qa-5b9afdf2469d","displayName":"QA 5b9afdf2469d","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.484850093Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-12622176-5e1c-42d3-9e24-24951059b31e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12622176-5e1c-42d3-9e24-24951059b31e
Content-Type: application/json

--- request body ---
{"handle":"qa-5b9afdf2469d","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-12622176-5e1c-42d3-9e24-24951059b31e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5710bf20-e27a-4f30-a9b7-0ce02ea1657b"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-59d12806-5493-4ecf-8d98-16cfee6264ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59d12806-5493-4ecf-8d98-16cfee6264ff
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59d12806-5493-4ecf-8d98-16cfee6264ff
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-59d12806-5493-4ecf-8d98-16cfee6264ff"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-928b4b88-75ba-434e-a93e-243b9b29d834

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-928b4b88-75ba-434e-a93e-243b9b29d834
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-928b4b88-75ba-434e-a93e-243b9b29d834
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

{"balance":5,"currency":"credits","accountId":"acc_5710bf20-e27a-4f30-a9b7-0ce02ea1657b"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3dd1a1f3-2e6d-4a4b-9787-21a7cecf2a0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dd1a1f3-2e6d-4a4b-9787-21a7cecf2a0c
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3dd1a1f3-2e6d-4a4b-9787-21a7cecf2a0c
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
correlation: qa-ba53bc23-eb33-4a66-b860-7340a1206afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba53bc23-eb33-4a66-b860-7340a1206afc
Content-Type: application/json

--- request body ---
{"handle":"qa-5b9afdf2469d","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba53bc23-eb33-4a66-b860-7340a1206afc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba53bc23-eb33-4a66-b860-7340a1206afc"}
```
