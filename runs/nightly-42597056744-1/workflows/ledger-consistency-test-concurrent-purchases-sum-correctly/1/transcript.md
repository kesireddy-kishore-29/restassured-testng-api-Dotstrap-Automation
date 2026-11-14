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
| 1 | `POST /v1/accounts` | 201 | 397 | `qa-7c6cae62-8d96-4c16-9866-960ba3146ebe` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-f05304d8-2924-4f26-a4e4-da06e594bd7d` |
| 6 | `POST /v1/auth/token` | 200 | 79 | `qa-dabcc0df-918c-4863-a598-3f9914522a51` |
| 7 | `POST /v1/auth/token` | 200 | 78 | `qa-bddf86c2-a4a4-49f9-b65a-38e4921661a7` |
| 5 | `POST /v1/auth/token` | 200 | 83 | `qa-d3e42600-654c-40cc-9a81-212a2e28ffdf` |
| 4 | `POST /v1/auth/token` | 200 | 90 | `qa-08afde82-2626-4430-a117-015602b7fe87` |
| 9 | `POST /v1/auth/token` | 200 | 79 | `qa-70a22746-04ab-4bc1-9501-af696ec08f92` |
| 3 | `POST /v1/auth/token` | 200 | 95 | `qa-f80c80b3-b115-4cf3-b6a4-4b8c2cc86c0e` |
| 11 | `POST /v1/auth/token` | 200 | 85 | `qa-3242997b-cc82-4016-8103-fefdff86839c` |
| 10 | `POST /v1/auth/token` | 200 | 80 | `qa-7445aaab-104c-4e5b-83e4-5df37603f767` |
| 8 | `POST /v1/auth/token` | 200 | 99 | `qa-f7793eab-67c4-468e-8dac-ab5d22558d78` |
| 14 | `POST /v1/credits/purchases` | 201 | 51 | `qa-c4d668d5-8d4d-4cff-99a1-36703f9ebb60` |
| 15 | `POST /v1/credits/purchases` | 201 | 42 | `qa-e33df27c-7846-4fc0-b1b0-09f10cdf71ac` |
| 17 | `POST /v1/credits/purchases` | 201 | 39 | `qa-4932f400-7fd1-4f0d-80af-89fd9eee9ef7` |
| 13 | `POST /v1/credits/purchases` | 201 | 58 | `qa-643bc57b-efbe-424b-8872-da3d48aa6bf7` |
| 18 | `POST /v1/credits/purchases` | 201 | 40 | `qa-58489edf-2917-4744-ad0b-f5f7bc275be5` |
| 12 | `POST /v1/credits/purchases` | 201 | 53 | `qa-d561a76a-7057-401e-a9e1-38ef037ae31d` |
| 21 | `POST /v1/credits/purchases` | 201 | 36 | `qa-6b9a566a-24cb-4410-a8f2-f920d88dd953` |
| 16 | `POST /v1/credits/purchases` | 201 | 51 | `qa-44b22cb0-d396-422c-8211-5e887c68b36e` |
| 19 | `POST /v1/credits/purchases` | 201 | 46 | `qa-767b920f-46d2-4dfe-9d70-7855d9662ec3` |
| 20 | `POST /v1/credits/purchases` | 201 | 54 | `qa-6ae983d0-e244-407d-9672-a9165f304258` |
| 22 | `POST /v1/auth/token` | 200 | 24 | `qa-50a0bbd7-259d-4cd4-96e8-e46736cbdc06` |
| 23 | `GET /v1/credits/ledger` | 200 | 98 | `qa-eef243af-656a-42a5-b0aa-a0ce92e66e28` |
| 24 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-4c665e23-d7bf-4ab7-99d5-27b0aaaa1bd0` |
| 25 | `POST /v1/auth/token` | 401 | 27 | `qa-a22fb05e-ea43-4942-85c4-d90dfd8b22c5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7c6cae62-8d96-4c16-9866-960ba3146ebe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c6cae62-8d96-4c16-9866-960ba3146ebe
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","displayName":"QA 61c8308ba083","password":"****","region":"us"}

--- response: 201 in 397 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c6cae62-8d96-4c16-9866-960ba3146ebe
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
Location: /v1/accounts/qa-61c8308ba083
X-Served-Region: us
Content-Length: 181

{"id":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669","handle":"qa-61c8308ba083","displayName":"QA 61c8308ba083","region":"us","role":"user","createdAt":"2026-11-09T09:55:59.447014470Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f05304d8-2924-4f26-a4e4-da06e594bd7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f05304d8-2924-4f26-a4e4-da06e594bd7d
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 81 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f05304d8-2924-4f26-a4e4-da06e594bd7d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dabcc0df-918c-4863-a598-3f9914522a51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dabcc0df-918c-4863-a598-3f9914522a51
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 79 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dabcc0df-918c-4863-a598-3f9914522a51
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-bddf86c2-a4a4-49f9-b65a-38e4921661a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bddf86c2-a4a4-49f9-b65a-38e4921661a7
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 78 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bddf86c2-a4a4-49f9-b65a-38e4921661a7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d3e42600-654c-40cc-9a81-212a2e28ffdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3e42600-654c-40cc-9a81-212a2e28ffdf
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 83 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3e42600-654c-40cc-9a81-212a2e28ffdf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-08afde82-2626-4430-a117-015602b7fe87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08afde82-2626-4430-a117-015602b7fe87
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 90 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-08afde82-2626-4430-a117-015602b7fe87
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-70a22746-04ab-4bc1-9501-af696ec08f92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a22746-04ab-4bc1-9501-af696ec08f92
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 79 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-70a22746-04ab-4bc1-9501-af696ec08f92
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f80c80b3-b115-4cf3-b6a4-4b8c2cc86c0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f80c80b3-b115-4cf3-b6a4-4b8c2cc86c0e
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 95 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f80c80b3-b115-4cf3-b6a4-4b8c2cc86c0e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-3242997b-cc82-4016-8103-fefdff86839c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3242997b-cc82-4016-8103-fefdff86839c
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 85 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3242997b-cc82-4016-8103-fefdff86839c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7445aaab-104c-4e5b-83e4-5df37603f767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7445aaab-104c-4e5b-83e4-5df37603f767
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 80 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7445aaab-104c-4e5b-83e4-5df37603f767
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-f7793eab-67c4-468e-8dac-ab5d22558d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7793eab-67c4-468e-8dac-ab5d22558d78
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 99 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7793eab-67c4-468e-8dac-ab5d22558d78
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c4d668d5-8d4d-4cff-99a1-36703f9ebb60

--- request headers ---
Accept: application/json
Idempotency-Key: qa-38127f0217e048d0961751a71a01a31c
X-Correlation-Id: qa-c4d668d5-8d4d-4cff-99a1-36703f9ebb60
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4d668d5-8d4d-4cff-99a1-36703f9ebb60
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
Location: /v1/credits/purchases/pur_6da3efce-bef8-4a77-8bfa-5a8d57cc96d9
Content-Length: 144

{"id":"pur_6da3efce-bef8-4a77-8bfa-5a8d57cc96d9","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-09T09:56:00.048217336Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e33df27c-7846-4fc0-b1b0-09f10cdf71ac

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8ac021c46402441bac137276ec25326b
X-Correlation-Id: qa-e33df27c-7846-4fc0-b1b0-09f10cdf71ac
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 42 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e33df27c-7846-4fc0-b1b0-09f10cdf71ac
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
Location: /v1/credits/purchases/pur_c1e40958-c460-49aa-b817-b53174b95d5d
Content-Length: 144

{"id":"pur_c1e40958-c460-49aa-b817-b53174b95d5d","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-09T09:56:00.049003915Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4932f400-7fd1-4f0d-80af-89fd9eee9ef7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b15f0c9f7d944eb7b6f39fe3c32dd98e
X-Correlation-Id: qa-4932f400-7fd1-4f0d-80af-89fd9eee9ef7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 39 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-4932f400-7fd1-4f0d-80af-89fd9eee9ef7
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
Location: /v1/credits/purchases/pur_deda1627-7bf6-4d09-aba4-439dfeb16cd4
Content-Length: 144

{"id":"pur_deda1627-7bf6-4d09-aba4-439dfeb16cd4","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-09T09:56:00.042554652Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-643bc57b-efbe-424b-8872-da3d48aa6bf7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0b86d3957a0341b592df926c8b3c0593
X-Correlation-Id: qa-643bc57b-efbe-424b-8872-da3d48aa6bf7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-643bc57b-efbe-424b-8872-da3d48aa6bf7
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
Location: /v1/credits/purchases/pur_11bb9931-ddc6-4952-bb67-0f0482e7df95
Content-Length: 144

{"id":"pur_11bb9931-ddc6-4952-bb67-0f0482e7df95","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-09T09:56:00.042801299Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-58489edf-2917-4744-ad0b-f5f7bc275be5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-56f2f1ee14e2415f94b696ede12e909b
X-Correlation-Id: qa-58489edf-2917-4744-ad0b-f5f7bc275be5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 40 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-58489edf-2917-4744-ad0b-f5f7bc275be5
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
Location: /v1/credits/purchases/pur_7b600743-ef13-4c28-8cd1-d35427baaf49
Content-Length: 144

{"id":"pur_7b600743-ef13-4c28-8cd1-d35427baaf49","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-09T09:56:00.045315865Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d561a76a-7057-401e-a9e1-38ef037ae31d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-45a96e44950b43ccb2ba103f639aa6d3
X-Correlation-Id: qa-d561a76a-7057-401e-a9e1-38ef037ae31d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d561a76a-7057-401e-a9e1-38ef037ae31d
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
Location: /v1/credits/purchases/pur_08e5508a-b9d4-4b4c-b285-d6b88328e331
Content-Length: 144

{"id":"pur_08e5508a-b9d4-4b4c-b285-d6b88328e331","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:56:00.041124417Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6b9a566a-24cb-4410-a8f2-f920d88dd953

--- request headers ---
Accept: application/json
Idempotency-Key: qa-26069bbb690e402da9e3bdeacff4eefe
X-Correlation-Id: qa-6b9a566a-24cb-4410-a8f2-f920d88dd953
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b9a566a-24cb-4410-a8f2-f920d88dd953
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
Location: /v1/credits/purchases/pur_e37148ee-bc9d-4837-a88b-302b30fd5afc
Content-Length: 144

{"id":"pur_e37148ee-bc9d-4837-a88b-302b30fd5afc","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-09T09:56:00.059469966Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-44b22cb0-d396-422c-8211-5e887c68b36e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-396b462a6a674b0798060281b9a11fd6
X-Correlation-Id: qa-44b22cb0-d396-422c-8211-5e887c68b36e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-44b22cb0-d396-422c-8211-5e887c68b36e
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
Location: /v1/credits/purchases/pur_948fb0ad-f1fa-4635-b70e-a79c5045a5ec
Content-Length: 144

{"id":"pur_948fb0ad-f1fa-4635-b70e-a79c5045a5ec","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-09T09:56:00.052979252Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-767b920f-46d2-4dfe-9d70-7855d9662ec3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5627d6596c7e45dab8bcf346297d390d
X-Correlation-Id: qa-767b920f-46d2-4dfe-9d70-7855d9662ec3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 46 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-767b920f-46d2-4dfe-9d70-7855d9662ec3
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
Location: /v1/credits/purchases/pur_a5a9eae7-8b97-482e-824a-be1b8c990b51
Content-Length: 144

{"id":"pur_a5a9eae7-8b97-482e-824a-be1b8c990b51","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-09T09:56:00.054165203Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6ae983d0-e244-407d-9672-a9165f304258

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a7aabacc19084767902874a2ea316442
X-Correlation-Id: qa-6ae983d0-e244-407d-9672-a9165f304258
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ae983d0-e244-407d-9672-a9165f304258
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
Location: /v1/credits/purchases/pur_7776b2a2-8e66-48f3-8e96-f26a358e1787
Content-Length: 145

{"id":"pur_7776b2a2-8e66-48f3-8e96-f26a358e1787","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-09T09:56:00.073200326Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-50a0bbd7-259d-4cd4-96e8-e46736cbdc06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50a0bbd7-259d-4cd4-96e8-e46736cbdc06
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-50a0bbd7-259d-4cd4-96e8-e46736cbdc06
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c289d3bb-a676-45bc-9c08-2c0610af5669"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-eef243af-656a-42a5-b0aa-a0ce92e66e28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eef243af-656a-42a5-b0aa-a0ce92e66e28
Content-Type: application/json

--- response: 200 in 98 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-eef243af-656a-42a5-b0aa-a0ce92e66e28
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
Content-Length: 765

{"items":[{"id":"led_3789d4b4-cb3b-4c18-b406-7af6588ace2b","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-09T09:55:59.447138134Z"},{"id":"led_9c873fde-7037-485e-9bd5-21017f78d8fe","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_08e5508a-b9d4-4b4c-b285-d6b88328e331","createdAt":"2026-11-09T09:56:00.041124417Z"},{"id":"led_79dc1237-c298-4141-ad59-d77cf45c7b9b","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_deda1627-7bf6-4d09-aba4-439dfeb16cd4","createdAt":"2026-11-09T09:56:00.042554652Z"},{"id":"led_007370d5-0643-459f-8646-cb14391f55d5","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_11bb9931-ddc6-4952-bb67-0f0482e7df95","createdAt":"2026-11-09T09:56:00.042801299Z"},{"id":"led_603f8cf5-61ff-408a-b534-c46309c34f35","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_7b600743-ef13-4c28-8cd1-d35427baaf49","createdAt":"2026-11-09T09:56:00.045315865Z"},{"id":"led_1c16dc3b-ab3d-4295-bfc6-8283d3a5d8c0","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_6da3efce-bef8-4a77-8bfa-5a8d57cc96d9","createdAt":"2026-11-09T09:56:00.048217336Z"},{"id":"led_193109f9-3fcf-49b4-b74c-daada72a2d29","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_c1e40958-c460-49aa-b817-b53174b95d5d","createdAt":"2026-11-09T09:56:00.049003915Z"},{"id":"led_c3de7ea6-44c4-471d-aaab-3645b1a08042","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_948fb0ad-f1fa-4635-b70e-a79c5045a5ec","createdAt":"2026-11-09T09:56:00.052979252Z"},{"id":"led_b116f673-ef7f-48f4-91f2-7a2f35dc1239","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_a5a9eae7-8b97-482e-824a-be1b8c990b51","createdAt":"2026-11-09T09:56:00.054165203Z"},{"id":"led_15b72274-b7c3-4828-89b6-3fb6f6969ed1","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_e37148ee-bc9d-4837-a88b-302b30fd5afc","createdAt":"2026-11-09T09:56:00.059469966Z"},{"id":"led_4f771d2e-8d8d-49ca-b94b-d64e7529b91a","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_7776b2a2-8e66-48f3-8e96-f26a358e1787","createdAt":"2026-11-09T09:56:00.073200326Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c665e23-d7bf-4ab7-99d5-27b0aaaa1bd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c665e23-d7bf-4ab7-99d5-27b0aaaa1bd0
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c665e23-d7bf-4ab7-99d5-27b0aaaa1bd0
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
correlation: qa-a22fb05e-ea43-4942-85c4-d90dfd8b22c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a22fb05e-ea43-4942-85c4-d90dfd8b22c5
Content-Type: application/json

--- request body ---
{"handle":"qa-61c8308ba083","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a22fb05e-ea43-4942-85c4-d90dfd8b22c5
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a22fb05e-ea43-4942-85c4-d90dfd8b22c5"}
```
