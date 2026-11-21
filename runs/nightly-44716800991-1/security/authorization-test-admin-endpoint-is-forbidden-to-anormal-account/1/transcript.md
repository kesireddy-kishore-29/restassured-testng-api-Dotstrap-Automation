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
| 1 | `POST /v1/accounts` | 201 | 271 | `qa-3fffa2d6-f77b-41f8-a052-18a400526e27` |
| 2 | `POST /v1/auth/token` | 200 | 39 | `qa-aac4c778-fcab-44b2-ab5e-b5dd37dccd51` |
| 3 | `GET /v1/admin/stats` | 403 | 40 | `qa-8a31e650-3968-4f9f-9cc2-120c9c120139` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-321ab1ff-9fd1-4d7b-bb4e-b8afe737f235` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-f22df914-dd29-4610-af19-4b2e8c86a463` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3fffa2d6-f77b-41f8-a052-18a400526e27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fffa2d6-f77b-41f8-a052-18a400526e27
Content-Type: application/json

--- request body ---
{"handle":"qa-fa377a9b9e4b","displayName":"QA fa377a9b9e4b","password":"****","region":"eu"}

--- response: 201 in 271 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fffa2d6-f77b-41f8-a052-18a400526e27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-fa377a9b9e4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01ddfc56-cd9d-4a51-a245-75f416f365c8","handle":"qa-fa377a9b9e4b","displayName":"QA fa377a9b9e4b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.016019834Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-aac4c778-fcab-44b2-ab5e-b5dd37dccd51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aac4c778-fcab-44b2-ab5e-b5dd37dccd51
Content-Type: application/json

--- request body ---
{"handle":"qa-fa377a9b9e4b","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-aac4c778-fcab-44b2-ab5e-b5dd37dccd51
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01ddfc56-cd9d-4a51-a245-75f416f365c8"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-8a31e650-3968-4f9f-9cc2-120c9c120139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a31e650-3968-4f9f-9cc2-120c9c120139
Content-Type: application/json

--- response: 403 in 40 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a31e650-3968-4f9f-9cc2-120c9c120139
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-8a31e650-3968-4f9f-9cc2-120c9c120139"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-321ab1ff-9fd1-4d7b-bb4e-b8afe737f235

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-321ab1ff-9fd1-4d7b-bb4e-b8afe737f235
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-321ab1ff-9fd1-4d7b-bb4e-b8afe737f235
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
correlation: qa-f22df914-dd29-4610-af19-4b2e8c86a463

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f22df914-dd29-4610-af19-4b2e8c86a463
Content-Type: application/json

--- request body ---
{"handle":"qa-fa377a9b9e4b","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f22df914-dd29-4610-af19-4b2e8c86a463
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f22df914-dd29-4610-af19-4b2e8c86a463"}
```
