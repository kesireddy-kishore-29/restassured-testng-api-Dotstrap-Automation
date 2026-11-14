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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-1b905063-fe68-4546-92d7-835cce94501e` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-425248ab-3288-4f4e-bb31-a715d978a3b3` |
| 3 | `GET /v1/accounts/me` | 200 | 3 | `qa-79e305f7-1dbd-4ee7-84d9-7c2c8056b425` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-27b685b0-aef5-4761-9472-96a6dbe1ba0d` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-5be211b2-67c2-412c-8c24-ec6c89b4a60a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1b905063-fe68-4546-92d7-835cce94501e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b905063-fe68-4546-92d7-835cce94501e
Content-Type: application/json

--- request body ---
{"handle":"qa-e491feb460e6","displayName":"QA e491feb460e6","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b905063-fe68-4546-92d7-835cce94501e
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
Location: /v1/accounts/qa-e491feb460e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a9b8923-3230-4eac-8fc0-b03f75d8a151","handle":"qa-e491feb460e6","displayName":"QA e491feb460e6","region":"eu","role":"user","createdAt":"2026-11-10T09:59:34.202922650Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-425248ab-3288-4f4e-bb31-a715d978a3b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-425248ab-3288-4f4e-bb31-a715d978a3b3
Content-Type: application/json

--- request body ---
{"handle":"qa-e491feb460e6","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-425248ab-3288-4f4e-bb31-a715d978a3b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a9b8923-3230-4eac-8fc0-b03f75d8a151"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-79e305f7-1dbd-4ee7-84d9-7c2c8056b425

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-79e305f7-1dbd-4ee7-84d9-7c2c8056b425
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-79e305f7-1dbd-4ee7-84d9-7c2c8056b425
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

{"id":"acc_7a9b8923-3230-4eac-8fc0-b03f75d8a151","handle":"qa-e491feb460e6","displayName":"QA e491feb460e6","region":"eu","role":"user","createdAt":"2026-11-10T09:59:34.202922650Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27b685b0-aef5-4761-9472-96a6dbe1ba0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27b685b0-aef5-4761-9472-96a6dbe1ba0d
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27b685b0-aef5-4761-9472-96a6dbe1ba0d
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
correlation: qa-5be211b2-67c2-412c-8c24-ec6c89b4a60a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5be211b2-67c2-412c-8c24-ec6c89b4a60a
Content-Type: application/json

--- request body ---
{"handle":"qa-e491feb460e6","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5be211b2-67c2-412c-8c24-ec6c89b4a60a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5be211b2-67c2-412c-8c24-ec6c89b4a60a"}
```
