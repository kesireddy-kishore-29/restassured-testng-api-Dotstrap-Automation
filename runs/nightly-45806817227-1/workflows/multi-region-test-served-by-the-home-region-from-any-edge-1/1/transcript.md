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
| 1 | `POST /v1/accounts` | 201 | 308 | `qa-cf5398ae-fee3-41ac-9b4e-6b833d1f8c9b` |
| 2 | `POST /v1/auth/token` | 200 | 41 | `qa-e3a94562-bac8-4e52-9f57-762a138a0086` |
| 3 | `GET /v1/accounts/me` | 200 | 63 | `qa-828539ef-0f61-48bd-a5b0-81a397702b16` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-5053a38f-333f-42e0-9df1-e97e6b63e5bc` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-5add94f4-01e7-4964-b875-1c4b538c2c52` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cf5398ae-fee3-41ac-9b4e-6b833d1f8c9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf5398ae-fee3-41ac-9b4e-6b833d1f8c9b
Content-Type: application/json

--- request body ---
{"handle":"qa-43570c8c0562","displayName":"QA 43570c8c0562","password":"****","region":"eu"}

--- response: 201 in 308 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf5398ae-fee3-41ac-9b4e-6b833d1f8c9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-43570c8c0562
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a6a2c4a-9bc0-4c28-9619-1aade6f312b8","handle":"qa-43570c8c0562","displayName":"QA 43570c8c0562","region":"eu","role":"user","createdAt":"2026-11-26T11:02:31.670265198Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e3a94562-bac8-4e52-9f57-762a138a0086

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3a94562-bac8-4e52-9f57-762a138a0086
Content-Type: application/json

--- request body ---
{"handle":"qa-43570c8c0562","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3a94562-bac8-4e52-9f57-762a138a0086
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a6a2c4a-9bc0-4c28-9619-1aade6f312b8"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-828539ef-0f61-48bd-a5b0-81a397702b16

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-828539ef-0f61-48bd-a5b0-81a397702b16
Content-Type: application/json

--- response: 200 in 63 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-828539ef-0f61-48bd-a5b0-81a397702b16
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

{"id":"acc_4a6a2c4a-9bc0-4c28-9619-1aade6f312b8","handle":"qa-43570c8c0562","displayName":"QA 43570c8c0562","region":"eu","role":"user","createdAt":"2026-11-26T11:02:31.670265198Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5053a38f-333f-42e0-9df1-e97e6b63e5bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5053a38f-333f-42e0-9df1-e97e6b63e5bc
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5053a38f-333f-42e0-9df1-e97e6b63e5bc
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
correlation: qa-5add94f4-01e7-4964-b875-1c4b538c2c52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5add94f4-01e7-4964-b875-1c4b538c2c52
Content-Type: application/json

--- request body ---
{"handle":"qa-43570c8c0562","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5add94f4-01e7-4964-b875-1c4b538c2c52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5add94f4-01e7-4964-b875-1c4b538c2c52"}
```
