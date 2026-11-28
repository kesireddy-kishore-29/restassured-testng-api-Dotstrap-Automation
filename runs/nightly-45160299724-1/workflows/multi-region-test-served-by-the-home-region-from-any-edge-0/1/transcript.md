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
| 1 | `POST /v1/accounts` | 201 | 402 | `qa-761fa279-7c94-4018-9b13-716919ee1937` |
| 2 | `POST /v1/auth/token` | 200 | 50 | `qa-3a2a4e7d-21c8-432c-a4bf-8249d9ab1cf2` |
| 3 | `GET /v1/accounts/me` | 200 | 52 | `qa-2638c003-0368-4165-94fd-dad1470f34ac` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a9cbf10f-4f05-42a3-a4ce-dab380e5f9a8` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-7205f1e9-927a-4e39-a20f-16fc07e8bd3f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-761fa279-7c94-4018-9b13-716919ee1937

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-761fa279-7c94-4018-9b13-716919ee1937
Content-Type: application/json

--- request body ---
{"handle":"qa-579847e9e178","displayName":"QA 579847e9e178","password":"****","region":"in"}

--- response: 201 in 402 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-761fa279-7c94-4018-9b13-716919ee1937
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-579847e9e178
X-Served-Region: in
Content-Length: 181

{"id":"acc_274563ad-e128-4665-aaaf-e7da79fd996c","handle":"qa-579847e9e178","displayName":"QA 579847e9e178","region":"in","role":"user","createdAt":"2026-11-23T10:55:04.115110975Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3a2a4e7d-21c8-432c-a4bf-8249d9ab1cf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a2a4e7d-21c8-432c-a4bf-8249d9ab1cf2
Content-Type: application/json

--- request body ---
{"handle":"qa-579847e9e178","password":"****"}

--- response: 200 in 50 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a2a4e7d-21c8-432c-a4bf-8249d9ab1cf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_274563ad-e128-4665-aaaf-e7da79fd996c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2638c003-0368-4165-94fd-dad1470f34ac

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-2638c003-0368-4165-94fd-dad1470f34ac
Content-Type: application/json

--- response: 200 in 52 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2638c003-0368-4165-94fd-dad1470f34ac
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

{"id":"acc_274563ad-e128-4665-aaaf-e7da79fd996c","handle":"qa-579847e9e178","displayName":"QA 579847e9e178","region":"in","role":"user","createdAt":"2026-11-23T10:55:04.115110975Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a9cbf10f-4f05-42a3-a4ce-dab380e5f9a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9cbf10f-4f05-42a3-a4ce-dab380e5f9a8
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a9cbf10f-4f05-42a3-a4ce-dab380e5f9a8
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
correlation: qa-7205f1e9-927a-4e39-a20f-16fc07e8bd3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7205f1e9-927a-4e39-a20f-16fc07e8bd3f
Content-Type: application/json

--- request body ---
{"handle":"qa-579847e9e178","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7205f1e9-927a-4e39-a20f-16fc07e8bd3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7205f1e9-927a-4e39-a20f-16fc07e8bd3f"}
```
