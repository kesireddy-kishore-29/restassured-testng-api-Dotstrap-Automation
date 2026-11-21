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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-4ee26e22-64c3-4508-829f-9a4d23210fa0` |
| 2 | `POST /v1/auth/token` | 200 | 6 | `qa-148f4ac9-9503-4873-9041-c6e4d9a6ce8c` |
| 3 | `GET /v1/accounts/me` | 200 | 3 | `qa-f1c44d52-3099-43c7-b94e-57a5e58ec681` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-bb4fa382-c866-4641-8828-f2d5bea633c0` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-841e9b1b-1b79-49f6-8b44-5960d54753cf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ee26e22-64c3-4508-829f-9a4d23210fa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ee26e22-64c3-4508-829f-9a4d23210fa0
Content-Type: application/json

--- request body ---
{"handle":"qa-025f488ebc9c","displayName":"QA 025f488ebc9c","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ee26e22-64c3-4508-829f-9a4d23210fa0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-025f488ebc9c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_078a0b63-8e37-4327-8844-40554eef90f9","handle":"qa-025f488ebc9c","displayName":"QA 025f488ebc9c","region":"eu","role":"user","createdAt":"2026-11-18T10:19:40.538690775Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-148f4ac9-9503-4873-9041-c6e4d9a6ce8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-148f4ac9-9503-4873-9041-c6e4d9a6ce8c
Content-Type: application/json

--- request body ---
{"handle":"qa-025f488ebc9c","password":"****"}

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-148f4ac9-9503-4873-9041-c6e4d9a6ce8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_078a0b63-8e37-4327-8844-40554eef90f9"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1c44d52-3099-43c7-b94e-57a5e58ec681

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-f1c44d52-3099-43c7-b94e-57a5e58ec681
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1c44d52-3099-43c7-b94e-57a5e58ec681
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

{"id":"acc_078a0b63-8e37-4327-8844-40554eef90f9","handle":"qa-025f488ebc9c","displayName":"QA 025f488ebc9c","region":"eu","role":"user","createdAt":"2026-11-18T10:19:40.538690775Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb4fa382-c866-4641-8828-f2d5bea633c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb4fa382-c866-4641-8828-f2d5bea633c0
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb4fa382-c866-4641-8828-f2d5bea633c0
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
correlation: qa-841e9b1b-1b79-49f6-8b44-5960d54753cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-841e9b1b-1b79-49f6-8b44-5960d54753cf
Content-Type: application/json

--- request body ---
{"handle":"qa-025f488ebc9c","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-841e9b1b-1b79-49f6-8b44-5960d54753cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-841e9b1b-1b79-49f6-8b44-5960d54753cf"}
```
