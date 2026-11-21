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
| 1 | `POST /v1/accounts` | 201 | 430 | `qa-8824977c-fc1a-408c-85b5-50a26d523eb2` |
| 2 | `POST /v1/accounts` | 201 | 88 | `qa-60e683c6-f2c0-4a43-ac3f-df10c8802481` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-74f4f844-f7b5-4522-84ca-66370170b2d7` |
| 4 | `POST /v1/conversations` | 201 | 62 | `qa-d9652e61-5c69-4278-a9b6-47a1a9bf40e8` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 55 | `qa-402daec0-77a6-477b-b02b-9f4817882c1d` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-2391fada-661a-4995-8a78-9c1a05d16d59` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 23 | `qa-c27a6dda-2d61-4163-aba3-8bb96df6e5db` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ffadcffd-09d9-4120-b238-bfa2006a6f79` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-52da1c41-17fd-42fd-9b3c-dc06fdfeff69` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ca5ceb07-e311-4326-a0a2-c183b176f5b9` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-ace31308-1d2b-4143-a4d7-4da9dffeac30` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8824977c-fc1a-408c-85b5-50a26d523eb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8824977c-fc1a-408c-85b5-50a26d523eb2
Content-Type: application/json

--- request body ---
{"handle":"qa-313f3eaba11d","displayName":"QA 313f3eaba11d","password":"****","region":"eu"}

--- response: 201 in 430 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8824977c-fc1a-408c-85b5-50a26d523eb2
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
Location: /v1/accounts/qa-313f3eaba11d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ac18929-369d-456f-89ef-514a75020d75","handle":"qa-313f3eaba11d","displayName":"QA 313f3eaba11d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.245188689Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-60e683c6-f2c0-4a43-ac3f-df10c8802481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60e683c6-f2c0-4a43-ac3f-df10c8802481
Content-Type: application/json

--- request body ---
{"handle":"qa-e772c567d0e2","displayName":"QA e772c567d0e2","password":"****","region":"eu"}

--- response: 201 in 88 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-60e683c6-f2c0-4a43-ac3f-df10c8802481
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
Location: /v1/accounts/qa-e772c567d0e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af4531e7-4d93-4fcd-8ed2-0a55f723c1de","handle":"qa-e772c567d0e2","displayName":"QA e772c567d0e2","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.774279912Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-74f4f844-f7b5-4522-84ca-66370170b2d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74f4f844-f7b5-4522-84ca-66370170b2d7
Content-Type: application/json

--- request body ---
{"handle":"qa-313f3eaba11d","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-74f4f844-f7b5-4522-84ca-66370170b2d7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ac18929-369d-456f-89ef-514a75020d75"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d9652e61-5c69-4278-a9b6-47a1a9bf40e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9652e61-5c69-4278-a9b6-47a1a9bf40e8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e772c567d0e2","subject":"Quick question","message":"Hi"}

--- response: 201 in 62 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9652e61-5c69-4278-a9b6-47a1a9bf40e8
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
Location: /v1/conversations/cnv_203ce371-b27d-43e0-9c56-b8657f750d89
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_203ce371-b27d-43e0-9c56-b8657f750d89","subject":"Quick question","status":"open","region":"eu","participants":["qa-313f3eaba11d","qa-e772c567d0e2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.926497814Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_203ce371-b27d-43e0-9c56-b8657f750d89/close
correlation: qa-402daec0-77a6-477b-b02b-9f4817882c1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-402daec0-77a6-477b-b02b-9f4817882c1d
Content-Type: application/json

--- response: 200 in 55 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-402daec0-77a6-477b-b02b-9f4817882c1d
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

{"id":"cnv_203ce371-b27d-43e0-9c56-b8657f750d89","subject":"Quick question","status":"closed","region":"eu","participants":["qa-313f3eaba11d","qa-e772c567d0e2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.926497814Z","closedAt":"2026-11-20T10:10:01.081960388Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2391fada-661a-4995-8a78-9c1a05d16d59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2391fada-661a-4995-8a78-9c1a05d16d59
Content-Type: application/json

--- request body ---
{"handle":"qa-e772c567d0e2","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2391fada-661a-4995-8a78-9c1a05d16d59
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af4531e7-4d93-4fcd-8ed2-0a55f723c1de"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_203ce371-b27d-43e0-9c56-b8657f750d89/messages
correlation: qa-c27a6dda-2d61-4163-aba3-8bb96df6e5db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c27a6dda-2d61-4163-aba3-8bb96df6e5db
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c27a6dda-2d61-4163-aba3-8bb96df6e5db
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_203ce371-b27d-43e0-9c56-b8657f750d89/messages","correlationId":"qa-c27a6dda-2d61-4163-aba3-8bb96df6e5db"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ffadcffd-09d9-4120-b238-bfa2006a6f79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffadcffd-09d9-4120-b238-bfa2006a6f79
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ffadcffd-09d9-4120-b238-bfa2006a6f79
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
correlation: qa-52da1c41-17fd-42fd-9b3c-dc06fdfeff69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52da1c41-17fd-42fd-9b3c-dc06fdfeff69
Content-Type: application/json

--- request body ---
{"handle":"qa-e772c567d0e2","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52da1c41-17fd-42fd-9b3c-dc06fdfeff69
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52da1c41-17fd-42fd-9b3c-dc06fdfeff69"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca5ceb07-e311-4326-a0a2-c183b176f5b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca5ceb07-e311-4326-a0a2-c183b176f5b9
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca5ceb07-e311-4326-a0a2-c183b176f5b9
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
correlation: qa-ace31308-1d2b-4143-a4d7-4da9dffeac30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ace31308-1d2b-4143-a4d7-4da9dffeac30
Content-Type: application/json

--- request body ---
{"handle":"qa-313f3eaba11d","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ace31308-1d2b-4143-a4d7-4da9dffeac30
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ace31308-1d2b-4143-a4d7-4da9dffeac30"}
```
