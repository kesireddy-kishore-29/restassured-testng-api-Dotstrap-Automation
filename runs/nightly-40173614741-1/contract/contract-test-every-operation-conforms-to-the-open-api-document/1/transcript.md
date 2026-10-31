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
| 1 | `POST /v1/accounts` | 201 | 423 | `qa-617e50ea-2a1d-4387-8344-e1237118879a` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-aacb336b-bd8a-4c63-994e-aedcf9d534de` |
| 3 | `GET /health` | 200 | 49 | `qa-e574ae28-0a1f-4b6c-abf0-5e97e8929f05` |
| 4 | `POST /v1/auth/token` | 200 | 29 | `qa-3a363378-f3b0-4dc9-a668-ff97a8365a4f` |
| 5 | `GET /v1/accounts/me` | 200 | 30 | `qa-a0140027-928d-4967-bac8-e2bf9333ae51` |
| 6 | `PATCH /v1/accounts/me` | 200 | 32 | `qa-589279eb-8211-4543-af38-ed29d66240d6` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-637aae88-4f7e-41eb-b0d9-92b5a35028c8` |
| 8 | `POST /v1/conversations` | 201 | 12 | `qa-7d452c1f-9749-44ac-86aa-221d5ffcda1c` |
| 9 | `GET /v1/conversations` | 200 | 16 | `qa-108ffbb0-3eb8-42eb-9fac-f5c5ffe4d06f` |
| 10 | `POST /v1/auth/token` | 200 | 22 | `qa-91cc6e4c-1483-43fa-b15c-2e8ff62d4e54` |
| 11 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-777bf712-94db-41f0-9f3a-4589a5a1201d` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 14 | `qa-c4cf07aa-4237-4c10-9874-c919cda918dc` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-65935797-0121-47c7-b3fb-20d0af842e55` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 15 | `qa-b1f6ae92-0bb9-4a07-a984-c95b53243119` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 22 | `qa-df085242-2c7f-426b-89d8-0feae8492096` |
| 16 | `GET /v1/credits/balance` | 200 | 19 | `qa-89e50bab-1654-4ee6-aaea-495a9f1180f6` |
| 17 | `GET /v1/credits/ledger` | 200 | 10 | `qa-5cf1e43b-913f-45c4-9935-1df3651c0b2e` |
| 18 | `POST /v1/credits/purchases` | 201 | 22 | `qa-f55534e4-8e5f-47e4-9b46-6701928e483f` |
| 19 | `GET /v1/admin/stats` | 403 | 23 | `qa-168a56a3-4287-4e95-9142-af63dbf48f49` |
| 20 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-39d81869-f960-42c8-af3b-1c5aa676f8eb` |
| 21 | `POST /v1/auth/token` | 401 | 25 | `qa-f2a5811c-2814-456f-ba62-5ffd2fbff239` |
| 22 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-dbc718fb-5ed7-463c-b759-12f7358760dc` |
| 23 | `POST /v1/auth/token` | 401 | 9 | `qa-ffe4e7fb-05b7-4005-822f-e7139d71896e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-617e50ea-2a1d-4387-8344-e1237118879a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-617e50ea-2a1d-4387-8344-e1237118879a
Content-Type: application/json

--- request body ---
{"handle":"qa-b9dad174ef24","displayName":"QA b9dad174ef24","password":"****","region":"eu"}

--- response: 201 in 423 ms ---
Date: Sun, 25 Oct 2026 07:40:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-617e50ea-2a1d-4387-8344-e1237118879a
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
Location: /v1/accounts/qa-b9dad174ef24
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6d1bb3d-56fb-4860-94b9-eeb1abff2628","handle":"qa-b9dad174ef24","displayName":"QA b9dad174ef24","region":"eu","role":"user","createdAt":"2026-10-25T07:40:22.959230245Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-aacb336b-bd8a-4c63-994e-aedcf9d534de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aacb336b-bd8a-4c63-994e-aedcf9d534de
Content-Type: application/json

--- request body ---
{"handle":"qa-51ba68ee4ac1","displayName":"QA 51ba68ee4ac1","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-aacb336b-bd8a-4c63-994e-aedcf9d534de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-51ba68ee4ac1
X-Served-Region: us
Content-Length: 181

{"id":"acc_a6f6ab17-9aef-4983-a287-9118484a0e11","handle":"qa-51ba68ee4ac1","displayName":"QA 51ba68ee4ac1","region":"us","role":"user","createdAt":"2026-10-25T07:40:23.361219405Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-e574ae28-0a1f-4b6c-abf0-5e97e8929f05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e574ae28-0a1f-4b6c-abf0-5e97e8929f05
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-e574ae28-0a1f-4b6c-abf0-5e97e8929f05
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
correlation: qa-3a363378-f3b0-4dc9-a668-ff97a8365a4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a363378-f3b0-4dc9-a668-ff97a8365a4f
Content-Type: application/json

--- request body ---
{"handle":"qa-b9dad174ef24","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a363378-f3b0-4dc9-a668-ff97a8365a4f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6d1bb3d-56fb-4860-94b9-eeb1abff2628"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0140027-928d-4967-bac8-e2bf9333ae51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0140027-928d-4967-bac8-e2bf9333ae51
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0140027-928d-4967-bac8-e2bf9333ae51
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

{"id":"acc_b6d1bb3d-56fb-4860-94b9-eeb1abff2628","handle":"qa-b9dad174ef24","displayName":"QA b9dad174ef24","region":"eu","role":"user","createdAt":"2026-10-25T07:40:22.959230245Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-589279eb-8211-4543-af38-ed29d66240d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-589279eb-8211-4543-af38-ed29d66240d6
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 32 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-589279eb-8211-4543-af38-ed29d66240d6
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

{"id":"acc_b6d1bb3d-56fb-4860-94b9-eeb1abff2628","handle":"qa-b9dad174ef24","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-10-25T07:40:22.959230245Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-51ba68ee4ac1
correlation: qa-637aae88-4f7e-41eb-b0d9-92b5a35028c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-637aae88-4f7e-41eb-b0d9-92b5a35028c8
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-637aae88-4f7e-41eb-b0d9-92b5a35028c8
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

{"handle":"qa-51ba68ee4ac1","displayName":"QA 51ba68ee4ac1","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-7d452c1f-9749-44ac-86aa-221d5ffcda1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d452c1f-9749-44ac-86aa-221d5ffcda1c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-51ba68ee4ac1","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d452c1f-9749-44ac-86aa-221d5ffcda1c
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
Location: /v1/conversations/cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333
X-Data-Region: us
Content-Length: 238

{"id":"cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-b9dad174ef24","qa-51ba68ee4ac1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:23.692967011Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-108ffbb0-3eb8-42eb-9fac-f5c5ffe4d06f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-108ffbb0-3eb8-42eb-9fac-f5c5ffe4d06f
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-108ffbb0-3eb8-42eb-9fac-f5c5ffe4d06f
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

{"items":[{"id":"cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-b9dad174ef24","qa-51ba68ee4ac1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:23.692967011Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-91cc6e4c-1483-43fa-b15c-2e8ff62d4e54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91cc6e4c-1483-43fa-b15c-2e8ff62d4e54
Content-Type: application/json

--- request body ---
{"handle":"qa-51ba68ee4ac1","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-91cc6e4c-1483-43fa-b15c-2e8ff62d4e54
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6f6ab17-9aef-4983-a287-9118484a0e11"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333
correlation: qa-777bf712-94db-41f0-9f3a-4589a5a1201d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-777bf712-94db-41f0-9f3a-4589a5a1201d
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-777bf712-94db-41f0-9f3a-4589a5a1201d
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

{"id":"cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-b9dad174ef24","qa-51ba68ee4ac1"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-25T07:40:23.692967011Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333/messages
correlation: qa-c4cf07aa-4237-4c10-9874-c919cda918dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4cf07aa-4237-4c10-9874-c919cda918dc
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4cf07aa-4237-4c10-9874-c919cda918dc
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

{"items":[{"id":"msg_87e4537e-dab2-4df3-b438-eb95d15525f9","conversationId":"cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333","sender":"qa-b9dad174ef24","body":"Hi","createdAt":"2026-10-25T07:40:23.693001212Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333/messages
correlation: qa-65935797-0121-47c7-b3fb-20d0af842e55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65935797-0121-47c7-b3fb-20d0af842e55
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-65935797-0121-47c7-b3fb-20d0af842e55
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

{"id":"msg_2c89f843-9605-4c0c-996c-416211c20691","conversationId":"cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333","sender":"qa-51ba68ee4ac1","body":"Reply","createdAt":"2026-10-25T07:40:23.862574275Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333/read
correlation: qa-b1f6ae92-0bb9-4a07-a984-c95b53243119

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1f6ae92-0bb9-4a07-a984-c95b53243119
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1f6ae92-0bb9-4a07-a984-c95b53243119
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

{"conversationId":"cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333/close
correlation: qa-df085242-2c7f-426b-89d8-0feae8492096

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df085242-2c7f-426b-89d8-0feae8492096
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-df085242-2c7f-426b-89d8-0feae8492096
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

{"id":"cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-b9dad174ef24","qa-51ba68ee4ac1"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-25T07:40:23.692967011Z","closedAt":"2026-10-25T07:40:23.934176945Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-89e50bab-1654-4ee6-aaea-495a9f1180f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89e50bab-1654-4ee6-aaea-495a9f1180f6
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-89e50bab-1654-4ee6-aaea-495a9f1180f6
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

{"balance":4,"currency":"credits","accountId":"acc_b6d1bb3d-56fb-4860-94b9-eeb1abff2628"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5cf1e43b-913f-45c4-9935-1df3651c0b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cf1e43b-913f-45c4-9935-1df3651c0b2e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cf1e43b-913f-45c4-9935-1df3651c0b2e
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

{"items":[{"id":"led_2487b687-046e-4e60-af22-ec298e1e53a2","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-25T07:40:22.959239328Z"},{"id":"led_d90d662a-6d15-4693-bbd3-2f10a3d78c0e","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_32f7ce72-5ac0-4e2c-96f3-37407be49333","createdAt":"2026-10-25T07:40:23.692925759Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f55534e4-8e5f-47e4-9b46-6701928e483f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ea031e2753174c7893c14cf253efcff5
X-Correlation-Id: qa-f55534e4-8e5f-47e4-9b46-6701928e483f
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f55534e4-8e5f-47e4-9b46-6701928e483f
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
Location: /v1/credits/purchases/pur_47bbc399-3c16-4712-8a5c-3bdee82ef488
Content-Length: 144

{"id":"pur_47bbc399-3c16-4712-8a5c-3bdee82ef488","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-10-25T07:40:24.034500977Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-168a56a3-4287-4e95-9142-af63dbf48f49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-168a56a3-4287-4e95-9142-af63dbf48f49
Content-Type: application/json

--- response: 403 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-168a56a3-4287-4e95-9142-af63dbf48f49
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-168a56a3-4287-4e95-9142-af63dbf48f49"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-39d81869-f960-42c8-af3b-1c5aa676f8eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39d81869-f960-42c8-af3b-1c5aa676f8eb
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-39d81869-f960-42c8-af3b-1c5aa676f8eb
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
correlation: qa-f2a5811c-2814-456f-ba62-5ffd2fbff239

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2a5811c-2814-456f-ba62-5ffd2fbff239
Content-Type: application/json

--- request body ---
{"handle":"qa-51ba68ee4ac1","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2a5811c-2814-456f-ba62-5ffd2fbff239
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2a5811c-2814-456f-ba62-5ffd2fbff239"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dbc718fb-5ed7-463c-b759-12f7358760dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbc718fb-5ed7-463c-b759-12f7358760dc
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dbc718fb-5ed7-463c-b759-12f7358760dc
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
correlation: qa-ffe4e7fb-05b7-4005-822f-e7139d71896e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffe4e7fb-05b7-4005-822f-e7139d71896e
Content-Type: application/json

--- request body ---
{"handle":"qa-b9dad174ef24","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffe4e7fb-05b7-4005-822f-e7139d71896e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ffe4e7fb-05b7-4005-822f-e7139d71896e"}
```
