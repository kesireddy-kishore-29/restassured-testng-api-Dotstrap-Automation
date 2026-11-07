# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-2acc3f48-9857-4b44-8c90-2a8406ca7424` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-b8c9f884-5bd3-4b38-9b54-521aa28fca37` |
| 3 | `POST /v1/accounts` | 201 | 27 | `qa-05746e94-f8b7-43d7-95dc-1542fde50a07` |
| 4 | `POST /v1/auth/token` | 200 | 12 | `qa-4532c69a-6477-4a90-816a-2dfacab1eb51` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-e6aa078e-bd32-44af-8244-ec10898dea21` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-6a30afa4-407f-4d8d-9fec-0fdc132f4de8` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 15 | `qa-fa428b5b-042f-4e2c-84e8-b9f2c3b2be78` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-72bfc0bf-4403-477a-9dcd-1a01a066b744` |
| 9 | `POST /v1/auth/token` | 401 | 22 | `qa-5ac53c4a-410e-4185-9027-f95f342a1916` |
| 10 | `POST /v1/auth/token` | 200 | 44 | `qa-8a90c215-bf76-409b-94fe-98aa1ecbd51f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8cef90c6-8679-44bd-bb41-b8abb48e0aa8` |
| 12 | `POST /v1/auth/token` | 401 | 19 | `qa-5b6ace7a-c81f-43a6-a67c-2dda5109d448` |
| 13 | `DELETE /v1/accounts/me` | 204 | 108 | `qa-2c628bc8-c02f-4f0f-89df-7222b280b647` |
| 14 | `POST /v1/auth/token` | 401 | 18 | `qa-228b0b41-5b22-46e2-a5a4-99df51256ca7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2acc3f48-9857-4b44-8c90-2a8406ca7424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2acc3f48-9857-4b44-8c90-2a8406ca7424
Content-Type: application/json

--- request body ---
{"handle":"qa-9fba133a7306","displayName":"QA 9fba133a7306","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2acc3f48-9857-4b44-8c90-2a8406ca7424
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Location: /v1/accounts/qa-9fba133a7306
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4be14655-72da-45a9-9088-f4ad82b4e5d1","handle":"qa-9fba133a7306","displayName":"QA 9fba133a7306","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.235558884Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b8c9f884-5bd3-4b38-9b54-521aa28fca37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8c9f884-5bd3-4b38-9b54-521aa28fca37
Content-Type: application/json

--- request body ---
{"handle":"qa-0af7fdaa042f","displayName":"QA 0af7fdaa042f","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8c9f884-5bd3-4b38-9b54-521aa28fca37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 10
Location: /v1/accounts/qa-0af7fdaa042f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8fa65170-2b1b-4d07-9e65-327dbcca4f73","handle":"qa-0af7fdaa042f","displayName":"QA 0af7fdaa042f","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.266509203Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-05746e94-f8b7-43d7-95dc-1542fde50a07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05746e94-f8b7-43d7-95dc-1542fde50a07
Content-Type: application/json

--- request body ---
{"handle":"qa-1e84496dd5c1","displayName":"QA 1e84496dd5c1","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-05746e94-f8b7-43d7-95dc-1542fde50a07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-1e84496dd5c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0bae7e7c-fd52-47d3-813e-006cae7a4a72","handle":"qa-1e84496dd5c1","displayName":"QA 1e84496dd5c1","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.308157655Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4532c69a-6477-4a90-816a-2dfacab1eb51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4532c69a-6477-4a90-816a-2dfacab1eb51
Content-Type: application/json

--- request body ---
{"handle":"qa-9fba133a7306","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4532c69a-6477-4a90-816a-2dfacab1eb51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4be14655-72da-45a9-9088-f4ad82b4e5d1"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e6aa078e-bd32-44af-8244-ec10898dea21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6aa078e-bd32-44af-8244-ec10898dea21
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0af7fdaa042f","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6aa078e-bd32-44af-8244-ec10898dea21
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
Location: /v1/conversations/cnv_0790894d-025e-445b-8292-f40113645bce
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0790894d-025e-445b-8292-f40113645bce","subject":"Error contract","status":"open","region":"eu","participants":["qa-9fba133a7306","qa-0af7fdaa042f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.343786370Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6a30afa4-407f-4d8d-9fec-0fdc132f4de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a30afa4-407f-4d8d-9fec-0fdc132f4de8
Content-Type: application/json

--- request body ---
{"handle":"qa-1e84496dd5c1","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a30afa4-407f-4d8d-9fec-0fdc132f4de8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bae7e7c-fd52-47d3-813e-006cae7a4a72"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_0790894d-025e-445b-8292-f40113645bce/messages
correlation: qa-fa428b5b-042f-4e2c-84e8-b9f2c3b2be78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa428b5b-042f-4e2c-84e8-b9f2c3b2be78
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa428b5b-042f-4e2c-84e8-b9f2c3b2be78
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0790894d-025e-445b-8292-f40113645bce/messages","correlationId":"qa-fa428b5b-042f-4e2c-84e8-b9f2c3b2be78"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72bfc0bf-4403-477a-9dcd-1a01a066b744

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72bfc0bf-4403-477a-9dcd-1a01a066b744
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72bfc0bf-4403-477a-9dcd-1a01a066b744
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
correlation: qa-5ac53c4a-410e-4185-9027-f95f342a1916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ac53c4a-410e-4185-9027-f95f342a1916
Content-Type: application/json

--- request body ---
{"handle":"qa-1e84496dd5c1","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ac53c4a-410e-4185-9027-f95f342a1916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ac53c4a-410e-4185-9027-f95f342a1916"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8a90c215-bf76-409b-94fe-98aa1ecbd51f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a90c215-bf76-409b-94fe-98aa1ecbd51f
Content-Type: application/json

--- request body ---
{"handle":"qa-0af7fdaa042f","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a90c215-bf76-409b-94fe-98aa1ecbd51f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8fa65170-2b1b-4d07-9e65-327dbcca4f73"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cef90c6-8679-44bd-bb41-b8abb48e0aa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cef90c6-8679-44bd-bb41-b8abb48e0aa8
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cef90c6-8679-44bd-bb41-b8abb48e0aa8
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-5b6ace7a-c81f-43a6-a67c-2dda5109d448

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6ace7a-c81f-43a6-a67c-2dda5109d448
Content-Type: application/json

--- request body ---
{"handle":"qa-0af7fdaa042f","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b6ace7a-c81f-43a6-a67c-2dda5109d448
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b6ace7a-c81f-43a6-a67c-2dda5109d448"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c628bc8-c02f-4f0f-89df-7222b280b647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c628bc8-c02f-4f0f-89df-7222b280b647
Content-Type: application/json

--- response: 204 in 108 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c628bc8-c02f-4f0f-89df-7222b280b647
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-228b0b41-5b22-46e2-a5a4-99df51256ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-228b0b41-5b22-46e2-a5a4-99df51256ca7
Content-Type: application/json

--- request body ---
{"handle":"qa-9fba133a7306","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-228b0b41-5b22-46e2-a5a4-99df51256ca7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-228b0b41-5b22-46e2-a5a4-99df51256ca7"}
```
