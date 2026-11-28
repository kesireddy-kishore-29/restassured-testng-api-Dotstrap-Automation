# Transcript: Six concurrent duplicates: one purchase, five replays, one charge

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#concurrentDuplicatesProduceOnePurchase` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 17 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 442 | `qa-0d6beb3b-541f-462b-bf9f-c7fa6d24d585` |
| 5 | `POST /v1/auth/token` | 200 | 74 | `qa-5b0f86af-d078-4f2f-bbb8-2612147ccae1` |
| 2 | `POST /v1/auth/token` | 200 | 94 | `qa-8142f15f-e373-4752-982e-88ee6d8ca485` |
| 7 | `POST /v1/auth/token` | 200 | 67 | `qa-8668791c-d3af-4cd3-b5f8-373a87352694` |
| 4 | `POST /v1/auth/token` | 200 | 84 | `qa-58953031-afa2-4313-b677-394a9ac7e109` |
| 3 | `POST /v1/auth/token` | 200 | 93 | `qa-82793a38-9546-4fa7-8a37-6d77b1568ae6` |
| 6 | `POST /v1/auth/token` | 200 | 87 | `qa-c8f574bf-7b43-405e-b941-1e172e101a0d` |
| 10 | `POST /v1/credits/purchases` | 200 | 61 | `qa-aef72a1a-f9f8-4f50-bea6-a808f7882a5b` |
| 9 | `POST /v1/credits/purchases` | 200 | 62 | `qa-72af5f40-bee8-4c31-bec3-93bdcbf14912` |
| 11 | `POST /v1/credits/purchases` | 200 | 80 | `qa-6f468b71-3ef2-4a5d-a93d-067c494d6d90` |
| 12 | `POST /v1/credits/purchases` | 201 | 84 | `qa-73562949-1dc2-4a8f-8062-c6b266fcc526` |
| 13 | `POST /v1/credits/purchases` | 200 | 84 | `qa-3a6cded6-8297-41b8-95d6-d2f18d7b8cab` |
| 8 | `POST /v1/credits/purchases` | 200 | 95 | `qa-8813209d-8570-4c0e-8269-4a305cfa76f0` |
| 14 | `POST /v1/auth/token` | 200 | 31 | `qa-19972a59-ecb9-468d-976e-a1737a7f34e0` |
| 15 | `GET /v1/credits/balance` | 200 | 30 | `qa-869be459-465f-4c23-9ecf-7707a9e21fbf` |
| 16 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-38afef2e-9218-4af9-8cdd-ea0562205ada` |
| 17 | `POST /v1/auth/token` | 401 | 10 | `qa-4e9e3832-ecce-47ca-8d04-28124715fcac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d6beb3b-541f-462b-bf9f-c7fa6d24d585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d6beb3b-541f-462b-bf9f-c7fa6d24d585
Content-Type: application/json

--- request body ---
{"handle":"qa-560ae92d8b19","displayName":"QA 560ae92d8b19","password":"****","region":"eu"}

--- response: 201 in 442 ms ---
Date: Sun, 22 Nov 2026 09:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d6beb3b-541f-462b-bf9f-c7fa6d24d585
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
Location: /v1/accounts/qa-560ae92d8b19
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f33e7bf-632c-45ed-aaef-0bc02aa4256c","handle":"qa-560ae92d8b19","displayName":"QA 560ae92d8b19","region":"eu","role":"user","createdAt":"2026-11-22T09:54:53.104320023Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5b0f86af-d078-4f2f-bbb8-2612147ccae1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b0f86af-d078-4f2f-bbb8-2612147ccae1
Content-Type: application/json

--- request body ---
{"handle":"qa-560ae92d8b19","password":"****"}

--- response: 200 in 74 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b0f86af-d078-4f2f-bbb8-2612147ccae1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f33e7bf-632c-45ed-aaef-0bc02aa4256c"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8142f15f-e373-4752-982e-88ee6d8ca485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8142f15f-e373-4752-982e-88ee6d8ca485
Content-Type: application/json

--- request body ---
{"handle":"qa-560ae92d8b19","password":"****"}

--- response: 200 in 94 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8142f15f-e373-4752-982e-88ee6d8ca485
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f33e7bf-632c-45ed-aaef-0bc02aa4256c"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-8668791c-d3af-4cd3-b5f8-373a87352694

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8668791c-d3af-4cd3-b5f8-373a87352694
Content-Type: application/json

--- request body ---
{"handle":"qa-560ae92d8b19","password":"****"}

--- response: 200 in 67 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8668791c-d3af-4cd3-b5f8-373a87352694
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f33e7bf-632c-45ed-aaef-0bc02aa4256c"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-58953031-afa2-4313-b677-394a9ac7e109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58953031-afa2-4313-b677-394a9ac7e109
Content-Type: application/json

--- request body ---
{"handle":"qa-560ae92d8b19","password":"****"}

