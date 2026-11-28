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
| 1 | `POST /v1/accounts` | 201 | 373 | `qa-512b733e-ded8-403d-a98f-7aad4e9bdd55` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-72148599-61e9-4758-a72e-bff7a7d8073f` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-ddc74493-14b2-4d77-b2d1-f119b460d0bf` |
| 4 | `POST /v1/conversations` | 201 | 54 | `qa-264306a7-9862-4cf4-99d4-4c5c19267fa8` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 38 | `qa-3910378c-99a8-4bbb-9cb8-0da2034e8068` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-18905ab4-b324-4f07-965c-692e3da89c95` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 37 | `qa-083bea9f-3b84-45df-a120-545ba2e2e0d4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-c6f93730-5cec-4ec1-a16b-7348ee811052` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-e5459539-feb1-4ad5-bea9-4728cb468c20` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-6b31a097-a00c-48c7-b23a-478bb5081d04` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-d890d6b4-b84c-461e-8456-372b37e65ab9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-512b733e-ded8-403d-a98f-7aad4e9bdd55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-512b733e-ded8-403d-a98f-7aad4e9bdd55
Content-Type: application/json

--- request body ---
{"handle":"qa-411c583a6652","displayName":"QA 411c583a6652","password":"****","region":"eu"}

--- response: 201 in 373 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-512b733e-ded8-403d-a98f-7aad4e9bdd55
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
Location: /v1/accounts/qa-411c583a6652
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0669d82e-0e22-4877-9847-a65b1998603f","handle":"qa-411c583a6652","displayName":"QA 411c583a6652","region":"eu","role":"user","createdAt":"2026-11-22T09:54:53.885317178Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-72148599-61e9-4758-a72e-bff7a7d8073f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72148599-61e9-4758-a72e-bff7a7d8073f
Content-Type: application/json

--- request body ---
{"handle":"qa-e93d9e0af71f","displayName":"QA e93d9e0af71f","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-72148599-61e9-4758-a72e-bff7a7d8073f
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
Location: /v1/accounts/qa-e93d9e0af71f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3badb8b3-68e6-4364-aa7f-1a830ad18336","handle":"qa-e93d9e0af71f","displayName":"QA e93d9e0af71f","region":"eu","role":"user","createdAt":"2026-11-22T09:54:54.325316908Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ddc74493-14b2-4d77-b2d1-f119b460d0bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddc74493-14b2-4d77-b2d1-f119b460d0bf
Content-Type: application/json

--- request body ---
{"handle":"qa-411c583a6652","password":"****"}

--- response: 200 in 49 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddc74493-14b2-4d77-b2d1-f119b460d0bf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0669d82e-0e22-4877-9847-a65b1998603f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-264306a7-9862-4cf4-99d4-4c5c19267fa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-264306a7-9862-4cf4-99d4-4c5c19267fa8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e93d9e0af71f","subject":"Quick question","message":"Hi"}

--- response: 201 in 54 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-264306a7-9862-4cf4-99d4-4c5c19267fa8
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
Location: /v1/conversations/cnv_11f1fb03-0b99-49bc-995e-618eaedfe802
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_11f1fb03-0b99-49bc-995e-618eaedfe802","subject":"Quick question","status":"open","region":"eu","participants":["qa-411c583a6652","qa-e93d9e0af71f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:54.483121101Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_11f1fb03-0b99-49bc-995e-618eaedfe802/close
correlation: qa-3910378c-99a8-4bbb-9cb8-0da2034e8068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3910378c-99a8-4bbb-9cb8-0da2034e8068
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3910378c-99a8-4bbb-9cb8-0da2034e8068
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

{"id":"cnv_11f1fb03-0b99-49bc-995e-618eaedfe802","subject":"Quick question","status":"closed","region":"eu","participants":["qa-411c583a6652","qa-e93d9e0af71f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:54.483121101Z","closedAt":"2026-11-22T09:54:54.610496212Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-18905ab4-b324-4f07-965c-692e3da89c95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18905ab4-b324-4f07-965c-692e3da89c95
Content-Type: application/json

--- request body ---
{"handle":"qa-e93d9e0af71f","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-18905ab4-b324-4f07-965c-692e3da89c95
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3badb8b3-68e6-4364-aa7f-1a830ad18336"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_11f1fb03-0b99-49bc-995e-618eaedfe802/messages
correlation: qa-083bea9f-3b84-45df-a120-545ba2e2e0d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-083bea9f-3b84-45df-a120-545ba2e2e0d4
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 37 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-083bea9f-3b84-45df-a120-545ba2e2e0d4
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_11f1fb03-0b99-49bc-995e-618eaedfe802/messages","correlationId":"qa-083bea9f-3b84-45df-a120-545ba2e2e0d4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6f93730-5cec-4ec1-a16b-7348ee811052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6f93730-5cec-4ec1-a16b-7348ee811052
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6f93730-5cec-4ec1-a16b-7348ee811052
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
correlation: qa-e5459539-feb1-4ad5-bea9-4728cb468c20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5459539-feb1-4ad5-bea9-4728cb468c20
Content-Type: application/json

--- request body ---
{"handle":"qa-e93d9e0af71f","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5459539-feb1-4ad5-bea9-4728cb468c20
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5459539-feb1-4ad5-bea9-4728cb468c20"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b31a097-a00c-48c7-b23a-478bb5081d04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b31a097-a00c-48c7-b23a-478bb5081d04
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b31a097-a00c-48c7-b23a-478bb5081d04
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
correlation: qa-d890d6b4-b84c-461e-8456-372b37e65ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d890d6b4-b84c-461e-8456-372b37e65ab9
Content-Type: application/json

--- request body ---
{"handle":"qa-411c583a6652","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d890d6b4-b84c-461e-8456-372b37e65ab9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d890d6b4-b84c-461e-8456-372b37e65ab9"}
```
