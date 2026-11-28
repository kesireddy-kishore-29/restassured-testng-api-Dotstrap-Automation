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
| 1 | `POST /v1/accounts` | 201 | 379 | `qa-3702892b-6fc3-4e3f-9b12-5f88292f565e` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-552e2cae-2eee-4e6e-85bc-41471391aa72` |
| 3 | `POST /v1/auth/token` | 200 | 54 | `qa-a938ec1d-da34-4cf3-ac54-0e6617b5b99f` |
| 4 | `POST /v1/conversations` | 201 | 49 | `qa-78e27155-aa23-4dec-b9f3-6c140d70c44c` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 41 | `qa-aff560d4-78f7-4aec-b68b-4cd39ea2b30d` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-603ac2e4-8088-4558-8178-b60e81a14a61` |
| 7 | `GET /v1/conversations/{id}` | 200 | 21 | `qa-bceeb4a9-8c36-4039-9433-acb73078b4fa` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 20 | `qa-5d4cd4cb-6a9c-4364-9096-bca628fe844b` |
| 9 | `GET /v1/conversations/{id}` | 200 | 17 | `qa-dd51fa99-2de6-44c5-816e-5a9406d11e8a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d5b77dbe-e450-4690-98bc-b574127e761a` |
| 11 | `POST /v1/auth/token` | 401 | 22 | `qa-540c90ad-7c1d-4680-88ba-b93524d960be` |
| 12 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-189270fa-1ec6-43cb-a093-bb230dbb2f86` |
| 13 | `POST /v1/auth/token` | 401 | 18 | `qa-5c82742f-5c04-4a81-8a62-8c4d740237f9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3702892b-6fc3-4e3f-9b12-5f88292f565e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3702892b-6fc3-4e3f-9b12-5f88292f565e
Content-Type: application/json

--- request body ---
{"handle":"qa-8399f36d4b06","displayName":"QA 8399f36d4b06","password":"****","region":"eu"}

--- response: 201 in 379 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3702892b-6fc3-4e3f-9b12-5f88292f565e
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
Location: /v1/accounts/qa-8399f36d4b06
X-Served-Region: eu
Content-Length: 181

{"id":"acc_355fce27-4f87-4044-87c9-51ac1bf8edc0","handle":"qa-8399f36d4b06","displayName":"QA 8399f36d4b06","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.008111146Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-552e2cae-2eee-4e6e-85bc-41471391aa72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-552e2cae-2eee-4e6e-85bc-41471391aa72
Content-Type: application/json

--- request body ---
{"handle":"qa-54491311f294","displayName":"QA 54491311f294","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-552e2cae-2eee-4e6e-85bc-41471391aa72
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
Location: /v1/accounts/qa-54491311f294
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2930fb93-a58f-42d4-b9eb-c950acaca45c","handle":"qa-54491311f294","displayName":"QA 54491311f294","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.454484635Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a938ec1d-da34-4cf3-ac54-0e6617b5b99f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a938ec1d-da34-4cf3-ac54-0e6617b5b99f
Content-Type: application/json

--- request body ---
{"handle":"qa-8399f36d4b06","password":"****"}

--- response: 200 in 54 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a938ec1d-da34-4cf3-ac54-0e6617b5b99f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_355fce27-4f87-4044-87c9-51ac1bf8edc0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-78e27155-aa23-4dec-b9f3-6c140d70c44c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78e27155-aa23-4dec-b9f3-6c140d70c44c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-54491311f294","subject":"Updates","message":"First"}

--- response: 201 in 49 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-78e27155-aa23-4dec-b9f3-6c140d70c44c
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
Location: /v1/conversations/cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a","subject":"Updates","status":"open","region":"eu","participants":["qa-8399f36d4b06","qa-54491311f294"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.610343716Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a/messages
correlation: qa-aff560d4-78f7-4aec-b68b-4cd39ea2b30d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aff560d4-78f7-4aec-b68b-4cd39ea2b30d
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 41 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-aff560d4-78f7-4aec-b68b-4cd39ea2b30d
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

{"id":"msg_baa94041-bda5-46c2-b3ac-fbdd044aa0d1","conversationId":"cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a","sender":"qa-8399f36d4b06","body":"Second","createdAt":"2026-11-25T11:27:57.728217272Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-603ac2e4-8088-4558-8178-b60e81a14a61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-603ac2e4-8088-4558-8178-b60e81a14a61
Content-Type: application/json

--- request body ---
{"handle":"qa-54491311f294","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-603ac2e4-8088-4558-8178-b60e81a14a61
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2930fb93-a58f-42d4-b9eb-c950acaca45c"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a
correlation: qa-bceeb4a9-8c36-4039-9433-acb73078b4fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bceeb4a9-8c36-4039-9433-acb73078b4fa
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bceeb4a9-8c36-4039-9433-acb73078b4fa
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

{"id":"cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a","subject":"Updates","status":"open","region":"eu","participants":["qa-8399f36d4b06","qa-54491311f294"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-25T11:27:57.610343716Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a/read
correlation: qa-5d4cd4cb-6a9c-4364-9096-bca628fe844b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d4cd4cb-6a9c-4364-9096-bca628fe844b
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d4cd4cb-6a9c-4364-9096-bca628fe844b
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

{"conversationId":"cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a
correlation: qa-dd51fa99-2de6-44c5-816e-5a9406d11e8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd51fa99-2de6-44c5-816e-5a9406d11e8a
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd51fa99-2de6-44c5-816e-5a9406d11e8a
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

{"id":"cnv_a7ba8554-c1fb-409a-8d28-11f57bbb802a","subject":"Updates","status":"open","region":"eu","participants":["qa-8399f36d4b06","qa-54491311f294"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.610343716Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5b77dbe-e450-4690-98bc-b574127e761a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5b77dbe-e450-4690-98bc-b574127e761a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5b77dbe-e450-4690-98bc-b574127e761a
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
correlation: qa-540c90ad-7c1d-4680-88ba-b93524d960be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-540c90ad-7c1d-4680-88ba-b93524d960be
Content-Type: application/json

--- request body ---
{"handle":"qa-54491311f294","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-540c90ad-7c1d-4680-88ba-b93524d960be
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-540c90ad-7c1d-4680-88ba-b93524d960be"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-189270fa-1ec6-43cb-a093-bb230dbb2f86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-189270fa-1ec6-43cb-a093-bb230dbb2f86
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-189270fa-1ec6-43cb-a093-bb230dbb2f86
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
correlation: qa-5c82742f-5c04-4a81-8a62-8c4d740237f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c82742f-5c04-4a81-8a62-8c4d740237f9
Content-Type: application/json

--- request body ---
{"handle":"qa-8399f36d4b06","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c82742f-5c04-4a81-8a62-8c4d740237f9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c82742f-5c04-4a81-8a62-8c4d740237f9"}
```
