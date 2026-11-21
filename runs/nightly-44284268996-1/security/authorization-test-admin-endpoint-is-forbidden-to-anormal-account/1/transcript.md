# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 363 | `qa-c3372b6d-d376-4913-83db-7e4c7d5fa48b` |
| 2 | `POST /v1/auth/token` | 200 | 31 | `qa-d29a1c65-c84b-44e8-a7b6-66bf7bdf62e9` |
| 3 | `GET /v1/admin/stats` | 403 | 21 | `qa-889a31fd-0a63-4b80-8bcf-7f6cb1ef71d1` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-59177b31-205c-48ac-91c6-68ec9acdecd9` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-b2a28ea6-3c55-4e5b-9e1f-d4d4ff7b0dae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c3372b6d-d376-4913-83db-7e4c7d5fa48b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3372b6d-d376-4913-83db-7e4c7d5fa48b
Content-Type: application/json

--- request body ---
{"handle":"qa-257792d042ca","displayName":"QA 257792d042ca","password":"****","region":"eu"}

--- response: 201 in 363 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3372b6d-d376-4913-83db-7e4c7d5fa48b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-257792d042ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb4b48a7-f146-4454-b3c2-af968a2191eb","handle":"qa-257792d042ca","displayName":"QA 257792d042ca","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.106885033Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d29a1c65-c84b-44e8-a7b6-66bf7bdf62e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d29a1c65-c84b-44e8-a7b6-66bf7bdf62e9
Content-Type: application/json

--- request body ---
{"handle":"qa-257792d042ca","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d29a1c65-c84b-44e8-a7b6-66bf7bdf62e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb4b48a7-f146-4454-b3c2-af968a2191eb"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-889a31fd-0a63-4b80-8bcf-7f6cb1ef71d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-889a31fd-0a63-4b80-8bcf-7f6cb1ef71d1
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-889a31fd-0a63-4b80-8bcf-7f6cb1ef71d1
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-889a31fd-0a63-4b80-8bcf-7f6cb1ef71d1"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59177b31-205c-48ac-91c6-68ec9acdecd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59177b31-205c-48ac-91c6-68ec9acdecd9
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59177b31-205c-48ac-91c6-68ec9acdecd9
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b2a28ea6-3c55-4e5b-9e1f-d4d4ff7b0dae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2a28ea6-3c55-4e5b-9e1f-d4d4ff7b0dae
Content-Type: application/json

--- request body ---
{"handle":"qa-257792d042ca","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2a28ea6-3c55-4e5b-9e1f-d4d4ff7b0dae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2a28ea6-3c55-4e5b-9e1f-d4d4ff7b0dae"}
```
