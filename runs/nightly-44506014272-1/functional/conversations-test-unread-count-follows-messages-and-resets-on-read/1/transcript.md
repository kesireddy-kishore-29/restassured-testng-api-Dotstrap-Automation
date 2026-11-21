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
| 1 | `POST /v1/accounts` | 201 | 359 | `qa-67b8477a-d8ca-430d-80be-50ab71be4103` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-01ad34b6-2eeb-4449-a6d0-ae115021754e` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-57a9f5e9-cb0e-4d98-b3ea-914748e5ac4a` |
| 4 | `POST /v1/conversations` | 201 | 51 | `qa-59caefd0-bc7e-4aa8-93d9-7032e553dfa0` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 27 | `qa-2d4712c5-0876-48bd-a0cb-ab8f87687947` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-d14a589b-1df0-4d93-a70c-3b25ad934301` |
| 7 | `GET /v1/conversations/{id}` | 200 | 17 | `qa-3484fb9c-ec97-4907-a580-1722195534ad` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 22 | `qa-0d5f2f78-1725-4656-8457-53967c7301f9` |
| 9 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-67c11ebd-be5a-4370-ab29-6b44211d9460` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3e8ebe97-31f9-4c04-911b-d0485f8c6c86` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-9fd12429-48a6-459a-b353-fb6b4518b73d` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-269a382e-ab85-42ec-a487-3b105ac0eddb` |
| 13 | `POST /v1/auth/token` | 401 | 5 | `qa-6ac01172-268a-40cf-a963-804e95aee543` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-67b8477a-d8ca-430d-80be-50ab71be4103

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67b8477a-d8ca-430d-80be-50ab71be4103
Content-Type: application/json

--- request body ---
{"handle":"qa-4e3cbc87dac8","displayName":"QA 4e3cbc87dac8","password":"****","region":"eu"}

--- response: 201 in 359 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-67b8477a-d8ca-430d-80be-50ab71be4103
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
Location: /v1/accounts/qa-4e3cbc87dac8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ff3c902-18f7-485f-8173-2279b9a6a6cf","handle":"qa-4e3cbc87dac8","displayName":"QA 4e3cbc87dac8","region":"eu","role":"user","createdAt":"2026-11-19T10:29:14.977703767Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-01ad34b6-2eeb-4449-a6d0-ae115021754e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ad34b6-2eeb-4449-a6d0-ae115021754e
Content-Type: application/json

--- request body ---
{"handle":"qa-7fc0d9252bec","displayName":"QA 7fc0d9252bec","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-01ad34b6-2eeb-4449-a6d0-ae115021754e
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
Location: /v1/accounts/qa-7fc0d9252bec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a2a9076-4178-4540-9273-ad90d77cb3c0","handle":"qa-7fc0d9252bec","displayName":"QA 7fc0d9252bec","region":"eu","role":"user","createdAt":"2026-11-19T10:29:15.313184485Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-57a9f5e9-cb0e-4d98-b3ea-914748e5ac4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57a9f5e9-cb0e-4d98-b3ea-914748e5ac4a
Content-Type: application/json

--- request body ---
{"handle":"qa-4e3cbc87dac8","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-57a9f5e9-cb0e-4d98-b3ea-914748e5ac4a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ff3c902-18f7-485f-8173-2279b9a6a6cf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-59caefd0-bc7e-4aa8-93d9-7032e553dfa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59caefd0-bc7e-4aa8-93d9-7032e553dfa0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7fc0d9252bec","subject":"Updates","message":"First"}

--- response: 201 in 51 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-59caefd0-bc7e-4aa8-93d9-7032e553dfa0
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
Location: /v1/conversations/cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896","subject":"Updates","status":"open","region":"eu","participants":["qa-4e3cbc87dac8","qa-7fc0d9252bec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:15.425765455Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896/messages
correlation: qa-2d4712c5-0876-48bd-a0cb-ab8f87687947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d4712c5-0876-48bd-a0cb-ab8f87687947
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d4712c5-0876-48bd-a0cb-ab8f87687947
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

{"id":"msg_5ac1732c-0909-499c-b31f-72ff37f1acb8","conversationId":"cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896","sender":"qa-4e3cbc87dac8","body":"Second","createdAt":"2026-11-19T10:29:15.511093301Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d14a589b-1df0-4d93-a70c-3b25ad934301

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d14a589b-1df0-4d93-a70c-3b25ad934301
Content-Type: application/json

--- request body ---
{"handle":"qa-7fc0d9252bec","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d14a589b-1df0-4d93-a70c-3b25ad934301
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a2a9076-4178-4540-9273-ad90d77cb3c0"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896
correlation: qa-3484fb9c-ec97-4907-a580-1722195534ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3484fb9c-ec97-4907-a580-1722195534ad
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3484fb9c-ec97-4907-a580-1722195534ad
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

{"id":"cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896","subject":"Updates","status":"open","region":"eu","participants":["qa-4e3cbc87dac8","qa-7fc0d9252bec"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-19T10:29:15.425765455Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896/read
correlation: qa-0d5f2f78-1725-4656-8457-53967c7301f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d5f2f78-1725-4656-8457-53967c7301f9
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d5f2f78-1725-4656-8457-53967c7301f9
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

{"conversationId":"cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896
correlation: qa-67c11ebd-be5a-4370-ab29-6b44211d9460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67c11ebd-be5a-4370-ab29-6b44211d9460
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-67c11ebd-be5a-4370-ab29-6b44211d9460
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

{"id":"cnv_05bd6e77-a9d0-4fcb-a237-17e98e95a896","subject":"Updates","status":"open","region":"eu","participants":["qa-4e3cbc87dac8","qa-7fc0d9252bec"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-19T10:29:15.425765455Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e8ebe97-31f9-4c04-911b-d0485f8c6c86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e8ebe97-31f9-4c04-911b-d0485f8c6c86
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e8ebe97-31f9-4c04-911b-d0485f8c6c86
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
correlation: qa-9fd12429-48a6-459a-b353-fb6b4518b73d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fd12429-48a6-459a-b353-fb6b4518b73d
Content-Type: application/json

--- request body ---
{"handle":"qa-7fc0d9252bec","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fd12429-48a6-459a-b353-fb6b4518b73d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fd12429-48a6-459a-b353-fb6b4518b73d"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-269a382e-ab85-42ec-a487-3b105ac0eddb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-269a382e-ab85-42ec-a487-3b105ac0eddb
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-269a382e-ab85-42ec-a487-3b105ac0eddb
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
correlation: qa-6ac01172-268a-40cf-a963-804e95aee543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac01172-268a-40cf-a963-804e95aee543
Content-Type: application/json

--- request body ---
{"handle":"qa-4e3cbc87dac8","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ac01172-268a-40cf-a963-804e95aee543
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ac01172-268a-40cf-a963-804e95aee543"}
```
