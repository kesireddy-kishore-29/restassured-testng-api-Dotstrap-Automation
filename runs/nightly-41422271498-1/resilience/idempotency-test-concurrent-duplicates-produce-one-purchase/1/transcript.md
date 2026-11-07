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
| 1 | `POST /v1/accounts` | 201 | 437 | `qa-327ca81d-fea8-4e61-89b7-aec7aa27bfda` |
| 7 | `POST /v1/auth/token` | 200 | 100 | `qa-471dba2c-c40b-401c-8ddb-bf29ec95d88c` |
| 2 | `POST /v1/auth/token` | 200 | 116 | `qa-b6beba3f-4a1c-491f-8152-76494d2c1fa0` |
| 5 | `POST /v1/auth/token` | 200 | 106 | `qa-155c26cb-a6d8-452a-b855-c04a55da292a` |
| 6 | `POST /v1/auth/token` | 200 | 105 | `qa-01b2c7e2-2b95-4cb4-9b35-a32c75a2144c` |
| 3 | `POST /v1/auth/token` | 200 | 121 | `qa-437591d5-7df3-4c9a-a681-963ebf178ac7` |
| 4 | `POST /v1/auth/token` | 200 | 118 | `qa-397f4a44-4299-4f9a-8854-580c6bb2874b` |
| 11 | `POST /v1/credits/purchases` | 200 | 60 | `qa-916983d1-9a6f-4a8d-87a5-39daa8f1c6e7` |
| 9 | `POST /v1/credits/purchases` | 200 | 60 | `qa-e6e5efd2-c136-4fb2-bb51-366c251b56c0` |
| 12 | `POST /v1/credits/purchases` | 201 | 59 | `qa-b139874f-e93f-4f2b-940f-0078415d343d` |
| 8 | `POST /v1/credits/purchases` | 200 | 78 | `qa-62aa6819-3fb7-4301-a643-d29843e9ea49` |
| 13 | `POST /v1/credits/purchases` | 200 | 51 | `qa-457f634c-1337-42f3-bfd9-3bafbfc49492` |
| 10 | `POST /v1/credits/purchases` | 200 | 66 | `qa-02b813a3-913b-4147-8094-2d091dbd0c61` |
| 14 | `POST /v1/auth/token` | 200 | 19 | `qa-e50e1f9c-2d30-4d84-9a76-7d214d349ff7` |
| 15 | `GET /v1/credits/balance` | 200 | 10 | `qa-0dadcc8b-3577-4b7a-b556-83e5b9f0f244` |
| 16 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-4969990f-2eed-4862-8e48-b74b3f3acc98` |
| 17 | `POST /v1/auth/token` | 401 | 11 | `qa-ab2f1b38-42e7-4c8d-8422-5e3bfb6d8d3a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-327ca81d-fea8-4e61-89b7-aec7aa27bfda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-327ca81d-fea8-4e61-89b7-aec7aa27bfda
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e8aaa6753","displayName":"QA 2b0e8aaa6753","password":"****","region":"eu"}

--- response: 201 in 437 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-327ca81d-fea8-4e61-89b7-aec7aa27bfda
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
Location: /v1/accounts/qa-2b0e8aaa6753
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fb424188-d3d6-47be-acd4-88dc8eb67518","handle":"qa-2b0e8aaa6753","displayName":"QA 2b0e8aaa6753","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.005257783Z"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-471dba2c-c40b-401c-8ddb-bf29ec95d88c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-471dba2c-c40b-401c-8ddb-bf29ec95d88c
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e8aaa6753","password":"****"}

--- response: 200 in 100 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-471dba2c-c40b-401c-8ddb-bf29ec95d88c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb424188-d3d6-47be-acd4-88dc8eb67518"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b6beba3f-4a1c-491f-8152-76494d2c1fa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6beba3f-4a1c-491f-8152-76494d2c1fa0
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e8aaa6753","password":"****"}

--- response: 200 in 116 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6beba3f-4a1c-491f-8152-76494d2c1fa0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb424188-d3d6-47be-acd4-88dc8eb67518"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-155c26cb-a6d8-452a-b855-c04a55da292a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-155c26cb-a6d8-452a-b855-c04a55da292a
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e8aaa6753","password":"****"}

--- response: 200 in 106 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-155c26cb-a6d8-452a-b855-c04a55da292a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb424188-d3d6-47be-acd4-88dc8eb67518"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-01b2c7e2-2b95-4cb4-9b35-a32c75a2144c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01b2c7e2-2b95-4cb4-9b35-a32c75a2144c
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e8aaa6753","password":"****"}

