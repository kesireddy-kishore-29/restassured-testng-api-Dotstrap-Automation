# Transcript: Two people exchange messages; an outsider is kept out; closing stops the thread

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiActorConversationTest#twoPeopleConverseAndTheOwnerEndsIt` |
| Features | FEAT-CONV-01, FEAT-CONV-02, FEAT-CONV-03, FEAT-AUTHZ-01, FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 33 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 477 | `qa-1283c572-d92b-4f80-8ed6-ed5be9fe9949` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-f9a3abfc-93eb-42ee-9e77-c4ac94cd9632` |
| 3 | `POST /v1/accounts` | 201 | 56 | `qa-45f25a8b-7b3d-4636-9e2a-b3dc25c6f50f` |
| 4 | `POST /v1/auth/token` | 200 | 65 | `qa-d9b367bf-ca07-48db-ac6a-9e83f53850dc` |
| 5 | `POST /v1/conversations` | 201 | 21 | `qa-ae130adc-e7d9-46be-958a-ab46e36140d4` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-c6061fa4-d095-43a5-b428-e867e4d238bc` |
| 7 | `GET /v1/conversations` | 200 | 24 | `qa-9349c012-73df-4be3-8c4a-95b1330d82ec` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 29 | `qa-d22ec210-5ed0-4a4a-ae20-f52a84b30e41` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 36 | `qa-2bc9a4ef-c1ce-4edb-9882-e700c44f992b` |
| 10 | `GET /v1/conversations/{id}` | 200 | 33 | `qa-f22c65f3-4e28-42b4-a719-32dca805e371` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-bc9c32ce-dd4f-4c9b-b93d-22320e034026` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-9a528d74-67e4-49ba-9a0a-e4a059083e2f` |
| 13 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-d785d57c-75ee-41f8-8270-e0f1530c6068` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 15 | `qa-8f2cff02-8556-494c-8672-f6b5c3b5bfe8` |
| 15 | `GET /v1/credits/balance` | 200 | 11 | `qa-e5241f81-a35f-4625-8ecc-239e6c041eb2` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-26413d37-e3d1-4c90-b97c-e615a5a245b2` |
| 17 | `POST /v1/auth/token` | 200 | 22 | `qa-d66a9817-302e-47cb-8256-155e25221be0` |
| 18 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-6f2211ba-0035-4551-972c-8dd79be2e814` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 10 | `qa-35e8d1da-a564-4d6b-bb06-50f0d6352fb7` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 11 | `qa-c112b92f-b69b-480a-b7e4-be8275c8dbf6` |
| 21 | `GET /v1/conversations` | 200 | 9 | `qa-9f4ed551-e033-4980-82f9-e79025b4c985` |
| 22 | `GET /v1/credits/balance` | 200 | 7 | `qa-98b0b85a-6c3d-4292-b239-68ec6d732ed5` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-6bb16fcd-47b1-4eee-9936-09a7f2756eaa` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 11 | `qa-6b8f8533-ef13-48d1-b0fd-4bca8d3ac375` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-57e688fa-d543-42cf-83dd-a3c7c02a95b1` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 8 | `qa-e503c950-b2bb-48a1-8bd5-21cde16648b2` |
| 27 | `GET /v1/credits/balance` | 200 | 10 | `qa-5a765097-1781-4d62-890a-64f1bb43627c` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-612f5426-f973-4fe8-8998-f0ada0eaeba4` |
| 29 | `POST /v1/auth/token` | 401 | 10 | `qa-85b05f2c-9fde-4596-bc75-c7ac35d69216` |
| 30 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-fb2f2633-b763-487c-bccc-3c57fd319934` |
| 31 | `POST /v1/auth/token` | 401 | 6 | `qa-675f0868-08d0-4efd-8414-75ca564a4cce` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d242c7fa-03d9-431f-bb89-ad93cc945942` |
| 33 | `POST /v1/auth/token` | 401 | 6 | `qa-018db37e-e488-4fcc-bab1-ccdb6f91e2b5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1283c572-d92b-4f80-8ed6-ed5be9fe9949

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1283c572-d92b-4f80-8ed6-ed5be9fe9949
Content-Type: application/json

--- request body ---
{"handle":"qa-0fc460719d61","displayName":"QA 0fc460719d61","password":"****","region":"eu"}

--- response: 201 in 477 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1283c572-d92b-4f80-8ed6-ed5be9fe9949
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 11
Location: /v1/accounts/qa-0fc460719d61
X-Served-Region: eu
Content-Length: 181

{"id":"acc_667ac559-aafd-4cc3-8d74-d7eb1917d081","handle":"qa-0fc460719d61","displayName":"QA 0fc460719d61","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.379373506Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f9a3abfc-93eb-42ee-9e77-c4ac94cd9632

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9a3abfc-93eb-42ee-9e77-c4ac94cd9632
Content-Type: application/json

--- request body ---
{"handle":"qa-8a62a10bd5e0","displayName":"QA 8a62a10bd5e0","password":"****","region":"us"}

--- response: 201 in 40 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9a3abfc-93eb-42ee-9e77-c4ac94cd9632
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
Location: /v1/accounts/qa-8a62a10bd5e0
X-Served-Region: us
Content-Length: 181

{"id":"acc_4adb6bbb-73af-45c7-aa01-93c9e97e7833","handle":"qa-8a62a10bd5e0","displayName":"QA 8a62a10bd5e0","region":"us","role":"user","createdAt":"2026-11-25T11:27:53.857772681Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-45f25a8b-7b3d-4636-9e2a-b3dc25c6f50f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45f25a8b-7b3d-4636-9e2a-b3dc25c6f50f
Content-Type: application/json

--- request body ---
{"handle":"qa-d7152372d38c","displayName":"QA d7152372d38c","password":"****","region":"in"}

--- response: 201 in 56 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-45f25a8b-7b3d-4636-9e2a-b3dc25c6f50f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Location: /v1/accounts/qa-d7152372d38c
X-Served-Region: in
Content-Length: 181

{"id":"acc_c11b7e4e-51c6-464f-aace-b798fda2c82a","handle":"qa-d7152372d38c","displayName":"QA d7152372d38c","region":"in","role":"user","createdAt":"2026-11-25T11:27:53.946733669Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d9b367bf-ca07-48db-ac6a-9e83f53850dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9b367bf-ca07-48db-ac6a-9e83f53850dc
Content-Type: application/json

--- request body ---
{"handle":"qa-0fc460719d61","password":"****"}

--- response: 200 in 65 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9b367bf-ca07-48db-ac6a-9e83f53850dc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_667ac559-aafd-4cc3-8d74-d7eb1917d081"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ae130adc-e7d9-46be-958a-ab46e36140d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae130adc-e7d9-46be-958a-ab46e36140d4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8a62a10bd5e0","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae130adc-e7d9-46be-958a-ab46e36140d4
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
Location: /v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0
X-Data-Region: us
Content-Length: 238

{"id":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","subject":"Project kickoff","status":"open","region":"us","participants":["qa-0fc460719d61","qa-8a62a10bd5e0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:54.118506199Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c6061fa4-d095-43a5-b428-e867e4d238bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6061fa4-d095-43a5-b428-e867e4d238bc
Content-Type: application/json

--- request body ---
{"handle":"qa-8a62a10bd5e0","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6061fa4-d095-43a5-b428-e867e4d238bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4adb6bbb-73af-45c7-aa01-93c9e97e7833"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-9349c012-73df-4be3-8c4a-95b1330d82ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9349c012-73df-4be3-8c4a-95b1330d82ec
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9349c012-73df-4be3-8c4a-95b1330d82ec
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
Content-Length: 260

{"items":[{"id":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","subject":"Project kickoff","status":"open","region":"us","participants":["qa-0fc460719d61","qa-8a62a10bd5e0"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-25T11:27:54.118506199Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages
correlation: qa-d22ec210-5ed0-4a4a-ae20-f52a84b30e41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d22ec210-5ed0-4a4a-ae20-f52a84b30e41
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d22ec210-5ed0-4a4a-ae20-f52a84b30e41
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
Content-Length: 234

{"items":[{"id":"msg_0b816888-8f9c-487c-8c09-06becd76077e","conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","sender":"qa-0fc460719d61","body":"Hi Ben, got a minute?","createdAt":"2026-11-25T11:27:54.118519093Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/read
correlation: qa-2bc9a4ef-c1ce-4edb-9882-e700c44f992b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc9a4ef-c1ce-4edb-9882-e700c44f992b
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bc9a4ef-c1ce-4edb-9882-e700c44f992b
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
Content-Length: 77

{"conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0
correlation: qa-f22c65f3-4e28-42b4-a719-32dca805e371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f22c65f3-4e28-42b4-a719-32dca805e371
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f22c65f3-4e28-42b4-a719-32dca805e371
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
X-Data-Region: us
Content-Length: 238

{"id":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","subject":"Project kickoff","status":"open","region":"us","participants":["qa-0fc460719d61","qa-8a62a10bd5e0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:54.118506199Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages
correlation: qa-bc9c32ce-dd4f-4c9b-b93d-22320e034026

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc9c32ce-dd4f-4c9b-b93d-22320e034026
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc9c32ce-dd4f-4c9b-b93d-22320e034026
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
X-Served-Region: us
Content-Length: 206

{"id":"msg_3f9da4de-985e-40ca-9989-ccd679e8590c","conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","sender":"qa-8a62a10bd5e0","body":"Sure, now works","createdAt":"2026-11-25T11:27:54.712867531Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages
correlation: qa-9a528d74-67e4-49ba-9a0a-e4a059083e2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a528d74-67e4-49ba-9a0a-e4a059083e2f
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a528d74-67e4-49ba-9a0a-e4a059083e2f
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
X-Served-Region: us
Content-Length: 202

{"id":"msg_7f72f85b-6a21-49fa-acb7-62f120dd504a","conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","sender":"qa-8a62a10bd5e0","body":"Calling you","createdAt":"2026-11-25T11:27:54.764699191Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0
correlation: qa-d785d57c-75ee-41f8-8270-e0f1530c6068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d785d57c-75ee-41f8-8270-e0f1530c6068
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d785d57c-75ee-41f8-8270-e0f1530c6068
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
X-Data-Region: us
Content-Length: 238

{"id":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","subject":"Project kickoff","status":"open","region":"us","participants":["qa-0fc460719d61","qa-8a62a10bd5e0"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-25T11:27:54.118506199Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages
correlation: qa-8f2cff02-8556-494c-8672-f6b5c3b5bfe8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2cff02-8556-494c-8672-f6b5c3b5bfe8
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f2cff02-8556-494c-8672-f6b5c3b5bfe8
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
Content-Length: 644

{"items":[{"id":"msg_0b816888-8f9c-487c-8c09-06becd76077e","conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","sender":"qa-0fc460719d61","body":"Hi Ben, got a minute?","createdAt":"2026-11-25T11:27:54.118519093Z"},{"id":"msg_3f9da4de-985e-40ca-9989-ccd679e8590c","conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","sender":"qa-8a62a10bd5e0","body":"Sure, now works","createdAt":"2026-11-25T11:27:54.712867531Z"},{"id":"msg_7f72f85b-6a21-49fa-acb7-62f120dd504a","conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","sender":"qa-8a62a10bd5e0","body":"Calling you","createdAt":"2026-11-25T11:27:54.764699191Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-e5241f81-a35f-4625-8ecc-239e6c041eb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5241f81-a35f-4625-8ecc-239e6c041eb2
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5241f81-a35f-4625-8ecc-239e6c041eb2
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
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_667ac559-aafd-4cc3-8d74-d7eb1917d081"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-26413d37-e3d1-4c90-b97c-e615a5a245b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26413d37-e3d1-4c90-b97c-e615a5a245b2
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-26413d37-e3d1-4c90-b97c-e615a5a245b2
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
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_4adb6bbb-73af-45c7-aa01-93c9e97e7833"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-d66a9817-302e-47cb-8256-155e25221be0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d66a9817-302e-47cb-8256-155e25221be0
Content-Type: application/json

--- request body ---
{"handle":"qa-d7152372d38c","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d66a9817-302e-47cb-8256-155e25221be0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c11b7e4e-51c6-464f-aace-b798fda2c82a"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0
correlation: qa-6f2211ba-0035-4551-972c-8dd79be2e814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f2211ba-0035-4551-972c-8dd79be2e814
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f2211ba-0035-4551-972c-8dd79be2e814
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
X-Served-Region: in
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0","correlationId":"qa-6f2211ba-0035-4551-972c-8dd79be2e814"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages
correlation: qa-35e8d1da-a564-4d6b-bb06-50f0d6352fb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e8d1da-a564-4d6b-bb06-50f0d6352fb7
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35e8d1da-a564-4d6b-bb06-50f0d6352fb7
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
X-Served-Region: in
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages","correlationId":"qa-35e8d1da-a564-4d6b-bb06-50f0d6352fb7"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages
correlation: qa-c112b92f-b69b-480a-b7e4-be8275c8dbf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c112b92f-b69b-480a-b7e4-be8275c8dbf6
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c112b92f-b69b-480a-b7e4-be8275c8dbf6
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
X-Served-Region: in
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages","correlationId":"qa-c112b92f-b69b-480a-b7e4-be8275c8dbf6"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-9f4ed551-e033-4980-82f9-e79025b4c985

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f4ed551-e033-4980-82f9-e79025b4c985
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f4ed551-e033-4980-82f9-e79025b4c985
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
X-Served-Region: in
Content-Length: 22

{"items":[],"total":0}
```

