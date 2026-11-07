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
| 1 | `POST /v1/accounts` | 201 | 383 | `qa-506d29bb-de90-48c7-be59-42b2735ac8dd` |
| 2 | `POST /v1/auth/token` | 200 | 72 | `qa-fdd527bf-9f7a-4166-bbbe-619018ebc736` |
| 3 | `GET /v1/accounts/me` | 200 | 25 | `qa-c2ac1296-c2ec-4d8c-952e-06f3ab8ce39d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-0381cbda-2c3d-4120-a66f-546b9e126017` |
| 5 | `POST /v1/auth/token` | 401 | 31 | `qa-6e66c6b8-ae7a-42c3-ab3c-b8b033722e49` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-506d29bb-de90-48c7-be59-42b2735ac8dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506d29bb-de90-48c7-be59-42b2735ac8dd
Content-Type: application/json

--- request body ---
{"handle":"qa-e8424ef2d509","displayName":"QA e8424ef2d509","password":"****","region":"eu"}

--- response: 201 in 383 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-506d29bb-de90-48c7-be59-42b2735ac8dd
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
Location: /v1/accounts/qa-e8424ef2d509
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44dcffd5-a80b-4ac0-86c3-07c64b2cdab2","handle":"qa-e8424ef2d509","displayName":"QA e8424ef2d509","region":"eu","role":"user","createdAt":"2026-11-02T09:38:48.609931522Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fdd527bf-9f7a-4166-bbbe-619018ebc736

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdd527bf-9f7a-4166-bbbe-619018ebc736
Content-Type: application/json

--- request body ---
{"handle":"qa-e8424ef2d509","password":"****"}

--- response: 200 in 72 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdd527bf-9f7a-4166-bbbe-619018ebc736
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44dcffd5-a80b-4ac0-86c3-07c64b2cdab2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c2ac1296-c2ec-4d8c-952e-06f3ab8ce39d

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-c2ac1296-c2ec-4d8c-952e-06f3ab8ce39d
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2ac1296-c2ec-4d8c-952e-06f3ab8ce39d
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

{"id":"acc_44dcffd5-a80b-4ac0-86c3-07c64b2cdab2","handle":"qa-e8424ef2d509","displayName":"QA e8424ef2d509","region":"eu","role":"user","createdAt":"2026-11-02T09:38:48.609931522Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0381cbda-2c3d-4120-a66f-546b9e126017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0381cbda-2c3d-4120-a66f-546b9e126017
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0381cbda-2c3d-4120-a66f-546b9e126017
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
correlation: qa-6e66c6b8-ae7a-42c3-ab3c-b8b033722e49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e66c6b8-ae7a-42c3-ab3c-b8b033722e49
Content-Type: application/json

--- request body ---
{"handle":"qa-e8424ef2d509","password":"****"}

--- response: 401 in 31 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e66c6b8-ae7a-42c3-ab3c-b8b033722e49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e66c6b8-ae7a-42c3-ab3c-b8b033722e49"}
```
