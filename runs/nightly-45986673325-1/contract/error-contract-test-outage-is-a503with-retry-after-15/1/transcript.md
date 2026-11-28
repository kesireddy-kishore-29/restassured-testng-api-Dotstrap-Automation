# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-2aa2fcee-601f-4cc0-a8ef-f5032780eb64` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-9ad87743-c25b-47dc-ba9e-65f0d135ed6a` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-912880b6-919d-43a4-97ed-0c0746ad8004` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-927a1429-11c9-4fa2-8e7e-8c46c6d8a82d` |
| 5 | `POST /v1/credits/purchases` | 503 | 25 | `qa-708528ce-3510-4a22-b855-1515604f74a0` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-2ca5faa1-9152-4f6c-a8f0-5c0f35fce334` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-67885b9f-d142-4ade-9a9d-7bbb034f0685` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-2b9864dc-723d-49a4-994e-7254f65543e8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c1c843b9-7a38-4137-8ec6-d58ec00433d1` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-8d9fb48b-1600-4427-ab5e-70629cd39037` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2aa2fcee-601f-4cc0-a8ef-f5032780eb64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aa2fcee-601f-4cc0-a8ef-f5032780eb64
Content-Type: application/json

--- request body ---
{"handle":"qa-d1e1e9dcb414","displayName":"QA d1e1e9dcb414","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aa2fcee-601f-4cc0-a8ef-f5032780eb64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Location: /v1/accounts/qa-d1e1e9dcb414
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9e25907-6637-4e7e-b269-34da55a52bc4","handle":"qa-d1e1e9dcb414","displayName":"QA d1e1e9dcb414","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.776060557Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9ad87743-c25b-47dc-ba9e-65f0d135ed6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ad87743-c25b-47dc-ba9e-65f0d135ed6a
Content-Type: application/json

--- request body ---
{"handle":"qa-2c87b9a87294","displayName":"QA 2c87b9a87294","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ad87743-c25b-47dc-ba9e-65f0d135ed6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Location: /v1/accounts/qa-2c87b9a87294
X-Served-Region: eu
Content-Length: 181

{"id":"acc_848409a7-1d4d-4505-849f-7608f91220f1","handle":"qa-2c87b9a87294","displayName":"QA 2c87b9a87294","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.823669203Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-912880b6-919d-43a4-97ed-0c0746ad8004

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-912880b6-919d-43a4-97ed-0c0746ad8004
Content-Type: application/json

--- request body ---
{"handle":"qa-d1e1e9dcb414","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-912880b6-919d-43a4-97ed-0c0746ad8004
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9e25907-6637-4e7e-b269-34da55a52bc4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-927a1429-11c9-4fa2-8e7e-8c46c6d8a82d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-927a1429-11c9-4fa2-8e7e-8c46c6d8a82d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2c87b9a87294","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-927a1429-11c9-4fa2-8e7e-8c46c6d8a82d
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
Location: /v1/conversations/cnv_803a19d4-eacf-477d-be5a-5f9c88e74efc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_803a19d4-eacf-477d-be5a-5f9c88e74efc","subject":"Error contract","status":"open","region":"eu","participants":["qa-d1e1e9dcb414","qa-2c87b9a87294"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.939174940Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-708528ce-3510-4a22-b855-1515604f74a0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ce74270a3500478cb8afd0511c710bae
X-Fault-Key: 940238fc-72aa-42a5-930f-61a00dbe71c2
X-Fault: unavailable-once
X-Correlation-Id: qa-708528ce-3510-4a22-b855-1515604f74a0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-708528ce-3510-4a22-b855-1515604f74a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-708528ce-3510-4a22-b855-1515604f74a0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2ca5faa1-9152-4f6c-a8f0-5c0f35fce334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ca5faa1-9152-4f6c-a8f0-5c0f35fce334
Content-Type: application/json

--- request body ---
{"handle":"qa-2c87b9a87294","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ca5faa1-9152-4f6c-a8f0-5c0f35fce334
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_848409a7-1d4d-4505-849f-7608f91220f1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-67885b9f-d142-4ade-9a9d-7bbb034f0685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67885b9f-d142-4ade-9a9d-7bbb034f0685
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-67885b9f-d142-4ade-9a9d-7bbb034f0685
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
correlation: qa-2b9864dc-723d-49a4-994e-7254f65543e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b9864dc-723d-49a4-994e-7254f65543e8
Content-Type: application/json

--- request body ---
{"handle":"qa-2c87b9a87294","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b9864dc-723d-49a4-994e-7254f65543e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b9864dc-723d-49a4-994e-7254f65543e8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1c843b9-7a38-4137-8ec6-d58ec00433d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1c843b9-7a38-4137-8ec6-d58ec00433d1
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1c843b9-7a38-4137-8ec6-d58ec00433d1
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
correlation: qa-8d9fb48b-1600-4427-ab5e-70629cd39037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d9fb48b-1600-4427-ab5e-70629cd39037
Content-Type: application/json

--- request body ---
{"handle":"qa-d1e1e9dcb414","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d9fb48b-1600-4427-ab5e-70629cd39037
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d9fb48b-1600-4427-ab5e-70629cd39037"}
```
