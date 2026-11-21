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
| 1 | `POST /v1/accounts` | 201 | 431 | `qa-baedc4a1-e273-4704-b601-8c360571bea3` |
| 3 | `POST /v1/auth/token` | 200 | 132 | `qa-443de941-d9c0-4ab3-9570-30cde2790ea3` |
| 6 | `POST /v1/auth/token` | 200 | 130 | `qa-fd861bc0-915c-43e3-81bd-721122051ef2` |
| 9 | `POST /v1/auth/token` | 200 | 121 | `qa-cc0bc410-9e20-4ec6-b71e-60784327513a` |
| 11 | `POST /v1/auth/token` | 200 | 127 | `qa-c9560b27-5d4e-4cc1-b07f-9d685dbd578d` |
| 8 | `POST /v1/auth/token` | 200 | 133 | `qa-d3c8f589-f6df-4c31-a688-70aecefb6ef4` |
| 5 | `POST /v1/auth/token` | 200 | 152 | `qa-9a96daa5-5820-446c-8fb7-bbb99083de17` |
| 4 | `POST /v1/auth/token` | 200 | 156 | `qa-81e2a29f-5efe-41c6-a0f8-8e6eda09c907` |
| 7 | `POST /v1/auth/token` | 200 | 138 | `qa-c7c0b246-a2c9-4d5c-9e44-2299a3add7f2` |
| 2 | `POST /v1/auth/token` | 200 | 176 | `qa-87095e4c-4164-4801-bea1-981a87bb0d25` |
| 10 | `POST /v1/auth/token` | 200 | 155 | `qa-95d137b8-18c0-4d33-aa4f-5b6225e91727` |
| 12 | `POST /v1/credits/purchases` | 201 | 92 | `qa-3899e93d-b865-4e2e-985f-905cf3f0ea7b` |
| 21 | `POST /v1/credits/purchases` | 201 | 40 | `qa-55571779-2dd6-438a-94e7-39035381ffbc` |
| 16 | `POST /v1/credits/purchases` | 201 | 75 | `qa-26c4785e-bad4-4382-9c87-d32e9f25cc66` |
| 20 | `POST /v1/credits/purchases` | 201 | 50 | `qa-4669644e-8d96-46c3-80a4-5e8608ec5525` |
| 15 | `POST /v1/credits/purchases` | 201 | 82 | `qa-56269ea3-9f07-4815-9af6-202635640083` |
| 14 | `POST /v1/credits/purchases` | 201 | 86 | `qa-9c926af5-0cd2-4b5c-873b-c557a938e5a4` |
| 18 | `POST /v1/credits/purchases` | 201 | 58 | `qa-22c1a161-145e-435a-aaf3-d4f4b8858de1` |
| 19 | `POST /v1/credits/purchases` | 201 | 78 | `qa-95760339-fdfe-4c0c-bd81-0f881e1fc039` |
| 17 | `POST /v1/credits/purchases` | 201 | 84 | `qa-ea372d2b-582f-47c3-9c39-f6c160250f12` |
| 13 | `POST /v1/credits/purchases` | 201 | 108 | `qa-91f463ce-8196-4481-81f8-1ee62b5fe194` |
| 22 | `POST /v1/auth/token` | 200 | 28 | `qa-cefd99e9-d110-458a-940d-1a946ef69e8d` |
| 23 | `GET /v1/credits/ledger` | 200 | 110 | `qa-d89ce7c5-b122-438e-bd62-9478407ae802` |
| 24 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7cce8534-3192-441e-99c4-35f535e3ad0e` |
| 25 | `POST /v1/auth/token` | 401 | 19 | `qa-ea51a9e1-f55f-4821-ac2b-2530d4f2a1e3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-baedc4a1-e273-4704-b601-8c360571bea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baedc4a1-e273-4704-b601-8c360571bea3
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","displayName":"QA 1136ebbb03fe","password":"****","region":"us"}

