# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-e448d82c-f7de-42c5-ac1b-38fbfb40f576` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-ee5d34cd-3da8-416d-b565-27172a7b4ee1` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-3b065280-f3c7-4738-98ea-4d684659872c` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-64b388e4-c141-4a42-96ca-7a52e8fa0472` |
| 5 | `POST /v1/auth/token` | 503 | 17 | `qa-7a18b411-3fb0-41e8-b531-fdbd86a3d678` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-5635bf45-3313-4f15-bcf6-acb4b81d34db` |
| 7 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-5f8f4fcb-f43e-4b6b-8ead-9efa89b03784` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-687aec3b-e50c-4e0c-bf95-d17fa7326794` |
| 9 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-8ff4ea45-9350-46f5-8105-a6dbbbabc667` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-a4419572-504e-4c97-ac7e-0ce59b24c0bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e448d82c-f7de-42c5-ac1b-38fbfb40f576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e448d82c-f7de-42c5-ac1b-38fbfb40f576
Content-Type: application/json

--- request body ---
{"handle":"qa-0bbd6c4a79d2","displayName":"QA 0bbd6c4a79d2","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e448d82c-f7de-42c5-ac1b-38fbfb40f576
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-0bbd6c4a79d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7961e8fa-3f62-4b8b-8d63-b7512a7b0b3c","handle":"qa-0bbd6c4a79d2","displayName":"QA 0bbd6c4a79d2","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.627981415Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ee5d34cd-3da8-416d-b565-27172a7b4ee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee5d34cd-3da8-416d-b565-27172a7b4ee1
Content-Type: application/json

--- request body ---
{"handle":"qa-c4f17a0aeba7","displayName":"QA c4f17a0aeba7","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee5d34cd-3da8-416d-b565-27172a7b4ee1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Location: /v1/accounts/qa-c4f17a0aeba7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a676db2-1e49-44e8-9974-c40b4cacb653","handle":"qa-c4f17a0aeba7","displayName":"QA c4f17a0aeba7","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.701593330Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3b065280-f3c7-4738-98ea-4d684659872c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b065280-f3c7-4738-98ea-4d684659872c
Content-Type: application/json

--- request body ---
{"handle":"qa-0bbd6c4a79d2","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b065280-f3c7-4738-98ea-4d684659872c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7961e8fa-3f62-4b8b-8d63-b7512a7b0b3c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-64b388e4-c141-4a42-96ca-7a52e8fa0472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b388e4-c141-4a42-96ca-7a52e8fa0472
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c4f17a0aeba7","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b388e4-c141-4a42-96ca-7a52e8fa0472
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
Location: /v1/conversations/cnv_cfd17daf-3509-4741-b2ed-d449f73a93c5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cfd17daf-3509-4741-b2ed-d449f73a93c5","subject":"Error contract","status":"open","region":"eu","participants":["qa-0bbd6c4a79d2","qa-c4f17a0aeba7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.766928377Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7a18b411-3fb0-41e8-b531-fdbd86a3d678

--- request headers ---
Accept: application/json
X-Fault-Key: 550efc44-950f-4663-9825-06367b9f415e
X-Fault: unavailable-once
X-Correlation-Id: qa-7a18b411-3fb0-41e8-b531-fdbd86a3d678
Content-Type: application/json

--- request body ---
{"handle":"qa-0bbd6c4a79d2","password":"****"}

--- response: 503 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a18b411-3fb0-41e8-b531-fdbd86a3d678
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-7a18b411-3fb0-41e8-b531-fdbd86a3d678"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5635bf45-3313-4f15-bcf6-acb4b81d34db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5635bf45-3313-4f15-bcf6-acb4b81d34db
Content-Type: application/json

--- request body ---
{"handle":"qa-c4f17a0aeba7","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5635bf45-3313-4f15-bcf6-acb4b81d34db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a676db2-1e49-44e8-9974-c40b4cacb653"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f8f4fcb-f43e-4b6b-8ead-9efa89b03784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f8f4fcb-f43e-4b6b-8ead-9efa89b03784
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f8f4fcb-f43e-4b6b-8ead-9efa89b03784
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
correlation: qa-687aec3b-e50c-4e0c-bf95-d17fa7326794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-687aec3b-e50c-4e0c-bf95-d17fa7326794
Content-Type: application/json

--- request body ---
{"handle":"qa-c4f17a0aeba7","password":"****"}

--- response: 401 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-687aec3b-e50c-4e0c-bf95-d17fa7326794
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-687aec3b-e50c-4e0c-bf95-d17fa7326794"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ff4ea45-9350-46f5-8105-a6dbbbabc667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ff4ea45-9350-46f5-8105-a6dbbbabc667
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ff4ea45-9350-46f5-8105-a6dbbbabc667
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a4419572-504e-4c97-ac7e-0ce59b24c0bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4419572-504e-4c97-ac7e-0ce59b24c0bf
Content-Type: application/json

--- request body ---
{"handle":"qa-0bbd6c4a79d2","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4419572-504e-4c97-ac7e-0ce59b24c0bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4419572-504e-4c97-ac7e-0ce59b24c0bf"}
```
