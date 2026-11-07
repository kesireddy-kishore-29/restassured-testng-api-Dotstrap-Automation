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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-4ede6e2b-4309-4b6f-84a8-dfdfbb0b9589` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-e0424043-cad4-4551-8ea6-71e5ce70fad7` |
| 3 | `POST /v1/accounts` | 201 | 13 | `qa-2516ec2f-3db3-48ce-b189-27fd5e1aaeee` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-93bea60b-1a63-4d00-bd07-6d9d1e3b7410` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-65b10f6e-9086-4eab-91a0-72bd45fdd179` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-d8145665-97df-40dd-b50d-954b2440187a` |
| 7 | `GET /v1/conversations` | 200 | 10 | `qa-0e8c99ca-a61a-4a2f-960e-b79782f7a456` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 12 | `qa-13704184-2d91-4133-b7cb-b4d4ca2e074e` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-c0e324e8-218c-41ff-8001-00f7e327c15d` |
| 10 | `GET /v1/conversations/{id}` | 200 | 23 | `qa-d349b6ab-0295-409b-8dfc-3164ce976b6d` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-7ade8f2d-f912-48d6-a5be-86ed16867666` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-a6d35a5b-443d-4c5f-b0fa-f9ece8a2bd0a` |
| 13 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-e78a83fc-9cc7-4602-9d12-07d55a732079` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 10 | `qa-b920862e-b79f-475b-8af6-51935e3cd730` |
| 15 | `GET /v1/credits/balance` | 200 | 12 | `qa-c0660ae8-1e44-43a0-a90b-cfa5578b403f` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-0330221e-7812-46dc-b5cd-456bb9f2b798` |
| 17 | `POST /v1/auth/token` | 200 | 12 | `qa-b2b28625-c97f-4929-957b-55d65b8e2823` |
| 18 | `GET /v1/conversations/{id}` | 403 | 7 | `qa-a28f2f62-0398-4b21-b6df-134a6453c16a` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 6 | `qa-a6651781-fb53-42bc-a9fc-42efa30a48bc` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 6 | `qa-ccb99530-a497-4910-83e5-5ffff8251403` |
| 21 | `GET /v1/conversations` | 200 | 5 | `qa-0970cf9c-83d8-4d83-857e-5b7b978adf43` |
| 22 | `GET /v1/credits/balance` | 200 | 4 | `qa-50af4359-da54-4d41-9f04-aae465b85260` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-df3379bf-a0da-4ba9-945c-9ef104517cce` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 4 | `qa-1b9a6f56-6e27-4938-95f4-2e75970a6d5f` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 4 | `qa-68d91ae3-d19e-4608-8d3a-0ba9a2851ab7` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 4 | `qa-89ff1d7d-5db7-487b-b931-0694d6ecb6a6` |
| 27 | `GET /v1/credits/balance` | 200 | 4 | `qa-fd3c83f6-6b94-41f9-b860-be2cbc8d2a68` |
| 28 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-7797290d-ef5d-4b90-aebe-b87ba47493d3` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-897cedad-9dd3-42e7-b8d3-d10bea9f945b` |
| 30 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-97355f78-5040-40ab-b3fd-d5a2365666cc` |
| 31 | `POST /v1/auth/token` | 401 | 4 | `qa-ddf5b752-3602-4c5d-b4d2-7630e063adbf` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-c86e2389-e717-435d-9b61-9f6caf52122d` |
| 33 | `POST /v1/auth/token` | 401 | 3 | `qa-c51f9707-0727-45bd-b2ad-285bacfd47c0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ede6e2b-4309-4b6f-84a8-dfdfbb0b9589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ede6e2b-4309-4b6f-84a8-dfdfbb0b9589
Content-Type: application/json

