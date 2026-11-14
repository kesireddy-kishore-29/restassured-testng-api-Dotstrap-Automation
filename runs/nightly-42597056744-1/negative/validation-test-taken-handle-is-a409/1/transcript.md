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
| 1 | `POST /v1/accounts` | 201 | 384 | `qa-722f6dac-80bf-452c-ab31-d45bc8ae0ea2` |
| 2 | `POST /v1/accounts` | 409 | 8 | `qa-921a827f-2dbd-40ca-ab39-17f7f1ffa732` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-d5c233aa-3b7c-4ae1-b93e-caf49494a4bf` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-fce2fcf0-fbff-40af-955f-f2185e634968` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-f26ac594-82e3-449e-80c0-686e7941e2fe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-722f6dac-80bf-452c-ab31-d45bc8ae0ea2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-722f6dac-80bf-452c-ab31-d45bc8ae0ea2
Content-Type: application/json

--- request body ---
{"handle":"qa-34ab8fc7703c","displayName":"QA 34ab8fc7703c","password":"****","region":"eu"}

--- response: 201 in 384 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-722f6dac-80bf-452c-ab31-d45bc8ae0ea2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-34ab8fc7703c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d67faa7-ce8f-4909-9721-f66efe499373","handle":"qa-34ab8fc7703c","displayName":"QA 34ab8fc7703c","region":"eu","role":"user","createdAt":"2026-11-09T09:55:55.521103372Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-921a827f-2dbd-40ca-ab39-17f7f1ffa732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-921a827f-2dbd-40ca-ab39-17f7f1ffa732
Content-Type: application/json

--- request body ---
{"handle":"qa-34ab8fc7703c","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 8 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-921a827f-2dbd-40ca-ab39-17f7f1ffa732
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-34ab8fc7703c' is in use.","instance":"/v1/accounts","correlationId":"qa-921a827f-2dbd-40ca-ab39-17f7f1ffa732"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d5c233aa-3b7c-4ae1-b93e-caf49494a4bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5c233aa-3b7c-4ae1-b93e-caf49494a4bf
Content-Type: application/json

--- request body ---
{"handle":"qa-34ab8fc7703c","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5c233aa-3b7c-4ae1-b93e-caf49494a4bf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d67faa7-ce8f-4909-9721-f66efe499373"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fce2fcf0-fbff-40af-955f-f2185e634968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fce2fcf0-fbff-40af-955f-f2185e634968
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fce2fcf0-fbff-40af-955f-f2185e634968
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
correlation: qa-f26ac594-82e3-449e-80c0-686e7941e2fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26ac594-82e3-449e-80c0-686e7941e2fe
Content-Type: application/json

--- request body ---
{"handle":"qa-34ab8fc7703c","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f26ac594-82e3-449e-80c0-686e7941e2fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f26ac594-82e3-449e-80c0-686e7941e2fe"}
```
