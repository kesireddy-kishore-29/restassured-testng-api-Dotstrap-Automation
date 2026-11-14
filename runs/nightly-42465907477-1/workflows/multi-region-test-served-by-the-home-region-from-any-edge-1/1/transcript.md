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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-766739e1-7011-43e7-9133-90f79db02810` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-f0f82453-5d49-4212-9a3d-2ebf9f900dc4` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-5c25daa9-7fe5-4428-8100-3a179523e721` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-4c814388-eab2-4315-97bc-db48f405f8e9` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-a9c78666-a11b-4707-a951-02da55ab531b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-766739e1-7011-43e7-9133-90f79db02810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-766739e1-7011-43e7-9133-90f79db02810
Content-Type: application/json

--- request body ---
{"handle":"qa-fd2ae87eb24f","displayName":"QA fd2ae87eb24f","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-766739e1-7011-43e7-9133-90f79db02810
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-fd2ae87eb24f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5beb12a1-ec9d-4fbd-b22e-9b8490464e39","handle":"qa-fd2ae87eb24f","displayName":"QA fd2ae87eb24f","region":"eu","role":"user","createdAt":"2026-11-08T09:09:10.458349873Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f0f82453-5d49-4212-9a3d-2ebf9f900dc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0f82453-5d49-4212-9a3d-2ebf9f900dc4
Content-Type: application/json

--- request body ---
{"handle":"qa-fd2ae87eb24f","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0f82453-5d49-4212-9a3d-2ebf9f900dc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5beb12a1-ec9d-4fbd-b22e-9b8490464e39"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c25daa9-7fe5-4428-8100-3a179523e721

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-5c25daa9-7fe5-4428-8100-3a179523e721
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c25daa9-7fe5-4428-8100-3a179523e721
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

{"id":"acc_5beb12a1-ec9d-4fbd-b22e-9b8490464e39","handle":"qa-fd2ae87eb24f","displayName":"QA fd2ae87eb24f","region":"eu","role":"user","createdAt":"2026-11-08T09:09:10.458349873Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c814388-eab2-4315-97bc-db48f405f8e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c814388-eab2-4315-97bc-db48f405f8e9
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c814388-eab2-4315-97bc-db48f405f8e9
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
correlation: qa-a9c78666-a11b-4707-a951-02da55ab531b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9c78666-a11b-4707-a951-02da55ab531b
Content-Type: application/json

--- request body ---
{"handle":"qa-fd2ae87eb24f","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9c78666-a11b-4707-a951-02da55ab531b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9c78666-a11b-4707-a951-02da55ab531b"}
```
