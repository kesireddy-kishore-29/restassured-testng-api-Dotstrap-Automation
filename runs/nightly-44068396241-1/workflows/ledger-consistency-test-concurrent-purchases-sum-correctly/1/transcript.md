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
| 1 | `POST /v1/accounts` | 201 | 349 | `qa-be158e04-f682-4c75-9b82-ae889ec2fafe` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-40547f08-afd5-45ac-875e-aec210072261` |
| 5 | `POST /v1/auth/token` | 200 | 46 | `qa-f50cf374-0eac-4129-8330-6c1595a32248` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-1deec761-f403-44ea-abea-e0774a8366d2` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-5c2492eb-2994-4271-8d33-2452b6a63545` |
| 9 | `POST /v1/auth/token` | 200 | 39 | `qa-4a356253-5e64-46e9-873d-d0cf2759c96f` |
| 10 | `POST /v1/auth/token` | 200 | 38 | `qa-b48b8a59-3e31-4188-9843-b32b4e94f4a8` |
| 7 | `POST /v1/auth/token` | 200 | 49 | `qa-781e088b-89fb-4ae7-a71d-2143982044e5` |
| 4 | `POST /v1/auth/token` | 200 | 57 | `qa-ba0b60c8-cc9c-47fc-b60e-cf64ca942694` |
| 8 | `POST /v1/auth/token` | 200 | 51 | `qa-4d396efa-b538-4121-ac90-f5bb7a257cb0` |
| 11 | `POST /v1/auth/token` | 200 | 42 | `qa-ff165239-28e8-41cd-8cff-ca041174fb69` |
| 14 | `POST /v1/credits/purchases` | 201 | 39 | `qa-def498f6-e3e6-4b0e-8a38-89d8f56b613e` |
| 15 | `POST /v1/credits/purchases` | 201 | 40 | `qa-1dfa0d51-c0d2-40f5-8a5d-78dc1dff76aa` |
| 19 | `POST /v1/credits/purchases` | 201 | 19 | `qa-0e309b4e-d75a-426d-8728-b8bccc6032b3` |
| 16 | `POST /v1/credits/purchases` | 201 | 37 | `qa-cac1a418-f0b6-4d1a-9bd1-7b13bdfaf17f` |
| 17 | `POST /v1/credits/purchases` | 201 | 31 | `qa-732581ab-e677-4740-a748-07adf5bcf0ea` |
| 21 | `POST /v1/credits/purchases` | 201 | 18 | `qa-527833a5-bbe1-432a-80d1-5ceed0c06179` |
| 20 | `POST /v1/credits/purchases` | 201 | 21 | `qa-bc5ef42e-3729-484c-8120-9488e8008618` |
| 18 | `POST /v1/credits/purchases` | 201 | 32 | `qa-d9e8923b-4427-404a-b6f2-cd49bbe80228` |
| 12 | `POST /v1/credits/purchases` | 201 | 58 | `qa-8218ef46-d4a5-4e29-86a2-a131a5b1e297` |
| 13 | `POST /v1/credits/purchases` | 201 | 57 | `qa-e369a254-4998-4f5a-8c91-8696e14feb10` |
| 22 | `POST /v1/auth/token` | 200 | 15 | `qa-f44ee4c8-1604-46ec-97ee-161ccf82fb15` |
| 23 | `GET /v1/credits/ledger` | 200 | 42 | `qa-39a00b28-1efb-4971-86d4-da522715efbe` |
| 24 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-fe785ff2-d98e-4db3-9ef1-6ae160391aa3` |
| 25 | `POST /v1/auth/token` | 401 | 24 | `qa-a5d0302b-cb29-4eea-abea-7aa52a651880` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-be158e04-f682-4c75-9b82-ae889ec2fafe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be158e04-f682-4c75-9b82-ae889ec2fafe
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","displayName":"QA 74b851e3200c","password":"****","region":"us"}

--- response: 201 in 349 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-be158e04-f682-4c75-9b82-ae889ec2fafe
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
Location: /v1/accounts/qa-74b851e3200c
X-Served-Region: us
Content-Length: 181

