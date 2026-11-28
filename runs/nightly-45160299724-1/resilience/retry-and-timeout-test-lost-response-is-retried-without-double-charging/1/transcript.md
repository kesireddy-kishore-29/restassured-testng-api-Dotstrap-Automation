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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-c2e30655-101a-4e71-85df-3a7855c87362` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-228db496-1a31-489a-8770-07d037e7bcda` |
| 3 | `POST /v1/credits/purchases` | 503 | 12 | `qa-2c3905c8-b895-4b22-b2cb-8d2be00e38f5` |
| 4 | `POST /v1/credits/purchases` | 200 | 7 | `qa-11b30f11-0dea-4065-9980-40e9959422f9` |
| 5 | `GET /v1/credits/ledger` | 200 | 24 | `qa-4ebae471-2602-4e02-845d-b6e033320bd7` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-89ecfba9-6983-4e1c-a4ed-3b6f58fa473b` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-17889c08-65fa-4ea2-a781-004c837e34ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c2e30655-101a-4e71-85df-3a7855c87362

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2e30655-101a-4e71-85df-3a7855c87362
Content-Type: application/json

--- request body ---
{"handle":"qa-44df83e0b78a","displayName":"QA 44df83e0b78a","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2e30655-101a-4e71-85df-3a7855c87362
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
Location: /v1/accounts/qa-44df83e0b78a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b91469f-915f-4db0-840d-2b5706c1789d","handle":"qa-44df83e0b78a","displayName":"QA 44df83e0b78a","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.812104688Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-228db496-1a31-489a-8770-07d037e7bcda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-228db496-1a31-489a-8770-07d037e7bcda
Content-Type: application/json

--- request body ---
{"handle":"qa-44df83e0b78a","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-228db496-1a31-489a-8770-07d037e7bcda
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b91469f-915f-4db0-840d-2b5706c1789d"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2c3905c8-b895-4b22-b2cb-8d2be00e38f5

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-8b3ea601217948dbb644fc18a72b49ac
X-Fault-Key: 388863f0-aad2-4242-91ef-8e9a76eb3cd8
X-Correlation-Id: qa-2c3905c8-b895-4b22-b2cb-8d2be00e38f5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-2c3905c8-b895-4b22-b2cb-8d2be00e38f5
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
Location: /v1/credits/purchases/pur_a2fc4f73-2cc9-4886-aaeb-adfd3b9d9c67
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-2c3905c8-b895-4b22-b2cb-8d2be00e38f5"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-11b30f11-0dea-4065-9980-40e9959422f9

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-8b3ea601217948dbb644fc18a72b49ac
X-Fault-Key: 388863f0-aad2-4242-91ef-8e9a76eb3cd8
X-Correlation-Id: qa-11b30f11-0dea-4065-9980-40e9959422f9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-11b30f11-0dea-4065-9980-40e9959422f9
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
Location: /v1/credits/purchases/pur_a2fc4f73-2cc9-4886-aaeb-adfd3b9d9c67
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_a2fc4f73-2cc9-4886-aaeb-adfd3b9d9c67","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.886735394Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4ebae471-2602-4e02-845d-b6e033320bd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ebae471-2602-4e02-845d-b6e033320bd7
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ebae471-2602-4e02-845d-b6e033320bd7
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

{"items":[{"id":"led_b8700b25-9c5c-4ae4-aba2-32d9a71c5217","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-23T10:55:02.812117151Z"},{"id":"led_6f3d72f7-d66c-4784-b465-1e82fa529c44","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_a2fc4f73-2cc9-4886-aaeb-adfd3b9d9c67","createdAt":"2026-11-23T10:55:02.886735394Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89ecfba9-6983-4e1c-a4ed-3b6f58fa473b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89ecfba9-6983-4e1c-a4ed-3b6f58fa473b
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89ecfba9-6983-4e1c-a4ed-3b6f58fa473b
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
correlation: qa-17889c08-65fa-4ea2-a781-004c837e34ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17889c08-65fa-4ea2-a781-004c837e34ff
Content-Type: application/json

--- request body ---
{"handle":"qa-44df83e0b78a","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17889c08-65fa-4ea2-a781-004c837e34ff
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-17889c08-65fa-4ea2-a781-004c837e34ff"}
```
