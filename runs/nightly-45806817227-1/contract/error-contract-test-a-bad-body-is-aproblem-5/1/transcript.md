# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-5c695c18-a62a-4dfe-82e8-5477d73c3676` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-22050f82-6377-4cd9-b45b-2580c9cc1e93` |
| 3 | `POST /v1/auth/token` | 200 | 58 | `qa-80d76c43-f2ab-4350-8203-8d54278d714d` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-a0c147e4-66cd-47f5-bbcd-15ed9782357a` |
| 5 | `POST /v1/accounts` | 422 | 23 | `qa-fa075b3c-fbfe-4c74-b8ef-5977717c861e` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-31664c93-07f8-47b0-99f7-f481d98d8dc3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-a30c2394-b8e4-4f66-a500-c5106ece54cc` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-6731aad5-54c7-42dd-a3d8-3d8eec031863` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-2af37c20-c3dd-4101-aabe-6fc67b7a692b` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-537c0dd0-07ab-4aa2-a336-16e87d82cc51` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5c695c18-a62a-4dfe-82e8-5477d73c3676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c695c18-a62a-4dfe-82e8-5477d73c3676
Content-Type: application/json

--- request body ---
{"handle":"qa-81c808a70892","displayName":"QA 81c808a70892","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c695c18-a62a-4dfe-82e8-5477d73c3676
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-81c808a70892
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0920d5ad-b8b8-4901-a168-6f31355e0e95","handle":"qa-81c808a70892","displayName":"QA 81c808a70892","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.183376439Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-22050f82-6377-4cd9-b45b-2580c9cc1e93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22050f82-6377-4cd9-b45b-2580c9cc1e93
Content-Type: application/json

--- request body ---
{"handle":"qa-e2b79ed6bc3d","displayName":"QA e2b79ed6bc3d","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-22050f82-6377-4cd9-b45b-2580c9cc1e93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-e2b79ed6bc3d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7210799d-8931-47c8-88e7-205eb9f17fa7","handle":"qa-e2b79ed6bc3d","displayName":"QA e2b79ed6bc3d","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.246290999Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-80d76c43-f2ab-4350-8203-8d54278d714d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80d76c43-f2ab-4350-8203-8d54278d714d
Content-Type: application/json

--- request body ---
{"handle":"qa-81c808a70892","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-80d76c43-f2ab-4350-8203-8d54278d714d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0920d5ad-b8b8-4901-a168-6f31355e0e95"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a0c147e4-66cd-47f5-bbcd-15ed9782357a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c147e4-66cd-47f5-bbcd-15ed9782357a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e2b79ed6bc3d","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0c147e4-66cd-47f5-bbcd-15ed9782357a
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
Location: /v1/conversations/cnv_e876852f-8507-4ed4-a020-dcb5c51aa343
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e876852f-8507-4ed4-a020-dcb5c51aa343","subject":"Error contract","status":"open","region":"eu","participants":["qa-81c808a70892","qa-e2b79ed6bc3d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.419541688Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-fa075b3c-fbfe-4c74-b8ef-5977717c861e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa075b3c-fbfe-4c74-b8ef-5977717c861e
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa075b3c-fbfe-4c74-b8ef-5977717c861e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-fa075b3c-fbfe-4c74-b8ef-5977717c861e","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-31664c93-07f8-47b0-99f7-f481d98d8dc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31664c93-07f8-47b0-99f7-f481d98d8dc3
Content-Type: application/json

--- request body ---
{"handle":"qa-e2b79ed6bc3d","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-31664c93-07f8-47b0-99f7-f481d98d8dc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7210799d-8931-47c8-88e7-205eb9f17fa7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a30c2394-b8e4-4f66-a500-c5106ece54cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a30c2394-b8e4-4f66-a500-c5106ece54cc
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a30c2394-b8e4-4f66-a500-c5106ece54cc
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
correlation: qa-6731aad5-54c7-42dd-a3d8-3d8eec031863

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6731aad5-54c7-42dd-a3d8-3d8eec031863
Content-Type: application/json

--- request body ---
{"handle":"qa-e2b79ed6bc3d","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6731aad5-54c7-42dd-a3d8-3d8eec031863
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6731aad5-54c7-42dd-a3d8-3d8eec031863"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2af37c20-c3dd-4101-aabe-6fc67b7a692b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2af37c20-c3dd-4101-aabe-6fc67b7a692b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2af37c20-c3dd-4101-aabe-6fc67b7a692b
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-537c0dd0-07ab-4aa2-a336-16e87d82cc51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-537c0dd0-07ab-4aa2-a336-16e87d82cc51
Content-Type: application/json

--- request body ---
{"handle":"qa-81c808a70892","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-537c0dd0-07ab-4aa2-a336-16e87d82cc51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-537c0dd0-07ab-4aa2-a336-16e87d82cc51"}
```
