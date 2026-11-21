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
| 1 | `POST /v1/accounts` | 201 | 286 | `qa-53e919ce-7c42-4519-b0cb-4353c111ba63` |
| 2 | `POST /v1/accounts` | 201 | 68 | `qa-1422450e-3072-4375-a6d0-47838095b840` |
| 3 | `POST /v1/accounts` | 201 | 27 | `qa-f45e41ad-fda4-4e9e-a3a1-22188832fff7` |
| 4 | `POST /v1/auth/token` | 200 | 9 | `qa-bb3e8c32-65f6-4d20-8bbd-d17d9987e64f` |
| 5 | `POST /v1/conversations` | 201 | 5 | `qa-fe492536-abc5-4029-ba0a-ced52d3ae25b` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-b4caf09c-38e0-48d7-affc-1b9043f17b56` |
| 7 | `GET /v1/conversations` | 200 | 19 | `qa-017baef4-d98c-4756-a8c8-854b5ff3d5a2` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-9d73409f-1a10-41bf-bdf4-f8c97eb78ba0` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 4 | `qa-8218a540-d9a5-41a1-98d1-f5ed0e76be9d` |
| 10 | `GET /v1/conversations/{id}` | 200 | 3 | `qa-c8c0ecf3-c546-40e8-8871-5a2ae3c33b2f` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-67c43d96-2d13-4cb2-ac63-ef2d68933e64` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-269fb101-f82b-4977-8b18-5d6a633a6efc` |
| 13 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-ce1a6ba6-4399-4ed5-bec2-9ac4293592d5` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-57c9c5c1-5190-4daa-b9a7-d1345f7bb5ed` |
| 15 | `GET /v1/credits/balance` | 200 | 5 | `qa-dcd9fdc4-b591-4ce1-a170-6cffae080c45` |
| 16 | `GET /v1/credits/balance` | 200 | 5 | `qa-80a803e1-e1aa-4e27-983f-fb9658e02178` |
| 17 | `POST /v1/auth/token` | 200 | 24 | `qa-0d35daee-a2b0-43a4-b979-9201932b52e1` |
| 18 | `GET /v1/conversations/{id}` | 403 | 18 | `qa-4afccb96-21fc-4f84-9560-30ca44aae75c` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-4f2ad818-f745-4aaf-85b3-583248ed05d7` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 5 | `qa-59d0c979-cf18-47d0-a3f4-2fecf3685109` |
| 21 | `GET /v1/conversations` | 200 | 5 | `qa-00d45592-14ae-4579-b94c-0d197bd9cdd8` |
| 22 | `GET /v1/credits/balance` | 200 | 2 | `qa-3296ffb0-f3d9-4753-b8b0-810906b15fcf` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 3 | `qa-3e77a341-3916-4200-860b-5a147da561d6` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 3 | `qa-d600cc30-8637-4dd0-b3c1-edd3355a173e` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 4 | `qa-f0bce5e6-bca1-4168-9377-205c10b1aa53` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 3 | `qa-a0428b78-9950-4d49-9cec-00c64fe88990` |
| 27 | `GET /v1/credits/balance` | 200 | 4 | `qa-6e49aadd-23db-4992-a9a8-24bcf4abcb56` |
| 28 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-d51b31a0-d777-4f09-8aa8-7552a7211418` |
| 29 | `POST /v1/auth/token` | 401 | 3 | `qa-89967367-2f85-419d-9308-1190cb909d7d` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ac0ef9f8-249b-48aa-b457-01d5a6e877af` |
| 31 | `POST /v1/auth/token` | 401 | 3 | `qa-a997f024-7971-45e1-800e-ebaf9cf304e4` |
| 32 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-3bc0c958-3e16-48c6-97a9-9768483d8c1c` |
| 33 | `POST /v1/auth/token` | 401 | 3 | `qa-347cef45-ad11-4125-a842-fe539332a8bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53e919ce-7c42-4519-b0cb-4353c111ba63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53e919ce-7c42-4519-b0cb-4353c111ba63
Content-Type: application/json

--- request body ---
{"handle":"qa-ec552c8157d0","displayName":"QA ec552c8157d0","password":"****","region":"eu"}

--- response: 201 in 286 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-53e919ce-7c42-4519-b0cb-4353c111ba63
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
Location: /v1/accounts/qa-ec552c8157d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ecdf0f3d-bf0c-43c2-a86a-3716db4e4590","handle":"qa-ec552c8157d0","displayName":"QA ec552c8157d0","region":"eu","role":"user","createdAt":"2026-11-18T10:19:39.733142484Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1422450e-3072-4375-a6d0-47838095b840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1422450e-3072-4375-a6d0-47838095b840
Content-Type: application/json

--- request body ---
{"handle":"qa-eaa4e3af7b4f","displayName":"QA eaa4e3af7b4f","password":"****","region":"us"}

--- response: 201 in 68 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-1422450e-3072-4375-a6d0-47838095b840
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
Location: /v1/accounts/qa-eaa4e3af7b4f
X-Served-Region: us
Content-Length: 181

{"id":"acc_edf928b8-b588-4f38-a784-37b23d12ec7d","handle":"qa-eaa4e3af7b4f","displayName":"QA eaa4e3af7b4f","region":"us","role":"user","createdAt":"2026-11-18T10:19:40.090942420Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f45e41ad-fda4-4e9e-a3a1-22188832fff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f45e41ad-fda4-4e9e-a3a1-22188832fff7
Content-Type: application/json

--- request body ---
{"handle":"qa-15bb04a3422f","displayName":"QA 15bb04a3422f","password":"****","region":"in"}

--- response: 201 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-f45e41ad-fda4-4e9e-a3a1-22188832fff7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-15bb04a3422f
X-Served-Region: in
Content-Length: 181

{"id":"acc_f20273e9-32cd-4ef3-8493-216c5a82a999","handle":"qa-15bb04a3422f","displayName":"QA 15bb04a3422f","region":"in","role":"user","createdAt":"2026-11-18T10:19:40.137991302Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-bb3e8c32-65f6-4d20-8bbd-d17d9987e64f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb3e8c32-65f6-4d20-8bbd-d17d9987e64f
Content-Type: application/json

--- request body ---
{"handle":"qa-ec552c8157d0","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb3e8c32-65f6-4d20-8bbd-d17d9987e64f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecdf0f3d-bf0c-43c2-a86a-3716db4e4590"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-fe492536-abc5-4029-ba0a-ced52d3ae25b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe492536-abc5-4029-ba0a-ced52d3ae25b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eaa4e3af7b4f","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe492536-abc5-4029-ba0a-ced52d3ae25b
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
Location: /v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9
X-Data-Region: us
Content-Length: 238

{"id":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ec552c8157d0","qa-eaa4e3af7b4f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:40.202436916Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b4caf09c-38e0-48d7-affc-1b9043f17b56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4caf09c-38e0-48d7-affc-1b9043f17b56
Content-Type: application/json

--- request body ---
{"handle":"qa-eaa4e3af7b4f","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4caf09c-38e0-48d7-affc-1b9043f17b56
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edf928b8-b588-4f38-a784-37b23d12ec7d"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-017baef4-d98c-4756-a8c8-854b5ff3d5a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-017baef4-d98c-4756-a8c8-854b5ff3d5a2
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-017baef4-d98c-4756-a8c8-854b5ff3d5a2
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

{"items":[{"id":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ec552c8157d0","qa-eaa4e3af7b4f"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-18T10:19:40.202436916Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages
correlation: qa-9d73409f-1a10-41bf-bdf4-f8c97eb78ba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d73409f-1a10-41bf-bdf4-f8c97eb78ba0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d73409f-1a10-41bf-bdf4-f8c97eb78ba0
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

{"items":[{"id":"msg_95f55561-599d-459c-b923-a4057640e5bb","conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","sender":"qa-ec552c8157d0","body":"Hi Ben, got a minute?","createdAt":"2026-11-18T10:19:40.202455254Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/read
correlation: qa-8218a540-d9a5-41a1-98d1-f5ed0e76be9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8218a540-d9a5-41a1-98d1-f5ed0e76be9d
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-8218a540-d9a5-41a1-98d1-f5ed0e76be9d
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

{"conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9
correlation: qa-c8c0ecf3-c546-40e8-8871-5a2ae3c33b2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8c0ecf3-c546-40e8-8871-5a2ae3c33b2f
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8c0ecf3-c546-40e8-8871-5a2ae3c33b2f
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

{"id":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ec552c8157d0","qa-eaa4e3af7b4f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:40.202436916Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages
correlation: qa-67c43d96-2d13-4cb2-ac63-ef2d68933e64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67c43d96-2d13-4cb2-ac63-ef2d68933e64
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-67c43d96-2d13-4cb2-ac63-ef2d68933e64
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

{"id":"msg_972e37bc-0ab7-4eae-9ba3-178fbfe0edda","conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","sender":"qa-eaa4e3af7b4f","body":"Sure, now works","createdAt":"2026-11-18T10:19:40.434154645Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages
correlation: qa-269fb101-f82b-4977-8b18-5d6a633a6efc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-269fb101-f82b-4977-8b18-5d6a633a6efc
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-269fb101-f82b-4977-8b18-5d6a633a6efc
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

{"id":"msg_2a1b6356-6d83-489b-ab7b-eb08c0fdf6c6","conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","sender":"qa-eaa4e3af7b4f","body":"Calling you","createdAt":"2026-11-18T10:19:40.467822165Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9
correlation: qa-ce1a6ba6-4399-4ed5-bec2-9ac4293592d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce1a6ba6-4399-4ed5-bec2-9ac4293592d5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce1a6ba6-4399-4ed5-bec2-9ac4293592d5
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

{"id":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ec552c8157d0","qa-eaa4e3af7b4f"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-18T10:19:40.202436916Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages
correlation: qa-57c9c5c1-5190-4daa-b9a7-d1345f7bb5ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57c9c5c1-5190-4daa-b9a7-d1345f7bb5ed
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-57c9c5c1-5190-4daa-b9a7-d1345f7bb5ed
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

{"items":[{"id":"msg_95f55561-599d-459c-b923-a4057640e5bb","conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","sender":"qa-ec552c8157d0","body":"Hi Ben, got a minute?","createdAt":"2026-11-18T10:19:40.202455254Z"},{"id":"msg_972e37bc-0ab7-4eae-9ba3-178fbfe0edda","conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","sender":"qa-eaa4e3af7b4f","body":"Sure, now works","createdAt":"2026-11-18T10:19:40.434154645Z"},{"id":"msg_2a1b6356-6d83-489b-ab7b-eb08c0fdf6c6","conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","sender":"qa-eaa4e3af7b4f","body":"Calling you","createdAt":"2026-11-18T10:19:40.467822165Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-dcd9fdc4-b591-4ce1-a170-6cffae080c45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcd9fdc4-b591-4ce1-a170-6cffae080c45
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcd9fdc4-b591-4ce1-a170-6cffae080c45
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

{"balance":4,"currency":"credits","accountId":"acc_ecdf0f3d-bf0c-43c2-a86a-3716db4e4590"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-80a803e1-e1aa-4e27-983f-fb9658e02178

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80a803e1-e1aa-4e27-983f-fb9658e02178
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-80a803e1-e1aa-4e27-983f-fb9658e02178
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

{"balance":3,"currency":"credits","accountId":"acc_edf928b8-b588-4f38-a784-37b23d12ec7d"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-0d35daee-a2b0-43a4-b979-9201932b52e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d35daee-a2b0-43a4-b979-9201932b52e1
Content-Type: application/json

--- request body ---
{"handle":"qa-15bb04a3422f","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d35daee-a2b0-43a4-b979-9201932b52e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f20273e9-32cd-4ef3-8493-216c5a82a999"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9
correlation: qa-4afccb96-21fc-4f84-9560-30ca44aae75c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4afccb96-21fc-4f84-9560-30ca44aae75c
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4afccb96-21fc-4f84-9560-30ca44aae75c
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","correlationId":"qa-4afccb96-21fc-4f84-9560-30ca44aae75c"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages
correlation: qa-4f2ad818-f745-4aaf-85b3-583248ed05d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f2ad818-f745-4aaf-85b3-583248ed05d7
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f2ad818-f745-4aaf-85b3-583248ed05d7
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages","correlationId":"qa-4f2ad818-f745-4aaf-85b3-583248ed05d7"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages
correlation: qa-59d0c979-cf18-47d0-a3f4-2fecf3685109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59d0c979-cf18-47d0-a3f4-2fecf3685109
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59d0c979-cf18-47d0-a3f4-2fecf3685109
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages","correlationId":"qa-59d0c979-cf18-47d0-a3f4-2fecf3685109"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-00d45592-14ae-4579-b94c-0d197bd9cdd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00d45592-14ae-4579-b94c-0d197bd9cdd8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-00d45592-14ae-4579-b94c-0d197bd9cdd8
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
correlation: qa-3296ffb0-f3d9-4753-b8b0-810906b15fcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3296ffb0-f3d9-4753-b8b0-810906b15fcf
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-3296ffb0-f3d9-4753-b8b0-810906b15fcf
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

{"balance":5,"currency":"credits","accountId":"acc_f20273e9-32cd-4ef3-8493-216c5a82a999"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/close
correlation: qa-3e77a341-3916-4200-860b-5a147da561d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e77a341-3916-4200-860b-5a147da561d6
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e77a341-3916-4200-860b-5a147da561d6
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

{"id":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-ec552c8157d0","qa-eaa4e3af7b4f"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-18T10:19:40.202436916Z","closedAt":"2026-11-18T10:19:41.088856052Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/close
correlation: qa-d600cc30-8637-4dd0-b3c1-edd3355a173e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d600cc30-8637-4dd0-b3c1-edd3355a173e
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-d600cc30-8637-4dd0-b3c1-edd3355a173e
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

{"id":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-ec552c8157d0","qa-eaa4e3af7b4f"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-18T10:19:40.202436916Z","closedAt":"2026-11-18T10:19:41.088856052Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages
correlation: qa-f0bce5e6-bca1-4168-9377-205c10b1aa53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0bce5e6-bca1-4168-9377-205c10b1aa53
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0bce5e6-bca1-4168-9377-205c10b1aa53
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

{"items":[{"id":"msg_95f55561-599d-459c-b923-a4057640e5bb","conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","sender":"qa-ec552c8157d0","body":"Hi Ben, got a minute?","createdAt":"2026-11-18T10:19:40.202455254Z"},{"id":"msg_972e37bc-0ab7-4eae-9ba3-178fbfe0edda","conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","sender":"qa-eaa4e3af7b4f","body":"Sure, now works","createdAt":"2026-11-18T10:19:40.434154645Z"},{"id":"msg_2a1b6356-6d83-489b-ab7b-eb08c0fdf6c6","conversationId":"cnv_0a1e73cf-0015-452a-84bc-18913e9487e9","sender":"qa-eaa4e3af7b4f","body":"Calling you","createdAt":"2026-11-18T10:19:40.467822165Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages
correlation: qa-a0428b78-9950-4d49-9cec-00c64fe88990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0428b78-9950-4d49-9cec-00c64fe88990
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0428b78-9950-4d49-9cec-00c64fe88990
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_0a1e73cf-0015-452a-84bc-18913e9487e9/messages","correlationId":"qa-a0428b78-9950-4d49-9cec-00c64fe88990"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-6e49aadd-23db-4992-a9a8-24bcf4abcb56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e49aadd-23db-4992-a9a8-24bcf4abcb56
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e49aadd-23db-4992-a9a8-24bcf4abcb56
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

{"balance":3,"currency":"credits","accountId":"acc_edf928b8-b588-4f38-a784-37b23d12ec7d"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d51b31a0-d777-4f09-8aa8-7552a7211418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d51b31a0-d777-4f09-8aa8-7552a7211418
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d51b31a0-d777-4f09-8aa8-7552a7211418
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
correlation: qa-89967367-2f85-419d-9308-1190cb909d7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89967367-2f85-419d-9308-1190cb909d7d
Content-Type: application/json

--- request body ---
{"handle":"qa-15bb04a3422f","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89967367-2f85-419d-9308-1190cb909d7d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-89967367-2f85-419d-9308-1190cb909d7d"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac0ef9f8-249b-48aa-b457-01d5a6e877af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac0ef9f8-249b-48aa-b457-01d5a6e877af
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac0ef9f8-249b-48aa-b457-01d5a6e877af
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
correlation: qa-a997f024-7971-45e1-800e-ebaf9cf304e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a997f024-7971-45e1-800e-ebaf9cf304e4
Content-Type: application/json

--- request body ---
{"handle":"qa-eaa4e3af7b4f","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a997f024-7971-45e1-800e-ebaf9cf304e4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a997f024-7971-45e1-800e-ebaf9cf304e4"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3bc0c958-3e16-48c6-97a9-9768483d8c1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bc0c958-3e16-48c6-97a9-9768483d8c1c
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3bc0c958-3e16-48c6-97a9-9768483d8c1c
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
correlation: qa-347cef45-ad11-4125-a842-fe539332a8bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-347cef45-ad11-4125-a842-fe539332a8bf
Content-Type: application/json

--- request body ---
{"handle":"qa-ec552c8157d0","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-347cef45-ad11-4125-a842-fe539332a8bf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-347cef45-ad11-4125-a842-fe539332a8bf"}
```
