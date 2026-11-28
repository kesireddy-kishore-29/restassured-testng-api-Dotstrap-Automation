# Transcript: A lost response is retried with the same key and the purchase is charged once

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#lostResponseIsRetriedWithoutDoubleCharging` |
| Features | FEAT-RES-01, FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-631fb6aa-9bcd-4c7f-bbd0-190350224a28` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-e38cad31-bc39-414b-9e51-d9a3059d3ea3` |
| 3 | `POST /v1/credits/purchases` | 503 | 10 | `qa-1f218b34-9108-4552-98ca-ee0981336db6` |
| 4 | `POST /v1/credits/purchases` | 200 | 7 | `qa-200c5b2c-4838-4cf3-b555-464c5f2dfd6c` |
| 5 | `GET /v1/credits/ledger` | 200 | 25 | `qa-9fcb7567-5a0c-4b5b-a32e-5543a1a9e95c` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-46f589bf-f159-4e1a-9536-4aabed17461b` |
| 7 | `POST /v1/auth/token` | 401 | 3 | `qa-7c3e6ef4-b554-4ab9-b5e5-45aab8900517` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-631fb6aa-9bcd-4c7f-bbd0-190350224a28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-631fb6aa-9bcd-4c7f-bbd0-190350224a28
Content-Type: application/json

--- request body ---
{"handle":"qa-d3b1b48cb265","displayName":"QA d3b1b48cb265","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-631fb6aa-9bcd-4c7f-bbd0-190350224a28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-d3b1b48cb265
X-Served-Region: eu
Content-Length: 181

{"id":"acc_513b74a4-810c-43f4-969c-2ed90329ed95","handle":"qa-d3b1b48cb265","displayName":"QA d3b1b48cb265","region":"eu","role":"user","createdAt":"2026-11-24T12:37:59.640211678Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e38cad31-bc39-414b-9e51-d9a3059d3ea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e38cad31-bc39-414b-9e51-d9a3059d3ea3
Content-Type: application/json

--- request body ---
{"handle":"qa-d3b1b48cb265","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e38cad31-bc39-414b-9e51-d9a3059d3ea3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_513b74a4-810c-43f4-969c-2ed90329ed95"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1f218b34-9108-4552-98ca-ee0981336db6

--- request headers ---
Accept: application/json
X-Fault-Key: 6de6a5d8-49f7-47ec-93cb-47e40627f8fb
Idempotency-Key: qa-e502f70cdb33421fa5c8a66712c22d09
X-Fault: drop-response
X-Correlation-Id: qa-1f218b34-9108-4552-98ca-ee0981336db6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 10 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-1f218b34-9108-4552-98ca-ee0981336db6
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
Location: /v1/credits/purchases/pur_48abc5e4-6c68-4ab3-808c-f5ccbd2ff777
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-1f218b34-9108-4552-98ca-ee0981336db6"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-200c5b2c-4838-4cf3-b555-464c5f2dfd6c

--- request headers ---
Accept: application/json
X-Fault-Key: 6de6a5d8-49f7-47ec-93cb-47e40627f8fb
Idempotency-Key: qa-e502f70cdb33421fa5c8a66712c22d09
X-Fault: drop-response
X-Correlation-Id: qa-200c5b2c-4838-4cf3-b555-464c5f2dfd6c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-200c5b2c-4838-4cf3-b555-464c5f2dfd6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
Location: /v1/credits/purchases/pur_48abc5e4-6c68-4ab3-808c-f5ccbd2ff777
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_48abc5e4-6c68-4ab3-808c-f5ccbd2ff777","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.689821181Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9fcb7567-5a0c-4b5b-a32e-5543a1a9e95c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fcb7567-5a0c-4b5b-a32e-5543a1a9e95c
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fcb7567-5a0c-4b5b-a32e-5543a1a9e95c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 398

{"items":[{"id":"led_d90af4ad-9ff7-4d13-8b2e-650f05b819f2","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-24T12:37:59.640222334Z"},{"id":"led_44c1d02b-4414-48b7-98b7-929cd983a568","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_48abc5e4-6c68-4ab3-808c-f5ccbd2ff777","createdAt":"2026-11-24T12:37:59.689821181Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46f589bf-f159-4e1a-9536-4aabed17461b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46f589bf-f159-4e1a-9536-4aabed17461b
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46f589bf-f159-4e1a-9536-4aabed17461b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 9
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-7c3e6ef4-b554-4ab9-b5e5-45aab8900517

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c3e6ef4-b554-4ab9-b5e5-45aab8900517
Content-Type: application/json

--- request body ---
{"handle":"qa-d3b1b48cb265","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c3e6ef4-b554-4ab9-b5e5-45aab8900517
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c3e6ef4-b554-4ab9-b5e5-45aab8900517"}
```
