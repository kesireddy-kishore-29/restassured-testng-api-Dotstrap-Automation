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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-cd6ec788-7c31-4f8b-ab85-35d60b475b22` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-324bcf83-b143-4d65-a585-54de3eeba019` |
| 3 | `POST /v1/credits/purchases` | 422 | 15 | `qa-a7e810eb-3fe7-4683-876a-34ee9aefd53b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-17611a03-6e3c-4ef3-a244-3e93dd46dfe8` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-d22c2573-b1fb-4b8e-b624-8afd703ecd5d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd6ec788-7c31-4f8b-ab85-35d60b475b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd6ec788-7c31-4f8b-ab85-35d60b475b22
Content-Type: application/json

--- request body ---
{"handle":"qa-89302e35623e","displayName":"QA 89302e35623e","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd6ec788-7c31-4f8b-ab85-35d60b475b22
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
Location: /v1/accounts/qa-89302e35623e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea5eaa27-4d06-4d76-97cb-08d3f0c944c1","handle":"qa-89302e35623e","displayName":"QA 89302e35623e","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.157043741Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-324bcf83-b143-4d65-a585-54de3eeba019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-324bcf83-b143-4d65-a585-54de3eeba019
Content-Type: application/json

--- request body ---
{"handle":"qa-89302e35623e","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-324bcf83-b143-4d65-a585-54de3eeba019
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea5eaa27-4d06-4d76-97cb-08d3f0c944c1"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a7e810eb-3fe7-4683-876a-34ee9aefd53b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e293165cf6324b7a8758bff161cfc464
X-Correlation-Id: qa-a7e810eb-3fe7-4683-876a-34ee9aefd53b
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7e810eb-3fe7-4683-876a-34ee9aefd53b
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-a7e810eb-3fe7-4683-876a-34ee9aefd53b","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17611a03-6e3c-4ef3-a244-3e93dd46dfe8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17611a03-6e3c-4ef3-a244-3e93dd46dfe8
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17611a03-6e3c-4ef3-a244-3e93dd46dfe8
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
correlation: qa-d22c2573-b1fb-4b8e-b624-8afd703ecd5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d22c2573-b1fb-4b8e-b624-8afd703ecd5d
Content-Type: application/json

--- request body ---
{"handle":"qa-89302e35623e","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d22c2573-b1fb-4b8e-b624-8afd703ecd5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d22c2573-b1fb-4b8e-b624-8afd703ecd5d"}
```
