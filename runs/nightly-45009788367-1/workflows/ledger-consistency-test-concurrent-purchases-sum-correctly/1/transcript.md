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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-e12fd9a9-d376-49b5-8c0e-30c9b7bde64c` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-cbc1d3ff-1b8d-4dc9-9693-55035b70f93a` |
| 9 | `POST /v1/auth/token` | 200 | 31 | `qa-ecb4abf0-806e-45a6-a3e5-8f7aa1c86116` |
| 7 | `POST /v1/auth/token` | 200 | 36 | `qa-1031e29e-fa54-458b-ad5c-df050f8a6960` |
| 8 | `POST /v1/auth/token` | 200 | 37 | `qa-5ceb3a48-8dbe-4bb6-bedf-97c4ec776246` |
| 3 | `POST /v1/auth/token` | 200 | 55 | `qa-aa2a269d-62b9-4605-a337-76ee58de8923` |
| 4 | `POST /v1/auth/token` | 200 | 50 | `qa-51743c51-db3b-4114-8b66-0670a2492df8` |
| 5 | `POST /v1/auth/token` | 200 | 59 | `qa-4e824faa-0658-474d-849d-a1fe92fda4c0` |
| 10 | `POST /v1/auth/token` | 200 | 49 | `qa-2f695f95-b87f-4124-9776-edba4c7c8d14` |
| 11 | `POST /v1/auth/token` | 200 | 47 | `qa-b88ef408-921a-4127-8986-0fdc86a2fc57` |
| 6 | `POST /v1/auth/token` | 200 | 56 | `qa-2e8b4b3f-309e-41e4-a72d-3087bc4d6bb4` |
| 14 | `POST /v1/credits/purchases` | 201 | 29 | `qa-7adea574-4e46-4cdb-b1bf-3bb98c5c34cc` |
| 12 | `POST /v1/credits/purchases` | 201 | 39 | `qa-2eb60e54-5747-4eef-b31d-24133b4c880e` |
| 15 | `POST /v1/credits/purchases` | 201 | 31 | `qa-877f452b-4ef0-4894-b286-621ea3d8c06e` |
| 19 | `POST /v1/credits/purchases` | 201 | 20 | `qa-a9139442-0a3e-458b-a789-808c056716d2` |
| 16 | `POST /v1/credits/purchases` | 201 | 30 | `qa-386fc2b7-a39c-46a4-9f9c-0be3029e4589` |
| 13 | `POST /v1/credits/purchases` | 201 | 46 | `qa-4dba3a6c-3a65-4b90-a806-95833506949b` |
| 20 | `POST /v1/credits/purchases` | 201 | 26 | `qa-80a340c3-250a-44b2-b96f-bf6a6880fd6b` |
| 21 | `POST /v1/credits/purchases` | 201 | 22 | `qa-5fad2e9a-4354-445b-a986-1a9c5c2a3aff` |
| 17 | `POST /v1/credits/purchases` | 201 | 33 | `qa-728d32ff-42c0-4330-8b6d-18d44cbdebb0` |
| 18 | `POST /v1/credits/purchases` | 201 | 37 | `qa-aa533ac5-e906-4faf-ba54-e382d6cac43b` |
| 22 | `POST /v1/auth/token` | 200 | 32 | `qa-3dc7023c-3d34-435f-b932-5080369769ba` |
| 23 | `GET /v1/credits/ledger` | 200 | 48 | `qa-0a84e4bc-6770-4439-a226-663011bcb2b2` |
| 24 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-cfa67894-d7cd-4583-b086-04d5df7379ce` |
| 25 | `POST /v1/auth/token` | 401 | 25 | `qa-a9c7a998-d5a7-4c40-b655-f1d36aa93e69` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e12fd9a9-d376-49b5-8c0e-30c9b7bde64c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e12fd9a9-d376-49b5-8c0e-30c9b7bde64c
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","displayName":"QA a11a782abd97","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e12fd9a9-d376-49b5-8c0e-30c9b7bde64c
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
Location: /v1/accounts/qa-a11a782abd97
X-Served-Region: us
Content-Length: 181

{"id":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34","handle":"qa-a11a782abd97","displayName":"QA a11a782abd97","region":"us","role":"user","createdAt":"2026-11-22T09:54:49.447462473Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cbc1d3ff-1b8d-4dc9-9693-55035b70f93a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbc1d3ff-1b8d-4dc9-9693-55035b70f93a
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbc1d3ff-1b8d-4dc9-9693-55035b70f93a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-ecb4abf0-806e-45a6-a3e5-8f7aa1c86116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecb4abf0-806e-45a6-a3e5-8f7aa1c86116
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecb4abf0-806e-45a6-a3e5-8f7aa1c86116
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-1031e29e-fa54-458b-ad5c-df050f8a6960

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1031e29e-fa54-458b-ad5c-df050f8a6960
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-1031e29e-fa54-458b-ad5c-df050f8a6960
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-5ceb3a48-8dbe-4bb6-bedf-97c4ec776246

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ceb3a48-8dbe-4bb6-bedf-97c4ec776246
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ceb3a48-8dbe-4bb6-bedf-97c4ec776246
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-aa2a269d-62b9-4605-a337-76ee58de8923

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa2a269d-62b9-4605-a337-76ee58de8923
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 55 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa2a269d-62b9-4605-a337-76ee58de8923
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-51743c51-db3b-4114-8b66-0670a2492df8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51743c51-db3b-4114-8b66-0670a2492df8
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 50 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-51743c51-db3b-4114-8b66-0670a2492df8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4e824faa-0658-474d-849d-a1fe92fda4c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e824faa-0658-474d-849d-a1fe92fda4c0
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 59 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e824faa-0658-474d-849d-a1fe92fda4c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2f695f95-b87f-4124-9776-edba4c7c8d14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f695f95-b87f-4124-9776-edba4c7c8d14
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 49 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f695f95-b87f-4124-9776-edba4c7c8d14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-b88ef408-921a-4127-8986-0fdc86a2fc57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b88ef408-921a-4127-8986-0fdc86a2fc57
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 47 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-b88ef408-921a-4127-8986-0fdc86a2fc57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2e8b4b3f-309e-41e4-a72d-3087bc4d6bb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e8b4b3f-309e-41e4-a72d-3087bc4d6bb4
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 56 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e8b4b3f-309e-41e4-a72d-3087bc4d6bb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7adea574-4e46-4cdb-b1bf-3bb98c5c34cc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-909127638c664ab9a1d9e103959274c2
X-Correlation-Id: qa-7adea574-4e46-4cdb-b1bf-3bb98c5c34cc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-7adea574-4e46-4cdb-b1bf-3bb98c5c34cc
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
Location: /v1/credits/purchases/pur_8d4a9aa1-ba05-4721-9804-980a408967f3
Content-Length: 144

{"id":"pur_8d4a9aa1-ba05-4721-9804-980a408967f3","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-22T09:54:49.582999309Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2eb60e54-5747-4eef-b31d-24133b4c880e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f45f51d5015d4301882c6b46ba969635
X-Correlation-Id: qa-2eb60e54-5747-4eef-b31d-24133b4c880e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 39 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eb60e54-5747-4eef-b31d-24133b4c880e
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
Location: /v1/credits/purchases/pur_8eaff8ca-998a-4db7-897e-6930a35b19f7
Content-Length: 144

{"id":"pur_8eaff8ca-998a-4db7-897e-6930a35b19f7","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-22T09:54:49.567935148Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-877f452b-4ef0-4894-b286-621ea3d8c06e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9c24356cfc6a491db8c9df0de7d37145
X-Correlation-Id: qa-877f452b-4ef0-4894-b286-621ea3d8c06e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-877f452b-4ef0-4894-b286-621ea3d8c06e
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
Location: /v1/credits/purchases/pur_c0f049c3-a368-44df-8938-8c2a04dfec78
Content-Length: 144

{"id":"pur_c0f049c3-a368-44df-8938-8c2a04dfec78","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:49.574346727Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a9139442-0a3e-458b-a789-808c056716d2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f6f5a2ed49a443beb86058eb9d9c6416
X-Correlation-Id: qa-a9139442-0a3e-458b-a789-808c056716d2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9139442-0a3e-458b-a789-808c056716d2
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
Location: /v1/credits/purchases/pur_9a25821e-8b21-4f2b-a6c3-23396ed9fb76
Content-Length: 144

{"id":"pur_9a25821e-8b21-4f2b-a6c3-23396ed9fb76","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-22T09:54:49.594994692Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-386fc2b7-a39c-46a4-9f9c-0be3029e4589

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9ceb714442cd4653ab579c4738286c97
X-Correlation-Id: qa-386fc2b7-a39c-46a4-9f9c-0be3029e4589
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-386fc2b7-a39c-46a4-9f9c-0be3029e4589
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
Location: /v1/credits/purchases/pur_a456b474-28d8-4525-9ca6-6df195569202
Content-Length: 144

{"id":"pur_a456b474-28d8-4525-9ca6-6df195569202","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-22T09:54:49.592334147Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4dba3a6c-3a65-4b90-a806-95833506949b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7f4d2d4723fe4a749f67ad3b1766e391
X-Correlation-Id: qa-4dba3a6c-3a65-4b90-a806-95833506949b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 46 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dba3a6c-3a65-4b90-a806-95833506949b
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
Location: /v1/credits/purchases/pur_6426181e-90ae-44d3-89c8-f30c67b7519f
Content-Length: 144

{"id":"pur_6426181e-90ae-44d3-89c8-f30c67b7519f","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-22T09:54:49.579693406Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-80a340c3-250a-44b2-b96f-bf6a6880fd6b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8731e51bdfc4475db6b5bbe61b5e528a
X-Correlation-Id: qa-80a340c3-250a-44b2-b96f-bf6a6880fd6b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-80a340c3-250a-44b2-b96f-bf6a6880fd6b
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
Location: /v1/credits/purchases/pur_031800ab-db9f-4336-a044-809881605f74
Content-Length: 144

{"id":"pur_031800ab-db9f-4336-a044-809881605f74","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-22T09:54:49.601717956Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5fad2e9a-4354-445b-a986-1a9c5c2a3aff

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2bfb85dd4d1c4fdb9283f62bd31df868
X-Correlation-Id: qa-5fad2e9a-4354-445b-a986-1a9c5c2a3aff
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fad2e9a-4354-445b-a986-1a9c5c2a3aff
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
Location: /v1/credits/purchases/pur_8c49be62-89cf-4d3b-9223-d2eec54a1b5b
Content-Length: 145

{"id":"pur_8c49be62-89cf-4d3b-9223-d2eec54a1b5b","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-22T09:54:49.603809539Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-728d32ff-42c0-4330-8b6d-18d44cbdebb0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6557bb78cacb4c7eb5ac6dc088ce2944
X-Correlation-Id: qa-728d32ff-42c0-4330-8b6d-18d44cbdebb0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 33 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-728d32ff-42c0-4330-8b6d-18d44cbdebb0
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
Location: /v1/credits/purchases/pur_5d2191b0-d118-4133-b20e-1cc4626b33f3
Content-Length: 144

{"id":"pur_5d2191b0-d118-4133-b20e-1cc4626b33f3","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-22T09:54:49.603119298Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-aa533ac5-e906-4faf-ba54-e382d6cac43b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-07b2fbe8ade34803af95bf71ad86e968
X-Correlation-Id: qa-aa533ac5-e906-4faf-ba54-e382d6cac43b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa533ac5-e906-4faf-ba54-e382d6cac43b
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
Location: /v1/credits/purchases/pur_ce8ff797-b16c-46ee-a870-b4caf102c9af
Content-Length: 144

{"id":"pur_ce8ff797-b16c-46ee-a870-b4caf102c9af","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-22T09:54:49.593793096Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-3dc7023c-3d34-435f-b932-5080369769ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dc7023c-3d34-435f-b932-5080369769ba
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dc7023c-3d34-435f-b932-5080369769ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b6e936d-e200-4383-8581-e110cb4c2c34"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-0a84e4bc-6770-4439-a226-663011bcb2b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a84e4bc-6770-4439-a226-663011bcb2b2
Content-Type: application/json

--- response: 200 in 48 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a84e4bc-6770-4439-a226-663011bcb2b2
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

{"items":[{"id":"led_730865bb-2e60-4328-a398-bcd411540370","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-22T09:54:49.447477231Z"},{"id":"led_58fa35a0-8694-4ea5-ac9e-bb4a9cda6e86","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_c0f049c3-a368-44df-8938-8c2a04dfec78","createdAt":"2026-11-22T09:54:49.574346727Z"},{"id":"led_1ea2de53-0a0f-43a2-a6dc-fba44a0fa776","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_6426181e-90ae-44d3-89c8-f30c67b7519f","createdAt":"2026-11-22T09:54:49.579693406Z"},{"id":"led_e90aa250-1f99-4aa1-aa36-bbe4fb2b24b6","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_8eaff8ca-998a-4db7-897e-6930a35b19f7","createdAt":"2026-11-22T09:54:49.567935148Z"},{"id":"led_af46cd54-d4cc-46a1-985d-bb41c8d7f919","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_8d4a9aa1-ba05-4721-9804-980a408967f3","createdAt":"2026-11-22T09:54:49.582999309Z"},{"id":"led_78157709-0374-4312-8524-8a91c5b8334d","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_a456b474-28d8-4525-9ca6-6df195569202","createdAt":"2026-11-22T09:54:49.592334147Z"},{"id":"led_058acd8b-3d2c-4c3c-8ad6-8ec439e30462","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_ce8ff797-b16c-46ee-a870-b4caf102c9af","createdAt":"2026-11-22T09:54:49.593793096Z"},{"id":"led_7183f6a9-b11e-4ec9-9332-8e344d39a11b","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_9a25821e-8b21-4f2b-a6c3-23396ed9fb76","createdAt":"2026-11-22T09:54:49.594994692Z"},{"id":"led_05eca8e0-0cba-4ae0-a726-a4e8440f6ce2","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_031800ab-db9f-4336-a044-809881605f74","createdAt":"2026-11-22T09:54:49.601717956Z"},{"id":"led_f2766237-f306-46bc-bbce-3f3669fdcc9f","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_5d2191b0-d118-4133-b20e-1cc4626b33f3","createdAt":"2026-11-22T09:54:49.603119298Z"},{"id":"led_86e2124f-cb9f-46de-b4d5-7745098ad1ca","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_8c49be62-89cf-4d3b-9223-d2eec54a1b5b","createdAt":"2026-11-22T09:54:49.603809539Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cfa67894-d7cd-4583-b086-04d5df7379ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfa67894-d7cd-4583-b086-04d5df7379ce
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cfa67894-d7cd-4583-b086-04d5df7379ce
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
correlation: qa-a9c7a998-d5a7-4c40-b655-f1d36aa93e69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9c7a998-d5a7-4c40-b655-f1d36aa93e69
Content-Type: application/json

--- request body ---
{"handle":"qa-a11a782abd97","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9c7a998-d5a7-4c40-b655-f1d36aa93e69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9c7a998-d5a7-4c40-b655-f1d36aa93e69"}
```
