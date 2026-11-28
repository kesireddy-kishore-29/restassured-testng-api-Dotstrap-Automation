# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 316 | `qa-c6e1a846-7840-4d49-b26b-91efeb3edea5` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-c34988e2-e283-4f59-8c58-49f912f9e4ec` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-48041aa8-12d2-478c-a00a-86b7746aa90b` |
| 4 | `POST /v1/conversations` | 201 | 52 | `qa-abc447a8-e3dc-4d7a-b0a3-4cd592f84f85` |
| 5 | `POST /v1/auth/token` | 200 | 16 | `qa-7a5a6f58-42a8-4034-8bb5-f5e3e4293b67` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 29 | `qa-e72a1371-64ab-43de-8cfd-1f93616a74a1` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 14 | `qa-cfb522a6-92d3-40c1-a57d-203a9e0fa3e9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-1f4bbb14-dc43-4dcb-bc61-38f933374d3c` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-90151d43-b37a-41b3-827d-42ebf7f29043` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-11cc1dbd-97b5-4f8e-ac40-e9362d7d4151` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-c4840e4c-7fe9-4500-ada9-ff036ba27f00` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c6e1a846-7840-4d49-b26b-91efeb3edea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6e1a846-7840-4d49-b26b-91efeb3edea5
Content-Type: application/json

--- request body ---
{"handle":"qa-2bb0ead82dbf","displayName":"QA 2bb0ead82dbf","password":"****","region":"eu"}

--- response: 201 in 316 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6e1a846-7840-4d49-b26b-91efeb3edea5
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
Location: /v1/accounts/qa-2bb0ead82dbf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_641b395b-b403-499b-850e-e97ebd877e5d","handle":"qa-2bb0ead82dbf","displayName":"QA 2bb0ead82dbf","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.431866853Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c34988e2-e283-4f59-8c58-49f912f9e4ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c34988e2-e283-4f59-8c58-49f912f9e4ec
Content-Type: application/json

--- request body ---
{"handle":"qa-30ccdecc4fc9","displayName":"QA 30ccdecc4fc9","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c34988e2-e283-4f59-8c58-49f912f9e4ec
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
Location: /v1/accounts/qa-30ccdecc4fc9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c1d7e54-12bd-4b5f-aaf2-1715396e4ef0","handle":"qa-30ccdecc4fc9","displayName":"QA 30ccdecc4fc9","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.734252961Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-48041aa8-12d2-478c-a00a-86b7746aa90b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48041aa8-12d2-478c-a00a-86b7746aa90b
Content-Type: application/json

--- request body ---
{"handle":"qa-2bb0ead82dbf","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-48041aa8-12d2-478c-a00a-86b7746aa90b
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_641b395b-b403-499b-850e-e97ebd877e5d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-abc447a8-e3dc-4d7a-b0a3-4cd592f84f85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abc447a8-e3dc-4d7a-b0a3-4cd592f84f85
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-30ccdecc4fc9","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 52 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-abc447a8-e3dc-4d7a-b0a3-4cd592f84f85
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
Location: /v1/conversations/cnv_1f0cc1ae-8605-4ac4-a392-1a3118e4fe1d
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_1f0cc1ae-8605-4ac4-a392-1a3118e4fe1d","subject":"Lunch?","status":"open","region":"eu","participants":["qa-2bb0ead82dbf","qa-30ccdecc4fc9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:04.872207823Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7a5a6f58-42a8-4034-8bb5-f5e3e4293b67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a5a6f58-42a8-4034-8bb5-f5e3e4293b67
Content-Type: application/json

--- request body ---
{"handle":"qa-30ccdecc4fc9","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a5a6f58-42a8-4034-8bb5-f5e3e4293b67
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c1d7e54-12bd-4b5f-aaf2-1715396e4ef0"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_1f0cc1ae-8605-4ac4-a392-1a3118e4fe1d/messages
correlation: qa-e72a1371-64ab-43de-8cfd-1f93616a74a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e72a1371-64ab-43de-8cfd-1f93616a74a1
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e72a1371-64ab-43de-8cfd-1f93616a74a1
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
Content-Length: 203

{"id":"msg_7be92461-b51a-4a09-81cd-4bb3e34bf132","conversationId":"cnv_1f0cc1ae-8605-4ac4-a392-1a3118e4fe1d","sender":"qa-30ccdecc4fc9","body":"Friday works","createdAt":"2026-11-24T12:38:04.984976595Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_1f0cc1ae-8605-4ac4-a392-1a3118e4fe1d/messages
correlation: qa-cfb522a6-92d3-40c1-a57d-203a9e0fa3e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfb522a6-92d3-40c1-a57d-203a9e0fa3e9
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfb522a6-92d3-40c1-a57d-203a9e0fa3e9
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
Content-Length: 432

{"items":[{"id":"msg_51c72832-8172-4fcd-bc5d-cadd1c91f925","conversationId":"cnv_1f0cc1ae-8605-4ac4-a392-1a3118e4fe1d","sender":"qa-2bb0ead82dbf","body":"Free on Friday?","createdAt":"2026-11-24T12:38:04.872424264Z"},{"id":"msg_7be92461-b51a-4a09-81cd-4bb3e34bf132","conversationId":"cnv_1f0cc1ae-8605-4ac4-a392-1a3118e4fe1d","sender":"qa-30ccdecc4fc9","body":"Friday works","createdAt":"2026-11-24T12:38:04.984976595Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f4bbb14-dc43-4dcb-bc61-38f933374d3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f4bbb14-dc43-4dcb-bc61-38f933374d3c
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f4bbb14-dc43-4dcb-bc61-38f933374d3c
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
correlation: qa-90151d43-b37a-41b3-827d-42ebf7f29043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90151d43-b37a-41b3-827d-42ebf7f29043
Content-Type: application/json

--- request body ---
{"handle":"qa-30ccdecc4fc9","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90151d43-b37a-41b3-827d-42ebf7f29043
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90151d43-b37a-41b3-827d-42ebf7f29043"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11cc1dbd-97b5-4f8e-ac40-e9362d7d4151

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11cc1dbd-97b5-4f8e-ac40-e9362d7d4151
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11cc1dbd-97b5-4f8e-ac40-e9362d7d4151
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-c4840e4c-7fe9-4500-ada9-ff036ba27f00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4840e4c-7fe9-4500-ada9-ff036ba27f00
Content-Type: application/json

--- request body ---
{"handle":"qa-2bb0ead82dbf","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4840e4c-7fe9-4500-ada9-ff036ba27f00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c4840e4c-7fe9-4500-ada9-ff036ba27f00"}
```
