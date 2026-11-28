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
| 1 | `POST /v1/accounts` | 201 | 442 | `qa-ef4f8abb-8eef-49d6-ab14-86a265909cdd` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-edaa8d9f-15ff-4601-bce6-39f9e35acd7a` |
| 3 | `GET /v1/accounts/me` | 200 | 39 | `qa-1504a57b-e5a5-40a6-9699-3b02e6eed7ab` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-2da56831-37f9-4929-9202-1f719f2d1731` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-f5b77d46-521a-499b-862d-b83d3a3aeb45` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ef4f8abb-8eef-49d6-ab14-86a265909cdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef4f8abb-8eef-49d6-ab14-86a265909cdd
Content-Type: application/json

--- request body ---
{"handle":"qa-6f3cd0ff76cb","displayName":"QA 6f3cd0ff76cb","password":"****","region":"us"}

--- response: 201 in 442 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef4f8abb-8eef-49d6-ab14-86a265909cdd
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
Location: /v1/accounts/qa-6f3cd0ff76cb
X-Served-Region: us
Content-Length: 181

{"id":"acc_7067b237-4acf-4a71-87e2-78047bc7b77a","handle":"qa-6f3cd0ff76cb","displayName":"QA 6f3cd0ff76cb","region":"us","role":"user","createdAt":"2026-11-27T10:59:51.953595671Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-edaa8d9f-15ff-4601-bce6-39f9e35acd7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edaa8d9f-15ff-4601-bce6-39f9e35acd7a
Content-Type: application/json

--- request body ---
{"handle":"qa-6f3cd0ff76cb","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-edaa8d9f-15ff-4601-bce6-39f9e35acd7a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7067b237-4acf-4a71-87e2-78047bc7b77a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1504a57b-e5a5-40a6-9699-3b02e6eed7ab

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-1504a57b-e5a5-40a6-9699-3b02e6eed7ab
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1504a57b-e5a5-40a6-9699-3b02e6eed7ab
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

{"id":"acc_7067b237-4acf-4a71-87e2-78047bc7b77a","handle":"qa-6f3cd0ff76cb","displayName":"QA 6f3cd0ff76cb","region":"us","role":"user","createdAt":"2026-11-27T10:59:51.953595671Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2da56831-37f9-4929-9202-1f719f2d1731

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2da56831-37f9-4929-9202-1f719f2d1731
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2da56831-37f9-4929-9202-1f719f2d1731
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
correlation: qa-f5b77d46-521a-499b-862d-b83d3a3aeb45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5b77d46-521a-499b-862d-b83d3a3aeb45
Content-Type: application/json

--- request body ---
{"handle":"qa-6f3cd0ff76cb","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5b77d46-521a-499b-862d-b83d3a3aeb45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f5b77d46-521a-499b-862d-b83d3a3aeb45"}
```
