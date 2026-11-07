# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 440 | `qa-afee27be-e536-4c04-96d7-e0a21dfd63cd` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-a43fe5f4-2373-49f4-b2f0-6ddd92cc1538` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-a2efb8a4-03c3-48a8-980f-7917a2084475` |
| 4 | `POST /v1/conversations` | 201 | 58 | `qa-88c64dd6-34e9-47a5-844e-6b5687b033fd` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 53 | `qa-b5ee7608-2cb0-4d58-b6b0-19e1eac5ea57` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-d818e9b8-ed1a-4d50-b30b-1d10dc9ee724` |
| 7 | `GET /v1/conversations/{id}` | 200 | 17 | `qa-8fa4fd61-63f4-4b39-9bdd-30baccff464d` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 14 | `qa-ecd06d4e-9f49-48db-9cbc-b1aa03e42fa6` |
| 9 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-b41322fa-d7f9-4187-b7c1-a2caa06bb1c2` |
| 10 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-0388d5e0-d947-4355-bb74-b9989b3930a2` |
| 11 | `POST /v1/auth/token` | 401 | 25 | `qa-b0ba9fa3-73da-4de0-8e6d-70016805c0ac` |
| 12 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-826175c2-5230-4427-bc8d-a1ea5198877c` |
| 13 | `POST /v1/auth/token` | 401 | 16 | `qa-3ad1715b-3cd9-4950-abdd-f94fff9e19d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-afee27be-e536-4c04-96d7-e0a21dfd63cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afee27be-e536-4c04-96d7-e0a21dfd63cd
Content-Type: application/json

--- request body ---
{"handle":"qa-f285848b9222","displayName":"QA f285848b9222","password":"****","region":"eu"}

--- response: 201 in 440 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-afee27be-e536-4c04-96d7-e0a21dfd63cd
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
Location: /v1/accounts/qa-f285848b9222
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74dd26d1-9526-4283-83f6-240393635360","handle":"qa-f285848b9222","displayName":"QA f285848b9222","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.086685511Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a43fe5f4-2373-49f4-b2f0-6ddd92cc1538

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a43fe5f4-2373-49f4-b2f0-6ddd92cc1538
Content-Type: application/json

--- request body ---
{"handle":"qa-947ec8f582cd","displayName":"QA 947ec8f582cd","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a43fe5f4-2373-49f4-b2f0-6ddd92cc1538
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
Location: /v1/accounts/qa-947ec8f582cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1221b3e4-b355-4346-aa88-60b7ab156a8a","handle":"qa-947ec8f582cd","displayName":"QA 947ec8f582cd","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.457307675Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a2efb8a4-03c3-48a8-980f-7917a2084475

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2efb8a4-03c3-48a8-980f-7917a2084475
Content-Type: application/json

--- request body ---
{"handle":"qa-f285848b9222","password":"****"}

--- response: 200 in 44 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2efb8a4-03c3-48a8-980f-7917a2084475
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74dd26d1-9526-4283-83f6-240393635360"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-88c64dd6-34e9-47a5-844e-6b5687b033fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88c64dd6-34e9-47a5-844e-6b5687b033fd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-947ec8f582cd","subject":"Updates","message":"First"}

--- response: 201 in 58 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-88c64dd6-34e9-47a5-844e-6b5687b033fd
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
Location: /v1/conversations/cnv_40dd767d-c17c-460f-a074-a01a38adc2a8
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_40dd767d-c17c-460f-a074-a01a38adc2a8","subject":"Updates","status":"open","region":"eu","participants":["qa-f285848b9222","qa-947ec8f582cd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:14.637645027Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_40dd767d-c17c-460f-a074-a01a38adc2a8/messages
correlation: qa-b5ee7608-2cb0-4d58-b6b0-19e1eac5ea57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ee7608-2cb0-4d58-b6b0-19e1eac5ea57
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 53 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5ee7608-2cb0-4d58-b6b0-19e1eac5ea57
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
Content-Length: 197

{"id":"msg_407c9533-d0a1-44d0-9efa-a9c5bff4fd2c","conversationId":"cnv_40dd767d-c17c-460f-a074-a01a38adc2a8","sender":"qa-f285848b9222","body":"Second","createdAt":"2026-11-04T09:28:14.749404511Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d818e9b8-ed1a-4d50-b30b-1d10dc9ee724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d818e9b8-ed1a-4d50-b30b-1d10dc9ee724
Content-Type: application/json

--- request body ---
{"handle":"qa-947ec8f582cd","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d818e9b8-ed1a-4d50-b30b-1d10dc9ee724
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1221b3e4-b355-4346-aa88-60b7ab156a8a"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_40dd767d-c17c-460f-a074-a01a38adc2a8
correlation: qa-8fa4fd61-63f4-4b39-9bdd-30baccff464d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fa4fd61-63f4-4b39-9bdd-30baccff464d
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fa4fd61-63f4-4b39-9bdd-30baccff464d
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_40dd767d-c17c-460f-a074-a01a38adc2a8","subject":"Updates","status":"open","region":"eu","participants":["qa-f285848b9222","qa-947ec8f582cd"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-04T09:28:14.637645027Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_40dd767d-c17c-460f-a074-a01a38adc2a8/read
correlation: qa-ecd06d4e-9f49-48db-9cbc-b1aa03e42fa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecd06d4e-9f49-48db-9cbc-b1aa03e42fa6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecd06d4e-9f49-48db-9cbc-b1aa03e42fa6
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
Content-Length: 77

{"conversationId":"cnv_40dd767d-c17c-460f-a074-a01a38adc2a8","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_40dd767d-c17c-460f-a074-a01a38adc2a8
correlation: qa-b41322fa-d7f9-4187-b7c1-a2caa06bb1c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b41322fa-d7f9-4187-b7c1-a2caa06bb1c2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b41322fa-d7f9-4187-b7c1-a2caa06bb1c2
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_40dd767d-c17c-460f-a074-a01a38adc2a8","subject":"Updates","status":"open","region":"eu","participants":["qa-f285848b9222","qa-947ec8f582cd"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-04T09:28:14.637645027Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0388d5e0-d947-4355-bb74-b9989b3930a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0388d5e0-d947-4355-bb74-b9989b3930a2
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0388d5e0-d947-4355-bb74-b9989b3930a2
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
correlation: qa-b0ba9fa3-73da-4de0-8e6d-70016805c0ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0ba9fa3-73da-4de0-8e6d-70016805c0ac
Content-Type: application/json

--- request body ---
{"handle":"qa-947ec8f582cd","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0ba9fa3-73da-4de0-8e6d-70016805c0ac
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0ba9fa3-73da-4de0-8e6d-70016805c0ac"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-826175c2-5230-4427-bc8d-a1ea5198877c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-826175c2-5230-4427-bc8d-a1ea5198877c
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-826175c2-5230-4427-bc8d-a1ea5198877c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-3ad1715b-3cd9-4950-abdd-f94fff9e19d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ad1715b-3cd9-4950-abdd-f94fff9e19d5
Content-Type: application/json

--- request body ---
{"handle":"qa-f285848b9222","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ad1715b-3cd9-4950-abdd-f94fff9e19d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ad1715b-3cd9-4950-abdd-f94fff9e19d5"}
```
