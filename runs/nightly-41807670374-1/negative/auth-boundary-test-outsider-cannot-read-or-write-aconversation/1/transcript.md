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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-5a9be454-858c-4819-91e4-e9c0232c14d4` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-6bf1164a-3640-41de-8be2-3c635f4de5b1` |
| 3 | `POST /v1/accounts` | 201 | 38 | `qa-e77201ee-77b8-499f-b473-b37af8a3856b` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-d553715e-9e39-4924-9623-9512a54e968b` |
| 5 | `POST /v1/conversations` | 201 | 54 | `qa-1bc31f1e-a040-4063-a054-f0182cb59d49` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-2da05209-ae28-43c2-ae48-2f83e9c3fead` |
| 7 | `GET /v1/conversations/{id}` | 403 | 15 | `qa-e5ccedf6-4983-4b32-b29a-9ce67b5132d4` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 8 | `qa-29504cb0-9571-498e-a5ff-d89a78dd980e` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 13 | `qa-122b3a08-8cc9-4255-9325-15340f2d9bbb` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b0a20abd-05bf-4018-b47a-98ca4cf12306` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-77d3e805-c276-4d45-873f-cdc50cc003c0` |
| 12 | `POST /v1/auth/token` | 200 | 21 | `qa-0cc88615-e37b-4434-a1a8-593543fa20c5` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-95401b77-4a54-4dd4-8f3a-bde8d42ab131` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-a17ff7d9-7692-4fae-97a0-9fb92d382cc2` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-3ae37b31-0785-4f99-93a8-3407a816f9a5` |
| 16 | `POST /v1/auth/token` | 401 | 13 | `qa-7021d2c7-3f2c-451c-8410-bf043458241a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5a9be454-858c-4819-91e4-e9c0232c14d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a9be454-858c-4819-91e4-e9c0232c14d4
Content-Type: application/json

