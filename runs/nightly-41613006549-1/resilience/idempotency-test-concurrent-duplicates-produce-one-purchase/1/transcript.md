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
| 1 | `POST /v1/accounts` | 201 | 399 | `qa-454b692e-344e-445a-89d8-765f9ce55547` |
| 5 | `POST /v1/auth/token` | 200 | 94 | `qa-446fa948-9ce0-40d6-9e9a-22eca1df40b5` |
| 4 | `POST /v1/auth/token` | 200 | 93 | `qa-062ef039-44d2-48e2-8ba2-fc31d562d060` |
| 6 | `POST /v1/auth/token` | 200 | 91 | `qa-a0b1375a-554c-423c-be52-74ae764b0e25` |
| 7 | `POST /v1/auth/token` | 200 | 84 | `qa-c1b20c18-c401-4703-a8ff-8689acbd5e50` |
| 3 | `POST /v1/auth/token` | 200 | 101 | `qa-36150128-25fa-437a-b467-ad10cfcae0de` |
| 2 | `POST /v1/auth/token` | 200 | 118 | `qa-bb449cfa-250c-440a-a0f6-aac24f1817fd` |
| 13 | `POST /v1/credits/purchases` | 200 | 63 | `qa-9b279b55-8e93-42d1-a843-6abcc8c3eed5` |
| 10 | `POST /v1/credits/purchases` | 200 | 67 | `qa-e1362874-30b1-48ac-8b4b-aaca7f50595f` |
| 9 | `POST /v1/credits/purchases` | 200 | 71 | `qa-ae56927f-c336-4842-a269-20cd2b421fbb` |
| 11 | `POST /v1/credits/purchases` | 200 | 69 | `qa-1115c631-54c8-4dda-b2ee-3fec1c7fa8be` |
| 12 | `POST /v1/credits/purchases` | 200 | 76 | `qa-3ed93a35-3190-4ad5-9071-933a00714008` |
| 8 | `POST /v1/credits/purchases` | 201 | 92 | `qa-5e2517a0-1a5a-4483-babf-68b3629f933e` |
| 14 | `POST /v1/auth/token` | 200 | 13 | `qa-09f921e7-b1a0-468a-b40c-be7e5240c2bb` |
| 15 | `GET /v1/credits/balance` | 200 | 10 | `qa-d30332e9-5038-4a2a-a255-86c5b6c0aeb4` |
| 16 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-25d8299c-5abb-433a-ada4-7b02e110a316` |
| 17 | `POST /v1/auth/token` | 401 | 7 | `qa-2268da1e-762a-442a-af7a-7b884f799d12` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-454b692e-344e-445a-89d8-765f9ce55547

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-454b692e-344e-445a-89d8-765f9ce55547
Content-Type: application/json

--- request body ---
{"handle":"qa-a5e8c291d431","displayName":"QA a5e8c291d431","password":"****","region":"eu"}

--- response: 201 in 399 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-454b692e-344e-445a-89d8-765f9ce55547
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-a5e8c291d431
X-Served-Region: eu
Content-Length: 181

{"id":"acc_673c7a08-8372-4437-a48c-2fdcf4076fbb","handle":"qa-a5e8c291d431","displayName":"QA a5e8c291d431","region":"eu","role":"user","createdAt":"2026-11-03T09:41:38.394408789Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-446fa948-9ce0-40d6-9e9a-22eca1df40b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-446fa948-9ce0-40d6-9e9a-22eca1df40b5
Content-Type: application/json

--- request body ---
{"handle":"qa-a5e8c291d431","password":"****"}

--- response: 200 in 94 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-446fa948-9ce0-40d6-9e9a-22eca1df40b5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_673c7a08-8372-4437-a48c-2fdcf4076fbb"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-062ef039-44d2-48e2-8ba2-fc31d562d060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-062ef039-44d2-48e2-8ba2-fc31d562d060
Content-Type: application/json

--- request body ---
{"handle":"qa-a5e8c291d431","password":"****"}

--- response: 200 in 93 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-062ef039-44d2-48e2-8ba2-fc31d562d060
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_673c7a08-8372-4437-a48c-2fdcf4076fbb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a0b1375a-554c-423c-be52-74ae764b0e25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0b1375a-554c-423c-be52-74ae764b0e25
Content-Type: application/json

--- request body ---
{"handle":"qa-a5e8c291d431","password":"****"}

--- response: 200 in 91 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0b1375a-554c-423c-be52-74ae764b0e25
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_673c7a08-8372-4437-a48c-2fdcf4076fbb"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-c1b20c18-c401-4703-a8ff-8689acbd5e50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1b20c18-c401-4703-a8ff-8689acbd5e50
Content-Type: application/json

--- request body ---
{"handle":"qa-a5e8c291d431","password":"****"}

--- response: 200 in 84 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1b20c18-c401-4703-a8ff-8689acbd5e50
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_673c7a08-8372-4437-a48c-2fdcf4076fbb"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-36150128-25fa-437a-b467-ad10cfcae0de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36150128-25fa-437a-b467-ad10cfcae0de
Content-Type: application/json

--- request body ---
{"handle":"qa-a5e8c291d431","password":"****"}

--- response: 200 in 101 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-36150128-25fa-437a-b467-ad10cfcae0de
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_673c7a08-8372-4437-a48c-2fdcf4076fbb"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bb449cfa-250c-440a-a0f6-aac24f1817fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb449cfa-250c-440a-a0f6-aac24f1817fd
Content-Type: application/json

--- request body ---
{"handle":"qa-a5e8c291d431","password":"****"}

--- response: 200 in 118 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb449cfa-250c-440a-a0f6-aac24f1817fd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_673c7a08-8372-4437-a48c-2fdcf4076fbb"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9b279b55-8e93-42d1-a843-6abcc8c3eed5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-62d378ed3bdb4bec89589438b9d00b20
X-Correlation-Id: qa-9b279b55-8e93-42d1-a843-6abcc8c3eed5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 63 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b279b55-8e93-42d1-a843-6abcc8c3eed5
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
Location: /v1/credits/purchases/pur_c9177a23-2a9d-4799-aa25-42e6eb20200e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_c9177a23-2a9d-4799-aa25-42e6eb20200e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.071493012Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e1362874-30b1-48ac-8b4b-aaca7f50595f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-62d378ed3bdb4bec89589438b9d00b20
X-Correlation-Id: qa-e1362874-30b1-48ac-8b4b-aaca7f50595f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 67 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1362874-30b1-48ac-8b4b-aaca7f50595f
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
Location: /v1/credits/purchases/pur_c9177a23-2a9d-4799-aa25-42e6eb20200e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_c9177a23-2a9d-4799-aa25-42e6eb20200e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.071493012Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ae56927f-c336-4842-a269-20cd2b421fbb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-62d378ed3bdb4bec89589438b9d00b20
X-Correlation-Id: qa-ae56927f-c336-4842-a269-20cd2b421fbb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 71 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae56927f-c336-4842-a269-20cd2b421fbb
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
Location: /v1/credits/purchases/pur_c9177a23-2a9d-4799-aa25-42e6eb20200e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_c9177a23-2a9d-4799-aa25-42e6eb20200e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.071493012Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1115c631-54c8-4dda-b2ee-3fec1c7fa8be

--- request headers ---
Accept: application/json
Idempotency-Key: qa-62d378ed3bdb4bec89589438b9d00b20
X-Correlation-Id: qa-1115c631-54c8-4dda-b2ee-3fec1c7fa8be
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 69 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-1115c631-54c8-4dda-b2ee-3fec1c7fa8be
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
Location: /v1/credits/purchases/pur_c9177a23-2a9d-4799-aa25-42e6eb20200e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_c9177a23-2a9d-4799-aa25-42e6eb20200e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.071493012Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3ed93a35-3190-4ad5-9071-933a00714008

--- request headers ---
Accept: application/json
Idempotency-Key: qa-62d378ed3bdb4bec89589438b9d00b20
X-Correlation-Id: qa-3ed93a35-3190-4ad5-9071-933a00714008
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 76 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ed93a35-3190-4ad5-9071-933a00714008
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
Location: /v1/credits/purchases/pur_c9177a23-2a9d-4799-aa25-42e6eb20200e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_c9177a23-2a9d-4799-aa25-42e6eb20200e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.071493012Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5e2517a0-1a5a-4483-babf-68b3629f933e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-62d378ed3bdb4bec89589438b9d00b20
X-Correlation-Id: qa-5e2517a0-1a5a-4483-babf-68b3629f933e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 92 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e2517a0-1a5a-4483-babf-68b3629f933e
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
Location: /v1/credits/purchases/pur_c9177a23-2a9d-4799-aa25-42e6eb20200e
Content-Length: 144

{"id":"pur_c9177a23-2a9d-4799-aa25-42e6eb20200e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.071493012Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-09f921e7-b1a0-468a-b40c-be7e5240c2bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09f921e7-b1a0-468a-b40c-be7e5240c2bb
Content-Type: application/json

--- request body ---
{"handle":"qa-a5e8c291d431","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-09f921e7-b1a0-468a-b40c-be7e5240c2bb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_673c7a08-8372-4437-a48c-2fdcf4076fbb"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-d30332e9-5038-4a2a-a255-86c5b6c0aeb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d30332e9-5038-4a2a-a255-86c5b6c0aeb4
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-d30332e9-5038-4a2a-a255-86c5b6c0aeb4
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

{"balance":15,"currency":"credits","accountId":"acc_673c7a08-8372-4437-a48c-2fdcf4076fbb"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25d8299c-5abb-433a-ada4-7b02e110a316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25d8299c-5abb-433a-ada4-7b02e110a316
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25d8299c-5abb-433a-ada4-7b02e110a316
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
correlation: qa-2268da1e-762a-442a-af7a-7b884f799d12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2268da1e-762a-442a-af7a-7b884f799d12
Content-Type: application/json

--- request body ---
{"handle":"qa-a5e8c291d431","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2268da1e-762a-442a-af7a-7b884f799d12
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2268da1e-762a-442a-af7a-7b884f799d12"}
```
