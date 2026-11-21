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
| 1 | `POST /v1/accounts` | 201 | 408 | `qa-ec11bcf6-48b5-433a-aa17-f08f2d4cdca8` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-687a7b72-4268-415e-89e3-e175dca4fafc` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-0e397482-e3eb-4e78-aaca-d01d59839f08` |
| 4 | `POST /v1/conversations` | 201 | 44 | `qa-6052e1cd-4da2-42d0-b8de-988ec7b2c9e2` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 25 | `qa-798f4fbd-84b7-4579-82ac-68e0f0fe2753` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-b12d2609-cbc8-456f-89f8-435700b1d169` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 30 | `qa-73d352bf-5f34-407e-be02-f6b54fec68e3` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-763ece9f-bfdb-4b85-86b5-0364702266e4` |
| 9 | `POST /v1/auth/token` | 401 | 4 | `qa-b172fe94-b75c-4b2e-93c1-30a1f1dfceb4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-902041e6-1012-42e5-9d99-7f5c1ff6a66f` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-2a865776-fa4f-4dda-8fd4-eb2fca48369f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ec11bcf6-48b5-433a-aa17-f08f2d4cdca8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec11bcf6-48b5-433a-aa17-f08f2d4cdca8
Content-Type: application/json

--- request body ---
{"handle":"qa-e95e7409a893","displayName":"QA e95e7409a893","password":"****","region":"eu"}

--- response: 201 in 408 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec11bcf6-48b5-433a-aa17-f08f2d4cdca8
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
Location: /v1/accounts/qa-e95e7409a893
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a47e6e73-717c-4693-bd32-e478fff144df","handle":"qa-e95e7409a893","displayName":"QA e95e7409a893","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.416658522Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-687a7b72-4268-415e-89e3-e175dca4fafc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-687a7b72-4268-415e-89e3-e175dca4fafc
Content-Type: application/json

--- request body ---
{"handle":"qa-c1fac522f503","displayName":"QA c1fac522f503","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-687a7b72-4268-415e-89e3-e175dca4fafc
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
Location: /v1/accounts/qa-c1fac522f503
X-Served-Region: eu
Content-Length: 181

{"id":"acc_118a53ea-1786-43a5-b022-cbff3ab57739","handle":"qa-c1fac522f503","displayName":"QA c1fac522f503","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.740433263Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0e397482-e3eb-4e78-aaca-d01d59839f08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e397482-e3eb-4e78-aaca-d01d59839f08
Content-Type: application/json

--- request body ---
{"handle":"qa-e95e7409a893","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e397482-e3eb-4e78-aaca-d01d59839f08
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a47e6e73-717c-4693-bd32-e478fff144df"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6052e1cd-4da2-42d0-b8de-988ec7b2c9e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6052e1cd-4da2-42d0-b8de-988ec7b2c9e2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c1fac522f503","subject":"Quick question","message":"Hi"}

--- response: 201 in 44 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-6052e1cd-4da2-42d0-b8de-988ec7b2c9e2
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
Location: /v1/conversations/cnv_8175d1fe-ee5e-4d52-b66b-f1eb11321000
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8175d1fe-ee5e-4d52-b66b-f1eb11321000","subject":"Quick question","status":"open","region":"eu","participants":["qa-e95e7409a893","qa-c1fac522f503"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.871775787Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8175d1fe-ee5e-4d52-b66b-f1eb11321000/close
correlation: qa-798f4fbd-84b7-4579-82ac-68e0f0fe2753

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-798f4fbd-84b7-4579-82ac-68e0f0fe2753
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-798f4fbd-84b7-4579-82ac-68e0f0fe2753
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

{"id":"cnv_8175d1fe-ee5e-4d52-b66b-f1eb11321000","subject":"Quick question","status":"closed","region":"eu","participants":["qa-e95e7409a893","qa-c1fac522f503"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.871775787Z","closedAt":"2026-11-21T09:57:09.963343927Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b12d2609-cbc8-456f-89f8-435700b1d169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b12d2609-cbc8-456f-89f8-435700b1d169
Content-Type: application/json

--- request body ---
{"handle":"qa-c1fac522f503","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b12d2609-cbc8-456f-89f8-435700b1d169
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_118a53ea-1786-43a5-b022-cbff3ab57739"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8175d1fe-ee5e-4d52-b66b-f1eb11321000/messages
correlation: qa-73d352bf-5f34-407e-be02-f6b54fec68e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73d352bf-5f34-407e-be02-f6b54fec68e3
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73d352bf-5f34-407e-be02-f6b54fec68e3
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_8175d1fe-ee5e-4d52-b66b-f1eb11321000/messages","correlationId":"qa-73d352bf-5f34-407e-be02-f6b54fec68e3"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-763ece9f-bfdb-4b85-86b5-0364702266e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-763ece9f-bfdb-4b85-86b5-0364702266e4
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-763ece9f-bfdb-4b85-86b5-0364702266e4
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
correlation: qa-b172fe94-b75c-4b2e-93c1-30a1f1dfceb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b172fe94-b75c-4b2e-93c1-30a1f1dfceb4
Content-Type: application/json

--- request body ---
{"handle":"qa-c1fac522f503","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b172fe94-b75c-4b2e-93c1-30a1f1dfceb4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b172fe94-b75c-4b2e-93c1-30a1f1dfceb4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-902041e6-1012-42e5-9d99-7f5c1ff6a66f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-902041e6-1012-42e5-9d99-7f5c1ff6a66f
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-902041e6-1012-42e5-9d99-7f5c1ff6a66f
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
correlation: qa-2a865776-fa4f-4dda-8fd4-eb2fca48369f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a865776-fa4f-4dda-8fd4-eb2fca48369f
Content-Type: application/json

--- request body ---
{"handle":"qa-e95e7409a893","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a865776-fa4f-4dda-8fd4-eb2fca48369f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2a865776-fa4f-4dda-8fd4-eb2fca48369f"}
```
