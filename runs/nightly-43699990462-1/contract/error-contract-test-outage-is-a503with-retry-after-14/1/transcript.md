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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-5542ca01-3623-4033-8970-80524db31e08` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-14e69177-174a-4b84-86bd-d87c681b372f` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-31559530-1909-47fb-82db-9e9c03644be0` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-9c0849af-2070-43e7-bd9a-9fa8e89cac4e` |
| 5 | `GET /v1/credits/ledger` | 503 | 20 | `qa-d8bc153b-2c9a-435c-94ac-87b2aceaf7d0` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-875de9a4-c307-4e1e-b502-89b61551f3bb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-afb303d6-b2ff-4c79-8624-96a71884c34b` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-2a8b2145-d5e4-49ab-88a0-98f8468009aa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6fa2ff34-c1ca-4741-a026-5cd0f7167acd` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-0e4321a6-d408-486e-b178-69e6a38337a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5542ca01-3623-4033-8970-80524db31e08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5542ca01-3623-4033-8970-80524db31e08
Content-Type: application/json

--- request body ---
{"handle":"qa-03d116bf8e16","displayName":"QA 03d116bf8e16","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5542ca01-3623-4033-8970-80524db31e08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Location: /v1/accounts/qa-03d116bf8e16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d7f9e7b-c09a-4e0a-95d3-f70cb38a46e2","handle":"qa-03d116bf8e16","displayName":"QA 03d116bf8e16","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.226268741Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-14e69177-174a-4b84-86bd-d87c681b372f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14e69177-174a-4b84-86bd-d87c681b372f
Content-Type: application/json

--- request body ---
{"handle":"qa-ada18f3c7867","displayName":"QA ada18f3c7867","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-14e69177-174a-4b84-86bd-d87c681b372f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Location: /v1/accounts/qa-ada18f3c7867
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f71d71af-5cfe-4ceb-b4e2-beb4b40c3157","handle":"qa-ada18f3c7867","displayName":"QA ada18f3c7867","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.259046539Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-31559530-1909-47fb-82db-9e9c03644be0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31559530-1909-47fb-82db-9e9c03644be0
Content-Type: application/json

--- request body ---
{"handle":"qa-03d116bf8e16","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-31559530-1909-47fb-82db-9e9c03644be0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d7f9e7b-c09a-4e0a-95d3-f70cb38a46e2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9c0849af-2070-43e7-bd9a-9fa8e89cac4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c0849af-2070-43e7-bd9a-9fa8e89cac4e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ada18f3c7867","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c0849af-2070-43e7-bd9a-9fa8e89cac4e
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
Location: /v1/conversations/cnv_be9d1e5d-ac20-4d54-b517-78ae57c41f7d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_be9d1e5d-ac20-4d54-b517-78ae57c41f7d","subject":"Error contract","status":"open","region":"eu","participants":["qa-03d116bf8e16","qa-ada18f3c7867"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.324677039Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d8bc153b-2c9a-435c-94ac-87b2aceaf7d0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9abc145d-a4b0-4ad4-a36f-03b8ed8850bf
X-Correlation-Id: qa-d8bc153b-2c9a-435c-94ac-87b2aceaf7d0
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8bc153b-2c9a-435c-94ac-87b2aceaf7d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-d8bc153b-2c9a-435c-94ac-87b2aceaf7d0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-875de9a4-c307-4e1e-b502-89b61551f3bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-875de9a4-c307-4e1e-b502-89b61551f3bb
Content-Type: application/json

--- request body ---
{"handle":"qa-ada18f3c7867","password":"****"}

--- response: 200 in 47 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-875de9a4-c307-4e1e-b502-89b61551f3bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f71d71af-5cfe-4ceb-b4e2-beb4b40c3157"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afb303d6-b2ff-4c79-8624-96a71884c34b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afb303d6-b2ff-4c79-8624-96a71884c34b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afb303d6-b2ff-4c79-8624-96a71884c34b
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
correlation: qa-2a8b2145-d5e4-49ab-88a0-98f8468009aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a8b2145-d5e4-49ab-88a0-98f8468009aa
Content-Type: application/json

--- request body ---
{"handle":"qa-ada18f3c7867","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a8b2145-d5e4-49ab-88a0-98f8468009aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2a8b2145-d5e4-49ab-88a0-98f8468009aa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fa2ff34-c1ca-4741-a026-5cd0f7167acd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fa2ff34-c1ca-4741-a026-5cd0f7167acd
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6fa2ff34-c1ca-4741-a026-5cd0f7167acd
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
correlation: qa-0e4321a6-d408-486e-b178-69e6a38337a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e4321a6-d408-486e-b178-69e6a38337a3
Content-Type: application/json

--- request body ---
{"handle":"qa-03d116bf8e16","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e4321a6-d408-486e-b178-69e6a38337a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e4321a6-d408-486e-b178-69e6a38337a3"}
```
