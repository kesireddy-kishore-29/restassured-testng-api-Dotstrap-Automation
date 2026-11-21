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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-8cc0e2f9-e678-444e-8d76-28365f734191` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-c599ee05-840e-4f0f-8759-8c1d52d483a9` |
| 5 | `POST /v1/auth/token` | 200 | 33 | `qa-7c44b784-b94d-4560-b48c-9c615f925da3` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-a66c99d4-d99b-4380-9f52-8a28f4e4ae2a` |
| 4 | `POST /v1/auth/token` | 200 | 41 | `qa-979092bc-5981-43d3-af7c-d05b0edcf7d8` |
| 10 | `POST /v1/auth/token` | 200 | 26 | `qa-42594a9e-4529-4a8e-9c2b-2ac327157845` |
| 7 | `POST /v1/auth/token` | 200 | 39 | `qa-fa6cbdf6-4476-416a-b15e-09559b5c9405` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-a4494bd7-9790-4b6e-b51d-bcc1facb2bd3` |
| 8 | `POST /v1/auth/token` | 200 | 45 | `qa-4d6cf249-5758-471a-8c71-83f6023d5005` |
| 9 | `POST /v1/auth/token` | 200 | 43 | `qa-ed52053d-6f5e-461c-b831-01c22b4e8e3c` |
| 11 | `POST /v1/auth/token` | 200 | 27 | `qa-af952393-7c0c-4787-9993-8adfaf427803` |
| 14 | `POST /v1/credits/purchases` | 201 | 18 | `qa-e66c641a-3ca3-46dd-8418-ccda072c3f5b` |
| 12 | `POST /v1/credits/purchases` | 201 | 29 | `qa-70181ff4-5618-4933-a881-951b7def5acc` |
| 13 | `POST /v1/credits/purchases` | 201 | 29 | `qa-e6154854-b401-4bf8-b0f0-500689129f5a` |
| 18 | `POST /v1/credits/purchases` | 201 | 19 | `qa-6adc52fe-6b93-4e09-8dfe-5664fb9de336` |
| 19 | `POST /v1/credits/purchases` | 201 | 18 | `qa-371237cb-68ad-422a-81d9-0f1d6e09e36e` |
| 15 | `POST /v1/credits/purchases` | 201 | 24 | `qa-3266f55c-3fe1-4f5f-a9b5-bf21b86fd082` |
| 17 | `POST /v1/credits/purchases` | 201 | 23 | `qa-43882775-2be3-4923-a2ea-14b528f172b6` |
| 16 | `POST /v1/credits/purchases` | 201 | 24 | `qa-e22cd138-a182-4208-a13b-2a5874a09baa` |
| 20 | `POST /v1/credits/purchases` | 201 | 28 | `qa-40e08b8f-07f9-4f0d-a1a7-0850026cb208` |
| 21 | `POST /v1/credits/purchases` | 201 | 22 | `qa-2ed9c49f-d284-4957-8cab-94762007f78c` |
| 22 | `POST /v1/auth/token` | 200 | 6 | `qa-52a18a87-1b8f-408a-bf60-e08df9d79d5a` |
| 23 | `GET /v1/credits/ledger` | 200 | 11 | `qa-6dc7b722-cbe6-41df-afd9-aa3ccd7ea55a` |
| 24 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ec8bd4d8-13bb-4bd6-980c-7a104c9c261f` |
| 25 | `POST /v1/auth/token` | 401 | 5 | `qa-49888604-a798-4a14-8090-c9518550f9dc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8cc0e2f9-e678-444e-8d76-28365f734191

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc0e2f9-e678-444e-8d76-28365f734191
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","displayName":"QA eb7e57d3e614","password":"****","region":"us"}

--- response: 201 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cc0e2f9-e678-444e-8d76-28365f734191
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-eb7e57d3e614
X-Served-Region: us
Content-Length: 181

