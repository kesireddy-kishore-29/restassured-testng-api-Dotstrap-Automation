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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-e0889101-dd73-4ec0-8afc-dfe987be8b4e` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-6e4f5586-7703-4e5d-bdd8-25706b8466df` |
| 3 | `POST /v1/accounts` | 201 | 24 | `qa-292b0f40-9536-4c7f-b562-1a6862afc205` |
| 4 | `POST /v1/auth/token` | 200 | 17 | `qa-8e5465f6-9221-4442-ac8c-7cb9e7835e67` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-ac327638-ddb4-4085-a97f-91f3b86d02ec` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-da626ed8-9739-4177-b90f-950188545e80` |
| 7 | `GET /v1/conversations` | 200 | 29 | `qa-3b5082c7-8210-44a4-9304-29a401941bd2` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 19 | `qa-71f4f08f-4047-413e-9a44-66e40056cfd0` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 16 | `qa-dc757d7e-0514-43cd-98bb-998540e21cf3` |
| 10 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-2dd53a2d-0b97-46b6-9e4c-7c0d58b6e6f2` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-374e4852-e499-4299-9e85-a5a84c404f28` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-cdb087a5-baa2-4596-976a-c3d71054e873` |
| 13 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-098cdfad-997d-4299-b6cf-e5c4a6f73b77` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-2ef979c7-1eb4-4394-8374-65f7b6c27939` |
| 15 | `GET /v1/credits/balance` | 200 | 6 | `qa-cd688aac-0d36-47e9-b3c0-93f77620c31a` |
| 16 | `GET /v1/credits/balance` | 200 | 6 | `qa-5f22f1c1-cd72-4fc7-87ac-89bf14b0bdff` |
| 17 | `POST /v1/auth/token` | 200 | 10 | `qa-c6b31c4c-07ef-438b-a83b-dbc4cf3426df` |
| 18 | `GET /v1/conversations/{id}` | 403 | 6 | `qa-a907e8b0-90fb-4efc-a4e5-bc722e576108` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 13 | `qa-6acb67d6-9c92-4693-9046-11461b7006cf` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 6 | `qa-06361fac-3cc7-4143-8b44-0f6c5b104fa0` |
| 21 | `GET /v1/conversations` | 200 | 7 | `qa-22ce80b4-83ca-4a45-b83e-6bb0204d08ff` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-a14f24f0-0034-42d0-8592-f3804dc6359d` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-41af6ab1-ec30-4888-ba1d-fd46dcb1cc59` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-41f09f2e-ff6a-41e5-927e-07be268b8c54` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-db0c2ea2-f8a5-4849-ba2c-34d4e83a5b59` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-e11c81fb-7cfd-487b-910f-762e72910531` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-b486ab31-cad7-42e4-b196-0841149ce48c` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3acfbdd1-5616-4337-bcda-61803454ff49` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-0e939fe7-5350-4d98-b802-588e6465bee3` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-5f6c82e8-31a9-4902-b60a-c673f70941ef` |
| 31 | `POST /v1/auth/token` | 401 | 7 | `qa-9d481eb3-3bf3-4d8c-b177-3dbfd926e30c` |
| 32 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-069b2f86-9330-4846-8c1d-7cfe16de25ad` |
| 33 | `POST /v1/auth/token` | 401 | 5 | `qa-cf831545-b1bb-41ea-a0ee-3b58be0bbced` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e0889101-dd73-4ec0-8afc-dfe987be8b4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0889101-dd73-4ec0-8afc-dfe987be8b4e
Content-Type: application/json

--- request body ---
{"handle":"qa-2d65931406c2","displayName":"QA 2d65931406c2","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0889101-dd73-4ec0-8afc-dfe987be8b4e
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
Location: /v1/accounts/qa-2d65931406c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0a2b5c3-a7c9-4966-983c-525cf865b28a","handle":"qa-2d65931406c2","displayName":"QA 2d65931406c2","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.264487910Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6e4f5586-7703-4e5d-bdd8-25706b8466df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4f5586-7703-4e5d-bdd8-25706b8466df
Content-Type: application/json

--- request body ---
{"handle":"qa-7c30d3db82fe","displayName":"QA 7c30d3db82fe","password":"****","region":"us"}

--- response: 201 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e4f5586-7703-4e5d-bdd8-25706b8466df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-7c30d3db82fe
X-Served-Region: us
Content-Length: 181

{"id":"acc_3cb409a8-9deb-4435-9c5b-ff5c1f31f05f","handle":"qa-7c30d3db82fe","displayName":"QA 7c30d3db82fe","region":"us","role":"user","createdAt":"2026-11-04T09:28:15.304628629Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-292b0f40-9536-4c7f-b562-1a6862afc205

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-292b0f40-9536-4c7f-b562-1a6862afc205
Content-Type: application/json

--- request body ---
{"handle":"qa-7d3502574e63","displayName":"QA 7d3502574e63","password":"****","region":"in"}

--- response: 201 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-292b0f40-9536-4c7f-b562-1a6862afc205
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Location: /v1/accounts/qa-7d3502574e63
X-Served-Region: in
Content-Length: 181

{"id":"acc_2cd96e81-7f94-4930-bfdf-5176ed6d118e","handle":"qa-7d3502574e63","displayName":"QA 7d3502574e63","region":"in","role":"user","createdAt":"2026-11-04T09:28:15.337890355Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8e5465f6-9221-4442-ac8c-7cb9e7835e67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e5465f6-9221-4442-ac8c-7cb9e7835e67
Content-Type: application/json

--- request body ---
{"handle":"qa-2d65931406c2","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e5465f6-9221-4442-ac8c-7cb9e7835e67
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0a2b5c3-a7c9-4966-983c-525cf865b28a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ac327638-ddb4-4085-a97f-91f3b86d02ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac327638-ddb4-4085-a97f-91f3b86d02ec
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7c30d3db82fe","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac327638-ddb4-4085-a97f-91f3b86d02ec
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
Location: /v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31
X-Data-Region: us
Content-Length: 238

{"id":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","subject":"Project kickoff","status":"open","region":"us","participants":["qa-2d65931406c2","qa-7c30d3db82fe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:15.415040699Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-da626ed8-9739-4177-b90f-950188545e80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da626ed8-9739-4177-b90f-950188545e80
Content-Type: application/json

--- request body ---
{"handle":"qa-7c30d3db82fe","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-da626ed8-9739-4177-b90f-950188545e80
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3cb409a8-9deb-4435-9c5b-ff5c1f31f05f"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-3b5082c7-8210-44a4-9304-29a401941bd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b5082c7-8210-44a4-9304-29a401941bd2
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b5082c7-8210-44a4-9304-29a401941bd2
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

{"items":[{"id":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","subject":"Project kickoff","status":"open","region":"us","participants":["qa-2d65931406c2","qa-7c30d3db82fe"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-04T09:28:15.415040699Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages
correlation: qa-71f4f08f-4047-413e-9a44-66e40056cfd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71f4f08f-4047-413e-9a44-66e40056cfd0
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-71f4f08f-4047-413e-9a44-66e40056cfd0
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

{"items":[{"id":"msg_c4f92584-2d92-4f70-85a7-547ed2ccf0ee","conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","sender":"qa-2d65931406c2","body":"Hi Ben, got a minute?","createdAt":"2026-11-04T09:28:15.415072178Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/read
correlation: qa-dc757d7e-0514-43cd-98bb-998540e21cf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc757d7e-0514-43cd-98bb-998540e21cf3
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc757d7e-0514-43cd-98bb-998540e21cf3
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

{"conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31
correlation: qa-2dd53a2d-0b97-46b6-9e4c-7c0d58b6e6f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dd53a2d-0b97-46b6-9e4c-7c0d58b6e6f2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dd53a2d-0b97-46b6-9e4c-7c0d58b6e6f2
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

{"id":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","subject":"Project kickoff","status":"open","region":"us","participants":["qa-2d65931406c2","qa-7c30d3db82fe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:15.415040699Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages
correlation: qa-374e4852-e499-4299-9e85-a5a84c404f28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374e4852-e499-4299-9e85-a5a84c404f28
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-374e4852-e499-4299-9e85-a5a84c404f28
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

{"id":"msg_0a0f1b0d-a8e0-45ab-a2c4-f11f109f6ea5","conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","sender":"qa-7c30d3db82fe","body":"Sure, now works","createdAt":"2026-11-04T09:28:15.602592812Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages
correlation: qa-cdb087a5-baa2-4596-976a-c3d71054e873

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdb087a5-baa2-4596-976a-c3d71054e873
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdb087a5-baa2-4596-976a-c3d71054e873
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

{"id":"msg_760663e8-7c53-4c8b-8ce2-ae94679a6ae6","conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","sender":"qa-7c30d3db82fe","body":"Calling you","createdAt":"2026-11-04T09:28:15.624547531Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31
correlation: qa-098cdfad-997d-4299-b6cf-e5c4a6f73b77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-098cdfad-997d-4299-b6cf-e5c4a6f73b77
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-098cdfad-997d-4299-b6cf-e5c4a6f73b77
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

{"id":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","subject":"Project kickoff","status":"open","region":"us","participants":["qa-2d65931406c2","qa-7c30d3db82fe"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-04T09:28:15.415040699Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages
correlation: qa-2ef979c7-1eb4-4394-8374-65f7b6c27939

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef979c7-1eb4-4394-8374-65f7b6c27939
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ef979c7-1eb4-4394-8374-65f7b6c27939
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

{"items":[{"id":"msg_c4f92584-2d92-4f70-85a7-547ed2ccf0ee","conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","sender":"qa-2d65931406c2","body":"Hi Ben, got a minute?","createdAt":"2026-11-04T09:28:15.415072178Z"},{"id":"msg_0a0f1b0d-a8e0-45ab-a2c4-f11f109f6ea5","conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","sender":"qa-7c30d3db82fe","body":"Sure, now works","createdAt":"2026-11-04T09:28:15.602592812Z"},{"id":"msg_760663e8-7c53-4c8b-8ce2-ae94679a6ae6","conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","sender":"qa-7c30d3db82fe","body":"Calling you","createdAt":"2026-11-04T09:28:15.624547531Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-cd688aac-0d36-47e9-b3c0-93f77620c31a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd688aac-0d36-47e9-b3c0-93f77620c31a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd688aac-0d36-47e9-b3c0-93f77620c31a
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

{"balance":4,"currency":"credits","accountId":"acc_e0a2b5c3-a7c9-4966-983c-525cf865b28a"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-5f22f1c1-cd72-4fc7-87ac-89bf14b0bdff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f22f1c1-cd72-4fc7-87ac-89bf14b0bdff
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f22f1c1-cd72-4fc7-87ac-89bf14b0bdff
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

{"balance":3,"currency":"credits","accountId":"acc_3cb409a8-9deb-4435-9c5b-ff5c1f31f05f"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-c6b31c4c-07ef-438b-a83b-dbc4cf3426df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6b31c4c-07ef-438b-a83b-dbc4cf3426df
Content-Type: application/json

--- request body ---
{"handle":"qa-7d3502574e63","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6b31c4c-07ef-438b-a83b-dbc4cf3426df
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2cd96e81-7f94-4930-bfdf-5176ed6d118e"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31
correlation: qa-a907e8b0-90fb-4efc-a4e5-bc722e576108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a907e8b0-90fb-4efc-a4e5-bc722e576108
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a907e8b0-90fb-4efc-a4e5-bc722e576108
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31","correlationId":"qa-a907e8b0-90fb-4efc-a4e5-bc722e576108"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages
correlation: qa-6acb67d6-9c92-4693-9046-11461b7006cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6acb67d6-9c92-4693-9046-11461b7006cf
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6acb67d6-9c92-4693-9046-11461b7006cf
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages","correlationId":"qa-6acb67d6-9c92-4693-9046-11461b7006cf"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages
correlation: qa-06361fac-3cc7-4143-8b44-0f6c5b104fa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06361fac-3cc7-4143-8b44-0f6c5b104fa0
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06361fac-3cc7-4143-8b44-0f6c5b104fa0
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages","correlationId":"qa-06361fac-3cc7-4143-8b44-0f6c5b104fa0"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-22ce80b4-83ca-4a45-b83e-6bb0204d08ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22ce80b4-83ca-4a45-b83e-6bb0204d08ff
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-22ce80b4-83ca-4a45-b83e-6bb0204d08ff
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
correlation: qa-a14f24f0-0034-42d0-8592-f3804dc6359d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a14f24f0-0034-42d0-8592-f3804dc6359d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-a14f24f0-0034-42d0-8592-f3804dc6359d
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

{"balance":5,"currency":"credits","accountId":"acc_2cd96e81-7f94-4930-bfdf-5176ed6d118e"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/close
correlation: qa-41af6ab1-ec30-4888-ba1d-fd46dcb1cc59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41af6ab1-ec30-4888-ba1d-fd46dcb1cc59
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-41af6ab1-ec30-4888-ba1d-fd46dcb1cc59
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

{"id":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-2d65931406c2","qa-7c30d3db82fe"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-04T09:28:15.415040699Z","closedAt":"2026-11-04T09:28:16.322952998Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/close
correlation: qa-41f09f2e-ff6a-41e5-927e-07be268b8c54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41f09f2e-ff6a-41e5-927e-07be268b8c54
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-41f09f2e-ff6a-41e5-927e-07be268b8c54
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

{"id":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-2d65931406c2","qa-7c30d3db82fe"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-04T09:28:15.415040699Z","closedAt":"2026-11-04T09:28:16.322952998Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages
correlation: qa-db0c2ea2-f8a5-4849-ba2c-34d4e83a5b59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db0c2ea2-f8a5-4849-ba2c-34d4e83a5b59
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-db0c2ea2-f8a5-4849-ba2c-34d4e83a5b59
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

{"items":[{"id":"msg_c4f92584-2d92-4f70-85a7-547ed2ccf0ee","conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","sender":"qa-2d65931406c2","body":"Hi Ben, got a minute?","createdAt":"2026-11-04T09:28:15.415072178Z"},{"id":"msg_0a0f1b0d-a8e0-45ab-a2c4-f11f109f6ea5","conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","sender":"qa-7c30d3db82fe","body":"Sure, now works","createdAt":"2026-11-04T09:28:15.602592812Z"},{"id":"msg_760663e8-7c53-4c8b-8ce2-ae94679a6ae6","conversationId":"cnv_869829b7-272e-46bf-95fd-955a1d09da31","sender":"qa-7c30d3db82fe","body":"Calling you","createdAt":"2026-11-04T09:28:15.624547531Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages
correlation: qa-e11c81fb-7cfd-487b-910f-762e72910531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e11c81fb-7cfd-487b-910f-762e72910531
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e11c81fb-7cfd-487b-910f-762e72910531
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_869829b7-272e-46bf-95fd-955a1d09da31/messages","correlationId":"qa-e11c81fb-7cfd-487b-910f-762e72910531"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-b486ab31-cad7-42e4-b196-0841149ce48c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b486ab31-cad7-42e4-b196-0841149ce48c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-b486ab31-cad7-42e4-b196-0841149ce48c
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

{"balance":3,"currency":"credits","accountId":"acc_3cb409a8-9deb-4435-9c5b-ff5c1f31f05f"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3acfbdd1-5616-4337-bcda-61803454ff49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3acfbdd1-5616-4337-bcda-61803454ff49
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3acfbdd1-5616-4337-bcda-61803454ff49
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
correlation: qa-0e939fe7-5350-4d98-b802-588e6465bee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e939fe7-5350-4d98-b802-588e6465bee3
Content-Type: application/json

--- request body ---
{"handle":"qa-7d3502574e63","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e939fe7-5350-4d98-b802-588e6465bee3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e939fe7-5350-4d98-b802-588e6465bee3"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f6c82e8-31a9-4902-b60a-c673f70941ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f6c82e8-31a9-4902-b60a-c673f70941ef
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f6c82e8-31a9-4902-b60a-c673f70941ef
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
correlation: qa-9d481eb3-3bf3-4d8c-b177-3dbfd926e30c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d481eb3-3bf3-4d8c-b177-3dbfd926e30c
Content-Type: application/json

--- request body ---
{"handle":"qa-7c30d3db82fe","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d481eb3-3bf3-4d8c-b177-3dbfd926e30c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d481eb3-3bf3-4d8c-b177-3dbfd926e30c"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-069b2f86-9330-4846-8c1d-7cfe16de25ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-069b2f86-9330-4846-8c1d-7cfe16de25ad
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-069b2f86-9330-4846-8c1d-7cfe16de25ad
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
correlation: qa-cf831545-b1bb-41ea-a0ee-3b58be0bbced

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf831545-b1bb-41ea-a0ee-3b58be0bbced
Content-Type: application/json

--- request body ---
{"handle":"qa-2d65931406c2","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf831545-b1bb-41ea-a0ee-3b58be0bbced
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf831545-b1bb-41ea-a0ee-3b58be0bbced"}
```
