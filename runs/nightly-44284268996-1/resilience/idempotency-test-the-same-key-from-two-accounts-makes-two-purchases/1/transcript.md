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
| 1 | `POST /v1/accounts` | 201 | 290 | `qa-77999eb6-fc23-4954-ac5b-525cec04c4c3` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-3c3e60bf-9e39-4c09-a464-85e973a771b6` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-8c83f93e-7ec4-4808-a9a8-a658d6335968` |
| 4 | `POST /v1/credits/purchases` | 201 | 40 | `qa-428fcabe-1a6e-4996-b5ed-a5528bfdc5e2` |
| 5 | `POST /v1/auth/token` | 200 | 12 | `qa-4c4dfe32-ef56-4f2a-a6bb-60857b812d0a` |
| 6 | `POST /v1/credits/purchases` | 201 | 5 | `qa-a378370b-c48c-4ba2-8042-2dbc705d1116` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-8ee6ba6a-91c6-45cc-ab20-d7e574fa9e6b` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-f7a4ac15-9cff-4927-9626-e92a4ab3ca94` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-73d9b927-f42e-4308-aa2a-f050cff8f362` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-bebfe408-86a0-4ae6-b96e-1890c2dc3b60` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-77999eb6-fc23-4954-ac5b-525cec04c4c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77999eb6-fc23-4954-ac5b-525cec04c4c3
Content-Type: application/json

--- request body ---
{"handle":"qa-40f7131f93e6","displayName":"QA 40f7131f93e6","password":"****","region":"eu"}

--- response: 201 in 290 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-77999eb6-fc23-4954-ac5b-525cec04c4c3
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
Location: /v1/accounts/qa-40f7131f93e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc4103d3-1b3d-46cc-a463-03984ee21b8d","handle":"qa-40f7131f93e6","displayName":"QA 40f7131f93e6","region":"eu","role":"user","createdAt":"2026-11-18T10:19:37.677541869Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3c3e60bf-9e39-4c09-a464-85e973a771b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c3e60bf-9e39-4c09-a464-85e973a771b6
Content-Type: application/json

--- request body ---
{"handle":"qa-d1c14845cac6","displayName":"QA d1c14845cac6","password":"****","region":"us"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c3e60bf-9e39-4c09-a464-85e973a771b6
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
Location: /v1/accounts/qa-d1c14845cac6
X-Served-Region: us
Content-Length: 181

{"id":"acc_a97664a1-896d-492b-9d22-492d6538aa74","handle":"qa-d1c14845cac6","displayName":"QA d1c14845cac6","region":"us","role":"user","createdAt":"2026-11-18T10:19:37.933954499Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8c83f93e-7ec4-4808-a9a8-a658d6335968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c83f93e-7ec4-4808-a9a8-a658d6335968
Content-Type: application/json

--- request body ---
{"handle":"qa-40f7131f93e6","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c83f93e-7ec4-4808-a9a8-a658d6335968
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc4103d3-1b3d-46cc-a463-03984ee21b8d"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-428fcabe-1a6e-4996-b5ed-a5528bfdc5e2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9c8a8aa4fc05409c96093ea1bbba986d
X-Correlation-Id: qa-428fcabe-1a6e-4996-b5ed-a5528bfdc5e2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 40 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-428fcabe-1a6e-4996-b5ed-a5528bfdc5e2
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
Location: /v1/credits/purchases/pur_1ce6fe6c-7a8c-48ba-8076-c103ea05f271
Content-Length: 144

{"id":"pur_1ce6fe6c-7a8c-48ba-8076-c103ea05f271","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.062193018Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4c4dfe32-ef56-4f2a-a6bb-60857b812d0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c4dfe32-ef56-4f2a-a6bb-60857b812d0a
Content-Type: application/json

--- request body ---
{"handle":"qa-d1c14845cac6","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c4dfe32-ef56-4f2a-a6bb-60857b812d0a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a97664a1-896d-492b-9d22-492d6538aa74"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a378370b-c48c-4ba2-8042-2dbc705d1116

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9c8a8aa4fc05409c96093ea1bbba986d
X-Correlation-Id: qa-a378370b-c48c-4ba2-8042-2dbc705d1116
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a378370b-c48c-4ba2-8042-2dbc705d1116
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
Location: /v1/credits/purchases/pur_95758e56-666d-46a5-b11a-37c185b6d5e2
Content-Length: 144

{"id":"pur_95758e56-666d-46a5-b11a-37c185b6d5e2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.131486282Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ee6ba6a-91c6-45cc-ab20-d7e574fa9e6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ee6ba6a-91c6-45cc-ab20-d7e574fa9e6b
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ee6ba6a-91c6-45cc-ab20-d7e574fa9e6b
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
correlation: qa-f7a4ac15-9cff-4927-9626-e92a4ab3ca94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7a4ac15-9cff-4927-9626-e92a4ab3ca94
Content-Type: application/json

--- request body ---
{"handle":"qa-d1c14845cac6","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7a4ac15-9cff-4927-9626-e92a4ab3ca94
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7a4ac15-9cff-4927-9626-e92a4ab3ca94"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-73d9b927-f42e-4308-aa2a-f050cff8f362

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73d9b927-f42e-4308-aa2a-f050cff8f362
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-73d9b927-f42e-4308-aa2a-f050cff8f362
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
correlation: qa-bebfe408-86a0-4ae6-b96e-1890c2dc3b60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bebfe408-86a0-4ae6-b96e-1890c2dc3b60
Content-Type: application/json

--- request body ---
{"handle":"qa-40f7131f93e6","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bebfe408-86a0-4ae6-b96e-1890c2dc3b60
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bebfe408-86a0-4ae6-b96e-1890c2dc3b60"}
```
