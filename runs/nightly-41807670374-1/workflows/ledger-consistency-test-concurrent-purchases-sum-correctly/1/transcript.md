# Transcript: Ten concurrent purchases are all counted, exactly once

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#concurrentPurchasesSumCorrectly` |
| Features | FEAT-LEDGER-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 25 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 506 | `qa-c766d86f-bd10-4a79-93dc-74fedba0d841` |
| 5 | `POST /v1/auth/token` | 200 | 100 | `qa-30a9f1e1-b94f-4a07-b2a9-243a455c1758` |
| 3 | `POST /v1/auth/token` | 200 | 107 | `qa-c6765044-2b84-43c7-a407-ace4db2fbebc` |
| 11 | `POST /v1/auth/token` | 200 | 69 | `qa-bba6a0e9-0eb7-44c9-bd6f-2df0770fa24b` |
| 4 | `POST /v1/auth/token` | 200 | 115 | `qa-2e1e2921-e5ca-4b5c-8aed-616694c1c98c` |
| 2 | `POST /v1/auth/token` | 200 | 131 | `qa-f58a23aa-103c-4c0d-b367-5618d312a29a` |
| 6 | `POST /v1/auth/token` | 200 | 124 | `qa-5fa89c8f-a277-4f3d-959b-7fe7102ed2f3` |
| 7 | `POST /v1/auth/token` | 200 | 121 | `qa-39305005-09a6-4d62-aa69-27d48006a31b` |
| 10 | `POST /v1/auth/token` | 200 | 96 | `qa-8b5cf6ec-3578-478e-8d61-7eb71666202a` |
| 8 | `POST /v1/auth/token` | 200 | 125 | `qa-9e441a25-9859-4d22-84a2-e12685fef5ec` |
| 9 | `POST /v1/auth/token` | 200 | 125 | `qa-ebdb4fe7-9b7b-4b39-a3b0-62237b5ff369` |
| 18 | `POST /v1/credits/purchases` | 201 | 92 | `qa-3e862a77-9952-4c86-ba80-086371ff86f0` |
| 19 | `POST /v1/credits/purchases` | 201 | 93 | `qa-a68d29f9-d158-4a54-9b6b-a2e2d2cdfa9e` |
| 12 | `POST /v1/credits/purchases` | 201 | 112 | `qa-4070801e-9836-4b2a-b06d-b69cb627fbfd` |
| 13 | `POST /v1/credits/purchases` | 201 | 110 | `qa-5b42dccf-1464-4777-bc8e-2c542993cd6a` |
| 14 | `POST /v1/credits/purchases` | 201 | 105 | `qa-af23ae1e-b919-4058-8ca3-4ac4d759a13f` |
| 16 | `POST /v1/credits/purchases` | 201 | 103 | `qa-4c1fccd3-3c1b-44bb-a9d8-e4eaf5fcd0d7` |
| 20 | `POST /v1/credits/purchases` | 201 | 72 | `qa-d3357679-40c3-427d-8475-82350ee0740b` |
| 17 | `POST /v1/credits/purchases` | 201 | 103 | `qa-115e77d3-ae32-4853-a893-5f2d64104334` |
| 15 | `POST /v1/credits/purchases` | 201 | 108 | `qa-fb39b434-fe4d-4b68-a122-d7d2a60a4d6f` |
| 21 | `POST /v1/credits/purchases` | 201 | 82 | `qa-54d845ef-ca0b-45f3-90ed-f6d9a3b70ed7` |
| 22 | `POST /v1/auth/token` | 200 | 59 | `qa-2d8ff24a-2c9d-4f49-8e99-664f5f89bd5d` |
| 23 | `GET /v1/credits/ledger` | 200 | 51 | `qa-e1558f11-1a90-43ad-9b29-39d49e4d1660` |
| 24 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b8d87d10-1671-4c26-8bf6-853f736d24d4` |
| 25 | `POST /v1/auth/token` | 401 | 12 | `qa-4387372a-dd8c-43e4-afa8-19137c88868a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c766d86f-bd10-4a79-93dc-74fedba0d841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c766d86f-bd10-4a79-93dc-74fedba0d841
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","displayName":"QA 8946141c4c85","password":"****","region":"us"}

