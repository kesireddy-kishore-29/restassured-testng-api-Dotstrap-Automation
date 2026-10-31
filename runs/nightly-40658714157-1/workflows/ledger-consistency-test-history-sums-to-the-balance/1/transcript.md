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
| 1 | `POST /v1/accounts` | 201 | 301 | `qa-84778b54-b8f1-49e5-ae5d-5c02e1e71995` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-5b8e3997-1251-4694-9b74-04d20f2e9db9` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-ef41de7f-491e-4662-84b7-98bfa41b336b` |
| 4 | `POST /v1/credits/purchases` | 201 | 21 | `qa-f08f6483-2e01-4eba-9d7a-3a85e38a56f3` |
| 5 | `POST /v1/credits/purchases` | 201 | 20 | `qa-25f94d6a-123a-441d-ae00-aa4b6b2382ef` |
| 6 | `POST /v1/conversations` | 201 | 10 | `qa-4cddbdd0-12ec-4ed8-92ad-84035e62417b` |
| 7 | `GET /v1/credits/ledger` | 200 | 38 | `qa-a5aee994-5bf5-4284-841d-129e3ff61744` |
| 8 | `GET /v1/credits/balance` | 200 | 15 | `qa-6d6f3b33-b32a-4078-83ce-e0b2d7f4d2de` |
| 9 | `POST /v1/auth/token` | 200 | 22 | `qa-383a044c-8750-498b-886e-fc530835a4b3` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-e4a5b3c2-7c6b-437b-a775-49c7b059cc77` |
| 11 | `POST /v1/auth/token` | 401 | 15 | `qa-f621090a-1247-464f-9851-befd3f861761` |
| 12 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-a1121536-7aa6-44e7-82f5-a883e099578b` |
| 13 | `POST /v1/auth/token` | 401 | 5 | `qa-c35de4e3-22cc-4e74-8a79-b0fe12308479` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-84778b54-b8f1-49e5-ae5d-5c02e1e71995

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84778b54-b8f1-49e5-ae5d-5c02e1e71995
Content-Type: application/json

--- request body ---
{"handle":"qa-66cbc00e149e","displayName":"QA 66cbc00e149e","password":"****","region":"eu"}

--- response: 201 in 301 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-84778b54-b8f1-49e5-ae5d-5c02e1e71995
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-66cbc00e149e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd270e34-f44d-458c-b277-126fc327bda4","handle":"qa-66cbc00e149e","displayName":"QA 66cbc00e149e","region":"eu","role":"user","createdAt":"2026-10-28T08:42:54.763967294Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5b8e3997-1251-4694-9b74-04d20f2e9db9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b8e3997-1251-4694-9b74-04d20f2e9db9
Content-Type: application/json

