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
| 1 | `POST /v1/accounts` | 201 | 257 | `qa-517c8bab-ff79-46e7-8c03-81c8a408c78a` |
| 2 | `POST /v1/auth/token` | 200 | 52 | `qa-cdbcbc09-d1b6-4709-bcb3-6a9e66930e2b` |
| 3 | `POST /v1/credits/purchases` | 503 | 63 | `qa-a8ac8e4b-e9a9-4ec1-b599-586c49a682bc` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-35354010-42b8-4b08-918b-4322c10e8324` |
| 5 | `GET /v1/credits/ledger` | 200 | 10 | `qa-13b69ac8-83fd-40bc-8029-1574df88c418` |
| 6 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-f34fde28-9517-45df-99a0-2a135f560f26` |
| 7 | `POST /v1/auth/token` | 401 | 3 | `qa-9b5061a9-dceb-4836-a991-99344b16ada9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-517c8bab-ff79-46e7-8c03-81c8a408c78a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-517c8bab-ff79-46e7-8c03-81c8a408c78a
Content-Type: application/json

--- request body ---
{"handle":"qa-aa0688da9c9f","displayName":"QA aa0688da9c9f","password":"****","region":"eu"}

--- response: 201 in 257 ms ---
Date: Tue, 27 Oct 2026 08:00:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-517c8bab-ff79-46e7-8c03-81c8a408c78a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-aa0688da9c9f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee0815a8-8abc-4cfb-b708-b25beac15446","handle":"qa-aa0688da9c9f","displayName":"QA aa0688da9c9f","region":"eu","role":"user","createdAt":"2026-10-27T08:00:18.915154263Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cdbcbc09-d1b6-4709-bcb3-6a9e66930e2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdbcbc09-d1b6-4709-bcb3-6a9e66930e2b
Content-Type: application/json

--- request body ---
{"handle":"qa-aa0688da9c9f","password":"****"}

--- response: 200 in 52 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdbcbc09-d1b6-4709-bcb3-6a9e66930e2b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee0815a8-8abc-4cfb-b708-b25beac15446"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a8ac8e4b-e9a9-4ec1-b599-586c49a682bc

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-56553bdc88c145b18e8a1a5597d9c2bf
X-Fault-Key: 2f5f032c-ef8b-4cc0-b9ef-8c4df39d0b9f
X-Correlation-Id: qa-a8ac8e4b-e9a9-4ec1-b599-586c49a682bc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 63 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-a8ac8e4b-e9a9-4ec1-b599-586c49a682bc
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
Location: /v1/credits/purchases/pur_a83c3e62-a2f5-4e97-8da5-6885a214ad2e
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-a8ac8e4b-e9a9-4ec1-b599-586c49a682bc"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-35354010-42b8-4b08-918b-4322c10e8324

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-56553bdc88c145b18e8a1a5597d9c2bf
X-Fault-Key: 2f5f032c-ef8b-4cc0-b9ef-8c4df39d0b9f
X-Correlation-Id: qa-35354010-42b8-4b08-918b-4322c10e8324
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-35354010-42b8-4b08-918b-4322c10e8324
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
Location: /v1/credits/purchases/pur_a83c3e62-a2f5-4e97-8da5-6885a214ad2e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_a83c3e62-a2f5-4e97-8da5-6885a214ad2e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.315108470Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-13b69ac8-83fd-40bc-8029-1574df88c418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b69ac8-83fd-40bc-8029-1574df88c418
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-13b69ac8-83fd-40bc-8029-1574df88c418
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

{"items":[{"id":"led_c29243dc-44d3-4193-976a-82b53be39a63","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-27T08:00:18.915356447Z"},{"id":"led_198b28c7-7e1d-4082-baea-ab020a602d42","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_a83c3e62-a2f5-4e97-8da5-6885a214ad2e","createdAt":"2026-10-27T08:00:19.315108470Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f34fde28-9517-45df-99a0-2a135f560f26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f34fde28-9517-45df-99a0-2a135f560f26
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f34fde28-9517-45df-99a0-2a135f560f26
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
correlation: qa-9b5061a9-dceb-4836-a991-99344b16ada9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b5061a9-dceb-4836-a991-99344b16ada9
Content-Type: application/json

--- request body ---
{"handle":"qa-aa0688da9c9f","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b5061a9-dceb-4836-a991-99344b16ada9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b5061a9-dceb-4836-a991-99344b16ada9"}
```
