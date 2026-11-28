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
| 1 | `POST /v1/accounts` | 201 | 489 | `qa-897d6042-ec1d-41cc-b535-e3dc7d7c1e68` |
| 2 | `POST /v1/accounts` | 201 | 65 | `qa-3fac3ae7-fd68-48dd-a1b4-a28950c7503f` |
| 3 | `POST /v1/accounts` | 201 | 23 | `qa-a645a63d-9ad8-4519-a8cd-4d5310824434` |
| 4 | `POST /v1/auth/token` | 200 | 49 | `qa-2011fb8f-4352-4f0c-ab85-e901f513b546` |
| 5 | `POST /v1/conversations` | 201 | 26 | `qa-641111ea-2153-4fdb-9749-fff743ed6425` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-073ff923-1761-4286-b352-9919425c6928` |
| 7 | `GET /v1/conversations` | 200 | 22 | `qa-f685738b-19e1-4640-ad07-952687f6a8c1` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 29 | `qa-c433fc99-a297-4895-88a2-39e56b671ea9` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 64 | `qa-863bd394-1279-452b-9d06-dc9b677def4d` |
| 10 | `GET /v1/conversations/{id}` | 200 | 39 | `qa-cf0d6a18-55fb-4ec5-ad40-c1230e37d3f0` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 29 | `qa-86456487-48ba-4445-8050-27c1bfe9f99a` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-3fc93888-0a76-4884-82d0-ea1d21a0ee5f` |
| 13 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-2f61478b-3e8c-4176-bce3-f61fe48226a7` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 20 | `qa-f3d3106a-688c-4b1b-a0e5-21c7b43da7df` |
| 15 | `GET /v1/credits/balance` | 200 | 7 | `qa-fcb2cf72-37eb-48ad-88ab-33dd8ed26152` |
| 16 | `GET /v1/credits/balance` | 200 | 15 | `qa-8d2c547f-fc1d-4f2d-90fb-1ef6142c997a` |
| 17 | `POST /v1/auth/token` | 200 | 18 | `qa-4eb2cc06-9419-44e6-914a-ff6ecc94ef95` |
| 18 | `GET /v1/conversations/{id}` | 403 | 5 | `qa-2995e270-5900-48c6-b9d4-c0eefb5ecfae` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 8 | `qa-0fe56e12-c8e7-48f6-b6a1-c7418d783142` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-b7510498-279c-4171-9d4d-f9ebdab93ec1` |
| 21 | `GET /v1/conversations` | 200 | 7 | `qa-79ea1d67-282d-433a-9c67-d71e972ceccd` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-3c5b8a68-9b30-4922-932a-83765bdd861d` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-c6832cd7-ee0c-4b40-93c4-02b2d971a533` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-e306df98-a21d-4558-9484-f85d78294fda` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-cdb51fa8-1673-4378-8665-26533e1ba01c` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 5 | `qa-ddaad93d-023c-4588-8f42-76fae384877d` |
| 27 | `GET /v1/credits/balance` | 200 | 5 | `qa-420e3e00-14fc-4d12-92fc-cb23d4054f77` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-dd0f50df-b2ce-44af-8c63-ab8df716d846` |
| 29 | `POST /v1/auth/token` | 401 | 7 | `qa-1f29bdc1-fe48-4c7a-8f32-04f973baf44e` |
| 30 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-7bde5cd9-f4e0-4fd1-8bf9-54ed5590ef45` |
| 31 | `POST /v1/auth/token` | 401 | 8 | `qa-f02e74b1-a1c7-44b1-b396-5416a19f7485` |
| 32 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-aa7a21ae-ef14-4e50-8ad5-53f4afb4bc11` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-2b6592e3-b385-4d21-a6bc-16fc222e43d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-897d6042-ec1d-41cc-b535-e3dc7d7c1e68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-897d6042-ec1d-41cc-b535-e3dc7d7c1e68
Content-Type: application/json

--- request body ---
{"handle":"qa-97271287cce9","displayName":"QA 97271287cce9","password":"****","region":"eu"}

--- response: 201 in 489 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-897d6042-ec1d-41cc-b535-e3dc7d7c1e68
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
Location: /v1/accounts/qa-97271287cce9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6115095-6458-4c8c-b01f-a7d931f90236","handle":"qa-97271287cce9","displayName":"QA 97271287cce9","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.186567025Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3fac3ae7-fd68-48dd-a1b4-a28950c7503f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fac3ae7-fd68-48dd-a1b4-a28950c7503f
Content-Type: application/json

--- request body ---
{"handle":"qa-0d50c4041a8d","displayName":"QA 0d50c4041a8d","password":"****","region":"us"}

--- response: 201 in 65 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fac3ae7-fd68-48dd-a1b4-a28950c7503f
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
Location: /v1/accounts/qa-0d50c4041a8d
X-Served-Region: us
Content-Length: 181

{"id":"acc_e6bf6772-4569-4edf-a7ff-c9c7b3a099e7","handle":"qa-0d50c4041a8d","displayName":"QA 0d50c4041a8d","region":"us","role":"user","createdAt":"2026-11-20T10:10:02.641242206Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a645a63d-9ad8-4519-a8cd-4d5310824434

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a645a63d-9ad8-4519-a8cd-4d5310824434
Content-Type: application/json

--- request body ---
{"handle":"qa-b782542c7cfd","displayName":"QA b782542c7cfd","password":"****","region":"in"}

--- response: 201 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a645a63d-9ad8-4519-a8cd-4d5310824434
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
Location: /v1/accounts/qa-b782542c7cfd
X-Served-Region: in
Content-Length: 181

{"id":"acc_fd5608d0-c292-49f1-ae18-bdd16a3cebc8","handle":"qa-b782542c7cfd","displayName":"QA b782542c7cfd","region":"in","role":"user","createdAt":"2026-11-20T10:10:02.730874133Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-2011fb8f-4352-4f0c-ab85-e901f513b546

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2011fb8f-4352-4f0c-ab85-e901f513b546
Content-Type: application/json

--- request body ---
{"handle":"qa-97271287cce9","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2011fb8f-4352-4f0c-ab85-e901f513b546
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6115095-6458-4c8c-b01f-a7d931f90236"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-641111ea-2153-4fdb-9749-fff743ed6425

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-641111ea-2153-4fdb-9749-fff743ed6425
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0d50c4041a8d","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-641111ea-2153-4fdb-9749-fff743ed6425
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
Location: /v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d
X-Data-Region: us
Content-Length: 238

{"id":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-97271287cce9","qa-0d50c4041a8d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.861392288Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-073ff923-1761-4286-b352-9919425c6928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-073ff923-1761-4286-b352-9919425c6928
Content-Type: application/json

--- request body ---
{"handle":"qa-0d50c4041a8d","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-073ff923-1761-4286-b352-9919425c6928
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6bf6772-4569-4edf-a7ff-c9c7b3a099e7"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-f685738b-19e1-4640-ad07-952687f6a8c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f685738b-19e1-4640-ad07-952687f6a8c1
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f685738b-19e1-4640-ad07-952687f6a8c1
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

{"items":[{"id":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-97271287cce9","qa-0d50c4041a8d"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-20T10:10:02.861392288Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages
correlation: qa-c433fc99-a297-4895-88a2-39e56b671ea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c433fc99-a297-4895-88a2-39e56b671ea9
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c433fc99-a297-4895-88a2-39e56b671ea9
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

{"items":[{"id":"msg_43589dc0-6935-4c11-93f4-e4d5f1e6cff4","conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","sender":"qa-97271287cce9","body":"Hi Ben, got a minute?","createdAt":"2026-11-20T10:10:02.861406545Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/read
correlation: qa-863bd394-1279-452b-9d06-dc9b677def4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-863bd394-1279-452b-9d06-dc9b677def4d
Content-Type: application/json

--- response: 200 in 64 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-863bd394-1279-452b-9d06-dc9b677def4d
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

{"conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d
correlation: qa-cf0d6a18-55fb-4ec5-ad40-c1230e37d3f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf0d6a18-55fb-4ec5-ad40-c1230e37d3f0
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf0d6a18-55fb-4ec5-ad40-c1230e37d3f0
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

{"id":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-97271287cce9","qa-0d50c4041a8d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.861392288Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages
correlation: qa-86456487-48ba-4445-8050-27c1bfe9f99a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86456487-48ba-4445-8050-27c1bfe9f99a
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-86456487-48ba-4445-8050-27c1bfe9f99a
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

{"id":"msg_3618951c-663f-44e7-8f8c-ade7145163cf","conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","sender":"qa-0d50c4041a8d","body":"Sure, now works","createdAt":"2026-11-20T10:10:03.563572730Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages
correlation: qa-3fc93888-0a76-4884-82d0-ea1d21a0ee5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fc93888-0a76-4884-82d0-ea1d21a0ee5f
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fc93888-0a76-4884-82d0-ea1d21a0ee5f
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

{"id":"msg_2bec8c2f-50db-4063-8b0d-8fd34592264a","conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","sender":"qa-0d50c4041a8d","body":"Calling you","createdAt":"2026-11-20T10:10:03.615519088Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d
correlation: qa-2f61478b-3e8c-4176-bce3-f61fe48226a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f61478b-3e8c-4176-bce3-f61fe48226a7
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f61478b-3e8c-4176-bce3-f61fe48226a7
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

{"id":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-97271287cce9","qa-0d50c4041a8d"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-20T10:10:02.861392288Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages
correlation: qa-f3d3106a-688c-4b1b-a0e5-21c7b43da7df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3d3106a-688c-4b1b-a0e5-21c7b43da7df
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3d3106a-688c-4b1b-a0e5-21c7b43da7df
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

{"items":[{"id":"msg_43589dc0-6935-4c11-93f4-e4d5f1e6cff4","conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","sender":"qa-97271287cce9","body":"Hi Ben, got a minute?","createdAt":"2026-11-20T10:10:02.861406545Z"},{"id":"msg_3618951c-663f-44e7-8f8c-ade7145163cf","conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","sender":"qa-0d50c4041a8d","body":"Sure, now works","createdAt":"2026-11-20T10:10:03.563572730Z"},{"id":"msg_2bec8c2f-50db-4063-8b0d-8fd34592264a","conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","sender":"qa-0d50c4041a8d","body":"Calling you","createdAt":"2026-11-20T10:10:03.615519088Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-fcb2cf72-37eb-48ad-88ab-33dd8ed26152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcb2cf72-37eb-48ad-88ab-33dd8ed26152
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcb2cf72-37eb-48ad-88ab-33dd8ed26152
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

{"balance":4,"currency":"credits","accountId":"acc_b6115095-6458-4c8c-b01f-a7d931f90236"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-8d2c547f-fc1d-4f2d-90fb-1ef6142c997a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d2c547f-fc1d-4f2d-90fb-1ef6142c997a
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d2c547f-fc1d-4f2d-90fb-1ef6142c997a
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

{"balance":3,"currency":"credits","accountId":"acc_e6bf6772-4569-4edf-a7ff-c9c7b3a099e7"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-4eb2cc06-9419-44e6-914a-ff6ecc94ef95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4eb2cc06-9419-44e6-914a-ff6ecc94ef95
Content-Type: application/json

--- request body ---
{"handle":"qa-b782542c7cfd","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4eb2cc06-9419-44e6-914a-ff6ecc94ef95
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd5608d0-c292-49f1-ae18-bdd16a3cebc8"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d
correlation: qa-2995e270-5900-48c6-b9d4-c0eefb5ecfae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2995e270-5900-48c6-b9d4-c0eefb5ecfae
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2995e270-5900-48c6-b9d4-c0eefb5ecfae
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","correlationId":"qa-2995e270-5900-48c6-b9d4-c0eefb5ecfae"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages
correlation: qa-0fe56e12-c8e7-48f6-b6a1-c7418d783142

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fe56e12-c8e7-48f6-b6a1-c7418d783142
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fe56e12-c8e7-48f6-b6a1-c7418d783142
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages","correlationId":"qa-0fe56e12-c8e7-48f6-b6a1-c7418d783142"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages
correlation: qa-b7510498-279c-4171-9d4d-f9ebdab93ec1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7510498-279c-4171-9d4d-f9ebdab93ec1
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7510498-279c-4171-9d4d-f9ebdab93ec1
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages","correlationId":"qa-b7510498-279c-4171-9d4d-f9ebdab93ec1"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-79ea1d67-282d-433a-9c67-d71e972ceccd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79ea1d67-282d-433a-9c67-d71e972ceccd
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-79ea1d67-282d-433a-9c67-d71e972ceccd
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
correlation: qa-3c5b8a68-9b30-4922-932a-83765bdd861d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c5b8a68-9b30-4922-932a-83765bdd861d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c5b8a68-9b30-4922-932a-83765bdd861d
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

{"balance":5,"currency":"credits","accountId":"acc_fd5608d0-c292-49f1-ae18-bdd16a3cebc8"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/close
correlation: qa-c6832cd7-ee0c-4b40-93c4-02b2d971a533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6832cd7-ee0c-4b40-93c4-02b2d971a533
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6832cd7-ee0c-4b40-93c4-02b2d971a533
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

{"id":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-97271287cce9","qa-0d50c4041a8d"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-20T10:10:02.861392288Z","closedAt":"2026-11-20T10:10:04.184531342Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/close
correlation: qa-e306df98-a21d-4558-9484-f85d78294fda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e306df98-a21d-4558-9484-f85d78294fda
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e306df98-a21d-4558-9484-f85d78294fda
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

{"id":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-97271287cce9","qa-0d50c4041a8d"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-20T10:10:02.861392288Z","closedAt":"2026-11-20T10:10:04.184531342Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages
correlation: qa-cdb51fa8-1673-4378-8665-26533e1ba01c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdb51fa8-1673-4378-8665-26533e1ba01c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdb51fa8-1673-4378-8665-26533e1ba01c
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

{"items":[{"id":"msg_43589dc0-6935-4c11-93f4-e4d5f1e6cff4","conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","sender":"qa-97271287cce9","body":"Hi Ben, got a minute?","createdAt":"2026-11-20T10:10:02.861406545Z"},{"id":"msg_3618951c-663f-44e7-8f8c-ade7145163cf","conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","sender":"qa-0d50c4041a8d","body":"Sure, now works","createdAt":"2026-11-20T10:10:03.563572730Z"},{"id":"msg_2bec8c2f-50db-4063-8b0d-8fd34592264a","conversationId":"cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d","sender":"qa-0d50c4041a8d","body":"Calling you","createdAt":"2026-11-20T10:10:03.615519088Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages
correlation: qa-ddaad93d-023c-4588-8f42-76fae384877d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddaad93d-023c-4588-8f42-76fae384877d
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddaad93d-023c-4588-8f42-76fae384877d
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_3b3d722a-1ed6-4a0e-a1b5-2c6d182c7c7d/messages","correlationId":"qa-ddaad93d-023c-4588-8f42-76fae384877d"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-420e3e00-14fc-4d12-92fc-cb23d4054f77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-420e3e00-14fc-4d12-92fc-cb23d4054f77
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-420e3e00-14fc-4d12-92fc-cb23d4054f77
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

{"balance":3,"currency":"credits","accountId":"acc_e6bf6772-4569-4edf-a7ff-c9c7b3a099e7"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd0f50df-b2ce-44af-8c63-ab8df716d846

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd0f50df-b2ce-44af-8c63-ab8df716d846
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd0f50df-b2ce-44af-8c63-ab8df716d846
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
correlation: qa-1f29bdc1-fe48-4c7a-8f32-04f973baf44e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f29bdc1-fe48-4c7a-8f32-04f973baf44e
Content-Type: application/json

--- request body ---
{"handle":"qa-b782542c7cfd","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f29bdc1-fe48-4c7a-8f32-04f973baf44e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f29bdc1-fe48-4c7a-8f32-04f973baf44e"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7bde5cd9-f4e0-4fd1-8bf9-54ed5590ef45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bde5cd9-f4e0-4fd1-8bf9-54ed5590ef45
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7bde5cd9-f4e0-4fd1-8bf9-54ed5590ef45
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
correlation: qa-f02e74b1-a1c7-44b1-b396-5416a19f7485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f02e74b1-a1c7-44b1-b396-5416a19f7485
Content-Type: application/json

--- request body ---
{"handle":"qa-0d50c4041a8d","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f02e74b1-a1c7-44b1-b396-5416a19f7485
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f02e74b1-a1c7-44b1-b396-5416a19f7485"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa7a21ae-ef14-4e50-8ad5-53f4afb4bc11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa7a21ae-ef14-4e50-8ad5-53f4afb4bc11
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa7a21ae-ef14-4e50-8ad5-53f4afb4bc11
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
correlation: qa-2b6592e3-b385-4d21-a6bc-16fc222e43d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b6592e3-b385-4d21-a6bc-16fc222e43d8
Content-Type: application/json

--- request body ---
{"handle":"qa-97271287cce9","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b6592e3-b385-4d21-a6bc-16fc222e43d8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b6592e3-b385-4d21-a6bc-16fc222e43d8"}
```
