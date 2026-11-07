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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-523192ac-7f87-408c-a9ff-aa83bedb631b` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-fc869154-e30b-4101-82c7-e42b502711b5` |
| 3 | `POST /v1/credits/purchases` | 422 | 26 | `qa-5b2e2c07-57e1-46b6-baac-b86f1e83fdec` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-3824be8b-ead7-40ae-9a6e-a2eb867247c3` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-93f0bb5c-42a1-4b56-956f-4c2a4737b1e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-523192ac-7f87-408c-a9ff-aa83bedb631b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-523192ac-7f87-408c-a9ff-aa83bedb631b
Content-Type: application/json

--- request body ---
{"handle":"qa-e63af6b79428","displayName":"QA e63af6b79428","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-523192ac-7f87-408c-a9ff-aa83bedb631b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Location: /v1/accounts/qa-e63af6b79428
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4da9cceb-2c76-45bf-8587-7c17690bed91","handle":"qa-e63af6b79428","displayName":"QA e63af6b79428","region":"eu","role":"user","createdAt":"2026-11-03T09:41:37.607073768Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fc869154-e30b-4101-82c7-e42b502711b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc869154-e30b-4101-82c7-e42b502711b5
Content-Type: application/json

--- request body ---
{"handle":"qa-e63af6b79428","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc869154-e30b-4101-82c7-e42b502711b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4da9cceb-2c76-45bf-8587-7c17690bed91"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5b2e2c07-57e1-46b6-baac-b86f1e83fdec

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ec8f18dbe2f64edbb42201da7cb4e809
X-Correlation-Id: qa-5b2e2c07-57e1-46b6-baac-b86f1e83fdec
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b2e2c07-57e1-46b6-baac-b86f1e83fdec
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-5b2e2c07-57e1-46b6-baac-b86f1e83fdec","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3824be8b-ead7-40ae-9a6e-a2eb867247c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3824be8b-ead7-40ae-9a6e-a2eb867247c3
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3824be8b-ead7-40ae-9a6e-a2eb867247c3
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
correlation: qa-93f0bb5c-42a1-4b56-956f-4c2a4737b1e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93f0bb5c-42a1-4b56-956f-4c2a4737b1e0
Content-Type: application/json

--- request body ---
{"handle":"qa-e63af6b79428","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93f0bb5c-42a1-4b56-956f-4c2a4737b1e0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93f0bb5c-42a1-4b56-956f-4c2a4737b1e0"}
```
