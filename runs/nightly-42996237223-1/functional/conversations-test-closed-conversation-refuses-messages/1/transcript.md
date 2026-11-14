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
| 1 | `POST /v1/accounts` | 201 | 457 | `qa-8af64239-6236-4f6d-b7e8-ce451524710a` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-a05ad718-5a32-4263-9830-c73d39b05fe4` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-ffb5f7f0-0df0-4b90-bf4c-83b1c098e50b` |
| 4 | `POST /v1/conversations` | 201 | 62 | `qa-0f975486-14a8-44bf-9103-c0e37b654406` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 39 | `qa-15c1f954-e246-46bc-bc99-a716696bab04` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-5d0d591b-40f7-40ec-bd48-a8b6632d8c58` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 15 | `qa-2a9a6b7b-6577-4b2f-b6d2-8159d3b96a5c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0f2616de-e190-4914-ac03-4054ca9442f2` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-5b44e776-34c4-4327-96bb-a82f503013cb` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-fd6cc12a-26ae-4497-8cd4-adf0c85caa02` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-a996d917-db05-452c-b111-f2d794c71cd1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8af64239-6236-4f6d-b7e8-ce451524710a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8af64239-6236-4f6d-b7e8-ce451524710a
Content-Type: application/json

--- request body ---
{"handle":"qa-07e1aa962eb9","displayName":"QA 07e1aa962eb9","password":"****","region":"eu"}

--- response: 201 in 457 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8af64239-6236-4f6d-b7e8-ce451524710a
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
Location: /v1/accounts/qa-07e1aa962eb9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31708ed0-bf0e-4248-a6e5-419f204ada0a","handle":"qa-07e1aa962eb9","displayName":"QA 07e1aa962eb9","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.159641470Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a05ad718-5a32-4263-9830-c73d39b05fe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a05ad718-5a32-4263-9830-c73d39b05fe4
Content-Type: application/json

--- request body ---
{"handle":"qa-509b61c2d421","displayName":"QA 509b61c2d421","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a05ad718-5a32-4263-9830-c73d39b05fe4
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
Location: /v1/accounts/qa-509b61c2d421
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2aae2649-6192-468c-9998-eb0fb6cc0b30","handle":"qa-509b61c2d421","displayName":"QA 509b61c2d421","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.579389820Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ffb5f7f0-0df0-4b90-bf4c-83b1c098e50b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffb5f7f0-0df0-4b90-bf4c-83b1c098e50b
Content-Type: application/json

--- request body ---
{"handle":"qa-07e1aa962eb9","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffb5f7f0-0df0-4b90-bf4c-83b1c098e50b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31708ed0-bf0e-4248-a6e5-419f204ada0a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0f975486-14a8-44bf-9103-c0e37b654406

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f975486-14a8-44bf-9103-c0e37b654406
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-509b61c2d421","subject":"Quick question","message":"Hi"}

--- response: 201 in 62 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f975486-14a8-44bf-9103-c0e37b654406
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
Location: /v1/conversations/cnv_cf8c99a2-7f21-4205-af77-ac73a845823a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cf8c99a2-7f21-4205-af77-ac73a845823a","subject":"Quick question","status":"open","region":"eu","participants":["qa-07e1aa962eb9","qa-509b61c2d421"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:31.729832082Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cf8c99a2-7f21-4205-af77-ac73a845823a/close
correlation: qa-15c1f954-e246-46bc-bc99-a716696bab04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15c1f954-e246-46bc-bc99-a716696bab04
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-15c1f954-e246-46bc-bc99-a716696bab04
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

{"id":"cnv_cf8c99a2-7f21-4205-af77-ac73a845823a","subject":"Quick question","status":"closed","region":"eu","participants":["qa-07e1aa962eb9","qa-509b61c2d421"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:31.729832082Z","closedAt":"2026-11-11T09:34:31.902605130Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5d0d591b-40f7-40ec-bd48-a8b6632d8c58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d0d591b-40f7-40ec-bd48-a8b6632d8c58
Content-Type: application/json

--- request body ---
{"handle":"qa-509b61c2d421","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d0d591b-40f7-40ec-bd48-a8b6632d8c58
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2aae2649-6192-468c-9998-eb0fb6cc0b30"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_cf8c99a2-7f21-4205-af77-ac73a845823a/messages
correlation: qa-2a9a6b7b-6577-4b2f-b6d2-8159d3b96a5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a9a6b7b-6577-4b2f-b6d2-8159d3b96a5c
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a9a6b7b-6577-4b2f-b6d2-8159d3b96a5c
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_cf8c99a2-7f21-4205-af77-ac73a845823a/messages","correlationId":"qa-2a9a6b7b-6577-4b2f-b6d2-8159d3b96a5c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f2616de-e190-4914-ac03-4054ca9442f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f2616de-e190-4914-ac03-4054ca9442f2
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f2616de-e190-4914-ac03-4054ca9442f2
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
correlation: qa-5b44e776-34c4-4327-96bb-a82f503013cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b44e776-34c4-4327-96bb-a82f503013cb
Content-Type: application/json

--- request body ---
{"handle":"qa-509b61c2d421","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b44e776-34c4-4327-96bb-a82f503013cb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b44e776-34c4-4327-96bb-a82f503013cb"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd6cc12a-26ae-4497-8cd4-adf0c85caa02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd6cc12a-26ae-4497-8cd4-adf0c85caa02
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd6cc12a-26ae-4497-8cd4-adf0c85caa02
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
correlation: qa-a996d917-db05-452c-b111-f2d794c71cd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a996d917-db05-452c-b111-f2d794c71cd1
Content-Type: application/json

--- request body ---
{"handle":"qa-07e1aa962eb9","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a996d917-db05-452c-b111-f2d794c71cd1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a996d917-db05-452c-b111-f2d794c71cd1"}
```
