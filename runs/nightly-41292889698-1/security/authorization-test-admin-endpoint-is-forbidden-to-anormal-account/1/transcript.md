# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 248 | `qa-1cf49067-857c-4874-94e3-da677d4ebbd8` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-985976c3-34c6-4ad7-8912-9db2c1d98721` |
| 3 | `GET /v1/admin/stats` | 403 | 42 | `qa-6a4d7fe6-c09d-4163-87e1-9079711408e1` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-42300d2e-fa79-4cda-8deb-ff3180361a00` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-6b626441-5d73-4739-a980-03751816298f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1cf49067-857c-4874-94e3-da677d4ebbd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf49067-857c-4874-94e3-da677d4ebbd8
Content-Type: application/json

--- request body ---
{"handle":"qa-cb5eca982779","displayName":"QA cb5eca982779","password":"****","region":"eu"}

--- response: 201 in 248 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cf49067-857c-4874-94e3-da677d4ebbd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-cb5eca982779
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8afffe77-db66-4742-a797-15da7195f856","handle":"qa-cb5eca982779","displayName":"QA cb5eca982779","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.316860382Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-985976c3-34c6-4ad7-8912-9db2c1d98721

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-985976c3-34c6-4ad7-8912-9db2c1d98721
Content-Type: application/json

--- request body ---
{"handle":"qa-cb5eca982779","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-985976c3-34c6-4ad7-8912-9db2c1d98721
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8afffe77-db66-4742-a797-15da7195f856"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-6a4d7fe6-c09d-4163-87e1-9079711408e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a4d7fe6-c09d-4163-87e1-9079711408e1
Content-Type: application/json

--- response: 403 in 42 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a4d7fe6-c09d-4163-87e1-9079711408e1
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-6a4d7fe6-c09d-4163-87e1-9079711408e1"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42300d2e-fa79-4cda-8deb-ff3180361a00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42300d2e-fa79-4cda-8deb-ff3180361a00
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42300d2e-fa79-4cda-8deb-ff3180361a00
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
correlation: qa-6b626441-5d73-4739-a980-03751816298f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b626441-5d73-4739-a980-03751816298f
Content-Type: application/json

--- request body ---
{"handle":"qa-cb5eca982779","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b626441-5d73-4739-a980-03751816298f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b626441-5d73-4739-a980-03751816298f"}
```
