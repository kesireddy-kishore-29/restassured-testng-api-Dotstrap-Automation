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
| 1 | `POST /v1/accounts` | 201 | 424 | `qa-d26b3e48-88ca-43b4-b94f-5020e8fd26cb` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-5e178421-d9a3-4f08-aa92-67f0585519ba` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-7b379e43-0a31-423c-be59-5e5fb1c91b7f` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-8a7edd3b-88ec-4450-819a-b10e3842b27d` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 28 | `qa-3efa739f-5058-4548-a019-244c3367ad2b` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-2f155d7f-34d0-4666-af4d-e304fc565bbe` |
| 7 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-e61707ec-5fc2-4dc1-8d1e-052600a9ff02` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 19 | `qa-5140587a-502c-4f94-b3bd-45d09a523885` |
| 9 | `GET /v1/conversations/{id}` | 200 | 19 | `qa-bdac3018-49c0-4f39-ad19-fca8ff28b33c` |
| 10 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b49d9034-951c-4513-8164-674b6f8ee6e4` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-346cc640-d821-44b1-bbe1-068b75a8854b` |
| 12 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-cb2106f7-8cf9-4d6b-853a-d28b12f1c6f0` |
| 13 | `POST /v1/auth/token` | 401 | 12 | `qa-fa9884d3-2256-4a3b-b36c-beef205f1c10` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d26b3e48-88ca-43b4-b94f-5020e8fd26cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d26b3e48-88ca-43b4-b94f-5020e8fd26cb
Content-Type: application/json

--- request body ---
{"handle":"qa-87b1892dd2ab","displayName":"QA 87b1892dd2ab","password":"****","region":"eu"}

--- response: 201 in 424 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d26b3e48-88ca-43b4-b94f-5020e8fd26cb
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
Location: /v1/accounts/qa-87b1892dd2ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c7ab5508-8cc5-462d-92bf-0cc481c66249","handle":"qa-87b1892dd2ab","displayName":"QA 87b1892dd2ab","region":"eu","role":"user","createdAt":"2026-11-13T09:42:06.949339311Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5e178421-d9a3-4f08-aa92-67f0585519ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e178421-d9a3-4f08-aa92-67f0585519ba
Content-Type: application/json

--- request body ---
{"handle":"qa-479cad5ae8c8","displayName":"QA 479cad5ae8c8","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e178421-d9a3-4f08-aa92-67f0585519ba
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
Location: /v1/accounts/qa-479cad5ae8c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ee7ec8a-a06b-4c4f-91ce-c7d2d1c55f72","handle":"qa-479cad5ae8c8","displayName":"QA 479cad5ae8c8","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.326426718Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7b379e43-0a31-423c-be59-5e5fb1c91b7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b379e43-0a31-423c-be59-5e5fb1c91b7f
Content-Type: application/json

--- request body ---
{"handle":"qa-87b1892dd2ab","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b379e43-0a31-423c-be59-5e5fb1c91b7f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7ab5508-8cc5-462d-92bf-0cc481c66249"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8a7edd3b-88ec-4450-819a-b10e3842b27d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a7edd3b-88ec-4450-819a-b10e3842b27d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-479cad5ae8c8","subject":"Updates","message":"First"}

--- response: 201 in 35 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a7edd3b-88ec-4450-819a-b10e3842b27d
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
Location: /v1/conversations/cnv_370ad9c0-8983-4abc-a0ef-750d380955ec
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_370ad9c0-8983-4abc-a0ef-750d380955ec","subject":"Updates","status":"open","region":"eu","participants":["qa-87b1892dd2ab","qa-479cad5ae8c8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.466360468Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_370ad9c0-8983-4abc-a0ef-750d380955ec/messages
correlation: qa-3efa739f-5058-4548-a019-244c3367ad2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3efa739f-5058-4548-a019-244c3367ad2b
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3efa739f-5058-4548-a019-244c3367ad2b
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

{"id":"msg_865949bc-d1a7-4a7d-8b43-9107b0f334c8","conversationId":"cnv_370ad9c0-8983-4abc-a0ef-750d380955ec","sender":"qa-87b1892dd2ab","body":"Second","createdAt":"2026-11-13T09:42:07.567340101Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2f155d7f-34d0-4666-af4d-e304fc565bbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f155d7f-34d0-4666-af4d-e304fc565bbe
Content-Type: application/json

--- request body ---
{"handle":"qa-479cad5ae8c8","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f155d7f-34d0-4666-af4d-e304fc565bbe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ee7ec8a-a06b-4c4f-91ce-c7d2d1c55f72"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_370ad9c0-8983-4abc-a0ef-750d380955ec
correlation: qa-e61707ec-5fc2-4dc1-8d1e-052600a9ff02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e61707ec-5fc2-4dc1-8d1e-052600a9ff02
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e61707ec-5fc2-4dc1-8d1e-052600a9ff02
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

{"id":"cnv_370ad9c0-8983-4abc-a0ef-750d380955ec","subject":"Updates","status":"open","region":"eu","participants":["qa-87b1892dd2ab","qa-479cad5ae8c8"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-13T09:42:07.466360468Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_370ad9c0-8983-4abc-a0ef-750d380955ec/read
correlation: qa-5140587a-502c-4f94-b3bd-45d09a523885

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5140587a-502c-4f94-b3bd-45d09a523885
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5140587a-502c-4f94-b3bd-45d09a523885
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

{"conversationId":"cnv_370ad9c0-8983-4abc-a0ef-750d380955ec","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_370ad9c0-8983-4abc-a0ef-750d380955ec
correlation: qa-bdac3018-49c0-4f39-ad19-fca8ff28b33c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdac3018-49c0-4f39-ad19-fca8ff28b33c
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdac3018-49c0-4f39-ad19-fca8ff28b33c
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

{"id":"cnv_370ad9c0-8983-4abc-a0ef-750d380955ec","subject":"Updates","status":"open","region":"eu","participants":["qa-87b1892dd2ab","qa-479cad5ae8c8"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.466360468Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b49d9034-951c-4513-8164-674b6f8ee6e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b49d9034-951c-4513-8164-674b6f8ee6e4
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b49d9034-951c-4513-8164-674b6f8ee6e4
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
correlation: qa-346cc640-d821-44b1-bbe1-068b75a8854b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-346cc640-d821-44b1-bbe1-068b75a8854b
Content-Type: application/json

--- request body ---
{"handle":"qa-479cad5ae8c8","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-346cc640-d821-44b1-bbe1-068b75a8854b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-346cc640-d821-44b1-bbe1-068b75a8854b"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb2106f7-8cf9-4d6b-853a-d28b12f1c6f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb2106f7-8cf9-4d6b-853a-d28b12f1c6f0
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb2106f7-8cf9-4d6b-853a-d28b12f1c6f0
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
correlation: qa-fa9884d3-2256-4a3b-b36c-beef205f1c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa9884d3-2256-4a3b-b36c-beef205f1c10
Content-Type: application/json

--- request body ---
{"handle":"qa-87b1892dd2ab","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa9884d3-2256-4a3b-b36c-beef205f1c10
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa9884d3-2256-4a3b-b36c-beef205f1c10"}
```
