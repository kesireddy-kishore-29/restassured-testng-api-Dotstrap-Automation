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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-7b3ca8ee-288f-45bf-a430-d7a0f9b64f19` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-418935fc-0420-451a-a602-b71904690d1b` |
| 3 | `POST /v1/accounts` | 201 | 21 | `qa-6e302e15-03dd-4d89-9934-712694ca2330` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-e2ca36f8-ad18-4230-b679-847d687a03a8` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-5f1762f9-316e-48c7-b952-97bfcc2d6fe5` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-59f876b8-1b35-4b9b-ad81-c6e1db66d13f` |
| 7 | `GET /v1/conversations` | 200 | 17 | `qa-99b5dbbd-b757-4fba-bf6b-21757d03f816` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 18 | `qa-bcb747b6-c904-4d34-9c41-605facf696fe` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 27 | `qa-1f6ad119-7fc1-4854-8793-bf96fef8a99d` |
| 10 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-58dc87aa-77e2-4503-8058-fa6d1a3654b5` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 31 | `qa-09090ff0-66ca-4adf-ac22-fa7f6662c540` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-159b4d36-7950-4a00-8faa-d6578b798e6e` |
| 13 | `GET /v1/conversations/{id}` | 200 | 13 | `qa-acb9ee1c-ebd5-4dd8-883a-78129c06e9a0` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-6755e153-caf7-40e8-8151-dba77398deae` |
| 15 | `GET /v1/credits/balance` | 200 | 6 | `qa-d4210518-910c-4623-88d7-e93f5feba260` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-9ad2a76c-4013-4dc4-9740-feb8dc669b1f` |
| 17 | `POST /v1/auth/token` | 200 | 17 | `qa-8fc5160d-0521-46a3-b025-b0eb4617ed56` |
| 18 | `GET /v1/conversations/{id}` | 403 | 12 | `qa-4fdcf06c-5c39-4a1d-b708-4443f933217f` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 8 | `qa-dfe1bf81-db6d-4d4b-926c-8ddf7ce53864` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-a59f023a-7299-4956-a412-30b256c08c83` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-44a37bac-5eca-41b1-aee1-c71aa8feffa1` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-f0f39f52-c608-4f90-93c2-988418fcf100` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-b372c19e-99e3-4784-9179-c3f90aae03d0` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-0f432a96-9948-4cc3-8472-47ed7e2167a8` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-9196741d-1920-4df7-86fa-5ae43f3e2059` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 6 | `qa-abead940-6b00-4271-91ad-89ee45036de8` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-432147a0-5d67-4b20-929f-55ce2139c28b` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ff3dd0aa-a240-4078-bfce-27bb2977d93e` |
| 29 | `POST /v1/auth/token` | 401 | 7 | `qa-887cbae1-19dc-43e5-9ac5-4fee19ce8558` |
| 30 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-4e3ba8ee-baa6-412d-9be3-30df8f993d0f` |
| 31 | `POST /v1/auth/token` | 401 | 7 | `qa-2ad96f1c-4fc9-4cbe-94a9-d1c010cf54e1` |
| 32 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-4a76919d-1b93-40b8-8b88-c745d08afa0d` |
| 33 | `POST /v1/auth/token` | 401 | 7 | `qa-21d6c7cf-db84-4b4e-9913-9811da7251cc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7b3ca8ee-288f-45bf-a430-d7a0f9b64f19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b3ca8ee-288f-45bf-a430-d7a0f9b64f19
Content-Type: application/json

