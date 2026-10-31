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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-b155dcc1-3cc8-46ff-881f-97195677653f` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-cb2b9e58-202e-457b-862a-21c774f744af` |
| 3 | `POST /v1/credits/purchases` | 422 | 40 | `qa-78b8d2ca-3930-4964-895f-160939202763` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-0cc2ac1c-b86e-4c5d-bbac-d6e5b28eb5cf` |
| 5 | `POST /v1/auth/token` | 401 | 35 | `qa-608bbf32-75f4-4857-86e8-9672667d1255` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b155dcc1-3cc8-46ff-881f-97195677653f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b155dcc1-3cc8-46ff-881f-97195677653f
Content-Type: application/json

--- request body ---
{"handle":"qa-42cc006cff57","displayName":"QA 42cc006cff57","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b155dcc1-3cc8-46ff-881f-97195677653f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-42cc006cff57
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ee93147-6cb9-4c8f-8572-38ae4355e835","handle":"qa-42cc006cff57","displayName":"QA 42cc006cff57","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.565584883Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cb2b9e58-202e-457b-862a-21c774f744af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb2b9e58-202e-457b-862a-21c774f744af
Content-Type: application/json

--- request body ---
{"handle":"qa-42cc006cff57","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb2b9e58-202e-457b-862a-21c774f744af
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ee93147-6cb9-4c8f-8572-38ae4355e835"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-78b8d2ca-3930-4964-895f-160939202763

--- request headers ---
Accept: application/json
Idempotency-Key: qa-177359dd4d1446fc80b4c2239b6055b1
X-Correlation-Id: qa-78b8d2ca-3930-4964-895f-160939202763
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78b8d2ca-3930-4964-895f-160939202763
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-78b8d2ca-3930-4964-895f-160939202763","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0cc2ac1c-b86e-4c5d-bbac-d6e5b28eb5cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cc2ac1c-b86e-4c5d-bbac-d6e5b28eb5cf
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0cc2ac1c-b86e-4c5d-bbac-d6e5b28eb5cf
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
correlation: qa-608bbf32-75f4-4857-86e8-9672667d1255

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-608bbf32-75f4-4857-86e8-9672667d1255
Content-Type: application/json

--- request body ---
{"handle":"qa-42cc006cff57","password":"****"}

--- response: 401 in 35 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-608bbf32-75f4-4857-86e8-9672667d1255
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-608bbf32-75f4-4857-86e8-9672667d1255"}
```
