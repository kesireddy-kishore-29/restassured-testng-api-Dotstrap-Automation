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
| 1 | `POST /v1/accounts` | 201 | 385 | `qa-0d46c388-1460-445d-9c9e-c2bd31d5e976` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-77b2f7ab-4f1a-4eb2-85f7-347c3102d835` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-8a081e10-a8df-418f-a63a-703e91a3f328` |
| 4 | `POST /v1/conversations` | 201 | 56 | `qa-2c94a89e-4790-4a6a-a79a-b071834fbe95` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 24 | `qa-ae81f13d-4e1e-43f7-92a9-20745e3c7136` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-70fce526-37b6-4e24-aaeb-25b480cacac5` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 34 | `qa-e5f6069b-74fa-4498-906b-e6b3950c5a24` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-74c9c0ca-a5d4-439f-b156-7df5b79a6a6c` |
| 9 | `POST /v1/auth/token` | 401 | 4 | `qa-60ab5460-066c-4743-9bd3-3e61fe0280c7` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-06f00d43-c2c1-4470-bb2a-11c492b7a338` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-8db30baf-143a-471f-8ae1-2c6023425aea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d46c388-1460-445d-9c9e-c2bd31d5e976

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d46c388-1460-445d-9c9e-c2bd31d5e976
Content-Type: application/json

--- request body ---
{"handle":"qa-2582733324f1","displayName":"QA 2582733324f1","password":"****","region":"eu"}

--- response: 201 in 385 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d46c388-1460-445d-9c9e-c2bd31d5e976
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
Location: /v1/accounts/qa-2582733324f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a23a578e-856f-45ac-96ea-33213cdabd12","handle":"qa-2582733324f1","displayName":"QA 2582733324f1","region":"eu","role":"user","createdAt":"2026-11-26T11:02:33.416345581Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-77b2f7ab-4f1a-4eb2-85f7-347c3102d835

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77b2f7ab-4f1a-4eb2-85f7-347c3102d835
Content-Type: application/json

--- request body ---
{"handle":"qa-b3b5b1c15792","displayName":"QA b3b5b1c15792","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-77b2f7ab-4f1a-4eb2-85f7-347c3102d835
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
Location: /v1/accounts/qa-b3b5b1c15792
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d01096c-2232-4649-b75f-cb7437cded99","handle":"qa-b3b5b1c15792","displayName":"QA b3b5b1c15792","region":"eu","role":"user","createdAt":"2026-11-26T11:02:33.785776830Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8a081e10-a8df-418f-a63a-703e91a3f328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a081e10-a8df-418f-a63a-703e91a3f328
Content-Type: application/json

--- request body ---
{"handle":"qa-2582733324f1","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a081e10-a8df-418f-a63a-703e91a3f328
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a23a578e-856f-45ac-96ea-33213cdabd12"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2c94a89e-4790-4a6a-a79a-b071834fbe95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c94a89e-4790-4a6a-a79a-b071834fbe95
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b3b5b1c15792","subject":"Quick question","message":"Hi"}

--- response: 201 in 56 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c94a89e-4790-4a6a-a79a-b071834fbe95
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
Location: /v1/conversations/cnv_e5326568-c14e-4824-92e7-e63070e4a427
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e5326568-c14e-4824-92e7-e63070e4a427","subject":"Quick question","status":"open","region":"eu","participants":["qa-2582733324f1","qa-b3b5b1c15792"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:33.889457603Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e5326568-c14e-4824-92e7-e63070e4a427/close
correlation: qa-ae81f13d-4e1e-43f7-92a9-20745e3c7136

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae81f13d-4e1e-43f7-92a9-20745e3c7136
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae81f13d-4e1e-43f7-92a9-20745e3c7136
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

{"id":"cnv_e5326568-c14e-4824-92e7-e63070e4a427","subject":"Quick question","status":"closed","region":"eu","participants":["qa-2582733324f1","qa-b3b5b1c15792"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:33.889457603Z","closedAt":"2026-11-26T11:02:33.973212687Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-70fce526-37b6-4e24-aaeb-25b480cacac5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70fce526-37b6-4e24-aaeb-25b480cacac5
Content-Type: application/json

--- request body ---
{"handle":"qa-b3b5b1c15792","password":"****"}

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-70fce526-37b6-4e24-aaeb-25b480cacac5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d01096c-2232-4649-b75f-cb7437cded99"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e5326568-c14e-4824-92e7-e63070e4a427/messages
correlation: qa-e5f6069b-74fa-4498-906b-e6b3950c5a24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5f6069b-74fa-4498-906b-e6b3950c5a24
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 34 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5f6069b-74fa-4498-906b-e6b3950c5a24
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_e5326568-c14e-4824-92e7-e63070e4a427/messages","correlationId":"qa-e5f6069b-74fa-4498-906b-e6b3950c5a24"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-74c9c0ca-a5d4-439f-b156-7df5b79a6a6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74c9c0ca-a5d4-439f-b156-7df5b79a6a6c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-74c9c0ca-a5d4-439f-b156-7df5b79a6a6c
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
correlation: qa-60ab5460-066c-4743-9bd3-3e61fe0280c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60ab5460-066c-4743-9bd3-3e61fe0280c7
Content-Type: application/json

--- request body ---
{"handle":"qa-b3b5b1c15792","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60ab5460-066c-4743-9bd3-3e61fe0280c7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60ab5460-066c-4743-9bd3-3e61fe0280c7"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06f00d43-c2c1-4470-bb2a-11c492b7a338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06f00d43-c2c1-4470-bb2a-11c492b7a338
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06f00d43-c2c1-4470-bb2a-11c492b7a338
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
correlation: qa-8db30baf-143a-471f-8ae1-2c6023425aea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8db30baf-143a-471f-8ae1-2c6023425aea
Content-Type: application/json

--- request body ---
{"handle":"qa-2582733324f1","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8db30baf-143a-471f-8ae1-2c6023425aea
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8db30baf-143a-471f-8ae1-2c6023425aea"}
```
