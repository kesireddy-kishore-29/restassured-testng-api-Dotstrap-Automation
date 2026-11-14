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
| 1 | `POST /v1/accounts` | 201 | 395 | `qa-6cfabc27-5b4f-404d-b30f-9ed94b848f4b` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-dd3add3e-957c-406a-af00-e11085dd8752` |
| 3 | `POST /v1/accounts` | 201 | 55 | `qa-c58c5dca-4827-4edd-99f5-e1e921cbf673` |
| 4 | `POST /v1/auth/token` | 200 | 13 | `qa-13020955-9e39-4761-8088-fbaf70c22be0` |
| 5 | `POST /v1/conversations` | 201 | 89 | `qa-bd0ff7d0-a248-4db7-b4b9-1c6a26561c2c` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-f29c6f45-f88e-4bff-9d34-56a3a908e679` |
| 7 | `GET /v1/conversations` | 200 | 22 | `qa-386ed99a-8d48-4938-b5b9-d88b839f1b62` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 21 | `qa-6888d9a7-f9c5-4b65-8ad0-b6a88d7f7d9e` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-f2d4c11a-ce06-4db8-a15c-63b552169ede` |
| 10 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-6ff51a81-b6a3-4b38-b35c-df3f1baf1fa2` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-701c89b0-92a0-42a5-9c29-9427f75b46e0` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-e091e799-a587-408d-847f-3e1b766cdfd4` |
| 13 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-ec85aa5f-cd93-40c8-88d8-1fe07d6c9ab6` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 15 | `qa-6ea7aed2-2a67-47d0-89bb-a9f2cd99263b` |
| 15 | `GET /v1/credits/balance` | 200 | 5 | `qa-ca2b9fcb-5901-4d5c-9be1-a7d46b6d9010` |
| 16 | `GET /v1/credits/balance` | 200 | 16 | `qa-99c3286f-b8fd-41fb-85da-ae69db1de298` |
| 17 | `POST /v1/auth/token` | 200 | 9 | `qa-02ed3684-adf0-4bd5-a84a-0e5b04f537b4` |
| 18 | `GET /v1/conversations/{id}` | 403 | 19 | `qa-064e9766-7769-4395-bcc8-260ace05f95b` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 8 | `qa-ab08bd7c-39ea-4a4f-980c-e382739bd0cc` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-f59e37d8-203f-4eb1-b2ba-411e97e87c10` |
| 21 | `GET /v1/conversations` | 200 | 8 | `qa-258382cf-e1d3-4e24-890f-5e12f7b0a87a` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-4376e84b-276d-4aa1-a279-79f566a2ecd8` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-6eaa2c81-e635-48e7-a576-20dbcf207132` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-6254fa13-6248-4920-87f6-61c218d35836` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-b26efd1b-f443-4ba3-a5b3-194922d26e97` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 6 | `qa-ff03bfc9-ff6b-42fd-878e-9ee78ef1e420` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-5409db2f-ded7-4fa6-b113-7ef8aa1f4b18` |
| 28 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-c4e83003-1771-4104-87da-8e376354d79f` |
| 29 | `POST /v1/auth/token` | 401 | 8 | `qa-a3ee3bd1-3951-4ce1-966a-350726548805` |
| 30 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-940ac476-4003-4689-8890-a03d9c6da89a` |
| 31 | `POST /v1/auth/token` | 401 | 5 | `qa-550e92df-60ca-4816-9b9b-b00cbfff80e6` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-f001c2c7-fbe7-46f1-b8c1-8d885ad88edd` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-c824d4cf-9c0e-4902-a05e-a2cffd91b4dc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6cfabc27-5b4f-404d-b30f-9ed94b848f4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cfabc27-5b4f-404d-b30f-9ed94b848f4b
Content-Type: application/json

--- request body ---
{"handle":"qa-48c122f8bca5","displayName":"QA 48c122f8bca5","password":"****","region":"eu"}

--- response: 201 in 395 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cfabc27-5b4f-404d-b30f-9ed94b848f4b
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
Location: /v1/accounts/qa-48c122f8bca5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2223dbfe-d33e-4367-acad-c1cc92537895","handle":"qa-48c122f8bca5","displayName":"QA 48c122f8bca5","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.449527834Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dd3add3e-957c-406a-af00-e11085dd8752

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd3add3e-957c-406a-af00-e11085dd8752
Content-Type: application/json

