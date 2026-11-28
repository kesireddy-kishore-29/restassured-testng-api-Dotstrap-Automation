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
| 1 | `POST /v1/accounts` | 201 | 372 | `qa-ea3a94f5-d880-4c4d-8cb5-660701b1cfb9` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-a87d9730-7388-4989-84fd-285ef06a3c94` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-200bacef-c5d5-44c5-ab2a-f39c6c08272d` |
| 4 | `POST /v1/conversations` | 201 | 52 | `qa-7ed4ccec-1076-466b-8fd9-54cab2f6a742` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 16 | `qa-25b98d45-5237-4358-876a-c690d0c0bfec` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-dbadb0ac-2f49-4621-9ca6-dfd9d3dfda12` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 39 | `qa-fe5d41d3-26a7-42ed-8461-005a22d86f9a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7e79c60b-c487-4de3-8532-ee902cffd4af` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-3a03e565-c516-4c1c-92ac-d4bbb324adbc` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d002287e-7424-4697-b667-245c59e83796` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-4a99b9b2-6240-42c9-aeb0-f97ac70693b9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea3a94f5-d880-4c4d-8cb5-660701b1cfb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea3a94f5-d880-4c4d-8cb5-660701b1cfb9
Content-Type: application/json

--- request body ---
{"handle":"qa-e2709f6e5c87","displayName":"QA e2709f6e5c87","password":"****","region":"eu"}

--- response: 201 in 372 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea3a94f5-d880-4c4d-8cb5-660701b1cfb9
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
Location: /v1/accounts/qa-e2709f6e5c87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f24cfbb-4867-4596-b940-70046a74a7e6","handle":"qa-e2709f6e5c87","displayName":"QA e2709f6e5c87","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.002321107Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a87d9730-7388-4989-84fd-285ef06a3c94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a87d9730-7388-4989-84fd-285ef06a3c94
Content-Type: application/json

--- request body ---
{"handle":"qa-2016c328af2e","displayName":"QA 2016c328af2e","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a87d9730-7388-4989-84fd-285ef06a3c94
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
Location: /v1/accounts/qa-2016c328af2e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1074d6f-2ef3-468b-9a5b-ce03be6e7f57","handle":"qa-2016c328af2e","displayName":"QA 2016c328af2e","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.444739208Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-200bacef-c5d5-44c5-ab2a-f39c6c08272d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-200bacef-c5d5-44c5-ab2a-f39c6c08272d
Content-Type: application/json

--- request body ---
{"handle":"qa-e2709f6e5c87","password":"****"}

--- response: 200 in 56 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-200bacef-c5d5-44c5-ab2a-f39c6c08272d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f24cfbb-4867-4596-b940-70046a74a7e6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7ed4ccec-1076-466b-8fd9-54cab2f6a742

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ed4ccec-1076-466b-8fd9-54cab2f6a742
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2016c328af2e","subject":"Quick question","message":"Hi"}

--- response: 201 in 52 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ed4ccec-1076-466b-8fd9-54cab2f6a742
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
Location: /v1/conversations/cnv_1fefa47e-d388-49fa-85a5-dd57cfc41262
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1fefa47e-d388-49fa-85a5-dd57cfc41262","subject":"Quick question","status":"open","region":"eu","participants":["qa-e2709f6e5c87","qa-2016c328af2e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.610088750Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1fefa47e-d388-49fa-85a5-dd57cfc41262/close
correlation: qa-25b98d45-5237-4358-876a-c690d0c0bfec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25b98d45-5237-4358-876a-c690d0c0bfec
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-25b98d45-5237-4358-876a-c690d0c0bfec
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

{"id":"cnv_1fefa47e-d388-49fa-85a5-dd57cfc41262","subject":"Quick question","status":"closed","region":"eu","participants":["qa-e2709f6e5c87","qa-2016c328af2e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.610088750Z","closedAt":"2026-11-25T11:27:57.680133884Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dbadb0ac-2f49-4621-9ca6-dfd9d3dfda12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbadb0ac-2f49-4621-9ca6-dfd9d3dfda12
Content-Type: application/json

--- request body ---
{"handle":"qa-2016c328af2e","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbadb0ac-2f49-4621-9ca6-dfd9d3dfda12
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1074d6f-2ef3-468b-9a5b-ce03be6e7f57"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_1fefa47e-d388-49fa-85a5-dd57cfc41262/messages
correlation: qa-fe5d41d3-26a7-42ed-8461-005a22d86f9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe5d41d3-26a7-42ed-8461-005a22d86f9a
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe5d41d3-26a7-42ed-8461-005a22d86f9a
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_1fefa47e-d388-49fa-85a5-dd57cfc41262/messages","correlationId":"qa-fe5d41d3-26a7-42ed-8461-005a22d86f9a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e79c60b-c487-4de3-8532-ee902cffd4af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e79c60b-c487-4de3-8532-ee902cffd4af
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e79c60b-c487-4de3-8532-ee902cffd4af
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
correlation: qa-3a03e565-c516-4c1c-92ac-d4bbb324adbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a03e565-c516-4c1c-92ac-d4bbb324adbc
Content-Type: application/json

--- request body ---
{"handle":"qa-2016c328af2e","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a03e565-c516-4c1c-92ac-d4bbb324adbc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a03e565-c516-4c1c-92ac-d4bbb324adbc"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d002287e-7424-4697-b667-245c59e83796

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d002287e-7424-4697-b667-245c59e83796
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d002287e-7424-4697-b667-245c59e83796
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
correlation: qa-4a99b9b2-6240-42c9-aeb0-f97ac70693b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a99b9b2-6240-42c9-aeb0-f97ac70693b9
Content-Type: application/json

--- request body ---
{"handle":"qa-e2709f6e5c87","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a99b9b2-6240-42c9-aeb0-f97ac70693b9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a99b9b2-6240-42c9-aeb0-f97ac70693b9"}
```