--- response: 200 in 84 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-58953031-afa2-4313-b677-394a9ac7e109
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f33e7bf-632c-45ed-aaef-0bc02aa4256c"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-82793a38-9546-4fa7-8a37-6d77b1568ae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82793a38-9546-4fa7-8a37-6d77b1568ae6
Content-Type: application/json

--- request body ---
{"handle":"qa-560ae92d8b19","password":"****"}

--- response: 200 in 93 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-82793a38-9546-4fa7-8a37-6d77b1568ae6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f33e7bf-632c-45ed-aaef-0bc02aa4256c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c8f574bf-7b43-405e-b941-1e172e101a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8f574bf-7b43-405e-b941-1e172e101a0d
Content-Type: application/json

--- request body ---
{"handle":"qa-560ae92d8b19","password":"****"}

--- response: 200 in 87 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8f574bf-7b43-405e-b941-1e172e101a0d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f33e7bf-632c-45ed-aaef-0bc02aa4256c"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-aef72a1a-f9f8-4f50-bea6-a808f7882a5b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5f883a7b68b44e92962237c3a19e024d
X-Correlation-Id: qa-aef72a1a-f9f8-4f50-bea6-a808f7882a5b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 61 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-aef72a1a-f9f8-4f50-bea6-a808f7882a5b
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
Location: /v1/credits/purchases/pur_33950104-5200-4c45-ab7a-2c61587a75c0
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_33950104-5200-4c45-ab7a-2c61587a75c0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.687291424Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-72af5f40-bee8-4c31-bec3-93bdcbf14912

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5f883a7b68b44e92962237c3a19e024d
X-Correlation-Id: qa-72af5f40-bee8-4c31-bec3-93bdcbf14912
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 62 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-72af5f40-bee8-4c31-bec3-93bdcbf14912
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
Location: /v1/credits/purchases/pur_33950104-5200-4c45-ab7a-2c61587a75c0
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_33950104-5200-4c45-ab7a-2c61587a75c0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.687291424Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6f468b71-3ef2-4a5d-a93d-067c494d6d90

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5f883a7b68b44e92962237c3a19e024d
X-Correlation-Id: qa-6f468b71-3ef2-4a5d-a93d-067c494d6d90
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 80 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f468b71-3ef2-4a5d-a93d-067c494d6d90
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
Location: /v1/credits/purchases/pur_33950104-5200-4c45-ab7a-2c61587a75c0
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_33950104-5200-4c45-ab7a-2c61587a75c0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.687291424Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-73562949-1dc2-4a8f-8062-c6b266fcc526

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5f883a7b68b44e92962237c3a19e024d
X-Correlation-Id: qa-73562949-1dc2-4a8f-8062-c6b266fcc526
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 84 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-73562949-1dc2-4a8f-8062-c6b266fcc526
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
Location: /v1/credits/purchases/pur_33950104-5200-4c45-ab7a-2c61587a75c0
Content-Length: 144

{"id":"pur_33950104-5200-4c45-ab7a-2c61587a75c0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.687291424Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3a6cded6-8297-41b8-95d6-d2f18d7b8cab

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5f883a7b68b44e92962237c3a19e024d
X-Correlation-Id: qa-3a6cded6-8297-41b8-95d6-d2f18d7b8cab
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 84 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a6cded6-8297-41b8-95d6-d2f18d7b8cab
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
Location: /v1/credits/purchases/pur_33950104-5200-4c45-ab7a-2c61587a75c0
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_33950104-5200-4c45-ab7a-2c61587a75c0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.687291424Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8813209d-8570-4c0e-8269-4a305cfa76f0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5f883a7b68b44e92962237c3a19e024d
X-Correlation-Id: qa-8813209d-8570-4c0e-8269-4a305cfa76f0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 95 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8813209d-8570-4c0e-8269-4a305cfa76f0
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
Location: /v1/credits/purchases/pur_33950104-5200-4c45-ab7a-2c61587a75c0
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_33950104-5200-4c45-ab7a-2c61587a75c0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.687291424Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-19972a59-ecb9-468d-976e-a1737a7f34e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19972a59-ecb9-468d-976e-a1737a7f34e0
Content-Type: application/json

--- request body ---
{"handle":"qa-560ae92d8b19","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-19972a59-ecb9-468d-976e-a1737a7f34e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f33e7bf-632c-45ed-aaef-0bc02aa4256c"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-869be459-465f-4c23-9ecf-7707a9e21fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-869be459-465f-4c23-9ecf-7707a9e21fbf
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-869be459-465f-4c23-9ecf-7707a9e21fbf
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
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_0f33e7bf-632c-45ed-aaef-0bc02aa4256c"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38afef2e-9218-4af9-8cdd-ea0562205ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38afef2e-9218-4af9-8cdd-ea0562205ada
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38afef2e-9218-4af9-8cdd-ea0562205ada
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

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-4e9e3832-ecce-47ca-8d04-28124715fcac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e9e3832-ecce-47ca-8d04-28124715fcac
Content-Type: application/json

--- request body ---
{"handle":"qa-560ae92d8b19","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e9e3832-ecce-47ca-8d04-28124715fcac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e9e3832-ecce-47ca-8d04-28124715fcac"}
```
