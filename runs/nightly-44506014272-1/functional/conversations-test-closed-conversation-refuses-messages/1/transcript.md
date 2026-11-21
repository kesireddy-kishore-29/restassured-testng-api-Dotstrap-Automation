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
| 1 | `POST /v1/accounts` | 201 | 368 | `qa-033f9ece-5241-4a89-a0bc-7fd3e4494906` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-114f37ca-02e3-4ade-8b21-c56dc2f4d542` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-17bed8a5-47eb-4fe3-be80-05798558556d` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-b7438352-5108-44c0-a57e-86d9afc0353c` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 21 | `qa-4e1399a5-5be2-474e-a811-1f25c942423c` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-b06cf042-e7b4-47c7-83da-8c579e9ad884` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 19 | `qa-51527b9c-9359-4738-b9ed-3a15a1c91c1c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-fb3faee8-8591-41c2-85fc-9d57702ee7aa` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-6a8cd4d5-c360-4146-a1d6-9d4d4619cdb3` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-85cdbb17-c2f0-45dc-b8e9-9098f1399c1f` |
| 11 | `POST /v1/auth/token` | 401 | 3 | `qa-346713c2-e582-4e04-9ffc-75e6f3a34dc1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-033f9ece-5241-4a89-a0bc-7fd3e4494906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-033f9ece-5241-4a89-a0bc-7fd3e4494906
Content-Type: application/json

--- request body ---
{"handle":"qa-ed4bb073e74b","displayName":"QA ed4bb073e74b","password":"****","region":"eu"}

--- response: 201 in 368 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-033f9ece-5241-4a89-a0bc-7fd3e4494906
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
Location: /v1/accounts/qa-ed4bb073e74b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b8b1c26-2558-495f-b9a7-01895f02f7e6","handle":"qa-ed4bb073e74b","displayName":"QA ed4bb073e74b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:14.981464809Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-114f37ca-02e3-4ade-8b21-c56dc2f4d542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-114f37ca-02e3-4ade-8b21-c56dc2f4d542
Content-Type: application/json

--- request body ---
{"handle":"qa-c112c7cd8928","displayName":"QA c112c7cd8928","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-114f37ca-02e3-4ade-8b21-c56dc2f4d542
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
Location: /v1/accounts/qa-c112c7cd8928
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e191505-27c8-4231-af98-a892917c167f","handle":"qa-c112c7cd8928","displayName":"QA c112c7cd8928","region":"eu","role":"user","createdAt":"2026-11-19T10:29:15.307468688Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-17bed8a5-47eb-4fe3-be80-05798558556d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17bed8a5-47eb-4fe3-be80-05798558556d
Content-Type: application/json

--- request body ---
{"handle":"qa-ed4bb073e74b","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-17bed8a5-47eb-4fe3-be80-05798558556d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b8b1c26-2558-495f-b9a7-01895f02f7e6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b7438352-5108-44c0-a57e-86d9afc0353c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7438352-5108-44c0-a57e-86d9afc0353c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c112c7cd8928","subject":"Quick question","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7438352-5108-44c0-a57e-86d9afc0353c
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
Location: /v1/conversations/cnv_1412256c-8431-4376-82c5-846317c3b8d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1412256c-8431-4376-82c5-846317c3b8d8","subject":"Quick question","status":"open","region":"eu","participants":["qa-ed4bb073e74b","qa-c112c7cd8928"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:15.422632972Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1412256c-8431-4376-82c5-846317c3b8d8/close
correlation: qa-4e1399a5-5be2-474e-a811-1f25c942423c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e1399a5-5be2-474e-a811-1f25c942423c
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e1399a5-5be2-474e-a811-1f25c942423c
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

{"id":"cnv_1412256c-8431-4376-82c5-846317c3b8d8","subject":"Quick question","status":"closed","region":"eu","participants":["qa-ed4bb073e74b","qa-c112c7cd8928"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:15.422632972Z","closedAt":"2026-11-19T10:29:15.510096182Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b06cf042-e7b4-47c7-83da-8c579e9ad884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b06cf042-e7b4-47c7-83da-8c579e9ad884
Content-Type: application/json

--- request body ---
{"handle":"qa-c112c7cd8928","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b06cf042-e7b4-47c7-83da-8c579e9ad884
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e191505-27c8-4231-af98-a892917c167f"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_1412256c-8431-4376-82c5-846317c3b8d8/messages
correlation: qa-51527b9c-9359-4738-b9ed-3a15a1c91c1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51527b9c-9359-4738-b9ed-3a15a1c91c1c
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51527b9c-9359-4738-b9ed-3a15a1c91c1c
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_1412256c-8431-4376-82c5-846317c3b8d8/messages","correlationId":"qa-51527b9c-9359-4738-b9ed-3a15a1c91c1c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb3faee8-8591-41c2-85fc-9d57702ee7aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb3faee8-8591-41c2-85fc-9d57702ee7aa
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb3faee8-8591-41c2-85fc-9d57702ee7aa
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
correlation: qa-6a8cd4d5-c360-4146-a1d6-9d4d4619cdb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8cd4d5-c360-4146-a1d6-9d4d4619cdb3
Content-Type: application/json

--- request body ---
{"handle":"qa-c112c7cd8928","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a8cd4d5-c360-4146-a1d6-9d4d4619cdb3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6a8cd4d5-c360-4146-a1d6-9d4d4619cdb3"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85cdbb17-c2f0-45dc-b8e9-9098f1399c1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85cdbb17-c2f0-45dc-b8e9-9098f1399c1f
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85cdbb17-c2f0-45dc-b8e9-9098f1399c1f
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
correlation: qa-346713c2-e582-4e04-9ffc-75e6f3a34dc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-346713c2-e582-4e04-9ffc-75e6f3a34dc1
Content-Type: application/json

--- request body ---
{"handle":"qa-ed4bb073e74b","password":"****"}

--- response: 401 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-346713c2-e582-4e04-9ffc-75e6f3a34dc1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-346713c2-e582-4e04-9ffc-75e6f3a34dc1"}
```
