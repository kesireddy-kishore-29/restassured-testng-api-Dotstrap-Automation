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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-c6899aea-e5aa-4afc-9960-6e28efc8516a` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-3b8e507c-822a-4ceb-9290-facf80e3773b` |
| 3 | `GET /health` | 200 | 10 | `qa-63457bf6-3b04-409b-a8d7-9d7ae889853d` |
| 4 | `POST /v1/auth/token` | 200 | 17 | `qa-f061b958-4fbf-4f7c-8987-660fd768cb9e` |
| 5 | `GET /v1/accounts/me` | 200 | 4 | `qa-52a22c87-458f-4471-83a2-4ec04eab8422` |
| 6 | `PATCH /v1/accounts/me` | 200 | 9 | `qa-99a29bac-bf25-4fa4-9fd8-f6d83c54515c` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-555f3d2f-fc15-4f74-b533-52034e566e0f` |
| 8 | `POST /v1/conversations` | 201 | 9 | `qa-3762e154-111e-4f6d-9844-a609506c0779` |
| 9 | `GET /v1/conversations` | 200 | 6 | `qa-831d5e08-b435-4bad-b84f-396403a7f7fb` |
| 10 | `POST /v1/auth/token` | 200 | 8 | `qa-657d7407-2604-46e6-a088-432c22b15ba7` |
| 11 | `GET /v1/conversations/{id}` | 200 | 4 | `qa-b433986b-b49b-40f6-acf2-4e59f97bb953` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 3 | `qa-81c61d62-76fb-4cdf-9dce-f85115bf1624` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 2 | `qa-575865fc-b71d-4179-9291-9b88e1f6dac7` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 5 | `qa-82e10b97-cd8b-4add-a1d7-ce2c66bbbd38` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-0e3702dd-6c97-41bc-984a-4af355baf0b2` |
| 16 | `GET /v1/credits/balance` | 200 | 12 | `qa-7275d446-558b-48cb-9fd6-a61460d07d20` |
| 17 | `GET /v1/credits/ledger` | 200 | 10 | `qa-419fa59b-4ac7-4233-aace-b741f19d7a38` |
| 18 | `POST /v1/credits/purchases` | 201 | 5 | `qa-026a0ff4-00b9-4450-9372-dc7811dd88fe` |
| 19 | `GET /v1/admin/stats` | 403 | 4 | `qa-86f5023b-371d-4454-95f5-aad1506091da` |
| 20 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-62b75be4-7cec-460c-977d-d485bbc21f83` |
| 21 | `POST /v1/auth/token` | 401 | 3 | `qa-02bcc854-bbaf-4273-9b4a-30c5532c56e0` |
| 22 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-06e20ed9-dc52-4fe7-a2ed-5d801d8fc3ce` |
| 23 | `POST /v1/auth/token` | 401 | 4 | `qa-0f25fc27-0472-4bd1-af60-ba9cf6acc786` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c6899aea-e5aa-4afc-9960-6e28efc8516a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6899aea-e5aa-4afc-9960-6e28efc8516a
Content-Type: application/json

