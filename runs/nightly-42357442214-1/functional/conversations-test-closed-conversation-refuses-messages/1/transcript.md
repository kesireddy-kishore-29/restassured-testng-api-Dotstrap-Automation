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
| 1 | `POST /v1/accounts` | 201 | 418 | `qa-01acadcd-610c-4912-abe2-f863d8fefc28` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-25364d12-6e16-451b-80fd-5f2001fbf5b4` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-82027633-3854-4fbd-b795-062972501679` |
| 4 | `POST /v1/conversations` | 201 | 66 | `qa-a01a4f03-3c9f-4ff6-be73-c3b0b3675cdf` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 35 | `qa-918e1f7c-50a0-4598-a4a1-fe0e24614d58` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-4a30a263-06c2-4a5f-a877-b7299636e005` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 15 | `qa-e6316804-745b-452a-8f4f-3a37658eba4f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e0ea73b2-c222-4f4c-861d-43e7adb4c2ce` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-cc15e8e3-8d2a-4cce-83ce-2285e0e44238` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-4f2cdd29-f1ae-46fc-b9e7-a9446a334745` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-86f6ae08-d404-4167-9759-b4869912d3b1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01acadcd-610c-4912-abe2-f863d8fefc28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01acadcd-610c-4912-abe2-f863d8fefc28
Content-Type: application/json

--- request body ---
{"handle":"qa-fae0837db485","displayName":"QA fae0837db485","password":"****","region":"eu"}

--- response: 201 in 418 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-01acadcd-610c-4912-abe2-f863d8fefc28
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
Location: /v1/accounts/qa-fae0837db485
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1d5a6a4-0d76-426c-9853-1f6613a6183b","handle":"qa-fae0837db485","displayName":"QA fae0837db485","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.190036247Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-25364d12-6e16-451b-80fd-5f2001fbf5b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25364d12-6e16-451b-80fd-5f2001fbf5b4
Content-Type: application/json

--- request body ---
{"handle":"qa-4570cc6e49ed","displayName":"QA 4570cc6e49ed","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-25364d12-6e16-451b-80fd-5f2001fbf5b4
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
Location: /v1/accounts/qa-4570cc6e49ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b3ff0937-30f9-4e88-b5ea-5b33cdad610d","handle":"qa-4570cc6e49ed","displayName":"QA 4570cc6e49ed","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.669244202Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-82027633-3854-4fbd-b795-062972501679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82027633-3854-4fbd-b795-062972501679
Content-Type: application/json

--- request body ---
{"handle":"qa-fae0837db485","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-82027633-3854-4fbd-b795-062972501679
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1d5a6a4-0d76-426c-9853-1f6613a6183b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a01a4f03-3c9f-4ff6-be73-c3b0b3675cdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a01a4f03-3c9f-4ff6-be73-c3b0b3675cdf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4570cc6e49ed","subject":"Quick question","message":"Hi"}

--- response: 201 in 66 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a01a4f03-3c9f-4ff6-be73-c3b0b3675cdf
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
Location: /v1/conversations/cnv_c05e22f4-999b-4a78-8f5d-5511b61048a1
X-Data-Region: eu
Content-Length: 234

{"id":"cnv_c05e22f4-999b-4a78-8f5d-5511b61048a1","subject":"Quick question","status":"open","region":"eu","participants":["qa-fae0837db485","qa-4570cc6e49ed"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:55:03.849215Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c05e22f4-999b-4a78-8f5d-5511b61048a1/close
correlation: qa-918e1f7c-50a0-4598-a4a1-fe0e24614d58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-918e1f7c-50a0-4598-a4a1-fe0e24614d58
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-918e1f7c-50a0-4598-a4a1-fe0e24614d58
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
Content-Length: 280

{"id":"cnv_c05e22f4-999b-4a78-8f5d-5511b61048a1","subject":"Quick question","status":"closed","region":"eu","participants":["qa-fae0837db485","qa-4570cc6e49ed"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:55:03.849215Z","closedAt":"2026-11-07T08:55:03.966586104Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4a30a263-06c2-4a5f-a877-b7299636e005

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a30a263-06c2-4a5f-a877-b7299636e005
Content-Type: application/json

--- request body ---
{"handle":"qa-4570cc6e49ed","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a30a263-06c2-4a5f-a877-b7299636e005
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3ff0937-30f9-4e88-b5ea-5b33cdad610d"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c05e22f4-999b-4a78-8f5d-5511b61048a1/messages
correlation: qa-e6316804-745b-452a-8f4f-3a37658eba4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6316804-745b-452a-8f4f-3a37658eba4f
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 15 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6316804-745b-452a-8f4f-3a37658eba4f
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_c05e22f4-999b-4a78-8f5d-5511b61048a1/messages","correlationId":"qa-e6316804-745b-452a-8f4f-3a37658eba4f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e0ea73b2-c222-4f4c-861d-43e7adb4c2ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0ea73b2-c222-4f4c-861d-43e7adb4c2ce
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e0ea73b2-c222-4f4c-861d-43e7adb4c2ce
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
correlation: qa-cc15e8e3-8d2a-4cce-83ce-2285e0e44238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc15e8e3-8d2a-4cce-83ce-2285e0e44238
Content-Type: application/json

--- request body ---
{"handle":"qa-4570cc6e49ed","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc15e8e3-8d2a-4cce-83ce-2285e0e44238
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc15e8e3-8d2a-4cce-83ce-2285e0e44238"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f2cdd29-f1ae-46fc-b9e7-a9446a334745

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f2cdd29-f1ae-46fc-b9e7-a9446a334745
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f2cdd29-f1ae-46fc-b9e7-a9446a334745
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
correlation: qa-86f6ae08-d404-4167-9759-b4869912d3b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f6ae08-d404-4167-9759-b4869912d3b1
Content-Type: application/json

--- request body ---
{"handle":"qa-fae0837db485","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86f6ae08-d404-4167-9759-b4869912d3b1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-86f6ae08-d404-4167-9759-b4869912d3b1"}
```