--- response: 201 in 506 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c766d86f-bd10-4a79-93dc-74fedba0d841
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
Location: /v1/accounts/qa-8946141c4c85
X-Served-Region: us
Content-Length: 181

{"id":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54","handle":"qa-8946141c4c85","displayName":"QA 8946141c4c85","region":"us","role":"user","createdAt":"2026-11-04T09:28:13.978356272Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-30a9f1e1-b94f-4a07-b2a9-243a455c1758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30a9f1e1-b94f-4a07-b2a9-243a455c1758
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 100 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-30a9f1e1-b94f-4a07-b2a9-243a455c1758
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c6765044-2b84-43c7-a407-ace4db2fbebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6765044-2b84-43c7-a407-ace4db2fbebc
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 107 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6765044-2b84-43c7-a407-ace4db2fbebc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-bba6a0e9-0eb7-44c9-bd6f-2df0770fa24b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bba6a0e9-0eb7-44c9-bd6f-2df0770fa24b
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 69 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-bba6a0e9-0eb7-44c9-bd6f-2df0770fa24b
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-2e1e2921-e5ca-4b5c-8aed-616694c1c98c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e1e2921-e5ca-4b5c-8aed-616694c1c98c
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 115 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e1e2921-e5ca-4b5c-8aed-616694c1c98c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f58a23aa-103c-4c0d-b367-5618d312a29a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f58a23aa-103c-4c0d-b367-5618d312a29a
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 131 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f58a23aa-103c-4c0d-b367-5618d312a29a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5fa89c8f-a277-4f3d-959b-7fe7102ed2f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fa89c8f-a277-4f3d-959b-7fe7102ed2f3
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 124 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fa89c8f-a277-4f3d-959b-7fe7102ed2f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-39305005-09a6-4d62-aa69-27d48006a31b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39305005-09a6-4d62-aa69-27d48006a31b
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 121 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-39305005-09a6-4d62-aa69-27d48006a31b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8b5cf6ec-3578-478e-8d61-7eb71666202a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b5cf6ec-3578-478e-8d61-7eb71666202a
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 96 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b5cf6ec-3578-478e-8d61-7eb71666202a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-9e441a25-9859-4d22-84a2-e12685fef5ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e441a25-9859-4d22-84a2-e12685fef5ec
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 125 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e441a25-9859-4d22-84a2-e12685fef5ec
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-ebdb4fe7-9b7b-4b39-a3b0-62237b5ff369

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebdb4fe7-9b7b-4b39-a3b0-62237b5ff369
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 125 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebdb4fe7-9b7b-4b39-a3b0-62237b5ff369
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3e862a77-9952-4c86-ba80-086371ff86f0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ad805eed05ae428c8facf6cadd60eade
X-Correlation-Id: qa-3e862a77-9952-4c86-ba80-086371ff86f0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 92 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e862a77-9952-4c86-ba80-086371ff86f0
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
Location: /v1/credits/purchases/pur_47b5a723-4e29-45bc-a1e9-c9b5162220c4
Content-Length: 145

{"id":"pur_47b5a723-4e29-45bc-a1e9-c9b5162220c4","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-04T09:28:14.724136801Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a68d29f9-d158-4a54-9b6b-a2e2d2cdfa9e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2916e673dfa84fa9a6e134f22131537d
X-Correlation-Id: qa-a68d29f9-d158-4a54-9b6b-a2e2d2cdfa9e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 93 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a68d29f9-d158-4a54-9b6b-a2e2d2cdfa9e
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
Location: /v1/credits/purchases/pur_afeda92f-ae7d-471a-915c-49178218fc2a
Content-Length: 144

{"id":"pur_afeda92f-ae7d-471a-915c-49178218fc2a","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-04T09:28:14.724044230Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4070801e-9836-4b2a-b06d-b69cb627fbfd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0426601aa03d4a9891be6eaa653b86d6
X-Correlation-Id: qa-4070801e-9836-4b2a-b06d-b69cb627fbfd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 112 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4070801e-9836-4b2a-b06d-b69cb627fbfd
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
Location: /v1/credits/purchases/pur_1a264bd5-7735-4e9a-b2cb-a5479ec93d83
Content-Length: 144

{"id":"pur_1a264bd5-7735-4e9a-b2cb-a5479ec93d83","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-04T09:28:14.708109104Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5b42dccf-1464-4777-bc8e-2c542993cd6a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ac73699ed04c49438f6fcc403880f27a
X-Correlation-Id: qa-5b42dccf-1464-4777-bc8e-2c542993cd6a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 110 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b42dccf-1464-4777-bc8e-2c542993cd6a
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
Location: /v1/credits/purchases/pur_50f46d14-2b25-440b-97e1-fb7bff0b5dd2
Content-Length: 144

{"id":"pur_50f46d14-2b25-440b-97e1-fb7bff0b5dd2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.704343178Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-af23ae1e-b919-4058-8ca3-4ac4d759a13f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0eda046708c34bf4bf528fb746b975c2
X-Correlation-Id: qa-af23ae1e-b919-4058-8ca3-4ac4d759a13f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 105 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-af23ae1e-b919-4058-8ca3-4ac4d759a13f
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
Location: /v1/credits/purchases/pur_f376a6dd-68a4-4934-ba2b-0a282e37f293
Content-Length: 144

{"id":"pur_f376a6dd-68a4-4934-ba2b-0a282e37f293","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-04T09:28:14.716811778Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4c1fccd3-3c1b-44bb-a9d8-e4eaf5fcd0d7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-992b1dc098e1423a9731f1a830510f4a
X-Correlation-Id: qa-4c1fccd3-3c1b-44bb-a9d8-e4eaf5fcd0d7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 103 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c1fccd3-3c1b-44bb-a9d8-e4eaf5fcd0d7
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
Location: /v1/credits/purchases/pur_6d8e27ed-02aa-4dc9-932b-affa4c1c4d2b
Content-Length: 144

{"id":"pur_6d8e27ed-02aa-4dc9-932b-affa4c1c4d2b","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-04T09:28:14.715822773Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d3357679-40c3-427d-8475-82350ee0740b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-42f9cbda9c9b4d91ac6904a84eb8806b
X-Correlation-Id: qa-d3357679-40c3-427d-8475-82350ee0740b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3357679-40c3-427d-8475-82350ee0740b
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
Location: /v1/credits/purchases/pur_dddd1557-ed1e-4e58-a2f6-3b907efba954
Content-Length: 144

{"id":"pur_dddd1557-ed1e-4e58-a2f6-3b907efba954","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-04T09:28:14.721221725Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-115e77d3-ae32-4853-a893-5f2d64104334

--- request headers ---
Accept: application/json
Idempotency-Key: qa-50c0a43fd38046fbb48c7f28ef1108a7
X-Correlation-Id: qa-115e77d3-ae32-4853-a893-5f2d64104334
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 103 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-115e77d3-ae32-4853-a893-5f2d64104334
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
Location: /v1/credits/purchases/pur_dbc94859-0504-4fc8-81c6-aa4c9c2e4b18
Content-Length: 144

{"id":"pur_dbc94859-0504-4fc8-81c6-aa4c9c2e4b18","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-04T09:28:14.719021144Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fb39b434-fe4d-4b68-a122-d7d2a60a4d6f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fe6fdf2fe25b4fd9b9b5fe203b0d9bdf
X-Correlation-Id: qa-fb39b434-fe4d-4b68-a122-d7d2a60a4d6f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 108 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb39b434-fe4d-4b68-a122-d7d2a60a4d6f
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
Location: /v1/credits/purchases/pur_edb654c6-d74a-4a4d-a1c6-484b1e607c3a
Content-Length: 144

{"id":"pur_edb654c6-d74a-4a4d-a1c6-484b1e607c3a","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-04T09:28:14.722779908Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-54d845ef-ca0b-45f3-90ed-f6d9a3b70ed7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e69d95b2f7114a7fb56583ba3ecd5a11
X-Correlation-Id: qa-54d845ef-ca0b-45f3-90ed-f6d9a3b70ed7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 82 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-54d845ef-ca0b-45f3-90ed-f6d9a3b70ed7
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
Location: /v1/credits/purchases/pur_6df328a1-d690-43ba-8f02-6841c48a2a2d
Content-Length: 144

{"id":"pur_6df328a1-d690-43ba-8f02-6841c48a2a2d","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-04T09:28:14.711317671Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-2d8ff24a-2c9d-4f49-8e99-664f5f89bd5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d8ff24a-2c9d-4f49-8e99-664f5f89bd5d
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 200 in 59 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d8ff24a-2c9d-4f49-8e99-664f5f89bd5d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d466c44f-5e97-4492-a17f-c8aaaeb5ad54"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-e1558f11-1a90-43ad-9b29-39d49e4d1660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1558f11-1a90-43ad-9b29-39d49e4d1660
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1558f11-1a90-43ad-9b29-39d49e4d1660
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
Content-Encoding: gzip
Content-Length: 764

{"items":[{"id":"led_8bfa2e5d-bbf4-4d96-9eb5-0cf9d144124f","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-04T09:28:13.978371611Z"},{"id":"led_1b49de19-a9b3-4253-88b9-65c0906d8840","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_50f46d14-2b25-440b-97e1-fb7bff0b5dd2","createdAt":"2026-11-04T09:28:14.704343178Z"},{"id":"led_36dd6e16-3227-4444-9b1b-e1b2d4b84f4c","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_1a264bd5-7735-4e9a-b2cb-a5479ec93d83","createdAt":"2026-11-04T09:28:14.708109104Z"},{"id":"led_7ea46925-66b2-4376-955a-b779512d26de","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_6df328a1-d690-43ba-8f02-6841c48a2a2d","createdAt":"2026-11-04T09:28:14.711317671Z"},{"id":"led_b32053a9-4821-4835-9093-c09f39e05271","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_6d8e27ed-02aa-4dc9-932b-affa4c1c4d2b","createdAt":"2026-11-04T09:28:14.715822773Z"},{"id":"led_461b8c04-d47d-4c59-a4b7-dc786befdb56","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_f376a6dd-68a4-4934-ba2b-0a282e37f293","createdAt":"2026-11-04T09:28:14.716811778Z"},{"id":"led_7ace92e0-4c70-4f66-9579-c6ce34287ef1","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_dbc94859-0504-4fc8-81c6-aa4c9c2e4b18","createdAt":"2026-11-04T09:28:14.719021144Z"},{"id":"led_59597176-8989-4dcd-a996-9828d0ef97c6","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_dddd1557-ed1e-4e58-a2f6-3b907efba954","createdAt":"2026-11-04T09:28:14.721221725Z"},{"id":"led_7a2ab466-0136-464b-9dd2-fb82cc3d9c97","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_edb654c6-d74a-4a4d-a1c6-484b1e607c3a","createdAt":"2026-11-04T09:28:14.722779908Z"},{"id":"led_cf4dd966-dbe6-4298-beb7-e69b3a32849c","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_afeda92f-ae7d-471a-915c-49178218fc2a","createdAt":"2026-11-04T09:28:14.724044230Z"},{"id":"led_feeceefc-31a6-4c12-8e40-7fc8e0701383","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_47b5a723-4e29-45bc-a1e9-c9b5162220c4","createdAt":"2026-11-04T09:28:14.724136801Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8d87d10-1671-4c26-8bf6-853f736d24d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8d87d10-1671-4c26-8bf6-853f736d24d4
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8d87d10-1671-4c26-8bf6-853f736d24d4
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

## 25. POST /v1/auth/token

```text
#25 POST http://localhost:7070/v1/auth/token
correlation: qa-4387372a-dd8c-43e4-afa8-19137c88868a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4387372a-dd8c-43e4-afa8-19137c88868a
Content-Type: application/json

--- request body ---
{"handle":"qa-8946141c4c85","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4387372a-dd8c-43e4-afa8-19137c88868a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4387372a-dd8c-43e4-afa8-19137c88868a"}
```
