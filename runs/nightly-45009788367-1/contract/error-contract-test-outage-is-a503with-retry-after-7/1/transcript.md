# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-817a1c6b-396a-4b68-8556-62fc0d36c627` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-bdc68b89-d9b1-4d7c-a13b-d28f5f8b9d0e` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-2fad5ba5-72e8-4160-98cc-6da9737e4354` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-04565b80-c006-4088-a148-640fe8387f55` |
| 5 | `GET /v1/conversations` | 503 | 16 | `qa-8f1e2191-1d68-4c91-90ea-d03dcea08528` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-32976ca8-55fa-4f58-b436-d360267da930` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-c14362c9-2b8b-4895-8399-3cca900f70ed` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-c7aacac4-7c8f-4040-a4bf-5fd8dfa49107` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-83acb90d-699c-4154-9674-890c2f7d6d5e` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-57e0bc7e-c8a0-432c-ab28-f1eed130d2ef` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-817a1c6b-396a-4b68-8556-62fc0d36c627

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-817a1c6b-396a-4b68-8556-62fc0d36c627
Content-Type: application/json

--- request body ---
{"handle":"qa-06ac0a28cc3e","displayName":"QA 06ac0a28cc3e","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-817a1c6b-396a-4b68-8556-62fc0d36c627
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 9
Location: /v1/accounts/qa-06ac0a28cc3e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f3b3d32-463c-4a70-b7b1-84ea7c12f050","handle":"qa-06ac0a28cc3e","displayName":"QA 06ac0a28cc3e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.353349771Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bdc68b89-d9b1-4d7c-a13b-d28f5f8b9d0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdc68b89-d9b1-4d7c-a13b-d28f5f8b9d0e
Content-Type: application/json

--- request body ---
{"handle":"qa-cc14801d6fcf","displayName":"QA cc14801d6fcf","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdc68b89-d9b1-4d7c-a13b-d28f5f8b9d0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 9
Location: /v1/accounts/qa-cc14801d6fcf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c4a2be24-7690-4967-8b70-2b476e0e6baa","handle":"qa-cc14801d6fcf","displayName":"QA cc14801d6fcf","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.378643500Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2fad5ba5-72e8-4160-98cc-6da9737e4354

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fad5ba5-72e8-4160-98cc-6da9737e4354
Content-Type: application/json

--- request body ---
{"handle":"qa-06ac0a28cc3e","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fad5ba5-72e8-4160-98cc-6da9737e4354
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f3b3d32-463c-4a70-b7b1-84ea7c12f050"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-04565b80-c006-4088-a148-640fe8387f55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04565b80-c006-4088-a148-640fe8387f55
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cc14801d6fcf","subject":"Error contract","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-04565b80-c006-4088-a148-640fe8387f55
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
Location: /v1/conversations/cnv_ac835d2f-2c35-47ae-a9a8-6bc6123c8e11
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ac835d2f-2c35-47ae-a9a8-6bc6123c8e11","subject":"Error contract","status":"open","region":"eu","participants":["qa-06ac0a28cc3e","qa-cc14801d6fcf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.467885175Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-8f1e2191-1d68-4c91-90ea-d03dcea08528

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d2a907d3-2ac4-49a8-9f06-eee62531c6d5
X-Correlation-Id: qa-8f1e2191-1d68-4c91-90ea-d03dcea08528
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f1e2191-1d68-4c91-90ea-d03dcea08528
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-8f1e2191-1d68-4c91-90ea-d03dcea08528"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-32976ca8-55fa-4f58-b436-d360267da930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32976ca8-55fa-4f58-b436-d360267da930
Content-Type: application/json

--- request body ---
{"handle":"qa-cc14801d6fcf","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-32976ca8-55fa-4f58-b436-d360267da930
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4a2be24-7690-4967-8b70-2b476e0e6baa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c14362c9-2b8b-4895-8399-3cca900f70ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c14362c9-2b8b-4895-8399-3cca900f70ed
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c14362c9-2b8b-4895-8399-3cca900f70ed
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
correlation: qa-c7aacac4-7c8f-4040-a4bf-5fd8dfa49107

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7aacac4-7c8f-4040-a4bf-5fd8dfa49107
Content-Type: application/json

--- request body ---
{"handle":"qa-cc14801d6fcf","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7aacac4-7c8f-4040-a4bf-5fd8dfa49107
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7aacac4-7c8f-4040-a4bf-5fd8dfa49107"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83acb90d-699c-4154-9674-890c2f7d6d5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83acb90d-699c-4154-9674-890c2f7d6d5e
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83acb90d-699c-4154-9674-890c2f7d6d5e
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
correlation: qa-57e0bc7e-c8a0-432c-ab28-f1eed130d2ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57e0bc7e-c8a0-432c-ab28-f1eed130d2ef
Content-Type: application/json

--- request body ---
{"handle":"qa-06ac0a28cc3e","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57e0bc7e-c8a0-432c-ab28-f1eed130d2ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57e0bc7e-c8a0-432c-ab28-f1eed130d2ef"}
```
