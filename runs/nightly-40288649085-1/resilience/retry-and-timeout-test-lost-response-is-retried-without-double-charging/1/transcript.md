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
| 1 | `POST /v1/accounts` | 201 | 405 | `qa-bb11ff91-e064-4a1f-8a65-7bf7dbc1f208` |
| 2 | `POST /v1/auth/token` | 200 | 91 | `qa-48e468aa-9bb8-42a0-86b8-da1322f90f1b` |
| 3 | `POST /v1/credits/purchases` | 503 | 56 | `qa-511f92fc-03da-4c75-a542-fb6d1ef0d22b` |
| 4 | `POST /v1/credits/purchases` | 200 | 19 | `qa-9dc307be-baf6-4a27-9a0b-e65cf72397a8` |
| 5 | `GET /v1/credits/ledger` | 200 | 30 | `qa-b0729232-d3ca-4704-b35a-0d373fc04ea9` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-6f07b9d4-9c5a-40b1-8cd7-d3aa8d829b0a` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-4caf5b20-a1a2-4216-906b-4f08a62a5133` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb11ff91-e064-4a1f-8a65-7bf7dbc1f208

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb11ff91-e064-4a1f-8a65-7bf7dbc1f208
Content-Type: application/json

--- request body ---
{"handle":"qa-0a2f19e82b09","displayName":"QA 0a2f19e82b09","password":"****","region":"eu"}

--- response: 201 in 405 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb11ff91-e064-4a1f-8a65-7bf7dbc1f208
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
Location: /v1/accounts/qa-0a2f19e82b09
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c4e73c0-946c-490b-a7f7-fa8bd538e0f0","handle":"qa-0a2f19e82b09","displayName":"QA 0a2f19e82b09","region":"eu","role":"user","createdAt":"2026-10-26T07:54:42.592421976Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-48e468aa-9bb8-42a0-86b8-da1322f90f1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48e468aa-9bb8-42a0-86b8-da1322f90f1b
Content-Type: application/json

--- request body ---
{"handle":"qa-0a2f19e82b09","password":"****"}

--- response: 200 in 91 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-48e468aa-9bb8-42a0-86b8-da1322f90f1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c4e73c0-946c-490b-a7f7-fa8bd538e0f0"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-511f92fc-03da-4c75-a542-fb6d1ef0d22b

--- request headers ---
Accept: application/json
X-Fault-Key: 7c5c80ba-c4c1-40c7-8a0c-41bd99f285c4
X-Fault: drop-response
Idempotency-Key: qa-8881cca23da24813a0873a433a83a42a
X-Correlation-Id: qa-511f92fc-03da-4c75-a542-fb6d1ef0d22b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 56 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-511f92fc-03da-4c75-a542-fb6d1ef0d22b
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
Location: /v1/credits/purchases/pur_9240f973-2e2e-4f88-a7bb-a9e2be6cd16c
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-511f92fc-03da-4c75-a542-fb6d1ef0d22b"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9dc307be-baf6-4a27-9a0b-e65cf72397a8

--- request headers ---
Accept: application/json
X-Fault-Key: 7c5c80ba-c4c1-40c7-8a0c-41bd99f285c4
X-Fault: drop-response
Idempotency-Key: qa-8881cca23da24813a0873a433a83a42a
X-Correlation-Id: qa-9dc307be-baf6-4a27-9a0b-e65cf72397a8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dc307be-baf6-4a27-9a0b-e65cf72397a8
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
Location: /v1/credits/purchases/pur_9240f973-2e2e-4f88-a7bb-a9e2be6cd16c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_9240f973-2e2e-4f88-a7bb-a9e2be6cd16c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.202671733Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b0729232-d3ca-4704-b35a-0d373fc04ea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0729232-d3ca-4704-b35a-0d373fc04ea9
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0729232-d3ca-4704-b35a-0d373fc04ea9
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

{"items":[{"id":"led_5f6249de-6926-4629-b4e2-92c5c6a696af","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-26T07:54:42.592671643Z"},{"id":"led_7a1f2247-e6e7-4738-b786-96a0d2b07bee","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_9240f973-2e2e-4f88-a7bb-a9e2be6cd16c","createdAt":"2026-10-26T07:54:43.202671733Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f07b9d4-9c5a-40b1-8cd7-d3aa8d829b0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f07b9d4-9c5a-40b1-8cd7-d3aa8d829b0a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f07b9d4-9c5a-40b1-8cd7-d3aa8d829b0a
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
correlation: qa-4caf5b20-a1a2-4216-906b-4f08a62a5133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4caf5b20-a1a2-4216-906b-4f08a62a5133
Content-Type: application/json

--- request body ---
{"handle":"qa-0a2f19e82b09","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4caf5b20-a1a2-4216-906b-4f08a62a5133
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4caf5b20-a1a2-4216-906b-4f08a62a5133"}
```
