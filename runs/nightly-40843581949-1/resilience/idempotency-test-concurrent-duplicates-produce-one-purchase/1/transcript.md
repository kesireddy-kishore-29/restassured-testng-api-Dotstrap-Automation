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
| 1 | `POST /v1/accounts` | 201 | 399 | `qa-80f07eae-1208-441f-af52-9df348837816` |
| 2 | `POST /v1/auth/token` | 200 | 72 | `qa-775127f9-5a09-409c-9f60-477b736a69da` |
| 4 | `POST /v1/auth/token` | 200 | 62 | `qa-c1e48374-3e03-4d5b-a847-ea23539d07a3` |
| 5 | `POST /v1/auth/token` | 200 | 64 | `qa-4c842811-83ed-49ef-8afd-f9bea2208a0a` |
| 7 | `POST /v1/auth/token` | 200 | 62 | `qa-f58e740d-2e51-43af-8e78-214817fe7c01` |
| 3 | `POST /v1/auth/token` | 200 | 75 | `qa-0efcd670-1bda-408e-b02a-572d71df7087` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-6b21ec60-7e26-4c1d-b204-f2ed7d26c87e` |
| 10 | `POST /v1/credits/purchases` | 200 | 68 | `qa-a89a63e8-c60e-4556-9e62-2a23aa7854d6` |
| 13 | `POST /v1/credits/purchases` | 200 | 58 | `qa-69a181b8-1d81-4bd0-9771-44f4a7d1c356` |
| 9 | `POST /v1/credits/purchases` | 200 | 82 | `qa-878f891e-6bb5-43e6-b543-f4e9ae3422b6` |
| 12 | `POST /v1/credits/purchases` | 200 | 61 | `qa-a6313d45-2f71-47a2-85f1-2890125f96cc` |
| 11 | `POST /v1/credits/purchases` | 201 | 72 | `qa-7a2a2c51-8aaa-4243-bee4-81c0a269d677` |
| 8 | `POST /v1/credits/purchases` | 200 | 96 | `qa-c1d68cf9-bb0f-4a0c-8e0e-079d7974b0ff` |
| 14 | `POST /v1/auth/token` | 200 | 16 | `qa-45a75554-2d6f-453d-b623-bd6a54208b11` |
| 15 | `GET /v1/credits/balance` | 200 | 11 | `qa-1450631a-3ddd-4ca4-a129-767210f3d6c5` |
| 16 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-397476fa-019c-4d28-a987-a1e0668d9759` |
| 17 | `POST /v1/auth/token` | 401 | 11 | `qa-4a6a711b-d58f-4176-a907-74148b69e85c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-80f07eae-1208-441f-af52-9df348837816

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80f07eae-1208-441f-af52-9df348837816
Content-Type: application/json

--- request body ---
{"handle":"qa-7a2b1275557b","displayName":"QA 7a2b1275557b","password":"****","region":"eu"}

--- response: 201 in 399 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-80f07eae-1208-441f-af52-9df348837816
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
Location: /v1/accounts/qa-7a2b1275557b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_181d7f29-6d65-400a-80ae-be4028674246","handle":"qa-7a2b1275557b","displayName":"QA 7a2b1275557b","region":"eu","role":"user","createdAt":"2026-10-29T08:38:56.639562524Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-775127f9-5a09-409c-9f60-477b736a69da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-775127f9-5a09-409c-9f60-477b736a69da
Content-Type: application/json

--- request body ---
{"handle":"qa-7a2b1275557b","password":"****"}

--- response: 200 in 72 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-775127f9-5a09-409c-9f60-477b736a69da
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_181d7f29-6d65-400a-80ae-be4028674246"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c1e48374-3e03-4d5b-a847-ea23539d07a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1e48374-3e03-4d5b-a847-ea23539d07a3
Content-Type: application/json

--- request body ---
{"handle":"qa-7a2b1275557b","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1e48374-3e03-4d5b-a847-ea23539d07a3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_181d7f29-6d65-400a-80ae-be4028674246"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4c842811-83ed-49ef-8afd-f9bea2208a0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c842811-83ed-49ef-8afd-f9bea2208a0a
Content-Type: application/json

--- request body ---
{"handle":"qa-7a2b1275557b","password":"****"}

--- response: 200 in 64 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c842811-83ed-49ef-8afd-f9bea2208a0a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_181d7f29-6d65-400a-80ae-be4028674246"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-f58e740d-2e51-43af-8e78-214817fe7c01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f58e740d-2e51-43af-8e78-214817fe7c01
Content-Type: application/json

--- request body ---
{"handle":"qa-7a2b1275557b","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f58e740d-2e51-43af-8e78-214817fe7c01
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_181d7f29-6d65-400a-80ae-be4028674246"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0efcd670-1bda-408e-b02a-572d71df7087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0efcd670-1bda-408e-b02a-572d71df7087
Content-Type: application/json

--- request body ---
{"handle":"qa-7a2b1275557b","password":"****"}

--- response: 200 in 75 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0efcd670-1bda-408e-b02a-572d71df7087
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_181d7f29-6d65-400a-80ae-be4028674246"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6b21ec60-7e26-4c1d-b204-f2ed7d26c87e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b21ec60-7e26-4c1d-b204-f2ed7d26c87e
Content-Type: application/json

--- request body ---
{"handle":"qa-7a2b1275557b","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b21ec60-7e26-4c1d-b204-f2ed7d26c87e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_181d7f29-6d65-400a-80ae-be4028674246"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a89a63e8-c60e-4556-9e62-2a23aa7854d6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9262f716104148f7ba4e6f5c0e9a4030
X-Correlation-Id: qa-a89a63e8-c60e-4556-9e62-2a23aa7854d6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 68 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a89a63e8-c60e-4556-9e62-2a23aa7854d6
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
Location: /v1/credits/purchases/pur_89330c02-0235-4bcf-abcd-c418f83b8c7d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89330c02-0235-4bcf-abcd-c418f83b8c7d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.413297827Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-69a181b8-1d81-4bd0-9771-44f4a7d1c356

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9262f716104148f7ba4e6f5c0e9a4030
X-Correlation-Id: qa-69a181b8-1d81-4bd0-9771-44f4a7d1c356
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 58 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-69a181b8-1d81-4bd0-9771-44f4a7d1c356
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
Location: /v1/credits/purchases/pur_89330c02-0235-4bcf-abcd-c418f83b8c7d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89330c02-0235-4bcf-abcd-c418f83b8c7d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.413297827Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-878f891e-6bb5-43e6-b543-f4e9ae3422b6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9262f716104148f7ba4e6f5c0e9a4030
X-Correlation-Id: qa-878f891e-6bb5-43e6-b543-f4e9ae3422b6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 82 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-878f891e-6bb5-43e6-b543-f4e9ae3422b6
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
Location: /v1/credits/purchases/pur_89330c02-0235-4bcf-abcd-c418f83b8c7d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89330c02-0235-4bcf-abcd-c418f83b8c7d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.413297827Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a6313d45-2f71-47a2-85f1-2890125f96cc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9262f716104148f7ba4e6f5c0e9a4030
X-Correlation-Id: qa-a6313d45-2f71-47a2-85f1-2890125f96cc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 61 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6313d45-2f71-47a2-85f1-2890125f96cc
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
Location: /v1/credits/purchases/pur_89330c02-0235-4bcf-abcd-c418f83b8c7d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89330c02-0235-4bcf-abcd-c418f83b8c7d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.413297827Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7a2a2c51-8aaa-4243-bee4-81c0a269d677

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9262f716104148f7ba4e6f5c0e9a4030
X-Correlation-Id: qa-7a2a2c51-8aaa-4243-bee4-81c0a269d677
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a2a2c51-8aaa-4243-bee4-81c0a269d677
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
Location: /v1/credits/purchases/pur_89330c02-0235-4bcf-abcd-c418f83b8c7d
Content-Length: 144

{"id":"pur_89330c02-0235-4bcf-abcd-c418f83b8c7d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.413297827Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c1d68cf9-bb0f-4a0c-8e0e-079d7974b0ff

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9262f716104148f7ba4e6f5c0e9a4030
X-Correlation-Id: qa-c1d68cf9-bb0f-4a0c-8e0e-079d7974b0ff
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 96 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1d68cf9-bb0f-4a0c-8e0e-079d7974b0ff
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
Location: /v1/credits/purchases/pur_89330c02-0235-4bcf-abcd-c418f83b8c7d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89330c02-0235-4bcf-abcd-c418f83b8c7d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.413297827Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-45a75554-2d6f-453d-b623-bd6a54208b11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a75554-2d6f-453d-b623-bd6a54208b11
Content-Type: application/json

--- request body ---
{"handle":"qa-7a2b1275557b","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-45a75554-2d6f-453d-b623-bd6a54208b11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_181d7f29-6d65-400a-80ae-be4028674246"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-1450631a-3ddd-4ca4-a129-767210f3d6c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1450631a-3ddd-4ca4-a129-767210f3d6c5
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1450631a-3ddd-4ca4-a129-767210f3d6c5
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

{"balance":15,"currency":"credits","accountId":"acc_181d7f29-6d65-400a-80ae-be4028674246"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-397476fa-019c-4d28-a987-a1e0668d9759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-397476fa-019c-4d28-a987-a1e0668d9759
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-397476fa-019c-4d28-a987-a1e0668d9759
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
correlation: qa-4a6a711b-d58f-4176-a907-74148b69e85c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a6a711b-d58f-4176-a907-74148b69e85c
Content-Type: application/json

--- request body ---
{"handle":"qa-7a2b1275557b","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a6a711b-d58f-4176-a907-74148b69e85c
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a6a711b-d58f-4176-a907-74148b69e85c"}
```
