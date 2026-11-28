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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-3c2de8d1-a33a-4ed0-bbe0-8c312451a512` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-b7b96610-d20b-46ec-bd29-7defd3342d4a` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-2c2d08c3-3966-4285-84f9-f5a981c23715` |
| 4 | `POST /v1/auth/token` | 200 | 17 | `qa-8bcff60b-7fb1-4f84-8f0e-de20deb1f2ad` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-1c1c8d3f-c73f-44cc-8b88-521a362a9bd5` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-257774e7-2175-4ed2-9403-90838fd91b5e` |
| 7 | `POST /v1/auth/token` | 200 | 17 | `qa-6360a435-5269-47bf-8b8f-86cb6e163949` |
| 8 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-5603d2d4-6526-4494-a63a-af156ad03059` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-252c234d-7e05-47c5-83ee-75e75420aafc` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-83f296b3-d9e8-47bf-8344-6dce0ec74a2a` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-23e80174-5258-49db-97b4-05a18f5eeb99` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3c2de8d1-a33a-4ed0-bbe0-8c312451a512

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c2de8d1-a33a-4ed0-bbe0-8c312451a512
Content-Type: application/json

--- request body ---
{"handle":"qa-a2b189c2a164","displayName":"QA a2b189c2a164","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c2de8d1-a33a-4ed0-bbe0-8c312451a512
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
Location: /v1/accounts/qa-a2b189c2a164
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5a40ed9-8882-47b9-a760-f64f4278d85c","handle":"qa-a2b189c2a164","displayName":"QA a2b189c2a164","region":"eu","role":"user","createdAt":"2026-11-25T11:27:54.012967973Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b7b96610-d20b-46ec-bd29-7defd3342d4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7b96610-d20b-46ec-bd29-7defd3342d4a
Content-Type: application/json

--- request body ---
{"handle":"qa-a663bf73248a","displayName":"QA a663bf73248a","password":"****","region":"us"}

--- response: 201 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7b96610-d20b-46ec-bd29-7defd3342d4a
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
Location: /v1/accounts/qa-a663bf73248a
X-Served-Region: us
Content-Length: 181

{"id":"acc_025e2a6a-0be9-4bbb-8464-92cd36107d83","handle":"qa-a663bf73248a","displayName":"QA a663bf73248a","region":"us","role":"user","createdAt":"2026-11-25T11:27:54.067891750Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2c2d08c3-3966-4285-84f9-f5a981c23715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c2d08c3-3966-4285-84f9-f5a981c23715
Content-Type: application/json

--- request body ---
{"handle":"qa-a2b189c2a164","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c2d08c3-3966-4285-84f9-f5a981c23715
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5a40ed9-8882-47b9-a760-f64f4278d85c"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8bcff60b-7fb1-4f84-8f0e-de20deb1f2ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bcff60b-7fb1-4f84-8f0e-de20deb1f2ad
Content-Type: application/json

--- request body ---
{"handle":"qa-a2b189c2a164","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bcff60b-7fb1-4f84-8f0e-de20deb1f2ad
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5a40ed9-8882-47b9-a760-f64f4278d85c"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c1c8d3f-c73f-44cc-8b88-521a362a9bd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c1c8d3f-c73f-44cc-8b88-521a362a9bd5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c1c8d3f-c73f-44cc-8b88-521a362a9bd5
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

{"id":"acc_d5a40ed9-8882-47b9-a760-f64f4278d85c","handle":"qa-a2b189c2a164","displayName":"QA a2b189c2a164","region":"eu","role":"user","createdAt":"2026-11-25T11:27:54.012967973Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-a663bf73248a
correlation: qa-257774e7-2175-4ed2-9403-90838fd91b5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-257774e7-2175-4ed2-9403-90838fd91b5e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-257774e7-2175-4ed2-9403-90838fd91b5e
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

{"handle":"qa-a663bf73248a","displayName":"QA a663bf73248a","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-6360a435-5269-47bf-8b8f-86cb6e163949

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6360a435-5269-47bf-8b8f-86cb6e163949
Content-Type: application/json

--- request body ---
{"handle":"qa-a663bf73248a","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-6360a435-5269-47bf-8b8f-86cb6e163949
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_025e2a6a-0be9-4bbb-8464-92cd36107d83"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5603d2d4-6526-4494-a63a-af156ad03059

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5603d2d4-6526-4494-a63a-af156ad03059
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5603d2d4-6526-4494-a63a-af156ad03059
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
correlation: qa-252c234d-7e05-47c5-83ee-75e75420aafc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-252c234d-7e05-47c5-83ee-75e75420aafc
Content-Type: application/json

--- request body ---
{"handle":"qa-a663bf73248a","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-252c234d-7e05-47c5-83ee-75e75420aafc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-252c234d-7e05-47c5-83ee-75e75420aafc"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83f296b3-d9e8-47bf-8344-6dce0ec74a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83f296b3-d9e8-47bf-8344-6dce0ec74a2a
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83f296b3-d9e8-47bf-8344-6dce0ec74a2a
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
correlation: qa-23e80174-5258-49db-97b4-05a18f5eeb99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23e80174-5258-49db-97b4-05a18f5eeb99
Content-Type: application/json

--- request body ---
{"handle":"qa-a2b189c2a164","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23e80174-5258-49db-97b4-05a18f5eeb99
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-23e80174-5258-49db-97b4-05a18f5eeb99"}
```
