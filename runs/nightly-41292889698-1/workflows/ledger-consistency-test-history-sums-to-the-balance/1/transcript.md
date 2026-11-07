# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 502 | `qa-7e81597d-6e9d-44cc-a391-0983a321730a` |
| 2 | `POST /v1/accounts` | 201 | 105 | `qa-35fc74ef-e0a5-425d-827b-11991e16a227` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-db48d2ef-3449-41ca-b5bd-5febcc443048` |
| 4 | `POST /v1/credits/purchases` | 201 | 62 | `qa-7edffc4f-123f-418c-ba84-03289f1e2656` |
| 5 | `POST /v1/credits/purchases` | 201 | 39 | `qa-1e785e2e-30c4-4cfe-a3d3-6029a2abc450` |
| 6 | `POST /v1/conversations` | 201 | 13 | `qa-8ec6c525-4f0a-4b2b-a462-274c4e07855c` |
| 7 | `GET /v1/credits/ledger` | 200 | 22 | `qa-7cc68621-262c-494e-aaed-da5859f94367` |
| 8 | `GET /v1/credits/balance` | 200 | 11 | `qa-7bb88756-bdf9-48e2-a346-56c01bbb18da` |
| 9 | `POST /v1/auth/token` | 200 | 22 | `qa-53e7ba9f-f50e-41bd-8f98-a672fe8d8ae7` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0188ef24-b49a-438c-b09f-a982fce7c698` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-508756b5-0a79-4298-856d-987f7f15a6f8` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-09cc9c01-b3da-4121-8a4e-79c12f32e8f0` |
| 13 | `POST /v1/auth/token` | 401 | 16 | `qa-27368761-8d7b-46d9-bb74-0007c3604d96` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7e81597d-6e9d-44cc-a391-0983a321730a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e81597d-6e9d-44cc-a391-0983a321730a
Content-Type: application/json

--- request body ---
{"handle":"qa-73960948d82d","displayName":"QA 73960948d82d","password":"****","region":"eu"}

--- response: 201 in 502 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e81597d-6e9d-44cc-a391-0983a321730a
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
Location: /v1/accounts/qa-73960948d82d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a23ca20-65e6-4692-958f-6c0760b1aeb9","handle":"qa-73960948d82d","displayName":"QA 73960948d82d","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.677063412Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-35fc74ef-e0a5-425d-827b-11991e16a227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35fc74ef-e0a5-425d-827b-11991e16a227
Content-Type: application/json

--- request body ---
{"handle":"qa-595ce56cbef5","displayName":"QA 595ce56cbef5","password":"****","region":"eu"}

--- response: 201 in 105 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-35fc74ef-e0a5-425d-827b-11991e16a227
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
Location: /v1/accounts/qa-595ce56cbef5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9990af52-b242-4505-b036-84e1178e05c7","handle":"qa-595ce56cbef5","displayName":"QA 595ce56cbef5","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.148610109Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-db48d2ef-3449-41ca-b5bd-5febcc443048

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db48d2ef-3449-41ca-b5bd-5febcc443048
Content-Type: application/json

