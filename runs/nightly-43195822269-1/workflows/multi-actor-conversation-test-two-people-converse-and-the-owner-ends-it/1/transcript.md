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
| 1 | `POST /v1/accounts` | 201 | 415 | `qa-91500ae4-6af6-4146-98ec-1f72e96a07d7` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-fdcce079-8eaf-4922-91b3-34d41fba0072` |
| 3 | `POST /v1/accounts` | 201 | 91 | `qa-eec3d55d-e077-4bef-82a0-056ae9f84f46` |
| 4 | `POST /v1/auth/token` | 200 | 65 | `qa-0272b0b5-6fa7-4203-b33c-a931ec1f26ec` |
| 5 | `POST /v1/conversations` | 201 | 26 | `qa-a2746587-88a0-473f-9849-3a0fda863953` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-8d887607-8f02-4ebd-aab7-425bad217347` |
| 7 | `GET /v1/conversations` | 200 | 25 | `qa-7cb409fb-286d-416b-b4a1-d85753e21c21` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 21 | `qa-c0f2f78a-3d37-4fdf-9549-ea9f7dd89da1` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 20 | `qa-da5c86b6-1574-4e24-be4f-982aa23e4007` |
| 10 | `GET /v1/conversations/{id}` | 200 | 36 | `qa-4f61571f-2172-4c36-abcb-fbae32f4bc61` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-7578bdcd-20ec-48f1-b9fe-e3838e15b602` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-6a7971bc-f638-41fa-9208-8c035619d7a2` |
| 13 | `GET /v1/conversations/{id}` | 200 | 15 | `qa-3168686c-8778-45da-950a-774a943bfd49` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 31 | `qa-725ef73c-46ff-4b08-8543-08902a8ce925` |
| 15 | `GET /v1/credits/balance` | 200 | 12 | `qa-ed2dd586-bd67-42a9-9a2e-39b1ffd9bc41` |
| 16 | `GET /v1/credits/balance` | 200 | 13 | `qa-ed548156-b8fc-4ec1-be4a-eb3702db46ab` |
| 17 | `POST /v1/auth/token` | 200 | 27 | `qa-d8adefbb-dc6a-4a82-a317-b2c299f949b0` |
| 18 | `GET /v1/conversations/{id}` | 403 | 18 | `qa-61c7a900-fbca-4a1e-b385-abe38dadf4a6` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 15 | `qa-3dce7e80-8ce9-4a10-9f67-8bbb08470f0d` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 9 | `qa-5ab28a36-b97e-48c9-86e3-63f0e5742470` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-c58ee7ba-db78-4f66-b6b8-5f6cd43111ad` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-aa32feca-8fdd-4fd9-b893-b01c6df7a2fb` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-2d527869-96ca-4a07-8895-6b7ee57a5aa6` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-9b4aebaf-e082-45ce-a114-f22c2760cedd` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-a920d290-8016-4550-b0ba-7bdd94826524` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-c85dc204-2bcd-4466-b21b-58a4a4f0d555` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-66f68bef-2f53-41c9-843a-658d37eec89a` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-af7c74b8-9409-4e24-bddf-6a5cb0eedb15` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-faadd248-3e6b-41c3-8d7a-99799b5ad846` |
| 30 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b020ea63-810e-4ccf-b1c8-cd6feeb1cbbd` |
| 31 | `POST /v1/auth/token` | 401 | 8 | `qa-6a69a55d-0b85-40bf-9d79-7ffecc119347` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-7f0e64a4-2214-4b84-888b-60e2a92f981e` |
| 33 | `POST /v1/auth/token` | 401 | 6 | `qa-93671727-4358-4829-8b7c-e983a373b37b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-91500ae4-6af6-4146-98ec-1f72e96a07d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91500ae4-6af6-4146-98ec-1f72e96a07d7
Content-Type: application/json

--- request body ---
{"handle":"qa-30e98ef26acb","displayName":"QA 30e98ef26acb","password":"****","region":"eu"}

--- response: 201 in 415 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-91500ae4-6af6-4146-98ec-1f72e96a07d7
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
Location: /v1/accounts/qa-30e98ef26acb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a7572a69-197c-4468-a3f2-d7b7d74bb09e","handle":"qa-30e98ef26acb","displayName":"QA 30e98ef26acb","region":"eu","role":"user","createdAt":"2026-11-12T09:56:36.675901546Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fdcce079-8eaf-4922-91b3-34d41fba0072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdcce079-8eaf-4922-91b3-34d41fba0072
Content-Type: application/json

