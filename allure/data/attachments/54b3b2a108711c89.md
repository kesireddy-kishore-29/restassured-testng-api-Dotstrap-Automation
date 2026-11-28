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
| 1 | `POST /v1/accounts` | 201 | 501 | `qa-ad4e76e1-fc45-4311-acc0-3c3345983034` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-a9cf61cf-a927-475d-8ff3-1e46030242bd` |
| 3 | `POST /v1/accounts` | 201 | 47 | `qa-772904de-a815-45fe-82a6-0fc55a54023e` |
| 4 | `POST /v1/auth/token` | 200 | 50 | `qa-41995ade-cdf3-42cc-8eea-6744d4c02a87` |
| 5 | `POST /v1/conversations` | 201 | 31 | `qa-799bffe4-f4e0-4bbd-aca5-cfebd6ef6678` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-9c1e7036-9c4d-40c1-adfd-b880fa310c08` |
| 7 | `GET /v1/conversations` | 200 | 40 | `qa-2ec59e5f-8b11-4a1e-935f-5cc362978953` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 49 | `qa-e2b4d86a-1a2c-42ba-8391-3c724d96f948` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 25 | `qa-91f48542-ea52-4f46-80a2-5ac0fb4e4391` |
| 10 | `GET /v1/conversations/{id}` | 200 | 17 | `qa-3649ad9b-af2b-4a0a-b8f0-0d643fb0eed4` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-6756f16f-7900-4ed9-a2af-6bfcc54712d5` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-0b947cd7-2112-4f72-a876-46a5c1f13832` |
| 13 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-f7fa519d-15c7-4859-a53e-39555280add3` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-1e6369ce-9267-4ce6-b274-cb02b34e1e6b` |
| 15 | `GET /v1/credits/balance` | 200 | 11 | `qa-ce1b7df0-f297-4ef8-88b0-158d0ae04701` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-181c7407-7b78-4690-844f-5c941a247393` |
| 17 | `POST /v1/auth/token` | 200 | 12 | `qa-b1a0259f-4050-4511-be81-e6ce5fb92a1b` |
| 18 | `GET /v1/conversations/{id}` | 403 | 6 | `qa-51e236f0-78f8-4040-83f9-03c5615a7283` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-0956a95b-3075-4aa0-91a4-e145c14c0bfd` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 9 | `qa-308624e7-b509-4337-bc21-31c74831e056` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-71512110-53dd-4de1-b32b-fc2a90ed886c` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-213358bd-18ba-4ca0-b71c-4ddbf4233502` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-43e00284-e5ca-4608-87dc-f6740a12d4e1` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-6354a1f5-a396-4dab-8550-664ccbc38257` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-728dc5f0-e9c4-4887-82bd-7b9590a07d34` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 9 | `qa-39b8b05b-89e0-41db-8de7-125193c47b65` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-77e42ed0-93f9-4509-969a-0978c2da8caa` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5ba1b592-f27f-40e4-b6a8-ab2e9c55a15f` |
| 29 | `POST /v1/auth/token` | 401 | 5 | `qa-03ad04e8-c4ad-493a-b73a-f1d35bb11172` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-db14455e-37a4-41b6-ae0d-a38474a9f6dc` |
| 31 | `POST /v1/auth/token` | 401 | 5 | `qa-2d3936af-87d4-4161-ab0a-bfd5625a05df` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-85debf3b-6131-406b-a83c-d81d62e8811f` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-ea6f106d-0797-4196-b833-9df6b5fc82af` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ad4e76e1-fc45-4311-acc0-3c3345983034

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad4e76e1-fc45-4311-acc0-3c3345983034
Content-Type: application/json

--- request body ---
{"handle":"qa-d0228301b3f3","displayName":"QA d0228301b3f3","password":"****","region":"eu"}

--- response: 201 in 501 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad4e76e1-fc45-4311-acc0-3c3345983034
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
Location: /v1/accounts/qa-d0228301b3f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a40419de-f8f5-4f52-baa3-6c4e62d8828a","handle":"qa-d0228301b3f3","displayName":"QA d0228301b3f3","region":"eu","role":"user","createdAt":"2026-11-28T10:37:19.394740670Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a9cf61cf-a927-475d-8ff3-1e46030242bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9cf61cf-a927-475d-8ff3-1e46030242bd
Content-Type: application/json

