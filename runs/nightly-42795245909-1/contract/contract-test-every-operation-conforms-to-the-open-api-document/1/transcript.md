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
| 1 | `POST /v1/accounts` | 201 | 381 | `qa-04b9af8b-3b78-49c5-ae22-57e6ff8b5dba` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-dbb44ae0-466a-43dc-8506-73b12e0cce14` |
| 3 | `GET /health` | 200 | 31 | `qa-90886846-ff5c-4bda-b44d-706e2b749a45` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-16c6c164-545e-4e43-b55d-9b425bc7d026` |
| 5 | `GET /v1/accounts/me` | 200 | 36 | `qa-e5803050-3eda-4281-86bd-02491f86f9f7` |
| 6 | `PATCH /v1/accounts/me` | 200 | 34 | `qa-2e60c5ea-500b-4a86-93f2-24bb546593cc` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 14 | `qa-06695541-f82f-4917-8399-53b3e0e2f403` |
| 8 | `POST /v1/conversations` | 201 | 13 | `qa-3194264e-84d6-4b59-9ae2-26cf6c2db550` |
| 9 | `GET /v1/conversations` | 200 | 10 | `qa-3d9fea4f-c989-4a09-8823-b29831a4112e` |
| 10 | `POST /v1/auth/token` | 200 | 20 | `qa-8e5cfdd5-c6a7-4ab0-8f44-570877689f78` |
| 11 | `GET /v1/conversations/{id}` | 200 | 15 | `qa-1a39cf18-a458-45ec-8d5c-14be28fd235b` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 14 | `qa-fb49b60b-47a1-4894-889d-a835daa82a36` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-28acfb8e-bdd4-4133-8426-e07c8998c1db` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 7 | `qa-fb022dfc-ff1d-46d6-a342-4a3652d0fd40` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-9cd6afd8-36b9-4cba-a666-1c5b5cf4990c` |
| 16 | `GET /v1/credits/balance` | 200 | 13 | `qa-cb0ebc5d-dec1-4cbe-93d7-638c150b0de6` |
| 17 | `GET /v1/credits/ledger` | 200 | 3 | `qa-4a45a522-0d28-45e7-9400-fa3b779f7191` |
| 18 | `POST /v1/credits/purchases` | 201 | 4 | `qa-74a5936b-05dc-45aa-94de-5758670939f0` |
| 19 | `GET /v1/admin/stats` | 403 | 7 | `qa-86c70b96-7344-4069-9829-fedb4539ef5b` |
| 20 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-46abf77e-6967-4484-b4be-b5014658057b` |
| 21 | `POST /v1/auth/token` | 401 | 22 | `qa-d858f202-c694-41aa-8e74-ddc5b79c13c8` |
| 22 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-9907cef9-e8c6-401b-a279-d597b4ef294d` |
| 23 | `POST /v1/auth/token` | 401 | 15 | `qa-09929e3a-4a52-4edb-a224-a27ac7a23ac6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04b9af8b-3b78-49c5-ae22-57e6ff8b5dba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04b9af8b-3b78-49c5-ae22-57e6ff8b5dba
Content-Type: application/json

--- request body ---
{"handle":"qa-646e9bec3502","displayName":"QA 646e9bec3502","password":"****","region":"eu"}

--- response: 201 in 381 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-04b9af8b-3b78-49c5-ae22-57e6ff8b5dba
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
Location: /v1/accounts/qa-646e9bec3502
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bab4dfd2-13d1-4fc8-ade3-2d9c8bf63995","handle":"qa-646e9bec3502","displayName":"QA 646e9bec3502","region":"eu","role":"user","createdAt":"2026-11-10T09:59:34.242255784Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dbb44ae0-466a-43dc-8506-73b12e0cce14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbb44ae0-466a-43dc-8506-73b12e0cce14
Content-Type: application/json

--- request body ---
{"handle":"qa-b55dbe8c89ef","displayName":"QA b55dbe8c89ef","password":"****","region":"us"}

--- response: 201 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbb44ae0-466a-43dc-8506-73b12e0cce14
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
Location: /v1/accounts/qa-b55dbe8c89ef
X-Served-Region: us
Content-Length: 181

{"id":"acc_71dd6ece-7f8f-438a-8d3f-2c196e8c5ff0","handle":"qa-b55dbe8c89ef","displayName":"QA b55dbe8c89ef","region":"us","role":"user","createdAt":"2026-11-10T09:59:34.583050738Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-90886846-ff5c-4bda-b44d-706e2b749a45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90886846-ff5c-4bda-b44d-706e2b749a45
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-90886846-ff5c-4bda-b44d-706e2b749a45
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
correlation: qa-16c6c164-545e-4e43-b55d-9b425bc7d026

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16c6c164-545e-4e43-b55d-9b425bc7d026
Content-Type: application/json

--- request body ---
{"handle":"qa-646e9bec3502","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-16c6c164-545e-4e43-b55d-9b425bc7d026
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bab4dfd2-13d1-4fc8-ade3-2d9c8bf63995"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5803050-3eda-4281-86bd-02491f86f9f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5803050-3eda-4281-86bd-02491f86f9f7
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5803050-3eda-4281-86bd-02491f86f9f7
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

{"id":"acc_bab4dfd2-13d1-4fc8-ade3-2d9c8bf63995","handle":"qa-646e9bec3502","displayName":"QA 646e9bec3502","region":"eu","role":"user","createdAt":"2026-11-10T09:59:34.242255784Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-2e60c5ea-500b-4a86-93f2-24bb546593cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e60c5ea-500b-4a86-93f2-24bb546593cc
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e60c5ea-500b-4a86-93f2-24bb546593cc
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

{"id":"acc_bab4dfd2-13d1-4fc8-ade3-2d9c8bf63995","handle":"qa-646e9bec3502","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-10T09:59:34.242255784Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-b55dbe8c89ef
correlation: qa-06695541-f82f-4917-8399-53b3e0e2f403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06695541-f82f-4917-8399-53b3e0e2f403
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-06695541-f82f-4917-8399-53b3e0e2f403
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

{"handle":"qa-b55dbe8c89ef","displayName":"QA b55dbe8c89ef","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-3194264e-84d6-4b59-9ae2-26cf6c2db550

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3194264e-84d6-4b59-9ae2-26cf6c2db550
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b55dbe8c89ef","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3194264e-84d6-4b59-9ae2-26cf6c2db550
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
Location: /v1/conversations/cnv_13e159c0-803c-42a5-91e5-5f227ba6c575
X-Data-Region: us
Content-Length: 238

{"id":"cnv_13e159c0-803c-42a5-91e5-5f227ba6c575","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-646e9bec3502","qa-b55dbe8c89ef"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:34.835480057Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-3d9fea4f-c989-4a09-8823-b29831a4112e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d9fea4f-c989-4a09-8823-b29831a4112e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d9fea4f-c989-4a09-8823-b29831a4112e
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

{"items":[{"id":"cnv_13e159c0-803c-42a5-91e5-5f227ba6c575","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-646e9bec3502","qa-b55dbe8c89ef"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:34.835480057Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8e5cfdd5-c6a7-4ab0-8f44-570877689f78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e5cfdd5-c6a7-4ab0-8f44-570877689f78
Content-Type: application/json

--- request body ---
{"handle":"qa-b55dbe8c89ef","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e5cfdd5-c6a7-4ab0-8f44-570877689f78
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71dd6ece-7f8f-438a-8d3f-2c196e8c5ff0"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_13e159c0-803c-42a5-91e5-5f227ba6c575
correlation: qa-1a39cf18-a458-45ec-8d5c-14be28fd235b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a39cf18-a458-45ec-8d5c-14be28fd235b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a39cf18-a458-45ec-8d5c-14be28fd235b
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

{"id":"cnv_13e159c0-803c-42a5-91e5-5f227ba6c575","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-646e9bec3502","qa-b55dbe8c89ef"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-10T09:59:34.835480057Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_13e159c0-803c-42a5-91e5-5f227ba6c575/messages
correlation: qa-fb49b60b-47a1-4894-889d-a835daa82a36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb49b60b-47a1-4894-889d-a835daa82a36
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb49b60b-47a1-4894-889d-a835daa82a36
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

{"items":[{"id":"msg_31c44807-3482-48da-a276-17ceb9cebf0e","conversationId":"cnv_13e159c0-803c-42a5-91e5-5f227ba6c575","sender":"qa-646e9bec3502","body":"Hi","createdAt":"2026-11-10T09:59:34.835505775Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_13e159c0-803c-42a5-91e5-5f227ba6c575/messages
correlation: qa-28acfb8e-bdd4-4133-8426-e07c8998c1db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28acfb8e-bdd4-4133-8426-e07c8998c1db
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-28acfb8e-bdd4-4133-8426-e07c8998c1db
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

{"id":"msg_b4f3b870-5dfa-4635-8591-7600f1a9d9d9","conversationId":"cnv_13e159c0-803c-42a5-91e5-5f227ba6c575","sender":"qa-b55dbe8c89ef","body":"Reply","createdAt":"2026-11-10T09:59:34.949463165Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_13e159c0-803c-42a5-91e5-5f227ba6c575/read
correlation: qa-fb022dfc-ff1d-46d6-a342-4a3652d0fd40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb022dfc-ff1d-46d6-a342-4a3652d0fd40
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb022dfc-ff1d-46d6-a342-4a3652d0fd40
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

{"conversationId":"cnv_13e159c0-803c-42a5-91e5-5f227ba6c575","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_13e159c0-803c-42a5-91e5-5f227ba6c575/close
correlation: qa-9cd6afd8-36b9-4cba-a666-1c5b5cf4990c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cd6afd8-36b9-4cba-a666-1c5b5cf4990c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cd6afd8-36b9-4cba-a666-1c5b5cf4990c
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

{"id":"cnv_13e159c0-803c-42a5-91e5-5f227ba6c575","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-646e9bec3502","qa-b55dbe8c89ef"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-10T09:59:34.835480057Z","closedAt":"2026-11-10T09:59:34.980717891Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-cb0ebc5d-dec1-4cbe-93d7-638c150b0de6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb0ebc5d-dec1-4cbe-93d7-638c150b0de6
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb0ebc5d-dec1-4cbe-93d7-638c150b0de6
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

{"balance":4,"currency":"credits","accountId":"acc_bab4dfd2-13d1-4fc8-ade3-2d9c8bf63995"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4a45a522-0d28-45e7-9400-fa3b779f7191

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a45a522-0d28-45e7-9400-fa3b779f7191
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a45a522-0d28-45e7-9400-fa3b779f7191
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

{"items":[{"id":"led_5110c294-a937-429b-8ef7-752e358b7c65","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-10T09:59:34.242266120Z"},{"id":"led_0106d81e-b8e2-4160-9bc9-00038872f1f0","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_13e159c0-803c-42a5-91e5-5f227ba6c575","createdAt":"2026-11-10T09:59:34.835467379Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-74a5936b-05dc-45aa-94de-5758670939f0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ee029e58556049e2bba50788a3147fde
X-Correlation-Id: qa-74a5936b-05dc-45aa-94de-5758670939f0
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-74a5936b-05dc-45aa-94de-5758670939f0
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
Location: /v1/credits/purchases/pur_a758f83b-84af-450a-ae0f-0c9cc280c40a
Content-Length: 144

{"id":"pur_a758f83b-84af-450a-ae0f-0c9cc280c40a","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-10T09:59:35.016507775Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-86c70b96-7344-4069-9829-fedb4539ef5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86c70b96-7344-4069-9829-fedb4539ef5b
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86c70b96-7344-4069-9829-fedb4539ef5b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-86c70b96-7344-4069-9829-fedb4539ef5b"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46abf77e-6967-4484-b4be-b5014658057b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46abf77e-6967-4484-b4be-b5014658057b
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46abf77e-6967-4484-b4be-b5014658057b
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
correlation: qa-d858f202-c694-41aa-8e74-ddc5b79c13c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d858f202-c694-41aa-8e74-ddc5b79c13c8
Content-Type: application/json

--- request body ---
{"handle":"qa-b55dbe8c89ef","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d858f202-c694-41aa-8e74-ddc5b79c13c8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d858f202-c694-41aa-8e74-ddc5b79c13c8"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9907cef9-e8c6-401b-a279-d597b4ef294d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9907cef9-e8c6-401b-a279-d597b4ef294d
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9907cef9-e8c6-401b-a279-d597b4ef294d
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
correlation: qa-09929e3a-4a52-4edb-a224-a27ac7a23ac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09929e3a-4a52-4edb-a224-a27ac7a23ac6
Content-Type: application/json

--- request body ---
{"handle":"qa-646e9bec3502","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09929e3a-4a52-4edb-a224-a27ac7a23ac6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09929e3a-4a52-4edb-a224-a27ac7a23ac6"}
```