--- request body ---
{"handle":"qa-73960948d82d","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-db48d2ef-3449-41ca-b5bd-5febcc443048
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a23ca20-65e6-4692-958f-6c0760b1aeb9"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7edffc4f-123f-418c-ba84-03289f1e2656

--- request headers ---
Accept: application/json
Idempotency-Key: qa-846e236281b14102a13ab3472074bef6
X-Correlation-Id: qa-7edffc4f-123f-418c-ba84-03289f1e2656
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 62 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7edffc4f-123f-418c-ba84-03289f1e2656
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
Location: /v1/credits/purchases/pur_23f11347-722c-4897-a33e-dd457f409015
Content-Length: 144

{"id":"pur_23f11347-722c-4897-a33e-dd457f409015","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:24.317623833Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1e785e2e-30c4-4cfe-a3d3-6029a2abc450

--- request headers ---
Accept: application/json
Idempotency-Key: qa-72de6c993bb141c0bdd463657d7f2739
X-Correlation-Id: qa-1e785e2e-30c4-4cfe-a3d3-6029a2abc450
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 39 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e785e2e-30c4-4cfe-a3d3-6029a2abc450
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
Location: /v1/credits/purchases/pur_93004a81-4366-4fab-a781-ecb9fc6a5f14
Content-Length: 144

{"id":"pur_93004a81-4366-4fab-a781-ecb9fc6a5f14","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-01T09:23:24.424064253Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-8ec6c525-4f0a-4b2b-a462-274c4e07855c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ec6c525-4f0a-4b2b-a462-274c4e07855c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-595ce56cbef5","subject":"Paid message","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ec6c525-4f0a-4b2b-a462-274c4e07855c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_3ce61a24-0dcc-47dd-afb2-46783c66d0d3
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_3ce61a24-0dcc-47dd-afb2-46783c66d0d3","subject":"Paid message","status":"open","region":"eu","participants":["qa-73960948d82d","qa-595ce56cbef5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.465637950Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-7cc68621-262c-494e-aaed-da5859f94367

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cc68621-262c-494e-aaed-da5859f94367
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cc68621-262c-494e-aaed-da5859f94367
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 791

{"items":[{"id":"led_3489b24e-925d-48c3-882d-7ebffdc9314f","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-01T09:23:23.677072659Z"},{"id":"led_54ceba76-668e-438c-a765-616d01e18d5a","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_23f11347-722c-4897-a33e-dd457f409015","createdAt":"2026-11-01T09:23:24.317623833Z"},{"id":"led_a5c0f6ee-2479-46a2-97c7-8ab27e2fd4f6","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_93004a81-4366-4fab-a781-ecb9fc6a5f14","createdAt":"2026-11-01T09:23:24.424064253Z"},{"id":"led_2d3b0f70-7e12-4f09-ace1-4a7f49bfbcab","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_3ce61a24-0dcc-47dd-afb2-46783c66d0d3","createdAt":"2026-11-01T09:23:24.465617501Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-7bb88756-bdf9-48e2-a346-56c01bbb18da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bb88756-bdf9-48e2-a346-56c01bbb18da
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bb88756-bdf9-48e2-a346-56c01bbb18da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_2a23ca20-65e6-4692-958f-6c0760b1aeb9"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-53e7ba9f-f50e-41bd-8f98-a672fe8d8ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53e7ba9f-f50e-41bd-8f98-a672fe8d8ae7
Content-Type: application/json

--- request body ---
{"handle":"qa-595ce56cbef5","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-53e7ba9f-f50e-41bd-8f98-a672fe8d8ae7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9990af52-b242-4505-b036-84e1178e05c7"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0188ef24-b49a-438c-b09f-a982fce7c698

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0188ef24-b49a-438c-b09f-a982fce7c698
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0188ef24-b49a-438c-b09f-a982fce7c698
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-508756b5-0a79-4298-856d-987f7f15a6f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-508756b5-0a79-4298-856d-987f7f15a6f8
Content-Type: application/json

--- request body ---
{"handle":"qa-595ce56cbef5","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-508756b5-0a79-4298-856d-987f7f15a6f8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-508756b5-0a79-4298-856d-987f7f15a6f8"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09cc9c01-b3da-4121-8a4e-79c12f32e8f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09cc9c01-b3da-4121-8a4e-79c12f32e8f0
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09cc9c01-b3da-4121-8a4e-79c12f32e8f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-27368761-8d7b-46d9-bb74-0007c3604d96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27368761-8d7b-46d9-bb74-0007c3604d96
Content-Type: application/json

--- request body ---
{"handle":"qa-73960948d82d","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27368761-8d7b-46d9-bb74-0007c3604d96
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27368761-8d7b-46d9-bb74-0007c3604d96"}
```
