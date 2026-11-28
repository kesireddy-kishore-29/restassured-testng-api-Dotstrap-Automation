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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-c54b95e2-e9f1-4559-8e46-e82f5e888a2a` |
| 2 | `POST /v1/accounts` | 409 | 25 | `qa-43e45c17-8fe2-40b2-92c2-9c052829439a` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-31ee6e07-efa9-4585-948f-3550e0495257` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e9d0cd9e-0a49-4b04-9d1d-f6d5404bd1c2` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-5b83229d-0e7a-4437-aa29-a707fac2ba2e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c54b95e2-e9f1-4559-8e46-e82f5e888a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c54b95e2-e9f1-4559-8e46-e82f5e888a2a
Content-Type: application/json

--- request body ---
{"handle":"qa-99d52d6f4ac9","displayName":"QA 99d52d6f4ac9","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c54b95e2-e9f1-4559-8e46-e82f5e888a2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-99d52d6f4ac9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6508ea58-2254-4eac-800b-5b587c292e3c","handle":"qa-99d52d6f4ac9","displayName":"QA 99d52d6f4ac9","region":"eu","role":"user","createdAt":"2026-11-22T09:54:51.160253803Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-43e45c17-8fe2-40b2-92c2-9c052829439a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43e45c17-8fe2-40b2-92c2-9c052829439a
Content-Type: application/json

--- request body ---
{"handle":"qa-99d52d6f4ac9","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43e45c17-8fe2-40b2-92c2-9c052829439a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-99d52d6f4ac9' is in use.","instance":"/v1/accounts","correlationId":"qa-43e45c17-8fe2-40b2-92c2-9c052829439a"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-31ee6e07-efa9-4585-948f-3550e0495257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31ee6e07-efa9-4585-948f-3550e0495257
Content-Type: application/json

--- request body ---
{"handle":"qa-99d52d6f4ac9","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-31ee6e07-efa9-4585-948f-3550e0495257
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6508ea58-2254-4eac-800b-5b587c292e3c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9d0cd9e-0a49-4b04-9d1d-f6d5404bd1c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9d0cd9e-0a49-4b04-9d1d-f6d5404bd1c2
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e9d0cd9e-0a49-4b04-9d1d-f6d5404bd1c2
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
correlation: qa-5b83229d-0e7a-4437-aa29-a707fac2ba2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b83229d-0e7a-4437-aa29-a707fac2ba2e
Content-Type: application/json

--- request body ---
{"handle":"qa-99d52d6f4ac9","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b83229d-0e7a-4437-aa29-a707fac2ba2e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b83229d-0e7a-4437-aa29-a707fac2ba2e"}
```
