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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-eb895e94-f877-4fb8-96f0-ae297ee33c71` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-d3885d07-81ef-4bd9-a8e1-3edff6598032` |
| 3 | `POST /v1/credits/purchases` | 422 | 9 | `qa-cccd557c-4dc8-413d-8dcd-7eb513489f2c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-f5211c20-e814-4a3e-b8e9-da0295d4429f` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-5c74401b-ceae-4c61-9cab-f76ef7fd2bdb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eb895e94-f877-4fb8-96f0-ae297ee33c71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb895e94-f877-4fb8-96f0-ae297ee33c71
Content-Type: application/json

--- request body ---
{"handle":"qa-c66b7c2b599a","displayName":"QA c66b7c2b599a","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb895e94-f877-4fb8-96f0-ae297ee33c71
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
Location: /v1/accounts/qa-c66b7c2b599a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6097d0ef-b796-4355-acff-70eb0a2acd6f","handle":"qa-c66b7c2b599a","displayName":"QA c66b7c2b599a","region":"eu","role":"user","createdAt":"2026-11-06T09:30:29.655872888Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d3885d07-81ef-4bd9-a8e1-3edff6598032

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3885d07-81ef-4bd9-a8e1-3edff6598032
Content-Type: application/json

--- request body ---
{"handle":"qa-c66b7c2b599a","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3885d07-81ef-4bd9-a8e1-3edff6598032
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6097d0ef-b796-4355-acff-70eb0a2acd6f"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cccd557c-4dc8-413d-8dcd-7eb513489f2c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2bdad4235f7446a7a6dd677525c302c1
X-Correlation-Id: qa-cccd557c-4dc8-413d-8dcd-7eb513489f2c
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cccd557c-4dc8-413d-8dcd-7eb513489f2c
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-cccd557c-4dc8-413d-8dcd-7eb513489f2c","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f5211c20-e814-4a3e-b8e9-da0295d4429f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5211c20-e814-4a3e-b8e9-da0295d4429f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f5211c20-e814-4a3e-b8e9-da0295d4429f
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
correlation: qa-5c74401b-ceae-4c61-9cab-f76ef7fd2bdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c74401b-ceae-4c61-9cab-f76ef7fd2bdb
Content-Type: application/json

--- request body ---
{"handle":"qa-c66b7c2b599a","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c74401b-ceae-4c61-9cab-f76ef7fd2bdb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c74401b-ceae-4c61-9cab-f76ef7fd2bdb"}
```
