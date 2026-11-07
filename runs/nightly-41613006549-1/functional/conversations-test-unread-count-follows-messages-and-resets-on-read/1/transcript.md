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
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-64c93f7f-e913-47da-9328-f318a468e93b` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-a518cb47-4254-4be1-8c5b-e357a61cda9a` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-e1fc1cd3-e483-4db1-8f5c-4c1dbd68fc8e` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-6625128e-6c6e-4c4b-a43f-661ec039c18f` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-9840a765-634f-4293-963c-b5b0358305b2` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-d1088adc-eadc-4d8b-86e0-1aa9843d8c76` |
| 7 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-57dbf218-e2e7-430b-ba73-9867cf149f6a` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 12 | `qa-3098d2d0-65d0-4609-993d-ffa0f0626f73` |
| 9 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-ae773eb8-03e0-47c2-af65-c3de0cec90b6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-cec6053d-adc8-4187-9d20-1d0f6fe53baf` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-d4dcd49c-4fdb-4f1a-bc0e-9fad232c2882` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f32c6967-11e3-4e90-8109-982c890ab9a5` |
| 13 | `POST /v1/auth/token` | 401 | 22 | `qa-bc3acb2d-4460-4de2-a109-e2acba5c2bf8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-64c93f7f-e913-47da-9328-f318a468e93b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64c93f7f-e913-47da-9328-f318a468e93b
Content-Type: application/json

--- request body ---
{"handle":"qa-7f185ebdad25","displayName":"QA 7f185ebdad25","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-64c93f7f-e913-47da-9328-f318a468e93b
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
Location: /v1/accounts/qa-7f185ebdad25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1d9d6ff6-0be0-497c-aef7-00c41868fc35","handle":"qa-7f185ebdad25","displayName":"QA 7f185ebdad25","region":"eu","role":"user","createdAt":"2026-11-03T09:41:47.432349368Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a518cb47-4254-4be1-8c5b-e357a61cda9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a518cb47-4254-4be1-8c5b-e357a61cda9a
Content-Type: application/json

--- request body ---
{"handle":"qa-245be459022a","displayName":"QA 245be459022a","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-a518cb47-4254-4be1-8c5b-e357a61cda9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-245be459022a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04758eeb-d155-45b0-bc2e-63c07714c86f","handle":"qa-245be459022a","displayName":"QA 245be459022a","region":"eu","role":"user","createdAt":"2026-11-03T09:41:47.486480238Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e1fc1cd3-e483-4db1-8f5c-4c1dbd68fc8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1fc1cd3-e483-4db1-8f5c-4c1dbd68fc8e
Content-Type: application/json

--- request body ---
{"handle":"qa-7f185ebdad25","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1fc1cd3-e483-4db1-8f5c-4c1dbd68fc8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d9d6ff6-0be0-497c-aef7-00c41868fc35"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6625128e-6c6e-4c4b-a43f-661ec039c18f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6625128e-6c6e-4c4b-a43f-661ec039c18f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-245be459022a","subject":"Updates","message":"First"}

--- response: 201 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-6625128e-6c6e-4c4b-a43f-661ec039c18f
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
Location: /v1/conversations/cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014","subject":"Updates","status":"open","region":"eu","participants":["qa-7f185ebdad25","qa-245be459022a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:47.539128313Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014/messages
correlation: qa-9840a765-634f-4293-963c-b5b0358305b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9840a765-634f-4293-963c-b5b0358305b2
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-9840a765-634f-4293-963c-b5b0358305b2
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

{"id":"msg_fdc0e76a-e81a-4f8a-abd6-e8771bd57386","conversationId":"cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014","sender":"qa-7f185ebdad25","body":"Second","createdAt":"2026-11-03T09:41:47.589703983Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d1088adc-eadc-4d8b-86e0-1aa9843d8c76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1088adc-eadc-4d8b-86e0-1aa9843d8c76
Content-Type: application/json

--- request body ---
{"handle":"qa-245be459022a","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1088adc-eadc-4d8b-86e0-1aa9843d8c76
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04758eeb-d155-45b0-bc2e-63c07714c86f"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014
correlation: qa-57dbf218-e2e7-430b-ba73-9867cf149f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57dbf218-e2e7-430b-ba73-9867cf149f6a
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-57dbf218-e2e7-430b-ba73-9867cf149f6a
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

{"id":"cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014","subject":"Updates","status":"open","region":"eu","participants":["qa-7f185ebdad25","qa-245be459022a"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-03T09:41:47.539128313Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014/read
correlation: qa-3098d2d0-65d0-4609-993d-ffa0f0626f73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3098d2d0-65d0-4609-993d-ffa0f0626f73
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-3098d2d0-65d0-4609-993d-ffa0f0626f73
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

{"conversationId":"cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014
correlation: qa-ae773eb8-03e0-47c2-af65-c3de0cec90b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae773eb8-03e0-47c2-af65-c3de0cec90b6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae773eb8-03e0-47c2-af65-c3de0cec90b6
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

{"id":"cnv_91dd12f0-24e7-4bd0-a0a0-4502ee765014","subject":"Updates","status":"open","region":"eu","participants":["qa-7f185ebdad25","qa-245be459022a"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-03T09:41:47.539128313Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cec6053d-adc8-4187-9d20-1d0f6fe53baf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cec6053d-adc8-4187-9d20-1d0f6fe53baf
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cec6053d-adc8-4187-9d20-1d0f6fe53baf
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
correlation: qa-d4dcd49c-4fdb-4f1a-bc0e-9fad232c2882

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4dcd49c-4fdb-4f1a-bc0e-9fad232c2882
Content-Type: application/json

--- request body ---
{"handle":"qa-245be459022a","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4dcd49c-4fdb-4f1a-bc0e-9fad232c2882
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4dcd49c-4fdb-4f1a-bc0e-9fad232c2882"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f32c6967-11e3-4e90-8109-982c890ab9a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f32c6967-11e3-4e90-8109-982c890ab9a5
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f32c6967-11e3-4e90-8109-982c890ab9a5
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
correlation: qa-bc3acb2d-4460-4de2-a109-e2acba5c2bf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc3acb2d-4460-4de2-a109-e2acba5c2bf8
Content-Type: application/json

--- request body ---
{"handle":"qa-7f185ebdad25","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc3acb2d-4460-4de2-a109-e2acba5c2bf8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc3acb2d-4460-4de2-a109-e2acba5c2bf8"}
```
