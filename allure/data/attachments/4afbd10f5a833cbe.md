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
| 1 | `POST /v1/accounts` | 201 | 303 | `qa-07969e22-3ea7-4765-bb2a-86d1ff082255` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-82223cf6-55fe-40ff-bb77-9d1d1d44d9cb` |
| 3 | `GET /v1/admin/stats` | 403 | 35 | `qa-7ee470b4-800f-4e79-bbec-c3ab5a11ad81` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-12c5dcfc-a6fa-4cdc-a2df-415524666149` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-5443d8e5-c084-4fae-9ffb-c4830f54f586` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-07969e22-3ea7-4765-bb2a-86d1ff082255

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07969e22-3ea7-4765-bb2a-86d1ff082255
Content-Type: application/json

--- request body ---
{"handle":"qa-85a595decd9b","displayName":"QA 85a595decd9b","password":"****","region":"eu"}

--- response: 201 in 303 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-07969e22-3ea7-4765-bb2a-86d1ff082255
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
Location: /v1/accounts/qa-85a595decd9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60f9d58e-0545-4325-9b1f-3953ce066b39","handle":"qa-85a595decd9b","displayName":"QA 85a595decd9b","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.094609248Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-82223cf6-55fe-40ff-bb77-9d1d1d44d9cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82223cf6-55fe-40ff-bb77-9d1d1d44d9cb
Content-Type: application/json

--- request body ---
{"handle":"qa-85a595decd9b","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-82223cf6-55fe-40ff-bb77-9d1d1d44d9cb
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60f9d58e-0545-4325-9b1f-3953ce066b39"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-7ee470b4-800f-4e79-bbec-c3ab5a11ad81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ee470b4-800f-4e79-bbec-c3ab5a11ad81
Content-Type: application/json

--- response: 403 in 35 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ee470b4-800f-4e79-bbec-c3ab5a11ad81
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-7ee470b4-800f-4e79-bbec-c3ab5a11ad81"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-12c5dcfc-a6fa-4cdc-a2df-415524666149

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12c5dcfc-a6fa-4cdc-a2df-415524666149
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-12c5dcfc-a6fa-4cdc-a2df-415524666149
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
correlation: qa-5443d8e5-c084-4fae-9ffb-c4830f54f586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5443d8e5-c084-4fae-9ffb-c4830f54f586
Content-Type: application/json

--- request body ---
{"handle":"qa-85a595decd9b","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5443d8e5-c084-4fae-9ffb-c4830f54f586
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5443d8e5-c084-4fae-9ffb-c4830f54f586"}
```