--- request body ---
{"handle":"qa-f03c52e95899","displayName":"QA f03c52e95899","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a9be454-858c-4819-91e4-e9c0232c14d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Location: /v1/accounts/qa-f03c52e95899
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08e2898a-5bf9-4985-a9ef-ac0f5550b798","handle":"qa-f03c52e95899","displayName":"QA f03c52e95899","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.934073906Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6bf1164a-3640-41de-8be2-3c635f4de5b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bf1164a-3640-41de-8be2-3c635f4de5b1
Content-Type: application/json

--- request body ---
{"handle":"qa-20ffe32a1521","displayName":"QA 20ffe32a1521","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bf1164a-3640-41de-8be2-3c635f4de5b1
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
Location: /v1/accounts/qa-20ffe32a1521
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6805b299-1c43-4446-aaca-899b6d8137f1","handle":"qa-20ffe32a1521","displayName":"QA 20ffe32a1521","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.979031610Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e77201ee-77b8-499f-b473-b37af8a3856b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e77201ee-77b8-499f-b473-b37af8a3856b
Content-Type: application/json

--- request body ---
{"handle":"qa-5034534f9d80","displayName":"QA 5034534f9d80","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e77201ee-77b8-499f-b473-b37af8a3856b
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
Location: /v1/accounts/qa-5034534f9d80
X-Served-Region: eu
Content-Length: 181

{"id":"acc_976a0a50-dfd6-4cda-aed2-f2f03e41da79","handle":"qa-5034534f9d80","displayName":"QA 5034534f9d80","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.015725772Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d553715e-9e39-4924-9623-9512a54e968b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d553715e-9e39-4924-9623-9512a54e968b
Content-Type: application/json

--- request body ---
{"handle":"qa-f03c52e95899","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d553715e-9e39-4924-9623-9512a54e968b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08e2898a-5bf9-4985-a9ef-ac0f5550b798"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1bc31f1e-a040-4063-a054-f0182cb59d49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bc31f1e-a040-4063-a054-f0182cb59d49
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-20ffe32a1521","subject":"Private","message":"Just us"}

--- response: 201 in 54 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bc31f1e-a040-4063-a054-f0182cb59d49
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
Location: /v1/conversations/cnv_95afe3b0-60f4-4daf-aa04-a7f23c89b9bb
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_95afe3b0-60f4-4daf-aa04-a7f23c89b9bb","subject":"Private","status":"open","region":"eu","participants":["qa-f03c52e95899","qa-20ffe32a1521"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:15.099228159Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2da05209-ae28-43c2-ae48-2f83e9c3fead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2da05209-ae28-43c2-ae48-2f83e9c3fead
Content-Type: application/json

--- request body ---
{"handle":"qa-5034534f9d80","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2da05209-ae28-43c2-ae48-2f83e9c3fead
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_976a0a50-dfd6-4cda-aed2-f2f03e41da79"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_95afe3b0-60f4-4daf-aa04-a7f23c89b9bb
correlation: qa-e5ccedf6-4983-4b32-b29a-9ce67b5132d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5ccedf6-4983-4b32-b29a-9ce67b5132d4
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5ccedf6-4983-4b32-b29a-9ce67b5132d4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_95afe3b0-60f4-4daf-aa04-a7f23c89b9bb","correlationId":"qa-e5ccedf6-4983-4b32-b29a-9ce67b5132d4"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_95afe3b0-60f4-4daf-aa04-a7f23c89b9bb/messages
correlation: qa-29504cb0-9571-498e-a5ff-d89a78dd980e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29504cb0-9571-498e-a5ff-d89a78dd980e
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29504cb0-9571-498e-a5ff-d89a78dd980e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_95afe3b0-60f4-4daf-aa04-a7f23c89b9bb/messages","correlationId":"qa-29504cb0-9571-498e-a5ff-d89a78dd980e"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_95afe3b0-60f4-4daf-aa04-a7f23c89b9bb/messages
correlation: qa-122b3a08-8cc9-4255-9325-15340f2d9bbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-122b3a08-8cc9-4255-9325-15340f2d9bbb
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-122b3a08-8cc9-4255-9325-15340f2d9bbb
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_95afe3b0-60f4-4daf-aa04-a7f23c89b9bb/messages","correlationId":"qa-122b3a08-8cc9-4255-9325-15340f2d9bbb"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b0a20abd-05bf-4018-b47a-98ca4cf12306

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0a20abd-05bf-4018-b47a-98ca4cf12306
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b0a20abd-05bf-4018-b47a-98ca4cf12306
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
correlation: qa-77d3e805-c276-4d45-873f-cdc50cc003c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77d3e805-c276-4d45-873f-cdc50cc003c0
Content-Type: application/json

--- request body ---
{"handle":"qa-5034534f9d80","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77d3e805-c276-4d45-873f-cdc50cc003c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-77d3e805-c276-4d45-873f-cdc50cc003c0"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-0cc88615-e37b-4434-a1a8-593543fa20c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cc88615-e37b-4434-a1a8-593543fa20c5
Content-Type: application/json

--- request body ---
{"handle":"qa-20ffe32a1521","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cc88615-e37b-4434-a1a8-593543fa20c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6805b299-1c43-4446-aaca-899b6d8137f1"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95401b77-4a54-4dd4-8f3a-bde8d42ab131

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95401b77-4a54-4dd4-8f3a-bde8d42ab131
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95401b77-4a54-4dd4-8f3a-bde8d42ab131
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
correlation: qa-a17ff7d9-7692-4fae-97a0-9fb92d382cc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a17ff7d9-7692-4fae-97a0-9fb92d382cc2
Content-Type: application/json

--- request body ---
{"handle":"qa-20ffe32a1521","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a17ff7d9-7692-4fae-97a0-9fb92d382cc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a17ff7d9-7692-4fae-97a0-9fb92d382cc2"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ae37b31-0785-4f99-93a8-3407a816f9a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ae37b31-0785-4f99-93a8-3407a816f9a5
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ae37b31-0785-4f99-93a8-3407a816f9a5
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
correlation: qa-7021d2c7-3f2c-451c-8410-bf043458241a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7021d2c7-3f2c-451c-8410-bf043458241a
Content-Type: application/json

--- request body ---
{"handle":"qa-f03c52e95899","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7021d2c7-3f2c-451c-8410-bf043458241a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7021d2c7-3f2c-451c-8410-bf043458241a"}
```
