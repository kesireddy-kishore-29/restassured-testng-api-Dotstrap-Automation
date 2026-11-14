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
| 1 | `POST /v1/accounts` | 201 | 364 | `qa-70a5f163-bc60-4e12-ab51-d2c2ce30b07f` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-8c637f58-443c-438d-bc3a-ecc1160f9514` |
| 3 | `POST /v1/accounts` | 201 | 44 | `qa-ca296cfe-3d5b-4451-bb62-8450f485d800` |
| 4 | `POST /v1/auth/token` | 200 | 10 | `qa-c12a8bb9-46e7-49cc-82ae-51f57269ff94` |
| 5 | `POST /v1/conversations` | 201 | 65 | `qa-6c3783ce-5beb-4cee-b504-2fdc50aa10a5` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-244fa8ba-38eb-4b8b-9931-95c74af5958d` |
| 7 | `GET /v1/conversations` | 200 | 18 | `qa-364fc081-1b04-4866-97b3-853e46ee2862` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 15 | `qa-a2a9eb54-498a-4c1d-a76b-c0e4dc23be02` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 7 | `qa-eb84d6ff-24c7-45c3-8f10-80ad9aff73b7` |
| 10 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-a39933aa-6815-4855-b5b4-1343aa5d0755` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-02e775e9-4ac2-49c0-b51d-a5392389ed0c` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-b9324a09-72de-4051-8f27-6c3135b26bec` |
| 13 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-7b6e134c-e612-4ecc-a56a-0160322b25f1` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-83c894d2-8499-4107-9fae-46af7e40ad46` |
| 15 | `GET /v1/credits/balance` | 200 | 8 | `qa-40a7dc45-ea65-4064-80a2-f6ebf3f94d0c` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-05d9130b-93c0-43b3-b9ad-42a467a8ed84` |
| 17 | `POST /v1/auth/token` | 200 | 13 | `qa-a373236b-cd43-4dff-8f5c-c536cfeb09e7` |
| 18 | `GET /v1/conversations/{id}` | 403 | 19 | `qa-9ad6df47-b542-446a-8a7a-58c713af86af` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 8 | `qa-362168b2-2e03-41d5-88c6-2977e80ac3e6` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-9c840127-40ed-4624-b54b-15e36751b501` |
| 21 | `GET /v1/conversations` | 200 | 7 | `qa-757cbbe1-9030-42d6-9f1f-5e478f0d1774` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-9dfc864f-83cf-4096-aee3-2b6f9b35784c` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-57802f3d-e304-4bb2-b0a2-642fe8f38b34` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-9b86e6e3-6b41-4ace-8672-9275411b6cc1` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-7f424e89-6656-4d5e-94dd-f57cf78e3d07` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 5 | `qa-8bfe7ade-1ac3-4bb3-9ce5-d1df0c3599aa` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-aab4ea54-93a3-4c33-b366-ad51d2e9c916` |
| 28 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-96823359-972f-4622-92a6-31f4f9038948` |
| 29 | `POST /v1/auth/token` | 401 | 7 | `qa-3b51cb2d-d4c4-4f24-b296-1d7a45811264` |
| 30 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d200efd3-606d-4ccd-b3fc-2a2c9cb8a244` |
| 31 | `POST /v1/auth/token` | 401 | 6 | `qa-c59a3f34-a050-455a-b45f-7c9c6363d390` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-7affb540-b518-4ed1-b1d2-301561cd8666` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-5ea7e54c-64da-4f45-8ab1-78c1c41369a0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70a5f163-bc60-4e12-ab51-d2c2ce30b07f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a5f163-bc60-4e12-ab51-d2c2ce30b07f
Content-Type: application/json

--- request body ---
{"handle":"qa-11fe46ef4b0f","displayName":"QA 11fe46ef4b0f","password":"****","region":"eu"}

--- response: 201 in 364 ms ---
Date: Wed, 11 Nov 2026 09:34:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-70a5f163-bc60-4e12-ab51-d2c2ce30b07f
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
Location: /v1/accounts/qa-11fe46ef4b0f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eed4e92b-1dac-4798-a7a7-3294cf2d31a6","handle":"qa-11fe46ef4b0f","displayName":"QA 11fe46ef4b0f","region":"eu","role":"user","createdAt":"2026-11-11T09:34:22.933020935Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8c637f58-443c-438d-bc3a-ecc1160f9514

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c637f58-443c-438d-bc3a-ecc1160f9514
Content-Type: application/json

--- request body ---
{"handle":"qa-4fb8fb9fd0ef","displayName":"QA 4fb8fb9fd0ef","password":"****","region":"us"}

--- response: 201 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c637f58-443c-438d-bc3a-ecc1160f9514
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
Location: /v1/accounts/qa-4fb8fb9fd0ef
X-Served-Region: us
Content-Length: 181

{"id":"acc_18b6cb22-69ee-4ea3-b806-2a0449188cfb","handle":"qa-4fb8fb9fd0ef","displayName":"QA 4fb8fb9fd0ef","region":"us","role":"user","createdAt":"2026-11-11T09:34:23.212230269Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-ca296cfe-3d5b-4451-bb62-8450f485d800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca296cfe-3d5b-4451-bb62-8450f485d800
Content-Type: application/json

--- request body ---
{"handle":"qa-70fb4d7bb181","displayName":"QA 70fb4d7bb181","password":"****","region":"in"}

--- response: 201 in 44 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca296cfe-3d5b-4451-bb62-8450f485d800
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
Location: /v1/accounts/qa-70fb4d7bb181
X-Served-Region: in
Content-Length: 181

{"id":"acc_1fcf4b23-94c4-4101-baa1-3d4c75c1dc50","handle":"qa-70fb4d7bb181","displayName":"QA 70fb4d7bb181","region":"in","role":"user","createdAt":"2026-11-11T09:34:23.311544954Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c12a8bb9-46e7-49cc-82ae-51f57269ff94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c12a8bb9-46e7-49cc-82ae-51f57269ff94
Content-Type: application/json

--- request body ---
{"handle":"qa-11fe46ef4b0f","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c12a8bb9-46e7-49cc-82ae-51f57269ff94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eed4e92b-1dac-4798-a7a7-3294cf2d31a6"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-6c3783ce-5beb-4cee-b504-2fdc50aa10a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c3783ce-5beb-4cee-b504-2fdc50aa10a5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4fb8fb9fd0ef","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 65 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c3783ce-5beb-4cee-b504-2fdc50aa10a5
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
Location: /v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec
X-Data-Region: us
Content-Length: 238

{"id":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","subject":"Project kickoff","status":"open","region":"us","participants":["qa-11fe46ef4b0f","qa-4fb8fb9fd0ef"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:23.391650202Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-244fa8ba-38eb-4b8b-9931-95c74af5958d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-244fa8ba-38eb-4b8b-9931-95c74af5958d
Content-Type: application/json

--- request body ---
{"handle":"qa-4fb8fb9fd0ef","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-244fa8ba-38eb-4b8b-9931-95c74af5958d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18b6cb22-69ee-4ea3-b806-2a0449188cfb"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-364fc081-1b04-4866-97b3-853e46ee2862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-364fc081-1b04-4866-97b3-853e46ee2862
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-364fc081-1b04-4866-97b3-853e46ee2862
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

{"items":[{"id":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","subject":"Project kickoff","status":"open","region":"us","participants":["qa-11fe46ef4b0f","qa-4fb8fb9fd0ef"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-11T09:34:23.391650202Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages
correlation: qa-a2a9eb54-498a-4c1d-a76b-c0e4dc23be02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2a9eb54-498a-4c1d-a76b-c0e4dc23be02
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2a9eb54-498a-4c1d-a76b-c0e4dc23be02
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

{"items":[{"id":"msg_87c26552-d6bc-47e7-aa0b-4315a1361c44","conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","sender":"qa-11fe46ef4b0f","body":"Hi Ben, got a minute?","createdAt":"2026-11-11T09:34:23.391883529Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/read
correlation: qa-eb84d6ff-24c7-45c3-8f10-80ad9aff73b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb84d6ff-24c7-45c3-8f10-80ad9aff73b7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb84d6ff-24c7-45c3-8f10-80ad9aff73b7
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

{"conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec
correlation: qa-a39933aa-6815-4855-b5b4-1343aa5d0755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a39933aa-6815-4855-b5b4-1343aa5d0755
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a39933aa-6815-4855-b5b4-1343aa5d0755
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

{"id":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","subject":"Project kickoff","status":"open","region":"us","participants":["qa-11fe46ef4b0f","qa-4fb8fb9fd0ef"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:23.391650202Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages
correlation: qa-02e775e9-4ac2-49c0-b51d-a5392389ed0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02e775e9-4ac2-49c0-b51d-a5392389ed0c
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-02e775e9-4ac2-49c0-b51d-a5392389ed0c
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

{"id":"msg_7d294f71-593e-4661-84ff-5f4534cc89de","conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","sender":"qa-4fb8fb9fd0ef","body":"Sure, now works","createdAt":"2026-11-11T09:34:23.709356595Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages
correlation: qa-b9324a09-72de-4051-8f27-6c3135b26bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9324a09-72de-4051-8f27-6c3135b26bec
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9324a09-72de-4051-8f27-6c3135b26bec
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

{"id":"msg_0febeaaf-2851-40f2-8499-e53f2f0eb9d1","conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","sender":"qa-4fb8fb9fd0ef","body":"Calling you","createdAt":"2026-11-11T09:34:23.733212880Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec
correlation: qa-7b6e134c-e612-4ecc-a56a-0160322b25f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b6e134c-e612-4ecc-a56a-0160322b25f1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b6e134c-e612-4ecc-a56a-0160322b25f1
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

{"id":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","subject":"Project kickoff","status":"open","region":"us","participants":["qa-11fe46ef4b0f","qa-4fb8fb9fd0ef"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-11T09:34:23.391650202Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages
correlation: qa-83c894d2-8499-4107-9fae-46af7e40ad46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83c894d2-8499-4107-9fae-46af7e40ad46
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-83c894d2-8499-4107-9fae-46af7e40ad46
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

{"items":[{"id":"msg_87c26552-d6bc-47e7-aa0b-4315a1361c44","conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","sender":"qa-11fe46ef4b0f","body":"Hi Ben, got a minute?","createdAt":"2026-11-11T09:34:23.391883529Z"},{"id":"msg_7d294f71-593e-4661-84ff-5f4534cc89de","conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","sender":"qa-4fb8fb9fd0ef","body":"Sure, now works","createdAt":"2026-11-11T09:34:23.709356595Z"},{"id":"msg_0febeaaf-2851-40f2-8499-e53f2f0eb9d1","conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","sender":"qa-4fb8fb9fd0ef","body":"Calling you","createdAt":"2026-11-11T09:34:23.733212880Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-40a7dc45-ea65-4064-80a2-f6ebf3f94d0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40a7dc45-ea65-4064-80a2-f6ebf3f94d0c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-40a7dc45-ea65-4064-80a2-f6ebf3f94d0c
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

{"balance":4,"currency":"credits","accountId":"acc_eed4e92b-1dac-4798-a7a7-3294cf2d31a6"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-05d9130b-93c0-43b3-b9ad-42a467a8ed84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05d9130b-93c0-43b3-b9ad-42a467a8ed84
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-05d9130b-93c0-43b3-b9ad-42a467a8ed84
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

{"balance":3,"currency":"credits","accountId":"acc_18b6cb22-69ee-4ea3-b806-2a0449188cfb"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-a373236b-cd43-4dff-8f5c-c536cfeb09e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a373236b-cd43-4dff-8f5c-c536cfeb09e7
Content-Type: application/json

--- request body ---
{"handle":"qa-70fb4d7bb181","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a373236b-cd43-4dff-8f5c-c536cfeb09e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1fcf4b23-94c4-4101-baa1-3d4c75c1dc50"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec
correlation: qa-9ad6df47-b542-446a-8a7a-58c713af86af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ad6df47-b542-446a-8a7a-58c713af86af
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ad6df47-b542-446a-8a7a-58c713af86af
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","correlationId":"qa-9ad6df47-b542-446a-8a7a-58c713af86af"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages
correlation: qa-362168b2-2e03-41d5-88c6-2977e80ac3e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-362168b2-2e03-41d5-88c6-2977e80ac3e6
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-362168b2-2e03-41d5-88c6-2977e80ac3e6
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages","correlationId":"qa-362168b2-2e03-41d5-88c6-2977e80ac3e6"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages
correlation: qa-9c840127-40ed-4624-b54b-15e36751b501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c840127-40ed-4624-b54b-15e36751b501
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c840127-40ed-4624-b54b-15e36751b501
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages","correlationId":"qa-9c840127-40ed-4624-b54b-15e36751b501"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-757cbbe1-9030-42d6-9f1f-5e478f0d1774

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-757cbbe1-9030-42d6-9f1f-5e478f0d1774
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-757cbbe1-9030-42d6-9f1f-5e478f0d1774
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
correlation: qa-9dfc864f-83cf-4096-aee3-2b6f9b35784c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dfc864f-83cf-4096-aee3-2b6f9b35784c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dfc864f-83cf-4096-aee3-2b6f9b35784c
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

{"balance":5,"currency":"credits","accountId":"acc_1fcf4b23-94c4-4101-baa1-3d4c75c1dc50"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/close
correlation: qa-57802f3d-e304-4bb2-b0a2-642fe8f38b34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57802f3d-e304-4bb2-b0a2-642fe8f38b34
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-57802f3d-e304-4bb2-b0a2-642fe8f38b34
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

{"id":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-11fe46ef4b0f","qa-4fb8fb9fd0ef"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-11T09:34:23.391650202Z","closedAt":"2026-11-11T09:34:24.535595270Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/close
correlation: qa-9b86e6e3-6b41-4ace-8672-9275411b6cc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b86e6e3-6b41-4ace-8672-9275411b6cc1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b86e6e3-6b41-4ace-8672-9275411b6cc1
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

{"id":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-11fe46ef4b0f","qa-4fb8fb9fd0ef"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-11T09:34:23.391650202Z","closedAt":"2026-11-11T09:34:24.535595270Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages
correlation: qa-7f424e89-6656-4d5e-94dd-f57cf78e3d07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f424e89-6656-4d5e-94dd-f57cf78e3d07
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f424e89-6656-4d5e-94dd-f57cf78e3d07
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

{"items":[{"id":"msg_87c26552-d6bc-47e7-aa0b-4315a1361c44","conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","sender":"qa-11fe46ef4b0f","body":"Hi Ben, got a minute?","createdAt":"2026-11-11T09:34:23.391883529Z"},{"id":"msg_7d294f71-593e-4661-84ff-5f4534cc89de","conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","sender":"qa-4fb8fb9fd0ef","body":"Sure, now works","createdAt":"2026-11-11T09:34:23.709356595Z"},{"id":"msg_0febeaaf-2851-40f2-8499-e53f2f0eb9d1","conversationId":"cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec","sender":"qa-4fb8fb9fd0ef","body":"Calling you","createdAt":"2026-11-11T09:34:23.733212880Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages
correlation: qa-8bfe7ade-1ac3-4bb3-9ce5-d1df0c3599aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bfe7ade-1ac3-4bb3-9ce5-d1df0c3599aa
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bfe7ade-1ac3-4bb3-9ce5-d1df0c3599aa
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_376e2b4c-7abd-48d6-8a27-cd37de5b52ec/messages","correlationId":"qa-8bfe7ade-1ac3-4bb3-9ce5-d1df0c3599aa"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-aab4ea54-93a3-4c33-b366-ad51d2e9c916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aab4ea54-93a3-4c33-b366-ad51d2e9c916
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-aab4ea54-93a3-4c33-b366-ad51d2e9c916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_18b6cb22-69ee-4ea3-b806-2a0449188cfb"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96823359-972f-4622-92a6-31f4f9038948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96823359-972f-4622-92a6-31f4f9038948
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96823359-972f-4622-92a6-31f4f9038948
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
correlation: qa-3b51cb2d-d4c4-4f24-b296-1d7a45811264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b51cb2d-d4c4-4f24-b296-1d7a45811264
Content-Type: application/json

--- request body ---
{"handle":"qa-70fb4d7bb181","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b51cb2d-d4c4-4f24-b296-1d7a45811264
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3b51cb2d-d4c4-4f24-b296-1d7a45811264"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d200efd3-606d-4ccd-b3fc-2a2c9cb8a244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d200efd3-606d-4ccd-b3fc-2a2c9cb8a244
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d200efd3-606d-4ccd-b3fc-2a2c9cb8a244
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
correlation: qa-c59a3f34-a050-455a-b45f-7c9c6363d390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c59a3f34-a050-455a-b45f-7c9c6363d390
Content-Type: application/json

--- request body ---
{"handle":"qa-4fb8fb9fd0ef","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c59a3f34-a050-455a-b45f-7c9c6363d390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c59a3f34-a050-455a-b45f-7c9c6363d390"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7affb540-b518-4ed1-b1d2-301561cd8666

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7affb540-b518-4ed1-b1d2-301561cd8666
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7affb540-b518-4ed1-b1d2-301561cd8666
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
correlation: qa-5ea7e54c-64da-4f45-8ab1-78c1c41369a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ea7e54c-64da-4f45-8ab1-78c1c41369a0
Content-Type: application/json

--- request body ---
{"handle":"qa-11fe46ef4b0f","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ea7e54c-64da-4f45-8ab1-78c1c41369a0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ea7e54c-64da-4f45-8ab1-78c1c41369a0"}
```
