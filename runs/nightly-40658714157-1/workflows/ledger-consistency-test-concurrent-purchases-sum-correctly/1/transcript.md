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
| 1 | `POST /v1/accounts` | 201 | 302 | `qa-04b01103-1ad1-4dba-b745-104ab226f070` |
| 8 | `POST /v1/auth/token` | 200 | 44 | `qa-68f3bf4a-81c9-4da6-bec6-681c02178688` |
| 5 | `POST /v1/auth/token` | 200 | 57 | `qa-f78c4029-89c3-4569-8612-dbe9fcbcbc7c` |
| 4 | `POST /v1/auth/token` | 200 | 60 | `qa-41988aab-4d7b-4e53-9a26-941689d7fece` |
| 2 | `POST /v1/auth/token` | 200 | 62 | `qa-369c4491-ac69-4b70-9be4-3b848d852f92` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-6ad414ac-936d-4559-b163-731f6804994b` |
| 9 | `POST /v1/auth/token` | 200 | 52 | `qa-2e7fee15-dd09-47de-8867-b181665c180c` |
| 3 | `POST /v1/auth/token` | 200 | 66 | `qa-df6c3376-6c1a-490b-b68a-5ea5915e3a2e` |
| 7 | `POST /v1/auth/token` | 200 | 62 | `qa-914a0e82-2bf0-42e5-b516-50243f1c16d0` |
| 11 | `POST /v1/auth/token` | 200 | 56 | `qa-86a29b7f-477c-4d4a-9be0-a34965725ebc` |
| 10 | `POST /v1/auth/token` | 200 | 66 | `qa-db34f976-d3bf-4bf1-99f1-442f142de2b2` |
| 20 | `POST /v1/credits/purchases` | 201 | 17 | `qa-a197d83d-e603-4cb0-85e9-9e9f5e98fe39` |
| 13 | `POST /v1/credits/purchases` | 201 | 45 | `qa-4614e289-2f17-4f15-ac9d-b6040726b9bc` |
| 12 | `POST /v1/credits/purchases` | 201 | 50 | `qa-719eb982-8be9-4b4b-9018-18a7d375520b` |
| 18 | `POST /v1/credits/purchases` | 201 | 31 | `qa-27fe4bb4-3c4d-4f9e-beb0-88f0ceee2b7e` |
| 16 | `POST /v1/credits/purchases` | 201 | 45 | `qa-7d70a4c3-ce55-4fec-a3db-46dd77f32adb` |
| 19 | `POST /v1/credits/purchases` | 201 | 28 | `qa-e05b1dcb-202c-470c-851b-eeed1f179935` |
| 21 | `POST /v1/credits/purchases` | 201 | 13 | `qa-a7f17ce5-724e-48c6-99c0-55b9e9de7b3c` |
| 14 | `POST /v1/credits/purchases` | 201 | 48 | `qa-1aaf6e3d-9a81-4d87-9549-92c5f4405018` |
| 15 | `POST /v1/credits/purchases` | 201 | 49 | `qa-79134d22-6ade-4211-a9c2-9611475c1b84` |
| 17 | `POST /v1/credits/purchases` | 201 | 56 | `qa-4e6bcee9-d6ea-4640-8ff3-0262cd867a7f` |
| 22 | `POST /v1/auth/token` | 200 | 23 | `qa-0046e7bd-d8cd-40f4-9d4a-8c8f5cff7451` |
| 23 | `GET /v1/credits/ledger` | 200 | 80 | `qa-d8a7769d-d7b8-4692-9c6e-e4d802246606` |
| 24 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-a12225db-b620-4e47-8860-eccee474258a` |
| 25 | `POST /v1/auth/token` | 401 | 32 | `qa-bec68ec8-d6fd-4fdd-a8f4-dfce2c6d4b61` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04b01103-1ad1-4dba-b745-104ab226f070

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04b01103-1ad1-4dba-b745-104ab226f070
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","displayName":"QA 6c04aef1b78d","password":"****","region":"us"}

