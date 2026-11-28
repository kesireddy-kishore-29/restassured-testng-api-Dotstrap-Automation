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
| 1 | `POST /v1/accounts` | 201 | 376 | `qa-bfcfcdac-713a-4e58-a067-f836b007c7f8` |
| 7 | `POST /v1/auth/token` | 200 | 26 | `qa-c6c5662c-d77e-49a8-b09b-b03e31e98794` |
| 4 | `POST /v1/auth/token` | 200 | 47 | `qa-c13aa728-7cf5-4779-8729-aa375c9f7881` |
| 5 | `POST /v1/auth/token` | 200 | 43 | `qa-a637bfca-767d-4f47-8a48-7ee1bb0c2dbc` |
| 2 | `POST /v1/auth/token` | 200 | 57 | `qa-086936c3-e171-4fe5-a36d-ea4f88254cac` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-8528566a-2fc9-4f7d-9694-91c2dcd0e390` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-ad2557dd-ec45-4ba7-b347-874cb16d3289` |
| 9 | `POST /v1/credits/purchases` | 200 | 46 | `qa-5d3a1d32-eead-4370-8446-ef7bf6eb735d` |
| 8 | `POST /v1/credits/purchases` | 201 | 48 | `qa-e874d4c9-19cc-4b1a-a5f0-c72b5415e1c4` |
| 13 | `POST /v1/credits/purchases` | 200 | 26 | `qa-ef9b98e3-2ffb-4186-97e9-479069eea1f2` |
| 11 | `POST /v1/credits/purchases` | 200 | 37 | `qa-948eb825-753d-49b5-95be-f5b69cfb2b58` |
| 12 | `POST /v1/credits/purchases` | 200 | 36 | `qa-f1771597-3dcb-4983-83b9-e0e85b24442a` |
| 10 | `POST /v1/credits/purchases` | 200 | 42 | `qa-c63af8b1-5bc5-44c3-a258-f60a783c1f7a` |
| 14 | `POST /v1/auth/token` | 200 | 9 | `qa-e3d23f56-149a-4e9e-94a7-6f7804fcfd94` |
| 15 | `GET /v1/credits/balance` | 200 | 38 | `qa-3b38afa8-37dc-473a-bdea-d6d2cbe85326` |
| 16 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-b1470021-11e8-4682-9d7f-35aeccabb4fc` |
| 17 | `POST /v1/auth/token` | 401 | 10 | `qa-7045453a-c99f-4e51-8e08-25b6485b7248` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bfcfcdac-713a-4e58-a067-f836b007c7f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfcfcdac-713a-4e58-a067-f836b007c7f8
Content-Type: application/json

--- request body ---
{"handle":"qa-4802bdba2424","displayName":"QA 4802bdba2424","password":"****","region":"eu"}

--- response: 201 in 376 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfcfcdac-713a-4e58-a067-f836b007c7f8
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
Location: /v1/accounts/qa-4802bdba2424
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aba43ceb-45f6-494f-90ef-04b6fef702ca","handle":"qa-4802bdba2424","displayName":"QA 4802bdba2424","region":"eu","role":"user","createdAt":"2026-11-19T10:29:12.105214034Z"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-c6c5662c-d77e-49a8-b09b-b03e31e98794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c5662c-d77e-49a8-b09b-b03e31e98794
Content-Type: application/json

--- request body ---
{"handle":"qa-4802bdba2424","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6c5662c-d77e-49a8-b09b-b03e31e98794
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aba43ceb-45f6-494f-90ef-04b6fef702ca"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c13aa728-7cf5-4779-8729-aa375c9f7881

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c13aa728-7cf5-4779-8729-aa375c9f7881
Content-Type: application/json

--- request body ---
{"handle":"qa-4802bdba2424","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c13aa728-7cf5-4779-8729-aa375c9f7881
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aba43ceb-45f6-494f-90ef-04b6fef702ca"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a637bfca-767d-4f47-8a48-7ee1bb0c2dbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a637bfca-767d-4f47-8a48-7ee1bb0c2dbc
Content-Type: application/json

--- request body ---
{"handle":"qa-4802bdba2424","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a637bfca-767d-4f47-8a48-7ee1bb0c2dbc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aba43ceb-45f6-494f-90ef-04b6fef702ca"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-086936c3-e171-4fe5-a36d-ea4f88254cac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-086936c3-e171-4fe5-a36d-ea4f88254cac
Content-Type: application/json

--- request body ---
{"handle":"qa-4802bdba2424","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-086936c3-e171-4fe5-a36d-ea4f88254cac
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aba43ceb-45f6-494f-90ef-04b6fef702ca"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8528566a-2fc9-4f7d-9694-91c2dcd0e390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8528566a-2fc9-4f7d-9694-91c2dcd0e390
Content-Type: application/json

--- request body ---
{"handle":"qa-4802bdba2424","password":"****"}

--- response: 200 in 56 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8528566a-2fc9-4f7d-9694-91c2dcd0e390
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aba43ceb-45f6-494f-90ef-04b6fef702ca"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ad2557dd-ec45-4ba7-b347-874cb16d3289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad2557dd-ec45-4ba7-b347-874cb16d3289
Content-Type: application/json

--- request body ---
{"handle":"qa-4802bdba2424","password":"****"}

--- response: 200 in 52 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad2557dd-ec45-4ba7-b347-874cb16d3289
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aba43ceb-45f6-494f-90ef-04b6fef702ca"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5d3a1d32-eead-4370-8446-ef7bf6eb735d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-41810fa756164205a92b9196bfddb28c
X-Correlation-Id: qa-5d3a1d32-eead-4370-8446-ef7bf6eb735d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d3a1d32-eead-4370-8446-ef7bf6eb735d
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
Location: /v1/credits/purchases/pur_e396a81d-0553-40ce-a83d-bb96b93c387a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e396a81d-0553-40ce-a83d-bb96b93c387a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.592320506Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e874d4c9-19cc-4b1a-a5f0-c72b5415e1c4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-41810fa756164205a92b9196bfddb28c
X-Correlation-Id: qa-e874d4c9-19cc-4b1a-a5f0-c72b5415e1c4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e874d4c9-19cc-4b1a-a5f0-c72b5415e1c4
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
Location: /v1/credits/purchases/pur_e396a81d-0553-40ce-a83d-bb96b93c387a
Content-Length: 144

{"id":"pur_e396a81d-0553-40ce-a83d-bb96b93c387a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.592320506Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ef9b98e3-2ffb-4186-97e9-479069eea1f2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-41810fa756164205a92b9196bfddb28c
X-Correlation-Id: qa-ef9b98e3-2ffb-4186-97e9-479069eea1f2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef9b98e3-2ffb-4186-97e9-479069eea1f2
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
Location: /v1/credits/purchases/pur_e396a81d-0553-40ce-a83d-bb96b93c387a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e396a81d-0553-40ce-a83d-bb96b93c387a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.592320506Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-948eb825-753d-49b5-95be-f5b69cfb2b58

--- request headers ---
Accept: application/json
Idempotency-Key: qa-41810fa756164205a92b9196bfddb28c
X-Correlation-Id: qa-948eb825-753d-49b5-95be-f5b69cfb2b58
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-948eb825-753d-49b5-95be-f5b69cfb2b58
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
Location: /v1/credits/purchases/pur_e396a81d-0553-40ce-a83d-bb96b93c387a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e396a81d-0553-40ce-a83d-bb96b93c387a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.592320506Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f1771597-3dcb-4983-83b9-e0e85b24442a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-41810fa756164205a92b9196bfddb28c
X-Correlation-Id: qa-f1771597-3dcb-4983-83b9-e0e85b24442a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1771597-3dcb-4983-83b9-e0e85b24442a
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
Location: /v1/credits/purchases/pur_e396a81d-0553-40ce-a83d-bb96b93c387a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e396a81d-0553-40ce-a83d-bb96b93c387a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.592320506Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c63af8b1-5bc5-44c3-a258-f60a783c1f7a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-41810fa756164205a92b9196bfddb28c
X-Correlation-Id: qa-c63af8b1-5bc5-44c3-a258-f60a783c1f7a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c63af8b1-5bc5-44c3-a258-f60a783c1f7a
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
Location: /v1/credits/purchases/pur_e396a81d-0553-40ce-a83d-bb96b93c387a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e396a81d-0553-40ce-a83d-bb96b93c387a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.592320506Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-e3d23f56-149a-4e9e-94a7-6f7804fcfd94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3d23f56-149a-4e9e-94a7-6f7804fcfd94
Content-Type: application/json

--- request body ---
{"handle":"qa-4802bdba2424","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3d23f56-149a-4e9e-94a7-6f7804fcfd94
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aba43ceb-45f6-494f-90ef-04b6fef702ca"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-3b38afa8-37dc-473a-bdea-d6d2cbe85326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b38afa8-37dc-473a-bdea-d6d2cbe85326
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b38afa8-37dc-473a-bdea-d6d2cbe85326
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

{"balance":15,"currency":"credits","accountId":"acc_aba43ceb-45f6-494f-90ef-04b6fef702ca"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b1470021-11e8-4682-9d7f-35aeccabb4fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1470021-11e8-4682-9d7f-35aeccabb4fc
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b1470021-11e8-4682-9d7f-35aeccabb4fc
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
correlation: qa-7045453a-c99f-4e51-8e08-25b6485b7248

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7045453a-c99f-4e51-8e08-25b6485b7248
Content-Type: application/json

--- request body ---
{"handle":"qa-4802bdba2424","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7045453a-c99f-4e51-8e08-25b6485b7248
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7045453a-c99f-4e51-8e08-25b6485b7248"}
```
