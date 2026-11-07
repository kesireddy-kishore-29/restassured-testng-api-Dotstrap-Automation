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
| 1 | `POST /v1/accounts` | 201 | 298 | `qa-8d5fadda-1f06-4c20-b636-50bdefc6096a` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-a8015472-6756-4b87-8e41-9c653c08e925` |
| 3 | `GET /v1/accounts/me` | 200 | 82 | `qa-1d8be87a-de6b-4475-bf89-0c95cf9cc416` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1d8b1481-c7c7-4460-8009-4e6ebca343cc` |
| 5 | `POST /v1/auth/token` | 401 | 24 | `qa-ad5046bd-e30e-45a7-a7ad-6781f657610f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8d5fadda-1f06-4c20-b636-50bdefc6096a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d5fadda-1f06-4c20-b636-50bdefc6096a
Content-Type: application/json

--- request body ---
{"handle":"qa-cd651dc8b16b","displayName":"QA cd651dc8b16b","password":"****","region":"in"}

--- response: 201 in 298 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d5fadda-1f06-4c20-b636-50bdefc6096a
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
Location: /v1/accounts/qa-cd651dc8b16b
X-Served-Region: in
Content-Length: 181

{"id":"acc_c9b97890-fff5-4452-bbb6-246010bc0f3d","handle":"qa-cd651dc8b16b","displayName":"QA cd651dc8b16b","region":"in","role":"user","createdAt":"2026-11-03T09:41:33.457510500Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a8015472-6756-4b87-8e41-9c653c08e925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8015472-6756-4b87-8e41-9c653c08e925
Content-Type: application/json

--- request body ---
{"handle":"qa-cd651dc8b16b","password":"****"}

--- response: 200 in 55 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8015472-6756-4b87-8e41-9c653c08e925
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9b97890-fff5-4452-bbb6-246010bc0f3d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d8be87a-de6b-4475-bf89-0c95cf9cc416

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-1d8be87a-de6b-4475-bf89-0c95cf9cc416
Content-Type: application/json

--- response: 200 in 82 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d8be87a-de6b-4475-bf89-0c95cf9cc416
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

{"id":"acc_c9b97890-fff5-4452-bbb6-246010bc0f3d","handle":"qa-cd651dc8b16b","displayName":"QA cd651dc8b16b","region":"in","role":"user","createdAt":"2026-11-03T09:41:33.457510500Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d8b1481-c7c7-4460-8009-4e6ebca343cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d8b1481-c7c7-4460-8009-4e6ebca343cc
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d8b1481-c7c7-4460-8009-4e6ebca343cc
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
correlation: qa-ad5046bd-e30e-45a7-a7ad-6781f657610f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad5046bd-e30e-45a7-a7ad-6781f657610f
Content-Type: application/json

--- request body ---
{"handle":"qa-cd651dc8b16b","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad5046bd-e30e-45a7-a7ad-6781f657610f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad5046bd-e30e-45a7-a7ad-6781f657610f"}
```
