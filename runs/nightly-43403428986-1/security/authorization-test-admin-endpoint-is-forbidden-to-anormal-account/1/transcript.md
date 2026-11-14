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
| 1 | `POST /v1/accounts` | 201 | 429 | `qa-9b5d5e27-1d10-4131-bedc-d6c06e18168f` |
| 2 | `POST /v1/auth/token` | 200 | 41 | `qa-f6d82db1-7253-46dd-bc2e-039a739553bd` |
| 3 | `GET /v1/admin/stats` | 403 | 28 | `qa-e90ab86b-8a42-4f01-a733-31e49fa59b08` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-671722f7-acbd-44f8-acdd-54cc68e358aa` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-fa237763-72dd-4786-b5ed-81f77daadac2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b5d5e27-1d10-4131-bedc-d6c06e18168f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b5d5e27-1d10-4131-bedc-d6c06e18168f
Content-Type: application/json

--- request body ---
{"handle":"qa-ce2edb95731a","displayName":"QA ce2edb95731a","password":"****","region":"eu"}

--- response: 201 in 429 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b5d5e27-1d10-4131-bedc-d6c06e18168f
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
Location: /v1/accounts/qa-ce2edb95731a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db945e45-10d7-47d6-aba5-d564b95d64f1","handle":"qa-ce2edb95731a","displayName":"QA ce2edb95731a","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.661659797Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f6d82db1-7253-46dd-bc2e-039a739553bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6d82db1-7253-46dd-bc2e-039a739553bd
Content-Type: application/json

--- request body ---
{"handle":"qa-ce2edb95731a","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6d82db1-7253-46dd-bc2e-039a739553bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db945e45-10d7-47d6-aba5-d564b95d64f1"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-e90ab86b-8a42-4f01-a733-31e49fa59b08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e90ab86b-8a42-4f01-a733-31e49fa59b08
Content-Type: application/json

--- response: 403 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e90ab86b-8a42-4f01-a733-31e49fa59b08
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-e90ab86b-8a42-4f01-a733-31e49fa59b08"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-671722f7-acbd-44f8-acdd-54cc68e358aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-671722f7-acbd-44f8-acdd-54cc68e358aa
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-671722f7-acbd-44f8-acdd-54cc68e358aa
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
correlation: qa-fa237763-72dd-4786-b5ed-81f77daadac2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa237763-72dd-4786-b5ed-81f77daadac2
Content-Type: application/json

--- request body ---
{"handle":"qa-ce2edb95731a","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa237763-72dd-4786-b5ed-81f77daadac2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa237763-72dd-4786-b5ed-81f77daadac2"}
```
