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
| 1 | `POST /v1/accounts` | 201 | 338 | `qa-f9ecc5ea-be71-47a6-9005-13e641c451a5` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-79a8001d-dfa9-477a-bde0-5cc62bb2d085` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-100fbcbf-3042-49f0-a2f6-7ea05ac548ec` |
| 4 | `POST /v1/conversations` | 201 | 53 | `qa-60fecaa7-642a-4988-8004-172b4220016c` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 35 | `qa-c28b5ca5-d5ff-4b9e-bef9-879416c87122` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-db8f88c9-2bfd-46ff-aad3-19aa0020c69a` |
| 7 | `GET /v1/conversations/{id}` | 200 | 13 | `qa-e1f6552c-abc6-424d-9f90-183ad6316bbf` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-9327e272-0ddb-4830-974d-0099159adb76` |
| 9 | `GET /v1/conversations/{id}` | 200 | 36 | `qa-76767ad8-beab-476c-84bf-3768883a7333` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b8c1ea04-2c7f-4b42-9b41-29a7c0e11174` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-560a3a83-aa80-46a8-992e-240513c8b8d7` |
| 12 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-1351b768-7bfd-467e-a285-085abc403abe` |
| 13 | `POST /v1/auth/token` | 401 | 8 | `qa-5027e901-e8da-4c7d-a3ae-ff32fe9041c7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f9ecc5ea-be71-47a6-9005-13e641c451a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9ecc5ea-be71-47a6-9005-13e641c451a5
Content-Type: application/json

--- request body ---
{"handle":"qa-f7f5dc0294f1","displayName":"QA f7f5dc0294f1","password":"****","region":"eu"}

--- response: 201 in 338 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9ecc5ea-be71-47a6-9005-13e641c451a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-f7f5dc0294f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1e31ec6-7e80-4064-b28a-2ccd784aa89f","handle":"qa-f7f5dc0294f1","displayName":"QA f7f5dc0294f1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:10.072067565Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-79a8001d-dfa9-477a-bde0-5cc62bb2d085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79a8001d-dfa9-477a-bde0-5cc62bb2d085
Content-Type: application/json

--- request body ---
{"handle":"qa-9a734c34c1a7","displayName":"QA 9a734c34c1a7","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-79a8001d-dfa9-477a-bde0-5cc62bb2d085
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
Location: /v1/accounts/qa-9a734c34c1a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_485bd9c1-c6b1-48dc-94f8-61a0b0c5cd2c","handle":"qa-9a734c34c1a7","displayName":"QA 9a734c34c1a7","region":"eu","role":"user","createdAt":"2026-11-17T10:50:10.519794099Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-100fbcbf-3042-49f0-a2f6-7ea05ac548ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-100fbcbf-3042-49f0-a2f6-7ea05ac548ec
Content-Type: application/json

--- request body ---
{"handle":"qa-f7f5dc0294f1","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-100fbcbf-3042-49f0-a2f6-7ea05ac548ec
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1e31ec6-7e80-4064-b28a-2ccd784aa89f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-60fecaa7-642a-4988-8004-172b4220016c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60fecaa7-642a-4988-8004-172b4220016c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9a734c34c1a7","subject":"Updates","message":"First"}

--- response: 201 in 53 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-60fecaa7-642a-4988-8004-172b4220016c
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
Location: /v1/conversations/cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f","subject":"Updates","status":"open","region":"eu","participants":["qa-f7f5dc0294f1","qa-9a734c34c1a7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:10.667118552Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f/messages
correlation: qa-c28b5ca5-d5ff-4b9e-bef9-879416c87122

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c28b5ca5-d5ff-4b9e-bef9-879416c87122
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 35 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c28b5ca5-d5ff-4b9e-bef9-879416c87122
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

{"id":"msg_4e3b0e6a-cde9-4317-831b-c14cbcccf5f5","conversationId":"cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f","sender":"qa-f7f5dc0294f1","body":"Second","createdAt":"2026-11-17T10:50:10.753857070Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-db8f88c9-2bfd-46ff-aad3-19aa0020c69a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db8f88c9-2bfd-46ff-aad3-19aa0020c69a
Content-Type: application/json

--- request body ---
{"handle":"qa-9a734c34c1a7","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-db8f88c9-2bfd-46ff-aad3-19aa0020c69a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_485bd9c1-c6b1-48dc-94f8-61a0b0c5cd2c"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f
correlation: qa-e1f6552c-abc6-424d-9f90-183ad6316bbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1f6552c-abc6-424d-9f90-183ad6316bbf
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1f6552c-abc6-424d-9f90-183ad6316bbf
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

{"id":"cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f","subject":"Updates","status":"open","region":"eu","participants":["qa-f7f5dc0294f1","qa-9a734c34c1a7"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-17T10:50:10.667118552Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f/read
correlation: qa-9327e272-0ddb-4830-974d-0099159adb76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9327e272-0ddb-4830-974d-0099159adb76
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9327e272-0ddb-4830-974d-0099159adb76
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

{"conversationId":"cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f
correlation: qa-76767ad8-beab-476c-84bf-3768883a7333

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76767ad8-beab-476c-84bf-3768883a7333
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-76767ad8-beab-476c-84bf-3768883a7333
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

{"id":"cnv_f26f2a5f-12e9-4b5d-a853-d3ce2536080f","subject":"Updates","status":"open","region":"eu","participants":["qa-f7f5dc0294f1","qa-9a734c34c1a7"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-17T10:50:10.667118552Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8c1ea04-2c7f-4b42-9b41-29a7c0e11174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8c1ea04-2c7f-4b42-9b41-29a7c0e11174
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8c1ea04-2c7f-4b42-9b41-29a7c0e11174
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
correlation: qa-560a3a83-aa80-46a8-992e-240513c8b8d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-560a3a83-aa80-46a8-992e-240513c8b8d7
Content-Type: application/json

--- request body ---
{"handle":"qa-9a734c34c1a7","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-560a3a83-aa80-46a8-992e-240513c8b8d7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-560a3a83-aa80-46a8-992e-240513c8b8d7"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1351b768-7bfd-467e-a285-085abc403abe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1351b768-7bfd-467e-a285-085abc403abe
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1351b768-7bfd-467e-a285-085abc403abe
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
correlation: qa-5027e901-e8da-4c7d-a3ae-ff32fe9041c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5027e901-e8da-4c7d-a3ae-ff32fe9041c7
Content-Type: application/json

--- request body ---
{"handle":"qa-f7f5dc0294f1","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5027e901-e8da-4c7d-a3ae-ff32fe9041c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5027e901-e8da-4c7d-a3ae-ff32fe9041c7"}
```
