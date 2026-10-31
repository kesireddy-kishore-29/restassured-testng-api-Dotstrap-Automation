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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-360d8c11-ac2e-4539-96c2-db3e4fbc3e9f` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-3fda8ca3-4f5c-42c7-9385-cb01d8fd0b04` |
| 3 | `POST /v1/credits/purchases` | 422 | 18 | `qa-d83b03ef-bcb5-4801-a2eb-da2a3d8e62d3` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-0f88f256-6984-47ff-a0bd-1a972403d65b` |
| 5 | `POST /v1/auth/token` | 401 | 18 | `qa-50952f61-4e03-4d8c-bfdf-c2d3ccd2d134` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-360d8c11-ac2e-4539-96c2-db3e4fbc3e9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-360d8c11-ac2e-4539-96c2-db3e4fbc3e9f
Content-Type: application/json

--- request body ---
{"handle":"qa-de388cb3bde0","displayName":"QA de388cb3bde0","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-360d8c11-ac2e-4539-96c2-db3e4fbc3e9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-de388cb3bde0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_140759f1-aac4-481d-9889-f1443612e863","handle":"qa-de388cb3bde0","displayName":"QA de388cb3bde0","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.057723257Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3fda8ca3-4f5c-42c7-9385-cb01d8fd0b04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fda8ca3-4f5c-42c7-9385-cb01d8fd0b04
Content-Type: application/json

--- request body ---
{"handle":"qa-de388cb3bde0","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fda8ca3-4f5c-42c7-9385-cb01d8fd0b04
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_140759f1-aac4-481d-9889-f1443612e863"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d83b03ef-bcb5-4801-a2eb-da2a3d8e62d3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-11d001056fc34051ac33b0fd12c182f2
X-Correlation-Id: qa-d83b03ef-bcb5-4801-a2eb-da2a3d8e62d3
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d83b03ef-bcb5-4801-a2eb-da2a3d8e62d3
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-d83b03ef-bcb5-4801-a2eb-da2a3d8e62d3","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f88f256-6984-47ff-a0bd-1a972403d65b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f88f256-6984-47ff-a0bd-1a972403d65b
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f88f256-6984-47ff-a0bd-1a972403d65b
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
correlation: qa-50952f61-4e03-4d8c-bfdf-c2d3ccd2d134

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50952f61-4e03-4d8c-bfdf-c2d3ccd2d134
Content-Type: application/json

--- request body ---
{"handle":"qa-de388cb3bde0","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50952f61-4e03-4d8c-bfdf-c2d3ccd2d134
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50952f61-4e03-4d8c-bfdf-c2d3ccd2d134"}
```
