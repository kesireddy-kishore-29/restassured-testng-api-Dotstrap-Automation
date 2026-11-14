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
| 1 | `POST /v1/accounts` | 201 | 361 | `qa-2e80e98b-6dec-4a2f-9908-7731952e27ce` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-bdd3a623-394c-4682-a36b-ddca44e7cb99` |
| 4 | `POST /v1/auth/token` | 200 | 65 | `qa-1102ddc9-6c6d-47c9-98ab-d30ed40ca64c` |
| 11 | `POST /v1/auth/token` | 200 | 33 | `qa-7cdb11df-af5a-4bd9-8914-8e488a9c6cfa` |
| 5 | `POST /v1/auth/token` | 200 | 66 | `qa-4f6eb78a-e4c1-492d-9a7f-020c93d2dd22` |
| 8 | `POST /v1/auth/token` | 200 | 45 | `qa-859c4747-08b3-4ada-ab6b-6cda14036371` |
| 3 | `POST /v1/auth/token` | 200 | 65 | `qa-31378cb5-6fa5-417d-b472-f50fa0c9279f` |
| 9 | `POST /v1/auth/token` | 200 | 61 | `qa-eeafcbde-ebc8-4c2c-a6f9-43401eb91996` |
| 2 | `POST /v1/auth/token` | 200 | 90 | `qa-ec07cff1-a5c4-4359-9271-a38bd189fc84` |
| 10 | `POST /v1/auth/token` | 200 | 58 | `qa-a132f9f1-6156-41ba-ab77-eedf52fa90b3` |
| 7 | `POST /v1/auth/token` | 200 | 67 | `qa-b4f30e23-f1c6-4d27-bbaa-ff6df19d9cd3` |
| 13 | `POST /v1/credits/purchases` | 201 | 47 | `qa-c9f8f5c1-bd9e-412f-952b-584bcc588500` |
| 21 | `POST /v1/credits/purchases` | 201 | 20 | `qa-557f9cfd-e3d0-44bd-a4e7-1e12fa16f6ff` |
| 19 | `POST /v1/credits/purchases` | 201 | 37 | `qa-0dc6fc9e-edd7-4096-ba33-e267b95fc811` |
| 20 | `POST /v1/credits/purchases` | 201 | 38 | `qa-b0bbf0e3-9a3e-423b-8a68-fa30938c93f9` |
| 15 | `POST /v1/credits/purchases` | 201 | 50 | `qa-8a9c1524-d4d3-4a8d-b9b9-09fdd1d49c5d` |
| 17 | `POST /v1/credits/purchases` | 201 | 46 | `qa-53815a96-1ae3-4c61-a34d-9c9e9ad555c7` |
| 16 | `POST /v1/credits/purchases` | 201 | 48 | `qa-4b820b29-a34b-4617-a42f-971fc6b70ca7` |
| 14 | `POST /v1/credits/purchases` | 201 | 57 | `qa-031ce627-d0fe-495e-bac0-d643ab432a00` |
| 18 | `POST /v1/credits/purchases` | 201 | 49 | `qa-74bef983-5d4a-415d-bca5-12e9d3c738c9` |
| 12 | `POST /v1/credits/purchases` | 201 | 65 | `qa-05211be7-ddaf-43b4-b79f-ff1e1bc97805` |
| 22 | `POST /v1/auth/token` | 200 | 24 | `qa-09bcc94d-63e5-4825-ac8f-ac454c4cd948` |
| 23 | `GET /v1/credits/ledger` | 200 | 61 | `qa-b9243ca6-1c10-4208-8484-142b7168043b` |
| 24 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-8b08ee57-e356-49ee-a72d-fde2583ca7f7` |
| 25 | `POST /v1/auth/token` | 401 | 27 | `qa-ee71d0e1-87ee-473d-bc7e-e11a0c9e63fe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2e80e98b-6dec-4a2f-9908-7731952e27ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e80e98b-6dec-4a2f-9908-7731952e27ce
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","displayName":"QA 52796a24b5c4","password":"****","region":"us"}

--- response: 201 in 361 ms ---
Date: Wed, 11 Nov 2026 09:34:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e80e98b-6dec-4a2f-9908-7731952e27ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-52796a24b5c4
X-Served-Region: us
Content-Length: 181

{"id":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404","handle":"qa-52796a24b5c4","displayName":"QA 52796a24b5c4","region":"us","role":"user","createdAt":"2026-11-11T09:34:22.868322628Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bdd3a623-394c-4682-a36b-ddca44e7cb99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdd3a623-394c-4682-a36b-ddca44e7cb99
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 60 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdd3a623-394c-4682-a36b-ddca44e7cb99
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1102ddc9-6c6d-47c9-98ab-d30ed40ca64c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1102ddc9-6c6d-47c9-98ab-d30ed40ca64c
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 65 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1102ddc9-6c6d-47c9-98ab-d30ed40ca64c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-7cdb11df-af5a-4bd9-8914-8e488a9c6cfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cdb11df-af5a-4bd9-8914-8e488a9c6cfa
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cdb11df-af5a-4bd9-8914-8e488a9c6cfa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4f6eb78a-e4c1-492d-9a7f-020c93d2dd22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f6eb78a-e4c1-492d-9a7f-020c93d2dd22
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 66 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f6eb78a-e4c1-492d-9a7f-020c93d2dd22
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-859c4747-08b3-4ada-ab6b-6cda14036371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-859c4747-08b3-4ada-ab6b-6cda14036371
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 45 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-859c4747-08b3-4ada-ab6b-6cda14036371
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-31378cb5-6fa5-417d-b472-f50fa0c9279f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31378cb5-6fa5-417d-b472-f50fa0c9279f
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 65 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-31378cb5-6fa5-417d-b472-f50fa0c9279f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-eeafcbde-ebc8-4c2c-a6f9-43401eb91996

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeafcbde-ebc8-4c2c-a6f9-43401eb91996
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 61 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeafcbde-ebc8-4c2c-a6f9-43401eb91996
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ec07cff1-a5c4-4359-9271-a38bd189fc84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec07cff1-a5c4-4359-9271-a38bd189fc84
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 90 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec07cff1-a5c4-4359-9271-a38bd189fc84
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a132f9f1-6156-41ba-ab77-eedf52fa90b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a132f9f1-6156-41ba-ab77-eedf52fa90b3
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 58 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a132f9f1-6156-41ba-ab77-eedf52fa90b3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-b4f30e23-f1c6-4d27-bbaa-ff6df19d9cd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4f30e23-f1c6-4d27-bbaa-ff6df19d9cd3
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 67 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4f30e23-f1c6-4d27-bbaa-ff6df19d9cd3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c9f8f5c1-bd9e-412f-952b-584bcc588500

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d315f6cbac8444aab46889689d1d6005
X-Correlation-Id: qa-c9f8f5c1-bd9e-412f-952b-584bcc588500
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9f8f5c1-bd9e-412f-952b-584bcc588500
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
Location: /v1/credits/purchases/pur_f5b7358a-2f03-4726-8e1b-85540b8becc1
Content-Length: 144

{"id":"pur_f5b7358a-2f03-4726-8e1b-85540b8becc1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:23.394472387Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-557f9cfd-e3d0-44bd-a4e7-1e12fa16f6ff

--- request headers ---
Accept: application/json
Idempotency-Key: qa-08b6154e3a7f4519bf3348617069a1dd
X-Correlation-Id: qa-557f9cfd-e3d0-44bd-a4e7-1e12fa16f6ff
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-557f9cfd-e3d0-44bd-a4e7-1e12fa16f6ff
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
Location: /v1/credits/purchases/pur_94c73e56-e537-478f-80c3-7dc79dd07565
Content-Length: 144

{"id":"pur_94c73e56-e537-478f-80c3-7dc79dd07565","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-11T09:34:23.397182156Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0dc6fc9e-edd7-4096-ba33-e267b95fc811

--- request headers ---
Accept: application/json
Idempotency-Key: qa-22e1be355e1d436c81be9e1d7da9fece
X-Correlation-Id: qa-0dc6fc9e-edd7-4096-ba33-e267b95fc811
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dc6fc9e-edd7-4096-ba33-e267b95fc811
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
Location: /v1/credits/purchases/pur_86122530-af2d-4bc9-b9ac-e0010a4e7114
Content-Length: 144

{"id":"pur_86122530-af2d-4bc9-b9ac-e0010a4e7114","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-11T09:34:23.398012085Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b0bbf0e3-9a3e-423b-8a68-fa30938c93f9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fb6ae5439aad4321938e0a289481d862
X-Correlation-Id: qa-b0bbf0e3-9a3e-423b-8a68-fa30938c93f9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 38 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0bbf0e3-9a3e-423b-8a68-fa30938c93f9
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
Location: /v1/credits/purchases/pur_6bef25ce-252e-49a7-8fed-96f0b00127d7
Content-Length: 144

{"id":"pur_6bef25ce-252e-49a7-8fed-96f0b00127d7","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-11T09:34:23.401990800Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8a9c1524-d4d3-4a8d-b9b9-09fdd1d49c5d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7a092c5047e14442863ce75453cfa936
X-Correlation-Id: qa-8a9c1524-d4d3-4a8d-b9b9-09fdd1d49c5d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a9c1524-d4d3-4a8d-b9b9-09fdd1d49c5d
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
Location: /v1/credits/purchases/pur_3a078a90-3fcf-43d6-8bce-d988882ffc9d
Content-Length: 144

{"id":"pur_3a078a90-3fcf-43d6-8bce-d988882ffc9d","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-11T09:34:23.409633952Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-53815a96-1ae3-4c61-a34d-9c9e9ad555c7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d8ca8fba5d704d47b084fd7811825e12
X-Correlation-Id: qa-53815a96-1ae3-4c61-a34d-9c9e9ad555c7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 46 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-53815a96-1ae3-4c61-a34d-9c9e9ad555c7
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
Location: /v1/credits/purchases/pur_4eefca37-073d-4cc5-9775-947092057a26
Content-Length: 144

{"id":"pur_4eefca37-073d-4cc5-9775-947092057a26","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-11T09:34:23.409776678Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4b820b29-a34b-4617-a42f-971fc6b70ca7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f1a094d0941b40e1bddd52cde22fb725
X-Correlation-Id: qa-4b820b29-a34b-4617-a42f-971fc6b70ca7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b820b29-a34b-4617-a42f-971fc6b70ca7
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
Location: /v1/credits/purchases/pur_4bc96ac1-5a96-49ff-b282-6c04c10f6f2c
Content-Length: 144

{"id":"pur_4bc96ac1-5a96-49ff-b282-6c04c10f6f2c","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-11T09:34:23.409105400Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-031ce627-d0fe-495e-bac0-d643ab432a00

--- request headers ---
Accept: application/json
Idempotency-Key: qa-62d550bb209541e3b490062d9a0fc91d
X-Correlation-Id: qa-031ce627-d0fe-495e-bac0-d643ab432a00
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 57 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-031ce627-d0fe-495e-bac0-d643ab432a00
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
Location: /v1/credits/purchases/pur_990bc0cd-5f83-4f90-9883-71f067e7f8df
Content-Length: 145

{"id":"pur_990bc0cd-5f83-4f90-9883-71f067e7f8df","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-11T09:34:23.410762219Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-74bef983-5d4a-415d-bca5-12e9d3c738c9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-36879d2cad89455fab505c33260e42f9
X-Correlation-Id: qa-74bef983-5d4a-415d-bca5-12e9d3c738c9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 49 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-74bef983-5d4a-415d-bca5-12e9d3c738c9
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
Location: /v1/credits/purchases/pur_93bfebe6-8d0f-4dbf-953f-c49d8be87285
Content-Length: 144

{"id":"pur_93bfebe6-8d0f-4dbf-953f-c49d8be87285","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-11T09:34:23.410201650Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-05211be7-ddaf-43b4-b79f-ff1e1bc97805

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fa20c34465a54ae589cf2c94af7927d0
X-Correlation-Id: qa-05211be7-ddaf-43b4-b79f-ff1e1bc97805
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 65 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-05211be7-ddaf-43b4-b79f-ff1e1bc97805
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
Location: /v1/credits/purchases/pur_48c97f35-7323-4d6e-a65b-1e78ae2730c7
Content-Length: 144

{"id":"pur_48c97f35-7323-4d6e-a65b-1e78ae2730c7","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-11T09:34:23.410352600Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-09bcc94d-63e5-4825-ac8f-ac454c4cd948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09bcc94d-63e5-4825-ac8f-ac454c4cd948
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-09bcc94d-63e5-4825-ac8f-ac454c4cd948
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c7d3f-c994-4cb5-9369-836f85417404"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b9243ca6-1c10-4208-8484-142b7168043b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9243ca6-1c10-4208-8484-142b7168043b
Content-Type: application/json

--- response: 200 in 61 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9243ca6-1c10-4208-8484-142b7168043b
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
Content-Length: 766

{"items":[{"id":"led_6aa1cedb-8dbc-46d5-aded-f9c33cdb2463","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-11T09:34:22.868507102Z"},{"id":"led_bc3f7a51-883b-40d8-b2eb-2cdff5b68805","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_f5b7358a-2f03-4726-8e1b-85540b8becc1","createdAt":"2026-11-11T09:34:23.394472387Z"},{"id":"led_a7e94ded-74b0-440c-90cf-7e3cc3571aa3","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_94c73e56-e537-478f-80c3-7dc79dd07565","createdAt":"2026-11-11T09:34:23.397182156Z"},{"id":"led_e56599db-7113-4308-b445-c971af3a6b77","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_86122530-af2d-4bc9-b9ac-e0010a4e7114","createdAt":"2026-11-11T09:34:23.398012085Z"},{"id":"led_023cceb3-b1b0-4356-8620-ebefda86b0f7","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_6bef25ce-252e-49a7-8fed-96f0b00127d7","createdAt":"2026-11-11T09:34:23.401990800Z"},{"id":"led_65a85993-5030-4ee4-9c10-53cfef14fb69","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_4bc96ac1-5a96-49ff-b282-6c04c10f6f2c","createdAt":"2026-11-11T09:34:23.409105400Z"},{"id":"led_2ba49b9a-c2ad-4ab2-815b-a8fd286e5d27","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_3a078a90-3fcf-43d6-8bce-d988882ffc9d","createdAt":"2026-11-11T09:34:23.409633952Z"},{"id":"led_93448174-df47-4c13-9916-0771acad55e2","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_4eefca37-073d-4cc5-9775-947092057a26","createdAt":"2026-11-11T09:34:23.409776678Z"},{"id":"led_ba0a9bdf-6eea-4c34-872e-969851038192","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_93bfebe6-8d0f-4dbf-953f-c49d8be87285","createdAt":"2026-11-11T09:34:23.410201650Z"},{"id":"led_08677c2b-8b4d-4135-b804-eaaf404a9ddf","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_48c97f35-7323-4d6e-a65b-1e78ae2730c7","createdAt":"2026-11-11T09:34:23.410352600Z"},{"id":"led_44405f42-f8c3-4f92-824b-67e5a3c0abd1","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_990bc0cd-5f83-4f90-9883-71f067e7f8df","createdAt":"2026-11-11T09:34:23.410762219Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b08ee57-e356-49ee-a72d-fde2583ca7f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b08ee57-e356-49ee-a72d-fde2583ca7f7
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b08ee57-e356-49ee-a72d-fde2583ca7f7
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
correlation: qa-ee71d0e1-87ee-473d-bc7e-e11a0c9e63fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee71d0e1-87ee-473d-bc7e-e11a0c9e63fe
Content-Type: application/json

--- request body ---
{"handle":"qa-52796a24b5c4","password":"****"}

--- response: 401 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee71d0e1-87ee-473d-bc7e-e11a0c9e63fe
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee71d0e1-87ee-473d-bc7e-e11a0c9e63fe"}
```
