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
| 1 | `POST /v1/accounts` | 201 | 331 | `qa-1aaf6e1a-d201-4064-9b6e-f598067cb0d3` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-e40ab4c1-99ea-4c27-80e8-4d3ba7a033a5` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-b7835ece-24b9-4245-be52-771951300324` |
| 4 | `POST /v1/conversations` | 201 | 50 | `qa-f3582f2b-c2e7-47e8-860d-52e2f2f3f906` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 32 | `qa-f9d55620-6c14-4563-bb5d-6aa913a5f845` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-64e80ce7-98a0-4678-9c4b-af53bcd44a02` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 40 | `qa-dad4a31e-922f-4671-9f10-b84e3ea367e6` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e286699d-ed7d-431c-8f9b-8f7a625abff6` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-71754e2c-83b7-4004-bf5f-5b7ce9d0b686` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-07c0b4e6-6b7b-4e01-b789-2a78d19b9c8c` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-793a1ac2-262e-4840-a6a2-fe6b4a5bca4b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1aaf6e1a-d201-4064-9b6e-f598067cb0d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1aaf6e1a-d201-4064-9b6e-f598067cb0d3
Content-Type: application/json

--- request body ---
{"handle":"qa-dc9c1ca726cb","displayName":"QA dc9c1ca726cb","password":"****","region":"eu"}

--- response: 201 in 331 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1aaf6e1a-d201-4064-9b6e-f598067cb0d3
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
Location: /v1/accounts/qa-dc9c1ca726cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d086c711-e072-4b42-8ee4-6f4ac8d18cc5","handle":"qa-dc9c1ca726cb","displayName":"QA dc9c1ca726cb","region":"eu","role":"user","createdAt":"2026-11-17T10:50:10.067191634Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e40ab4c1-99ea-4c27-80e8-4d3ba7a033a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e40ab4c1-99ea-4c27-80e8-4d3ba7a033a5
Content-Type: application/json

--- request body ---
{"handle":"qa-8b4f3c7cf860","displayName":"QA 8b4f3c7cf860","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e40ab4c1-99ea-4c27-80e8-4d3ba7a033a5
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
Location: /v1/accounts/qa-8b4f3c7cf860
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab552efc-5015-4e68-8a79-5f7a51d56ca7","handle":"qa-8b4f3c7cf860","displayName":"QA 8b4f3c7cf860","region":"eu","role":"user","createdAt":"2026-11-17T10:50:10.512726409Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b7835ece-24b9-4245-be52-771951300324

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7835ece-24b9-4245-be52-771951300324
Content-Type: application/json

--- request body ---
{"handle":"qa-dc9c1ca726cb","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7835ece-24b9-4245-be52-771951300324
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d086c711-e072-4b42-8ee4-6f4ac8d18cc5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f3582f2b-c2e7-47e8-860d-52e2f2f3f906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3582f2b-c2e7-47e8-860d-52e2f2f3f906
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8b4f3c7cf860","subject":"Quick question","message":"Hi"}

--- response: 201 in 50 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3582f2b-c2e7-47e8-860d-52e2f2f3f906
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
Location: /v1/conversations/cnv_83777dc9-b52b-4697-9241-33dc9a2a1926
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_83777dc9-b52b-4697-9241-33dc9a2a1926","subject":"Quick question","status":"open","region":"eu","participants":["qa-dc9c1ca726cb","qa-8b4f3c7cf860"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:10.664497819Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_83777dc9-b52b-4697-9241-33dc9a2a1926/close
correlation: qa-f9d55620-6c14-4563-bb5d-6aa913a5f845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9d55620-6c14-4563-bb5d-6aa913a5f845
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9d55620-6c14-4563-bb5d-6aa913a5f845
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

{"id":"cnv_83777dc9-b52b-4697-9241-33dc9a2a1926","subject":"Quick question","status":"closed","region":"eu","participants":["qa-dc9c1ca726cb","qa-8b4f3c7cf860"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:10.664497819Z","closedAt":"2026-11-17T10:50:10.754480497Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-64e80ce7-98a0-4678-9c4b-af53bcd44a02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64e80ce7-98a0-4678-9c4b-af53bcd44a02
Content-Type: application/json

--- request body ---
{"handle":"qa-8b4f3c7cf860","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-64e80ce7-98a0-4678-9c4b-af53bcd44a02
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab552efc-5015-4e68-8a79-5f7a51d56ca7"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_83777dc9-b52b-4697-9241-33dc9a2a1926/messages
correlation: qa-dad4a31e-922f-4671-9f10-b84e3ea367e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dad4a31e-922f-4671-9f10-b84e3ea367e6
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 40 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dad4a31e-922f-4671-9f10-b84e3ea367e6
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_83777dc9-b52b-4697-9241-33dc9a2a1926/messages","correlationId":"qa-dad4a31e-922f-4671-9f10-b84e3ea367e6"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e286699d-ed7d-431c-8f9b-8f7a625abff6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e286699d-ed7d-431c-8f9b-8f7a625abff6
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e286699d-ed7d-431c-8f9b-8f7a625abff6
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
correlation: qa-71754e2c-83b7-4004-bf5f-5b7ce9d0b686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71754e2c-83b7-4004-bf5f-5b7ce9d0b686
Content-Type: application/json

--- request body ---
{"handle":"qa-8b4f3c7cf860","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71754e2c-83b7-4004-bf5f-5b7ce9d0b686
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71754e2c-83b7-4004-bf5f-5b7ce9d0b686"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07c0b4e6-6b7b-4e01-b789-2a78d19b9c8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07c0b4e6-6b7b-4e01-b789-2a78d19b9c8c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07c0b4e6-6b7b-4e01-b789-2a78d19b9c8c
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
correlation: qa-793a1ac2-262e-4840-a6a2-fe6b4a5bca4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-793a1ac2-262e-4840-a6a2-fe6b4a5bca4b
Content-Type: application/json

--- request body ---
{"handle":"qa-dc9c1ca726cb","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-793a1ac2-262e-4840-a6a2-fe6b4a5bca4b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-793a1ac2-262e-4840-a6a2-fe6b4a5bca4b"}
```