## 22. GET /v1/credits/balance

```text
#22 GET http://localhost:7070/v1/credits/balance
correlation: qa-98b0b85a-6c3d-4292-b239-68ec6d732ed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98b0b85a-6c3d-4292-b239-68ec6d732ed5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-98b0b85a-6c3d-4292-b239-68ec6d732ed5
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
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_c11b7e4e-51c6-464f-aace-b798fda2c82a"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/close
correlation: qa-6bb16fcd-47b1-4eee-9936-09a7f2756eaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bb16fcd-47b1-4eee-9936-09a7f2756eaa
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bb16fcd-47b1-4eee-9936-09a7f2756eaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-0fc460719d61","qa-8a62a10bd5e0"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-25T11:27:54.118506199Z","closedAt":"2026-11-25T11:27:55.337902695Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/close
correlation: qa-6b8f8533-ef13-48d1-b0fd-4bca8d3ac375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b8f8533-ef13-48d1-b0fd-4bca8d3ac375
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b8f8533-ef13-48d1-b0fd-4bca8d3ac375
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-0fc460719d61","qa-8a62a10bd5e0"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-25T11:27:54.118506199Z","closedAt":"2026-11-25T11:27:55.337902695Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages
correlation: qa-57e688fa-d543-42cf-83dd-a3c7c02a95b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57e688fa-d543-42cf-83dd-a3c7c02a95b1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-57e688fa-d543-42cf-83dd-a3c7c02a95b1
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
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_0b816888-8f9c-487c-8c09-06becd76077e","conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","sender":"qa-0fc460719d61","body":"Hi Ben, got a minute?","createdAt":"2026-11-25T11:27:54.118519093Z"},{"id":"msg_3f9da4de-985e-40ca-9989-ccd679e8590c","conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","sender":"qa-8a62a10bd5e0","body":"Sure, now works","createdAt":"2026-11-25T11:27:54.712867531Z"},{"id":"msg_7f72f85b-6a21-49fa-acb7-62f120dd504a","conversationId":"cnv_913af405-2026-48e6-ba83-4bd228ae24c0","sender":"qa-8a62a10bd5e0","body":"Calling you","createdAt":"2026-11-25T11:27:54.764699191Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages
correlation: qa-e503c950-b2bb-48a1-8bd5-21cde16648b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e503c950-b2bb-48a1-8bd5-21cde16648b2
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e503c950-b2bb-48a1-8bd5-21cde16648b2
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
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_913af405-2026-48e6-ba83-4bd228ae24c0/messages","correlationId":"qa-e503c950-b2bb-48a1-8bd5-21cde16648b2"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-5a765097-1781-4d62-890a-64f1bb43627c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a765097-1781-4d62-890a-64f1bb43627c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a765097-1781-4d62-890a-64f1bb43627c
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
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_4adb6bbb-73af-45c7-aa01-93c9e97e7833"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-612f5426-f973-4fe8-8998-f0ada0eaeba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-612f5426-f973-4fe8-8998-f0ada0eaeba4
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-612f5426-f973-4fe8-8998-f0ada0eaeba4
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
X-Served-Region: in
```