--- request body ---
{"handle":"qa-1757fb4971db","displayName":"QA 1757fb4971db","password":"****","region":"us"}

--- response: 201 in 57 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdcce079-8eaf-4922-91b3-34d41fba0072
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
Location: /v1/accounts/qa-1757fb4971db
X-Served-Region: us
Content-Length: 181

{"id":"acc_bd04fa02-e07e-45c1-99b7-0aab0aa85274","handle":"qa-1757fb4971db","displayName":"QA 1757fb4971db","region":"us","role":"user","createdAt":"2026-11-12T09:56:37.127083157Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-eec3d55d-e077-4bef-82a0-056ae9f84f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eec3d55d-e077-4bef-82a0-056ae9f84f46
Content-Type: application/json

--- request body ---
{"handle":"qa-45d388728190","displayName":"QA 45d388728190","password":"****","region":"in"}

--- response: 201 in 91 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-eec3d55d-e077-4bef-82a0-056ae9f84f46
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
Location: /v1/accounts/qa-45d388728190
X-Served-Region: in
Content-Length: 181

{"id":"acc_29ea5a30-2240-4d83-89de-460a873ada60","handle":"qa-45d388728190","displayName":"QA 45d388728190","region":"in","role":"user","createdAt":"2026-11-12T09:56:37.262122700Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0272b0b5-6fa7-4203-b33c-a931ec1f26ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0272b0b5-6fa7-4203-b33c-a931ec1f26ec
Content-Type: application/json

--- request body ---
{"handle":"qa-30e98ef26acb","password":"****"}

--- response: 200 in 65 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0272b0b5-6fa7-4203-b33c-a931ec1f26ec
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7572a69-197c-4468-a3f2-d7b7d74bb09e"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a2746587-88a0-473f-9849-3a0fda863953

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2746587-88a0-473f-9849-3a0fda863953
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1757fb4971db","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2746587-88a0-473f-9849-3a0fda863953
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
Location: /v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c
X-Data-Region: us
Content-Length: 238

{"id":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","subject":"Project kickoff","status":"open","region":"us","participants":["qa-30e98ef26acb","qa-1757fb4971db"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:37.421756252Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8d887607-8f02-4ebd-aab7-425bad217347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d887607-8f02-4ebd-aab7-425bad217347
Content-Type: application/json

--- request body ---
{"handle":"qa-1757fb4971db","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d887607-8f02-4ebd-aab7-425bad217347
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd04fa02-e07e-45c1-99b7-0aab0aa85274"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-7cb409fb-286d-416b-b4a1-d85753e21c21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cb409fb-286d-416b-b4a1-d85753e21c21
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cb409fb-286d-416b-b4a1-d85753e21c21
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

{"items":[{"id":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","subject":"Project kickoff","status":"open","region":"us","participants":["qa-30e98ef26acb","qa-1757fb4971db"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-12T09:56:37.421756252Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages
correlation: qa-c0f2f78a-3d37-4fdf-9549-ea9f7dd89da1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0f2f78a-3d37-4fdf-9549-ea9f7dd89da1
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0f2f78a-3d37-4fdf-9549-ea9f7dd89da1
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

{"items":[{"id":"msg_e7e8464b-6793-493c-a36d-1714caf6b1c0","conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","sender":"qa-30e98ef26acb","body":"Hi Ben, got a minute?","createdAt":"2026-11-12T09:56:37.421791067Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/read
correlation: qa-da5c86b6-1574-4e24-be4f-982aa23e4007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da5c86b6-1574-4e24-be4f-982aa23e4007
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-da5c86b6-1574-4e24-be4f-982aa23e4007
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

{"conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c
correlation: qa-4f61571f-2172-4c36-abcb-fbae32f4bc61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f61571f-2172-4c36-abcb-fbae32f4bc61
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f61571f-2172-4c36-abcb-fbae32f4bc61
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

{"id":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","subject":"Project kickoff","status":"open","region":"us","participants":["qa-30e98ef26acb","qa-1757fb4971db"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:37.421756252Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages
correlation: qa-7578bdcd-20ec-48f1-b9fe-e3838e15b602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7578bdcd-20ec-48f1-b9fe-e3838e15b602
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7578bdcd-20ec-48f1-b9fe-e3838e15b602
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

{"id":"msg_ad51518a-03a2-4e9e-ac97-3fb79c479866","conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","sender":"qa-1757fb4971db","body":"Sure, now works","createdAt":"2026-11-12T09:56:37.897628062Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages
correlation: qa-6a7971bc-f638-41fa-9208-8c035619d7a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a7971bc-f638-41fa-9208-8c035619d7a2
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a7971bc-f638-41fa-9208-8c035619d7a2
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

{"id":"msg_1a56056d-1c9a-4377-9c98-ddf03c3f4e65","conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","sender":"qa-1757fb4971db","body":"Calling you","createdAt":"2026-11-12T09:56:37.943991645Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c
correlation: qa-3168686c-8778-45da-950a-774a943bfd49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3168686c-8778-45da-950a-774a943bfd49
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3168686c-8778-45da-950a-774a943bfd49
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

{"id":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","subject":"Project kickoff","status":"open","region":"us","participants":["qa-30e98ef26acb","qa-1757fb4971db"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-12T09:56:37.421756252Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages
correlation: qa-725ef73c-46ff-4b08-8543-08902a8ce925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-725ef73c-46ff-4b08-8543-08902a8ce925
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-725ef73c-46ff-4b08-8543-08902a8ce925
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

{"items":[{"id":"msg_e7e8464b-6793-493c-a36d-1714caf6b1c0","conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","sender":"qa-30e98ef26acb","body":"Hi Ben, got a minute?","createdAt":"2026-11-12T09:56:37.421791067Z"},{"id":"msg_ad51518a-03a2-4e9e-ac97-3fb79c479866","conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","sender":"qa-1757fb4971db","body":"Sure, now works","createdAt":"2026-11-12T09:56:37.897628062Z"},{"id":"msg_1a56056d-1c9a-4377-9c98-ddf03c3f4e65","conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","sender":"qa-1757fb4971db","body":"Calling you","createdAt":"2026-11-12T09:56:37.943991645Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-ed2dd586-bd67-42a9-9a2e-39b1ffd9bc41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed2dd586-bd67-42a9-9a2e-39b1ffd9bc41
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed2dd586-bd67-42a9-9a2e-39b1ffd9bc41
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

{"balance":4,"currency":"credits","accountId":"acc_a7572a69-197c-4468-a3f2-d7b7d74bb09e"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-ed548156-b8fc-4ec1-be4a-eb3702db46ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed548156-b8fc-4ec1-be4a-eb3702db46ab
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed548156-b8fc-4ec1-be4a-eb3702db46ab
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

{"balance":3,"currency":"credits","accountId":"acc_bd04fa02-e07e-45c1-99b7-0aab0aa85274"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-d8adefbb-dc6a-4a82-a317-b2c299f949b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8adefbb-dc6a-4a82-a317-b2c299f949b0
Content-Type: application/json

--- request body ---
{"handle":"qa-45d388728190","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8adefbb-dc6a-4a82-a317-b2c299f949b0
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29ea5a30-2240-4d83-89de-460a873ada60"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c
correlation: qa-61c7a900-fbca-4a1e-b385-abe38dadf4a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61c7a900-fbca-4a1e-b385-abe38dadf4a6
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61c7a900-fbca-4a1e-b385-abe38dadf4a6
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c","correlationId":"qa-61c7a900-fbca-4a1e-b385-abe38dadf4a6"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages
correlation: qa-3dce7e80-8ce9-4a10-9f67-8bbb08470f0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dce7e80-8ce9-4a10-9f67-8bbb08470f0d
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dce7e80-8ce9-4a10-9f67-8bbb08470f0d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages","correlationId":"qa-3dce7e80-8ce9-4a10-9f67-8bbb08470f0d"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages
correlation: qa-5ab28a36-b97e-48c9-86e3-63f0e5742470

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ab28a36-b97e-48c9-86e3-63f0e5742470
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ab28a36-b97e-48c9-86e3-63f0e5742470
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages","correlationId":"qa-5ab28a36-b97e-48c9-86e3-63f0e5742470"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-c58ee7ba-db78-4f66-b6b8-5f6cd43111ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c58ee7ba-db78-4f66-b6b8-5f6cd43111ad
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c58ee7ba-db78-4f66-b6b8-5f6cd43111ad
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
correlation: qa-aa32feca-8fdd-4fd9-b893-b01c6df7a2fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa32feca-8fdd-4fd9-b893-b01c6df7a2fb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa32feca-8fdd-4fd9-b893-b01c6df7a2fb
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

{"balance":5,"currency":"credits","accountId":"acc_29ea5a30-2240-4d83-89de-460a873ada60"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/close
correlation: qa-2d527869-96ca-4a07-8895-6b7ee57a5aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d527869-96ca-4a07-8895-6b7ee57a5aa6
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d527869-96ca-4a07-8895-6b7ee57a5aa6
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

{"id":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-30e98ef26acb","qa-1757fb4971db"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-12T09:56:37.421756252Z","closedAt":"2026-11-12T09:56:38.946917735Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/close
correlation: qa-9b4aebaf-e082-45ce-a114-f22c2760cedd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b4aebaf-e082-45ce-a114-f22c2760cedd
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b4aebaf-e082-45ce-a114-f22c2760cedd
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

{"id":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-30e98ef26acb","qa-1757fb4971db"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-12T09:56:37.421756252Z","closedAt":"2026-11-12T09:56:38.946917735Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages
correlation: qa-a920d290-8016-4550-b0ba-7bdd94826524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a920d290-8016-4550-b0ba-7bdd94826524
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a920d290-8016-4550-b0ba-7bdd94826524
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

{"items":[{"id":"msg_e7e8464b-6793-493c-a36d-1714caf6b1c0","conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","sender":"qa-30e98ef26acb","body":"Hi Ben, got a minute?","createdAt":"2026-11-12T09:56:37.421791067Z"},{"id":"msg_ad51518a-03a2-4e9e-ac97-3fb79c479866","conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","sender":"qa-1757fb4971db","body":"Sure, now works","createdAt":"2026-11-12T09:56:37.897628062Z"},{"id":"msg_1a56056d-1c9a-4377-9c98-ddf03c3f4e65","conversationId":"cnv_239aa562-957a-49e0-8acd-c1d9726e562c","sender":"qa-1757fb4971db","body":"Calling you","createdAt":"2026-11-12T09:56:37.943991645Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages
correlation: qa-c85dc204-2bcd-4466-b21b-58a4a4f0d555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c85dc204-2bcd-4466-b21b-58a4a4f0d555
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c85dc204-2bcd-4466-b21b-58a4a4f0d555
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_239aa562-957a-49e0-8acd-c1d9726e562c/messages","correlationId":"qa-c85dc204-2bcd-4466-b21b-58a4a4f0d555"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-66f68bef-2f53-41c9-843a-658d37eec89a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66f68bef-2f53-41c9-843a-658d37eec89a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-66f68bef-2f53-41c9-843a-658d37eec89a
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

{"balance":3,"currency":"credits","accountId":"acc_bd04fa02-e07e-45c1-99b7-0aab0aa85274"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af7c74b8-9409-4e24-bddf-6a5cb0eedb15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af7c74b8-9409-4e24-bddf-6a5cb0eedb15
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af7c74b8-9409-4e24-bddf-6a5cb0eedb15
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
correlation: qa-faadd248-3e6b-41c3-8d7a-99799b5ad846

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faadd248-3e6b-41c3-8d7a-99799b5ad846
Content-Type: application/json

--- request body ---
{"handle":"qa-45d388728190","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-faadd248-3e6b-41c3-8d7a-99799b5ad846
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-faadd248-3e6b-41c3-8d7a-99799b5ad846"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b020ea63-810e-4ccf-b1c8-cd6feeb1cbbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b020ea63-810e-4ccf-b1c8-cd6feeb1cbbd
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b020ea63-810e-4ccf-b1c8-cd6feeb1cbbd
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
correlation: qa-6a69a55d-0b85-40bf-9d79-7ffecc119347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a69a55d-0b85-40bf-9d79-7ffecc119347
Content-Type: application/json

--- request body ---
{"handle":"qa-1757fb4971db","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a69a55d-0b85-40bf-9d79-7ffecc119347
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6a69a55d-0b85-40bf-9d79-7ffecc119347"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f0e64a4-2214-4b84-888b-60e2a92f981e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f0e64a4-2214-4b84-888b-60e2a92f981e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f0e64a4-2214-4b84-888b-60e2a92f981e
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
correlation: qa-93671727-4358-4829-8b7c-e983a373b37b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93671727-4358-4829-8b7c-e983a373b37b
Content-Type: application/json

--- request body ---
{"handle":"qa-30e98ef26acb","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93671727-4358-4829-8b7c-e983a373b37b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93671727-4358-4829-8b7c-e983a373b37b"}
```
