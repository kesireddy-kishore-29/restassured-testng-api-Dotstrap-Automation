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
| 1 | `POST /v1/accounts` | 201 | 409 | `qa-e5148ceb-8575-419b-91d2-4dcd518dfb75` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-ea415332-0915-4b6b-a6e2-b4c681e779c2` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-d1dabfec-9f5a-442f-8bc1-f1e76a25f68f` |
| 4 | `POST /v1/conversations` | 201 | 71 | `qa-b317f8e2-7df4-4478-b651-437bf2107ba5` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 26 | `qa-3861508a-b5b2-4af9-8f5b-3e730f2e9bfc` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-270d7c58-25c9-4dbc-b7df-df9e3db4f6b9` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 53 | `qa-3b8cd3b9-e5ef-4469-beb7-931cf9ec8001` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-10cbb333-0ac0-4790-8b54-759877942b1d` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-4302c202-e129-4bc7-9b43-094a7bdfd9f2` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ee77b7f5-dc6d-4d8b-80d5-5a4b1338e897` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-b282fd6c-3fd7-40e2-afa0-a61ee8ded043` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5148ceb-8575-419b-91d2-4dcd518dfb75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5148ceb-8575-419b-91d2-4dcd518dfb75
Content-Type: application/json

--- request body ---
{"handle":"qa-0a0d8b8c9cdc","displayName":"QA 0a0d8b8c9cdc","password":"****","region":"eu"}

--- response: 201 in 409 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5148ceb-8575-419b-91d2-4dcd518dfb75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-0a0d8b8c9cdc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5a53cfc4-1020-459e-9b75-3b0dcbd3ac7d","handle":"qa-0a0d8b8c9cdc","displayName":"QA 0a0d8b8c9cdc","region":"eu","role":"user","createdAt":"2026-11-03T09:41:46.233674661Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ea415332-0915-4b6b-a6e2-b4c681e779c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea415332-0915-4b6b-a6e2-b4c681e779c2
Content-Type: application/json

--- request body ---
{"handle":"qa-efa551fef4c6","displayName":"QA efa551fef4c6","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea415332-0915-4b6b-a6e2-b4c681e779c2
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
Location: /v1/accounts/qa-efa551fef4c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_64e96182-8128-4a05-9883-3d563f472a1b","handle":"qa-efa551fef4c6","displayName":"QA efa551fef4c6","region":"eu","role":"user","createdAt":"2026-11-03T09:41:46.668974251Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d1dabfec-9f5a-442f-8bc1-f1e76a25f68f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1dabfec-9f5a-442f-8bc1-f1e76a25f68f
Content-Type: application/json

--- request body ---
{"handle":"qa-0a0d8b8c9cdc","password":"****"}

--- response: 200 in 49 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1dabfec-9f5a-442f-8bc1-f1e76a25f68f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5a53cfc4-1020-459e-9b75-3b0dcbd3ac7d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b317f8e2-7df4-4478-b651-437bf2107ba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b317f8e2-7df4-4478-b651-437bf2107ba5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-efa551fef4c6","subject":"Quick question","message":"Hi"}

--- response: 201 in 71 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b317f8e2-7df4-4478-b651-437bf2107ba5
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
Location: /v1/conversations/cnv_f6108a5f-4a74-4143-bb65-77603054ba12
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f6108a5f-4a74-4143-bb65-77603054ba12","subject":"Quick question","status":"open","region":"eu","participants":["qa-0a0d8b8c9cdc","qa-efa551fef4c6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:46.824836814Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f6108a5f-4a74-4143-bb65-77603054ba12/close
correlation: qa-3861508a-b5b2-4af9-8f5b-3e730f2e9bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3861508a-b5b2-4af9-8f5b-3e730f2e9bfc
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3861508a-b5b2-4af9-8f5b-3e730f2e9bfc
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

{"id":"cnv_f6108a5f-4a74-4143-bb65-77603054ba12","subject":"Quick question","status":"closed","region":"eu","participants":["qa-0a0d8b8c9cdc","qa-efa551fef4c6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:46.824836814Z","closedAt":"2026-11-03T09:41:46.982507416Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-270d7c58-25c9-4dbc-b7df-df9e3db4f6b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-270d7c58-25c9-4dbc-b7df-df9e3db4f6b9
Content-Type: application/json

--- request body ---
{"handle":"qa-efa551fef4c6","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-270d7c58-25c9-4dbc-b7df-df9e3db4f6b9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64e96182-8128-4a05-9883-3d563f472a1b"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f6108a5f-4a74-4143-bb65-77603054ba12/messages
correlation: qa-3b8cd3b9-e5ef-4469-beb7-931cf9ec8001

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b8cd3b9-e5ef-4469-beb7-931cf9ec8001
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 53 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b8cd3b9-e5ef-4469-beb7-931cf9ec8001
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_f6108a5f-4a74-4143-bb65-77603054ba12/messages","correlationId":"qa-3b8cd3b9-e5ef-4469-beb7-931cf9ec8001"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-10cbb333-0ac0-4790-8b54-759877942b1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10cbb333-0ac0-4790-8b54-759877942b1d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-10cbb333-0ac0-4790-8b54-759877942b1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4302c202-e129-4bc7-9b43-094a7bdfd9f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4302c202-e129-4bc7-9b43-094a7bdfd9f2
Content-Type: application/json

--- request body ---
{"handle":"qa-efa551fef4c6","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4302c202-e129-4bc7-9b43-094a7bdfd9f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4302c202-e129-4bc7-9b43-094a7bdfd9f2"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee77b7f5-dc6d-4d8b-80d5-5a4b1338e897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee77b7f5-dc6d-4d8b-80d5-5a4b1338e897
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee77b7f5-dc6d-4d8b-80d5-5a4b1338e897
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
correlation: qa-b282fd6c-3fd7-40e2-afa0-a61ee8ded043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b282fd6c-3fd7-40e2-afa0-a61ee8ded043
Content-Type: application/json

--- request body ---
{"handle":"qa-0a0d8b8c9cdc","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b282fd6c-3fd7-40e2-afa0-a61ee8ded043
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b282fd6c-3fd7-40e2-afa0-a61ee8ded043"}
```
