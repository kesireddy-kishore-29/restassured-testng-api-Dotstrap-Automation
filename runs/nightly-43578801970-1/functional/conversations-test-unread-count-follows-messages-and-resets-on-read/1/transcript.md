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
| 1 | `POST /v1/accounts` | 201 | 346 | `qa-d032bdc5-b50e-4528-b7ee-7f99c95c0f1c` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-62970c9a-7321-4720-b64f-6e5ffee2b97f` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-a8458a2a-0740-48af-8fd6-3c03e978373d` |
| 4 | `POST /v1/conversations` | 201 | 49 | `qa-d20dbbe4-8b18-40cf-b350-80b4d8bd39ce` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 27 | `qa-09384ca8-00c6-4ffe-8950-3e92d242e100` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-0de78a6c-cd51-4516-a067-78989bb8d2c1` |
| 7 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-4116aa7c-595c-43fc-8f76-cbaa6b5c5ce1` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 6 | `qa-cc0d95be-54af-4db1-947c-d555ecbdaa5b` |
| 9 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-8bda0398-dbd3-46d2-97d7-19cdfd43b238` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e49866d6-12b0-4ff1-9fd4-d8ef4485d834` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-2fe5a3c8-ce4a-43a8-92a1-38c4586c6c6d` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-2ade5985-ce6b-4d2e-a453-c831102330ab` |
| 13 | `POST /v1/auth/token` | 401 | 5 | `qa-e8d369a7-8cac-4f1a-be07-6939198340e9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d032bdc5-b50e-4528-b7ee-7f99c95c0f1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d032bdc5-b50e-4528-b7ee-7f99c95c0f1c
Content-Type: application/json

--- request body ---
{"handle":"qa-1ca9eeecbb6a","displayName":"QA 1ca9eeecbb6a","password":"****","region":"eu"}

--- response: 201 in 346 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d032bdc5-b50e-4528-b7ee-7f99c95c0f1c
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
Location: /v1/accounts/qa-1ca9eeecbb6a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ada3ae84-d558-4727-bc7a-dd75c53ee59d","handle":"qa-1ca9eeecbb6a","displayName":"QA 1ca9eeecbb6a","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.740844651Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-62970c9a-7321-4720-b64f-6e5ffee2b97f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62970c9a-7321-4720-b64f-6e5ffee2b97f
Content-Type: application/json

--- request body ---
{"handle":"qa-edb2bb435b49","displayName":"QA edb2bb435b49","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-62970c9a-7321-4720-b64f-6e5ffee2b97f
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
Location: /v1/accounts/qa-edb2bb435b49
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ca6ac600-9d2d-477b-94e3-63ce534b8bbb","handle":"qa-edb2bb435b49","displayName":"QA edb2bb435b49","region":"eu","role":"user","createdAt":"2026-11-14T09:05:14.051026469Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a8458a2a-0740-48af-8fd6-3c03e978373d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8458a2a-0740-48af-8fd6-3c03e978373d
Content-Type: application/json

--- request body ---
{"handle":"qa-1ca9eeecbb6a","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8458a2a-0740-48af-8fd6-3c03e978373d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ada3ae84-d558-4727-bc7a-dd75c53ee59d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d20dbbe4-8b18-40cf-b350-80b4d8bd39ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d20dbbe4-8b18-40cf-b350-80b4d8bd39ce
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-edb2bb435b49","subject":"Updates","message":"First"}

--- response: 201 in 49 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d20dbbe4-8b18-40cf-b350-80b4d8bd39ce
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
Location: /v1/conversations/cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348","subject":"Updates","status":"open","region":"eu","participants":["qa-1ca9eeecbb6a","qa-edb2bb435b49"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:14.140206144Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348/messages
correlation: qa-09384ca8-00c6-4ffe-8950-3e92d242e100

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09384ca8-00c6-4ffe-8950-3e92d242e100
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-09384ca8-00c6-4ffe-8950-3e92d242e100
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

{"id":"msg_a403daf0-a628-4369-a5f1-8bdb1a55facc","conversationId":"cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348","sender":"qa-1ca9eeecbb6a","body":"Second","createdAt":"2026-11-14T09:05:14.233003610Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0de78a6c-cd51-4516-a067-78989bb8d2c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0de78a6c-cd51-4516-a067-78989bb8d2c1
Content-Type: application/json

--- request body ---
{"handle":"qa-edb2bb435b49","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0de78a6c-cd51-4516-a067-78989bb8d2c1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ca6ac600-9d2d-477b-94e3-63ce534b8bbb"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348
correlation: qa-4116aa7c-595c-43fc-8f76-cbaa6b5c5ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4116aa7c-595c-43fc-8f76-cbaa6b5c5ce1
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4116aa7c-595c-43fc-8f76-cbaa6b5c5ce1
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

{"id":"cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348","subject":"Updates","status":"open","region":"eu","participants":["qa-1ca9eeecbb6a","qa-edb2bb435b49"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-14T09:05:14.140206144Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348/read
correlation: qa-cc0d95be-54af-4db1-947c-d555ecbdaa5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc0d95be-54af-4db1-947c-d555ecbdaa5b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc0d95be-54af-4db1-947c-d555ecbdaa5b
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

{"conversationId":"cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348
correlation: qa-8bda0398-dbd3-46d2-97d7-19cdfd43b238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bda0398-dbd3-46d2-97d7-19cdfd43b238
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bda0398-dbd3-46d2-97d7-19cdfd43b238
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

{"id":"cnv_2cb129eb-0566-4c1c-b1a1-36cb55f9a348","subject":"Updates","status":"open","region":"eu","participants":["qa-1ca9eeecbb6a","qa-edb2bb435b49"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-14T09:05:14.140206144Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e49866d6-12b0-4ff1-9fd4-d8ef4485d834

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e49866d6-12b0-4ff1-9fd4-d8ef4485d834
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e49866d6-12b0-4ff1-9fd4-d8ef4485d834
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
correlation: qa-2fe5a3c8-ce4a-43a8-92a1-38c4586c6c6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fe5a3c8-ce4a-43a8-92a1-38c4586c6c6d
Content-Type: application/json

--- request body ---
{"handle":"qa-edb2bb435b49","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fe5a3c8-ce4a-43a8-92a1-38c4586c6c6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2fe5a3c8-ce4a-43a8-92a1-38c4586c6c6d"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ade5985-ce6b-4d2e-a453-c831102330ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ade5985-ce6b-4d2e-a453-c831102330ab
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ade5985-ce6b-4d2e-a453-c831102330ab
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
correlation: qa-e8d369a7-8cac-4f1a-be07-6939198340e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8d369a7-8cac-4f1a-be07-6939198340e9
Content-Type: application/json

--- request body ---
{"handle":"qa-1ca9eeecbb6a","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8d369a7-8cac-4f1a-be07-6939198340e9
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e8d369a7-8cac-4f1a-be07-6939198340e9"}
```