--- request body ---
{"handle":"qa-16fa85c0856d","displayName":"QA 16fa85c0856d","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6899aea-e5aa-4afc-9960-6e28efc8516a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Location: /v1/accounts/qa-16fa85c0856d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63bc4263-46f3-4841-b721-1564df763ca5","handle":"qa-16fa85c0856d","displayName":"QA 16fa85c0856d","region":"eu","role":"user","createdAt":"2026-11-03T09:41:34.040452918Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3b8e507c-822a-4ceb-9290-facf80e3773b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b8e507c-822a-4ceb-9290-facf80e3773b
Content-Type: application/json

--- request body ---
{"handle":"qa-60b61ebe0925","displayName":"QA 60b61ebe0925","password":"****","region":"us"}

--- response: 201 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b8e507c-822a-4ceb-9290-facf80e3773b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Location: /v1/accounts/qa-60b61ebe0925
X-Served-Region: us
Content-Length: 181

{"id":"acc_eba60316-d6b1-4be0-b8ed-12bdf4653403","handle":"qa-60b61ebe0925","displayName":"QA 60b61ebe0925","region":"us","role":"user","createdAt":"2026-11-03T09:41:34.063612097Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-63457bf6-3b04-409b-a8d7-9d7ae889853d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63457bf6-3b04-409b-a8d7-9d7ae889853d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-63457bf6-3b04-409b-a8d7-9d7ae889853d
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
correlation: qa-f061b958-4fbf-4f7c-8987-660fd768cb9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f061b958-4fbf-4f7c-8987-660fd768cb9e
Content-Type: application/json

--- request body ---
{"handle":"qa-16fa85c0856d","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f061b958-4fbf-4f7c-8987-660fd768cb9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63bc4263-46f3-4841-b721-1564df763ca5"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-52a22c87-458f-4471-83a2-4ec04eab8422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52a22c87-458f-4471-83a2-4ec04eab8422
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-52a22c87-458f-4471-83a2-4ec04eab8422
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

{"id":"acc_63bc4263-46f3-4841-b721-1564df763ca5","handle":"qa-16fa85c0856d","displayName":"QA 16fa85c0856d","region":"eu","role":"user","createdAt":"2026-11-03T09:41:34.040452918Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-99a29bac-bf25-4fa4-9fd8-f6d83c54515c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99a29bac-bf25-4fa4-9fd8-f6d83c54515c
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-99a29bac-bf25-4fa4-9fd8-f6d83c54515c
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

{"id":"acc_63bc4263-46f3-4841-b721-1564df763ca5","handle":"qa-16fa85c0856d","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-03T09:41:34.040452918Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-60b61ebe0925
correlation: qa-555f3d2f-fc15-4f74-b533-52034e566e0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-555f3d2f-fc15-4f74-b533-52034e566e0f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-555f3d2f-fc15-4f74-b533-52034e566e0f
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

{"handle":"qa-60b61ebe0925","displayName":"QA 60b61ebe0925","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-3762e154-111e-4f6d-9844-a609506c0779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3762e154-111e-4f6d-9844-a609506c0779
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-60b61ebe0925","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3762e154-111e-4f6d-9844-a609506c0779
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
Location: /v1/conversations/cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef
X-Data-Region: us
Content-Length: 238

{"id":"cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-16fa85c0856d","qa-60b61ebe0925"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:34.164445780Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-831d5e08-b435-4bad-b84f-396403a7f7fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-831d5e08-b435-4bad-b84f-396403a7f7fb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-831d5e08-b435-4bad-b84f-396403a7f7fb
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

{"items":[{"id":"cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-16fa85c0856d","qa-60b61ebe0925"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:34.164445780Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-657d7407-2604-46e6-a088-432c22b15ba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-657d7407-2604-46e6-a088-432c22b15ba7
Content-Type: application/json

--- request body ---
{"handle":"qa-60b61ebe0925","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-657d7407-2604-46e6-a088-432c22b15ba7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eba60316-d6b1-4be0-b8ed-12bdf4653403"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef
correlation: qa-b433986b-b49b-40f6-acf2-4e59f97bb953

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b433986b-b49b-40f6-acf2-4e59f97bb953
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b433986b-b49b-40f6-acf2-4e59f97bb953
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

{"id":"cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-16fa85c0856d","qa-60b61ebe0925"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-03T09:41:34.164445780Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef/messages
correlation: qa-81c61d62-76fb-4cdf-9dce-f85115bf1624

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81c61d62-76fb-4cdf-9dce-f85115bf1624
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-81c61d62-76fb-4cdf-9dce-f85115bf1624
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

{"items":[{"id":"msg_c6557b34-318b-4386-9ae4-f7cceb3d1f70","conversationId":"cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef","sender":"qa-16fa85c0856d","body":"Hi","createdAt":"2026-11-03T09:41:34.164450397Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef/messages
correlation: qa-575865fc-b71d-4179-9291-9b88e1f6dac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-575865fc-b71d-4179-9291-9b88e1f6dac7
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 2 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-575865fc-b71d-4179-9291-9b88e1f6dac7
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

{"id":"msg_7b031caf-7e26-4104-8f84-8262afd66e73","conversationId":"cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef","sender":"qa-60b61ebe0925","body":"Reply","createdAt":"2026-11-03T09:41:34.215326201Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef/read
correlation: qa-82e10b97-cd8b-4add-a1d7-ce2c66bbbd38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82e10b97-cd8b-4add-a1d7-ce2c66bbbd38
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-82e10b97-cd8b-4add-a1d7-ce2c66bbbd38
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

{"conversationId":"cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef/close
correlation: qa-0e3702dd-6c97-41bc-984a-4af355baf0b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e3702dd-6c97-41bc-984a-4af355baf0b2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e3702dd-6c97-41bc-984a-4af355baf0b2
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

{"id":"cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-16fa85c0856d","qa-60b61ebe0925"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-03T09:41:34.164445780Z","closedAt":"2026-11-03T09:41:34.234791104Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-7275d446-558b-48cb-9fd6-a61460d07d20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7275d446-558b-48cb-9fd6-a61460d07d20
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7275d446-558b-48cb-9fd6-a61460d07d20
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

{"balance":4,"currency":"credits","accountId":"acc_63bc4263-46f3-4841-b721-1564df763ca5"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-419fa59b-4ac7-4233-aace-b741f19d7a38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-419fa59b-4ac7-4233-aace-b741f19d7a38
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-419fa59b-4ac7-4233-aace-b741f19d7a38
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

{"items":[{"id":"led_b75df852-cbd6-4553-983e-ea6de6edc23a","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-03T09:41:34.040460129Z"},{"id":"led_7a6f5862-0228-4851-889b-072cc9d4cc0e","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_d5ccefbd-0216-4a0c-be12-37b3cafb6aef","createdAt":"2026-11-03T09:41:34.164437698Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-026a0ff4-00b9-4450-9372-dc7811dd88fe

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9dbc4f222bb2455a9549238170527102
X-Correlation-Id: qa-026a0ff4-00b9-4450-9372-dc7811dd88fe
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-026a0ff4-00b9-4450-9372-dc7811dd88fe
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
Location: /v1/credits/purchases/pur_478cfbca-703a-4d4c-9f3c-a155467f6268
Content-Length: 144

{"id":"pur_478cfbca-703a-4d4c-9f3c-a155467f6268","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-03T09:41:34.279524244Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-86f5023b-371d-4454-95f5-aad1506091da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f5023b-371d-4454-95f5-aad1506091da
Content-Type: application/json

--- response: 403 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86f5023b-371d-4454-95f5-aad1506091da
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-86f5023b-371d-4454-95f5-aad1506091da"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62b75be4-7cec-460c-977d-d485bbc21f83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62b75be4-7cec-460c-977d-d485bbc21f83
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62b75be4-7cec-460c-977d-d485bbc21f83
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
correlation: qa-02bcc854-bbaf-4273-9b4a-30c5532c56e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02bcc854-bbaf-4273-9b4a-30c5532c56e0
Content-Type: application/json

--- request body ---
{"handle":"qa-60b61ebe0925","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02bcc854-bbaf-4273-9b4a-30c5532c56e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02bcc854-bbaf-4273-9b4a-30c5532c56e0"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06e20ed9-dc52-4fe7-a2ed-5d801d8fc3ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06e20ed9-dc52-4fe7-a2ed-5d801d8fc3ce
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06e20ed9-dc52-4fe7-a2ed-5d801d8fc3ce
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
correlation: qa-0f25fc27-0472-4bd1-af60-ba9cf6acc786

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f25fc27-0472-4bd1-af60-ba9cf6acc786
Content-Type: application/json

--- request body ---
{"handle":"qa-16fa85c0856d","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f25fc27-0472-4bd1-af60-ba9cf6acc786
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f25fc27-0472-4bd1-af60-ba9cf6acc786"}
```
