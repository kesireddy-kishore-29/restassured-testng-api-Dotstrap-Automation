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
| 1 | `POST /v1/accounts` | 201 | 365 | `qa-b37204cf-01a9-460e-ae5e-493979a13749` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-7debd6e5-3053-491a-bd4f-b7655eac3789` |
| 3 | `GET /v1/accounts/me` | 200 | 29 | `qa-047969b7-d15f-4e02-9ef7-d495005fbe10` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-bb4cd118-cfe0-44e3-8c1a-e6e11b7ee203` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-86b93c99-e9e8-43f7-8886-4740e53dcce3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b37204cf-01a9-460e-ae5e-493979a13749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b37204cf-01a9-460e-ae5e-493979a13749
Content-Type: application/json

--- request body ---
{"handle":"qa-d055e9d3ac33","displayName":"QA d055e9d3ac33","password":"****","region":"us"}

--- response: 201 in 365 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-b37204cf-01a9-460e-ae5e-493979a13749
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
Location: /v1/accounts/qa-d055e9d3ac33
X-Served-Region: us
Content-Length: 181

{"id":"acc_a0f5c2f1-f074-431b-a00f-8a90bbd7c7bb","handle":"qa-d055e9d3ac33","displayName":"QA d055e9d3ac33","region":"us","role":"user","createdAt":"2026-11-14T09:05:19.249606072Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7debd6e5-3053-491a-bd4f-b7655eac3789

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7debd6e5-3053-491a-bd4f-b7655eac3789
Content-Type: application/json

--- request body ---
{"handle":"qa-d055e9d3ac33","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-7debd6e5-3053-491a-bd4f-b7655eac3789
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a0f5c2f1-f074-431b-a00f-8a90bbd7c7bb"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-047969b7-d15f-4e02-9ef7-d495005fbe10

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-047969b7-d15f-4e02-9ef7-d495005fbe10
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-047969b7-d15f-4e02-9ef7-d495005fbe10
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

{"id":"acc_a0f5c2f1-f074-431b-a00f-8a90bbd7c7bb","handle":"qa-d055e9d3ac33","displayName":"QA d055e9d3ac33","region":"us","role":"user","createdAt":"2026-11-14T09:05:19.249606072Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb4cd118-cfe0-44e3-8c1a-e6e11b7ee203

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb4cd118-cfe0-44e3-8c1a-e6e11b7ee203
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb4cd118-cfe0-44e3-8c1a-e6e11b7ee203
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
correlation: qa-86b93c99-e9e8-43f7-8886-4740e53dcce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86b93c99-e9e8-43f7-8886-4740e53dcce3
Content-Type: application/json

--- request body ---
{"handle":"qa-d055e9d3ac33","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86b93c99-e9e8-43f7-8886-4740e53dcce3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-86b93c99-e9e8-43f7-8886-4740e53dcce3"}
```
