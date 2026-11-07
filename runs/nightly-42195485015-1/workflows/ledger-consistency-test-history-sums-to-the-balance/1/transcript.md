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
| 1 | `POST /v1/accounts` | 201 | 478 | `qa-feda6027-c094-4c21-b4a1-b701befb9a3d` |
| 2 | `POST /v1/accounts` | 201 | 73 | `qa-65d7ba2e-97a7-422a-bc76-aef113875f9b` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-2ae6b1b9-3f0e-4b58-a0fd-29cf43644c64` |
| 4 | `POST /v1/credits/purchases` | 201 | 77 | `qa-c01b3254-dd40-4276-9d5e-11398e136e07` |
| 5 | `POST /v1/credits/purchases` | 201 | 22 | `qa-39a8316a-10ab-41f7-98f0-02f250b92731` |
| 6 | `POST /v1/conversations` | 201 | 12 | `qa-4a13cf08-bf69-40db-86d3-be1155861747` |
| 7 | `GET /v1/credits/ledger` | 200 | 39 | `qa-5c18b563-5d1d-44e0-a476-56ee49fed8af` |
| 8 | `GET /v1/credits/balance` | 200 | 34 | `qa-d5541a18-85ec-4b0c-aaca-37aaeeff7775` |
| 9 | `POST /v1/auth/token` | 200 | 19 | `qa-fba71ef7-d37a-4a42-b7b1-59a02119e4b0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-a42ffbfe-25a8-42d6-a671-bf570257dca5` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-d4165af0-d874-4673-969d-fd79c8baf9cb` |
| 12 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2838504d-9aec-4680-ab01-59b29f568bca` |
| 13 | `POST /v1/auth/token` | 401 | 14 | `qa-e7683a3b-35cc-40bb-aac6-1ab5ac2a17df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-feda6027-c094-4c21-b4a1-b701befb9a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feda6027-c094-4c21-b4a1-b701befb9a3d
Content-Type: application/json

--- request body ---
{"handle":"qa-c77a5a9471d2","displayName":"QA c77a5a9471d2","password":"****","region":"eu"}

--- response: 201 in 478 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-feda6027-c094-4c21-b4a1-b701befb9a3d
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
Location: /v1/accounts/qa-c77a5a9471d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9821c336-f24c-4950-9723-4175842848cd","handle":"qa-c77a5a9471d2","displayName":"QA c77a5a9471d2","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.061337708Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-65d7ba2e-97a7-422a-bc76-aef113875f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d7ba2e-97a7-422a-bc76-aef113875f9b
Content-Type: application/json

--- request body ---
{"handle":"qa-ef72c7f8e2c0","displayName":"QA ef72c7f8e2c0","password":"****","region":"eu"}

--- response: 201 in 73 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-65d7ba2e-97a7-422a-bc76-aef113875f9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-ef72c7f8e2c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5d26293-720b-4c07-aaf5-04a23067e7a4","handle":"qa-ef72c7f8e2c0","displayName":"QA ef72c7f8e2c0","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.548646508Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2ae6b1b9-3f0e-4b58-a0fd-29cf43644c64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ae6b1b9-3f0e-4b58-a0fd-29cf43644c64
Content-Type: application/json

