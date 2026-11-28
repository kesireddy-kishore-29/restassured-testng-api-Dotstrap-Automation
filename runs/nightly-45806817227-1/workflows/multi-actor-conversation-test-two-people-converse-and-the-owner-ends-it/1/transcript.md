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
| 1 | `POST /v1/accounts` | 201 | 312 | `qa-f49f99de-afa4-408a-b61c-3a3add3345a3` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-e66fa1e0-3713-4de3-bd7f-5c99af20c348` |
| 3 | `POST /v1/accounts` | 201 | 10 | `qa-85161281-0bbf-4445-b4cc-d491641651cd` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-247dfb8f-0b64-4e2b-bc46-678222d36875` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-3faaf6a6-ab38-4fb4-a0fb-652e580e658e` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-14d200fb-740d-44b5-ba72-9b4bd2e33035` |
| 7 | `GET /v1/conversations` | 200 | 28 | `qa-20a60d3d-b19e-4f2d-8282-75454476d080` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-43d5d1a5-9ea6-438e-9f57-012ca52ea00c` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 44 | `qa-8fb9a2ae-8a2d-4193-9eac-be3077714671` |
| 10 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-532f955f-be35-4d8e-9370-37d1e6de12c1` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-b1d0ef4d-3be8-4708-b5fd-0e0b3623ca24` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-9a39d107-3621-49ab-97e3-b24f9274b4f8` |
| 13 | `GET /v1/conversations/{id}` | 200 | 13 | `qa-dc682efd-6c24-4cc3-a5ec-435ba3f48d78` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-baa330d1-3c8b-4432-8843-54b81a543a31` |
| 15 | `GET /v1/credits/balance` | 200 | 8 | `qa-313d7101-71aa-4769-bcb8-9fcd7c971b77` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-df865096-8ad2-4ba6-a72c-d15ad709437d` |
| 17 | `POST /v1/auth/token` | 200 | 5 | `qa-705dd7f1-c46e-4be4-94a5-99329b977c15` |
| 18 | `GET /v1/conversations/{id}` | 403 | 5 | `qa-afd3616c-786c-4d7f-ab36-8c1a2341111d` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 17 | `qa-af43100f-891a-4d69-a042-8a5daa2a4272` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 6 | `qa-01ae3745-4e55-4267-b863-803a78a09604` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-3e7d0acc-5f62-43f1-9ad6-a07cb6185065` |
| 22 | `GET /v1/credits/balance` | 200 | 8 | `qa-1b061d5c-036e-456a-9f4c-c71276ca057a` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-59d060a6-c5a9-4700-be7a-1af846634b67` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-9a113a0f-cc51-40d3-a0a6-90996a1da7ee` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-8278fe9c-e4a4-45ab-82c4-e79fcd59e66b` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 6 | `qa-9feb6571-f104-4a6f-941b-5cce98b90fb7` |
| 27 | `GET /v1/credits/balance` | 200 | 5 | `qa-d2cf57c8-0830-46cd-9e41-f98dba4d935c` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-a4a47686-788a-4d0a-969e-b92ffdb81181` |
| 29 | `POST /v1/auth/token` | 401 | 5 | `qa-fda17f0c-8a23-4174-9040-a7691d737054` |
| 30 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-822fd0a0-90ce-40bc-a3f8-bb71c843506e` |
| 31 | `POST /v1/auth/token` | 401 | 5 | `qa-765107fa-e457-4680-a82b-7e1a1442dedb` |
| 32 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ecb771bd-da4f-451f-a187-f5f8d99ec08e` |
| 33 | `POST /v1/auth/token` | 401 | 7 | `qa-39d8e58d-d8a0-404b-b6da-b766fdc985c4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f49f99de-afa4-408a-b61c-3a3add3345a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f49f99de-afa4-408a-b61c-3a3add3345a3
Content-Type: application/json

--- request body ---
{"handle":"qa-7d26a38a5e4a","displayName":"QA 7d26a38a5e4a","password":"****","region":"eu"}

--- response: 201 in 312 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f49f99de-afa4-408a-b61c-3a3add3345a3
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
Location: /v1/accounts/qa-7d26a38a5e4a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a594846-df35-42d6-991f-5aed411dde22","handle":"qa-7d26a38a5e4a","displayName":"QA 7d26a38a5e4a","region":"eu","role":"user","createdAt":"2026-11-26T11:02:31.638225550Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e66fa1e0-3713-4de3-bd7f-5c99af20c348

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e66fa1e0-3713-4de3-bd7f-5c99af20c348
Content-Type: application/json

