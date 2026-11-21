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
| 1 | `POST /v1/accounts` | 201 | 421 | `qa-4d7d40e0-0113-49b7-82c2-d9251c6f700e` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-ea97fad3-d107-4bc2-9aa4-757ac76a9340` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-982cf1de-f479-4c7a-9a91-0c4a72b7575b` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-edd1b102-f707-4dec-ab56-7afe3036abb7` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 30 | `qa-2b10ad0a-14d2-4ef2-914f-2f3ba283e6b7` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-eeca7fd9-4331-4756-9741-8a5867118f89` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 29 | `qa-61214751-4ced-41b7-8216-011dd69fdc32` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-e0e3d235-921e-4e87-ac93-ce3384ccead2` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-7ba07c55-4541-4ba5-b927-70d5bb319658` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-91a07679-58c8-4423-b889-5950d42d06b9` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-e18f0396-ff5c-4464-820e-69e740295d0b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4d7d40e0-0113-49b7-82c2-d9251c6f700e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d7d40e0-0113-49b7-82c2-d9251c6f700e
Content-Type: application/json

--- request body ---
{"handle":"qa-af97999ebf29","displayName":"QA af97999ebf29","password":"****","region":"eu"}

--- response: 201 in 421 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d7d40e0-0113-49b7-82c2-d9251c6f700e
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
Location: /v1/accounts/qa-af97999ebf29
X-Served-Region: eu
Content-Length: 181

{"id":"acc_510da4bb-0d6b-4090-8df1-d47aab54bacf","handle":"qa-af97999ebf29","displayName":"QA af97999ebf29","region":"eu","role":"user","createdAt":"2026-11-13T09:42:06.953067982Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ea97fad3-d107-4bc2-9aa4-757ac76a9340

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea97fad3-d107-4bc2-9aa4-757ac76a9340
Content-Type: application/json

--- request body ---
{"handle":"qa-f462fab6478f","displayName":"QA f462fab6478f","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea97fad3-d107-4bc2-9aa4-757ac76a9340
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
Location: /v1/accounts/qa-f462fab6478f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80aaf806-3203-44a7-a1b0-2ae047e4ec76","handle":"qa-f462fab6478f","displayName":"QA f462fab6478f","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.320802506Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-982cf1de-f479-4c7a-9a91-0c4a72b7575b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-982cf1de-f479-4c7a-9a91-0c4a72b7575b
Content-Type: application/json

--- request body ---
{"handle":"qa-af97999ebf29","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-982cf1de-f479-4c7a-9a91-0c4a72b7575b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_510da4bb-0d6b-4090-8df1-d47aab54bacf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-edd1b102-f707-4dec-ab56-7afe3036abb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edd1b102-f707-4dec-ab56-7afe3036abb7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f462fab6478f","subject":"Quick question","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-edd1b102-f707-4dec-ab56-7afe3036abb7
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
Location: /v1/conversations/cnv_60ec4338-2b60-4909-80d6-6a59e7cad36a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_60ec4338-2b60-4909-80d6-6a59e7cad36a","subject":"Quick question","status":"open","region":"eu","participants":["qa-af97999ebf29","qa-f462fab6478f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.464969725Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_60ec4338-2b60-4909-80d6-6a59e7cad36a/close
correlation: qa-2b10ad0a-14d2-4ef2-914f-2f3ba283e6b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b10ad0a-14d2-4ef2-914f-2f3ba283e6b7
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b10ad0a-14d2-4ef2-914f-2f3ba283e6b7
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

{"id":"cnv_60ec4338-2b60-4909-80d6-6a59e7cad36a","subject":"Quick question","status":"closed","region":"eu","participants":["qa-af97999ebf29","qa-f462fab6478f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.464969725Z","closedAt":"2026-11-13T09:42:07.566970362Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eeca7fd9-4331-4756-9741-8a5867118f89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeca7fd9-4331-4756-9741-8a5867118f89
Content-Type: application/json

--- request body ---
{"handle":"qa-f462fab6478f","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeca7fd9-4331-4756-9741-8a5867118f89
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80aaf806-3203-44a7-a1b0-2ae047e4ec76"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_60ec4338-2b60-4909-80d6-6a59e7cad36a/messages
correlation: qa-61214751-4ced-41b7-8216-011dd69fdc32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61214751-4ced-41b7-8216-011dd69fdc32
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61214751-4ced-41b7-8216-011dd69fdc32
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_60ec4338-2b60-4909-80d6-6a59e7cad36a/messages","correlationId":"qa-61214751-4ced-41b7-8216-011dd69fdc32"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e0e3d235-921e-4e87-ac93-ce3384ccead2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0e3d235-921e-4e87-ac93-ce3384ccead2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e0e3d235-921e-4e87-ac93-ce3384ccead2
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
correlation: qa-7ba07c55-4541-4ba5-b927-70d5bb319658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ba07c55-4541-4ba5-b927-70d5bb319658
Content-Type: application/json

--- request body ---
{"handle":"qa-f462fab6478f","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ba07c55-4541-4ba5-b927-70d5bb319658
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ba07c55-4541-4ba5-b927-70d5bb319658"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91a07679-58c8-4423-b889-5950d42d06b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91a07679-58c8-4423-b889-5950d42d06b9
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91a07679-58c8-4423-b889-5950d42d06b9
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
correlation: qa-e18f0396-ff5c-4464-820e-69e740295d0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e18f0396-ff5c-4464-820e-69e740295d0b
Content-Type: application/json

--- request body ---
{"handle":"qa-af97999ebf29","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e18f0396-ff5c-4464-820e-69e740295d0b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e18f0396-ff5c-4464-820e-69e740295d0b"}
```
