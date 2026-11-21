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
| 1 | `POST /v1/accounts` | 201 | 386 | `qa-01e81325-7428-4b71-b8ac-47da8ed368f5` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-1cc6a13e-f43c-4829-8b3e-7f91040d16f9` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-795b5cdf-336f-4c8e-8959-244f98bf2ce5` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-eb6848fe-0eb8-49e6-b9cd-db15bb1f4732` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 27 | `qa-10240dfe-942d-4ff2-b79f-9e4b943f2c0d` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-8b22a8a9-dfd5-422c-bb31-51a4c2272a1b` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 17 | `qa-3a9de8c7-7214-4103-9f27-370fff8d2a76` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-9ea22b5a-50c1-411f-8587-f87d67c96c76` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-12263d2a-3598-48c6-b038-224bc456e6c8` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b5a6ab49-6595-4f15-ba45-91e4468db21d` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-9fbeaeff-652c-4e86-86c2-c2b3a18e10ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01e81325-7428-4b71-b8ac-47da8ed368f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01e81325-7428-4b71-b8ac-47da8ed368f5
Content-Type: application/json

--- request body ---
{"handle":"qa-e38ef9d6d214","displayName":"QA e38ef9d6d214","password":"****","region":"eu"}

--- response: 201 in 386 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-01e81325-7428-4b71-b8ac-47da8ed368f5
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
Location: /v1/accounts/qa-e38ef9d6d214
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f5e4b9c-f0b3-465f-81de-1685a3365772","handle":"qa-e38ef9d6d214","displayName":"QA e38ef9d6d214","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.434897526Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1cc6a13e-f43c-4829-8b3e-7f91040d16f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cc6a13e-f43c-4829-8b3e-7f91040d16f9
Content-Type: application/json

--- request body ---
{"handle":"qa-cb8743ca1f51","displayName":"QA cb8743ca1f51","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cc6a13e-f43c-4829-8b3e-7f91040d16f9
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
Location: /v1/accounts/qa-cb8743ca1f51
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85cc0ef7-81f6-40a4-a74c-11d4898a1aa2","handle":"qa-cb8743ca1f51","displayName":"QA cb8743ca1f51","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.819002613Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-795b5cdf-336f-4c8e-8959-244f98bf2ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795b5cdf-336f-4c8e-8959-244f98bf2ce5
Content-Type: application/json

--- request body ---
{"handle":"qa-e38ef9d6d214","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-795b5cdf-336f-4c8e-8959-244f98bf2ce5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f5e4b9c-f0b3-465f-81de-1685a3365772"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-eb6848fe-0eb8-49e6-b9cd-db15bb1f4732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb6848fe-0eb8-49e6-b9cd-db15bb1f4732
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cb8743ca1f51","subject":"Quick question","message":"Hi"}

--- response: 201 in 48 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb6848fe-0eb8-49e6-b9cd-db15bb1f4732
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
Location: /v1/conversations/cnv_a86414a0-3583-4187-8ca4-2e792ae646a5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a86414a0-3583-4187-8ca4-2e792ae646a5","subject":"Quick question","status":"open","region":"eu","participants":["qa-e38ef9d6d214","qa-cb8743ca1f51"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.966938226Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a86414a0-3583-4187-8ca4-2e792ae646a5/close
correlation: qa-10240dfe-942d-4ff2-b79f-9e4b943f2c0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10240dfe-942d-4ff2-b79f-9e4b943f2c0d
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-10240dfe-942d-4ff2-b79f-9e4b943f2c0d
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

{"id":"cnv_a86414a0-3583-4187-8ca4-2e792ae646a5","subject":"Quick question","status":"closed","region":"eu","participants":["qa-e38ef9d6d214","qa-cb8743ca1f51"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.966938226Z","closedAt":"2026-11-15T09:36:10.068231366Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8b22a8a9-dfd5-422c-bb31-51a4c2272a1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b22a8a9-dfd5-422c-bb31-51a4c2272a1b
Content-Type: application/json

--- request body ---
{"handle":"qa-cb8743ca1f51","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b22a8a9-dfd5-422c-bb31-51a4c2272a1b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85cc0ef7-81f6-40a4-a74c-11d4898a1aa2"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_a86414a0-3583-4187-8ca4-2e792ae646a5/messages
correlation: qa-3a9de8c7-7214-4103-9f27-370fff8d2a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a9de8c7-7214-4103-9f27-370fff8d2a76
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a9de8c7-7214-4103-9f27-370fff8d2a76
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_a86414a0-3583-4187-8ca4-2e792ae646a5/messages","correlationId":"qa-3a9de8c7-7214-4103-9f27-370fff8d2a76"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ea22b5a-50c1-411f-8587-f87d67c96c76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ea22b5a-50c1-411f-8587-f87d67c96c76
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ea22b5a-50c1-411f-8587-f87d67c96c76
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
correlation: qa-12263d2a-3598-48c6-b038-224bc456e6c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12263d2a-3598-48c6-b038-224bc456e6c8
Content-Type: application/json

--- request body ---
{"handle":"qa-cb8743ca1f51","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12263d2a-3598-48c6-b038-224bc456e6c8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12263d2a-3598-48c6-b038-224bc456e6c8"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5a6ab49-6595-4f15-ba45-91e4468db21d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5a6ab49-6595-4f15-ba45-91e4468db21d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5a6ab49-6595-4f15-ba45-91e4468db21d
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
correlation: qa-9fbeaeff-652c-4e86-86c2-c2b3a18e10ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fbeaeff-652c-4e86-86c2-c2b3a18e10ee
Content-Type: application/json

--- request body ---
{"handle":"qa-e38ef9d6d214","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fbeaeff-652c-4e86-86c2-c2b3a18e10ee
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fbeaeff-652c-4e86-86c2-c2b3a18e10ee"}
```
