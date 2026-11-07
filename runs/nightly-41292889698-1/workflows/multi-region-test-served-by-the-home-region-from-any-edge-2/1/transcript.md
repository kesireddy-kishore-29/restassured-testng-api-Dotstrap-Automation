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
| 1 | `POST /v1/accounts` | 201 | 500 | `qa-1e01576e-1a1c-4cc5-ab2f-377a90750067` |
| 2 | `POST /v1/auth/token` | 200 | 93 | `qa-fb11ce93-faa8-4792-97e2-7e4fbbaa5a75` |
| 3 | `GET /v1/accounts/me` | 200 | 76 | `qa-c75c22ba-061b-4c00-9aa5-1a7e8c1bb10f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-ee94536d-8098-4dd8-bcab-94bd04b71d96` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-c0a91517-4814-4322-b10d-2a29541403d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1e01576e-1a1c-4cc5-ab2f-377a90750067

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e01576e-1a1c-4cc5-ab2f-377a90750067
Content-Type: application/json

--- request body ---
{"handle":"qa-e1579b7143ef","displayName":"QA e1579b7143ef","password":"****","region":"us"}

--- response: 201 in 500 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e01576e-1a1c-4cc5-ab2f-377a90750067
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-e1579b7143ef
X-Served-Region: us
Content-Length: 181

{"id":"acc_c8ab2901-54da-4c3b-8856-4ea6dc0acdeb","handle":"qa-e1579b7143ef","displayName":"QA e1579b7143ef","region":"us","role":"user","createdAt":"2026-11-01T09:23:23.555480049Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fb11ce93-faa8-4792-97e2-7e4fbbaa5a75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb11ce93-faa8-4792-97e2-7e4fbbaa5a75
Content-Type: application/json

--- request body ---
{"handle":"qa-e1579b7143ef","password":"****"}

--- response: 200 in 93 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb11ce93-faa8-4792-97e2-7e4fbbaa5a75
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8ab2901-54da-4c3b-8856-4ea6dc0acdeb"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c75c22ba-061b-4c00-9aa5-1a7e8c1bb10f

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-c75c22ba-061b-4c00-9aa5-1a7e8c1bb10f
Content-Type: application/json

--- response: 200 in 76 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c75c22ba-061b-4c00-9aa5-1a7e8c1bb10f
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

{"id":"acc_c8ab2901-54da-4c3b-8856-4ea6dc0acdeb","handle":"qa-e1579b7143ef","displayName":"QA e1579b7143ef","region":"us","role":"user","createdAt":"2026-11-01T09:23:23.555480049Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee94536d-8098-4dd8-bcab-94bd04b71d96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee94536d-8098-4dd8-bcab-94bd04b71d96
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee94536d-8098-4dd8-bcab-94bd04b71d96
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
correlation: qa-c0a91517-4814-4322-b10d-2a29541403d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0a91517-4814-4322-b10d-2a29541403d5
Content-Type: application/json

--- request body ---
{"handle":"qa-e1579b7143ef","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0a91517-4814-4322-b10d-2a29541403d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0a91517-4814-4322-b10d-2a29541403d5"}
```