--- response: 201 in 431 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-baedc4a1-e273-4704-b601-8c360571bea3
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
Location: /v1/accounts/qa-1136ebbb03fe
X-Served-Region: us
Content-Length: 181

{"id":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce","handle":"qa-1136ebbb03fe","displayName":"QA 1136ebbb03fe","region":"us","role":"user","createdAt":"2026-11-15T09:36:14.669021367Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-443de941-d9c0-4ab3-9570-30cde2790ea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-443de941-d9c0-4ab3-9570-30cde2790ea3
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 132 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-443de941-d9c0-4ab3-9570-30cde2790ea3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fd861bc0-915c-43e3-81bd-721122051ef2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd861bc0-915c-43e3-81bd-721122051ef2
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 130 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd861bc0-915c-43e3-81bd-721122051ef2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-cc0bc410-9e20-4ec6-b71e-60784327513a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc0bc410-9e20-4ec6-b71e-60784327513a
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 121 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc0bc410-9e20-4ec6-b71e-60784327513a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-c9560b27-5d4e-4cc1-b07f-9d685dbd578d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9560b27-5d4e-4cc1-b07f-9d685dbd578d
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 127 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9560b27-5d4e-4cc1-b07f-9d685dbd578d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-d3c8f589-f6df-4c31-a688-70aecefb6ef4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3c8f589-f6df-4c31-a688-70aecefb6ef4
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 133 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3c8f589-f6df-4c31-a688-70aecefb6ef4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9a96daa5-5820-446c-8fb7-bbb99083de17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a96daa5-5820-446c-8fb7-bbb99083de17
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 152 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a96daa5-5820-446c-8fb7-bbb99083de17
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-81e2a29f-5efe-41c6-a0f8-8e6eda09c907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81e2a29f-5efe-41c6-a0f8-8e6eda09c907
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 156 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-81e2a29f-5efe-41c6-a0f8-8e6eda09c907
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-c7c0b246-a2c9-4d5c-9e44-2299a3add7f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7c0b246-a2c9-4d5c-9e44-2299a3add7f2
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 138 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7c0b246-a2c9-4d5c-9e44-2299a3add7f2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-87095e4c-4164-4801-bea1-981a87bb0d25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87095e4c-4164-4801-bea1-981a87bb0d25
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 176 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-87095e4c-4164-4801-bea1-981a87bb0d25
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-95d137b8-18c0-4d33-aa4f-5b6225e91727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d137b8-18c0-4d33-aa4f-5b6225e91727
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 155 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-95d137b8-18c0-4d33-aa4f-5b6225e91727
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3899e93d-b865-4e2e-985f-905cf3f0ea7b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8a661892f2644ee893b57cec2e99198d
X-Correlation-Id: qa-3899e93d-b865-4e2e-985f-905cf3f0ea7b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 92 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3899e93d-b865-4e2e-985f-905cf3f0ea7b
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
Location: /v1/credits/purchases/pur_a3878537-c167-4b24-a89d-738684bfc978
Content-Length: 141

{"id":"pur_a3878537-c167-4b24-a89d-738684bfc978","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-15T09:36:15.549122Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-55571779-2dd6-438a-94e7-39035381ffbc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2f4e4d8454241b59aa0d340b1225489
X-Correlation-Id: qa-55571779-2dd6-438a-94e7-39035381ffbc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 40 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-55571779-2dd6-438a-94e7-39035381ffbc
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
Location: /v1/credits/purchases/pur_792eda15-1ba4-427e-826d-561c6edda5d9
Content-Length: 144

{"id":"pur_792eda15-1ba4-427e-826d-561c6edda5d9","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-15T09:36:15.556887364Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-26c4785e-bad4-4382-9c87-d32e9f25cc66

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2628f2a76c9483f804c9e6ce324ea86
X-Correlation-Id: qa-26c4785e-bad4-4382-9c87-d32e9f25cc66
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 75 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-26c4785e-bad4-4382-9c87-d32e9f25cc66
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
Location: /v1/credits/purchases/pur_abbea3b1-fb85-4026-ad81-a80aa331d534
Content-Length: 144

{"id":"pur_abbea3b1-fb85-4026-ad81-a80aa331d534","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-15T09:36:15.549903430Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4669644e-8d96-46c3-80a4-5e8608ec5525

--- request headers ---
Accept: application/json
Idempotency-Key: qa-321ac9e00f6a4146b340c123572d60df
X-Correlation-Id: qa-4669644e-8d96-46c3-80a4-5e8608ec5525
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4669644e-8d96-46c3-80a4-5e8608ec5525
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
Location: /v1/credits/purchases/pur_6aa51074-8ff6-453c-a6d5-556b72a12110
Content-Length: 144

{"id":"pur_6aa51074-8ff6-453c-a6d5-556b72a12110","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-15T09:36:15.556171835Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-56269ea3-9f07-4815-9af6-202635640083

--- request headers ---
Accept: application/json
Idempotency-Key: qa-90728396648947b69d624fcd2afc8acf
X-Correlation-Id: qa-56269ea3-9f07-4815-9af6-202635640083
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 82 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-56269ea3-9f07-4815-9af6-202635640083
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
Location: /v1/credits/purchases/pur_7a048470-0e1c-4d1a-92a8-17aa3f7710be
Content-Length: 144

{"id":"pur_7a048470-0e1c-4d1a-92a8-17aa3f7710be","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:15.548372410Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9c926af5-0cd2-4b5c-873b-c557a938e5a4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-160beb4139ac4f748d90252f333b845a
X-Correlation-Id: qa-9c926af5-0cd2-4b5c-873b-c557a938e5a4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 86 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c926af5-0cd2-4b5c-873b-c557a938e5a4
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
Location: /v1/credits/purchases/pur_a432e38a-bb60-45bc-9ca9-9f7379d6f736
Content-Length: 145

{"id":"pur_a432e38a-bb60-45bc-9ca9-9f7379d6f736","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-15T09:36:15.562602524Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-22c1a161-145e-435a-aaf3-d4f4b8858de1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c9a926ac7cd1440aa37ba263a50253f7
X-Correlation-Id: qa-22c1a161-145e-435a-aaf3-d4f4b8858de1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-22c1a161-145e-435a-aaf3-d4f4b8858de1
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
Location: /v1/credits/purchases/pur_402b200f-c62c-4649-8930-fa385bca5bb5
Content-Length: 144

{"id":"pur_402b200f-c62c-4649-8930-fa385bca5bb5","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-15T09:36:15.554287717Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-95760339-fdfe-4c0c-bd81-0f881e1fc039

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fca9f6efe12f48a2912761c2c373d145
X-Correlation-Id: qa-95760339-fdfe-4c0c-bd81-0f881e1fc039
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-95760339-fdfe-4c0c-bd81-0f881e1fc039
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
Location: /v1/credits/purchases/pur_31be43b7-2a58-482f-8068-8cfce9afa311
Content-Length: 144

{"id":"pur_31be43b7-2a58-482f-8068-8cfce9afa311","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-15T09:36:15.548674227Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ea372d2b-582f-47c3-9c39-f6c160250f12

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5db37d819973486f9a5ca8b1f0f2793a
X-Correlation-Id: qa-ea372d2b-582f-47c3-9c39-f6c160250f12
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 84 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea372d2b-582f-47c3-9c39-f6c160250f12
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
Location: /v1/credits/purchases/pur_481786a7-d38d-4ddc-8d0b-2f9753726404
Content-Length: 144

{"id":"pur_481786a7-d38d-4ddc-8d0b-2f9753726404","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-15T09:36:15.552175081Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-91f463ce-8196-4481-81f8-1ee62b5fe194

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5d8fbee3e300461dac7c8471e81ffd10
X-Correlation-Id: qa-91f463ce-8196-4481-81f8-1ee62b5fe194
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 108 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-91f463ce-8196-4481-81f8-1ee62b5fe194
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
Location: /v1/credits/purchases/pur_b6b78e52-9d02-4d01-810d-e5f4bab01db3
Content-Length: 144

{"id":"pur_b6b78e52-9d02-4d01-810d-e5f4bab01db3","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-15T09:36:15.551895192Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-cefd99e9-d110-458a-940d-1a946ef69e8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cefd99e9-d110-458a-940d-1a946ef69e8d
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-cefd99e9-d110-458a-940d-1a946ef69e8d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24874a1e-a580-40bb-a787-0bd3a678e3ce"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d89ce7c5-b122-438e-bd62-9478407ae802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d89ce7c5-b122-438e-bd62-9478407ae802
Content-Type: application/json

--- response: 200 in 110 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d89ce7c5-b122-438e-bd62-9478407ae802
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

{"items":[{"id":"led_7976ffff-4789-4e74-aabc-ac6e8ca83e7e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-15T09:36:14.671323877Z"},{"id":"led_15e69898-2413-45b2-990e-0ab39344c63d","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_7a048470-0e1c-4d1a-92a8-17aa3f7710be","createdAt":"2026-11-15T09:36:15.548372410Z"},{"id":"led_8d9db1cc-4143-40cd-8db8-e8151a1fd11a","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_31be43b7-2a58-482f-8068-8cfce9afa311","createdAt":"2026-11-15T09:36:15.548674227Z"},{"id":"led_1cba36c1-50c5-4226-b22c-54c3af18a38b","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_a3878537-c167-4b24-a89d-738684bfc978","createdAt":"2026-11-15T09:36:15.549122Z"},{"id":"led_b670e79f-ba55-4282-b05f-47a3faf6d4f9","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_abbea3b1-fb85-4026-ad81-a80aa331d534","createdAt":"2026-11-15T09:36:15.549903430Z"},{"id":"led_882924b4-d8c3-4af4-b798-16acebd21819","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_b6b78e52-9d02-4d01-810d-e5f4bab01db3","createdAt":"2026-11-15T09:36:15.551895192Z"},{"id":"led_79310aaf-7ecf-459e-90bf-f7061a435605","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_481786a7-d38d-4ddc-8d0b-2f9753726404","createdAt":"2026-11-15T09:36:15.552175081Z"},{"id":"led_45ffd972-a48a-44f9-8f5d-b2fcb178537e","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_402b200f-c62c-4649-8930-fa385bca5bb5","createdAt":"2026-11-15T09:36:15.554287717Z"},{"id":"led_3c440be3-b20e-4db8-8844-250b4e477028","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_6aa51074-8ff6-453c-a6d5-556b72a12110","createdAt":"2026-11-15T09:36:15.556171835Z"},{"id":"led_c1bb44f1-f10c-4f0a-a310-fbcb8d447fb8","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_792eda15-1ba4-427e-826d-561c6edda5d9","createdAt":"2026-11-15T09:36:15.556887364Z"},{"id":"led_c30f516a-804a-48a4-8fc1-145050cfd70b","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_a432e38a-bb60-45bc-9ca9-9f7379d6f736","createdAt":"2026-11-15T09:36:15.562602524Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7cce8534-3192-441e-99c4-35f535e3ad0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cce8534-3192-441e-99c4-35f535e3ad0e
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7cce8534-3192-441e-99c4-35f535e3ad0e
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
correlation: qa-ea51a9e1-f55f-4821-ac2b-2530d4f2a1e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea51a9e1-f55f-4821-ac2b-2530d4f2a1e3
Content-Type: application/json

--- request body ---
{"handle":"qa-1136ebbb03fe","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea51a9e1-f55f-4821-ac2b-2530d4f2a1e3
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ea51a9e1-f55f-4821-ac2b-2530d4f2a1e3"}
```
