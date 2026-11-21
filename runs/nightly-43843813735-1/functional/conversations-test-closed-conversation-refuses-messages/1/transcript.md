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
| 1 | `POST /v1/accounts` | 201 | 406 | `qa-47529901-44fc-4ff1-a562-d3f35233ec56` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-a1128f5f-abe8-4a99-b78c-e1d297bda76a` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-2d6d88e1-9b98-4b8e-9f22-cc57909f29be` |
| 4 | `POST /v1/conversations` | 201 | 49 | `qa-e8a3ab82-3e76-4fb7-8251-73e1a4a890ea` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 24 | `qa-f56868ed-5938-49fd-9a44-3543d327dd8f` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-6210a8e4-8fb4-44f3-bff1-60610a49d373` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 36 | `qa-ae359c83-76ef-4005-9e67-f29ec43bda3f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ba14ae10-d9a5-48c6-834c-7a53bf65626b` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-df94841e-281c-4a32-bb11-9f89b7e3869e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-6954801f-040b-4df6-b624-51137eeb13ae` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-7c89e268-c011-4974-b602-1dbd83a95589` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-47529901-44fc-4ff1-a562-d3f35233ec56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47529901-44fc-4ff1-a562-d3f35233ec56
Content-Type: application/json

--- request body ---
{"handle":"qa-b1c512b6d566","displayName":"QA b1c512b6d566","password":"****","region":"eu"}

--- response: 201 in 406 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-47529901-44fc-4ff1-a562-d3f35233ec56
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
Location: /v1/accounts/qa-b1c512b6d566
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ab6cd5d-1610-4de7-a24d-a5de61cf03fd","handle":"qa-b1c512b6d566","displayName":"QA b1c512b6d566","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.784065677Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1128f5f-abe8-4a99-b78c-e1d297bda76a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1128f5f-abe8-4a99-b78c-e1d297bda76a
Content-Type: application/json

--- request body ---
{"handle":"qa-76b83f57c10d","displayName":"QA 76b83f57c10d","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1128f5f-abe8-4a99-b78c-e1d297bda76a
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
Location: /v1/accounts/qa-76b83f57c10d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b22633d-909a-437b-878f-d474d87b66ef","handle":"qa-76b83f57c10d","displayName":"QA 76b83f57c10d","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.198972343Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2d6d88e1-9b98-4b8e-9f22-cc57909f29be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d6d88e1-9b98-4b8e-9f22-cc57909f29be
Content-Type: application/json

--- request body ---
{"handle":"qa-b1c512b6d566","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d6d88e1-9b98-4b8e-9f22-cc57909f29be
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ab6cd5d-1610-4de7-a24d-a5de61cf03fd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e8a3ab82-3e76-4fb7-8251-73e1a4a890ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8a3ab82-3e76-4fb7-8251-73e1a4a890ea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-76b83f57c10d","subject":"Quick question","message":"Hi"}

--- response: 201 in 49 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8a3ab82-3e76-4fb7-8251-73e1a4a890ea
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
Location: /v1/conversations/cnv_587e4d36-9716-4902-8dc1-a751a618f2bd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_587e4d36-9716-4902-8dc1-a751a618f2bd","subject":"Quick question","status":"open","region":"eu","participants":["qa-b1c512b6d566","qa-76b83f57c10d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.333327231Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_587e4d36-9716-4902-8dc1-a751a618f2bd/close
correlation: qa-f56868ed-5938-49fd-9a44-3543d327dd8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f56868ed-5938-49fd-9a44-3543d327dd8f
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f56868ed-5938-49fd-9a44-3543d327dd8f
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

{"id":"cnv_587e4d36-9716-4902-8dc1-a751a618f2bd","subject":"Quick question","status":"closed","region":"eu","participants":["qa-b1c512b6d566","qa-76b83f57c10d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.333327231Z","closedAt":"2026-11-16T09:53:52.469005254Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6210a8e4-8fb4-44f3-bff1-60610a49d373

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6210a8e4-8fb4-44f3-bff1-60610a49d373
Content-Type: application/json

--- request body ---
{"handle":"qa-76b83f57c10d","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-6210a8e4-8fb4-44f3-bff1-60610a49d373
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b22633d-909a-437b-878f-d474d87b66ef"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_587e4d36-9716-4902-8dc1-a751a618f2bd/messages
correlation: qa-ae359c83-76ef-4005-9e67-f29ec43bda3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae359c83-76ef-4005-9e67-f29ec43bda3f
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 36 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae359c83-76ef-4005-9e67-f29ec43bda3f
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_587e4d36-9716-4902-8dc1-a751a618f2bd/messages","correlationId":"qa-ae359c83-76ef-4005-9e67-f29ec43bda3f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba14ae10-d9a5-48c6-834c-7a53bf65626b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba14ae10-d9a5-48c6-834c-7a53bf65626b
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba14ae10-d9a5-48c6-834c-7a53bf65626b
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
correlation: qa-df94841e-281c-4a32-bb11-9f89b7e3869e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df94841e-281c-4a32-bb11-9f89b7e3869e
Content-Type: application/json

--- request body ---
{"handle":"qa-76b83f57c10d","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df94841e-281c-4a32-bb11-9f89b7e3869e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df94841e-281c-4a32-bb11-9f89b7e3869e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6954801f-040b-4df6-b624-51137eeb13ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6954801f-040b-4df6-b624-51137eeb13ae
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6954801f-040b-4df6-b624-51137eeb13ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-7c89e268-c011-4974-b602-1dbd83a95589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c89e268-c011-4974-b602-1dbd83a95589
Content-Type: application/json

--- request body ---
{"handle":"qa-b1c512b6d566","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c89e268-c011-4974-b602-1dbd83a95589
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c89e268-c011-4974-b602-1dbd83a95589"}
```
