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
| 1 | `POST /v1/accounts` | 201 | 535 | `qa-7b26ebf3-d82c-4b62-b85a-c3f942c400f3` |
| 2 | `POST /v1/auth/token` | 200 | 91 | `qa-b185a60d-a4ce-49eb-9f6d-33faeafc6798` |
| 3 | `GET /v1/accounts/me` | 200 | 72 | `qa-3fe5f5aa-fbf0-44e2-9c16-952f88c741a8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-e2e370a8-e4ce-40a4-9329-18e362d483d9` |
| 5 | `POST /v1/auth/token` | 401 | 23 | `qa-94c92d23-dfc5-47f2-aa30-f2a25b667d08` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7b26ebf3-d82c-4b62-b85a-c3f942c400f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b26ebf3-d82c-4b62-b85a-c3f942c400f3
Content-Type: application/json

--- request body ---
{"handle":"qa-e3e4e9297715","displayName":"QA e3e4e9297715","password":"****","region":"in"}

--- response: 201 in 535 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b26ebf3-d82c-4b62-b85a-c3f942c400f3
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
Location: /v1/accounts/qa-e3e4e9297715
X-Served-Region: in
Content-Length: 181

{"id":"acc_a2a9ac6e-e084-4bd7-a0c2-7e2f77040190","handle":"qa-e3e4e9297715","displayName":"QA e3e4e9297715","region":"in","role":"user","createdAt":"2026-11-24T12:38:09.052376841Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b185a60d-a4ce-49eb-9f6d-33faeafc6798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b185a60d-a4ce-49eb-9f6d-33faeafc6798
Content-Type: application/json

--- request body ---
{"handle":"qa-e3e4e9297715","password":"****"}

--- response: 200 in 91 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b185a60d-a4ce-49eb-9f6d-33faeafc6798
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2a9ac6e-e084-4bd7-a0c2-7e2f77040190"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3fe5f5aa-fbf0-44e2-9c16-952f88c741a8

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-3fe5f5aa-fbf0-44e2-9c16-952f88c741a8
Content-Type: application/json

--- response: 200 in 72 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fe5f5aa-fbf0-44e2-9c16-952f88c741a8
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

{"id":"acc_a2a9ac6e-e084-4bd7-a0c2-7e2f77040190","handle":"qa-e3e4e9297715","displayName":"QA e3e4e9297715","region":"in","role":"user","createdAt":"2026-11-24T12:38:09.052376841Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2e370a8-e4ce-40a4-9329-18e362d483d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e370a8-e4ce-40a4-9329-18e362d483d9
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2e370a8-e4ce-40a4-9329-18e362d483d9
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
correlation: qa-94c92d23-dfc5-47f2-aa30-f2a25b667d08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94c92d23-dfc5-47f2-aa30-f2a25b667d08
Content-Type: application/json

--- request body ---
{"handle":"qa-e3e4e9297715","password":"****"}

--- response: 401 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94c92d23-dfc5-47f2-aa30-f2a25b667d08
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94c92d23-dfc5-47f2-aa30-f2a25b667d08"}
```
