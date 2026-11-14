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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-3ec629e6-4235-4949-9b32-154619a00294` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-59578b29-fdde-448d-8051-0f0f89032093` |
| 3 | `POST /v1/credits/purchases` | 503 | 10 | `qa-ac66e700-d3a2-4f65-b780-fa0120a84a57` |
| 4 | `POST /v1/credits/purchases` | 200 | 13 | `qa-e428a6a2-208f-42ba-9657-2e41f06c8f97` |
| 5 | `GET /v1/credits/ledger` | 200 | 28 | `qa-84fb851e-9ceb-4379-8928-57bc57db5d95` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9a612102-55d4-4e75-9f9e-0756a6f31572` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-065ce6e3-2c9c-4ce8-be8c-31f2dc7493a6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ec629e6-4235-4949-9b32-154619a00294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ec629e6-4235-4949-9b32-154619a00294
Content-Type: application/json

--- request body ---
{"handle":"qa-54e91f52ced6","displayName":"QA 54e91f52ced6","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ec629e6-4235-4949-9b32-154619a00294
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-54e91f52ced6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_edc4255c-d4a0-4211-8ebc-f5ab684a15f0","handle":"qa-54e91f52ced6","displayName":"QA 54e91f52ced6","region":"eu","role":"user","createdAt":"2026-11-08T09:09:12.738006165Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-59578b29-fdde-448d-8051-0f0f89032093

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59578b29-fdde-448d-8051-0f0f89032093
Content-Type: application/json

--- request body ---
{"handle":"qa-54e91f52ced6","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-59578b29-fdde-448d-8051-0f0f89032093
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edc4255c-d4a0-4211-8ebc-f5ab684a15f0"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ac66e700-d3a2-4f65-b780-fa0120a84a57

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a5d87024e4e64b3bb1776950e6cd5b7f
X-Fault: drop-response
X-Fault-Key: 1d45b5df-1db6-49bd-ba39-54be1652c57c
X-Correlation-Id: qa-ac66e700-d3a2-4f65-b780-fa0120a84a57
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-ac66e700-d3a2-4f65-b780-fa0120a84a57
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
Location: /v1/credits/purchases/pur_56fb9ff3-98b7-4cff-bd4b-28aff620ab82
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-ac66e700-d3a2-4f65-b780-fa0120a84a57"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e428a6a2-208f-42ba-9657-2e41f06c8f97

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a5d87024e4e64b3bb1776950e6cd5b7f
X-Fault: drop-response
X-Fault-Key: 1d45b5df-1db6-49bd-ba39-54be1652c57c
X-Correlation-Id: qa-e428a6a2-208f-42ba-9657-2e41f06c8f97
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-e428a6a2-208f-42ba-9657-2e41f06c8f97
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
Location: /v1/credits/purchases/pur_56fb9ff3-98b7-4cff-bd4b-28aff620ab82
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_56fb9ff3-98b7-4cff-bd4b-28aff620ab82","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.797112690Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-84fb851e-9ceb-4379-8928-57bc57db5d95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84fb851e-9ceb-4379-8928-57bc57db5d95
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-84fb851e-9ceb-4379-8928-57bc57db5d95
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

{"items":[{"id":"led_ec48eab2-eaba-4251-8130-0dca51a4cbe4","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-08T09:09:12.738016153Z"},{"id":"led_f8be8f56-5d5e-490e-b3f0-eaa21a3b28e0","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_56fb9ff3-98b7-4cff-bd4b-28aff620ab82","createdAt":"2026-11-08T09:09:12.797112690Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a612102-55d4-4e75-9f9e-0756a6f31572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a612102-55d4-4e75-9f9e-0756a6f31572
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a612102-55d4-4e75-9f9e-0756a6f31572
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
correlation: qa-065ce6e3-2c9c-4ce8-be8c-31f2dc7493a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-065ce6e3-2c9c-4ce8-be8c-31f2dc7493a6
Content-Type: application/json

--- request body ---
{"handle":"qa-54e91f52ced6","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-065ce6e3-2c9c-4ce8-be8c-31f2dc7493a6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-065ce6e3-2c9c-4ce8-be8c-31f2dc7493a6"}
```
