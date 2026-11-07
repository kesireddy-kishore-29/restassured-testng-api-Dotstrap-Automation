# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-cc16d773-a888-45dd-a08c-12aaeb884e59` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-5f0949bf-3ff7-4b29-a93f-643e9e203b07` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-e4e565f2-36d8-4530-9b34-16694f2a44ef` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-b105f773-59aa-4705-872e-e271dddd9c49` |
| 5 | `GET /v1/conversations` | 200 | 18 | `qa-5759b54b-e119-4a04-9837-cf27299fa7c0` |
| 6 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-2645f4f8-cbc0-449e-9328-55d35db2f152` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-28495a3c-b527-42d9-aeaa-eff876cc294a` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-ace2519a-a243-420c-975a-8e0d582c1d53` |
| 9 | `POST /v1/auth/token` | 200 | 13 | `qa-976f2d72-19d9-43e7-83e5-47f7b1965ddf` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-c4b69b90-272c-4a9b-8bb5-734ef7b5b91a` |
| 11 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-b5307e91-a4a5-4e59-96d9-b646a3739f3e` |
| 12 | `POST /v1/auth/token` | 401 | 7 | `qa-6c8f8157-e4b5-4bf7-812a-115bf5689f6a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-e480ffab-93c6-4e08-acb4-34708990a388` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-d38d22f6-b1bc-4c0c-8730-7dd421277169` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cc16d773-a888-45dd-a08c-12aaeb884e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc16d773-a888-45dd-a08c-12aaeb884e59
Content-Type: application/json

