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
| 1 | `POST /v1/accounts` | 201 | 466 | `qa-986516f9-719a-4a0e-9154-44017d6c7fe4` |
| 3 | `POST /v1/auth/token` | 200 | 80 | `qa-9606f888-6c6c-445b-913d-99e6866aa2b8` |
| 11 | `POST /v1/auth/token` | 200 | 63 | `qa-099dd6cd-b396-4433-9021-56ced9a7eee6` |
| 8 | `POST /v1/auth/token` | 200 | 69 | `qa-7cb397d1-d067-4a2c-bde8-73bac5d6ad9a` |
| 10 | `POST /v1/auth/token` | 200 | 65 | `qa-03da9d91-bbe4-45fd-969c-49cdee061b1d` |
| 4 | `POST /v1/auth/token` | 200 | 84 | `qa-c9dfffb1-e75e-448d-b35c-5c3bfe6c669f` |
| 9 | `POST /v1/auth/token` | 200 | 74 | `qa-70e26c1b-db96-43db-87ee-95470f4c50e6` |
| 2 | `POST /v1/auth/token` | 200 | 87 | `qa-597abf64-1157-49fa-9e8b-75f548fbed45` |
| 5 | `POST /v1/auth/token` | 200 | 86 | `qa-78b0901b-3350-4555-bcbd-87025da93989` |
| 6 | `POST /v1/auth/token` | 200 | 86 | `qa-35ee9df9-58d2-40e9-96d1-eea174900dcb` |
| 7 | `POST /v1/auth/token` | 200 | 84 | `qa-0f096dc3-1157-4b72-ab64-7d9dba5e492d` |
| 14 | `POST /v1/credits/purchases` | 201 | 73 | `qa-e5f84dc1-0e8a-4adb-b0b9-de5736905b9e` |
| 12 | `POST /v1/credits/purchases` | 201 | 84 | `qa-426b2909-ff97-4461-861a-bc4cbe92fb7f` |
| 18 | `POST /v1/credits/purchases` | 201 | 70 | `qa-077582be-0745-4dfe-b099-c6258534d7d1` |
| 20 | `POST /v1/credits/purchases` | 201 | 63 | `qa-b154770f-caa8-4e6b-848e-eef5899d8c41` |
| 16 | `POST /v1/credits/purchases` | 201 | 77 | `qa-ca92abe8-2961-4f45-9c14-fc05db1e56fc` |
| 17 | `POST /v1/credits/purchases` | 201 | 65 | `qa-3313e720-941c-4f53-913c-82023a108598` |
| 19 | `POST /v1/credits/purchases` | 201 | 64 | `qa-398cf86c-eab6-43ea-ae6a-080f430cbb41` |
| 21 | `POST /v1/credits/purchases` | 201 | 75 | `qa-05a41dc3-b912-466e-9d80-5d2ce78a0a85` |
| 15 | `POST /v1/credits/purchases` | 201 | 70 | `qa-9df1dcf2-377f-41d6-8d1e-17e3f40dbc4c` |
| 13 | `POST /v1/credits/purchases` | 201 | 96 | `qa-17bfa090-d37c-4f42-ace9-c559c885b0b1` |
| 22 | `POST /v1/auth/token` | 200 | 25 | `qa-48b93fc6-47e4-420f-a976-b1198061098c` |
| 23 | `GET /v1/credits/ledger` | 200 | 68 | `qa-86c348a7-8a40-41d4-9872-5794d9235d37` |
| 24 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-6796db8c-3996-47e7-95b4-9463903bc506` |
| 25 | `POST /v1/auth/token` | 401 | 38 | `qa-d64ab0b0-04d5-4932-b2c3-b62ff540cde0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-986516f9-719a-4a0e-9154-44017d6c7fe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-986516f9-719a-4a0e-9154-44017d6c7fe4
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","displayName":"QA a109de1aa556","password":"****","region":"us"}

