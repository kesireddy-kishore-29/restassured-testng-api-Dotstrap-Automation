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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-bfce12fb-b85d-43e3-ba41-0f6611537b9f` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-152dea5e-7522-4b22-85cd-926451c8b6cc` |
| 3 | `POST /v1/accounts` | 201 | 11 | `qa-7b57f0a1-50b7-4375-94a2-66f97a4e8fe0` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-e180e536-f0bc-412d-a62f-1ae5aa0ab3af` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-14f20800-a298-4212-bda3-4da4cfd124d4` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-540bef57-fb55-43a3-aa06-25df2d5dc438` |
| 7 | `GET /v1/conversations` | 200 | 18 | `qa-1a545c6d-813d-4ecc-bd8b-d0f01bb9deb7` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 12 | `qa-da70b664-39e5-4227-b85f-65b61d4aa147` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-80dd4846-b1ea-475e-88a2-1bb5e02fd8a8` |
| 10 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-d6741460-050b-42be-a3c4-c83496523dbb` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-57a3b3d4-0df6-40f0-9747-0e19a6700c49` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-7344630b-a6ab-44f6-be60-87fc42250e35` |
| 13 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-9bc13d6b-aa0a-4129-a8e9-95de652fb600` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-ef2ee175-1dba-428a-8770-d366551518e0` |
| 15 | `GET /v1/credits/balance` | 200 | 6 | `qa-c6b89f05-85a2-4094-98f8-4c03167d0b88` |
| 16 | `GET /v1/credits/balance` | 200 | 8 | `qa-60eb502c-edb1-41fb-87fc-2927f06102fb` |
| 17 | `POST /v1/auth/token` | 200 | 15 | `qa-febdd64b-293c-4dfa-9182-a9c58c4a9c3d` |
| 18 | `GET /v1/conversations/{id}` | 403 | 9 | `qa-a38623c8-c52a-443d-882f-0be599aa2df4` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-763f7f23-b4d7-4115-8bf0-6cea83ec9a4c` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-3bf7c950-c11c-4d3f-95d9-d8e42b53b882` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-abe3dfc8-27cc-43cc-a57e-90a5fe264c91` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-c95735c3-1d6b-4c86-9b0d-05b2d30657e3` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-b52c2ee8-e2d2-4a95-b9ca-5f754139cc33` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-b0593cdd-a4f3-4fd5-a31f-1ddbf6b217b7` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-391a6a68-077c-4f77-99d9-db05d055bbee` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 5 | `qa-ff3c6d40-2dd5-41cb-a941-a8ce66646567` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-d5480047-1873-47f8-a85d-2228e3d0b05c` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-bcb9950f-9c3f-4040-91e1-786f13054eec` |
| 29 | `POST /v1/auth/token` | 401 | 8 | `qa-8fe54598-52f1-4715-b14d-d464a11796b3` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e3932175-38ac-4400-b6b1-b7772f8457ed` |
| 31 | `POST /v1/auth/token` | 401 | 5 | `qa-216e5c0d-b57d-4f8a-98aa-25272d936a2b` |
| 32 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-94fbadec-399c-41f0-932d-091645d89f75` |
| 33 | `POST /v1/auth/token` | 401 | 5 | `qa-011d6581-9f8c-489a-834c-3bd8be1c0e99` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bfce12fb-b85d-43e3-ba41-0f6611537b9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfce12fb-b85d-43e3-ba41-0f6611537b9f
Content-Type: application/json

