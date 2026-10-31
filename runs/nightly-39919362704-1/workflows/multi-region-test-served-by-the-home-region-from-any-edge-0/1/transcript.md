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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-9390883e-8353-405d-95a9-a8248b348ca6` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-96194805-bb4c-461f-879a-7d99a082cde3` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-62d182e4-31f0-4630-bfd4-fcc47f4ff4ff` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e9407573-9e60-40e2-a76c-faae9b5c069d` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-1a87c00c-4756-4132-9d61-31ea5e5ccc8d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9390883e-8353-405d-95a9-a8248b348ca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9390883e-8353-405d-95a9-a8248b348ca6
Content-Type: application/json

--- request body ---
{"handle":"qa-fa2cce829f32","displayName":"QA fa2cce829f32","password":"****","region":"in"}

--- response: 201 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9390883e-8353-405d-95a9-a8248b348ca6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-fa2cce829f32
X-Served-Region: in
Content-Length: 181

{"id":"acc_2258b1d6-3de4-41d3-8ad5-fff6047596c1","handle":"qa-fa2cce829f32","displayName":"QA fa2cce829f32","region":"in","role":"user","createdAt":"2026-10-23T07:41:45.838451519Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-96194805-bb4c-461f-879a-7d99a082cde3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96194805-bb4c-461f-879a-7d99a082cde3
Content-Type: application/json

--- request body ---
{"handle":"qa-fa2cce829f32","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-96194805-bb4c-461f-879a-7d99a082cde3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2258b1d6-3de4-41d3-8ad5-fff6047596c1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-62d182e4-31f0-4630-bfd4-fcc47f4ff4ff

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-62d182e4-31f0-4630-bfd4-fcc47f4ff4ff
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-62d182e4-31f0-4630-bfd4-fcc47f4ff4ff
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

{"id":"acc_2258b1d6-3de4-41d3-8ad5-fff6047596c1","handle":"qa-fa2cce829f32","displayName":"QA fa2cce829f32","region":"in","role":"user","createdAt":"2026-10-23T07:41:45.838451519Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9407573-9e60-40e2-a76c-faae9b5c069d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9407573-9e60-40e2-a76c-faae9b5c069d
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e9407573-9e60-40e2-a76c-faae9b5c069d
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
correlation: qa-1a87c00c-4756-4132-9d61-31ea5e5ccc8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a87c00c-4756-4132-9d61-31ea5e5ccc8d
Content-Type: application/json

--- request body ---
{"handle":"qa-fa2cce829f32","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a87c00c-4756-4132-9d61-31ea5e5ccc8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a87c00c-4756-4132-9d61-31ea5e5ccc8d"}
```
