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
| 1 | `POST /v1/accounts` | 201 | 419 | `qa-61b7e2af-94ab-453d-bfda-a6ec6eec1fac` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-4160e77f-b12f-4730-87e1-04d6d03abe75` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-a5c4eb0b-9f32-41cd-a19b-70da91c14d93` |
| 4 | `POST /v1/conversations` | 201 | 49 | `qa-e46d2015-386e-499d-935d-1062b03310cd` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 55 | `qa-5c12ffb5-05e5-4a29-a990-7f832c765708` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-8298b017-ad55-488e-99e0-4f4200f5696a` |
| 7 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-630abbaf-5e45-4b9b-bf55-947e0a6be422` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 11 | `qa-81e72634-c136-4043-98db-4baf3f061a70` |
| 9 | `GET /v1/conversations/{id}` | 200 | 17 | `qa-bac6220d-d482-4f84-aeba-e01310a6f749` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-13feee86-f04a-4d4b-ac58-e1a2d4432b85` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-6e4aa1f7-6e72-4973-88d1-18f1c170b98a` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-3df1368a-c6c2-46ba-9285-20a63d4408e1` |
| 13 | `POST /v1/auth/token` | 401 | 4 | `qa-425ae7b8-8ff3-46c3-aa9f-ff9db7eed4e6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-61b7e2af-94ab-453d-bfda-a6ec6eec1fac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61b7e2af-94ab-453d-bfda-a6ec6eec1fac
Content-Type: application/json

--- request body ---
{"handle":"qa-ef93ddfb8954","displayName":"QA ef93ddfb8954","password":"****","region":"eu"}

--- response: 201 in 419 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-61b7e2af-94ab-453d-bfda-a6ec6eec1fac
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
Location: /v1/accounts/qa-ef93ddfb8954
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4192f032-d1f5-4b18-b866-f34ff0715786","handle":"qa-ef93ddfb8954","displayName":"QA ef93ddfb8954","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.298021164Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4160e77f-b12f-4730-87e1-04d6d03abe75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4160e77f-b12f-4730-87e1-04d6d03abe75
Content-Type: application/json

--- request body ---
{"handle":"qa-dcc348812e7a","displayName":"QA dcc348812e7a","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4160e77f-b12f-4730-87e1-04d6d03abe75
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
Location: /v1/accounts/qa-dcc348812e7a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_46d8d7b5-07c5-4faf-b1eb-54a5f0dd8497","handle":"qa-dcc348812e7a","displayName":"QA dcc348812e7a","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.615317918Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a5c4eb0b-9f32-41cd-a19b-70da91c14d93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5c4eb0b-9f32-41cd-a19b-70da91c14d93
Content-Type: application/json

--- request body ---
{"handle":"qa-ef93ddfb8954","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5c4eb0b-9f32-41cd-a19b-70da91c14d93
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4192f032-d1f5-4b18-b866-f34ff0715786"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e46d2015-386e-499d-935d-1062b03310cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e46d2015-386e-499d-935d-1062b03310cd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dcc348812e7a","subject":"Updates","message":"First"}

--- response: 201 in 49 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-e46d2015-386e-499d-935d-1062b03310cd
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
Location: /v1/conversations/cnv_807b3109-a799-4dd4-925d-e4c5bba881f0
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_807b3109-a799-4dd4-925d-e4c5bba881f0","subject":"Updates","status":"open","region":"eu","participants":["qa-ef93ddfb8954","qa-dcc348812e7a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:14.719423037Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_807b3109-a799-4dd4-925d-e4c5bba881f0/messages
correlation: qa-5c12ffb5-05e5-4a29-a990-7f832c765708

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c12ffb5-05e5-4a29-a990-7f832c765708
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 55 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c12ffb5-05e5-4a29-a990-7f832c765708
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

{"id":"msg_a0920d0d-c2fc-49cd-b9c1-7a53ae8c8301","conversationId":"cnv_807b3109-a799-4dd4-925d-e4c5bba881f0","sender":"qa-ef93ddfb8954","body":"Second","createdAt":"2026-11-28T10:37:14.855963473Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8298b017-ad55-488e-99e0-4f4200f5696a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8298b017-ad55-488e-99e0-4f4200f5696a
Content-Type: application/json

--- request body ---
{"handle":"qa-dcc348812e7a","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8298b017-ad55-488e-99e0-4f4200f5696a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46d8d7b5-07c5-4faf-b1eb-54a5f0dd8497"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_807b3109-a799-4dd4-925d-e4c5bba881f0
correlation: qa-630abbaf-5e45-4b9b-bf55-947e0a6be422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-630abbaf-5e45-4b9b-bf55-947e0a6be422
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-630abbaf-5e45-4b9b-bf55-947e0a6be422
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

{"id":"cnv_807b3109-a799-4dd4-925d-e4c5bba881f0","subject":"Updates","status":"open","region":"eu","participants":["qa-ef93ddfb8954","qa-dcc348812e7a"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-28T10:37:14.719423037Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_807b3109-a799-4dd4-925d-e4c5bba881f0/read
correlation: qa-81e72634-c136-4043-98db-4baf3f061a70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81e72634-c136-4043-98db-4baf3f061a70
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-81e72634-c136-4043-98db-4baf3f061a70
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

{"conversationId":"cnv_807b3109-a799-4dd4-925d-e4c5bba881f0","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_807b3109-a799-4dd4-925d-e4c5bba881f0
correlation: qa-bac6220d-d482-4f84-aeba-e01310a6f749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac6220d-d482-4f84-aeba-e01310a6f749
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-bac6220d-d482-4f84-aeba-e01310a6f749
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

{"id":"cnv_807b3109-a799-4dd4-925d-e4c5bba881f0","subject":"Updates","status":"open","region":"eu","participants":["qa-ef93ddfb8954","qa-dcc348812e7a"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-28T10:37:14.719423037Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-13feee86-f04a-4d4b-ac58-e1a2d4432b85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13feee86-f04a-4d4b-ac58-e1a2d4432b85
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-13feee86-f04a-4d4b-ac58-e1a2d4432b85
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
correlation: qa-6e4aa1f7-6e72-4973-88d1-18f1c170b98a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4aa1f7-6e72-4973-88d1-18f1c170b98a
Content-Type: application/json

--- request body ---
{"handle":"qa-dcc348812e7a","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e4aa1f7-6e72-4973-88d1-18f1c170b98a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e4aa1f7-6e72-4973-88d1-18f1c170b98a"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3df1368a-c6c2-46ba-9285-20a63d4408e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3df1368a-c6c2-46ba-9285-20a63d4408e1
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3df1368a-c6c2-46ba-9285-20a63d4408e1
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
correlation: qa-425ae7b8-8ff3-46c3-aa9f-ff9db7eed4e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-425ae7b8-8ff3-46c3-aa9f-ff9db7eed4e6
Content-Type: application/json

--- request body ---
{"handle":"qa-ef93ddfb8954","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-425ae7b8-8ff3-46c3-aa9f-ff9db7eed4e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-425ae7b8-8ff3-46c3-aa9f-ff9db7eed4e6"}
```
