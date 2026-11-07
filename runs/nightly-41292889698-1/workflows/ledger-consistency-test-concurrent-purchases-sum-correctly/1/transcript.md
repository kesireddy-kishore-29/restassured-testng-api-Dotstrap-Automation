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
| 1 | `POST /v1/accounts` | 201 | 501 | `qa-55daad49-dffd-41f4-8ef2-3544b77b3657` |
| 5 | `POST /v1/auth/token` | 200 | 96 | `qa-af6da771-46fc-4c73-b3ee-45d4ac648ba6` |
| 8 | `POST /v1/auth/token` | 200 | 91 | `qa-6e1cc43a-9db6-43b2-8cda-cffea2f13c85` |
| 9 | `POST /v1/auth/token` | 200 | 92 | `qa-0b46fa42-5620-43ca-839b-b669012865e0` |
| 3 | `POST /v1/auth/token` | 200 | 107 | `qa-d9d7f834-8fb0-4b19-8327-20a490b51ccc` |
| 6 | `POST /v1/auth/token` | 200 | 99 | `qa-70d0dbfb-51e8-4b32-8803-480eede15124` |
| 10 | `POST /v1/auth/token` | 200 | 91 | `qa-13c12a0b-e4da-4903-ba8c-4aad619bc8ee` |
| 7 | `POST /v1/auth/token` | 200 | 103 | `qa-7baddc73-9991-491c-a843-94ba73ec1ce5` |
| 2 | `POST /v1/auth/token` | 200 | 119 | `qa-f1b1263e-6201-488f-9c53-2a8eaac18be4` |
| 11 | `POST /v1/auth/token` | 200 | 99 | `qa-82cf4845-ef8d-439b-ab6f-9586ed77baed` |
| 4 | `POST /v1/auth/token` | 200 | 124 | `qa-9fa86bf7-fd9a-4e1f-a6cf-ba2c430f85a0` |
| 14 | `POST /v1/credits/purchases` | 201 | 84 | `qa-84c3998e-1cb3-43cf-9edb-11f24473a7b8` |
| 12 | `POST /v1/credits/purchases` | 201 | 94 | `qa-2a145dcd-ba10-422a-b2df-26a48c2c6c0e` |
| 15 | `POST /v1/credits/purchases` | 201 | 89 | `qa-3d566758-fe93-420a-bfb5-16838ab6add8` |
| 19 | `POST /v1/credits/purchases` | 201 | 77 | `qa-45e03d9c-7c66-4948-8037-22fd9130d5d3` |
| 20 | `POST /v1/credits/purchases` | 201 | 74 | `qa-f5b7522b-d5d8-4b0a-bbbf-5f6cbe839f9b` |
| 16 | `POST /v1/credits/purchases` | 201 | 93 | `qa-ca00dbb7-8033-4b9e-8ed9-ac1137060fb6` |
| 13 | `POST /v1/credits/purchases` | 201 | 101 | `qa-ae164d45-5e7d-4f25-b56f-16bbcd12e5a2` |
| 21 | `POST /v1/credits/purchases` | 201 | 59 | `qa-ce670aca-6759-40e4-9d08-6d1880beaf76` |
| 18 | `POST /v1/credits/purchases` | 201 | 87 | `qa-1e88b9e5-5546-4e1a-afda-caecf1f8f8b0` |
| 17 | `POST /v1/credits/purchases` | 201 | 95 | `qa-4585dc10-2d3b-4022-ad63-8bf6f4346f33` |
| 22 | `POST /v1/auth/token` | 200 | 43 | `qa-4c0acd70-f71b-4d73-be4b-7dc373d025ee` |
| 23 | `GET /v1/credits/ledger` | 200 | 57 | `qa-0564ac97-d980-475e-9a23-e3eb88c2d186` |
| 24 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-50ad0c35-e553-410f-b165-4ecc284b864d` |
| 25 | `POST /v1/auth/token` | 401 | 7 | `qa-baa66412-f679-4e86-9474-c6c9ba45b1ae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-55daad49-dffd-41f4-8ef2-3544b77b3657

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55daad49-dffd-41f4-8ef2-3544b77b3657
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","displayName":"QA 0d299797b3b0","password":"****","region":"us"}

