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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-5c6bb716-05dd-4c78-85be-623eed94bfaa` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-72c879ae-020c-4011-b7a7-1012138c916c` |
| 3 | `POST /v1/credits/purchases` | 422 | 20 | `qa-d6f84464-5024-40bf-a4d1-060d23317bff` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-ba372f91-4cb6-40d0-ac02-cbbf8e116550` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-5c64649d-3baf-4188-830f-528b6a92fed4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5c6bb716-05dd-4c78-85be-623eed94bfaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c6bb716-05dd-4c78-85be-623eed94bfaa
Content-Type: application/json

--- request body ---
{"handle":"qa-fc9e94f2bed7","displayName":"QA fc9e94f2bed7","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c6bb716-05dd-4c78-85be-623eed94bfaa
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
Location: /v1/accounts/qa-fc9e94f2bed7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7dda37f-f850-4c28-8ab7-039e1af25de1","handle":"qa-fc9e94f2bed7","displayName":"QA fc9e94f2bed7","region":"eu","role":"user","createdAt":"2026-11-25T11:28:07.229216106Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-72c879ae-020c-4011-b7a7-1012138c916c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72c879ae-020c-4011-b7a7-1012138c916c
Content-Type: application/json

--- request body ---
{"handle":"qa-fc9e94f2bed7","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-72c879ae-020c-4011-b7a7-1012138c916c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7dda37f-f850-4c28-8ab7-039e1af25de1"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d6f84464-5024-40bf-a4d1-060d23317bff

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e3f69db3eeaa4a0292e2cc21ded17ae2
X-Correlation-Id: qa-d6f84464-5024-40bf-a4d1-060d23317bff
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 20 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6f84464-5024-40bf-a4d1-060d23317bff
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-d6f84464-5024-40bf-a4d1-060d23317bff","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba372f91-4cb6-40d0-ac02-cbbf8e116550

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba372f91-4cb6-40d0-ac02-cbbf8e116550
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba372f91-4cb6-40d0-ac02-cbbf8e116550
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
correlation: qa-5c64649d-3baf-4188-830f-528b6a92fed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c64649d-3baf-4188-830f-528b6a92fed4
Content-Type: application/json

--- request body ---
{"handle":"qa-fc9e94f2bed7","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c64649d-3baf-4188-830f-528b6a92fed4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c64649d-3baf-4188-830f-528b6a92fed4"}
```