--- request body ---
{"handle":"qa-e7033ec27b5f","displayName":"QA e7033ec27b5f","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b3ca8ee-288f-45bf-a430-d7a0f9b64f19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-e7033ec27b5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ccea60d-1e55-4a76-acc9-ea85bbccae03","handle":"qa-e7033ec27b5f","displayName":"QA e7033ec27b5f","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.848174543Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-418935fc-0420-451a-a602-b71904690d1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-418935fc-0420-451a-a602-b71904690d1b
Content-Type: application/json

--- request body ---
{"handle":"qa-8806f4850d08","displayName":"QA 8806f4850d08","password":"****","region":"us"}

--- response: 201 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-418935fc-0420-451a-a602-b71904690d1b
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
Location: /v1/accounts/qa-8806f4850d08
X-Served-Region: us
Content-Length: 181

{"id":"acc_5cc5f1ff-76a8-481c-97db-f526256ea025","handle":"qa-8806f4850d08","displayName":"QA 8806f4850d08","region":"us","role":"user","createdAt":"2026-10-30T08:46:03.889722290Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-6e302e15-03dd-4d89-9934-712694ca2330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e302e15-03dd-4d89-9934-712694ca2330
Content-Type: application/json

--- request body ---
{"handle":"qa-9f890451c044","displayName":"QA 9f890451c044","password":"****","region":"in"}

--- response: 201 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e302e15-03dd-4d89-9934-712694ca2330
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
Location: /v1/accounts/qa-9f890451c044
X-Served-Region: in
Content-Length: 181

{"id":"acc_6e22cf89-e04f-46c8-8f67-54ed7f80c953","handle":"qa-9f890451c044","displayName":"QA 9f890451c044","region":"in","role":"user","createdAt":"2026-10-30T08:46:03.921792714Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e2ca36f8-ad18-4230-b679-847d687a03a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2ca36f8-ad18-4230-b679-847d687a03a8
Content-Type: application/json

--- request body ---
{"handle":"qa-e7033ec27b5f","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2ca36f8-ad18-4230-b679-847d687a03a8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ccea60d-1e55-4a76-acc9-ea85bbccae03"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5f1762f9-316e-48c7-b952-97bfcc2d6fe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f1762f9-316e-48c7-b952-97bfcc2d6fe5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8806f4850d08","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f1762f9-316e-48c7-b952-97bfcc2d6fe5
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
Location: /v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049
X-Data-Region: us
Content-Length: 238

{"id":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","subject":"Project kickoff","status":"open","region":"us","participants":["qa-e7033ec27b5f","qa-8806f4850d08"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:03.980739863Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-59f876b8-1b35-4b9b-ad81-c6e1db66d13f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59f876b8-1b35-4b9b-ad81-c6e1db66d13f
Content-Type: application/json

--- request body ---
{"handle":"qa-8806f4850d08","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-59f876b8-1b35-4b9b-ad81-c6e1db66d13f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5cc5f1ff-76a8-481c-97db-f526256ea025"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-99b5dbbd-b757-4fba-bf6b-21757d03f816

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99b5dbbd-b757-4fba-bf6b-21757d03f816
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-99b5dbbd-b757-4fba-bf6b-21757d03f816
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

{"items":[{"id":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","subject":"Project kickoff","status":"open","region":"us","participants":["qa-e7033ec27b5f","qa-8806f4850d08"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-30T08:46:03.980739863Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages
correlation: qa-bcb747b6-c904-4d34-9c41-605facf696fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcb747b6-c904-4d34-9c41-605facf696fe
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcb747b6-c904-4d34-9c41-605facf696fe
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

{"items":[{"id":"msg_28103e5c-c210-484c-817f-e8da76357ec1","conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","sender":"qa-e7033ec27b5f","body":"Hi Ben, got a minute?","createdAt":"2026-10-30T08:46:03.980774989Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/read
correlation: qa-1f6ad119-7fc1-4854-8793-bf96fef8a99d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f6ad119-7fc1-4854-8793-bf96fef8a99d
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f6ad119-7fc1-4854-8793-bf96fef8a99d
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

{"conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049
correlation: qa-58dc87aa-77e2-4503-8058-fa6d1a3654b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58dc87aa-77e2-4503-8058-fa6d1a3654b5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-58dc87aa-77e2-4503-8058-fa6d1a3654b5
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

{"id":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","subject":"Project kickoff","status":"open","region":"us","participants":["qa-e7033ec27b5f","qa-8806f4850d08"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:03.980739863Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages
correlation: qa-09090ff0-66ca-4adf-ac22-fa7f6662c540

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09090ff0-66ca-4adf-ac22-fa7f6662c540
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-09090ff0-66ca-4adf-ac22-fa7f6662c540
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

{"id":"msg_b40f8db2-6204-41bc-b551-be52e39744d6","conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","sender":"qa-8806f4850d08","body":"Sure, now works","createdAt":"2026-10-30T08:46:04.243375209Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages
correlation: qa-159b4d36-7950-4a00-8faa-d6578b798e6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-159b4d36-7950-4a00-8faa-d6578b798e6e
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-159b4d36-7950-4a00-8faa-d6578b798e6e
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

{"id":"msg_e5ae1498-b886-47b1-98ca-2cb501c17f1f","conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","sender":"qa-8806f4850d08","body":"Calling you","createdAt":"2026-10-30T08:46:04.281924870Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049
correlation: qa-acb9ee1c-ebd5-4dd8-883a-78129c06e9a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acb9ee1c-ebd5-4dd8-883a-78129c06e9a0
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-acb9ee1c-ebd5-4dd8-883a-78129c06e9a0
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

{"id":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","subject":"Project kickoff","status":"open","region":"us","participants":["qa-e7033ec27b5f","qa-8806f4850d08"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-30T08:46:03.980739863Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages
correlation: qa-6755e153-caf7-40e8-8151-dba77398deae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6755e153-caf7-40e8-8151-dba77398deae
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6755e153-caf7-40e8-8151-dba77398deae
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

{"items":[{"id":"msg_28103e5c-c210-484c-817f-e8da76357ec1","conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","sender":"qa-e7033ec27b5f","body":"Hi Ben, got a minute?","createdAt":"2026-10-30T08:46:03.980774989Z"},{"id":"msg_b40f8db2-6204-41bc-b551-be52e39744d6","conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","sender":"qa-8806f4850d08","body":"Sure, now works","createdAt":"2026-10-30T08:46:04.243375209Z"},{"id":"msg_e5ae1498-b886-47b1-98ca-2cb501c17f1f","conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","sender":"qa-8806f4850d08","body":"Calling you","createdAt":"2026-10-30T08:46:04.281924870Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-d4210518-910c-4623-88d7-e93f5feba260

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4210518-910c-4623-88d7-e93f5feba260
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4210518-910c-4623-88d7-e93f5feba260
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

{"balance":4,"currency":"credits","accountId":"acc_9ccea60d-1e55-4a76-acc9-ea85bbccae03"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-9ad2a76c-4013-4dc4-9740-feb8dc669b1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ad2a76c-4013-4dc4-9740-feb8dc669b1f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ad2a76c-4013-4dc4-9740-feb8dc669b1f
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

{"balance":3,"currency":"credits","accountId":"acc_5cc5f1ff-76a8-481c-97db-f526256ea025"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-8fc5160d-0521-46a3-b025-b0eb4617ed56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fc5160d-0521-46a3-b025-b0eb4617ed56
Content-Type: application/json

--- request body ---
{"handle":"qa-9f890451c044","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fc5160d-0521-46a3-b025-b0eb4617ed56
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e22cf89-e04f-46c8-8f67-54ed7f80c953"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049
correlation: qa-4fdcf06c-5c39-4a1d-b708-4443f933217f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fdcf06c-5c39-4a1d-b708-4443f933217f
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fdcf06c-5c39-4a1d-b708-4443f933217f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","correlationId":"qa-4fdcf06c-5c39-4a1d-b708-4443f933217f"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages
correlation: qa-dfe1bf81-db6d-4d4b-926c-8ddf7ce53864

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfe1bf81-db6d-4d4b-926c-8ddf7ce53864
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfe1bf81-db6d-4d4b-926c-8ddf7ce53864
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages","correlationId":"qa-dfe1bf81-db6d-4d4b-926c-8ddf7ce53864"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages
correlation: qa-a59f023a-7299-4956-a412-30b256c08c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a59f023a-7299-4956-a412-30b256c08c83
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a59f023a-7299-4956-a412-30b256c08c83
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages","correlationId":"qa-a59f023a-7299-4956-a412-30b256c08c83"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-44a37bac-5eca-41b1-aee1-c71aa8feffa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44a37bac-5eca-41b1-aee1-c71aa8feffa1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-44a37bac-5eca-41b1-aee1-c71aa8feffa1
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
correlation: qa-f0f39f52-c608-4f90-93c2-988418fcf100

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0f39f52-c608-4f90-93c2-988418fcf100
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0f39f52-c608-4f90-93c2-988418fcf100
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

{"balance":5,"currency":"credits","accountId":"acc_6e22cf89-e04f-46c8-8f67-54ed7f80c953"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/close
correlation: qa-b372c19e-99e3-4784-9179-c3f90aae03d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b372c19e-99e3-4784-9179-c3f90aae03d0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b372c19e-99e3-4784-9179-c3f90aae03d0
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

{"id":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-e7033ec27b5f","qa-8806f4850d08"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-30T08:46:03.980739863Z","closedAt":"2026-10-30T08:46:04.812208964Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/close
correlation: qa-0f432a96-9948-4cc3-8472-47ed7e2167a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f432a96-9948-4cc3-8472-47ed7e2167a8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f432a96-9948-4cc3-8472-47ed7e2167a8
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

{"id":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-e7033ec27b5f","qa-8806f4850d08"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-30T08:46:03.980739863Z","closedAt":"2026-10-30T08:46:04.812208964Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages
correlation: qa-9196741d-1920-4df7-86fa-5ae43f3e2059

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9196741d-1920-4df7-86fa-5ae43f3e2059
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9196741d-1920-4df7-86fa-5ae43f3e2059
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

{"items":[{"id":"msg_28103e5c-c210-484c-817f-e8da76357ec1","conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","sender":"qa-e7033ec27b5f","body":"Hi Ben, got a minute?","createdAt":"2026-10-30T08:46:03.980774989Z"},{"id":"msg_b40f8db2-6204-41bc-b551-be52e39744d6","conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","sender":"qa-8806f4850d08","body":"Sure, now works","createdAt":"2026-10-30T08:46:04.243375209Z"},{"id":"msg_e5ae1498-b886-47b1-98ca-2cb501c17f1f","conversationId":"cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049","sender":"qa-8806f4850d08","body":"Calling you","createdAt":"2026-10-30T08:46:04.281924870Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages
correlation: qa-abead940-6b00-4271-91ad-89ee45036de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abead940-6b00-4271-91ad-89ee45036de8
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-abead940-6b00-4271-91ad-89ee45036de8
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_1dd0ffbb-a33f-4bc6-8c74-03e6e0fd8049/messages","correlationId":"qa-abead940-6b00-4271-91ad-89ee45036de8"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-432147a0-5d67-4b20-929f-55ce2139c28b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-432147a0-5d67-4b20-929f-55ce2139c28b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-432147a0-5d67-4b20-929f-55ce2139c28b
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

{"balance":3,"currency":"credits","accountId":"acc_5cc5f1ff-76a8-481c-97db-f526256ea025"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff3dd0aa-a240-4078-bfce-27bb2977d93e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff3dd0aa-a240-4078-bfce-27bb2977d93e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff3dd0aa-a240-4078-bfce-27bb2977d93e
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
correlation: qa-887cbae1-19dc-43e5-9ac5-4fee19ce8558

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-887cbae1-19dc-43e5-9ac5-4fee19ce8558
Content-Type: application/json

--- request body ---
{"handle":"qa-9f890451c044","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-887cbae1-19dc-43e5-9ac5-4fee19ce8558
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-887cbae1-19dc-43e5-9ac5-4fee19ce8558"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e3ba8ee-baa6-412d-9be3-30df8f993d0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e3ba8ee-baa6-412d-9be3-30df8f993d0f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e3ba8ee-baa6-412d-9be3-30df8f993d0f
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
correlation: qa-2ad96f1c-4fc9-4cbe-94a9-d1c010cf54e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ad96f1c-4fc9-4cbe-94a9-d1c010cf54e1
Content-Type: application/json

--- request body ---
{"handle":"qa-8806f4850d08","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ad96f1c-4fc9-4cbe-94a9-d1c010cf54e1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ad96f1c-4fc9-4cbe-94a9-d1c010cf54e1"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a76919d-1b93-40b8-8b88-c745d08afa0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a76919d-1b93-40b8-8b88-c745d08afa0d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a76919d-1b93-40b8-8b88-c745d08afa0d
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
correlation: qa-21d6c7cf-db84-4b4e-9913-9811da7251cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21d6c7cf-db84-4b4e-9913-9811da7251cc
Content-Type: application/json

--- request body ---
{"handle":"qa-e7033ec27b5f","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21d6c7cf-db84-4b4e-9913-9811da7251cc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-21d6c7cf-db84-4b4e-9913-9811da7251cc"}
```
