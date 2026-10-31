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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-470a0b2b-a8a9-4c2a-b47f-19863df1312f` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-05a61c58-d97c-4be8-b6e4-d858c332e0d5` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-ba272dfa-ba36-4f27-87f1-fa66ab7fd978` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-470d8063-4d78-47a8-a7e0-1a12c24502b1` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-36054f30-4530-46a8-943c-56265f615c13` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-3efbbfab-effa-47a9-a65e-3f2863e8a46c` |
| 7 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-db23d232-1310-4c69-841a-1f82d72cda97` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 16 | `qa-3a369293-4a29-4989-9324-aaebd006e5cc` |
| 9 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-bd0c25a3-f4b0-4b03-94d5-2a32def41780` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-cc4f0922-a3ed-421a-9900-c5e3d32c6ae8` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-5afec380-fc4f-48bb-be66-c08331deeca6` |
| 12 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-fcf06e7b-e8a3-417a-b904-8dcc0300aa38` |
| 13 | `POST /v1/auth/token` | 401 | 9 | `qa-ed3e5b70-8b59-4f95-8731-c0a914c8ea99` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-470a0b2b-a8a9-4c2a-b47f-19863df1312f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-470a0b2b-a8a9-4c2a-b47f-19863df1312f
Content-Type: application/json

--- request body ---
{"handle":"qa-4814dae0a45e","displayName":"QA 4814dae0a45e","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-470a0b2b-a8a9-4c2a-b47f-19863df1312f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Location: /v1/accounts/qa-4814dae0a45e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60074933-7cac-4e99-8de2-4d30cca14194","handle":"qa-4814dae0a45e","displayName":"QA 4814dae0a45e","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.091225534Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-05a61c58-d97c-4be8-b6e4-d858c332e0d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05a61c58-d97c-4be8-b6e4-d858c332e0d5
Content-Type: application/json

--- request body ---
{"handle":"qa-73ead9be97cd","displayName":"QA 73ead9be97cd","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-05a61c58-d97c-4be8-b6e4-d858c332e0d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-73ead9be97cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a346d2e-8d62-4bc5-a749-90b44a59d4c5","handle":"qa-73ead9be97cd","displayName":"QA 73ead9be97cd","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.118571308Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba272dfa-ba36-4f27-87f1-fa66ab7fd978

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba272dfa-ba36-4f27-87f1-fa66ab7fd978
Content-Type: application/json

--- request body ---
{"handle":"qa-4814dae0a45e","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba272dfa-ba36-4f27-87f1-fa66ab7fd978
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60074933-7cac-4e99-8de2-4d30cca14194"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-470d8063-4d78-47a8-a7e0-1a12c24502b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-470d8063-4d78-47a8-a7e0-1a12c24502b1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-73ead9be97cd","subject":"Updates","message":"First"}

--- response: 201 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-470d8063-4d78-47a8-a7e0-1a12c24502b1
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
Location: /v1/conversations/cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe","subject":"Updates","status":"open","region":"eu","participants":["qa-4814dae0a45e","qa-73ead9be97cd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.150979051Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe/messages
correlation: qa-36054f30-4530-46a8-943c-56265f615c13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36054f30-4530-46a8-943c-56265f615c13
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-36054f30-4530-46a8-943c-56265f615c13
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

{"id":"msg_6ba7710b-a783-46a2-9091-e7448a179707","conversationId":"cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe","sender":"qa-4814dae0a45e","body":"Second","createdAt":"2026-10-28T08:42:53.168785989Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3efbbfab-effa-47a9-a65e-3f2863e8a46c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3efbbfab-effa-47a9-a65e-3f2863e8a46c
Content-Type: application/json

--- request body ---
{"handle":"qa-73ead9be97cd","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3efbbfab-effa-47a9-a65e-3f2863e8a46c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a346d2e-8d62-4bc5-a749-90b44a59d4c5"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe
correlation: qa-db23d232-1310-4c69-841a-1f82d72cda97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db23d232-1310-4c69-841a-1f82d72cda97
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-db23d232-1310-4c69-841a-1f82d72cda97
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

{"id":"cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe","subject":"Updates","status":"open","region":"eu","participants":["qa-4814dae0a45e","qa-73ead9be97cd"],"messageCount":2,"unreadCount":2,"createdAt":"2026-10-28T08:42:53.150979051Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe/read
correlation: qa-3a369293-4a29-4989-9324-aaebd006e5cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a369293-4a29-4989-9324-aaebd006e5cc
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a369293-4a29-4989-9324-aaebd006e5cc
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

{"conversationId":"cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe
correlation: qa-bd0c25a3-f4b0-4b03-94d5-2a32def41780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0c25a3-f4b0-4b03-94d5-2a32def41780
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd0c25a3-f4b0-4b03-94d5-2a32def41780
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

{"id":"cnv_0d9092b5-fcfa-4e58-a554-304bfd1e6fbe","subject":"Updates","status":"open","region":"eu","participants":["qa-4814dae0a45e","qa-73ead9be97cd"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.150979051Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc4f0922-a3ed-421a-9900-c5e3d32c6ae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc4f0922-a3ed-421a-9900-c5e3d32c6ae8
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc4f0922-a3ed-421a-9900-c5e3d32c6ae8
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
correlation: qa-5afec380-fc4f-48bb-be66-c08331deeca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5afec380-fc4f-48bb-be66-c08331deeca6
Content-Type: application/json

--- request body ---
{"handle":"qa-73ead9be97cd","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5afec380-fc4f-48bb-be66-c08331deeca6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5afec380-fc4f-48bb-be66-c08331deeca6"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcf06e7b-e8a3-417a-b904-8dcc0300aa38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcf06e7b-e8a3-417a-b904-8dcc0300aa38
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcf06e7b-e8a3-417a-b904-8dcc0300aa38
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
correlation: qa-ed3e5b70-8b59-4f95-8731-c0a914c8ea99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed3e5b70-8b59-4f95-8731-c0a914c8ea99
Content-Type: application/json

--- request body ---
{"handle":"qa-4814dae0a45e","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed3e5b70-8b59-4f95-8731-c0a914c8ea99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed3e5b70-8b59-4f95-8731-c0a914c8ea99"}
```
