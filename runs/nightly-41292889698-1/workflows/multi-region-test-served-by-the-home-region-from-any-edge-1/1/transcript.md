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
| 1 | `POST /v1/accounts` | 201 | 499 | `qa-bdf14949-ffaf-40b2-98bd-b806d66ae14e` |
| 2 | `POST /v1/auth/token` | 200 | 116 | `qa-f6bdf7c2-d0e7-4f26-bd0e-a2f5b88906cd` |
| 3 | `GET /v1/accounts/me` | 200 | 89 | `qa-16d88a58-3ae0-47f6-81fa-25602022cc7f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-ec612ebc-785d-4501-bc1b-a8a6a92e9b96` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-3a1d4c0f-8b88-45e4-86de-5f8251c26a02` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bdf14949-ffaf-40b2-98bd-b806d66ae14e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdf14949-ffaf-40b2-98bd-b806d66ae14e
Content-Type: application/json

--- request body ---
{"handle":"qa-e057626f546a","displayName":"QA e057626f546a","password":"****","region":"eu"}

--- response: 201 in 499 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdf14949-ffaf-40b2-98bd-b806d66ae14e
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
Location: /v1/accounts/qa-e057626f546a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ea6a4cf-b9e7-42b5-8f01-2fb43674fa3f","handle":"qa-e057626f546a","displayName":"QA e057626f546a","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.670795191Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f6bdf7c2-d0e7-4f26-bd0e-a2f5b88906cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6bdf7c2-d0e7-4f26-bd0e-a2f5b88906cd
Content-Type: application/json

--- request body ---
{"handle":"qa-e057626f546a","password":"****"}

--- response: 200 in 116 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6bdf7c2-d0e7-4f26-bd0e-a2f5b88906cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ea6a4cf-b9e7-42b5-8f01-2fb43674fa3f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-16d88a58-3ae0-47f6-81fa-25602022cc7f

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-16d88a58-3ae0-47f6-81fa-25602022cc7f
Content-Type: application/json

--- response: 200 in 89 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-16d88a58-3ae0-47f6-81fa-25602022cc7f
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

{"id":"acc_2ea6a4cf-b9e7-42b5-8f01-2fb43674fa3f","handle":"qa-e057626f546a","displayName":"QA e057626f546a","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.670795191Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec612ebc-785d-4501-bc1b-a8a6a92e9b96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec612ebc-785d-4501-bc1b-a8a6a92e9b96
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec612ebc-785d-4501-bc1b-a8a6a92e9b96
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
correlation: qa-3a1d4c0f-8b88-45e4-86de-5f8251c26a02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a1d4c0f-8b88-45e4-86de-5f8251c26a02
Content-Type: application/json

--- request body ---
{"handle":"qa-e057626f546a","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a1d4c0f-8b88-45e4-86de-5f8251c26a02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a1d4c0f-8b88-45e4-86de-5f8251c26a02"}
```
