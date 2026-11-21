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
| 1 | `POST /v1/accounts` | 201 | 363 | `qa-3279a8bf-7b40-4436-baf5-3ed726dfef21` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-bf48a24d-b6dd-4b98-9200-d40edabe2c0c` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-07d020b1-1d9a-4e75-9335-828a1cd78ff5` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-30096100-cd0e-49e7-a059-14e06ab72a17` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-0d3c44eb-7c81-4468-a138-b602db6e6bc3` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 49 | `qa-fd8291ee-2d00-40ad-8278-3f26915d0006` |
| 7 | `POST /v1/auth/token` | 200 | 31 | `qa-8990b3fe-4d79-40d6-92b6-0d5c535beee6` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-9c885b6c-f8c6-4edb-be85-23ab77331cdb` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-dbd1d63e-64b3-4c3a-aa12-a0409c58dd88` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-6f8f3c58-068d-48f2-ab8c-aacc20114706` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-0362c27a-fb52-4218-9e07-a63bc1519bbd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3279a8bf-7b40-4436-baf5-3ed726dfef21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3279a8bf-7b40-4436-baf5-3ed726dfef21
Content-Type: application/json

--- request body ---
{"handle":"qa-31de5b3e15e4","displayName":"QA 31de5b3e15e4","password":"****","region":"eu"}

--- response: 201 in 363 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3279a8bf-7b40-4436-baf5-3ed726dfef21
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
Location: /v1/accounts/qa-31de5b3e15e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4987cc97-3440-4122-a29f-fd8dcdc937ed","handle":"qa-31de5b3e15e4","displayName":"QA 31de5b3e15e4","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.922058850Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bf48a24d-b6dd-4b98-9200-d40edabe2c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf48a24d-b6dd-4b98-9200-d40edabe2c0c
Content-Type: application/json

--- request body ---
{"handle":"qa-c6597527b278","displayName":"QA c6597527b278","password":"****","region":"us"}

--- response: 201 in 39 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf48a24d-b6dd-4b98-9200-d40edabe2c0c
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
Location: /v1/accounts/qa-c6597527b278
X-Served-Region: us
Content-Length: 181

{"id":"acc_ca15a200-7d8a-4b26-8310-886979f23d48","handle":"qa-c6597527b278","displayName":"QA c6597527b278","region":"us","role":"user","createdAt":"2026-11-15T09:36:09.372447760Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-07d020b1-1d9a-4e75-9335-828a1cd78ff5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07d020b1-1d9a-4e75-9335-828a1cd78ff5
Content-Type: application/json

--- request body ---
{"handle":"qa-31de5b3e15e4","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-07d020b1-1d9a-4e75-9335-828a1cd78ff5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4987cc97-3440-4122-a29f-fd8dcdc937ed"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-30096100-cd0e-49e7-a059-14e06ab72a17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30096100-cd0e-49e7-a059-14e06ab72a17
Content-Type: application/json

--- request body ---
{"handle":"qa-31de5b3e15e4","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-30096100-cd0e-49e7-a059-14e06ab72a17
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4987cc97-3440-4122-a29f-fd8dcdc937ed"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d3c44eb-7c81-4468-a138-b602db6e6bc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d3c44eb-7c81-4468-a138-b602db6e6bc3
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d3c44eb-7c81-4468-a138-b602db6e6bc3
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

{"id":"acc_4987cc97-3440-4122-a29f-fd8dcdc937ed","handle":"qa-31de5b3e15e4","displayName":"QA 31de5b3e15e4","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.922058850Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-c6597527b278
correlation: qa-fd8291ee-2d00-40ad-8278-3f26915d0006

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd8291ee-2d00-40ad-8278-3f26915d0006
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd8291ee-2d00-40ad-8278-3f26915d0006
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

{"handle":"qa-c6597527b278","displayName":"QA c6597527b278","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-8990b3fe-4d79-40d6-92b6-0d5c535beee6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8990b3fe-4d79-40d6-92b6-0d5c535beee6
Content-Type: application/json

--- request body ---
{"handle":"qa-c6597527b278","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8990b3fe-4d79-40d6-92b6-0d5c535beee6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ca15a200-7d8a-4b26-8310-886979f23d48"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9c885b6c-f8c6-4edb-be85-23ab77331cdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c885b6c-f8c6-4edb-be85-23ab77331cdb
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9c885b6c-f8c6-4edb-be85-23ab77331cdb
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
correlation: qa-dbd1d63e-64b3-4c3a-aa12-a0409c58dd88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbd1d63e-64b3-4c3a-aa12-a0409c58dd88
Content-Type: application/json

--- request body ---
{"handle":"qa-c6597527b278","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbd1d63e-64b3-4c3a-aa12-a0409c58dd88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dbd1d63e-64b3-4c3a-aa12-a0409c58dd88"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f8f3c58-068d-48f2-ab8c-aacc20114706

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f8f3c58-068d-48f2-ab8c-aacc20114706
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f8f3c58-068d-48f2-ab8c-aacc20114706
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
correlation: qa-0362c27a-fb52-4218-9e07-a63bc1519bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0362c27a-fb52-4218-9e07-a63bc1519bbd
Content-Type: application/json

--- request body ---
{"handle":"qa-31de5b3e15e4","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0362c27a-fb52-4218-9e07-a63bc1519bbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0362c27a-fb52-4218-9e07-a63bc1519bbd"}
```
