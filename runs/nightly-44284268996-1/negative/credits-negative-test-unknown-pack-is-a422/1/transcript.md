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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-434d34c7-949f-47eb-b1f3-e76040625613` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-cc5cca5a-c449-4e25-8015-83668583ce1e` |
| 3 | `POST /v1/credits/purchases` | 422 | 9 | `qa-c7247b4d-bde5-43cd-929f-b026d13b94d0` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-af1161f0-7b13-45bc-a95e-99981f9a526f` |
| 5 | `POST /v1/auth/token` | 401 | 18 | `qa-3563bb41-d667-4b95-b1e2-a2ff9740ca00` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-434d34c7-949f-47eb-b1f3-e76040625613

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-434d34c7-949f-47eb-b1f3-e76040625613
Content-Type: application/json

--- request body ---
{"handle":"qa-c00a9b9124cc","displayName":"QA c00a9b9124cc","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-434d34c7-949f-47eb-b1f3-e76040625613
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
Location: /v1/accounts/qa-c00a9b9124cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38a520ed-0a30-4b04-ac04-ab4d12d6823c","handle":"qa-c00a9b9124cc","displayName":"QA c00a9b9124cc","region":"eu","role":"user","createdAt":"2026-11-18T10:20:00.192071969Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cc5cca5a-c449-4e25-8015-83668583ce1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc5cca5a-c449-4e25-8015-83668583ce1e
Content-Type: application/json

--- request body ---
{"handle":"qa-c00a9b9124cc","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc5cca5a-c449-4e25-8015-83668583ce1e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38a520ed-0a30-4b04-ac04-ab4d12d6823c"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c7247b4d-bde5-43cd-929f-b026d13b94d0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-22f2aae9e7b74ab9996628be144bf201
X-Correlation-Id: qa-c7247b4d-bde5-43cd-929f-b026d13b94d0
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 9 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7247b4d-bde5-43cd-929f-b026d13b94d0
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-c7247b4d-bde5-43cd-929f-b026d13b94d0","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af1161f0-7b13-45bc-a95e-99981f9a526f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af1161f0-7b13-45bc-a95e-99981f9a526f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af1161f0-7b13-45bc-a95e-99981f9a526f
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
correlation: qa-3563bb41-d667-4b95-b1e2-a2ff9740ca00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3563bb41-d667-4b95-b1e2-a2ff9740ca00
Content-Type: application/json

--- request body ---
{"handle":"qa-c00a9b9124cc","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3563bb41-d667-4b95-b1e2-a2ff9740ca00
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3563bb41-d667-4b95-b1e2-a2ff9740ca00"}
```
