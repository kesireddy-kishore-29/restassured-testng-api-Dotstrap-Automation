# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 393 | `qa-b7c3fd4a-caea-469d-b1f4-0698c57170e3` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-6ff985d4-8d5d-4fd4-994d-453396dd6abd` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-8955c7ff-83f5-47fe-a9a8-2b1412fe2db5` |
| 4 | `POST /v1/conversations` | 201 | 46 | `qa-c45399e7-3cd3-49da-8ab6-6eb69653ab35` |
| 5 | `POST /v1/auth/token` | 200 | 40 | `qa-4b76c539-7592-4b11-af1d-039c480ef67c` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 29 | `qa-e10ee2f1-b457-4e20-a3fd-8f0c07971015` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 14 | `qa-1cbfa904-4803-4f49-9992-39f56c31d0e1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-96b12419-6b09-4731-90e1-713d943b156f` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-d6f21bc7-866e-48bb-a87a-348229f45ca9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6430461e-fa87-4e1b-9cb0-941ca868b73b` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-fab79a0e-08ba-4e9d-81b3-85302a8c774d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b7c3fd4a-caea-469d-b1f4-0698c57170e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7c3fd4a-caea-469d-b1f4-0698c57170e3
Content-Type: application/json

--- request body ---
{"handle":"qa-65702f5dc5ea","displayName":"QA 65702f5dc5ea","password":"****","region":"eu"}

--- response: 201 in 393 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7c3fd4a-caea-469d-b1f4-0698c57170e3
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
Location: /v1/accounts/qa-65702f5dc5ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_731a97c8-adf1-4854-a26f-69b274231eee","handle":"qa-65702f5dc5ea","displayName":"QA 65702f5dc5ea","region":"eu","role":"user","createdAt":"2026-11-27T10:59:54.334550446Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6ff985d4-8d5d-4fd4-994d-453396dd6abd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ff985d4-8d5d-4fd4-994d-453396dd6abd
Content-Type: application/json

--- request body ---
{"handle":"qa-4d48f0ee96fc","displayName":"QA 4d48f0ee96fc","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ff985d4-8d5d-4fd4-994d-453396dd6abd
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
Location: /v1/accounts/qa-4d48f0ee96fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d9c4c42-3261-491d-a6b2-21ef4a773853","handle":"qa-4d48f0ee96fc","displayName":"QA 4d48f0ee96fc","region":"eu","role":"user","createdAt":"2026-11-27T10:59:54.852392286Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8955c7ff-83f5-47fe-a9a8-2b1412fe2db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8955c7ff-83f5-47fe-a9a8-2b1412fe2db5
Content-Type: application/json

--- request body ---
{"handle":"qa-65702f5dc5ea","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8955c7ff-83f5-47fe-a9a8-2b1412fe2db5
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_731a97c8-adf1-4854-a26f-69b274231eee"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c45399e7-3cd3-49da-8ab6-6eb69653ab35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c45399e7-3cd3-49da-8ab6-6eb69653ab35
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4d48f0ee96fc","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 46 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c45399e7-3cd3-49da-8ab6-6eb69653ab35
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
Location: /v1/conversations/cnv_79bdc833-41a3-477c-8a3a-123a8d67f4d7
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_79bdc833-41a3-477c-8a3a-123a8d67f4d7","subject":"Lunch?","status":"open","region":"eu","participants":["qa-65702f5dc5ea","qa-4d48f0ee96fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:54.977465067Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4b76c539-7592-4b11-af1d-039c480ef67c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b76c539-7592-4b11-af1d-039c480ef67c
Content-Type: application/json

--- request body ---
{"handle":"qa-4d48f0ee96fc","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b76c539-7592-4b11-af1d-039c480ef67c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d9c4c42-3261-491d-a6b2-21ef4a773853"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_79bdc833-41a3-477c-8a3a-123a8d67f4d7/messages
correlation: qa-e10ee2f1-b457-4e20-a3fd-8f0c07971015

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e10ee2f1-b457-4e20-a3fd-8f0c07971015
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-e10ee2f1-b457-4e20-a3fd-8f0c07971015
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
Content-Length: 203

{"id":"msg_71f978fd-f661-4a5e-82ad-eb1a461ce6a0","conversationId":"cnv_79bdc833-41a3-477c-8a3a-123a8d67f4d7","sender":"qa-4d48f0ee96fc","body":"Friday works","createdAt":"2026-11-27T10:59:55.181956478Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_79bdc833-41a3-477c-8a3a-123a8d67f4d7/messages
correlation: qa-1cbfa904-4803-4f49-9992-39f56c31d0e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cbfa904-4803-4f49-9992-39f56c31d0e1
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cbfa904-4803-4f49-9992-39f56c31d0e1
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
Content-Length: 432

{"items":[{"id":"msg_1be64b4a-888d-4c9b-85a2-59d38ebca8d4","conversationId":"cnv_79bdc833-41a3-477c-8a3a-123a8d67f4d7","sender":"qa-65702f5dc5ea","body":"Free on Friday?","createdAt":"2026-11-27T10:59:54.977762482Z"},{"id":"msg_71f978fd-f661-4a5e-82ad-eb1a461ce6a0","conversationId":"cnv_79bdc833-41a3-477c-8a3a-123a8d67f4d7","sender":"qa-4d48f0ee96fc","body":"Friday works","createdAt":"2026-11-27T10:59:55.181956478Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96b12419-6b09-4731-90e1-713d943b156f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96b12419-6b09-4731-90e1-713d943b156f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96b12419-6b09-4731-90e1-713d943b156f
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
correlation: qa-d6f21bc7-866e-48bb-a87a-348229f45ca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6f21bc7-866e-48bb-a87a-348229f45ca9
Content-Type: application/json

--- request body ---
{"handle":"qa-4d48f0ee96fc","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6f21bc7-866e-48bb-a87a-348229f45ca9
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d6f21bc7-866e-48bb-a87a-348229f45ca9"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6430461e-fa87-4e1b-9cb0-941ca868b73b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6430461e-fa87-4e1b-9cb0-941ca868b73b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6430461e-fa87-4e1b-9cb0-941ca868b73b
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
correlation: qa-fab79a0e-08ba-4e9d-81b3-85302a8c774d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fab79a0e-08ba-4e9d-81b3-85302a8c774d
Content-Type: application/json

--- request body ---
{"handle":"qa-65702f5dc5ea","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fab79a0e-08ba-4e9d-81b3-85302a8c774d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fab79a0e-08ba-4e9d-81b3-85302a8c774d"}
```