--- request body ---
{"handle":"qa-f5a47b549ab8","displayName":"QA f5a47b549ab8","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ede6e2b-4309-4b6f-84a8-dfdfbb0b9589
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-f5a47b549ab8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3cad44f0-b03a-453a-b5e6-424823c7ec27","handle":"qa-f5a47b549ab8","displayName":"QA f5a47b549ab8","region":"eu","role":"user","createdAt":"2026-11-03T09:41:34.273633410Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e0424043-cad4-4551-8ea6-71e5ce70fad7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0424043-cad4-4551-8ea6-71e5ce70fad7
Content-Type: application/json

--- request body ---
{"handle":"qa-e471fbeabf3a","displayName":"QA e471fbeabf3a","password":"****","region":"us"}

--- response: 201 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0424043-cad4-4551-8ea6-71e5ce70fad7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-e471fbeabf3a
X-Served-Region: us
Content-Length: 181

{"id":"acc_c07cc0ac-6bae-473a-aee3-8bea922e20ae","handle":"qa-e471fbeabf3a","displayName":"QA e471fbeabf3a","region":"us","role":"user","createdAt":"2026-11-03T09:41:34.297861304Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2516ec2f-3db3-48ce-b189-27fd5e1aaeee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2516ec2f-3db3-48ce-b189-27fd5e1aaeee
Content-Type: application/json

--- request body ---
{"handle":"qa-c25578404c8f","displayName":"QA c25578404c8f","password":"****","region":"in"}

--- response: 201 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2516ec2f-3db3-48ce-b189-27fd5e1aaeee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-c25578404c8f
X-Served-Region: in
Content-Length: 181

{"id":"acc_ddcb4e85-9388-45c3-8bef-7cc3846aba83","handle":"qa-c25578404c8f","displayName":"QA c25578404c8f","region":"in","role":"user","createdAt":"2026-11-03T09:41:34.317636539Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-93bea60b-1a63-4d00-bd07-6d9d1e3b7410

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93bea60b-1a63-4d00-bd07-6d9d1e3b7410
Content-Type: application/json

--- request body ---
{"handle":"qa-f5a47b549ab8","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-93bea60b-1a63-4d00-bd07-6d9d1e3b7410
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3cad44f0-b03a-453a-b5e6-424823c7ec27"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-65b10f6e-9086-4eab-91a0-72bd45fdd179

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65b10f6e-9086-4eab-91a0-72bd45fdd179
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e471fbeabf3a","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-65b10f6e-9086-4eab-91a0-72bd45fdd179
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
Location: /v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9
X-Data-Region: us
Content-Length: 238

{"id":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","subject":"Project kickoff","status":"open","region":"us","participants":["qa-f5a47b549ab8","qa-e471fbeabf3a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:34.363905696Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d8145665-97df-40dd-b50d-954b2440187a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8145665-97df-40dd-b50d-954b2440187a
Content-Type: application/json

--- request body ---
{"handle":"qa-e471fbeabf3a","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8145665-97df-40dd-b50d-954b2440187a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c07cc0ac-6bae-473a-aee3-8bea922e20ae"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-0e8c99ca-a61a-4a2f-960e-b79782f7a456

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e8c99ca-a61a-4a2f-960e-b79782f7a456
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e8c99ca-a61a-4a2f-960e-b79782f7a456
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

{"items":[{"id":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","subject":"Project kickoff","status":"open","region":"us","participants":["qa-f5a47b549ab8","qa-e471fbeabf3a"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-03T09:41:34.363905696Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages
correlation: qa-13704184-2d91-4133-b7cb-b4d4ca2e074e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13704184-2d91-4133-b7cb-b4d4ca2e074e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-13704184-2d91-4133-b7cb-b4d4ca2e074e
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

{"items":[{"id":"msg_8ac5f4e4-7b67-42c5-baae-39ae79fba1ad","conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","sender":"qa-f5a47b549ab8","body":"Hi Ben, got a minute?","createdAt":"2026-11-03T09:41:34.363931334Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/read
correlation: qa-c0e324e8-218c-41ff-8001-00f7e327c15d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0e324e8-218c-41ff-8001-00f7e327c15d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0e324e8-218c-41ff-8001-00f7e327c15d
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

{"conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9
correlation: qa-d349b6ab-0295-409b-8dfc-3164ce976b6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d349b6ab-0295-409b-8dfc-3164ce976b6d
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d349b6ab-0295-409b-8dfc-3164ce976b6d
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

{"id":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","subject":"Project kickoff","status":"open","region":"us","participants":["qa-f5a47b549ab8","qa-e471fbeabf3a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:34.363905696Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages
correlation: qa-7ade8f2d-f912-48d6-a5be-86ed16867666

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ade8f2d-f912-48d6-a5be-86ed16867666
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ade8f2d-f912-48d6-a5be-86ed16867666
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

{"id":"msg_fe4caed9-7168-47a0-92f0-e5f4286c6b23","conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","sender":"qa-e471fbeabf3a","body":"Sure, now works","createdAt":"2026-11-03T09:41:34.525761566Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages
correlation: qa-a6d35a5b-443d-4c5f-b0fa-f9ece8a2bd0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6d35a5b-443d-4c5f-b0fa-f9ece8a2bd0a
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6d35a5b-443d-4c5f-b0fa-f9ece8a2bd0a
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

{"id":"msg_a1012faa-7471-4e91-a8cf-c8c6b0c8c26f","conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","sender":"qa-e471fbeabf3a","body":"Calling you","createdAt":"2026-11-03T09:41:34.559675604Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9
correlation: qa-e78a83fc-9cc7-4602-9d12-07d55a732079

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78a83fc-9cc7-4602-9d12-07d55a732079
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e78a83fc-9cc7-4602-9d12-07d55a732079
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

{"id":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","subject":"Project kickoff","status":"open","region":"us","participants":["qa-f5a47b549ab8","qa-e471fbeabf3a"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-03T09:41:34.363905696Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages
correlation: qa-b920862e-b79f-475b-8af6-51935e3cd730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b920862e-b79f-475b-8af6-51935e3cd730
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b920862e-b79f-475b-8af6-51935e3cd730
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

{"items":[{"id":"msg_8ac5f4e4-7b67-42c5-baae-39ae79fba1ad","conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","sender":"qa-f5a47b549ab8","body":"Hi Ben, got a minute?","createdAt":"2026-11-03T09:41:34.363931334Z"},{"id":"msg_fe4caed9-7168-47a0-92f0-e5f4286c6b23","conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","sender":"qa-e471fbeabf3a","body":"Sure, now works","createdAt":"2026-11-03T09:41:34.525761566Z"},{"id":"msg_a1012faa-7471-4e91-a8cf-c8c6b0c8c26f","conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","sender":"qa-e471fbeabf3a","body":"Calling you","createdAt":"2026-11-03T09:41:34.559675604Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-c0660ae8-1e44-43a0-a90b-cfa5578b403f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0660ae8-1e44-43a0-a90b-cfa5578b403f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0660ae8-1e44-43a0-a90b-cfa5578b403f
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

{"balance":4,"currency":"credits","accountId":"acc_3cad44f0-b03a-453a-b5e6-424823c7ec27"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-0330221e-7812-46dc-b5cd-456bb9f2b798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0330221e-7812-46dc-b5cd-456bb9f2b798
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0330221e-7812-46dc-b5cd-456bb9f2b798
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

{"balance":3,"currency":"credits","accountId":"acc_c07cc0ac-6bae-473a-aee3-8bea922e20ae"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-b2b28625-c97f-4929-957b-55d65b8e2823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2b28625-c97f-4929-957b-55d65b8e2823
Content-Type: application/json

--- request body ---
{"handle":"qa-c25578404c8f","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2b28625-c97f-4929-957b-55d65b8e2823
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ddcb4e85-9388-45c3-8bef-7cc3846aba83"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9
correlation: qa-a28f2f62-0398-4b21-b6df-134a6453c16a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a28f2f62-0398-4b21-b6df-134a6453c16a
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a28f2f62-0398-4b21-b6df-134a6453c16a
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","correlationId":"qa-a28f2f62-0398-4b21-b6df-134a6453c16a"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages
correlation: qa-a6651781-fb53-42bc-a9fc-42efa30a48bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6651781-fb53-42bc-a9fc-42efa30a48bc
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6651781-fb53-42bc-a9fc-42efa30a48bc
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages","correlationId":"qa-a6651781-fb53-42bc-a9fc-42efa30a48bc"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages
correlation: qa-ccb99530-a497-4910-83e5-5ffff8251403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccb99530-a497-4910-83e5-5ffff8251403
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccb99530-a497-4910-83e5-5ffff8251403
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages","correlationId":"qa-ccb99530-a497-4910-83e5-5ffff8251403"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-0970cf9c-83d8-4d83-857e-5b7b978adf43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0970cf9c-83d8-4d83-857e-5b7b978adf43
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0970cf9c-83d8-4d83-857e-5b7b978adf43
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
correlation: qa-50af4359-da54-4d41-9f04-aae465b85260

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50af4359-da54-4d41-9f04-aae465b85260
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-50af4359-da54-4d41-9f04-aae465b85260
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

{"balance":5,"currency":"credits","accountId":"acc_ddcb4e85-9388-45c3-8bef-7cc3846aba83"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/close
correlation: qa-df3379bf-a0da-4ba9-945c-9ef104517cce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df3379bf-a0da-4ba9-945c-9ef104517cce
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-df3379bf-a0da-4ba9-945c-9ef104517cce
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

{"id":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-f5a47b549ab8","qa-e471fbeabf3a"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-03T09:41:34.363905696Z","closedAt":"2026-11-03T09:41:35.016664559Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/close
correlation: qa-1b9a6f56-6e27-4938-95f4-2e75970a6d5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b9a6f56-6e27-4938-95f4-2e75970a6d5f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b9a6f56-6e27-4938-95f4-2e75970a6d5f
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

{"id":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-f5a47b549ab8","qa-e471fbeabf3a"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-03T09:41:34.363905696Z","closedAt":"2026-11-03T09:41:35.016664559Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages
correlation: qa-68d91ae3-d19e-4608-8d3a-0ba9a2851ab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68d91ae3-d19e-4608-8d3a-0ba9a2851ab7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-68d91ae3-d19e-4608-8d3a-0ba9a2851ab7
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

{"items":[{"id":"msg_8ac5f4e4-7b67-42c5-baae-39ae79fba1ad","conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","sender":"qa-f5a47b549ab8","body":"Hi Ben, got a minute?","createdAt":"2026-11-03T09:41:34.363931334Z"},{"id":"msg_fe4caed9-7168-47a0-92f0-e5f4286c6b23","conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","sender":"qa-e471fbeabf3a","body":"Sure, now works","createdAt":"2026-11-03T09:41:34.525761566Z"},{"id":"msg_a1012faa-7471-4e91-a8cf-c8c6b0c8c26f","conversationId":"cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9","sender":"qa-e471fbeabf3a","body":"Calling you","createdAt":"2026-11-03T09:41:34.559675604Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages
correlation: qa-89ff1d7d-5db7-487b-b931-0694d6ecb6a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89ff1d7d-5db7-487b-b931-0694d6ecb6a6
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89ff1d7d-5db7-487b-b931-0694d6ecb6a6
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_f29399ad-3fa6-46cd-939e-aa9288fc00b9/messages","correlationId":"qa-89ff1d7d-5db7-487b-b931-0694d6ecb6a6"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-fd3c83f6-6b94-41f9-b860-be2cbc8d2a68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd3c83f6-6b94-41f9-b860-be2cbc8d2a68
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd3c83f6-6b94-41f9-b860-be2cbc8d2a68
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

{"balance":3,"currency":"credits","accountId":"acc_c07cc0ac-6bae-473a-aee3-8bea922e20ae"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7797290d-ef5d-4b90-aebe-b87ba47493d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7797290d-ef5d-4b90-aebe-b87ba47493d3
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7797290d-ef5d-4b90-aebe-b87ba47493d3
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
correlation: qa-897cedad-9dd3-42e7-b8d3-d10bea9f945b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-897cedad-9dd3-42e7-b8d3-d10bea9f945b
Content-Type: application/json

--- request body ---
{"handle":"qa-c25578404c8f","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-897cedad-9dd3-42e7-b8d3-d10bea9f945b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-897cedad-9dd3-42e7-b8d3-d10bea9f945b"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97355f78-5040-40ab-b3fd-d5a2365666cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97355f78-5040-40ab-b3fd-d5a2365666cc
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97355f78-5040-40ab-b3fd-d5a2365666cc
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
correlation: qa-ddf5b752-3602-4c5d-b4d2-7630e063adbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddf5b752-3602-4c5d-b4d2-7630e063adbf
Content-Type: application/json

--- request body ---
{"handle":"qa-e471fbeabf3a","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddf5b752-3602-4c5d-b4d2-7630e063adbf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ddf5b752-3602-4c5d-b4d2-7630e063adbf"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c86e2389-e717-435d-9b61-9f6caf52122d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c86e2389-e717-435d-9b61-9f6caf52122d
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c86e2389-e717-435d-9b61-9f6caf52122d
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
correlation: qa-c51f9707-0727-45bd-b2ad-285bacfd47c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c51f9707-0727-45bd-b2ad-285bacfd47c0
Content-Type: application/json

--- request body ---
{"handle":"qa-f5a47b549ab8","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c51f9707-0727-45bd-b2ad-285bacfd47c0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c51f9707-0727-45bd-b2ad-285bacfd47c0"}
```
