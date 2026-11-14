# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 459 | `qa-07216739-51b5-4131-9b27-f7ac33771e74` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-49999082-c6ac-4afc-bf2b-b1c23354e5a5` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-d7f70ed2-a936-496e-8a4e-1133b3abaad0` |
| 4 | `POST /v1/conversations` | 201 | 65 | `qa-a6a86c25-ec5e-42f5-80f0-9a44ccfb3956` |
| 5 | `GET /v1/conversations` | 200 | 27 | `qa-ffc16056-b8fc-4006-81fa-5cf74ebe6c8c` |
| 6 | `GET /v1/conversations/{id}` | 200 | 17 | `qa-fe6f4990-1042-47eb-98d7-003229e80791` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-c6d58948-0a04-41c1-89e6-9a035410a0c1` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-528afbdc-3c44-4e38-b6e7-80bef78dd997` |
| 9 | `POST /v1/auth/token` | 200 | 20 | `qa-3f3a26f4-a52d-422c-9643-37246a5918ef` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 15 | `qa-b5083e5a-d9d6-48bf-9031-43b952646e92` |
| 11 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-1ef26e59-7a82-4792-a17d-01db3bc3d2f2` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-d7dc0460-2fa6-4125-b384-81e40cdf9557` |
| 13 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2fb16ff6-70b5-4f12-9d76-af115932bc6c` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-ead92643-8f3d-4836-961c-25c85d3846c8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-07216739-51b5-4131-9b27-f7ac33771e74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07216739-51b5-4131-9b27-f7ac33771e74
Content-Type: application/json

--- request body ---
{"handle":"qa-79199018a66c","displayName":"QA 79199018a66c","password":"****","region":"eu"}

--- response: 201 in 459 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-07216739-51b5-4131-9b27-f7ac33771e74
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
Location: /v1/accounts/qa-79199018a66c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9310f49-fa00-466d-b92b-eed858cc4b2a","handle":"qa-79199018a66c","displayName":"QA 79199018a66c","region":"eu","role":"user","createdAt":"2026-11-06T09:30:30.084546151Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-49999082-c6ac-4afc-bf2b-b1c23354e5a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49999082-c6ac-4afc-bf2b-b1c23354e5a5
Content-Type: application/json

--- request body ---
{"handle":"qa-cf54532004d2","displayName":"QA cf54532004d2","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-49999082-c6ac-4afc-bf2b-b1c23354e5a5
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
Location: /v1/accounts/qa-cf54532004d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69f5bbeb-2508-4f80-aa3f-364b59c81098","handle":"qa-cf54532004d2","displayName":"QA cf54532004d2","region":"eu","role":"user","createdAt":"2026-11-06T09:30:30.511061351Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d7f70ed2-a936-496e-8a4e-1133b3abaad0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7f70ed2-a936-496e-8a4e-1133b3abaad0
Content-Type: application/json

--- request body ---
{"handle":"qa-79199018a66c","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7f70ed2-a936-496e-8a4e-1133b3abaad0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9310f49-fa00-466d-b92b-eed858cc4b2a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a6a86c25-ec5e-42f5-80f0-9a44ccfb3956

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6a86c25-ec5e-42f5-80f0-9a44ccfb3956
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cf54532004d2","subject":"Contract check","message":"Hello"}

--- response: 201 in 65 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6a86c25-ec5e-42f5-80f0-9a44ccfb3956
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
Location: /v1/conversations/cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71","subject":"Contract check","status":"open","region":"eu","participants":["qa-79199018a66c","qa-cf54532004d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:30.664875003Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-ffc16056-b8fc-4006-81fa-5cf74ebe6c8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffc16056-b8fc-4006-81fa-5cf74ebe6c8c
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffc16056-b8fc-4006-81fa-5cf74ebe6c8c
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
Content-Length: 259

{"items":[{"id":"cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71","subject":"Contract check","status":"open","region":"eu","participants":["qa-79199018a66c","qa-cf54532004d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:30.664875003Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71
correlation: qa-fe6f4990-1042-47eb-98d7-003229e80791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe6f4990-1042-47eb-98d7-003229e80791
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe6f4990-1042-47eb-98d7-003229e80791
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
Content-Length: 237

{"id":"cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71","subject":"Contract check","status":"open","region":"eu","participants":["qa-79199018a66c","qa-cf54532004d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:30.664875003Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71/messages
correlation: qa-c6d58948-0a04-41c1-89e6-9a035410a0c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d58948-0a04-41c1-89e6-9a035410a0c1
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6d58948-0a04-41c1-89e6-9a035410a0c1
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
Content-Length: 197

{"id":"msg_a9606fa7-78a7-42ea-baef-7a836aab1974","conversationId":"cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71","sender":"qa-79199018a66c","body":"Second","createdAt":"2026-11-06T09:30:30.855786747Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71/messages
correlation: qa-528afbdc-3c44-4e38-b6e7-80bef78dd997

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-528afbdc-3c44-4e38-b6e7-80bef78dd997
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-528afbdc-3c44-4e38-b6e7-80bef78dd997
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_6e79fed7-4894-4111-84a3-2d9da68c4ea9","conversationId":"cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71","sender":"qa-79199018a66c","body":"Hello","createdAt":"2026-11-06T09:30:30.665201090Z"},{"id":"msg_a9606fa7-78a7-42ea-baef-7a836aab1974","conversationId":"cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71","sender":"qa-79199018a66c","body":"Second","createdAt":"2026-11-06T09:30:30.855786747Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3f3a26f4-a52d-422c-9643-37246a5918ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f3a26f4-a52d-422c-9643-37246a5918ef
Content-Type: application/json

--- request body ---
{"handle":"qa-cf54532004d2","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f3a26f4-a52d-422c-9643-37246a5918ef
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69f5bbeb-2508-4f80-aa3f-364b59c81098"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71/read
correlation: qa-b5083e5a-d9d6-48bf-9031-43b952646e92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5083e5a-d9d6-48bf-9031-43b952646e92
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5083e5a-d9d6-48bf-9031-43b952646e92
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
Content-Length: 77

{"conversationId":"cnv_ed068a17-b3ea-44a2-8ea5-af772bf3cd71","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ef26e59-7a82-4792-a17d-01db3bc3d2f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ef26e59-7a82-4792-a17d-01db3bc3d2f2
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ef26e59-7a82-4792-a17d-01db3bc3d2f2
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d7dc0460-2fa6-4125-b384-81e40cdf9557

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7dc0460-2fa6-4125-b384-81e40cdf9557
Content-Type: application/json

--- request body ---
{"handle":"qa-cf54532004d2","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7dc0460-2fa6-4125-b384-81e40cdf9557
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7dc0460-2fa6-4125-b384-81e40cdf9557"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2fb16ff6-70b5-4f12-9d76-af115932bc6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fb16ff6-70b5-4f12-9d76-af115932bc6c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2fb16ff6-70b5-4f12-9d76-af115932bc6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-ead92643-8f3d-4836-961c-25c85d3846c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ead92643-8f3d-4836-961c-25c85d3846c8
Content-Type: application/json

--- request body ---
{"handle":"qa-79199018a66c","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ead92643-8f3d-4836-961c-25c85d3846c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ead92643-8f3d-4836-961c-25c85d3846c8"}
```
