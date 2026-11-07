# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 348 | `qa-2a0d5f9f-2be3-4b75-8f57-0edd051a0ce1` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-07ab23fe-99d6-4851-864b-ea3580f6eca9` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-fb313841-f598-43c7-96ee-aef314196548` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-4995eeb1-c661-4374-b41e-c03cc1c388cb` |
| 5 | `POST /v1/auth/token` | 200 | 22 | `qa-fa973c3c-1ac0-4b27-8ffe-67b08398a20c` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-555f59e0-fffc-4bc7-adf5-9ab81139b391` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 15 | `qa-757b4c4f-7386-46f5-86c1-0b4d026d05d9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3409ded1-421c-48d1-a32e-89a223ec973b` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-5cedd86f-75db-4acb-9122-cc01332812e8` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-84c706cc-14b0-4624-93f6-cb901fabedab` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-dc43114b-5d54-4157-bbd9-869ccfb12148` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2a0d5f9f-2be3-4b75-8f57-0edd051a0ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a0d5f9f-2be3-4b75-8f57-0edd051a0ce1
Content-Type: application/json

--- request body ---
{"handle":"qa-8c0ad5f04ece","displayName":"QA 8c0ad5f04ece","password":"****","region":"eu"}

--- response: 201 in 348 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a0d5f9f-2be3-4b75-8f57-0edd051a0ce1
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
Location: /v1/accounts/qa-8c0ad5f04ece
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3cf7877e-0b3d-4c29-bf3f-3a518e5fe650","handle":"qa-8c0ad5f04ece","displayName":"QA 8c0ad5f04ece","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.541487398Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-07ab23fe-99d6-4851-864b-ea3580f6eca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07ab23fe-99d6-4851-864b-ea3580f6eca9
Content-Type: application/json

--- request body ---
{"handle":"qa-d78aba5c96f4","displayName":"QA d78aba5c96f4","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-07ab23fe-99d6-4851-864b-ea3580f6eca9
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
Location: /v1/accounts/qa-d78aba5c96f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2b9f6a5-1c90-437a-8cbe-de714e24cd36","handle":"qa-d78aba5c96f4","displayName":"QA d78aba5c96f4","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.890408896Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fb313841-f598-43c7-96ee-aef314196548

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb313841-f598-43c7-96ee-aef314196548
Content-Type: application/json

--- request body ---
{"handle":"qa-8c0ad5f04ece","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb313841-f598-43c7-96ee-aef314196548
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3cf7877e-0b3d-4c29-bf3f-3a518e5fe650"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4995eeb1-c661-4374-b41e-c03cc1c388cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4995eeb1-c661-4374-b41e-c03cc1c388cb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d78aba5c96f4","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 48 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4995eeb1-c661-4374-b41e-c03cc1c388cb
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
Location: /v1/conversations/cnv_18184b4f-0a77-4325-8208-b78d26c82d86
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_18184b4f-0a77-4325-8208-b78d26c82d86","subject":"Lunch?","status":"open","region":"eu","participants":["qa-8c0ad5f04ece","qa-d78aba5c96f4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:14.029370051Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fa973c3c-1ac0-4b27-8ffe-67b08398a20c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa973c3c-1ac0-4b27-8ffe-67b08398a20c
Content-Type: application/json

--- request body ---
{"handle":"qa-d78aba5c96f4","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa973c3c-1ac0-4b27-8ffe-67b08398a20c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2b9f6a5-1c90-437a-8cbe-de714e24cd36"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_18184b4f-0a77-4325-8208-b78d26c82d86/messages
correlation: qa-555f59e0-fffc-4bc7-adf5-9ab81139b391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-555f59e0-fffc-4bc7-adf5-9ab81139b391
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-555f59e0-fffc-4bc7-adf5-9ab81139b391
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
Content-Length: 203

{"id":"msg_ff7b7fc2-2090-47f4-8672-cc551b201919","conversationId":"cnv_18184b4f-0a77-4325-8208-b78d26c82d86","sender":"qa-d78aba5c96f4","body":"Friday works","createdAt":"2026-11-04T09:28:14.134057949Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_18184b4f-0a77-4325-8208-b78d26c82d86/messages
correlation: qa-757b4c4f-7386-46f5-86c1-0b4d026d05d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-757b4c4f-7386-46f5-86c1-0b4d026d05d9
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-757b4c4f-7386-46f5-86c1-0b4d026d05d9
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
Content-Length: 432

{"items":[{"id":"msg_ee96ce9c-75bf-4c26-8b27-0293e5c02633","conversationId":"cnv_18184b4f-0a77-4325-8208-b78d26c82d86","sender":"qa-8c0ad5f04ece","body":"Free on Friday?","createdAt":"2026-11-04T09:28:14.029664328Z"},{"id":"msg_ff7b7fc2-2090-47f4-8672-cc551b201919","conversationId":"cnv_18184b4f-0a77-4325-8208-b78d26c82d86","sender":"qa-d78aba5c96f4","body":"Friday works","createdAt":"2026-11-04T09:28:14.134057949Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3409ded1-421c-48d1-a32e-89a223ec973b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3409ded1-421c-48d1-a32e-89a223ec973b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3409ded1-421c-48d1-a32e-89a223ec973b
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
correlation: qa-5cedd86f-75db-4acb-9122-cc01332812e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cedd86f-75db-4acb-9122-cc01332812e8
Content-Type: application/json

--- request body ---
{"handle":"qa-d78aba5c96f4","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cedd86f-75db-4acb-9122-cc01332812e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5cedd86f-75db-4acb-9122-cc01332812e8"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84c706cc-14b0-4624-93f6-cb901fabedab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84c706cc-14b0-4624-93f6-cb901fabedab
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-84c706cc-14b0-4624-93f6-cb901fabedab
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
correlation: qa-dc43114b-5d54-4157-bbd9-869ccfb12148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc43114b-5d54-4157-bbd9-869ccfb12148
Content-Type: application/json

--- request body ---
{"handle":"qa-8c0ad5f04ece","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc43114b-5d54-4157-bbd9-869ccfb12148
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc43114b-5d54-4157-bbd9-869ccfb12148"}
```
