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
| 1 | `POST /v1/accounts` | 201 | 482 | `qa-7cfe583a-cb6e-4d14-9359-8603d3eb2cff` |
| 2 | `POST /v1/auth/token` | 200 | 70 | `qa-95fbab28-c28f-41ea-887a-8de1362a32ab` |
| 7 | `POST /v1/auth/token` | 200 | 62 | `qa-3bebaa8c-ff52-4194-9005-93bc97012864` |
| 3 | `POST /v1/auth/token` | 200 | 71 | `qa-a8fa6454-f308-48a3-8a5b-fa77ca116205` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-a3eb143b-62ea-49d3-a91a-69265bd42fd0` |
| 4 | `POST /v1/auth/token` | 200 | 66 | `qa-a9a90d39-b910-416c-a1eb-7860466b36e2` |
| 5 | `POST /v1/auth/token` | 200 | 78 | `qa-68fa712e-9e01-445e-be50-e03ac6dbe658` |
| 9 | `POST /v1/credits/purchases` | 200 | 45 | `qa-c29a12ae-b149-49db-8f02-9a63c1716893` |
| 11 | `POST /v1/credits/purchases` | 201 | 47 | `qa-052daa71-22f8-4c51-bc40-b0ca3000336d` |
| 10 | `POST /v1/credits/purchases` | 200 | 52 | `qa-c43ab7ce-bff1-4c98-ad99-66f06f4227dc` |
| 8 | `POST /v1/credits/purchases` | 200 | 65 | `qa-50c287a5-f521-4077-bec2-7606ce7e4b32` |
| 13 | `POST /v1/credits/purchases` | 200 | 41 | `qa-e215306d-58a3-43ee-bb11-6498e762bf25` |
| 12 | `POST /v1/credits/purchases` | 200 | 50 | `qa-b4c6b9b4-14a6-4f85-837b-cfed9112d3a5` |
| 14 | `POST /v1/auth/token` | 200 | 20 | `qa-4ca3105e-7151-493f-946f-695436b70b7b` |
| 15 | `GET /v1/credits/balance` | 200 | 7 | `qa-783a899f-a16c-4bc8-9ea4-953b04b77755` |
| 16 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6b7e7605-8c75-4ce4-b9e8-997ec92c8bdb` |
| 17 | `POST /v1/auth/token` | 401 | 10 | `qa-3c9f3036-382b-475f-b220-1c5573d8b97d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7cfe583a-cb6e-4d14-9359-8603d3eb2cff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cfe583a-cb6e-4d14-9359-8603d3eb2cff
Content-Type: application/json

--- request body ---
{"handle":"qa-81f4c01919e7","displayName":"QA 81f4c01919e7","password":"****","region":"eu"}

--- response: 201 in 482 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cfe583a-cb6e-4d14-9359-8603d3eb2cff
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
Location: /v1/accounts/qa-81f4c01919e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7aec6bff-5b67-4aad-b3c8-eae0d2446f98","handle":"qa-81f4c01919e7","displayName":"QA 81f4c01919e7","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.721187415Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-95fbab28-c28f-41ea-887a-8de1362a32ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95fbab28-c28f-41ea-887a-8de1362a32ab
Content-Type: application/json

--- request body ---
{"handle":"qa-81f4c01919e7","password":"****"}

--- response: 200 in 70 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-95fbab28-c28f-41ea-887a-8de1362a32ab
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7aec6bff-5b67-4aad-b3c8-eae0d2446f98"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-3bebaa8c-ff52-4194-9005-93bc97012864

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bebaa8c-ff52-4194-9005-93bc97012864
Content-Type: application/json

--- request body ---
{"handle":"qa-81f4c01919e7","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bebaa8c-ff52-4194-9005-93bc97012864
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7aec6bff-5b67-4aad-b3c8-eae0d2446f98"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a8fa6454-f308-48a3-8a5b-fa77ca116205

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8fa6454-f308-48a3-8a5b-fa77ca116205
Content-Type: application/json

--- request body ---
{"handle":"qa-81f4c01919e7","password":"****"}

--- response: 200 in 71 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8fa6454-f308-48a3-8a5b-fa77ca116205
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7aec6bff-5b67-4aad-b3c8-eae0d2446f98"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a3eb143b-62ea-49d3-a91a-69265bd42fd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3eb143b-62ea-49d3-a91a-69265bd42fd0
Content-Type: application/json

--- request body ---
{"handle":"qa-81f4c01919e7","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3eb143b-62ea-49d3-a91a-69265bd42fd0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7aec6bff-5b67-4aad-b3c8-eae0d2446f98"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a9a90d39-b910-416c-a1eb-7860466b36e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9a90d39-b910-416c-a1eb-7860466b36e2
Content-Type: application/json

--- request body ---
{"handle":"qa-81f4c01919e7","password":"****"}

--- response: 200 in 66 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9a90d39-b910-416c-a1eb-7860466b36e2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7aec6bff-5b67-4aad-b3c8-eae0d2446f98"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-68fa712e-9e01-445e-be50-e03ac6dbe658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68fa712e-9e01-445e-be50-e03ac6dbe658
Content-Type: application/json

--- request body ---
{"handle":"qa-81f4c01919e7","password":"****"}

--- response: 200 in 78 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-68fa712e-9e01-445e-be50-e03ac6dbe658
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7aec6bff-5b67-4aad-b3c8-eae0d2446f98"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c29a12ae-b149-49db-8f02-9a63c1716893

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ca52f22f72b4461d833b134686a2667e
X-Correlation-Id: qa-c29a12ae-b149-49db-8f02-9a63c1716893
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 45 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c29a12ae-b149-49db-8f02-9a63c1716893
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
Location: /v1/credits/purchases/pur_83e9f1e1-abd7-41da-9e23-3e4188a12543
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_83e9f1e1-abd7-41da-9e23-3e4188a12543","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.324942433Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-052daa71-22f8-4c51-bc40-b0ca3000336d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ca52f22f72b4461d833b134686a2667e
X-Correlation-Id: qa-052daa71-22f8-4c51-bc40-b0ca3000336d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 47 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-052daa71-22f8-4c51-bc40-b0ca3000336d
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
Location: /v1/credits/purchases/pur_83e9f1e1-abd7-41da-9e23-3e4188a12543
Content-Length: 144

{"id":"pur_83e9f1e1-abd7-41da-9e23-3e4188a12543","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.324942433Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c43ab7ce-bff1-4c98-ad99-66f06f4227dc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ca52f22f72b4461d833b134686a2667e
X-Correlation-Id: qa-c43ab7ce-bff1-4c98-ad99-66f06f4227dc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 52 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c43ab7ce-bff1-4c98-ad99-66f06f4227dc
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
Location: /v1/credits/purchases/pur_83e9f1e1-abd7-41da-9e23-3e4188a12543
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_83e9f1e1-abd7-41da-9e23-3e4188a12543","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.324942433Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-50c287a5-f521-4077-bec2-7606ce7e4b32

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ca52f22f72b4461d833b134686a2667e
X-Correlation-Id: qa-50c287a5-f521-4077-bec2-7606ce7e4b32
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 65 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-50c287a5-f521-4077-bec2-7606ce7e4b32
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
Location: /v1/credits/purchases/pur_83e9f1e1-abd7-41da-9e23-3e4188a12543
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_83e9f1e1-abd7-41da-9e23-3e4188a12543","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.324942433Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e215306d-58a3-43ee-bb11-6498e762bf25

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ca52f22f72b4461d833b134686a2667e
X-Correlation-Id: qa-e215306d-58a3-43ee-bb11-6498e762bf25
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 41 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e215306d-58a3-43ee-bb11-6498e762bf25
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
Location: /v1/credits/purchases/pur_83e9f1e1-abd7-41da-9e23-3e4188a12543
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_83e9f1e1-abd7-41da-9e23-3e4188a12543","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.324942433Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b4c6b9b4-14a6-4f85-837b-cfed9112d3a5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ca52f22f72b4461d833b134686a2667e
X-Correlation-Id: qa-b4c6b9b4-14a6-4f85-837b-cfed9112d3a5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 50 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4c6b9b4-14a6-4f85-837b-cfed9112d3a5
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
Location: /v1/credits/purchases/pur_83e9f1e1-abd7-41da-9e23-3e4188a12543
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_83e9f1e1-abd7-41da-9e23-3e4188a12543","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.324942433Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-4ca3105e-7151-493f-946f-695436b70b7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ca3105e-7151-493f-946f-695436b70b7b
Content-Type: application/json

--- request body ---
{"handle":"qa-81f4c01919e7","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ca3105e-7151-493f-946f-695436b70b7b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7aec6bff-5b67-4aad-b3c8-eae0d2446f98"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-783a899f-a16c-4bc8-9ea4-953b04b77755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783a899f-a16c-4bc8-9ea4-953b04b77755
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-783a899f-a16c-4bc8-9ea4-953b04b77755
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

{"balance":15,"currency":"credits","accountId":"acc_7aec6bff-5b67-4aad-b3c8-eae0d2446f98"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b7e7605-8c75-4ce4-b9e8-997ec92c8bdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b7e7605-8c75-4ce4-b9e8-997ec92c8bdb
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b7e7605-8c75-4ce4-b9e8-997ec92c8bdb
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
correlation: qa-3c9f3036-382b-475f-b220-1c5573d8b97d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c9f3036-382b-475f-b220-1c5573d8b97d
Content-Type: application/json

--- request body ---
{"handle":"qa-81f4c01919e7","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c9f3036-382b-475f-b220-1c5573d8b97d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c9f3036-382b-475f-b220-1c5573d8b97d"}
```
