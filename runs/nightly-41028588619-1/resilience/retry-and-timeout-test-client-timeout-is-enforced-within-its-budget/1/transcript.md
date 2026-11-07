# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 311 | `qa-e607ca5e-ad77-4789-b6e9-789c42cf3d63` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-f27ffc1f-3c7d-4e74-87ed-31ef8b6ab09e` |
| 3 | `GET /v1/accounts/me` | error | 827 | `qa-1d13cb92-60c6-4b28-9534-b6d6ab45caef` |
| 4 | `GET /v1/accounts/me` | error | 808 | `qa-5308f306-be9c-4119-b8a5-54ecb1253770` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5ea14e60-4f0d-4dcd-b7d9-7f14cb99d09b` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-2894d0b6-d22f-4b5b-9305-7c68de5d00e7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e607ca5e-ad77-4789-b6e9-789c42cf3d63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e607ca5e-ad77-4789-b6e9-789c42cf3d63
Content-Type: application/json

--- request body ---
{"handle":"qa-47c3caa845ce","displayName":"QA 47c3caa845ce","password":"****","region":"eu"}

--- response: 201 in 311 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e607ca5e-ad77-4789-b6e9-789c42cf3d63
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
Location: /v1/accounts/qa-47c3caa845ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5410c7e0-617e-40d4-80f2-129e7c05e34d","handle":"qa-47c3caa845ce","displayName":"QA 47c3caa845ce","region":"eu","role":"user","createdAt":"2026-10-30T08:45:48.630791360Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f27ffc1f-3c7d-4e74-87ed-31ef8b6ab09e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f27ffc1f-3c7d-4e74-87ed-31ef8b6ab09e
Content-Type: application/json

--- request body ---
{"handle":"qa-47c3caa845ce","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-f27ffc1f-3c7d-4e74-87ed-31ef8b6ab09e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5410c7e0-617e-40d4-80f2-129e7c05e34d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d13cb92-60c6-4b28-9534-b6d6ab45caef

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: cfd8af11-1b0f-4d80-8bfd-f0933d7e80ae
X-Correlation-Id: qa-1d13cb92-60c6-4b28-9534-b6d6ab45caef
Content-Type: application/json

--- response: none in 827 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-5308f306-be9c-4119-b8a5-54ecb1253770

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: cfd8af11-1b0f-4d80-8bfd-f0933d7e80ae
X-Correlation-Id: qa-5308f306-be9c-4119-b8a5-54ecb1253770
Content-Type: application/json

--- response: none in 808 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ea14e60-4f0d-4dcd-b7d9-7f14cb99d09b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ea14e60-4f0d-4dcd-b7d9-7f14cb99d09b
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ea14e60-4f0d-4dcd-b7d9-7f14cb99d09b
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2894d0b6-d22f-4b5b-9305-7c68de5d00e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2894d0b6-d22f-4b5b-9305-7c68de5d00e7
Content-Type: application/json

--- request body ---
{"handle":"qa-47c3caa845ce","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2894d0b6-d22f-4b5b-9305-7c68de5d00e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2894d0b6-d22f-4b5b-9305-7c68de5d00e7"}
```
