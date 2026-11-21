# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-e6204b21-4c73-4a0f-b927-201b6b6aa46e` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-7a94e02d-ed3e-4cb8-9b86-934fcc14f5e9` |
| 3 | `POST /v1/accounts` | 201 | 12 | `qa-51bdd000-74e9-45be-ae3b-44a0168ebcce` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-885e4815-5771-49e7-8e41-cc3113ad6a08` |
| 5 | `POST /v1/conversations` | 201 | 20 | `qa-f67aa516-10ab-4cc4-b256-26e321c0c9f8` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-a299af82-4000-4841-b5cd-b9eeffdbc71a` |
| 7 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-fe715cc3-95e1-4420-902c-feb754beb6b7` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 21 | `qa-b5661886-260d-473d-91fc-824b1cc6dd8d` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 11 | `qa-5513751c-b4c9-4ab9-869d-fc902051cab3` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-70ce0fd8-d1f9-4f97-92db-416cf6d8b495` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-a592227d-8f8c-4109-aa79-f534366837e0` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-9125e864-b814-4e00-aac7-77dc8155f9dc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8e262ed3-270d-4742-9a04-f4987580cf0e` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-d3a39a4e-e348-482f-8151-feae2d84959a` |
| 15 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2a554321-4930-4798-aa92-f61bac14c3ba` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-b0e86917-9457-43e0-a8c8-6a45cd2b6a5b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e6204b21-4c73-4a0f-b927-201b6b6aa46e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6204b21-4c73-4a0f-b927-201b6b6aa46e
Content-Type: application/json