--- request body ---
{"handle":"qa-ab1efe8f0546","displayName":"QA ab1efe8f0546","password":"****","region":"us"}

--- response: 201 in 49 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9cf61cf-a927-475d-8ff3-1e46030242bd
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
Location: /v1/accounts/qa-ab1efe8f0546
X-Served-Region: us
Content-Length: 181

{"id":"acc_b9e257f0-4d06-4513-9c43-8fc07ab88f51","handle":"qa-ab1efe8f0546","displayName":"QA ab1efe8f0546","region":"us","role":"user","createdAt":"2026-11-28T10:37:19.933887761Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-772904de-a815-45fe-82a6-0fc55a54023e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-772904de-a815-45fe-82a6-0fc55a54023e
Content-Type: application/json

--- request body ---
{"handle":"qa-62323628b436","displayName":"QA 62323628b436","password":"****","region":"in"}

--- response: 201 in 47 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-772904de-a815-45fe-82a6-0fc55a54023e
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
Location: /v1/accounts/qa-62323628b436
X-Served-Region: in
Content-Length: 181

{"id":"acc_878fdf76-3d44-42ce-babb-95b827f65e21","handle":"qa-62323628b436","displayName":"QA 62323628b436","region":"in","role":"user","createdAt":"2026-11-28T10:37:20.004642990Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-41995ade-cdf3-42cc-8eea-6744d4c02a87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41995ade-cdf3-42cc-8eea-6744d4c02a87
Content-Type: application/json

--- request body ---
{"handle":"qa-d0228301b3f3","password":"****"}

--- response: 200 in 50 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-41995ade-cdf3-42cc-8eea-6744d4c02a87
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a40419de-f8f5-4f52-baa3-6c4e62d8828a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-799bffe4-f4e0-4bbd-aca5-cfebd6ef6678

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-799bffe4-f4e0-4bbd-aca5-cfebd6ef6678
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ab1efe8f0546","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-799bffe4-f4e0-4bbd-aca5-cfebd6ef6678
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
Location: /v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8
X-Data-Region: us
Content-Length: 238

{"id":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-d0228301b3f3","qa-ab1efe8f0546"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:20.183493104Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9c1e7036-9c4d-40c1-adfd-b880fa310c08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c1e7036-9c4d-40c1-adfd-b880fa310c08
Content-Type: application/json

--- request body ---
{"handle":"qa-ab1efe8f0546","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c1e7036-9c4d-40c1-adfd-b880fa310c08
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9e257f0-4d06-4513-9c43-8fc07ab88f51"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-2ec59e5f-8b11-4a1e-935f-5cc362978953

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ec59e5f-8b11-4a1e-935f-5cc362978953
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ec59e5f-8b11-4a1e-935f-5cc362978953
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

{"items":[{"id":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-d0228301b3f3","qa-ab1efe8f0546"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-28T10:37:20.183493104Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages
correlation: qa-e2b4d86a-1a2c-42ba-8391-3c724d96f948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2b4d86a-1a2c-42ba-8391-3c724d96f948
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2b4d86a-1a2c-42ba-8391-3c724d96f948
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

{"items":[{"id":"msg_4b091b38-61bc-437a-b7d5-40362704211f","conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","sender":"qa-d0228301b3f3","body":"Hi Ben, got a minute?","createdAt":"2026-11-28T10:37:20.183512700Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/read
correlation: qa-91f48542-ea52-4f46-80a2-5ac0fb4e4391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91f48542-ea52-4f46-80a2-5ac0fb4e4391
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-91f48542-ea52-4f46-80a2-5ac0fb4e4391
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

{"conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8
correlation: qa-3649ad9b-af2b-4a0a-b8f0-0d643fb0eed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3649ad9b-af2b-4a0a-b8f0-0d643fb0eed4
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3649ad9b-af2b-4a0a-b8f0-0d643fb0eed4
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

{"id":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-d0228301b3f3","qa-ab1efe8f0546"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:20.183493104Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages
correlation: qa-6756f16f-7900-4ed9-a2af-6bfcc54712d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6756f16f-7900-4ed9-a2af-6bfcc54712d5
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6756f16f-7900-4ed9-a2af-6bfcc54712d5
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

{"id":"msg_84f0b6af-c925-461d-9367-3e496ae58080","conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","sender":"qa-ab1efe8f0546","body":"Sure, now works","createdAt":"2026-11-28T10:37:20.833507403Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages
correlation: qa-0b947cd7-2112-4f72-a876-46a5c1f13832

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b947cd7-2112-4f72-a876-46a5c1f13832
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b947cd7-2112-4f72-a876-46a5c1f13832
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

{"id":"msg_b35712d8-d784-49d0-8a92-5ef2054bdfe7","conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","sender":"qa-ab1efe8f0546","body":"Calling you","createdAt":"2026-11-28T10:37:20.857757588Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8
correlation: qa-f7fa519d-15c7-4859-a53e-39555280add3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7fa519d-15c7-4859-a53e-39555280add3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7fa519d-15c7-4859-a53e-39555280add3
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

{"id":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-d0228301b3f3","qa-ab1efe8f0546"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-28T10:37:20.183493104Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages
correlation: qa-1e6369ce-9267-4ce6-b274-cb02b34e1e6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e6369ce-9267-4ce6-b274-cb02b34e1e6b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e6369ce-9267-4ce6-b274-cb02b34e1e6b
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

{"items":[{"id":"msg_4b091b38-61bc-437a-b7d5-40362704211f","conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","sender":"qa-d0228301b3f3","body":"Hi Ben, got a minute?","createdAt":"2026-11-28T10:37:20.183512700Z"},{"id":"msg_84f0b6af-c925-461d-9367-3e496ae58080","conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","sender":"qa-ab1efe8f0546","body":"Sure, now works","createdAt":"2026-11-28T10:37:20.833507403Z"},{"id":"msg_b35712d8-d784-49d0-8a92-5ef2054bdfe7","conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","sender":"qa-ab1efe8f0546","body":"Calling you","createdAt":"2026-11-28T10:37:20.857757588Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-ce1b7df0-f297-4ef8-88b0-158d0ae04701

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce1b7df0-f297-4ef8-88b0-158d0ae04701
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce1b7df0-f297-4ef8-88b0-158d0ae04701
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

{"balance":4,"currency":"credits","accountId":"acc_a40419de-f8f5-4f52-baa3-6c4e62d8828a"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-181c7407-7b78-4690-844f-5c941a247393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-181c7407-7b78-4690-844f-5c941a247393
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-181c7407-7b78-4690-844f-5c941a247393
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

{"balance":3,"currency":"credits","accountId":"acc_b9e257f0-4d06-4513-9c43-8fc07ab88f51"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-b1a0259f-4050-4511-be81-e6ce5fb92a1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1a0259f-4050-4511-be81-e6ce5fb92a1b
Content-Type: application/json

--- request body ---
{"handle":"qa-62323628b436","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1a0259f-4050-4511-be81-e6ce5fb92a1b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_878fdf76-3d44-42ce-babb-95b827f65e21"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8
correlation: qa-51e236f0-78f8-4040-83f9-03c5615a7283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51e236f0-78f8-4040-83f9-03c5615a7283
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51e236f0-78f8-4040-83f9-03c5615a7283
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8","correlationId":"qa-51e236f0-78f8-4040-83f9-03c5615a7283"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages
correlation: qa-0956a95b-3075-4aa0-91a4-e145c14c0bfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0956a95b-3075-4aa0-91a4-e145c14c0bfd
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0956a95b-3075-4aa0-91a4-e145c14c0bfd
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages","correlationId":"qa-0956a95b-3075-4aa0-91a4-e145c14c0bfd"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages
correlation: qa-308624e7-b509-4337-bc21-31c74831e056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-308624e7-b509-4337-bc21-31c74831e056
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-308624e7-b509-4337-bc21-31c74831e056
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages","correlationId":"qa-308624e7-b509-4337-bc21-31c74831e056"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-71512110-53dd-4de1-b32b-fc2a90ed886c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71512110-53dd-4de1-b32b-fc2a90ed886c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-71512110-53dd-4de1-b32b-fc2a90ed886c
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
correlation: qa-213358bd-18ba-4ca0-b71c-4ddbf4233502

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-213358bd-18ba-4ca0-b71c-4ddbf4233502
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-213358bd-18ba-4ca0-b71c-4ddbf4233502
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

{"balance":5,"currency":"credits","accountId":"acc_878fdf76-3d44-42ce-babb-95b827f65e21"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/close
correlation: qa-43e00284-e5ca-4608-87dc-f6740a12d4e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43e00284-e5ca-4608-87dc-f6740a12d4e1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-43e00284-e5ca-4608-87dc-f6740a12d4e1
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

{"id":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-d0228301b3f3","qa-ab1efe8f0546"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-28T10:37:20.183493104Z","closedAt":"2026-11-28T10:37:21.338451476Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/close
correlation: qa-6354a1f5-a396-4dab-8550-664ccbc38257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6354a1f5-a396-4dab-8550-664ccbc38257
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-6354a1f5-a396-4dab-8550-664ccbc38257
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

{"id":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-d0228301b3f3","qa-ab1efe8f0546"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-28T10:37:20.183493104Z","closedAt":"2026-11-28T10:37:21.338451476Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages
correlation: qa-728dc5f0-e9c4-4887-82bd-7b9590a07d34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-728dc5f0-e9c4-4887-82bd-7b9590a07d34
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-728dc5f0-e9c4-4887-82bd-7b9590a07d34
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

{"items":[{"id":"msg_4b091b38-61bc-437a-b7d5-40362704211f","conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","sender":"qa-d0228301b3f3","body":"Hi Ben, got a minute?","createdAt":"2026-11-28T10:37:20.183512700Z"},{"id":"msg_84f0b6af-c925-461d-9367-3e496ae58080","conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","sender":"qa-ab1efe8f0546","body":"Sure, now works","createdAt":"2026-11-28T10:37:20.833507403Z"},{"id":"msg_b35712d8-d784-49d0-8a92-5ef2054bdfe7","conversationId":"cnv_2469b298-e721-426e-b614-c36a9f7fedd8","sender":"qa-ab1efe8f0546","body":"Calling you","createdAt":"2026-11-28T10:37:20.857757588Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages
correlation: qa-39b8b05b-89e0-41db-8de7-125193c47b65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39b8b05b-89e0-41db-8de7-125193c47b65
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39b8b05b-89e0-41db-8de7-125193c47b65
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_2469b298-e721-426e-b614-c36a9f7fedd8/messages","correlationId":"qa-39b8b05b-89e0-41db-8de7-125193c47b65"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-77e42ed0-93f9-4509-969a-0978c2da8caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77e42ed0-93f9-4509-969a-0978c2da8caa
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-77e42ed0-93f9-4509-969a-0978c2da8caa
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

{"balance":3,"currency":"credits","accountId":"acc_b9e257f0-4d06-4513-9c43-8fc07ab88f51"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ba1b592-f27f-40e4-b6a8-ab2e9c55a15f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ba1b592-f27f-40e4-b6a8-ab2e9c55a15f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ba1b592-f27f-40e4-b6a8-ab2e9c55a15f
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
correlation: qa-03ad04e8-c4ad-493a-b73a-f1d35bb11172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03ad04e8-c4ad-493a-b73a-f1d35bb11172
Content-Type: application/json

--- request body ---
{"handle":"qa-62323628b436","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03ad04e8-c4ad-493a-b73a-f1d35bb11172
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03ad04e8-c4ad-493a-b73a-f1d35bb11172"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-db14455e-37a4-41b6-ae0d-a38474a9f6dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db14455e-37a4-41b6-ae0d-a38474a9f6dc
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-db14455e-37a4-41b6-ae0d-a38474a9f6dc
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
correlation: qa-2d3936af-87d4-4161-ab0a-bfd5625a05df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d3936af-87d4-4161-ab0a-bfd5625a05df
Content-Type: application/json

--- request body ---
{"handle":"qa-ab1efe8f0546","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d3936af-87d4-4161-ab0a-bfd5625a05df
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d3936af-87d4-4161-ab0a-bfd5625a05df"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85debf3b-6131-406b-a83c-d81d62e8811f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85debf3b-6131-406b-a83c-d81d62e8811f
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85debf3b-6131-406b-a83c-d81d62e8811f
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
correlation: qa-ea6f106d-0797-4196-b833-9df6b5fc82af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea6f106d-0797-4196-b833-9df6b5fc82af
Content-Type: application/json

--- request body ---
{"handle":"qa-d0228301b3f3","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea6f106d-0797-4196-b833-9df6b5fc82af
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ea6f106d-0797-4196-b833-9df6b5fc82af"}
```
