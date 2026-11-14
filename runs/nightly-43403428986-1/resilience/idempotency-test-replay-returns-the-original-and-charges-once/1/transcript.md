# Transcript: Same key + same body replays the original purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 380 | `qa-b614fbb0-cbad-4cc8-ab6f-8574fca6e97e` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-1610da2e-3c28-4cf2-8c43-d2ca5d6b2cb4` |
| 3 | `POST /v1/credits/purchases` | 201 | 54 | `qa-da4b3664-8899-44c2-a8f2-e21479eda9c7` |
| 4 | `POST /v1/credits/purchases` | 200 | 17 | `qa-baa5bba3-3a55-4e4a-937a-8eadb35b1980` |
| 5 | `GET /v1/credits/balance` | 200 | 38 | `qa-89f4ee4c-e2bb-47eb-9a31-0c41a38c1bb1` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-25412bd7-303a-476c-a56c-b795ffa6c7e4` |
| 7 | `POST /v1/auth/token` | 401 | 11 | `qa-9c172cd7-1a89-46fe-9b85-89ba7eea7e33` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b614fbb0-cbad-4cc8-ab6f-8574fca6e97e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b614fbb0-cbad-4cc8-ab6f-8574fca6e97e
Content-Type: application/json

--- request body ---
{"handle":"qa-6af2a38799e9","displayName":"QA 6af2a38799e9","password":"****","region":"eu"}

--- response: 201 in 380 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b614fbb0-cbad-4cc8-ab6f-8574fca6e97e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-6af2a38799e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a01bd545-3667-4c35-a675-d15c63093c8d","handle":"qa-6af2a38799e9","displayName":"QA 6af2a38799e9","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.469762595Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1610da2e-3c28-4cf2-8c43-d2ca5d6b2cb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1610da2e-3c28-4cf2-8c43-d2ca5d6b2cb4
Content-Type: application/json

--- request body ---
{"handle":"qa-6af2a38799e9","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1610da2e-3c28-4cf2-8c43-d2ca5d6b2cb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a01bd545-3667-4c35-a675-d15c63093c8d"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-da4b3664-8899-44c2-a8f2-e21479eda9c7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4cc8b51297a5478ca5b59a94a7869a2d
X-Correlation-Id: qa-da4b3664-8899-44c2-a8f2-e21479eda9c7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-da4b3664-8899-44c2-a8f2-e21479eda9c7
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
Location: /v1/credits/purchases/pur_aa514b69-6d61-44ee-b315-ed0b6cb5216b
Content-Length: 144

{"id":"pur_aa514b69-6d61-44ee-b315-ed0b6cb5216b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.008205090Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-baa5bba3-3a55-4e4a-937a-8eadb35b1980

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4cc8b51297a5478ca5b59a94a7869a2d
X-Correlation-Id: qa-baa5bba3-3a55-4e4a-937a-8eadb35b1980
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-baa5bba3-3a55-4e4a-937a-8eadb35b1980
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
Location: /v1/credits/purchases/pur_aa514b69-6d61-44ee-b315-ed0b6cb5216b
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_aa514b69-6d61-44ee-b315-ed0b6cb5216b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.008205090Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-89f4ee4c-e2bb-47eb-9a31-0c41a38c1bb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89f4ee4c-e2bb-47eb-9a31-0c41a38c1bb1
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-89f4ee4c-e2bb-47eb-9a31-0c41a38c1bb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_a01bd545-3667-4c35-a675-d15c63093c8d"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25412bd7-303a-476c-a56c-b795ffa6c7e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25412bd7-303a-476c-a56c-b795ffa6c7e4
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25412bd7-303a-476c-a56c-b795ffa6c7e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-9c172cd7-1a89-46fe-9b85-89ba7eea7e33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c172cd7-1a89-46fe-9b85-89ba7eea7e33
Content-Type: application/json

--- request body ---
{"handle":"qa-6af2a38799e9","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c172cd7-1a89-46fe-9b85-89ba7eea7e33
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c172cd7-1a89-46fe-9b85-89ba7eea7e33"}
```
