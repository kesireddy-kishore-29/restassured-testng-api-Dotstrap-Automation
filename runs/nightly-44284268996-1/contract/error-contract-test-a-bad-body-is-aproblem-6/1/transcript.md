# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-944c8602-11f7-405d-8061-a8a739e8e972` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-1aa1a0d8-d647-43bb-a62a-8f1c1164f902` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-8beb98b3-39e7-48da-8d75-a4c659768171` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-959ba0f3-592a-4778-a961-a0e477f89cff` |
| 5 | `PATCH /v1/accounts/me` | 400 | 18 | `qa-2cca2646-132d-438e-b59e-14b3d7ffc4b2` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-ca5e54e5-ff15-4374-b440-2dcf08d9911d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-6c9c62c7-eca3-4f80-8224-108629d07c03` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-7fdacc4c-4d94-4da4-a4fa-48ad19cb4180` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-12486d1a-9e57-4549-ab79-89f3a372a9f0` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-8f443cd3-c4d1-4370-b705-10f99260a584` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-944c8602-11f7-405d-8061-a8a739e8e972

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-944c8602-11f7-405d-8061-a8a739e8e972
Content-Type: application/json

--- request body ---
{"handle":"qa-9a069035b80e","displayName":"QA 9a069035b80e","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-944c8602-11f7-405d-8061-a8a739e8e972
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-9a069035b80e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f5e436a-4d96-4ea5-9d8c-3bb0c8791cb0","handle":"qa-9a069035b80e","displayName":"QA 9a069035b80e","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.737608936Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1aa1a0d8-d647-43bb-a62a-8f1c1164f902

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1aa1a0d8-d647-43bb-a62a-8f1c1164f902
Content-Type: application/json

--- request body ---
{"handle":"qa-18f3f3779c5f","displayName":"QA 18f3f3779c5f","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1aa1a0d8-d647-43bb-a62a-8f1c1164f902
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Location: /v1/accounts/qa-18f3f3779c5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ffb8322b-10aa-489e-aae4-c3dfc5677307","handle":"qa-18f3f3779c5f","displayName":"QA 18f3f3779c5f","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.783623710Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8beb98b3-39e7-48da-8d75-a4c659768171

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8beb98b3-39e7-48da-8d75-a4c659768171
Content-Type: application/json

--- request body ---
{"handle":"qa-9a069035b80e","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-8beb98b3-39e7-48da-8d75-a4c659768171
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f5e436a-4d96-4ea5-9d8c-3bb0c8791cb0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-959ba0f3-592a-4778-a961-a0e477f89cff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-959ba0f3-592a-4778-a961-a0e477f89cff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-18f3f3779c5f","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-959ba0f3-592a-4778-a961-a0e477f89cff
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
Location: /v1/conversations/cnv_6bf82748-7dad-4ee6-82a6-40a8f6d21671
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6bf82748-7dad-4ee6-82a6-40a8f6d21671","subject":"Error contract","status":"open","region":"eu","participants":["qa-9a069035b80e","qa-18f3f3779c5f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:51.878219719Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-2cca2646-132d-438e-b59e-14b3d7ffc4b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cca2646-132d-438e-b59e-14b3d7ffc4b2
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2cca2646-132d-438e-b59e-14b3d7ffc4b2
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-2cca2646-132d-438e-b59e-14b3d7ffc4b2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ca5e54e5-ff15-4374-b440-2dcf08d9911d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca5e54e5-ff15-4374-b440-2dcf08d9911d
Content-Type: application/json

--- request body ---
{"handle":"qa-18f3f3779c5f","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca5e54e5-ff15-4374-b440-2dcf08d9911d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ffb8322b-10aa-489e-aae4-c3dfc5677307"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c9c62c7-eca3-4f80-8224-108629d07c03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c9c62c7-eca3-4f80-8224-108629d07c03
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c9c62c7-eca3-4f80-8224-108629d07c03
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
correlation: qa-7fdacc4c-4d94-4da4-a4fa-48ad19cb4180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fdacc4c-4d94-4da4-a4fa-48ad19cb4180
Content-Type: application/json

--- request body ---
{"handle":"qa-18f3f3779c5f","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7fdacc4c-4d94-4da4-a4fa-48ad19cb4180
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7fdacc4c-4d94-4da4-a4fa-48ad19cb4180"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-12486d1a-9e57-4549-ab79-89f3a372a9f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12486d1a-9e57-4549-ab79-89f3a372a9f0
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-12486d1a-9e57-4549-ab79-89f3a372a9f0
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
correlation: qa-8f443cd3-c4d1-4370-b705-10f99260a584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f443cd3-c4d1-4370-b705-10f99260a584
Content-Type: application/json

--- request body ---
{"handle":"qa-9a069035b80e","password":"****"}

--- response: 401 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f443cd3-c4d1-4370-b705-10f99260a584
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f443cd3-c4d1-4370-b705-10f99260a584"}
```
