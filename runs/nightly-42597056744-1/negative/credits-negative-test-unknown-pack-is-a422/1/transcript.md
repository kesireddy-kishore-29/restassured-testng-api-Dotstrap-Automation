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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-5b0fa651-7b17-4aef-93b1-3c250666f190` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-3d36f1b7-ab27-4f35-86d1-baee5fee9d86` |
| 3 | `POST /v1/credits/purchases` | 422 | 9 | `qa-9ed3b3d1-6aba-4ea1-a58b-49c0ec1a4cec` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ca0352f8-e3a0-4706-ba3f-c2c79a2e322c` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-c92752e9-96c1-482f-ab37-af963047ba3c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b0fa651-7b17-4aef-93b1-3c250666f190

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b0fa651-7b17-4aef-93b1-3c250666f190
Content-Type: application/json

--- request body ---
{"handle":"qa-ccc011af10c2","displayName":"QA ccc011af10c2","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b0fa651-7b17-4aef-93b1-3c250666f190
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
Location: /v1/accounts/qa-ccc011af10c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ca3c6863-b9fd-4445-9ec6-c3c7ffbbdc18","handle":"qa-ccc011af10c2","displayName":"QA ccc011af10c2","region":"eu","role":"user","createdAt":"2026-11-09T09:55:56.839401775Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3d36f1b7-ab27-4f35-86d1-baee5fee9d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d36f1b7-ab27-4f35-86d1-baee5fee9d86
Content-Type: application/json

--- request body ---
{"handle":"qa-ccc011af10c2","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d36f1b7-ab27-4f35-86d1-baee5fee9d86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ca3c6863-b9fd-4445-9ec6-c3c7ffbbdc18"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9ed3b3d1-6aba-4ea1-a58b-49c0ec1a4cec

--- request headers ---
Accept: application/json
Idempotency-Key: qa-19993d8d6db3487c8c9c0a19e4c447d7
X-Correlation-Id: qa-9ed3b3d1-6aba-4ea1-a58b-49c0ec1a4cec
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 9 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ed3b3d1-6aba-4ea1-a58b-49c0ec1a4cec
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-9ed3b3d1-6aba-4ea1-a58b-49c0ec1a4cec","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca0352f8-e3a0-4706-ba3f-c2c79a2e322c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca0352f8-e3a0-4706-ba3f-c2c79a2e322c
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca0352f8-e3a0-4706-ba3f-c2c79a2e322c
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
correlation: qa-c92752e9-96c1-482f-ab37-af963047ba3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c92752e9-96c1-482f-ab37-af963047ba3c
Content-Type: application/json

--- request body ---
{"handle":"qa-ccc011af10c2","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c92752e9-96c1-482f-ab37-af963047ba3c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c92752e9-96c1-482f-ab37-af963047ba3c"}
```
