# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-ae59d047-56bf-4c74-b418-269bba0d9d2e` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-58df1c97-b960-490f-b644-3f7f03e51e96` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-1283d197-2a3f-45a4-ae3f-6208dd0cc911` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-d3514677-605c-4114-976f-e4ae58607820` |
| 5 | `POST /v1/accounts` | 422 | 6 | `qa-ff647471-cdfa-4517-b45e-9bfafef8d889` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-d0110f00-9100-455c-b486-9f62e5c894d7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-5e04166c-dfc9-43b5-8e84-0ad75fa58d78` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-7590fe8e-f5c1-4cde-b658-338aa043a837` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-cef5279b-eb98-42f3-9382-4eac316c7844` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-4caf23ad-57fc-48de-bc16-46465b9531cb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ae59d047-56bf-4c74-b418-269bba0d9d2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae59d047-56bf-4c74-b418-269bba0d9d2e
Content-Type: application/json

--- request body ---
{"handle":"qa-1bbe64dcec5c","displayName":"QA 1bbe64dcec5c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae59d047-56bf-4c74-b418-269bba0d9d2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-1bbe64dcec5c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_531dd80c-a10a-434e-9cfd-0f845c3c3a18","handle":"qa-1bbe64dcec5c","displayName":"QA 1bbe64dcec5c","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.952396288Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-58df1c97-b960-490f-b644-3f7f03e51e96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58df1c97-b960-490f-b644-3f7f03e51e96
Content-Type: application/json

--- request body ---
{"handle":"qa-c5ab3b5739bc","displayName":"QA c5ab3b5739bc","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-58df1c97-b960-490f-b644-3f7f03e51e96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-c5ab3b5739bc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b7e9264b-55d9-4002-8cfd-0078ac5f8be4","handle":"qa-c5ab3b5739bc","displayName":"QA c5ab3b5739bc","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.979453090Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1283d197-2a3f-45a4-ae3f-6208dd0cc911

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1283d197-2a3f-45a4-ae3f-6208dd0cc911
Content-Type: application/json

--- request body ---
{"handle":"qa-1bbe64dcec5c","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1283d197-2a3f-45a4-ae3f-6208dd0cc911
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_531dd80c-a10a-434e-9cfd-0f845c3c3a18"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d3514677-605c-4114-976f-e4ae58607820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3514677-605c-4114-976f-e4ae58607820
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5ab3b5739bc","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3514677-605c-4114-976f-e4ae58607820
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
Location: /v1/conversations/cnv_e1da3456-327a-4c68-b920-444ef3a781fd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e1da3456-327a-4c68-b920-444ef3a781fd","subject":"Error contract","status":"open","region":"eu","participants":["qa-1bbe64dcec5c","qa-c5ab3b5739bc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.050920864Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-ff647471-cdfa-4517-b45e-9bfafef8d889

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff647471-cdfa-4517-b45e-9bfafef8d889
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff647471-cdfa-4517-b45e-9bfafef8d889
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-ff647471-cdfa-4517-b45e-9bfafef8d889","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d0110f00-9100-455c-b486-9f62e5c894d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0110f00-9100-455c-b486-9f62e5c894d7
Content-Type: application/json

--- request body ---
{"handle":"qa-c5ab3b5739bc","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0110f00-9100-455c-b486-9f62e5c894d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7e9264b-55d9-4002-8cfd-0078ac5f8be4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e04166c-dfc9-43b5-8e84-0ad75fa58d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e04166c-dfc9-43b5-8e84-0ad75fa58d78
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e04166c-dfc9-43b5-8e84-0ad75fa58d78
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
correlation: qa-7590fe8e-f5c1-4cde-b658-338aa043a837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7590fe8e-f5c1-4cde-b658-338aa043a837
Content-Type: application/json

--- request body ---
{"handle":"qa-c5ab3b5739bc","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7590fe8e-f5c1-4cde-b658-338aa043a837
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7590fe8e-f5c1-4cde-b658-338aa043a837"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cef5279b-eb98-42f3-9382-4eac316c7844

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cef5279b-eb98-42f3-9382-4eac316c7844
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cef5279b-eb98-42f3-9382-4eac316c7844
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
correlation: qa-4caf23ad-57fc-48de-bc16-46465b9531cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4caf23ad-57fc-48de-bc16-46465b9531cb
Content-Type: application/json

--- request body ---
{"handle":"qa-1bbe64dcec5c","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4caf23ad-57fc-48de-bc16-46465b9531cb
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4caf23ad-57fc-48de-bc16-46465b9531cb"}
```
