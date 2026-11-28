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
| 1 | `POST /v1/accounts` | 201 | 492 | `qa-30825862-ad64-49f6-8af9-358c64483347` |
| 2 | `POST /v1/auth/token` | 200 | 69 | `qa-3ea952f4-5116-4dbf-bfa4-fb5fb0b892af` |
| 3 | `GET /v1/accounts/me` | 200 | 51 | `qa-ae97643c-53e2-4f5d-ac0a-ebe44322c18d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-9333c43b-3811-47e7-977b-00b68073d559` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-8902bf2d-b392-4666-9b5f-e3a030d3ff9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-30825862-ad64-49f6-8af9-358c64483347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30825862-ad64-49f6-8af9-358c64483347
Content-Type: application/json

--- request body ---
{"handle":"qa-d9d5d2f7dc1c","displayName":"QA d9d5d2f7dc1c","password":"****","region":"in"}

--- response: 201 in 492 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-30825862-ad64-49f6-8af9-358c64483347
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
Location: /v1/accounts/qa-d9d5d2f7dc1c
X-Served-Region: in
Content-Length: 181

{"id":"acc_26db3642-c0e9-442e-a3f3-76d5080cce73","handle":"qa-d9d5d2f7dc1c","displayName":"QA d9d5d2f7dc1c","region":"in","role":"user","createdAt":"2026-11-20T10:10:02.180182121Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3ea952f4-5116-4dbf-bfa4-fb5fb0b892af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ea952f4-5116-4dbf-bfa4-fb5fb0b892af
Content-Type: application/json

--- request body ---
{"handle":"qa-d9d5d2f7dc1c","password":"****"}

--- response: 200 in 69 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ea952f4-5116-4dbf-bfa4-fb5fb0b892af
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_26db3642-c0e9-442e-a3f3-76d5080cce73"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae97643c-53e2-4f5d-ac0a-ebe44322c18d

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-ae97643c-53e2-4f5d-ac0a-ebe44322c18d
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae97643c-53e2-4f5d-ac0a-ebe44322c18d
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

{"id":"acc_26db3642-c0e9-442e-a3f3-76d5080cce73","handle":"qa-d9d5d2f7dc1c","displayName":"QA d9d5d2f7dc1c","region":"in","role":"user","createdAt":"2026-11-20T10:10:02.180182121Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9333c43b-3811-47e7-977b-00b68073d559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9333c43b-3811-47e7-977b-00b68073d559
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9333c43b-3811-47e7-977b-00b68073d559
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
correlation: qa-8902bf2d-b392-4666-9b5f-e3a030d3ff9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8902bf2d-b392-4666-9b5f-e3a030d3ff9d
Content-Type: application/json

--- request body ---
{"handle":"qa-d9d5d2f7dc1c","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8902bf2d-b392-4666-9b5f-e3a030d3ff9d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8902bf2d-b392-4666-9b5f-e3a030d3ff9d"}
```
