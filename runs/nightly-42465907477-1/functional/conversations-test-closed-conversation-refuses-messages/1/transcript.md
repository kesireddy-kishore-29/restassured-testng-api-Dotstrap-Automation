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
| 1 | `POST /v1/accounts` | 201 | 350 | `qa-5b50aca1-7868-49cc-8214-0300b31d071a` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-e6ae5014-29a4-4f47-ae75-99e64d69256d` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-95ececce-7db2-481e-abab-024fa30df7bc` |
| 4 | `POST /v1/conversations` | 201 | 62 | `qa-d6368662-dda8-416d-972d-dce2ae25bfe1` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 35 | `qa-7ee0afb6-eed2-4b8d-86a1-ff4422bb62f7` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-948549b3-016f-4f3e-bd49-dcd35e7d2238` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 32 | `qa-c6649954-c5ba-4b17-b630-0bd2280c0b31` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-5e164362-316f-4732-93ce-0fa16a058964` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-47bc3a7d-5cd9-4a78-8d83-a7023e7f8433` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e5e143fb-4e85-4cde-903f-8bbd71a47ff7` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-66e07ea0-7c72-45dc-b65a-d3fa9a894035` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b50aca1-7868-49cc-8214-0300b31d071a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b50aca1-7868-49cc-8214-0300b31d071a
Content-Type: application/json

--- request body ---
{"handle":"qa-6d4102f6f933","displayName":"QA 6d4102f6f933","password":"****","region":"eu"}

--- response: 201 in 350 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b50aca1-7868-49cc-8214-0300b31d071a
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
Location: /v1/accounts/qa-6d4102f6f933
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1346f2cc-def7-41b8-a1db-3ec1b9c581b8","handle":"qa-6d4102f6f933","displayName":"QA 6d4102f6f933","region":"eu","role":"user","createdAt":"2026-11-08T09:09:14.345767986Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e6ae5014-29a4-4f47-ae75-99e64d69256d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6ae5014-29a4-4f47-ae75-99e64d69256d
Content-Type: application/json

--- request body ---
{"handle":"qa-4d4d513aa9df","displayName":"QA 4d4d513aa9df","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6ae5014-29a4-4f47-ae75-99e64d69256d
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
Location: /v1/accounts/qa-4d4d513aa9df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4a55ef0-dc90-4995-802f-e9e3d9d52df0","handle":"qa-4d4d513aa9df","displayName":"QA 4d4d513aa9df","region":"eu","role":"user","createdAt":"2026-11-08T09:09:14.822818070Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-95ececce-7db2-481e-abab-024fa30df7bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95ececce-7db2-481e-abab-024fa30df7bc
Content-Type: application/json

--- request body ---
{"handle":"qa-6d4102f6f933","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-95ececce-7db2-481e-abab-024fa30df7bc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1346f2cc-def7-41b8-a1db-3ec1b9c581b8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d6368662-dda8-416d-972d-dce2ae25bfe1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6368662-dda8-416d-972d-dce2ae25bfe1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4d4d513aa9df","subject":"Quick question","message":"Hi"}

--- response: 201 in 62 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6368662-dda8-416d-972d-dce2ae25bfe1
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
Location: /v1/conversations/cnv_2af8d61f-0892-4d1f-9758-80e0437bef32
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2af8d61f-0892-4d1f-9758-80e0437bef32","subject":"Quick question","status":"open","region":"eu","participants":["qa-6d4102f6f933","qa-4d4d513aa9df"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:14.978340141Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2af8d61f-0892-4d1f-9758-80e0437bef32/close
correlation: qa-7ee0afb6-eed2-4b8d-86a1-ff4422bb62f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ee0afb6-eed2-4b8d-86a1-ff4422bb62f7
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ee0afb6-eed2-4b8d-86a1-ff4422bb62f7
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

{"id":"cnv_2af8d61f-0892-4d1f-9758-80e0437bef32","subject":"Quick question","status":"closed","region":"eu","participants":["qa-6d4102f6f933","qa-4d4d513aa9df"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:14.978340141Z","closedAt":"2026-11-08T09:09:15.128154722Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-948549b3-016f-4f3e-bd49-dcd35e7d2238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-948549b3-016f-4f3e-bd49-dcd35e7d2238
Content-Type: application/json

--- request body ---
{"handle":"qa-4d4d513aa9df","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-948549b3-016f-4f3e-bd49-dcd35e7d2238
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4a55ef0-dc90-4995-802f-e9e3d9d52df0"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_2af8d61f-0892-4d1f-9758-80e0437bef32/messages
correlation: qa-c6649954-c5ba-4b17-b630-0bd2280c0b31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6649954-c5ba-4b17-b630-0bd2280c0b31
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 32 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6649954-c5ba-4b17-b630-0bd2280c0b31
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_2af8d61f-0892-4d1f-9758-80e0437bef32/messages","correlationId":"qa-c6649954-c5ba-4b17-b630-0bd2280c0b31"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e164362-316f-4732-93ce-0fa16a058964

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e164362-316f-4732-93ce-0fa16a058964
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e164362-316f-4732-93ce-0fa16a058964
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
correlation: qa-47bc3a7d-5cd9-4a78-8d83-a7023e7f8433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47bc3a7d-5cd9-4a78-8d83-a7023e7f8433
Content-Type: application/json

--- request body ---
{"handle":"qa-4d4d513aa9df","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47bc3a7d-5cd9-4a78-8d83-a7023e7f8433
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47bc3a7d-5cd9-4a78-8d83-a7023e7f8433"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e5e143fb-4e85-4cde-903f-8bbd71a47ff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5e143fb-4e85-4cde-903f-8bbd71a47ff7
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e5e143fb-4e85-4cde-903f-8bbd71a47ff7
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
correlation: qa-66e07ea0-7c72-45dc-b65a-d3fa9a894035

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66e07ea0-7c72-45dc-b65a-d3fa9a894035
Content-Type: application/json

--- request body ---
{"handle":"qa-6d4102f6f933","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66e07ea0-7c72-45dc-b65a-d3fa9a894035
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-66e07ea0-7c72-45dc-b65a-d3fa9a894035"}
```
