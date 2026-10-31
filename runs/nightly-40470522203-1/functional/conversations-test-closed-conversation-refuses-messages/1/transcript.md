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
| 1 | `POST /v1/accounts` | 201 | 443 | `qa-7115ed45-fc7d-427b-af5d-ad105d103f47` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-3d40c666-4ee0-4875-93f8-9fbc103c94c7` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-3e0f4249-3f71-4d35-a0ef-e7f5fc91fade` |
| 4 | `POST /v1/conversations` | 201 | 71 | `qa-67d5de76-ce45-4fd7-9776-02d8e146b621` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 29 | `qa-ef8e60cf-efc2-4904-99ac-d237044e3201` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-2d070b39-2a34-49b3-aeb2-630d95ea10de` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 37 | `qa-0321531a-0ff2-42b8-979e-25cb5a5a1969` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b90750a4-b0be-4ccc-abd2-d9fdd642b085` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-1a0060c0-82db-4a37-bf83-6860963a9ba8` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-988a7adb-4457-44cc-a10a-19357f2fff79` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-12b71601-a3b2-48b1-ad65-52ba08c98ef7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7115ed45-fc7d-427b-af5d-ad105d103f47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7115ed45-fc7d-427b-af5d-ad105d103f47
Content-Type: application/json

--- request body ---
{"handle":"qa-fd8dc67d650d","displayName":"QA fd8dc67d650d","password":"****","region":"eu"}

--- response: 201 in 443 ms ---
Date: Tue, 27 Oct 2026 08:00:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-7115ed45-fc7d-427b-af5d-ad105d103f47
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
Location: /v1/accounts/qa-fd8dc67d650d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5cfa491-7297-4a43-be20-97f015a74c53","handle":"qa-fd8dc67d650d","displayName":"QA fd8dc67d650d","region":"eu","role":"user","createdAt":"2026-10-27T08:00:29.829222753Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3d40c666-4ee0-4875-93f8-9fbc103c94c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d40c666-4ee0-4875-93f8-9fbc103c94c7
Content-Type: application/json

--- request body ---
{"handle":"qa-b2328fff188b","displayName":"QA b2328fff188b","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d40c666-4ee0-4875-93f8-9fbc103c94c7
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
Location: /v1/accounts/qa-b2328fff188b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b24992ba-0acf-4a90-a713-67bd6d8829b8","handle":"qa-b2328fff188b","displayName":"QA b2328fff188b","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.266469358Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3e0f4249-3f71-4d35-a0ef-e7f5fc91fade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e0f4249-3f71-4d35-a0ef-e7f5fc91fade
Content-Type: application/json

--- request body ---
{"handle":"qa-fd8dc67d650d","password":"****"}

--- response: 200 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e0f4249-3f71-4d35-a0ef-e7f5fc91fade
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5cfa491-7297-4a43-be20-97f015a74c53"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-67d5de76-ce45-4fd7-9776-02d8e146b621

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67d5de76-ce45-4fd7-9776-02d8e146b621
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b2328fff188b","subject":"Quick question","message":"Hi"}

--- response: 201 in 71 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-67d5de76-ce45-4fd7-9776-02d8e146b621
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
Location: /v1/conversations/cnv_fc377223-7359-4da9-8f02-09defc0a7bea
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fc377223-7359-4da9-8f02-09defc0a7bea","subject":"Quick question","status":"open","region":"eu","participants":["qa-fd8dc67d650d","qa-b2328fff188b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:30.425068470Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_fc377223-7359-4da9-8f02-09defc0a7bea/close
correlation: qa-ef8e60cf-efc2-4904-99ac-d237044e3201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef8e60cf-efc2-4904-99ac-d237044e3201
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef8e60cf-efc2-4904-99ac-d237044e3201
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

{"id":"cnv_fc377223-7359-4da9-8f02-09defc0a7bea","subject":"Quick question","status":"closed","region":"eu","participants":["qa-fd8dc67d650d","qa-b2328fff188b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:30.425068470Z","closedAt":"2026-10-27T08:00:30.589649876Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2d070b39-2a34-49b3-aeb2-630d95ea10de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d070b39-2a34-49b3-aeb2-630d95ea10de
Content-Type: application/json

--- request body ---
{"handle":"qa-b2328fff188b","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d070b39-2a34-49b3-aeb2-630d95ea10de
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b24992ba-0acf-4a90-a713-67bd6d8829b8"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_fc377223-7359-4da9-8f02-09defc0a7bea/messages
correlation: qa-0321531a-0ff2-42b8-979e-25cb5a5a1969

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0321531a-0ff2-42b8-979e-25cb5a5a1969
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0321531a-0ff2-42b8-979e-25cb5a5a1969
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_fc377223-7359-4da9-8f02-09defc0a7bea/messages","correlationId":"qa-0321531a-0ff2-42b8-979e-25cb5a5a1969"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b90750a4-b0be-4ccc-abd2-d9fdd642b085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b90750a4-b0be-4ccc-abd2-d9fdd642b085
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b90750a4-b0be-4ccc-abd2-d9fdd642b085
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
correlation: qa-1a0060c0-82db-4a37-bf83-6860963a9ba8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a0060c0-82db-4a37-bf83-6860963a9ba8
Content-Type: application/json

--- request body ---
{"handle":"qa-b2328fff188b","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a0060c0-82db-4a37-bf83-6860963a9ba8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a0060c0-82db-4a37-bf83-6860963a9ba8"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-988a7adb-4457-44cc-a10a-19357f2fff79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-988a7adb-4457-44cc-a10a-19357f2fff79
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-988a7adb-4457-44cc-a10a-19357f2fff79
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
correlation: qa-12b71601-a3b2-48b1-ad65-52ba08c98ef7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12b71601-a3b2-48b1-ad65-52ba08c98ef7
Content-Type: application/json

--- request body ---
{"handle":"qa-fd8dc67d650d","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12b71601-a3b2-48b1-ad65-52ba08c98ef7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12b71601-a3b2-48b1-ad65-52ba08c98ef7"}
```
