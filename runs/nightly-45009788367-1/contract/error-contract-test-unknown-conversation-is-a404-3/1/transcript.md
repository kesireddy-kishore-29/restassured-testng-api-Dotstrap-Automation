# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-6d10dc77-44cf-4938-8a39-e0bb612555e8` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-7ed620ef-b297-4d32-8d79-202a06802850` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 9 | `qa-397e101d-5c1c-4829-9f23-dbda6efae08f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-5e222e99-efd7-4b9f-9c70-7a5f4aa169e9` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-a96cc405-15f0-4016-80e8-dd1fbee059eb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d10dc77-44cf-4938-8a39-e0bb612555e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d10dc77-44cf-4938-8a39-e0bb612555e8
Content-Type: application/json

--- request body ---
{"handle":"qa-45afeaf3733a","displayName":"QA 45afeaf3733a","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d10dc77-44cf-4938-8a39-e0bb612555e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-45afeaf3733a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_725eba98-176f-471c-91d5-665191359e0a","handle":"qa-45afeaf3733a","displayName":"QA 45afeaf3733a","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.620045253Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7ed620ef-b297-4d32-8d79-202a06802850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ed620ef-b297-4d32-8d79-202a06802850
Content-Type: application/json

--- request body ---
{"handle":"qa-45afeaf3733a","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ed620ef-b297-4d32-8d79-202a06802850
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_725eba98-176f-471c-91d5-665191359e0a"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-397e101d-5c1c-4829-9f23-dbda6efae08f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-397e101d-5c1c-4829-9f23-dbda6efae08f
Content-Type: application/json

--- response: 404 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-397e101d-5c1c-4829-9f23-dbda6efae08f
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-397e101d-5c1c-4829-9f23-dbda6efae08f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e222e99-efd7-4b9f-9c70-7a5f4aa169e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e222e99-efd7-4b9f-9c70-7a5f4aa169e9
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e222e99-efd7-4b9f-9c70-7a5f4aa169e9
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
correlation: qa-a96cc405-15f0-4016-80e8-dd1fbee059eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a96cc405-15f0-4016-80e8-dd1fbee059eb
Content-Type: application/json

--- request body ---
{"handle":"qa-45afeaf3733a","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a96cc405-15f0-4016-80e8-dd1fbee059eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a96cc405-15f0-4016-80e8-dd1fbee059eb"}
```
