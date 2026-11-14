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
| 1 | `POST /v1/accounts` | 201 | 504 | `qa-75ee2222-59ee-4c3d-ad17-7304e11f83ca` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-5743b7fb-9b9e-44cf-bd8d-0aeb3e6f90fa` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-6fe65047-661d-4ce2-9b3d-f66712da8a8f` |
| 4 | `POST /v1/conversations` | 201 | 68 | `qa-7136d6a7-e667-48a3-865a-4c341c59aa3f` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 40 | `qa-5b40e34a-1528-4ee1-9427-9afd94189d1b` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-8f2bd53e-e5e8-4a48-be5b-19561e84d9d4` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 21 | `qa-96572f9c-45b6-46b6-a476-c6664b134c2e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-dee4cdcd-8b78-4eb2-a5d7-191d87cb928b` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-8171ef89-834a-4c55-b340-69e9736d5862` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-a7865d91-6c10-4ae5-87ee-f43eab3bf51d` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-8ccc404e-8f1f-4a8e-a9ba-4ab98562e40c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75ee2222-59ee-4c3d-ad17-7304e11f83ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75ee2222-59ee-4c3d-ad17-7304e11f83ca
Content-Type: application/json

--- request body ---
{"handle":"qa-e2469f9b808e","displayName":"QA e2469f9b808e","password":"****","region":"eu"}

--- response: 201 in 504 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-75ee2222-59ee-4c3d-ad17-7304e11f83ca
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
Location: /v1/accounts/qa-e2469f9b808e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41a8ce68-792b-4911-98ef-5c2f4345aa2d","handle":"qa-e2469f9b808e","displayName":"QA e2469f9b808e","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.385732666Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5743b7fb-9b9e-44cf-bd8d-0aeb3e6f90fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5743b7fb-9b9e-44cf-bd8d-0aeb3e6f90fa
Content-Type: application/json

--- request body ---
{"handle":"qa-3b25f41fd557","displayName":"QA 3b25f41fd557","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-5743b7fb-9b9e-44cf-bd8d-0aeb3e6f90fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-3b25f41fd557
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5562f46-c3b8-4a93-a6f8-fae4c98f46d0","handle":"qa-3b25f41fd557","displayName":"QA 3b25f41fd557","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.816734266Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6fe65047-661d-4ce2-9b3d-f66712da8a8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fe65047-661d-4ce2-9b3d-f66712da8a8f
Content-Type: application/json

--- request body ---
{"handle":"qa-e2469f9b808e","password":"****"}

--- response: 200 in 40 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fe65047-661d-4ce2-9b3d-f66712da8a8f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41a8ce68-792b-4911-98ef-5c2f4345aa2d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7136d6a7-e667-48a3-865a-4c341c59aa3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7136d6a7-e667-48a3-865a-4c341c59aa3f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3b25f41fd557","subject":"Quick question","message":"Hi"}

--- response: 201 in 68 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7136d6a7-e667-48a3-865a-4c341c59aa3f
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
Location: /v1/conversations/cnv_ad371a3d-e697-4720-aa53-f43f4aa7b71b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ad371a3d-e697-4720-aa53-f43f4aa7b71b","subject":"Quick question","status":"open","region":"eu","participants":["qa-e2469f9b808e","qa-3b25f41fd557"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:51.980325635Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ad371a3d-e697-4720-aa53-f43f4aa7b71b/close
correlation: qa-5b40e34a-1528-4ee1-9427-9afd94189d1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b40e34a-1528-4ee1-9427-9afd94189d1b
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b40e34a-1528-4ee1-9427-9afd94189d1b
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

{"id":"cnv_ad371a3d-e697-4720-aa53-f43f4aa7b71b","subject":"Quick question","status":"closed","region":"eu","participants":["qa-e2469f9b808e","qa-3b25f41fd557"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:51.980325635Z","closedAt":"2026-11-05T09:37:52.115007361Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8f2bd53e-e5e8-4a48-be5b-19561e84d9d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2bd53e-e5e8-4a48-be5b-19561e84d9d4
Content-Type: application/json

--- request body ---
{"handle":"qa-3b25f41fd557","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f2bd53e-e5e8-4a48-be5b-19561e84d9d4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5562f46-c3b8-4a93-a6f8-fae4c98f46d0"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ad371a3d-e697-4720-aa53-f43f4aa7b71b/messages
correlation: qa-96572f9c-45b6-46b6-a476-c6664b134c2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96572f9c-45b6-46b6-a476-c6664b134c2e
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96572f9c-45b6-46b6-a476-c6664b134c2e
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_ad371a3d-e697-4720-aa53-f43f4aa7b71b/messages","correlationId":"qa-96572f9c-45b6-46b6-a476-c6664b134c2e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dee4cdcd-8b78-4eb2-a5d7-191d87cb928b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dee4cdcd-8b78-4eb2-a5d7-191d87cb928b
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dee4cdcd-8b78-4eb2-a5d7-191d87cb928b
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
correlation: qa-8171ef89-834a-4c55-b340-69e9736d5862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8171ef89-834a-4c55-b340-69e9736d5862
Content-Type: application/json

--- request body ---
{"handle":"qa-3b25f41fd557","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8171ef89-834a-4c55-b340-69e9736d5862
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8171ef89-834a-4c55-b340-69e9736d5862"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7865d91-6c10-4ae5-87ee-f43eab3bf51d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7865d91-6c10-4ae5-87ee-f43eab3bf51d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7865d91-6c10-4ae5-87ee-f43eab3bf51d
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
correlation: qa-8ccc404e-8f1f-4a8e-a9ba-4ab98562e40c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ccc404e-8f1f-4a8e-a9ba-4ab98562e40c
Content-Type: application/json

--- request body ---
{"handle":"qa-e2469f9b808e","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ccc404e-8f1f-4a8e-a9ba-4ab98562e40c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ccc404e-8f1f-4a8e-a9ba-4ab98562e40c"}
```
