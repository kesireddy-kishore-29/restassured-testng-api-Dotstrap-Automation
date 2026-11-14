# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-b105c203-bff7-4aba-b619-154994d762a6` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-cd1f4790-fc11-46ee-a2f7-8022e2cbaa4a` |
| 3 | `POST /v1/accounts` | 201 | 34 | `qa-03a4f90b-3abf-4874-9968-41dbcc772d2d` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-8ed14ec5-31e0-4d64-b30a-8107f66a3a49` |
| 5 | `POST /v1/conversations` | 201 | 57 | `qa-a0c8fca5-d6e5-4783-982c-9063cbc6e47e` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-12a6b1c7-3174-4fd6-98a6-b9a8ad737026` |
| 7 | `GET /v1/conversations/{id}` | 403 | 10 | `qa-84dfe991-c465-45fe-be64-3d4c82470f6f` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 9 | `qa-62608cd4-39bb-4769-becb-04df46d362b8` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-fac271ca-f2e9-4677-8ff0-ecee6d2733e3` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-aa85bac9-af61-455d-994b-e09c9afa4dd6` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-7478f67d-603b-4ae6-bdc0-f1d51dc09a26` |
| 12 | `POST /v1/auth/token` | 200 | 11 | `qa-d22fa93f-e4f5-40e7-81f2-abd3985877e3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-17883277-6698-4988-8b53-ca19c33e4dcd` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-2fbac41e-4dfb-467e-9033-8f6e39ddae9b` |
| 15 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3b231b79-8b2c-489f-a683-7803bfc2a658` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-89a2bde9-af98-48e6-904b-ece7bc89f087` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b105c203-bff7-4aba-b619-154994d762a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b105c203-bff7-4aba-b619-154994d762a6
Content-Type: application/json