--- response: 201 in 466 ms ---
Date: Sat, 24 Oct 2026 07:25:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-986516f9-719a-4a0e-9154-44017d6c7fe4
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
Location: /v1/accounts/qa-a109de1aa556
X-Served-Region: us
Content-Length: 181

{"id":"acc_dbe55962-d9af-4145-97a9-272f40857b0c","handle":"qa-a109de1aa556","displayName":"QA a109de1aa556","region":"us","role":"user","createdAt":"2026-10-24T07:25:34.846073048Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9606f888-6c6c-445b-913d-99e6866aa2b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9606f888-6c6c-445b-913d-99e6866aa2b8
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 80 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9606f888-6c6c-445b-913d-99e6866aa2b8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-099dd6cd-b396-4433-9021-56ced9a7eee6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-099dd6cd-b396-4433-9021-56ced9a7eee6
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 63 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-099dd6cd-b396-4433-9021-56ced9a7eee6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-7cb397d1-d067-4a2c-bde8-73bac5d6ad9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cb397d1-d067-4a2c-bde8-73bac5d6ad9a
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 69 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cb397d1-d067-4a2c-bde8-73bac5d6ad9a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-03da9d91-bbe4-45fd-969c-49cdee061b1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03da9d91-bbe4-45fd-969c-49cdee061b1d
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 65 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-03da9d91-bbe4-45fd-969c-49cdee061b1d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c9dfffb1-e75e-448d-b35c-5c3bfe6c669f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9dfffb1-e75e-448d-b35c-5c3bfe6c669f
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 84 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9dfffb1-e75e-448d-b35c-5c3bfe6c669f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-70e26c1b-db96-43db-87ee-95470f4c50e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70e26c1b-db96-43db-87ee-95470f4c50e6
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 74 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-70e26c1b-db96-43db-87ee-95470f4c50e6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-597abf64-1157-49fa-9e8b-75f548fbed45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-597abf64-1157-49fa-9e8b-75f548fbed45
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 87 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-597abf64-1157-49fa-9e8b-75f548fbed45
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-78b0901b-3350-4555-bcbd-87025da93989

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78b0901b-3350-4555-bcbd-87025da93989
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 86 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-78b0901b-3350-4555-bcbd-87025da93989
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-35ee9df9-58d2-40e9-96d1-eea174900dcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35ee9df9-58d2-40e9-96d1-eea174900dcb
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 86 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-35ee9df9-58d2-40e9-96d1-eea174900dcb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-0f096dc3-1157-4b72-ab64-7d9dba5e492d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f096dc3-1157-4b72-ab64-7d9dba5e492d
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 84 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f096dc3-1157-4b72-ab64-7d9dba5e492d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e5f84dc1-0e8a-4adb-b0b9-de5736905b9e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a29d8621c3d844249e4c6d644fe58524
X-Correlation-Id: qa-e5f84dc1-0e8a-4adb-b0b9-de5736905b9e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 73 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5f84dc1-0e8a-4adb-b0b9-de5736905b9e
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
Location: /v1/credits/purchases/pur_2f2dc37c-b86e-40b1-a3e7-800e28b1be98
Content-Length: 144

{"id":"pur_2f2dc37c-b86e-40b1-a3e7-800e28b1be98","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-10-24T07:25:35.644744211Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-426b2909-ff97-4461-861a-bc4cbe92fb7f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9883837055b74f44aa0da7933a2a12a2
X-Correlation-Id: qa-426b2909-ff97-4461-861a-bc4cbe92fb7f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 84 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-426b2909-ff97-4461-861a-bc4cbe92fb7f
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
Location: /v1/credits/purchases/pur_46f46bf8-4aca-4a4e-bf54-6c15dde90bf3
Content-Length: 144

{"id":"pur_46f46bf8-4aca-4a4e-bf54-6c15dde90bf3","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-10-24T07:25:35.655053973Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-077582be-0745-4dfe-b099-c6258534d7d1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1601826b94c540a8ad2110be3288a4f6
X-Correlation-Id: qa-077582be-0745-4dfe-b099-c6258534d7d1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 70 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-077582be-0745-4dfe-b099-c6258534d7d1
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
Location: /v1/credits/purchases/pur_d4f38e9f-bd3f-4fbd-b7e0-7167ad90bb4f
Content-Length: 144

{"id":"pur_d4f38e9f-bd3f-4fbd-b7e0-7167ad90bb4f","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-10-24T07:25:35.647875465Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b154770f-caa8-4e6b-848e-eef5899d8c41

--- request headers ---
Accept: application/json
Idempotency-Key: qa-485c6b40aa4949429b016babbad864d0
X-Correlation-Id: qa-b154770f-caa8-4e6b-848e-eef5899d8c41
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 63 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b154770f-caa8-4e6b-848e-eef5899d8c41
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
Location: /v1/credits/purchases/pur_d09420bb-38d7-4a67-963b-eca08ba7efdd
Content-Length: 144

{"id":"pur_d09420bb-38d7-4a67-963b-eca08ba7efdd","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-10-24T07:25:35.654646467Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ca92abe8-2961-4f45-9c14-fc05db1e56fc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e841593342ef42428e039e4d9f9f86a5
X-Correlation-Id: qa-ca92abe8-2961-4f45-9c14-fc05db1e56fc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 77 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca92abe8-2961-4f45-9c14-fc05db1e56fc
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
Location: /v1/credits/purchases/pur_5e5bb8bb-40e6-4987-becc-9ad3951c76f3
Content-Length: 145

{"id":"pur_5e5bb8bb-40e6-4987-becc-9ad3951c76f3","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-10-24T07:25:35.658012353Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3313e720-941c-4f53-913c-82023a108598

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2e3c47773b664f1c9444c515b761b7eb
X-Correlation-Id: qa-3313e720-941c-4f53-913c-82023a108598
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 65 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3313e720-941c-4f53-913c-82023a108598
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
Location: /v1/credits/purchases/pur_4914438f-b6a2-4416-b20a-3774e65db3ef
Content-Length: 144

{"id":"pur_4914438f-b6a2-4416-b20a-3774e65db3ef","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-10-24T07:25:35.644955793Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-398cf86c-eab6-43ea-ae6a-080f430cbb41

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c53aad49345044c8993bd13c2f3a4f4b
X-Correlation-Id: qa-398cf86c-eab6-43ea-ae6a-080f430cbb41
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 64 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-398cf86c-eab6-43ea-ae6a-080f430cbb41
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
Location: /v1/credits/purchases/pur_e058cf28-b428-44f7-a89e-88088db1590c
Content-Length: 144

{"id":"pur_e058cf28-b428-44f7-a89e-88088db1590c","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-10-24T07:25:35.649090887Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-05a41dc3-b912-466e-9d80-5d2ce78a0a85

--- request headers ---
Accept: application/json
Idempotency-Key: qa-479714b393b847678020dc1a069920ab
X-Correlation-Id: qa-05a41dc3-b912-466e-9d80-5d2ce78a0a85
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 75 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-05a41dc3-b912-466e-9d80-5d2ce78a0a85
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
Location: /v1/credits/purchases/pur_5b3aa093-24ef-4f22-a0cb-af0a99e39b97
Content-Length: 144

{"id":"pur_5b3aa093-24ef-4f22-a0cb-af0a99e39b97","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-10-24T07:25:35.653012194Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9df1dcf2-377f-41d6-8d1e-17e3f40dbc4c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-829f946b553944b596fd21eeda1386e9
X-Correlation-Id: qa-9df1dcf2-377f-41d6-8d1e-17e3f40dbc4c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 70 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9df1dcf2-377f-41d6-8d1e-17e3f40dbc4c
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
Location: /v1/credits/purchases/pur_0c4f34a6-e34c-474e-94c1-7e82e71f8bc8
Content-Length: 144

{"id":"pur_0c4f34a6-e34c-474e-94c1-7e82e71f8bc8","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:35.644741258Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-17bfa090-d37c-4f42-ace9-c559c885b0b1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c5221c18a2e64151831e8a0487714e15
X-Correlation-Id: qa-17bfa090-d37c-4f42-ace9-c559c885b0b1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 96 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-17bfa090-d37c-4f42-ace9-c559c885b0b1
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
Location: /v1/credits/purchases/pur_9fdf65c2-7569-4cc7-825b-d11918ff94cb
Content-Length: 144

{"id":"pur_9fdf65c2-7569-4cc7-825b-d11918ff94cb","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-10-24T07:25:35.645172318Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-48b93fc6-47e4-420f-a976-b1198061098c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48b93fc6-47e4-420f-a976-b1198061098c
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-48b93fc6-47e4-420f-a976-b1198061098c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe55962-d9af-4145-97a9-272f40857b0c"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-86c348a7-8a40-41d4-9872-5794d9235d37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86c348a7-8a40-41d4-9872-5794d9235d37
Content-Type: application/json

--- response: 200 in 68 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-86c348a7-8a40-41d4-9872-5794d9235d37
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
Content-Length: 759

{"items":[{"id":"led_ca15cef8-af2b-4fb0-b82e-470b30c0d8b6","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-24T07:25:34.846101030Z"},{"id":"led_54312549-edbb-4f32-8b4a-df738e96d0d3","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_0c4f34a6-e34c-474e-94c1-7e82e71f8bc8","createdAt":"2026-10-24T07:25:35.644741258Z"},{"id":"led_c5ba9471-a316-4aaa-863b-43146453afae","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_4914438f-b6a2-4416-b20a-3774e65db3ef","createdAt":"2026-10-24T07:25:35.644955793Z"},{"id":"led_e3fd7dde-6a4d-4c16-b89b-62f2844cacd3","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_2f2dc37c-b86e-40b1-a3e7-800e28b1be98","createdAt":"2026-10-24T07:25:35.644744211Z"},{"id":"led_132ea8a7-f245-40aa-b3ca-37ee4800fa5d","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_9fdf65c2-7569-4cc7-825b-d11918ff94cb","createdAt":"2026-10-24T07:25:35.645172318Z"},{"id":"led_9e880668-516c-4c7b-be67-86ce7282e38e","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_d4f38e9f-bd3f-4fbd-b7e0-7167ad90bb4f","createdAt":"2026-10-24T07:25:35.647875465Z"},{"id":"led_b7d54079-eb49-48a2-b780-45293a563f6d","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_e058cf28-b428-44f7-a89e-88088db1590c","createdAt":"2026-10-24T07:25:35.649090887Z"},{"id":"led_69e642d2-6e95-4d73-9d1e-bf8b6b901141","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_5b3aa093-24ef-4f22-a0cb-af0a99e39b97","createdAt":"2026-10-24T07:25:35.653012194Z"},{"id":"led_073fadb4-e860-45cf-a973-4cf3bcee3a2c","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_d09420bb-38d7-4a67-963b-eca08ba7efdd","createdAt":"2026-10-24T07:25:35.654646467Z"},{"id":"led_9e3dad51-93d9-4872-b94b-39f829825d11","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_46f46bf8-4aca-4a4e-bf54-6c15dde90bf3","createdAt":"2026-10-24T07:25:35.655053973Z"},{"id":"led_aa1e25bc-1415-4007-bb54-a1ebe8512359","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_5e5bb8bb-40e6-4987-becc-9ad3951c76f3","createdAt":"2026-10-24T07:25:35.658012353Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6796db8c-3996-47e7-95b4-9463903bc506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6796db8c-3996-47e7-95b4-9463903bc506
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6796db8c-3996-47e7-95b4-9463903bc506
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
correlation: qa-d64ab0b0-04d5-4932-b2c3-b62ff540cde0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d64ab0b0-04d5-4932-b2c3-b62ff540cde0
Content-Type: application/json

--- request body ---
{"handle":"qa-a109de1aa556","password":"****"}

--- response: 401 in 38 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d64ab0b0-04d5-4932-b2c3-b62ff540cde0
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d64ab0b0-04d5-4932-b2c3-b62ff540cde0"}
```
