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
| 1 | `POST /v1/accounts` | 201 | 454 | `qa-fafbffd8-60e5-4053-ab82-4f558bc74d9e` |
| 5 | `POST /v1/auth/token` | 200 | 73 | `qa-c043e93d-855f-42da-a58e-44e718de0cd5` |
| 3 | `POST /v1/auth/token` | 200 | 76 | `qa-cff9df17-1f31-4401-9540-4b54f285ce97` |
| 4 | `POST /v1/auth/token` | 200 | 80 | `qa-feb407a7-3c3e-472e-9df9-3b3d46cc7998` |
| 2 | `POST /v1/auth/token` | 200 | 110 | `qa-be8643cf-dd8d-48aa-905c-499f0b9626cc` |
| 6 | `POST /v1/auth/token` | 200 | 94 | `qa-374d652e-c815-40a8-a604-cba9b09b7fea` |
| 7 | `POST /v1/auth/token` | 200 | 88 | `qa-4b7d2b0b-c109-43a1-b32f-90f92c3dfb11` |
| 9 | `POST /v1/credits/purchases` | 201 | 73 | `qa-af1e872f-77ca-46e6-b24d-399ddb51a296` |
| 10 | `POST /v1/credits/purchases` | 200 | 65 | `qa-0a753ce0-9aca-47eb-aeb4-279609bee2f4` |
| 8 | `POST /v1/credits/purchases` | 200 | 76 | `qa-9c0ec25c-179c-450e-87a9-d33acd53830e` |
| 12 | `POST /v1/credits/purchases` | 200 | 65 | `qa-2df2a0b3-7f0e-4de0-bf69-f0a20c1c5fd2` |
| 13 | `POST /v1/credits/purchases` | 200 | 58 | `qa-402629ac-98d0-4e16-b7f3-0c14071f6893` |
| 11 | `POST /v1/credits/purchases` | 200 | 73 | `qa-1b8d8731-eb34-4258-9ecd-1db4b13cf003` |
| 14 | `POST /v1/auth/token` | 200 | 21 | `qa-359399fb-1fcf-425e-ae86-9d16bb0b4830` |
| 15 | `GET /v1/credits/balance` | 200 | 13 | `qa-ec877541-fa14-424f-892c-d8fc849b4ead` |
| 16 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-d0aeb360-6fc0-4356-ba7c-cab6f8447270` |
| 17 | `POST /v1/auth/token` | 401 | 17 | `qa-6bdc985e-d2ce-44cd-a5cd-bbffd6ffe217` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fafbffd8-60e5-4053-ab82-4f558bc74d9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fafbffd8-60e5-4053-ab82-4f558bc74d9e
Content-Type: application/json

--- request body ---
{"handle":"qa-3a17f93c6f4c","displayName":"QA 3a17f93c6f4c","password":"****","region":"eu"}

--- response: 201 in 454 ms ---
Date: Sat, 07 Nov 2026 08:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fafbffd8-60e5-4053-ab82-4f558bc74d9e
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
Location: /v1/accounts/qa-3a17f93c6f4c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e41cff2b-90ab-4f2a-9345-5b53465907b7","handle":"qa-3a17f93c6f4c","displayName":"QA 3a17f93c6f4c","region":"eu","role":"user","createdAt":"2026-11-07T08:55:02.764511953Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c043e93d-855f-42da-a58e-44e718de0cd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c043e93d-855f-42da-a58e-44e718de0cd5
Content-Type: application/json

--- request body ---
{"handle":"qa-3a17f93c6f4c","password":"****"}

--- response: 200 in 73 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c043e93d-855f-42da-a58e-44e718de0cd5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e41cff2b-90ab-4f2a-9345-5b53465907b7"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cff9df17-1f31-4401-9540-4b54f285ce97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cff9df17-1f31-4401-9540-4b54f285ce97
Content-Type: application/json

--- request body ---
{"handle":"qa-3a17f93c6f4c","password":"****"}

--- response: 200 in 76 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cff9df17-1f31-4401-9540-4b54f285ce97
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e41cff2b-90ab-4f2a-9345-5b53465907b7"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-feb407a7-3c3e-472e-9df9-3b3d46cc7998

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feb407a7-3c3e-472e-9df9-3b3d46cc7998
Content-Type: application/json

--- request body ---
{"handle":"qa-3a17f93c6f4c","password":"****"}

--- response: 200 in 80 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-feb407a7-3c3e-472e-9df9-3b3d46cc7998
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e41cff2b-90ab-4f2a-9345-5b53465907b7"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-be8643cf-dd8d-48aa-905c-499f0b9626cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be8643cf-dd8d-48aa-905c-499f0b9626cc
Content-Type: application/json

--- request body ---
{"handle":"qa-3a17f93c6f4c","password":"****"}

--- response: 200 in 110 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-be8643cf-dd8d-48aa-905c-499f0b9626cc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e41cff2b-90ab-4f2a-9345-5b53465907b7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-374d652e-c815-40a8-a604-cba9b09b7fea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374d652e-c815-40a8-a604-cba9b09b7fea
Content-Type: application/json

--- request body ---
{"handle":"qa-3a17f93c6f4c","password":"****"}

--- response: 200 in 94 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-374d652e-c815-40a8-a604-cba9b09b7fea
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e41cff2b-90ab-4f2a-9345-5b53465907b7"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4b7d2b0b-c109-43a1-b32f-90f92c3dfb11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b7d2b0b-c109-43a1-b32f-90f92c3dfb11
Content-Type: application/json

--- request body ---
{"handle":"qa-3a17f93c6f4c","password":"****"}

--- response: 200 in 88 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b7d2b0b-c109-43a1-b32f-90f92c3dfb11
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e41cff2b-90ab-4f2a-9345-5b53465907b7"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-af1e872f-77ca-46e6-b24d-399ddb51a296

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1e8fe1c2a6d64a2b953c976ff8a0e2f1
X-Correlation-Id: qa-af1e872f-77ca-46e6-b24d-399ddb51a296
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 73 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-af1e872f-77ca-46e6-b24d-399ddb51a296
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
Location: /v1/credits/purchases/pur_09359730-afb3-4523-b843-49d4b9bcb3e2
Content-Length: 144

{"id":"pur_09359730-afb3-4523-b843-49d4b9bcb3e2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.394922089Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0a753ce0-9aca-47eb-aeb4-279609bee2f4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1e8fe1c2a6d64a2b953c976ff8a0e2f1
X-Correlation-Id: qa-0a753ce0-9aca-47eb-aeb4-279609bee2f4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 65 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a753ce0-9aca-47eb-aeb4-279609bee2f4
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
Location: /v1/credits/purchases/pur_09359730-afb3-4523-b843-49d4b9bcb3e2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_09359730-afb3-4523-b843-49d4b9bcb3e2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.394922089Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9c0ec25c-179c-450e-87a9-d33acd53830e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1e8fe1c2a6d64a2b953c976ff8a0e2f1
X-Correlation-Id: qa-9c0ec25c-179c-450e-87a9-d33acd53830e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 76 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c0ec25c-179c-450e-87a9-d33acd53830e
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
Location: /v1/credits/purchases/pur_09359730-afb3-4523-b843-49d4b9bcb3e2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_09359730-afb3-4523-b843-49d4b9bcb3e2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.394922089Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2df2a0b3-7f0e-4de0-bf69-f0a20c1c5fd2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1e8fe1c2a6d64a2b953c976ff8a0e2f1
X-Correlation-Id: qa-2df2a0b3-7f0e-4de0-bf69-f0a20c1c5fd2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 65 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2df2a0b3-7f0e-4de0-bf69-f0a20c1c5fd2
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
Location: /v1/credits/purchases/pur_09359730-afb3-4523-b843-49d4b9bcb3e2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_09359730-afb3-4523-b843-49d4b9bcb3e2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.394922089Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-402629ac-98d0-4e16-b7f3-0c14071f6893

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1e8fe1c2a6d64a2b953c976ff8a0e2f1
X-Correlation-Id: qa-402629ac-98d0-4e16-b7f3-0c14071f6893
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 58 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-402629ac-98d0-4e16-b7f3-0c14071f6893
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
Location: /v1/credits/purchases/pur_09359730-afb3-4523-b843-49d4b9bcb3e2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_09359730-afb3-4523-b843-49d4b9bcb3e2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.394922089Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1b8d8731-eb34-4258-9ecd-1db4b13cf003

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1e8fe1c2a6d64a2b953c976ff8a0e2f1
X-Correlation-Id: qa-1b8d8731-eb34-4258-9ecd-1db4b13cf003
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 73 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b8d8731-eb34-4258-9ecd-1db4b13cf003
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
Location: /v1/credits/purchases/pur_09359730-afb3-4523-b843-49d4b9bcb3e2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_09359730-afb3-4523-b843-49d4b9bcb3e2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.394922089Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-359399fb-1fcf-425e-ae86-9d16bb0b4830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-359399fb-1fcf-425e-ae86-9d16bb0b4830
Content-Type: application/json

--- request body ---
{"handle":"qa-3a17f93c6f4c","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-359399fb-1fcf-425e-ae86-9d16bb0b4830
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e41cff2b-90ab-4f2a-9345-5b53465907b7"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-ec877541-fa14-424f-892c-d8fc849b4ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec877541-fa14-424f-892c-d8fc849b4ead
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec877541-fa14-424f-892c-d8fc849b4ead
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

{"balance":15,"currency":"credits","accountId":"acc_e41cff2b-90ab-4f2a-9345-5b53465907b7"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0aeb360-6fc0-4356-ba7c-cab6f8447270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0aeb360-6fc0-4356-ba7c-cab6f8447270
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0aeb360-6fc0-4356-ba7c-cab6f8447270
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
correlation: qa-6bdc985e-d2ce-44cd-a5cd-bbffd6ffe217

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bdc985e-d2ce-44cd-a5cd-bbffd6ffe217
Content-Type: application/json

--- request body ---
{"handle":"qa-3a17f93c6f4c","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bdc985e-d2ce-44cd-a5cd-bbffd6ffe217
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6bdc985e-d2ce-44cd-a5cd-bbffd6ffe217"}
```
