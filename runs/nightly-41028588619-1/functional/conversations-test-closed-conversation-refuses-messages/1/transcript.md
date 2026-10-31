# Transcript: A closed conversation refuses new messages with 409

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#closedConversationRefusesMessages` |
| Features | FEAT-CONV-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 344 | `qa-f8c2533c-f171-43a7-ae4c-ba9d85561f7f` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-6c8e6626-066a-4c59-a0f0-e5712729bf04` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-3f3ea847-610b-4f71-9ae0-29d4f7fe8e31` |
| 4 | `POST /v1/conversations` | 201 | 46 | `qa-b928431a-a029-4739-9be4-f7801ba20fb2` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 12 | `qa-138be290-6add-46d6-b591-9548f91383b3` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-d4dda512-f467-4fdc-b2f8-d6c90126129f` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 17 | `qa-6d2afb87-5228-4dc4-b09c-7ecab925c62f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-36b0841a-840f-4936-825f-19db5d33e578` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-cb5432e6-4bc4-4d20-ae46-1684deba5e26` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-8a2d0432-a97e-431e-9d61-65cbb35ef447` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-e54bbed7-217c-44f0-bbd4-41696ddd379e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f8c2533c-f171-43a7-ae4c-ba9d85561f7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8c2533c-f171-43a7-ae4c-ba9d85561f7f
Content-Type: application/json

--- request body ---
{"handle":"qa-f29909138d72","displayName":"QA f29909138d72","password":"****","region":"eu"}

--- response: 201 in 344 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8c2533c-f171-43a7-ae4c-ba9d85561f7f
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
Location: /v1/accounts/qa-f29909138d72
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc8470a5-4e8c-4ce9-8dd9-d918157a7cea","handle":"qa-f29909138d72","displayName":"QA f29909138d72","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.174713024Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6c8e6626-066a-4c59-a0f0-e5712729bf04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c8e6626-066a-4c59-a0f0-e5712729bf04
Content-Type: application/json

--- request body ---
{"handle":"qa-54ce1146938c","displayName":"QA 54ce1146938c","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c8e6626-066a-4c59-a0f0-e5712729bf04
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
Location: /v1/accounts/qa-54ce1146938c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f464446-2ccd-4887-9637-c4ca2d0b9b2e","handle":"qa-54ce1146938c","displayName":"QA 54ce1146938c","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.429444112Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3f3ea847-610b-4f71-9ae0-29d4f7fe8e31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f3ea847-610b-4f71-9ae0-29d4f7fe8e31
Content-Type: application/json

--- request body ---
{"handle":"qa-f29909138d72","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f3ea847-610b-4f71-9ae0-29d4f7fe8e31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc8470a5-4e8c-4ce9-8dd9-d918157a7cea"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b928431a-a029-4739-9be4-f7801ba20fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b928431a-a029-4739-9be4-f7801ba20fb2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-54ce1146938c","subject":"Quick question","message":"Hi"}

--- response: 201 in 46 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b928431a-a029-4739-9be4-f7801ba20fb2
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
Location: /v1/conversations/cnv_43ad784d-236d-4068-938f-6655261b246d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_43ad784d-236d-4068-938f-6655261b246d","subject":"Quick question","status":"open","region":"eu","participants":["qa-f29909138d72","qa-54ce1146938c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.553931307Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_43ad784d-236d-4068-938f-6655261b246d/close
correlation: qa-138be290-6add-46d6-b591-9548f91383b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-138be290-6add-46d6-b591-9548f91383b3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-138be290-6add-46d6-b591-9548f91383b3
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
Content-Length: 283

{"id":"cnv_43ad784d-236d-4068-938f-6655261b246d","subject":"Quick question","status":"closed","region":"eu","participants":["qa-f29909138d72","qa-54ce1146938c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.553931307Z","closedAt":"2026-10-30T08:46:04.630926962Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d4dda512-f467-4fdc-b2f8-d6c90126129f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4dda512-f467-4fdc-b2f8-d6c90126129f
Content-Type: application/json

--- request body ---
{"handle":"qa-54ce1146938c","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4dda512-f467-4fdc-b2f8-d6c90126129f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f464446-2ccd-4887-9637-c4ca2d0b9b2e"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_43ad784d-236d-4068-938f-6655261b246d/messages
correlation: qa-6d2afb87-5228-4dc4-b09c-7ecab925c62f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d2afb87-5228-4dc4-b09c-7ecab925c62f
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d2afb87-5228-4dc4-b09c-7ecab925c62f
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
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_43ad784d-236d-4068-938f-6655261b246d/messages","correlationId":"qa-6d2afb87-5228-4dc4-b09c-7ecab925c62f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36b0841a-840f-4936-825f-19db5d33e578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36b0841a-840f-4936-825f-19db5d33e578
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36b0841a-840f-4936-825f-19db5d33e578
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
correlation: qa-cb5432e6-4bc4-4d20-ae46-1684deba5e26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb5432e6-4bc4-4d20-ae46-1684deba5e26
Content-Type: application/json

--- request body ---
{"handle":"qa-54ce1146938c","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb5432e6-4bc4-4d20-ae46-1684deba5e26
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb5432e6-4bc4-4d20-ae46-1684deba5e26"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8a2d0432-a97e-431e-9d61-65cbb35ef447

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a2d0432-a97e-431e-9d61-65cbb35ef447
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8a2d0432-a97e-431e-9d61-65cbb35ef447
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
correlation: qa-e54bbed7-217c-44f0-bbd4-41696ddd379e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e54bbed7-217c-44f0-bbd4-41696ddd379e
Content-Type: application/json

--- request body ---
{"handle":"qa-f29909138d72","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e54bbed7-217c-44f0-bbd4-41696ddd379e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e54bbed7-217c-44f0-bbd4-41696ddd379e"}
```
