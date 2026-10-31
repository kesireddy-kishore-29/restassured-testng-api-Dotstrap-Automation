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
| 1 | `POST /v1/accounts` | 201 | 493 | `qa-b3c91763-797f-4a02-9136-7dbbc51503d7` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-fb9249a7-4bdd-47cc-be73-7c2ed9587b37` |
| 3 | `POST /v1/accounts` | 201 | 82 | `qa-04af631c-3a03-4f42-bf1b-fc164f5e7cbc` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-e4921d38-e8cb-4fab-b69b-addcb5aa0b6d` |
| 5 | `POST /v1/conversations` | 201 | 70 | `qa-0297efe7-aa55-4bf2-b718-2e4c4f5cc6d7` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-8e8057ea-e8c1-46dd-abb0-d204707ca304` |
| 7 | `GET /v1/conversations` | 200 | 20 | `qa-5b199376-9a88-422a-a1f2-5c84ece6e715` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 22 | `qa-c73421d7-5bdf-4f81-9342-39e0d24ffb7a` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 21 | `qa-58cbff37-f6d1-496a-baef-50d3ff17a6da` |
| 10 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-183eef0e-96a1-4170-b305-96ddb648497a` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 36 | `qa-278fb0aa-de51-408a-bc00-ff491f09f030` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-f4fa02ec-fcf1-4ed9-b688-73d7c2b85f60` |
| 13 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-0d441fc4-d2d2-44bb-8bfd-8bad12be2759` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 18 | `qa-d65cd3f5-7b5c-4831-9515-5d94b0703bf6` |
| 15 | `GET /v1/credits/balance` | 200 | 17 | `qa-dce83c13-1a70-4480-a9dd-7984eda42d9f` |
| 16 | `GET /v1/credits/balance` | 200 | 14 | `qa-abd9951f-cc2a-4027-8ffe-17ed41bc4ca5` |
| 17 | `POST /v1/auth/token` | 200 | 29 | `qa-4d8bdef6-4b3d-43e1-a3d1-9bf4a274a7cc` |
| 18 | `GET /v1/conversations/{id}` | 403 | 13 | `qa-ee2c5672-e388-42fe-a5f9-c61c32c9d3a9` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 13 | `qa-1f82b635-ce86-41fd-93ce-eb30aeee0fb5` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-fd4cbcb2-0458-4303-a077-522cd919d346` |
| 21 | `GET /v1/conversations` | 200 | 8 | `qa-fba8f7cf-1157-4190-9054-51114f1cd993` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-91376328-179d-4a4a-82b1-93e0fa19b8f5` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-a9efe7ed-7567-4943-8ca7-b59ae4521603` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-d334bc69-470b-4d24-8057-fc62185b8928` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-ceaefba8-9e51-4ce0-b804-80f501a8e31a` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 9 | `qa-814565b4-465d-4bbe-b569-5d00c6cee2aa` |
| 27 | `GET /v1/credits/balance` | 200 | 12 | `qa-52c62089-4461-47e4-969d-6b8cc6d13460` |
| 28 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-4cca4055-f6a9-4c94-aee7-b39f4a8c812a` |
| 29 | `POST /v1/auth/token` | 401 | 9 | `qa-a0c1279c-b580-4278-9492-ce3382c83b81` |
| 30 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4cb191ca-fea5-4ace-8b80-d490a64fc5c9` |
| 31 | `POST /v1/auth/token` | 401 | 7 | `qa-462d1807-e6e6-4cfb-8005-e01f3cc99e53` |
| 32 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7acf13dd-48ba-4b2e-88e9-f4f0e8ca1c37` |
| 33 | `POST /v1/auth/token` | 401 | 12 | `qa-c220a719-38ad-4b7e-b4da-af9950c6dd9f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3c91763-797f-4a02-9136-7dbbc51503d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3c91763-797f-4a02-9136-7dbbc51503d7
Content-Type: application/json

--- request body ---
{"handle":"qa-9461db532fc8","displayName":"QA 9461db532fc8","password":"****","region":"eu"}

--- response: 201 in 493 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3c91763-797f-4a02-9136-7dbbc51503d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-9461db532fc8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19b51a85-8286-4bc7-89e1-8deff56ab75f","handle":"qa-9461db532fc8","displayName":"QA 9461db532fc8","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.354183729Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fb9249a7-4bdd-47cc-be73-7c2ed9587b37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb9249a7-4bdd-47cc-be73-7c2ed9587b37
Content-Type: application/json

--- request body ---
{"handle":"qa-f3b63e146a30","displayName":"QA f3b63e146a30","password":"****","region":"us"}

--- response: 201 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb9249a7-4bdd-47cc-be73-7c2ed9587b37
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
Location: /v1/accounts/qa-f3b63e146a30
X-Served-Region: us
Content-Length: 181

{"id":"acc_1cd3dc44-97e0-4c2a-bc43-ab1a54dcef92","handle":"qa-f3b63e146a30","displayName":"QA f3b63e146a30","region":"us","role":"user","createdAt":"2026-10-25T07:40:25.949144858Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-04af631c-3a03-4f42-bf1b-fc164f5e7cbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04af631c-3a03-4f42-bf1b-fc164f5e7cbc
Content-Type: application/json

--- request body ---
{"handle":"qa-ce5cdd43d470","displayName":"QA ce5cdd43d470","password":"****","region":"in"}

--- response: 201 in 82 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-04af631c-3a03-4f42-bf1b-fc164f5e7cbc
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
Location: /v1/accounts/qa-ce5cdd43d470
X-Served-Region: in
Content-Length: 181

{"id":"acc_75c8dd0d-6819-43b0-986e-f252ae83a022","handle":"qa-ce5cdd43d470","displayName":"QA ce5cdd43d470","region":"in","role":"user","createdAt":"2026-10-25T07:40:26.066077385Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e4921d38-e8cb-4fab-b69b-addcb5aa0b6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4921d38-e8cb-4fab-b69b-addcb5aa0b6d
Content-Type: application/json

--- request body ---
{"handle":"qa-9461db532fc8","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4921d38-e8cb-4fab-b69b-addcb5aa0b6d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19b51a85-8286-4bc7-89e1-8deff56ab75f"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0297efe7-aa55-4bf2-b718-2e4c4f5cc6d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0297efe7-aa55-4bf2-b718-2e4c4f5cc6d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f3b63e146a30","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 70 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-0297efe7-aa55-4bf2-b718-2e4c4f5cc6d7
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
Location: /v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0
X-Data-Region: us
Content-Length: 238

{"id":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9461db532fc8","qa-f3b63e146a30"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.198604839Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8e8057ea-e8c1-46dd-abb0-d204707ca304

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e8057ea-e8c1-46dd-abb0-d204707ca304
Content-Type: application/json

--- request body ---
{"handle":"qa-f3b63e146a30","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e8057ea-e8c1-46dd-abb0-d204707ca304
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cd3dc44-97e0-4c2a-bc43-ab1a54dcef92"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-5b199376-9a88-422a-a1f2-5c84ece6e715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b199376-9a88-422a-a1f2-5c84ece6e715
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b199376-9a88-422a-a1f2-5c84ece6e715
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

{"items":[{"id":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9461db532fc8","qa-f3b63e146a30"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-25T07:40:26.198604839Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages
correlation: qa-c73421d7-5bdf-4f81-9342-39e0d24ffb7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c73421d7-5bdf-4f81-9342-39e0d24ffb7a
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c73421d7-5bdf-4f81-9342-39e0d24ffb7a
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

{"items":[{"id":"msg_873fb996-c3ff-4ece-ac38-dd39fa5e2bab","conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","sender":"qa-9461db532fc8","body":"Hi Ben, got a minute?","createdAt":"2026-10-25T07:40:26.198648602Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/read
correlation: qa-58cbff37-f6d1-496a-baef-50d3ff17a6da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58cbff37-f6d1-496a-baef-50d3ff17a6da
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-58cbff37-f6d1-496a-baef-50d3ff17a6da
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

{"conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0
correlation: qa-183eef0e-96a1-4170-b305-96ddb648497a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-183eef0e-96a1-4170-b305-96ddb648497a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-183eef0e-96a1-4170-b305-96ddb648497a
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

{"id":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9461db532fc8","qa-f3b63e146a30"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.198604839Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages
correlation: qa-278fb0aa-de51-408a-bc00-ff491f09f030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-278fb0aa-de51-408a-bc00-ff491f09f030
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 36 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-278fb0aa-de51-408a-bc00-ff491f09f030
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

{"id":"msg_0c49dd0f-8a0e-4942-b3ec-e77b45b072c4","conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","sender":"qa-f3b63e146a30","body":"Sure, now works","createdAt":"2026-10-25T07:40:26.707379932Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages
correlation: qa-f4fa02ec-fcf1-4ed9-b688-73d7c2b85f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4fa02ec-fcf1-4ed9-b688-73d7c2b85f60
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4fa02ec-fcf1-4ed9-b688-73d7c2b85f60
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

{"id":"msg_b25721d0-f489-4942-a865-24e825f390d1","conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","sender":"qa-f3b63e146a30","body":"Calling you","createdAt":"2026-10-25T07:40:26.730973583Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0
correlation: qa-0d441fc4-d2d2-44bb-8bfd-8bad12be2759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d441fc4-d2d2-44bb-8bfd-8bad12be2759
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d441fc4-d2d2-44bb-8bfd-8bad12be2759
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

{"id":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9461db532fc8","qa-f3b63e146a30"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-25T07:40:26.198604839Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages
correlation: qa-d65cd3f5-7b5c-4831-9515-5d94b0703bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d65cd3f5-7b5c-4831-9515-5d94b0703bf6
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d65cd3f5-7b5c-4831-9515-5d94b0703bf6
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

{"items":[{"id":"msg_873fb996-c3ff-4ece-ac38-dd39fa5e2bab","conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","sender":"qa-9461db532fc8","body":"Hi Ben, got a minute?","createdAt":"2026-10-25T07:40:26.198648602Z"},{"id":"msg_0c49dd0f-8a0e-4942-b3ec-e77b45b072c4","conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","sender":"qa-f3b63e146a30","body":"Sure, now works","createdAt":"2026-10-25T07:40:26.707379932Z"},{"id":"msg_b25721d0-f489-4942-a865-24e825f390d1","conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","sender":"qa-f3b63e146a30","body":"Calling you","createdAt":"2026-10-25T07:40:26.730973583Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-dce83c13-1a70-4480-a9dd-7984eda42d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dce83c13-1a70-4480-a9dd-7984eda42d9f
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-dce83c13-1a70-4480-a9dd-7984eda42d9f
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

{"balance":4,"currency":"credits","accountId":"acc_19b51a85-8286-4bc7-89e1-8deff56ab75f"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-abd9951f-cc2a-4027-8ffe-17ed41bc4ca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abd9951f-cc2a-4027-8ffe-17ed41bc4ca5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-abd9951f-cc2a-4027-8ffe-17ed41bc4ca5
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

{"balance":3,"currency":"credits","accountId":"acc_1cd3dc44-97e0-4c2a-bc43-ab1a54dcef92"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-4d8bdef6-4b3d-43e1-a3d1-9bf4a274a7cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d8bdef6-4b3d-43e1-a3d1-9bf4a274a7cc
Content-Type: application/json

--- request body ---
{"handle":"qa-ce5cdd43d470","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d8bdef6-4b3d-43e1-a3d1-9bf4a274a7cc
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75c8dd0d-6819-43b0-986e-f252ae83a022"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0
correlation: qa-ee2c5672-e388-42fe-a5f9-c61c32c9d3a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee2c5672-e388-42fe-a5f9-c61c32c9d3a9
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee2c5672-e388-42fe-a5f9-c61c32c9d3a9
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","correlationId":"qa-ee2c5672-e388-42fe-a5f9-c61c32c9d3a9"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages
correlation: qa-1f82b635-ce86-41fd-93ce-eb30aeee0fb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f82b635-ce86-41fd-93ce-eb30aeee0fb5
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f82b635-ce86-41fd-93ce-eb30aeee0fb5
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages","correlationId":"qa-1f82b635-ce86-41fd-93ce-eb30aeee0fb5"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages
correlation: qa-fd4cbcb2-0458-4303-a077-522cd919d346

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd4cbcb2-0458-4303-a077-522cd919d346
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd4cbcb2-0458-4303-a077-522cd919d346
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages","correlationId":"qa-fd4cbcb2-0458-4303-a077-522cd919d346"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-fba8f7cf-1157-4190-9054-51114f1cd993

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fba8f7cf-1157-4190-9054-51114f1cd993
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-fba8f7cf-1157-4190-9054-51114f1cd993
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
correlation: qa-91376328-179d-4a4a-82b1-93e0fa19b8f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91376328-179d-4a4a-82b1-93e0fa19b8f5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-91376328-179d-4a4a-82b1-93e0fa19b8f5
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

{"balance":5,"currency":"credits","accountId":"acc_75c8dd0d-6819-43b0-986e-f252ae83a022"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/close
correlation: qa-a9efe7ed-7567-4943-8ca7-b59ae4521603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9efe7ed-7567-4943-8ca7-b59ae4521603
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9efe7ed-7567-4943-8ca7-b59ae4521603
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

{"id":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-9461db532fc8","qa-f3b63e146a30"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-25T07:40:26.198604839Z","closedAt":"2026-10-25T07:40:27.729214565Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/close
correlation: qa-d334bc69-470b-4d24-8057-fc62185b8928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d334bc69-470b-4d24-8057-fc62185b8928
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-d334bc69-470b-4d24-8057-fc62185b8928
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

{"id":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-9461db532fc8","qa-f3b63e146a30"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-25T07:40:26.198604839Z","closedAt":"2026-10-25T07:40:27.729214565Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages
correlation: qa-ceaefba8-9e51-4ce0-b804-80f501a8e31a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ceaefba8-9e51-4ce0-b804-80f501a8e31a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-ceaefba8-9e51-4ce0-b804-80f501a8e31a
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

{"items":[{"id":"msg_873fb996-c3ff-4ece-ac38-dd39fa5e2bab","conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","sender":"qa-9461db532fc8","body":"Hi Ben, got a minute?","createdAt":"2026-10-25T07:40:26.198648602Z"},{"id":"msg_0c49dd0f-8a0e-4942-b3ec-e77b45b072c4","conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","sender":"qa-f3b63e146a30","body":"Sure, now works","createdAt":"2026-10-25T07:40:26.707379932Z"},{"id":"msg_b25721d0-f489-4942-a865-24e825f390d1","conversationId":"cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0","sender":"qa-f3b63e146a30","body":"Calling you","createdAt":"2026-10-25T07:40:26.730973583Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages
correlation: qa-814565b4-465d-4bbe-b569-5d00c6cee2aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-814565b4-465d-4bbe-b569-5d00c6cee2aa
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-814565b4-465d-4bbe-b569-5d00c6cee2aa
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_c28ea0fa-47be-4cb7-98de-c769ad6c2da0/messages","correlationId":"qa-814565b4-465d-4bbe-b569-5d00c6cee2aa"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-52c62089-4461-47e4-969d-6b8cc6d13460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52c62089-4461-47e4-969d-6b8cc6d13460
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-52c62089-4461-47e4-969d-6b8cc6d13460
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

{"balance":3,"currency":"credits","accountId":"acc_1cd3dc44-97e0-4c2a-bc43-ab1a54dcef92"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4cca4055-f6a9-4c94-aee7-b39f4a8c812a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cca4055-f6a9-4c94-aee7-b39f4a8c812a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4cca4055-f6a9-4c94-aee7-b39f4a8c812a
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
correlation: qa-a0c1279c-b580-4278-9492-ce3382c83b81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c1279c-b580-4278-9492-ce3382c83b81
Content-Type: application/json

--- request body ---
{"handle":"qa-ce5cdd43d470","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0c1279c-b580-4278-9492-ce3382c83b81
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0c1279c-b580-4278-9492-ce3382c83b81"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4cb191ca-fea5-4ace-8b80-d490a64fc5c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cb191ca-fea5-4ace-8b80-d490a64fc5c9
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4cb191ca-fea5-4ace-8b80-d490a64fc5c9
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
correlation: qa-462d1807-e6e6-4cfb-8005-e01f3cc99e53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-462d1807-e6e6-4cfb-8005-e01f3cc99e53
Content-Type: application/json

--- request body ---
{"handle":"qa-f3b63e146a30","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-462d1807-e6e6-4cfb-8005-e01f3cc99e53
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-462d1807-e6e6-4cfb-8005-e01f3cc99e53"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7acf13dd-48ba-4b2e-88e9-f4f0e8ca1c37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7acf13dd-48ba-4b2e-88e9-f4f0e8ca1c37
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7acf13dd-48ba-4b2e-88e9-f4f0e8ca1c37
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
correlation: qa-c220a719-38ad-4b7e-b4da-af9950c6dd9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c220a719-38ad-4b7e-b4da-af9950c6dd9f
Content-Type: application/json

--- request body ---
{"handle":"qa-9461db532fc8","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c220a719-38ad-4b7e-b4da-af9950c6dd9f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c220a719-38ad-4b7e-b4da-af9950c6dd9f"}
```