--- request body ---
{"handle":"qa-93ee475aa601","displayName":"QA 93ee475aa601","password":"****","region":"us"}

--- response: 201 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e66fa1e0-3713-4de3-bd7f-5c99af20c348
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Location: /v1/accounts/qa-93ee475aa601
X-Served-Region: us
Content-Length: 181

{"id":"acc_f039c997-0aa3-4c1f-a62e-70061e38f13a","handle":"qa-93ee475aa601","displayName":"QA 93ee475aa601","region":"us","role":"user","createdAt":"2026-11-26T11:02:31.930387629Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-85161281-0bbf-4445-b4cc-d491641651cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85161281-0bbf-4445-b4cc-d491641651cd
Content-Type: application/json

--- request body ---
{"handle":"qa-7d53ed44d2d1","displayName":"QA 7d53ed44d2d1","password":"****","region":"in"}

--- response: 201 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-85161281-0bbf-4445-b4cc-d491641651cd
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
Location: /v1/accounts/qa-7d53ed44d2d1
X-Served-Region: in
Content-Length: 181

{"id":"acc_33abd52f-ab6b-42e7-913b-5f53a6cc805a","handle":"qa-7d53ed44d2d1","displayName":"QA 7d53ed44d2d1","region":"in","role":"user","createdAt":"2026-11-26T11:02:31.967205484Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-247dfb8f-0b64-4e2b-bc46-678222d36875

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-247dfb8f-0b64-4e2b-bc46-678222d36875
Content-Type: application/json

--- request body ---
{"handle":"qa-7d26a38a5e4a","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-247dfb8f-0b64-4e2b-bc46-678222d36875
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a594846-df35-42d6-991f-5aed411dde22"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3faaf6a6-ab38-4fb4-a0fb-652e580e658e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3faaf6a6-ab38-4fb4-a0fb-652e580e658e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93ee475aa601","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3faaf6a6-ab38-4fb4-a0fb-652e580e658e
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
Location: /v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d
X-Data-Region: us
Content-Length: 238

{"id":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-7d26a38a5e4a","qa-93ee475aa601"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:32.044643911Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-14d200fb-740d-44b5-ba72-9b4bd2e33035

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14d200fb-740d-44b5-ba72-9b4bd2e33035
Content-Type: application/json

--- request body ---
{"handle":"qa-93ee475aa601","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-14d200fb-740d-44b5-ba72-9b4bd2e33035
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f039c997-0aa3-4c1f-a62e-70061e38f13a"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-20a60d3d-b19e-4f2d-8282-75454476d080

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20a60d3d-b19e-4f2d-8282-75454476d080
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-20a60d3d-b19e-4f2d-8282-75454476d080
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

{"items":[{"id":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-7d26a38a5e4a","qa-93ee475aa601"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-26T11:02:32.044643911Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages
correlation: qa-43d5d1a5-9ea6-438e-9f57-012ca52ea00c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d5d1a5-9ea6-438e-9f57-012ca52ea00c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-43d5d1a5-9ea6-438e-9f57-012ca52ea00c
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

{"items":[{"id":"msg_13c3b34f-cb74-42b3-b4d0-b11c8f34e7e2","conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","sender":"qa-7d26a38a5e4a","body":"Hi Ben, got a minute?","createdAt":"2026-11-26T11:02:32.044651863Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/read
correlation: qa-8fb9a2ae-8a2d-4193-9eac-be3077714671

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb9a2ae-8a2d-4193-9eac-be3077714671
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fb9a2ae-8a2d-4193-9eac-be3077714671
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

{"conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d
correlation: qa-532f955f-be35-4d8e-9370-37d1e6de12c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-532f955f-be35-4d8e-9370-37d1e6de12c1
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-532f955f-be35-4d8e-9370-37d1e6de12c1
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

{"id":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-7d26a38a5e4a","qa-93ee475aa601"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:32.044643911Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages
correlation: qa-b1d0ef4d-3be8-4708-b5fd-0e0b3623ca24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1d0ef4d-3be8-4708-b5fd-0e0b3623ca24
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1d0ef4d-3be8-4708-b5fd-0e0b3623ca24
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

{"id":"msg_d75808e7-e2f3-4fb8-988e-37f032284cbc","conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","sender":"qa-93ee475aa601","body":"Sure, now works","createdAt":"2026-11-26T11:02:32.491578917Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages
correlation: qa-9a39d107-3621-49ab-97e3-b24f9274b4f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a39d107-3621-49ab-97e3-b24f9274b4f8
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a39d107-3621-49ab-97e3-b24f9274b4f8
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

{"id":"msg_8665cf0d-da1e-4e38-9206-5b9a2e748e85","conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","sender":"qa-93ee475aa601","body":"Calling you","createdAt":"2026-11-26T11:02:32.511294748Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d
correlation: qa-dc682efd-6c24-4cc3-a5ec-435ba3f48d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc682efd-6c24-4cc3-a5ec-435ba3f48d78
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc682efd-6c24-4cc3-a5ec-435ba3f48d78
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

{"id":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-7d26a38a5e4a","qa-93ee475aa601"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-26T11:02:32.044643911Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages
correlation: qa-baa330d1-3c8b-4432-8843-54b81a543a31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baa330d1-3c8b-4432-8843-54b81a543a31
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-baa330d1-3c8b-4432-8843-54b81a543a31
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

{"items":[{"id":"msg_13c3b34f-cb74-42b3-b4d0-b11c8f34e7e2","conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","sender":"qa-7d26a38a5e4a","body":"Hi Ben, got a minute?","createdAt":"2026-11-26T11:02:32.044651863Z"},{"id":"msg_d75808e7-e2f3-4fb8-988e-37f032284cbc","conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","sender":"qa-93ee475aa601","body":"Sure, now works","createdAt":"2026-11-26T11:02:32.491578917Z"},{"id":"msg_8665cf0d-da1e-4e38-9206-5b9a2e748e85","conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","sender":"qa-93ee475aa601","body":"Calling you","createdAt":"2026-11-26T11:02:32.511294748Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-313d7101-71aa-4769-bcb8-9fcd7c971b77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-313d7101-71aa-4769-bcb8-9fcd7c971b77
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-313d7101-71aa-4769-bcb8-9fcd7c971b77
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

{"balance":4,"currency":"credits","accountId":"acc_8a594846-df35-42d6-991f-5aed411dde22"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-df865096-8ad2-4ba6-a72c-d15ad709437d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df865096-8ad2-4ba6-a72c-d15ad709437d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-df865096-8ad2-4ba6-a72c-d15ad709437d
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

{"balance":3,"currency":"credits","accountId":"acc_f039c997-0aa3-4c1f-a62e-70061e38f13a"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-705dd7f1-c46e-4be4-94a5-99329b977c15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-705dd7f1-c46e-4be4-94a5-99329b977c15
Content-Type: application/json

--- request body ---
{"handle":"qa-7d53ed44d2d1","password":"****"}

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-705dd7f1-c46e-4be4-94a5-99329b977c15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_33abd52f-ab6b-42e7-913b-5f53a6cc805a"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d
correlation: qa-afd3616c-786c-4d7f-ab36-8c1a2341111d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afd3616c-786c-4d7f-ab36-8c1a2341111d
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afd3616c-786c-4d7f-ab36-8c1a2341111d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","correlationId":"qa-afd3616c-786c-4d7f-ab36-8c1a2341111d"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages
correlation: qa-af43100f-891a-4d69-a042-8a5daa2a4272

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af43100f-891a-4d69-a042-8a5daa2a4272
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af43100f-891a-4d69-a042-8a5daa2a4272
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages","correlationId":"qa-af43100f-891a-4d69-a042-8a5daa2a4272"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages
correlation: qa-01ae3745-4e55-4267-b863-803a78a09604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ae3745-4e55-4267-b863-803a78a09604
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01ae3745-4e55-4267-b863-803a78a09604
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages","correlationId":"qa-01ae3745-4e55-4267-b863-803a78a09604"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-3e7d0acc-5f62-43f1-9ad6-a07cb6185065

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e7d0acc-5f62-43f1-9ad6-a07cb6185065
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e7d0acc-5f62-43f1-9ad6-a07cb6185065
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
correlation: qa-1b061d5c-036e-456a-9f4c-c71276ca057a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b061d5c-036e-456a-9f4c-c71276ca057a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b061d5c-036e-456a-9f4c-c71276ca057a
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

{"balance":5,"currency":"credits","accountId":"acc_33abd52f-ab6b-42e7-913b-5f53a6cc805a"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/close
correlation: qa-59d060a6-c5a9-4700-be7a-1af846634b67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59d060a6-c5a9-4700-be7a-1af846634b67
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-59d060a6-c5a9-4700-be7a-1af846634b67
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

{"id":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-7d26a38a5e4a","qa-93ee475aa601"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-26T11:02:32.044643911Z","closedAt":"2026-11-26T11:02:32.962755839Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/close
correlation: qa-9a113a0f-cc51-40d3-a0a6-90996a1da7ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a113a0f-cc51-40d3-a0a6-90996a1da7ee
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a113a0f-cc51-40d3-a0a6-90996a1da7ee
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

{"id":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-7d26a38a5e4a","qa-93ee475aa601"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-26T11:02:32.044643911Z","closedAt":"2026-11-26T11:02:32.962755839Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages
correlation: qa-8278fe9c-e4a4-45ab-82c4-e79fcd59e66b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8278fe9c-e4a4-45ab-82c4-e79fcd59e66b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8278fe9c-e4a4-45ab-82c4-e79fcd59e66b
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

{"items":[{"id":"msg_13c3b34f-cb74-42b3-b4d0-b11c8f34e7e2","conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","sender":"qa-7d26a38a5e4a","body":"Hi Ben, got a minute?","createdAt":"2026-11-26T11:02:32.044651863Z"},{"id":"msg_d75808e7-e2f3-4fb8-988e-37f032284cbc","conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","sender":"qa-93ee475aa601","body":"Sure, now works","createdAt":"2026-11-26T11:02:32.491578917Z"},{"id":"msg_8665cf0d-da1e-4e38-9206-5b9a2e748e85","conversationId":"cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d","sender":"qa-93ee475aa601","body":"Calling you","createdAt":"2026-11-26T11:02:32.511294748Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages
correlation: qa-9feb6571-f104-4a6f-941b-5cce98b90fb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9feb6571-f104-4a6f-941b-5cce98b90fb7
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9feb6571-f104-4a6f-941b-5cce98b90fb7
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_39189dc1-b7fe-4d3e-bd4b-733639a02a5d/messages","correlationId":"qa-9feb6571-f104-4a6f-941b-5cce98b90fb7"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-d2cf57c8-0830-46cd-9e41-f98dba4d935c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2cf57c8-0830-46cd-9e41-f98dba4d935c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2cf57c8-0830-46cd-9e41-f98dba4d935c
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

{"balance":3,"currency":"credits","accountId":"acc_f039c997-0aa3-4c1f-a62e-70061e38f13a"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4a47686-788a-4d0a-969e-b92ffdb81181

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4a47686-788a-4d0a-969e-b92ffdb81181
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4a47686-788a-4d0a-969e-b92ffdb81181
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
correlation: qa-fda17f0c-8a23-4174-9040-a7691d737054

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fda17f0c-8a23-4174-9040-a7691d737054
Content-Type: application/json

--- request body ---
{"handle":"qa-7d53ed44d2d1","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fda17f0c-8a23-4174-9040-a7691d737054
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fda17f0c-8a23-4174-9040-a7691d737054"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-822fd0a0-90ce-40bc-a3f8-bb71c843506e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-822fd0a0-90ce-40bc-a3f8-bb71c843506e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-822fd0a0-90ce-40bc-a3f8-bb71c843506e
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
correlation: qa-765107fa-e457-4680-a82b-7e1a1442dedb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-765107fa-e457-4680-a82b-7e1a1442dedb
Content-Type: application/json

--- request body ---
{"handle":"qa-93ee475aa601","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-765107fa-e457-4680-a82b-7e1a1442dedb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-765107fa-e457-4680-a82b-7e1a1442dedb"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ecb771bd-da4f-451f-a187-f5f8d99ec08e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecb771bd-da4f-451f-a187-f5f8d99ec08e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ecb771bd-da4f-451f-a187-f5f8d99ec08e
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
correlation: qa-39d8e58d-d8a0-404b-b6da-b766fdc985c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39d8e58d-d8a0-404b-b6da-b766fdc985c4
Content-Type: application/json

--- request body ---
{"handle":"qa-7d26a38a5e4a","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39d8e58d-d8a0-404b-b6da-b766fdc985c4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39d8e58d-d8a0-404b-b6da-b766fdc985c4"}
```
