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
| 1 | `POST /v1/accounts` | 201 | 353 | `qa-065e238c-5f2d-4021-9c28-0e153fa9bd58` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-732c1ac0-bfe2-4f77-8687-de91dcaf1c6e` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-9b5da47f-f2c1-4790-bb42-83d0d1700452` |
| 4 | `POST /v1/credits/purchases` | 201 | 44 | `qa-5ac641a7-0596-49a3-94c9-2706d76bea01` |
| 5 | `POST /v1/credits/purchases` | 201 | 11 | `qa-848e029f-fae0-4c93-b829-c6a3f85fb9f5` |
| 6 | `POST /v1/conversations` | 201 | 9 | `qa-eedf6531-a350-4554-a084-8ca22934869b` |
| 7 | `GET /v1/credits/ledger` | 200 | 44 | `qa-78ee6559-0165-446b-9f6f-a4244f279e71` |
| 8 | `GET /v1/credits/balance` | 200 | 12 | `qa-a1cacafb-6b03-462f-970d-6d346bb141fa` |
| 9 | `POST /v1/auth/token` | 200 | 24 | `qa-538e5088-38f2-40c6-89d4-bb444597df82` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-4e87c362-6417-45e2-9baf-3a0e0283c27c` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-113ccd81-186a-4c2f-bee5-988c2479a22a` |
| 12 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-efc5c135-17c7-461e-b51c-515b3f23cdbb` |
| 13 | `POST /v1/auth/token` | 401 | 8 | `qa-289e3fa3-b45b-484b-ae1f-2b77e1d4059b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-065e238c-5f2d-4021-9c28-0e153fa9bd58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-065e238c-5f2d-4021-9c28-0e153fa9bd58
Content-Type: application/json

--- request body ---
{"handle":"qa-6bc3f2753a2f","displayName":"QA 6bc3f2753a2f","password":"****","region":"eu"}

--- response: 201 in 353 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-065e238c-5f2d-4021-9c28-0e153fa9bd58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-6bc3f2753a2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d07c2197-ccde-4819-aafd-924dd8e7628f","handle":"qa-6bc3f2753a2f","displayName":"QA 6bc3f2753a2f","region":"eu","role":"user","createdAt":"2026-11-08T09:09:09.461969847Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-732c1ac0-bfe2-4f77-8687-de91dcaf1c6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-732c1ac0-bfe2-4f77-8687-de91dcaf1c6e
Content-Type: application/json

