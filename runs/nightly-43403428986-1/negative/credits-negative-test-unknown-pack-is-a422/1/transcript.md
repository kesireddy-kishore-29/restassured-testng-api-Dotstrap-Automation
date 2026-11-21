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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-b7a5e9e6-76db-4e1c-a228-b465901c9e24` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-9e4da920-0596-49b3-9f2a-1a51ac1447d2` |
| 3 | `POST /v1/credits/purchases` | 422 | 13 | `qa-b0604864-6aee-4de4-87dc-b19a934ff23e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-8188ee7d-a678-4e26-87d4-f943e0707755` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-9f5466f9-8b68-4494-b2c7-f75cda49dbe5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b7a5e9e6-76db-4e1c-a228-b465901c9e24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7a5e9e6-76db-4e1c-a228-b465901c9e24
Content-Type: application/json

--- request body ---
{"handle":"qa-422511273eb0","displayName":"QA 422511273eb0","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7a5e9e6-76db-4e1c-a228-b465901c9e24
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
Location: /v1/accounts/qa-422511273eb0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2f40d43-6246-4282-aa86-023caba0800a","handle":"qa-422511273eb0","displayName":"QA 422511273eb0","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.503171229Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9e4da920-0596-49b3-9f2a-1a51ac1447d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e4da920-0596-49b3-9f2a-1a51ac1447d2
Content-Type: application/json

--- request body ---
{"handle":"qa-422511273eb0","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e4da920-0596-49b3-9f2a-1a51ac1447d2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2f40d43-6246-4282-aa86-023caba0800a"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b0604864-6aee-4de4-87dc-b19a934ff23e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5a6ce354bbf44cc6ad6a11fc8dcee3a9
X-Correlation-Id: qa-b0604864-6aee-4de4-87dc-b19a934ff23e
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0604864-6aee-4de4-87dc-b19a934ff23e
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-b0604864-6aee-4de4-87dc-b19a934ff23e","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8188ee7d-a678-4e26-87d4-f943e0707755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8188ee7d-a678-4e26-87d4-f943e0707755
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8188ee7d-a678-4e26-87d4-f943e0707755
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
correlation: qa-9f5466f9-8b68-4494-b2c7-f75cda49dbe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f5466f9-8b68-4494-b2c7-f75cda49dbe5
Content-Type: application/json

--- request body ---
{"handle":"qa-422511273eb0","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f5466f9-8b68-4494-b2c7-f75cda49dbe5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f5466f9-8b68-4494-b2c7-f75cda49dbe5"}
```
