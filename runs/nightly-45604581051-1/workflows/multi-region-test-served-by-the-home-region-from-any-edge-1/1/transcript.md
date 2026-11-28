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
| 1 | `POST /v1/accounts` | 201 | 476 | `qa-381868b0-adde-40db-941f-41a732ceaccb` |
| 2 | `POST /v1/auth/token` | 200 | 59 | `qa-c704837b-85c8-4d2b-8b1b-9ce92e42f5a2` |
| 3 | `GET /v1/accounts/me` | 200 | 72 | `qa-c69d7a96-36e8-496b-a063-346ea910256f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-18d64d87-0b33-487a-9f8d-b5beb1413815` |
| 5 | `POST /v1/auth/token` | 401 | 24 | `qa-2596f934-6fa1-4f0d-8ae3-f2853c53bbd7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-381868b0-adde-40db-941f-41a732ceaccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-381868b0-adde-40db-941f-41a732ceaccb
Content-Type: application/json

--- request body ---
{"handle":"qa-cce4cb48e84c","displayName":"QA cce4cb48e84c","password":"****","region":"eu"}

--- response: 201 in 476 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-381868b0-adde-40db-941f-41a732ceaccb
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
Location: /v1/accounts/qa-cce4cb48e84c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_923ff486-f6f0-445c-b18d-c6c14dd0013b","handle":"qa-cce4cb48e84c","displayName":"QA cce4cb48e84c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.372293716Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c704837b-85c8-4d2b-8b1b-9ce92e42f5a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c704837b-85c8-4d2b-8b1b-9ce92e42f5a2
Content-Type: application/json

--- request body ---
{"handle":"qa-cce4cb48e84c","password":"****"}

--- response: 200 in 59 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c704837b-85c8-4d2b-8b1b-9ce92e42f5a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_923ff486-f6f0-445c-b18d-c6c14dd0013b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c69d7a96-36e8-496b-a063-346ea910256f

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-c69d7a96-36e8-496b-a063-346ea910256f
Content-Type: application/json

--- response: 200 in 72 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c69d7a96-36e8-496b-a063-346ea910256f
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

{"id":"acc_923ff486-f6f0-445c-b18d-c6c14dd0013b","handle":"qa-cce4cb48e84c","displayName":"QA cce4cb48e84c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.372293716Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18d64d87-0b33-487a-9f8d-b5beb1413815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18d64d87-0b33-487a-9f8d-b5beb1413815
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18d64d87-0b33-487a-9f8d-b5beb1413815
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
correlation: qa-2596f934-6fa1-4f0d-8ae3-f2853c53bbd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2596f934-6fa1-4f0d-8ae3-f2853c53bbd7
Content-Type: application/json

--- request body ---
{"handle":"qa-cce4cb48e84c","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2596f934-6fa1-4f0d-8ae3-f2853c53bbd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2596f934-6fa1-4f0d-8ae3-f2853c53bbd7"}
```
