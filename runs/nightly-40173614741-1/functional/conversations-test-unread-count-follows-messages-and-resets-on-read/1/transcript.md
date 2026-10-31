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
| 1 | `POST /v1/accounts` | 201 | 423 | `qa-4b4e27da-106a-4d4a-8ac0-878ec49e508a` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-e918744a-b63c-40fe-a8b5-e450083590de` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-8ea8c4ad-74ac-42b5-b863-ee1521799b6d` |
| 4 | `POST /v1/conversations` | 201 | 56 | `qa-f69e7689-6e6e-4f75-a918-3bfe4242d410` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 32 | `qa-2cb6adb6-e887-40ba-b009-083d64f73b81` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-352b2eb8-bd6b-4481-84ae-e3da6336671d` |
| 7 | `GET /v1/conversations/{id}` | 200 | 19 | `qa-ab1a95fc-1802-400b-892d-512786724bae` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 21 | `qa-e1ae46d8-08dd-4f04-8ac3-390d5ac65990` |
| 9 | `GET /v1/conversations/{id}` | 200 | 26 | `qa-7d00a22d-710d-429a-9de7-2c147c963d0d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a4ec0e77-5fe4-44e3-9ba2-cff09584c92b` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-7f7fc7dc-2856-4a12-80f8-d0b91c231308` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-549a1e94-7b70-4c4f-9e65-1255ee219186` |
| 13 | `POST /v1/auth/token` | 401 | 9 | `qa-a39f3d7f-7a0a-4908-b0e2-70b1b7ec4508` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4b4e27da-106a-4d4a-8ac0-878ec49e508a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b4e27da-106a-4d4a-8ac0-878ec49e508a
Content-Type: application/json

--- request body ---
{"handle":"qa-0efde846eff5","displayName":"QA 0efde846eff5","password":"****","region":"eu"}

--- response: 201 in 423 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b4e27da-106a-4d4a-8ac0-878ec49e508a
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
Location: /v1/accounts/qa-0efde846eff5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d08f8025-aa43-4ffb-9630-dea52a8508d5","handle":"qa-0efde846eff5","displayName":"QA 0efde846eff5","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.075528804Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e918744a-b63c-40fe-a8b5-e450083590de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e918744a-b63c-40fe-a8b5-e450083590de
Content-Type: application/json

--- request body ---
{"handle":"qa-595ea949936f","displayName":"QA 595ea949936f","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e918744a-b63c-40fe-a8b5-e450083590de
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
Location: /v1/accounts/qa-595ea949936f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34e8241d-23de-40b4-81f1-f0582ff33017","handle":"qa-595ea949936f","displayName":"QA 595ea949936f","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.617723189Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8ea8c4ad-74ac-42b5-b863-ee1521799b6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ea8c4ad-74ac-42b5-b863-ee1521799b6d
Content-Type: application/json

--- request body ---
{"handle":"qa-0efde846eff5","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ea8c4ad-74ac-42b5-b863-ee1521799b6d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d08f8025-aa43-4ffb-9630-dea52a8508d5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f69e7689-6e6e-4f75-a918-3bfe4242d410

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f69e7689-6e6e-4f75-a918-3bfe4242d410
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-595ea949936f","subject":"Updates","message":"First"}

--- response: 201 in 56 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f69e7689-6e6e-4f75-a918-3bfe4242d410
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
Location: /v1/conversations/cnv_a12631fd-49c7-43ef-a320-2515491444fb
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_a12631fd-49c7-43ef-a320-2515491444fb","subject":"Updates","status":"open","region":"eu","participants":["qa-0efde846eff5","qa-595ea949936f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.748578892Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a12631fd-49c7-43ef-a320-2515491444fb/messages
correlation: qa-2cb6adb6-e887-40ba-b009-083d64f73b81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cb6adb6-e887-40ba-b009-083d64f73b81
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 32 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cb6adb6-e887-40ba-b009-083d64f73b81
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

{"id":"msg_0dd9197c-d6f8-47b5-9265-f8862c0b63c9","conversationId":"cnv_a12631fd-49c7-43ef-a320-2515491444fb","sender":"qa-0efde846eff5","body":"Second","createdAt":"2026-10-25T07:40:26.890982097Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-352b2eb8-bd6b-4481-84ae-e3da6336671d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-352b2eb8-bd6b-4481-84ae-e3da6336671d
Content-Type: application/json

--- request body ---
{"handle":"qa-595ea949936f","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-352b2eb8-bd6b-4481-84ae-e3da6336671d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34e8241d-23de-40b4-81f1-f0582ff33017"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a12631fd-49c7-43ef-a320-2515491444fb
correlation: qa-ab1a95fc-1802-400b-892d-512786724bae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab1a95fc-1802-400b-892d-512786724bae
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab1a95fc-1802-400b-892d-512786724bae
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

{"id":"cnv_a12631fd-49c7-43ef-a320-2515491444fb","subject":"Updates","status":"open","region":"eu","participants":["qa-0efde846eff5","qa-595ea949936f"],"messageCount":2,"unreadCount":2,"createdAt":"2026-10-25T07:40:26.748578892Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_a12631fd-49c7-43ef-a320-2515491444fb/read
correlation: qa-e1ae46d8-08dd-4f04-8ac3-390d5ac65990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1ae46d8-08dd-4f04-8ac3-390d5ac65990
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1ae46d8-08dd-4f04-8ac3-390d5ac65990
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

{"conversationId":"cnv_a12631fd-49c7-43ef-a320-2515491444fb","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_a12631fd-49c7-43ef-a320-2515491444fb
correlation: qa-7d00a22d-710d-429a-9de7-2c147c963d0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d00a22d-710d-429a-9de7-2c147c963d0d
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d00a22d-710d-429a-9de7-2c147c963d0d
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

{"id":"cnv_a12631fd-49c7-43ef-a320-2515491444fb","subject":"Updates","status":"open","region":"eu","participants":["qa-0efde846eff5","qa-595ea949936f"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.748578892Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4ec0e77-5fe4-44e3-9ba2-cff09584c92b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4ec0e77-5fe4-44e3-9ba2-cff09584c92b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4ec0e77-5fe4-44e3-9ba2-cff09584c92b
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
correlation: qa-7f7fc7dc-2856-4a12-80f8-d0b91c231308

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f7fc7dc-2856-4a12-80f8-d0b91c231308
Content-Type: application/json

--- request body ---
{"handle":"qa-595ea949936f","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f7fc7dc-2856-4a12-80f8-d0b91c231308
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f7fc7dc-2856-4a12-80f8-d0b91c231308"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-549a1e94-7b70-4c4f-9e65-1255ee219186

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-549a1e94-7b70-4c4f-9e65-1255ee219186
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-549a1e94-7b70-4c4f-9e65-1255ee219186
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
correlation: qa-a39f3d7f-7a0a-4908-b0e2-70b1b7ec4508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a39f3d7f-7a0a-4908-b0e2-70b1b7ec4508
Content-Type: application/json

--- request body ---
{"handle":"qa-0efde846eff5","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a39f3d7f-7a0a-4908-b0e2-70b1b7ec4508
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a39f3d7f-7a0a-4908-b0e2-70b1b7ec4508"}
```
