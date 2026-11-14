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
| 1 | `POST /v1/accounts` | 201 | 432 | `qa-192b63c5-2b30-46a2-bfc5-ddcb7ff17235` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-f13b02f6-d925-4fc3-a6a2-140ad84e5ae6` |
| 3 | `GET /health` | 200 | 56 | `qa-0f95d555-ceb8-4719-be3f-02b21e4cba46` |
| 4 | `POST /v1/auth/token` | 200 | 22 | `qa-cc0b130e-0c40-40c9-aeaa-634e02696ca6` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-8d095c28-146d-4cbd-939b-1a24b76278bf` |
| 6 | `PATCH /v1/accounts/me` | 200 | 29 | `qa-4617bafe-245e-4524-8b5a-9de4f79dda79` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 20 | `qa-9954d3ea-133b-418f-bdd0-d82f3ef49e0b` |
| 8 | `POST /v1/conversations` | 201 | 8 | `qa-1693e3d5-231d-40eb-ba5f-250e4b20049d` |
| 9 | `GET /v1/conversations` | 200 | 20 | `qa-48a63cad-36e7-4c79-a16b-9af0e7e5df94` |
| 10 | `POST /v1/auth/token` | 200 | 30 | `qa-9917edb2-69de-45cc-be3b-d87c65caca55` |
| 11 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-32f0c9b0-34e5-4369-b91c-4779925bc762` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-c4194de6-ba36-4ff5-9421-92bff0407541` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-48259cf7-f248-49dd-be3f-82132fce72a7` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 25 | `qa-858b8e75-5c37-49bd-91a0-42bac75e9bc5` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 12 | `qa-b3f3a8a5-ec25-4370-98e0-c1e09a0ed436` |
| 16 | `GET /v1/credits/balance` | 200 | 12 | `qa-4fb1e53e-e7e6-4c73-a759-d7ac134b5ae4` |
| 17 | `GET /v1/credits/ledger` | 200 | 8 | `qa-827896de-a35d-414e-94db-7b42abf6c2c7` |
| 18 | `POST /v1/credits/purchases` | 201 | 8 | `qa-e88c9f7d-1eb8-46a7-9c3c-815d7451dc07` |
| 19 | `GET /v1/admin/stats` | 403 | 9 | `qa-037e0a9d-df23-4319-b6bb-c44a89934eba` |
| 20 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-dc33f79f-7a5a-4a4d-8c72-42e2ce8a1676` |
| 21 | `POST /v1/auth/token` | 401 | 15 | `qa-9fb87eaa-abf5-44b0-a2c9-944adeb95574` |
| 22 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9ec1f9a2-eec9-42a1-99cd-e52bfd37b9f8` |
| 23 | `POST /v1/auth/token` | 401 | 40 | `qa-f14befe8-28ff-48a8-987f-c24fe479763c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-192b63c5-2b30-46a2-bfc5-ddcb7ff17235

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-192b63c5-2b30-46a2-bfc5-ddcb7ff17235
Content-Type: application/json

--- request body ---
{"handle":"qa-cc079f6dd6b5","displayName":"QA cc079f6dd6b5","password":"****","region":"eu"}

--- response: 201 in 432 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-192b63c5-2b30-46a2-bfc5-ddcb7ff17235
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-cc079f6dd6b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78e0b84f-f4e7-4d7b-a7ff-9dadcb3a2706","handle":"qa-cc079f6dd6b5","displayName":"QA cc079f6dd6b5","region":"eu","role":"user","createdAt":"2026-11-11T09:34:34.944656686Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f13b02f6-d925-4fc3-a6a2-140ad84e5ae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f13b02f6-d925-4fc3-a6a2-140ad84e5ae6
Content-Type: application/json

--- request body ---
{"handle":"qa-0b7e3538ce93","displayName":"QA 0b7e3538ce93","password":"****","region":"us"}

--- response: 201 in 58 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f13b02f6-d925-4fc3-a6a2-140ad84e5ae6
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
Location: /v1/accounts/qa-0b7e3538ce93
X-Served-Region: us
Content-Length: 181

