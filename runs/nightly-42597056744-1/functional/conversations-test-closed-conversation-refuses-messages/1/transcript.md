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
| 1 | `POST /v1/accounts` | 201 | 493 | `qa-3ceee75b-d547-454d-9270-f77a2c1614b1` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-d5dfc65d-9a16-43b1-8dd3-f00cdc1099df` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-0d462f45-0a2d-4736-babd-34c8e145a980` |
| 4 | `POST /v1/conversations` | 201 | 53 | `qa-13cccc85-7a1a-40c8-b035-1d70e7ecd3a8` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 33 | `qa-894a960d-af37-4045-b17e-dc13a3fcc31e` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-4059734d-5492-4b42-b6ab-306d9f9a9ff2` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 27 | `qa-ab1550da-a49b-4ddd-ba63-977bec47bb58` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-2b260e05-7489-4a9a-bf93-e580986a7ca4` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-c5079ecf-6df0-4f7f-a199-c999fafe8218` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-479c79bb-b955-43a0-b32c-b4a766808ff2` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-276a8b00-0262-40a0-b859-43be3cb81fd4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ceee75b-d547-454d-9270-f77a2c1614b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ceee75b-d547-454d-9270-f77a2c1614b1
Content-Type: application/json

--- request body ---
{"handle":"qa-c0855e38cd09","displayName":"QA c0855e38cd09","password":"****","region":"eu"}

--- response: 201 in 493 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ceee75b-d547-454d-9270-f77a2c1614b1
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
Location: /v1/accounts/qa-c0855e38cd09
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1274a5f3-4177-41e9-813b-16b63aeffba5","handle":"qa-c0855e38cd09","displayName":"QA c0855e38cd09","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.921778048Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d5dfc65d-9a16-43b1-8dd3-f00cdc1099df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5dfc65d-9a16-43b1-8dd3-f00cdc1099df
Content-Type: application/json

--- request body ---
{"handle":"qa-55365032f6ac","displayName":"QA 55365032f6ac","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5dfc65d-9a16-43b1-8dd3-f00cdc1099df
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
Location: /v1/accounts/qa-55365032f6ac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9c588b7d-ce8a-4601-9f75-3e68952d1ee1","handle":"qa-55365032f6ac","displayName":"QA 55365032f6ac","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.347612041Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0d462f45-0a2d-4736-babd-34c8e145a980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d462f45-0a2d-4736-babd-34c8e145a980
Content-Type: application/json

--- request body ---
{"handle":"qa-c0855e38cd09","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d462f45-0a2d-4736-babd-34c8e145a980
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1274a5f3-4177-41e9-813b-16b63aeffba5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-13cccc85-7a1a-40c8-b035-1d70e7ecd3a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13cccc85-7a1a-40c8-b035-1d70e7ecd3a8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-55365032f6ac","subject":"Quick question","message":"Hi"}

--- response: 201 in 53 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-13cccc85-7a1a-40c8-b035-1d70e7ecd3a8
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
Location: /v1/conversations/cnv_1018a17f-985a-4f2c-8ca1-61b9cca5d88e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1018a17f-985a-4f2c-8ca1-61b9cca5d88e","subject":"Quick question","status":"open","region":"eu","participants":["qa-c0855e38cd09","qa-55365032f6ac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:55:59.517753318Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1018a17f-985a-4f2c-8ca1-61b9cca5d88e/close
correlation: qa-894a960d-af37-4045-b17e-dc13a3fcc31e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-894a960d-af37-4045-b17e-dc13a3fcc31e
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-894a960d-af37-4045-b17e-dc13a3fcc31e
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

{"id":"cnv_1018a17f-985a-4f2c-8ca1-61b9cca5d88e","subject":"Quick question","status":"closed","region":"eu","participants":["qa-c0855e38cd09","qa-55365032f6ac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:55:59.517753318Z","closedAt":"2026-11-09T09:55:59.649645835Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4059734d-5492-4b42-b6ab-306d9f9a9ff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4059734d-5492-4b42-b6ab-306d9f9a9ff2
Content-Type: application/json

--- request body ---
{"handle":"qa-55365032f6ac","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4059734d-5492-4b42-b6ab-306d9f9a9ff2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9c588b7d-ce8a-4601-9f75-3e68952d1ee1"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_1018a17f-985a-4f2c-8ca1-61b9cca5d88e/messages
correlation: qa-ab1550da-a49b-4ddd-ba63-977bec47bb58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab1550da-a49b-4ddd-ba63-977bec47bb58
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 27 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab1550da-a49b-4ddd-ba63-977bec47bb58
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_1018a17f-985a-4f2c-8ca1-61b9cca5d88e/messages","correlationId":"qa-ab1550da-a49b-4ddd-ba63-977bec47bb58"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b260e05-7489-4a9a-bf93-e580986a7ca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b260e05-7489-4a9a-bf93-e580986a7ca4
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b260e05-7489-4a9a-bf93-e580986a7ca4
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
correlation: qa-c5079ecf-6df0-4f7f-a199-c999fafe8218

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5079ecf-6df0-4f7f-a199-c999fafe8218
Content-Type: application/json

--- request body ---
{"handle":"qa-55365032f6ac","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5079ecf-6df0-4f7f-a199-c999fafe8218
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5079ecf-6df0-4f7f-a199-c999fafe8218"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-479c79bb-b955-43a0-b32c-b4a766808ff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-479c79bb-b955-43a0-b32c-b4a766808ff2
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-479c79bb-b955-43a0-b32c-b4a766808ff2
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
correlation: qa-276a8b00-0262-40a0-b859-43be3cb81fd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-276a8b00-0262-40a0-b859-43be3cb81fd4
Content-Type: application/json

--- request body ---
{"handle":"qa-c0855e38cd09","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-276a8b00-0262-40a0-b859-43be3cb81fd4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-276a8b00-0262-40a0-b859-43be3cb81fd4"}
```