--- request body ---
{"handle":"qa-9a6eaa85a6f9","displayName":"QA 9a6eaa85a6f9","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b8e3997-1251-4694-9b74-04d20f2e9db9
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
Location: /v1/accounts/qa-9a6eaa85a6f9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c790e964-ab32-4d09-bb54-ef34f37fceb7","handle":"qa-9a6eaa85a6f9","displayName":"QA 9a6eaa85a6f9","region":"eu","role":"user","createdAt":"2026-10-28T08:42:55.079051152Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ef41de7f-491e-4662-84b7-98bfa41b336b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef41de7f-491e-4662-84b7-98bfa41b336b
Content-Type: application/json

--- request body ---
{"handle":"qa-66cbc00e149e","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef41de7f-491e-4662-84b7-98bfa41b336b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd270e34-f44d-458c-b277-126fc327bda4"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f08f6483-2e01-4eba-9d7a-3a85e38a56f3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-45e52c989e9f47b8aba8b45111baa1c0
X-Correlation-Id: qa-f08f6483-2e01-4eba-9d7a-3a85e38a56f3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f08f6483-2e01-4eba-9d7a-3a85e38a56f3
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
Location: /v1/credits/purchases/pur_6edaad5a-c4eb-4df2-b3bb-7b911795cc6c
Content-Length: 144

{"id":"pur_6edaad5a-c4eb-4df2-b3bb-7b911795cc6c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:55.234344347Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-25f94d6a-123a-441d-ae00-aa4b6b2382ef

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3c847fe619d24456a7c900c292b043f1
X-Correlation-Id: qa-25f94d6a-123a-441d-ae00-aa4b6b2382ef
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-25f94d6a-123a-441d-ae00-aa4b6b2382ef
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
Location: /v1/credits/purchases/pur_20d0dde8-68e8-4b1d-a545-134090d51787
Content-Length: 144

{"id":"pur_20d0dde8-68e8-4b1d-a545-134090d51787","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-10-28T08:42:55.286317959Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-4cddbdd0-12ec-4ed8-92ad-84035e62417b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cddbdd0-12ec-4ed8-92ad-84035e62417b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9a6eaa85a6f9","subject":"Paid message","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cddbdd0-12ec-4ed8-92ad-84035e62417b
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
Location: /v1/conversations/cnv_0abd93fe-5fc5-47cd-9ef8-834a0c229eb3
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_0abd93fe-5fc5-47cd-9ef8-834a0c229eb3","subject":"Paid message","status":"open","region":"eu","participants":["qa-66cbc00e149e","qa-9a6eaa85a6f9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:55.310589522Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a5aee994-5bf5-4284-841d-129e3ff61744

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5aee994-5bf5-4284-841d-129e3ff61744
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5aee994-5bf5-4284-841d-129e3ff61744
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

{"items":[{"id":"led_d8fada41-91d8-408b-89e0-8a45df750403","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-28T08:42:54.764201315Z"},{"id":"led_ec0efa15-226f-40e3-8f2d-b73d2f254003","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_6edaad5a-c4eb-4df2-b3bb-7b911795cc6c","createdAt":"2026-10-28T08:42:55.234344347Z"},{"id":"led_b13b7f71-4db8-4c19-869c-fb980ab6f958","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_20d0dde8-68e8-4b1d-a545-134090d51787","createdAt":"2026-10-28T08:42:55.286317959Z"},{"id":"led_037609d5-b511-47c6-89ad-1b2449270935","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_0abd93fe-5fc5-47cd-9ef8-834a0c229eb3","createdAt":"2026-10-28T08:42:55.310560138Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-6d6f3b33-b32a-4078-83ce-e0b2d7f4d2de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d6f3b33-b32a-4078-83ce-e0b2d7f4d2de
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d6f3b33-b32a-4078-83ce-e0b2d7f4d2de
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

{"balance":64,"currency":"credits","accountId":"acc_fd270e34-f44d-458c-b277-126fc327bda4"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-383a044c-8750-498b-886e-fc530835a4b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-383a044c-8750-498b-886e-fc530835a4b3
Content-Type: application/json

--- request body ---
{"handle":"qa-9a6eaa85a6f9","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-383a044c-8750-498b-886e-fc530835a4b3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c790e964-ab32-4d09-bb54-ef34f37fceb7"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e4a5b3c2-7c6b-437b-a775-49c7b059cc77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4a5b3c2-7c6b-437b-a775-49c7b059cc77
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e4a5b3c2-7c6b-437b-a775-49c7b059cc77
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
correlation: qa-f621090a-1247-464f-9851-befd3f861761

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f621090a-1247-464f-9851-befd3f861761
Content-Type: application/json

--- request body ---
{"handle":"qa-9a6eaa85a6f9","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f621090a-1247-464f-9851-befd3f861761
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f621090a-1247-464f-9851-befd3f861761"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1121536-7aa6-44e7-82f5-a883e099578b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1121536-7aa6-44e7-82f5-a883e099578b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1121536-7aa6-44e7-82f5-a883e099578b
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
correlation: qa-c35de4e3-22cc-4e74-8a79-b0fe12308479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c35de4e3-22cc-4e74-8a79-b0fe12308479
Content-Type: application/json

--- request body ---
{"handle":"qa-66cbc00e149e","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c35de4e3-22cc-4e74-8a79-b0fe12308479
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c35de4e3-22cc-4e74-8a79-b0fe12308479"}
```
