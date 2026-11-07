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
| 1 | `POST /v1/accounts` | 201 | 510 | `qa-252b9841-19d7-4a4d-b56c-9aa24a44841e` |
| 2 | `POST /v1/auth/token` | 200 | 88 | `qa-9c477d1e-781e-43b2-a6b1-b15fb3bea44d` |
| 3 | `GET /v1/accounts/me` | 200 | 108 | `qa-d23cfc49-2760-4278-a63c-34a2ec6db8b8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-be5d97b3-47f6-456e-bd8d-87e65657099b` |
| 5 | `POST /v1/auth/token` | 401 | 40 | `qa-5a24c2e2-aabe-4be8-9818-1f20609a3068` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-252b9841-19d7-4a4d-b56c-9aa24a44841e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-252b9841-19d7-4a4d-b56c-9aa24a44841e
Content-Type: application/json

--- request body ---
{"handle":"qa-fcf8f03f8207","displayName":"QA fcf8f03f8207","password":"****","region":"eu"}

--- response: 201 in 510 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-252b9841-19d7-4a4d-b56c-9aa24a44841e
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
Location: /v1/accounts/qa-fcf8f03f8207
X-Served-Region: eu
Content-Length: 181

{"id":"acc_899d797b-dacc-401e-b1d9-363c4803a952","handle":"qa-fcf8f03f8207","displayName":"QA fcf8f03f8207","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.206694169Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9c477d1e-781e-43b2-a6b1-b15fb3bea44d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c477d1e-781e-43b2-a6b1-b15fb3bea44d
Content-Type: application/json

--- request body ---
{"handle":"qa-fcf8f03f8207","password":"****"}

--- response: 200 in 88 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c477d1e-781e-43b2-a6b1-b15fb3bea44d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_899d797b-dacc-401e-b1d9-363c4803a952"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d23cfc49-2760-4278-a63c-34a2ec6db8b8

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-d23cfc49-2760-4278-a63c-34a2ec6db8b8
Content-Type: application/json

--- response: 200 in 108 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d23cfc49-2760-4278-a63c-34a2ec6db8b8
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

{"id":"acc_899d797b-dacc-401e-b1d9-363c4803a952","handle":"qa-fcf8f03f8207","displayName":"QA fcf8f03f8207","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.206694169Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be5d97b3-47f6-456e-bd8d-87e65657099b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be5d97b3-47f6-456e-bd8d-87e65657099b
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be5d97b3-47f6-456e-bd8d-87e65657099b
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
correlation: qa-5a24c2e2-aabe-4be8-9818-1f20609a3068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a24c2e2-aabe-4be8-9818-1f20609a3068
Content-Type: application/json

--- request body ---
{"handle":"qa-fcf8f03f8207","password":"****"}

--- response: 401 in 40 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a24c2e2-aabe-4be8-9818-1f20609a3068
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a24c2e2-aabe-4be8-9818-1f20609a3068"}
```
