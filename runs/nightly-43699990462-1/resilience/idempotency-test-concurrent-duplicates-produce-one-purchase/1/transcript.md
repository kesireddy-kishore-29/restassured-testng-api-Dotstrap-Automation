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
| 1 | `POST /v1/accounts` | 201 | 474 | `qa-ae096167-71ea-46b3-9e00-293c93ff48af` |
| 5 | `POST /v1/auth/token` | 200 | 53 | `qa-f7f2ef4f-80c0-42a0-a1f5-e7facec76d51` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-74c984a1-316b-4c40-946f-63dab402fc92` |
| 3 | `POST /v1/auth/token` | 200 | 62 | `qa-67e0f8ee-586c-44aa-970b-45d3b269b796` |
| 4 | `POST /v1/auth/token` | 200 | 64 | `qa-fa9e4e8c-cf49-456c-97bf-020ed3d4fb40` |
| 2 | `POST /v1/auth/token` | 200 | 74 | `qa-6eb34aef-2c3e-4024-ad01-69218d0d73b8` |
| 7 | `POST /v1/auth/token` | 200 | 77 | `qa-3f1ce0cf-145b-4878-b8cb-843ff419ddf9` |
| 12 | `POST /v1/credits/purchases` | 200 | 36 | `qa-79ae5637-1657-4f03-80a3-8bb7894141b8` |
| 9 | `POST /v1/credits/purchases` | 201 | 48 | `qa-2eb20266-754d-4804-810c-3600ad609630` |
| 13 | `POST /v1/credits/purchases` | 200 | 32 | `qa-20981f18-5419-4dce-a359-6dcd5288e32d` |
| 10 | `POST /v1/credits/purchases` | 200 | 48 | `qa-8f61bb9c-1770-405d-abf8-abad3ee19081` |
| 8 | `POST /v1/credits/purchases` | 200 | 62 | `qa-27d70872-f089-4db3-9a41-dfbdc0980fd5` |
| 11 | `POST /v1/credits/purchases` | 200 | 51 | `qa-ce16f89d-d95f-45a8-a435-a2a02f8af118` |
| 14 | `POST /v1/auth/token` | 200 | 21 | `qa-cb4e56ff-6b95-4197-9a73-0698ba57e5d2` |
| 15 | `GET /v1/credits/balance` | 200 | 12 | `qa-59eb44fa-fb7c-4c6d-b6df-b36ac3437ce5` |
| 16 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c4a96267-7772-4ca9-bc8f-3ecb1eda0a87` |
| 17 | `POST /v1/auth/token` | 401 | 14 | `qa-3a0c71fe-dbfc-4935-a6c2-5e4e6dae9c51` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ae096167-71ea-46b3-9e00-293c93ff48af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae096167-71ea-46b3-9e00-293c93ff48af
Content-Type: application/json

--- request body ---
{"handle":"qa-175af46d4d95","displayName":"QA 175af46d4d95","password":"****","region":"eu"}

--- response: 201 in 474 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae096167-71ea-46b3-9e00-293c93ff48af
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
Location: /v1/accounts/qa-175af46d4d95
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21035fa5-2bd8-4032-9c47-249e37ffd123","handle":"qa-175af46d4d95","displayName":"QA 175af46d4d95","region":"eu","role":"user","createdAt":"2026-11-15T09:36:13.551857128Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f7f2ef4f-80c0-42a0-a1f5-e7facec76d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7f2ef4f-80c0-42a0-a1f5-e7facec76d51
Content-Type: application/json

--- request body ---
{"handle":"qa-175af46d4d95","password":"****"}

--- response: 200 in 53 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7f2ef4f-80c0-42a0-a1f5-e7facec76d51
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21035fa5-2bd8-4032-9c47-249e37ffd123"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-74c984a1-316b-4c40-946f-63dab402fc92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74c984a1-316b-4c40-946f-63dab402fc92
Content-Type: application/json

--- request body ---
{"handle":"qa-175af46d4d95","password":"****"}

--- response: 200 in 52 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-74c984a1-316b-4c40-946f-63dab402fc92
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21035fa5-2bd8-4032-9c47-249e37ffd123"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-67e0f8ee-586c-44aa-970b-45d3b269b796

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67e0f8ee-586c-44aa-970b-45d3b269b796
Content-Type: application/json

--- request body ---
{"handle":"qa-175af46d4d95","password":"****"}

--- response: 200 in 62 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-67e0f8ee-586c-44aa-970b-45d3b269b796
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21035fa5-2bd8-4032-9c47-249e37ffd123"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-fa9e4e8c-cf49-456c-97bf-020ed3d4fb40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa9e4e8c-cf49-456c-97bf-020ed3d4fb40
Content-Type: application/json

--- request body ---
{"handle":"qa-175af46d4d95","password":"****"}

--- response: 200 in 64 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa9e4e8c-cf49-456c-97bf-020ed3d4fb40
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21035fa5-2bd8-4032-9c47-249e37ffd123"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6eb34aef-2c3e-4024-ad01-69218d0d73b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eb34aef-2c3e-4024-ad01-69218d0d73b8
Content-Type: application/json

