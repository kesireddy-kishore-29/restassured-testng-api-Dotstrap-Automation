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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-f082fcc0-41fa-48de-9358-b458b290f450` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-14787e79-b391-4a49-bf53-32774a749d06` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-b79761fe-1717-4581-b5d1-af0e67423218` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-2bc54158-352e-4d02-9151-073e8ad0d961` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-a076d295-8961-4624-bb88-8f3a0d6450b0` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-d3a6e6f4-d7f1-41ea-ba4d-e029e9c429df` |
| 7 | `GET /v1/conversations/{id}` | 200 | 5 | `qa-413a58d3-9096-41ed-8e4d-c98158ab81e1` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 6 | `qa-783f36eb-3901-4cf1-aba0-fe1d1a1e55ca` |
| 9 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-95c91292-195a-42eb-b324-4c268025e67a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-11d4db25-b06d-470f-91c0-520841eb8e66` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-1bb81a5c-130c-4ccf-b104-b2cea3de4367` |
| 12 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-6aa02243-3c17-414f-b726-34ec067af658` |
| 13 | `POST /v1/auth/token` | 401 | 7 | `qa-ce4831e9-ef1d-487d-9e85-520d4d27d0f0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f082fcc0-41fa-48de-9358-b458b290f450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f082fcc0-41fa-48de-9358-b458b290f450
Content-Type: application/json

--- request body ---
{"handle":"qa-1f11842434d6","displayName":"QA 1f11842434d6","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f082fcc0-41fa-48de-9358-b458b290f450
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
Location: /v1/accounts/qa-1f11842434d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6d4de53-3c96-4841-b7c6-3a71ada1497d","handle":"qa-1f11842434d6","displayName":"QA 1f11842434d6","region":"eu","role":"user","createdAt":"2026-10-31T08:31:24.557856143Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-14787e79-b391-4a49-bf53-32774a749d06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14787e79-b391-4a49-bf53-32774a749d06
Content-Type: application/json

--- request body ---
{"handle":"qa-c41c76b13601","displayName":"QA c41c76b13601","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-14787e79-b391-4a49-bf53-32774a749d06
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
Location: /v1/accounts/qa-c41c76b13601
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d98ca4bf-ccbe-4e2f-9001-6e3fb59cc2b2","handle":"qa-c41c76b13601","displayName":"QA c41c76b13601","region":"eu","role":"user","createdAt":"2026-10-31T08:31:24.580786342Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b79761fe-1717-4581-b5d1-af0e67423218

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b79761fe-1717-4581-b5d1-af0e67423218
Content-Type: application/json

--- request body ---
{"handle":"qa-1f11842434d6","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b79761fe-1717-4581-b5d1-af0e67423218
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6d4de53-3c96-4841-b7c6-3a71ada1497d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2bc54158-352e-4d02-9151-073e8ad0d961

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc54158-352e-4d02-9151-073e8ad0d961
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c41c76b13601","subject":"Updates","message":"First"}

--- response: 201 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bc54158-352e-4d02-9151-073e8ad0d961
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
Location: /v1/conversations/cnv_c16030b4-d96c-4e71-8322-90fff444e01b
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_c16030b4-d96c-4e71-8322-90fff444e01b","subject":"Updates","status":"open","region":"eu","participants":["qa-1f11842434d6","qa-c41c76b13601"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:24.625722495Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c16030b4-d96c-4e71-8322-90fff444e01b/messages
correlation: qa-a076d295-8961-4624-bb88-8f3a0d6450b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a076d295-8961-4624-bb88-8f3a0d6450b0
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a076d295-8961-4624-bb88-8f3a0d6450b0
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

{"id":"msg_e2505fab-c573-4b0f-b8df-3b285749c649","conversationId":"cnv_c16030b4-d96c-4e71-8322-90fff444e01b","sender":"qa-1f11842434d6","body":"Second","createdAt":"2026-10-31T08:31:24.643275375Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d3a6e6f4-d7f1-41ea-ba4d-e029e9c429df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3a6e6f4-d7f1-41ea-ba4d-e029e9c429df
Content-Type: application/json

--- request body ---
{"handle":"qa-c41c76b13601","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3a6e6f4-d7f1-41ea-ba4d-e029e9c429df
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d98ca4bf-ccbe-4e2f-9001-6e3fb59cc2b2"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_c16030b4-d96c-4e71-8322-90fff444e01b
correlation: qa-413a58d3-9096-41ed-8e4d-c98158ab81e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-413a58d3-9096-41ed-8e4d-c98158ab81e1
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-413a58d3-9096-41ed-8e4d-c98158ab81e1
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

{"id":"cnv_c16030b4-d96c-4e71-8322-90fff444e01b","subject":"Updates","status":"open","region":"eu","participants":["qa-1f11842434d6","qa-c41c76b13601"],"messageCount":2,"unreadCount":2,"createdAt":"2026-10-31T08:31:24.625722495Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_c16030b4-d96c-4e71-8322-90fff444e01b/read
correlation: qa-783f36eb-3901-4cf1-aba0-fe1d1a1e55ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783f36eb-3901-4cf1-aba0-fe1d1a1e55ca
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-783f36eb-3901-4cf1-aba0-fe1d1a1e55ca
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

{"conversationId":"cnv_c16030b4-d96c-4e71-8322-90fff444e01b","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_c16030b4-d96c-4e71-8322-90fff444e01b
correlation: qa-95c91292-195a-42eb-b324-4c268025e67a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95c91292-195a-42eb-b324-4c268025e67a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-95c91292-195a-42eb-b324-4c268025e67a
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

{"id":"cnv_c16030b4-d96c-4e71-8322-90fff444e01b","subject":"Updates","status":"open","region":"eu","participants":["qa-1f11842434d6","qa-c41c76b13601"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-31T08:31:24.625722495Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11d4db25-b06d-470f-91c0-520841eb8e66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11d4db25-b06d-470f-91c0-520841eb8e66
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11d4db25-b06d-470f-91c0-520841eb8e66
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
correlation: qa-1bb81a5c-130c-4ccf-b104-b2cea3de4367

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bb81a5c-130c-4ccf-b104-b2cea3de4367
Content-Type: application/json

--- request body ---
{"handle":"qa-c41c76b13601","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bb81a5c-130c-4ccf-b104-b2cea3de4367
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1bb81a5c-130c-4ccf-b104-b2cea3de4367"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6aa02243-3c17-414f-b726-34ec067af658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aa02243-3c17-414f-b726-34ec067af658
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6aa02243-3c17-414f-b726-34ec067af658
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
correlation: qa-ce4831e9-ef1d-487d-9e85-520d4d27d0f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce4831e9-ef1d-487d-9e85-520d4d27d0f0
Content-Type: application/json

--- request body ---
{"handle":"qa-1f11842434d6","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce4831e9-ef1d-487d-9e85-520d4d27d0f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce4831e9-ef1d-487d-9e85-520d4d27d0f0"}
```
