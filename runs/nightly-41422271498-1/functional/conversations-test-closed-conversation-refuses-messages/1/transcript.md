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
| 1 | `POST /v1/accounts` | 201 | 337 | `qa-86ec69ec-8e13-4916-8330-ba4de25f0ac7` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-026e4806-cf25-4eca-8c22-d02ea76c5ebd` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-8f791eb5-d0e3-4e98-b2a9-50f32591b586` |
| 4 | `POST /v1/conversations` | 201 | 62 | `qa-0a147f67-94af-46f7-acbf-737c656ce393` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 14 | `qa-2bcb9c15-6a24-4b24-a737-5c74279b1e53` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-a7014e7f-14e9-4ccf-9872-303e875d475a` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 15 | `qa-2ce61ca2-c22b-4d58-9b75-895b21d066c3` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c3b218ca-7217-46bb-a364-05167b0a1b1c` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-839366e8-1328-4aad-ae95-ffec7fab34a4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-4b9eadb8-b6f5-40db-99a6-293ad4c821b3` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-586a3e07-9f59-4d19-a6b4-ec8353484263` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-86ec69ec-8e13-4916-8330-ba4de25f0ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86ec69ec-8e13-4916-8330-ba4de25f0ac7
Content-Type: application/json

--- request body ---
{"handle":"qa-e672174af977","displayName":"QA e672174af977","password":"****","region":"eu"}

--- response: 201 in 337 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-86ec69ec-8e13-4916-8330-ba4de25f0ac7
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
Location: /v1/accounts/qa-e672174af977
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a7da174e-1cd4-46f5-b143-8c638cc116a1","handle":"qa-e672174af977","displayName":"QA e672174af977","region":"eu","role":"user","createdAt":"2026-11-02T09:39:10.504306009Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-026e4806-cf25-4eca-8c22-d02ea76c5ebd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-026e4806-cf25-4eca-8c22-d02ea76c5ebd
Content-Type: application/json

--- request body ---
{"handle":"qa-fb6917815cea","displayName":"QA fb6917815cea","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-026e4806-cf25-4eca-8c22-d02ea76c5ebd
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
Location: /v1/accounts/qa-fb6917815cea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6eca647a-5f9a-49bb-af36-c06d4273a7b7","handle":"qa-fb6917815cea","displayName":"QA fb6917815cea","region":"eu","role":"user","createdAt":"2026-11-02T09:39:10.860355239Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8f791eb5-d0e3-4e98-b2a9-50f32591b586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f791eb5-d0e3-4e98-b2a9-50f32591b586
Content-Type: application/json

--- request body ---
{"handle":"qa-e672174af977","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f791eb5-d0e3-4e98-b2a9-50f32591b586
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7da174e-1cd4-46f5-b143-8c638cc116a1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0a147f67-94af-46f7-acbf-737c656ce393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a147f67-94af-46f7-acbf-737c656ce393
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fb6917815cea","subject":"Quick question","message":"Hi"}

--- response: 201 in 62 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a147f67-94af-46f7-acbf-737c656ce393
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
Location: /v1/conversations/cnv_e18149e4-cf1a-4795-b86f-dd307841394b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e18149e4-cf1a-4795-b86f-dd307841394b","subject":"Quick question","status":"open","region":"eu","participants":["qa-e672174af977","qa-fb6917815cea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:39:11.009476539Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e18149e4-cf1a-4795-b86f-dd307841394b/close
correlation: qa-2bcb9c15-6a24-4b24-a737-5c74279b1e53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bcb9c15-6a24-4b24-a737-5c74279b1e53
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bcb9c15-6a24-4b24-a737-5c74279b1e53
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

{"id":"cnv_e18149e4-cf1a-4795-b86f-dd307841394b","subject":"Quick question","status":"closed","region":"eu","participants":["qa-e672174af977","qa-fb6917815cea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:39:11.009476539Z","closedAt":"2026-11-02T09:39:11.094325667Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a7014e7f-14e9-4ccf-9872-303e875d475a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7014e7f-14e9-4ccf-9872-303e875d475a
Content-Type: application/json

--- request body ---
{"handle":"qa-fb6917815cea","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7014e7f-14e9-4ccf-9872-303e875d475a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6eca647a-5f9a-49bb-af36-c06d4273a7b7"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e18149e4-cf1a-4795-b86f-dd307841394b/messages
correlation: qa-2ce61ca2-c22b-4d58-9b75-895b21d066c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ce61ca2-c22b-4d58-9b75-895b21d066c3
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 15 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ce61ca2-c22b-4d58-9b75-895b21d066c3
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_e18149e4-cf1a-4795-b86f-dd307841394b/messages","correlationId":"qa-2ce61ca2-c22b-4d58-9b75-895b21d066c3"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3b218ca-7217-46bb-a364-05167b0a1b1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3b218ca-7217-46bb-a364-05167b0a1b1c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 02 Nov 2026 09:39:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3b218ca-7217-46bb-a364-05167b0a1b1c
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
correlation: qa-839366e8-1328-4aad-ae95-ffec7fab34a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-839366e8-1328-4aad-ae95-ffec7fab34a4
Content-Type: application/json

--- request body ---
{"handle":"qa-fb6917815cea","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 02 Nov 2026 09:39:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-839366e8-1328-4aad-ae95-ffec7fab34a4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-839366e8-1328-4aad-ae95-ffec7fab34a4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b9eadb8-b6f5-40db-99a6-293ad4c821b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b9eadb8-b6f5-40db-99a6-293ad4c821b3
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 02 Nov 2026 09:39:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b9eadb8-b6f5-40db-99a6-293ad4c821b3
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
correlation: qa-586a3e07-9f59-4d19-a6b4-ec8353484263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-586a3e07-9f59-4d19-a6b4-ec8353484263
Content-Type: application/json

--- request body ---
{"handle":"qa-e672174af977","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 02 Nov 2026 09:39:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-586a3e07-9f59-4d19-a6b4-ec8353484263
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-586a3e07-9f59-4d19-a6b4-ec8353484263"}
```
