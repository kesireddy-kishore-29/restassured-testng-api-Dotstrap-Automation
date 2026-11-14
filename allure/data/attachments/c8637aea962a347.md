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
| 1 | `POST /v1/accounts` | 201 | 379 | `qa-d989089e-beb0-45b8-8dfd-20bf4d165017` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-611ed166-c9dd-4b01-8da0-a92cf32dc44f` |
| 3 | `POST /v1/accounts` | 201 | 17 | `qa-312c8b23-4c68-4f8a-87ef-a17180700476` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-648b208d-1cae-4e99-b44b-ead9237ba70c` |
| 5 | `POST /v1/conversations` | 201 | 18 | `qa-680130d8-812e-4810-9426-34d053e84dda` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-dc12c130-9a92-45b2-afb6-62c004b00f7d` |
| 7 | `GET /v1/conversations` | 200 | 11 | `qa-4509f958-977e-4273-9a26-c4a8eb4b1601` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 16 | `qa-9b8c7731-e111-4b2a-85f5-09c2c5df5077` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 13 | `qa-6dff10de-536f-467a-8a09-fcc51c5ce6b6` |
| 10 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-82d8155f-202b-434a-b81f-6a2e13cc5b11` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 51 | `qa-5db8c2c6-5edd-4ba3-893a-21bc4f1ea659` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-447d67a2-7c55-4fbd-80b1-fd5544d613fa` |
| 13 | `GET /v1/conversations/{id}` | 200 | 5 | `qa-7704795b-5178-4433-95fd-fe5d7a8b12bb` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-d8ba3657-c76a-4295-bf11-d02065f254ef` |
| 15 | `GET /v1/credits/balance` | 200 | 5 | `qa-1c784ac1-7d3d-4d69-a782-818c2b4d5fae` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-fd3e6006-fc31-4add-b655-c1bd4bf07cad` |
| 17 | `POST /v1/auth/token` | 200 | 11 | `qa-e6170f1f-e0d7-4406-a8f9-31af07ad891e` |
| 18 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-5f5ac6af-580c-431f-b108-3b8e5312b8b8` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-7368cf76-12e8-4033-8145-7ac588fdd3a4` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 6 | `qa-97d8bcb5-8151-488a-a5a1-63b797ca35a1` |
| 21 | `GET /v1/conversations` | 200 | 4 | `qa-025c76fb-300c-428c-9ae6-46206f0484ae` |
| 22 | `GET /v1/credits/balance` | 200 | 3 | `qa-a8d7e9c8-b0a5-4f3d-9aa8-58ab7f60c39e` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 3 | `qa-4f0b3f58-7f78-489a-bf8a-88bce5851667` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-bdd2f6ca-12f5-4087-af30-404a648fbbd2` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 4 | `qa-500e822c-49bb-4649-91d5-d04b4afdce6f` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-e26f4c23-46fc-4707-814f-c370ebab5fb0` |
| 27 | `GET /v1/credits/balance` | 200 | 4 | `qa-0f96ec2a-6d28-42bd-ba1d-f86645dbb5b1` |
| 28 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-89952e7c-500d-4c38-a768-b5403a87f71e` |
| 29 | `POST /v1/auth/token` | 401 | 5 | `qa-d933b7bb-efff-4db7-a01d-48d06670fa0a` |
| 30 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-c9bec6f5-4107-48ff-8064-af623282d966` |
| 31 | `POST /v1/auth/token` | 401 | 4 | `qa-b2433690-41a4-4995-bf8f-8b1e5f436307` |
| 32 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-6d0926cc-dd36-4d67-ae42-acefd0de24c0` |
| 33 | `POST /v1/auth/token` | 401 | 5 | `qa-990bd92f-7bce-4fd3-a68e-2d70f4e04102` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d989089e-beb0-45b8-8dfd-20bf4d165017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d989089e-beb0-45b8-8dfd-20bf4d165017
Content-Type: application/json

--- request body ---
{"handle":"qa-9a0e0c011326","displayName":"QA 9a0e0c011326","password":"****","region":"eu"}

--- response: 201 in 379 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-d989089e-beb0-45b8-8dfd-20bf4d165017
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
Location: /v1/accounts/qa-9a0e0c011326
X-Served-Region: eu
Content-Length: 181

