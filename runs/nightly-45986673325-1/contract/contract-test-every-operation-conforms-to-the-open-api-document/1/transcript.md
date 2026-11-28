# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 455 | `qa-81e7e1e0-5a2a-4edb-856b-26108a954a14` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-b4946c8d-c305-4a00-888e-a923f2d2f5f5` |
| 3 | `GET /health` | 200 | 43 | `qa-41f5f8e0-d8ca-41bd-9a02-3e346d56a22c` |
| 4 | `POST /v1/auth/token` | 200 | 33 | `qa-8876c86d-7a5d-4340-a1ab-31c5dab7ffa0` |
| 5 | `GET /v1/accounts/me` | 200 | 33 | `qa-bfe506f2-6cee-4e1c-9696-ee9be09c2c49` |
| 6 | `PATCH /v1/accounts/me` | 200 | 20 | `qa-07147dc4-db6d-4aa3-9db1-3f77171ed785` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 27 | `qa-453b9cce-df49-48a4-81f2-41f9724cab6a` |
| 8 | `POST /v1/conversations` | 201 | 22 | `qa-e2572162-6849-4361-b1b9-477f3e998528` |
| 9 | `GET /v1/conversations` | 200 | 27 | `qa-9e905f40-7904-4fcd-b1a1-ad3cb7243925` |
| 10 | `POST /v1/auth/token` | 200 | 12 | `qa-b2c015ec-5300-46ce-b6f9-69bf252c8b37` |
| 11 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-afd54266-e2bf-4298-9511-a351ac76f00c` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 15 | `qa-c5e07098-9187-4cbd-8c9a-908361054475` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-b1eb511a-0a07-46a8-86b2-c71c58e5874b` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 8 | `qa-0fdee886-c42e-4b36-8f7d-43db3d90152c` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 15 | `qa-1f9f985b-db58-4204-83fa-b7b2aad09838` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-1f56520c-0fcc-48b7-8b62-ef7ef0f26bf2` |
| 17 | `GET /v1/credits/ledger` | 200 | 9 | `qa-4cdada11-6808-4c8a-888d-f4fabc6d5e19` |
| 18 | `POST /v1/credits/purchases` | 201 | 7 | `qa-603427ee-7a00-4feb-8f8d-9efa45aec678` |
| 19 | `GET /v1/admin/stats` | 403 | 7 | `qa-7491c5f3-5ee3-431d-b82a-c0099695fbf9` |
| 20 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-4df6d4c1-e0a8-43be-80c0-ddf6994e5eef` |
| 21 | `POST /v1/auth/token` | 401 | 6 | `qa-6f0309e3-40f8-48ea-8a4b-0f24826aec06` |
| 22 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-27b05d46-a5da-4987-a036-a9101e035dae` |
| 23 | `POST /v1/auth/token` | 401 | 6 | `qa-be7fa75c-a77f-4542-b92d-24407dfd7e27` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-81e7e1e0-5a2a-4edb-856b-26108a954a14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81e7e1e0-5a2a-4edb-856b-26108a954a14
Content-Type: application/json

--- request body ---
{"handle":"qa-3dc1a5518772","displayName":"QA 3dc1a5518772","password":"****","region":"eu"}

--- response: 201 in 455 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-81e7e1e0-5a2a-4edb-856b-26108a954a14
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
Location: /v1/accounts/qa-3dc1a5518772
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5142b03-9bdd-491c-9a45-f2f1106fc832","handle":"qa-3dc1a5518772","displayName":"QA 3dc1a5518772","region":"eu","role":"user","createdAt":"2026-11-27T10:59:55.880661666Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b4946c8d-c305-4a00-888e-a923f2d2f5f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4946c8d-c305-4a00-888e-a923f2d2f5f5
Content-Type: application/json

--- request body ---
{"handle":"qa-d5c1a6bc91bc","displayName":"QA d5c1a6bc91bc","password":"****","region":"us"}

--- response: 201 in 41 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4946c8d-c305-4a00-888e-a923f2d2f5f5
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
Location: /v1/accounts/qa-d5c1a6bc91bc
X-Served-Region: us
Content-Length: 181

{"id":"acc_d654d4a8-4175-42fc-a4a6-e2469ae4159b","handle":"qa-d5c1a6bc91bc","displayName":"QA d5c1a6bc91bc","region":"us","role":"user","createdAt":"2026-11-27T10:59:56.308155323Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-41f5f8e0-d8ca-41bd-9a02-3e346d56a22c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41f5f8e0-d8ca-41bd-9a02-3e346d56a22c
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-41f5f8e0-d8ca-41bd-9a02-3e346d56a22c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8876c86d-7a5d-4340-a1ab-31c5dab7ffa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8876c86d-7a5d-4340-a1ab-31c5dab7ffa0
Content-Type: application/json

--- request body ---
{"handle":"qa-3dc1a5518772","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8876c86d-7a5d-4340-a1ab-31c5dab7ffa0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5142b03-9bdd-491c-9a45-f2f1106fc832"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfe506f2-6cee-4e1c-9696-ee9be09c2c49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfe506f2-6cee-4e1c-9696-ee9be09c2c49
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfe506f2-6cee-4e1c-9696-ee9be09c2c49
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
Content-Length: 181

{"id":"acc_b5142b03-9bdd-491c-9a45-f2f1106fc832","handle":"qa-3dc1a5518772","displayName":"QA 3dc1a5518772","region":"eu","role":"user","createdAt":"2026-11-27T10:59:55.880661666Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-07147dc4-db6d-4aa3-9db1-3f77171ed785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07147dc4-db6d-4aa3-9db1-3f77171ed785
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-07147dc4-db6d-4aa3-9db1-3f77171ed785
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
Content-Length: 178

{"id":"acc_b5142b03-9bdd-491c-9a45-f2f1106fc832","handle":"qa-3dc1a5518772","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-27T10:59:55.880661666Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-d5c1a6bc91bc
correlation: qa-453b9cce-df49-48a4-81f2-41f9724cab6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-453b9cce-df49-48a4-81f2-41f9724cab6a
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-453b9cce-df49-48a4-81f2-41f9724cab6a
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
Content-Length: 74

{"handle":"qa-d5c1a6bc91bc","displayName":"QA d5c1a6bc91bc","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-e2572162-6849-4361-b1b9-477f3e998528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2572162-6849-4361-b1b9-477f3e998528
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d5c1a6bc91bc","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2572162-6849-4361-b1b9-477f3e998528
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
Location: /v1/conversations/cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457
X-Data-Region: us
Content-Length: 238

{"id":"cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-3dc1a5518772","qa-d5c1a6bc91bc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:56.601745056Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-9e905f40-7904-4fcd-b1a1-ad3cb7243925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e905f40-7904-4fcd-b1a1-ad3cb7243925
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e905f40-7904-4fcd-b1a1-ad3cb7243925
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
Content-Length: 260

{"items":[{"id":"cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-3dc1a5518772","qa-d5c1a6bc91bc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:56.601745056Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b2c015ec-5300-46ce-b6f9-69bf252c8b37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2c015ec-5300-46ce-b6f9-69bf252c8b37
Content-Type: application/json

--- request body ---
{"handle":"qa-d5c1a6bc91bc","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2c015ec-5300-46ce-b6f9-69bf252c8b37
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d654d4a8-4175-42fc-a4a6-e2469ae4159b"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457
correlation: qa-afd54266-e2bf-4298-9511-a351ac76f00c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afd54266-e2bf-4298-9511-a351ac76f00c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-afd54266-e2bf-4298-9511-a351ac76f00c
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
X-Data-Region: us
Content-Length: 238

{"id":"cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-3dc1a5518772","qa-d5c1a6bc91bc"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-27T10:59:56.601745056Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457/messages
correlation: qa-c5e07098-9187-4cbd-8c9a-908361054475

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5e07098-9187-4cbd-8c9a-908361054475
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5e07098-9187-4cbd-8c9a-908361054475
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
Content-Length: 215

{"items":[{"id":"msg_69ccc68e-1888-4cb3-a65c-64282e957ce1","conversationId":"cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457","sender":"qa-3dc1a5518772","body":"Hi","createdAt":"2026-11-27T10:59:56.601779077Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457/messages
correlation: qa-b1eb511a-0a07-46a8-86b2-c71c58e5874b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1eb511a-0a07-46a8-86b2-c71c58e5874b
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1eb511a-0a07-46a8-86b2-c71c58e5874b
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_4f6f3717-d4a3-4926-9dec-d4cd273e42b2","conversationId":"cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457","sender":"qa-d5c1a6bc91bc","body":"Reply","createdAt":"2026-11-27T10:59:56.740287138Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457/read
correlation: qa-0fdee886-c42e-4b36-8f7d-43db3d90152c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fdee886-c42e-4b36-8f7d-43db3d90152c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fdee886-c42e-4b36-8f7d-43db3d90152c
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
Content-Length: 77

{"conversationId":"cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457/close
correlation: qa-1f9f985b-db58-4204-83fa-b7b2aad09838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f9f985b-db58-4204-83fa-b7b2aad09838
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f9f985b-db58-4204-83fa-b7b2aad09838
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-3dc1a5518772","qa-d5c1a6bc91bc"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-27T10:59:56.601745056Z","closedAt":"2026-11-27T10:59:56.780178064Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-1f56520c-0fcc-48b7-8b62-ef7ef0f26bf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f56520c-0fcc-48b7-8b62-ef7ef0f26bf2
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f56520c-0fcc-48b7-8b62-ef7ef0f26bf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_b5142b03-9bdd-491c-9a45-f2f1106fc832"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4cdada11-6808-4c8a-888d-f4fabc6d5e19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cdada11-6808-4c8a-888d-f4fabc6d5e19
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cdada11-6808-4c8a-888d-f4fabc6d5e19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_a7fae6bf-be90-4350-ba7f-daf1f66765f9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-27T10:59:55.880672923Z"},{"id":"led_cef9202f-f813-45c7-bda1-1d9a31575057","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_eaeb1d1d-9720-4fff-bf00-e09c39112457","createdAt":"2026-11-27T10:59:56.601727410Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-603427ee-7a00-4feb-8f8d-9efa45aec678

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7ebe447b5e244287bce9c3fdcefeadf8
X-Correlation-Id: qa-603427ee-7a00-4feb-8f8d-9efa45aec678
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-603427ee-7a00-4feb-8f8d-9efa45aec678
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_f0a54643-45f2-4321-9169-6efb16e2ba27
Content-Length: 144

{"id":"pur_f0a54643-45f2-4321-9169-6efb16e2ba27","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-27T10:59:56.826792816Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-7491c5f3-5ee3-431d-b82a-c0099695fbf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7491c5f3-5ee3-431d-b82a-c0099695fbf9
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7491c5f3-5ee3-431d-b82a-c0099695fbf9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-7491c5f3-5ee3-431d-b82a-c0099695fbf9"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4df6d4c1-e0a8-43be-80c0-ddf6994e5eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4df6d4c1-e0a8-43be-80c0-ddf6994e5eef
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4df6d4c1-e0a8-43be-80c0-ddf6994e5eef
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
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-6f0309e3-40f8-48ea-8a4b-0f24826aec06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f0309e3-40f8-48ea-8a4b-0f24826aec06
Content-Type: application/json

--- request body ---
{"handle":"qa-d5c1a6bc91bc","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f0309e3-40f8-48ea-8a4b-0f24826aec06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f0309e3-40f8-48ea-8a4b-0f24826aec06"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27b05d46-a5da-4987-a036-a9101e035dae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27b05d46-a5da-4987-a036-a9101e035dae
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27b05d46-a5da-4987-a036-a9101e035dae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-be7fa75c-a77f-4542-b92d-24407dfd7e27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be7fa75c-a77f-4542-b92d-24407dfd7e27
Content-Type: application/json

--- request body ---
{"handle":"qa-3dc1a5518772","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be7fa75c-a77f-4542-b92d-24407dfd7e27
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be7fa75c-a77f-4542-b92d-24407dfd7e27"}
```
