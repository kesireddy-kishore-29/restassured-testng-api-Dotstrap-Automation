# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-ac7778a8-4727-4909-944b-23f3703eec7f` |
| 2 | `POST /v1/accounts` | 409 | 10 | `qa-c51507bd-f63e-47cf-8c11-7de1c0583a4b` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-4b2e2eac-e2f6-45b5-a4c7-81d8ca325450` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-234d4816-0600-4231-ad94-e92367c8b90e` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-b0d875eb-2705-4d8b-8a58-97c9a4758ea9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ac7778a8-4727-4909-944b-23f3703eec7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac7778a8-4727-4909-944b-23f3703eec7f
Content-Type: application/json

--- request body ---
{"handle":"qa-fbd7f60baa35","displayName":"QA fbd7f60baa35","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac7778a8-4727-4909-944b-23f3703eec7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Location: /v1/accounts/qa-fbd7f60baa35
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fceb1bf3-da8d-439d-8158-979b1e1941d1","handle":"qa-fbd7f60baa35","displayName":"QA fbd7f60baa35","region":"eu","role":"user","createdAt":"2026-11-24T12:38:00.506423146Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c51507bd-f63e-47cf-8c11-7de1c0583a4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c51507bd-f63e-47cf-8c11-7de1c0583a4b
Content-Type: application/json

--- request body ---
{"handle":"qa-fbd7f60baa35","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c51507bd-f63e-47cf-8c11-7de1c0583a4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-fbd7f60baa35' is in use.","instance":"/v1/accounts","correlationId":"qa-c51507bd-f63e-47cf-8c11-7de1c0583a4b"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4b2e2eac-e2f6-45b5-a4c7-81d8ca325450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b2e2eac-e2f6-45b5-a4c7-81d8ca325450
Content-Type: application/json

--- request body ---
{"handle":"qa-fbd7f60baa35","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b2e2eac-e2f6-45b5-a4c7-81d8ca325450
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fceb1bf3-da8d-439d-8158-979b1e1941d1"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-234d4816-0600-4231-ad94-e92367c8b90e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-234d4816-0600-4231-ad94-e92367c8b90e
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-234d4816-0600-4231-ad94-e92367c8b90e
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b0d875eb-2705-4d8b-8a58-97c9a4758ea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0d875eb-2705-4d8b-8a58-97c9a4758ea9
Content-Type: application/json

--- request body ---
{"handle":"qa-fbd7f60baa35","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0d875eb-2705-4d8b-8a58-97c9a4758ea9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0d875eb-2705-4d8b-8a58-97c9a4758ea9"}
```
