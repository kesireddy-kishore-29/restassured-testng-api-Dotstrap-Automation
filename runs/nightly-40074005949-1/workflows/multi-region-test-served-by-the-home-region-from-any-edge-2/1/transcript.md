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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-de2b64a7-d191-45f2-a080-27806a48bca4` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-d436a3e1-cd52-4c08-b530-b7a743f9ef6c` |
| 3 | `GET /v1/accounts/me` | 200 | 16 | `qa-9aca9d41-b6db-4380-9512-a9aabe82f8b5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-42fe0fa1-2540-4ef1-ae6c-d4b0db6ef830` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-f58dee08-0a15-46e1-90d1-3444567c262e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-de2b64a7-d191-45f2-a080-27806a48bca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de2b64a7-d191-45f2-a080-27806a48bca4
Content-Type: application/json

--- request body ---
{"handle":"qa-eb8fd664ed8d","displayName":"QA eb8fd664ed8d","password":"****","region":"us"}

--- response: 201 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-de2b64a7-d191-45f2-a080-27806a48bca4
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
Location: /v1/accounts/qa-eb8fd664ed8d
X-Served-Region: us
Content-Length: 181

{"id":"acc_3146a23f-01b2-422d-8b58-d0beb23bd9ca","handle":"qa-eb8fd664ed8d","displayName":"QA eb8fd664ed8d","region":"us","role":"user","createdAt":"2026-10-24T07:25:36.243397648Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d436a3e1-cd52-4c08-b530-b7a743f9ef6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d436a3e1-cd52-4c08-b530-b7a743f9ef6c
Content-Type: application/json

--- request body ---
{"handle":"qa-eb8fd664ed8d","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d436a3e1-cd52-4c08-b530-b7a743f9ef6c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3146a23f-01b2-422d-8b58-d0beb23bd9ca"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-9aca9d41-b6db-4380-9512-a9aabe82f8b5

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-9aca9d41-b6db-4380-9512-a9aabe82f8b5
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aca9d41-b6db-4380-9512-a9aabe82f8b5
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

{"id":"acc_3146a23f-01b2-422d-8b58-d0beb23bd9ca","handle":"qa-eb8fd664ed8d","displayName":"QA eb8fd664ed8d","region":"us","role":"user","createdAt":"2026-10-24T07:25:36.243397648Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42fe0fa1-2540-4ef1-ae6c-d4b0db6ef830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42fe0fa1-2540-4ef1-ae6c-d4b0db6ef830
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42fe0fa1-2540-4ef1-ae6c-d4b0db6ef830
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
correlation: qa-f58dee08-0a15-46e1-90d1-3444567c262e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f58dee08-0a15-46e1-90d1-3444567c262e
Content-Type: application/json

--- request body ---
{"handle":"qa-eb8fd664ed8d","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f58dee08-0a15-46e1-90d1-3444567c262e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f58dee08-0a15-46e1-90d1-3444567c262e"}
```
