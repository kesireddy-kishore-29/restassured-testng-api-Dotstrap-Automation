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
| 1 | `POST /v1/accounts` | 201 | 505 | `qa-5602f30b-1b0c-4045-9a54-49c1cd65191e` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-c659722c-e130-4eba-8d93-53532960285d` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-20b92f46-46e8-439f-aabd-223a0ca2a4b8` |
| 4 | `POST /v1/conversations` | 201 | 71 | `qa-7331889f-ae9a-4138-949b-2b694bdeb074` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 38 | `qa-b53f729c-d959-4d37-a90e-54a85f78ee99` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-058a8822-5902-4984-ae48-2c5454246bf5` |
| 7 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-75d3a1cd-58a3-48cf-bd2a-9c8e9b0c8443` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 21 | `qa-5cf1e3f0-102d-4496-99cf-956269a3a8ad` |
| 9 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-61d25925-1262-4953-85ab-a28cd01f1d5d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-591be751-f163-4840-a974-c05d3d9b3e1a` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-74d82940-aca5-44f9-813f-6245b5a9c983` |
| 12 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-47395f02-aa96-4038-8e3f-547b6067fabf` |
| 13 | `POST /v1/auth/token` | 401 | 8 | `qa-9a0e9c59-a444-4cd7-965b-4fbaf8e86695` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5602f30b-1b0c-4045-9a54-49c1cd65191e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5602f30b-1b0c-4045-9a54-49c1cd65191e
Content-Type: application/json

--- request body ---
{"handle":"qa-f2e63744833a","displayName":"QA f2e63744833a","password":"****","region":"eu"}

--- response: 201 in 505 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-5602f30b-1b0c-4045-9a54-49c1cd65191e
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
Location: /v1/accounts/qa-f2e63744833a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_77efe28d-2923-4d93-98d7-842be75438ba","handle":"qa-f2e63744833a","displayName":"QA f2e63744833a","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.383423400Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c659722c-e130-4eba-8d93-53532960285d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c659722c-e130-4eba-8d93-53532960285d
Content-Type: application/json

--- request body ---
{"handle":"qa-e01f1a4c5976","displayName":"QA e01f1a4c5976","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c659722c-e130-4eba-8d93-53532960285d
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
Location: /v1/accounts/qa-e01f1a4c5976
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba05f9c0-46a9-4411-941f-f57d0184475b","handle":"qa-e01f1a4c5976","displayName":"QA e01f1a4c5976","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.809176223Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-20b92f46-46e8-439f-aabd-223a0ca2a4b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20b92f46-46e8-439f-aabd-223a0ca2a4b8
Content-Type: application/json

--- request body ---
{"handle":"qa-f2e63744833a","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-20b92f46-46e8-439f-aabd-223a0ca2a4b8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_77efe28d-2923-4d93-98d7-842be75438ba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7331889f-ae9a-4138-949b-2b694bdeb074

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7331889f-ae9a-4138-949b-2b694bdeb074
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e01f1a4c5976","subject":"Updates","message":"First"}

--- response: 201 in 71 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7331889f-ae9a-4138-949b-2b694bdeb074
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
Location: /v1/conversations/cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6","subject":"Updates","status":"open","region":"eu","participants":["qa-f2e63744833a","qa-e01f1a4c5976"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:51.980136460Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6/messages
correlation: qa-b53f729c-d959-4d37-a90e-54a85f78ee99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53f729c-d959-4d37-a90e-54a85f78ee99
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 38 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b53f729c-d959-4d37-a90e-54a85f78ee99
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

{"id":"msg_8430f681-9701-4e37-b977-51f9b5573e0a","conversationId":"cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6","sender":"qa-f2e63744833a","body":"Second","createdAt":"2026-11-05T09:37:52.119226270Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-058a8822-5902-4984-ae48-2c5454246bf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-058a8822-5902-4984-ae48-2c5454246bf5
Content-Type: application/json

--- request body ---
{"handle":"qa-e01f1a4c5976","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-058a8822-5902-4984-ae48-2c5454246bf5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba05f9c0-46a9-4411-941f-f57d0184475b"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6
correlation: qa-75d3a1cd-58a3-48cf-bd2a-9c8e9b0c8443

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75d3a1cd-58a3-48cf-bd2a-9c8e9b0c8443
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-75d3a1cd-58a3-48cf-bd2a-9c8e9b0c8443
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

{"id":"cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6","subject":"Updates","status":"open","region":"eu","participants":["qa-f2e63744833a","qa-e01f1a4c5976"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-05T09:37:51.980136460Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6/read
correlation: qa-5cf1e3f0-102d-4496-99cf-956269a3a8ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cf1e3f0-102d-4496-99cf-956269a3a8ad
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cf1e3f0-102d-4496-99cf-956269a3a8ad
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

{"conversationId":"cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6
correlation: qa-61d25925-1262-4953-85ab-a28cd01f1d5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61d25925-1262-4953-85ab-a28cd01f1d5d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-61d25925-1262-4953-85ab-a28cd01f1d5d
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

{"id":"cnv_445fa7f4-311b-4a89-9cd7-90ed7779f1a6","subject":"Updates","status":"open","region":"eu","participants":["qa-f2e63744833a","qa-e01f1a4c5976"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-05T09:37:51.980136460Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-591be751-f163-4840-a974-c05d3d9b3e1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-591be751-f163-4840-a974-c05d3d9b3e1a
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-591be751-f163-4840-a974-c05d3d9b3e1a
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
correlation: qa-74d82940-aca5-44f9-813f-6245b5a9c983

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74d82940-aca5-44f9-813f-6245b5a9c983
Content-Type: application/json

--- request body ---
{"handle":"qa-e01f1a4c5976","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74d82940-aca5-44f9-813f-6245b5a9c983
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74d82940-aca5-44f9-813f-6245b5a9c983"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-47395f02-aa96-4038-8e3f-547b6067fabf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47395f02-aa96-4038-8e3f-547b6067fabf
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-47395f02-aa96-4038-8e3f-547b6067fabf
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
correlation: qa-9a0e9c59-a444-4cd7-965b-4fbaf8e86695

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a0e9c59-a444-4cd7-965b-4fbaf8e86695
Content-Type: application/json

--- request body ---
{"handle":"qa-f2e63744833a","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a0e9c59-a444-4cd7-965b-4fbaf8e86695
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a0e9c59-a444-4cd7-965b-4fbaf8e86695"}
```
