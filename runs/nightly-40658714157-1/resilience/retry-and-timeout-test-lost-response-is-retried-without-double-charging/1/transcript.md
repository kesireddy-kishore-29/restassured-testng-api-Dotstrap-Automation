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
| 1 | `POST /v1/accounts` | 201 | 301 | `qa-71655884-7ac8-44ec-a281-a4aaaa3ca0f3` |
| 2 | `POST /v1/auth/token` | 200 | 66 | `qa-d68a1acd-7547-48b2-9504-81e9d3761727` |
| 3 | `POST /v1/credits/purchases` | 503 | 65 | `qa-b25d85f3-6efe-4caf-a46a-ee77722d9645` |
| 4 | `POST /v1/credits/purchases` | 200 | 6 | `qa-2cf094aa-a429-46f8-8449-103ce9edfda3` |
| 5 | `GET /v1/credits/ledger` | 200 | 14 | `qa-bbb4d793-212f-420c-9eb6-6a80bc3c00c9` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-262895dc-e3ca-4fe8-a88d-39d298e2069e` |
| 7 | `POST /v1/auth/token` | 401 | 3 | `qa-1ebce477-272f-4e9c-90af-b4b9da531a04` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-71655884-7ac8-44ec-a281-a4aaaa3ca0f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71655884-7ac8-44ec-a281-a4aaaa3ca0f3
Content-Type: application/json

--- request body ---
{"handle":"qa-ef11d3e62702","displayName":"QA ef11d3e62702","password":"****","region":"eu"}

--- response: 201 in 301 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-71655884-7ac8-44ec-a281-a4aaaa3ca0f3
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
Location: /v1/accounts/qa-ef11d3e62702
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2a5eec8-0b9d-4501-9e40-9c106f4dbf10","handle":"qa-ef11d3e62702","displayName":"QA ef11d3e62702","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.303972010Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d68a1acd-7547-48b2-9504-81e9d3761727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d68a1acd-7547-48b2-9504-81e9d3761727
Content-Type: application/json

--- request body ---
{"handle":"qa-ef11d3e62702","password":"****"}

--- response: 200 in 66 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d68a1acd-7547-48b2-9504-81e9d3761727
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2a5eec8-0b9d-4501-9e40-9c106f4dbf10"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b25d85f3-6efe-4caf-a46a-ee77722d9645

--- request headers ---
Accept: application/json
X-Fault-Key: 05c62cd2-e9a7-4d4c-b0ed-1eb735cc6d4e
X-Fault: drop-response
Idempotency-Key: qa-ffc19369eae345e087b97639545e0a45
X-Correlation-Id: qa-b25d85f3-6efe-4caf-a46a-ee77722d9645
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 65 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-b25d85f3-6efe-4caf-a46a-ee77722d9645
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
Location: /v1/credits/purchases/pur_b0b48d90-20dd-4748-8ca4-4769ae6c4ccb
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-b25d85f3-6efe-4caf-a46a-ee77722d9645"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2cf094aa-a429-46f8-8449-103ce9edfda3

--- request headers ---
Accept: application/json
X-Fault-Key: 05c62cd2-e9a7-4d4c-b0ed-1eb735cc6d4e
X-Fault: drop-response
Idempotency-Key: qa-ffc19369eae345e087b97639545e0a45
X-Correlation-Id: qa-2cf094aa-a429-46f8-8449-103ce9edfda3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cf094aa-a429-46f8-8449-103ce9edfda3
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
Location: /v1/credits/purchases/pur_b0b48d90-20dd-4748-8ca4-4769ae6c4ccb
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_b0b48d90-20dd-4748-8ca4-4769ae6c4ccb","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:51.761381647Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-bbb4d793-212f-420c-9eb6-6a80bc3c00c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbb4d793-212f-420c-9eb6-6a80bc3c00c9
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbb4d793-212f-420c-9eb6-6a80bc3c00c9
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

{"items":[{"id":"led_8a9a017e-71d4-4c7d-8ab5-2cf9c8702cf1","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-28T08:42:51.303986947Z"},{"id":"led_a2a3969c-c2f9-4183-aeb0-0868ebb3159f","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_b0b48d90-20dd-4748-8ca4-4769ae6c4ccb","createdAt":"2026-10-28T08:42:51.761381647Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-262895dc-e3ca-4fe8-a88d-39d298e2069e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-262895dc-e3ca-4fe8-a88d-39d298e2069e
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-262895dc-e3ca-4fe8-a88d-39d298e2069e
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
correlation: qa-1ebce477-272f-4e9c-90af-b4b9da531a04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ebce477-272f-4e9c-90af-b4b9da531a04
Content-Type: application/json

--- request body ---
{"handle":"qa-ef11d3e62702","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ebce477-272f-4e9c-90af-b4b9da531a04
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ebce477-272f-4e9c-90af-b4b9da531a04"}
```
