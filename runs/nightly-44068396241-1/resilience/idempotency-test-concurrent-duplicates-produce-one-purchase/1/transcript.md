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
| 1 | `POST /v1/accounts` | 201 | 458 | `qa-9d6b2622-e262-4123-9b9c-fa2fad36b4db` |
| 4 | `POST /v1/auth/token` | 200 | 73 | `qa-f0e71f51-b3c5-404e-8d79-f01be60aced7` |
| 3 | `POST /v1/auth/token` | 200 | 78 | `qa-98ca297b-e1a2-450a-b059-11a928f36c39` |
| 7 | `POST /v1/auth/token` | 200 | 75 | `qa-6158e867-8344-4098-8d53-b9663304e360` |
| 5 | `POST /v1/auth/token` | 200 | 82 | `qa-97e2e1af-3109-47aa-848b-9c8c0f430c3d` |
| 2 | `POST /v1/auth/token` | 200 | 92 | `qa-07ce44bc-9eec-41b5-9f44-1e5b5c341d72` |
| 6 | `POST /v1/auth/token` | 200 | 68 | `qa-27e690c6-60fa-426c-985e-4a8bcaafdd96` |
| 11 | `POST /v1/credits/purchases` | 200 | 51 | `qa-b47186ee-c6d2-456f-ad4d-1f1221d0c50d` |
| 13 | `POST /v1/credits/purchases` | 200 | 30 | `qa-d20ab24e-85dd-4886-8a95-2c7585df6995` |
| 8 | `POST /v1/credits/purchases` | 200 | 67 | `qa-d791a1cd-941d-42a2-8e3d-6fb1c69a5bd5` |
| 12 | `POST /v1/credits/purchases` | 200 | 54 | `qa-2f6afe40-85e1-41af-ad0b-c240a2f622b9` |
| 10 | `POST /v1/credits/purchases` | 201 | 67 | `qa-1da95626-c799-4585-923f-8381c11d8764` |
| 9 | `POST /v1/credits/purchases` | 200 | 67 | `qa-2bdd5db0-156c-4cca-a5c3-7e446b85f8fe` |
| 14 | `POST /v1/auth/token` | 200 | 39 | `qa-e84555cb-1803-4581-be05-fdd8f3253219` |
| 15 | `GET /v1/credits/balance` | 200 | 7 | `qa-4413659d-b8c8-4b9c-ba24-2677897136fa` |
| 16 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ce419493-7e34-4599-bacf-b6f1d074e2b1` |
| 17 | `POST /v1/auth/token` | 401 | 8 | `qa-10e8ed84-b26a-4e6e-a70e-af1b677cc81a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9d6b2622-e262-4123-9b9c-fa2fad36b4db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d6b2622-e262-4123-9b9c-fa2fad36b4db
Content-Type: application/json

--- request body ---
{"handle":"qa-08636edeb769","displayName":"QA 08636edeb769","password":"****","region":"eu"}

--- response: 201 in 458 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d6b2622-e262-4123-9b9c-fa2fad36b4db
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
Location: /v1/accounts/qa-08636edeb769
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4e93bf4-c969-4304-8e77-24574facde26","handle":"qa-08636edeb769","displayName":"QA 08636edeb769","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.137686025Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f0e71f51-b3c5-404e-8d79-f01be60aced7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0e71f51-b3c5-404e-8d79-f01be60aced7
Content-Type: application/json

--- request body ---
{"handle":"qa-08636edeb769","password":"****"}

--- response: 200 in 73 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0e71f51-b3c5-404e-8d79-f01be60aced7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4e93bf4-c969-4304-8e77-24574facde26"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-98ca297b-e1a2-450a-b059-11a928f36c39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ca297b-e1a2-450a-b059-11a928f36c39
Content-Type: application/json

--- request body ---
{"handle":"qa-08636edeb769","password":"****"}

--- response: 200 in 78 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-98ca297b-e1a2-450a-b059-11a928f36c39
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4e93bf4-c969-4304-8e77-24574facde26"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-6158e867-8344-4098-8d53-b9663304e360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6158e867-8344-4098-8d53-b9663304e360
Content-Type: application/json

--- request body ---
{"handle":"qa-08636edeb769","password":"****"}

--- response: 200 in 75 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-6158e867-8344-4098-8d53-b9663304e360
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4e93bf4-c969-4304-8e77-24574facde26"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-97e2e1af-3109-47aa-848b-9c8c0f430c3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97e2e1af-3109-47aa-848b-9c8c0f430c3d
Content-Type: application/json

--- request body ---
{"handle":"qa-08636edeb769","password":"****"}

