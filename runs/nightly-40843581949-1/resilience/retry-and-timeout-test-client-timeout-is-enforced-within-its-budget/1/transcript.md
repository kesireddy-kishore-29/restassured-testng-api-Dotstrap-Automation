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
| 1 | `POST /v1/accounts` | 201 | 399 | `qa-1e16454f-6f20-4286-9d49-f61efdacddeb` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-80b2d4a8-3f92-4052-95f2-fe35073ea05c` |
| 3 | `GET /v1/accounts/me` | error | 833 | `qa-d2b7849e-bfbd-42a1-8f41-cae66d043de7` |
| 4 | `GET /v1/accounts/me` | error | 816 | `qa-7eeb12bf-14a7-4e36-b895-c26ad17411e9` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-cd1249e0-7e7f-4cf5-af66-9c61b17ce758` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-a7ff3962-8b18-45c0-a3ad-448c0ede024e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1e16454f-6f20-4286-9d49-f61efdacddeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e16454f-6f20-4286-9d49-f61efdacddeb
Content-Type: application/json

--- request body ---
{"handle":"qa-51bbe712065f","displayName":"QA 51bbe712065f","password":"****","region":"eu"}

--- response: 201 in 399 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e16454f-6f20-4286-9d49-f61efdacddeb
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
Location: /v1/accounts/qa-51bbe712065f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a183c628-2366-4cf9-916a-5ea2ab3371f2","handle":"qa-51bbe712065f","displayName":"QA 51bbe712065f","region":"eu","role":"user","createdAt":"2026-10-29T08:38:56.650013929Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-80b2d4a8-3f92-4052-95f2-fe35073ea05c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b2d4a8-3f92-4052-95f2-fe35073ea05c
Content-Type: application/json

--- request body ---
{"handle":"qa-51bbe712065f","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-80b2d4a8-3f92-4052-95f2-fe35073ea05c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a183c628-2366-4cf9-916a-5ea2ab3371f2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2b7849e-bfbd-42a1-8f41-cae66d043de7

--- request headers ---
Accept: application/json
X-Fault-Key: a69ade8b-5ce3-484e-8899-8cae7ded02e5
X-Fault: latency=4000
X-Correlation-Id: qa-d2b7849e-bfbd-42a1-8f41-cae66d043de7
Content-Type: application/json

--- response: none in 833 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-7eeb12bf-14a7-4e36-b895-c26ad17411e9

--- request headers ---
Accept: application/json
X-Fault-Key: a69ade8b-5ce3-484e-8899-8cae7ded02e5
X-Fault: latency=4000
X-Correlation-Id: qa-7eeb12bf-14a7-4e36-b895-c26ad17411e9
Content-Type: application/json

--- response: none in 816 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd1249e0-7e7f-4cf5-af66-9c61b17ce758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd1249e0-7e7f-4cf5-af66-9c61b17ce758
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd1249e0-7e7f-4cf5-af66-9c61b17ce758
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
correlation: qa-a7ff3962-8b18-45c0-a3ad-448c0ede024e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7ff3962-8b18-45c0-a3ad-448c0ede024e
Content-Type: application/json

--- request body ---
{"handle":"qa-51bbe712065f","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7ff3962-8b18-45c0-a3ad-448c0ede024e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a7ff3962-8b18-45c0-a3ad-448c0ede024e"}
```