--- request body ---
{"handle":"qa-175af46d4d95","password":"****"}

--- response: 200 in 74 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eb34aef-2c3e-4024-ad01-69218d0d73b8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21035fa5-2bd8-4032-9c47-249e37ffd123"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-3f1ce0cf-145b-4878-b8cb-843ff419ddf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f1ce0cf-145b-4878-b8cb-843ff419ddf9
Content-Type: application/json

--- request body ---
{"handle":"qa-175af46d4d95","password":"****"}

--- response: 200 in 77 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f1ce0cf-145b-4878-b8cb-843ff419ddf9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21035fa5-2bd8-4032-9c47-249e37ffd123"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-79ae5637-1657-4f03-80a3-8bb7894141b8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ddcc0ed46f2843f5bcbf7f7cc2ab5e4b
X-Correlation-Id: qa-79ae5637-1657-4f03-80a3-8bb7894141b8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 36 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-79ae5637-1657-4f03-80a3-8bb7894141b8
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
Location: /v1/credits/purchases/pur_9eee545f-6712-4c11-bd6d-b11518002116
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_9eee545f-6712-4c11-bd6d-b11518002116","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.038933247Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2eb20266-754d-4804-810c-3600ad609630

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ddcc0ed46f2843f5bcbf7f7cc2ab5e4b
X-Correlation-Id: qa-2eb20266-754d-4804-810c-3600ad609630
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eb20266-754d-4804-810c-3600ad609630
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
Location: /v1/credits/purchases/pur_9eee545f-6712-4c11-bd6d-b11518002116
Content-Length: 144

{"id":"pur_9eee545f-6712-4c11-bd6d-b11518002116","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.038933247Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-20981f18-5419-4dce-a359-6dcd5288e32d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ddcc0ed46f2843f5bcbf7f7cc2ab5e4b
X-Correlation-Id: qa-20981f18-5419-4dce-a359-6dcd5288e32d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-20981f18-5419-4dce-a359-6dcd5288e32d
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
Location: /v1/credits/purchases/pur_9eee545f-6712-4c11-bd6d-b11518002116
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_9eee545f-6712-4c11-bd6d-b11518002116","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.038933247Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8f61bb9c-1770-405d-abf8-abad3ee19081

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ddcc0ed46f2843f5bcbf7f7cc2ab5e4b
X-Correlation-Id: qa-8f61bb9c-1770-405d-abf8-abad3ee19081
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 48 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f61bb9c-1770-405d-abf8-abad3ee19081
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
Location: /v1/credits/purchases/pur_9eee545f-6712-4c11-bd6d-b11518002116
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_9eee545f-6712-4c11-bd6d-b11518002116","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.038933247Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-27d70872-f089-4db3-9a41-dfbdc0980fd5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ddcc0ed46f2843f5bcbf7f7cc2ab5e4b
X-Correlation-Id: qa-27d70872-f089-4db3-9a41-dfbdc0980fd5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 62 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-27d70872-f089-4db3-9a41-dfbdc0980fd5
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
Location: /v1/credits/purchases/pur_9eee545f-6712-4c11-bd6d-b11518002116
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_9eee545f-6712-4c11-bd6d-b11518002116","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.038933247Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ce16f89d-d95f-45a8-a435-a2a02f8af118

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ddcc0ed46f2843f5bcbf7f7cc2ab5e4b
X-Correlation-Id: qa-ce16f89d-d95f-45a8-a435-a2a02f8af118
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 51 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce16f89d-d95f-45a8-a435-a2a02f8af118
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
Location: /v1/credits/purchases/pur_9eee545f-6712-4c11-bd6d-b11518002116
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_9eee545f-6712-4c11-bd6d-b11518002116","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.038933247Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-cb4e56ff-6b95-4197-9a73-0698ba57e5d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb4e56ff-6b95-4197-9a73-0698ba57e5d2
Content-Type: application/json

--- request body ---
{"handle":"qa-175af46d4d95","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb4e56ff-6b95-4197-9a73-0698ba57e5d2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21035fa5-2bd8-4032-9c47-249e37ffd123"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-59eb44fa-fb7c-4c6d-b6df-b36ac3437ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59eb44fa-fb7c-4c6d-b6df-b36ac3437ce5
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-59eb44fa-fb7c-4c6d-b6df-b36ac3437ce5
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

{"balance":15,"currency":"credits","accountId":"acc_21035fa5-2bd8-4032-9c47-249e37ffd123"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4a96267-7772-4ca9-bc8f-3ecb1eda0a87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4a96267-7772-4ca9-bc8f-3ecb1eda0a87
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4a96267-7772-4ca9-bc8f-3ecb1eda0a87
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
correlation: qa-3a0c71fe-dbfc-4935-a6c2-5e4e6dae9c51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0c71fe-dbfc-4935-a6c2-5e4e6dae9c51
Content-Type: application/json

--- request body ---
{"handle":"qa-175af46d4d95","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a0c71fe-dbfc-4935-a6c2-5e4e6dae9c51
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a0c71fe-dbfc-4935-a6c2-5e4e6dae9c51"}
```
