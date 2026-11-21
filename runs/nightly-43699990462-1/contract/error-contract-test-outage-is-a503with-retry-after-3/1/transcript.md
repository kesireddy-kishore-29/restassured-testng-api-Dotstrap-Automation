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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-276f54df-174d-46ce-972a-8830b1634e6a` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-a427888b-781f-4a3e-ae80-77d1a014f88f` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-1c7619c2-c68b-4981-b343-a330ed54f3b3` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-aae5e678-7a1c-498a-b5a4-3f1c56d1b249` |
| 5 | `PATCH /v1/accounts/me` | 503 | 11 | `qa-dbc2c062-1dfd-40b2-99a4-faab973f92d6` |
| 6 | `POST /v1/auth/token` | 200 | 114 | `qa-51eb1b67-fc81-46b2-8518-aefbff9e02c7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-c141a28d-ff8e-439e-bc2f-09506e844354` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-3e922e83-750c-4532-9b56-c30c179bdac7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-7c100abe-a6c8-45fa-a9de-f2fc372d5814` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-5bb5197f-c4fd-4c5f-be4b-f5c0fe266f9e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-276f54df-174d-46ce-972a-8830b1634e6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-276f54df-174d-46ce-972a-8830b1634e6a
Content-Type: application/json

--- request body ---
{"handle":"qa-4c1cb613a71d","displayName":"QA 4c1cb613a71d","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-276f54df-174d-46ce-972a-8830b1634e6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-4c1cb613a71d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_adfbb164-93c9-439b-8d08-cff0a7341472","handle":"qa-4c1cb613a71d","displayName":"QA 4c1cb613a71d","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.080525597Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a427888b-781f-4a3e-ae80-77d1a014f88f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a427888b-781f-4a3e-ae80-77d1a014f88f
Content-Type: application/json

--- request body ---
{"handle":"qa-3ab39f3c687f","displayName":"QA 3ab39f3c687f","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-a427888b-781f-4a3e-ae80-77d1a014f88f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-3ab39f3c687f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed6badf9-5f78-414a-8b26-828f6a442732","handle":"qa-3ab39f3c687f","displayName":"QA 3ab39f3c687f","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.115408822Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1c7619c2-c68b-4981-b343-a330ed54f3b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c7619c2-c68b-4981-b343-a330ed54f3b3
Content-Type: application/json

--- request body ---
{"handle":"qa-4c1cb613a71d","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c7619c2-c68b-4981-b343-a330ed54f3b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_adfbb164-93c9-439b-8d08-cff0a7341472"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aae5e678-7a1c-498a-b5a4-3f1c56d1b249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aae5e678-7a1c-498a-b5a4-3f1c56d1b249
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3ab39f3c687f","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-aae5e678-7a1c-498a-b5a4-3f1c56d1b249
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
Location: /v1/conversations/cnv_fc271b6d-3d76-4675-9a9a-b44de529ba19
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fc271b6d-3d76-4675-9a9a-b44de529ba19","subject":"Error contract","status":"open","region":"eu","participants":["qa-4c1cb613a71d","qa-3ab39f3c687f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.194551487Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-dbc2c062-1dfd-40b2-99a4-faab973f92d6

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 107a35b4-c05d-4845-abfe-95eff08c7d73
X-Correlation-Id: qa-dbc2c062-1dfd-40b2-99a4-faab973f92d6
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbc2c062-1dfd-40b2-99a4-faab973f92d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-dbc2c062-1dfd-40b2-99a4-faab973f92d6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-51eb1b67-fc81-46b2-8518-aefbff9e02c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51eb1b67-fc81-46b2-8518-aefbff9e02c7
Content-Type: application/json

--- request body ---
{"handle":"qa-3ab39f3c687f","password":"****"}

--- response: 200 in 114 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-51eb1b67-fc81-46b2-8518-aefbff9e02c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed6badf9-5f78-414a-8b26-828f6a442732"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c141a28d-ff8e-439e-bc2f-09506e844354

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c141a28d-ff8e-439e-bc2f-09506e844354
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c141a28d-ff8e-439e-bc2f-09506e844354
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
correlation: qa-3e922e83-750c-4532-9b56-c30c179bdac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e922e83-750c-4532-9b56-c30c179bdac7
Content-Type: application/json

--- request body ---
{"handle":"qa-3ab39f3c687f","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e922e83-750c-4532-9b56-c30c179bdac7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e922e83-750c-4532-9b56-c30c179bdac7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c100abe-a6c8-45fa-a9de-f2fc372d5814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c100abe-a6c8-45fa-a9de-f2fc372d5814
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c100abe-a6c8-45fa-a9de-f2fc372d5814
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
correlation: qa-5bb5197f-c4fd-4c5f-be4b-f5c0fe266f9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bb5197f-c4fd-4c5f-be4b-f5c0fe266f9e
Content-Type: application/json

--- request body ---
{"handle":"qa-4c1cb613a71d","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bb5197f-c4fd-4c5f-be4b-f5c0fe266f9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5bb5197f-c4fd-4c5f-be4b-f5c0fe266f9e"}
```
