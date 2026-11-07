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
| 1 | `POST /v1/accounts` | 201 | 383 | `qa-004ae452-f9be-410e-aef4-24e69e857221` |
| 5 | `POST /v1/auth/token` | 200 | 41 | `qa-efdbe75e-e6d8-4dd9-acc5-559af8bcf48b` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-cc23db27-ca05-42d1-a7de-c79fb53cae17` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-793d1175-1269-4fef-94a2-a294a7536682` |
| 2 | `POST /v1/auth/token` | 200 | 72 | `qa-46e90331-3149-48b7-9929-150bf83653fe` |
| 10 | `POST /v1/auth/token` | 200 | 27 | `qa-9a6f0adc-6b21-40e0-8931-d64b1f70008a` |
| 4 | `POST /v1/auth/token` | 200 | 58 | `qa-f726e175-fac6-4989-8483-01cabb315fc3` |
| 9 | `POST /v1/auth/token` | 200 | 52 | `qa-49969d61-34ad-43ef-a0e1-73e500be899a` |
| 7 | `POST /v1/auth/token` | 200 | 54 | `qa-5115f0af-85e6-4442-b978-adc442f4fb54` |
| 8 | `POST /v1/auth/token` | 200 | 57 | `qa-2b150f4c-d65b-4834-a636-f9f8b6f6bc77` |
| 11 | `POST /v1/auth/token` | 200 | 30 | `qa-b9b49d12-1ec9-4c92-8036-37b59c8458a6` |
| 15 | `POST /v1/credits/purchases` | 201 | 32 | `qa-3f9b78a1-f69b-4d38-9249-d83edcb78315` |
| 13 | `POST /v1/credits/purchases` | 201 | 37 | `qa-d1445df3-85bd-4cae-9b39-ab2cb7e3973b` |
| 12 | `POST /v1/credits/purchases` | 201 | 41 | `qa-4c576a45-abff-47ad-b82b-5af7395ec179` |
| 16 | `POST /v1/credits/purchases` | 201 | 36 | `qa-9990ba06-b950-4f82-a031-244883bd2e4d` |
| 14 | `POST /v1/credits/purchases` | 201 | 46 | `qa-9a626eb9-8986-4f55-8008-9ff5b3340a40` |
| 21 | `POST /v1/credits/purchases` | 201 | 24 | `qa-dcca7070-f817-48de-8ac3-abe98c07f981` |
| 17 | `POST /v1/credits/purchases` | 201 | 44 | `qa-d4279152-5801-41a0-9143-4ab2caf4ca72` |
| 19 | `POST /v1/credits/purchases` | 201 | 36 | `qa-5fea429e-f806-4ea1-8e59-a61b79c296b7` |
| 20 | `POST /v1/credits/purchases` | 201 | 45 | `qa-0fa23799-567d-4bc3-b591-b7f46c4b2372` |
| 18 | `POST /v1/credits/purchases` | 201 | 53 | `qa-a29f08af-7c38-4f02-93c4-b54be3cf3d02` |
| 22 | `POST /v1/auth/token` | 200 | 23 | `qa-bf255a9d-1882-4878-b460-e39d1abbacce` |
| 23 | `GET /v1/credits/ledger` | 200 | 37 | `qa-f1f87867-ece2-4b97-ae84-a184e37bb3cc` |
| 24 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-471732a1-ae6e-4790-8bef-febae13d718f` |
| 25 | `POST /v1/auth/token` | 401 | 14 | `qa-9c9b88d2-2865-41fa-88a7-04513f2604ec` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-004ae452-f9be-410e-aef4-24e69e857221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-004ae452-f9be-410e-aef4-24e69e857221
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","displayName":"QA ffba28a0ad95","password":"****","region":"us"}

--- response: 201 in 383 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-004ae452-f9be-410e-aef4-24e69e857221
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
Location: /v1/accounts/qa-ffba28a0ad95
X-Served-Region: us
Content-Length: 181

{"id":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5","handle":"qa-ffba28a0ad95","displayName":"QA ffba28a0ad95","region":"us","role":"user","createdAt":"2026-11-02T09:38:48.657578879Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-efdbe75e-e6d8-4dd9-acc5-559af8bcf48b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efdbe75e-e6d8-4dd9-acc5-559af8bcf48b
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 41 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-efdbe75e-e6d8-4dd9-acc5-559af8bcf48b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cc23db27-ca05-42d1-a7de-c79fb53cae17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc23db27-ca05-42d1-a7de-c79fb53cae17
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 44 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc23db27-ca05-42d1-a7de-c79fb53cae17
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-793d1175-1269-4fef-94a2-a294a7536682

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-793d1175-1269-4fef-94a2-a294a7536682
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 51 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-793d1175-1269-4fef-94a2-a294a7536682
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-46e90331-3149-48b7-9929-150bf83653fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46e90331-3149-48b7-9929-150bf83653fe
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 72 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-46e90331-3149-48b7-9929-150bf83653fe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9a6f0adc-6b21-40e0-8931-d64b1f70008a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6f0adc-6b21-40e0-8931-d64b1f70008a
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a6f0adc-6b21-40e0-8931-d64b1f70008a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f726e175-fac6-4989-8483-01cabb315fc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f726e175-fac6-4989-8483-01cabb315fc3
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 58 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-f726e175-fac6-4989-8483-01cabb315fc3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-49969d61-34ad-43ef-a0e1-73e500be899a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49969d61-34ad-43ef-a0e1-73e500be899a
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 52 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-49969d61-34ad-43ef-a0e1-73e500be899a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-5115f0af-85e6-4442-b978-adc442f4fb54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5115f0af-85e6-4442-b978-adc442f4fb54
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 54 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-5115f0af-85e6-4442-b978-adc442f4fb54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-2b150f4c-d65b-4834-a636-f9f8b6f6bc77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b150f4c-d65b-4834-a636-f9f8b6f6bc77
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 57 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b150f4c-d65b-4834-a636-f9f8b6f6bc77
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-b9b49d12-1ec9-4c92-8036-37b59c8458a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9b49d12-1ec9-4c92-8036-37b59c8458a6
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9b49d12-1ec9-4c92-8036-37b59c8458a6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3f9b78a1-f69b-4d38-9249-d83edcb78315

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a19bcdb8a1f646169bf441bdb14aac0a
X-Correlation-Id: qa-3f9b78a1-f69b-4d38-9249-d83edcb78315
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f9b78a1-f69b-4d38-9249-d83edcb78315
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
Location: /v1/credits/purchases/pur_7f05b5d5-070d-4da4-9e34-725ef1574033
Content-Length: 144

{"id":"pur_7f05b5d5-070d-4da4-9e34-725ef1574033","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:49.116259109Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d1445df3-85bd-4cae-9b39-ab2cb7e3973b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-31f07cb00f2349c080679bab8c1646bb
X-Correlation-Id: qa-d1445df3-85bd-4cae-9b39-ab2cb7e3973b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1445df3-85bd-4cae-9b39-ab2cb7e3973b
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
Location: /v1/credits/purchases/pur_be89f83c-00d7-4a79-ab5f-43f391c4b2a3
Content-Length: 144

{"id":"pur_be89f83c-00d7-4a79-ab5f-43f391c4b2a3","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-02T09:38:49.124368435Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4c576a45-abff-47ad-b82b-5af7395ec179

--- request headers ---
Accept: application/json
Idempotency-Key: qa-129ad91436574663b92d4c31a75dea52
X-Correlation-Id: qa-4c576a45-abff-47ad-b82b-5af7395ec179
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 41 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c576a45-abff-47ad-b82b-5af7395ec179
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
Location: /v1/credits/purchases/pur_37d5ff25-bf0e-437d-87bc-71ac4b18a5ce
Content-Length: 144

{"id":"pur_37d5ff25-bf0e-437d-87bc-71ac4b18a5ce","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-02T09:38:49.118378180Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9990ba06-b950-4f82-a031-244883bd2e4d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6dd75eb3d8e749d29460a31fc9cf853d
X-Correlation-Id: qa-9990ba06-b950-4f82-a031-244883bd2e4d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-9990ba06-b950-4f82-a031-244883bd2e4d
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
Location: /v1/credits/purchases/pur_c5c10b77-064e-433a-9b34-ad1f041e6917
Content-Length: 144

{"id":"pur_c5c10b77-064e-433a-9b34-ad1f041e6917","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-02T09:38:49.120644021Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9a626eb9-8986-4f55-8008-9ff5b3340a40

--- request headers ---
Accept: application/json
Idempotency-Key: qa-751ab4b30fc8460ebd1847c023f73964
X-Correlation-Id: qa-9a626eb9-8986-4f55-8008-9ff5b3340a40
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 46 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a626eb9-8986-4f55-8008-9ff5b3340a40
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
Location: /v1/credits/purchases/pur_d5c5a2c5-37ed-4d49-8410-d4e5507594a7
Content-Length: 144

{"id":"pur_d5c5a2c5-37ed-4d49-8410-d4e5507594a7","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-02T09:38:49.137051779Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dcca7070-f817-48de-8ac3-abe98c07f981

--- request headers ---
Accept: application/json
Idempotency-Key: qa-899b5ebbae274eac9c1d84c9c2d9af44
X-Correlation-Id: qa-dcca7070-f817-48de-8ac3-abe98c07f981
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcca7070-f817-48de-8ac3-abe98c07f981
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
Location: /v1/credits/purchases/pur_d2585f97-0f24-4b23-9821-68523c183670
Content-Length: 144

{"id":"pur_d2585f97-0f24-4b23-9821-68523c183670","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-02T09:38:49.135593781Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d4279152-5801-41a0-9143-4ab2caf4ca72

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3e615328a3864136a1dd2f1d2c4c6da1
X-Correlation-Id: qa-d4279152-5801-41a0-9143-4ab2caf4ca72
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4279152-5801-41a0-9143-4ab2caf4ca72
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
Location: /v1/credits/purchases/pur_a664f651-3004-4e3d-9d80-16f197db72c4
Content-Length: 144

{"id":"pur_a664f651-3004-4e3d-9d80-16f197db72c4","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-02T09:38:49.144557417Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5fea429e-f806-4ea1-8e59-a61b79c296b7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6ccf8a6b167247708bfe4389ceacd21c
X-Correlation-Id: qa-5fea429e-f806-4ea1-8e59-a61b79c296b7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fea429e-f806-4ea1-8e59-a61b79c296b7
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
Location: /v1/credits/purchases/pur_fb2cc73d-933d-4a16-afb1-4fbf0cfd5834
Content-Length: 144

{"id":"pur_fb2cc73d-933d-4a16-afb1-4fbf0cfd5834","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-02T09:38:49.145998178Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0fa23799-567d-4bc3-b591-b7f46c4b2372

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1c2283c2f5c44f3d92977472011d0cb2
X-Correlation-Id: qa-0fa23799-567d-4bc3-b591-b7f46c4b2372
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fa23799-567d-4bc3-b591-b7f46c4b2372
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
Location: /v1/credits/purchases/pur_5aa37aac-ffda-4e9d-95a0-a8e756f7ba94
Content-Length: 145

{"id":"pur_5aa37aac-ffda-4e9d-95a0-a8e756f7ba94","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-02T09:38:49.150873614Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a29f08af-7c38-4f02-93c4-b54be3cf3d02

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ffb50054de87404abdfa8757c3b01c41
X-Correlation-Id: qa-a29f08af-7c38-4f02-93c4-b54be3cf3d02
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-a29f08af-7c38-4f02-93c4-b54be3cf3d02
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
Location: /v1/credits/purchases/pur_122eca05-a7f3-47f3-a942-57814f22f09e
Content-Length: 144

{"id":"pur_122eca05-a7f3-47f3-a942-57814f22f09e","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-02T09:38:49.147328154Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-bf255a9d-1882-4878-b460-e39d1abbacce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf255a9d-1882-4878-b460-e39d1abbacce
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf255a9d-1882-4878-b460-e39d1abbacce
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf5fd71-1024-4107-81f6-dcd021f143d5"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-f1f87867-ece2-4b97-ae84-a184e37bb3cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f87867-ece2-4b97-ae84-a184e37bb3cc
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1f87867-ece2-4b97-ae84-a184e37bb3cc
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
Content-Length: 763

{"items":[{"id":"led_fcebf6aa-ffc6-4ca5-a5fd-4e4ac0dfdb14","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-02T09:38:48.657593379Z"},{"id":"led_388dc1b5-ec00-45ce-92d0-c60d597da6ad","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_7f05b5d5-070d-4da4-9e34-725ef1574033","createdAt":"2026-11-02T09:38:49.116259109Z"},{"id":"led_e964573c-9991-46f2-9896-4880f5ae72b6","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_37d5ff25-bf0e-437d-87bc-71ac4b18a5ce","createdAt":"2026-11-02T09:38:49.118378180Z"},{"id":"led_7f9e04bb-42ee-495a-984c-5ff92d252e23","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_c5c10b77-064e-433a-9b34-ad1f041e6917","createdAt":"2026-11-02T09:38:49.120644021Z"},{"id":"led_8950f887-5386-4640-b9e7-db44b344e89e","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_be89f83c-00d7-4a79-ab5f-43f391c4b2a3","createdAt":"2026-11-02T09:38:49.124368435Z"},{"id":"led_2c8e955a-2f47-44b7-91df-4f0f37d70624","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_d2585f97-0f24-4b23-9821-68523c183670","createdAt":"2026-11-02T09:38:49.135593781Z"},{"id":"led_8aa20e88-d83f-4631-b29e-2bb30a2407fa","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_d5c5a2c5-37ed-4d49-8410-d4e5507594a7","createdAt":"2026-11-02T09:38:49.137051779Z"},{"id":"led_f9b3be49-ab52-42df-b019-8ae8816447e5","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_a664f651-3004-4e3d-9d80-16f197db72c4","createdAt":"2026-11-02T09:38:49.144557417Z"},{"id":"led_3295e96c-2545-4b3b-b098-dd24264a2b27","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_fb2cc73d-933d-4a16-afb1-4fbf0cfd5834","createdAt":"2026-11-02T09:38:49.145998178Z"},{"id":"led_1053ed3c-2531-453e-8789-509385755a02","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_122eca05-a7f3-47f3-a942-57814f22f09e","createdAt":"2026-11-02T09:38:49.147328154Z"},{"id":"led_3b1463d9-5481-421c-901b-3d43e239b960","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_5aa37aac-ffda-4e9d-95a0-a8e756f7ba94","createdAt":"2026-11-02T09:38:49.150873614Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-471732a1-ae6e-4790-8bef-febae13d718f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-471732a1-ae6e-4790-8bef-febae13d718f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-471732a1-ae6e-4790-8bef-febae13d718f
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
correlation: qa-9c9b88d2-2865-41fa-88a7-04513f2604ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c9b88d2-2865-41fa-88a7-04513f2604ec
Content-Type: application/json

--- request body ---
{"handle":"qa-ffba28a0ad95","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c9b88d2-2865-41fa-88a7-04513f2604ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c9b88d2-2865-41fa-88a7-04513f2604ec"}
```
