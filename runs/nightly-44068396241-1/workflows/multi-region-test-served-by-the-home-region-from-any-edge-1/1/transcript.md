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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-fa89ac86-3731-4ac1-9941-8d976962d22a` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-53819575-94b5-4b48-a2cd-760359877e55` |
| 3 | `GET /v1/accounts/me` | 200 | 4 | `qa-8b23567f-5f2f-4e2b-85d7-d9941b485546` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-cf36a9a8-8473-4eb5-ae70-61edbef3d9cb` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-ebe3459a-9002-47e0-b180-20700dd87280` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fa89ac86-3731-4ac1-9941-8d976962d22a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa89ac86-3731-4ac1-9941-8d976962d22a
Content-Type: application/json

--- request body ---
{"handle":"qa-05685d71151f","displayName":"QA 05685d71151f","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa89ac86-3731-4ac1-9941-8d976962d22a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-05685d71151f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5e28fb1-87b2-4df7-9ad7-f3bd431a79de","handle":"qa-05685d71151f","displayName":"QA 05685d71151f","region":"eu","role":"user","createdAt":"2026-11-17T10:50:09.004078910Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-53819575-94b5-4b48-a2cd-760359877e55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53819575-94b5-4b48-a2cd-760359877e55
Content-Type: application/json

--- request body ---
{"handle":"qa-05685d71151f","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-53819575-94b5-4b48-a2cd-760359877e55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5e28fb1-87b2-4df7-9ad7-f3bd431a79de"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b23567f-5f2f-4e2b-85d7-d9941b485546

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-8b23567f-5f2f-4e2b-85d7-d9941b485546
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b23567f-5f2f-4e2b-85d7-d9941b485546
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

{"id":"acc_b5e28fb1-87b2-4df7-9ad7-f3bd431a79de","handle":"qa-05685d71151f","displayName":"QA 05685d71151f","region":"eu","role":"user","createdAt":"2026-11-17T10:50:09.004078910Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf36a9a8-8473-4eb5-ae70-61edbef3d9cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf36a9a8-8473-4eb5-ae70-61edbef3d9cb
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf36a9a8-8473-4eb5-ae70-61edbef3d9cb
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
correlation: qa-ebe3459a-9002-47e0-b180-20700dd87280

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebe3459a-9002-47e0-b180-20700dd87280
Content-Type: application/json

--- request body ---
{"handle":"qa-05685d71151f","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebe3459a-9002-47e0-b180-20700dd87280
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ebe3459a-9002-47e0-b180-20700dd87280"}
```
