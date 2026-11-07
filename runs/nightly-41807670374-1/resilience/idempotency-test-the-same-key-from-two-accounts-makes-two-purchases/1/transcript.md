# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 381 | `qa-dbd539f9-1cb9-4d57-8dd4-c044f32ecc48` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-b31d227b-502f-4453-985b-946d91b17004` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-81671ba7-7efd-430d-ba5c-8cfb328b2947` |
| 4 | `POST /v1/credits/purchases` | 201 | 38 | `qa-fa1beb8d-e4f8-4d6e-8f95-f29cb16d821e` |
| 5 | `POST /v1/auth/token` | 200 | 19 | `qa-bbba901d-7021-494a-a72a-9617a9218a16` |
| 6 | `POST /v1/credits/purchases` | 201 | 6 | `qa-2cea090d-e0ec-4142-8763-8efe0a69fd1b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-86afce7a-af2c-49a4-890e-7587f833575f` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-ee2665d4-b1bd-473e-b536-2452c1a47506` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-6a431678-a3b1-43a0-8ce4-16864dc7a690` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-6f0eb7e0-3071-4abe-a7cd-a5d6e1b0053e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dbd539f9-1cb9-4d57-8dd4-c044f32ecc48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbd539f9-1cb9-4d57-8dd4-c044f32ecc48
Content-Type: application/json

--- request body ---
{"handle":"qa-6756369798e7","displayName":"QA 6756369798e7","password":"****","region":"eu"}

--- response: 201 in 381 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbd539f9-1cb9-4d57-8dd4-c044f32ecc48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-6756369798e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc7800ce-3021-4c79-b8e9-e7dc5536ba3d","handle":"qa-6756369798e7","displayName":"QA 6756369798e7","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.327638485Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b31d227b-502f-4453-985b-946d91b17004

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b31d227b-502f-4453-985b-946d91b17004
Content-Type: application/json

--- request body ---
{"handle":"qa-21a2764745eb","displayName":"QA 21a2764745eb","password":"****","region":"us"}

--- response: 201 in 45 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b31d227b-502f-4453-985b-946d91b17004
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
Location: /v1/accounts/qa-21a2764745eb
X-Served-Region: us
Content-Length: 181

{"id":"acc_86802ad6-aafc-4e89-a30f-a352220c93c5","handle":"qa-21a2764745eb","displayName":"QA 21a2764745eb","region":"us","role":"user","createdAt":"2026-11-04T09:28:14.630481681Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-81671ba7-7efd-430d-ba5c-8cfb328b2947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81671ba7-7efd-430d-ba5c-8cfb328b2947
Content-Type: application/json

--- request body ---
{"handle":"qa-6756369798e7","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-81671ba7-7efd-430d-ba5c-8cfb328b2947
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc7800ce-3021-4c79-b8e9-e7dc5536ba3d"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fa1beb8d-e4f8-4d6e-8f95-f29cb16d821e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-11e3bff766e84a5dbe3f35bd32f1ab6c
X-Correlation-Id: qa-fa1beb8d-e4f8-4d6e-8f95-f29cb16d821e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 38 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa1beb8d-e4f8-4d6e-8f95-f29cb16d821e
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
Location: /v1/credits/purchases/pur_42875ae3-3359-4006-bc74-3a8dcf93e02f
Content-Length: 144

{"id":"pur_42875ae3-3359-4006-bc74-3a8dcf93e02f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.795974270Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-bbba901d-7021-494a-a72a-9617a9218a16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbba901d-7021-494a-a72a-9617a9218a16
Content-Type: application/json

--- request body ---
{"handle":"qa-21a2764745eb","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbba901d-7021-494a-a72a-9617a9218a16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86802ad6-aafc-4e89-a30f-a352220c93c5"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2cea090d-e0ec-4142-8763-8efe0a69fd1b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-11e3bff766e84a5dbe3f35bd32f1ab6c
X-Correlation-Id: qa-2cea090d-e0ec-4142-8763-8efe0a69fd1b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cea090d-e0ec-4142-8763-8efe0a69fd1b
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_32529a82-455f-443c-ad39-4eefadbd4db1
Content-Length: 144

{"id":"pur_32529a82-455f-443c-ad39-4eefadbd4db1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.845420977Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-86afce7a-af2c-49a4-890e-7587f833575f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86afce7a-af2c-49a4-890e-7587f833575f
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-86afce7a-af2c-49a4-890e-7587f833575f
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
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-ee2665d4-b1bd-473e-b536-2452c1a47506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee2665d4-b1bd-473e-b536-2452c1a47506
Content-Type: application/json

--- request body ---
{"handle":"qa-21a2764745eb","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee2665d4-b1bd-473e-b536-2452c1a47506
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee2665d4-b1bd-473e-b536-2452c1a47506"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6a431678-a3b1-43a0-8ce4-16864dc7a690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a431678-a3b1-43a0-8ce4-16864dc7a690
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6a431678-a3b1-43a0-8ce4-16864dc7a690
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6f0eb7e0-3071-4abe-a7cd-a5d6e1b0053e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f0eb7e0-3071-4abe-a7cd-a5d6e1b0053e
Content-Type: application/json

--- request body ---
{"handle":"qa-6756369798e7","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f0eb7e0-3071-4abe-a7cd-a5d6e1b0053e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f0eb7e0-3071-4abe-a7cd-a5d6e1b0053e"}
```
