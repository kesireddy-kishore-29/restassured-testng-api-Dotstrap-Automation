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
| 1 | `POST /v1/accounts` | 201 | 493 | `qa-6831a756-ec65-4860-811d-818cba0d22a4` |
| 2 | `POST /v1/auth/token` | 200 | 78 | `qa-c4d8217c-5497-4d74-8ada-0696f4c2ebf3` |
| 3 | `GET /v1/accounts/me` | 200 | 64 | `qa-7098d339-9fdd-4349-ad3c-81d3100770f2` |
| 4 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-6b3d6142-98a4-4774-9d10-57d6eb76dd29` |
| 5 | `POST /v1/auth/token` | 401 | 24 | `qa-547e0c4b-2377-4388-82bb-0ca2bd4a53e1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6831a756-ec65-4860-811d-818cba0d22a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6831a756-ec65-4860-811d-818cba0d22a4
Content-Type: application/json

--- request body ---
{"handle":"qa-b29ad4cf8a59","displayName":"QA b29ad4cf8a59","password":"****","region":"us"}

--- response: 201 in 493 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-6831a756-ec65-4860-811d-818cba0d22a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-b29ad4cf8a59
X-Served-Region: us
Content-Length: 181

{"id":"acc_d4a099fd-6d24-47ab-abe7-0e8160815f1a","handle":"qa-b29ad4cf8a59","displayName":"QA b29ad4cf8a59","region":"us","role":"user","createdAt":"2026-11-19T10:29:44.353038597Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c4d8217c-5497-4d74-8ada-0696f4c2ebf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4d8217c-5497-4d74-8ada-0696f4c2ebf3
Content-Type: application/json

--- request body ---
{"handle":"qa-b29ad4cf8a59","password":"****"}

--- response: 200 in 78 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4d8217c-5497-4d74-8ada-0696f4c2ebf3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d4a099fd-6d24-47ab-abe7-0e8160815f1a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-7098d339-9fdd-4349-ad3c-81d3100770f2

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-7098d339-9fdd-4349-ad3c-81d3100770f2
Content-Type: application/json

--- response: 200 in 64 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7098d339-9fdd-4349-ad3c-81d3100770f2
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

{"id":"acc_d4a099fd-6d24-47ab-abe7-0e8160815f1a","handle":"qa-b29ad4cf8a59","displayName":"QA b29ad4cf8a59","region":"us","role":"user","createdAt":"2026-11-19T10:29:44.353038597Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b3d6142-98a4-4774-9d10-57d6eb76dd29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b3d6142-98a4-4774-9d10-57d6eb76dd29
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b3d6142-98a4-4774-9d10-57d6eb76dd29
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
correlation: qa-547e0c4b-2377-4388-82bb-0ca2bd4a53e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-547e0c4b-2377-4388-82bb-0ca2bd4a53e1
Content-Type: application/json

--- request body ---
{"handle":"qa-b29ad4cf8a59","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-547e0c4b-2377-4388-82bb-0ca2bd4a53e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-547e0c4b-2377-4388-82bb-0ca2bd4a53e1"}
```
