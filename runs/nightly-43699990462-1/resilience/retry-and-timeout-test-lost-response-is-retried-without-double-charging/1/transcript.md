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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-dada3d21-3e8a-451e-b37c-4dcf3dd107a7` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-1623b242-4144-4ccc-a156-62aba176ff84` |
| 3 | `POST /v1/credits/purchases` | 503 | 12 | `qa-18447b08-cf76-42a4-8e2e-9aa2368689f6` |
| 4 | `POST /v1/credits/purchases` | 200 | 11 | `qa-e50bd642-73f9-47ce-ad7d-721de9c17e32` |
| 5 | `GET /v1/credits/ledger` | 200 | 20 | `qa-32defd9a-e5e5-48c0-acd5-a4abe23cbc9b` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-2c2a371c-9357-4e48-97ea-e20ea0f9cc6f` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-93b9708f-4c95-4c5c-b2eb-f00959617428` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dada3d21-3e8a-451e-b37c-4dcf3dd107a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dada3d21-3e8a-451e-b37c-4dcf3dd107a7
Content-Type: application/json

--- request body ---
{"handle":"qa-2506467d2fcc","displayName":"QA 2506467d2fcc","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-dada3d21-3e8a-451e-b37c-4dcf3dd107a7
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
Location: /v1/accounts/qa-2506467d2fcc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c12dcad-0130-4cf1-ac7c-9aff856928ff","handle":"qa-2506467d2fcc","displayName":"QA 2506467d2fcc","region":"eu","role":"user","createdAt":"2026-11-15T09:36:14.610337640Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1623b242-4144-4ccc-a156-62aba176ff84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1623b242-4144-4ccc-a156-62aba176ff84
Content-Type: application/json

--- request body ---
{"handle":"qa-2506467d2fcc","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-1623b242-4144-4ccc-a156-62aba176ff84
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c12dcad-0130-4cf1-ac7c-9aff856928ff"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-18447b08-cf76-42a4-8e2e-9aa2368689f6

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-d9dd49839b0b454cb90f50e74a0db5cc
X-Fault-Key: c9a700ec-a055-4aeb-8314-91c97e4a3834
X-Correlation-Id: qa-18447b08-cf76-42a4-8e2e-9aa2368689f6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-18447b08-cf76-42a4-8e2e-9aa2368689f6
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
Location: /v1/credits/purchases/pur_decd9930-00b8-45d8-adea-58f6d4addce4
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-18447b08-cf76-42a4-8e2e-9aa2368689f6"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e50bd642-73f9-47ce-ad7d-721de9c17e32

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-d9dd49839b0b454cb90f50e74a0db5cc
X-Fault-Key: c9a700ec-a055-4aeb-8314-91c97e4a3834
X-Correlation-Id: qa-e50bd642-73f9-47ce-ad7d-721de9c17e32
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e50bd642-73f9-47ce-ad7d-721de9c17e32
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
Location: /v1/credits/purchases/pur_decd9930-00b8-45d8-adea-58f6d4addce4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_decd9930-00b8-45d8-adea-58f6d4addce4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.667587798Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-32defd9a-e5e5-48c0-acd5-a4abe23cbc9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32defd9a-e5e5-48c0-acd5-a4abe23cbc9b
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-32defd9a-e5e5-48c0-acd5-a4abe23cbc9b
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

{"items":[{"id":"led_cff1e360-35ef-43df-853d-1ccc234221a8","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-15T09:36:14.610345655Z"},{"id":"led_805a4a62-dd8c-4f16-9c32-888571c71c8d","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_decd9930-00b8-45d8-adea-58f6d4addce4","createdAt":"2026-11-15T09:36:14.667587798Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c2a371c-9357-4e48-97ea-e20ea0f9cc6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c2a371c-9357-4e48-97ea-e20ea0f9cc6f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c2a371c-9357-4e48-97ea-e20ea0f9cc6f
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
correlation: qa-93b9708f-4c95-4c5c-b2eb-f00959617428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93b9708f-4c95-4c5c-b2eb-f00959617428
Content-Type: application/json

--- request body ---
{"handle":"qa-2506467d2fcc","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93b9708f-4c95-4c5c-b2eb-f00959617428
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93b9708f-4c95-4c5c-b2eb-f00959617428"}
```
