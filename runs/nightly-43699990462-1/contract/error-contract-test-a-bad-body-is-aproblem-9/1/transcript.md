# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-0d9da717-1c97-49dc-b49e-898b6a9fc38b` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-ba81decc-8625-46e4-8480-6f55d96659f0` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-fa8aef51-5f48-4744-b6c8-3da008e9421f` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-8645c123-d7b0-40d8-a5ba-77b116c27a10` |
| 5 | `POST /v1/conversations` | 400 | 8 | `qa-a34888d0-a5df-4fe0-8122-3dc4e5e95587` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-5e86c28b-1fa2-4c21-baa2-fa34c43b05c0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b865c126-aeb3-466f-a78b-578105434537` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-a3e11eea-5d20-4a58-8407-bce99b18d764` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-cb8f4894-9bc5-4149-9692-bc659d2f2763` |
| 10 | `POST /v1/auth/token` | 401 | 48 | `qa-07513fb1-c982-4b05-8a36-49ab94b7cfaa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d9da717-1c97-49dc-b49e-898b6a9fc38b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d9da717-1c97-49dc-b49e-898b6a9fc38b
Content-Type: application/json

--- request body ---
{"handle":"qa-5516edbc988f","displayName":"QA 5516edbc988f","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d9da717-1c97-49dc-b49e-898b6a9fc38b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Location: /v1/accounts/qa-5516edbc988f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e71c8c44-4a3b-4294-ad6a-ccf61b408969","handle":"qa-5516edbc988f","displayName":"QA 5516edbc988f","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.858540551Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ba81decc-8625-46e4-8480-6f55d96659f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba81decc-8625-46e4-8480-6f55d96659f0
Content-Type: application/json

--- request body ---
{"handle":"qa-2a00139e6bfe","displayName":"QA 2a00139e6bfe","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba81decc-8625-46e4-8480-6f55d96659f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-2a00139e6bfe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39a22091-c6f7-4a0f-8d13-401b403eb599","handle":"qa-2a00139e6bfe","displayName":"QA 2a00139e6bfe","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.892415261Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fa8aef51-5f48-4744-b6c8-3da008e9421f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa8aef51-5f48-4744-b6c8-3da008e9421f
Content-Type: application/json

--- request body ---
{"handle":"qa-5516edbc988f","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa8aef51-5f48-4744-b6c8-3da008e9421f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e71c8c44-4a3b-4294-ad6a-ccf61b408969"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8645c123-d7b0-40d8-a5ba-77b116c27a10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8645c123-d7b0-40d8-a5ba-77b116c27a10
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2a00139e6bfe","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8645c123-d7b0-40d8-a5ba-77b116c27a10
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
Location: /v1/conversations/cnv_94ca6b0c-378d-4b8b-b0f5-d13b3e564f93
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_94ca6b0c-378d-4b8b-b0f5-d13b3e564f93","subject":"Error contract","status":"open","region":"eu","participants":["qa-5516edbc988f","qa-2a00139e6bfe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.931428134Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a34888d0-a5df-4fe0-8122-3dc4e5e95587

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a34888d0-a5df-4fe0-8122-3dc4e5e95587
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a34888d0-a5df-4fe0-8122-3dc4e5e95587
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-a34888d0-a5df-4fe0-8122-3dc4e5e95587"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5e86c28b-1fa2-4c21-baa2-fa34c43b05c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e86c28b-1fa2-4c21-baa2-fa34c43b05c0
Content-Type: application/json

--- request body ---
{"handle":"qa-2a00139e6bfe","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e86c28b-1fa2-4c21-baa2-fa34c43b05c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_39a22091-c6f7-4a0f-8d13-401b403eb599"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b865c126-aeb3-466f-a78b-578105434537

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b865c126-aeb3-466f-a78b-578105434537
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b865c126-aeb3-466f-a78b-578105434537
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
correlation: qa-a3e11eea-5d20-4a58-8407-bce99b18d764

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3e11eea-5d20-4a58-8407-bce99b18d764
Content-Type: application/json

--- request body ---
{"handle":"qa-2a00139e6bfe","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3e11eea-5d20-4a58-8407-bce99b18d764
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a3e11eea-5d20-4a58-8407-bce99b18d764"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb8f4894-9bc5-4149-9692-bc659d2f2763

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb8f4894-9bc5-4149-9692-bc659d2f2763
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb8f4894-9bc5-4149-9692-bc659d2f2763
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
correlation: qa-07513fb1-c982-4b05-8a36-49ab94b7cfaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07513fb1-c982-4b05-8a36-49ab94b7cfaa
Content-Type: application/json

--- request body ---
{"handle":"qa-5516edbc988f","password":"****"}

--- response: 401 in 48 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07513fb1-c982-4b05-8a36-49ab94b7cfaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07513fb1-c982-4b05-8a36-49ab94b7cfaa"}
```
