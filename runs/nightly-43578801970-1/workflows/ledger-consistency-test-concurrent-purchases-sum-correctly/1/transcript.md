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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-2d593248-4d39-4a92-ae67-55e316c59248` |
| 5 | `POST /v1/auth/token` | 200 | 18 | `qa-81709a47-4d2a-42c5-b67f-4262d98ff0b2` |
| 4 | `POST /v1/auth/token` | 200 | 47 | `qa-a2995e68-4ff7-45b5-a204-95d2916325dd` |
| 7 | `POST /v1/auth/token` | 200 | 43 | `qa-df6ce89d-130d-4920-bbef-077cc79f59e7` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-8373a302-cd58-48a5-8153-11a7b49d5d62` |
| 10 | `POST /v1/auth/token` | 200 | 36 | `qa-070e34ee-1637-42a7-a4ac-3ed9036bef8b` |
| 9 | `POST /v1/auth/token` | 200 | 39 | `qa-3211f4e4-d7cb-45fd-a197-fa42b53bc761` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-35fee537-cced-438b-8891-fcc1d49b54f1` |
| 2 | `POST /v1/auth/token` | 200 | 77 | `qa-b03a398b-dfa6-420e-b5a5-eb4049c5c884` |
| 12 | `POST /v1/credits/purchases` | 201 | 32 | `qa-bbaa8fda-eda9-41c8-b6c1-0c21d95228a0` |
| 8 | `POST /v1/auth/token` | 200 | 80 | `qa-44a8ba9a-2f69-408b-917d-c448a6cbfb70` |
| 15 | `POST /v1/credits/purchases` | 201 | 15 | `qa-f5a00ec4-7546-4e4e-b015-d64ccadaa733` |
| 13 | `POST /v1/credits/purchases` | 201 | 22 | `qa-bcabfbc3-93de-4b95-9318-57b580df8c0a` |
| 14 | `POST /v1/credits/purchases` | 201 | 21 | `qa-72029155-5e2a-42e4-9eb5-a5cf12c9ab95` |
| 16 | `POST /v1/credits/purchases` | 201 | 16 | `qa-4ae95a03-1dcf-43bd-8459-6e643e23fb39` |
| 11 | `POST /v1/auth/token` | 200 | 76 | `qa-e6fac98f-83b1-4511-b086-41240ebdf1fe` |
| 17 | `POST /v1/credits/purchases` | 201 | 25 | `qa-80dd4728-36a0-4abb-b08a-2f3c73f5b0ea` |
| 18 | `POST /v1/credits/purchases` | 201 | 23 | `qa-70c4569f-75d9-4c9f-9517-a4a316841acc` |
| 20 | `POST /v1/credits/purchases` | 201 | 15 | `qa-133b72d3-01e5-4e7f-a27f-6e10a9d43607` |
| 19 | `POST /v1/credits/purchases` | 201 | 21 | `qa-7849d43f-dffa-43e8-bda2-dbb52da0bcc8` |
| 21 | `POST /v1/credits/purchases` | 201 | 15 | `qa-42ad0b82-8fd5-4215-bb97-94103c3cfd6b` |
| 22 | `POST /v1/auth/token` | 200 | 11 | `qa-a30c0c80-63c0-41f2-b481-10a4d79e1ab7` |
| 23 | `GET /v1/credits/ledger` | 200 | 31 | `qa-60577f81-17d9-4ef1-b4b8-3d712525fbfa` |
| 24 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-43f51ea8-d869-41ae-8104-64c803761be7` |
| 25 | `POST /v1/auth/token` | 401 | 6 | `qa-cbf40cc2-19f5-496b-9548-f49a7462ed49` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d593248-4d39-4a92-ae67-55e316c59248

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d593248-4d39-4a92-ae67-55e316c59248
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","displayName":"QA c9c7f5370791","password":"****","region":"us"}

--- response: 201 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d593248-4d39-4a92-ae67-55e316c59248
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-c9c7f5370791
X-Served-Region: us
Content-Length: 181