{"id":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11","handle":"qa-74b851e3200c","displayName":"QA 74b851e3200c","region":"us","role":"user","createdAt":"2026-11-17T10:50:08.118744789Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-40547f08-afd5-45ac-875e-aec210072261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40547f08-afd5-45ac-875e-aec210072261
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 55 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-40547f08-afd5-45ac-875e-aec210072261
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f50cf374-0eac-4129-8330-6c1595a32248

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f50cf374-0eac-4129-8330-6c1595a32248
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 46 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f50cf374-0eac-4129-8330-6c1595a32248
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1deec761-f403-44ea-abea-e0774a8366d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1deec761-f403-44ea-abea-e0774a8366d2
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 53 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1deec761-f403-44ea-abea-e0774a8366d2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c2492eb-2994-4271-8d33-2452b6a63545

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c2492eb-2994-4271-8d33-2452b6a63545
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c2492eb-2994-4271-8d33-2452b6a63545
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4a356253-5e64-46e9-873d-d0cf2759c96f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a356253-5e64-46e9-873d-d0cf2759c96f
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a356253-5e64-46e9-873d-d0cf2759c96f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b48b8a59-3e31-4188-9843-b32b4e94f4a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b48b8a59-3e31-4188-9843-b32b4e94f4a8
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b48b8a59-3e31-4188-9843-b32b4e94f4a8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-781e088b-89fb-4ae7-a71d-2143982044e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-781e088b-89fb-4ae7-a71d-2143982044e5
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 49 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-781e088b-89fb-4ae7-a71d-2143982044e5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ba0b60c8-cc9c-47fc-b60e-cf64ca942694

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba0b60c8-cc9c-47fc-b60e-cf64ca942694
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 57 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba0b60c8-cc9c-47fc-b60e-cf64ca942694
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-4d396efa-b538-4121-ac90-f5bb7a257cb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d396efa-b538-4121-ac90-f5bb7a257cb0
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 51 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d396efa-b538-4121-ac90-f5bb7a257cb0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-ff165239-28e8-41cd-8cff-ca041174fb69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff165239-28e8-41cd-8cff-ca041174fb69
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff165239-28e8-41cd-8cff-ca041174fb69
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-def498f6-e3e6-4b0e-8a38-89d8f56b613e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f5b1422312c24d99830dc27008bbad20
X-Correlation-Id: qa-def498f6-e3e6-4b0e-8a38-89d8f56b613e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-def498f6-e3e6-4b0e-8a38-89d8f56b613e
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
Location: /v1/credits/purchases/pur_f2ce29ca-2d19-44f9-b240-58ec0fb14365
Content-Length: 144

{"id":"pur_f2ce29ca-2d19-44f9-b240-58ec0fb14365","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-17T10:50:08.590549952Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1dfa0d51-c0d2-40f5-8a5d-78dc1dff76aa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-105ca9d76fd6431baef57092f1b3aa4d
X-Correlation-Id: qa-1dfa0d51-c0d2-40f5-8a5d-78dc1dff76aa
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 40 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dfa0d51-c0d2-40f5-8a5d-78dc1dff76aa
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
Location: /v1/credits/purchases/pur_7d2e92a6-26d7-47ca-90de-8977eb887ac2
Content-Length: 144

{"id":"pur_7d2e92a6-26d7-47ca-90de-8977eb887ac2","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-17T10:50:08.590964480Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0e309b4e-d75a-426d-8728-b8bccc6032b3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d7a51a35b9184fdc8d3b4768271ffaa9
X-Correlation-Id: qa-0e309b4e-d75a-426d-8728-b8bccc6032b3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e309b4e-d75a-426d-8728-b8bccc6032b3
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
Location: /v1/credits/purchases/pur_0170bed8-74d1-4580-a62d-a7dbbeb9f204
Content-Length: 144

{"id":"pur_0170bed8-74d1-4580-a62d-a7dbbeb9f204","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-17T10:50:08.589911125Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cac1a418-f0b6-4d1a-9bd1-7b13bdfaf17f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3036f1c4644b46a69716b31913c4a178
X-Correlation-Id: qa-cac1a418-f0b6-4d1a-9bd1-7b13bdfaf17f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-cac1a418-f0b6-4d1a-9bd1-7b13bdfaf17f
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
Location: /v1/credits/purchases/pur_1c39bfbf-5117-4f4d-81f7-72434db68b39
Content-Length: 144

{"id":"pur_1c39bfbf-5117-4f4d-81f7-72434db68b39","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:08.588740912Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-732581ab-e677-4740-a748-07adf5bcf0ea

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7ff4ffe1b87345938096c778872b789a
X-Correlation-Id: qa-732581ab-e677-4740-a748-07adf5bcf0ea
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-732581ab-e677-4740-a748-07adf5bcf0ea
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
Location: /v1/credits/purchases/pur_07e35025-cc26-4d7b-8bdd-86b3de08cd81
Content-Length: 144

{"id":"pur_07e35025-cc26-4d7b-8bdd-86b3de08cd81","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-17T10:50:08.590572470Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-527833a5-bbe1-432a-80d1-5ceed0c06179

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9d98e013170b41949a480de503cd3247
X-Correlation-Id: qa-527833a5-bbe1-432a-80d1-5ceed0c06179
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-527833a5-bbe1-432a-80d1-5ceed0c06179
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
Location: /v1/credits/purchases/pur_5f3d8200-181a-4265-9779-8f94bee5f854
Content-Length: 145

{"id":"pur_5f3d8200-181a-4265-9779-8f94bee5f854","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-17T10:50:08.599536843Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bc5ef42e-3729-484c-8120-9488e8008618

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4380cc5a16724e8bad8da17cec66a6ce
X-Correlation-Id: qa-bc5ef42e-3729-484c-8120-9488e8008618
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc5ef42e-3729-484c-8120-9488e8008618
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
Location: /v1/credits/purchases/pur_af713ff5-40db-453c-92ed-2927730c66ba
Content-Length: 144

{"id":"pur_af713ff5-40db-453c-92ed-2927730c66ba","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-17T10:50:08.598053361Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d9e8923b-4427-404a-b6f2-cd49bbe80228

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9bc5aeb5aa31461ebb39d7ec73b77cc1
X-Correlation-Id: qa-d9e8923b-4427-404a-b6f2-cd49bbe80228
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9e8923b-4427-404a-b6f2-cd49bbe80228
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
Location: /v1/credits/purchases/pur_147c7baa-d56c-4b66-9426-fda4b15d823b
Content-Length: 144

{"id":"pur_147c7baa-d56c-4b66-9426-fda4b15d823b","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-17T10:50:08.598925923Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8218ef46-d4a5-4e29-86a2-a131a5b1e297

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6c6348846c0f46ca94cd825e497d14a9
X-Correlation-Id: qa-8218ef46-d4a5-4e29-86a2-a131a5b1e297
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-8218ef46-d4a5-4e29-86a2-a131a5b1e297
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
Location: /v1/credits/purchases/pur_a2e942d0-b789-4778-8839-577b0a9f6d4f
Content-Length: 144

{"id":"pur_a2e942d0-b789-4778-8839-577b0a9f6d4f","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-17T10:50:08.590588363Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e369a254-4998-4f5a-8c91-8696e14feb10

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8e871937649f4edfb10dcd3044b9e3b2
X-Correlation-Id: qa-e369a254-4998-4f5a-8c91-8696e14feb10
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 57 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e369a254-4998-4f5a-8c91-8696e14feb10
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
Location: /v1/credits/purchases/pur_2b4d3237-6f7b-4c4b-9358-ce41187a026c
Content-Length: 144

{"id":"pur_2b4d3237-6f7b-4c4b-9358-ce41187a026c","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-17T10:50:08.590624827Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-f44ee4c8-1604-46ec-97ee-161ccf82fb15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f44ee4c8-1604-46ec-97ee-161ccf82fb15
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f44ee4c8-1604-46ec-97ee-161ccf82fb15
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecb902d5-56be-4dd6-82ac-a467efb45f11"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-39a00b28-1efb-4971-86d4-da522715efbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39a00b28-1efb-4971-86d4-da522715efbe
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-39a00b28-1efb-4971-86d4-da522715efbe
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

{"items":[{"id":"led_72dd71aa-44de-4763-952b-10852daeef77","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-17T10:50:08.118942653Z"},{"id":"led_1477366b-af62-4542-8a16-b6d5dd7e0dce","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_1c39bfbf-5117-4f4d-81f7-72434db68b39","createdAt":"2026-11-17T10:50:08.588740912Z"},{"id":"led_db8562e9-d65c-43f8-8739-ef5059bcb8a5","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_0170bed8-74d1-4580-a62d-a7dbbeb9f204","createdAt":"2026-11-17T10:50:08.589911125Z"},{"id":"led_bf7c4459-724e-46ed-8aeb-4e78c8ee51dc","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_f2ce29ca-2d19-44f9-b240-58ec0fb14365","createdAt":"2026-11-17T10:50:08.590549952Z"},{"id":"led_38434d45-9f46-4450-b031-498579f1ed60","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_07e35025-cc26-4d7b-8bdd-86b3de08cd81","createdAt":"2026-11-17T10:50:08.590572470Z"},{"id":"led_ff7c60f2-c6cb-49d6-b977-a3833833a131","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_2b4d3237-6f7b-4c4b-9358-ce41187a026c","createdAt":"2026-11-17T10:50:08.590624827Z"},{"id":"led_1679cfea-6b05-4cf8-ab2c-7b5eeca36e39","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_7d2e92a6-26d7-47ca-90de-8977eb887ac2","createdAt":"2026-11-17T10:50:08.590964480Z"},{"id":"led_cd4fa6eb-da21-49fd-868b-b2c9353adba2","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_a2e942d0-b789-4778-8839-577b0a9f6d4f","createdAt":"2026-11-17T10:50:08.590588363Z"},{"id":"led_c9d35160-2d7c-4ae5-b8df-e3e7555b1acc","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_af713ff5-40db-453c-92ed-2927730c66ba","createdAt":"2026-11-17T10:50:08.598053361Z"},{"id":"led_0709c58f-3553-4164-8033-a1b277f55322","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_147c7baa-d56c-4b66-9426-fda4b15d823b","createdAt":"2026-11-17T10:50:08.598925923Z"},{"id":"led_58835820-b751-4005-81b3-81484f2d132e","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_5f3d8200-181a-4265-9779-8f94bee5f854","createdAt":"2026-11-17T10:50:08.599536843Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fe785ff2-d98e-4db3-9ef1-6ae160391aa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe785ff2-d98e-4db3-9ef1-6ae160391aa3
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fe785ff2-d98e-4db3-9ef1-6ae160391aa3
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
correlation: qa-a5d0302b-cb29-4eea-abea-7aa52a651880

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5d0302b-cb29-4eea-abea-7aa52a651880
Content-Type: application/json

--- request body ---
{"handle":"qa-74b851e3200c","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5d0302b-cb29-4eea-abea-7aa52a651880
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5d0302b-cb29-4eea-abea-7aa52a651880"}
```
