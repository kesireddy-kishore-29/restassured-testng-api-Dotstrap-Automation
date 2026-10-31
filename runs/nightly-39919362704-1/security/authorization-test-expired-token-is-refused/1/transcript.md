# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 412 | `qa-227b646b-577e-4069-a9a9-0d59a088a3c4` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-aabe4a30-bb86-4323-8545-ba5f87c1c7cb` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-04ceae00-238e-45cd-8118-c536b485b64f` |
| 4 | `GET /v1/accounts/me` | 200 | 4 | `qa-030bc270-c382-47eb-97cc-5eab241ea71e` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-c6bc8732-7457-4372-95fa-05d1e58261cb` |
| 6 | `GET /v1/accounts/me` | 401 | 6 | `qa-bfb7d7e6-86e1-4825-9216-37dee6012952` |
| 7 | `GET /v1/accounts/me` | 401 | 6 | `qa-2553f1ef-3dd4-449a-af03-99c783407ce1` |
| 8 | `POST /v1/auth/token` | 200 | 9 | `qa-66d3c9ca-8496-497b-b2a0-ba1f158f1d13` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-07379135-d97b-496b-9792-2ceca90adf4d` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-0f0a06bd-4700-4a81-b453-aa2f4a1001e3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-227b646b-577e-4069-a9a9-0d59a088a3c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227b646b-577e-4069-a9a9-0d59a088a3c4
Content-Type: application/json

--- request body ---
{"handle":"qa-fa1c49113837","displayName":"QA fa1c49113837","password":"****","region":"eu"}

--- response: 201 in 412 ms ---
Date: Fri, 23 Oct 2026 07:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-227b646b-577e-4069-a9a9-0d59a088a3c4
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
Location: /v1/accounts/qa-fa1c49113837
X-Served-Region: eu
Content-Length: 181

{"id":"acc_251f6b92-1abb-4329-8b68-f77463e0fcdc","handle":"qa-fa1c49113837","displayName":"QA fa1c49113837","region":"eu","role":"user","createdAt":"2026-10-23T07:41:41.040152752Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-aabe4a30-bb86-4323-8545-ba5f87c1c7cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aabe4a30-bb86-4323-8545-ba5f87c1c7cb
Content-Type: application/json

--- request body ---
{"handle":"qa-fa1c49113837","password":"****","ttlSeconds":1}

--- response: 200 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-aabe4a30-bb86-4323-8545-ba5f87c1c7cb
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
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_251f6b92-1abb-4329-8b68-f77463e0fcdc"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-04ceae00-238e-45cd-8118-c536b485b64f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04ceae00-238e-45cd-8118-c536b485b64f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-04ceae00-238e-45cd-8118-c536b485b64f
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
Content-Length: 181

{"id":"acc_251f6b92-1abb-4329-8b68-f77463e0fcdc","handle":"qa-fa1c49113837","displayName":"QA fa1c49113837","region":"eu","role":"user","createdAt":"2026-10-23T07:41:41.040152752Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-030bc270-c382-47eb-97cc-5eab241ea71e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-030bc270-c382-47eb-97cc-5eab241ea71e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-030bc270-c382-47eb-97cc-5eab241ea71e
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
Content-Length: 181

{"id":"acc_251f6b92-1abb-4329-8b68-f77463e0fcdc","handle":"qa-fa1c49113837","displayName":"QA fa1c49113837","region":"eu","role":"user","createdAt":"2026-10-23T07:41:41.040152752Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-c6bc8732-7457-4372-95fa-05d1e58261cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6bc8732-7457-4372-95fa-05d1e58261cb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6bc8732-7457-4372-95fa-05d1e58261cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_251f6b92-1abb-4329-8b68-f77463e0fcdc","handle":"qa-fa1c49113837","displayName":"QA fa1c49113837","region":"eu","role":"user","createdAt":"2026-10-23T07:41:41.040152752Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfb7d7e6-86e1-4825-9216-37dee6012952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfb7d7e6-86e1-4825-9216-37dee6012952
Content-Type: application/json

--- response: 401 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bfb7d7e6-86e1-4825-9216-37dee6012952
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-bfb7d7e6-86e1-4825-9216-37dee6012952"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-2553f1ef-3dd4-449a-af03-99c783407ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2553f1ef-3dd4-449a-af03-99c783407ce1
Content-Type: application/json

--- response: 401 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2553f1ef-3dd4-449a-af03-99c783407ce1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-2553f1ef-3dd4-449a-af03-99c783407ce1"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-66d3c9ca-8496-497b-b2a0-ba1f158f1d13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66d3c9ca-8496-497b-b2a0-ba1f158f1d13
Content-Type: application/json

--- request body ---
{"handle":"qa-fa1c49113837","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-66d3c9ca-8496-497b-b2a0-ba1f158f1d13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_251f6b92-1abb-4329-8b68-f77463e0fcdc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07379135-d97b-496b-9792-2ceca90adf4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07379135-d97b-496b-9792-2ceca90adf4d
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07379135-d97b-496b-9792-2ceca90adf4d
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0f0a06bd-4700-4a81-b453-aa2f4a1001e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f0a06bd-4700-4a81-b453-aa2f4a1001e3
Content-Type: application/json

--- request body ---
{"handle":"qa-fa1c49113837","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f0a06bd-4700-4a81-b453-aa2f4a1001e3
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f0a06bd-4700-4a81-b453-aa2f4a1001e3"}
```
