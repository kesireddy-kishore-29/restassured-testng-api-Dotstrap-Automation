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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-36ad4876-fb6d-45c4-8a5a-7f2ef964a9c2` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-27ac449b-1ddf-4592-b87d-28d93c0b8693` |
| 3 | `GET /v1/accounts/me` | error | 811 | `qa-084ffb0b-f537-4f67-b351-d73e154be462` |
| 4 | `GET /v1/accounts/me` | error | 805 | `qa-4a0a0930-d976-45bf-891e-b7acb23c6de5` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-db5ed392-baea-481e-b385-f831cfb99428` |
| 6 | `POST /v1/auth/token` | 401 | 3 | `qa-ca4fcf62-1c9a-4616-86e8-8c60885f63c2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-36ad4876-fb6d-45c4-8a5a-7f2ef964a9c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36ad4876-fb6d-45c4-8a5a-7f2ef964a9c2
Content-Type: application/json

--- request body ---
{"handle":"qa-01719b9fb16c","displayName":"QA 01719b9fb16c","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-36ad4876-fb6d-45c4-8a5a-7f2ef964a9c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-01719b9fb16c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9b5b21f-0fb5-41c3-b467-15c68b141fc6","handle":"qa-01719b9fb16c","displayName":"QA 01719b9fb16c","region":"eu","role":"user","createdAt":"2026-11-27T10:59:48.981828674Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-27ac449b-1ddf-4592-b87d-28d93c0b8693

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27ac449b-1ddf-4592-b87d-28d93c0b8693
Content-Type: application/json

--- request body ---
{"handle":"qa-01719b9fb16c","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-27ac449b-1ddf-4592-b87d-28d93c0b8693
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9b5b21f-0fb5-41c3-b467-15c68b141fc6"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-084ffb0b-f537-4f67-b351-d73e154be462

--- request headers ---
Accept: application/json
X-Fault-Key: 56dc98b9-6803-45ab-990f-b342d3e638dc
X-Fault: latency=4000
X-Correlation-Id: qa-084ffb0b-f537-4f67-b351-d73e154be462
Content-Type: application/json

--- response: none in 811 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a0a0930-d976-45bf-891e-b7acb23c6de5

--- request headers ---
Accept: application/json
X-Fault-Key: 56dc98b9-6803-45ab-990f-b342d3e638dc
X-Fault: latency=4000
X-Correlation-Id: qa-4a0a0930-d976-45bf-891e-b7acb23c6de5
Content-Type: application/json

--- response: none in 805 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-db5ed392-baea-481e-b385-f831cfb99428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db5ed392-baea-481e-b385-f831cfb99428
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-db5ed392-baea-481e-b385-f831cfb99428
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
correlation: qa-ca4fcf62-1c9a-4616-86e8-8c60885f63c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca4fcf62-1c9a-4616-86e8-8c60885f63c2
Content-Type: application/json

--- request body ---
{"handle":"qa-01719b9fb16c","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca4fcf62-1c9a-4616-86e8-8c60885f63c2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca4fcf62-1c9a-4616-86e8-8c60885f63c2"}
```