## 29. POST /v1/auth/token

```text
#29 POST http://localhost:7070/v1/auth/token
correlation: qa-85b05f2c-9fde-4596-bc75-c7ac35d69216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b05f2c-9fde-4596-bc75-c7ac35d69216
Content-Type: application/json

--- request body ---
{"handle":"qa-d7152372d38c","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85b05f2c-9fde-4596-bc75-c7ac35d69216
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-85b05f2c-9fde-4596-bc75-c7ac35d69216"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb2f2633-b763-487c-bccc-3c57fd319934

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb2f2633-b763-487c-bccc-3c57fd319934
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb2f2633-b763-487c-bccc-3c57fd319934
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 9
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-675f0868-08d0-4efd-8414-75ca564a4cce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-675f0868-08d0-4efd-8414-75ca564a4cce
Content-Type: application/json

--- request body ---
{"handle":"qa-8a62a10bd5e0","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-675f0868-08d0-4efd-8414-75ca564a4cce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-675f0868-08d0-4efd-8414-75ca564a4cce"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d242c7fa-03d9-431f-bb89-ad93cc945942

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d242c7fa-03d9-431f-bb89-ad93cc945942
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d242c7fa-03d9-431f-bb89-ad93cc945942
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 9
X-Served-Region: eu
```

## 33. POST /v1/auth/token

```text
#33 POST http://localhost:7070/v1/auth/token
correlation: qa-018db37e-e488-4fcc-bab1-ccdb6f91e2b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-018db37e-e488-4fcc-bab1-ccdb6f91e2b5
Content-Type: application/json

--- request body ---
{"handle":"qa-0fc460719d61","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-018db37e-e488-4fcc-bab1-ccdb6f91e2b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-018db37e-e488-4fcc-bab1-ccdb6f91e2b5"}
```
