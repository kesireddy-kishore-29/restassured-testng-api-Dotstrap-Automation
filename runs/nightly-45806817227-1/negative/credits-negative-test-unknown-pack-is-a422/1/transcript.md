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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-beaacb8f-1a80-4166-8537-d4e8b402154c` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-7f6ed87c-aed8-49c1-9518-c9387b71feff` |
| 3 | `POST /v1/credits/purchases` | 422 | 10 | `qa-46c70cb9-b201-4fd7-86f7-395a01df2129` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-4f7b36d3-23a7-4629-b922-bd687238c7c9` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-f8d5a762-c275-4c99-8a8c-139a28fae313` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-beaacb8f-1a80-4166-8537-d4e8b402154c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-beaacb8f-1a80-4166-8537-d4e8b402154c
Content-Type: application/json

--- request body ---
{"handle":"qa-a9680f7b3426","displayName":"QA a9680f7b3426","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-beaacb8f-1a80-4166-8537-d4e8b402154c
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
Location: /v1/accounts/qa-a9680f7b3426
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29c6f006-9e2c-4ab4-b770-89d198e53943","handle":"qa-a9680f7b3426","displayName":"QA a9680f7b3426","region":"eu","role":"user","createdAt":"2026-11-26T11:02:36.201519897Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7f6ed87c-aed8-49c1-9518-c9387b71feff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f6ed87c-aed8-49c1-9518-c9387b71feff
Content-Type: application/json

--- request body ---
{"handle":"qa-a9680f7b3426","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f6ed87c-aed8-49c1-9518-c9387b71feff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29c6f006-9e2c-4ab4-b770-89d198e53943"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-46c70cb9-b201-4fd7-86f7-395a01df2129

--- request headers ---
Accept: application/json
Idempotency-Key: qa-143a80afc8ab490ea6c522da2db1421e
X-Correlation-Id: qa-46c70cb9-b201-4fd7-86f7-395a01df2129
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46c70cb9-b201-4fd7-86f7-395a01df2129
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-46c70cb9-b201-4fd7-86f7-395a01df2129","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f7b36d3-23a7-4629-b922-bd687238c7c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f7b36d3-23a7-4629-b922-bd687238c7c9
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f7b36d3-23a7-4629-b922-bd687238c7c9
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
correlation: qa-f8d5a762-c275-4c99-8a8c-139a28fae313

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8d5a762-c275-4c99-8a8c-139a28fae313
Content-Type: application/json

--- request body ---
{"handle":"qa-a9680f7b3426","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8d5a762-c275-4c99-8a8c-139a28fae313
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8d5a762-c275-4c99-8a8c-139a28fae313"}
```
