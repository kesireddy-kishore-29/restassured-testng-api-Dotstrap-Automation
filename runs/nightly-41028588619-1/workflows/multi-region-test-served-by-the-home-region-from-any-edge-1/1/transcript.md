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
| 1 | `POST /v1/accounts` | 201 | 516 | `qa-28793c61-2a95-4de3-90ec-456fe85c6f58` |
| 2 | `POST /v1/auth/token` | 200 | 105 | `qa-9f0cf2d0-5b90-43cc-a3c2-b1f8c7ca84a9` |
| 3 | `GET /v1/accounts/me` | 200 | 81 | `qa-f6fdbb29-aeb0-4cd1-90c4-825e9a712229` |
| 4 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-8248d241-d5f5-4cf5-8a41-1e29c6f22321` |
| 5 | `POST /v1/auth/token` | 401 | 41 | `qa-59f1cf22-4333-45aa-a3c4-06f0c2a08282` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-28793c61-2a95-4de3-90ec-456fe85c6f58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28793c61-2a95-4de3-90ec-456fe85c6f58
Content-Type: application/json

--- request body ---
{"handle":"qa-39caa25aa33c","displayName":"QA 39caa25aa33c","password":"****","region":"eu"}

--- response: 201 in 516 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-28793c61-2a95-4de3-90ec-456fe85c6f58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-39caa25aa33c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81184817-b6b0-4347-9822-ba84f67c96d3","handle":"qa-39caa25aa33c","displayName":"QA 39caa25aa33c","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.565554495Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9f0cf2d0-5b90-43cc-a3c2-b1f8c7ca84a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f0cf2d0-5b90-43cc-a3c2-b1f8c7ca84a9
Content-Type: application/json

--- request body ---
{"handle":"qa-39caa25aa33c","password":"****"}

--- response: 200 in 105 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f0cf2d0-5b90-43cc-a3c2-b1f8c7ca84a9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81184817-b6b0-4347-9822-ba84f67c96d3"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6fdbb29-aeb0-4cd1-90c4-825e9a712229

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-f6fdbb29-aeb0-4cd1-90c4-825e9a712229
Content-Type: application/json

--- response: 200 in 81 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6fdbb29-aeb0-4cd1-90c4-825e9a712229
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

{"id":"acc_81184817-b6b0-4347-9822-ba84f67c96d3","handle":"qa-39caa25aa33c","displayName":"QA 39caa25aa33c","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.565554495Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8248d241-d5f5-4cf5-8a41-1e29c6f22321

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8248d241-d5f5-4cf5-8a41-1e29c6f22321
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8248d241-d5f5-4cf5-8a41-1e29c6f22321
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
correlation: qa-59f1cf22-4333-45aa-a3c4-06f0c2a08282

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59f1cf22-4333-45aa-a3c4-06f0c2a08282
Content-Type: application/json

--- request body ---
{"handle":"qa-39caa25aa33c","password":"****"}

--- response: 401 in 41 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59f1cf22-4333-45aa-a3c4-06f0c2a08282
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59f1cf22-4333-45aa-a3c4-06f0c2a08282"}
```
