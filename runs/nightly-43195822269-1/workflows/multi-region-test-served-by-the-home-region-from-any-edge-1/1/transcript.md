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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-374fef2e-cadb-4c16-af4c-077c31b47da3` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-ac201404-76a1-47ce-b438-25f44f552b39` |
| 3 | `GET /v1/accounts/me` | 200 | 8 | `qa-253026a8-0ca3-4c7a-8d84-9ce64d38d0e0` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-aca2ed06-d334-4027-9c22-b1d3c8fb60e1` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-3894aaa3-da9c-47d8-a6b3-2232835c6559` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-374fef2e-cadb-4c16-af4c-077c31b47da3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374fef2e-cadb-4c16-af4c-077c31b47da3
Content-Type: application/json

--- request body ---
{"handle":"qa-55f0f3414866","displayName":"QA 55f0f3414866","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-374fef2e-cadb-4c16-af4c-077c31b47da3
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
Location: /v1/accounts/qa-55f0f3414866
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d773821d-7b41-44b7-8de9-c31574acbef4","handle":"qa-55f0f3414866","displayName":"QA 55f0f3414866","region":"eu","role":"user","createdAt":"2026-11-12T09:56:38.030763185Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ac201404-76a1-47ce-b438-25f44f552b39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac201404-76a1-47ce-b438-25f44f552b39
Content-Type: application/json

--- request body ---
{"handle":"qa-55f0f3414866","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac201404-76a1-47ce-b438-25f44f552b39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d773821d-7b41-44b7-8de9-c31574acbef4"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-253026a8-0ca3-4c7a-8d84-9ce64d38d0e0

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-253026a8-0ca3-4c7a-8d84-9ce64d38d0e0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-253026a8-0ca3-4c7a-8d84-9ce64d38d0e0
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

{"id":"acc_d773821d-7b41-44b7-8de9-c31574acbef4","handle":"qa-55f0f3414866","displayName":"QA 55f0f3414866","region":"eu","role":"user","createdAt":"2026-11-12T09:56:38.030763185Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aca2ed06-d334-4027-9c22-b1d3c8fb60e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aca2ed06-d334-4027-9c22-b1d3c8fb60e1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aca2ed06-d334-4027-9c22-b1d3c8fb60e1
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
correlation: qa-3894aaa3-da9c-47d8-a6b3-2232835c6559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3894aaa3-da9c-47d8-a6b3-2232835c6559
Content-Type: application/json

--- request body ---
{"handle":"qa-55f0f3414866","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3894aaa3-da9c-47d8-a6b3-2232835c6559
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3894aaa3-da9c-47d8-a6b3-2232835c6559"}
```
