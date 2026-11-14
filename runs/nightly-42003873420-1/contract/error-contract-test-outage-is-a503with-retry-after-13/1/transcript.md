# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-aa2a7594-c85b-431a-937b-c0fa0036b7fb` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-fdc73c6e-336c-4734-8d96-a0e540c5fb17` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-4dbcc4fb-31fc-4683-be38-c04612daa517` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-cf8e93c6-e083-489b-9cdd-889edb73af39` |
| 5 | `GET /v1/credits/balance` | 503 | 36 | `qa-74af5a90-999e-4ae6-a726-e36562948ee0` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-bee3ec21-4bc0-4f58-9df8-43ef1d00a5fb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e53e777d-d44f-4a00-a104-71ca46bb20bc` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-38ed06ac-923e-4f84-a454-b682465f0786` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-f6fab01f-e2d0-477f-ab73-405d81c28772` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-5133084c-f784-4e60-a9a8-94f8b895a664` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa2a7594-c85b-431a-937b-c0fa0036b7fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa2a7594-c85b-431a-937b-c0fa0036b7fb
Content-Type: application/json

--- request body ---
{"handle":"qa-411855394ac7","displayName":"QA 411855394ac7","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa2a7594-c85b-431a-937b-c0fa0036b7fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 6
Location: /v1/accounts/qa-411855394ac7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d46e5dd4-2d94-4050-8208-f6bedaeabae6","handle":"qa-411855394ac7","displayName":"QA 411855394ac7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.646043666Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fdc73c6e-336c-4734-8d96-a0e540c5fb17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdc73c6e-336c-4734-8d96-a0e540c5fb17
Content-Type: application/json

--- request body ---
{"handle":"qa-d3982f2acbc1","displayName":"QA d3982f2acbc1","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdc73c6e-336c-4734-8d96-a0e540c5fb17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Location: /v1/accounts/qa-d3982f2acbc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_97dfc984-97cb-4ded-9079-a11d1d51c6e1","handle":"qa-d3982f2acbc1","displayName":"QA d3982f2acbc1","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.687808424Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4dbcc4fb-31fc-4683-be38-c04612daa517

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dbcc4fb-31fc-4683-be38-c04612daa517
Content-Type: application/json

--- request body ---
{"handle":"qa-411855394ac7","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dbcc4fb-31fc-4683-be38-c04612daa517
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d46e5dd4-2d94-4050-8208-f6bedaeabae6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cf8e93c6-e083-489b-9cdd-889edb73af39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf8e93c6-e083-489b-9cdd-889edb73af39
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d3982f2acbc1","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf8e93c6-e083-489b-9cdd-889edb73af39
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
Location: /v1/conversations/cnv_a120f2b3-aed4-4f67-b973-ba00e2389cae
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a120f2b3-aed4-4f67-b973-ba00e2389cae","subject":"Error contract","status":"open","region":"eu","participants":["qa-411855394ac7","qa-d3982f2acbc1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.762357391Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-74af5a90-999e-4ae6-a726-e36562948ee0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0fd45df1-c785-4593-9c62-1e9fee87e7c0
X-Correlation-Id: qa-74af5a90-999e-4ae6-a726-e36562948ee0
Content-Type: application/json

--- response: 503 in 36 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74af5a90-999e-4ae6-a726-e36562948ee0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-74af5a90-999e-4ae6-a726-e36562948ee0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bee3ec21-4bc0-4f58-9df8-43ef1d00a5fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bee3ec21-4bc0-4f58-9df8-43ef1d00a5fb
Content-Type: application/json

--- request body ---
{"handle":"qa-d3982f2acbc1","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-bee3ec21-4bc0-4f58-9df8-43ef1d00a5fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_97dfc984-97cb-4ded-9079-a11d1d51c6e1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e53e777d-d44f-4a00-a104-71ca46bb20bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e53e777d-d44f-4a00-a104-71ca46bb20bc
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e53e777d-d44f-4a00-a104-71ca46bb20bc
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
correlation: qa-38ed06ac-923e-4f84-a454-b682465f0786

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38ed06ac-923e-4f84-a454-b682465f0786
Content-Type: application/json

--- request body ---
{"handle":"qa-d3982f2acbc1","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38ed06ac-923e-4f84-a454-b682465f0786
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38ed06ac-923e-4f84-a454-b682465f0786"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f6fab01f-e2d0-477f-ab73-405d81c28772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6fab01f-e2d0-477f-ab73-405d81c28772
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f6fab01f-e2d0-477f-ab73-405d81c28772
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
correlation: qa-5133084c-f784-4e60-a9a8-94f8b895a664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5133084c-f784-4e60-a9a8-94f8b895a664
Content-Type: application/json

--- request body ---
{"handle":"qa-411855394ac7","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5133084c-f784-4e60-a9a8-94f8b895a664
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5133084c-f784-4e60-a9a8-94f8b895a664"}
```
