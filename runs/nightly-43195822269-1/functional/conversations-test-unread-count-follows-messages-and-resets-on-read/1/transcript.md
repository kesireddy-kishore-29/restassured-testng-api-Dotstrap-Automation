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
| 1 | `POST /v1/accounts` | 201 | 401 | `qa-bc3ddc22-ee55-4ce1-9ad0-d95e14d9dc1e` |
| 2 | `POST /v1/accounts` | 201 | 64 | `qa-9fdf2b4c-8479-4450-9530-1620cca6e705` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-466cde37-b870-411a-b684-c39081dbe5fb` |
| 4 | `POST /v1/conversations` | 201 | 52 | `qa-784ee299-5816-457b-935b-bd917443f731` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 31 | `qa-a3f465f9-6653-49bb-ab63-103b5359e437` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-e9de33a2-8b1e-49cb-ae4e-40e2c61aba79` |
| 7 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-d252e253-934e-4904-bdd2-38424ba9c2c1` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 38 | `qa-d7204672-2797-4864-b9d7-d3b68bfe43a6` |
| 9 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-3b44934b-9ddc-4791-a8ad-b54435200dbe` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-3bbe3f8b-a720-4dc5-bd04-2aba5ba2313a` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-1687e658-0a0a-4c5d-be18-651049b4dd94` |
| 12 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d9a7b173-b9e0-480a-9fbf-ecb51124e3e3` |
| 13 | `POST /v1/auth/token` | 401 | 12 | `qa-f3d19917-a904-4328-8c43-414b344e3702` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bc3ddc22-ee55-4ce1-9ad0-d95e14d9dc1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc3ddc22-ee55-4ce1-9ad0-d95e14d9dc1e
Content-Type: application/json

--- request body ---
{"handle":"qa-e2a9b477a1c8","displayName":"QA e2a9b477a1c8","password":"****","region":"eu"}

--- response: 201 in 401 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc3ddc22-ee55-4ce1-9ad0-d95e14d9dc1e
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
Location: /v1/accounts/qa-e2a9b477a1c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce57b35d-699e-4e9a-a6e0-6be8cb6917fa","handle":"qa-e2a9b477a1c8","displayName":"QA e2a9b477a1c8","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.166586867Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9fdf2b4c-8479-4450-9530-1620cca6e705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fdf2b4c-8479-4450-9530-1620cca6e705
Content-Type: application/json

--- request body ---
{"handle":"qa-c14f45f8e775","displayName":"QA c14f45f8e775","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fdf2b4c-8479-4450-9530-1620cca6e705
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
Location: /v1/accounts/qa-c14f45f8e775
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7458db4-2007-4004-a1d0-4cc0bd081027","handle":"qa-c14f45f8e775","displayName":"QA c14f45f8e775","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.718511905Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-466cde37-b870-411a-b684-c39081dbe5fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466cde37-b870-411a-b684-c39081dbe5fb
Content-Type: application/json

--- request body ---
{"handle":"qa-e2a9b477a1c8","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-466cde37-b870-411a-b684-c39081dbe5fb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce57b35d-699e-4e9a-a6e0-6be8cb6917fa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-784ee299-5816-457b-935b-bd917443f731

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-784ee299-5816-457b-935b-bd917443f731
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c14f45f8e775","subject":"Updates","message":"First"}

--- response: 201 in 52 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-784ee299-5816-457b-935b-bd917443f731
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
Location: /v1/conversations/cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f","subject":"Updates","status":"open","region":"eu","participants":["qa-e2a9b477a1c8","qa-c14f45f8e775"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:35.861200260Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f/messages
correlation: qa-a3f465f9-6653-49bb-ab63-103b5359e437

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3f465f9-6653-49bb-ab63-103b5359e437
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3f465f9-6653-49bb-ab63-103b5359e437
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

{"id":"msg_315fcf43-66ba-4f2d-a9f4-e96da69271a5","conversationId":"cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f","sender":"qa-e2a9b477a1c8","body":"Second","createdAt":"2026-11-12T09:56:35.965533905Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e9de33a2-8b1e-49cb-ae4e-40e2c61aba79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9de33a2-8b1e-49cb-ae4e-40e2c61aba79
Content-Type: application/json

--- request body ---
{"handle":"qa-c14f45f8e775","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9de33a2-8b1e-49cb-ae4e-40e2c61aba79
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7458db4-2007-4004-a1d0-4cc0bd081027"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f
correlation: qa-d252e253-934e-4904-bdd2-38424ba9c2c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d252e253-934e-4904-bdd2-38424ba9c2c1
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d252e253-934e-4904-bdd2-38424ba9c2c1
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

{"id":"cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f","subject":"Updates","status":"open","region":"eu","participants":["qa-e2a9b477a1c8","qa-c14f45f8e775"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-12T09:56:35.861200260Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f/read
correlation: qa-d7204672-2797-4864-b9d7-d3b68bfe43a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7204672-2797-4864-b9d7-d3b68bfe43a6
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7204672-2797-4864-b9d7-d3b68bfe43a6
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

{"conversationId":"cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f
correlation: qa-3b44934b-9ddc-4791-a8ad-b54435200dbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b44934b-9ddc-4791-a8ad-b54435200dbe
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b44934b-9ddc-4791-a8ad-b54435200dbe
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

{"id":"cnv_722fcecd-18e2-43de-a8b2-fe61f7286d2f","subject":"Updates","status":"open","region":"eu","participants":["qa-e2a9b477a1c8","qa-c14f45f8e775"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-12T09:56:35.861200260Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3bbe3f8b-a720-4dc5-bd04-2aba5ba2313a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bbe3f8b-a720-4dc5-bd04-2aba5ba2313a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3bbe3f8b-a720-4dc5-bd04-2aba5ba2313a
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
correlation: qa-1687e658-0a0a-4c5d-be18-651049b4dd94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1687e658-0a0a-4c5d-be18-651049b4dd94
Content-Type: application/json

--- request body ---
{"handle":"qa-c14f45f8e775","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1687e658-0a0a-4c5d-be18-651049b4dd94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1687e658-0a0a-4c5d-be18-651049b4dd94"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d9a7b173-b9e0-480a-9fbf-ecb51124e3e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9a7b173-b9e0-480a-9fbf-ecb51124e3e3
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d9a7b173-b9e0-480a-9fbf-ecb51124e3e3
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
correlation: qa-f3d19917-a904-4328-8c43-414b344e3702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3d19917-a904-4328-8c43-414b344e3702
Content-Type: application/json

--- request body ---
{"handle":"qa-e2a9b477a1c8","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3d19917-a904-4328-8c43-414b344e3702
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3d19917-a904-4328-8c43-414b344e3702"}
```
