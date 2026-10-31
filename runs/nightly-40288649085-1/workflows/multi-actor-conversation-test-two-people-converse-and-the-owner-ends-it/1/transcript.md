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
| 1 | `POST /v1/accounts` | 201 | 467 | `qa-1eebccc5-5322-40b8-becc-d6ed41991b57` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-ef110bda-de3d-4176-9f58-7a666eb0a473` |
| 3 | `POST /v1/accounts` | 201 | 26 | `qa-e77c11b8-ab2d-4c7b-a2e9-bf0e8f24e96d` |
| 4 | `POST /v1/auth/token` | 200 | 39 | `qa-32985cb0-fc20-44b9-a24a-0a5afb0d90d7` |
| 5 | `POST /v1/conversations` | 201 | 39 | `qa-709277e8-4c97-4a7e-8254-808534d351e3` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-37257a0c-2ba8-4255-a006-da6591ab7a51` |
| 7 | `GET /v1/conversations` | 200 | 31 | `qa-16cd9b46-46ad-4096-9b15-70c5814eb235` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 18 | `qa-a015c3f3-eac7-4dcc-b19a-b33f69e97067` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-3b7ddbd6-aab1-4d84-8cd2-2fda6d5c7ed5` |
| 10 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-1ce0f77a-8b21-49f8-809f-2140baf046c7` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-05b267d6-1872-42f8-8538-23fd1bcc99f2` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-d534c437-a526-4abb-9d09-7ff60ae51154` |
| 13 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-3ee0d3a8-61bd-44c2-9fcd-15a615f8bc6b` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 10 | `qa-bc8d9207-8481-4b22-8379-2c5dedc11098` |
| 15 | `GET /v1/credits/balance` | 200 | 19 | `qa-d68c339d-bee7-4f34-8b89-b64174c37b40` |
| 16 | `GET /v1/credits/balance` | 200 | 26 | `qa-382ca90d-7fc9-4639-ba6b-7447de699d86` |
| 17 | `POST /v1/auth/token` | 200 | 10 | `qa-8761b5f7-6acd-46cd-8ee8-4a22ca68e4ff` |
| 18 | `GET /v1/conversations/{id}` | 403 | 6 | `qa-5aff7b49-4ff7-4cbc-a0dc-cdf859a39f56` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 9 | `qa-64a92326-745a-4905-8586-97a48afb2328` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-6976d534-47f9-42e6-8b57-27c491352314` |
| 21 | `GET /v1/conversations` | 200 | 8 | `qa-022b94d2-0213-4f0c-8c47-68852e39f763` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-7a472edd-de38-4604-9041-50d80af21f1c` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-85c28cbe-51dd-4e69-bc64-59e35af253bb` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-e3c5f7f4-f20e-4a2b-b286-ea074362848a` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-08928162-33b6-4117-bdcc-bb85fd721e5f` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 6 | `qa-6e1204f5-4591-44c4-b3ab-f0b472c53d0e` |
| 27 | `GET /v1/credits/balance` | 200 | 8 | `qa-96d34157-ae50-45d2-9930-2caff908e912` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-eca27414-0f91-4bce-bb01-8653199c55a1` |
| 29 | `POST /v1/auth/token` | 401 | 7 | `qa-c97cebdd-3243-46e4-9074-39830f07e3f7` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-df2da7d2-8d24-46b3-bcf1-5114b5e90c61` |
| 31 | `POST /v1/auth/token` | 401 | 4 | `qa-8c34bd19-0f55-4211-aabf-643318ecc995` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-d54a6de5-2e8b-451d-9367-8ebda3c839df` |
| 33 | `POST /v1/auth/token` | 401 | 5 | `qa-5a3822ab-6547-46ee-8cf2-fba91dad1af7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1eebccc5-5322-40b8-becc-d6ed41991b57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eebccc5-5322-40b8-becc-d6ed41991b57
Content-Type: application/json

--- request body ---
{"handle":"qa-df4133684482","displayName":"QA df4133684482","password":"****","region":"eu"}

--- response: 201 in 467 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1eebccc5-5322-40b8-becc-d6ed41991b57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-df4133684482
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bed6c426-0d67-4eda-b142-13ee100eab01","handle":"qa-df4133684482","displayName":"QA df4133684482","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.455422911Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ef110bda-de3d-4176-9f58-7a666eb0a473

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef110bda-de3d-4176-9f58-7a666eb0a473
Content-Type: application/json

