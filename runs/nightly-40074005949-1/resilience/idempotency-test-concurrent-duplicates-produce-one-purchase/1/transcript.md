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
| 1 | `POST /v1/accounts` | 201 | 424 | `qa-cea117eb-9354-4f5a-b72e-75dbfcbfab49` |
| 5 | `POST /v1/auth/token` | 200 | 74 | `qa-2776437f-f413-47a8-8fa3-83299d930c7d` |
| 7 | `POST /v1/auth/token` | 200 | 71 | `qa-8a8edc62-1486-4791-a34c-356a29e2b826` |
| 4 | `POST /v1/auth/token` | 200 | 81 | `qa-f134da25-7e1e-48ea-8a9b-a01b67fa190f` |
| 3 | `POST /v1/auth/token` | 200 | 84 | `qa-f4b912fd-17aa-4940-b268-88c3b81cef0f` |
| 6 | `POST /v1/auth/token` | 200 | 83 | `qa-e98a7bd1-efe3-426b-b2e3-bb5f8fe00b42` |
| 2 | `POST /v1/auth/token` | 200 | 94 | `qa-8ee7477f-7a30-4a8c-a110-7f17be547651` |
| 9 | `POST /v1/credits/purchases` | 200 | 97 | `qa-df479dd2-a7a9-4f90-b7c1-891198d6d7d4` |
| 13 | `POST /v1/credits/purchases` | 200 | 86 | `qa-bac695b2-c9c4-4b77-956d-8ba39d373eee` |
| 11 | `POST /v1/credits/purchases` | 200 | 94 | `qa-33f2ecd3-d494-47ed-8cfb-4192f2a6da38` |
| 8 | `POST /v1/credits/purchases` | 201 | 103 | `qa-9db9eb26-3964-49fa-8675-85adaeb3794f` |
| 12 | `POST /v1/credits/purchases` | 200 | 97 | `qa-5d8bf280-b3d8-401a-94fb-2d0295093366` |
| 10 | `POST /v1/credits/purchases` | 200 | 103 | `qa-9af28776-40fa-4f61-b7d6-7df176404f7a` |
| 14 | `POST /v1/auth/token` | 200 | 19 | `qa-5b88bc0c-3a2f-4e9d-abd9-79574d270290` |
| 15 | `GET /v1/credits/balance` | 200 | 14 | `qa-6dfc257e-3feb-46e4-8ec6-495b03a280db` |
| 16 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-32eab9cc-b4e7-4d8d-9361-9f0d335fd9ac` |
| 17 | `POST /v1/auth/token` | 401 | 9 | `qa-3e290091-93e4-484c-b231-5a35dbeb7037` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cea117eb-9354-4f5a-b72e-75dbfcbfab49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea117eb-9354-4f5a-b72e-75dbfcbfab49
Content-Type: application/json

--- request body ---
{"handle":"qa-a49d3ec7e2e7","displayName":"QA a49d3ec7e2e7","password":"****","region":"eu"}

--- response: 201 in 424 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-cea117eb-9354-4f5a-b72e-75dbfcbfab49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-a49d3ec7e2e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30dbe450-926c-4d14-89b3-7312adeb6a02","handle":"qa-a49d3ec7e2e7","displayName":"QA a49d3ec7e2e7","region":"eu","role":"user","createdAt":"2026-10-24T07:25:05.520322868Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2776437f-f413-47a8-8fa3-83299d930c7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2776437f-f413-47a8-8fa3-83299d930c7d
Content-Type: application/json

--- request body ---
{"handle":"qa-a49d3ec7e2e7","password":"****"}

--- response: 200 in 74 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2776437f-f413-47a8-8fa3-83299d930c7d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30dbe450-926c-4d14-89b3-7312adeb6a02"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-8a8edc62-1486-4791-a34c-356a29e2b826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a8edc62-1486-4791-a34c-356a29e2b826
Content-Type: application/json

--- request body ---
{"handle":"qa-a49d3ec7e2e7","password":"****"}

--- response: 200 in 71 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a8edc62-1486-4791-a34c-356a29e2b826
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30dbe450-926c-4d14-89b3-7312adeb6a02"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f134da25-7e1e-48ea-8a9b-a01b67fa190f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f134da25-7e1e-48ea-8a9b-a01b67fa190f
Content-Type: application/json

--- request body ---
{"handle":"qa-a49d3ec7e2e7","password":"****"}

--- response: 200 in 81 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f134da25-7e1e-48ea-8a9b-a01b67fa190f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30dbe450-926c-4d14-89b3-7312adeb6a02"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f4b912fd-17aa-4940-b268-88c3b81cef0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4b912fd-17aa-4940-b268-88c3b81cef0f
Content-Type: application/json

--- request body ---
{"handle":"qa-a49d3ec7e2e7","password":"****"}

--- response: 200 in 84 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4b912fd-17aa-4940-b268-88c3b81cef0f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30dbe450-926c-4d14-89b3-7312adeb6a02"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e98a7bd1-efe3-426b-b2e3-bb5f8fe00b42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e98a7bd1-efe3-426b-b2e3-bb5f8fe00b42
Content-Type: application/json

--- request body ---
{"handle":"qa-a49d3ec7e2e7","password":"****"}

--- response: 200 in 83 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e98a7bd1-efe3-426b-b2e3-bb5f8fe00b42
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30dbe450-926c-4d14-89b3-7312adeb6a02"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8ee7477f-7a30-4a8c-a110-7f17be547651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ee7477f-7a30-4a8c-a110-7f17be547651
Content-Type: application/json

--- request body ---
{"handle":"qa-a49d3ec7e2e7","password":"****"}

--- response: 200 in 94 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ee7477f-7a30-4a8c-a110-7f17be547651
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30dbe450-926c-4d14-89b3-7312adeb6a02"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-df479dd2-a7a9-4f90-b7c1-891198d6d7d4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fe8b2cc46f3c44f483631c6771ebd700
X-Correlation-Id: qa-df479dd2-a7a9-4f90-b7c1-891198d6d7d4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 97 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-df479dd2-a7a9-4f90-b7c1-891198d6d7d4
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
Location: /v1/credits/purchases/pur_8ee2c1d5-8f89-4605-819f-de435789f720
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_8ee2c1d5-8f89-4605-819f-de435789f720","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:06.167837271Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bac695b2-c9c4-4b77-956d-8ba39d373eee

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fe8b2cc46f3c44f483631c6771ebd700
X-Correlation-Id: qa-bac695b2-c9c4-4b77-956d-8ba39d373eee
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 86 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bac695b2-c9c4-4b77-956d-8ba39d373eee
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
Location: /v1/credits/purchases/pur_8ee2c1d5-8f89-4605-819f-de435789f720
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_8ee2c1d5-8f89-4605-819f-de435789f720","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:06.167837271Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-33f2ecd3-d494-47ed-8cfb-4192f2a6da38

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fe8b2cc46f3c44f483631c6771ebd700
X-Correlation-Id: qa-33f2ecd3-d494-47ed-8cfb-4192f2a6da38
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 94 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-33f2ecd3-d494-47ed-8cfb-4192f2a6da38
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
Location: /v1/credits/purchases/pur_8ee2c1d5-8f89-4605-819f-de435789f720
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_8ee2c1d5-8f89-4605-819f-de435789f720","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:06.167837271Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9db9eb26-3964-49fa-8675-85adaeb3794f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fe8b2cc46f3c44f483631c6771ebd700
X-Correlation-Id: qa-9db9eb26-3964-49fa-8675-85adaeb3794f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 103 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-9db9eb26-3964-49fa-8675-85adaeb3794f
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
Location: /v1/credits/purchases/pur_8ee2c1d5-8f89-4605-819f-de435789f720
Content-Length: 144

{"id":"pur_8ee2c1d5-8f89-4605-819f-de435789f720","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:06.167837271Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5d8bf280-b3d8-401a-94fb-2d0295093366

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fe8b2cc46f3c44f483631c6771ebd700
X-Correlation-Id: qa-5d8bf280-b3d8-401a-94fb-2d0295093366
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 97 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d8bf280-b3d8-401a-94fb-2d0295093366
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
Location: /v1/credits/purchases/pur_8ee2c1d5-8f89-4605-819f-de435789f720
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_8ee2c1d5-8f89-4605-819f-de435789f720","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:06.167837271Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9af28776-40fa-4f61-b7d6-7df176404f7a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fe8b2cc46f3c44f483631c6771ebd700
X-Correlation-Id: qa-9af28776-40fa-4f61-b7d6-7df176404f7a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 103 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-9af28776-40fa-4f61-b7d6-7df176404f7a
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
Location: /v1/credits/purchases/pur_8ee2c1d5-8f89-4605-819f-de435789f720
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_8ee2c1d5-8f89-4605-819f-de435789f720","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:06.167837271Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-5b88bc0c-3a2f-4e9d-abd9-79574d270290

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b88bc0c-3a2f-4e9d-abd9-79574d270290
Content-Type: application/json

--- request body ---
{"handle":"qa-a49d3ec7e2e7","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b88bc0c-3a2f-4e9d-abd9-79574d270290
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30dbe450-926c-4d14-89b3-7312adeb6a02"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-6dfc257e-3feb-46e4-8ec6-495b03a280db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dfc257e-3feb-46e4-8ec6-495b03a280db
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dfc257e-3feb-46e4-8ec6-495b03a280db
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

{"balance":15,"currency":"credits","accountId":"acc_30dbe450-926c-4d14-89b3-7312adeb6a02"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-32eab9cc-b4e7-4d8d-9361-9f0d335fd9ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32eab9cc-b4e7-4d8d-9361-9f0d335fd9ac
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-32eab9cc-b4e7-4d8d-9361-9f0d335fd9ac
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
correlation: qa-3e290091-93e4-484c-b231-5a35dbeb7037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e290091-93e4-484c-b231-5a35dbeb7037
Content-Type: application/json

--- request body ---
{"handle":"qa-a49d3ec7e2e7","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e290091-93e4-484c-b231-5a35dbeb7037
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e290091-93e4-484c-b231-5a35dbeb7037"}
```
