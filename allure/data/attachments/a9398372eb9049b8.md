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
| 1 | `POST /v1/accounts` | 201 | 345 | `qa-605c8409-927f-4e0c-b4d6-1fd7725ea88d` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-8c2426e3-ce23-428f-8a33-54a538cfde66` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-47fa9de1-2f0a-4271-a247-5b740200798a` |
| 4 | `POST /v1/conversations` | 201 | 37 | `qa-825aef77-4c5e-454c-ac36-e539ba47ac1e` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 21 | `qa-fc14059c-4cc1-4fef-ae1b-ebcc1f87e0c2` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-45905a51-62c6-43c5-baee-a5a5d47be388` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 14 | `qa-4ab07d17-cab8-4a69-b8fd-fd4a23b4db5e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-8cada409-cca0-4fff-a8b6-afc74e51a4db` |
| 9 | `POST /v1/auth/token` | 401 | 4 | `qa-9406e804-9972-4d3a-9826-3a0dc7cdb201` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-ca75e637-4590-4a39-93f9-4248bc2877cb` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-bf480185-f37d-494b-b3de-9fe8d546d707` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-605c8409-927f-4e0c-b4d6-1fd7725ea88d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-605c8409-927f-4e0c-b4d6-1fd7725ea88d
Content-Type: application/json

--- request body ---
{"handle":"qa-4d62c066987b","displayName":"QA 4d62c066987b","password":"****","region":"eu"}

--- response: 201 in 345 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-605c8409-927f-4e0c-b4d6-1fd7725ea88d
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
Location: /v1/accounts/qa-4d62c066987b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dbe03cd0-3773-4176-9d6a-44ad4a20d6b6","handle":"qa-4d62c066987b","displayName":"QA 4d62c066987b","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.772388368Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8c2426e3-ce23-428f-8a33-54a538cfde66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2426e3-ce23-428f-8a33-54a538cfde66
Content-Type: application/json

--- request body ---
{"handle":"qa-3707d5f6c422","displayName":"QA 3707d5f6c422","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c2426e3-ce23-428f-8a33-54a538cfde66
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
Location: /v1/accounts/qa-3707d5f6c422
X-Served-Region: eu
Content-Length: 181

{"id":"acc_063b5564-7c2c-4e5a-b2b4-ddbb78a64901","handle":"qa-3707d5f6c422","displayName":"QA 3707d5f6c422","region":"eu","role":"user","createdAt":"2026-11-14T09:05:14.037159297Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-47fa9de1-2f0a-4271-a247-5b740200798a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47fa9de1-2f0a-4271-a247-5b740200798a
Content-Type: application/json

--- request body ---
{"handle":"qa-4d62c066987b","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-47fa9de1-2f0a-4271-a247-5b740200798a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbe03cd0-3773-4176-9d6a-44ad4a20d6b6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-825aef77-4c5e-454c-ac36-e539ba47ac1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-825aef77-4c5e-454c-ac36-e539ba47ac1e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3707d5f6c422","subject":"Quick question","message":"Hi"}

--- response: 201 in 37 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-825aef77-4c5e-454c-ac36-e539ba47ac1e
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
Location: /v1/conversations/cnv_7522e7ae-6488-483a-ac4e-14cbc752469f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7522e7ae-6488-483a-ac4e-14cbc752469f","subject":"Quick question","status":"open","region":"eu","participants":["qa-4d62c066987b","qa-3707d5f6c422"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:14.139270293Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7522e7ae-6488-483a-ac4e-14cbc752469f/close
correlation: qa-fc14059c-4cc1-4fef-ae1b-ebcc1f87e0c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc14059c-4cc1-4fef-ae1b-ebcc1f87e0c2
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc14059c-4cc1-4fef-ae1b-ebcc1f87e0c2
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

{"id":"cnv_7522e7ae-6488-483a-ac4e-14cbc752469f","subject":"Quick question","status":"closed","region":"eu","participants":["qa-4d62c066987b","qa-3707d5f6c422"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:14.139270293Z","closedAt":"2026-11-14T09:05:14.233252879Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-45905a51-62c6-43c5-baee-a5a5d47be388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45905a51-62c6-43c5-baee-a5a5d47be388
Content-Type: application/json

--- request body ---
{"handle":"qa-3707d5f6c422","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-45905a51-62c6-43c5-baee-a5a5d47be388
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_063b5564-7c2c-4e5a-b2b4-ddbb78a64901"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7522e7ae-6488-483a-ac4e-14cbc752469f/messages
correlation: qa-4ab07d17-cab8-4a69-b8fd-fd4a23b4db5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ab07d17-cab8-4a69-b8fd-fd4a23b4db5e
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ab07d17-cab8-4a69-b8fd-fd4a23b4db5e
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_7522e7ae-6488-483a-ac4e-14cbc752469f/messages","correlationId":"qa-4ab07d17-cab8-4a69-b8fd-fd4a23b4db5e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cada409-cca0-4fff-a8b6-afc74e51a4db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cada409-cca0-4fff-a8b6-afc74e51a4db
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cada409-cca0-4fff-a8b6-afc74e51a4db
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
correlation: qa-9406e804-9972-4d3a-9826-3a0dc7cdb201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9406e804-9972-4d3a-9826-3a0dc7cdb201
Content-Type: application/json

--- request body ---
{"handle":"qa-3707d5f6c422","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9406e804-9972-4d3a-9826-3a0dc7cdb201
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9406e804-9972-4d3a-9826-3a0dc7cdb201"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca75e637-4590-4a39-93f9-4248bc2877cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca75e637-4590-4a39-93f9-4248bc2877cb
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca75e637-4590-4a39-93f9-4248bc2877cb
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
correlation: qa-bf480185-f37d-494b-b3de-9fe8d546d707

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf480185-f37d-494b-b3de-9fe8d546d707
Content-Type: application/json

--- request body ---
{"handle":"qa-4d62c066987b","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf480185-f37d-494b-b3de-9fe8d546d707
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf480185-f37d-494b-b3de-9fe8d546d707"}
```
