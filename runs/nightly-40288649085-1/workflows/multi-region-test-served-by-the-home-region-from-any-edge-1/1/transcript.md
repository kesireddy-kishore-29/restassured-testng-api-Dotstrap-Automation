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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-47833c22-801b-40ea-ad4b-add017853791` |
| 2 | `POST /v1/auth/token` | 200 | 31 | `qa-3de6058b-0180-46c4-896b-15dab6f18ca1` |
| 3 | `GET /v1/accounts/me` | 200 | 19 | `qa-47aec2d1-e7b0-409d-9d09-5c5852fcfe6b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-947f2b77-dbc1-4d7e-94ff-9510ba74fafe` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-6d8d5d9d-780a-46e7-8584-b8967c6bdfcc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-47833c22-801b-40ea-ad4b-add017853791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47833c22-801b-40ea-ad4b-add017853791
Content-Type: application/json

--- request body ---
{"handle":"qa-83659b11fd40","displayName":"QA 83659b11fd40","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-47833c22-801b-40ea-ad4b-add017853791
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
Location: /v1/accounts/qa-83659b11fd40
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f91de128-12bf-49bc-be34-cb2ba97cefe5","handle":"qa-83659b11fd40","displayName":"QA 83659b11fd40","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.628847917Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3de6058b-0180-46c4-896b-15dab6f18ca1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3de6058b-0180-46c4-896b-15dab6f18ca1
Content-Type: application/json

--- request body ---
{"handle":"qa-83659b11fd40","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3de6058b-0180-46c4-896b-15dab6f18ca1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f91de128-12bf-49bc-be34-cb2ba97cefe5"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-47aec2d1-e7b0-409d-9d09-5c5852fcfe6b

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-47aec2d1-e7b0-409d-9d09-5c5852fcfe6b
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-47aec2d1-e7b0-409d-9d09-5c5852fcfe6b
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

{"id":"acc_f91de128-12bf-49bc-be34-cb2ba97cefe5","handle":"qa-83659b11fd40","displayName":"QA 83659b11fd40","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.628847917Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-947f2b77-dbc1-4d7e-94ff-9510ba74fafe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-947f2b77-dbc1-4d7e-94ff-9510ba74fafe
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-947f2b77-dbc1-4d7e-94ff-9510ba74fafe
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
correlation: qa-6d8d5d9d-780a-46e7-8584-b8967c6bdfcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d8d5d9d-780a-46e7-8584-b8967c6bdfcc
Content-Type: application/json

--- request body ---
{"handle":"qa-83659b11fd40","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d8d5d9d-780a-46e7-8584-b8967c6bdfcc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d8d5d9d-780a-46e7-8584-b8967c6bdfcc"}
```