--- response: 200 in 105 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-01b2c7e2-2b95-4cb4-9b35-a32c75a2144c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb424188-d3d6-47be-acd4-88dc8eb67518"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-437591d5-7df3-4c9a-a681-963ebf178ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-437591d5-7df3-4c9a-a681-963ebf178ac7
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e8aaa6753","password":"****"}

--- response: 200 in 121 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-437591d5-7df3-4c9a-a681-963ebf178ac7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb424188-d3d6-47be-acd4-88dc8eb67518"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-397f4a44-4299-4f9a-8854-580c6bb2874b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-397f4a44-4299-4f9a-8854-580c6bb2874b
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e8aaa6753","password":"****"}

--- response: 200 in 118 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-397f4a44-4299-4f9a-8854-580c6bb2874b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb424188-d3d6-47be-acd4-88dc8eb67518"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-916983d1-9a6f-4a8d-87a5-39daa8f1c6e7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a63e7e57fc81416eaa2e1910264d9710
X-Correlation-Id: qa-916983d1-9a6f-4a8d-87a5-39daa8f1c6e7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 60 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-916983d1-9a6f-4a8d-87a5-39daa8f1c6e7
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
Location: /v1/credits/purchases/pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:43.692625336Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e6e5efd2-c136-4fb2-bb51-366c251b56c0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a63e7e57fc81416eaa2e1910264d9710
X-Correlation-Id: qa-e6e5efd2-c136-4fb2-bb51-366c251b56c0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 60 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6e5efd2-c136-4fb2-bb51-366c251b56c0
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
Location: /v1/credits/purchases/pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:43.692625336Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b139874f-e93f-4f2b-940f-0078415d343d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a63e7e57fc81416eaa2e1910264d9710
X-Correlation-Id: qa-b139874f-e93f-4f2b-940f-0078415d343d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 59 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-b139874f-e93f-4f2b-940f-0078415d343d
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
Location: /v1/credits/purchases/pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e
Content-Length: 144

{"id":"pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:43.692625336Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-62aa6819-3fb7-4301-a643-d29843e9ea49

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a63e7e57fc81416eaa2e1910264d9710
X-Correlation-Id: qa-62aa6819-3fb7-4301-a643-d29843e9ea49
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 78 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-62aa6819-3fb7-4301-a643-d29843e9ea49
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
Location: /v1/credits/purchases/pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:43.692625336Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-457f634c-1337-42f3-bfd9-3bafbfc49492

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a63e7e57fc81416eaa2e1910264d9710
X-Correlation-Id: qa-457f634c-1337-42f3-bfd9-3bafbfc49492
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 51 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-457f634c-1337-42f3-bfd9-3bafbfc49492
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
Location: /v1/credits/purchases/pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:43.692625336Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-02b813a3-913b-4147-8094-2d091dbd0c61

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a63e7e57fc81416eaa2e1910264d9710
X-Correlation-Id: qa-02b813a3-913b-4147-8094-2d091dbd0c61
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 66 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-02b813a3-913b-4147-8094-2d091dbd0c61
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
Location: /v1/credits/purchases/pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_1ee50b0b-f82f-4d67-93b9-011f4cc5648e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:43.692625336Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-e50e1f9c-2d30-4d84-9a76-7d214d349ff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e50e1f9c-2d30-4d84-9a76-7d214d349ff7
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e8aaa6753","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-e50e1f9c-2d30-4d84-9a76-7d214d349ff7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb424188-d3d6-47be-acd4-88dc8eb67518"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-0dadcc8b-3577-4b7a-b556-83e5b9f0f244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dadcc8b-3577-4b7a-b556-83e5b9f0f244
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dadcc8b-3577-4b7a-b556-83e5b9f0f244
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

{"balance":15,"currency":"credits","accountId":"acc_fb424188-d3d6-47be-acd4-88dc8eb67518"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4969990f-2eed-4862-8e48-b74b3f3acc98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4969990f-2eed-4862-8e48-b74b3f3acc98
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4969990f-2eed-4862-8e48-b74b3f3acc98
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
correlation: qa-ab2f1b38-42e7-4c8d-8422-5e3bfb6d8d3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab2f1b38-42e7-4c8d-8422-5e3bfb6d8d3a
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e8aaa6753","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab2f1b38-42e7-4c8d-8422-5e3bfb6d8d3a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ab2f1b38-42e7-4c8d-8422-5e3bfb6d8d3a"}
```
