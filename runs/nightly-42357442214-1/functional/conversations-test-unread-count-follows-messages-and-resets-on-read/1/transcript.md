# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 415 | `qa-2263b9f0-9d21-4155-a4f6-1ba9d1bc00d6` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-c876c6d1-bc8e-4191-bd79-7566ba69f799` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-e468e998-9b4f-4e5f-a56b-d208094f46fb` |
| 4 | `POST /v1/conversations` | 201 | 68 | `qa-a19f3043-ab4b-4e5a-b4ec-e58866afd0d1` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 45 | `qa-19659952-7a10-47e7-b177-01f142c45bb1` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-8d473ae4-9b99-42de-a2ed-6954636a14c7` |
| 7 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-42692d0b-7ea6-4cc6-9277-bc6bccbe1ea6` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 19 | `qa-f0d92da3-b6ee-4cc4-af68-2530010a1ab3` |
| 9 | `GET /v1/conversations/{id}` | 200 | 32 | `qa-0b304c55-44da-4267-8b78-409cf46194bb` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-670781b1-82b5-4e8a-b223-0fa2e1157e7d` |
| 11 | `POST /v1/auth/token` | 401 | 18 | `qa-34282bb8-0266-42ea-b296-060bb6341604` |
| 12 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-7870c2ed-b2fe-473d-827f-681e6d93172c` |
| 13 | `POST /v1/auth/token` | 401 | 14 | `qa-95448eb4-41c4-442c-9cdc-1b55fef23f7c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2263b9f0-9d21-4155-a4f6-1ba9d1bc00d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2263b9f0-9d21-4155-a4f6-1ba9d1bc00d6
Content-Type: application/json

--- request body ---
{"handle":"qa-34d8908b67e7","displayName":"QA 34d8908b67e7","password":"****","region":"eu"}

--- response: 201 in 415 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2263b9f0-9d21-4155-a4f6-1ba9d1bc00d6
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
Location: /v1/accounts/qa-34d8908b67e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b216d6a3-e48a-4e5a-a314-4f59217b73d6","handle":"qa-34d8908b67e7","displayName":"QA 34d8908b67e7","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.213126720Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c876c6d1-bc8e-4191-bd79-7566ba69f799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c876c6d1-bc8e-4191-bd79-7566ba69f799
Content-Type: application/json

--- request body ---
{"handle":"qa-22a3836b6c42","displayName":"QA 22a3836b6c42","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c876c6d1-bc8e-4191-bd79-7566ba69f799
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
Location: /v1/accounts/qa-22a3836b6c42
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a06c23c-af4d-4562-9991-71fbad1c855e","handle":"qa-22a3836b6c42","displayName":"QA 22a3836b6c42","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.666744292Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e468e998-9b4f-4e5f-a56b-d208094f46fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e468e998-9b4f-4e5f-a56b-d208094f46fb
Content-Type: application/json

--- request body ---
{"handle":"qa-34d8908b67e7","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e468e998-9b4f-4e5f-a56b-d208094f46fb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b216d6a3-e48a-4e5a-a314-4f59217b73d6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a19f3043-ab4b-4e5a-b4ec-e58866afd0d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a19f3043-ab4b-4e5a-b4ec-e58866afd0d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-22a3836b6c42","subject":"Updates","message":"First"}

--- response: 201 in 68 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a19f3043-ab4b-4e5a-b4ec-e58866afd0d1
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
Location: /v1/conversations/cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683","subject":"Updates","status":"open","region":"eu","participants":["qa-34d8908b67e7","qa-22a3836b6c42"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:55:03.851493528Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683/messages
correlation: qa-19659952-7a10-47e7-b177-01f142c45bb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19659952-7a10-47e7-b177-01f142c45bb1
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 45 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-19659952-7a10-47e7-b177-01f142c45bb1
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
Content-Length: 197

{"id":"msg_d60971c5-c4f2-471c-899d-bbdfc872a154","conversationId":"cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683","sender":"qa-34d8908b67e7","body":"Second","createdAt":"2026-11-07T08:55:03.968411886Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8d473ae4-9b99-42de-a2ed-6954636a14c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d473ae4-9b99-42de-a2ed-6954636a14c7
Content-Type: application/json

--- request body ---
{"handle":"qa-22a3836b6c42","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d473ae4-9b99-42de-a2ed-6954636a14c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a06c23c-af4d-4562-9991-71fbad1c855e"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683
correlation: qa-42692d0b-7ea6-4cc6-9277-bc6bccbe1ea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42692d0b-7ea6-4cc6-9277-bc6bccbe1ea6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-42692d0b-7ea6-4cc6-9277-bc6bccbe1ea6
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683","subject":"Updates","status":"open","region":"eu","participants":["qa-34d8908b67e7","qa-22a3836b6c42"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-07T08:55:03.851493528Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683/read
correlation: qa-f0d92da3-b6ee-4cc4-af68-2530010a1ab3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0d92da3-b6ee-4cc4-af68-2530010a1ab3
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0d92da3-b6ee-4cc4-af68-2530010a1ab3
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
Content-Length: 77

{"conversationId":"cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683
correlation: qa-0b304c55-44da-4267-8b78-409cf46194bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b304c55-44da-4267-8b78-409cf46194bb
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b304c55-44da-4267-8b78-409cf46194bb
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
Content-Length: 230

{"id":"cnv_c13ca87d-d3d8-43c6-b59e-ae7ad2349683","subject":"Updates","status":"open","region":"eu","participants":["qa-34d8908b67e7","qa-22a3836b6c42"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-07T08:55:03.851493528Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-670781b1-82b5-4e8a-b223-0fa2e1157e7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-670781b1-82b5-4e8a-b223-0fa2e1157e7d
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-670781b1-82b5-4e8a-b223-0fa2e1157e7d
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
correlation: qa-34282bb8-0266-42ea-b296-060bb6341604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34282bb8-0266-42ea-b296-060bb6341604
Content-Type: application/json

--- request body ---
{"handle":"qa-22a3836b6c42","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34282bb8-0266-42ea-b296-060bb6341604
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-34282bb8-0266-42ea-b296-060bb6341604"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7870c2ed-b2fe-473d-827f-681e6d93172c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7870c2ed-b2fe-473d-827f-681e6d93172c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7870c2ed-b2fe-473d-827f-681e6d93172c
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

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-95448eb4-41c4-442c-9cdc-1b55fef23f7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95448eb4-41c4-442c-9cdc-1b55fef23f7c
Content-Type: application/json

--- request body ---
{"handle":"qa-34d8908b67e7","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95448eb4-41c4-442c-9cdc-1b55fef23f7c
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95448eb4-41c4-442c-9cdc-1b55fef23f7c"}
```
