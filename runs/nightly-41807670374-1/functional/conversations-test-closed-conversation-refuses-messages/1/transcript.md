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
| 1 | `POST /v1/accounts` | 201 | 439 | `qa-f9d159a5-87e7-4d69-b977-46f34f69d107` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-f20ad825-399f-41a4-bfa3-349f95ad76e2` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-31fe8391-14fc-4b85-8341-cfe3f15b6429` |
| 4 | `POST /v1/conversations` | 201 | 65 | `qa-4365f068-3a38-490e-8c0e-9d56634c97d5` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 38 | `qa-0af7bfa5-b718-485e-a19e-74025a9b913f` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-23bf1b0e-a479-400f-a561-01c569726b2b` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 29 | `qa-6fdea7e3-ed9f-45a7-88a8-dcfbc57c9781` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-02cfe362-2173-4e2f-a2c5-43857ec9cca6` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-391bae1b-4a3e-47e9-8fe8-16fec14aa365` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-488a80dd-32f2-4d82-baad-18ebcf3bc8db` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-caf10717-db08-4f16-a86f-0fccbb289891` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f9d159a5-87e7-4d69-b977-46f34f69d107

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9d159a5-87e7-4d69-b977-46f34f69d107
Content-Type: application/json

--- request body ---
{"handle":"qa-20870250e124","displayName":"QA 20870250e124","password":"****","region":"eu"}

--- response: 201 in 439 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9d159a5-87e7-4d69-b977-46f34f69d107
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
Location: /v1/accounts/qa-20870250e124
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b5ca54e-b002-4efc-a664-d9639bbc20ec","handle":"qa-20870250e124","displayName":"QA 20870250e124","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.077472717Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f20ad825-399f-41a4-bfa3-349f95ad76e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f20ad825-399f-41a4-bfa3-349f95ad76e2
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b0f6620ea1","displayName":"QA b8b0f6620ea1","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f20ad825-399f-41a4-bfa3-349f95ad76e2
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
Location: /v1/accounts/qa-b8b0f6620ea1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4cf6f27-c464-4922-a047-c43d4d0ce44f","handle":"qa-b8b0f6620ea1","displayName":"QA b8b0f6620ea1","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.460669879Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-31fe8391-14fc-4b85-8341-cfe3f15b6429

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31fe8391-14fc-4b85-8341-cfe3f15b6429
Content-Type: application/json

--- request body ---
{"handle":"qa-20870250e124","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-31fe8391-14fc-4b85-8341-cfe3f15b6429
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b5ca54e-b002-4efc-a664-d9639bbc20ec"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4365f068-3a38-490e-8c0e-9d56634c97d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4365f068-3a38-490e-8c0e-9d56634c97d5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8b0f6620ea1","subject":"Quick question","message":"Hi"}

--- response: 201 in 65 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4365f068-3a38-490e-8c0e-9d56634c97d5
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
Location: /v1/conversations/cnv_ee5492aa-af5a-4362-984b-fdff355a6f07
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ee5492aa-af5a-4362-984b-fdff355a6f07","subject":"Quick question","status":"open","region":"eu","participants":["qa-20870250e124","qa-b8b0f6620ea1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:14.637407321Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ee5492aa-af5a-4362-984b-fdff355a6f07/close
correlation: qa-0af7bfa5-b718-485e-a19e-74025a9b913f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0af7bfa5-b718-485e-a19e-74025a9b913f
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0af7bfa5-b718-485e-a19e-74025a9b913f
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

{"id":"cnv_ee5492aa-af5a-4362-984b-fdff355a6f07","subject":"Quick question","status":"closed","region":"eu","participants":["qa-20870250e124","qa-b8b0f6620ea1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:14.637407321Z","closedAt":"2026-11-04T09:28:14.747040476Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-23bf1b0e-a479-400f-a561-01c569726b2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23bf1b0e-a479-400f-a561-01c569726b2b
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b0f6620ea1","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-23bf1b0e-a479-400f-a561-01c569726b2b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4cf6f27-c464-4922-a047-c43d4d0ce44f"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ee5492aa-af5a-4362-984b-fdff355a6f07/messages
correlation: qa-6fdea7e3-ed9f-45a7-88a8-dcfbc57c9781

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fdea7e3-ed9f-45a7-88a8-dcfbc57c9781
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fdea7e3-ed9f-45a7-88a8-dcfbc57c9781
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_ee5492aa-af5a-4362-984b-fdff355a6f07/messages","correlationId":"qa-6fdea7e3-ed9f-45a7-88a8-dcfbc57c9781"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02cfe362-2173-4e2f-a2c5-43857ec9cca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02cfe362-2173-4e2f-a2c5-43857ec9cca6
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02cfe362-2173-4e2f-a2c5-43857ec9cca6
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
correlation: qa-391bae1b-4a3e-47e9-8fe8-16fec14aa365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-391bae1b-4a3e-47e9-8fe8-16fec14aa365
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b0f6620ea1","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-391bae1b-4a3e-47e9-8fe8-16fec14aa365
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-391bae1b-4a3e-47e9-8fe8-16fec14aa365"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-488a80dd-32f2-4d82-baad-18ebcf3bc8db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-488a80dd-32f2-4d82-baad-18ebcf3bc8db
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-488a80dd-32f2-4d82-baad-18ebcf3bc8db
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
correlation: qa-caf10717-db08-4f16-a86f-0fccbb289891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caf10717-db08-4f16-a86f-0fccbb289891
Content-Type: application/json

--- request body ---
{"handle":"qa-20870250e124","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-caf10717-db08-4f16-a86f-0fccbb289891
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-caf10717-db08-4f16-a86f-0fccbb289891"}
```
