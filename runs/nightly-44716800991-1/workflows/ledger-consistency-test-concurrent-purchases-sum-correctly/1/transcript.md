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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-57185eee-5a4d-42f8-b2e5-a83c5398e767` |
| 8 | `POST /v1/auth/token` | 200 | 65 | `qa-643f9181-d630-4578-bf57-548f9893b17f` |
| 5 | `POST /v1/auth/token` | 200 | 73 | `qa-7b7e9404-c24e-42af-a198-56e3c00e5bd1` |
| 10 | `POST /v1/auth/token` | 200 | 59 | `qa-fae06577-6412-494b-9226-e79d0c8acc71` |
| 9 | `POST /v1/auth/token` | 200 | 68 | `qa-6ef7d931-a2c9-46ae-8ffd-66be321903ed` |
| 11 | `POST /v1/auth/token` | 200 | 57 | `qa-9cca4a63-adb4-4c2b-ad2f-349c9771eddb` |
| 6 | `POST /v1/auth/token` | 200 | 78 | `qa-0db78ce4-402a-4a6d-97cf-cbd279693909` |
| 3 | `POST /v1/auth/token` | 200 | 92 | `qa-42665a9d-21f8-4f90-b22e-85ddd5d7becc` |
| 4 | `POST /v1/auth/token` | 200 | 90 | `qa-333d5f49-9bef-4ae3-9fde-e8bf8df63df6` |
| 7 | `POST /v1/auth/token` | 200 | 84 | `qa-759398b1-4199-4721-863a-86865e09bc7f` |
| 2 | `POST /v1/auth/token` | 200 | 103 | `qa-0985d052-8231-4e6b-ac26-d622ea208ed2` |
| 14 | `POST /v1/credits/purchases` | 201 | 30 | `qa-e3792188-a2e4-42af-be19-3dc55ba1505a` |
| 12 | `POST /v1/credits/purchases` | 201 | 37 | `qa-7a4dc824-9dae-48ba-a8f2-43475ee56f54` |
| 15 | `POST /v1/credits/purchases` | 201 | 32 | `qa-a4fb6fa1-498f-4b4a-94ce-9d91d9543340` |
| 13 | `POST /v1/credits/purchases` | 201 | 35 | `qa-746ad8b0-ad9b-417e-bdc1-08afb0263eb1` |
| 18 | `POST /v1/credits/purchases` | 201 | 21 | `qa-1fe6cdde-9dd4-4b27-8111-b548462dffee` |
| 16 | `POST /v1/credits/purchases` | 201 | 34 | `qa-fd187c00-3d1c-482e-8711-942bdbe517b1` |
| 17 | `POST /v1/credits/purchases` | 201 | 32 | `qa-3166fead-197c-41d3-acfc-57c27877372c` |
| 20 | `POST /v1/credits/purchases` | 201 | 30 | `qa-b28cb6a6-ce07-4c62-bf0d-40b2a8c48572` |
| 19 | `POST /v1/credits/purchases` | 201 | 34 | `qa-f8d5f9b1-b661-439b-aa72-bedd90527856` |
| 21 | `POST /v1/credits/purchases` | 201 | 27 | `qa-ea4fd772-276b-492b-bbe6-d56e2e0552c5` |
| 22 | `POST /v1/auth/token` | 200 | 30 | `qa-c8ca8f50-5de0-4e34-a173-c552acef0b21` |
| 23 | `GET /v1/credits/ledger` | 200 | 18 | `qa-191e953c-420c-4b2e-85d8-b86021006400` |
| 24 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-aa17d0c2-22c7-4a87-bad6-ae2a7469f843` |
| 25 | `POST /v1/auth/token` | 401 | 11 | `qa-10fe8b4a-457b-4b77-85b6-ac959454688d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-57185eee-5a4d-42f8-b2e5-a83c5398e767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57185eee-5a4d-42f8-b2e5-a83c5398e767
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","displayName":"QA 70ffc6bc2bd4","password":"****","region":"us"}

--- response: 201 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-57185eee-5a4d-42f8-b2e5-a83c5398e767
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
Location: /v1/accounts/qa-70ffc6bc2bd4
X-Served-Region: us
Content-Length: 181

{"id":"acc_139105f3-b589-4efb-a571-38e12bccb814","handle":"qa-70ffc6bc2bd4","displayName":"QA 70ffc6bc2bd4","region":"us","role":"user","createdAt":"2026-11-20T10:10:03.321383999Z"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-643f9181-d630-4578-bf57-548f9893b17f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-643f9181-d630-4578-bf57-548f9893b17f
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 65 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-643f9181-d630-4578-bf57-548f9893b17f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7b7e9404-c24e-42af-a198-56e3c00e5bd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b7e9404-c24e-42af-a198-56e3c00e5bd1
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 73 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b7e9404-c24e-42af-a198-56e3c00e5bd1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-fae06577-6412-494b-9226-e79d0c8acc71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fae06577-6412-494b-9226-e79d0c8acc71
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 59 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fae06577-6412-494b-9226-e79d0c8acc71
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-6ef7d931-a2c9-46ae-8ffd-66be321903ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ef7d931-a2c9-46ae-8ffd-66be321903ed
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 68 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ef7d931-a2c9-46ae-8ffd-66be321903ed
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-9cca4a63-adb4-4c2b-ad2f-349c9771eddb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cca4a63-adb4-4c2b-ad2f-349c9771eddb
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 57 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cca4a63-adb4-4c2b-ad2f-349c9771eddb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0db78ce4-402a-4a6d-97cf-cbd279693909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0db78ce4-402a-4a6d-97cf-cbd279693909
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 78 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0db78ce4-402a-4a6d-97cf-cbd279693909
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-42665a9d-21f8-4f90-b22e-85ddd5d7becc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42665a9d-21f8-4f90-b22e-85ddd5d7becc
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 92 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-42665a9d-21f8-4f90-b22e-85ddd5d7becc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-333d5f49-9bef-4ae3-9fde-e8bf8df63df6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-333d5f49-9bef-4ae3-9fde-e8bf8df63df6
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 90 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-333d5f49-9bef-4ae3-9fde-e8bf8df63df6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-759398b1-4199-4721-863a-86865e09bc7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-759398b1-4199-4721-863a-86865e09bc7f
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 84 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-759398b1-4199-4721-863a-86865e09bc7f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0985d052-8231-4e6b-ac26-d622ea208ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0985d052-8231-4e6b-ac26-d622ea208ed2
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 103 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0985d052-8231-4e6b-ac26-d622ea208ed2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e3792188-a2e4-42af-be19-3dc55ba1505a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f9bdea54d1a74f1eac434cac6e68a3cd
X-Correlation-Id: qa-e3792188-a2e4-42af-be19-3dc55ba1505a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3792188-a2e4-42af-be19-3dc55ba1505a
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
Location: /v1/credits/purchases/pur_83c0a7c6-b8c3-48fc-ab0d-4538aa1c689e
Content-Length: 144

{"id":"pur_83c0a7c6-b8c3-48fc-ab0d-4538aa1c689e","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-20T10:10:03.479088533Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7a4dc824-9dae-48ba-a8f2-43475ee56f54

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bd183f8fea5940b4b0bab7b87e21a7f2
X-Correlation-Id: qa-7a4dc824-9dae-48ba-a8f2-43475ee56f54
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a4dc824-9dae-48ba-a8f2-43475ee56f54
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
Location: /v1/credits/purchases/pur_1dc012cd-ba68-4d78-9828-fd5bc9d46525
Content-Length: 144

{"id":"pur_1dc012cd-ba68-4d78-9828-fd5bc9d46525","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-20T10:10:03.471340646Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a4fb6fa1-498f-4b4a-94ce-9d91d9543340

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7589fbfe60094feab6248195f187c623
X-Correlation-Id: qa-a4fb6fa1-498f-4b4a-94ce-9d91d9543340
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4fb6fa1-498f-4b4a-94ce-9d91d9543340
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
Location: /v1/credits/purchases/pur_b7d136cc-60bb-4f1d-adb0-b20c699b447a
Content-Length: 144

{"id":"pur_b7d136cc-60bb-4f1d-adb0-b20c699b447a","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-20T10:10:03.481385441Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-746ad8b0-ad9b-417e-bdc1-08afb0263eb1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-52759d1b1a3a4ca59144a1d65b83dc83
X-Correlation-Id: qa-746ad8b0-ad9b-417e-bdc1-08afb0263eb1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-746ad8b0-ad9b-417e-bdc1-08afb0263eb1
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
Location: /v1/credits/purchases/pur_0527ccb9-6dd0-4f1c-902d-29285da6f75b
Content-Length: 144

{"id":"pur_0527ccb9-6dd0-4f1c-902d-29285da6f75b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:03.467524185Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1fe6cdde-9dd4-4b27-8111-b548462dffee

--- request headers ---
Accept: application/json
Idempotency-Key: qa-af45eab9927b4861b32c4e7d03e69bf6
X-Correlation-Id: qa-1fe6cdde-9dd4-4b27-8111-b548462dffee
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fe6cdde-9dd4-4b27-8111-b548462dffee
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
Location: /v1/credits/purchases/pur_6e555cfc-87c6-442d-ba0b-df704eafba9f
Content-Length: 144

{"id":"pur_6e555cfc-87c6-442d-ba0b-df704eafba9f","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-20T10:10:03.474496215Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fd187c00-3d1c-482e-8711-942bdbe517b1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a19fe691340f469e91385006e5dfaaf5
X-Correlation-Id: qa-fd187c00-3d1c-482e-8711-942bdbe517b1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd187c00-3d1c-482e-8711-942bdbe517b1
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
Location: /v1/credits/purchases/pur_d8fb5dc6-3411-48c2-a87d-cd13dee72c72
Content-Length: 144

{"id":"pur_d8fb5dc6-3411-48c2-a87d-cd13dee72c72","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-20T10:10:03.469972806Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3166fead-197c-41d3-acfc-57c27877372c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ae6bfe4730c64ecca5d7bb26e7ab0b0e
X-Correlation-Id: qa-3166fead-197c-41d3-acfc-57c27877372c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3166fead-197c-41d3-acfc-57c27877372c
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
Location: /v1/credits/purchases/pur_285d7ae1-933d-4ef3-a006-a68c6aaf0cf1
Content-Length: 144

{"id":"pur_285d7ae1-933d-4ef3-a006-a68c6aaf0cf1","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-20T10:10:03.484109933Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b28cb6a6-ce07-4c62-bf0d-40b2a8c48572

--- request headers ---
Accept: application/json
Idempotency-Key: qa-02e2337de52b46ba87555bdd6c23d17b
X-Correlation-Id: qa-b28cb6a6-ce07-4c62-bf0d-40b2a8c48572
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b28cb6a6-ce07-4c62-bf0d-40b2a8c48572
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
Location: /v1/credits/purchases/pur_c4094c61-cc49-4099-818e-7da77fd217c8
Content-Length: 144

{"id":"pur_c4094c61-cc49-4099-818e-7da77fd217c8","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-20T10:10:03.490023035Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f8d5f9b1-b661-439b-aa72-bedd90527856

--- request headers ---
Accept: application/json
Idempotency-Key: qa-107b5c8b8e4747d3924312a9a0da93e0
X-Correlation-Id: qa-f8d5f9b1-b661-439b-aa72-bedd90527856
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8d5f9b1-b661-439b-aa72-bedd90527856
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
Location: /v1/credits/purchases/pur_57aaad25-65de-4623-b015-ac1a759d8134
Content-Length: 144

{"id":"pur_57aaad25-65de-4623-b015-ac1a759d8134","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-20T10:10:03.494620520Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ea4fd772-276b-492b-bbe6-d56e2e0552c5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8cf8aaa8a2a14c7aa806ec414f618275
X-Correlation-Id: qa-ea4fd772-276b-492b-bbe6-d56e2e0552c5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea4fd772-276b-492b-bbe6-d56e2e0552c5
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
Location: /v1/credits/purchases/pur_26af3603-00e8-438f-a763-fc9139847721
Content-Length: 145

{"id":"pur_26af3603-00e8-438f-a763-fc9139847721","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-20T10:10:03.496086630Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-c8ca8f50-5de0-4e34-a173-c552acef0b21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8ca8f50-5de0-4e34-a173-c552acef0b21
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8ca8f50-5de0-4e34-a173-c552acef0b21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_139105f3-b589-4efb-a571-38e12bccb814"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-191e953c-420c-4b2e-85d8-b86021006400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-191e953c-420c-4b2e-85d8-b86021006400
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-191e953c-420c-4b2e-85d8-b86021006400
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
Content-Length: 767

{"items":[{"id":"led_c72161ce-41cf-448c-a647-63061d69d0b0","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-20T10:10:03.321395150Z"},{"id":"led_adc43ed4-e662-46b7-bd6e-584bd2675bb7","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_0527ccb9-6dd0-4f1c-902d-29285da6f75b","createdAt":"2026-11-20T10:10:03.467524185Z"},{"id":"led_11a1bd72-82b1-4f47-98f7-bff60712baf0","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_d8fb5dc6-3411-48c2-a87d-cd13dee72c72","createdAt":"2026-11-20T10:10:03.469972806Z"},{"id":"led_2937cbc3-7de7-49ff-9204-41d2e8cdf431","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_1dc012cd-ba68-4d78-9828-fd5bc9d46525","createdAt":"2026-11-20T10:10:03.471340646Z"},{"id":"led_78aed5da-b2d1-47e1-8874-5fdcde96d67c","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_6e555cfc-87c6-442d-ba0b-df704eafba9f","createdAt":"2026-11-20T10:10:03.474496215Z"},{"id":"led_2857b1b8-ee46-4d09-9d73-baab82976b9f","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_83c0a7c6-b8c3-48fc-ab0d-4538aa1c689e","createdAt":"2026-11-20T10:10:03.479088533Z"},{"id":"led_198272a1-17f8-40fa-ab41-2f5268a1f625","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_b7d136cc-60bb-4f1d-adb0-b20c699b447a","createdAt":"2026-11-20T10:10:03.481385441Z"},{"id":"led_ffa6ac49-85ba-4082-9829-37bf29e1fe16","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_285d7ae1-933d-4ef3-a006-a68c6aaf0cf1","createdAt":"2026-11-20T10:10:03.484109933Z"},{"id":"led_adeaf896-ed7b-4115-b8c2-fe4cb57e30a7","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_c4094c61-cc49-4099-818e-7da77fd217c8","createdAt":"2026-11-20T10:10:03.490023035Z"},{"id":"led_0e3b5695-237c-48a8-a230-24c43ee9dd74","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_57aaad25-65de-4623-b015-ac1a759d8134","createdAt":"2026-11-20T10:10:03.494620520Z"},{"id":"led_fbbe6017-184f-4eb3-864a-db7a56af821a","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_26af3603-00e8-438f-a763-fc9139847721","createdAt":"2026-11-20T10:10:03.496086630Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa17d0c2-22c7-4a87-bad6-ae2a7469f843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa17d0c2-22c7-4a87-bad6-ae2a7469f843
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa17d0c2-22c7-4a87-bad6-ae2a7469f843
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
correlation: qa-10fe8b4a-457b-4b77-85b6-ac959454688d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10fe8b4a-457b-4b77-85b6-ac959454688d
Content-Type: application/json

--- request body ---
{"handle":"qa-70ffc6bc2bd4","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10fe8b4a-457b-4b77-85b6-ac959454688d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10fe8b4a-457b-4b77-85b6-ac959454688d"}
```
