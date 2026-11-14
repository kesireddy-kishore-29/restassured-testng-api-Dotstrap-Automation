# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 397 | `qa-45123991-c677-4657-b6dd-612058889dbd` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-a93670f8-ce36-4655-b656-13adafc78e36` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-a2d97d04-3345-4b12-b42b-8e8bceac2856` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-ed8bb6b4-ecbe-45c8-877f-d2b22b595a2b` |
| 5 | `GET /v1/accounts/me` | 200 | 21 | `qa-e65c42ef-3dcf-428d-902b-ee3b3366dd64` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 28 | `qa-f75b02f6-1c06-4506-955b-8e50b0b9be6e` |
| 7 | `POST /v1/auth/token` | 200 | 24 | `qa-661a0066-406e-43c9-b0ba-6d5b9063043e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-4e5fb4e0-bfd8-4fb4-b9a8-5684e7ab1123` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-8564dc31-241f-4cf8-9e5b-c984f8400ae9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3e64f4d6-7f44-4932-9697-1622b91de416` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-9a69a9c5-1c38-46e8-bda0-9eea6a304069` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-45123991-c677-4657-b6dd-612058889dbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45123991-c677-4657-b6dd-612058889dbd
Content-Type: application/json

--- request body ---
{"handle":"qa-5c350da1a8d9","displayName":"QA 5c350da1a8d9","password":"****","region":"eu"}

--- response: 201 in 397 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-45123991-c677-4657-b6dd-612058889dbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-5c350da1a8d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7388605-f986-42bd-b512-11536b76b891","handle":"qa-5c350da1a8d9","displayName":"QA 5c350da1a8d9","region":"eu","role":"user","createdAt":"2026-11-14T09:05:22.471872239Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a93670f8-ce36-4655-b656-13adafc78e36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a93670f8-ce36-4655-b656-13adafc78e36
Content-Type: application/json

--- request body ---
{"handle":"qa-9d9558c2d1d9","displayName":"QA 9d9558c2d1d9","password":"****","region":"us"}

--- response: 201 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a93670f8-ce36-4655-b656-13adafc78e36
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
Location: /v1/accounts/qa-9d9558c2d1d9
X-Served-Region: us
Content-Length: 181

{"id":"acc_e5705a62-5dd8-46af-a1f6-173ee5c6d1a5","handle":"qa-9d9558c2d1d9","displayName":"QA 9d9558c2d1d9","region":"us","role":"user","createdAt":"2026-11-14T09:05:22.740172189Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a2d97d04-3345-4b12-b42b-8e8bceac2856

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2d97d04-3345-4b12-b42b-8e8bceac2856
Content-Type: application/json

--- request body ---
{"handle":"qa-5c350da1a8d9","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2d97d04-3345-4b12-b42b-8e8bceac2856
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7388605-f986-42bd-b512-11536b76b891"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ed8bb6b4-ecbe-45c8-877f-d2b22b595a2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed8bb6b4-ecbe-45c8-877f-d2b22b595a2b
Content-Type: application/json

--- request body ---
{"handle":"qa-5c350da1a8d9","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed8bb6b4-ecbe-45c8-877f-d2b22b595a2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7388605-f986-42bd-b512-11536b76b891"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-e65c42ef-3dcf-428d-902b-ee3b3366dd64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e65c42ef-3dcf-428d-902b-ee3b3366dd64
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e65c42ef-3dcf-428d-902b-ee3b3366dd64
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

{"id":"acc_e7388605-f986-42bd-b512-11536b76b891","handle":"qa-5c350da1a8d9","displayName":"QA 5c350da1a8d9","region":"eu","role":"user","createdAt":"2026-11-14T09:05:22.471872239Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-9d9558c2d1d9
correlation: qa-f75b02f6-1c06-4506-955b-8e50b0b9be6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f75b02f6-1c06-4506-955b-8e50b0b9be6e
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-f75b02f6-1c06-4506-955b-8e50b0b9be6e
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
Content-Length: 74

{"handle":"qa-9d9558c2d1d9","displayName":"QA 9d9558c2d1d9","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-661a0066-406e-43c9-b0ba-6d5b9063043e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-661a0066-406e-43c9-b0ba-6d5b9063043e
Content-Type: application/json

--- request body ---
{"handle":"qa-9d9558c2d1d9","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-661a0066-406e-43c9-b0ba-6d5b9063043e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e5705a62-5dd8-46af-a1f6-173ee5c6d1a5"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e5fb4e0-bfd8-4fb4-b9a8-5684e7ab1123

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e5fb4e0-bfd8-4fb4-b9a8-5684e7ab1123
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e5fb4e0-bfd8-4fb4-b9a8-5684e7ab1123
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8564dc31-241f-4cf8-9e5b-c984f8400ae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8564dc31-241f-4cf8-9e5b-c984f8400ae9
Content-Type: application/json

--- request body ---
{"handle":"qa-9d9558c2d1d9","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8564dc31-241f-4cf8-9e5b-c984f8400ae9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8564dc31-241f-4cf8-9e5b-c984f8400ae9"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e64f4d6-7f44-4932-9697-1622b91de416

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e64f4d6-7f44-4932-9697-1622b91de416
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e64f4d6-7f44-4932-9697-1622b91de416
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-9a69a9c5-1c38-46e8-bda0-9eea6a304069

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a69a9c5-1c38-46e8-bda0-9eea6a304069
Content-Type: application/json

--- request body ---
{"handle":"qa-5c350da1a8d9","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a69a9c5-1c38-46e8-bda0-9eea6a304069
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a69a9c5-1c38-46e8-bda0-9eea6a304069"}
```
