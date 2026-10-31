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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-a0c5f903-d157-4058-b8b1-ab5c46cf6aa0` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-db078325-8062-43a9-9a92-00f483a2f019` |
| 3 | `POST /v1/credits/purchases` | 422 | 10 | `qa-f5b1ea66-d54a-4a67-a3d9-91ef97056dac` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6e9cd584-e098-42dd-8e83-887f29de8812` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-7f53eb94-bc84-4cac-8df8-a8d70e04b466` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a0c5f903-d157-4058-b8b1-ab5c46cf6aa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c5f903-d157-4058-b8b1-ab5c46cf6aa0
Content-Type: application/json

--- request body ---
{"handle":"qa-61aeb01cf2b6","displayName":"QA 61aeb01cf2b6","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0c5f903-d157-4058-b8b1-ab5c46cf6aa0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-61aeb01cf2b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1994e79-4872-44de-ad9c-f736802f73f5","handle":"qa-61aeb01cf2b6","displayName":"QA 61aeb01cf2b6","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.575637030Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-db078325-8062-43a9-9a92-00f483a2f019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db078325-8062-43a9-9a92-00f483a2f019
Content-Type: application/json

--- request body ---
{"handle":"qa-61aeb01cf2b6","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-db078325-8062-43a9-9a92-00f483a2f019
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b1994e79-4872-44de-ad9c-f736802f73f5"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f5b1ea66-d54a-4a67-a3d9-91ef97056dac

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d06e988d88994ec6aa207dcf2ac0135f
X-Correlation-Id: qa-f5b1ea66-d54a-4a67-a3d9-91ef97056dac
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5b1ea66-d54a-4a67-a3d9-91ef97056dac
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-f5b1ea66-d54a-4a67-a3d9-91ef97056dac","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e9cd584-e098-42dd-8e83-887f29de8812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e9cd584-e098-42dd-8e83-887f29de8812
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e9cd584-e098-42dd-8e83-887f29de8812
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
correlation: qa-7f53eb94-bc84-4cac-8df8-a8d70e04b466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f53eb94-bc84-4cac-8df8-a8d70e04b466
Content-Type: application/json

--- request body ---
{"handle":"qa-61aeb01cf2b6","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f53eb94-bc84-4cac-8df8-a8d70e04b466
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f53eb94-bc84-4cac-8df8-a8d70e04b466"}
```
