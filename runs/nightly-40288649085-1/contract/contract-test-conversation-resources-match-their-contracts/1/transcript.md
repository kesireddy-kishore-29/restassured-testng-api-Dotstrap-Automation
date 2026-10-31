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
| 1 | `POST /v1/accounts` | 201 | 331 | `qa-665e410c-dbfe-4685-85c7-021c68f0c1a2` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-b9efb58c-ae9c-4e51-9d49-a8b6da50a28f` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-f832e282-9b81-4ed9-b2e8-ea3d1e4d3635` |
| 4 | `POST /v1/conversations` | 201 | 50 | `qa-14341fce-aa60-4722-a791-122ff53c080c` |
| 5 | `GET /v1/conversations` | 200 | 20 | `qa-77ddba2f-3599-4691-8540-913ddec24c8b` |
| 6 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-6dc69483-5e42-461c-86dd-658c602e9da7` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-d936d05f-d629-4644-bf6e-ca911094b0f2` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-0cf8133f-8f46-4792-85c2-b043c825bbae` |
| 9 | `POST /v1/auth/token` | 200 | 47 | `qa-f6e73d3d-2331-4c56-918e-f0690b7f11d1` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-9e20d101-1d2a-47dd-a2b4-bb210ba8604b` |
| 11 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-b82546da-d916-4629-8f1f-2258f50eca31` |
| 12 | `POST /v1/auth/token` | 401 | 9 | `qa-4c625f89-1f39-4e4b-a4dd-9f220a872d55` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d9e26a3a-617d-4e7e-baab-692a96b69080` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-2ceff12d-1b2c-4220-af18-d29cfeadb36d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-665e410c-dbfe-4685-85c7-021c68f0c1a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-665e410c-dbfe-4685-85c7-021c68f0c1a2
Content-Type: application/json

--- request body ---
{"handle":"qa-27077e3d70e3","displayName":"QA 27077e3d70e3","password":"****","region":"eu"}

--- response: 201 in 331 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-665e410c-dbfe-4685-85c7-021c68f0c1a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-27077e3d70e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4fcf423e-edc4-4fbd-b343-2842aa84beb3","handle":"qa-27077e3d70e3","displayName":"QA 27077e3d70e3","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.466201373Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b9efb58c-ae9c-4e51-9d49-a8b6da50a28f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9efb58c-ae9c-4e51-9d49-a8b6da50a28f
Content-Type: application/json

--- request body ---
{"handle":"qa-94c8f8c6e948","displayName":"QA 94c8f8c6e948","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9efb58c-ae9c-4e51-9d49-a8b6da50a28f
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
Location: /v1/accounts/qa-94c8f8c6e948
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e3ac2bb-3409-49bf-b4be-edb81cb8a623","handle":"qa-94c8f8c6e948","displayName":"QA 94c8f8c6e948","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.708167830Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f832e282-9b81-4ed9-b2e8-ea3d1e4d3635

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f832e282-9b81-4ed9-b2e8-ea3d1e4d3635
Content-Type: application/json

--- request body ---
{"handle":"qa-27077e3d70e3","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f832e282-9b81-4ed9-b2e8-ea3d1e4d3635
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4fcf423e-edc4-4fbd-b343-2842aa84beb3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-14341fce-aa60-4722-a791-122ff53c080c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14341fce-aa60-4722-a791-122ff53c080c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94c8f8c6e948","subject":"Contract check","message":"Hello"}

--- response: 201 in 50 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-14341fce-aa60-4722-a791-122ff53c080c
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
Location: /v1/conversations/cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d","subject":"Contract check","status":"open","region":"eu","participants":["qa-27077e3d70e3","qa-94c8f8c6e948"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:45.831876743Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-77ddba2f-3599-4691-8540-913ddec24c8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77ddba2f-3599-4691-8540-913ddec24c8b
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-77ddba2f-3599-4691-8540-913ddec24c8b
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

{"items":[{"id":"cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d","subject":"Contract check","status":"open","region":"eu","participants":["qa-27077e3d70e3","qa-94c8f8c6e948"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:45.831876743Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d
correlation: qa-6dc69483-5e42-461c-86dd-658c602e9da7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dc69483-5e42-461c-86dd-658c602e9da7
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dc69483-5e42-461c-86dd-658c602e9da7
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

{"id":"cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d","subject":"Contract check","status":"open","region":"eu","participants":["qa-27077e3d70e3","qa-94c8f8c6e948"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:45.831876743Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d/messages
correlation: qa-d936d05f-d629-4644-bf6e-ca911094b0f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d936d05f-d629-4644-bf6e-ca911094b0f2
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d936d05f-d629-4644-bf6e-ca911094b0f2
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

{"id":"msg_be90400e-4c21-41e7-bb9f-eba2055e37c4","conversationId":"cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d","sender":"qa-27077e3d70e3","body":"Second","createdAt":"2026-10-26T07:54:45.980758132Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d/messages
correlation: qa-0cf8133f-8f46-4792-85c2-b043c825bbae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cf8133f-8f46-4792-85c2-b043c825bbae
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cf8133f-8f46-4792-85c2-b043c825bbae
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

{"items":[{"id":"msg_722bb43d-ec82-4568-9acf-f00d0178aa56","conversationId":"cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d","sender":"qa-27077e3d70e3","body":"Hello","createdAt":"2026-10-26T07:54:45.832066764Z"},{"id":"msg_be90400e-4c21-41e7-bb9f-eba2055e37c4","conversationId":"cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d","sender":"qa-27077e3d70e3","body":"Second","createdAt":"2026-10-26T07:54:45.980758132Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-f6e73d3d-2331-4c56-918e-f0690b7f11d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6e73d3d-2331-4c56-918e-f0690b7f11d1
Content-Type: application/json

--- request body ---
{"handle":"qa-94c8f8c6e948","password":"****"}

--- response: 200 in 47 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6e73d3d-2331-4c56-918e-f0690b7f11d1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e3ac2bb-3409-49bf-b4be-edb81cb8a623"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d/read
correlation: qa-9e20d101-1d2a-47dd-a2b4-bb210ba8604b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e20d101-1d2a-47dd-a2b4-bb210ba8604b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e20d101-1d2a-47dd-a2b4-bb210ba8604b
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

{"conversationId":"cnv_4078ed6f-acce-48fe-983e-0b51dd454b7d","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b82546da-d916-4629-8f1f-2258f50eca31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b82546da-d916-4629-8f1f-2258f50eca31
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b82546da-d916-4629-8f1f-2258f50eca31
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
correlation: qa-4c625f89-1f39-4e4b-a4dd-9f220a872d55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c625f89-1f39-4e4b-a4dd-9f220a872d55
Content-Type: application/json

--- request body ---
{"handle":"qa-94c8f8c6e948","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c625f89-1f39-4e4b-a4dd-9f220a872d55
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c625f89-1f39-4e4b-a4dd-9f220a872d55"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d9e26a3a-617d-4e7e-baab-692a96b69080

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9e26a3a-617d-4e7e-baab-692a96b69080
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d9e26a3a-617d-4e7e-baab-692a96b69080
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
correlation: qa-2ceff12d-1b2c-4220-af18-d29cfeadb36d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ceff12d-1b2c-4220-af18-d29cfeadb36d
Content-Type: application/json

--- request body ---
{"handle":"qa-27077e3d70e3","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ceff12d-1b2c-4220-af18-d29cfeadb36d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ceff12d-1b2c-4220-af18-d29cfeadb36d"}
```
