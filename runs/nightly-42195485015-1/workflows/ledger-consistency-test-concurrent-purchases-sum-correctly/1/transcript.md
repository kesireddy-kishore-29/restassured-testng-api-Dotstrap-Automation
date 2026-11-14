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
| 1 | `POST /v1/accounts` | 201 | 472 | `qa-ce4da87a-d27d-41bb-b5ac-ac505deff269` |
| 7 | `POST /v1/auth/token` | 200 | 109 | `qa-b408e300-45a2-49db-88b3-3a2ca544a743` |
| 5 | `POST /v1/auth/token` | 200 | 115 | `qa-2e956655-85d1-469f-8c5e-d9445d663597` |
| 3 | `POST /v1/auth/token` | 200 | 134 | `qa-f505d0c0-2be1-4c8d-825f-4c10ca4c3ebb` |
| 2 | `POST /v1/auth/token` | 200 | 140 | `qa-1cbe6ffd-ff2b-4742-97b7-5db6b941e78f` |
| 6 | `POST /v1/auth/token` | 200 | 131 | `qa-efa8af1e-9e5f-4fad-8f36-45c5fb5ab3e7` |
| 8 | `POST /v1/auth/token` | 200 | 125 | `qa-c87ca2cf-f193-4f23-94f1-90dfd4577b3a` |
| 11 | `POST /v1/auth/token` | 200 | 102 | `qa-2eff346f-fff6-47e8-bbc4-8b09c837f7ba` |
| 10 | `POST /v1/auth/token` | 200 | 125 | `qa-23b630b2-fc2b-4ffe-b272-f583af5bef9e` |
| 9 | `POST /v1/auth/token` | 200 | 131 | `qa-ea847cdb-27c4-4eed-bc00-c239db72f2b8` |
| 4 | `POST /v1/auth/token` | 200 | 134 | `qa-37ae3af9-5907-4365-b9bb-7d311c5daea7` |
| 16 | `POST /v1/credits/purchases` | 201 | 70 | `qa-c0ad3036-ec63-492c-8847-07030de4c41d` |
| 15 | `POST /v1/credits/purchases` | 201 | 72 | `qa-25f77330-297f-409b-a4e8-1532dbf3f632` |
| 21 | `POST /v1/credits/purchases` | 201 | 45 | `qa-caab8750-2c07-46e3-b5df-1ad6e9955136` |
| 13 | `POST /v1/credits/purchases` | 201 | 81 | `qa-a62094a6-8428-4a04-9330-30ca45672520` |
| 17 | `POST /v1/credits/purchases` | 201 | 76 | `qa-ab103234-8d7f-41b5-9f6d-61051fd044fd` |
| 12 | `POST /v1/credits/purchases` | 201 | 86 | `qa-e36fe9e6-8318-478e-8274-f074b8ed21ab` |
| 19 | `POST /v1/credits/purchases` | 201 | 72 | `qa-65d6d53c-c71f-45fc-90fb-8f5ec6506c30` |
| 20 | `POST /v1/credits/purchases` | 201 | 64 | `qa-db8e9bcc-6ea9-415b-a1c7-1cd70c9c2c89` |
| 18 | `POST /v1/credits/purchases` | 201 | 81 | `qa-4a52d9f9-69a7-4ce3-843c-db86cadbb9d4` |
| 14 | `POST /v1/credits/purchases` | 201 | 93 | `qa-fcacbf72-7a92-4b03-86a6-4272609a9cca` |
| 22 | `POST /v1/auth/token` | 200 | 24 | `qa-3aa50a77-1c57-4236-9c9f-f7fa7fe50717` |
| 23 | `GET /v1/credits/ledger` | 200 | 94 | `qa-6b5b18bb-8f39-4674-84e3-9c5f40cc503b` |
| 24 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-966b3d99-4aa6-4fba-8306-26663f8134e1` |
| 25 | `POST /v1/auth/token` | 401 | 37 | `qa-b08cc99c-9c35-4e5a-a071-f0b91ceb3246` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ce4da87a-d27d-41bb-b5ac-ac505deff269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce4da87a-d27d-41bb-b5ac-ac505deff269
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","displayName":"QA 3da17027a6d3","password":"****","region":"us"}

--- response: 201 in 472 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce4da87a-d27d-41bb-b5ac-ac505deff269
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
Location: /v1/accounts/qa-3da17027a6d3
X-Served-Region: us
Content-Length: 181

{"id":"acc_4df784bf-6b76-4578-a902-7839f639a37c","handle":"qa-3da17027a6d3","displayName":"QA 3da17027a6d3","region":"us","role":"user","createdAt":"2026-11-06T09:30:31.035747876Z"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-b408e300-45a2-49db-88b3-3a2ca544a743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b408e300-45a2-49db-88b3-3a2ca544a743
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 109 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b408e300-45a2-49db-88b3-3a2ca544a743
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2e956655-85d1-469f-8c5e-d9445d663597

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e956655-85d1-469f-8c5e-d9445d663597
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 115 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e956655-85d1-469f-8c5e-d9445d663597
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f505d0c0-2be1-4c8d-825f-4c10ca4c3ebb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f505d0c0-2be1-4c8d-825f-4c10ca4c3ebb
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 134 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f505d0c0-2be1-4c8d-825f-4c10ca4c3ebb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1cbe6ffd-ff2b-4742-97b7-5db6b941e78f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cbe6ffd-ff2b-4742-97b7-5db6b941e78f
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 140 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cbe6ffd-ff2b-4742-97b7-5db6b941e78f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-efa8af1e-9e5f-4fad-8f36-45c5fb5ab3e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efa8af1e-9e5f-4fad-8f36-45c5fb5ab3e7
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 131 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-efa8af1e-9e5f-4fad-8f36-45c5fb5ab3e7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-c87ca2cf-f193-4f23-94f1-90dfd4577b3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c87ca2cf-f193-4f23-94f1-90dfd4577b3a
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 125 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c87ca2cf-f193-4f23-94f1-90dfd4577b3a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-2eff346f-fff6-47e8-bbc4-8b09c837f7ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eff346f-fff6-47e8-bbc4-8b09c837f7ba
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 102 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eff346f-fff6-47e8-bbc4-8b09c837f7ba
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-23b630b2-fc2b-4ffe-b272-f583af5bef9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23b630b2-fc2b-4ffe-b272-f583af5bef9e
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 125 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-23b630b2-fc2b-4ffe-b272-f583af5bef9e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-ea847cdb-27c4-4eed-bc00-c239db72f2b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea847cdb-27c4-4eed-bc00-c239db72f2b8
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 131 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea847cdb-27c4-4eed-bc00-c239db72f2b8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-37ae3af9-5907-4365-b9bb-7d311c5daea7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37ae3af9-5907-4365-b9bb-7d311c5daea7
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 134 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-37ae3af9-5907-4365-b9bb-7d311c5daea7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c0ad3036-ec63-492c-8847-07030de4c41d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7aeb4f6cc23f4643af4e8643cc146fad
X-Correlation-Id: qa-c0ad3036-ec63-492c-8847-07030de4c41d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 70 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0ad3036-ec63-492c-8847-07030de4c41d
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
Location: /v1/credits/purchases/pur_84ad0724-778e-478f-9f23-ff48fdb72036
Content-Length: 144

{"id":"pur_84ad0724-778e-478f-9f23-ff48fdb72036","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-06T09:30:31.804664234Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-25f77330-297f-409b-a4e8-1532dbf3f632

--- request headers ---
Accept: application/json
Idempotency-Key: qa-aeba3af1e5a34598add505b7cbc44e9f
X-Correlation-Id: qa-25f77330-297f-409b-a4e8-1532dbf3f632
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-25f77330-297f-409b-a4e8-1532dbf3f632
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
Location: /v1/credits/purchases/pur_6919cc10-b982-4052-a6b8-c3cc8d1ee99d
Content-Length: 144

{"id":"pur_6919cc10-b982-4052-a6b8-c3cc8d1ee99d","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-06T09:30:31.804240643Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-caab8750-2c07-46e3-b5df-1ad6e9955136

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cec23b9f957e4f0dbf6f5889003123f2
X-Correlation-Id: qa-caab8750-2c07-46e3-b5df-1ad6e9955136
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-caab8750-2c07-46e3-b5df-1ad6e9955136
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
Location: /v1/credits/purchases/pur_1e6a4e46-f5a2-4339-a377-a0afe838dedc
Content-Length: 144

{"id":"pur_1e6a4e46-f5a2-4339-a377-a0afe838dedc","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.803268126Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a62094a6-8428-4a04-9330-30ca45672520

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4dfcd69807dd4bce971bbb39be95832f
X-Correlation-Id: qa-a62094a6-8428-4a04-9330-30ca45672520
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 81 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a62094a6-8428-4a04-9330-30ca45672520
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
Location: /v1/credits/purchases/pur_6f0870ab-d3e2-41e1-91cd-1b910ce51ffb
Content-Length: 144

{"id":"pur_6f0870ab-d3e2-41e1-91cd-1b910ce51ffb","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-06T09:30:31.813867979Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ab103234-8d7f-41b5-9f6d-61051fd044fd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2d0c0ec99f2045db92d0a190f108bbaf
X-Correlation-Id: qa-ab103234-8d7f-41b5-9f6d-61051fd044fd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 76 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab103234-8d7f-41b5-9f6d-61051fd044fd
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
Location: /v1/credits/purchases/pur_8747804a-4820-4696-9de0-d224ce0e2f60
Content-Length: 144

{"id":"pur_8747804a-4820-4696-9de0-d224ce0e2f60","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-06T09:30:31.816373368Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e36fe9e6-8318-478e-8274-f074b8ed21ab

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ae3a662bf23245c8b2213a5b7ad6e975
X-Correlation-Id: qa-e36fe9e6-8318-478e-8274-f074b8ed21ab
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 86 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e36fe9e6-8318-478e-8274-f074b8ed21ab
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
Location: /v1/credits/purchases/pur_ccd36ffd-4740-4c09-bbbf-b6b5d283cc24
Content-Length: 144

{"id":"pur_ccd36ffd-4740-4c09-bbbf-b6b5d283cc24","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-06T09:30:31.818506282Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-65d6d53c-c71f-45fc-90fb-8f5ec6506c30

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9c23716b81b64e469db4a2a71cf18513
X-Correlation-Id: qa-65d6d53c-c71f-45fc-90fb-8f5ec6506c30
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-65d6d53c-c71f-45fc-90fb-8f5ec6506c30
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
Location: /v1/credits/purchases/pur_53c7ab40-bc61-456f-b97c-b64de28aa889
Content-Length: 144

{"id":"pur_53c7ab40-bc61-456f-b97c-b64de28aa889","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-06T09:30:31.819213102Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-db8e9bcc-6ea9-415b-a1c7-1cd70c9c2c89

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9d448cfe43924cf3bd1c1030c36df204
X-Correlation-Id: qa-db8e9bcc-6ea9-415b-a1c7-1cd70c9c2c89
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 64 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-db8e9bcc-6ea9-415b-a1c7-1cd70c9c2c89
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
Location: /v1/credits/purchases/pur_14b6e37d-a645-4dae-8116-c10718df7bca
Content-Length: 144

{"id":"pur_14b6e37d-a645-4dae-8116-c10718df7bca","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-06T09:30:31.821908290Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4a52d9f9-69a7-4ce3-843c-db86cadbb9d4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e5ad989029ea41448abae86ad3c09f69
X-Correlation-Id: qa-4a52d9f9-69a7-4ce3-843c-db86cadbb9d4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 81 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a52d9f9-69a7-4ce3-843c-db86cadbb9d4
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
Location: /v1/credits/purchases/pur_07dda60f-de8c-40a2-a682-7f0e8c5c2aa5
Content-Length: 144

{"id":"pur_07dda60f-de8c-40a2-a682-7f0e8c5c2aa5","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-06T09:30:31.824975119Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fcacbf72-7a92-4b03-86a6-4272609a9cca

--- request headers ---
Accept: application/json
Idempotency-Key: qa-af1314b350444292888a42965e136c8a
X-Correlation-Id: qa-fcacbf72-7a92-4b03-86a6-4272609a9cca
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 93 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcacbf72-7a92-4b03-86a6-4272609a9cca
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
Location: /v1/credits/purchases/pur_dab3939c-9073-4c1f-8781-66669f84c916
Content-Length: 145

{"id":"pur_dab3939c-9073-4c1f-8781-66669f84c916","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-06T09:30:31.825814456Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-3aa50a77-1c57-4236-9c9f-f7fa7fe50717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3aa50a77-1c57-4236-9c9f-f7fa7fe50717
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3aa50a77-1c57-4236-9c9f-f7fa7fe50717
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4df784bf-6b76-4578-a902-7839f639a37c"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6b5b18bb-8f39-4674-84e3-9c5f40cc503b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b5b18bb-8f39-4674-84e3-9c5f40cc503b
Content-Type: application/json

--- response: 200 in 94 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b5b18bb-8f39-4674-84e3-9c5f40cc503b
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

{"items":[{"id":"led_f409c309-bc94-4bed-8b87-fc414b13655c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-06T09:30:31.035757714Z"},{"id":"led_be61c47b-5788-43a1-bb1d-ec7eba5ad75b","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_1e6a4e46-f5a2-4339-a377-a0afe838dedc","createdAt":"2026-11-06T09:30:31.803268126Z"},{"id":"led_619df730-da32-48d8-b4c9-c2c4c04c1023","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_6919cc10-b982-4052-a6b8-c3cc8d1ee99d","createdAt":"2026-11-06T09:30:31.804240643Z"},{"id":"led_87bc1682-14c1-44e4-897b-7446e0c328c1","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_84ad0724-778e-478f-9f23-ff48fdb72036","createdAt":"2026-11-06T09:30:31.804664234Z"},{"id":"led_71743454-e8eb-49fd-a470-b76a6dfb318f","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_6f0870ab-d3e2-41e1-91cd-1b910ce51ffb","createdAt":"2026-11-06T09:30:31.813867979Z"},{"id":"led_eddf8847-cda5-4185-878a-6eae8f63dc10","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_8747804a-4820-4696-9de0-d224ce0e2f60","createdAt":"2026-11-06T09:30:31.816373368Z"},{"id":"led_b0bbf87b-cd55-486f-8946-6c1e8628ab96","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_ccd36ffd-4740-4c09-bbbf-b6b5d283cc24","createdAt":"2026-11-06T09:30:31.818506282Z"},{"id":"led_fbd91d4f-7b35-4d71-923d-65098d0a7489","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_53c7ab40-bc61-456f-b97c-b64de28aa889","createdAt":"2026-11-06T09:30:31.819213102Z"},{"id":"led_6b73bdf9-0070-4221-85f6-013fabc57085","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_14b6e37d-a645-4dae-8116-c10718df7bca","createdAt":"2026-11-06T09:30:31.821908290Z"},{"id":"led_019ecfe1-4b2e-474b-acdc-6a9987e6327b","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_07dda60f-de8c-40a2-a682-7f0e8c5c2aa5","createdAt":"2026-11-06T09:30:31.824975119Z"},{"id":"led_86649bb7-7abf-4db4-af37-fcf9b6ecebe9","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_dab3939c-9073-4c1f-8781-66669f84c916","createdAt":"2026-11-06T09:30:31.825814456Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-966b3d99-4aa6-4fba-8306-26663f8134e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-966b3d99-4aa6-4fba-8306-26663f8134e1
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-966b3d99-4aa6-4fba-8306-26663f8134e1
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
correlation: qa-b08cc99c-9c35-4e5a-a071-f0b91ceb3246

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b08cc99c-9c35-4e5a-a071-f0b91ceb3246
Content-Type: application/json

--- request body ---
{"handle":"qa-3da17027a6d3","password":"****"}

--- response: 401 in 37 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b08cc99c-9c35-4e5a-a071-f0b91ceb3246
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b08cc99c-9c35-4e5a-a071-f0b91ceb3246"}
```
