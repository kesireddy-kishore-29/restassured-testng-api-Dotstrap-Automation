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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-73d220e7-702e-40e5-aaca-98e59342427f` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-c4022637-3ac1-4ddd-b52a-b15116b4d05a` |
| 3 | `POST /v1/auth/token` | 200 | 7 | `qa-2fff2551-aa4b-477e-9ce8-8304615d701e` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-c88294ac-8d51-484c-9a85-153bd1019d7d` |
| 5 | `GET /v1/conversations` | 200 | 18 | `qa-6e8a50c3-d883-4069-b795-afd21e7b94c6` |
| 6 | `GET /v1/conversations/{id}` | 200 | 4 | `qa-26cad85c-cb51-46d2-bdab-bcc122afcb8b` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 4 | `qa-6dd2591f-206e-4dab-b089-932ead71c104` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-ff1d8633-423f-439d-9163-b9f83d1581c3` |
| 9 | `POST /v1/auth/token` | 200 | 9 | `qa-f69db427-980e-4d68-86c6-0f162eaf6b43` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 6 | `qa-74cfeda5-fdbb-42d9-b8d3-230914f0a7bb` |
| 11 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-1c458061-19bc-440f-9bfe-06f66cdc5865` |
| 12 | `POST /v1/auth/token` | 401 | 5 | `qa-7309ad62-ee81-4aac-b364-4d6077a297be` |
| 13 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-24713ec0-b0d5-4fd3-94fb-67a46ec6c047` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-167feaa4-4e99-4f95-8c94-94ce654f4c25` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73d220e7-702e-40e5-aaca-98e59342427f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73d220e7-702e-40e5-aaca-98e59342427f
Content-Type: application/json

--- request body ---
{"handle":"qa-42d5e02451d3","displayName":"QA 42d5e02451d3","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-73d220e7-702e-40e5-aaca-98e59342427f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 8
Location: /v1/accounts/qa-42d5e02451d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9718ea18-80e1-4cb3-91e1-51c317b5f6a0","handle":"qa-42d5e02451d3","displayName":"QA 42d5e02451d3","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.945344856Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c4022637-3ac1-4ddd-b52a-b15116b4d05a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4022637-3ac1-4ddd-b52a-b15116b4d05a
Content-Type: application/json

--- request body ---
{"handle":"qa-1a50dc7b19d5","displayName":"QA 1a50dc7b19d5","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4022637-3ac1-4ddd-b52a-b15116b4d05a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Location: /v1/accounts/qa-1a50dc7b19d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44981cfd-843d-49f1-bc64-e1bdb16e315c","handle":"qa-1a50dc7b19d5","displayName":"QA 1a50dc7b19d5","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.998032085Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2fff2551-aa4b-477e-9ce8-8304615d701e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fff2551-aa4b-477e-9ce8-8304615d701e
Content-Type: application/json

--- request body ---
{"handle":"qa-42d5e02451d3","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fff2551-aa4b-477e-9ce8-8304615d701e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9718ea18-80e1-4cb3-91e1-51c317b5f6a0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c88294ac-8d51-484c-9a85-153bd1019d7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c88294ac-8d51-484c-9a85-153bd1019d7d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1a50dc7b19d5","subject":"Contract check","message":"Hello"}

--- response: 201 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c88294ac-8d51-484c-9a85-153bd1019d7d
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
Location: /v1/conversations/cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d","subject":"Contract check","status":"open","region":"eu","participants":["qa-42d5e02451d3","qa-1a50dc7b19d5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:04.028907189Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-6e8a50c3-d883-4069-b795-afd21e7b94c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e8a50c3-d883-4069-b795-afd21e7b94c6
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e8a50c3-d883-4069-b795-afd21e7b94c6
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

{"items":[{"id":"cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d","subject":"Contract check","status":"open","region":"eu","participants":["qa-42d5e02451d3","qa-1a50dc7b19d5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:04.028907189Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d
correlation: qa-26cad85c-cb51-46d2-bdab-bcc122afcb8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26cad85c-cb51-46d2-bdab-bcc122afcb8b
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-26cad85c-cb51-46d2-bdab-bcc122afcb8b
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

{"id":"cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d","subject":"Contract check","status":"open","region":"eu","participants":["qa-42d5e02451d3","qa-1a50dc7b19d5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:04.028907189Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d/messages
correlation: qa-6dd2591f-206e-4dab-b089-932ead71c104

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd2591f-206e-4dab-b089-932ead71c104
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dd2591f-206e-4dab-b089-932ead71c104
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

{"id":"msg_a08fa9de-ce77-441f-8080-6778fba8c5cc","conversationId":"cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d","sender":"qa-42d5e02451d3","body":"Second","createdAt":"2026-11-04T09:28:04.091216515Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d/messages
correlation: qa-ff1d8633-423f-439d-9163-b9f83d1581c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff1d8633-423f-439d-9163-b9f83d1581c3
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff1d8633-423f-439d-9163-b9f83d1581c3
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

{"items":[{"id":"msg_b9d57f18-3e78-4315-9b90-17f1696ae732","conversationId":"cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d","sender":"qa-42d5e02451d3","body":"Hello","createdAt":"2026-11-04T09:28:04.028952216Z"},{"id":"msg_a08fa9de-ce77-441f-8080-6778fba8c5cc","conversationId":"cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d","sender":"qa-42d5e02451d3","body":"Second","createdAt":"2026-11-04T09:28:04.091216515Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-f69db427-980e-4d68-86c6-0f162eaf6b43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f69db427-980e-4d68-86c6-0f162eaf6b43
Content-Type: application/json

--- request body ---
{"handle":"qa-1a50dc7b19d5","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f69db427-980e-4d68-86c6-0f162eaf6b43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44981cfd-843d-49f1-bc64-e1bdb16e315c"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d/read
correlation: qa-74cfeda5-fdbb-42d9-b8d3-230914f0a7bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74cfeda5-fdbb-42d9-b8d3-230914f0a7bb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-74cfeda5-fdbb-42d9-b8d3-230914f0a7bb
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

{"conversationId":"cnv_3d933078-7ae1-43f4-ac76-969f5c86ad3d","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c458061-19bc-440f-9bfe-06f66cdc5865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c458061-19bc-440f-9bfe-06f66cdc5865
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c458061-19bc-440f-9bfe-06f66cdc5865
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
correlation: qa-7309ad62-ee81-4aac-b364-4d6077a297be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7309ad62-ee81-4aac-b364-4d6077a297be
Content-Type: application/json

--- request body ---
{"handle":"qa-1a50dc7b19d5","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7309ad62-ee81-4aac-b364-4d6077a297be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7309ad62-ee81-4aac-b364-4d6077a297be"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24713ec0-b0d5-4fd3-94fb-67a46ec6c047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24713ec0-b0d5-4fd3-94fb-67a46ec6c047
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24713ec0-b0d5-4fd3-94fb-67a46ec6c047
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
correlation: qa-167feaa4-4e99-4f95-8c94-94ce654f4c25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167feaa4-4e99-4f95-8c94-94ce654f4c25
Content-Type: application/json

--- request body ---
{"handle":"qa-42d5e02451d3","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-167feaa4-4e99-4f95-8c94-94ce654f4c25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-167feaa4-4e99-4f95-8c94-94ce654f4c25"}
```
