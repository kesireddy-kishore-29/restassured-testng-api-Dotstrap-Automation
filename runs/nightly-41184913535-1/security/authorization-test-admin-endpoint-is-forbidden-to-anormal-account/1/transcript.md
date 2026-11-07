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
| 1 | `POST /v1/accounts` | 201 | 376 | `qa-ad556cc9-379d-4f8e-a97f-84338b6efcf4` |
| 2 | `POST /v1/auth/token` | 200 | 39 | `qa-0e21e860-2596-48aa-9c80-c5ae348c965a` |
| 3 | `GET /v1/admin/stats` | 403 | 46 | `qa-11e9b5b9-1744-4397-8819-fe27be7844fa` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-26053402-5d61-46f6-8284-8e45245dbb0c` |
| 5 | `POST /v1/auth/token` | 401 | 23 | `qa-3f875501-8601-4f8a-9336-d5482623fae9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ad556cc9-379d-4f8e-a97f-84338b6efcf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad556cc9-379d-4f8e-a97f-84338b6efcf4
Content-Type: application/json

--- request body ---
{"handle":"qa-d76a547412a8","displayName":"QA d76a547412a8","password":"****","region":"eu"}

--- response: 201 in 376 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad556cc9-379d-4f8e-a97f-84338b6efcf4
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
Location: /v1/accounts/qa-d76a547412a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a986aee6-71a4-4e89-8e59-eaa56a6f8ce6","handle":"qa-d76a547412a8","displayName":"QA d76a547412a8","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.329268414Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0e21e860-2596-48aa-9c80-c5ae348c965a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e21e860-2596-48aa-9c80-c5ae348c965a
Content-Type: application/json

--- request body ---
{"handle":"qa-d76a547412a8","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e21e860-2596-48aa-9c80-c5ae348c965a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a986aee6-71a4-4e89-8e59-eaa56a6f8ce6"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-11e9b5b9-1744-4397-8819-fe27be7844fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11e9b5b9-1744-4397-8819-fe27be7844fa
Content-Type: application/json

--- response: 403 in 46 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11e9b5b9-1744-4397-8819-fe27be7844fa
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-11e9b5b9-1744-4397-8819-fe27be7844fa"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26053402-5d61-46f6-8284-8e45245dbb0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26053402-5d61-46f6-8284-8e45245dbb0c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26053402-5d61-46f6-8284-8e45245dbb0c
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
correlation: qa-3f875501-8601-4f8a-9336-d5482623fae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f875501-8601-4f8a-9336-d5482623fae9
Content-Type: application/json

--- request body ---
{"handle":"qa-d76a547412a8","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f875501-8601-4f8a-9336-d5482623fae9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f875501-8601-4f8a-9336-d5482623fae9"}
```
