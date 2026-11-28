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
| 1 | `POST /v1/accounts` | 201 | 444 | `qa-10148bbd-8737-49c4-9a31-6e6f7cb195d4` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-11b1325f-990b-48aa-85b2-f46cfc000e8b` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-34eba891-fbb0-4461-be79-7f9c4398bf13` |
| 4 | `POST /v1/conversations` | 201 | 60 | `qa-29a1900f-fb82-42f1-a269-4fbcf469c35b` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 45 | `qa-d1e3eaf1-0912-4447-a01b-814b8b9755d7` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-b75f02f3-3fda-42df-b304-74e74c2c4838` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 24 | `qa-1651713e-2c2b-4c4b-af1b-d09c45b10bf1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-54bad871-9731-4937-8484-84d365c9c59d` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-3c42df85-5bd5-4a0f-8541-2547e8f5f816` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d71e4db9-3cdd-403f-ae2f-f6f19dd42dc9` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-9406a542-746e-45a8-ae03-3a3b1b31d3f4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-10148bbd-8737-49c4-9a31-6e6f7cb195d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10148bbd-8737-49c4-9a31-6e6f7cb195d4
Content-Type: application/json

--- request body ---
{"handle":"qa-1baeda40fb85","displayName":"QA 1baeda40fb85","password":"****","region":"eu"}

--- response: 201 in 444 ms ---
Date: Tue, 24 Nov 2026 12:38:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-10148bbd-8737-49c4-9a31-6e6f7cb195d4
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
Location: /v1/accounts/qa-1baeda40fb85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1d5d54ec-013e-4ddd-b6ed-d533eb459217","handle":"qa-1baeda40fb85","displayName":"QA 1baeda40fb85","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.023673726Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-11b1325f-990b-48aa-85b2-f46cfc000e8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11b1325f-990b-48aa-85b2-f46cfc000e8b
Content-Type: application/json

--- request body ---
{"handle":"qa-2d4029c94391","displayName":"QA 2d4029c94391","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-11b1325f-990b-48aa-85b2-f46cfc000e8b
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
Location: /v1/accounts/qa-2d4029c94391
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d1fa8906-d757-4a82-9be5-2c58ec6ea7ae","handle":"qa-2d4029c94391","displayName":"QA 2d4029c94391","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.430428059Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-34eba891-fbb0-4461-be79-7f9c4398bf13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34eba891-fbb0-4461-be79-7f9c4398bf13
Content-Type: application/json

--- request body ---
{"handle":"qa-1baeda40fb85","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-34eba891-fbb0-4461-be79-7f9c4398bf13
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d5d54ec-013e-4ddd-b6ed-d533eb459217"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-29a1900f-fb82-42f1-a269-4fbcf469c35b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29a1900f-fb82-42f1-a269-4fbcf469c35b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2d4029c94391","subject":"Quick question","message":"Hi"}

--- response: 201 in 60 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-29a1900f-fb82-42f1-a269-4fbcf469c35b
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
Location: /v1/conversations/cnv_6aaa3a75-f54e-4e4d-b09f-73f42bb09828
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6aaa3a75-f54e-4e4d-b09f-73f42bb09828","subject":"Quick question","status":"open","region":"eu","participants":["qa-1baeda40fb85","qa-2d4029c94391"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:04.606014186Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_6aaa3a75-f54e-4e4d-b09f-73f42bb09828/close
correlation: qa-d1e3eaf1-0912-4447-a01b-814b8b9755d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1e3eaf1-0912-4447-a01b-814b8b9755d7
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1e3eaf1-0912-4447-a01b-814b8b9755d7
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

{"id":"cnv_6aaa3a75-f54e-4e4d-b09f-73f42bb09828","subject":"Quick question","status":"closed","region":"eu","participants":["qa-1baeda40fb85","qa-2d4029c94391"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:04.606014186Z","closedAt":"2026-11-24T12:38:04.738607655Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b75f02f3-3fda-42df-b304-74e74c2c4838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b75f02f3-3fda-42df-b304-74e74c2c4838
Content-Type: application/json

--- request body ---
{"handle":"qa-2d4029c94391","password":"****"}

--- response: 200 in 37 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b75f02f3-3fda-42df-b304-74e74c2c4838
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d1fa8906-d757-4a82-9be5-2c58ec6ea7ae"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_6aaa3a75-f54e-4e4d-b09f-73f42bb09828/messages
correlation: qa-1651713e-2c2b-4c4b-af1b-d09c45b10bf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1651713e-2c2b-4c4b-af1b-d09c45b10bf1
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1651713e-2c2b-4c4b-af1b-d09c45b10bf1
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_6aaa3a75-f54e-4e4d-b09f-73f42bb09828/messages","correlationId":"qa-1651713e-2c2b-4c4b-af1b-d09c45b10bf1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54bad871-9731-4937-8484-84d365c9c59d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54bad871-9731-4937-8484-84d365c9c59d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54bad871-9731-4937-8484-84d365c9c59d
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
correlation: qa-3c42df85-5bd5-4a0f-8541-2547e8f5f816

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c42df85-5bd5-4a0f-8541-2547e8f5f816
Content-Type: application/json

--- request body ---
{"handle":"qa-2d4029c94391","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c42df85-5bd5-4a0f-8541-2547e8f5f816
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c42df85-5bd5-4a0f-8541-2547e8f5f816"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d71e4db9-3cdd-403f-ae2f-f6f19dd42dc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d71e4db9-3cdd-403f-ae2f-f6f19dd42dc9
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d71e4db9-3cdd-403f-ae2f-f6f19dd42dc9
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
correlation: qa-9406a542-746e-45a8-ae03-3a3b1b31d3f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9406a542-746e-45a8-ae03-3a3b1b31d3f4
Content-Type: application/json

--- request body ---
{"handle":"qa-1baeda40fb85","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9406a542-746e-45a8-ae03-3a3b1b31d3f4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9406a542-746e-45a8-ae03-3a3b1b31d3f4"}
```
