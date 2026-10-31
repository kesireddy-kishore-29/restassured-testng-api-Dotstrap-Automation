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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-08565591-30b0-4078-80b4-629c0716a21e` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-9d2ff286-b14a-482f-8f14-ed6a5f0933f9` |
| 3 | `POST /v1/credits/purchases` | 422 | 15 | `qa-c7ab27cf-64f7-414c-bbeb-3b5c8a8d7493` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c26452ba-1724-4124-9962-42f829368692` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-409b7827-6751-4832-9774-7532affbaf8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-08565591-30b0-4078-80b4-629c0716a21e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08565591-30b0-4078-80b4-629c0716a21e
Content-Type: application/json

--- request body ---
{"handle":"qa-5f55c1c09327","displayName":"QA 5f55c1c09327","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-08565591-30b0-4078-80b4-629c0716a21e
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
Location: /v1/accounts/qa-5f55c1c09327
X-Served-Region: eu
Content-Length: 181

{"id":"acc_870e1b08-258b-40e7-8b93-4562567db3ef","handle":"qa-5f55c1c09327","displayName":"QA 5f55c1c09327","region":"eu","role":"user","createdAt":"2026-10-23T07:41:17.482383274Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9d2ff286-b14a-482f-8f14-ed6a5f0933f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d2ff286-b14a-482f-8f14-ed6a5f0933f9
Content-Type: application/json

--- request body ---
{"handle":"qa-5f55c1c09327","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d2ff286-b14a-482f-8f14-ed6a5f0933f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_870e1b08-258b-40e7-8b93-4562567db3ef"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c7ab27cf-64f7-414c-bbeb-3b5c8a8d7493

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4ea10f10ae7f4ddaa275d7f0afe7fc32
X-Correlation-Id: qa-c7ab27cf-64f7-414c-bbeb-3b5c8a8d7493
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7ab27cf-64f7-414c-bbeb-3b5c8a8d7493
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-c7ab27cf-64f7-414c-bbeb-3b5c8a8d7493","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c26452ba-1724-4124-9962-42f829368692

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c26452ba-1724-4124-9962-42f829368692
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c26452ba-1724-4124-9962-42f829368692
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
correlation: qa-409b7827-6751-4832-9774-7532affbaf8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-409b7827-6751-4832-9774-7532affbaf8e
Content-Type: application/json

--- request body ---
{"handle":"qa-5f55c1c09327","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-409b7827-6751-4832-9774-7532affbaf8e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-409b7827-6751-4832-9774-7532affbaf8e"}
```
