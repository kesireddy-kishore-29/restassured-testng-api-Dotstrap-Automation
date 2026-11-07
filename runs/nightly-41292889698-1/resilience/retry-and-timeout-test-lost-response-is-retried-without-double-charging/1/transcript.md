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
| 1 | `POST /v1/accounts` | 201 | 487 | `qa-a449348d-a29b-48bd-8644-84f77b34c32e` |
| 2 | `POST /v1/auth/token` | 200 | 91 | `qa-63cc2bbd-67d3-475d-abe0-527eb09a7a45` |
| 3 | `POST /v1/credits/purchases` | 503 | 136 | `qa-7ce3f891-267e-49f2-a3c9-e1208473293f` |
| 4 | `POST /v1/credits/purchases` | 200 | 13 | `qa-7da4cfa5-2017-4f4f-873d-2d635c4ed124` |
| 5 | `GET /v1/credits/ledger` | 200 | 41 | `qa-23abe39f-472c-4154-8235-2b3e0b946496` |
| 6 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-3b1150db-7989-4729-8bea-404afe4216eb` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-248b3851-acbd-4d2c-9b0e-bf1d73ae982d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a449348d-a29b-48bd-8644-84f77b34c32e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a449348d-a29b-48bd-8644-84f77b34c32e
Content-Type: application/json

--- request body ---
{"handle":"qa-5fc3caf5c9f6","displayName":"QA 5fc3caf5c9f6","password":"****","region":"eu"}

--- response: 201 in 487 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-a449348d-a29b-48bd-8644-84f77b34c32e
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
Location: /v1/accounts/qa-5fc3caf5c9f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4ddbee6-84ef-4287-a72f-baf8758c4eb3","handle":"qa-5fc3caf5c9f6","displayName":"QA 5fc3caf5c9f6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:29.281702151Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-63cc2bbd-67d3-475d-abe0-527eb09a7a45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63cc2bbd-67d3-475d-abe0-527eb09a7a45
Content-Type: application/json

--- request body ---
{"handle":"qa-5fc3caf5c9f6","password":"****"}

--- response: 200 in 91 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-63cc2bbd-67d3-475d-abe0-527eb09a7a45
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4ddbee6-84ef-4287-a72f-baf8758c4eb3"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7ce3f891-267e-49f2-a3c9-e1208473293f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-75eedadbfb404205a7b8f9f42b412b3c
X-Fault-Key: d976b132-1d0d-4ca6-b2d8-0a5ac30838f8
X-Fault: drop-response
X-Correlation-Id: qa-7ce3f891-267e-49f2-a3c9-e1208473293f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 136 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-7ce3f891-267e-49f2-a3c9-e1208473293f
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
Location: /v1/credits/purchases/pur_2efa0c4b-f89d-436c-bff8-d8b8c70ac93c
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-7ce3f891-267e-49f2-a3c9-e1208473293f"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7da4cfa5-2017-4f4f-873d-2d635c4ed124

--- request headers ---
Accept: application/json
Idempotency-Key: qa-75eedadbfb404205a7b8f9f42b412b3c
X-Fault-Key: d976b132-1d0d-4ca6-b2d8-0a5ac30838f8
X-Fault: drop-response
X-Correlation-Id: qa-7da4cfa5-2017-4f4f-873d-2d635c4ed124
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-7da4cfa5-2017-4f4f-873d-2d635c4ed124
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
Location: /v1/credits/purchases/pur_2efa0c4b-f89d-436c-bff8-d8b8c70ac93c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_2efa0c4b-f89d-436c-bff8-d8b8c70ac93c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.044476727Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-23abe39f-472c-4154-8235-2b3e0b946496

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23abe39f-472c-4154-8235-2b3e0b946496
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-23abe39f-472c-4154-8235-2b3e0b946496
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

{"items":[{"id":"led_62f6a52f-fd94-4709-8564-0a54b7dd7495","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-01T09:23:29.282037168Z"},{"id":"led_856243a7-d8a0-4078-a8c3-c27f4e4ffd99","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_2efa0c4b-f89d-436c-bff8-d8b8c70ac93c","createdAt":"2026-11-01T09:23:30.044476727Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b1150db-7989-4729-8bea-404afe4216eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b1150db-7989-4729-8bea-404afe4216eb
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b1150db-7989-4729-8bea-404afe4216eb
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
correlation: qa-248b3851-acbd-4d2c-9b0e-bf1d73ae982d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-248b3851-acbd-4d2c-9b0e-bf1d73ae982d
Content-Type: application/json

--- request body ---
{"handle":"qa-5fc3caf5c9f6","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-248b3851-acbd-4d2c-9b0e-bf1d73ae982d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-248b3851-acbd-4d2c-9b0e-bf1d73ae982d"}
```
