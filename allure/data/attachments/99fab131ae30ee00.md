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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-2f2541a6-2a33-4071-a660-9ef7b51dea4f` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-e7bb55ff-2379-4964-83b8-e25069fbe257` |
| 3 | `POST /v1/credits/purchases` | 422 | 12 | `qa-1fa14506-2a4d-495a-a13b-416907836f06` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-122deb67-fcfb-479b-a921-30d8d03f4525` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-e573323a-fd35-4aed-a981-33e1486432b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2f2541a6-2a33-4071-a660-9ef7b51dea4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f2541a6-2a33-4071-a660-9ef7b51dea4f
Content-Type: application/json

--- request body ---
{"handle":"qa-8f58f50b442e","displayName":"QA 8f58f50b442e","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f2541a6-2a33-4071-a660-9ef7b51dea4f
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
Location: /v1/accounts/qa-8f58f50b442e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44b4ec14-9c02-4e8b-943e-ca18710961b9","handle":"qa-8f58f50b442e","displayName":"QA 8f58f50b442e","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.423390854Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e7bb55ff-2379-4964-83b8-e25069fbe257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7bb55ff-2379-4964-83b8-e25069fbe257
Content-Type: application/json

--- request body ---
{"handle":"qa-8f58f50b442e","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7bb55ff-2379-4964-83b8-e25069fbe257
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44b4ec14-9c02-4e8b-943e-ca18710961b9"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1fa14506-2a4d-495a-a13b-416907836f06

--- request headers ---
Accept: application/json
Idempotency-Key: qa-14f6373f90394702975f15b1bfc75e16
X-Correlation-Id: qa-1fa14506-2a4d-495a-a13b-416907836f06
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1fa14506-2a4d-495a-a13b-416907836f06
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-1fa14506-2a4d-495a-a13b-416907836f06","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-122deb67-fcfb-479b-a921-30d8d03f4525

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-122deb67-fcfb-479b-a921-30d8d03f4525
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-122deb67-fcfb-479b-a921-30d8d03f4525
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
correlation: qa-e573323a-fd35-4aed-a981-33e1486432b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e573323a-fd35-4aed-a981-33e1486432b4
Content-Type: application/json

--- request body ---
{"handle":"qa-8f58f50b442e","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e573323a-fd35-4aed-a981-33e1486432b4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e573323a-fd35-4aed-a981-33e1486432b4"}
```
