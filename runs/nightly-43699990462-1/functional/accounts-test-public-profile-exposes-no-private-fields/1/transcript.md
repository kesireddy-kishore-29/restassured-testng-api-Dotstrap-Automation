# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-5b325237-57c5-4466-a575-464d8c6ff805` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-05e27d7c-9fdd-43eb-bfc7-deb7c0e7df3b` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-776daf48-c5cc-42d4-a845-43e8aeff930b` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-1cf5c734-33c5-4e69-978e-a436c3ba4bd8` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-4c8db80a-59af-4b62-8f56-cf57f20f8376` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-6f712687-f8fa-4127-9198-f467d7964e7e` |
| 7 | `POST /v1/auth/token` | 200 | 17 | `qa-020599a7-fa02-4335-83e5-af4e8eaa7148` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ea58d212-8a11-46de-b28e-c34afe15d213` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-fe0854e3-dbc4-4848-8c96-d6f55d6c18ef` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-76ecea14-8a07-4ed5-a534-bca836f9fdb9` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-22cae107-a73e-40a3-bcb4-1357a81bc4ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b325237-57c5-4466-a575-464d8c6ff805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b325237-57c5-4466-a575-464d8c6ff805
Content-Type: application/json

--- request body ---
{"handle":"qa-b0adc0f39f42","displayName":"QA b0adc0f39f42","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b325237-57c5-4466-a575-464d8c6ff805
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-b0adc0f39f42
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc87dd45-198d-4fd5-8be7-614bb9e75def","handle":"qa-b0adc0f39f42","displayName":"QA b0adc0f39f42","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.387626786Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-05e27d7c-9fdd-43eb-bfc7-deb7c0e7df3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05e27d7c-9fdd-43eb-bfc7-deb7c0e7df3b
Content-Type: application/json

--- request body ---
{"handle":"qa-8c149a0e08e2","displayName":"QA 8c149a0e08e2","password":"****","region":"us"}

--- response: 201 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-05e27d7c-9fdd-43eb-bfc7-deb7c0e7df3b
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
Location: /v1/accounts/qa-8c149a0e08e2
X-Served-Region: us
Content-Length: 181

{"id":"acc_ab267b7e-5843-4dd2-baf5-f2cdbb4afa70","handle":"qa-8c149a0e08e2","displayName":"QA 8c149a0e08e2","region":"us","role":"user","createdAt":"2026-11-15T09:36:10.417914841Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-776daf48-c5cc-42d4-a845-43e8aeff930b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-776daf48-c5cc-42d4-a845-43e8aeff930b
Content-Type: application/json

--- request body ---
{"handle":"qa-b0adc0f39f42","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-776daf48-c5cc-42d4-a845-43e8aeff930b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc87dd45-198d-4fd5-8be7-614bb9e75def"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-8c149a0e08e2
correlation: qa-1cf5c734-33c5-4e69-978e-a436c3ba4bd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf5c734-33c5-4e69-978e-a436c3ba4bd8
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cf5c734-33c5-4e69-978e-a436c3ba4bd8
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
Content-Length: 74

{"handle":"qa-8c149a0e08e2","displayName":"QA 8c149a0e08e2","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-8c149a0e08e2
correlation: qa-4c8db80a-59af-4b62-8f56-cf57f20f8376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c8db80a-59af-4b62-8f56-cf57f20f8376
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c8db80a-59af-4b62-8f56-cf57f20f8376
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

{"handle":"qa-8c149a0e08e2","displayName":"QA 8c149a0e08e2","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-8c149a0e08e2
correlation: qa-6f712687-f8fa-4127-9198-f467d7964e7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f712687-f8fa-4127-9198-f467d7964e7e
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f712687-f8fa-4127-9198-f467d7964e7e
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
Content-Length: 74

{"handle":"qa-8c149a0e08e2","displayName":"QA 8c149a0e08e2","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-020599a7-fa02-4335-83e5-af4e8eaa7148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-020599a7-fa02-4335-83e5-af4e8eaa7148
Content-Type: application/json

--- request body ---
{"handle":"qa-8c149a0e08e2","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-020599a7-fa02-4335-83e5-af4e8eaa7148
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab267b7e-5843-4dd2-baf5-f2cdbb4afa70"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea58d212-8a11-46de-b28e-c34afe15d213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea58d212-8a11-46de-b28e-c34afe15d213
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea58d212-8a11-46de-b28e-c34afe15d213
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
correlation: qa-fe0854e3-dbc4-4848-8c96-d6f55d6c18ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe0854e3-dbc4-4848-8c96-d6f55d6c18ef
Content-Type: application/json

--- request body ---
{"handle":"qa-8c149a0e08e2","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe0854e3-dbc4-4848-8c96-d6f55d6c18ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fe0854e3-dbc4-4848-8c96-d6f55d6c18ef"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76ecea14-8a07-4ed5-a534-bca836f9fdb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76ecea14-8a07-4ed5-a534-bca836f9fdb9
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76ecea14-8a07-4ed5-a534-bca836f9fdb9
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
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-22cae107-a73e-40a3-bcb4-1357a81bc4ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22cae107-a73e-40a3-bcb4-1357a81bc4ac
Content-Type: application/json

--- request body ---
{"handle":"qa-b0adc0f39f42","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22cae107-a73e-40a3-bcb4-1357a81bc4ac
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22cae107-a73e-40a3-bcb4-1357a81bc4ac"}
```
