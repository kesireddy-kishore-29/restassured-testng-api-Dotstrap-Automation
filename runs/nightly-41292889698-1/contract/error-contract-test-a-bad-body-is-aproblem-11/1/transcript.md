# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-f1dfa571-6cff-458a-9aa7-9d52c9aabf91` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-2ac39b1c-d7cf-4d27-acd3-8d60422f623e` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-f67e3ab4-711a-473d-a1d9-2db6cb6b9a5a` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-adf24fc4-deac-43e8-ad91-71364939bfc3` |
| 5 | `POST /v1/conversations` | 422 | 14 | `qa-937d904a-1838-4be9-81bb-139312722c88` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-de543fc0-12e6-462e-80a7-270181120dcf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-8d74e4f8-3021-4ee7-a396-272d9c0df2dd` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-adadbfd2-d997-41fa-b267-e0c55864201f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-e9476c5d-a658-4f2f-8a18-b88db4488814` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-4f931f28-e719-40fe-80ec-dd7907631841` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1dfa571-6cff-458a-9aa7-9d52c9aabf91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1dfa571-6cff-458a-9aa7-9d52c9aabf91
Content-Type: application/json

--- request body ---
{"handle":"qa-1271691ac1f4","displayName":"QA 1271691ac1f4","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1dfa571-6cff-458a-9aa7-9d52c9aabf91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Location: /v1/accounts/qa-1271691ac1f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee0cfb1e-cd5d-446a-bed1-a61362d7526f","handle":"qa-1271691ac1f4","displayName":"QA 1271691ac1f4","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.073511659Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2ac39b1c-d7cf-4d27-acd3-8d60422f623e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ac39b1c-d7cf-4d27-acd3-8d60422f623e
Content-Type: application/json

--- request body ---
{"handle":"qa-c7726aaea7bc","displayName":"QA c7726aaea7bc","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ac39b1c-d7cf-4d27-acd3-8d60422f623e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Location: /v1/accounts/qa-c7726aaea7bc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a43baa0-0f7e-4636-90fb-20c695ce939f","handle":"qa-c7726aaea7bc","displayName":"QA c7726aaea7bc","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.134706350Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f67e3ab4-711a-473d-a1d9-2db6cb6b9a5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f67e3ab4-711a-473d-a1d9-2db6cb6b9a5a
Content-Type: application/json

--- request body ---
{"handle":"qa-1271691ac1f4","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f67e3ab4-711a-473d-a1d9-2db6cb6b9a5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee0cfb1e-cd5d-446a-bed1-a61362d7526f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-adf24fc4-deac-43e8-ad91-71364939bfc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adf24fc4-deac-43e8-ad91-71364939bfc3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c7726aaea7bc","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-adf24fc4-deac-43e8-ad91-71364939bfc3
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
Location: /v1/conversations/cnv_0fd6560b-222b-4751-a62a-d3835ca138ff
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0fd6560b-222b-4751-a62a-d3835ca138ff","subject":"Error contract","status":"open","region":"eu","participants":["qa-1271691ac1f4","qa-c7726aaea7bc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.239423739Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-937d904a-1838-4be9-81bb-139312722c88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-937d904a-1838-4be9-81bb-139312722c88
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c7726aaea7bc","subject":" ","message":"Hi"}

--- response: 422 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-937d904a-1838-4be9-81bb-139312722c88
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-937d904a-1838-4be9-81bb-139312722c88","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-de543fc0-12e6-462e-80a7-270181120dcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de543fc0-12e6-462e-80a7-270181120dcf
Content-Type: application/json

--- request body ---
{"handle":"qa-c7726aaea7bc","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-de543fc0-12e6-462e-80a7-270181120dcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a43baa0-0f7e-4636-90fb-20c695ce939f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d74e4f8-3021-4ee7-a396-272d9c0df2dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d74e4f8-3021-4ee7-a396-272d9c0df2dd
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d74e4f8-3021-4ee7-a396-272d9c0df2dd
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
correlation: qa-adadbfd2-d997-41fa-b267-e0c55864201f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adadbfd2-d997-41fa-b267-e0c55864201f
Content-Type: application/json

--- request body ---
{"handle":"qa-c7726aaea7bc","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-adadbfd2-d997-41fa-b267-e0c55864201f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-adadbfd2-d997-41fa-b267-e0c55864201f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9476c5d-a658-4f2f-8a18-b88db4488814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9476c5d-a658-4f2f-8a18-b88db4488814
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e9476c5d-a658-4f2f-8a18-b88db4488814
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
correlation: qa-4f931f28-e719-40fe-80ec-dd7907631841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f931f28-e719-40fe-80ec-dd7907631841
Content-Type: application/json

--- request body ---
{"handle":"qa-1271691ac1f4","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f931f28-e719-40fe-80ec-dd7907631841
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f931f28-e719-40fe-80ec-dd7907631841"}
```