--- response: 201 in 302 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-04b01103-1ad1-4dba-b745-104ab226f070
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
Location: /v1/accounts/qa-6c04aef1b78d
X-Served-Region: us
Content-Length: 181

{"id":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c","handle":"qa-6c04aef1b78d","displayName":"QA 6c04aef1b78d","region":"us","role":"user","createdAt":"2026-10-28T08:42:54.764608546Z"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-68f3bf4a-81c9-4da6-bec6-681c02178688

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f3bf4a-81c9-4da6-bec6-681c02178688
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 44 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-68f3bf4a-81c9-4da6-bec6-681c02178688
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f78c4029-89c3-4569-8612-dbe9fcbcbc7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f78c4029-89c3-4569-8612-dbe9fcbcbc7c
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 57 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f78c4029-89c3-4569-8612-dbe9fcbcbc7c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-41988aab-4d7b-4e53-9a26-941689d7fece

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41988aab-4d7b-4e53-9a26-941689d7fece
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 60 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-41988aab-4d7b-4e53-9a26-941689d7fece
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-369c4491-ac69-4b70-9be4-3b848d852f92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-369c4491-ac69-4b70-9be4-3b848d852f92
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 62 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-369c4491-ac69-4b70-9be4-3b848d852f92
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6ad414ac-936d-4559-b163-731f6804994b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ad414ac-936d-4559-b163-731f6804994b
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 60 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ad414ac-936d-4559-b163-731f6804994b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-2e7fee15-dd09-47de-8867-b181665c180c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e7fee15-dd09-47de-8867-b181665c180c
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 52 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e7fee15-dd09-47de-8867-b181665c180c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-df6c3376-6c1a-490b-b68a-5ea5915e3a2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df6c3376-6c1a-490b-b68a-5ea5915e3a2e
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 66 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-df6c3376-6c1a-490b-b68a-5ea5915e3a2e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-914a0e82-2bf0-42e5-b516-50243f1c16d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-914a0e82-2bf0-42e5-b516-50243f1c16d0
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 62 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-914a0e82-2bf0-42e5-b516-50243f1c16d0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-86a29b7f-477c-4d4a-9be0-a34965725ebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86a29b7f-477c-4d4a-9be0-a34965725ebc
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 56 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-86a29b7f-477c-4d4a-9be0-a34965725ebc
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-db34f976-d3bf-4bf1-99f1-442f142de2b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db34f976-d3bf-4bf1-99f1-442f142de2b2
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 66 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-db34f976-d3bf-4bf1-99f1-442f142de2b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a197d83d-e603-4cb0-85e9-9e9f5e98fe39

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d61c5df75c9a4f118b3b64687324e5e4
X-Correlation-Id: qa-a197d83d-e603-4cb0-85e9-9e9f5e98fe39
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a197d83d-e603-4cb0-85e9-9e9f5e98fe39
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
Location: /v1/credits/purchases/pur_0feba602-0bf2-490f-ae22-a0b241cadbb2
Content-Length: 144

{"id":"pur_0feba602-0bf2-490f-ae22-a0b241cadbb2","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-10-28T08:42:55.232150775Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4614e289-2f17-4f15-ac9d-b6040726b9bc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-33097983ca484d1b8280490a6fef0c8d
X-Correlation-Id: qa-4614e289-2f17-4f15-ac9d-b6040726b9bc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-4614e289-2f17-4f15-ac9d-b6040726b9bc
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
Location: /v1/credits/purchases/pur_b92639ef-6cf4-4f6b-aeab-aa9674d84ca1
Content-Length: 144

{"id":"pur_b92639ef-6cf4-4f6b-aeab-aa9674d84ca1","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-10-28T08:42:55.228478195Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-719eb982-8be9-4b4b-9018-18a7d375520b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3f8fc39f47744c718c413bfd9b374bea
X-Correlation-Id: qa-719eb982-8be9-4b4b-9018-18a7d375520b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-719eb982-8be9-4b4b-9018-18a7d375520b
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
Location: /v1/credits/purchases/pur_55451630-a17a-4ae1-9abb-60816b2da492
Content-Length: 144

{"id":"pur_55451630-a17a-4ae1-9abb-60816b2da492","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-10-28T08:42:55.227716091Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-27fe4bb4-3c4d-4f9e-beb0-88f0ceee2b7e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-25dc5dc273194f7d85c5e08bc3248bfc
X-Correlation-Id: qa-27fe4bb4-3c4d-4f9e-beb0-88f0ceee2b7e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 31 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-27fe4bb4-3c4d-4f9e-beb0-88f0ceee2b7e
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
Location: /v1/credits/purchases/pur_9201fba3-7fed-46f1-b121-3ecee5590427
Content-Length: 144

{"id":"pur_9201fba3-7fed-46f1-b121-3ecee5590427","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-10-28T08:42:55.227770392Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7d70a4c3-ce55-4fec-a3db-46dd77f32adb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d808b7635a3241d4a3cc5707dd576551
X-Correlation-Id: qa-7d70a4c3-ce55-4fec-a3db-46dd77f32adb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d70a4c3-ce55-4fec-a3db-46dd77f32adb
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
Location: /v1/credits/purchases/pur_6a0109be-a3e1-4307-ac30-a72e257c8fb7
Content-Length: 144

{"id":"pur_6a0109be-a3e1-4307-ac30-a72e257c8fb7","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:55.227658725Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e05b1dcb-202c-470c-851b-eeed1f179935

--- request headers ---
Accept: application/json
Idempotency-Key: qa-207af6e843f94669a0079977d566494d
X-Correlation-Id: qa-e05b1dcb-202c-470c-851b-eeed1f179935
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-e05b1dcb-202c-470c-851b-eeed1f179935
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
Location: /v1/credits/purchases/pur_277feb27-6a19-4123-aa71-c0bc39498064
Content-Length: 144

{"id":"pur_277feb27-6a19-4123-aa71-c0bc39498064","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-10-28T08:42:55.231933309Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a7f17ce5-724e-48c6-99c0-55b9e9de7b3c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-be7e2871864646b2807f5cffd43639a3
X-Correlation-Id: qa-a7f17ce5-724e-48c6-99c0-55b9e9de7b3c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7f17ce5-724e-48c6-99c0-55b9e9de7b3c
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
Location: /v1/credits/purchases/pur_47bdd2fb-884a-4eb4-860d-f7a0125d4e2e
Content-Length: 145

{"id":"pur_47bdd2fb-884a-4eb4-860d-f7a0125d4e2e","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-10-28T08:42:55.237182746Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1aaf6e3d-9a81-4d87-9549-92c5f4405018

--- request headers ---
Accept: application/json
Idempotency-Key: qa-417d6511eaf74ff1888c8797301b5527
X-Correlation-Id: qa-1aaf6e3d-9a81-4d87-9549-92c5f4405018
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1aaf6e3d-9a81-4d87-9549-92c5f4405018
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
Location: /v1/credits/purchases/pur_31561703-ce4f-409d-8481-4b98608d643b
Content-Length: 144

{"id":"pur_31561703-ce4f-409d-8481-4b98608d643b","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-10-28T08:42:55.232167380Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-79134d22-6ade-4211-a9c2-9611475c1b84

--- request headers ---
Accept: application/json
Idempotency-Key: qa-83a21ac117b94a35b6b3c1b8c73ea4c9
X-Correlation-Id: qa-79134d22-6ade-4211-a9c2-9611475c1b84
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 49 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-79134d22-6ade-4211-a9c2-9611475c1b84
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
Location: /v1/credits/purchases/pur_8fd1055d-b145-47d6-aad9-7432baaa6c07
Content-Length: 144

{"id":"pur_8fd1055d-b145-47d6-aad9-7432baaa6c07","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-10-28T08:42:55.232484977Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4e6bcee9-d6ea-4640-8ff3-0262cd867a7f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-86a3b75c12534ec0bf31417f671cb681
X-Correlation-Id: qa-4e6bcee9-d6ea-4640-8ff3-0262cd867a7f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e6bcee9-d6ea-4640-8ff3-0262cd867a7f
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
Location: /v1/credits/purchases/pur_7b0ca07d-b9eb-4e3f-b86f-31d71e2ada5f
Content-Length: 144

{"id":"pur_7b0ca07d-b9eb-4e3f-b86f-31d71e2ada5f","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-10-28T08:42:55.230489563Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-0046e7bd-d8cd-40f4-9d4a-8c8f5cff7451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0046e7bd-d8cd-40f4-9d4a-8c8f5cff7451
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-0046e7bd-d8cd-40f4-9d4a-8c8f5cff7451
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0162572-59d5-4cbb-aad1-3942bb08077c"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d8a7769d-d7b8-4692-9c6e-e4d802246606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8a7769d-d7b8-4692-9c6e-e4d802246606
Content-Type: application/json

--- response: 200 in 80 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8a7769d-d7b8-4692-9c6e-e4d802246606
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

{"items":[{"id":"led_565815c0-0eb5-4547-b07c-7094123c8875","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-28T08:42:54.764621666Z"},{"id":"led_984384c9-4287-4951-a357-702858d5a2db","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_6a0109be-a3e1-4307-ac30-a72e257c8fb7","createdAt":"2026-10-28T08:42:55.227658725Z"},{"id":"led_72c8af30-da3e-457f-a087-401d2fe0045e","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_55451630-a17a-4ae1-9abb-60816b2da492","createdAt":"2026-10-28T08:42:55.227716091Z"},{"id":"led_ac686550-aa41-46f0-b1d6-1467a67f8916","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_9201fba3-7fed-46f1-b121-3ecee5590427","createdAt":"2026-10-28T08:42:55.227770392Z"},{"id":"led_ce4555b3-fdf5-4aaf-a189-c51ca9ffe3a2","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_b92639ef-6cf4-4f6b-aeab-aa9674d84ca1","createdAt":"2026-10-28T08:42:55.228478195Z"},{"id":"led_c7a3171b-8151-4a44-94f0-ac789410d5eb","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_7b0ca07d-b9eb-4e3f-b86f-31d71e2ada5f","createdAt":"2026-10-28T08:42:55.230489563Z"},{"id":"led_43ce4b79-50a0-4c6c-919b-6463ee23a3ea","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_277feb27-6a19-4123-aa71-c0bc39498064","createdAt":"2026-10-28T08:42:55.231933309Z"},{"id":"led_75ab0a60-4f0e-4fe0-8066-5e533eb65689","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_0feba602-0bf2-490f-ae22-a0b241cadbb2","createdAt":"2026-10-28T08:42:55.232150775Z"},{"id":"led_e0b76415-a8b0-48da-9763-fbd0f988dc47","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_31561703-ce4f-409d-8481-4b98608d643b","createdAt":"2026-10-28T08:42:55.232167380Z"},{"id":"led_d204948c-8b56-4c7b-8d90-f3c1a1411b43","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_8fd1055d-b145-47d6-aad9-7432baaa6c07","createdAt":"2026-10-28T08:42:55.232484977Z"},{"id":"led_d1878c01-1893-4d6d-8dcc-3818b5b7ec43","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_47bdd2fb-884a-4eb4-860d-f7a0125d4e2e","createdAt":"2026-10-28T08:42:55.237182746Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a12225db-b620-4e47-8860-eccee474258a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a12225db-b620-4e47-8860-eccee474258a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a12225db-b620-4e47-8860-eccee474258a
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
correlation: qa-bec68ec8-d6fd-4fdd-a8f4-dfce2c6d4b61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bec68ec8-d6fd-4fdd-a8f4-dfce2c6d4b61
Content-Type: application/json

--- request body ---
{"handle":"qa-6c04aef1b78d","password":"****"}

--- response: 401 in 32 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bec68ec8-d6fd-4fdd-a8f4-dfce2c6d4b61
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bec68ec8-d6fd-4fdd-a8f4-dfce2c6d4b61"}
```
