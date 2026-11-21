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
| 1 | `POST /v1/accounts` | 201 | 475 | `qa-8b0ae81c-666e-43a4-99b1-ba17940fbab1` |
| 2 | `POST /v1/auth/token` | 200 | 71 | `qa-c8a477bf-6225-4e37-8c43-1d943b5732b7` |
| 3 | `GET /v1/admin/stats` | 403 | 58 | `qa-d4786eb8-ac6e-4b9c-9098-cf62b4d8327b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-5342d2df-d4b0-40b8-bc99-81bcd329b649` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-c1792a3b-6bc3-46e9-8a18-f958ecdf1ff5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8b0ae81c-666e-43a4-99b1-ba17940fbab1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b0ae81c-666e-43a4-99b1-ba17940fbab1
Content-Type: application/json

--- request body ---
{"handle":"qa-ae36b2faee71","displayName":"QA ae36b2faee71","password":"****","region":"eu"}

--- response: 201 in 475 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b0ae81c-666e-43a4-99b1-ba17940fbab1
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
Location: /v1/accounts/qa-ae36b2faee71
X-Served-Region: eu
Content-Length: 181

{"id":"acc_11bb4c76-5477-42fb-b1ed-beeee4db9ae7","handle":"qa-ae36b2faee71","displayName":"QA ae36b2faee71","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.509158365Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c8a477bf-6225-4e37-8c43-1d943b5732b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8a477bf-6225-4e37-8c43-1d943b5732b7
Content-Type: application/json

--- request body ---
{"handle":"qa-ae36b2faee71","password":"****"}

--- response: 200 in 71 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8a477bf-6225-4e37-8c43-1d943b5732b7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11bb4c76-5477-42fb-b1ed-beeee4db9ae7"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-d4786eb8-ac6e-4b9c-9098-cf62b4d8327b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4786eb8-ac6e-4b9c-9098-cf62b4d8327b
Content-Type: application/json

--- response: 403 in 58 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4786eb8-ac6e-4b9c-9098-cf62b4d8327b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-d4786eb8-ac6e-4b9c-9098-cf62b4d8327b"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5342d2df-d4b0-40b8-bc99-81bcd329b649

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5342d2df-d4b0-40b8-bc99-81bcd329b649
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5342d2df-d4b0-40b8-bc99-81bcd329b649
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c1792a3b-6bc3-46e9-8a18-f958ecdf1ff5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1792a3b-6bc3-46e9-8a18-f958ecdf1ff5
Content-Type: application/json

--- request body ---
{"handle":"qa-ae36b2faee71","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1792a3b-6bc3-46e9-8a18-f958ecdf1ff5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1792a3b-6bc3-46e9-8a18-f958ecdf1ff5"}
```
