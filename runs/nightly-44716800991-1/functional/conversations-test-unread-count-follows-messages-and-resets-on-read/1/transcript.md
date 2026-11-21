# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 434 | `qa-60900f6e-7858-49bf-b840-f6a29dbd8741` |
| 2 | `POST /v1/accounts` | 201 | 92 | `qa-30ef3501-ad87-4ab8-a7d7-3fd6e6f85630` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-83cd0767-c9e4-4e70-bc20-f3c658423498` |
| 4 | `POST /v1/conversations` | 201 | 64 | `qa-1296ea2f-e94b-49ce-957f-d9a95654eb37` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 46 | `qa-46121e29-a2ca-4bbf-9922-c4e04352337b` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-1c8fb736-e338-40d4-a552-6f55d60ff01f` |
| 7 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-d4cf77d3-f479-41a8-aac1-ae7ca1877249` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 16 | `qa-8de251a8-0d25-4f96-a3b4-56ccdb41160f` |
| 9 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-25dca638-7ec4-4ddb-b115-af84986c73e8` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-08f1f0d2-7465-4603-b492-f3c4ce638cab` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-f4298bd1-a247-4103-bbe3-26580ae34e44` |
| 12 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2d8e2a8d-32db-4c01-b800-d14b5e8833f2` |
| 13 | `POST /v1/auth/token` | 401 | 7 | `qa-64506569-3f67-4e08-b709-4ed5b4136a13` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-60900f6e-7858-49bf-b840-f6a29dbd8741

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60900f6e-7858-49bf-b840-f6a29dbd8741
Content-Type: application/json

--- request body ---
{"handle":"qa-720d6ee0336b","displayName":"QA 720d6ee0336b","password":"****","region":"eu"}

--- response: 201 in 434 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-60900f6e-7858-49bf-b840-f6a29dbd8741
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
Location: /v1/accounts/qa-720d6ee0336b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21539115-9a84-4e12-82d3-51bc14e9f607","handle":"qa-720d6ee0336b","displayName":"QA 720d6ee0336b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.258061672Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-30ef3501-ad87-4ab8-a7d7-3fd6e6f85630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30ef3501-ad87-4ab8-a7d7-3fd6e6f85630
Content-Type: application/json

--- request body ---
{"handle":"qa-26d2f9cf10ab","displayName":"QA 26d2f9cf10ab","password":"****","region":"eu"}

--- response: 201 in 92 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-30ef3501-ad87-4ab8-a7d7-3fd6e6f85630
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
Location: /v1/accounts/qa-26d2f9cf10ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b2810b7-134e-41fe-b126-8e45f7933868","handle":"qa-26d2f9cf10ab","displayName":"QA 26d2f9cf10ab","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.769176552Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-83cd0767-c9e4-4e70-bc20-f3c658423498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83cd0767-c9e4-4e70-bc20-f3c658423498
Content-Type: application/json

--- request body ---
{"handle":"qa-720d6ee0336b","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-83cd0767-c9e4-4e70-bc20-f3c658423498
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21539115-9a84-4e12-82d3-51bc14e9f607"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1296ea2f-e94b-49ce-957f-d9a95654eb37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1296ea2f-e94b-49ce-957f-d9a95654eb37
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-26d2f9cf10ab","subject":"Updates","message":"First"}

--- response: 201 in 64 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1296ea2f-e94b-49ce-957f-d9a95654eb37
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
Location: /v1/conversations/cnv_9b038440-11de-4a36-8540-92d9620212c1
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_9b038440-11de-4a36-8540-92d9620212c1","subject":"Updates","status":"open","region":"eu","participants":["qa-720d6ee0336b","qa-26d2f9cf10ab"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.926557615Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9b038440-11de-4a36-8540-92d9620212c1/messages
correlation: qa-46121e29-a2ca-4bbf-9922-c4e04352337b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46121e29-a2ca-4bbf-9922-c4e04352337b
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 46 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-46121e29-a2ca-4bbf-9922-c4e04352337b
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
Content-Length: 197

{"id":"msg_4302675f-7a33-48ff-8fb8-b02aaf48db30","conversationId":"cnv_9b038440-11de-4a36-8540-92d9620212c1","sender":"qa-720d6ee0336b","body":"Second","createdAt":"2026-11-20T10:10:01.084787791Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1c8fb736-e338-40d4-a552-6f55d60ff01f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c8fb736-e338-40d4-a552-6f55d60ff01f
Content-Type: application/json

--- request body ---
{"handle":"qa-26d2f9cf10ab","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c8fb736-e338-40d4-a552-6f55d60ff01f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b2810b7-134e-41fe-b126-8e45f7933868"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_9b038440-11de-4a36-8540-92d9620212c1
correlation: qa-d4cf77d3-f479-41a8-aac1-ae7ca1877249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4cf77d3-f479-41a8-aac1-ae7ca1877249
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4cf77d3-f479-41a8-aac1-ae7ca1877249
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_9b038440-11de-4a36-8540-92d9620212c1","subject":"Updates","status":"open","region":"eu","participants":["qa-720d6ee0336b","qa-26d2f9cf10ab"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-20T10:10:00.926557615Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_9b038440-11de-4a36-8540-92d9620212c1/read
correlation: qa-8de251a8-0d25-4f96-a3b4-56ccdb41160f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8de251a8-0d25-4f96-a3b4-56ccdb41160f
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8de251a8-0d25-4f96-a3b4-56ccdb41160f
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
Content-Length: 77

{"conversationId":"cnv_9b038440-11de-4a36-8540-92d9620212c1","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_9b038440-11de-4a36-8540-92d9620212c1
correlation: qa-25dca638-7ec4-4ddb-b115-af84986c73e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25dca638-7ec4-4ddb-b115-af84986c73e8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-25dca638-7ec4-4ddb-b115-af84986c73e8
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_9b038440-11de-4a36-8540-92d9620212c1","subject":"Updates","status":"open","region":"eu","participants":["qa-720d6ee0336b","qa-26d2f9cf10ab"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.926557615Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08f1f0d2-7465-4603-b492-f3c4ce638cab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08f1f0d2-7465-4603-b492-f3c4ce638cab
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08f1f0d2-7465-4603-b492-f3c4ce638cab
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
correlation: qa-f4298bd1-a247-4103-bbe3-26580ae34e44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4298bd1-a247-4103-bbe3-26580ae34e44
Content-Type: application/json

--- request body ---
{"handle":"qa-26d2f9cf10ab","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4298bd1-a247-4103-bbe3-26580ae34e44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4298bd1-a247-4103-bbe3-26580ae34e44"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d8e2a8d-32db-4c01-b800-d14b5e8833f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d8e2a8d-32db-4c01-b800-d14b5e8833f2
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d8e2a8d-32db-4c01-b800-d14b5e8833f2
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-64506569-3f67-4e08-b709-4ed5b4136a13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64506569-3f67-4e08-b709-4ed5b4136a13
Content-Type: application/json

--- request body ---
{"handle":"qa-720d6ee0336b","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64506569-3f67-4e08-b709-4ed5b4136a13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64506569-3f67-4e08-b709-4ed5b4136a13"}
```
