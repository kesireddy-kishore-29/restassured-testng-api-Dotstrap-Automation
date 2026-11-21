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
| 1 | `POST /v1/accounts` | 201 | 525 | `qa-a65af72d-a974-4b19-b560-e3bf7501bc0d` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-1700598d-2571-4ee5-8d3a-054470186830` |
| 3 | `POST /v1/accounts` | 201 | 37 | `qa-3fcee97f-fff3-4d1d-9d70-eb27dd9b851a` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-dbcca379-752e-4188-b411-c4a3ee1b3245` |
| 5 | `POST /v1/conversations` | 201 | 87 | `qa-d0da6f0e-976a-4124-bf36-bbc6cca1a649` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-fb55964c-d043-48a3-85ae-fb3d86b7beb7` |
| 7 | `GET /v1/conversations` | 200 | 19 | `qa-ca68c6eb-cc74-4aad-abcc-5ee3786ccd2b` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 30 | `qa-3a0be899-90ba-4d7c-8224-4b532e0df79a` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 18 | `qa-3c1afaf6-26ab-4ae0-bf7d-793adf5e1fa9` |
| 10 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-16db4864-88a4-4df2-904d-f15007a7caa3` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-8e74cf66-3c4c-407a-ad44-55c7e1d9bc45` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-712fe547-936f-4791-b7e3-44eb2eebc002` |
| 13 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-8a7fd6ca-85f9-4dc2-ae7a-61c3f1c8e143` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-7c617831-9b93-4554-b752-ea84231b5338` |
| 15 | `GET /v1/credits/balance` | 200 | 24 | `qa-696774e0-67a0-42e8-9a42-789857f01520` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-75926e53-2d45-4f38-bb3b-e0c2c7d5b741` |
| 17 | `POST /v1/auth/token` | 200 | 21 | `qa-0a85b93c-bfa2-4f3d-bcd6-77ec96990c04` |
| 18 | `GET /v1/conversations/{id}` | 403 | 14 | `qa-d369fe89-1775-43df-a687-9342df260b19` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-78c4f82d-950a-4cc0-b6f9-f6530b07ec04` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 9 | `qa-f478ec31-c924-4bd8-8148-71374eee79db` |
| 21 | `GET /v1/conversations` | 200 | 8 | `qa-8eb1fb2f-952b-407c-8a8b-305f98d1bc09` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-1184ba9a-8397-4ac6-82d8-610e55bf78c5` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-d685b4f2-665b-4ef6-a8ac-cbea158e99af` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-4d22b19a-1494-4aaf-8fce-a69662f8c898` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 10 | `qa-d81b10ea-60bb-48e8-bea3-e18e2c7e0730` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 6 | `qa-be337c39-e2c5-4dd4-8d7d-64424736d369` |
| 27 | `GET /v1/credits/balance` | 200 | 8 | `qa-4e0f6ae1-500d-4aa7-98d3-54cf0ec261ac` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-21d7b4f9-ad8d-4d5f-9f01-9bca7fb0404f` |
| 29 | `POST /v1/auth/token` | 401 | 7 | `qa-a9e04910-1b34-4df2-ae38-733658120222` |
| 30 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-779c6724-a831-4df0-bdc8-ba57b6b22397` |
| 31 | `POST /v1/auth/token` | 401 | 5 | `qa-1d500432-8218-4812-9fa3-7a5a7ece03af` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5663a6cb-500c-4dac-831c-c6591d003c24` |
| 33 | `POST /v1/auth/token` | 401 | 7 | `qa-65423561-005b-4de5-9c0a-c57d530846d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a65af72d-a974-4b19-b560-e3bf7501bc0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a65af72d-a974-4b19-b560-e3bf7501bc0d
Content-Type: application/json

--- request body ---
{"handle":"qa-08115bbe3813","displayName":"QA 08115bbe3813","password":"****","region":"eu"}

--- response: 201 in 525 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a65af72d-a974-4b19-b560-e3bf7501bc0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-08115bbe3813
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20d4fc5e-c3a9-4879-a41b-a2321e1e0268","handle":"qa-08115bbe3813","displayName":"QA 08115bbe3813","region":"eu","role":"user","createdAt":"2026-11-13T09:42:11.306582371Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1700598d-2571-4ee5-8d3a-054470186830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1700598d-2571-4ee5-8d3a-054470186830
Content-Type: application/json

--- request body ---
{"handle":"qa-0368d5adfbfc","displayName":"QA 0368d5adfbfc","password":"****","region":"us"}

--- response: 201 in 59 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1700598d-2571-4ee5-8d3a-054470186830
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
Location: /v1/accounts/qa-0368d5adfbfc
X-Served-Region: us
Content-Length: 181

{"id":"acc_4153dc8f-cd4f-4b35-b288-ad08b7d0309b","handle":"qa-0368d5adfbfc","displayName":"QA 0368d5adfbfc","region":"us","role":"user","createdAt":"2026-11-13T09:42:11.850885569Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-3fcee97f-fff3-4d1d-9d70-eb27dd9b851a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fcee97f-fff3-4d1d-9d70-eb27dd9b851a
Content-Type: application/json

--- request body ---
{"handle":"qa-48040ad735d6","displayName":"QA 48040ad735d6","password":"****","region":"in"}

--- response: 201 in 37 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fcee97f-fff3-4d1d-9d70-eb27dd9b851a
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
Location: /v1/accounts/qa-48040ad735d6
X-Served-Region: in
Content-Length: 181

{"id":"acc_886e8671-a294-4405-a2c9-738fa186d5c0","handle":"qa-48040ad735d6","displayName":"QA 48040ad735d6","region":"in","role":"user","createdAt":"2026-11-13T09:42:11.927097310Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-dbcca379-752e-4188-b411-c4a3ee1b3245

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbcca379-752e-4188-b411-c4a3ee1b3245
Content-Type: application/json

--- request body ---
{"handle":"qa-08115bbe3813","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbcca379-752e-4188-b411-c4a3ee1b3245
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20d4fc5e-c3a9-4879-a41b-a2321e1e0268"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d0da6f0e-976a-4124-bf36-bbc6cca1a649

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0da6f0e-976a-4124-bf36-bbc6cca1a649
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0368d5adfbfc","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 87 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0da6f0e-976a-4124-bf36-bbc6cca1a649
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
Location: /v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8
X-Data-Region: us
Content-Length: 238

{"id":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-08115bbe3813","qa-0368d5adfbfc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:12.054093759Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fb55964c-d043-48a3-85ae-fb3d86b7beb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb55964c-d043-48a3-85ae-fb3d86b7beb7
Content-Type: application/json

--- request body ---
{"handle":"qa-0368d5adfbfc","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb55964c-d043-48a3-85ae-fb3d86b7beb7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4153dc8f-cd4f-4b35-b288-ad08b7d0309b"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-ca68c6eb-cc74-4aad-abcc-5ee3786ccd2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca68c6eb-cc74-4aad-abcc-5ee3786ccd2b
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca68c6eb-cc74-4aad-abcc-5ee3786ccd2b
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

{"items":[{"id":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-08115bbe3813","qa-0368d5adfbfc"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-13T09:42:12.054093759Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages
correlation: qa-3a0be899-90ba-4d7c-8224-4b532e0df79a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0be899-90ba-4d7c-8224-4b532e0df79a
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0be899-90ba-4d7c-8224-4b532e0df79a
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

{"items":[{"id":"msg_d785491c-d984-456a-9101-7c694e2f46b3","conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","sender":"qa-08115bbe3813","body":"Hi Ben, got a minute?","createdAt":"2026-11-13T09:42:12.054105641Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/read
correlation: qa-3c1afaf6-26ab-4ae0-bf7d-793adf5e1fa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c1afaf6-26ab-4ae0-bf7d-793adf5e1fa9
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c1afaf6-26ab-4ae0-bf7d-793adf5e1fa9
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

{"conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8
correlation: qa-16db4864-88a4-4df2-904d-f15007a7caa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16db4864-88a4-4df2-904d-f15007a7caa3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-16db4864-88a4-4df2-904d-f15007a7caa3
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

{"id":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-08115bbe3813","qa-0368d5adfbfc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:12.054093759Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages
correlation: qa-8e74cf66-3c4c-407a-ad44-55c7e1d9bc45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e74cf66-3c4c-407a-ad44-55c7e1d9bc45
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e74cf66-3c4c-407a-ad44-55c7e1d9bc45
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

{"id":"msg_3f28fa99-3ecb-4274-b6ee-ead42ef546bc","conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","sender":"qa-0368d5adfbfc","body":"Sure, now works","createdAt":"2026-11-13T09:42:12.545566671Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages
correlation: qa-712fe547-936f-4791-b7e3-44eb2eebc002

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-712fe547-936f-4791-b7e3-44eb2eebc002
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-712fe547-936f-4791-b7e3-44eb2eebc002
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

{"id":"msg_261c7690-e451-4d51-8457-892ae85eae9e","conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","sender":"qa-0368d5adfbfc","body":"Calling you","createdAt":"2026-11-13T09:42:12.572197057Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8
correlation: qa-8a7fd6ca-85f9-4dc2-ae7a-61c3f1c8e143

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a7fd6ca-85f9-4dc2-ae7a-61c3f1c8e143
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a7fd6ca-85f9-4dc2-ae7a-61c3f1c8e143
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

{"id":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","subject":"Project kickoff","status":"open","region":"us","participants":["qa-08115bbe3813","qa-0368d5adfbfc"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-13T09:42:12.054093759Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages
correlation: qa-7c617831-9b93-4554-b752-ea84231b5338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c617831-9b93-4554-b752-ea84231b5338
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c617831-9b93-4554-b752-ea84231b5338
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

{"items":[{"id":"msg_d785491c-d984-456a-9101-7c694e2f46b3","conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","sender":"qa-08115bbe3813","body":"Hi Ben, got a minute?","createdAt":"2026-11-13T09:42:12.054105641Z"},{"id":"msg_3f28fa99-3ecb-4274-b6ee-ead42ef546bc","conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","sender":"qa-0368d5adfbfc","body":"Sure, now works","createdAt":"2026-11-13T09:42:12.545566671Z"},{"id":"msg_261c7690-e451-4d51-8457-892ae85eae9e","conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","sender":"qa-0368d5adfbfc","body":"Calling you","createdAt":"2026-11-13T09:42:12.572197057Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-696774e0-67a0-42e8-9a42-789857f01520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-696774e0-67a0-42e8-9a42-789857f01520
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-696774e0-67a0-42e8-9a42-789857f01520
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

{"balance":4,"currency":"credits","accountId":"acc_20d4fc5e-c3a9-4879-a41b-a2321e1e0268"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-75926e53-2d45-4f38-bb3b-e0c2c7d5b741

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75926e53-2d45-4f38-bb3b-e0c2c7d5b741
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-75926e53-2d45-4f38-bb3b-e0c2c7d5b741
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

{"balance":3,"currency":"credits","accountId":"acc_4153dc8f-cd4f-4b35-b288-ad08b7d0309b"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-0a85b93c-bfa2-4f3d-bcd6-77ec96990c04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a85b93c-bfa2-4f3d-bcd6-77ec96990c04
Content-Type: application/json

--- request body ---
{"handle":"qa-48040ad735d6","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a85b93c-bfa2-4f3d-bcd6-77ec96990c04
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_886e8671-a294-4405-a2c9-738fa186d5c0"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8
correlation: qa-d369fe89-1775-43df-a687-9342df260b19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d369fe89-1775-43df-a687-9342df260b19
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d369fe89-1775-43df-a687-9342df260b19
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","correlationId":"qa-d369fe89-1775-43df-a687-9342df260b19"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages
correlation: qa-78c4f82d-950a-4cc0-b6f9-f6530b07ec04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78c4f82d-950a-4cc0-b6f9-f6530b07ec04
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78c4f82d-950a-4cc0-b6f9-f6530b07ec04
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages","correlationId":"qa-78c4f82d-950a-4cc0-b6f9-f6530b07ec04"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages
correlation: qa-f478ec31-c924-4bd8-8148-71374eee79db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f478ec31-c924-4bd8-8148-71374eee79db
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f478ec31-c924-4bd8-8148-71374eee79db
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages","correlationId":"qa-f478ec31-c924-4bd8-8148-71374eee79db"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-8eb1fb2f-952b-407c-8a8b-305f98d1bc09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8eb1fb2f-952b-407c-8a8b-305f98d1bc09
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8eb1fb2f-952b-407c-8a8b-305f98d1bc09
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
correlation: qa-1184ba9a-8397-4ac6-82d8-610e55bf78c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1184ba9a-8397-4ac6-82d8-610e55bf78c5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-1184ba9a-8397-4ac6-82d8-610e55bf78c5
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

{"balance":5,"currency":"credits","accountId":"acc_886e8671-a294-4405-a2c9-738fa186d5c0"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/close
correlation: qa-d685b4f2-665b-4ef6-a8ac-cbea158e99af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d685b4f2-665b-4ef6-a8ac-cbea158e99af
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d685b4f2-665b-4ef6-a8ac-cbea158e99af
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

{"id":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-08115bbe3813","qa-0368d5adfbfc"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-13T09:42:12.054093759Z","closedAt":"2026-11-13T09:42:13.551001707Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/close
correlation: qa-4d22b19a-1494-4aaf-8fce-a69662f8c898

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d22b19a-1494-4aaf-8fce-a69662f8c898
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d22b19a-1494-4aaf-8fce-a69662f8c898
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

{"id":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-08115bbe3813","qa-0368d5adfbfc"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-13T09:42:12.054093759Z","closedAt":"2026-11-13T09:42:13.551001707Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages
correlation: qa-d81b10ea-60bb-48e8-bea3-e18e2c7e0730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d81b10ea-60bb-48e8-bea3-e18e2c7e0730
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d81b10ea-60bb-48e8-bea3-e18e2c7e0730
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

{"items":[{"id":"msg_d785491c-d984-456a-9101-7c694e2f46b3","conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","sender":"qa-08115bbe3813","body":"Hi Ben, got a minute?","createdAt":"2026-11-13T09:42:12.054105641Z"},{"id":"msg_3f28fa99-3ecb-4274-b6ee-ead42ef546bc","conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","sender":"qa-0368d5adfbfc","body":"Sure, now works","createdAt":"2026-11-13T09:42:12.545566671Z"},{"id":"msg_261c7690-e451-4d51-8457-892ae85eae9e","conversationId":"cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8","sender":"qa-0368d5adfbfc","body":"Calling you","createdAt":"2026-11-13T09:42:12.572197057Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages
correlation: qa-be337c39-e2c5-4dd4-8d7d-64424736d369

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be337c39-e2c5-4dd4-8d7d-64424736d369
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be337c39-e2c5-4dd4-8d7d-64424736d369
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_ff72b9d6-8bd7-4005-9f6f-cbaa7c4ce7b8/messages","correlationId":"qa-be337c39-e2c5-4dd4-8d7d-64424736d369"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-4e0f6ae1-500d-4aa7-98d3-54cf0ec261ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e0f6ae1-500d-4aa7-98d3-54cf0ec261ac
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e0f6ae1-500d-4aa7-98d3-54cf0ec261ac
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

{"balance":3,"currency":"credits","accountId":"acc_4153dc8f-cd4f-4b35-b288-ad08b7d0309b"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21d7b4f9-ad8d-4d5f-9f01-9bca7fb0404f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21d7b4f9-ad8d-4d5f-9f01-9bca7fb0404f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21d7b4f9-ad8d-4d5f-9f01-9bca7fb0404f
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
correlation: qa-a9e04910-1b34-4df2-ae38-733658120222

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9e04910-1b34-4df2-ae38-733658120222
Content-Type: application/json

--- request body ---
{"handle":"qa-48040ad735d6","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9e04910-1b34-4df2-ae38-733658120222
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9e04910-1b34-4df2-ae38-733658120222"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-779c6724-a831-4df0-bdc8-ba57b6b22397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-779c6724-a831-4df0-bdc8-ba57b6b22397
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-779c6724-a831-4df0-bdc8-ba57b6b22397
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
correlation: qa-1d500432-8218-4812-9fa3-7a5a7ece03af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d500432-8218-4812-9fa3-7a5a7ece03af
Content-Type: application/json

--- request body ---
{"handle":"qa-0368d5adfbfc","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d500432-8218-4812-9fa3-7a5a7ece03af
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d500432-8218-4812-9fa3-7a5a7ece03af"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5663a6cb-500c-4dac-831c-c6591d003c24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5663a6cb-500c-4dac-831c-c6591d003c24
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5663a6cb-500c-4dac-831c-c6591d003c24
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
correlation: qa-65423561-005b-4de5-9c0a-c57d530846d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65423561-005b-4de5-9c0a-c57d530846d5
Content-Type: application/json

--- request body ---
{"handle":"qa-08115bbe3813","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65423561-005b-4de5-9c0a-c57d530846d5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65423561-005b-4de5-9c0a-c57d530846d5"}
```
