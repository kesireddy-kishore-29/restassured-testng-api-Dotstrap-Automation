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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-1a916651-647c-4cb5-a8ce-351a023c48b1` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-150994bc-2419-4e33-bd4d-2966cf418571` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-99458a6c-e4ec-4362-ad76-48975122206a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-44170d29-49c5-4d30-a545-555a9145cc19` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-6ac1253c-0817-4c59-aee5-149879e71b0b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1a916651-647c-4cb5-a8ce-351a023c48b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a916651-647c-4cb5-a8ce-351a023c48b1
Content-Type: application/json

--- request body ---
{"handle":"qa-7a59c460887a","displayName":"QA 7a59c460887a","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a916651-647c-4cb5-a8ce-351a023c48b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-7a59c460887a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2f424aef-fd43-4fe0-9a76-8a881bb8dbd5","handle":"qa-7a59c460887a","displayName":"QA 7a59c460887a","region":"eu","role":"user","createdAt":"2026-11-13T09:42:12.676446380Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-150994bc-2419-4e33-bd4d-2966cf418571

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-150994bc-2419-4e33-bd4d-2966cf418571
Content-Type: application/json

--- request body ---
{"handle":"qa-7a59c460887a","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-150994bc-2419-4e33-bd4d-2966cf418571
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f424aef-fd43-4fe0-9a76-8a881bb8dbd5"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-99458a6c-e4ec-4362-ad76-48975122206a

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-99458a6c-e4ec-4362-ad76-48975122206a
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-99458a6c-e4ec-4362-ad76-48975122206a
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

{"id":"acc_2f424aef-fd43-4fe0-9a76-8a881bb8dbd5","handle":"qa-7a59c460887a","displayName":"QA 7a59c460887a","region":"eu","role":"user","createdAt":"2026-11-13T09:42:12.676446380Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-44170d29-49c5-4d30-a545-555a9145cc19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44170d29-49c5-4d30-a545-555a9145cc19
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-44170d29-49c5-4d30-a545-555a9145cc19
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
correlation: qa-6ac1253c-0817-4c59-aee5-149879e71b0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac1253c-0817-4c59-aee5-149879e71b0b
Content-Type: application/json

--- request body ---
{"handle":"qa-7a59c460887a","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ac1253c-0817-4c59-aee5-149879e71b0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ac1253c-0817-4c59-aee5-149879e71b0b"}
```
