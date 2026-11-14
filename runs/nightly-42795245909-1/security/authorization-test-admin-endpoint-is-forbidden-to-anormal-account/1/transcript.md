# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 309 | `qa-f46d1805-ce50-4520-bb6e-45dd27b07bb3` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-e5ccecfe-28b2-42af-bd41-a9e8b853285d` |
| 3 | `GET /v1/admin/stats` | 403 | 36 | `qa-b929b5b4-ffd8-480f-b85e-28786145d8be` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-620d6967-f5ee-4a42-8bf5-13d5196e89d3` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-630a991e-497a-4c78-8a0d-76f08586506c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f46d1805-ce50-4520-bb6e-45dd27b07bb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f46d1805-ce50-4520-bb6e-45dd27b07bb3
Content-Type: application/json

--- request body ---
{"handle":"qa-c6d7ab08de26","displayName":"QA c6d7ab08de26","password":"****","region":"eu"}

--- response: 201 in 309 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f46d1805-ce50-4520-bb6e-45dd27b07bb3
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
Location: /v1/accounts/qa-c6d7ab08de26
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf9634be-979e-44ad-a1ce-b664312ed73d","handle":"qa-c6d7ab08de26","displayName":"QA c6d7ab08de26","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.575807478Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e5ccecfe-28b2-42af-bd41-a9e8b853285d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5ccecfe-28b2-42af-bd41-a9e8b853285d
Content-Type: application/json

--- request body ---
{"handle":"qa-c6d7ab08de26","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5ccecfe-28b2-42af-bd41-a9e8b853285d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf9634be-979e-44ad-a1ce-b664312ed73d"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-b929b5b4-ffd8-480f-b85e-28786145d8be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b929b5b4-ffd8-480f-b85e-28786145d8be
Content-Type: application/json

--- response: 403 in 36 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b929b5b4-ffd8-480f-b85e-28786145d8be
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-b929b5b4-ffd8-480f-b85e-28786145d8be"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-620d6967-f5ee-4a42-8bf5-13d5196e89d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-620d6967-f5ee-4a42-8bf5-13d5196e89d3
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-620d6967-f5ee-4a42-8bf5-13d5196e89d3
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
correlation: qa-630a991e-497a-4c78-8a0d-76f08586506c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-630a991e-497a-4c78-8a0d-76f08586506c
Content-Type: application/json

--- request body ---
{"handle":"qa-c6d7ab08de26","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-630a991e-497a-4c78-8a0d-76f08586506c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-630a991e-497a-4c78-8a0d-76f08586506c"}
```
