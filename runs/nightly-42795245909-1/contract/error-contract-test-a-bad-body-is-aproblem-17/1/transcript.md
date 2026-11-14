# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-975e75f7-dfbd-4fb4-b012-bba94b5eea93` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-c0036dc8-7de4-4af1-b12a-5276d77f73f0` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-08043a25-406c-4031-a48e-64a0cc38a2db` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-8db6158a-82c5-4236-af12-5a4e2107124e` |
| 5 | `POST /v1/credits/purchases` | 422 | 8 | `qa-875b94a1-d55a-4f73-8e80-967f1d4f787a` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-c9d4bd98-45f8-4b4b-9587-799fe976baf6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d42fa998-e497-4598-b442-be5c47b6fb1c` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-b46762c9-1646-4633-b460-78142c7317ec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ca1a80eb-fde5-4dd3-a23c-1ced32805fdf` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-ae1e589c-cb9f-461e-8132-405c01305974` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-975e75f7-dfbd-4fb4-b012-bba94b5eea93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-975e75f7-dfbd-4fb4-b012-bba94b5eea93
Content-Type: application/json

--- request body ---
{"handle":"qa-55a277643c04","displayName":"QA 55a277643c04","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-975e75f7-dfbd-4fb4-b012-bba94b5eea93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Location: /v1/accounts/qa-55a277643c04
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e6403d7-8967-4e3e-bc39-28f0c3e2a467","handle":"qa-55a277643c04","displayName":"QA 55a277643c04","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.644957281Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c0036dc8-7de4-4af1-b12a-5276d77f73f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0036dc8-7de4-4af1-b12a-5276d77f73f0
Content-Type: application/json

--- request body ---
{"handle":"qa-5b90519c476f","displayName":"QA 5b90519c476f","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0036dc8-7de4-4af1-b12a-5276d77f73f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Location: /v1/accounts/qa-5b90519c476f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88bfc4ef-05e1-4089-9bfe-fde4568d7b43","handle":"qa-5b90519c476f","displayName":"QA 5b90519c476f","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.682723085Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-08043a25-406c-4031-a48e-64a0cc38a2db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08043a25-406c-4031-a48e-64a0cc38a2db
Content-Type: application/json

--- request body ---
{"handle":"qa-55a277643c04","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-08043a25-406c-4031-a48e-64a0cc38a2db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e6403d7-8967-4e3e-bc39-28f0c3e2a467"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8db6158a-82c5-4236-af12-5a4e2107124e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8db6158a-82c5-4236-af12-5a4e2107124e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5b90519c476f","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8db6158a-82c5-4236-af12-5a4e2107124e
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
Location: /v1/conversations/cnv_b4294b5a-0e8e-48c7-9082-b74609347705
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b4294b5a-0e8e-48c7-9082-b74609347705","subject":"Error contract","status":"open","region":"eu","participants":["qa-55a277643c04","qa-5b90519c476f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.731515462Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-875b94a1-d55a-4f73-8e80-967f1d4f787a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ad319c4c2ee34c29a64c90849912be68
X-Correlation-Id: qa-875b94a1-d55a-4f73-8e80-967f1d4f787a
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-875b94a1-d55a-4f73-8e80-967f1d4f787a
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-875b94a1-d55a-4f73-8e80-967f1d4f787a","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c9d4bd98-45f8-4b4b-9587-799fe976baf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9d4bd98-45f8-4b4b-9587-799fe976baf6
Content-Type: application/json

--- request body ---
{"handle":"qa-5b90519c476f","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9d4bd98-45f8-4b4b-9587-799fe976baf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88bfc4ef-05e1-4089-9bfe-fde4568d7b43"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d42fa998-e497-4598-b442-be5c47b6fb1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d42fa998-e497-4598-b442-be5c47b6fb1c
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d42fa998-e497-4598-b442-be5c47b6fb1c
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
correlation: qa-b46762c9-1646-4633-b460-78142c7317ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b46762c9-1646-4633-b460-78142c7317ec
Content-Type: application/json

--- request body ---
{"handle":"qa-5b90519c476f","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b46762c9-1646-4633-b460-78142c7317ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b46762c9-1646-4633-b460-78142c7317ec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca1a80eb-fde5-4dd3-a23c-1ced32805fdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca1a80eb-fde5-4dd3-a23c-1ced32805fdf
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca1a80eb-fde5-4dd3-a23c-1ced32805fdf
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
correlation: qa-ae1e589c-cb9f-461e-8132-405c01305974

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae1e589c-cb9f-461e-8132-405c01305974
Content-Type: application/json

--- request body ---
{"handle":"qa-55a277643c04","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae1e589c-cb9f-461e-8132-405c01305974
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae1e589c-cb9f-461e-8132-405c01305974"}
```
