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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-81395eb2-1f24-4714-a9c2-ae9140c3eb5e` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-90c58331-9d61-4447-8cd8-43416b9c9375` |
| 3 | `GET /v1/admin/stats` | 403 | 37 | `qa-e4148c0c-d950-4dc3-8674-6b4541802c9f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-89d4903c-cdb6-484f-9271-d8dfc054a37f` |
| 5 | `POST /v1/auth/token` | 401 | 21 | `qa-96b679cf-9b40-458e-834e-3691a7c110d1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-81395eb2-1f24-4714-a9c2-ae9140c3eb5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81395eb2-1f24-4714-a9c2-ae9140c3eb5e
Content-Type: application/json

--- request body ---
{"handle":"qa-d961afad01e1","displayName":"QA d961afad01e1","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-81395eb2-1f24-4714-a9c2-ae9140c3eb5e
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
Location: /v1/accounts/qa-d961afad01e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df410e1f-0e99-4634-afb9-0d17c064c329","handle":"qa-d961afad01e1","displayName":"QA d961afad01e1","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.926147373Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-90c58331-9d61-4447-8cd8-43416b9c9375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90c58331-9d61-4447-8cd8-43416b9c9375
Content-Type: application/json

--- request body ---
{"handle":"qa-d961afad01e1","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-90c58331-9d61-4447-8cd8-43416b9c9375
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df410e1f-0e99-4634-afb9-0d17c064c329"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-e4148c0c-d950-4dc3-8674-6b4541802c9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4148c0c-d950-4dc3-8674-6b4541802c9f
Content-Type: application/json

--- response: 403 in 37 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4148c0c-d950-4dc3-8674-6b4541802c9f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-e4148c0c-d950-4dc3-8674-6b4541802c9f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89d4903c-cdb6-484f-9271-d8dfc054a37f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89d4903c-cdb6-484f-9271-d8dfc054a37f
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89d4903c-cdb6-484f-9271-d8dfc054a37f
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
correlation: qa-96b679cf-9b40-458e-834e-3691a7c110d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96b679cf-9b40-458e-834e-3691a7c110d1
Content-Type: application/json

--- request body ---
{"handle":"qa-d961afad01e1","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96b679cf-9b40-458e-834e-3691a7c110d1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96b679cf-9b40-458e-834e-3691a7c110d1"}
```
