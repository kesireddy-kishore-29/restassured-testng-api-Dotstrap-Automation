# Transcript: An unknown credit pack is a 422 on packId

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#unknownPackIsA422` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-882f64cf-d0c7-48cb-836b-312eb795a2ae` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-ce380b32-7b44-49cf-a354-a77e2ac417a6` |
| 3 | `POST /v1/credits/purchases` | 422 | 9 | `qa-c85a73f9-501b-44aa-bd0d-6a2107ef64d8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-fa4123e5-62ae-4f00-a081-4b6ec24262ee` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-66b46e21-5f54-4c4b-8de4-ec3daa487eb8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-882f64cf-d0c7-48cb-836b-312eb795a2ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-882f64cf-d0c7-48cb-836b-312eb795a2ae
Content-Type: application/json

--- request body ---
{"handle":"qa-2e0e43d81cd2","displayName":"QA 2e0e43d81cd2","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-882f64cf-d0c7-48cb-836b-312eb795a2ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-2e0e43d81cd2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_326e2681-cbd2-47aa-9f21-c6d722cf9447","handle":"qa-2e0e43d81cd2","displayName":"QA 2e0e43d81cd2","region":"eu","role":"user","createdAt":"2026-11-19T10:29:20.815341205Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ce380b32-7b44-49cf-a354-a77e2ac417a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce380b32-7b44-49cf-a354-a77e2ac417a6
Content-Type: application/json

--- request body ---
{"handle":"qa-2e0e43d81cd2","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce380b32-7b44-49cf-a354-a77e2ac417a6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_326e2681-cbd2-47aa-9f21-c6d722cf9447"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c85a73f9-501b-44aa-bd0d-6a2107ef64d8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3a4c0949ea8542ec898731cae97df0bb
X-Correlation-Id: qa-c85a73f9-501b-44aa-bd0d-6a2107ef64d8
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c85a73f9-501b-44aa-bd0d-6a2107ef64d8
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-c85a73f9-501b-44aa-bd0d-6a2107ef64d8","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa4123e5-62ae-4f00-a081-4b6ec24262ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa4123e5-62ae-4f00-a081-4b6ec24262ee
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa4123e5-62ae-4f00-a081-4b6ec24262ee
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
correlation: qa-66b46e21-5f54-4c4b-8de4-ec3daa487eb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66b46e21-5f54-4c4b-8de4-ec3daa487eb8
Content-Type: application/json

--- request body ---
{"handle":"qa-2e0e43d81cd2","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66b46e21-5f54-4c4b-8de4-ec3daa487eb8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-66b46e21-5f54-4c4b-8de4-ec3daa487eb8"}
```
