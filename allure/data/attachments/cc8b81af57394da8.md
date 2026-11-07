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
| 1 | `POST /v1/accounts` | 201 | 327 | `qa-cd39b595-a129-49ca-b152-a5bccc55d5ad` |
| 2 | `POST /v1/accounts` | 409 | 16 | `qa-b4b43707-f658-437c-bee5-24a05c92759c` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-a198ff0a-9ec6-4d0e-87a2-4ae7ecc39315` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-0cd02522-88a3-4169-9a8a-5ba1399abfd7` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-d6c60277-146a-462f-a27c-ddec4559697b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd39b595-a129-49ca-b152-a5bccc55d5ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd39b595-a129-49ca-b152-a5bccc55d5ad
Content-Type: application/json

--- request body ---
{"handle":"qa-c610f0d17b57","displayName":"QA c610f0d17b57","password":"****","region":"eu"}

--- response: 201 in 327 ms ---
Date: Sat, 07 Nov 2026 08:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd39b595-a129-49ca-b152-a5bccc55d5ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-c610f0d17b57
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74d88fc7-9108-4107-8a15-df19a9f3301f","handle":"qa-c610f0d17b57","displayName":"QA c610f0d17b57","region":"eu","role":"user","createdAt":"2026-11-07T08:54:55.301073445Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b4b43707-f658-437c-bee5-24a05c92759c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4b43707-f658-437c-bee5-24a05c92759c
Content-Type: application/json

--- request body ---
{"handle":"qa-c610f0d17b57","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4b43707-f658-437c-bee5-24a05c92759c
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-c610f0d17b57' is in use.","instance":"/v1/accounts","correlationId":"qa-b4b43707-f658-437c-bee5-24a05c92759c"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a198ff0a-9ec6-4d0e-87a2-4ae7ecc39315

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a198ff0a-9ec6-4d0e-87a2-4ae7ecc39315
Content-Type: application/json

--- request body ---
{"handle":"qa-c610f0d17b57","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a198ff0a-9ec6-4d0e-87a2-4ae7ecc39315
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74d88fc7-9108-4107-8a15-df19a9f3301f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0cd02522-88a3-4169-9a8a-5ba1399abfd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cd02522-88a3-4169-9a8a-5ba1399abfd7
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0cd02522-88a3-4169-9a8a-5ba1399abfd7
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
correlation: qa-d6c60277-146a-462f-a27c-ddec4559697b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6c60277-146a-462f-a27c-ddec4559697b
Content-Type: application/json

--- request body ---
{"handle":"qa-c610f0d17b57","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6c60277-146a-462f-a27c-ddec4559697b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d6c60277-146a-462f-a27c-ddec4559697b"}
```
