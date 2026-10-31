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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-faa3e239-e0c8-4c46-ab19-d00db5cb4500` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-6eeb23a5-4d47-4af6-b85c-7c713d5d8acb` |
| 3 | `POST /v1/credits/purchases` | 422 | 19 | `qa-7b02dff2-3e11-4a52-b526-8810f86fafd2` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8aa05e27-cc15-4deb-b47f-f6122d3b73ee` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-be071d05-c087-4355-8dd4-a562d5483e32` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-faa3e239-e0c8-4c46-ab19-d00db5cb4500

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faa3e239-e0c8-4c46-ab19-d00db5cb4500
Content-Type: application/json

--- request body ---
{"handle":"qa-49ef3bcae24b","displayName":"QA 49ef3bcae24b","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-faa3e239-e0c8-4c46-ab19-d00db5cb4500
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-49ef3bcae24b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b70e1b6-98ec-4928-8b9c-2430c84a249c","handle":"qa-49ef3bcae24b","displayName":"QA 49ef3bcae24b","region":"eu","role":"user","createdAt":"2026-10-28T08:42:59.842393709Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6eeb23a5-4d47-4af6-b85c-7c713d5d8acb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eeb23a5-4d47-4af6-b85c-7c713d5d8acb
Content-Type: application/json

--- request body ---
{"handle":"qa-49ef3bcae24b","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eeb23a5-4d47-4af6-b85c-7c713d5d8acb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b70e1b6-98ec-4928-8b9c-2430c84a249c"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7b02dff2-3e11-4a52-b526-8810f86fafd2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c072ec0f487249e4bdd27417345e8d89
X-Correlation-Id: qa-7b02dff2-3e11-4a52-b526-8810f86fafd2
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b02dff2-3e11-4a52-b526-8810f86fafd2
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-7b02dff2-3e11-4a52-b526-8810f86fafd2","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8aa05e27-cc15-4deb-b47f-f6122d3b73ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aa05e27-cc15-4deb-b47f-f6122d3b73ee
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8aa05e27-cc15-4deb-b47f-f6122d3b73ee
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
correlation: qa-be071d05-c087-4355-8dd4-a562d5483e32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be071d05-c087-4355-8dd4-a562d5483e32
Content-Type: application/json

--- request body ---
{"handle":"qa-49ef3bcae24b","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be071d05-c087-4355-8dd4-a562d5483e32
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be071d05-c087-4355-8dd4-a562d5483e32"}
```