--- request body ---
{"handle":"qa-32acc9974daf","displayName":"QA 32acc9974daf","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-732c1ac0-bfe2-4f77-8687-de91dcaf1c6e
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
Location: /v1/accounts/qa-32acc9974daf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_03c4daff-cad7-402b-a993-6cf8399dc823","handle":"qa-32acc9974daf","displayName":"QA 32acc9974daf","region":"eu","role":"user","createdAt":"2026-11-08T09:09:09.820505105Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9b5da47f-f2c1-4790-bb42-83d0d1700452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b5da47f-f2c1-4790-bb42-83d0d1700452
Content-Type: application/json

--- request body ---
{"handle":"qa-6bc3f2753a2f","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b5da47f-f2c1-4790-bb42-83d0d1700452
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d07c2197-ccde-4819-aafd-924dd8e7628f"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5ac641a7-0596-49a3-94c9-2706d76bea01

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f172f125e2264b6b9b6ce42e0883ceaf
X-Correlation-Id: qa-5ac641a7-0596-49a3-94c9-2706d76bea01
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ac641a7-0596-49a3-94c9-2706d76bea01
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
Location: /v1/credits/purchases/pur_f66d0604-458e-4f07-80bb-1dcf73af0037
Content-Length: 144

{"id":"pur_f66d0604-458e-4f07-80bb-1dcf73af0037","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:09.982570893Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-848e029f-fae0-4c93-b829-c6a3f85fb9f5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0d49caac1f394a219ec75e7e8e3d5299
X-Correlation-Id: qa-848e029f-fae0-4c93-b829-c6a3f85fb9f5
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-848e029f-fae0-4c93-b829-c6a3f85fb9f5
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
Location: /v1/credits/purchases/pur_ae582c8f-ed35-4d85-ad26-25a177fd942c
Content-Length: 144

{"id":"pur_ae582c8f-ed35-4d85-ad26-25a177fd942c","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-08T09:09:10.038268700Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-eedf6531-a350-4554-a084-8ca22934869b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eedf6531-a350-4554-a084-8ca22934869b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-32acc9974daf","subject":"Paid message","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-eedf6531-a350-4554-a084-8ca22934869b
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
Location: /v1/conversations/cnv_37559b3e-5fba-412b-98bc-71f958606f40
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_37559b3e-5fba-412b-98bc-71f958606f40","subject":"Paid message","status":"open","region":"eu","participants":["qa-6bc3f2753a2f","qa-32acc9974daf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:10.056712183Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-78ee6559-0165-446b-9f6f-a4244f279e71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78ee6559-0165-446b-9f6f-a4244f279e71
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-78ee6559-0165-446b-9f6f-a4244f279e71
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

{"items":[{"id":"led_97d53b5f-fe21-493a-a14e-9d8d5625266b","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-08T09:09:09.462309780Z"},{"id":"led_1f27658b-df05-43ad-acd0-36fc4c9be6e4","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_f66d0604-458e-4f07-80bb-1dcf73af0037","createdAt":"2026-11-08T09:09:09.982570893Z"},{"id":"led_daf65fd7-a8fe-4e7d-85f2-36fd77171fad","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_ae582c8f-ed35-4d85-ad26-25a177fd942c","createdAt":"2026-11-08T09:09:10.038268700Z"},{"id":"led_8d5cbc1f-5eec-4ece-9c22-b6b83e7f0f82","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_37559b3e-5fba-412b-98bc-71f958606f40","createdAt":"2026-11-08T09:09:10.056675988Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-a1cacafb-6b03-462f-970d-6d346bb141fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1cacafb-6b03-462f-970d-6d346bb141fa
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1cacafb-6b03-462f-970d-6d346bb141fa
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

{"balance":64,"currency":"credits","accountId":"acc_d07c2197-ccde-4819-aafd-924dd8e7628f"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-538e5088-38f2-40c6-89d4-bb444597df82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-538e5088-38f2-40c6-89d4-bb444597df82
Content-Type: application/json

--- request body ---
{"handle":"qa-32acc9974daf","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-538e5088-38f2-40c6-89d4-bb444597df82
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_03c4daff-cad7-402b-a993-6cf8399dc823"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e87c362-6417-45e2-9baf-3a0e0283c27c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e87c362-6417-45e2-9baf-3a0e0283c27c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e87c362-6417-45e2-9baf-3a0e0283c27c
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
correlation: qa-113ccd81-186a-4c2f-bee5-988c2479a22a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-113ccd81-186a-4c2f-bee5-988c2479a22a
Content-Type: application/json

--- request body ---
{"handle":"qa-32acc9974daf","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-113ccd81-186a-4c2f-bee5-988c2479a22a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-113ccd81-186a-4c2f-bee5-988c2479a22a"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-efc5c135-17c7-461e-b51c-515b3f23cdbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efc5c135-17c7-461e-b51c-515b3f23cdbb
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-efc5c135-17c7-461e-b51c-515b3f23cdbb
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
correlation: qa-289e3fa3-b45b-484b-ae1f-2b77e1d4059b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-289e3fa3-b45b-484b-ae1f-2b77e1d4059b
Content-Type: application/json

--- request body ---
{"handle":"qa-6bc3f2753a2f","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-289e3fa3-b45b-484b-ae1f-2b77e1d4059b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-289e3fa3-b45b-484b-ae1f-2b77e1d4059b"}
```
