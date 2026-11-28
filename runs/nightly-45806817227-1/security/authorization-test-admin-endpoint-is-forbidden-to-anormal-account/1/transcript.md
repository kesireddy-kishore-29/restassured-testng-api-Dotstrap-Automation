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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-05af1b0c-c2e5-4f65-9df4-68fc0fc6791e` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-aa73b56d-1953-40f6-a7c1-24e8aac01ff7` |
| 3 | `GET /v1/admin/stats` | 403 | 13 | `qa-8357e1c3-f50b-4ba4-90a7-93833a972ada` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-7f854d81-5bfb-4b0f-aa9e-745ee5b36793` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-62310b99-af18-4d89-88ef-503c5f9aa13d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-05af1b0c-c2e5-4f65-9df4-68fc0fc6791e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05af1b0c-c2e5-4f65-9df4-68fc0fc6791e
Content-Type: application/json

--- request body ---
{"handle":"qa-c14f1526dd22","displayName":"QA c14f1526dd22","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-05af1b0c-c2e5-4f65-9df4-68fc0fc6791e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-c14f1526dd22
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eaaef39c-4bdd-490b-ae86-b5e2d78d93a4","handle":"qa-c14f1526dd22","displayName":"QA c14f1526dd22","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.599383314Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-aa73b56d-1953-40f6-a7c1-24e8aac01ff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa73b56d-1953-40f6-a7c1-24e8aac01ff7
Content-Type: application/json

--- request body ---
{"handle":"qa-c14f1526dd22","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa73b56d-1953-40f6-a7c1-24e8aac01ff7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eaaef39c-4bdd-490b-ae86-b5e2d78d93a4"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-8357e1c3-f50b-4ba4-90a7-93833a972ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8357e1c3-f50b-4ba4-90a7-93833a972ada
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8357e1c3-f50b-4ba4-90a7-93833a972ada
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-8357e1c3-f50b-4ba4-90a7-93833a972ada"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f854d81-5bfb-4b0f-aa9e-745ee5b36793

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f854d81-5bfb-4b0f-aa9e-745ee5b36793
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f854d81-5bfb-4b0f-aa9e-745ee5b36793
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
correlation: qa-62310b99-af18-4d89-88ef-503c5f9aa13d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62310b99-af18-4d89-88ef-503c5f9aa13d
Content-Type: application/json

--- request body ---
{"handle":"qa-c14f1526dd22","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62310b99-af18-4d89-88ef-503c5f9aa13d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62310b99-af18-4d89-88ef-503c5f9aa13d"}
```
