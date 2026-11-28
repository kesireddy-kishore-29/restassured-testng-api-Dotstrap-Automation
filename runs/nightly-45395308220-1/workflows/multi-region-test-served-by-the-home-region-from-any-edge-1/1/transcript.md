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
| 1 | `POST /v1/accounts` | 201 | 528 | `qa-d97d4a24-3e91-44e1-905a-4f73f23ca609` |
| 2 | `POST /v1/auth/token` | 200 | 101 | `qa-cb685eee-e18c-4c45-a0d2-6c70ccb65aee` |
| 3 | `GET /v1/accounts/me` | 200 | 77 | `qa-ddbed457-c2b2-40ed-8f0f-9dc3a1ccfb33` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-855b77b8-e8b9-4e40-9dbb-fbce24f3e41d` |
| 5 | `POST /v1/auth/token` | 401 | 36 | `qa-61bf7aa9-2914-4eb0-96a5-de5e849d0607` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d97d4a24-3e91-44e1-905a-4f73f23ca609

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d97d4a24-3e91-44e1-905a-4f73f23ca609
Content-Type: application/json

--- request body ---
{"handle":"qa-83e8b256c643","displayName":"QA 83e8b256c643","password":"****","region":"eu"}

--- response: 201 in 528 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d97d4a24-3e91-44e1-905a-4f73f23ca609
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
Location: /v1/accounts/qa-83e8b256c643
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47ee9f6a-11ab-4e9b-9dca-4281e2ca0f11","handle":"qa-83e8b256c643","displayName":"QA 83e8b256c643","region":"eu","role":"user","createdAt":"2026-11-24T12:38:09.046273148Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cb685eee-e18c-4c45-a0d2-6c70ccb65aee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb685eee-e18c-4c45-a0d2-6c70ccb65aee
Content-Type: application/json

--- request body ---
{"handle":"qa-83e8b256c643","password":"****"}

--- response: 200 in 101 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb685eee-e18c-4c45-a0d2-6c70ccb65aee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47ee9f6a-11ab-4e9b-9dca-4281e2ca0f11"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ddbed457-c2b2-40ed-8f0f-9dc3a1ccfb33

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-ddbed457-c2b2-40ed-8f0f-9dc3a1ccfb33
Content-Type: application/json

--- response: 200 in 77 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddbed457-c2b2-40ed-8f0f-9dc3a1ccfb33
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

{"id":"acc_47ee9f6a-11ab-4e9b-9dca-4281e2ca0f11","handle":"qa-83e8b256c643","displayName":"QA 83e8b256c643","region":"eu","role":"user","createdAt":"2026-11-24T12:38:09.046273148Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-855b77b8-e8b9-4e40-9dbb-fbce24f3e41d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-855b77b8-e8b9-4e40-9dbb-fbce24f3e41d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-855b77b8-e8b9-4e40-9dbb-fbce24f3e41d
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
correlation: qa-61bf7aa9-2914-4eb0-96a5-de5e849d0607

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61bf7aa9-2914-4eb0-96a5-de5e849d0607
Content-Type: application/json

--- request body ---
{"handle":"qa-83e8b256c643","password":"****"}

--- response: 401 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61bf7aa9-2914-4eb0-96a5-de5e849d0607
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61bf7aa9-2914-4eb0-96a5-de5e849d0607"}
```
