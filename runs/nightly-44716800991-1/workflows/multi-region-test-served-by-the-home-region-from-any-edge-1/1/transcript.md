# Transcript: Requests are served by the home region, whichever edge they arrive at [EU, us]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[1]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 489 | `qa-acc2c609-d832-4e59-a14e-445b0d99c8e3` |
| 2 | `POST /v1/auth/token` | 200 | 68 | `qa-8f6a2d76-070e-4d6c-bb3a-724c848c0890` |
| 3 | `GET /v1/accounts/me` | 200 | 47 | `qa-3290fb3f-41d6-4754-b847-c9d8a7f01464` |
| 4 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-cb344c8f-f6af-4280-91dc-c71920c648c1` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-b756f14f-1b46-4ed9-b3ad-ed6b8b2bb578` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-acc2c609-d832-4e59-a14e-445b0d99c8e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acc2c609-d832-4e59-a14e-445b0d99c8e3
Content-Type: application/json

--- request body ---
{"handle":"qa-aa338d881440","displayName":"QA aa338d881440","password":"****","region":"eu"}

--- response: 201 in 489 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-acc2c609-d832-4e59-a14e-445b0d99c8e3
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
Location: /v1/accounts/qa-aa338d881440
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a3ff18d-4c86-4edc-b504-37d1dfb1ef5f","handle":"qa-aa338d881440","displayName":"QA aa338d881440","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.184792475Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8f6a2d76-070e-4d6c-bb3a-724c848c0890

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f6a2d76-070e-4d6c-bb3a-724c848c0890
Content-Type: application/json

--- request body ---
{"handle":"qa-aa338d881440","password":"****"}

--- response: 200 in 68 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f6a2d76-070e-4d6c-bb3a-724c848c0890
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a3ff18d-4c86-4edc-b504-37d1dfb1ef5f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3290fb3f-41d6-4754-b847-c9d8a7f01464

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-3290fb3f-41d6-4754-b847-c9d8a7f01464
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3290fb3f-41d6-4754-b847-c9d8a7f01464
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: us
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a3ff18d-4c86-4edc-b504-37d1dfb1ef5f","handle":"qa-aa338d881440","displayName":"QA aa338d881440","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.184792475Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb344c8f-f6af-4280-91dc-c71920c648c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb344c8f-f6af-4280-91dc-c71920c648c1
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb344c8f-f6af-4280-91dc-c71920c648c1
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
correlation: qa-b756f14f-1b46-4ed9-b3ad-ed6b8b2bb578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b756f14f-1b46-4ed9-b3ad-ed6b8b2bb578
Content-Type: application/json

--- request body ---
{"handle":"qa-aa338d881440","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b756f14f-1b46-4ed9-b3ad-ed6b8b2bb578
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b756f14f-1b46-4ed9-b3ad-ed6b8b2bb578"}
```
