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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-19cba6a7-b6ae-42e9-8583-6f10c2630397` |
| 2 | `POST /v1/accounts` | 409 | 5 | `qa-d9f31c12-3197-462a-a152-250d88f2f2ea` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-2a25d0e7-d92a-4589-9d65-a591cec1d59e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-341bdbac-41c1-4ebf-952a-e28fd7de4416` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-8127dad7-13cd-475d-9c36-509418316d71` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-19cba6a7-b6ae-42e9-8583-6f10c2630397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19cba6a7-b6ae-42e9-8583-6f10c2630397
Content-Type: application/json

--- request body ---
{"handle":"qa-37abe7b14617","displayName":"QA 37abe7b14617","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-19cba6a7-b6ae-42e9-8583-6f10c2630397
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-37abe7b14617
X-Served-Region: eu
Content-Length: 181

{"id":"acc_582c1765-bc15-4692-9887-6d93125bf6fe","handle":"qa-37abe7b14617","displayName":"QA 37abe7b14617","region":"eu","role":"user","createdAt":"2026-10-30T08:45:49.805047711Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9f31c12-3197-462a-a152-250d88f2f2ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9f31c12-3197-462a-a152-250d88f2f2ea
Content-Type: application/json

--- request body ---
{"handle":"qa-37abe7b14617","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9f31c12-3197-462a-a152-250d88f2f2ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-37abe7b14617' is in use.","instance":"/v1/accounts","correlationId":"qa-d9f31c12-3197-462a-a152-250d88f2f2ea"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2a25d0e7-d92a-4589-9d65-a591cec1d59e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a25d0e7-d92a-4589-9d65-a591cec1d59e
Content-Type: application/json

--- request body ---
{"handle":"qa-37abe7b14617","password":"****"}

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a25d0e7-d92a-4589-9d65-a591cec1d59e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582c1765-bc15-4692-9887-6d93125bf6fe"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-341bdbac-41c1-4ebf-952a-e28fd7de4416

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-341bdbac-41c1-4ebf-952a-e28fd7de4416
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-341bdbac-41c1-4ebf-952a-e28fd7de4416
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
correlation: qa-8127dad7-13cd-475d-9c36-509418316d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8127dad7-13cd-475d-9c36-509418316d71
Content-Type: application/json

--- request body ---
{"handle":"qa-37abe7b14617","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8127dad7-13cd-475d-9c36-509418316d71
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8127dad7-13cd-475d-9c36-509418316d71"}
```
