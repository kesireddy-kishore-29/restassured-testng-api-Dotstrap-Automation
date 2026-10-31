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
| 1 | `POST /v1/accounts` | 201 | 248 | `qa-a3673208-e59b-4d22-94b6-10078ef7fed7` |
| 2 | `POST /v1/auth/token` | 200 | 52 | `qa-5326d4c1-9f02-47d1-9b0f-49ca1cb1b28a` |
| 3 | `POST /v1/credits/purchases` | 400 | 18 | `qa-71409f8a-d51c-418e-bdb5-f8cce2234e89` |
| 4 | `GET /v1/credits/balance` | 200 | 13 | `qa-6130d122-f0c3-4f47-83fe-f7e580853a7e` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-a2497d36-4d6f-4abc-ba0c-5c62833b0ce4` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-9cd7b6d5-fa4f-4aae-8a54-aff8f09a557e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a3673208-e59b-4d22-94b6-10078ef7fed7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3673208-e59b-4d22-94b6-10078ef7fed7
Content-Type: application/json

--- request body ---
{"handle":"qa-f151cf8bb061","displayName":"QA f151cf8bb061","password":"****","region":"eu"}

--- response: 201 in 248 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3673208-e59b-4d22-94b6-10078ef7fed7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-f151cf8bb061
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf8a4321-5778-4f67-a53d-be5422aa792a","handle":"qa-f151cf8bb061","displayName":"QA f151cf8bb061","region":"eu","role":"user","createdAt":"2026-10-30T08:45:48.666157271Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5326d4c1-9f02-47d1-9b0f-49ca1cb1b28a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5326d4c1-9f02-47d1-9b0f-49ca1cb1b28a
Content-Type: application/json

--- request body ---
{"handle":"qa-f151cf8bb061","password":"****"}

--- response: 200 in 52 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-5326d4c1-9f02-47d1-9b0f-49ca1cb1b28a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf8a4321-5778-4f67-a53d-be5422aa792a"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-71409f8a-d51c-418e-bdb5-f8cce2234e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71409f8a-d51c-418e-bdb5-f8cce2234e89
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 18 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71409f8a-d51c-418e-bdb5-f8cce2234e89
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-71409f8a-d51c-418e-bdb5-f8cce2234e89"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-6130d122-f0c3-4f47-83fe-f7e580853a7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6130d122-f0c3-4f47-83fe-f7e580853a7e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-6130d122-f0c3-4f47-83fe-f7e580853a7e
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

{"balance":5,"currency":"credits","accountId":"acc_cf8a4321-5778-4f67-a53d-be5422aa792a"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2497d36-4d6f-4abc-ba0c-5c62833b0ce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2497d36-4d6f-4abc-ba0c-5c62833b0ce4
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2497d36-4d6f-4abc-ba0c-5c62833b0ce4
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
correlation: qa-9cd7b6d5-fa4f-4aae-8a54-aff8f09a557e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cd7b6d5-fa4f-4aae-8a54-aff8f09a557e
Content-Type: application/json

--- request body ---
{"handle":"qa-f151cf8bb061","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cd7b6d5-fa4f-4aae-8a54-aff8f09a557e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9cd7b6d5-fa4f-4aae-8a54-aff8f09a557e"}
```