--- request body ---
{"handle":"qa-177286a968ee","displayName":"QA 177286a968ee","password":"****","region":"us"}

--- response: 201 in 58 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef110bda-de3d-4176-9f58-7a666eb0a473
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
Location: /v1/accounts/qa-177286a968ee
X-Served-Region: us
Content-Length: 181

{"id":"acc_45b7e223-61e1-4b37-93e8-680ce531e219","handle":"qa-177286a968ee","displayName":"QA 177286a968ee","region":"us","role":"user","createdAt":"2026-10-26T07:54:47.870529670Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e77c11b8-ab2d-4c7b-a2e9-bf0e8f24e96d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e77c11b8-ab2d-4c7b-a2e9-bf0e8f24e96d
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2fdae0b082","displayName":"QA 6c2fdae0b082","password":"****","region":"in"}

--- response: 201 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e77c11b8-ab2d-4c7b-a2e9-bf0e8f24e96d
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
Location: /v1/accounts/qa-6c2fdae0b082
X-Served-Region: in
Content-Length: 181

{"id":"acc_a5fcd753-11d5-47cb-984e-deb0daeb5972","handle":"qa-6c2fdae0b082","displayName":"QA 6c2fdae0b082","region":"in","role":"user","createdAt":"2026-10-26T07:54:47.963879539Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-32985cb0-fc20-44b9-a24a-0a5afb0d90d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32985cb0-fc20-44b9-a24a-0a5afb0d90d7
Content-Type: application/json

--- request body ---
{"handle":"qa-df4133684482","password":"****"}

--- response: 200 in 39 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-32985cb0-fc20-44b9-a24a-0a5afb0d90d7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bed6c426-0d67-4eda-b142-13ee100eab01"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-709277e8-4c97-4a7e-8254-808534d351e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-709277e8-4c97-4a7e-8254-808534d351e3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-177286a968ee","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 39 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-709277e8-4c97-4a7e-8254-808534d351e3
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
Location: /v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73
X-Data-Region: us
Content-Length: 238

{"id":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","subject":"Project kickoff","status":"open","region":"us","participants":["qa-df4133684482","qa-177286a968ee"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.104479321Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-37257a0c-2ba8-4255-a006-da6591ab7a51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37257a0c-2ba8-4255-a006-da6591ab7a51
Content-Type: application/json

--- request body ---
{"handle":"qa-177286a968ee","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-37257a0c-2ba8-4255-a006-da6591ab7a51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45b7e223-61e1-4b37-93e8-680ce531e219"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-16cd9b46-46ad-4096-9b15-70c5814eb235

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16cd9b46-46ad-4096-9b15-70c5814eb235
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-16cd9b46-46ad-4096-9b15-70c5814eb235
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

{"items":[{"id":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","subject":"Project kickoff","status":"open","region":"us","participants":["qa-df4133684482","qa-177286a968ee"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-26T07:54:48.104479321Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages
correlation: qa-a015c3f3-eac7-4dcc-b19a-b33f69e97067

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a015c3f3-eac7-4dcc-b19a-b33f69e97067
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a015c3f3-eac7-4dcc-b19a-b33f69e97067
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

{"items":[{"id":"msg_f2ebf74c-afd4-484a-9361-7ebe8f0eaa98","conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","sender":"qa-df4133684482","body":"Hi Ben, got a minute?","createdAt":"2026-10-26T07:54:48.104514777Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/read
correlation: qa-3b7ddbd6-aab1-4d84-8cd2-2fda6d5c7ed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b7ddbd6-aab1-4d84-8cd2-2fda6d5c7ed5
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b7ddbd6-aab1-4d84-8cd2-2fda6d5c7ed5
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

{"conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73
correlation: qa-1ce0f77a-8b21-49f8-809f-2140baf046c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ce0f77a-8b21-49f8-809f-2140baf046c7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ce0f77a-8b21-49f8-809f-2140baf046c7
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

{"id":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","subject":"Project kickoff","status":"open","region":"us","participants":["qa-df4133684482","qa-177286a968ee"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.104479321Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages
correlation: qa-05b267d6-1872-42f8-8538-23fd1bcc99f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05b267d6-1872-42f8-8538-23fd1bcc99f2
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-05b267d6-1872-42f8-8538-23fd1bcc99f2
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

{"id":"msg_baa6d11c-cd9b-4f10-8947-94e436d03327","conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","sender":"qa-177286a968ee","body":"Sure, now works","createdAt":"2026-10-26T07:54:48.569692728Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages
correlation: qa-d534c437-a526-4abb-9d09-7ff60ae51154

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d534c437-a526-4abb-9d09-7ff60ae51154
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d534c437-a526-4abb-9d09-7ff60ae51154
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

{"id":"msg_ba49847a-c4ec-4fb9-827d-3ca58c1efb0f","conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","sender":"qa-177286a968ee","body":"Calling you","createdAt":"2026-10-26T07:54:48.604126995Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73
correlation: qa-3ee0d3a8-61bd-44c2-9fcd-15a615f8bc6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ee0d3a8-61bd-44c2-9fcd-15a615f8bc6b
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ee0d3a8-61bd-44c2-9fcd-15a615f8bc6b
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

{"id":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","subject":"Project kickoff","status":"open","region":"us","participants":["qa-df4133684482","qa-177286a968ee"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-26T07:54:48.104479321Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages
correlation: qa-bc8d9207-8481-4b22-8379-2c5dedc11098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc8d9207-8481-4b22-8379-2c5dedc11098
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc8d9207-8481-4b22-8379-2c5dedc11098
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

{"items":[{"id":"msg_f2ebf74c-afd4-484a-9361-7ebe8f0eaa98","conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","sender":"qa-df4133684482","body":"Hi Ben, got a minute?","createdAt":"2026-10-26T07:54:48.104514777Z"},{"id":"msg_baa6d11c-cd9b-4f10-8947-94e436d03327","conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","sender":"qa-177286a968ee","body":"Sure, now works","createdAt":"2026-10-26T07:54:48.569692728Z"},{"id":"msg_ba49847a-c4ec-4fb9-827d-3ca58c1efb0f","conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","sender":"qa-177286a968ee","body":"Calling you","createdAt":"2026-10-26T07:54:48.604126995Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-d68c339d-bee7-4f34-8b89-b64174c37b40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d68c339d-bee7-4f34-8b89-b64174c37b40
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d68c339d-bee7-4f34-8b89-b64174c37b40
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

{"balance":4,"currency":"credits","accountId":"acc_bed6c426-0d67-4eda-b142-13ee100eab01"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-382ca90d-7fc9-4639-ba6b-7447de699d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-382ca90d-7fc9-4639-ba6b-7447de699d86
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-382ca90d-7fc9-4639-ba6b-7447de699d86
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

{"balance":3,"currency":"credits","accountId":"acc_45b7e223-61e1-4b37-93e8-680ce531e219"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-8761b5f7-6acd-46cd-8ee8-4a22ca68e4ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8761b5f7-6acd-46cd-8ee8-4a22ca68e4ff
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2fdae0b082","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-8761b5f7-6acd-46cd-8ee8-4a22ca68e4ff
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a5fcd753-11d5-47cb-984e-deb0daeb5972"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73
correlation: qa-5aff7b49-4ff7-4cbc-a0dc-cdf859a39f56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aff7b49-4ff7-4cbc-a0dc-cdf859a39f56
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5aff7b49-4ff7-4cbc-a0dc-cdf859a39f56
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","correlationId":"qa-5aff7b49-4ff7-4cbc-a0dc-cdf859a39f56"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages
correlation: qa-64a92326-745a-4905-8586-97a48afb2328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64a92326-745a-4905-8586-97a48afb2328
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64a92326-745a-4905-8586-97a48afb2328
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages","correlationId":"qa-64a92326-745a-4905-8586-97a48afb2328"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages
correlation: qa-6976d534-47f9-42e6-8b57-27c491352314

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6976d534-47f9-42e6-8b57-27c491352314
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6976d534-47f9-42e6-8b57-27c491352314
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages","correlationId":"qa-6976d534-47f9-42e6-8b57-27c491352314"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-022b94d2-0213-4f0c-8c47-68852e39f763

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-022b94d2-0213-4f0c-8c47-68852e39f763
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-022b94d2-0213-4f0c-8c47-68852e39f763
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
correlation: qa-7a472edd-de38-4604-9041-50d80af21f1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a472edd-de38-4604-9041-50d80af21f1c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a472edd-de38-4604-9041-50d80af21f1c
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

{"balance":5,"currency":"credits","accountId":"acc_a5fcd753-11d5-47cb-984e-deb0daeb5972"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/close
correlation: qa-85c28cbe-51dd-4e69-bc64-59e35af253bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85c28cbe-51dd-4e69-bc64-59e35af253bb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-85c28cbe-51dd-4e69-bc64-59e35af253bb
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

{"id":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-df4133684482","qa-177286a968ee"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-26T07:54:48.104479321Z","closedAt":"2026-10-26T07:54:49.587858608Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/close
correlation: qa-e3c5f7f4-f20e-4a2b-b286-ea074362848a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3c5f7f4-f20e-4a2b-b286-ea074362848a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3c5f7f4-f20e-4a2b-b286-ea074362848a
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

{"id":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-df4133684482","qa-177286a968ee"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-26T07:54:48.104479321Z","closedAt":"2026-10-26T07:54:49.587858608Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages
correlation: qa-08928162-33b6-4117-bdcc-bb85fd721e5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08928162-33b6-4117-bdcc-bb85fd721e5f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-08928162-33b6-4117-bdcc-bb85fd721e5f
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

{"items":[{"id":"msg_f2ebf74c-afd4-484a-9361-7ebe8f0eaa98","conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","sender":"qa-df4133684482","body":"Hi Ben, got a minute?","createdAt":"2026-10-26T07:54:48.104514777Z"},{"id":"msg_baa6d11c-cd9b-4f10-8947-94e436d03327","conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","sender":"qa-177286a968ee","body":"Sure, now works","createdAt":"2026-10-26T07:54:48.569692728Z"},{"id":"msg_ba49847a-c4ec-4fb9-827d-3ca58c1efb0f","conversationId":"cnv_64ab0606-1b55-4eab-99cc-6a862d18da73","sender":"qa-177286a968ee","body":"Calling you","createdAt":"2026-10-26T07:54:48.604126995Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages
correlation: qa-6e1204f5-4591-44c4-b3ab-f0b472c53d0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e1204f5-4591-44c4-b3ab-f0b472c53d0e
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e1204f5-4591-44c4-b3ab-f0b472c53d0e
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_64ab0606-1b55-4eab-99cc-6a862d18da73/messages","correlationId":"qa-6e1204f5-4591-44c4-b3ab-f0b472c53d0e"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-96d34157-ae50-45d2-9930-2caff908e912

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96d34157-ae50-45d2-9930-2caff908e912
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-96d34157-ae50-45d2-9930-2caff908e912
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

{"balance":3,"currency":"credits","accountId":"acc_45b7e223-61e1-4b37-93e8-680ce531e219"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eca27414-0f91-4bce-bb01-8653199c55a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eca27414-0f91-4bce-bb01-8653199c55a1
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eca27414-0f91-4bce-bb01-8653199c55a1
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
correlation: qa-c97cebdd-3243-46e4-9074-39830f07e3f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c97cebdd-3243-46e4-9074-39830f07e3f7
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2fdae0b082","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c97cebdd-3243-46e4-9074-39830f07e3f7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c97cebdd-3243-46e4-9074-39830f07e3f7"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-df2da7d2-8d24-46b3-bcf1-5114b5e90c61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df2da7d2-8d24-46b3-bcf1-5114b5e90c61
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-df2da7d2-8d24-46b3-bcf1-5114b5e90c61
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
correlation: qa-8c34bd19-0f55-4211-aabf-643318ecc995

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c34bd19-0f55-4211-aabf-643318ecc995
Content-Type: application/json

--- request body ---
{"handle":"qa-177286a968ee","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c34bd19-0f55-4211-aabf-643318ecc995
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c34bd19-0f55-4211-aabf-643318ecc995"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d54a6de5-2e8b-451d-9367-8ebda3c839df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d54a6de5-2e8b-451d-9367-8ebda3c839df
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d54a6de5-2e8b-451d-9367-8ebda3c839df
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
correlation: qa-5a3822ab-6547-46ee-8cf2-fba91dad1af7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a3822ab-6547-46ee-8cf2-fba91dad1af7
Content-Type: application/json

--- request body ---
{"handle":"qa-df4133684482","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a3822ab-6547-46ee-8cf2-fba91dad1af7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a3822ab-6547-46ee-8cf2-fba91dad1af7"}
```
