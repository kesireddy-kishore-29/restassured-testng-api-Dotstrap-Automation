# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-d61a76d4-cce2-40c4-bbf5-840dd196a263` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-ef135ece-a3e9-422d-819a-380e99d0c52f` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-3c5e96c2-50ce-47fd-bab7-08ac521244b0` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-d35cd86f-295f-4226-bc74-5b48b0c5fcdc` |
| 5 | `GET /v1/credits/ledger` | 503 | 7 | `qa-51032e96-7fa6-40c5-b6c6-b1e06a56b879` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-8b8e8278-0ed2-4268-bc6a-891f5433fb5b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-d3c7b31e-941d-4001-8091-04ea0e5d923e` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-bb4b6e6c-daa5-4fd3-b5b9-629fcf7ac73c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-30143c0f-9d84-48f4-a62e-d7840fb642fc` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-03c63a6b-e44c-4f7b-83de-04197bd93303` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d61a76d4-cce2-40c4-bbf5-840dd196a263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d61a76d4-cce2-40c4-bbf5-840dd196a263
Content-Type: application/json

--- request body ---
{"handle":"qa-7bbf7f2a6687","displayName":"QA 7bbf7f2a6687","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d61a76d4-cce2-40c4-bbf5-840dd196a263
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Location: /v1/accounts/qa-7bbf7f2a6687
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5dd0a78-6bd9-4032-a212-c7bc043b6c61","handle":"qa-7bbf7f2a6687","displayName":"QA 7bbf7f2a6687","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.149268737Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ef135ece-a3e9-422d-819a-380e99d0c52f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef135ece-a3e9-422d-819a-380e99d0c52f
Content-Type: application/json

--- request body ---
{"handle":"qa-c8ae7fd592c3","displayName":"QA c8ae7fd592c3","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef135ece-a3e9-422d-819a-380e99d0c52f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Location: /v1/accounts/qa-c8ae7fd592c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27807aed-0e9d-4110-b5b8-b534a7e4691b","handle":"qa-c8ae7fd592c3","displayName":"QA c8ae7fd592c3","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.194075618Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3c5e96c2-50ce-47fd-bab7-08ac521244b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c5e96c2-50ce-47fd-bab7-08ac521244b0
Content-Type: application/json

--- request body ---
{"handle":"qa-7bbf7f2a6687","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c5e96c2-50ce-47fd-bab7-08ac521244b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5dd0a78-6bd9-4032-a212-c7bc043b6c61"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d35cd86f-295f-4226-bc74-5b48b0c5fcdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d35cd86f-295f-4226-bc74-5b48b0c5fcdc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c8ae7fd592c3","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d35cd86f-295f-4226-bc74-5b48b0c5fcdc
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
Location: /v1/conversations/cnv_e3bef9ad-5cf3-46d9-845d-dffb94bacdea
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e3bef9ad-5cf3-46d9-845d-dffb94bacdea","subject":"Error contract","status":"open","region":"eu","participants":["qa-7bbf7f2a6687","qa-c8ae7fd592c3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.236238630Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-51032e96-7fa6-40c5-b6c6-b1e06a56b879

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9ab1a8ea-dd69-4a38-9914-4062f49fd1e6
X-Correlation-Id: qa-51032e96-7fa6-40c5-b6c6-b1e06a56b879
Content-Type: application/json

--- response: 503 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51032e96-7fa6-40c5-b6c6-b1e06a56b879
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-51032e96-7fa6-40c5-b6c6-b1e06a56b879"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8b8e8278-0ed2-4268-bc6a-891f5433fb5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b8e8278-0ed2-4268-bc6a-891f5433fb5b
Content-Type: application/json

--- request body ---
{"handle":"qa-c8ae7fd592c3","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b8e8278-0ed2-4268-bc6a-891f5433fb5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27807aed-0e9d-4110-b5b8-b534a7e4691b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3c7b31e-941d-4001-8091-04ea0e5d923e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3c7b31e-941d-4001-8091-04ea0e5d923e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3c7b31e-941d-4001-8091-04ea0e5d923e
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
correlation: qa-bb4b6e6c-daa5-4fd3-b5b9-629fcf7ac73c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb4b6e6c-daa5-4fd3-b5b9-629fcf7ac73c
Content-Type: application/json

--- request body ---
{"handle":"qa-c8ae7fd592c3","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb4b6e6c-daa5-4fd3-b5b9-629fcf7ac73c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb4b6e6c-daa5-4fd3-b5b9-629fcf7ac73c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30143c0f-9d84-48f4-a62e-d7840fb642fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30143c0f-9d84-48f4-a62e-d7840fb642fc
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30143c0f-9d84-48f4-a62e-d7840fb642fc
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
correlation: qa-03c63a6b-e44c-4f7b-83de-04197bd93303

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03c63a6b-e44c-4f7b-83de-04197bd93303
Content-Type: application/json

--- request body ---
{"handle":"qa-7bbf7f2a6687","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03c63a6b-e44c-4f7b-83de-04197bd93303
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03c63a6b-e44c-4f7b-83de-04197bd93303"}
```
