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
| 1 | `POST /v1/accounts` | 201 | 480 | `qa-4715c923-d5cd-45df-b6b0-38b3f3fa6295` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-741add3d-9174-4835-852e-14529e7808d6` |
| 2 | `POST /v1/auth/token` | 200 | 56 | `qa-b09f11da-38a9-497d-8e6f-59cce0730b91` |
| 4 | `POST /v1/auth/token` | 200 | 55 | `qa-25ebafc0-2c64-44e2-839d-2bd9f51103fa` |
| 5 | `POST /v1/auth/token` | 200 | 61 | `qa-bcce86f3-0c92-4078-b44b-cd84d95babba` |
| 3 | `POST /v1/auth/token` | 200 | 66 | `qa-41c8a13e-216c-409b-96ba-6193f1c31825` |
| 7 | `POST /v1/auth/token` | 200 | 66 | `qa-ae56d859-e6aa-4e7c-88fa-3f483b7885ec` |
| 11 | `POST /v1/credits/purchases` | 200 | 54 | `qa-574e7eef-5348-4107-a73f-5f391f82fc4a` |
| 12 | `POST /v1/credits/purchases` | 200 | 56 | `qa-3c449444-c079-4ea9-9b47-bb3b1cde4d0d` |
| 8 | `POST /v1/credits/purchases` | 201 | 65 | `qa-cb19c1ed-b8da-44a2-a5f1-cc7ded868a0d` |
| 9 | `POST /v1/credits/purchases` | 200 | 62 | `qa-46deae29-db05-4f61-bcca-4822335823d1` |
| 10 | `POST /v1/credits/purchases` | 200 | 64 | `qa-a6e45d5b-b91c-4155-9eb0-10649ede0748` |
| 13 | `POST /v1/credits/purchases` | 200 | 63 | `qa-0b5153eb-477d-4f11-a043-385365522e4a` |
| 14 | `POST /v1/auth/token` | 200 | 24 | `qa-9691da89-21a4-4b61-91cd-76d4f589ce0b` |
| 15 | `GET /v1/credits/balance` | 200 | 20 | `qa-fac7c066-3515-4e3a-87f9-342cd031655b` |
| 16 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-602e30db-2c34-4fc3-8335-a2a41c4f273b` |
| 17 | `POST /v1/auth/token` | 401 | 20 | `qa-9be39e8a-1ec4-47a0-a2c3-402c26c4aaf9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4715c923-d5cd-45df-b6b0-38b3f3fa6295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4715c923-d5cd-45df-b6b0-38b3f3fa6295
Content-Type: application/json

--- request body ---
{"handle":"qa-5a55de87c9b5","displayName":"QA 5a55de87c9b5","password":"****","region":"eu"}

--- response: 201 in 480 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4715c923-d5cd-45df-b6b0-38b3f3fa6295
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
Location: /v1/accounts/qa-5a55de87c9b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1e95b60-fdaa-4562-b196-617e3cf34e5e","handle":"qa-5a55de87c9b5","displayName":"QA 5a55de87c9b5","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.190888023Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-741add3d-9174-4835-852e-14529e7808d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-741add3d-9174-4835-852e-14529e7808d6
Content-Type: application/json

--- request body ---
{"handle":"qa-5a55de87c9b5","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-741add3d-9174-4835-852e-14529e7808d6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1e95b60-fdaa-4562-b196-617e3cf34e5e"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b09f11da-38a9-497d-8e6f-59cce0730b91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b09f11da-38a9-497d-8e6f-59cce0730b91
Content-Type: application/json

--- request body ---
{"handle":"qa-5a55de87c9b5","password":"****"}

--- response: 200 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b09f11da-38a9-497d-8e6f-59cce0730b91
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1e95b60-fdaa-4562-b196-617e3cf34e5e"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-25ebafc0-2c64-44e2-839d-2bd9f51103fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25ebafc0-2c64-44e2-839d-2bd9f51103fa
Content-Type: application/json

--- request body ---
{"handle":"qa-5a55de87c9b5","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-25ebafc0-2c64-44e2-839d-2bd9f51103fa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1e95b60-fdaa-4562-b196-617e3cf34e5e"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-bcce86f3-0c92-4078-b44b-cd84d95babba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcce86f3-0c92-4078-b44b-cd84d95babba
Content-Type: application/json

--- request body ---
{"handle":"qa-5a55de87c9b5","password":"****"}

--- response: 200 in 61 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcce86f3-0c92-4078-b44b-cd84d95babba
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1e95b60-fdaa-4562-b196-617e3cf34e5e"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-41c8a13e-216c-409b-96ba-6193f1c31825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41c8a13e-216c-409b-96ba-6193f1c31825
Content-Type: application/json

--- request body ---
{"handle":"qa-5a55de87c9b5","password":"****"}

--- response: 200 in 66 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-41c8a13e-216c-409b-96ba-6193f1c31825
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1e95b60-fdaa-4562-b196-617e3cf34e5e"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ae56d859-e6aa-4e7c-88fa-3f483b7885ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae56d859-e6aa-4e7c-88fa-3f483b7885ec
Content-Type: application/json

--- request body ---
{"handle":"qa-5a55de87c9b5","password":"****"}

--- response: 200 in 66 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae56d859-e6aa-4e7c-88fa-3f483b7885ec
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1e95b60-fdaa-4562-b196-617e3cf34e5e"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-574e7eef-5348-4107-a73f-5f391f82fc4a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4e465168788d4b068d7a48bf285f06ce
X-Correlation-Id: qa-574e7eef-5348-4107-a73f-5f391f82fc4a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 54 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-574e7eef-5348-4107-a73f-5f391f82fc4a
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
Location: /v1/credits/purchases/pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971370978Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3c449444-c079-4ea9-9b47-bb3b1cde4d0d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4e465168788d4b068d7a48bf285f06ce
X-Correlation-Id: qa-3c449444-c079-4ea9-9b47-bb3b1cde4d0d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c449444-c079-4ea9-9b47-bb3b1cde4d0d
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
Location: /v1/credits/purchases/pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971370978Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cb19c1ed-b8da-44a2-a5f1-cc7ded868a0d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4e465168788d4b068d7a48bf285f06ce
X-Correlation-Id: qa-cb19c1ed-b8da-44a2-a5f1-cc7ded868a0d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 65 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb19c1ed-b8da-44a2-a5f1-cc7ded868a0d
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
Location: /v1/credits/purchases/pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a
Content-Length: 144

{"id":"pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971370978Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-46deae29-db05-4f61-bcca-4822335823d1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4e465168788d4b068d7a48bf285f06ce
X-Correlation-Id: qa-46deae29-db05-4f61-bcca-4822335823d1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 62 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-46deae29-db05-4f61-bcca-4822335823d1
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
Location: /v1/credits/purchases/pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971370978Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a6e45d5b-b91c-4155-9eb0-10649ede0748

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4e465168788d4b068d7a48bf285f06ce
X-Correlation-Id: qa-a6e45d5b-b91c-4155-9eb0-10649ede0748
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 64 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6e45d5b-b91c-4155-9eb0-10649ede0748
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
Location: /v1/credits/purchases/pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971370978Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0b5153eb-477d-4f11-a043-385365522e4a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4e465168788d4b068d7a48bf285f06ce
X-Correlation-Id: qa-0b5153eb-477d-4f11-a043-385365522e4a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 63 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b5153eb-477d-4f11-a043-385365522e4a
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
Location: /v1/credits/purchases/pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3cba8b75-c77a-4258-8c37-8da8a1c60b3a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971370978Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-9691da89-21a4-4b61-91cd-76d4f589ce0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9691da89-21a4-4b61-91cd-76d4f589ce0b
Content-Type: application/json

--- request body ---
{"handle":"qa-5a55de87c9b5","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9691da89-21a4-4b61-91cd-76d4f589ce0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1e95b60-fdaa-4562-b196-617e3cf34e5e"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-fac7c066-3515-4e3a-87f9-342cd031655b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fac7c066-3515-4e3a-87f9-342cd031655b
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-fac7c066-3515-4e3a-87f9-342cd031655b
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

{"balance":15,"currency":"credits","accountId":"acc_f1e95b60-fdaa-4562-b196-617e3cf34e5e"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-602e30db-2c34-4fc3-8335-a2a41c4f273b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-602e30db-2c34-4fc3-8335-a2a41c4f273b
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-602e30db-2c34-4fc3-8335-a2a41c4f273b
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
correlation: qa-9be39e8a-1ec4-47a0-a2c3-402c26c4aaf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9be39e8a-1ec4-47a0-a2c3-402c26c4aaf9
Content-Type: application/json

--- request body ---
{"handle":"qa-5a55de87c9b5","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9be39e8a-1ec4-47a0-a2c3-402c26c4aaf9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9be39e8a-1ec4-47a0-a2c3-402c26c4aaf9"}
```
