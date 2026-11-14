# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-c9cbe11e-95cd-4f8d-b652-dd5583d1707e` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-2ed909d2-a29f-42cd-a5ea-a63518baa6f8` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-bc60a157-b9ab-446f-a4fc-3af514966c93` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-966531d8-1979-4350-bac2-7c0e65138c42` |
| 5 | `GET /v1/credits/ledger` | 503 | 22 | `qa-c216717c-463e-4093-917d-d57698b52023` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-a486a4ce-0fc4-4908-a5ba-69d7c2e4e5a7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-1f29737c-a444-4cc0-8249-6fb0948eda22` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-293a8ecb-c573-4eeb-b779-b0bd1e790067` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-9980a557-15a8-49fa-8c6b-0a04db70865b` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-518680d3-167f-4a9d-a4d1-4dbbfc527f39` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c9cbe11e-95cd-4f8d-b652-dd5583d1707e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9cbe11e-95cd-4f8d-b652-dd5583d1707e
Content-Type: application/json

--- request body ---
{"handle":"qa-8182efd9d713","displayName":"QA 8182efd9d713","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9cbe11e-95cd-4f8d-b652-dd5583d1707e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-8182efd9d713
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1dd70685-beee-4c00-9f36-3ab73a0b95da","handle":"qa-8182efd9d713","displayName":"QA 8182efd9d713","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.793052574Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2ed909d2-a29f-42cd-a5ea-a63518baa6f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ed909d2-a29f-42cd-a5ea-a63518baa6f8
Content-Type: application/json

--- request body ---
{"handle":"qa-e29ee04a6b96","displayName":"QA e29ee04a6b96","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ed909d2-a29f-42cd-a5ea-a63518baa6f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Location: /v1/accounts/qa-e29ee04a6b96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7cf073e0-2985-4641-ac11-fdf11e5c424d","handle":"qa-e29ee04a6b96","displayName":"QA e29ee04a6b96","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.848630741Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bc60a157-b9ab-446f-a4fc-3af514966c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc60a157-b9ab-446f-a4fc-3af514966c93
Content-Type: application/json

--- request body ---
{"handle":"qa-8182efd9d713","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc60a157-b9ab-446f-a4fc-3af514966c93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1dd70685-beee-4c00-9f36-3ab73a0b95da"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-966531d8-1979-4350-bac2-7c0e65138c42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-966531d8-1979-4350-bac2-7c0e65138c42
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e29ee04a6b96","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-966531d8-1979-4350-bac2-7c0e65138c42
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
Location: /v1/conversations/cnv_581616dd-3d88-4d64-b83f-ea91226d773c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_581616dd-3d88-4d64-b83f-ea91226d773c","subject":"Error contract","status":"open","region":"eu","participants":["qa-8182efd9d713","qa-e29ee04a6b96"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.946818155Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c216717c-463e-4093-917d-d57698b52023

--- request headers ---
Accept: application/json
X-Fault-Key: e8c57d2f-07a1-4008-a31d-e956a5f03c7c
X-Fault: unavailable-once
X-Correlation-Id: qa-c216717c-463e-4093-917d-d57698b52023
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c216717c-463e-4093-917d-d57698b52023
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-c216717c-463e-4093-917d-d57698b52023"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a486a4ce-0fc4-4908-a5ba-69d7c2e4e5a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a486a4ce-0fc4-4908-a5ba-69d7c2e4e5a7
Content-Type: application/json

--- request body ---
{"handle":"qa-e29ee04a6b96","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-a486a4ce-0fc4-4908-a5ba-69d7c2e4e5a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7cf073e0-2985-4641-ac11-fdf11e5c424d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f29737c-a444-4cc0-8249-6fb0948eda22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f29737c-a444-4cc0-8249-6fb0948eda22
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f29737c-a444-4cc0-8249-6fb0948eda22
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-293a8ecb-c573-4eeb-b779-b0bd1e790067

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-293a8ecb-c573-4eeb-b779-b0bd1e790067
Content-Type: application/json

--- request body ---
{"handle":"qa-e29ee04a6b96","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-293a8ecb-c573-4eeb-b779-b0bd1e790067
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-293a8ecb-c573-4eeb-b779-b0bd1e790067"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9980a557-15a8-49fa-8c6b-0a04db70865b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9980a557-15a8-49fa-8c6b-0a04db70865b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9980a557-15a8-49fa-8c6b-0a04db70865b
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-518680d3-167f-4a9d-a4d1-4dbbfc527f39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-518680d3-167f-4a9d-a4d1-4dbbfc527f39
Content-Type: application/json

--- request body ---
{"handle":"qa-8182efd9d713","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-518680d3-167f-4a9d-a4d1-4dbbfc527f39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-518680d3-167f-4a9d-a4d1-4dbbfc527f39"}
```
