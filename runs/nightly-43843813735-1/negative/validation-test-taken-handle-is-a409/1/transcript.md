# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 456 | `qa-d45f1d17-6820-4531-86fe-f66f1c8bbf86` |
| 2 | `POST /v1/accounts` | 409 | 17 | `qa-e0e79f28-4300-411d-bece-cb9b40c5063b` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-421675c1-03e1-4d65-ae85-9222dac1ddc1` |
| 4 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-1ad48a82-9bd8-4f9a-9d0d-a34e35d31024` |
| 5 | `POST /v1/auth/token` | 401 | 25 | `qa-a5e21f39-7f32-4180-8daa-ff1b84d108af` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d45f1d17-6820-4531-86fe-f66f1c8bbf86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d45f1d17-6820-4531-86fe-f66f1c8bbf86
Content-Type: application/json

--- request body ---
{"handle":"qa-082cd196fa74","displayName":"QA 082cd196fa74","password":"****","region":"eu"}

--- response: 201 in 456 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d45f1d17-6820-4531-86fe-f66f1c8bbf86
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
Location: /v1/accounts/qa-082cd196fa74
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d85b45fb-7993-4598-8bc2-762892b67297","handle":"qa-082cd196fa74","displayName":"QA 082cd196fa74","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.655555457Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e0e79f28-4300-411d-bece-cb9b40c5063b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0e79f28-4300-411d-bece-cb9b40c5063b
Content-Type: application/json

--- request body ---
{"handle":"qa-082cd196fa74","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0e79f28-4300-411d-bece-cb9b40c5063b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-082cd196fa74' is in use.","instance":"/v1/accounts","correlationId":"qa-e0e79f28-4300-411d-bece-cb9b40c5063b"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-421675c1-03e1-4d65-ae85-9222dac1ddc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-421675c1-03e1-4d65-ae85-9222dac1ddc1
Content-Type: application/json

--- request body ---
{"handle":"qa-082cd196fa74","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-421675c1-03e1-4d65-ae85-9222dac1ddc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d85b45fb-7993-4598-8bc2-762892b67297"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ad48a82-9bd8-4f9a-9d0d-a34e35d31024

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ad48a82-9bd8-4f9a-9d0d-a34e35d31024
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ad48a82-9bd8-4f9a-9d0d-a34e35d31024
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a5e21f39-7f32-4180-8daa-ff1b84d108af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e21f39-7f32-4180-8daa-ff1b84d108af
Content-Type: application/json

--- request body ---
{"handle":"qa-082cd196fa74","password":"****"}

--- response: 401 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5e21f39-7f32-4180-8daa-ff1b84d108af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5e21f39-7f32-4180-8daa-ff1b84d108af"}
```
