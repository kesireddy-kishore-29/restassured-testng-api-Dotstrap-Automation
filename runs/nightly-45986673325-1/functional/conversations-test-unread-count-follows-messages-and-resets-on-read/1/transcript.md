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
| 1 | `POST /v1/accounts` | 201 | 262 | `qa-dccdb69b-3e6f-40da-b50a-5104ad0d2999` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-48b9e472-d816-4457-b18d-9e9662b6b3ef` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-79ca17a7-1336-40f2-99e9-ee795a1d9dde` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-0c42e4f9-2fdc-4501-977d-21a8e31e01d0` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 38 | `qa-0fb8afdc-80a5-4e9d-b321-7c2143d74408` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-b65d09ac-2490-494c-8d2b-3b6d6c6899f4` |
| 7 | `GET /v1/conversations/{id}` | 200 | 22 | `qa-e0f732ee-b24f-426a-b3c9-0e878223ba2e` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 27 | `qa-bc2d9e24-4135-4927-9817-2e09462c56d2` |
| 9 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-57665b6f-490b-4516-825e-c5038df9beea` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9ceebad6-7214-403a-9553-8b7d5bd8000b` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-802b51f4-0df4-438c-9448-9bd571c9f7ea` |
| 12 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-69946337-8c5f-4d16-ba73-f10e67bddaee` |
| 13 | `POST /v1/auth/token` | 401 | 11 | `qa-b982aa90-4b88-4aa9-a908-d140d5572f4f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dccdb69b-3e6f-40da-b50a-5104ad0d2999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dccdb69b-3e6f-40da-b50a-5104ad0d2999
Content-Type: application/json

--- request body ---
{"handle":"qa-cf0a3e9dfc2d","displayName":"QA cf0a3e9dfc2d","password":"****","region":"eu"}

--- response: 201 in 262 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-dccdb69b-3e6f-40da-b50a-5104ad0d2999
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
Location: /v1/accounts/qa-cf0a3e9dfc2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90179339-38de-4a3d-976b-be45a8dca0df","handle":"qa-cf0a3e9dfc2d","displayName":"QA cf0a3e9dfc2d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:46.129292615Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-48b9e472-d816-4457-b18d-9e9662b6b3ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48b9e472-d816-4457-b18d-9e9662b6b3ef
Content-Type: application/json

--- request body ---
{"handle":"qa-dda3f8d34fa0","displayName":"QA dda3f8d34fa0","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-48b9e472-d816-4457-b18d-9e9662b6b3ef
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
Location: /v1/accounts/qa-dda3f8d34fa0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e65718d-9004-497b-9d60-9ecdda4c0379","handle":"qa-dda3f8d34fa0","displayName":"QA dda3f8d34fa0","region":"eu","role":"user","createdAt":"2026-11-27T10:59:46.439043715Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-79ca17a7-1336-40f2-99e9-ee795a1d9dde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79ca17a7-1336-40f2-99e9-ee795a1d9dde
Content-Type: application/json

--- request body ---
{"handle":"qa-cf0a3e9dfc2d","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-79ca17a7-1336-40f2-99e9-ee795a1d9dde
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90179339-38de-4a3d-976b-be45a8dca0df"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0c42e4f9-2fdc-4501-977d-21a8e31e01d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c42e4f9-2fdc-4501-977d-21a8e31e01d0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dda3f8d34fa0","subject":"Updates","message":"First"}

--- response: 201 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c42e4f9-2fdc-4501-977d-21a8e31e01d0
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
Location: /v1/conversations/cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207","subject":"Updates","status":"open","region":"eu","participants":["qa-cf0a3e9dfc2d","qa-dda3f8d34fa0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:46.523244258Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207/messages
correlation: qa-0fb8afdc-80a5-4e9d-b321-7c2143d74408

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fb8afdc-80a5-4e9d-b321-7c2143d74408
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fb8afdc-80a5-4e9d-b321-7c2143d74408
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

{"id":"msg_b9f47067-3131-474f-8c18-3bfea9d08ed7","conversationId":"cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207","sender":"qa-cf0a3e9dfc2d","body":"Second","createdAt":"2026-11-27T10:59:46.636580195Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b65d09ac-2490-494c-8d2b-3b6d6c6899f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b65d09ac-2490-494c-8d2b-3b6d6c6899f4
Content-Type: application/json

--- request body ---
{"handle":"qa-dda3f8d34fa0","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b65d09ac-2490-494c-8d2b-3b6d6c6899f4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e65718d-9004-497b-9d60-9ecdda4c0379"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207
correlation: qa-e0f732ee-b24f-426a-b3c9-0e878223ba2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0f732ee-b24f-426a-b3c9-0e878223ba2e
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0f732ee-b24f-426a-b3c9-0e878223ba2e
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

{"id":"cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207","subject":"Updates","status":"open","region":"eu","participants":["qa-cf0a3e9dfc2d","qa-dda3f8d34fa0"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-27T10:59:46.523244258Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207/read
correlation: qa-bc2d9e24-4135-4927-9817-2e09462c56d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc2d9e24-4135-4927-9817-2e09462c56d2
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc2d9e24-4135-4927-9817-2e09462c56d2
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

{"conversationId":"cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207
correlation: qa-57665b6f-490b-4516-825e-c5038df9beea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57665b6f-490b-4516-825e-c5038df9beea
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-57665b6f-490b-4516-825e-c5038df9beea
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

{"id":"cnv_b2d74ca0-519d-4684-bcb1-ca49b2e02207","subject":"Updates","status":"open","region":"eu","participants":["qa-cf0a3e9dfc2d","qa-dda3f8d34fa0"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-27T10:59:46.523244258Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ceebad6-7214-403a-9553-8b7d5bd8000b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ceebad6-7214-403a-9553-8b7d5bd8000b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ceebad6-7214-403a-9553-8b7d5bd8000b
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
correlation: qa-802b51f4-0df4-438c-9448-9bd571c9f7ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-802b51f4-0df4-438c-9448-9bd571c9f7ea
Content-Type: application/json

--- request body ---
{"handle":"qa-dda3f8d34fa0","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-802b51f4-0df4-438c-9448-9bd571c9f7ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-802b51f4-0df4-438c-9448-9bd571c9f7ea"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69946337-8c5f-4d16-ba73-f10e67bddaee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69946337-8c5f-4d16-ba73-f10e67bddaee
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69946337-8c5f-4d16-ba73-f10e67bddaee
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
correlation: qa-b982aa90-4b88-4aa9-a908-d140d5572f4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b982aa90-4b88-4aa9-a908-d140d5572f4f
Content-Type: application/json

--- request body ---
{"handle":"qa-cf0a3e9dfc2d","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b982aa90-4b88-4aa9-a908-d140d5572f4f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b982aa90-4b88-4aa9-a908-d140d5572f4f"}
```
