# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-c87b3065-053d-4f10-a0d4-4d26673ec572` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-7b399dfa-4b61-46c9-a9f4-3ce4f1882659` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-8b4fd851-fd6d-47f0-8c15-c96cfdc4cfdf` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-37210b99-9938-489f-a0d8-2501b0a11a27` |
| 5 | `DELETE /v1/accounts/me` | 503 | 27 | `qa-b6179882-19d9-49e9-a17f-632cf89f7c3d` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-dcaa2d25-feb4-4c97-a4b2-a5eadd014bf4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-fd711b9f-3d2d-4e0f-93c7-7b70e2d9cf77` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-5e7d9abc-462a-4799-9324-304c53133b6e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-f1cd8850-d505-4121-b540-3a5730a728cc` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-b675757b-1976-4df3-a81b-f2ed67b3ce7e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c87b3065-053d-4f10-a0d4-4d26673ec572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c87b3065-053d-4f10-a0d4-4d26673ec572
Content-Type: application/json

--- request body ---
{"handle":"qa-c40eed75b4e2","displayName":"QA c40eed75b4e2","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-c87b3065-053d-4f10-a0d4-4d26673ec572
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 9
Location: /v1/accounts/qa-c40eed75b4e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e3c80e98-a133-4e6f-aa12-f13a3d550981","handle":"qa-c40eed75b4e2","displayName":"QA c40eed75b4e2","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.328573435Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7b399dfa-4b61-46c9-a9f4-3ce4f1882659

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b399dfa-4b61-46c9-a9f4-3ce4f1882659
Content-Type: application/json

--- request body ---
{"handle":"qa-3d2f2a27e978","displayName":"QA 3d2f2a27e978","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b399dfa-4b61-46c9-a9f4-3ce4f1882659
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 9
Location: /v1/accounts/qa-3d2f2a27e978
X-Served-Region: eu
Content-Length: 181

{"id":"acc_84c63188-f4d7-472a-854c-06cfe4765ad7","handle":"qa-3d2f2a27e978","displayName":"QA 3d2f2a27e978","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.377733063Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8b4fd851-fd6d-47f0-8c15-c96cfdc4cfdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4fd851-fd6d-47f0-8c15-c96cfdc4cfdf
Content-Type: application/json

--- request body ---
{"handle":"qa-c40eed75b4e2","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b4fd851-fd6d-47f0-8c15-c96cfdc4cfdf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3c80e98-a133-4e6f-aa12-f13a3d550981"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-37210b99-9938-489f-a0d8-2501b0a11a27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37210b99-9938-489f-a0d8-2501b0a11a27
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3d2f2a27e978","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-37210b99-9938-489f-a0d8-2501b0a11a27
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
Location: /v1/conversations/cnv_5014eecf-dc24-45ae-8f88-8d9ad5f0e80a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5014eecf-dc24-45ae-8f88-8d9ad5f0e80a","subject":"Error contract","status":"open","region":"eu","participants":["qa-c40eed75b4e2","qa-3d2f2a27e978"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.428563657Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6179882-19d9-49e9-a17f-632cf89f7c3d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0f88365a-a4bb-42d8-9638-142ab4a4b0d0
X-Correlation-Id: qa-b6179882-19d9-49e9-a17f-632cf89f7c3d
Content-Type: application/json

--- response: 503 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6179882-19d9-49e9-a17f-632cf89f7c3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b6179882-19d9-49e9-a17f-632cf89f7c3d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dcaa2d25-feb4-4c97-a4b2-a5eadd014bf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcaa2d25-feb4-4c97-a4b2-a5eadd014bf4
Content-Type: application/json

--- request body ---
{"handle":"qa-3d2f2a27e978","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcaa2d25-feb4-4c97-a4b2-a5eadd014bf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_84c63188-f4d7-472a-854c-06cfe4765ad7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd711b9f-3d2d-4e0f-93c7-7b70e2d9cf77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd711b9f-3d2d-4e0f-93c7-7b70e2d9cf77
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd711b9f-3d2d-4e0f-93c7-7b70e2d9cf77
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
correlation: qa-5e7d9abc-462a-4799-9324-304c53133b6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e7d9abc-462a-4799-9324-304c53133b6e
Content-Type: application/json

--- request body ---
{"handle":"qa-3d2f2a27e978","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e7d9abc-462a-4799-9324-304c53133b6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5e7d9abc-462a-4799-9324-304c53133b6e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1cd8850-d505-4121-b540-3a5730a728cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1cd8850-d505-4121-b540-3a5730a728cc
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1cd8850-d505-4121-b540-3a5730a728cc
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
correlation: qa-b675757b-1976-4df3-a81b-f2ed67b3ce7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b675757b-1976-4df3-a81b-f2ed67b3ce7e
Content-Type: application/json

--- request body ---
{"handle":"qa-c40eed75b4e2","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b675757b-1976-4df3-a81b-f2ed67b3ce7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b675757b-1976-4df3-a81b-f2ed67b3ce7e"}
```
