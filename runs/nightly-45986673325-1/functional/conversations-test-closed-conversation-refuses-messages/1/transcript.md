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
| 1 | `POST /v1/accounts` | 201 | 257 | `qa-8f137185-3599-4fff-983c-f1a79e8329d1` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-d0ce030b-fdaf-48bb-97f3-08b921de40cc` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-c070ecc4-4d13-48f4-9840-b8382a722efa` |
| 4 | `POST /v1/conversations` | 201 | 37 | `qa-785cefec-4721-4a1a-b38e-5afe2fff1bff` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 30 | `qa-4736d631-0bce-4384-bcbb-72e77dec0b0b` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-79b5cb55-b5d1-4656-921a-c6850342244e` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 31 | `qa-626f4bd8-ff68-40be-a794-91364c5e3d60` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-88e02f7a-9ded-4cd9-9138-0c92a835f33b` |
| 9 | `POST /v1/auth/token` | 401 | 4 | `qa-2370fad5-e84a-4522-8259-fbb4aa0fc95c` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-78b155fa-45a8-412a-81f6-3a0460c6cc77` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-98883368-ba11-4bfb-a740-9826249aafdb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f137185-3599-4fff-983c-f1a79e8329d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f137185-3599-4fff-983c-f1a79e8329d1
Content-Type: application/json

--- request body ---
{"handle":"qa-45424edf992b","displayName":"QA 45424edf992b","password":"****","region":"eu"}

--- response: 201 in 257 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f137185-3599-4fff-983c-f1a79e8329d1
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
Location: /v1/accounts/qa-45424edf992b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e13caf74-b8d0-4c86-9b85-6e060eb6b3fb","handle":"qa-45424edf992b","displayName":"QA 45424edf992b","region":"eu","role":"user","createdAt":"2026-11-27T10:59:46.159364623Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d0ce030b-fdaf-48bb-97f3-08b921de40cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0ce030b-fdaf-48bb-97f3-08b921de40cc
Content-Type: application/json

--- request body ---
{"handle":"qa-f7b6d6050b3e","displayName":"QA f7b6d6050b3e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0ce030b-fdaf-48bb-97f3-08b921de40cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-f7b6d6050b3e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b31c66a-aee0-454f-8b1a-adf466a3a7e3","handle":"qa-f7b6d6050b3e","displayName":"QA f7b6d6050b3e","region":"eu","role":"user","createdAt":"2026-11-27T10:59:46.441397390Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c070ecc4-4d13-48f4-9840-b8382a722efa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c070ecc4-4d13-48f4-9840-b8382a722efa
Content-Type: application/json

--- request body ---
{"handle":"qa-45424edf992b","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c070ecc4-4d13-48f4-9840-b8382a722efa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e13caf74-b8d0-4c86-9b85-6e060eb6b3fb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-785cefec-4721-4a1a-b38e-5afe2fff1bff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-785cefec-4721-4a1a-b38e-5afe2fff1bff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f7b6d6050b3e","subject":"Quick question","message":"Hi"}

--- response: 201 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-785cefec-4721-4a1a-b38e-5afe2fff1bff
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
Location: /v1/conversations/cnv_19c88748-f3c3-478b-a4d2-48ead4924722
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_19c88748-f3c3-478b-a4d2-48ead4924722","subject":"Quick question","status":"open","region":"eu","participants":["qa-45424edf992b","qa-f7b6d6050b3e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:46.522615968Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_19c88748-f3c3-478b-a4d2-48ead4924722/close
correlation: qa-4736d631-0bce-4384-bcbb-72e77dec0b0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4736d631-0bce-4384-bcbb-72e77dec0b0b
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-4736d631-0bce-4384-bcbb-72e77dec0b0b
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

{"id":"cnv_19c88748-f3c3-478b-a4d2-48ead4924722","subject":"Quick question","status":"closed","region":"eu","participants":["qa-45424edf992b","qa-f7b6d6050b3e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:46.522615968Z","closedAt":"2026-11-27T10:59:46.629780963Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-79b5cb55-b5d1-4656-921a-c6850342244e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79b5cb55-b5d1-4656-921a-c6850342244e
Content-Type: application/json

--- request body ---
{"handle":"qa-f7b6d6050b3e","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-79b5cb55-b5d1-4656-921a-c6850342244e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b31c66a-aee0-454f-8b1a-adf466a3a7e3"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_19c88748-f3c3-478b-a4d2-48ead4924722/messages
correlation: qa-626f4bd8-ff68-40be-a794-91364c5e3d60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-626f4bd8-ff68-40be-a794-91364c5e3d60
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-626f4bd8-ff68-40be-a794-91364c5e3d60
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_19c88748-f3c3-478b-a4d2-48ead4924722/messages","correlationId":"qa-626f4bd8-ff68-40be-a794-91364c5e3d60"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88e02f7a-9ded-4cd9-9138-0c92a835f33b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88e02f7a-9ded-4cd9-9138-0c92a835f33b
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88e02f7a-9ded-4cd9-9138-0c92a835f33b
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
correlation: qa-2370fad5-e84a-4522-8259-fbb4aa0fc95c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2370fad5-e84a-4522-8259-fbb4aa0fc95c
Content-Type: application/json

--- request body ---
{"handle":"qa-f7b6d6050b3e","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2370fad5-e84a-4522-8259-fbb4aa0fc95c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2370fad5-e84a-4522-8259-fbb4aa0fc95c"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78b155fa-45a8-412a-81f6-3a0460c6cc77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78b155fa-45a8-412a-81f6-3a0460c6cc77
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78b155fa-45a8-412a-81f6-3a0460c6cc77
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
correlation: qa-98883368-ba11-4bfb-a740-9826249aafdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98883368-ba11-4bfb-a740-9826249aafdb
Content-Type: application/json

--- request body ---
{"handle":"qa-45424edf992b","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98883368-ba11-4bfb-a740-9826249aafdb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98883368-ba11-4bfb-a740-9826249aafdb"}
```