{"id":"acc_565cb34d-d289-4cac-b50a-008004405f39","handle":"qa-9a0e0c011326","displayName":"QA 9a0e0c011326","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.259648861Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-611ed166-c9dd-4b01-8da0-a92cf32dc44f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-611ed166-c9dd-4b01-8da0-a92cf32dc44f
Content-Type: application/json

--- request body ---
{"handle":"qa-00c0a9947bb9","displayName":"QA 00c0a9947bb9","password":"****","region":"us"}

--- response: 201 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-611ed166-c9dd-4b01-8da0-a92cf32dc44f
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
Location: /v1/accounts/qa-00c0a9947bb9
X-Served-Region: us
Content-Length: 181

{"id":"acc_4a587c08-f2cc-438f-8111-91e523021a7e","handle":"qa-00c0a9947bb9","displayName":"QA 00c0a9947bb9","region":"us","role":"user","createdAt":"2026-11-14T09:05:19.543455126Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-312c8b23-4c68-4f8a-87ef-a17180700476

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-312c8b23-4c68-4f8a-87ef-a17180700476
Content-Type: application/json

--- request body ---
{"handle":"qa-3e0034fe57b9","displayName":"QA 3e0034fe57b9","password":"****","region":"in"}

--- response: 201 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-312c8b23-4c68-4f8a-87ef-a17180700476
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
Location: /v1/accounts/qa-3e0034fe57b9
X-Served-Region: in
Content-Length: 181

{"id":"acc_137ed360-0adb-4826-91e9-d6e374c0c438","handle":"qa-3e0034fe57b9","displayName":"QA 3e0034fe57b9","region":"in","role":"user","createdAt":"2026-11-14T09:05:19.580906016Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-648b208d-1cae-4e99-b44b-ead9237ba70c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-648b208d-1cae-4e99-b44b-ead9237ba70c
Content-Type: application/json

--- request body ---
{"handle":"qa-9a0e0c011326","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-648b208d-1cae-4e99-b44b-ead9237ba70c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_565cb34d-d289-4cac-b50a-008004405f39"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-680130d8-812e-4810-9426-34d053e84dda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-680130d8-812e-4810-9426-34d053e84dda
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-00c0a9947bb9","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-680130d8-812e-4810-9426-34d053e84dda
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
Location: /v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70
X-Data-Region: us
Content-Length: 238

{"id":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9a0e0c011326","qa-00c0a9947bb9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:19.659575838Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dc12c130-9a92-45b2-afb6-62c004b00f7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc12c130-9a92-45b2-afb6-62c004b00f7d
Content-Type: application/json

--- request body ---
{"handle":"qa-00c0a9947bb9","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc12c130-9a92-45b2-afb6-62c004b00f7d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a587c08-f2cc-438f-8111-91e523021a7e"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-4509f958-977e-4273-9a26-c4a8eb4b1601

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4509f958-977e-4273-9a26-c4a8eb4b1601
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4509f958-977e-4273-9a26-c4a8eb4b1601
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

{"items":[{"id":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9a0e0c011326","qa-00c0a9947bb9"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-14T09:05:19.659575838Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages
correlation: qa-9b8c7731-e111-4b2a-85f5-09c2c5df5077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b8c7731-e111-4b2a-85f5-09c2c5df5077
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b8c7731-e111-4b2a-85f5-09c2c5df5077
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

{"items":[{"id":"msg_732f169a-1c0f-4284-8078-caca0e512010","conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","sender":"qa-9a0e0c011326","body":"Hi Ben, got a minute?","createdAt":"2026-11-14T09:05:19.659583438Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/read
correlation: qa-6dff10de-536f-467a-8a09-fcc51c5ce6b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dff10de-536f-467a-8a09-fcc51c5ce6b6
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dff10de-536f-467a-8a09-fcc51c5ce6b6
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

{"conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70
correlation: qa-82d8155f-202b-434a-b81f-6a2e13cc5b11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82d8155f-202b-434a-b81f-6a2e13cc5b11
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-82d8155f-202b-434a-b81f-6a2e13cc5b11
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

{"id":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9a0e0c011326","qa-00c0a9947bb9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:19.659575838Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages
correlation: qa-5db8c2c6-5edd-4ba3-893a-21bc4f1ea659

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5db8c2c6-5edd-4ba3-893a-21bc4f1ea659
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 51 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5db8c2c6-5edd-4ba3-893a-21bc4f1ea659
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

{"id":"msg_9c843f3d-e48f-4de0-9553-f1a659de520d","conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","sender":"qa-00c0a9947bb9","body":"Sure, now works","createdAt":"2026-11-14T09:05:20.079909205Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages
correlation: qa-447d67a2-7c55-4fbd-80b1-fd5544d613fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-447d67a2-7c55-4fbd-80b1-fd5544d613fa
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-447d67a2-7c55-4fbd-80b1-fd5544d613fa
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

{"id":"msg_68906da0-a4d9-4266-a4b6-b19f5008eea2","conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","sender":"qa-00c0a9947bb9","body":"Calling you","createdAt":"2026-11-14T09:05:20.121206107Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70
correlation: qa-7704795b-5178-4433-95fd-fe5d7a8b12bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7704795b-5178-4433-95fd-fe5d7a8b12bb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-7704795b-5178-4433-95fd-fe5d7a8b12bb
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

{"id":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9a0e0c011326","qa-00c0a9947bb9"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-14T09:05:19.659575838Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages
correlation: qa-d8ba3657-c76a-4295-bf11-d02065f254ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8ba3657-c76a-4295-bf11-d02065f254ef
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8ba3657-c76a-4295-bf11-d02065f254ef
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

{"items":[{"id":"msg_732f169a-1c0f-4284-8078-caca0e512010","conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","sender":"qa-9a0e0c011326","body":"Hi Ben, got a minute?","createdAt":"2026-11-14T09:05:19.659583438Z"},{"id":"msg_9c843f3d-e48f-4de0-9553-f1a659de520d","conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","sender":"qa-00c0a9947bb9","body":"Sure, now works","createdAt":"2026-11-14T09:05:20.079909205Z"},{"id":"msg_68906da0-a4d9-4266-a4b6-b19f5008eea2","conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","sender":"qa-00c0a9947bb9","body":"Calling you","createdAt":"2026-11-14T09:05:20.121206107Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-1c784ac1-7d3d-4d69-a782-818c2b4d5fae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c784ac1-7d3d-4d69-a782-818c2b4d5fae
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c784ac1-7d3d-4d69-a782-818c2b4d5fae
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

{"balance":4,"currency":"credits","accountId":"acc_565cb34d-d289-4cac-b50a-008004405f39"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-fd3e6006-fc31-4add-b655-c1bd4bf07cad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd3e6006-fc31-4add-b655-c1bd4bf07cad
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd3e6006-fc31-4add-b655-c1bd4bf07cad
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

{"balance":3,"currency":"credits","accountId":"acc_4a587c08-f2cc-438f-8111-91e523021a7e"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-e6170f1f-e0d7-4406-a8f9-31af07ad891e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6170f1f-e0d7-4406-a8f9-31af07ad891e
Content-Type: application/json

--- request body ---
{"handle":"qa-3e0034fe57b9","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6170f1f-e0d7-4406-a8f9-31af07ad891e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_137ed360-0adb-4826-91e9-d6e374c0c438"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70
correlation: qa-5f5ac6af-580c-431f-b108-3b8e5312b8b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f5ac6af-580c-431f-b108-3b8e5312b8b8
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f5ac6af-580c-431f-b108-3b8e5312b8b8
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70","correlationId":"qa-5f5ac6af-580c-431f-b108-3b8e5312b8b8"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages
correlation: qa-7368cf76-12e8-4033-8145-7ac588fdd3a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7368cf76-12e8-4033-8145-7ac588fdd3a4
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7368cf76-12e8-4033-8145-7ac588fdd3a4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages","correlationId":"qa-7368cf76-12e8-4033-8145-7ac588fdd3a4"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages
correlation: qa-97d8bcb5-8151-488a-a5a1-63b797ca35a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97d8bcb5-8151-488a-a5a1-63b797ca35a1
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97d8bcb5-8151-488a-a5a1-63b797ca35a1
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages","correlationId":"qa-97d8bcb5-8151-488a-a5a1-63b797ca35a1"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-025c76fb-300c-428c-9ae6-46206f0484ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-025c76fb-300c-428c-9ae6-46206f0484ae
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-025c76fb-300c-428c-9ae6-46206f0484ae
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
correlation: qa-a8d7e9c8-b0a5-4f3d-9aa8-58ab7f60c39e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8d7e9c8-b0a5-4f3d-9aa8-58ab7f60c39e
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8d7e9c8-b0a5-4f3d-9aa8-58ab7f60c39e
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

{"balance":5,"currency":"credits","accountId":"acc_137ed360-0adb-4826-91e9-d6e374c0c438"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/close
correlation: qa-4f0b3f58-7f78-489a-bf8a-88bce5851667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f0b3f58-7f78-489a-bf8a-88bce5851667
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f0b3f58-7f78-489a-bf8a-88bce5851667
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

{"id":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-9a0e0c011326","qa-00c0a9947bb9"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-14T09:05:19.659575838Z","closedAt":"2026-11-14T09:05:20.625277835Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/close
correlation: qa-bdd2f6ca-12f5-4087-af30-404a648fbbd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdd2f6ca-12f5-4087-af30-404a648fbbd2
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdd2f6ca-12f5-4087-af30-404a648fbbd2
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

{"id":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-9a0e0c011326","qa-00c0a9947bb9"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-14T09:05:19.659575838Z","closedAt":"2026-11-14T09:05:20.625277835Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages
correlation: qa-500e822c-49bb-4649-91d5-d04b4afdce6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-500e822c-49bb-4649-91d5-d04b4afdce6f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-500e822c-49bb-4649-91d5-d04b4afdce6f
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

{"items":[{"id":"msg_732f169a-1c0f-4284-8078-caca0e512010","conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","sender":"qa-9a0e0c011326","body":"Hi Ben, got a minute?","createdAt":"2026-11-14T09:05:19.659583438Z"},{"id":"msg_9c843f3d-e48f-4de0-9553-f1a659de520d","conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","sender":"qa-00c0a9947bb9","body":"Sure, now works","createdAt":"2026-11-14T09:05:20.079909205Z"},{"id":"msg_68906da0-a4d9-4266-a4b6-b19f5008eea2","conversationId":"cnv_add6a7b9-4dea-4907-82bd-ead260484d70","sender":"qa-00c0a9947bb9","body":"Calling you","createdAt":"2026-11-14T09:05:20.121206107Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages
correlation: qa-e26f4c23-46fc-4707-814f-c370ebab5fb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e26f4c23-46fc-4707-814f-c370ebab5fb0
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e26f4c23-46fc-4707-814f-c370ebab5fb0
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_add6a7b9-4dea-4907-82bd-ead260484d70/messages","correlationId":"qa-e26f4c23-46fc-4707-814f-c370ebab5fb0"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-0f96ec2a-6d28-42bd-ba1d-f86645dbb5b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f96ec2a-6d28-42bd-ba1d-f86645dbb5b1
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f96ec2a-6d28-42bd-ba1d-f86645dbb5b1
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

{"balance":3,"currency":"credits","accountId":"acc_4a587c08-f2cc-438f-8111-91e523021a7e"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89952e7c-500d-4c38-a768-b5403a87f71e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89952e7c-500d-4c38-a768-b5403a87f71e
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89952e7c-500d-4c38-a768-b5403a87f71e
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
correlation: qa-d933b7bb-efff-4db7-a01d-48d06670fa0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d933b7bb-efff-4db7-a01d-48d06670fa0a
Content-Type: application/json

--- request body ---
{"handle":"qa-3e0034fe57b9","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d933b7bb-efff-4db7-a01d-48d06670fa0a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d933b7bb-efff-4db7-a01d-48d06670fa0a"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c9bec6f5-4107-48ff-8064-af623282d966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9bec6f5-4107-48ff-8064-af623282d966
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c9bec6f5-4107-48ff-8064-af623282d966
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
correlation: qa-b2433690-41a4-4995-bf8f-8b1e5f436307

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2433690-41a4-4995-bf8f-8b1e5f436307
Content-Type: application/json

--- request body ---
{"handle":"qa-00c0a9947bb9","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2433690-41a4-4995-bf8f-8b1e5f436307
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2433690-41a4-4995-bf8f-8b1e5f436307"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d0926cc-dd36-4d67-ae42-acefd0de24c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d0926cc-dd36-4d67-ae42-acefd0de24c0
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d0926cc-dd36-4d67-ae42-acefd0de24c0
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
correlation: qa-990bd92f-7bce-4fd3-a68e-2d70f4e04102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-990bd92f-7bce-4fd3-a68e-2d70f4e04102
Content-Type: application/json

--- request body ---
{"handle":"qa-9a0e0c011326","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-990bd92f-7bce-4fd3-a68e-2d70f4e04102
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-990bd92f-7bce-4fd3-a68e-2d70f4e04102"}
```
