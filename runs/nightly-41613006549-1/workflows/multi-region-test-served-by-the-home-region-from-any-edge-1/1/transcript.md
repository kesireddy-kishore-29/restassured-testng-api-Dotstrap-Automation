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
| 1 | `POST /v1/accounts` | 201 | 302 | `qa-e160bd6d-2b95-4777-8ce0-cb45700a4683` |
| 2 | `POST /v1/auth/token` | 200 | 94 | `qa-422eae6a-73fd-4986-aa80-879820c3032a` |
| 3 | `GET /v1/accounts/me` | 200 | 69 | `qa-05f60c21-c002-4e7c-a3bd-dcaa314e7191` |
| 4 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-9544998e-7775-4bdd-87b4-977897f32376` |
| 5 | `POST /v1/auth/token` | 401 | 21 | `qa-94906643-8420-4449-90bb-a0769ade31b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e160bd6d-2b95-4777-8ce0-cb45700a4683

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e160bd6d-2b95-4777-8ce0-cb45700a4683
Content-Type: application/json

--- request body ---
{"handle":"qa-30f25447fa47","displayName":"QA 30f25447fa47","password":"****","region":"eu"}

--- response: 201 in 302 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e160bd6d-2b95-4777-8ce0-cb45700a4683
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-30f25447fa47
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89eb8040-1967-4fe6-b5fb-378ab8025b4d","handle":"qa-30f25447fa47","displayName":"QA 30f25447fa47","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.447945927Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-422eae6a-73fd-4986-aa80-879820c3032a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-422eae6a-73fd-4986-aa80-879820c3032a
Content-Type: application/json

--- request body ---
{"handle":"qa-30f25447fa47","password":"****"}

--- response: 200 in 94 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-422eae6a-73fd-4986-aa80-879820c3032a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89eb8040-1967-4fe6-b5fb-378ab8025b4d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-05f60c21-c002-4e7c-a3bd-dcaa314e7191

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-05f60c21-c002-4e7c-a3bd-dcaa314e7191
Content-Type: application/json

--- response: 200 in 69 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-05f60c21-c002-4e7c-a3bd-dcaa314e7191
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

{"id":"acc_89eb8040-1967-4fe6-b5fb-378ab8025b4d","handle":"qa-30f25447fa47","displayName":"QA 30f25447fa47","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.447945927Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9544998e-7775-4bdd-87b4-977897f32376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9544998e-7775-4bdd-87b4-977897f32376
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9544998e-7775-4bdd-87b4-977897f32376
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
correlation: qa-94906643-8420-4449-90bb-a0769ade31b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94906643-8420-4449-90bb-a0769ade31b3
Content-Type: application/json

--- request body ---
{"handle":"qa-30f25447fa47","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94906643-8420-4449-90bb-a0769ade31b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94906643-8420-4449-90bb-a0769ade31b3"}
```
