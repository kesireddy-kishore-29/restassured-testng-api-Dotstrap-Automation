# Transcript: Requests are served by the home region, whichever edge they arrive at [IN, eu]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[0]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-2cb3c1c2-e763-49be-aedb-cfe4c2eb59d9` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-dd5adab5-3c0c-474b-a3a2-114997ca5829` |
| 3 | `GET /v1/accounts/me` | 200 | 18 | `qa-87c3770e-5fb6-43c4-a35e-9943e2a626a7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-90204464-7064-4f33-8131-d466ec31f56a` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-1cffad92-a2a1-4d50-9a4d-9abfacc74cb0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2cb3c1c2-e763-49be-aedb-cfe4c2eb59d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cb3c1c2-e763-49be-aedb-cfe4c2eb59d9
Content-Type: application/json

--- request body ---
{"handle":"qa-8effa72ce680","displayName":"QA 8effa72ce680","password":"****","region":"in"}

--- response: 201 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cb3c1c2-e763-49be-aedb-cfe4c2eb59d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-8effa72ce680
X-Served-Region: in
Content-Length: 181

{"id":"acc_2cb6b4e8-5bc3-478a-b45a-497cc247dc87","handle":"qa-8effa72ce680","displayName":"QA 8effa72ce680","region":"in","role":"user","createdAt":"2026-10-27T08:00:34.605252837Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dd5adab5-3c0c-474b-a3a2-114997ca5829

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd5adab5-3c0c-474b-a3a2-114997ca5829
Content-Type: application/json

--- request body ---
{"handle":"qa-8effa72ce680","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd5adab5-3c0c-474b-a3a2-114997ca5829
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2cb6b4e8-5bc3-478a-b45a-497cc247dc87"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-87c3770e-5fb6-43c4-a35e-9943e2a626a7

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-87c3770e-5fb6-43c4-a35e-9943e2a626a7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-87c3770e-5fb6-43c4-a35e-9943e2a626a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: eu
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 181

{"id":"acc_2cb6b4e8-5bc3-478a-b45a-497cc247dc87","handle":"qa-8effa72ce680","displayName":"QA 8effa72ce680","region":"in","role":"user","createdAt":"2026-10-27T08:00:34.605252837Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-90204464-7064-4f33-8131-d466ec31f56a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90204464-7064-4f33-8131-d466ec31f56a
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-90204464-7064-4f33-8131-d466ec31f56a
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1cffad92-a2a1-4d50-9a4d-9abfacc74cb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cffad92-a2a1-4d50-9a4d-9abfacc74cb0
Content-Type: application/json

--- request body ---
{"handle":"qa-8effa72ce680","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1cffad92-a2a1-4d50-9a4d-9abfacc74cb0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1cffad92-a2a1-4d50-9a4d-9abfacc74cb0"}
```
