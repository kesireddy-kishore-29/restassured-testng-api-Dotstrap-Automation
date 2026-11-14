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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-f63bfe11-517d-4eb0-8602-4daf51f1e14e` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-3da2ed0f-663c-426f-8241-880af84117ce` |
| 3 | `GET /v1/accounts/me` | error | 810 | `qa-75d10097-a2c8-423c-99f0-9347efafb03d` |
| 4 | `GET /v1/accounts/me` | error | 804 | `qa-f07c7d3e-3830-408c-8b03-fc3d9fd457aa` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-1def5f59-635f-41bd-a350-b72d1dc82611` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-f1fab928-51f0-46e3-9999-e766c62e7562` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f63bfe11-517d-4eb0-8602-4daf51f1e14e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f63bfe11-517d-4eb0-8602-4daf51f1e14e
Content-Type: application/json

--- request body ---
{"handle":"qa-d95184d1f434","displayName":"QA d95184d1f434","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f63bfe11-517d-4eb0-8602-4daf51f1e14e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-d95184d1f434
X-Served-Region: eu
Content-Length: 181

{"id":"acc_84d9eb22-5ea4-40f9-994a-3b625a0c2513","handle":"qa-d95184d1f434","displayName":"QA d95184d1f434","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.319894946Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3da2ed0f-663c-426f-8241-880af84117ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3da2ed0f-663c-426f-8241-880af84117ce
Content-Type: application/json

--- request body ---
{"handle":"qa-d95184d1f434","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3da2ed0f-663c-426f-8241-880af84117ce
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_84d9eb22-5ea4-40f9-994a-3b625a0c2513"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-75d10097-a2c8-423c-99f0-9347efafb03d

--- request headers ---
Accept: application/json
X-Fault-Key: b6b6e2da-8b5c-4d48-b6df-3252105c00fe
X-Fault: latency=4000
X-Correlation-Id: qa-75d10097-a2c8-423c-99f0-9347efafb03d
Content-Type: application/json

--- response: none in 810 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-f07c7d3e-3830-408c-8b03-fc3d9fd457aa

--- request headers ---
Accept: application/json
X-Fault-Key: b6b6e2da-8b5c-4d48-b6df-3252105c00fe
X-Fault: latency=4000
X-Correlation-Id: qa-f07c7d3e-3830-408c-8b03-fc3d9fd457aa
Content-Type: application/json

--- response: none in 804 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1def5f59-635f-41bd-a350-b72d1dc82611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1def5f59-635f-41bd-a350-b72d1dc82611
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1def5f59-635f-41bd-a350-b72d1dc82611
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
correlation: qa-f1fab928-51f0-46e3-9999-e766c62e7562

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1fab928-51f0-46e3-9999-e766c62e7562
Content-Type: application/json

--- request body ---
{"handle":"qa-d95184d1f434","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1fab928-51f0-46e3-9999-e766c62e7562
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1fab928-51f0-46e3-9999-e766c62e7562"}
```
