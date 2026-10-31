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
| 1 | `POST /v1/accounts` | 201 | 381 | `qa-a84f59ca-2677-4ea8-8cd1-baf78f43d444` |
| 2 | `POST /v1/auth/token` | 200 | 80 | `qa-27af3083-ef11-40c9-bcae-fec3a4c7d07a` |
| 3 | `POST /v1/credits/purchases` | 503 | 126 | `qa-2e546f3e-40c8-41b1-baab-635c8c0cc239` |
| 4 | `POST /v1/credits/purchases` | 200 | 19 | `qa-a5d86e17-babe-4e64-b3c3-53dbc035c311` |
| 5 | `GET /v1/credits/ledger` | 200 | 33 | `qa-e6e94c0b-f60b-4325-bf29-bcfa7bb607bd` |
| 6 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-09a25d18-5af6-4e73-8ac8-3b92393d183e` |
| 7 | `POST /v1/auth/token` | 401 | 12 | `qa-7dc3228e-1c52-42b2-9536-0affa3b319f7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a84f59ca-2677-4ea8-8cd1-baf78f43d444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a84f59ca-2677-4ea8-8cd1-baf78f43d444
Content-Type: application/json

--- request body ---
{"handle":"qa-4f6b354d4c8e","displayName":"QA 4f6b354d4c8e","password":"****","region":"eu"}

--- response: 201 in 381 ms ---
Date: Fri, 23 Oct 2026 07:41:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a84f59ca-2677-4ea8-8cd1-baf78f43d444
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
Location: /v1/accounts/qa-4f6b354d4c8e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d0da7b9-5e44-4c38-8610-0551ed4961ba","handle":"qa-4f6b354d4c8e","displayName":"QA 4f6b354d4c8e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:14.922650958Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-27af3083-ef11-40c9-bcae-fec3a4c7d07a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27af3083-ef11-40c9-bcae-fec3a4c7d07a
Content-Type: application/json

--- request body ---
{"handle":"qa-4f6b354d4c8e","password":"****"}

--- response: 200 in 80 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-27af3083-ef11-40c9-bcae-fec3a4c7d07a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d0da7b9-5e44-4c38-8610-0551ed4961ba"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2e546f3e-40c8-41b1-baab-635c8c0cc239

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3524650558764efb94a91f0a5dc537df
X-Fault: drop-response
X-Fault-Key: 43100c47-4523-4144-ba42-7d2e0a375776
X-Correlation-Id: qa-2e546f3e-40c8-41b1-baab-635c8c0cc239
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 126 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-2e546f3e-40c8-41b1-baab-635c8c0cc239
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
Location: /v1/credits/purchases/pur_65ad4e60-7222-471b-b470-222ebc0cda66
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-2e546f3e-40c8-41b1-baab-635c8c0cc239"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a5d86e17-babe-4e64-b3c3-53dbc035c311

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3524650558764efb94a91f0a5dc537df
X-Fault: drop-response
X-Fault-Key: 43100c47-4523-4144-ba42-7d2e0a375776
X-Correlation-Id: qa-a5d86e17-babe-4e64-b3c3-53dbc035c311
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5d86e17-babe-4e64-b3c3-53dbc035c311
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
Location: /v1/credits/purchases/pur_65ad4e60-7222-471b-b470-222ebc0cda66
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_65ad4e60-7222-471b-b470-222ebc0cda66","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:15.633926059Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-e6e94c0b-f60b-4325-bf29-bcfa7bb607bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6e94c0b-f60b-4325-bf29-bcfa7bb607bd
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6e94c0b-f60b-4325-bf29-bcfa7bb607bd
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

{"items":[{"id":"led_63080652-3429-449d-ba36-fcdfcfcb3b25","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-23T07:41:14.922665485Z"},{"id":"led_c7a56ddb-47d9-4c8c-b760-bb65235a6816","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_65ad4e60-7222-471b-b470-222ebc0cda66","createdAt":"2026-10-23T07:41:15.633926059Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09a25d18-5af6-4e73-8ac8-3b92393d183e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09a25d18-5af6-4e73-8ac8-3b92393d183e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09a25d18-5af6-4e73-8ac8-3b92393d183e
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
correlation: qa-7dc3228e-1c52-42b2-9536-0affa3b319f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dc3228e-1c52-42b2-9536-0affa3b319f7
Content-Type: application/json

--- request body ---
{"handle":"qa-4f6b354d4c8e","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7dc3228e-1c52-42b2-9536-0affa3b319f7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7dc3228e-1c52-42b2-9536-0affa3b319f7"}
```