--- request body ---
{"handle":"qa-af78fd4a9d2d","displayName":"QA af78fd4a9d2d","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6204b21-4c73-4a0f-b927-201b6b6aa46e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Location: /v1/accounts/qa-af78fd4a9d2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41486c35-224f-4359-80b1-00cf4cb0db34","handle":"qa-af78fd4a9d2d","displayName":"QA af78fd4a9d2d","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.890795174Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7a94e02d-ed3e-4cb8-9b86-934fcc14f5e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a94e02d-ed3e-4cb8-9b86-934fcc14f5e9
Content-Type: application/json

--- request body ---
{"handle":"qa-13238cc98aca","displayName":"QA 13238cc98aca","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a94e02d-ed3e-4cb8-9b86-934fcc14f5e9
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
Location: /v1/accounts/qa-13238cc98aca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5b68fd1-e0df-4406-98b2-368fb96e3982","handle":"qa-13238cc98aca","displayName":"QA 13238cc98aca","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.923042152Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-51bdd000-74e9-45be-ae3b-44a0168ebcce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51bdd000-74e9-45be-ae3b-44a0168ebcce
Content-Type: application/json

--- request body ---
{"handle":"qa-902ec6b2a913","displayName":"QA 902ec6b2a913","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-51bdd000-74e9-45be-ae3b-44a0168ebcce
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
Location: /v1/accounts/qa-902ec6b2a913
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa8d1771-331d-4f25-93ba-2c594849f308","handle":"qa-902ec6b2a913","displayName":"QA 902ec6b2a913","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.949844323Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-885e4815-5771-49e7-8e41-cc3113ad6a08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-885e4815-5771-49e7-8e41-cc3113ad6a08
Content-Type: application/json

--- request body ---
{"handle":"qa-af78fd4a9d2d","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-885e4815-5771-49e7-8e41-cc3113ad6a08
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41486c35-224f-4359-80b1-00cf4cb0db34"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f67aa516-10ab-4cc4-b256-26e321c0c9f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f67aa516-10ab-4cc4-b256-26e321c0c9f8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-13238cc98aca","subject":"Private","message":"Just us"}

--- response: 201 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f67aa516-10ab-4cc4-b256-26e321c0c9f8
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
Location: /v1/conversations/cnv_42384cd2-6f18-43a3-ba02-113de45cd7ff
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_42384cd2-6f18-43a3-ba02-113de45cd7ff","subject":"Private","status":"open","region":"eu","participants":["qa-af78fd4a9d2d","qa-13238cc98aca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:55.002763284Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a299af82-4000-4841-b5cd-b9eeffdbc71a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a299af82-4000-4841-b5cd-b9eeffdbc71a
Content-Type: application/json

--- request body ---
{"handle":"qa-902ec6b2a913","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a299af82-4000-4841-b5cd-b9eeffdbc71a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa8d1771-331d-4f25-93ba-2c594849f308"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_42384cd2-6f18-43a3-ba02-113de45cd7ff
correlation: qa-fe715cc3-95e1-4420-902c-feb754beb6b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe715cc3-95e1-4420-902c-feb754beb6b7
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe715cc3-95e1-4420-902c-feb754beb6b7
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_42384cd2-6f18-43a3-ba02-113de45cd7ff","correlationId":"qa-fe715cc3-95e1-4420-902c-feb754beb6b7"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_42384cd2-6f18-43a3-ba02-113de45cd7ff/messages
correlation: qa-b5661886-260d-473d-91fc-824b1cc6dd8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5661886-260d-473d-91fc-824b1cc6dd8d
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5661886-260d-473d-91fc-824b1cc6dd8d
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_42384cd2-6f18-43a3-ba02-113de45cd7ff/messages","correlationId":"qa-b5661886-260d-473d-91fc-824b1cc6dd8d"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_42384cd2-6f18-43a3-ba02-113de45cd7ff/messages
correlation: qa-5513751c-b4c9-4ab9-869d-fc902051cab3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5513751c-b4c9-4ab9-869d-fc902051cab3
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5513751c-b4c9-4ab9-869d-fc902051cab3
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_42384cd2-6f18-43a3-ba02-113de45cd7ff/messages","correlationId":"qa-5513751c-b4c9-4ab9-869d-fc902051cab3"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70ce0fd8-d1f9-4f97-92db-416cf6d8b495

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70ce0fd8-d1f9-4f97-92db-416cf6d8b495
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70ce0fd8-d1f9-4f97-92db-416cf6d8b495
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-a592227d-8f8c-4109-aa79-f534366837e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a592227d-8f8c-4109-aa79-f534366837e0
Content-Type: application/json

--- request body ---
{"handle":"qa-902ec6b2a913","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a592227d-8f8c-4109-aa79-f534366837e0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a592227d-8f8c-4109-aa79-f534366837e0"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-9125e864-b814-4e00-aac7-77dc8155f9dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9125e864-b814-4e00-aac7-77dc8155f9dc
Content-Type: application/json

--- request body ---
{"handle":"qa-13238cc98aca","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9125e864-b814-4e00-aac7-77dc8155f9dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5b68fd1-e0df-4406-98b2-368fb96e3982"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e262ed3-270d-4742-9a04-f4987580cf0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e262ed3-270d-4742-9a04-f4987580cf0e
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e262ed3-270d-4742-9a04-f4987580cf0e
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-d3a39a4e-e348-482f-8151-feae2d84959a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3a39a4e-e348-482f-8151-feae2d84959a
Content-Type: application/json

--- request body ---
{"handle":"qa-13238cc98aca","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d3a39a4e-e348-482f-8151-feae2d84959a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d3a39a4e-e348-482f-8151-feae2d84959a"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2a554321-4930-4798-aa92-f61bac14c3ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a554321-4930-4798-aa92-f61bac14c3ba
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2a554321-4930-4798-aa92-f61bac14c3ba
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-b0e86917-9457-43e0-a8c8-6a45cd2b6a5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0e86917-9457-43e0-a8c8-6a45cd2b6a5b
Content-Type: application/json

--- request body ---
{"handle":"qa-af78fd4a9d2d","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0e86917-9457-43e0-a8c8-6a45cd2b6a5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0e86917-9457-43e0-a8c8-6a45cd2b6a5b"}
```
