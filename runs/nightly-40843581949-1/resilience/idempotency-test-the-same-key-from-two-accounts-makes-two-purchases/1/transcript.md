# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-36baefa7-8d8f-45dd-bdb3-4d566b70ca67` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-a7d1812e-ef10-4504-867a-32d13095167e` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-8f0f8341-cbc0-4970-b022-594bbf075238` |
| 4 | `POST /v1/credits/purchases` | 201 | 14 | `qa-5d3d3ed0-3608-4e00-8899-730fc89a9cea` |
| 5 | `POST /v1/auth/token` | 200 | 12 | `qa-2db32e39-ece5-414f-ae9f-8447e2692425` |
| 6 | `POST /v1/credits/purchases` | 201 | 6 | `qa-8817bbf0-c74c-4f9d-b833-f19a9a3da0f8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-eb63d4bd-1478-4ef8-b411-42565054b055` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-098a12f4-ccf2-4ec6-8a85-e7fbcef883bb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7be1e11a-787e-4daf-b821-56f63470a768` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-786891f0-2ec5-40bc-9e1b-688b61c2e4a9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-36baefa7-8d8f-45dd-bdb3-4d566b70ca67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36baefa7-8d8f-45dd-bdb3-4d566b70ca67
Content-Type: application/json

--- request body ---
{"handle":"qa-7d7716db038b","displayName":"QA 7d7716db038b","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-36baefa7-8d8f-45dd-bdb3-4d566b70ca67
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
Location: /v1/accounts/qa-7d7716db038b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e8db61a-03a3-437b-98b7-6d11f52c5428","handle":"qa-7d7716db038b","displayName":"QA 7d7716db038b","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.625095970Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a7d1812e-ef10-4504-867a-32d13095167e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7d1812e-ef10-4504-867a-32d13095167e
Content-Type: application/json

--- request body ---
{"handle":"qa-361aada812b1","displayName":"QA 361aada812b1","password":"****","region":"us"}

--- response: 201 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7d1812e-ef10-4504-867a-32d13095167e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 8
Location: /v1/accounts/qa-361aada812b1
X-Served-Region: us
Content-Length: 181

{"id":"acc_31297ceb-67a9-4678-9476-13efdc37c864","handle":"qa-361aada812b1","displayName":"QA 361aada812b1","region":"us","role":"user","createdAt":"2026-10-29T08:38:58.651586083Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8f0f8341-cbc0-4970-b022-594bbf075238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f0f8341-cbc0-4970-b022-594bbf075238
Content-Type: application/json

--- request body ---
{"handle":"qa-7d7716db038b","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f0f8341-cbc0-4970-b022-594bbf075238
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e8db61a-03a3-437b-98b7-6d11f52c5428"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5d3d3ed0-3608-4e00-8899-730fc89a9cea

--- request headers ---
Accept: application/json
Idempotency-Key: qa-094b056ffa8e455faf6f4181fb1801fd
X-Correlation-Id: qa-5d3d3ed0-3608-4e00-8899-730fc89a9cea
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d3d3ed0-3608-4e00-8899-730fc89a9cea
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
Location: /v1/credits/purchases/pur_0ad85251-01e1-4467-8336-8a36a77c23c9
Content-Length: 144

{"id":"pur_0ad85251-01e1-4467-8336-8a36a77c23c9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:58.691668892Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2db32e39-ece5-414f-ae9f-8447e2692425

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2db32e39-ece5-414f-ae9f-8447e2692425
Content-Type: application/json

--- request body ---
{"handle":"qa-361aada812b1","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2db32e39-ece5-414f-ae9f-8447e2692425
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31297ceb-67a9-4678-9476-13efdc37c864"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8817bbf0-c74c-4f9d-b833-f19a9a3da0f8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-094b056ffa8e455faf6f4181fb1801fd
X-Correlation-Id: qa-8817bbf0-c74c-4f9d-b833-f19a9a3da0f8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8817bbf0-c74c-4f9d-b833-f19a9a3da0f8
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_da338c2d-54c6-45cf-b977-f28a141d1ff9
Content-Length: 144

{"id":"pur_da338c2d-54c6-45cf-b977-f28a141d1ff9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:58.725563399Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb63d4bd-1478-4ef8-b411-42565054b055

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb63d4bd-1478-4ef8-b411-42565054b055
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb63d4bd-1478-4ef8-b411-42565054b055
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
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-098a12f4-ccf2-4ec6-8a85-e7fbcef883bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-098a12f4-ccf2-4ec6-8a85-e7fbcef883bb
Content-Type: application/json

--- request body ---
{"handle":"qa-361aada812b1","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-098a12f4-ccf2-4ec6-8a85-e7fbcef883bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-098a12f4-ccf2-4ec6-8a85-e7fbcef883bb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7be1e11a-787e-4daf-b821-56f63470a768

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7be1e11a-787e-4daf-b821-56f63470a768
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7be1e11a-787e-4daf-b821-56f63470a768
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-786891f0-2ec5-40bc-9e1b-688b61c2e4a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-786891f0-2ec5-40bc-9e1b-688b61c2e4a9
Content-Type: application/json

--- request body ---
{"handle":"qa-7d7716db038b","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-786891f0-2ec5-40bc-9e1b-688b61c2e4a9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-786891f0-2ec5-40bc-9e1b-688b61c2e4a9"}
```
