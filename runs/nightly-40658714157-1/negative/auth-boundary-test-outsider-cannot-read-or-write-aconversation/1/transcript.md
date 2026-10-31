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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-ea108fa8-e87e-4cf1-bc59-d22e4e35cea4` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-350c2a2e-480e-4e3e-8a55-460d281c4596` |
| 3 | `POST /v1/accounts` | 201 | 13 | `qa-5c67d08c-2c6d-4a68-bc35-e634e90f1883` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-466604c6-0dc9-430f-b05c-79d7f8a4afd2` |
| 5 | `POST /v1/conversations` | 201 | 14 | `qa-44b42616-3405-4ed4-a782-5c0010a74cb4` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-f6dd2c89-441b-44c3-9ef3-c447ca3317d6` |
| 7 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-07fb9241-bc10-4bde-9c40-1d28dcfc97b4` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 8 | `qa-b05cf1b0-78cb-4dbc-ac49-048120d6c837` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 10 | `qa-a1d11ddd-582f-4e0d-9c0a-a0d04b7b493e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-a814626b-6b23-4c7e-b55e-9e3a3a185b84` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-a9649ab9-2208-493b-a14f-9a331c2bf32f` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-1f370ab2-1ab6-4ce8-ba80-30af69c7e2b2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-9b138c40-7e43-47ac-9c46-a57dbf3bca60` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-5b1d183c-de12-4a81-8807-e9d90d5083d8` |
| 15 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-c40c9c1b-8e64-47a8-a489-f19a7f0d894e` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-dccb1d81-4127-4656-9b56-61ac66490652` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea108fa8-e87e-4cf1-bc59-d22e4e35cea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea108fa8-e87e-4cf1-bc59-d22e4e35cea4
Content-Type: application/json

