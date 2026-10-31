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
| 1 | `POST /v1/accounts` | 201 | 309 | `qa-b1fa6554-d313-4eef-9eab-2f99e908f92b` |
| 4 | `POST /v1/auth/token` | 200 | 34 | `qa-3412cece-fadd-4aa7-81c7-a81e2abcf398` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-d05c4834-ea66-46dc-981d-364612df23db` |
| 5 | `POST /v1/auth/token` | 200 | 35 | `qa-4346c13b-df34-4442-b6b7-cbf2310c9d07` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-5c66e3b6-fbb1-4321-83a7-b06ff75d4149` |
| 7 | `POST /v1/auth/token` | 200 | 34 | `qa-b6f2dacd-0bc8-4d6f-8a3b-53b65057cda7` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-45fb1851-a8d7-4555-997b-85700ae0be74` |
| 10 | `POST /v1/credits/purchases` | 200 | 44 | `qa-57f0c20d-fd96-4e03-b286-49d75f6db45f` |
| 11 | `POST /v1/credits/purchases` | 200 | 43 | `qa-fe733902-7b6e-48ba-b1e3-938dce7def86` |
| 8 | `POST /v1/credits/purchases` | 200 | 56 | `qa-c5e6930c-ab00-44e4-b8c2-ba02660fe535` |
| 12 | `POST /v1/credits/purchases` | 201 | 41 | `qa-8b3dee02-b2e6-439b-a01d-94a5ae14c830` |
| 13 | `POST /v1/credits/purchases` | 200 | 44 | `qa-6a34c49d-d203-4c86-8476-f8799b2921d7` |
| 9 | `POST /v1/credits/purchases` | 200 | 61 | `qa-a632e3d5-0fcb-4b86-84c3-57386214ca40` |
| 14 | `POST /v1/auth/token` | 200 | 9 | `qa-e4893feb-d58a-42cd-bc37-ccd544cb6916` |
| 15 | `GET /v1/credits/balance` | 200 | 10 | `qa-54bf14b1-9a5c-4608-a589-8b4fab9c7ae2` |
| 16 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-28fff35e-8970-4365-a94e-d1ac361b2b24` |
| 17 | `POST /v1/auth/token` | 401 | 7 | `qa-c02a4465-069b-4474-89a3-029e11a7595a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b1fa6554-d313-4eef-9eab-2f99e908f92b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1fa6554-d313-4eef-9eab-2f99e908f92b
Content-Type: application/json

--- request body ---
{"handle":"qa-4cad0fcfcfbe","displayName":"QA 4cad0fcfcfbe","password":"****","region":"eu"}

--- response: 201 in 309 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1fa6554-d313-4eef-9eab-2f99e908f92b
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
Location: /v1/accounts/qa-4cad0fcfcfbe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_034fab8e-dbcc-443a-a1d3-4c2b07f0682c","handle":"qa-4cad0fcfcfbe","displayName":"QA 4cad0fcfcfbe","region":"eu","role":"user","createdAt":"2026-10-31T08:31:29.509040718Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3412cece-fadd-4aa7-81c7-a81e2abcf398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3412cece-fadd-4aa7-81c7-a81e2abcf398
Content-Type: application/json

--- request body ---
{"handle":"qa-4cad0fcfcfbe","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-3412cece-fadd-4aa7-81c7-a81e2abcf398
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034fab8e-dbcc-443a-a1d3-4c2b07f0682c"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d05c4834-ea66-46dc-981d-364612df23db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d05c4834-ea66-46dc-981d-364612df23db
Content-Type: application/json

--- request body ---
{"handle":"qa-4cad0fcfcfbe","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-d05c4834-ea66-46dc-981d-364612df23db
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034fab8e-dbcc-443a-a1d3-4c2b07f0682c"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4346c13b-df34-4442-b6b7-cbf2310c9d07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4346c13b-df34-4442-b6b7-cbf2310c9d07
Content-Type: application/json

--- request body ---
{"handle":"qa-4cad0fcfcfbe","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-4346c13b-df34-4442-b6b7-cbf2310c9d07
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034fab8e-dbcc-443a-a1d3-4c2b07f0682c"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5c66e3b6-fbb1-4321-83a7-b06ff75d4149

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c66e3b6-fbb1-4321-83a7-b06ff75d4149
Content-Type: application/json

--- request body ---
{"handle":"qa-4cad0fcfcfbe","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c66e3b6-fbb1-4321-83a7-b06ff75d4149
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034fab8e-dbcc-443a-a1d3-4c2b07f0682c"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-b6f2dacd-0bc8-4d6f-8a3b-53b65057cda7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6f2dacd-0bc8-4d6f-8a3b-53b65057cda7
Content-Type: application/json

--- request body ---
{"handle":"qa-4cad0fcfcfbe","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6f2dacd-0bc8-4d6f-8a3b-53b65057cda7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034fab8e-dbcc-443a-a1d3-4c2b07f0682c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-45fb1851-a8d7-4555-997b-85700ae0be74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45fb1851-a8d7-4555-997b-85700ae0be74
Content-Type: application/json

--- request body ---
{"handle":"qa-4cad0fcfcfbe","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-45fb1851-a8d7-4555-997b-85700ae0be74
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034fab8e-dbcc-443a-a1d3-4c2b07f0682c"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-57f0c20d-fd96-4e03-b286-49d75f6db45f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1b57e8dda0e74b5bab093b26326e570d
X-Correlation-Id: qa-57f0c20d-fd96-4e03-b286-49d75f6db45f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-57f0c20d-fd96-4e03-b286-49d75f6db45f
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
Location: /v1/credits/purchases/pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:29.954349844Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fe733902-7b6e-48ba-b1e3-938dce7def86

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1b57e8dda0e74b5bab093b26326e570d
X-Correlation-Id: qa-fe733902-7b6e-48ba-b1e3-938dce7def86
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 43 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe733902-7b6e-48ba-b1e3-938dce7def86
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
Location: /v1/credits/purchases/pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:29.954349844Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c5e6930c-ab00-44e4-b8c2-ba02660fe535

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1b57e8dda0e74b5bab093b26326e570d
X-Correlation-Id: qa-c5e6930c-ab00-44e4-b8c2-ba02660fe535
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 56 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5e6930c-ab00-44e4-b8c2-ba02660fe535
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
Location: /v1/credits/purchases/pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:29.954349844Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8b3dee02-b2e6-439b-a01d-94a5ae14c830

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1b57e8dda0e74b5bab093b26326e570d
X-Correlation-Id: qa-8b3dee02-b2e6-439b-a01d-94a5ae14c830
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b3dee02-b2e6-439b-a01d-94a5ae14c830
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
Location: /v1/credits/purchases/pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f
Content-Length: 144

{"id":"pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:29.954349844Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6a34c49d-d203-4c86-8476-f8799b2921d7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1b57e8dda0e74b5bab093b26326e570d
X-Correlation-Id: qa-6a34c49d-d203-4c86-8476-f8799b2921d7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a34c49d-d203-4c86-8476-f8799b2921d7
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
Location: /v1/credits/purchases/pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:29.954349844Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a632e3d5-0fcb-4b86-84c3-57386214ca40

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1b57e8dda0e74b5bab093b26326e570d
X-Correlation-Id: qa-a632e3d5-0fcb-4b86-84c3-57386214ca40
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 61 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-a632e3d5-0fcb-4b86-84c3-57386214ca40
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
Location: /v1/credits/purchases/pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_189be0a2-daf2-4d32-8604-c00ea2b4f02f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:29.954349844Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-e4893feb-d58a-42cd-bc37-ccd544cb6916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4893feb-d58a-42cd-bc37-ccd544cb6916
Content-Type: application/json

--- request body ---
{"handle":"qa-4cad0fcfcfbe","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4893feb-d58a-42cd-bc37-ccd544cb6916
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034fab8e-dbcc-443a-a1d3-4c2b07f0682c"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-54bf14b1-9a5c-4608-a589-8b4fab9c7ae2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54bf14b1-9a5c-4608-a589-8b4fab9c7ae2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-54bf14b1-9a5c-4608-a589-8b4fab9c7ae2
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

{"balance":15,"currency":"credits","accountId":"acc_034fab8e-dbcc-443a-a1d3-4c2b07f0682c"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28fff35e-8970-4365-a94e-d1ac361b2b24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28fff35e-8970-4365-a94e-d1ac361b2b24
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-28fff35e-8970-4365-a94e-d1ac361b2b24
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
correlation: qa-c02a4465-069b-4474-89a3-029e11a7595a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c02a4465-069b-4474-89a3-029e11a7595a
Content-Type: application/json

--- request body ---
{"handle":"qa-4cad0fcfcfbe","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c02a4465-069b-4474-89a3-029e11a7595a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c02a4465-069b-4474-89a3-029e11a7595a"}
```
