# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 547 | `qa-35c7d1e2-2f5a-410a-8662-1cd43fa7c028` |
| 2 | `POST /v1/accounts` | 201 | 81 | `qa-e411dabb-a4a3-47e8-9f9c-a6dfa7ffc62b` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-6ea17e9a-080b-4a2e-8fa7-9e76ccb91805` |
| 4 | `POST /v1/conversations` | 201 | 89 | `qa-920929e9-9d2a-4fec-8be0-821337dad16e` |
| 5 | `PATCH /v1/accounts/me` | 503 | 26 | `qa-c8bc9628-32fd-4c93-9a74-c4bdaa3ad73d` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-ef79611c-3099-4761-94d4-d313bd1da69c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-1e100f99-730c-472c-8d98-72bf8be67341` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-0eccda3d-7c30-49f7-9492-ab59c178d818` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-8c7f22ba-fc55-4d4b-b52a-e7e7eb7e666e` |
| 10 | `POST /v1/auth/token` | 401 | 31 | `qa-515aecb1-6925-48e5-8b30-23a89d7e4c6e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-35c7d1e2-2f5a-410a-8662-1cd43fa7c028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c7d1e2-2f5a-410a-8662-1cd43fa7c028
Content-Type: application/json

--- request body ---
{"handle":"qa-055cd66e6a66","displayName":"QA 055cd66e6a66","password":"****","region":"eu"}

--- response: 201 in 547 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-35c7d1e2-2f5a-410a-8662-1cd43fa7c028
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Location: /v1/accounts/qa-055cd66e6a66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1aa0197a-e010-4127-bec4-e0db7418d95f","handle":"qa-055cd66e6a66","displayName":"QA 055cd66e6a66","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.698051765Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e411dabb-a4a3-47e8-9f9c-a6dfa7ffc62b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e411dabb-a4a3-47e8-9f9c-a6dfa7ffc62b
Content-Type: application/json

--- request body ---
{"handle":"qa-1d3da9f64c61","displayName":"QA 1d3da9f64c61","password":"****","region":"eu"}

--- response: 201 in 81 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e411dabb-a4a3-47e8-9f9c-a6dfa7ffc62b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-1d3da9f64c61
X-Served-Region: eu
Content-Length: 178

{"id":"acc_8d3fef17-702d-4b81-ad4d-fcfe47e9b273","handle":"qa-1d3da9f64c61","displayName":"QA 1d3da9f64c61","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.327632Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6ea17e9a-080b-4a2e-8fa7-9e76ccb91805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ea17e9a-080b-4a2e-8fa7-9e76ccb91805
Content-Type: application/json

--- request body ---
{"handle":"qa-055cd66e6a66","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ea17e9a-080b-4a2e-8fa7-9e76ccb91805
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aa0197a-e010-4127-bec4-e0db7418d95f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-920929e9-9d2a-4fec-8be0-821337dad16e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-920929e9-9d2a-4fec-8be0-821337dad16e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1d3da9f64c61","subject":"Error contract","message":"Hi"}

--- response: 201 in 89 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-920929e9-9d2a-4fec-8be0-821337dad16e
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
Location: /v1/conversations/cnv_0c54f702-bae1-41dc-8e51-4437e4e359ab
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0c54f702-bae1-41dc-8e51-4437e4e359ab","subject":"Error contract","status":"open","region":"eu","participants":["qa-055cd66e6a66","qa-1d3da9f64c61"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.559688667Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-c8bc9628-32fd-4c93-9a74-c4bdaa3ad73d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 51ed534a-3f55-4d17-bf2c-082cd7ebadd5
X-Correlation-Id: qa-c8bc9628-32fd-4c93-9a74-c4bdaa3ad73d
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8bc9628-32fd-4c93-9a74-c4bdaa3ad73d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-c8bc9628-32fd-4c93-9a74-c4bdaa3ad73d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ef79611c-3099-4761-94d4-d313bd1da69c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef79611c-3099-4761-94d4-d313bd1da69c
Content-Type: application/json

--- request body ---
{"handle":"qa-1d3da9f64c61","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef79611c-3099-4761-94d4-d313bd1da69c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d3fef17-702d-4b81-ad4d-fcfe47e9b273"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e100f99-730c-472c-8d98-72bf8be67341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e100f99-730c-472c-8d98-72bf8be67341
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e100f99-730c-472c-8d98-72bf8be67341
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
correlation: qa-0eccda3d-7c30-49f7-9492-ab59c178d818

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eccda3d-7c30-49f7-9492-ab59c178d818
Content-Type: application/json

--- request body ---
{"handle":"qa-1d3da9f64c61","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0eccda3d-7c30-49f7-9492-ab59c178d818
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0eccda3d-7c30-49f7-9492-ab59c178d818"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c7f22ba-fc55-4d4b-b52a-e7e7eb7e666e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c7f22ba-fc55-4d4b-b52a-e7e7eb7e666e
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c7f22ba-fc55-4d4b-b52a-e7e7eb7e666e
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
correlation: qa-515aecb1-6925-48e5-8b30-23a89d7e4c6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-515aecb1-6925-48e5-8b30-23a89d7e4c6e
Content-Type: application/json

--- request body ---
{"handle":"qa-055cd66e6a66","password":"****"}

--- response: 401 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-515aecb1-6925-48e5-8b30-23a89d7e4c6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-515aecb1-6925-48e5-8b30-23a89d7e4c6e"}
```