--- request body ---
{"handle":"qa-c77a5a9471d2","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ae6b1b9-3f0e-4b58-a0fd-29cf43644c64
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9821c336-f24c-4950-9723-4175842848cd"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c01b3254-dd40-4276-9d5e-11398e136e07

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7dd004ea52b248e184e7aeeedc346b55
X-Correlation-Id: qa-c01b3254-dd40-4276-9d5e-11398e136e07
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 77 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c01b3254-dd40-4276-9d5e-11398e136e07
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
Location: /v1/credits/purchases/pur_5e611700-db46-4b7c-a317-9b225209dd5a
Content-Length: 144

{"id":"pur_5e611700-db46-4b7c-a317-9b225209dd5a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.815154320Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-39a8316a-10ab-41f7-98f0-02f250b92731

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9144fa9110ac46af8f503149ce809279
X-Correlation-Id: qa-39a8316a-10ab-41f7-98f0-02f250b92731
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-39a8316a-10ab-41f7-98f0-02f250b92731
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
Location: /v1/credits/purchases/pur_e1222684-3040-4d81-b249-d83f645d7875
Content-Length: 144

{"id":"pur_e1222684-3040-4d81-b249-d83f645d7875","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-06T09:30:31.878431670Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-4a13cf08-bf69-40db-86d3-be1155861747

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a13cf08-bf69-40db-86d3-be1155861747
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ef72c7f8e2c0","subject":"Paid message","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a13cf08-bf69-40db-86d3-be1155861747
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
Location: /v1/conversations/cnv_000e4956-7aca-4102-8025-892ff7a1a10a
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_000e4956-7aca-4102-8025-892ff7a1a10a","subject":"Paid message","status":"open","region":"eu","participants":["qa-c77a5a9471d2","qa-ef72c7f8e2c0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.911581421Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5c18b563-5d1d-44e0-a476-56ee49fed8af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c18b563-5d1d-44e0-a476-56ee49fed8af
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c18b563-5d1d-44e0-a476-56ee49fed8af
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

{"items":[{"id":"led_3bfda9a9-3201-4f2c-8a32-82ddfe34f576","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-06T09:30:31.061363597Z"},{"id":"led_c30f9b28-80b3-4c2b-9a21-5fd9005f9d8d","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_5e611700-db46-4b7c-a317-9b225209dd5a","createdAt":"2026-11-06T09:30:31.815154320Z"},{"id":"led_50ce268f-4822-4596-a7b5-7c9fec76e8d5","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_e1222684-3040-4d81-b249-d83f645d7875","createdAt":"2026-11-06T09:30:31.878431670Z"},{"id":"led_0e781af1-a07c-4ce6-86a7-a91b0d6cf693","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_000e4956-7aca-4102-8025-892ff7a1a10a","createdAt":"2026-11-06T09:30:31.911538941Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-d5541a18-85ec-4b0c-aaca-37aaeeff7775

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5541a18-85ec-4b0c-aaca-37aaeeff7775
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5541a18-85ec-4b0c-aaca-37aaeeff7775
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

{"balance":64,"currency":"credits","accountId":"acc_9821c336-f24c-4950-9723-4175842848cd"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-fba71ef7-d37a-4a42-b7b1-59a02119e4b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fba71ef7-d37a-4a42-b7b1-59a02119e4b0
Content-Type: application/json

--- request body ---
{"handle":"qa-ef72c7f8e2c0","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-fba71ef7-d37a-4a42-b7b1-59a02119e4b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5d26293-720b-4c07-aaf5-04a23067e7a4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a42ffbfe-25a8-42d6-a671-bf570257dca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a42ffbfe-25a8-42d6-a671-bf570257dca5
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a42ffbfe-25a8-42d6-a671-bf570257dca5
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
correlation: qa-d4165af0-d874-4673-969d-fd79c8baf9cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4165af0-d874-4673-969d-fd79c8baf9cb
Content-Type: application/json

--- request body ---
{"handle":"qa-ef72c7f8e2c0","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4165af0-d874-4673-969d-fd79c8baf9cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4165af0-d874-4673-969d-fd79c8baf9cb"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2838504d-9aec-4680-ab01-59b29f568bca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2838504d-9aec-4680-ab01-59b29f568bca
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2838504d-9aec-4680-ab01-59b29f568bca
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
correlation: qa-e7683a3b-35cc-40bb-aac6-1ab5ac2a17df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7683a3b-35cc-40bb-aac6-1ab5ac2a17df
Content-Type: application/json

--- request body ---
{"handle":"qa-c77a5a9471d2","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7683a3b-35cc-40bb-aac6-1ab5ac2a17df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7683a3b-35cc-40bb-aac6-1ab5ac2a17df"}
```