--- request body ---
{"handle":"qa-11da3cc4dc76","displayName":"QA 11da3cc4dc76","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b105c203-bff7-4aba-b619-154994d762a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-11da3cc4dc76
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3bc1750c-e880-4589-93bf-7fccc5874715","handle":"qa-11da3cc4dc76","displayName":"QA 11da3cc4dc76","region":"eu","role":"user","createdAt":"2026-11-10T09:59:47.614345486Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cd1f4790-fc11-46ee-a2f7-8022e2cbaa4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd1f4790-fc11-46ee-a2f7-8022e2cbaa4a
Content-Type: application/json

--- request body ---
{"handle":"qa-1acccec30098","displayName":"QA 1acccec30098","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd1f4790-fc11-46ee-a2f7-8022e2cbaa4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-1acccec30098
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c47e0070-e348-4c08-81b6-6b43f1d622fd","handle":"qa-1acccec30098","displayName":"QA 1acccec30098","region":"eu","role":"user","createdAt":"2026-11-10T09:59:47.709673977Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-03a4f90b-3abf-4874-9968-41dbcc772d2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03a4f90b-3abf-4874-9968-41dbcc772d2d
Content-Type: application/json

--- request body ---
{"handle":"qa-969de57dc212","displayName":"QA 969de57dc212","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-03a4f90b-3abf-4874-9968-41dbcc772d2d
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
Location: /v1/accounts/qa-969de57dc212
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0640f4a-6ec8-40a0-b6d2-0888f7307b1a","handle":"qa-969de57dc212","displayName":"QA 969de57dc212","region":"eu","role":"user","createdAt":"2026-11-10T09:59:47.777818123Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8ed14ec5-31e0-4d64-b30a-8107f66a3a49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ed14ec5-31e0-4d64-b30a-8107f66a3a49
Content-Type: application/json

--- request body ---
{"handle":"qa-11da3cc4dc76","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ed14ec5-31e0-4d64-b30a-8107f66a3a49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3bc1750c-e880-4589-93bf-7fccc5874715"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a0c8fca5-d6e5-4783-982c-9063cbc6e47e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c8fca5-d6e5-4783-982c-9063cbc6e47e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1acccec30098","subject":"Private","message":"Just us"}

--- response: 201 in 57 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0c8fca5-d6e5-4783-982c-9063cbc6e47e
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
Location: /v1/conversations/cnv_ed461728-54fc-4f46-a561-a9c2df57144d
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_ed461728-54fc-4f46-a561-a9c2df57144d","subject":"Private","status":"open","region":"eu","participants":["qa-11da3cc4dc76","qa-1acccec30098"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:47.848433074Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-12a6b1c7-3174-4fd6-98a6-b9a8ad737026

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12a6b1c7-3174-4fd6-98a6-b9a8ad737026
Content-Type: application/json

--- request body ---
{"handle":"qa-969de57dc212","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-12a6b1c7-3174-4fd6-98a6-b9a8ad737026
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0640f4a-6ec8-40a0-b6d2-0888f7307b1a"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_ed461728-54fc-4f46-a561-a9c2df57144d
correlation: qa-84dfe991-c465-45fe-be64-3d4c82470f6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84dfe991-c465-45fe-be64-3d4c82470f6f
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84dfe991-c465-45fe-be64-3d4c82470f6f
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ed461728-54fc-4f46-a561-a9c2df57144d","correlationId":"qa-84dfe991-c465-45fe-be64-3d4c82470f6f"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_ed461728-54fc-4f46-a561-a9c2df57144d/messages
correlation: qa-62608cd4-39bb-4769-becb-04df46d362b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62608cd4-39bb-4769-becb-04df46d362b8
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62608cd4-39bb-4769-becb-04df46d362b8
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ed461728-54fc-4f46-a561-a9c2df57144d/messages","correlationId":"qa-62608cd4-39bb-4769-becb-04df46d362b8"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_ed461728-54fc-4f46-a561-a9c2df57144d/messages
correlation: qa-fac271ca-f2e9-4677-8ff0-ecee6d2733e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fac271ca-f2e9-4677-8ff0-ecee6d2733e3
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fac271ca-f2e9-4677-8ff0-ecee6d2733e3
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ed461728-54fc-4f46-a561-a9c2df57144d/messages","correlationId":"qa-fac271ca-f2e9-4677-8ff0-ecee6d2733e3"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa85bac9-af61-455d-994b-e09c9afa4dd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa85bac9-af61-455d-994b-e09c9afa4dd6
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa85bac9-af61-455d-994b-e09c9afa4dd6
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-7478f67d-603b-4ae6-bdc0-f1d51dc09a26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7478f67d-603b-4ae6-bdc0-f1d51dc09a26
Content-Type: application/json

--- request body ---
{"handle":"qa-969de57dc212","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7478f67d-603b-4ae6-bdc0-f1d51dc09a26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7478f67d-603b-4ae6-bdc0-f1d51dc09a26"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d22fa93f-e4f5-40e7-81f2-abd3985877e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d22fa93f-e4f5-40e7-81f2-abd3985877e3
Content-Type: application/json

--- request body ---
{"handle":"qa-1acccec30098","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d22fa93f-e4f5-40e7-81f2-abd3985877e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c47e0070-e348-4c08-81b6-6b43f1d622fd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17883277-6698-4988-8b53-ca19c33e4dcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17883277-6698-4988-8b53-ca19c33e4dcd
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17883277-6698-4988-8b53-ca19c33e4dcd
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-2fbac41e-4dfb-467e-9033-8f6e39ddae9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fbac41e-4dfb-467e-9033-8f6e39ddae9b
Content-Type: application/json

--- request body ---
{"handle":"qa-1acccec30098","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fbac41e-4dfb-467e-9033-8f6e39ddae9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2fbac41e-4dfb-467e-9033-8f6e39ddae9b"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b231b79-8b2c-489f-a683-7803bfc2a658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b231b79-8b2c-489f-a683-7803bfc2a658
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b231b79-8b2c-489f-a683-7803bfc2a658
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-89a2bde9-af98-48e6-904b-ece7bc89f087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89a2bde9-af98-48e6-904b-ece7bc89f087
Content-Type: application/json

--- request body ---
{"handle":"qa-11da3cc4dc76","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89a2bde9-af98-48e6-904b-ece7bc89f087
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-89a2bde9-af98-48e6-904b-ece7bc89f087"}
```