{"id":"acc_1aed395c-c772-4151-9024-8f20c303d577","handle":"qa-eb7e57d3e614","displayName":"QA eb7e57d3e614","region":"us","role":"user","createdAt":"2026-11-21T09:57:06.619444647Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c599ee05-840e-4f0f-8759-8c1d52d483a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c599ee05-840e-4f0f-8759-8c1d52d483a9
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-c599ee05-840e-4f0f-8759-8c1d52d483a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7c44b784-b94d-4560-b48c-9c615f925da3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c44b784-b94d-4560-b48c-9c615f925da3
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c44b784-b94d-4560-b48c-9c615f925da3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a66c99d4-d99b-4380-9f52-8a28f4e4ae2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a66c99d4-d99b-4380-9f52-8a28f4e4ae2a
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a66c99d4-d99b-4380-9f52-8a28f4e4ae2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-979092bc-5981-43d3-af7c-d05b0edcf7d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-979092bc-5981-43d3-af7c-d05b0edcf7d8
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-979092bc-5981-43d3-af7c-d05b0edcf7d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-42594a9e-4529-4a8e-9c2b-2ac327157845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42594a9e-4529-4a8e-9c2b-2ac327157845
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-42594a9e-4529-4a8e-9c2b-2ac327157845
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-fa6cbdf6-4476-416a-b15e-09559b5c9405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6cbdf6-4476-416a-b15e-09559b5c9405
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa6cbdf6-4476-416a-b15e-09559b5c9405
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a4494bd7-9790-4b6e-b51d-bcc1facb2bd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4494bd7-9790-4b6e-b51d-bcc1facb2bd3
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4494bd7-9790-4b6e-b51d-bcc1facb2bd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-4d6cf249-5758-471a-8c71-83f6023d5005

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d6cf249-5758-471a-8c71-83f6023d5005
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 45 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d6cf249-5758-471a-8c71-83f6023d5005
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-ed52053d-6f5e-461c-b831-01c22b4e8e3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed52053d-6f5e-461c-b831-01c22b4e8e3c
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed52053d-6f5e-461c-b831-01c22b4e8e3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-af952393-7c0c-4787-9993-8adfaf427803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af952393-7c0c-4787-9993-8adfaf427803
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-af952393-7c0c-4787-9993-8adfaf427803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e66c641a-3ca3-46dd-8418-ccda072c3f5b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1429b4d8dbb64456a08d4ed04d32d1e7
X-Correlation-Id: qa-e66c641a-3ca3-46dd-8418-ccda072c3f5b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e66c641a-3ca3-46dd-8418-ccda072c3f5b
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
Location: /v1/credits/purchases/pur_59954ddd-85c5-46db-a46c-31b4e8888888
Content-Length: 144

{"id":"pur_59954ddd-85c5-46db-a46c-31b4e8888888","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-21T09:57:06.717249752Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-70181ff4-5618-4933-a881-951b7def5acc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-63d105db00934c4997abc4e250f7eded
X-Correlation-Id: qa-70181ff4-5618-4933-a881-951b7def5acc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-70181ff4-5618-4933-a881-951b7def5acc
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
Location: /v1/credits/purchases/pur_8969246c-0820-45d7-a713-b4bafe6f613c
Content-Length: 144

{"id":"pur_8969246c-0820-45d7-a713-b4bafe6f613c","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-21T09:57:06.718067369Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e6154854-b401-4bf8-b0f0-500689129f5a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-12feb586f73c40748ab9a5552467f223
X-Correlation-Id: qa-e6154854-b401-4bf8-b0f0-500689129f5a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6154854-b401-4bf8-b0f0-500689129f5a
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
Location: /v1/credits/purchases/pur_b2d41349-2aa6-4e8d-ae2c-5c2546469c6b
Content-Length: 144

{"id":"pur_b2d41349-2aa6-4e8d-ae2c-5c2546469c6b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:06.714130103Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6adc52fe-6b93-4e09-8dfe-5664fb9de336

--- request headers ---
Accept: application/json
Idempotency-Key: qa-155c2b76870d43978780c3a2861895ce
X-Correlation-Id: qa-6adc52fe-6b93-4e09-8dfe-5664fb9de336
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6adc52fe-6b93-4e09-8dfe-5664fb9de336
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
Location: /v1/credits/purchases/pur_d4fab2f8-b5ea-44a2-ac80-fe2981a0faab
Content-Length: 144

{"id":"pur_d4fab2f8-b5ea-44a2-ac80-fe2981a0faab","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-21T09:57:06.724002681Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-371237cb-68ad-422a-81d9-0f1d6e09e36e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9c3544a1b4384b87aa1ffc496c352481
X-Correlation-Id: qa-371237cb-68ad-422a-81d9-0f1d6e09e36e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-371237cb-68ad-422a-81d9-0f1d6e09e36e
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
Location: /v1/credits/purchases/pur_32664e6c-9683-48e7-8b58-a2163a1b4a2f
Content-Length: 144

{"id":"pur_32664e6c-9683-48e7-8b58-a2163a1b4a2f","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-21T09:57:06.722393814Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3266f55c-3fe1-4f5f-a9b5-bf21b86fd082

--- request headers ---
Accept: application/json
Idempotency-Key: qa-533272de15514de0bdca9d57215a1c19
X-Correlation-Id: qa-3266f55c-3fe1-4f5f-a9b5-bf21b86fd082
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3266f55c-3fe1-4f5f-a9b5-bf21b86fd082
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
Location: /v1/credits/purchases/pur_3332183e-4412-4780-a01f-0c8e48e56edd
Content-Length: 144

{"id":"pur_3332183e-4412-4780-a01f-0c8e48e56edd","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-21T09:57:06.726939828Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-43882775-2be3-4923-a2ea-14b528f172b6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-40d2195aa36e4f229528c1f83f88d234
X-Correlation-Id: qa-43882775-2be3-4923-a2ea-14b528f172b6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-43882775-2be3-4923-a2ea-14b528f172b6
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
Location: /v1/credits/purchases/pur_ef3dc0c4-3642-44da-bd52-0291781d6fa4
Content-Length: 144

{"id":"pur_ef3dc0c4-3642-44da-bd52-0291781d6fa4","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-21T09:57:06.724059890Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e22cd138-a182-4208-a13b-2a5874a09baa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d8bb59455cf242f4b84dd4da19640071
X-Correlation-Id: qa-e22cd138-a182-4208-a13b-2a5874a09baa
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e22cd138-a182-4208-a13b-2a5874a09baa
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
Location: /v1/credits/purchases/pur_40a2d20a-f521-4337-9e88-dba032fb1fb3
Content-Length: 144

{"id":"pur_40a2d20a-f521-4337-9e88-dba032fb1fb3","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-21T09:57:06.725116877Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-40e08b8f-07f9-4f0d-a1a7-0850026cb208

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7012fa0a67cf4f81bf5c895af40acaac
X-Correlation-Id: qa-40e08b8f-07f9-4f0d-a1a7-0850026cb208
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-40e08b8f-07f9-4f0d-a1a7-0850026cb208
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
Location: /v1/credits/purchases/pur_bfc165bd-1787-4224-8dff-9e008cb90312
Content-Length: 144

{"id":"pur_bfc165bd-1787-4224-8dff-9e008cb90312","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-21T09:57:06.734382278Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2ed9c49f-d284-4957-8cab-94762007f78c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-933adc5b584445a1890799e7a1236125
X-Correlation-Id: qa-2ed9c49f-d284-4957-8cab-94762007f78c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ed9c49f-d284-4957-8cab-94762007f78c
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
Location: /v1/credits/purchases/pur_6a30dcab-93d4-4fbe-8c65-4272d840989c
Content-Length: 145

{"id":"pur_6a30dcab-93d4-4fbe-8c65-4272d840989c","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-21T09:57:06.735633974Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-52a18a87-1b8f-408a-bf60-e08df9d79d5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52a18a87-1b8f-408a-bf60-e08df9d79d5a
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-52a18a87-1b8f-408a-bf60-e08df9d79d5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aed395c-c772-4151-9024-8f20c303d577"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6dc7b722-cbe6-41df-afd9-aa3ccd7ea55a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dc7b722-cbe6-41df-afd9-aa3ccd7ea55a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dc7b722-cbe6-41df-afd9-aa3ccd7ea55a
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
Content-Length: 764

{"items":[{"id":"led_d84738e8-ae52-4946-8f7a-a881033a4592","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-21T09:57:06.619458772Z"},{"id":"led_a7d4eddc-1e1a-45ac-ab91-4e542dfcab11","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_b2d41349-2aa6-4e8d-ae2c-5c2546469c6b","createdAt":"2026-11-21T09:57:06.714130103Z"},{"id":"led_dce3a1a9-8683-4302-b65f-47c4099bd967","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_59954ddd-85c5-46db-a46c-31b4e8888888","createdAt":"2026-11-21T09:57:06.717249752Z"},{"id":"led_d5436a7c-5936-4e44-bb8c-ef3e5f27978d","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_8969246c-0820-45d7-a713-b4bafe6f613c","createdAt":"2026-11-21T09:57:06.718067369Z"},{"id":"led_18c1649b-c301-4658-b7f5-66d0bf4871bc","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_32664e6c-9683-48e7-8b58-a2163a1b4a2f","createdAt":"2026-11-21T09:57:06.722393814Z"},{"id":"led_cae7eefc-8317-44b9-8c08-0c1b9345f113","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_d4fab2f8-b5ea-44a2-ac80-fe2981a0faab","createdAt":"2026-11-21T09:57:06.724002681Z"},{"id":"led_9968a6d2-2d1c-4187-8dcd-f41023ed8bf6","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_ef3dc0c4-3642-44da-bd52-0291781d6fa4","createdAt":"2026-11-21T09:57:06.724059890Z"},{"id":"led_48925012-2805-4bf7-aaca-9a4b098972a8","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_40a2d20a-f521-4337-9e88-dba032fb1fb3","createdAt":"2026-11-21T09:57:06.725116877Z"},{"id":"led_8d93191a-2e8e-4146-9890-a9fd889f8971","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_3332183e-4412-4780-a01f-0c8e48e56edd","createdAt":"2026-11-21T09:57:06.726939828Z"},{"id":"led_b4084417-1c3c-449b-abc2-674ad18beedd","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_bfc165bd-1787-4224-8dff-9e008cb90312","createdAt":"2026-11-21T09:57:06.734382278Z"},{"id":"led_3dcbba00-6b80-43a9-afcd-00f0c24b4d8a","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_6a30dcab-93d4-4fbe-8c65-4272d840989c","createdAt":"2026-11-21T09:57:06.735633974Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec8bd4d8-13bb-4bd6-980c-7a104c9c261f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec8bd4d8-13bb-4bd6-980c-7a104c9c261f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec8bd4d8-13bb-4bd6-980c-7a104c9c261f
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
correlation: qa-49888604-a798-4a14-8090-c9518550f9dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49888604-a798-4a14-8090-c9518550f9dc
Content-Type: application/json

--- request body ---
{"handle":"qa-eb7e57d3e614","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49888604-a798-4a14-8090-c9518550f9dc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-49888604-a798-4a14-8090-c9518550f9dc"}
```
