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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-86f2adec-f9e8-48ed-a3e6-26115d8a6e16` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-48a499c6-9de3-4b61-aa57-de8b4cbff272` |
| 3 | `POST /v1/credits/purchases` | 422 | 13 | `qa-d27e2705-5811-4436-a419-ee38275c75d3` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6e56f867-33f3-4ffa-a305-b2a8bae60642` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-ad2c0f63-a45b-4815-b187-1bb43f2d0f86` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-86f2adec-f9e8-48ed-a3e6-26115d8a6e16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f2adec-f9e8-48ed-a3e6-26115d8a6e16
Content-Type: application/json

--- request body ---
{"handle":"qa-29b4effc26d6","displayName":"QA 29b4effc26d6","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-86f2adec-f9e8-48ed-a3e6-26115d8a6e16
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
Location: /v1/accounts/qa-29b4effc26d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f74e9702-ce16-4a15-bb89-3fe7672353b1","handle":"qa-29b4effc26d6","displayName":"QA 29b4effc26d6","region":"eu","role":"user","createdAt":"2026-11-27T10:59:51.691700495Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-48a499c6-9de3-4b61-aa57-de8b4cbff272

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a499c6-9de3-4b61-aa57-de8b4cbff272
Content-Type: application/json

--- request body ---
{"handle":"qa-29b4effc26d6","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-48a499c6-9de3-4b61-aa57-de8b4cbff272
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f74e9702-ce16-4a15-bb89-3fe7672353b1"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d27e2705-5811-4436-a419-ee38275c75d3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-133cdaaa827b4b5e8a7f0db15146ec67
X-Correlation-Id: qa-d27e2705-5811-4436-a419-ee38275c75d3
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d27e2705-5811-4436-a419-ee38275c75d3
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-d27e2705-5811-4436-a419-ee38275c75d3","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e56f867-33f3-4ffa-a305-b2a8bae60642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e56f867-33f3-4ffa-a305-b2a8bae60642
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e56f867-33f3-4ffa-a305-b2a8bae60642
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
correlation: qa-ad2c0f63-a45b-4815-b187-1bb43f2d0f86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad2c0f63-a45b-4815-b187-1bb43f2d0f86
Content-Type: application/json

--- request body ---
{"handle":"qa-29b4effc26d6","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad2c0f63-a45b-4815-b187-1bb43f2d0f86
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad2c0f63-a45b-4815-b187-1bb43f2d0f86"}
```