--- request body ---
{"handle":"qa-ed0ec188f6b4","displayName":"QA ed0ec188f6b4","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfce12fb-b85d-43e3-ba41-0f6611537b9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-ed0ec188f6b4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a94d813c-0c2b-4f9a-af23-af9293b81d48","handle":"qa-ed0ec188f6b4","displayName":"QA ed0ec188f6b4","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.736002361Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-152dea5e-7522-4b22-85cd-926451c8b6cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-152dea5e-7522-4b22-85cd-926451c8b6cc
Content-Type: application/json

--- request body ---
{"handle":"qa-face2125a9ef","displayName":"QA face2125a9ef","password":"****","region":"us"}

--- response: 201 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-152dea5e-7522-4b22-85cd-926451c8b6cc
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
Location: /v1/accounts/qa-face2125a9ef
X-Served-Region: us
Content-Length: 181

{"id":"acc_70e7040a-42e3-4fe2-9b88-43037a22e462","handle":"qa-face2125a9ef","displayName":"QA face2125a9ef","region":"us","role":"user","createdAt":"2026-10-31T08:31:36.762500005Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-7b57f0a1-50b7-4375-94a2-66f97a4e8fe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b57f0a1-50b7-4375-94a2-66f97a4e8fe0
Content-Type: application/json

--- request body ---
{"handle":"qa-1687e6fa7e6e","displayName":"QA 1687e6fa7e6e","password":"****","region":"in"}

--- response: 201 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b57f0a1-50b7-4375-94a2-66f97a4e8fe0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Location: /v1/accounts/qa-1687e6fa7e6e
X-Served-Region: in
Content-Length: 181

{"id":"acc_ffb77f3d-e8b9-4e60-afa3-41520f0ae4e1","handle":"qa-1687e6fa7e6e","displayName":"QA 1687e6fa7e6e","region":"in","role":"user","createdAt":"2026-10-31T08:31:36.788125018Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e180e536-f0bc-412d-a62f-1ae5aa0ab3af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e180e536-f0bc-412d-a62f-1ae5aa0ab3af
Content-Type: application/json

--- request body ---
{"handle":"qa-ed0ec188f6b4","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e180e536-f0bc-412d-a62f-1ae5aa0ab3af
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a94d813c-0c2b-4f9a-af23-af9293b81d48"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-14f20800-a298-4212-bda3-4da4cfd124d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14f20800-a298-4212-bda3-4da4cfd124d4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-face2125a9ef","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-14f20800-a298-4212-bda3-4da4cfd124d4
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
Location: /v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136
X-Data-Region: us
Content-Length: 238

{"id":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ed0ec188f6b4","qa-face2125a9ef"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.837660491Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-540bef57-fb55-43a3-aa06-25df2d5dc438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-540bef57-fb55-43a3-aa06-25df2d5dc438
Content-Type: application/json

--- request body ---
{"handle":"qa-face2125a9ef","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-540bef57-fb55-43a3-aa06-25df2d5dc438
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_70e7040a-42e3-4fe2-9b88-43037a22e462"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-1a545c6d-813d-4ecc-bd8b-d0f01bb9deb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a545c6d-813d-4ecc-bd8b-d0f01bb9deb7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a545c6d-813d-4ecc-bd8b-d0f01bb9deb7
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

{"items":[{"id":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ed0ec188f6b4","qa-face2125a9ef"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-31T08:31:36.837660491Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages
correlation: qa-da70b664-39e5-4227-b85f-65b61d4aa147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da70b664-39e5-4227-b85f-65b61d4aa147
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-da70b664-39e5-4227-b85f-65b61d4aa147
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

{"items":[{"id":"msg_6b103d60-e300-47da-b11e-5c104c5c9666","conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","sender":"qa-ed0ec188f6b4","body":"Hi Ben, got a minute?","createdAt":"2026-10-31T08:31:36.837692881Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/read
correlation: qa-80dd4846-b1ea-475e-88a2-1bb5e02fd8a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80dd4846-b1ea-475e-88a2-1bb5e02fd8a8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-80dd4846-b1ea-475e-88a2-1bb5e02fd8a8
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

{"conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136
correlation: qa-d6741460-050b-42be-a3c4-c83496523dbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6741460-050b-42be-a3c4-c83496523dbb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6741460-050b-42be-a3c4-c83496523dbb
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

{"id":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ed0ec188f6b4","qa-face2125a9ef"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.837660491Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages
correlation: qa-57a3b3d4-0df6-40f0-9747-0e19a6700c49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57a3b3d4-0df6-40f0-9747-0e19a6700c49
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-57a3b3d4-0df6-40f0-9747-0e19a6700c49
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

{"id":"msg_40ac768f-c158-4409-8cc9-817eafa2ccbe","conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","sender":"qa-face2125a9ef","body":"Sure, now works","createdAt":"2026-10-31T08:31:36.985189863Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages
correlation: qa-7344630b-a6ab-44f6-be60-87fc42250e35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7344630b-a6ab-44f6-be60-87fc42250e35
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7344630b-a6ab-44f6-be60-87fc42250e35
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

{"id":"msg_f88e4ced-42ae-43d9-8f50-d2bc82c4b4d8","conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","sender":"qa-face2125a9ef","body":"Calling you","createdAt":"2026-10-31T08:31:37.030114901Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136
correlation: qa-9bc13d6b-aa0a-4129-a8e9-95de652fb600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bc13d6b-aa0a-4129-a8e9-95de652fb600
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bc13d6b-aa0a-4129-a8e9-95de652fb600
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

{"id":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ed0ec188f6b4","qa-face2125a9ef"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-31T08:31:36.837660491Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages
correlation: qa-ef2ee175-1dba-428a-8770-d366551518e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef2ee175-1dba-428a-8770-d366551518e0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef2ee175-1dba-428a-8770-d366551518e0
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

{"items":[{"id":"msg_6b103d60-e300-47da-b11e-5c104c5c9666","conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","sender":"qa-ed0ec188f6b4","body":"Hi Ben, got a minute?","createdAt":"2026-10-31T08:31:36.837692881Z"},{"id":"msg_40ac768f-c158-4409-8cc9-817eafa2ccbe","conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","sender":"qa-face2125a9ef","body":"Sure, now works","createdAt":"2026-10-31T08:31:36.985189863Z"},{"id":"msg_f88e4ced-42ae-43d9-8f50-d2bc82c4b4d8","conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","sender":"qa-face2125a9ef","body":"Calling you","createdAt":"2026-10-31T08:31:37.030114901Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-c6b89f05-85a2-4094-98f8-4c03167d0b88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6b89f05-85a2-4094-98f8-4c03167d0b88
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6b89f05-85a2-4094-98f8-4c03167d0b88
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

{"balance":4,"currency":"credits","accountId":"acc_a94d813c-0c2b-4f9a-af23-af9293b81d48"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-60eb502c-edb1-41fb-87fc-2927f06102fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60eb502c-edb1-41fb-87fc-2927f06102fb
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-60eb502c-edb1-41fb-87fc-2927f06102fb
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

{"balance":3,"currency":"credits","accountId":"acc_70e7040a-42e3-4fe2-9b88-43037a22e462"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-febdd64b-293c-4dfa-9182-a9c58c4a9c3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-febdd64b-293c-4dfa-9182-a9c58c4a9c3d
Content-Type: application/json

--- request body ---
{"handle":"qa-1687e6fa7e6e","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-febdd64b-293c-4dfa-9182-a9c58c4a9c3d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ffb77f3d-e8b9-4e60-afa3-41520f0ae4e1"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136
correlation: qa-a38623c8-c52a-443d-882f-0be599aa2df4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a38623c8-c52a-443d-882f-0be599aa2df4
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a38623c8-c52a-443d-882f-0be599aa2df4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","correlationId":"qa-a38623c8-c52a-443d-882f-0be599aa2df4"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages
correlation: qa-763f7f23-b4d7-4115-8bf0-6cea83ec9a4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-763f7f23-b4d7-4115-8bf0-6cea83ec9a4c
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-763f7f23-b4d7-4115-8bf0-6cea83ec9a4c
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages","correlationId":"qa-763f7f23-b4d7-4115-8bf0-6cea83ec9a4c"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages
correlation: qa-3bf7c950-c11c-4d3f-95d9-d8e42b53b882

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bf7c950-c11c-4d3f-95d9-d8e42b53b882
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bf7c950-c11c-4d3f-95d9-d8e42b53b882
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages","correlationId":"qa-3bf7c950-c11c-4d3f-95d9-d8e42b53b882"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-abe3dfc8-27cc-43cc-a57e-90a5fe264c91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abe3dfc8-27cc-43cc-a57e-90a5fe264c91
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-abe3dfc8-27cc-43cc-a57e-90a5fe264c91
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
correlation: qa-c95735c3-1d6b-4c86-9b0d-05b2d30657e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c95735c3-1d6b-4c86-9b0d-05b2d30657e3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c95735c3-1d6b-4c86-9b0d-05b2d30657e3
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

{"balance":5,"currency":"credits","accountId":"acc_ffb77f3d-e8b9-4e60-afa3-41520f0ae4e1"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/close
correlation: qa-b52c2ee8-e2d2-4a95-b9ca-5f754139cc33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b52c2ee8-e2d2-4a95-b9ca-5f754139cc33
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b52c2ee8-e2d2-4a95-b9ca-5f754139cc33
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
Content-Length: 284

{"id":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-ed0ec188f6b4","qa-face2125a9ef"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-31T08:31:36.837660491Z","closedAt":"2026-10-31T08:31:37.713211633Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/close
correlation: qa-b0593cdd-a4f3-4fd5-a31f-1ddbf6b217b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0593cdd-a4f3-4fd5-a31f-1ddbf6b217b7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0593cdd-a4f3-4fd5-a31f-1ddbf6b217b7
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
Content-Length: 284

{"id":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-ed0ec188f6b4","qa-face2125a9ef"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-31T08:31:36.837660491Z","closedAt":"2026-10-31T08:31:37.713211633Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages
correlation: qa-391a6a68-077c-4f77-99d9-db05d055bbee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-391a6a68-077c-4f77-99d9-db05d055bbee
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-391a6a68-077c-4f77-99d9-db05d055bbee
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

{"items":[{"id":"msg_6b103d60-e300-47da-b11e-5c104c5c9666","conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","sender":"qa-ed0ec188f6b4","body":"Hi Ben, got a minute?","createdAt":"2026-10-31T08:31:36.837692881Z"},{"id":"msg_40ac768f-c158-4409-8cc9-817eafa2ccbe","conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","sender":"qa-face2125a9ef","body":"Sure, now works","createdAt":"2026-10-31T08:31:36.985189863Z"},{"id":"msg_f88e4ced-42ae-43d9-8f50-d2bc82c4b4d8","conversationId":"cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136","sender":"qa-face2125a9ef","body":"Calling you","createdAt":"2026-10-31T08:31:37.030114901Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages
correlation: qa-ff3c6d40-2dd5-41cb-a941-a8ce66646567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff3c6d40-2dd5-41cb-a941-a8ce66646567
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff3c6d40-2dd5-41cb-a941-a8ce66646567
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_0efe8961-03c7-45a9-96ee-8182fe8bf136/messages","correlationId":"qa-ff3c6d40-2dd5-41cb-a941-a8ce66646567"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-d5480047-1873-47f8-a85d-2228e3d0b05c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5480047-1873-47f8-a85d-2228e3d0b05c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5480047-1873-47f8-a85d-2228e3d0b05c
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

{"balance":3,"currency":"credits","accountId":"acc_70e7040a-42e3-4fe2-9b88-43037a22e462"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcb9950f-9c3f-4040-91e1-786f13054eec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcb9950f-9c3f-4040-91e1-786f13054eec
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bcb9950f-9c3f-4040-91e1-786f13054eec
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
correlation: qa-8fe54598-52f1-4715-b14d-d464a11796b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fe54598-52f1-4715-b14d-d464a11796b3
Content-Type: application/json

--- request body ---
{"handle":"qa-1687e6fa7e6e","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8fe54598-52f1-4715-b14d-d464a11796b3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8fe54598-52f1-4715-b14d-d464a11796b3"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3932175-38ac-4400-b6b1-b7772f8457ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3932175-38ac-4400-b6b1-b7772f8457ed
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3932175-38ac-4400-b6b1-b7772f8457ed
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
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-216e5c0d-b57d-4f8a-98aa-25272d936a2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-216e5c0d-b57d-4f8a-98aa-25272d936a2b
Content-Type: application/json

--- request body ---
{"handle":"qa-face2125a9ef","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-216e5c0d-b57d-4f8a-98aa-25272d936a2b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-216e5c0d-b57d-4f8a-98aa-25272d936a2b"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94fbadec-399c-41f0-932d-091645d89f75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94fbadec-399c-41f0-932d-091645d89f75
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94fbadec-399c-41f0-932d-091645d89f75
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
```

## 33. POST /v1/auth/token

```text
#33 POST http://localhost:7070/v1/auth/token
correlation: qa-011d6581-9f8c-489a-834c-3bd8be1c0e99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-011d6581-9f8c-489a-834c-3bd8be1c0e99
Content-Type: application/json

--- request body ---
{"handle":"qa-ed0ec188f6b4","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-011d6581-9f8c-489a-834c-3bd8be1c0e99
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-011d6581-9f8c-489a-834c-3bd8be1c0e99"}
```
