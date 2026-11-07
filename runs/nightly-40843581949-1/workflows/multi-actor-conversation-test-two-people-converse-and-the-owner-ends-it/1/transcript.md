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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-39fbb4a2-85be-4c7f-8130-a2eef8619097` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-06f56fff-7d50-41c0-8884-85fd8270316f` |
| 3 | `POST /v1/accounts` | 201 | 15 | `qa-06da52e4-7437-4dc2-a99d-c5964ba6e748` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-7bd7fba2-2b55-4af4-89dc-f5c10d7b6eb0` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-a8e9e9ce-705c-451a-a043-0792f1d00bbc` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-adc2028c-a3b0-4f4e-8aed-93d209428eed` |
| 7 | `GET /v1/conversations` | 200 | 21 | `qa-2049f71c-5b59-435f-92b0-d544ea30bd9c` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 20 | `qa-115b5a66-d24a-4b47-902d-9934bfad627f` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 15 | `qa-220f7923-3fb1-4d68-b6dd-281215914b24` |
| 10 | `GET /v1/conversations/{id}` | 200 | 13 | `qa-e4545053-6daa-4073-98e7-7d864fbb7687` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-be45afa0-d501-4bcb-a0e4-9123a1acc424` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-7ff768c7-9239-4470-932d-a2929426371c` |
| 13 | `GET /v1/conversations/{id}` | 200 | 5 | `qa-8951f39f-9dc5-44e6-a0d8-2c12ef203c40` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 10 | `qa-8cf1dc4d-5744-467b-a2e7-0423492590e2` |
| 15 | `GET /v1/credits/balance` | 200 | 5 | `qa-0a12822c-0056-4c6b-97c1-271ea4c76fb2` |
| 16 | `GET /v1/credits/balance` | 200 | 6 | `qa-e1625059-ee21-4a56-8549-e7e8bd3d2ac8` |
| 17 | `POST /v1/auth/token` | 200 | 10 | `qa-fd9da122-b188-4336-b00b-3b3fcce9e8ce` |
| 18 | `GET /v1/conversations/{id}` | 403 | 7 | `qa-9b8543b4-4744-4c74-bfa7-2e4338a80a45` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 13 | `qa-3f7b8e6e-e325-4294-a32e-e17a6ee0d949` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 10 | `qa-21f40ff7-7537-43e4-abc7-c8bd39357f95` |
| 21 | `GET /v1/conversations` | 200 | 7 | `qa-ff62ae6c-4ceb-4814-8130-50fdf8a051bd` |
| 22 | `GET /v1/credits/balance` | 200 | 4 | `qa-a8bd63ba-10d7-4e81-97be-f2c84df784e8` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-05b4d4cd-6c84-4ccf-a1dd-d625b93e4a20` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 10 | `qa-679722e4-d3e5-4a28-a4fc-6d1302b78f5e` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-b1894cd6-11ed-4fd4-81f3-f5e5a8747213` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-cb2c05dd-92b7-4585-abef-c9fb3de527d1` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-ad6166b9-85f9-497e-99d8-87f50fb2cf82` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-36389ea3-610a-4e03-88cd-14dc31d5b023` |
| 29 | `POST /v1/auth/token` | 401 | 5 | `qa-be41a6c0-714a-46df-b1bb-aa383949ba57` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-d800b5bd-8337-49be-824c-e85d37ce36cc` |
| 31 | `POST /v1/auth/token` | 401 | 5 | `qa-178462e4-17ca-4e72-b1ea-b5f48f3eaf31` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-957cfae7-5f28-4438-8069-8532b22ca71b` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-39abf9a9-eb0a-479a-b2cd-761210b23940` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-39fbb4a2-85be-4c7f-8130-a2eef8619097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39fbb4a2-85be-4c7f-8130-a2eef8619097
Content-Type: application/json

--- request body ---
{"handle":"qa-7e7eb8368b4d","displayName":"QA 7e7eb8368b4d","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-39fbb4a2-85be-4c7f-8130-a2eef8619097
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-7e7eb8368b4d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5c2b1f86-db9e-42a7-9aaf-69aa74a90282","handle":"qa-7e7eb8368b4d","displayName":"QA 7e7eb8368b4d","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.309502905Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-06f56fff-7d50-41c0-8884-85fd8270316f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06f56fff-7d50-41c0-8884-85fd8270316f
Content-Type: application/json

--- request body ---
{"handle":"qa-7e694eaa9fe1","displayName":"QA 7e694eaa9fe1","password":"****","region":"us"}

--- response: 201 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-06f56fff-7d50-41c0-8884-85fd8270316f
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
Location: /v1/accounts/qa-7e694eaa9fe1
X-Served-Region: us
Content-Length: 181

{"id":"acc_96fa9cb0-047f-401c-9434-33bdd93d8a39","handle":"qa-7e694eaa9fe1","displayName":"QA 7e694eaa9fe1","region":"us","role":"user","createdAt":"2026-10-29T08:38:58.337751670Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-06da52e4-7437-4dc2-a99d-c5964ba6e748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06da52e4-7437-4dc2-a99d-c5964ba6e748
Content-Type: application/json

--- request body ---
{"handle":"qa-f4e495df0a67","displayName":"QA f4e495df0a67","password":"****","region":"in"}

--- response: 201 in 15 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-06da52e4-7437-4dc2-a99d-c5964ba6e748
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
Location: /v1/accounts/qa-f4e495df0a67
X-Served-Region: in
Content-Length: 181

{"id":"acc_d4bbc222-6e59-41eb-a2f2-f0d0d88ccaf4","handle":"qa-f4e495df0a67","displayName":"QA f4e495df0a67","region":"in","role":"user","createdAt":"2026-10-29T08:38:58.365338281Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7bd7fba2-2b55-4af4-89dc-f5c10d7b6eb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bd7fba2-2b55-4af4-89dc-f5c10d7b6eb0
Content-Type: application/json

--- request body ---
{"handle":"qa-7e7eb8368b4d","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bd7fba2-2b55-4af4-89dc-f5c10d7b6eb0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5c2b1f86-db9e-42a7-9aaf-69aa74a90282"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a8e9e9ce-705c-451a-a043-0792f1d00bbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8e9e9ce-705c-451a-a043-0792f1d00bbc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7e694eaa9fe1","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8e9e9ce-705c-451a-a043-0792f1d00bbc
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
Location: /v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8
X-Data-Region: us
Content-Length: 238

{"id":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-7e7eb8368b4d","qa-7e694eaa9fe1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.424337324Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-adc2028c-a3b0-4f4e-8aed-93d209428eed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adc2028c-a3b0-4f4e-8aed-93d209428eed
Content-Type: application/json

--- request body ---
{"handle":"qa-7e694eaa9fe1","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-adc2028c-a3b0-4f4e-8aed-93d209428eed
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96fa9cb0-047f-401c-9434-33bdd93d8a39"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-2049f71c-5b59-435f-92b0-d544ea30bd9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2049f71c-5b59-435f-92b0-d544ea30bd9c
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2049f71c-5b59-435f-92b0-d544ea30bd9c
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

{"items":[{"id":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-7e7eb8368b4d","qa-7e694eaa9fe1"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-29T08:38:58.424337324Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages
correlation: qa-115b5a66-d24a-4b47-902d-9934bfad627f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-115b5a66-d24a-4b47-902d-9934bfad627f
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-115b5a66-d24a-4b47-902d-9934bfad627f
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

{"items":[{"id":"msg_3639ea1f-3198-489c-8d6b-eb80ffe03ada","conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","sender":"qa-7e7eb8368b4d","body":"Hi Ben, got a minute?","createdAt":"2026-10-29T08:38:58.424370576Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/read
correlation: qa-220f7923-3fb1-4d68-b6dd-281215914b24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-220f7923-3fb1-4d68-b6dd-281215914b24
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-220f7923-3fb1-4d68-b6dd-281215914b24
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

{"conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8
correlation: qa-e4545053-6daa-4073-98e7-7d864fbb7687

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4545053-6daa-4073-98e7-7d864fbb7687
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4545053-6daa-4073-98e7-7d864fbb7687
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

{"id":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-7e7eb8368b4d","qa-7e694eaa9fe1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.424337324Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages
correlation: qa-be45afa0-d501-4bcb-a0e4-9123a1acc424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be45afa0-d501-4bcb-a0e4-9123a1acc424
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-be45afa0-d501-4bcb-a0e4-9123a1acc424
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

{"id":"msg_5861c762-aec9-441a-a954-b4ee95a94004","conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","sender":"qa-7e694eaa9fe1","body":"Sure, now works","createdAt":"2026-10-29T08:38:58.629961048Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages
correlation: qa-7ff768c7-9239-4470-932d-a2929426371c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ff768c7-9239-4470-932d-a2929426371c
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ff768c7-9239-4470-932d-a2929426371c
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

{"id":"msg_5e523f04-409a-47e2-b948-f17195f23347","conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","sender":"qa-7e694eaa9fe1","body":"Calling you","createdAt":"2026-10-29T08:38:58.650230105Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8
correlation: qa-8951f39f-9dc5-44e6-a0d8-2c12ef203c40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8951f39f-9dc5-44e6-a0d8-2c12ef203c40
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8951f39f-9dc5-44e6-a0d8-2c12ef203c40
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

{"id":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-7e7eb8368b4d","qa-7e694eaa9fe1"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-29T08:38:58.424337324Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages
correlation: qa-8cf1dc4d-5744-467b-a2e7-0423492590e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cf1dc4d-5744-467b-a2e7-0423492590e2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cf1dc4d-5744-467b-a2e7-0423492590e2
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

{"items":[{"id":"msg_3639ea1f-3198-489c-8d6b-eb80ffe03ada","conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","sender":"qa-7e7eb8368b4d","body":"Hi Ben, got a minute?","createdAt":"2026-10-29T08:38:58.424370576Z"},{"id":"msg_5861c762-aec9-441a-a954-b4ee95a94004","conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","sender":"qa-7e694eaa9fe1","body":"Sure, now works","createdAt":"2026-10-29T08:38:58.629961048Z"},{"id":"msg_5e523f04-409a-47e2-b948-f17195f23347","conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","sender":"qa-7e694eaa9fe1","body":"Calling you","createdAt":"2026-10-29T08:38:58.650230105Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-0a12822c-0056-4c6b-97c1-271ea4c76fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a12822c-0056-4c6b-97c1-271ea4c76fb2
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a12822c-0056-4c6b-97c1-271ea4c76fb2
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

{"balance":4,"currency":"credits","accountId":"acc_5c2b1f86-db9e-42a7-9aaf-69aa74a90282"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-e1625059-ee21-4a56-8549-e7e8bd3d2ac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1625059-ee21-4a56-8549-e7e8bd3d2ac8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1625059-ee21-4a56-8549-e7e8bd3d2ac8
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

{"balance":3,"currency":"credits","accountId":"acc_96fa9cb0-047f-401c-9434-33bdd93d8a39"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-fd9da122-b188-4336-b00b-3b3fcce9e8ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd9da122-b188-4336-b00b-3b3fcce9e8ce
Content-Type: application/json

--- request body ---
{"handle":"qa-f4e495df0a67","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd9da122-b188-4336-b00b-3b3fcce9e8ce
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d4bbc222-6e59-41eb-a2f2-f0d0d88ccaf4"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8
correlation: qa-9b8543b4-4744-4c74-bfa7-2e4338a80a45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b8543b4-4744-4c74-bfa7-2e4338a80a45
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b8543b4-4744-4c74-bfa7-2e4338a80a45
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","correlationId":"qa-9b8543b4-4744-4c74-bfa7-2e4338a80a45"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages
correlation: qa-3f7b8e6e-e325-4294-a32e-e17a6ee0d949

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f7b8e6e-e325-4294-a32e-e17a6ee0d949
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f7b8e6e-e325-4294-a32e-e17a6ee0d949
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages","correlationId":"qa-3f7b8e6e-e325-4294-a32e-e17a6ee0d949"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages
correlation: qa-21f40ff7-7537-43e4-abc7-c8bd39357f95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21f40ff7-7537-43e4-abc7-c8bd39357f95
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21f40ff7-7537-43e4-abc7-c8bd39357f95
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages","correlationId":"qa-21f40ff7-7537-43e4-abc7-c8bd39357f95"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-ff62ae6c-4ceb-4814-8130-50fdf8a051bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff62ae6c-4ceb-4814-8130-50fdf8a051bd
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff62ae6c-4ceb-4814-8130-50fdf8a051bd
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
correlation: qa-a8bd63ba-10d7-4e81-97be-f2c84df784e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8bd63ba-10d7-4e81-97be-f2c84df784e8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8bd63ba-10d7-4e81-97be-f2c84df784e8
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

{"balance":5,"currency":"credits","accountId":"acc_d4bbc222-6e59-41eb-a2f2-f0d0d88ccaf4"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/close
correlation: qa-05b4d4cd-6c84-4ccf-a1dd-d625b93e4a20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05b4d4cd-6c84-4ccf-a1dd-d625b93e4a20
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-05b4d4cd-6c84-4ccf-a1dd-d625b93e4a20
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

{"id":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-7e7eb8368b4d","qa-7e694eaa9fe1"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-29T08:38:58.424337324Z","closedAt":"2026-10-29T08:38:59.271811645Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/close
correlation: qa-679722e4-d3e5-4a28-a4fc-6d1302b78f5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-679722e4-d3e5-4a28-a4fc-6d1302b78f5e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-679722e4-d3e5-4a28-a4fc-6d1302b78f5e
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

{"id":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-7e7eb8368b4d","qa-7e694eaa9fe1"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-29T08:38:58.424337324Z","closedAt":"2026-10-29T08:38:59.271811645Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages
correlation: qa-b1894cd6-11ed-4fd4-81f3-f5e5a8747213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1894cd6-11ed-4fd4-81f3-f5e5a8747213
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1894cd6-11ed-4fd4-81f3-f5e5a8747213
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

{"items":[{"id":"msg_3639ea1f-3198-489c-8d6b-eb80ffe03ada","conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","sender":"qa-7e7eb8368b4d","body":"Hi Ben, got a minute?","createdAt":"2026-10-29T08:38:58.424370576Z"},{"id":"msg_5861c762-aec9-441a-a954-b4ee95a94004","conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","sender":"qa-7e694eaa9fe1","body":"Sure, now works","createdAt":"2026-10-29T08:38:58.629961048Z"},{"id":"msg_5e523f04-409a-47e2-b948-f17195f23347","conversationId":"cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8","sender":"qa-7e694eaa9fe1","body":"Calling you","createdAt":"2026-10-29T08:38:58.650230105Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages
correlation: qa-cb2c05dd-92b7-4585-abef-c9fb3de527d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb2c05dd-92b7-4585-abef-c9fb3de527d1
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb2c05dd-92b7-4585-abef-c9fb3de527d1
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_7bfc7e9e-b83d-443e-9c25-cf46ac450cb8/messages","correlationId":"qa-cb2c05dd-92b7-4585-abef-c9fb3de527d1"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-ad6166b9-85f9-497e-99d8-87f50fb2cf82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad6166b9-85f9-497e-99d8-87f50fb2cf82
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad6166b9-85f9-497e-99d8-87f50fb2cf82
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

{"balance":3,"currency":"credits","accountId":"acc_96fa9cb0-047f-401c-9434-33bdd93d8a39"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36389ea3-610a-4e03-88cd-14dc31d5b023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36389ea3-610a-4e03-88cd-14dc31d5b023
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36389ea3-610a-4e03-88cd-14dc31d5b023
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
correlation: qa-be41a6c0-714a-46df-b1bb-aa383949ba57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be41a6c0-714a-46df-b1bb-aa383949ba57
Content-Type: application/json

--- request body ---
{"handle":"qa-f4e495df0a67","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be41a6c0-714a-46df-b1bb-aa383949ba57
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be41a6c0-714a-46df-b1bb-aa383949ba57"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d800b5bd-8337-49be-824c-e85d37ce36cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d800b5bd-8337-49be-824c-e85d37ce36cc
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d800b5bd-8337-49be-824c-e85d37ce36cc
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
correlation: qa-178462e4-17ca-4e72-b1ea-b5f48f3eaf31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-178462e4-17ca-4e72-b1ea-b5f48f3eaf31
Content-Type: application/json

--- request body ---
{"handle":"qa-7e694eaa9fe1","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-178462e4-17ca-4e72-b1ea-b5f48f3eaf31
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-178462e4-17ca-4e72-b1ea-b5f48f3eaf31"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-957cfae7-5f28-4438-8069-8532b22ca71b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-957cfae7-5f28-4438-8069-8532b22ca71b
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-957cfae7-5f28-4438-8069-8532b22ca71b
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
correlation: qa-39abf9a9-eb0a-479a-b2cd-761210b23940

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39abf9a9-eb0a-479a-b2cd-761210b23940
Content-Type: application/json

--- request body ---
{"handle":"qa-7e7eb8368b4d","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39abf9a9-eb0a-479a-b2cd-761210b23940
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39abf9a9-eb0a-479a-b2cd-761210b23940"}
```
