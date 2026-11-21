# Transcript: A closed conversation refuses new messages with 409

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#closedConversationRefusesMessages` |
| Features | FEAT-CONV-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 397 | `qa-4d626a57-0408-4e95-a46a-9b8fa0e75d48` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-4281d3b6-57b0-481c-b16d-4742762ea61b` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-f11aed3c-e3c5-48af-88f3-339c0edc337e` |
| 4 | `POST /v1/conversations` | 201 | 57 | `qa-bcce6f99-160a-473e-a03d-4a463fb95b6a` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 35 | `qa-75af27d5-6db5-4e6c-b7f6-6be5894d7137` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-e775c409-d6cc-4bcf-a6cf-db647ea52436` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 15 | `qa-4810e253-4ec5-43f2-a5f0-ec6b966a3149` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-14b801e8-7c72-4a23-a682-57e929d1a017` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-12c01519-489f-48d4-af58-e7fc46429c52` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-05aac8b9-67e9-4bf3-9f31-0da754414104` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-aa168c2d-0ef3-4d07-bb0f-3373e4c4c2a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4d626a57-0408-4e95-a46a-9b8fa0e75d48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d626a57-0408-4e95-a46a-9b8fa0e75d48
Content-Type: application/json

--- request body ---
{"handle":"qa-2dd3439e11e6","displayName":"QA 2dd3439e11e6","password":"****","region":"eu"}

--- response: 201 in 397 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d626a57-0408-4e95-a46a-9b8fa0e75d48
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
Location: /v1/accounts/qa-2dd3439e11e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_73f2e153-284c-4c3c-909e-49840c8fe3bb","handle":"qa-2dd3439e11e6","displayName":"QA 2dd3439e11e6","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.195863822Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4281d3b6-57b0-481c-b16d-4742762ea61b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4281d3b6-57b0-481c-b16d-4742762ea61b
Content-Type: application/json

--- request body ---
{"handle":"qa-8a974be67ed6","displayName":"QA 8a974be67ed6","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4281d3b6-57b0-481c-b16d-4742762ea61b
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
Location: /v1/accounts/qa-8a974be67ed6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fb3cdd3b-5c56-46dc-a71e-c42c16bffa6d","handle":"qa-8a974be67ed6","displayName":"QA 8a974be67ed6","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.708873608Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f11aed3c-e3c5-48af-88f3-339c0edc337e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f11aed3c-e3c5-48af-88f3-339c0edc337e
Content-Type: application/json

--- request body ---
{"handle":"qa-2dd3439e11e6","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f11aed3c-e3c5-48af-88f3-339c0edc337e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_73f2e153-284c-4c3c-909e-49840c8fe3bb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bcce6f99-160a-473e-a03d-4a463fb95b6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcce6f99-160a-473e-a03d-4a463fb95b6a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8a974be67ed6","subject":"Quick question","message":"Hi"}

--- response: 201 in 57 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcce6f99-160a-473e-a03d-4a463fb95b6a
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
Location: /v1/conversations/cnv_53383664-94a4-47ee-9bbc-2a0309d7fa9a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53383664-94a4-47ee-9bbc-2a0309d7fa9a","subject":"Quick question","status":"open","region":"eu","participants":["qa-2dd3439e11e6","qa-8a974be67ed6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:35.860751311Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_53383664-94a4-47ee-9bbc-2a0309d7fa9a/close
correlation: qa-75af27d5-6db5-4e6c-b7f6-6be5894d7137

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75af27d5-6db5-4e6c-b7f6-6be5894d7137
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-75af27d5-6db5-4e6c-b7f6-6be5894d7137
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
Content-Length: 283

{"id":"cnv_53383664-94a4-47ee-9bbc-2a0309d7fa9a","subject":"Quick question","status":"closed","region":"eu","participants":["qa-2dd3439e11e6","qa-8a974be67ed6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:35.860751311Z","closedAt":"2026-11-12T09:56:35.964548155Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e775c409-d6cc-4bcf-a6cf-db647ea52436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e775c409-d6cc-4bcf-a6cf-db647ea52436
Content-Type: application/json

--- request body ---
{"handle":"qa-8a974be67ed6","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e775c409-d6cc-4bcf-a6cf-db647ea52436
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb3cdd3b-5c56-46dc-a71e-c42c16bffa6d"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_53383664-94a4-47ee-9bbc-2a0309d7fa9a/messages
correlation: qa-4810e253-4ec5-43f2-a5f0-ec6b966a3149

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4810e253-4ec5-43f2-a5f0-ec6b966a3149
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4810e253-4ec5-43f2-a5f0-ec6b966a3149
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
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_53383664-94a4-47ee-9bbc-2a0309d7fa9a/messages","correlationId":"qa-4810e253-4ec5-43f2-a5f0-ec6b966a3149"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-14b801e8-7c72-4a23-a682-57e929d1a017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14b801e8-7c72-4a23-a682-57e929d1a017
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-14b801e8-7c72-4a23-a682-57e929d1a017
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-12c01519-489f-48d4-af58-e7fc46429c52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12c01519-489f-48d4-af58-e7fc46429c52
Content-Type: application/json

--- request body ---
{"handle":"qa-8a974be67ed6","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12c01519-489f-48d4-af58-e7fc46429c52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12c01519-489f-48d4-af58-e7fc46429c52"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05aac8b9-67e9-4bf3-9f31-0da754414104

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05aac8b9-67e9-4bf3-9f31-0da754414104
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05aac8b9-67e9-4bf3-9f31-0da754414104
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-aa168c2d-0ef3-4d07-bb0f-3373e4c4c2a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa168c2d-0ef3-4d07-bb0f-3373e4c4c2a5
Content-Type: application/json

--- request body ---
{"handle":"qa-2dd3439e11e6","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa168c2d-0ef3-4d07-bb0f-3373e4c4c2a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa168c2d-0ef3-4d07-bb0f-3373e4c4c2a5"}
```
