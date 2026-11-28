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
| 1 | `POST /v1/accounts` | 201 | 429 | `qa-bee688ed-8d7b-4bbe-8d33-bd996236d457` |
| 7 | `POST /v1/auth/token` | 200 | 69 | `qa-1c79243d-92e7-48e6-932b-c57f96b05553` |
| 4 | `POST /v1/auth/token` | 200 | 78 | `qa-1e86189f-82a5-4059-9a41-129084f5ba84` |
| 2 | `POST /v1/auth/token` | 200 | 84 | `qa-c7394195-de9f-4e86-99c4-e133deb05261` |
| 5 | `POST /v1/auth/token` | 200 | 78 | `qa-ffe34ba3-4bc8-4c5c-bc0e-8c4990b4655f` |
| 3 | `POST /v1/auth/token` | 200 | 80 | `qa-c374bffd-602c-4355-896f-77529e7aa830` |
| 6 | `POST /v1/auth/token` | 200 | 80 | `qa-c0800c8c-25f9-4bbd-942a-f80f9f5907a6` |
| 10 | `POST /v1/credits/purchases` | 200 | 56 | `qa-a8c1cefb-c621-457e-a824-75ac4f697bfb` |
| 9 | `POST /v1/credits/purchases` | 200 | 56 | `qa-f1624b86-77ae-4523-aa8b-8527a562bace` |
| 8 | `POST /v1/credits/purchases` | 200 | 60 | `qa-cbf33e71-32e6-4660-932f-2baddf6dd334` |
| 13 | `POST /v1/credits/purchases` | 201 | 56 | `qa-8d0d75d7-c340-493d-8ebb-4c802c8d3fc9` |
| 11 | `POST /v1/credits/purchases` | 200 | 59 | `qa-129b1450-1884-44c2-b2d7-9b36470f8c32` |
| 12 | `POST /v1/credits/purchases` | 200 | 59 | `qa-51071348-a17e-4e5c-b964-e4ee61ecb63f` |
| 14 | `POST /v1/auth/token` | 200 | 31 | `qa-42fe5328-8773-43a5-ae5b-8de9ea5a2c73` |
| 15 | `GET /v1/credits/balance` | 200 | 13 | `qa-104dd68c-cf73-48be-a386-3703c0c653b8` |
| 16 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a3c371bf-93b1-4e38-803e-2177fda979da` |
| 17 | `POST /v1/auth/token` | 401 | 10 | `qa-793608e2-cc18-4300-9af7-eb90aa034774` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bee688ed-8d7b-4bbe-8d33-bd996236d457

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bee688ed-8d7b-4bbe-8d33-bd996236d457
Content-Type: application/json

--- request body ---
{"handle":"qa-7b2455e36591","displayName":"QA 7b2455e36591","password":"****","region":"eu"}

--- response: 201 in 429 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-bee688ed-8d7b-4bbe-8d33-bd996236d457
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
Location: /v1/accounts/qa-7b2455e36591
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd73c1bf-bf1e-4242-81dd-7d64bd1b8aeb","handle":"qa-7b2455e36591","displayName":"QA 7b2455e36591","region":"eu","role":"user","createdAt":"2026-11-25T11:27:49.229651336Z"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-1c79243d-92e7-48e6-932b-c57f96b05553

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c79243d-92e7-48e6-932b-c57f96b05553
Content-Type: application/json

--- request body ---
{"handle":"qa-7b2455e36591","password":"****"}

--- response: 200 in 69 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c79243d-92e7-48e6-932b-c57f96b05553
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd73c1bf-bf1e-4242-81dd-7d64bd1b8aeb"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1e86189f-82a5-4059-9a41-129084f5ba84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e86189f-82a5-4059-9a41-129084f5ba84
Content-Type: application/json

--- request body ---
{"handle":"qa-7b2455e36591","password":"****"}

--- response: 200 in 78 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e86189f-82a5-4059-9a41-129084f5ba84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd73c1bf-bf1e-4242-81dd-7d64bd1b8aeb"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c7394195-de9f-4e86-99c4-e133deb05261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7394195-de9f-4e86-99c4-e133deb05261
Content-Type: application/json

--- request body ---
{"handle":"qa-7b2455e36591","password":"****"}

--- response: 200 in 84 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7394195-de9f-4e86-99c4-e133deb05261
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd73c1bf-bf1e-4242-81dd-7d64bd1b8aeb"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ffe34ba3-4bc8-4c5c-bc0e-8c4990b4655f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffe34ba3-4bc8-4c5c-bc0e-8c4990b4655f
Content-Type: application/json

--- request body ---
{"handle":"qa-7b2455e36591","password":"****"}

--- response: 200 in 78 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffe34ba3-4bc8-4c5c-bc0e-8c4990b4655f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd73c1bf-bf1e-4242-81dd-7d64bd1b8aeb"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c374bffd-602c-4355-896f-77529e7aa830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c374bffd-602c-4355-896f-77529e7aa830
Content-Type: application/json

--- request body ---
{"handle":"qa-7b2455e36591","password":"****"}

--- response: 200 in 80 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c374bffd-602c-4355-896f-77529e7aa830
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd73c1bf-bf1e-4242-81dd-7d64bd1b8aeb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c0800c8c-25f9-4bbd-942a-f80f9f5907a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0800c8c-25f9-4bbd-942a-f80f9f5907a6
Content-Type: application/json

--- request body ---
{"handle":"qa-7b2455e36591","password":"****"}

--- response: 200 in 80 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0800c8c-25f9-4bbd-942a-f80f9f5907a6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd73c1bf-bf1e-4242-81dd-7d64bd1b8aeb"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a8c1cefb-c621-457e-a824-75ac4f697bfb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-57e2745861fd40e6a6a2a602366c2456
X-Correlation-Id: qa-a8c1cefb-c621-457e-a824-75ac4f697bfb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 56 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8c1cefb-c621-457e-a824-75ac4f697bfb
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
Location: /v1/credits/purchases/pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.828848567Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f1624b86-77ae-4523-aa8b-8527a562bace

--- request headers ---
Accept: application/json
Idempotency-Key: qa-57e2745861fd40e6a6a2a602366c2456
X-Correlation-Id: qa-f1624b86-77ae-4523-aa8b-8527a562bace
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 56 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1624b86-77ae-4523-aa8b-8527a562bace
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
Location: /v1/credits/purchases/pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.828848567Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cbf33e71-32e6-4660-932f-2baddf6dd334

--- request headers ---
Accept: application/json
Idempotency-Key: qa-57e2745861fd40e6a6a2a602366c2456
X-Correlation-Id: qa-cbf33e71-32e6-4660-932f-2baddf6dd334
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 60 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbf33e71-32e6-4660-932f-2baddf6dd334
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
Location: /v1/credits/purchases/pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.828848567Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8d0d75d7-c340-493d-8ebb-4c802c8d3fc9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-57e2745861fd40e6a6a2a602366c2456
X-Correlation-Id: qa-8d0d75d7-c340-493d-8ebb-4c802c8d3fc9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d0d75d7-c340-493d-8ebb-4c802c8d3fc9
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
Location: /v1/credits/purchases/pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1
Content-Length: 144

{"id":"pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.828848567Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-129b1450-1884-44c2-b2d7-9b36470f8c32

--- request headers ---
Accept: application/json
Idempotency-Key: qa-57e2745861fd40e6a6a2a602366c2456
X-Correlation-Id: qa-129b1450-1884-44c2-b2d7-9b36470f8c32
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 59 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-129b1450-1884-44c2-b2d7-9b36470f8c32
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
Location: /v1/credits/purchases/pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.828848567Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-51071348-a17e-4e5c-b964-e4ee61ecb63f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-57e2745861fd40e6a6a2a602366c2456
X-Correlation-Id: qa-51071348-a17e-4e5c-b964-e4ee61ecb63f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 59 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-51071348-a17e-4e5c-b964-e4ee61ecb63f
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
Location: /v1/credits/purchases/pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_be81b8c8-8bf7-4126-99b5-d1745f19d9e1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.828848567Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-42fe5328-8773-43a5-ae5b-8de9ea5a2c73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42fe5328-8773-43a5-ae5b-8de9ea5a2c73
Content-Type: application/json

--- request body ---
{"handle":"qa-7b2455e36591","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-42fe5328-8773-43a5-ae5b-8de9ea5a2c73
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd73c1bf-bf1e-4242-81dd-7d64bd1b8aeb"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-104dd68c-cf73-48be-a386-3703c0c653b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-104dd68c-cf73-48be-a386-3703c0c653b8
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-104dd68c-cf73-48be-a386-3703c0c653b8
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

{"balance":15,"currency":"credits","accountId":"acc_cd73c1bf-bf1e-4242-81dd-7d64bd1b8aeb"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3c371bf-93b1-4e38-803e-2177fda979da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3c371bf-93b1-4e38-803e-2177fda979da
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3c371bf-93b1-4e38-803e-2177fda979da
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
correlation: qa-793608e2-cc18-4300-9af7-eb90aa034774

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-793608e2-cc18-4300-9af7-eb90aa034774
Content-Type: application/json

--- request body ---
{"handle":"qa-7b2455e36591","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-793608e2-cc18-4300-9af7-eb90aa034774
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-793608e2-cc18-4300-9af7-eb90aa034774"}
```
