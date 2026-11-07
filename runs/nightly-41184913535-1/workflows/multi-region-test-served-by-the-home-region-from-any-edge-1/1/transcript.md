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
| 1 | `POST /v1/accounts` | 201 | 511 | `qa-7cfa0b30-2f6f-4f93-bac7-52948c79af9b` |
| 2 | `POST /v1/auth/token` | 200 | 90 | `qa-8e539ce0-b3ae-47f2-8dd3-88f8b2ffa502` |
| 3 | `GET /v1/accounts/me` | 200 | 75 | `qa-1cc43d32-bb87-4da0-8c76-f737234954cb` |
| 4 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-1a59bc15-16d2-46d0-8602-3ea7a6434109` |
| 5 | `POST /v1/auth/token` | 401 | 48 | `qa-04319581-deb1-4677-be76-d755825634ad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7cfa0b30-2f6f-4f93-bac7-52948c79af9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cfa0b30-2f6f-4f93-bac7-52948c79af9b
Content-Type: application/json

--- request body ---
{"handle":"qa-ca81f3b486e2","displayName":"QA ca81f3b486e2","password":"****","region":"eu"}

--- response: 201 in 511 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cfa0b30-2f6f-4f93-bac7-52948c79af9b
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
Location: /v1/accounts/qa-ca81f3b486e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_912ea3b3-a491-4fb7-a0da-5114d3ce7718","handle":"qa-ca81f3b486e2","displayName":"QA ca81f3b486e2","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.367835998Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8e539ce0-b3ae-47f2-8dd3-88f8b2ffa502

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e539ce0-b3ae-47f2-8dd3-88f8b2ffa502
Content-Type: application/json

--- request body ---
{"handle":"qa-ca81f3b486e2","password":"****"}

--- response: 200 in 90 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e539ce0-b3ae-47f2-8dd3-88f8b2ffa502
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_912ea3b3-a491-4fb7-a0da-5114d3ce7718"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1cc43d32-bb87-4da0-8c76-f737234954cb

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-1cc43d32-bb87-4da0-8c76-f737234954cb
Content-Type: application/json

--- response: 200 in 75 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cc43d32-bb87-4da0-8c76-f737234954cb
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

{"id":"acc_912ea3b3-a491-4fb7-a0da-5114d3ce7718","handle":"qa-ca81f3b486e2","displayName":"QA ca81f3b486e2","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.367835998Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1a59bc15-16d2-46d0-8602-3ea7a6434109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a59bc15-16d2-46d0-8602-3ea7a6434109
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1a59bc15-16d2-46d0-8602-3ea7a6434109
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
correlation: qa-04319581-deb1-4677-be76-d755825634ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04319581-deb1-4677-be76-d755825634ad
Content-Type: application/json

--- request body ---
{"handle":"qa-ca81f3b486e2","password":"****"}

--- response: 401 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04319581-deb1-4677-be76-d755825634ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04319581-deb1-4677-be76-d755825634ad"}
```
