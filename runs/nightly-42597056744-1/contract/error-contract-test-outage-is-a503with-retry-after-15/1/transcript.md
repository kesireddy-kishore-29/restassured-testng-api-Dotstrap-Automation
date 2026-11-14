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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-295b2d1c-4898-44e3-9133-ef96915cc6d1` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-95724d29-ffc0-4ff7-9879-633c451a2db2` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-41a025a0-ca3d-401d-9c9a-6fb4325e9bb0` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-4af78738-dee6-47a3-9576-5da42bbc07fd` |
| 5 | `POST /v1/credits/purchases` | 503 | 8 | `qa-856c9e65-de3c-4372-b482-f6b57e1ac75c` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-8c219a29-c6c8-40d5-9974-9bac22654d51` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b88bf721-91ce-444f-8c27-e16cdf5fdc8a` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-dca1bfdd-6034-4354-8e09-ea213b226c6c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b9f9f3bf-6725-4423-a3b7-1ade83a06dba` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-bc0a811c-4be3-4ddd-9be6-f89c67f17eb5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-295b2d1c-4898-44e3-9133-ef96915cc6d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-295b2d1c-4898-44e3-9133-ef96915cc6d1
Content-Type: application/json

--- request body ---
{"handle":"qa-8dd495989147","displayName":"QA 8dd495989147","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-295b2d1c-4898-44e3-9133-ef96915cc6d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 8
Location: /v1/accounts/qa-8dd495989147
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a01641d2-ba5a-4d8a-b364-65d6d9df8514","handle":"qa-8dd495989147","displayName":"QA 8dd495989147","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.680573109Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-95724d29-ffc0-4ff7-9879-633c451a2db2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95724d29-ffc0-4ff7-9879-633c451a2db2
Content-Type: application/json

--- request body ---
{"handle":"qa-671701e4d690","displayName":"QA 671701e4d690","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-95724d29-ffc0-4ff7-9879-633c451a2db2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Location: /v1/accounts/qa-671701e4d690
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3050c9c-7596-4bee-8ae1-b1d18d98adf2","handle":"qa-671701e4d690","displayName":"QA 671701e4d690","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.711051234Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-41a025a0-ca3d-401d-9c9a-6fb4325e9bb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41a025a0-ca3d-401d-9c9a-6fb4325e9bb0
Content-Type: application/json

--- request body ---
{"handle":"qa-8dd495989147","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-41a025a0-ca3d-401d-9c9a-6fb4325e9bb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a01641d2-ba5a-4d8a-b364-65d6d9df8514"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4af78738-dee6-47a3-9576-5da42bbc07fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4af78738-dee6-47a3-9576-5da42bbc07fd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-671701e4d690","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4af78738-dee6-47a3-9576-5da42bbc07fd
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
Location: /v1/conversations/cnv_04784b5f-baa5-41af-9d92-aecf84fd6db6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_04784b5f-baa5-41af-9d92-aecf84fd6db6","subject":"Error contract","status":"open","region":"eu","participants":["qa-8dd495989147","qa-671701e4d690"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.780149572Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-856c9e65-de3c-4372-b482-f6b57e1ac75c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
Idempotency-Key: qa-6543d5e8e89f4f30bbfd61e0e7fc0383
X-Fault-Key: 92a8197a-d51c-4750-8b60-c7bddd307d30
X-Correlation-Id: qa-856c9e65-de3c-4372-b482-f6b57e1ac75c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-856c9e65-de3c-4372-b482-f6b57e1ac75c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-856c9e65-de3c-4372-b482-f6b57e1ac75c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8c219a29-c6c8-40d5-9974-9bac22654d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c219a29-c6c8-40d5-9974-9bac22654d51
Content-Type: application/json

--- request body ---
{"handle":"qa-671701e4d690","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c219a29-c6c8-40d5-9974-9bac22654d51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3050c9c-7596-4bee-8ae1-b1d18d98adf2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b88bf721-91ce-444f-8c27-e16cdf5fdc8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b88bf721-91ce-444f-8c27-e16cdf5fdc8a
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b88bf721-91ce-444f-8c27-e16cdf5fdc8a
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
correlation: qa-dca1bfdd-6034-4354-8e09-ea213b226c6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dca1bfdd-6034-4354-8e09-ea213b226c6c
Content-Type: application/json

--- request body ---
{"handle":"qa-671701e4d690","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dca1bfdd-6034-4354-8e09-ea213b226c6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dca1bfdd-6034-4354-8e09-ea213b226c6c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9f9f3bf-6725-4423-a3b7-1ade83a06dba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9f9f3bf-6725-4423-a3b7-1ade83a06dba
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9f9f3bf-6725-4423-a3b7-1ade83a06dba
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
correlation: qa-bc0a811c-4be3-4ddd-9be6-f89c67f17eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc0a811c-4be3-4ddd-9be6-f89c67f17eb5
Content-Type: application/json

--- request body ---
{"handle":"qa-8dd495989147","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc0a811c-4be3-4ddd-9be6-f89c67f17eb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc0a811c-4be3-4ddd-9be6-f89c67f17eb5"}
```
