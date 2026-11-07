# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-7eb7e520-1b9f-43b6-88a7-55cde36d4b25` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-dc5c9b40-c9cc-4cad-9970-12bc25812db7` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-d9e2aa17-118b-41ef-aa0a-bfd61949944e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-b13b930c-0353-4d8f-bc88-390b5ef62f5f` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-0e680218-93c0-44c9-b7f4-3f7a782586a0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7eb7e520-1b9f-43b6-88a7-55cde36d4b25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eb7e520-1b9f-43b6-88a7-55cde36d4b25
Content-Type: application/json

--- request body ---
{"handle":"qa-a89c4cd5c1ac","displayName":"QA a89c4cd5c1ac","password":"****","region":"us"}

--- response: 201 in 22 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eb7e520-1b9f-43b6-88a7-55cde36d4b25
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
Location: /v1/accounts/qa-a89c4cd5c1ac
X-Served-Region: us
Content-Length: 181

{"id":"acc_5e644816-f471-4dbc-a90d-b708d2b9f325","handle":"qa-a89c4cd5c1ac","displayName":"QA a89c4cd5c1ac","region":"us","role":"user","createdAt":"2026-11-07T08:55:04.443488574Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dc5c9b40-c9cc-4cad-9970-12bc25812db7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc5c9b40-c9cc-4cad-9970-12bc25812db7
Content-Type: application/json

--- request body ---
{"handle":"qa-a89c4cd5c1ac","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc5c9b40-c9cc-4cad-9970-12bc25812db7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e644816-f471-4dbc-a90d-b708d2b9f325"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9e2aa17-118b-41ef-aa0a-bfd61949944e

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-d9e2aa17-118b-41ef-aa0a-bfd61949944e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9e2aa17-118b-41ef-aa0a-bfd61949944e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_5e644816-f471-4dbc-a90d-b708d2b9f325","handle":"qa-a89c4cd5c1ac","displayName":"QA a89c4cd5c1ac","region":"us","role":"user","createdAt":"2026-11-07T08:55:04.443488574Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b13b930c-0353-4d8f-bc88-390b5ef62f5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b13b930c-0353-4d8f-bc88-390b5ef62f5f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b13b930c-0353-4d8f-bc88-390b5ef62f5f
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0e680218-93c0-44c9-b7f4-3f7a782586a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e680218-93c0-44c9-b7f4-3f7a782586a0
Content-Type: application/json

--- request body ---
{"handle":"qa-a89c4cd5c1ac","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e680218-93c0-44c9-b7f4-3f7a782586a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e680218-93c0-44c9-b7f4-3f7a782586a0"}
```
