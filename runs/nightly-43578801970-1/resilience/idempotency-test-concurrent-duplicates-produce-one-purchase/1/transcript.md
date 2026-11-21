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
| 1 | `POST /v1/accounts` | 201 | 451 | `qa-0fb42619-8125-4f14-8482-62a456808d50` |
| 7 | `POST /v1/auth/token` | 200 | 49 | `qa-be085ff6-5764-467a-8072-b4626c500a89` |
| 4 | `POST /v1/auth/token` | 200 | 76 | `qa-5083899a-9aff-40c2-aad5-322f0f7aa2c1` |
| 5 | `POST /v1/auth/token` | 200 | 72 | `qa-12547aca-117f-43f5-ba07-bc302dc3da0e` |
| 3 | `POST /v1/auth/token` | 200 | 80 | `qa-7a7ca60b-7727-4786-b47d-5de748821789` |
| 6 | `POST /v1/auth/token` | 200 | 72 | `qa-ada0606a-7409-4dc8-903a-11e8446f55ee` |
| 2 | `POST /v1/auth/token` | 200 | 84 | `qa-b9dc1df4-e96e-468f-8f61-2f9e18ab68bb` |
| 9 | `POST /v1/credits/purchases` | 200 | 59 | `qa-5ec7e05e-d4c2-49a3-9951-aaef90ed625e` |
| 12 | `POST /v1/credits/purchases` | 200 | 55 | `qa-341bc06d-daec-4f10-b6bb-5971870acd33` |
| 8 | `POST /v1/credits/purchases` | 201 | 64 | `qa-a364db5e-118d-44a3-88a0-8c7a81a72c03` |
| 13 | `POST /v1/credits/purchases` | 200 | 57 | `qa-23158db5-7231-4630-bec2-103274ba6f7e` |
| 11 | `POST /v1/credits/purchases` | 200 | 64 | `qa-2a60f1f1-7cb2-4f07-809c-5191a1c511ec` |
| 10 | `POST /v1/credits/purchases` | 200 | 58 | `qa-8d8d65a2-2c36-4851-b843-2a526212ef67` |
| 14 | `POST /v1/auth/token` | 200 | 24 | `qa-5d259d18-9a70-4abe-aa77-0dfbedcc727d` |
| 15 | `GET /v1/credits/balance` | 200 | 27 | `qa-28ded90c-1f1a-4bda-bda9-b323f8ca94fc` |
| 16 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-e2e9231d-e1ef-4123-a501-9c2cb5b82aa1` |
| 17 | `POST /v1/auth/token` | 401 | 23 | `qa-ae11b778-17ff-4922-b15f-7fabc56abae4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0fb42619-8125-4f14-8482-62a456808d50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fb42619-8125-4f14-8482-62a456808d50
Content-Type: application/json

--- request body ---
{"handle":"qa-b2f369d98272","displayName":"QA b2f369d98272","password":"****","region":"eu"}

--- response: 201 in 451 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fb42619-8125-4f14-8482-62a456808d50
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
Location: /v1/accounts/qa-b2f369d98272
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e8398da-aca1-4505-a51f-6f0a5537307a","handle":"qa-b2f369d98272","displayName":"QA b2f369d98272","region":"eu","role":"user","createdAt":"2026-11-14T09:05:14.115627905Z"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-be085ff6-5764-467a-8072-b4626c500a89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be085ff6-5764-467a-8072-b4626c500a89
Content-Type: application/json