--- request body ---
{"handle":"qa-6257705c3963","displayName":"QA 6257705c3963","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc16d773-a888-45dd-a08c-12aaeb884e59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Location: /v1/accounts/qa-6257705c3963
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28f3bde9-2154-4edd-bae6-b7ba956d8fca","handle":"qa-6257705c3963","displayName":"QA 6257705c3963","region":"eu","role":"user","createdAt":"2026-10-29T08:39:02.201863534Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5f0949bf-3ff7-4b29-a93f-643e9e203b07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f0949bf-3ff7-4b29-a93f-643e9e203b07
Content-Type: application/json

--- request body ---
{"handle":"qa-322af8cb1b8d","displayName":"QA 322af8cb1b8d","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f0949bf-3ff7-4b29-a93f-643e9e203b07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 6
Location: /v1/accounts/qa-322af8cb1b8d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c10c4a6b-8ece-403f-8e81-8c2c27148566","handle":"qa-322af8cb1b8d","displayName":"QA 322af8cb1b8d","region":"eu","role":"user","createdAt":"2026-10-29T08:39:02.226261133Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e4e565f2-36d8-4530-9b34-16694f2a44ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4e565f2-36d8-4530-9b34-16694f2a44ef
Content-Type: application/json

--- request body ---
{"handle":"qa-6257705c3963","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4e565f2-36d8-4530-9b34-16694f2a44ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28f3bde9-2154-4edd-bae6-b7ba956d8fca"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b105f773-59aa-4705-872e-e271dddd9c49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b105f773-59aa-4705-872e-e271dddd9c49
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-322af8cb1b8d","subject":"Contract check","message":"Hello"}

--- response: 201 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b105f773-59aa-4705-872e-e271dddd9c49
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
Location: /v1/conversations/cnv_7b3590d1-413c-401e-b061-1a5c2934724a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7b3590d1-413c-401e-b061-1a5c2934724a","subject":"Contract check","status":"open","region":"eu","participants":["qa-6257705c3963","qa-322af8cb1b8d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:02.289891069Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-5759b54b-e119-4a04-9837-cf27299fa7c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5759b54b-e119-4a04-9837-cf27299fa7c0
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5759b54b-e119-4a04-9837-cf27299fa7c0
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
Content-Length: 259

{"items":[{"id":"cnv_7b3590d1-413c-401e-b061-1a5c2934724a","subject":"Contract check","status":"open","region":"eu","participants":["qa-6257705c3963","qa-322af8cb1b8d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:02.289891069Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_7b3590d1-413c-401e-b061-1a5c2934724a
correlation: qa-2645f4f8-cbc0-449e-9328-55d35db2f152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2645f4f8-cbc0-449e-9328-55d35db2f152
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2645f4f8-cbc0-449e-9328-55d35db2f152
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
Content-Length: 237

{"id":"cnv_7b3590d1-413c-401e-b061-1a5c2934724a","subject":"Contract check","status":"open","region":"eu","participants":["qa-6257705c3963","qa-322af8cb1b8d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:02.289891069Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7b3590d1-413c-401e-b061-1a5c2934724a/messages
correlation: qa-28495a3c-b527-42d9-aeaa-eff876cc294a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28495a3c-b527-42d9-aeaa-eff876cc294a
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-28495a3c-b527-42d9-aeaa-eff876cc294a
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
Content-Length: 197

{"id":"msg_27a1cafd-153f-4235-9c12-91978aca3b24","conversationId":"cnv_7b3590d1-413c-401e-b061-1a5c2934724a","sender":"qa-6257705c3963","body":"Second","createdAt":"2026-10-29T08:39:02.363661836Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_7b3590d1-413c-401e-b061-1a5c2934724a/messages
correlation: qa-ace2519a-a243-420c-975a-8e0d582c1d53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ace2519a-a243-420c-975a-8e0d582c1d53
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ace2519a-a243-420c-975a-8e0d582c1d53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_0ca1a23f-425b-4fbd-8418-a843cb451abd","conversationId":"cnv_7b3590d1-413c-401e-b061-1a5c2934724a","sender":"qa-6257705c3963","body":"Hello","createdAt":"2026-10-29T08:39:02.289900688Z"},{"id":"msg_27a1cafd-153f-4235-9c12-91978aca3b24","conversationId":"cnv_7b3590d1-413c-401e-b061-1a5c2934724a","sender":"qa-6257705c3963","body":"Second","createdAt":"2026-10-29T08:39:02.363661836Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-976f2d72-19d9-43e7-83e5-47f7b1965ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-976f2d72-19d9-43e7-83e5-47f7b1965ddf
Content-Type: application/json

--- request body ---
{"handle":"qa-322af8cb1b8d","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-976f2d72-19d9-43e7-83e5-47f7b1965ddf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c10c4a6b-8ece-403f-8e81-8c2c27148566"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_7b3590d1-413c-401e-b061-1a5c2934724a/read
correlation: qa-c4b69b90-272c-4a9b-8bb5-734ef7b5b91a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4b69b90-272c-4a9b-8bb5-734ef7b5b91a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4b69b90-272c-4a9b-8bb5-734ef7b5b91a
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
Content-Length: 77

{"conversationId":"cnv_7b3590d1-413c-401e-b061-1a5c2934724a","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5307e91-a4a5-4e59-96d9-b646a3739f3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5307e91-a4a5-4e59-96d9-b646a3739f3e
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5307e91-a4a5-4e59-96d9-b646a3739f3e
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-6c8f8157-e4b5-4bf7-812a-115bf5689f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c8f8157-e4b5-4bf7-812a-115bf5689f6a
Content-Type: application/json

--- request body ---
{"handle":"qa-322af8cb1b8d","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c8f8157-e4b5-4bf7-812a-115bf5689f6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c8f8157-e4b5-4bf7-812a-115bf5689f6a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e480ffab-93c6-4e08-acb4-34708990a388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e480ffab-93c6-4e08-acb4-34708990a388
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e480ffab-93c6-4e08-acb4-34708990a388
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-d38d22f6-b1bc-4c0c-8730-7dd421277169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d38d22f6-b1bc-4c0c-8730-7dd421277169
Content-Type: application/json

--- request body ---
{"handle":"qa-6257705c3963","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d38d22f6-b1bc-4c0c-8730-7dd421277169
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d38d22f6-b1bc-4c0c-8730-7dd421277169"}
```
