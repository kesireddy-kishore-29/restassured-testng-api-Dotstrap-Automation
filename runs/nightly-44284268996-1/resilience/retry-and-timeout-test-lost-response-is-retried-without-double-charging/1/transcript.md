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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-1f207084-b0ea-467c-bbc4-0d2d0f0c4194` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-e2aadb04-accc-4bd6-a722-f74d34049482` |
| 3 | `POST /v1/credits/purchases` | 503 | 13 | `qa-fda51f72-2e04-4aa0-a335-1b88ef5d187c` |
| 4 | `POST /v1/credits/purchases` | 200 | 5 | `qa-2def4ab0-a5ac-4427-9e8a-b39afa5620fc` |
| 5 | `GET /v1/credits/ledger` | 200 | 18 | `qa-b7a9ef7d-957d-4044-929b-e28a01d79709` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-97328157-7d12-4f29-bb7c-f91cc676a9e6` |
| 7 | `POST /v1/auth/token` | 401 | 4 | `qa-78918e1a-c601-4ca5-a47d-e383c6ca0cca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1f207084-b0ea-467c-bbc4-0d2d0f0c4194

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f207084-b0ea-467c-bbc4-0d2d0f0c4194
Content-Type: application/json

--- request body ---
{"handle":"qa-ca3edb4994d7","displayName":"QA ca3edb4994d7","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f207084-b0ea-467c-bbc4-0d2d0f0c4194
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-ca3edb4994d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c12f7526-f3b6-430a-bcf9-747d693f6869","handle":"qa-ca3edb4994d7","displayName":"QA ca3edb4994d7","region":"eu","role":"user","createdAt":"2026-11-18T10:19:38.447758663Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e2aadb04-accc-4bd6-a722-f74d34049482

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2aadb04-accc-4bd6-a722-f74d34049482
Content-Type: application/json

--- request body ---
{"handle":"qa-ca3edb4994d7","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2aadb04-accc-4bd6-a722-f74d34049482
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c12f7526-f3b6-430a-bcf9-747d693f6869"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fda51f72-2e04-4aa0-a335-1b88ef5d187c

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-cea501b75ea24770be278d2b672878ff
X-Fault-Key: 6e69f49b-842e-44b8-b5c5-dcd47b69be4b
X-Correlation-Id: qa-fda51f72-2e04-4aa0-a335-1b88ef5d187c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-fda51f72-2e04-4aa0-a335-1b88ef5d187c
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
Location: /v1/credits/purchases/pur_eb7fee2f-2db4-45a3-86ce-6b92d6f9f848
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-fda51f72-2e04-4aa0-a335-1b88ef5d187c"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2def4ab0-a5ac-4427-9e8a-b39afa5620fc

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-cea501b75ea24770be278d2b672878ff
X-Fault-Key: 6e69f49b-842e-44b8-b5c5-dcd47b69be4b
X-Correlation-Id: qa-2def4ab0-a5ac-4427-9e8a-b39afa5620fc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-2def4ab0-a5ac-4427-9e8a-b39afa5620fc
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
Location: /v1/credits/purchases/pur_eb7fee2f-2db4-45a3-86ce-6b92d6f9f848
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_eb7fee2f-2db4-45a3-86ce-6b92d6f9f848","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.520085545Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b7a9ef7d-957d-4044-929b-e28a01d79709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7a9ef7d-957d-4044-929b-e28a01d79709
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7a9ef7d-957d-4044-929b-e28a01d79709
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

{"items":[{"id":"led_c51cbae1-ca77-4f9e-933b-f92da07da2b0","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-18T10:19:38.447775158Z"},{"id":"led_d064e12a-1616-4a4e-9a22-e53d1159866a","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_eb7fee2f-2db4-45a3-86ce-6b92d6f9f848","createdAt":"2026-11-18T10:19:38.520085545Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97328157-7d12-4f29-bb7c-f91cc676a9e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97328157-7d12-4f29-bb7c-f91cc676a9e6
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97328157-7d12-4f29-bb7c-f91cc676a9e6
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
correlation: qa-78918e1a-c601-4ca5-a47d-e383c6ca0cca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78918e1a-c601-4ca5-a47d-e383c6ca0cca
Content-Type: application/json

--- request body ---
{"handle":"qa-ca3edb4994d7","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78918e1a-c601-4ca5-a47d-e383c6ca0cca
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78918e1a-c601-4ca5-a47d-e383c6ca0cca"}
```
