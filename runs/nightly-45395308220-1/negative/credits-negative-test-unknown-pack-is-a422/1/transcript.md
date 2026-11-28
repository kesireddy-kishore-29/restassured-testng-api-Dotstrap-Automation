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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-6db65faf-9e6c-4093-a078-4e307d3b4606` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-1074f957-6f03-4611-bb60-53229e2d48e1` |
| 3 | `POST /v1/credits/purchases` | 422 | 13 | `qa-7cf2b729-62b5-49f1-97c6-c854f3c8bdb4` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-9ad74d98-196c-42e2-af42-e9be21201d19` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-21e87ff7-9069-4ddd-ab5d-fbb7deb6b309` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6db65faf-9e6c-4093-a078-4e307d3b4606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6db65faf-9e6c-4093-a078-4e307d3b4606
Content-Type: application/json

--- request body ---
{"handle":"qa-19ba3e7d6f0f","displayName":"QA 19ba3e7d6f0f","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6db65faf-9e6c-4093-a078-4e307d3b4606
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
Location: /v1/accounts/qa-19ba3e7d6f0f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_398f8a72-9f03-4309-a9ae-847b8b1eb8aa","handle":"qa-19ba3e7d6f0f","displayName":"QA 19ba3e7d6f0f","region":"eu","role":"user","createdAt":"2026-11-24T12:38:00.697808953Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1074f957-6f03-4611-bb60-53229e2d48e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1074f957-6f03-4611-bb60-53229e2d48e1
Content-Type: application/json

--- request body ---
{"handle":"qa-19ba3e7d6f0f","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1074f957-6f03-4611-bb60-53229e2d48e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_398f8a72-9f03-4309-a9ae-847b8b1eb8aa"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7cf2b729-62b5-49f1-97c6-c854f3c8bdb4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-de6d2481a0a042638eb41d066f2a0db1
X-Correlation-Id: qa-7cf2b729-62b5-49f1-97c6-c854f3c8bdb4
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7cf2b729-62b5-49f1-97c6-c854f3c8bdb4
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-7cf2b729-62b5-49f1-97c6-c854f3c8bdb4","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ad74d98-196c-42e2-af42-e9be21201d19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ad74d98-196c-42e2-af42-e9be21201d19
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ad74d98-196c-42e2-af42-e9be21201d19
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
correlation: qa-21e87ff7-9069-4ddd-ab5d-fbb7deb6b309

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21e87ff7-9069-4ddd-ab5d-fbb7deb6b309
Content-Type: application/json

--- request body ---
{"handle":"qa-19ba3e7d6f0f","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21e87ff7-9069-4ddd-ab5d-fbb7deb6b309
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-21e87ff7-9069-4ddd-ab5d-fbb7deb6b309"}
```