--- response: 201 in 501 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-55daad49-dffd-41f4-8ef2-3544b77b3657
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
Location: /v1/accounts/qa-0d299797b3b0
X-Served-Region: us
Content-Length: 181

{"id":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030","handle":"qa-0d299797b3b0","displayName":"QA 0d299797b3b0","region":"us","role":"user","createdAt":"2026-11-01T09:23:23.661915949Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-af6da771-46fc-4c73-b3ee-45d4ac648ba6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af6da771-46fc-4c73-b3ee-45d4ac648ba6
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 96 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-af6da771-46fc-4c73-b3ee-45d4ac648ba6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-6e1cc43a-9db6-43b2-8cda-cffea2f13c85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e1cc43a-9db6-43b2-8cda-cffea2f13c85
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 91 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e1cc43a-9db6-43b2-8cda-cffea2f13c85
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-0b46fa42-5620-43ca-839b-b669012865e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b46fa42-5620-43ca-839b-b669012865e0
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 92 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b46fa42-5620-43ca-839b-b669012865e0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d9d7f834-8fb0-4b19-8327-20a490b51ccc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9d7f834-8fb0-4b19-8327-20a490b51ccc
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 107 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9d7f834-8fb0-4b19-8327-20a490b51ccc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-70d0dbfb-51e8-4b32-8803-480eede15124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d0dbfb-51e8-4b32-8803-480eede15124
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 99 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-70d0dbfb-51e8-4b32-8803-480eede15124
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-13c12a0b-e4da-4903-ba8c-4aad619bc8ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13c12a0b-e4da-4903-ba8c-4aad619bc8ee
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 91 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-13c12a0b-e4da-4903-ba8c-4aad619bc8ee
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-7baddc73-9991-491c-a843-94ba73ec1ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7baddc73-9991-491c-a843-94ba73ec1ce5
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 103 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7baddc73-9991-491c-a843-94ba73ec1ce5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f1b1263e-6201-488f-9c53-2a8eaac18be4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b1263e-6201-488f-9c53-2a8eaac18be4
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 119 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1b1263e-6201-488f-9c53-2a8eaac18be4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-82cf4845-ef8d-439b-ab6f-9586ed77baed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82cf4845-ef8d-439b-ab6f-9586ed77baed
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 99 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-82cf4845-ef8d-439b-ab6f-9586ed77baed
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9fa86bf7-fd9a-4e1f-a6cf-ba2c430f85a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fa86bf7-fd9a-4e1f-a6cf-ba2c430f85a0
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 124 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fa86bf7-fd9a-4e1f-a6cf-ba2c430f85a0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-84c3998e-1cb3-43cf-9edb-11f24473a7b8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0a241889560441c0bdaeb344560eddeb
X-Correlation-Id: qa-84c3998e-1cb3-43cf-9edb-11f24473a7b8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 84 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-84c3998e-1cb3-43cf-9edb-11f24473a7b8
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
Location: /v1/credits/purchases/pur_b71dc42e-f10c-4a35-a34d-15cba93ad23a
Content-Length: 144

{"id":"pur_b71dc42e-f10c-4a35-a34d-15cba93ad23a","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-01T09:23:24.317543807Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2a145dcd-ba10-422a-b2df-26a48c2c6c0e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1dac5d726be5428b95a2d558226db6f6
X-Correlation-Id: qa-2a145dcd-ba10-422a-b2df-26a48c2c6c0e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 94 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a145dcd-ba10-422a-b2df-26a48c2c6c0e
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
Location: /v1/credits/purchases/pur_f45c7a43-0a14-4743-9e98-f103a3b680d8
Content-Length: 145

{"id":"pur_f45c7a43-0a14-4743-9e98-f103a3b680d8","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-01T09:23:24.317798488Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3d566758-fe93-420a-bfb5-16838ab6add8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0eb7411919414bdeb8f7b89938c64c25
X-Correlation-Id: qa-3d566758-fe93-420a-bfb5-16838ab6add8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 89 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d566758-fe93-420a-bfb5-16838ab6add8
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
Location: /v1/credits/purchases/pur_a80c4b5c-c232-4879-8554-e16ccfa06f5d
Content-Length: 144

{"id":"pur_a80c4b5c-c232-4879-8554-e16ccfa06f5d","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-01T09:23:24.315683783Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-45e03d9c-7c66-4948-8037-22fd9130d5d3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cd8c8e03278543a88cbd13915bd0d80b
X-Correlation-Id: qa-45e03d9c-7c66-4948-8037-22fd9130d5d3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 77 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-45e03d9c-7c66-4948-8037-22fd9130d5d3
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
Location: /v1/credits/purchases/pur_e1255b09-3bae-49b2-8330-59f36c8eb80e
Content-Length: 144

{"id":"pur_e1255b09-3bae-49b2-8330-59f36c8eb80e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:24.314584651Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f5b7522b-d5d8-4b0a-bbbf-5f6cbe839f9b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-63a71fa7aba64c37949aa3bec9db0245
X-Correlation-Id: qa-f5b7522b-d5d8-4b0a-bbbf-5f6cbe839f9b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 74 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5b7522b-d5d8-4b0a-bbbf-5f6cbe839f9b
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
Location: /v1/credits/purchases/pur_a5dcd1f6-bb8b-4021-8ea6-5454f59bfdf4
Content-Length: 144

{"id":"pur_a5dcd1f6-bb8b-4021-8ea6-5454f59bfdf4","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-01T09:23:24.317414667Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ca00dbb7-8033-4b9e-8ed9-ac1137060fb6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2e3d0c81940048e49aca1408d5d0786c
X-Correlation-Id: qa-ca00dbb7-8033-4b9e-8ed9-ac1137060fb6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 93 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca00dbb7-8033-4b9e-8ed9-ac1137060fb6
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
Location: /v1/credits/purchases/pur_dfe8543e-3b18-43a6-baff-9d6982011c16
Content-Length: 144

{"id":"pur_dfe8543e-3b18-43a6-baff-9d6982011c16","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-01T09:23:24.314600382Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ae164d45-5e7d-4f25-b56f-16bbcd12e5a2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2a675fb135e94c4a87711c9dd430b0a6
X-Correlation-Id: qa-ae164d45-5e7d-4f25-b56f-16bbcd12e5a2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 101 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae164d45-5e7d-4f25-b56f-16bbcd12e5a2
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
Location: /v1/credits/purchases/pur_b5680cc6-c8df-4ff4-abfb-00f9d983c2c6
Content-Length: 144

{"id":"pur_b5680cc6-c8df-4ff4-abfb-00f9d983c2c6","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-01T09:23:24.317195518Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ce670aca-6759-40e4-9d08-6d1880beaf76

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c194559696547c3be9c9e0d72106624
X-Correlation-Id: qa-ce670aca-6759-40e4-9d08-6d1880beaf76
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 59 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce670aca-6759-40e4-9d08-6d1880beaf76
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
Location: /v1/credits/purchases/pur_7181d488-3d87-4b15-a884-f7dd69fe8807
Content-Length: 144

{"id":"pur_7181d488-3d87-4b15-a884-f7dd69fe8807","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-01T09:23:24.317283823Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1e88b9e5-5546-4e1a-afda-caecf1f8f8b0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a0f55d67dd43405e955b39e549802935
X-Correlation-Id: qa-1e88b9e5-5546-4e1a-afda-caecf1f8f8b0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 87 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e88b9e5-5546-4e1a-afda-caecf1f8f8b0
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
Location: /v1/credits/purchases/pur_5478ccc4-3e72-4210-ae63-d425bd3cc0f0
Content-Length: 144

{"id":"pur_5478ccc4-3e72-4210-ae63-d425bd3cc0f0","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-01T09:23:24.316411072Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4585dc10-2d3b-4022-ad63-8bf6f4346f33

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2e0e1cb2450849abae24162d83af593e
X-Correlation-Id: qa-4585dc10-2d3b-4022-ad63-8bf6f4346f33
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 95 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4585dc10-2d3b-4022-ad63-8bf6f4346f33
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
Location: /v1/credits/purchases/pur_ad850303-3fa0-4ad3-b598-99168b0d0a41
Content-Length: 144

{"id":"pur_ad850303-3fa0-4ad3-b598-99168b0d0a41","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-01T09:23:24.316790013Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-4c0acd70-f71b-4d73-be4b-7dc373d025ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c0acd70-f71b-4d73-be4b-7dc373d025ee
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 200 in 43 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c0acd70-f71b-4d73-be4b-7dc373d025ee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a80fba-5fd3-4c95-a776-b9e0ed3c7030"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-0564ac97-d980-475e-9a23-e3eb88c2d186

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0564ac97-d980-475e-9a23-e3eb88c2d186
Content-Type: application/json

--- response: 200 in 57 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0564ac97-d980-475e-9a23-e3eb88c2d186
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

{"items":[{"id":"led_e3a4817e-7daa-453a-88e7-f0a2e89ad93f","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-01T09:23:23.661926038Z"},{"id":"led_23184879-761c-4681-b0f3-f49b5ba71137","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_e1255b09-3bae-49b2-8330-59f36c8eb80e","createdAt":"2026-11-01T09:23:24.314584651Z"},{"id":"led_a0f322e0-643a-4b1c-bb63-08e03114af07","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_a80c4b5c-c232-4879-8554-e16ccfa06f5d","createdAt":"2026-11-01T09:23:24.315683783Z"},{"id":"led_ee8e7319-d4a9-4a29-a7c9-a058d5f18188","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_5478ccc4-3e72-4210-ae63-d425bd3cc0f0","createdAt":"2026-11-01T09:23:24.316411072Z"},{"id":"led_93314579-252b-488c-926c-fc5a17487c67","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_ad850303-3fa0-4ad3-b598-99168b0d0a41","createdAt":"2026-11-01T09:23:24.316790013Z"},{"id":"led_e08f256c-32f6-43ae-a846-7cdad0e89965","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_b5680cc6-c8df-4ff4-abfb-00f9d983c2c6","createdAt":"2026-11-01T09:23:24.317195518Z"},{"id":"led_68dd6cb0-cba1-4401-aac9-e382a0ff06b1","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_7181d488-3d87-4b15-a884-f7dd69fe8807","createdAt":"2026-11-01T09:23:24.317283823Z"},{"id":"led_dfce578e-b9c6-4979-885d-eaf1025e7180","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_dfe8543e-3b18-43a6-baff-9d6982011c16","createdAt":"2026-11-01T09:23:24.314600382Z"},{"id":"led_3ef3f917-2515-4535-b26f-3670c02e81f1","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_a5dcd1f6-bb8b-4021-8ea6-5454f59bfdf4","createdAt":"2026-11-01T09:23:24.317414667Z"},{"id":"led_860b5446-a49e-4026-aa1b-cfd656a6cbac","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_b71dc42e-f10c-4a35-a34d-15cba93ad23a","createdAt":"2026-11-01T09:23:24.317543807Z"},{"id":"led_ef9aea84-408e-47b0-b8da-dbb2a46d195f","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_f45c7a43-0a14-4743-9e98-f103a3b680d8","createdAt":"2026-11-01T09:23:24.317798488Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50ad0c35-e553-410f-b165-4ecc284b864d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50ad0c35-e553-410f-b165-4ecc284b864d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-50ad0c35-e553-410f-b165-4ecc284b864d
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
correlation: qa-baa66412-f679-4e86-9474-c6c9ba45b1ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baa66412-f679-4e86-9474-c6c9ba45b1ae
Content-Type: application/json

--- request body ---
{"handle":"qa-0d299797b3b0","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-baa66412-f679-4e86-9474-c6c9ba45b1ae
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-baa66412-f679-4e86-9474-c6c9ba45b1ae"}
```
