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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-373bac40-c7ee-47ef-b869-fcd892826877` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-1a48049d-c420-4bc3-bb3b-33c05e1abbd1` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-c20cbdf6-de59-436e-b146-3f46022fb2dc` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-0ff2830d-ef8f-4fca-a179-279f2f902af7` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-86a09cab-cb5a-4481-95c4-fe6f2a6752da` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-3676c142-33bb-4074-9208-0ee0be412052` |
| 7 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-6f3b07b9-81bc-4cfd-a78b-d18e158f6971` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 8 | `qa-c28267b0-92ab-4da3-8c6d-cf42511eb490` |
| 9 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-8c80f495-f098-4faf-82cb-9a29178a7bff` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-f66b43af-96d0-41d7-b370-90b813dcb48b` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-27188bda-1587-4426-bc2b-abab31677adb` |
| 12 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-e51f2cbc-2afa-4f2d-b9a9-132398fcd1f9` |
| 13 | `POST /v1/auth/token` | 401 | 8 | `qa-f4a3663e-788f-4331-8565-712c01ab6983` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-373bac40-c7ee-47ef-b869-fcd892826877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-373bac40-c7ee-47ef-b869-fcd892826877
Content-Type: application/json

--- request body ---
{"handle":"qa-40c42c2aaf75","displayName":"QA 40c42c2aaf75","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-373bac40-c7ee-47ef-b869-fcd892826877
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
Location: /v1/accounts/qa-40c42c2aaf75
X-Served-Region: eu
Content-Length: 181

{"id":"acc_185bbe3a-54d2-43c1-bf8c-7833e34e9401","handle":"qa-40c42c2aaf75","displayName":"QA 40c42c2aaf75","region":"eu","role":"user","createdAt":"2026-11-02T09:39:11.376554684Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1a48049d-c420-4bc3-bb3b-33c05e1abbd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a48049d-c420-4bc3-bb3b-33c05e1abbd1
Content-Type: application/json

--- request body ---
{"handle":"qa-6a167238f051","displayName":"QA 6a167238f051","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a48049d-c420-4bc3-bb3b-33c05e1abbd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-6a167238f051
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf3f5474-c591-4741-9ee5-fd56cc24adca","handle":"qa-6a167238f051","displayName":"QA 6a167238f051","region":"eu","role":"user","createdAt":"2026-11-02T09:39:11.411927929Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c20cbdf6-de59-436e-b146-3f46022fb2dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c20cbdf6-de59-436e-b146-3f46022fb2dc
Content-Type: application/json

--- request body ---
{"handle":"qa-40c42c2aaf75","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c20cbdf6-de59-436e-b146-3f46022fb2dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_185bbe3a-54d2-43c1-bf8c-7833e34e9401"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0ff2830d-ef8f-4fca-a179-279f2f902af7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ff2830d-ef8f-4fca-a179-279f2f902af7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6a167238f051","subject":"Updates","message":"First"}

--- response: 201 in 6 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ff2830d-ef8f-4fca-a179-279f2f902af7
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
Location: /v1/conversations/cnv_0970322d-8335-4223-ab07-27486439f30a
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_0970322d-8335-4223-ab07-27486439f30a","subject":"Updates","status":"open","region":"eu","participants":["qa-40c42c2aaf75","qa-6a167238f051"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:39:11.469627281Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_0970322d-8335-4223-ab07-27486439f30a/messages
correlation: qa-86a09cab-cb5a-4481-95c4-fe6f2a6752da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86a09cab-cb5a-4481-95c4-fe6f2a6752da
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 15 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-86a09cab-cb5a-4481-95c4-fe6f2a6752da
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

{"id":"msg_99905f62-ec8c-4fd4-85e0-e0d762fea07a","conversationId":"cnv_0970322d-8335-4223-ab07-27486439f30a","sender":"qa-40c42c2aaf75","body":"Second","createdAt":"2026-11-02T09:39:11.489962526Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3676c142-33bb-4074-9208-0ee0be412052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3676c142-33bb-4074-9208-0ee0be412052
Content-Type: application/json

--- request body ---
{"handle":"qa-6a167238f051","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3676c142-33bb-4074-9208-0ee0be412052
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf3f5474-c591-4741-9ee5-fd56cc24adca"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_0970322d-8335-4223-ab07-27486439f30a
correlation: qa-6f3b07b9-81bc-4cfd-a78b-d18e158f6971

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f3b07b9-81bc-4cfd-a78b-d18e158f6971
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f3b07b9-81bc-4cfd-a78b-d18e158f6971
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

{"id":"cnv_0970322d-8335-4223-ab07-27486439f30a","subject":"Updates","status":"open","region":"eu","participants":["qa-40c42c2aaf75","qa-6a167238f051"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-02T09:39:11.469627281Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_0970322d-8335-4223-ab07-27486439f30a/read
correlation: qa-c28267b0-92ab-4da3-8c6d-cf42511eb490

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c28267b0-92ab-4da3-8c6d-cf42511eb490
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c28267b0-92ab-4da3-8c6d-cf42511eb490
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

{"conversationId":"cnv_0970322d-8335-4223-ab07-27486439f30a","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_0970322d-8335-4223-ab07-27486439f30a
correlation: qa-8c80f495-f098-4faf-82cb-9a29178a7bff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c80f495-f098-4faf-82cb-9a29178a7bff
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c80f495-f098-4faf-82cb-9a29178a7bff
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

{"id":"cnv_0970322d-8335-4223-ab07-27486439f30a","subject":"Updates","status":"open","region":"eu","participants":["qa-40c42c2aaf75","qa-6a167238f051"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-02T09:39:11.469627281Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f66b43af-96d0-41d7-b370-90b813dcb48b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f66b43af-96d0-41d7-b370-90b813dcb48b
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f66b43af-96d0-41d7-b370-90b813dcb48b
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
correlation: qa-27188bda-1587-4426-bc2b-abab31677adb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27188bda-1587-4426-bc2b-abab31677adb
Content-Type: application/json

--- request body ---
{"handle":"qa-6a167238f051","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27188bda-1587-4426-bc2b-abab31677adb
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27188bda-1587-4426-bc2b-abab31677adb"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e51f2cbc-2afa-4f2d-b9a9-132398fcd1f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e51f2cbc-2afa-4f2d-b9a9-132398fcd1f9
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e51f2cbc-2afa-4f2d-b9a9-132398fcd1f9
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
correlation: qa-f4a3663e-788f-4331-8565-712c01ab6983

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4a3663e-788f-4331-8565-712c01ab6983
Content-Type: application/json

--- request body ---
{"handle":"qa-40c42c2aaf75","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4a3663e-788f-4331-8565-712c01ab6983
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4a3663e-788f-4331-8565-712c01ab6983"}
```
