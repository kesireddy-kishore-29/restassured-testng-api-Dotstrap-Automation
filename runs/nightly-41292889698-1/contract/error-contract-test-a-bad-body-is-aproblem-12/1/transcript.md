# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-6e9bfbae-669f-4220-9dd0-f2d7661eaaeb` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-f606a5c9-6c07-4c89-a6ba-207a9c2c3491` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-cd2d0aa7-fe31-4ec5-bd1a-3ce4ff507d30` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-09c10f43-d49f-4153-8143-1f4e74684ee4` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 18 | `qa-7de0899b-f8e9-426f-b194-2b55f8304c72` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-13a3fd86-eb46-4627-a600-67742dd85cf4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-4160de1c-d1a5-4850-a348-42254d05e13e` |
| 8 | `POST /v1/auth/token` | 401 | 38 | `qa-5b8297c6-353d-4944-98f7-f9e8a747a795` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-6146f67b-b9dc-4a99-b6bb-fef75b051d8b` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-5d384e7e-c0fc-440e-96f4-cfe8769c8a0a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e9bfbae-669f-4220-9dd0-f2d7661eaaeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e9bfbae-669f-4220-9dd0-f2d7661eaaeb
Content-Type: application/json

--- request body ---
{"handle":"qa-268001f22a80","displayName":"QA 268001f22a80","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e9bfbae-669f-4220-9dd0-f2d7661eaaeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Location: /v1/accounts/qa-268001f22a80
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c95df449-ee00-440a-b688-a244b835be84","handle":"qa-268001f22a80","displayName":"QA 268001f22a80","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.444300380Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f606a5c9-6c07-4c89-a6ba-207a9c2c3491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f606a5c9-6c07-4c89-a6ba-207a9c2c3491
Content-Type: application/json

--- request body ---
{"handle":"qa-60e055052ba3","displayName":"QA 60e055052ba3","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f606a5c9-6c07-4c89-a6ba-207a9c2c3491
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Location: /v1/accounts/qa-60e055052ba3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05e06c41-9e05-4809-ad04-712bb4e5fb84","handle":"qa-60e055052ba3","displayName":"QA 60e055052ba3","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.482812717Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cd2d0aa7-fe31-4ec5-bd1a-3ce4ff507d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd2d0aa7-fe31-4ec5-bd1a-3ce4ff507d30
Content-Type: application/json

--- request body ---
{"handle":"qa-268001f22a80","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd2d0aa7-fe31-4ec5-bd1a-3ce4ff507d30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c95df449-ee00-440a-b688-a244b835be84"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-09c10f43-d49f-4153-8143-1f4e74684ee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09c10f43-d49f-4153-8143-1f4e74684ee4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-60e055052ba3","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-09c10f43-d49f-4153-8143-1f4e74684ee4
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
Location: /v1/conversations/cnv_5570d8ad-6e9a-47ea-9ca7-9c7404e48e32
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5570d8ad-6e9a-47ea-9ca7-9c7404e48e32","subject":"Error contract","status":"open","region":"eu","participants":["qa-268001f22a80","qa-60e055052ba3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.563279899Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5570d8ad-6e9a-47ea-9ca7-9c7404e48e32/messages
correlation: qa-7de0899b-f8e9-426f-b194-2b55f8304c72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7de0899b-f8e9-426f-b194-2b55f8304c72
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7de0899b-f8e9-426f-b194-2b55f8304c72
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_5570d8ad-6e9a-47ea-9ca7-9c7404e48e32/messages","correlationId":"qa-7de0899b-f8e9-426f-b194-2b55f8304c72"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-13a3fd86-eb46-4627-a600-67742dd85cf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13a3fd86-eb46-4627-a600-67742dd85cf4
Content-Type: application/json

--- request body ---
{"handle":"qa-60e055052ba3","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-13a3fd86-eb46-4627-a600-67742dd85cf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05e06c41-9e05-4809-ad04-712bb4e5fb84"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4160de1c-d1a5-4850-a348-42254d05e13e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4160de1c-d1a5-4850-a348-42254d05e13e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4160de1c-d1a5-4850-a348-42254d05e13e
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-5b8297c6-353d-4944-98f7-f9e8a747a795

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b8297c6-353d-4944-98f7-f9e8a747a795
Content-Type: application/json

--- request body ---
{"handle":"qa-60e055052ba3","password":"****"}

--- response: 401 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b8297c6-353d-4944-98f7-f9e8a747a795
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b8297c6-353d-4944-98f7-f9e8a747a795"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6146f67b-b9dc-4a99-b6bb-fef75b051d8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6146f67b-b9dc-4a99-b6bb-fef75b051d8b
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6146f67b-b9dc-4a99-b6bb-fef75b051d8b
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5d384e7e-c0fc-440e-96f4-cfe8769c8a0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d384e7e-c0fc-440e-96f4-cfe8769c8a0a
Content-Type: application/json

--- request body ---
{"handle":"qa-268001f22a80","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d384e7e-c0fc-440e-96f4-cfe8769c8a0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5d384e7e-c0fc-440e-96f4-cfe8769c8a0a"}
```