--- request body ---
{"handle":"qa-b2f369d98272","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-be085ff6-5764-467a-8072-b4626c500a89
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e8398da-aca1-4505-a51f-6f0a5537307a"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5083899a-9aff-40c2-aad5-322f0f7aa2c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5083899a-9aff-40c2-aad5-322f0f7aa2c1
Content-Type: application/json

--- request body ---
{"handle":"qa-b2f369d98272","password":"****"}

--- response: 200 in 76 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5083899a-9aff-40c2-aad5-322f0f7aa2c1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e8398da-aca1-4505-a51f-6f0a5537307a"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-12547aca-117f-43f5-ba07-bc302dc3da0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12547aca-117f-43f5-ba07-bc302dc3da0e
Content-Type: application/json

--- request body ---
{"handle":"qa-b2f369d98272","password":"****"}

--- response: 200 in 72 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-12547aca-117f-43f5-ba07-bc302dc3da0e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e8398da-aca1-4505-a51f-6f0a5537307a"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7a7ca60b-7727-4786-b47d-5de748821789

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a7ca60b-7727-4786-b47d-5de748821789
Content-Type: application/json

--- request body ---
{"handle":"qa-b2f369d98272","password":"****"}

--- response: 200 in 80 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a7ca60b-7727-4786-b47d-5de748821789
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e8398da-aca1-4505-a51f-6f0a5537307a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ada0606a-7409-4dc8-903a-11e8446f55ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ada0606a-7409-4dc8-903a-11e8446f55ee
Content-Type: application/json

--- request body ---
{"handle":"qa-b2f369d98272","password":"****"}

--- response: 200 in 72 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ada0606a-7409-4dc8-903a-11e8446f55ee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e8398da-aca1-4505-a51f-6f0a5537307a"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b9dc1df4-e96e-468f-8f61-2f9e18ab68bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9dc1df4-e96e-468f-8f61-2f9e18ab68bb
Content-Type: application/json

--- request body ---
{"handle":"qa-b2f369d98272","password":"****"}

--- response: 200 in 84 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9dc1df4-e96e-468f-8f61-2f9e18ab68bb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e8398da-aca1-4505-a51f-6f0a5537307a"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5ec7e05e-d4c2-49a3-9951-aaef90ed625e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fc8e4a218138487b8195f597a7dbb109
X-Correlation-Id: qa-5ec7e05e-d4c2-49a3-9951-aaef90ed625e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 59 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ec7e05e-d4c2-49a3-9951-aaef90ed625e
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
Location: /v1/credits/purchases/pur_f1e2b4db-87c1-4540-ac22-86368185950a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_f1e2b4db-87c1-4540-ac22-86368185950a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.817086242Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-341bc06d-daec-4f10-b6bb-5971870acd33

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fc8e4a218138487b8195f597a7dbb109
X-Correlation-Id: qa-341bc06d-daec-4f10-b6bb-5971870acd33
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 55 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-341bc06d-daec-4f10-b6bb-5971870acd33
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
Location: /v1/credits/purchases/pur_f1e2b4db-87c1-4540-ac22-86368185950a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_f1e2b4db-87c1-4540-ac22-86368185950a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.817086242Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a364db5e-118d-44a3-88a0-8c7a81a72c03

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fc8e4a218138487b8195f597a7dbb109
X-Correlation-Id: qa-a364db5e-118d-44a3-88a0-8c7a81a72c03
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 64 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a364db5e-118d-44a3-88a0-8c7a81a72c03
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
Location: /v1/credits/purchases/pur_f1e2b4db-87c1-4540-ac22-86368185950a
Content-Length: 144

{"id":"pur_f1e2b4db-87c1-4540-ac22-86368185950a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.817086242Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-23158db5-7231-4630-bec2-103274ba6f7e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fc8e4a218138487b8195f597a7dbb109
X-Correlation-Id: qa-23158db5-7231-4630-bec2-103274ba6f7e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 57 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-23158db5-7231-4630-bec2-103274ba6f7e
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
Location: /v1/credits/purchases/pur_f1e2b4db-87c1-4540-ac22-86368185950a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_f1e2b4db-87c1-4540-ac22-86368185950a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.817086242Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2a60f1f1-7cb2-4f07-809c-5191a1c511ec

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fc8e4a218138487b8195f597a7dbb109
X-Correlation-Id: qa-2a60f1f1-7cb2-4f07-809c-5191a1c511ec
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 64 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a60f1f1-7cb2-4f07-809c-5191a1c511ec
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
Location: /v1/credits/purchases/pur_f1e2b4db-87c1-4540-ac22-86368185950a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_f1e2b4db-87c1-4540-ac22-86368185950a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.817086242Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8d8d65a2-2c36-4851-b843-2a526212ef67

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fc8e4a218138487b8195f597a7dbb109
X-Correlation-Id: qa-8d8d65a2-2c36-4851-b843-2a526212ef67
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 58 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d8d65a2-2c36-4851-b843-2a526212ef67
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
Location: /v1/credits/purchases/pur_f1e2b4db-87c1-4540-ac22-86368185950a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_f1e2b4db-87c1-4540-ac22-86368185950a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.817086242Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-5d259d18-9a70-4abe-aa77-0dfbedcc727d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d259d18-9a70-4abe-aa77-0dfbedcc727d
Content-Type: application/json

--- request body ---
{"handle":"qa-b2f369d98272","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d259d18-9a70-4abe-aa77-0dfbedcc727d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e8398da-aca1-4505-a51f-6f0a5537307a"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-28ded90c-1f1a-4bda-bda9-b323f8ca94fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28ded90c-1f1a-4bda-bda9-b323f8ca94fc
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-28ded90c-1f1a-4bda-bda9-b323f8ca94fc
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

{"balance":15,"currency":"credits","accountId":"acc_9e8398da-aca1-4505-a51f-6f0a5537307a"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2e9231d-e1ef-4123-a501-9c2cb5b82aa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e9231d-e1ef-4123-a501-9c2cb5b82aa1
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2e9231d-e1ef-4123-a501-9c2cb5b82aa1
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
correlation: qa-ae11b778-17ff-4922-b15f-7fabc56abae4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae11b778-17ff-4922-b15f-7fabc56abae4
Content-Type: application/json

--- request body ---
{"handle":"qa-b2f369d98272","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae11b778-17ff-4922-b15f-7fabc56abae4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae11b778-17ff-4922-b15f-7fabc56abae4"}
```
