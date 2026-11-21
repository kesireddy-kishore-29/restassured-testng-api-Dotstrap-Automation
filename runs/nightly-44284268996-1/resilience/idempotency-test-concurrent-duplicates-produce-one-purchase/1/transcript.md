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
| 1 | `POST /v1/accounts` | 201 | 294 | `qa-9afa5279-1370-401e-b8ef-fe50134734d3` |
| 4 | `POST /v1/auth/token` | 200 | 46 | `qa-7a0f7f46-4c70-488d-ba9c-52abaa0153da` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-b6f804b3-2680-4922-baeb-a677dc59227d` |
| 2 | `POST /v1/auth/token` | 200 | 60 | `qa-815052bd-9801-4274-ae83-f4c056a65150` |
| 7 | `POST /v1/auth/token` | 200 | 42 | `qa-ab90a707-a64b-4313-a714-406fe16a350a` |
| 5 | `POST /v1/auth/token` | 200 | 47 | `qa-bf84adf1-a2ee-4b32-bdb5-53272d84e81b` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-d7e18b4c-bffa-4585-bd8f-b2c2002468d5` |
| 11 | `POST /v1/credits/purchases` | 201 | 33 | `qa-62a6e678-d860-4aff-9a41-7bd14c407746` |
| 12 | `POST /v1/credits/purchases` | 200 | 36 | `qa-3a50bc67-72d4-4f21-a42a-b57d506224ed` |
| 8 | `POST /v1/credits/purchases` | 200 | 47 | `qa-641436e3-14c4-495c-9767-84b16726f5dc` |
| 10 | `POST /v1/credits/purchases` | 200 | 39 | `qa-96f2236d-5d9a-4599-aaab-2e12c9573bda` |
| 9 | `POST /v1/credits/purchases` | 200 | 42 | `qa-9e3bf1f1-7009-4864-932a-19b8e7785ed2` |
| 13 | `POST /v1/credits/purchases` | 200 | 39 | `qa-662b74b4-848f-46e7-af7a-dde8fddf7df6` |
| 14 | `POST /v1/auth/token` | 200 | 18 | `qa-04d981d0-aa45-4a3f-a3ed-8ec16a901ca2` |
| 15 | `GET /v1/credits/balance` | 200 | 12 | `qa-352cf628-e69b-4198-bd5f-5fe588d62883` |
| 16 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-a9b7bcaa-1223-4623-ab69-3e9987324472` |
| 17 | `POST /v1/auth/token` | 401 | 11 | `qa-eb0fef26-0467-4add-bf81-7df88cbd5a54` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9afa5279-1370-401e-b8ef-fe50134734d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9afa5279-1370-401e-b8ef-fe50134734d3
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d00d3e8c3f","displayName":"QA b6d00d3e8c3f","password":"****","region":"eu"}

--- response: 201 in 294 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9afa5279-1370-401e-b8ef-fe50134734d3
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
Location: /v1/accounts/qa-b6d00d3e8c3f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_62e2adfe-8a80-4713-844b-33d9dc512651","handle":"qa-b6d00d3e8c3f","displayName":"QA b6d00d3e8c3f","region":"eu","role":"user","createdAt":"2026-11-18T10:19:37.679935651Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7a0f7f46-4c70-488d-ba9c-52abaa0153da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a0f7f46-4c70-488d-ba9c-52abaa0153da
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d00d3e8c3f","password":"****"}

--- response: 200 in 46 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a0f7f46-4c70-488d-ba9c-52abaa0153da
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62e2adfe-8a80-4713-844b-33d9dc512651"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b6f804b3-2680-4922-baeb-a677dc59227d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6f804b3-2680-4922-baeb-a677dc59227d
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d00d3e8c3f","password":"****"}

--- response: 200 in 52 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6f804b3-2680-4922-baeb-a677dc59227d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62e2adfe-8a80-4713-844b-33d9dc512651"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-815052bd-9801-4274-ae83-f4c056a65150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-815052bd-9801-4274-ae83-f4c056a65150
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d00d3e8c3f","password":"****"}

--- response: 200 in 60 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-815052bd-9801-4274-ae83-f4c056a65150
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62e2adfe-8a80-4713-844b-33d9dc512651"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ab90a707-a64b-4313-a714-406fe16a350a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab90a707-a64b-4313-a714-406fe16a350a
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d00d3e8c3f","password":"****"}

--- response: 200 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab90a707-a64b-4313-a714-406fe16a350a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62e2adfe-8a80-4713-844b-33d9dc512651"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-bf84adf1-a2ee-4b32-bdb5-53272d84e81b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf84adf1-a2ee-4b32-bdb5-53272d84e81b
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d00d3e8c3f","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf84adf1-a2ee-4b32-bdb5-53272d84e81b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62e2adfe-8a80-4713-844b-33d9dc512651"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d7e18b4c-bffa-4585-bd8f-b2c2002468d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e18b4c-bffa-4585-bd8f-b2c2002468d5
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d00d3e8c3f","password":"****"}

--- response: 200 in 48 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7e18b4c-bffa-4585-bd8f-b2c2002468d5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62e2adfe-8a80-4713-844b-33d9dc512651"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-62a6e678-d860-4aff-9a41-7bd14c407746

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4be2628ab1c444868c6463f7496ff12e
X-Correlation-Id: qa-62a6e678-d860-4aff-9a41-7bd14c407746
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-62a6e678-d860-4aff-9a41-7bd14c407746
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
Location: /v1/credits/purchases/pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4
Content-Length: 144

{"id":"pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.061787248Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3a50bc67-72d4-4f21-a42a-b57d506224ed

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4be2628ab1c444868c6463f7496ff12e
X-Correlation-Id: qa-3a50bc67-72d4-4f21-a42a-b57d506224ed
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 36 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a50bc67-72d4-4f21-a42a-b57d506224ed
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
Location: /v1/credits/purchases/pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.061787248Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-641436e3-14c4-495c-9767-84b16726f5dc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4be2628ab1c444868c6463f7496ff12e
X-Correlation-Id: qa-641436e3-14c4-495c-9767-84b16726f5dc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 47 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-641436e3-14c4-495c-9767-84b16726f5dc
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
Location: /v1/credits/purchases/pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.061787248Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-96f2236d-5d9a-4599-aaab-2e12c9573bda

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4be2628ab1c444868c6463f7496ff12e
X-Correlation-Id: qa-96f2236d-5d9a-4599-aaab-2e12c9573bda
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 39 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-96f2236d-5d9a-4599-aaab-2e12c9573bda
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
Location: /v1/credits/purchases/pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.061787248Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9e3bf1f1-7009-4864-932a-19b8e7785ed2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4be2628ab1c444868c6463f7496ff12e
X-Correlation-Id: qa-9e3bf1f1-7009-4864-932a-19b8e7785ed2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e3bf1f1-7009-4864-932a-19b8e7785ed2
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
Location: /v1/credits/purchases/pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.061787248Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-662b74b4-848f-46e7-af7a-dde8fddf7df6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4be2628ab1c444868c6463f7496ff12e
X-Correlation-Id: qa-662b74b4-848f-46e7-af7a-dde8fddf7df6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 39 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-662b74b4-848f-46e7-af7a-dde8fddf7df6
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
Location: /v1/credits/purchases/pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3eaf89f4-9c8d-4c39-ae80-37a0de5ad2f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.061787248Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-04d981d0-aa45-4a3f-a3ed-8ec16a901ca2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d981d0-aa45-4a3f-a3ed-8ec16a901ca2
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d00d3e8c3f","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-04d981d0-aa45-4a3f-a3ed-8ec16a901ca2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62e2adfe-8a80-4713-844b-33d9dc512651"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-352cf628-e69b-4198-bd5f-5fe588d62883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-352cf628-e69b-4198-bd5f-5fe588d62883
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-352cf628-e69b-4198-bd5f-5fe588d62883
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

{"balance":15,"currency":"credits","accountId":"acc_62e2adfe-8a80-4713-844b-33d9dc512651"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a9b7bcaa-1223-4623-ab69-3e9987324472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9b7bcaa-1223-4623-ab69-3e9987324472
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a9b7bcaa-1223-4623-ab69-3e9987324472
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
correlation: qa-eb0fef26-0467-4add-bf81-7df88cbd5a54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb0fef26-0467-4add-bf81-7df88cbd5a54
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d00d3e8c3f","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb0fef26-0467-4add-bf81-7df88cbd5a54
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eb0fef26-0467-4add-bf81-7df88cbd5a54"}
```