--- request body ---
{"handle":"qa-2c009c59ebcd","displayName":"QA 2c009c59ebcd","password":"****","region":"us"}

--- response: 201 in 53 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd3add3e-957c-406a-af00-e11085dd8752
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
Location: /v1/accounts/qa-2c009c59ebcd
X-Served-Region: us
Content-Length: 181

{"id":"acc_5a00294c-d6ca-4591-afaf-241d4fb1c1a1","handle":"qa-2c009c59ebcd","displayName":"QA 2c009c59ebcd","region":"us","role":"user","createdAt":"2026-11-09T09:55:59.827770689Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-c58c5dca-4827-4edd-99f5-e1e921cbf673

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c58c5dca-4827-4edd-99f5-e1e921cbf673
Content-Type: application/json

--- request body ---
{"handle":"qa-e25f35274429","displayName":"QA e25f35274429","password":"****","region":"in"}

--- response: 201 in 55 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c58c5dca-4827-4edd-99f5-e1e921cbf673
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Location: /v1/accounts/qa-e25f35274429
X-Served-Region: in
Content-Length: 181

{"id":"acc_89636b7a-e738-4995-9c22-ea59dbc1cbfc","handle":"qa-e25f35274429","displayName":"QA e25f35274429","region":"in","role":"user","createdAt":"2026-11-09T09:55:59.923912761Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-13020955-9e39-4761-8088-fbaf70c22be0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13020955-9e39-4761-8088-fbaf70c22be0
Content-Type: application/json

--- request body ---
{"handle":"qa-48c122f8bca5","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-13020955-9e39-4761-8088-fbaf70c22be0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2223dbfe-d33e-4367-acad-c1cc92537895"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-bd0ff7d0-a248-4db7-b4b9-1c6a26561c2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0ff7d0-a248-4db7-b4b9-1c6a26561c2c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2c009c59ebcd","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 89 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd0ff7d0-a248-4db7-b4b9-1c6a26561c2c
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
Location: /v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6
X-Data-Region: us
Content-Length: 238

{"id":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","subject":"Project kickoff","status":"open","region":"us","participants":["qa-48c122f8bca5","qa-2c009c59ebcd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:00.058151887Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f29c6f45-f88e-4bff-9d34-56a3a908e679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f29c6f45-f88e-4bff-9d34-56a3a908e679
Content-Type: application/json

--- request body ---
{"handle":"qa-2c009c59ebcd","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f29c6f45-f88e-4bff-9d34-56a3a908e679
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5a00294c-d6ca-4591-afaf-241d4fb1c1a1"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-386ed99a-8d48-4938-b5b9-d88b839f1b62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-386ed99a-8d48-4938-b5b9-d88b839f1b62
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-386ed99a-8d48-4938-b5b9-d88b839f1b62
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

{"items":[{"id":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","subject":"Project kickoff","status":"open","region":"us","participants":["qa-48c122f8bca5","qa-2c009c59ebcd"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-09T09:56:00.058151887Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages
correlation: qa-6888d9a7-f9c5-4b65-8ad0-b6a88d7f7d9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6888d9a7-f9c5-4b65-8ad0-b6a88d7f7d9e
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6888d9a7-f9c5-4b65-8ad0-b6a88d7f7d9e
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

{"items":[{"id":"msg_703cbb88-68a0-4c8b-a415-61429de93bfe","conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","sender":"qa-48c122f8bca5","body":"Hi Ben, got a minute?","createdAt":"2026-11-09T09:56:00.058444712Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/read
correlation: qa-f2d4c11a-ce06-4db8-a15c-63b552169ede

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2d4c11a-ce06-4db8-a15c-63b552169ede
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2d4c11a-ce06-4db8-a15c-63b552169ede
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

{"conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6
correlation: qa-6ff51a81-b6a3-4b38-b35c-df3f1baf1fa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ff51a81-b6a3-4b38-b35c-df3f1baf1fa2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ff51a81-b6a3-4b38-b35c-df3f1baf1fa2
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

{"id":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","subject":"Project kickoff","status":"open","region":"us","participants":["qa-48c122f8bca5","qa-2c009c59ebcd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:00.058151887Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages
correlation: qa-701c89b0-92a0-42a5-9c29-9427f75b46e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-701c89b0-92a0-42a5-9c29-9427f75b46e0
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-701c89b0-92a0-42a5-9c29-9427f75b46e0
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

{"id":"msg_1aba519c-6958-4f7b-9b13-475e1ee6fd4b","conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","sender":"qa-2c009c59ebcd","body":"Sure, now works","createdAt":"2026-11-09T09:56:00.478263693Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages
correlation: qa-e091e799-a587-408d-847f-3e1b766cdfd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e091e799-a587-408d-847f-3e1b766cdfd4
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e091e799-a587-408d-847f-3e1b766cdfd4
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

{"id":"msg_12740f0b-cd74-422d-9bf6-e03338d2780f","conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","sender":"qa-2c009c59ebcd","body":"Calling you","createdAt":"2026-11-09T09:56:00.507623096Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6
correlation: qa-ec85aa5f-cd93-40c8-88d8-1fe07d6c9ab6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec85aa5f-cd93-40c8-88d8-1fe07d6c9ab6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec85aa5f-cd93-40c8-88d8-1fe07d6c9ab6
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

{"id":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","subject":"Project kickoff","status":"open","region":"us","participants":["qa-48c122f8bca5","qa-2c009c59ebcd"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-09T09:56:00.058151887Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages
correlation: qa-6ea7aed2-2a67-47d0-89bb-a9f2cd99263b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ea7aed2-2a67-47d0-89bb-a9f2cd99263b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ea7aed2-2a67-47d0-89bb-a9f2cd99263b
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

{"items":[{"id":"msg_703cbb88-68a0-4c8b-a415-61429de93bfe","conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","sender":"qa-48c122f8bca5","body":"Hi Ben, got a minute?","createdAt":"2026-11-09T09:56:00.058444712Z"},{"id":"msg_1aba519c-6958-4f7b-9b13-475e1ee6fd4b","conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","sender":"qa-2c009c59ebcd","body":"Sure, now works","createdAt":"2026-11-09T09:56:00.478263693Z"},{"id":"msg_12740f0b-cd74-422d-9bf6-e03338d2780f","conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","sender":"qa-2c009c59ebcd","body":"Calling you","createdAt":"2026-11-09T09:56:00.507623096Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-ca2b9fcb-5901-4d5c-9be1-a7d46b6d9010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca2b9fcb-5901-4d5c-9be1-a7d46b6d9010
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca2b9fcb-5901-4d5c-9be1-a7d46b6d9010
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

{"balance":4,"currency":"credits","accountId":"acc_2223dbfe-d33e-4367-acad-c1cc92537895"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-99c3286f-b8fd-41fb-85da-ae69db1de298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99c3286f-b8fd-41fb-85da-ae69db1de298
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-99c3286f-b8fd-41fb-85da-ae69db1de298
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

{"balance":3,"currency":"credits","accountId":"acc_5a00294c-d6ca-4591-afaf-241d4fb1c1a1"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-02ed3684-adf0-4bd5-a84a-0e5b04f537b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02ed3684-adf0-4bd5-a84a-0e5b04f537b4
Content-Type: application/json

--- request body ---
{"handle":"qa-e25f35274429","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-02ed3684-adf0-4bd5-a84a-0e5b04f537b4
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89636b7a-e738-4995-9c22-ea59dbc1cbfc"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6
correlation: qa-064e9766-7769-4395-bcc8-260ace05f95b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-064e9766-7769-4395-bcc8-260ace05f95b
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-064e9766-7769-4395-bcc8-260ace05f95b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","correlationId":"qa-064e9766-7769-4395-bcc8-260ace05f95b"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages
correlation: qa-ab08bd7c-39ea-4a4f-980c-e382739bd0cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab08bd7c-39ea-4a4f-980c-e382739bd0cc
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab08bd7c-39ea-4a4f-980c-e382739bd0cc
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages","correlationId":"qa-ab08bd7c-39ea-4a4f-980c-e382739bd0cc"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages
correlation: qa-f59e37d8-203f-4eb1-b2ba-411e97e87c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f59e37d8-203f-4eb1-b2ba-411e97e87c10
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f59e37d8-203f-4eb1-b2ba-411e97e87c10
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages","correlationId":"qa-f59e37d8-203f-4eb1-b2ba-411e97e87c10"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-258382cf-e1d3-4e24-890f-5e12f7b0a87a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-258382cf-e1d3-4e24-890f-5e12f7b0a87a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-258382cf-e1d3-4e24-890f-5e12f7b0a87a
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
correlation: qa-4376e84b-276d-4aa1-a279-79f566a2ecd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4376e84b-276d-4aa1-a279-79f566a2ecd8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4376e84b-276d-4aa1-a279-79f566a2ecd8
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

{"balance":5,"currency":"credits","accountId":"acc_89636b7a-e738-4995-9c22-ea59dbc1cbfc"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/close
correlation: qa-6eaa2c81-e635-48e7-a576-20dbcf207132

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eaa2c81-e635-48e7-a576-20dbcf207132
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eaa2c81-e635-48e7-a576-20dbcf207132
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

{"id":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-48c122f8bca5","qa-2c009c59ebcd"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-09T09:56:00.058151887Z","closedAt":"2026-11-09T09:56:01.517136462Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/close
correlation: qa-6254fa13-6248-4920-87f6-61c218d35836

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6254fa13-6248-4920-87f6-61c218d35836
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6254fa13-6248-4920-87f6-61c218d35836
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

{"id":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-48c122f8bca5","qa-2c009c59ebcd"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-09T09:56:00.058151887Z","closedAt":"2026-11-09T09:56:01.517136462Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages
correlation: qa-b26efd1b-f443-4ba3-a5b3-194922d26e97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b26efd1b-f443-4ba3-a5b3-194922d26e97
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b26efd1b-f443-4ba3-a5b3-194922d26e97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_703cbb88-68a0-4c8b-a415-61429de93bfe","conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","sender":"qa-48c122f8bca5","body":"Hi Ben, got a minute?","createdAt":"2026-11-09T09:56:00.058444712Z"},{"id":"msg_1aba519c-6958-4f7b-9b13-475e1ee6fd4b","conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","sender":"qa-2c009c59ebcd","body":"Sure, now works","createdAt":"2026-11-09T09:56:00.478263693Z"},{"id":"msg_12740f0b-cd74-422d-9bf6-e03338d2780f","conversationId":"cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6","sender":"qa-2c009c59ebcd","body":"Calling you","createdAt":"2026-11-09T09:56:00.507623096Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages
correlation: qa-ff03bfc9-ff6b-42fd-878e-9ee78ef1e420

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff03bfc9-ff6b-42fd-878e-9ee78ef1e420
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff03bfc9-ff6b-42fd-878e-9ee78ef1e420
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_aace43c1-61a1-4f94-a179-267a1e1ca0d6/messages","correlationId":"qa-ff03bfc9-ff6b-42fd-878e-9ee78ef1e420"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-5409db2f-ded7-4fa6-b113-7ef8aa1f4b18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5409db2f-ded7-4fa6-b113-7ef8aa1f4b18
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5409db2f-ded7-4fa6-b113-7ef8aa1f4b18
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

{"balance":3,"currency":"credits","accountId":"acc_5a00294c-d6ca-4591-afaf-241d4fb1c1a1"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4e83003-1771-4104-87da-8e376354d79f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4e83003-1771-4104-87da-8e376354d79f
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4e83003-1771-4104-87da-8e376354d79f
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
correlation: qa-a3ee3bd1-3951-4ce1-966a-350726548805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3ee3bd1-3951-4ce1-966a-350726548805
Content-Type: application/json

--- request body ---
{"handle":"qa-e25f35274429","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3ee3bd1-3951-4ce1-966a-350726548805
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a3ee3bd1-3951-4ce1-966a-350726548805"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-940ac476-4003-4689-8890-a03d9c6da89a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-940ac476-4003-4689-8890-a03d9c6da89a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-940ac476-4003-4689-8890-a03d9c6da89a
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
correlation: qa-550e92df-60ca-4816-9b9b-b00cbfff80e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-550e92df-60ca-4816-9b9b-b00cbfff80e6
Content-Type: application/json

--- request body ---
{"handle":"qa-2c009c59ebcd","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-550e92df-60ca-4816-9b9b-b00cbfff80e6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-550e92df-60ca-4816-9b9b-b00cbfff80e6"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f001c2c7-fbe7-46f1-b8c1-8d885ad88edd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f001c2c7-fbe7-46f1-b8c1-8d885ad88edd
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f001c2c7-fbe7-46f1-b8c1-8d885ad88edd
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
correlation: qa-c824d4cf-9c0e-4902-a05e-a2cffd91b4dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c824d4cf-9c0e-4902-a05e-a2cffd91b4dc
Content-Type: application/json

--- request body ---
{"handle":"qa-48c122f8bca5","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c824d4cf-9c0e-4902-a05e-a2cffd91b4dc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c824d4cf-9c0e-4902-a05e-a2cffd91b4dc"}
```
