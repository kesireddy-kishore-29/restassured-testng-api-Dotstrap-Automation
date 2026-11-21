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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-4f2e293f-0204-4997-a0cf-27ce5e61aff5` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-65f63b48-9b73-41de-a855-b0169b080802` |
| 3 | `POST /v1/credits/purchases` | 422 | 7 | `qa-d3393ef7-95f8-484c-95f2-fb3afbbf3f0a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-69ced3f7-7bcb-463a-ad2a-f24bf10795d6` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-bd18d6a5-dd79-4fbb-b9c7-6b04a0e84647` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4f2e293f-0204-4997-a0cf-27ce5e61aff5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f2e293f-0204-4997-a0cf-27ce5e61aff5
Content-Type: application/json

--- request body ---
{"handle":"qa-e0208cf66234","displayName":"QA e0208cf66234","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f2e293f-0204-4997-a0cf-27ce5e61aff5
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
Location: /v1/accounts/qa-e0208cf66234
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9ef943f-8b1e-405d-9b15-8391094e280d","handle":"qa-e0208cf66234","displayName":"QA e0208cf66234","region":"eu","role":"user","createdAt":"2026-11-20T10:09:52.885226700Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-65f63b48-9b73-41de-a855-b0169b080802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f63b48-9b73-41de-a855-b0169b080802
Content-Type: application/json

--- request body ---
{"handle":"qa-e0208cf66234","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-65f63b48-9b73-41de-a855-b0169b080802
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9ef943f-8b1e-405d-9b15-8391094e280d"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d3393ef7-95f8-484c-95f2-fb3afbbf3f0a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-04a5b11b4d6448f4a99dbcf952041d36
X-Correlation-Id: qa-d3393ef7-95f8-484c-95f2-fb3afbbf3f0a
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 7 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d3393ef7-95f8-484c-95f2-fb3afbbf3f0a
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-d3393ef7-95f8-484c-95f2-fb3afbbf3f0a","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69ced3f7-7bcb-463a-ad2a-f24bf10795d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69ced3f7-7bcb-463a-ad2a-f24bf10795d6
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69ced3f7-7bcb-463a-ad2a-f24bf10795d6
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
correlation: qa-bd18d6a5-dd79-4fbb-b9c7-6b04a0e84647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd18d6a5-dd79-4fbb-b9c7-6b04a0e84647
Content-Type: application/json

--- request body ---
{"handle":"qa-e0208cf66234","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd18d6a5-dd79-4fbb-b9c7-6b04a0e84647
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd18d6a5-dd79-4fbb-b9c7-6b04a0e84647"}
```