{"id":"acc_57c0ca3f-4c00-4c0c-9cbe-5d5cc7015b7e","handle":"qa-0b7e3538ce93","displayName":"QA 0b7e3538ce93","region":"us","role":"user","createdAt":"2026-11-11T09:34:35.333590474Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-0f95d555-ceb8-4719-be3f-02b21e4cba46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f95d555-ceb8-4719-be3f-02b21e4cba46
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f95d555-ceb8-4719-be3f-02b21e4cba46
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
correlation: qa-cc0b130e-0c40-40c9-aeaa-634e02696ca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc0b130e-0c40-40c9-aeaa-634e02696ca6
Content-Type: application/json

--- request body ---
{"handle":"qa-cc079f6dd6b5","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc0b130e-0c40-40c9-aeaa-634e02696ca6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78e0b84f-f4e7-4d7b-a7ff-9dadcb3a2706"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d095c28-146d-4cbd-939b-1a24b76278bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d095c28-146d-4cbd-939b-1a24b76278bf
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d095c28-146d-4cbd-939b-1a24b76278bf
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

{"id":"acc_78e0b84f-f4e7-4d7b-a7ff-9dadcb3a2706","handle":"qa-cc079f6dd6b5","displayName":"QA cc079f6dd6b5","region":"eu","role":"user","createdAt":"2026-11-11T09:34:34.944656686Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-4617bafe-245e-4524-8b5a-9de4f79dda79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4617bafe-245e-4524-8b5a-9de4f79dda79
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4617bafe-245e-4524-8b5a-9de4f79dda79
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

{"id":"acc_78e0b84f-f4e7-4d7b-a7ff-9dadcb3a2706","handle":"qa-cc079f6dd6b5","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-11T09:34:34.944656686Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-0b7e3538ce93
correlation: qa-9954d3ea-133b-418f-bdd0-d82f3ef49e0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9954d3ea-133b-418f-bdd0-d82f3ef49e0b
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9954d3ea-133b-418f-bdd0-d82f3ef49e0b
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

{"handle":"qa-0b7e3538ce93","displayName":"QA 0b7e3538ce93","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-1693e3d5-231d-40eb-ba5f-250e4b20049d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1693e3d5-231d-40eb-ba5f-250e4b20049d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0b7e3538ce93","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1693e3d5-231d-40eb-ba5f-250e4b20049d
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
Location: /v1/conversations/cnv_0a33309d-5252-43dc-87a3-58a969abaec8
X-Data-Region: us
Content-Length: 238

{"id":"cnv_0a33309d-5252-43dc-87a3-58a969abaec8","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-cc079f6dd6b5","qa-0b7e3538ce93"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:35.627486243Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-48a63cad-36e7-4c79-a16b-9af0e7e5df94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a63cad-36e7-4c79-a16b-9af0e7e5df94
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-48a63cad-36e7-4c79-a16b-9af0e7e5df94
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

{"items":[{"id":"cnv_0a33309d-5252-43dc-87a3-58a969abaec8","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-cc079f6dd6b5","qa-0b7e3538ce93"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:35.627486243Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9917edb2-69de-45cc-be3b-d87c65caca55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9917edb2-69de-45cc-be3b-d87c65caca55
Content-Type: application/json

--- request body ---
{"handle":"qa-0b7e3538ce93","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9917edb2-69de-45cc-be3b-d87c65caca55
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_57c0ca3f-4c00-4c0c-9cbe-5d5cc7015b7e"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_0a33309d-5252-43dc-87a3-58a969abaec8
correlation: qa-32f0c9b0-34e5-4369-b91c-4779925bc762

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32f0c9b0-34e5-4369-b91c-4779925bc762
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-32f0c9b0-34e5-4369-b91c-4779925bc762
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

{"id":"cnv_0a33309d-5252-43dc-87a3-58a969abaec8","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-cc079f6dd6b5","qa-0b7e3538ce93"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-11T09:34:35.627486243Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_0a33309d-5252-43dc-87a3-58a969abaec8/messages
correlation: qa-c4194de6-ba36-4ff5-9421-92bff0407541

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4194de6-ba36-4ff5-9421-92bff0407541
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4194de6-ba36-4ff5-9421-92bff0407541
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

{"items":[{"id":"msg_d71c4745-68ea-4e23-8e1a-12c6cb97cc79","conversationId":"cnv_0a33309d-5252-43dc-87a3-58a969abaec8","sender":"qa-cc079f6dd6b5","body":"Hi","createdAt":"2026-11-11T09:34:35.627520316Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_0a33309d-5252-43dc-87a3-58a969abaec8/messages
correlation: qa-48259cf7-f248-49dd-be3f-82132fce72a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48259cf7-f248-49dd-be3f-82132fce72a7
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-48259cf7-f248-49dd-be3f-82132fce72a7
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

{"id":"msg_303776c6-2a92-48dc-9044-57e345886c4c","conversationId":"cnv_0a33309d-5252-43dc-87a3-58a969abaec8","sender":"qa-0b7e3538ce93","body":"Reply","createdAt":"2026-11-11T09:34:35.768923716Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_0a33309d-5252-43dc-87a3-58a969abaec8/read
correlation: qa-858b8e75-5c37-49bd-91a0-42bac75e9bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-858b8e75-5c37-49bd-91a0-42bac75e9bc5
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-858b8e75-5c37-49bd-91a0-42bac75e9bc5
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

{"conversationId":"cnv_0a33309d-5252-43dc-87a3-58a969abaec8","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_0a33309d-5252-43dc-87a3-58a969abaec8/close
correlation: qa-b3f3a8a5-ec25-4370-98e0-c1e09a0ed436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3f3a8a5-ec25-4370-98e0-c1e09a0ed436
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3f3a8a5-ec25-4370-98e0-c1e09a0ed436
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

{"id":"cnv_0a33309d-5252-43dc-87a3-58a969abaec8","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-cc079f6dd6b5","qa-0b7e3538ce93"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-11T09:34:35.627486243Z","closedAt":"2026-11-11T09:34:35.827080478Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-4fb1e53e-e7e6-4c73-a759-d7ac134b5ae4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fb1e53e-e7e6-4c73-a759-d7ac134b5ae4
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fb1e53e-e7e6-4c73-a759-d7ac134b5ae4
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

{"balance":4,"currency":"credits","accountId":"acc_78e0b84f-f4e7-4d7b-a7ff-9dadcb3a2706"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-827896de-a35d-414e-94db-7b42abf6c2c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-827896de-a35d-414e-94db-7b42abf6c2c7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-827896de-a35d-414e-94db-7b42abf6c2c7
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

{"items":[{"id":"led_21dcdf44-9973-4662-bdc5-3c574047b641","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-11T09:34:34.944664280Z"},{"id":"led_6e39592a-b0d4-4608-8d11-6538d2bc9be5","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_0a33309d-5252-43dc-87a3-58a969abaec8","createdAt":"2026-11-11T09:34:35.627444194Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e88c9f7d-1eb8-46a7-9c3c-815d7451dc07

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bc961a37b618469f83ce136b1b58cda6
X-Correlation-Id: qa-e88c9f7d-1eb8-46a7-9c3c-815d7451dc07
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e88c9f7d-1eb8-46a7-9c3c-815d7451dc07
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
Location: /v1/credits/purchases/pur_284b660d-5a79-4b8b-b9ef-502724d7ffe1
Content-Length: 144

{"id":"pur_284b660d-5a79-4b8b-b9ef-502724d7ffe1","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-11T09:34:35.878246133Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-037e0a9d-df23-4319-b6bb-c44a89934eba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-037e0a9d-df23-4319-b6bb-c44a89934eba
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-037e0a9d-df23-4319-b6bb-c44a89934eba
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-037e0a9d-df23-4319-b6bb-c44a89934eba"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc33f79f-7a5a-4a4d-8c72-42e2ce8a1676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc33f79f-7a5a-4a4d-8c72-42e2ce8a1676
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc33f79f-7a5a-4a4d-8c72-42e2ce8a1676
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
correlation: qa-9fb87eaa-abf5-44b0-a2c9-944adeb95574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fb87eaa-abf5-44b0-a2c9-944adeb95574
Content-Type: application/json

--- request body ---
{"handle":"qa-0b7e3538ce93","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fb87eaa-abf5-44b0-a2c9-944adeb95574
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fb87eaa-abf5-44b0-a2c9-944adeb95574"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ec1f9a2-eec9-42a1-99cd-e52bfd37b9f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ec1f9a2-eec9-42a1-99cd-e52bfd37b9f8
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ec1f9a2-eec9-42a1-99cd-e52bfd37b9f8
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
correlation: qa-f14befe8-28ff-48a8-987f-c24fe479763c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f14befe8-28ff-48a8-987f-c24fe479763c
Content-Type: application/json

--- request body ---
{"handle":"qa-cc079f6dd6b5","password":"****"}

--- response: 401 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f14befe8-28ff-48a8-987f-c24fe479763c
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f14befe8-28ff-48a8-987f-c24fe479763c"}
```
