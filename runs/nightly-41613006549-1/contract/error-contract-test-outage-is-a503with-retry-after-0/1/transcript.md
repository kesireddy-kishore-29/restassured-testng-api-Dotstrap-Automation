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
| 1 | `POST /v1/accounts` | 201 | 386 | `qa-9ca4a7bb-5c78-4baa-87c6-536a064cdb14` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-3f70f2d3-549e-4e75-9982-42642d32150b` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-2c23e696-0a34-4867-bba4-24442487c858` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-59e73853-7e0d-4a4c-a29f-519ee3e8d1ac` |
| 5 | `POST /v1/auth/token` | 503 | 22 | `qa-02b4759d-1c07-4209-8ea3-33b7f95cc192` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-b01a05ef-c87a-4256-bf65-c12c428f905d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-4ae71722-62d2-45a3-94d8-1dcd242c58bf` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-0f11028b-5e16-4c97-baa0-53ade9b6a060` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-f60bd8bb-e2ff-486f-9bed-95df38266dd7` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-a7a5e563-34ed-46ab-b0aa-48e3faa5d14e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ca4a7bb-5c78-4baa-87c6-536a064cdb14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ca4a7bb-5c78-4baa-87c6-536a064cdb14
Content-Type: application/json

--- request body ---
{"handle":"qa-229f607c3d78","displayName":"QA 229f607c3d78","password":"****","region":"eu"}

--- response: 201 in 386 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ca4a7bb-5c78-4baa-87c6-536a064cdb14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-229f607c3d78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac14087d-78f7-4958-b7ff-04e5bb0a40c2","handle":"qa-229f607c3d78","displayName":"QA 229f607c3d78","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.883894589Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3f70f2d3-549e-4e75-9982-42642d32150b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f70f2d3-549e-4e75-9982-42642d32150b
Content-Type: application/json

--- request body ---
{"handle":"qa-f4c8110bb9f5","displayName":"QA f4c8110bb9f5","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f70f2d3-549e-4e75-9982-42642d32150b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-f4c8110bb9f5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1509ffc-4cc2-424c-b33f-59da8b982eb7","handle":"qa-f4c8110bb9f5","displayName":"QA f4c8110bb9f5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.233111871Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2c23e696-0a34-4867-bba4-24442487c858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c23e696-0a34-4867-bba4-24442487c858
Content-Type: application/json

--- request body ---
{"handle":"qa-229f607c3d78","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c23e696-0a34-4867-bba4-24442487c858
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac14087d-78f7-4958-b7ff-04e5bb0a40c2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-59e73853-7e0d-4a4c-a29f-519ee3e8d1ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59e73853-7e0d-4a4c-a29f-519ee3e8d1ac
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f4c8110bb9f5","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-59e73853-7e0d-4a4c-a29f-519ee3e8d1ac
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
Location: /v1/conversations/cnv_c80665c6-54c4-4795-8cf5-42c331ac6a18
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c80665c6-54c4-4795-8cf5-42c331ac6a18","subject":"Error contract","status":"open","region":"eu","participants":["qa-229f607c3d78","qa-f4c8110bb9f5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.402358273Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-02b4759d-1c07-4209-8ea3-33b7f95cc192

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 12a9ffd4-f84f-4487-a015-d3aa529ef731
X-Correlation-Id: qa-02b4759d-1c07-4209-8ea3-33b7f95cc192
Content-Type: application/json

--- request body ---
{"handle":"qa-229f607c3d78","password":"****"}

--- response: 503 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02b4759d-1c07-4209-8ea3-33b7f95cc192
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-02b4759d-1c07-4209-8ea3-33b7f95cc192"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b01a05ef-c87a-4256-bf65-c12c428f905d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b01a05ef-c87a-4256-bf65-c12c428f905d
Content-Type: application/json

--- request body ---
{"handle":"qa-f4c8110bb9f5","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b01a05ef-c87a-4256-bf65-c12c428f905d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1509ffc-4cc2-424c-b33f-59da8b982eb7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ae71722-62d2-45a3-94d8-1dcd242c58bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ae71722-62d2-45a3-94d8-1dcd242c58bf
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ae71722-62d2-45a3-94d8-1dcd242c58bf
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
correlation: qa-0f11028b-5e16-4c97-baa0-53ade9b6a060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f11028b-5e16-4c97-baa0-53ade9b6a060
Content-Type: application/json

--- request body ---
{"handle":"qa-f4c8110bb9f5","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f11028b-5e16-4c97-baa0-53ade9b6a060
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f11028b-5e16-4c97-baa0-53ade9b6a060"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f60bd8bb-e2ff-486f-9bed-95df38266dd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f60bd8bb-e2ff-486f-9bed-95df38266dd7
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f60bd8bb-e2ff-486f-9bed-95df38266dd7
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
correlation: qa-a7a5e563-34ed-46ab-b0aa-48e3faa5d14e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7a5e563-34ed-46ab-b0aa-48e3faa5d14e
Content-Type: application/json

--- request body ---
{"handle":"qa-229f607c3d78","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7a5e563-34ed-46ab-b0aa-48e3faa5d14e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a7a5e563-34ed-46ab-b0aa-48e3faa5d14e"}
```
