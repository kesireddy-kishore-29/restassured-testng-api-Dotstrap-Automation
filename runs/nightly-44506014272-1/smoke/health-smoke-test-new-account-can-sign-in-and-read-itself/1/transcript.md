# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 274 | `qa-c86f9fcb-47b6-43bd-9936-410fd9077965` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-a7fc5dee-ac29-4a13-91a3-a86c76de9df4` |
| 3 | `GET /v1/accounts/me` | 200 | 30 | `qa-210d2cb4-d2af-4b98-aedb-46ebc5a85d36` |
| 4 | `GET /v1/accounts/me` | 200 | 10 | `qa-7411c2b8-684d-40a8-9004-454ebdddfec0` |
| 5 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-35819348-76f1-4262-8928-5cef961c2013` |
| 6 | `POST /v1/auth/token` | 401 | 47 | `qa-9abdb57a-0b31-4424-b86e-07b8a5612906` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c86f9fcb-47b6-43bd-9936-410fd9077965

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c86f9fcb-47b6-43bd-9936-410fd9077965
Content-Type: application/json

--- request body ---
{"handle":"qa-111821c91cc0","displayName":"QA 111821c91cc0","password":"****","region":"eu"}

--- response: 201 in 274 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-c86f9fcb-47b6-43bd-9936-410fd9077965
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-111821c91cc0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69531577-c9fa-4f73-b548-f55072164d30","handle":"qa-111821c91cc0","displayName":"QA 111821c91cc0","region":"eu","role":"user","createdAt":"2026-11-19T10:29:18.140439658Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a7fc5dee-ac29-4a13-91a3-a86c76de9df4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7fc5dee-ac29-4a13-91a3-a86c76de9df4
Content-Type: application/json

--- request body ---
{"handle":"qa-111821c91cc0","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7fc5dee-ac29-4a13-91a3-a86c76de9df4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69531577-c9fa-4f73-b548-f55072164d30"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-210d2cb4-d2af-4b98-aedb-46ebc5a85d36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-210d2cb4-d2af-4b98-aedb-46ebc5a85d36
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-210d2cb4-d2af-4b98-aedb-46ebc5a85d36
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

{"id":"acc_69531577-c9fa-4f73-b548-f55072164d30","handle":"qa-111821c91cc0","displayName":"QA 111821c91cc0","region":"eu","role":"user","createdAt":"2026-11-19T10:29:18.140439658Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-7411c2b8-684d-40a8-9004-454ebdddfec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7411c2b8-684d-40a8-9004-454ebdddfec0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-7411c2b8-684d-40a8-9004-454ebdddfec0
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

{"id":"acc_69531577-c9fa-4f73-b548-f55072164d30","handle":"qa-111821c91cc0","displayName":"QA 111821c91cc0","region":"eu","role":"user","createdAt":"2026-11-19T10:29:18.140439658Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35819348-76f1-4262-8928-5cef961c2013

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35819348-76f1-4262-8928-5cef961c2013
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35819348-76f1-4262-8928-5cef961c2013
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9abdb57a-0b31-4424-b86e-07b8a5612906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9abdb57a-0b31-4424-b86e-07b8a5612906
Content-Type: application/json

--- request body ---
{"handle":"qa-111821c91cc0","password":"****"}

--- response: 401 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9abdb57a-0b31-4424-b86e-07b8a5612906
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9abdb57a-0b31-4424-b86e-07b8a5612906"}
```
