# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-33ca5922-13ac-4ccc-8ecc-10367884768e` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-536f2d99-c7bb-4339-995a-f8ad0e62061a` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 5 | `qa-b89422ea-f1ca-413f-9478-765ffb3d462c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-f8771856-5f15-4c6f-8bb5-cfa8d71f3947` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-71a36766-ecde-44ab-8f72-da9d8f591d25` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-33ca5922-13ac-4ccc-8ecc-10367884768e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33ca5922-13ac-4ccc-8ecc-10367884768e
Content-Type: application/json

--- request body ---
{"handle":"qa-ecc188aa968b","displayName":"QA ecc188aa968b","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-33ca5922-13ac-4ccc-8ecc-10367884768e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Location: /v1/accounts/qa-ecc188aa968b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25274879-6c0e-4a00-b612-b1bf9f509b06","handle":"qa-ecc188aa968b","displayName":"QA ecc188aa968b","region":"eu","role":"user","createdAt":"2026-11-28T10:37:26.429298221Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-536f2d99-c7bb-4339-995a-f8ad0e62061a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-536f2d99-c7bb-4339-995a-f8ad0e62061a
Content-Type: application/json

--- request body ---
{"handle":"qa-ecc188aa968b","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-536f2d99-c7bb-4339-995a-f8ad0e62061a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25274879-6c0e-4a00-b612-b1bf9f509b06"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-b89422ea-f1ca-413f-9478-765ffb3d462c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b89422ea-f1ca-413f-9478-765ffb3d462c
Content-Type: application/json

--- response: 404 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b89422ea-f1ca-413f-9478-765ffb3d462c
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-b89422ea-f1ca-413f-9478-765ffb3d462c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8771856-5f15-4c6f-8bb5-cfa8d71f3947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8771856-5f15-4c6f-8bb5-cfa8d71f3947
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8771856-5f15-4c6f-8bb5-cfa8d71f3947
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
correlation: qa-71a36766-ecde-44ab-8f72-da9d8f591d25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71a36766-ecde-44ab-8f72-da9d8f591d25
Content-Type: application/json

--- request body ---
{"handle":"qa-ecc188aa968b","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71a36766-ecde-44ab-8f72-da9d8f591d25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71a36766-ecde-44ab-8f72-da9d8f591d25"}
```