--- response: 200 in 82 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-97e2e1af-3109-47aa-848b-9c8c0f430c3d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4e93bf4-c969-4304-8e77-24574facde26"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-07ce44bc-9eec-41b5-9f44-1e5b5c341d72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07ce44bc-9eec-41b5-9f44-1e5b5c341d72
Content-Type: application/json

--- request body ---
{"handle":"qa-08636edeb769","password":"****"}

--- response: 200 in 92 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-07ce44bc-9eec-41b5-9f44-1e5b5c341d72
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4e93bf4-c969-4304-8e77-24574facde26"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-27e690c6-60fa-426c-985e-4a8bcaafdd96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27e690c6-60fa-426c-985e-4a8bcaafdd96
Content-Type: application/json

--- request body ---
{"handle":"qa-08636edeb769","password":"****"}

--- response: 200 in 68 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-27e690c6-60fa-426c-985e-4a8bcaafdd96
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4e93bf4-c969-4304-8e77-24574facde26"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b47186ee-c6d2-456f-ad4d-1f1221d0c50d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-da2afbc51e4f41eaab71e7c4af0bdfb4
X-Correlation-Id: qa-b47186ee-c6d2-456f-ad4d-1f1221d0c50d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 51 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-b47186ee-c6d2-456f-ad4d-1f1221d0c50d
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
Location: /v1/credits/purchases/pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.667388083Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d20ab24e-85dd-4886-8a95-2c7585df6995

--- request headers ---
Accept: application/json
Idempotency-Key: qa-da2afbc51e4f41eaab71e7c4af0bdfb4
X-Correlation-Id: qa-d20ab24e-85dd-4886-8a95-2c7585df6995
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-d20ab24e-85dd-4886-8a95-2c7585df6995
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
Location: /v1/credits/purchases/pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.667388083Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d791a1cd-941d-42a2-8e3d-6fb1c69a5bd5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-da2afbc51e4f41eaab71e7c4af0bdfb4
X-Correlation-Id: qa-d791a1cd-941d-42a2-8e3d-6fb1c69a5bd5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 67 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-d791a1cd-941d-42a2-8e3d-6fb1c69a5bd5
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
Location: /v1/credits/purchases/pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.667388083Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2f6afe40-85e1-41af-ad0b-c240a2f622b9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-da2afbc51e4f41eaab71e7c4af0bdfb4
X-Correlation-Id: qa-2f6afe40-85e1-41af-ad0b-c240a2f622b9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 54 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f6afe40-85e1-41af-ad0b-c240a2f622b9
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
Location: /v1/credits/purchases/pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.667388083Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1da95626-c799-4585-923f-8381c11d8764

--- request headers ---
Accept: application/json
Idempotency-Key: qa-da2afbc51e4f41eaab71e7c4af0bdfb4
X-Correlation-Id: qa-1da95626-c799-4585-923f-8381c11d8764
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-1da95626-c799-4585-923f-8381c11d8764
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
Location: /v1/credits/purchases/pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf
Content-Length: 144

{"id":"pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.667388083Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2bdd5db0-156c-4cca-a5c3-7e446b85f8fe

--- request headers ---
Accept: application/json
Idempotency-Key: qa-da2afbc51e4f41eaab71e7c4af0bdfb4
X-Correlation-Id: qa-2bdd5db0-156c-4cca-a5c3-7e446b85f8fe
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 67 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bdd5db0-156c-4cca-a5c3-7e446b85f8fe
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
Location: /v1/credits/purchases/pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bb8af9-02e9-4e5d-9883-51bb1416d8bf","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.667388083Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-e84555cb-1803-4581-be05-fdd8f3253219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e84555cb-1803-4581-be05-fdd8f3253219
Content-Type: application/json

--- request body ---
{"handle":"qa-08636edeb769","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e84555cb-1803-4581-be05-fdd8f3253219
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4e93bf4-c969-4304-8e77-24574facde26"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-4413659d-b8c8-4b9c-ba24-2677897136fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4413659d-b8c8-4b9c-ba24-2677897136fa
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-4413659d-b8c8-4b9c-ba24-2677897136fa
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

{"balance":15,"currency":"credits","accountId":"acc_a4e93bf4-c969-4304-8e77-24574facde26"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce419493-7e34-4599-bacf-b6f1d074e2b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce419493-7e34-4599-bacf-b6f1d074e2b1
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce419493-7e34-4599-bacf-b6f1d074e2b1
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
correlation: qa-10e8ed84-b26a-4e6e-a70e-af1b677cc81a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10e8ed84-b26a-4e6e-a70e-af1b677cc81a
Content-Type: application/json

--- request body ---
{"handle":"qa-08636edeb769","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10e8ed84-b26a-4e6e-a70e-af1b677cc81a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10e8ed84-b26a-4e6e-a70e-af1b677cc81a"}
```
