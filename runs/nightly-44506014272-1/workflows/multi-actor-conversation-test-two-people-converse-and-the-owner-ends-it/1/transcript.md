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
| 1 | `POST /v1/accounts` | 201 | 497 | `qa-7d6cd6ea-732d-40dc-98aa-717059248253` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-25836fa1-f619-4f40-8dc2-f3d61a5abe10` |
| 3 | `POST /v1/accounts` | 201 | 47 | `qa-cc374f27-58a9-45b9-bbc2-03d1aacc6f27` |
| 4 | `POST /v1/auth/token` | 200 | 55 | `qa-8fa3e17a-8448-4cf2-96c0-5541bf0e70f8` |
| 5 | `POST /v1/conversations` | 201 | 40 | `qa-702207f0-63e9-441c-aae8-594d19698601` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-0b9b8440-97d2-437b-bc85-5be2aa88fda1` |
| 7 | `GET /v1/conversations` | 200 | 22 | `qa-4d9d79b2-476b-448c-b930-0c470c1134c7` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 27 | `qa-d3e41586-6a10-460b-aa2c-3693d409915d` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 34 | `qa-227f0033-d4bb-4ce1-9fc5-ef794ca1ab1a` |
| 10 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-6759f66a-9810-4d4f-b6be-1cdb188d55bc` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-8142f474-4f58-496a-b716-63727d7f9170` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-752ebd4e-c646-4cc8-a1af-dc1b272fb109` |
| 13 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-ef8daedf-29c7-4458-a8e7-24f0afc45424` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 20 | `qa-e6523013-f5d7-4f7b-9e24-116398fb703c` |
| 15 | `GET /v1/credits/balance` | 200 | 16 | `qa-460f761c-491b-4a83-877c-3cb7abc741a2` |
| 16 | `GET /v1/credits/balance` | 200 | 11 | `qa-3ec790b4-69e6-4ec1-9afd-43c232178fc7` |
| 17 | `POST /v1/auth/token` | 200 | 17 | `qa-7e319812-d593-49df-a608-6de8f9553f3c` |
| 18 | `GET /v1/conversations/{id}` | 403 | 11 | `qa-e2830895-6959-42b1-897f-12b988413f01` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 14 | `qa-fd2b41d9-6def-4c3c-bba1-f33917663578` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 9 | `qa-11599572-7263-4049-8da9-0ffe074bda2b` |
| 21 | `GET /v1/conversations` | 200 | 7 | `qa-68c96852-67d0-4908-a75d-21c66208af50` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-026322be-aed1-4334-ad14-73a44d9a19d0` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-5020958a-828a-4f2e-bbf1-f090aaa6405a` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-35963a4f-f186-4016-b52d-4dabb5b132e5` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-a6e65ca6-6563-4fba-8e10-5e520173eccd` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-5ab294ee-a02c-4df7-a096-462f4c356ae8` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-3e368605-7c98-4b33-a6cc-60c20d574f82` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-25b8ffcd-2984-4aba-882f-23fa5137aa1d` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-a3c7c722-1832-4559-8147-5b8349b94e23` |
| 30 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e2f7ff18-91ce-47d7-b034-7f092b25b02f` |
| 31 | `POST /v1/auth/token` | 401 | 9 | `qa-04347f93-eb48-4b5e-a64e-b39e965278ad` |
| 32 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7f1652ab-67bc-4660-8e4d-62d6f66c382c` |
| 33 | `POST /v1/auth/token` | 401 | 6 | `qa-0ff6c2f2-683c-4344-935e-113b6c85c2f6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7d6cd6ea-732d-40dc-98aa-717059248253

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d6cd6ea-732d-40dc-98aa-717059248253
Content-Type: application/json

--- request body ---
{"handle":"qa-4ec1c8f3be03","displayName":"QA 4ec1c8f3be03","password":"****","region":"eu"}

--- response: 201 in 497 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d6cd6ea-732d-40dc-98aa-717059248253
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
Location: /v1/accounts/qa-4ec1c8f3be03
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b96353d7-fae1-4114-b081-9a357a5bff5b","handle":"qa-4ec1c8f3be03","displayName":"QA 4ec1c8f3be03","region":"eu","role":"user","createdAt":"2026-11-19T10:29:44.370140693Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-25836fa1-f619-4f40-8dc2-f3d61a5abe10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25836fa1-f619-4f40-8dc2-f3d61a5abe10
Content-Type: application/json

--- request body ---
{"handle":"qa-c2d75187785e","displayName":"QA c2d75187785e","password":"****","region":"us"}

--- response: 201 in 60 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-25836fa1-f619-4f40-8dc2-f3d61a5abe10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-c2d75187785e
X-Served-Region: us
Content-Length: 181

{"id":"acc_4a8c50c3-f3a4-44fe-9cef-e19500ea426e","handle":"qa-c2d75187785e","displayName":"QA c2d75187785e","region":"us","role":"user","createdAt":"2026-11-19T10:29:44.909057143Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-cc374f27-58a9-45b9-bbc2-03d1aacc6f27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc374f27-58a9-45b9-bbc2-03d1aacc6f27
Content-Type: application/json

--- request body ---
{"handle":"qa-17c904f36054","displayName":"QA 17c904f36054","password":"****","region":"in"}

--- response: 201 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc374f27-58a9-45b9-bbc2-03d1aacc6f27
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
Location: /v1/accounts/qa-17c904f36054
X-Served-Region: in
Content-Length: 181

{"id":"acc_a7a1c2ac-e672-4994-a62c-3c6bd44df01f","handle":"qa-17c904f36054","displayName":"QA 17c904f36054","region":"in","role":"user","createdAt":"2026-11-19T10:29:44.990362609Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8fa3e17a-8448-4cf2-96c0-5541bf0e70f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fa3e17a-8448-4cf2-96c0-5541bf0e70f8
Content-Type: application/json

--- request body ---
{"handle":"qa-4ec1c8f3be03","password":"****"}

--- response: 200 in 55 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fa3e17a-8448-4cf2-96c0-5541bf0e70f8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b96353d7-fae1-4114-b081-9a357a5bff5b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-702207f0-63e9-441c-aae8-594d19698601

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-702207f0-63e9-441c-aae8-594d19698601
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c2d75187785e","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-702207f0-63e9-441c-aae8-594d19698601
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
Location: /v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589
X-Data-Region: us
Content-Length: 238

{"id":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4ec1c8f3be03","qa-c2d75187785e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:45.137582643Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0b9b8440-97d2-437b-bc85-5be2aa88fda1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b9b8440-97d2-437b-bc85-5be2aa88fda1
Content-Type: application/json

--- request body ---
{"handle":"qa-c2d75187785e","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b9b8440-97d2-437b-bc85-5be2aa88fda1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a8c50c3-f3a4-44fe-9cef-e19500ea426e"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-4d9d79b2-476b-448c-b930-0c470c1134c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d9d79b2-476b-448c-b930-0c470c1134c7
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d9d79b2-476b-448c-b930-0c470c1134c7
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

{"items":[{"id":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4ec1c8f3be03","qa-c2d75187785e"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-19T10:29:45.137582643Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages
correlation: qa-d3e41586-6a10-460b-aa2c-3693d409915d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3e41586-6a10-460b-aa2c-3693d409915d
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3e41586-6a10-460b-aa2c-3693d409915d
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

{"items":[{"id":"msg_f641682e-cf87-4bf6-8a88-e52d187d05a6","conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","sender":"qa-4ec1c8f3be03","body":"Hi Ben, got a minute?","createdAt":"2026-11-19T10:29:45.137594265Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/read
correlation: qa-227f0033-d4bb-4ce1-9fc5-ef794ca1ab1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227f0033-d4bb-4ce1-9fc5-ef794ca1ab1a
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-227f0033-d4bb-4ce1-9fc5-ef794ca1ab1a
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

{"conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589
correlation: qa-6759f66a-9810-4d4f-b6be-1cdb188d55bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6759f66a-9810-4d4f-b6be-1cdb188d55bc
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6759f66a-9810-4d4f-b6be-1cdb188d55bc
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

{"id":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4ec1c8f3be03","qa-c2d75187785e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:45.137582643Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages
correlation: qa-8142f474-4f58-496a-b716-63727d7f9170

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8142f474-4f58-496a-b716-63727d7f9170
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8142f474-4f58-496a-b716-63727d7f9170
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

{"id":"msg_67f4cf65-8947-4e28-b9ca-7da05c966025","conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","sender":"qa-c2d75187785e","body":"Sure, now works","createdAt":"2026-11-19T10:29:45.862203681Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages
correlation: qa-752ebd4e-c646-4cc8-a1af-dc1b272fb109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-752ebd4e-c646-4cc8-a1af-dc1b272fb109
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-752ebd4e-c646-4cc8-a1af-dc1b272fb109
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

{"id":"msg_3a7d3f47-928e-4c67-b1d2-10fa67f6c7a2","conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","sender":"qa-c2d75187785e","body":"Calling you","createdAt":"2026-11-19T10:29:45.898525561Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589
correlation: qa-ef8daedf-29c7-4458-a8e7-24f0afc45424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef8daedf-29c7-4458-a8e7-24f0afc45424
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef8daedf-29c7-4458-a8e7-24f0afc45424
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

{"id":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4ec1c8f3be03","qa-c2d75187785e"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-19T10:29:45.137582643Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages
correlation: qa-e6523013-f5d7-4f7b-9e24-116398fb703c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6523013-f5d7-4f7b-9e24-116398fb703c
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6523013-f5d7-4f7b-9e24-116398fb703c
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

{"items":[{"id":"msg_f641682e-cf87-4bf6-8a88-e52d187d05a6","conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","sender":"qa-4ec1c8f3be03","body":"Hi Ben, got a minute?","createdAt":"2026-11-19T10:29:45.137594265Z"},{"id":"msg_67f4cf65-8947-4e28-b9ca-7da05c966025","conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","sender":"qa-c2d75187785e","body":"Sure, now works","createdAt":"2026-11-19T10:29:45.862203681Z"},{"id":"msg_3a7d3f47-928e-4c67-b1d2-10fa67f6c7a2","conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","sender":"qa-c2d75187785e","body":"Calling you","createdAt":"2026-11-19T10:29:45.898525561Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-460f761c-491b-4a83-877c-3cb7abc741a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-460f761c-491b-4a83-877c-3cb7abc741a2
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-460f761c-491b-4a83-877c-3cb7abc741a2
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

{"balance":4,"currency":"credits","accountId":"acc_b96353d7-fae1-4114-b081-9a357a5bff5b"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-3ec790b4-69e6-4ec1-9afd-43c232178fc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ec790b4-69e6-4ec1-9afd-43c232178fc7
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ec790b4-69e6-4ec1-9afd-43c232178fc7
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

{"balance":3,"currency":"credits","accountId":"acc_4a8c50c3-f3a4-44fe-9cef-e19500ea426e"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-7e319812-d593-49df-a608-6de8f9553f3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e319812-d593-49df-a608-6de8f9553f3c
Content-Type: application/json

--- request body ---
{"handle":"qa-17c904f36054","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e319812-d593-49df-a608-6de8f9553f3c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7a1c2ac-e672-4994-a62c-3c6bd44df01f"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589
correlation: qa-e2830895-6959-42b1-897f-12b988413f01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2830895-6959-42b1-897f-12b988413f01
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2830895-6959-42b1-897f-12b988413f01
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","correlationId":"qa-e2830895-6959-42b1-897f-12b988413f01"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages
correlation: qa-fd2b41d9-6def-4c3c-bba1-f33917663578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd2b41d9-6def-4c3c-bba1-f33917663578
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd2b41d9-6def-4c3c-bba1-f33917663578
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages","correlationId":"qa-fd2b41d9-6def-4c3c-bba1-f33917663578"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages
correlation: qa-11599572-7263-4049-8da9-0ffe074bda2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11599572-7263-4049-8da9-0ffe074bda2b
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11599572-7263-4049-8da9-0ffe074bda2b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages","correlationId":"qa-11599572-7263-4049-8da9-0ffe074bda2b"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-68c96852-67d0-4908-a75d-21c66208af50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68c96852-67d0-4908-a75d-21c66208af50
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-68c96852-67d0-4908-a75d-21c66208af50
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
correlation: qa-026322be-aed1-4334-ad14-73a44d9a19d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-026322be-aed1-4334-ad14-73a44d9a19d0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-026322be-aed1-4334-ad14-73a44d9a19d0
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

{"balance":5,"currency":"credits","accountId":"acc_a7a1c2ac-e672-4994-a62c-3c6bd44df01f"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/close
correlation: qa-5020958a-828a-4f2e-bbf1-f090aaa6405a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5020958a-828a-4f2e-bbf1-f090aaa6405a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5020958a-828a-4f2e-bbf1-f090aaa6405a
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

{"id":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-4ec1c8f3be03","qa-c2d75187785e"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-19T10:29:45.137582643Z","closedAt":"2026-11-19T10:29:46.546390521Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/close
correlation: qa-35963a4f-f186-4016-b52d-4dabb5b132e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35963a4f-f186-4016-b52d-4dabb5b132e5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-35963a4f-f186-4016-b52d-4dabb5b132e5
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

{"id":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-4ec1c8f3be03","qa-c2d75187785e"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-19T10:29:45.137582643Z","closedAt":"2026-11-19T10:29:46.546390521Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages
correlation: qa-a6e65ca6-6563-4fba-8e10-5e520173eccd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6e65ca6-6563-4fba-8e10-5e520173eccd
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6e65ca6-6563-4fba-8e10-5e520173eccd
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

{"items":[{"id":"msg_f641682e-cf87-4bf6-8a88-e52d187d05a6","conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","sender":"qa-4ec1c8f3be03","body":"Hi Ben, got a minute?","createdAt":"2026-11-19T10:29:45.137594265Z"},{"id":"msg_67f4cf65-8947-4e28-b9ca-7da05c966025","conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","sender":"qa-c2d75187785e","body":"Sure, now works","createdAt":"2026-11-19T10:29:45.862203681Z"},{"id":"msg_3a7d3f47-928e-4c67-b1d2-10fa67f6c7a2","conversationId":"cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589","sender":"qa-c2d75187785e","body":"Calling you","createdAt":"2026-11-19T10:29:45.898525561Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages
correlation: qa-5ab294ee-a02c-4df7-a096-462f4c356ae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ab294ee-a02c-4df7-a096-462f4c356ae8
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ab294ee-a02c-4df7-a096-462f4c356ae8
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_3f2494f7-92ea-434e-8f01-c5d3f1171589/messages","correlationId":"qa-5ab294ee-a02c-4df7-a096-462f4c356ae8"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-3e368605-7c98-4b33-a6cc-60c20d574f82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e368605-7c98-4b33-a6cc-60c20d574f82
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e368605-7c98-4b33-a6cc-60c20d574f82
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

{"balance":3,"currency":"credits","accountId":"acc_4a8c50c3-f3a4-44fe-9cef-e19500ea426e"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25b8ffcd-2984-4aba-882f-23fa5137aa1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25b8ffcd-2984-4aba-882f-23fa5137aa1d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25b8ffcd-2984-4aba-882f-23fa5137aa1d
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
correlation: qa-a3c7c722-1832-4559-8147-5b8349b94e23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3c7c722-1832-4559-8147-5b8349b94e23
Content-Type: application/json

--- request body ---
{"handle":"qa-17c904f36054","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3c7c722-1832-4559-8147-5b8349b94e23
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a3c7c722-1832-4559-8147-5b8349b94e23"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2f7ff18-91ce-47d7-b034-7f092b25b02f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2f7ff18-91ce-47d7-b034-7f092b25b02f
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2f7ff18-91ce-47d7-b034-7f092b25b02f
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
correlation: qa-04347f93-eb48-4b5e-a64e-b39e965278ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04347f93-eb48-4b5e-a64e-b39e965278ad
Content-Type: application/json

--- request body ---
{"handle":"qa-c2d75187785e","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04347f93-eb48-4b5e-a64e-b39e965278ad
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04347f93-eb48-4b5e-a64e-b39e965278ad"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f1652ab-67bc-4660-8e4d-62d6f66c382c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1652ab-67bc-4660-8e4d-62d6f66c382c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f1652ab-67bc-4660-8e4d-62d6f66c382c
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
correlation: qa-0ff6c2f2-683c-4344-935e-113b6c85c2f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ff6c2f2-683c-4344-935e-113b6c85c2f6
Content-Type: application/json

--- request body ---
{"handle":"qa-4ec1c8f3be03","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ff6c2f2-683c-4344-935e-113b6c85c2f6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ff6c2f2-683c-4344-935e-113b6c85c2f6"}
```
