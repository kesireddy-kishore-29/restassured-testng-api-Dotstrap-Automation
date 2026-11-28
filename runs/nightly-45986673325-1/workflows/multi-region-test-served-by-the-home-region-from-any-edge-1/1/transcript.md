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
| 1 | `POST /v1/accounts` | 201 | 453 | `qa-4ea5d526-ed4b-4362-8c3d-e63881cb2eef` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-e8ff51ff-b8d0-44b7-8c21-9422810a5ca7` |
| 3 | `GET /v1/accounts/me` | 200 | 41 | `qa-fb120a7d-06d8-4eaa-b124-8075f2aa5a73` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-49caaddd-4529-49b7-8efb-00ac877c62c9` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-56346aa9-018c-4777-b790-6c490d79f123` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ea5d526-ed4b-4362-8c3d-e63881cb2eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ea5d526-ed4b-4362-8c3d-e63881cb2eef
Content-Type: application/json

--- request body ---
{"handle":"qa-6357c3f04748","displayName":"QA 6357c3f04748","password":"****","region":"eu"}

--- response: 201 in 453 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ea5d526-ed4b-4362-8c3d-e63881cb2eef
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
Location: /v1/accounts/qa-6357c3f04748
X-Served-Region: eu
Content-Length: 181

{"id":"acc_71c17840-80c3-4d6b-87e2-4969618a70e3","handle":"qa-6357c3f04748","displayName":"QA 6357c3f04748","region":"eu","role":"user","createdAt":"2026-11-27T10:59:52.016950612Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e8ff51ff-b8d0-44b7-8c21-9422810a5ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8ff51ff-b8d0-44b7-8c21-9422810a5ca7
Content-Type: application/json

--- request body ---
{"handle":"qa-6357c3f04748","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8ff51ff-b8d0-44b7-8c21-9422810a5ca7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71c17840-80c3-4d6b-87e2-4969618a70e3"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb120a7d-06d8-4eaa-b124-8075f2aa5a73

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-fb120a7d-06d8-4eaa-b124-8075f2aa5a73
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb120a7d-06d8-4eaa-b124-8075f2aa5a73
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

{"id":"acc_71c17840-80c3-4d6b-87e2-4969618a70e3","handle":"qa-6357c3f04748","displayName":"QA 6357c3f04748","region":"eu","role":"user","createdAt":"2026-11-27T10:59:52.016950612Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-49caaddd-4529-49b7-8efb-00ac877c62c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49caaddd-4529-49b7-8efb-00ac877c62c9
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-49caaddd-4529-49b7-8efb-00ac877c62c9
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
correlation: qa-56346aa9-018c-4777-b790-6c490d79f123

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56346aa9-018c-4777-b790-6c490d79f123
Content-Type: application/json

--- request body ---
{"handle":"qa-6357c3f04748","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56346aa9-018c-4777-b790-6c490d79f123
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56346aa9-018c-4777-b790-6c490d79f123"}
```