{"id":"acc_8721e748-b33c-4202-b4dd-952b89c8d538","handle":"qa-c9c7f5370791","displayName":"QA c9c7f5370791","region":"us","role":"user","createdAt":"2026-11-14T09:05:19.989021456Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-81709a47-4d2a-42c5-b67f-4262d98ff0b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81709a47-4d2a-42c5-b67f-4262d98ff0b2
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-81709a47-4d2a-42c5-b67f-4262d98ff0b2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a2995e68-4ff7-45b5-a204-95d2916325dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2995e68-4ff7-45b5-a204-95d2916325dd
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2995e68-4ff7-45b5-a204-95d2916325dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-df6ce89d-130d-4920-bbef-077cc79f59e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df6ce89d-130d-4920-bbef-077cc79f59e7
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-df6ce89d-130d-4920-bbef-077cc79f59e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8373a302-cd58-48a5-8153-11a7b49d5d62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8373a302-cd58-48a5-8153-11a7b49d5d62
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8373a302-cd58-48a5-8153-11a7b49d5d62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-070e34ee-1637-42a7-a4ac-3ed9036bef8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-070e34ee-1637-42a7-a4ac-3ed9036bef8b
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-070e34ee-1637-42a7-a4ac-3ed9036bef8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3211f4e4-d7cb-45fd-a197-fa42b53bc761

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3211f4e4-d7cb-45fd-a197-fa42b53bc761
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3211f4e4-d7cb-45fd-a197-fa42b53bc761
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-35fee537-cced-438b-8891-fcc1d49b54f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35fee537-cced-438b-8891-fcc1d49b54f1
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-35fee537-cced-438b-8891-fcc1d49b54f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b03a398b-dfa6-420e-b5a5-eb4049c5c884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b03a398b-dfa6-420e-b5a5-eb4049c5c884
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 77 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b03a398b-dfa6-420e-b5a5-eb4049c5c884
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bbaa8fda-eda9-41c8-b6c1-0c21d95228a0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-93c72f634e8d4f3bb598ffe9c7a5c087
X-Correlation-Id: qa-bbaa8fda-eda9-41c8-b6c1-0c21d95228a0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbaa8fda-eda9-41c8-b6c1-0c21d95228a0
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
Location: /v1/credits/purchases/pur_79d0f70c-4823-4eda-b4f4-8e2a7b9b6305
Content-Length: 144

{"id":"pur_79d0f70c-4823-4eda-b4f4-8e2a7b9b6305","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:20.085488778Z"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-44a8ba9a-2f69-408b-917d-c448a6cbfb70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44a8ba9a-2f69-408b-917d-c448a6cbfb70
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 80 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-44a8ba9a-2f69-408b-917d-c448a6cbfb70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f5a00ec4-7546-4e4e-b015-d64ccadaa733

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2c768404cba343c08e294767a3e19b11
X-Correlation-Id: qa-f5a00ec4-7546-4e4e-b015-d64ccadaa733
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5a00ec4-7546-4e4e-b015-d64ccadaa733
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
Location: /v1/credits/purchases/pur_02eb0734-aae9-4235-bf51-6c16c4403777
Content-Length: 144

{"id":"pur_02eb0734-aae9-4235-bf51-6c16c4403777","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-14T09:05:20.090853057Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bcabfbc3-93de-4b95-9318-57b580df8c0a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9364e313fe8e4ac094b8fff3c923be9a
X-Correlation-Id: qa-bcabfbc3-93de-4b95-9318-57b580df8c0a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcabfbc3-93de-4b95-9318-57b580df8c0a
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
Location: /v1/credits/purchases/pur_6f449801-ecd3-40ad-918d-603380416076
Content-Length: 144

{"id":"pur_6f449801-ecd3-40ad-918d-603380416076","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-14T09:05:20.096143489Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-72029155-5e2a-42e4-9eb5-a5cf12c9ab95

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5043a674d9bd4fc0b9c58c448187dfc4
X-Correlation-Id: qa-72029155-5e2a-42e4-9eb5-a5cf12c9ab95
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-72029155-5e2a-42e4-9eb5-a5cf12c9ab95
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
Location: /v1/credits/purchases/pur_466e92b6-9939-449d-a754-c072c32430cf
Content-Length: 144

{"id":"pur_466e92b6-9939-449d-a754-c072c32430cf","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-14T09:05:20.095344056Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4ae95a03-1dcf-43bd-8459-6e643e23fb39

--- request headers ---
Accept: application/json
Idempotency-Key: qa-47bb90a796ab434ca0cc73e2f78e45f9
X-Correlation-Id: qa-4ae95a03-1dcf-43bd-8459-6e643e23fb39
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ae95a03-1dcf-43bd-8459-6e643e23fb39
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
Location: /v1/credits/purchases/pur_5d3376e9-8c9d-4580-9831-c520d99209b9
Content-Length: 144

{"id":"pur_5d3376e9-8c9d-4580-9831-c520d99209b9","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-14T09:05:20.097277045Z"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-e6fac98f-83b1-4511-b086-41240ebdf1fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6fac98f-83b1-4511-b086-41240ebdf1fe
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 76 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6fac98f-83b1-4511-b086-41240ebdf1fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-80dd4728-36a0-4abb-b08a-2f3c73f5b0ea

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0443a01d72de40938d58124fae16098b
X-Correlation-Id: qa-80dd4728-36a0-4abb-b08a-2f3c73f5b0ea
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-80dd4728-36a0-4abb-b08a-2f3c73f5b0ea
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
Location: /v1/credits/purchases/pur_5e3a1824-8468-4ee5-9454-339611022c3d
Content-Length: 144

{"id":"pur_5e3a1824-8468-4ee5-9454-339611022c3d","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-14T09:05:20.107257927Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-70c4569f-75d9-4c9f-9517-a4a316841acc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-20c5ddfe06614f99a697d8af775bf642
X-Correlation-Id: qa-70c4569f-75d9-4c9f-9517-a4a316841acc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-70c4569f-75d9-4c9f-9517-a4a316841acc
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
Location: /v1/credits/purchases/pur_769e5cd6-45ec-4069-8a20-6bd09f53fe22
Content-Length: 144

{"id":"pur_769e5cd6-45ec-4069-8a20-6bd09f53fe22","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-14T09:05:20.107712164Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-133b72d3-01e5-4e7f-a27f-6e10a9d43607

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0ee9adf481114f4e9886829f8d69b889
X-Correlation-Id: qa-133b72d3-01e5-4e7f-a27f-6e10a9d43607
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-133b72d3-01e5-4e7f-a27f-6e10a9d43607
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
Location: /v1/credits/purchases/pur_77959561-f5de-4498-bb83-fe292df5add6
Content-Length: 144

{"id":"pur_77959561-f5de-4498-bb83-fe292df5add6","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-14T09:05:20.115139097Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7849d43f-dffa-43e8-bda2-dbb52da0bcc8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-091fe1dac9be4fe8b3e577aa7bc0ebab
X-Correlation-Id: qa-7849d43f-dffa-43e8-bda2-dbb52da0bcc8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-7849d43f-dffa-43e8-bda2-dbb52da0bcc8
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
Location: /v1/credits/purchases/pur_c2e9cb36-3fbc-4ccd-9b13-410c277d5af3
Content-Length: 144

{"id":"pur_c2e9cb36-3fbc-4ccd-9b13-410c277d5af3","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-14T09:05:20.107507683Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-42ad0b82-8fd5-4215-bb97-94103c3cfd6b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-78a3015719ae4de8a5c847ccd70ce030
X-Correlation-Id: qa-42ad0b82-8fd5-4215-bb97-94103c3cfd6b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-42ad0b82-8fd5-4215-bb97-94103c3cfd6b
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
Location: /v1/credits/purchases/pur_56489d30-6468-4e54-80d5-12a01f6d2ecc
Content-Length: 145

{"id":"pur_56489d30-6468-4e54-80d5-12a01f6d2ecc","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-14T09:05:20.126529942Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-a30c0c80-63c0-41f2-b481-10a4d79e1ab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a30c0c80-63c0-41f2-b481-10a4d79e1ab7
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a30c0c80-63c0-41f2-b481-10a4d79e1ab7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8721e748-b33c-4202-b4dd-952b89c8d538"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-60577f81-17d9-4ef1-b4b8-3d712525fbfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60577f81-17d9-4ef1-b4b8-3d712525fbfa
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-60577f81-17d9-4ef1-b4b8-3d712525fbfa
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

{"items":[{"id":"led_7182a7cd-1b23-4ecd-b8c9-09b21690cf99","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-14T09:05:19.989031414Z"},{"id":"led_56443e15-ab79-4353-824f-c5f4e161d985","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_79d0f70c-4823-4eda-b4f4-8e2a7b9b6305","createdAt":"2026-11-14T09:05:20.085488778Z"},{"id":"led_6597eedc-d3ce-41d5-b646-3ad80da66995","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_02eb0734-aae9-4235-bf51-6c16c4403777","createdAt":"2026-11-14T09:05:20.090853057Z"},{"id":"led_e42858a8-dba5-414a-9c0b-ba3c362b151a","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_466e92b6-9939-449d-a754-c072c32430cf","createdAt":"2026-11-14T09:05:20.095344056Z"},{"id":"led_b6238b81-4695-46c8-bcd7-83bb15b37e2d","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_6f449801-ecd3-40ad-918d-603380416076","createdAt":"2026-11-14T09:05:20.096143489Z"},{"id":"led_d81e0397-4a5c-4b61-a7ac-6e3b41354a01","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_5d3376e9-8c9d-4580-9831-c520d99209b9","createdAt":"2026-11-14T09:05:20.097277045Z"},{"id":"led_f2ec3fac-ae5e-4114-9498-24ccf0a7af66","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_5e3a1824-8468-4ee5-9454-339611022c3d","createdAt":"2026-11-14T09:05:20.107257927Z"},{"id":"led_213e14d8-7651-4da3-990a-781f1cb1d683","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_c2e9cb36-3fbc-4ccd-9b13-410c277d5af3","createdAt":"2026-11-14T09:05:20.107507683Z"},{"id":"led_1bef6be2-a40b-4397-bfbd-5d027644b4d6","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_769e5cd6-45ec-4069-8a20-6bd09f53fe22","createdAt":"2026-11-14T09:05:20.107712164Z"},{"id":"led_cf9b8508-2339-4444-aa80-1bd8b80e0bd6","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_77959561-f5de-4498-bb83-fe292df5add6","createdAt":"2026-11-14T09:05:20.115139097Z"},{"id":"led_30a8d6c9-18a8-4158-b7df-844513870b6b","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_56489d30-6468-4e54-80d5-12a01f6d2ecc","createdAt":"2026-11-14T09:05:20.126529942Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43f51ea8-d869-41ae-8104-64c803761be7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43f51ea8-d869-41ae-8104-64c803761be7
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43f51ea8-d869-41ae-8104-64c803761be7
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
correlation: qa-cbf40cc2-19f5-496b-9548-f49a7462ed49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbf40cc2-19f5-496b-9548-f49a7462ed49
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c7f5370791","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbf40cc2-19f5-496b-9548-f49a7462ed49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbf40cc2-19f5-496b-9548-f49a7462ed49"}
```
