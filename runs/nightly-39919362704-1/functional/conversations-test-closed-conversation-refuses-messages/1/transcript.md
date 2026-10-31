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
| 1 | `POST /v1/accounts` | 201 | 464 | `qa-eaaa77e0-6f84-401c-b69e-77eac14d143a` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-27445385-b0e4-4fed-ab89-bdfa1ccc5f3a` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-6acdf335-6986-471f-86c1-d6761cfa5fa9` |
| 4 | `POST /v1/conversations` | 201 | 54 | `qa-5b283d3c-da73-468a-8428-6d2fa3acd228` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 32 | `qa-c3ca3f73-1fb5-42ba-b476-373f555ff9b3` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-31bc3c7f-5ccf-4fe4-8cda-0416bb255118` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 31 | `qa-2a571f7c-72a3-49c7-8397-3d08bfa98ebe` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-67645d76-749e-4072-8105-0d7def5429e0` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-071eac4b-56ee-4cd6-a2d1-d9ac1fdbdd5a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-8247d079-0390-40ed-91b8-8e999a290bf1` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-795ba4b7-936c-46d9-865c-5a9115cb2201` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eaaa77e0-6f84-401c-b69e-77eac14d143a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaaa77e0-6f84-401c-b69e-77eac14d143a
Content-Type: application/json

--- request body ---
{"handle":"qa-7b0dfa795400","displayName":"QA 7b0dfa795400","password":"****","region":"eu"}

--- response: 201 in 464 ms ---
Date: Fri, 23 Oct 2026 07:42:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaaa77e0-6f84-401c-b69e-77eac14d143a
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
Location: /v1/accounts/qa-7b0dfa795400
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2307dc4d-af43-46f9-b544-4b2a1e2b218c","handle":"qa-7b0dfa795400","displayName":"QA 7b0dfa795400","region":"eu","role":"user","createdAt":"2026-10-23T07:42:02.958349695Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-27445385-b0e4-4fed-ab89-bdfa1ccc5f3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27445385-b0e4-4fed-ab89-bdfa1ccc5f3a
Content-Type: application/json

--- request body ---
{"handle":"qa-ba08827bd932","displayName":"QA ba08827bd932","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-27445385-b0e4-4fed-ab89-bdfa1ccc5f3a
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
Location: /v1/accounts/qa-ba08827bd932
X-Served-Region: eu
Content-Length: 181

{"id":"acc_40398e65-05bd-4f39-8937-b1cf89ab9deb","handle":"qa-ba08827bd932","displayName":"QA ba08827bd932","region":"eu","role":"user","createdAt":"2026-10-23T07:42:03.480971305Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6acdf335-6986-471f-86c1-d6761cfa5fa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6acdf335-6986-471f-86c1-d6761cfa5fa9
Content-Type: application/json

--- request body ---
{"handle":"qa-7b0dfa795400","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6acdf335-6986-471f-86c1-d6761cfa5fa9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2307dc4d-af43-46f9-b544-4b2a1e2b218c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5b283d3c-da73-468a-8428-6d2fa3acd228

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b283d3c-da73-468a-8428-6d2fa3acd228
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ba08827bd932","subject":"Quick question","message":"Hi"}

--- response: 201 in 54 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b283d3c-da73-468a-8428-6d2fa3acd228
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
Location: /v1/conversations/cnv_9cd5b3a6-2873-4b92-a325-1e2d3230b3d3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9cd5b3a6-2873-4b92-a325-1e2d3230b3d3","subject":"Quick question","status":"open","region":"eu","participants":["qa-7b0dfa795400","qa-ba08827bd932"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:42:03.660526348Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9cd5b3a6-2873-4b92-a325-1e2d3230b3d3/close
correlation: qa-c3ca3f73-1fb5-42ba-b476-373f555ff9b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3ca3f73-1fb5-42ba-b476-373f555ff9b3
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3ca3f73-1fb5-42ba-b476-373f555ff9b3
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

{"id":"cnv_9cd5b3a6-2873-4b92-a325-1e2d3230b3d3","subject":"Quick question","status":"closed","region":"eu","participants":["qa-7b0dfa795400","qa-ba08827bd932"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:42:03.660526348Z","closedAt":"2026-10-23T07:42:03.760818986Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-31bc3c7f-5ccf-4fe4-8cda-0416bb255118

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31bc3c7f-5ccf-4fe4-8cda-0416bb255118
Content-Type: application/json

--- request body ---
{"handle":"qa-ba08827bd932","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-31bc3c7f-5ccf-4fe4-8cda-0416bb255118
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_40398e65-05bd-4f39-8937-b1cf89ab9deb"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_9cd5b3a6-2873-4b92-a325-1e2d3230b3d3/messages
correlation: qa-2a571f7c-72a3-49c7-8397-3d08bfa98ebe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a571f7c-72a3-49c7-8397-3d08bfa98ebe
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 31 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a571f7c-72a3-49c7-8397-3d08bfa98ebe
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_9cd5b3a6-2873-4b92-a325-1e2d3230b3d3/messages","correlationId":"qa-2a571f7c-72a3-49c7-8397-3d08bfa98ebe"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-67645d76-749e-4072-8105-0d7def5429e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67645d76-749e-4072-8105-0d7def5429e0
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-67645d76-749e-4072-8105-0d7def5429e0
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
correlation: qa-071eac4b-56ee-4cd6-a2d1-d9ac1fdbdd5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-071eac4b-56ee-4cd6-a2d1-d9ac1fdbdd5a
Content-Type: application/json

--- request body ---
{"handle":"qa-ba08827bd932","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-071eac4b-56ee-4cd6-a2d1-d9ac1fdbdd5a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-071eac4b-56ee-4cd6-a2d1-d9ac1fdbdd5a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8247d079-0390-40ed-91b8-8e999a290bf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8247d079-0390-40ed-91b8-8e999a290bf1
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8247d079-0390-40ed-91b8-8e999a290bf1
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
correlation: qa-795ba4b7-936c-46d9-865c-5a9115cb2201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795ba4b7-936c-46d9-865c-5a9115cb2201
Content-Type: application/json

--- request body ---
{"handle":"qa-7b0dfa795400","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-795ba4b7-936c-46d9-865c-5a9115cb2201
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-795ba4b7-936c-46d9-865c-5a9115cb2201"}
```
