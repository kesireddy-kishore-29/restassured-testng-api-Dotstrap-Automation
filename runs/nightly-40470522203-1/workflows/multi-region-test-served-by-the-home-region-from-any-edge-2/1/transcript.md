# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-08775a44-3742-4395-b6ea-c2c0429dc8ae` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-13540229-bdd3-4efe-b78b-6f5f9675983e` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-ec33521a-a195-4498-8595-6fb3483b8cbc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-e837c109-c11b-4df4-9e7d-bdd0aeb07d8c` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-049ca272-7c01-4dbe-ba9b-853b003e342e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-08775a44-3742-4395-b6ea-c2c0429dc8ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08775a44-3742-4395-b6ea-c2c0429dc8ae
Content-Type: application/json

--- request body ---
{"handle":"qa-d25064abc04c","displayName":"QA d25064abc04c","password":"****","region":"us"}

--- response: 201 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-08775a44-3742-4395-b6ea-c2c0429dc8ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-d25064abc04c
X-Served-Region: us
Content-Length: 181

{"id":"acc_f73ed89f-e8b4-4835-8b7b-226105ec08b1","handle":"qa-d25064abc04c","displayName":"QA d25064abc04c","region":"us","role":"user","createdAt":"2026-10-27T08:00:34.619899712Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-13540229-bdd3-4efe-b78b-6f5f9675983e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13540229-bdd3-4efe-b78b-6f5f9675983e
Content-Type: application/json

--- request body ---
{"handle":"qa-d25064abc04c","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-13540229-bdd3-4efe-b78b-6f5f9675983e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f73ed89f-e8b4-4835-8b7b-226105ec08b1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec33521a-a195-4498-8595-6fb3483b8cbc

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-ec33521a-a195-4498-8595-6fb3483b8cbc
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec33521a-a195-4498-8595-6fb3483b8cbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_f73ed89f-e8b4-4835-8b7b-226105ec08b1","handle":"qa-d25064abc04c","displayName":"QA d25064abc04c","region":"us","role":"user","createdAt":"2026-10-27T08:00:34.619899712Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e837c109-c11b-4df4-9e7d-bdd0aeb07d8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e837c109-c11b-4df4-9e7d-bdd0aeb07d8c
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e837c109-c11b-4df4-9e7d-bdd0aeb07d8c
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-049ca272-7c01-4dbe-ba9b-853b003e342e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-049ca272-7c01-4dbe-ba9b-853b003e342e
Content-Type: application/json

--- request body ---
{"handle":"qa-d25064abc04c","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-049ca272-7c01-4dbe-ba9b-853b003e342e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-049ca272-7c01-4dbe-ba9b-853b003e342e"}
```
