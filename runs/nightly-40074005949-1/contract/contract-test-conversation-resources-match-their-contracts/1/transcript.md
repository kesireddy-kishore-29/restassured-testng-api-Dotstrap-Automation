# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 367 | `qa-c104e106-565f-496f-9b23-182b5c1f3c21` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-2fc53a3f-de49-485b-b571-1e817d04e335` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-c8d28122-fdd9-4621-9454-028afd22f6ff` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-3d487d4b-94f6-44ba-ba92-a6dfc57e854f` |
| 5 | `GET /v1/conversations` | 200 | 25 | `qa-37d99fac-5d0c-4654-9658-933a5919d6ac` |
| 6 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-7dbbc4c4-f114-442f-a449-16b0d29c961c` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-ed4ac438-d7c4-4a39-b4f6-4b50e47c2d4b` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 12 | `qa-c3f32718-954a-47f8-b4fe-8e4e2505d6ed` |
| 9 | `POST /v1/auth/token` | 200 | 13 | `qa-f1f1f501-6aa1-4ce4-a1cf-9c2ba47f20ba` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 13 | `qa-8bd67c9d-1f28-4e51-b5d3-61e3c0d72c4c` |
| 11 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-567fb001-3b99-45f5-8800-889ec9e80935` |
| 12 | `POST /v1/auth/token` | 401 | 8 | `qa-902da76f-db6e-4684-a917-4815ec3416db` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-cb84a5bb-7cb6-4fd2-98e8-0ea22098fcbb` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-8c2fb323-3c76-4a91-9109-bb8e4a49aa06` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c104e106-565f-496f-9b23-182b5c1f3c21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c104e106-565f-496f-9b23-182b5c1f3c21
Content-Type: application/json

--- request body ---
{"handle":"qa-b13c3bee5709","displayName":"QA b13c3bee5709","password":"****","region":"eu"}

--- response: 201 in 367 ms ---
Date: Sat, 24 Oct 2026 07:25:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c104e106-565f-496f-9b23-182b5c1f3c21
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
Location: /v1/accounts/qa-b13c3bee5709
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28cf4b84-6714-4b58-8b14-c56562e6e2d6","handle":"qa-b13c3bee5709","displayName":"QA b13c3bee5709","region":"eu","role":"user","createdAt":"2026-10-24T07:25:00.984941810Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2fc53a3f-de49-485b-b571-1e817d04e335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fc53a3f-de49-485b-b571-1e817d04e335
Content-Type: application/json

--- request body ---
{"handle":"qa-368a7a7db59d","displayName":"QA 368a7a7db59d","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fc53a3f-de49-485b-b571-1e817d04e335
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
Location: /v1/accounts/qa-368a7a7db59d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_182831c1-9dc9-4999-9f51-6b8a1bcd6046","handle":"qa-368a7a7db59d","displayName":"QA 368a7a7db59d","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.261495752Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c8d28122-fdd9-4621-9454-028afd22f6ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8d28122-fdd9-4621-9454-028afd22f6ff
Content-Type: application/json

--- request body ---
{"handle":"qa-b13c3bee5709","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8d28122-fdd9-4621-9454-028afd22f6ff
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28cf4b84-6714-4b58-8b14-c56562e6e2d6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d487d4b-94f6-44ba-ba92-a6dfc57e854f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d487d4b-94f6-44ba-ba92-a6dfc57e854f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-368a7a7db59d","subject":"Contract check","message":"Hello"}

--- response: 201 in 30 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d487d4b-94f6-44ba-ba92-a6dfc57e854f
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
Location: /v1/conversations/cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04","subject":"Contract check","status":"open","region":"eu","participants":["qa-b13c3bee5709","qa-368a7a7db59d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.396305260Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-37d99fac-5d0c-4654-9658-933a5919d6ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37d99fac-5d0c-4654-9658-933a5919d6ac
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-37d99fac-5d0c-4654-9658-933a5919d6ac
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
Content-Length: 259

{"items":[{"id":"cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04","subject":"Contract check","status":"open","region":"eu","participants":["qa-b13c3bee5709","qa-368a7a7db59d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.396305260Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04
correlation: qa-7dbbc4c4-f114-442f-a449-16b0d29c961c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dbbc4c4-f114-442f-a449-16b0d29c961c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dbbc4c4-f114-442f-a449-16b0d29c961c
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
Content-Length: 237

{"id":"cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04","subject":"Contract check","status":"open","region":"eu","participants":["qa-b13c3bee5709","qa-368a7a7db59d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.396305260Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04/messages
correlation: qa-ed4ac438-d7c4-4a39-b4f6-4b50e47c2d4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed4ac438-d7c4-4a39-b4f6-4b50e47c2d4b
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed4ac438-d7c4-4a39-b4f6-4b50e47c2d4b
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
Content-Length: 197

{"id":"msg_e855fc1e-0069-4511-bf8b-b1d24cf9d111","conversationId":"cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04","sender":"qa-b13c3bee5709","body":"Second","createdAt":"2026-10-24T07:25:01.530893124Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04/messages
correlation: qa-c3f32718-954a-47f8-b4fe-8e4e2505d6ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f32718-954a-47f8-b4fe-8e4e2505d6ed
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3f32718-954a-47f8-b4fe-8e4e2505d6ed
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
Content-Length: 416

{"items":[{"id":"msg_83fa8104-4924-4afc-92e1-6432a49e62c4","conversationId":"cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04","sender":"qa-b13c3bee5709","body":"Hello","createdAt":"2026-10-24T07:25:01.396476839Z"},{"id":"msg_e855fc1e-0069-4511-bf8b-b1d24cf9d111","conversationId":"cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04","sender":"qa-b13c3bee5709","body":"Second","createdAt":"2026-10-24T07:25:01.530893124Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-f1f1f501-6aa1-4ce4-a1cf-9c2ba47f20ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f1f501-6aa1-4ce4-a1cf-9c2ba47f20ba
Content-Type: application/json

--- request body ---
{"handle":"qa-368a7a7db59d","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1f1f501-6aa1-4ce4-a1cf-9c2ba47f20ba
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_182831c1-9dc9-4999-9f51-6b8a1bcd6046"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04/read
correlation: qa-8bd67c9d-1f28-4e51-b5d3-61e3c0d72c4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bd67c9d-1f28-4e51-b5d3-61e3c0d72c4c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bd67c9d-1f28-4e51-b5d3-61e3c0d72c4c
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
Content-Length: 77

{"conversationId":"cnv_38a029bb-7ded-4215-8ae9-5cfc8753bd04","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-567fb001-3b99-45f5-8800-889ec9e80935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-567fb001-3b99-45f5-8800-889ec9e80935
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-567fb001-3b99-45f5-8800-889ec9e80935
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-902da76f-db6e-4684-a917-4815ec3416db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-902da76f-db6e-4684-a917-4815ec3416db
Content-Type: application/json

--- request body ---
{"handle":"qa-368a7a7db59d","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-902da76f-db6e-4684-a917-4815ec3416db
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-902da76f-db6e-4684-a917-4815ec3416db"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb84a5bb-7cb6-4fd2-98e8-0ea22098fcbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb84a5bb-7cb6-4fd2-98e8-0ea22098fcbb
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb84a5bb-7cb6-4fd2-98e8-0ea22098fcbb
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-8c2fb323-3c76-4a91-9109-bb8e4a49aa06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2fb323-3c76-4a91-9109-bb8e4a49aa06
Content-Type: application/json

--- request body ---
{"handle":"qa-b13c3bee5709","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c2fb323-3c76-4a91-9109-bb8e4a49aa06
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c2fb323-3c76-4a91-9109-bb8e4a49aa06"}
```
