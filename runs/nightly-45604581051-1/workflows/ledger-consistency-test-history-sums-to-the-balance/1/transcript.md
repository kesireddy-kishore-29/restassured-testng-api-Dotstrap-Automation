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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-aec44b0d-a85f-41fa-89b1-6eeeb8a191fe` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-4268829c-3cb8-4a9f-a166-fabc8ea73df2` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-9dae9385-c5fd-446f-ac6d-29b03c1c433a` |
| 4 | `POST /v1/credits/purchases` | 201 | 35 | `qa-0ff8e4f1-3c21-4e82-9420-186dbb60a5b0` |
| 5 | `POST /v1/credits/purchases` | 201 | 15 | `qa-a18d657c-c5ac-48c6-9b4c-99cc62b653ed` |
| 6 | `POST /v1/conversations` | 201 | 16 | `qa-decbd1e4-13ae-4f29-953f-58ffd29dda9b` |
| 7 | `GET /v1/credits/ledger` | 200 | 21 | `qa-c332f5fb-f41a-4add-b808-b89cfca2f63f` |
| 8 | `GET /v1/credits/balance` | 200 | 14 | `qa-38463afd-d751-4e17-a133-9609b9ba7d54` |
| 9 | `POST /v1/auth/token` | 200 | 32 | `qa-ef837203-4d63-4c91-95fb-8e1124e4b72f` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d15a93a2-17fc-4f64-83d3-7f2260c660e7` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-114bcdc3-5b8d-4e41-9d1d-314384ff8590` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-57569051-6e7b-4f7a-b2e1-9fc9904386d3` |
| 13 | `POST /v1/auth/token` | 401 | 7 | `qa-fac0cd8c-d351-4f9f-a485-08eeeb9088d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aec44b0d-a85f-41fa-89b1-6eeeb8a191fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aec44b0d-a85f-41fa-89b1-6eeeb8a191fe
Content-Type: application/json

--- request body ---
{"handle":"qa-3ed744a65151","displayName":"QA 3ed744a65151","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-aec44b0d-a85f-41fa-89b1-6eeeb8a191fe
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
Location: /v1/accounts/qa-3ed744a65151
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb4e9a25-96a1-4967-a51f-a1b183e77053","handle":"qa-3ed744a65151","displayName":"QA 3ed744a65151","region":"eu","role":"user","createdAt":"2026-11-25T11:27:54.517768288Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4268829c-3cb8-4a9f-a166-fabc8ea73df2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4268829c-3cb8-4a9f-a166-fabc8ea73df2
Content-Type: application/json

--- request body ---
{"handle":"qa-37c3dd2b610a","displayName":"QA 37c3dd2b610a","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-4268829c-3cb8-4a9f-a166-fabc8ea73df2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-37c3dd2b610a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c4105246-ef85-4d53-9b72-408f29eb906a","handle":"qa-37c3dd2b610a","displayName":"QA 37c3dd2b610a","region":"eu","role":"user","createdAt":"2026-11-25T11:27:54.583907028Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9dae9385-c5fd-446f-ac6d-29b03c1c433a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dae9385-c5fd-446f-ac6d-29b03c1c433a
Content-Type: application/json

--- request body ---
{"handle":"qa-3ed744a65151","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dae9385-c5fd-446f-ac6d-29b03c1c433a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb4e9a25-96a1-4967-a51f-a1b183e77053"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0ff8e4f1-3c21-4e82-9420-186dbb60a5b0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a6b72b11317d4c9b9f50d87a86ac79c4
X-Correlation-Id: qa-0ff8e4f1-3c21-4e82-9420-186dbb60a5b0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ff8e4f1-3c21-4e82-9420-186dbb60a5b0
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
Location: /v1/credits/purchases/pur_d12c7ec0-5874-47f3-bf4f-d603718ce232
Content-Length: 144

{"id":"pur_d12c7ec0-5874-47f3-bf4f-d603718ce232","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:54.694717310Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a18d657c-c5ac-48c6-9b4c-99cc62b653ed

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d48778a673274b1dbbb8bd58a221a0f3
X-Correlation-Id: qa-a18d657c-c5ac-48c6-9b4c-99cc62b653ed
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a18d657c-c5ac-48c6-9b4c-99cc62b653ed
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
Location: /v1/credits/purchases/pur_4be5cc73-8624-4478-b40d-7e4b4e9b24d9
Content-Length: 144

{"id":"pur_4be5cc73-8624-4478-b40d-7e4b4e9b24d9","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-25T11:27:54.736111282Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-decbd1e4-13ae-4f29-953f-58ffd29dda9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-decbd1e4-13ae-4f29-953f-58ffd29dda9b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-37c3dd2b610a","subject":"Paid message","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-decbd1e4-13ae-4f29-953f-58ffd29dda9b
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
Location: /v1/conversations/cnv_29925ad2-13b0-46cc-bb01-48c00d0edd29
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_29925ad2-13b0-46cc-bb01-48c00d0edd29","subject":"Paid message","status":"open","region":"eu","participants":["qa-3ed744a65151","qa-37c3dd2b610a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:54.766414197Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c332f5fb-f41a-4add-b808-b89cfca2f63f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c332f5fb-f41a-4add-b808-b89cfca2f63f
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c332f5fb-f41a-4add-b808-b89cfca2f63f
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

{"items":[{"id":"led_d4d5f91f-22c1-4c8e-a6f9-86d1d5bf6b66","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-25T11:27:54.517781282Z"},{"id":"led_264cd136-bafd-49ed-9d44-5f49362d3519","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_d12c7ec0-5874-47f3-bf4f-d603718ce232","createdAt":"2026-11-25T11:27:54.694717310Z"},{"id":"led_787bc770-5ac6-4a88-abad-2aadfbd6479e","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_4be5cc73-8624-4478-b40d-7e4b4e9b24d9","createdAt":"2026-11-25T11:27:54.736111282Z"},{"id":"led_50ee9677-925f-47b1-8a7e-826674326c1f","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_29925ad2-13b0-46cc-bb01-48c00d0edd29","createdAt":"2026-11-25T11:27:54.766379542Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-38463afd-d751-4e17-a133-9609b9ba7d54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38463afd-d751-4e17-a133-9609b9ba7d54
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-38463afd-d751-4e17-a133-9609b9ba7d54
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

{"balance":64,"currency":"credits","accountId":"acc_bb4e9a25-96a1-4967-a51f-a1b183e77053"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-ef837203-4d63-4c91-95fb-8e1124e4b72f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef837203-4d63-4c91-95fb-8e1124e4b72f
Content-Type: application/json

--- request body ---
{"handle":"qa-37c3dd2b610a","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef837203-4d63-4c91-95fb-8e1124e4b72f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4105246-ef85-4d53-9b72-408f29eb906a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d15a93a2-17fc-4f64-83d3-7f2260c660e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d15a93a2-17fc-4f64-83d3-7f2260c660e7
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d15a93a2-17fc-4f64-83d3-7f2260c660e7
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
correlation: qa-114bcdc3-5b8d-4e41-9d1d-314384ff8590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-114bcdc3-5b8d-4e41-9d1d-314384ff8590
Content-Type: application/json

--- request body ---
{"handle":"qa-37c3dd2b610a","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-114bcdc3-5b8d-4e41-9d1d-314384ff8590
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-114bcdc3-5b8d-4e41-9d1d-314384ff8590"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-57569051-6e7b-4f7a-b2e1-9fc9904386d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57569051-6e7b-4f7a-b2e1-9fc9904386d3
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-57569051-6e7b-4f7a-b2e1-9fc9904386d3
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
correlation: qa-fac0cd8c-d351-4f9f-a485-08eeeb9088d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fac0cd8c-d351-4f9f-a485-08eeeb9088d8
Content-Type: application/json

--- request body ---
{"handle":"qa-3ed744a65151","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fac0cd8c-d351-4f9f-a485-08eeeb9088d8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fac0cd8c-d351-4f9f-a485-08eeeb9088d8"}
```
