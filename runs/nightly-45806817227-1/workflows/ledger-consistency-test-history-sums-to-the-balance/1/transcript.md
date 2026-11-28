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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-f9a0418a-9ad0-477c-8383-933bb24a5b74` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-f1c064c8-a1bb-4d67-b4a8-9034ba0abd79` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-47ca9efa-aef2-444a-a556-1cd612ad945f` |
| 4 | `POST /v1/credits/purchases` | 201 | 5 | `qa-a54e0698-be03-43a3-8288-d379af8458cc` |
| 5 | `POST /v1/credits/purchases` | 201 | 13 | `qa-a3d00976-d418-4c91-8a94-149d72d1581c` |
| 6 | `POST /v1/conversations` | 201 | 17 | `qa-0bf648e7-5667-420c-9fc7-85c02ab2891e` |
| 7 | `GET /v1/credits/ledger` | 200 | 8 | `qa-52849f07-6fe6-44c0-b399-5d669703f06a` |
| 8 | `GET /v1/credits/balance` | 200 | 17 | `qa-e6da75d2-4a83-4168-92d7-3308c9c71af7` |
| 9 | `POST /v1/auth/token` | 200 | 11 | `qa-04dc6fa9-54ed-456d-95ce-dbfe5e568cf0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-2f45d358-82d2-49a5-9c35-2184a3dd83a9` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-4aa5c5c6-8578-48ac-bd4b-28fc6f8f5dd5` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-46ddddfb-1607-4311-b86c-7c3265e1d91f` |
| 13 | `POST /v1/auth/token` | 401 | 6 | `qa-fac09f76-0dcb-4bd5-9eb3-760e624b5907` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f9a0418a-9ad0-477c-8383-933bb24a5b74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9a0418a-9ad0-477c-8383-933bb24a5b74
Content-Type: application/json

--- request body ---
{"handle":"qa-b37fd1a93313","displayName":"QA b37fd1a93313","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9a0418a-9ad0-477c-8383-933bb24a5b74
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
Location: /v1/accounts/qa-b37fd1a93313
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ade578f-4d12-4613-99d6-d7e9877d64a9","handle":"qa-b37fd1a93313","displayName":"QA b37fd1a93313","region":"eu","role":"user","createdAt":"2026-11-26T11:02:32.371277499Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f1c064c8-a1bb-4d67-b4a8-9034ba0abd79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1c064c8-a1bb-4d67-b4a8-9034ba0abd79
Content-Type: application/json

--- request body ---
{"handle":"qa-72f498d9a2aa","displayName":"QA 72f498d9a2aa","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1c064c8-a1bb-4d67-b4a8-9034ba0abd79
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
Location: /v1/accounts/qa-72f498d9a2aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c0acecb-d57a-4503-a48f-2b80fb6a4324","handle":"qa-72f498d9a2aa","displayName":"QA 72f498d9a2aa","region":"eu","role":"user","createdAt":"2026-11-26T11:02:32.418904190Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-47ca9efa-aef2-444a-a556-1cd612ad945f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47ca9efa-aef2-444a-a556-1cd612ad945f
Content-Type: application/json

--- request body ---
{"handle":"qa-b37fd1a93313","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-47ca9efa-aef2-444a-a556-1cd612ad945f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ade578f-4d12-4613-99d6-d7e9877d64a9"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a54e0698-be03-43a3-8288-d379af8458cc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8172978271ab4366a48869591941f33a
X-Correlation-Id: qa-a54e0698-be03-43a3-8288-d379af8458cc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a54e0698-be03-43a3-8288-d379af8458cc
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
Location: /v1/credits/purchases/pur_7e09a192-1f01-4337-86e8-e184b117c865
Content-Length: 144

{"id":"pur_7e09a192-1f01-4337-86e8-e184b117c865","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:32.475632735Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a3d00976-d418-4c91-8a94-149d72d1581c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-80e21292fbf24b8bbf37a64a6da40009
X-Correlation-Id: qa-a3d00976-d418-4c91-8a94-149d72d1581c
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3d00976-d418-4c91-8a94-149d72d1581c
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
Location: /v1/credits/purchases/pur_b44fc059-b5be-4007-a000-68eb545718e0
Content-Length: 144

{"id":"pur_b44fc059-b5be-4007-a000-68eb545718e0","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-26T11:02:32.488969087Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-0bf648e7-5667-420c-9fc7-85c02ab2891e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bf648e7-5667-420c-9fc7-85c02ab2891e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-72f498d9a2aa","subject":"Paid message","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bf648e7-5667-420c-9fc7-85c02ab2891e
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
Location: /v1/conversations/cnv_e8e34878-39eb-414f-a908-2aae503b6c60
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_e8e34878-39eb-414f-a908-2aae503b6c60","subject":"Paid message","status":"open","region":"eu","participants":["qa-b37fd1a93313","qa-72f498d9a2aa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:32.514628425Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-52849f07-6fe6-44c0-b399-5d669703f06a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52849f07-6fe6-44c0-b399-5d669703f06a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-52849f07-6fe6-44c0-b399-5d669703f06a
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

{"items":[{"id":"led_ae802e39-747e-4bcd-8067-8d94b4c42ec7","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-26T11:02:32.371293092Z"},{"id":"led_1a7a76c9-e7c1-4f7b-ac82-a6650ab1b987","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_7e09a192-1f01-4337-86e8-e184b117c865","createdAt":"2026-11-26T11:02:32.475632735Z"},{"id":"led_324f5221-39c6-415f-b048-62448e2dae4c","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_b44fc059-b5be-4007-a000-68eb545718e0","createdAt":"2026-11-26T11:02:32.488969087Z"},{"id":"led_a4194466-236d-4967-92e0-7f3acd46dbe4","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_e8e34878-39eb-414f-a908-2aae503b6c60","createdAt":"2026-11-26T11:02:32.514605711Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-e6da75d2-4a83-4168-92d7-3308c9c71af7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6da75d2-4a83-4168-92d7-3308c9c71af7
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6da75d2-4a83-4168-92d7-3308c9c71af7
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

{"balance":64,"currency":"credits","accountId":"acc_5ade578f-4d12-4613-99d6-d7e9877d64a9"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-04dc6fa9-54ed-456d-95ce-dbfe5e568cf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04dc6fa9-54ed-456d-95ce-dbfe5e568cf0
Content-Type: application/json

--- request body ---
{"handle":"qa-72f498d9a2aa","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-04dc6fa9-54ed-456d-95ce-dbfe5e568cf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c0acecb-d57a-4503-a48f-2b80fb6a4324"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f45d358-82d2-49a5-9c35-2184a3dd83a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f45d358-82d2-49a5-9c35-2184a3dd83a9
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f45d358-82d2-49a5-9c35-2184a3dd83a9
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
correlation: qa-4aa5c5c6-8578-48ac-bd4b-28fc6f8f5dd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aa5c5c6-8578-48ac-bd4b-28fc6f8f5dd5
Content-Type: application/json

--- request body ---
{"handle":"qa-72f498d9a2aa","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4aa5c5c6-8578-48ac-bd4b-28fc6f8f5dd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4aa5c5c6-8578-48ac-bd4b-28fc6f8f5dd5"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46ddddfb-1607-4311-b86c-7c3265e1d91f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46ddddfb-1607-4311-b86c-7c3265e1d91f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46ddddfb-1607-4311-b86c-7c3265e1d91f
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
correlation: qa-fac09f76-0dcb-4bd5-9eb3-760e624b5907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fac09f76-0dcb-4bd5-9eb3-760e624b5907
Content-Type: application/json

--- request body ---
{"handle":"qa-b37fd1a93313","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fac09f76-0dcb-4bd5-9eb3-760e624b5907
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fac09f76-0dcb-4bd5-9eb3-760e624b5907"}
```
