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
| 1 | `POST /v1/accounts` | 201 | 488 | `qa-8fb68e78-e017-419b-9689-e253d6e5325b` |
| 2 | `POST /v1/accounts` | 201 | 68 | `qa-4038ee25-50d7-48c2-a0ce-84fd3a4938d7` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-c7268b28-e849-48e0-be54-3877ff6db67c` |
| 4 | `POST /v1/conversations` | 201 | 85 | `qa-17a7ab71-e7b2-4650-b7f8-d44c4ef263ba` |
| 5 | `POST /v1/auth/token` | 200 | 39 | `qa-6db3946a-305e-42d5-8f3d-30b1824a03a6` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 61 | `qa-3eadb5bd-f2fb-484c-8aa1-9b564e38f5d2` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 27 | `qa-2d97da0c-6b8a-4f83-9e62-bb9d4e1b0a29` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-69a347ae-c342-4d21-8193-40eae247fa09` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-81a468e8-12ae-4096-b30d-5969e9d03b18` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7649909a-73dd-4cb2-851d-48bcd5c5ddba` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-82f36c1e-18bd-487b-9bbb-8da67a887385` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8fb68e78-e017-419b-9689-e253d6e5325b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb68e78-e017-419b-9689-e253d6e5325b
Content-Type: application/json

--- request body ---
{"handle":"qa-5c0073b20b75","displayName":"QA 5c0073b20b75","password":"****","region":"eu"}

--- response: 201 in 488 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fb68e78-e017-419b-9689-e253d6e5325b
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
Location: /v1/accounts/qa-5c0073b20b75
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6fdeebef-86d0-49d4-989b-3153f24a4487","handle":"qa-5c0073b20b75","displayName":"QA 5c0073b20b75","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.025234985Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4038ee25-50d7-48c2-a0ce-84fd3a4938d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4038ee25-50d7-48c2-a0ce-84fd3a4938d7
Content-Type: application/json

--- request body ---
{"handle":"qa-5c57c02395e3","displayName":"QA 5c57c02395e3","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4038ee25-50d7-48c2-a0ce-84fd3a4938d7
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
Location: /v1/accounts/qa-5c57c02395e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85eb4d64-1e98-47ce-b216-5d8f6cbc8912","handle":"qa-5c57c02395e3","displayName":"QA 5c57c02395e3","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.467346892Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c7268b28-e849-48e0-be54-3877ff6db67c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7268b28-e849-48e0-be54-3877ff6db67c
Content-Type: application/json

--- request body ---
{"handle":"qa-5c0073b20b75","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7268b28-e849-48e0-be54-3877ff6db67c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fdeebef-86d0-49d4-989b-3153f24a4487"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-17a7ab71-e7b2-4650-b7f8-d44c4ef263ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17a7ab71-e7b2-4650-b7f8-d44c4ef263ba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5c57c02395e3","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 85 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-17a7ab71-e7b2-4650-b7f8-d44c4ef263ba
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
Location: /v1/conversations/cnv_c0cd2514-61a9-4522-8736-8199624c1e69
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_c0cd2514-61a9-4522-8736-8199624c1e69","subject":"Lunch?","status":"open","region":"eu","participants":["qa-5c0073b20b75","qa-5c57c02395e3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:10.644312134Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6db3946a-305e-42d5-8f3d-30b1824a03a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6db3946a-305e-42d5-8f3d-30b1824a03a6
Content-Type: application/json

--- request body ---
{"handle":"qa-5c57c02395e3","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6db3946a-305e-42d5-8f3d-30b1824a03a6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85eb4d64-1e98-47ce-b216-5d8f6cbc8912"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_c0cd2514-61a9-4522-8736-8199624c1e69/messages
correlation: qa-3eadb5bd-f2fb-484c-8aa1-9b564e38f5d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eadb5bd-f2fb-484c-8aa1-9b564e38f5d2
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 61 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eadb5bd-f2fb-484c-8aa1-9b564e38f5d2
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

{"id":"msg_94e59a59-2955-4a00-8e79-86f319355bfc","conversationId":"cnv_c0cd2514-61a9-4522-8736-8199624c1e69","sender":"qa-5c57c02395e3","body":"Friday works","createdAt":"2026-11-13T09:42:10.844522468Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_c0cd2514-61a9-4522-8736-8199624c1e69/messages
correlation: qa-2d97da0c-6b8a-4f83-9e62-bb9d4e1b0a29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d97da0c-6b8a-4f83-9e62-bb9d4e1b0a29
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d97da0c-6b8a-4f83-9e62-bb9d4e1b0a29
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

{"items":[{"id":"msg_2387f3f8-8efb-4b1e-974d-e12002440525","conversationId":"cnv_c0cd2514-61a9-4522-8736-8199624c1e69","sender":"qa-5c0073b20b75","body":"Free on Friday?","createdAt":"2026-11-13T09:42:10.644607221Z"},{"id":"msg_94e59a59-2955-4a00-8e79-86f319355bfc","conversationId":"cnv_c0cd2514-61a9-4522-8736-8199624c1e69","sender":"qa-5c57c02395e3","body":"Friday works","createdAt":"2026-11-13T09:42:10.844522468Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69a347ae-c342-4d21-8193-40eae247fa09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69a347ae-c342-4d21-8193-40eae247fa09
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69a347ae-c342-4d21-8193-40eae247fa09
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
correlation: qa-81a468e8-12ae-4096-b30d-5969e9d03b18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81a468e8-12ae-4096-b30d-5969e9d03b18
Content-Type: application/json

--- request body ---
{"handle":"qa-5c57c02395e3","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81a468e8-12ae-4096-b30d-5969e9d03b18
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81a468e8-12ae-4096-b30d-5969e9d03b18"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7649909a-73dd-4cb2-851d-48bcd5c5ddba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7649909a-73dd-4cb2-851d-48bcd5c5ddba
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7649909a-73dd-4cb2-851d-48bcd5c5ddba
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
correlation: qa-82f36c1e-18bd-487b-9bbb-8da67a887385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82f36c1e-18bd-487b-9bbb-8da67a887385
Content-Type: application/json

--- request body ---
{"handle":"qa-5c0073b20b75","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82f36c1e-18bd-487b-9bbb-8da67a887385
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-82f36c1e-18bd-487b-9bbb-8da67a887385"}
```
