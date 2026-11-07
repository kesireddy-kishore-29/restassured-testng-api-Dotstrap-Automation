# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-efb8ae63-4362-40a4-a469-ac4e9ab49c8a` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-41f253b7-051e-44e1-b9bd-ed6cadbaf6ed` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-9faa7f97-b23e-4f0d-9025-514c07326c77` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-1ce103a5-be08-4e17-8d3d-a26628738054` |
| 5 | `POST /v1/credits/purchases` | 400 | 11 | `qa-436fb2c5-6c09-4474-b929-6563f5d31bdd` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-c9618508-d5e0-4dfa-81e4-501b9c9c5305` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-bb377ad4-611d-4907-8be0-af5b29b9d771` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-8edf8ce9-25ef-4ec8-90cf-5cc4e238e739` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-7059b3c5-9984-4cfd-9c67-c5ae17f5e221` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-39647537-fcfd-468f-82d0-c0f37641fd1f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-efb8ae63-4362-40a4-a469-ac4e9ab49c8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efb8ae63-4362-40a4-a469-ac4e9ab49c8a
Content-Type: application/json

--- request body ---
{"handle":"qa-f13e6a696c17","displayName":"QA f13e6a696c17","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-efb8ae63-4362-40a4-a469-ac4e9ab49c8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Location: /v1/accounts/qa-f13e6a696c17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_214b2f86-915e-48ae-a667-64c2957742a1","handle":"qa-f13e6a696c17","displayName":"QA f13e6a696c17","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.669044305Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-41f253b7-051e-44e1-b9bd-ed6cadbaf6ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41f253b7-051e-44e1-b9bd-ed6cadbaf6ed
Content-Type: application/json

--- request body ---
{"handle":"qa-d2a0c846d262","displayName":"QA d2a0c846d262","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-41f253b7-051e-44e1-b9bd-ed6cadbaf6ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-d2a0c846d262
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d0d9874-9bca-42c9-b0cf-1b6241ed9cd9","handle":"qa-d2a0c846d262","displayName":"QA d2a0c846d262","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.703970252Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9faa7f97-b23e-4f0d-9025-514c07326c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9faa7f97-b23e-4f0d-9025-514c07326c77
Content-Type: application/json

--- request body ---
{"handle":"qa-f13e6a696c17","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9faa7f97-b23e-4f0d-9025-514c07326c77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_214b2f86-915e-48ae-a667-64c2957742a1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1ce103a5-be08-4e17-8d3d-a26628738054

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ce103a5-be08-4e17-8d3d-a26628738054
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d2a0c846d262","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ce103a5-be08-4e17-8d3d-a26628738054
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
Location: /v1/conversations/cnv_df463775-e823-41cf-abe4-3b6102cc02f8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_df463775-e823-41cf-abe4-3b6102cc02f8","subject":"Error contract","status":"open","region":"eu","participants":["qa-f13e6a696c17","qa-d2a0c846d262"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.764277825Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-436fb2c5-6c09-4474-b929-6563f5d31bdd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-120bda24532448938414dfa7c2441e90
X-Correlation-Id: qa-436fb2c5-6c09-4474-b929-6563f5d31bdd
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-436fb2c5-6c09-4474-b929-6563f5d31bdd
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-436fb2c5-6c09-4474-b929-6563f5d31bdd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c9618508-d5e0-4dfa-81e4-501b9c9c5305

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9618508-d5e0-4dfa-81e4-501b9c9c5305
Content-Type: application/json

--- request body ---
{"handle":"qa-d2a0c846d262","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9618508-d5e0-4dfa-81e4-501b9c9c5305
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d0d9874-9bca-42c9-b0cf-1b6241ed9cd9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb377ad4-611d-4907-8be0-af5b29b9d771

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb377ad4-611d-4907-8be0-af5b29b9d771
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb377ad4-611d-4907-8be0-af5b29b9d771
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
correlation: qa-8edf8ce9-25ef-4ec8-90cf-5cc4e238e739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8edf8ce9-25ef-4ec8-90cf-5cc4e238e739
Content-Type: application/json

--- request body ---
{"handle":"qa-d2a0c846d262","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8edf8ce9-25ef-4ec8-90cf-5cc4e238e739
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8edf8ce9-25ef-4ec8-90cf-5cc4e238e739"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7059b3c5-9984-4cfd-9c67-c5ae17f5e221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7059b3c5-9984-4cfd-9c67-c5ae17f5e221
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7059b3c5-9984-4cfd-9c67-c5ae17f5e221
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-39647537-fcfd-468f-82d0-c0f37641fd1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39647537-fcfd-468f-82d0-c0f37641fd1f
Content-Type: application/json

--- request body ---
{"handle":"qa-f13e6a696c17","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39647537-fcfd-468f-82d0-c0f37641fd1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39647537-fcfd-468f-82d0-c0f37641fd1f"}
```
