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
| 1 | `POST /v1/accounts` | 201 | 491 | `qa-f4089cdf-8a7f-4b96-a38b-9683459aa444` |
| 2 | `POST /v1/auth/token` | 200 | 90 | `qa-5d340db6-1e5f-466d-8bf8-7bc5bc32297e` |
| 3 | `GET /v1/accounts/me` | 200 | 48 | `qa-5d0461a7-b914-4234-ac85-f6cc7acb5d94` |
| 4 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-c18113ca-bd96-4e66-9f8c-32bd6277fd5d` |
| 5 | `POST /v1/auth/token` | 401 | 33 | `qa-12032320-1d53-4890-9054-e0e2c7b1f338` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f4089cdf-8a7f-4b96-a38b-9683459aa444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4089cdf-8a7f-4b96-a38b-9683459aa444
Content-Type: application/json

--- request body ---
{"handle":"qa-75afcee273e7","displayName":"QA 75afcee273e7","password":"****","region":"eu"}

--- response: 201 in 491 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4089cdf-8a7f-4b96-a38b-9683459aa444
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
Location: /v1/accounts/qa-75afcee273e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63b116e4-4cb5-49f8-888a-0c9c843e29b0","handle":"qa-75afcee273e7","displayName":"QA 75afcee273e7","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.199675630Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5d340db6-1e5f-466d-8bf8-7bc5bc32297e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d340db6-1e5f-466d-8bf8-7bc5bc32297e
Content-Type: application/json

--- request body ---
{"handle":"qa-75afcee273e7","password":"****"}

--- response: 200 in 90 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d340db6-1e5f-466d-8bf8-7bc5bc32297e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63b116e4-4cb5-49f8-888a-0c9c843e29b0"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d0461a7-b914-4234-ac85-f6cc7acb5d94

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-5d0461a7-b914-4234-ac85-f6cc7acb5d94
Content-Type: application/json

--- response: 200 in 48 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d0461a7-b914-4234-ac85-f6cc7acb5d94
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

{"id":"acc_63b116e4-4cb5-49f8-888a-0c9c843e29b0","handle":"qa-75afcee273e7","displayName":"QA 75afcee273e7","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.199675630Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c18113ca-bd96-4e66-9f8c-32bd6277fd5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c18113ca-bd96-4e66-9f8c-32bd6277fd5d
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c18113ca-bd96-4e66-9f8c-32bd6277fd5d
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
correlation: qa-12032320-1d53-4890-9054-e0e2c7b1f338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12032320-1d53-4890-9054-e0e2c7b1f338
Content-Type: application/json

--- request body ---
{"handle":"qa-75afcee273e7","password":"****"}

--- response: 401 in 33 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12032320-1d53-4890-9054-e0e2c7b1f338
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12032320-1d53-4890-9054-e0e2c7b1f338"}
```