--- request body ---
{"handle":"qa-44bdc0918d5b","displayName":"QA 44bdc0918d5b","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea108fa8-e87e-4cf1-bc59-d22e4e35cea4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-44bdc0918d5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ba50c2c-8ea2-488a-b962-b1de17324a3b","handle":"qa-44bdc0918d5b","displayName":"QA 44bdc0918d5b","region":"eu","role":"user","createdAt":"2026-10-28T08:42:59.913500031Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-350c2a2e-480e-4e3e-8a55-460d281c4596

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-350c2a2e-480e-4e3e-8a55-460d281c4596
Content-Type: application/json

--- request body ---
{"handle":"qa-25b2401924d1","displayName":"QA 25b2401924d1","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-350c2a2e-480e-4e3e-8a55-460d281c4596
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-25b2401924d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b8e853b-ed2c-4945-9e4f-7003b8eec5e8","handle":"qa-25b2401924d1","displayName":"QA 25b2401924d1","region":"eu","role":"user","createdAt":"2026-10-28T08:42:59.956147038Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-5c67d08c-2c6d-4a68-bc35-e634e90f1883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c67d08c-2c6d-4a68-bc35-e634e90f1883
Content-Type: application/json

--- request body ---
{"handle":"qa-d89891b46c41","displayName":"QA d89891b46c41","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c67d08c-2c6d-4a68-bc35-e634e90f1883
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-d89891b46c41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aba702b4-a6e9-47eb-8e9d-fc48c5d3db31","handle":"qa-d89891b46c41","displayName":"QA d89891b46c41","region":"eu","role":"user","createdAt":"2026-10-28T08:42:59.977750083Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-466604c6-0dc9-430f-b05c-79d7f8a4afd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466604c6-0dc9-430f-b05c-79d7f8a4afd2
Content-Type: application/json

--- request body ---
{"handle":"qa-44bdc0918d5b","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-466604c6-0dc9-430f-b05c-79d7f8a4afd2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ba50c2c-8ea2-488a-b962-b1de17324a3b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-44b42616-3405-4ed4-a782-5c0010a74cb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44b42616-3405-4ed4-a782-5c0010a74cb4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-25b2401924d1","subject":"Private","message":"Just us"}

--- response: 201 in 14 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-44b42616-3405-4ed4-a782-5c0010a74cb4
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
Location: /v1/conversations/cnv_ffc8a688-4c33-48e1-80c1-206e83c5354f
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_ffc8a688-4c33-48e1-80c1-206e83c5354f","subject":"Private","status":"open","region":"eu","participants":["qa-44bdc0918d5b","qa-25b2401924d1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:43:00.034168137Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f6dd2c89-441b-44c3-9ef3-c447ca3317d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6dd2c89-441b-44c3-9ef3-c447ca3317d6
Content-Type: application/json

--- request body ---
{"handle":"qa-d89891b46c41","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6dd2c89-441b-44c3-9ef3-c447ca3317d6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aba702b4-a6e9-47eb-8e9d-fc48c5d3db31"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_ffc8a688-4c33-48e1-80c1-206e83c5354f
correlation: qa-07fb9241-bc10-4bde-9c40-1d28dcfc97b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07fb9241-bc10-4bde-9c40-1d28dcfc97b4
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07fb9241-bc10-4bde-9c40-1d28dcfc97b4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ffc8a688-4c33-48e1-80c1-206e83c5354f","correlationId":"qa-07fb9241-bc10-4bde-9c40-1d28dcfc97b4"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_ffc8a688-4c33-48e1-80c1-206e83c5354f/messages
correlation: qa-b05cf1b0-78cb-4dbc-ac49-048120d6c837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b05cf1b0-78cb-4dbc-ac49-048120d6c837
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b05cf1b0-78cb-4dbc-ac49-048120d6c837
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ffc8a688-4c33-48e1-80c1-206e83c5354f/messages","correlationId":"qa-b05cf1b0-78cb-4dbc-ac49-048120d6c837"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_ffc8a688-4c33-48e1-80c1-206e83c5354f/messages
correlation: qa-a1d11ddd-582f-4e0d-9c0a-a0d04b7b493e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1d11ddd-582f-4e0d-9c0a-a0d04b7b493e
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 10 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1d11ddd-582f-4e0d-9c0a-a0d04b7b493e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ffc8a688-4c33-48e1-80c1-206e83c5354f/messages","correlationId":"qa-a1d11ddd-582f-4e0d-9c0a-a0d04b7b493e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a814626b-6b23-4c7e-b55e-9e3a3a185b84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a814626b-6b23-4c7e-b55e-9e3a3a185b84
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a814626b-6b23-4c7e-b55e-9e3a3a185b84
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
correlation: qa-a9649ab9-2208-493b-a14f-9a331c2bf32f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9649ab9-2208-493b-a14f-9a331c2bf32f
Content-Type: application/json

--- request body ---
{"handle":"qa-d89891b46c41","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9649ab9-2208-493b-a14f-9a331c2bf32f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9649ab9-2208-493b-a14f-9a331c2bf32f"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-1f370ab2-1ab6-4ce8-ba80-30af69c7e2b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f370ab2-1ab6-4ce8-ba80-30af69c7e2b2
Content-Type: application/json

--- request body ---
{"handle":"qa-25b2401924d1","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f370ab2-1ab6-4ce8-ba80-30af69c7e2b2
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b8e853b-ed2c-4945-9e4f-7003b8eec5e8"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b138c40-7e43-47ac-9c46-a57dbf3bca60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b138c40-7e43-47ac-9c46-a57dbf3bca60
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b138c40-7e43-47ac-9c46-a57dbf3bca60
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
correlation: qa-5b1d183c-de12-4a81-8807-e9d90d5083d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b1d183c-de12-4a81-8807-e9d90d5083d8
Content-Type: application/json

--- request body ---
{"handle":"qa-25b2401924d1","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b1d183c-de12-4a81-8807-e9d90d5083d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b1d183c-de12-4a81-8807-e9d90d5083d8"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c40c9c1b-8e64-47a8-a489-f19a7f0d894e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40c9c1b-8e64-47a8-a489-f19a7f0d894e
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c40c9c1b-8e64-47a8-a489-f19a7f0d894e
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
correlation: qa-dccb1d81-4127-4656-9b56-61ac66490652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dccb1d81-4127-4656-9b56-61ac66490652
Content-Type: application/json

--- request body ---
{"handle":"qa-44bdc0918d5b","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dccb1d81-4127-4656-9b56-61ac66490652
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dccb1d81-4127-4656-9b56-61ac66490652"}
```
