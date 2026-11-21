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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-e25c8b45-a979-4aac-a99e-4a14247b8f27` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-a37ce828-aab9-47cc-b72d-72ab6e395966` |
| 3 | `POST /v1/credits/purchases` | 422 | 12 | `qa-0d0fb161-3831-4f21-98a2-f4bf345198d8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2e22c390-acfa-47bd-aff2-f47c2b856fb5` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-f018b0cb-7655-4147-8fb6-27a6c92482e9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e25c8b45-a979-4aac-a99e-4a14247b8f27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e25c8b45-a979-4aac-a99e-4a14247b8f27
Content-Type: application/json

--- request body ---
{"handle":"qa-1e229f5e68ab","displayName":"QA 1e229f5e68ab","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e25c8b45-a979-4aac-a99e-4a14247b8f27
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
Location: /v1/accounts/qa-1e229f5e68ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5084bb89-e2c2-48c2-b2c1-0d1fec74aa8d","handle":"qa-1e229f5e68ab","displayName":"QA 1e229f5e68ab","region":"eu","role":"user","createdAt":"2026-11-17T10:50:11.804555558Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a37ce828-aab9-47cc-b72d-72ab6e395966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a37ce828-aab9-47cc-b72d-72ab6e395966
Content-Type: application/json

--- request body ---
{"handle":"qa-1e229f5e68ab","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a37ce828-aab9-47cc-b72d-72ab6e395966
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5084bb89-e2c2-48c2-b2c1-0d1fec74aa8d"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0d0fb161-3831-4f21-98a2-f4bf345198d8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-82d7e3ae71c449b7bc319ce9300a95c9
X-Correlation-Id: qa-0d0fb161-3831-4f21-98a2-f4bf345198d8
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d0fb161-3831-4f21-98a2-f4bf345198d8
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-0d0fb161-3831-4f21-98a2-f4bf345198d8","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e22c390-acfa-47bd-aff2-f47c2b856fb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e22c390-acfa-47bd-aff2-f47c2b856fb5
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e22c390-acfa-47bd-aff2-f47c2b856fb5
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
correlation: qa-f018b0cb-7655-4147-8fb6-27a6c92482e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f018b0cb-7655-4147-8fb6-27a6c92482e9
Content-Type: application/json

--- request body ---
{"handle":"qa-1e229f5e68ab","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f018b0cb-7655-4147-8fb6-27a6c92482e9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f018b0cb-7655-4147-8fb6-27a6c92482e9"}
```
