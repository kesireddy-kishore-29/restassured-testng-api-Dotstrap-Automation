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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-68701dde-6aef-4b29-ae08-d8d1711ff297` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-9a94cb0e-155c-4a31-a4f6-11aff024e5fc` |
| 3 | `POST /v1/credits/purchases` | 422 | 22 | `qa-50324c9e-26ca-4360-be38-7bd6f96ba5ce` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-a76176ca-0789-49bd-ab8f-1b188e7252ad` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-0c1bc12e-6bd5-4159-872f-0c92aeaea3cf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-68701dde-6aef-4b29-ae08-d8d1711ff297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68701dde-6aef-4b29-ae08-d8d1711ff297
Content-Type: application/json

--- request body ---
{"handle":"qa-c8484f7d2b4a","displayName":"QA c8484f7d2b4a","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-68701dde-6aef-4b29-ae08-d8d1711ff297
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
Location: /v1/accounts/qa-c8484f7d2b4a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89c329bf-8912-4100-bc54-05dcb7fca9d5","handle":"qa-c8484f7d2b4a","displayName":"QA c8484f7d2b4a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:42.513956434Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9a94cb0e-155c-4a31-a4f6-11aff024e5fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a94cb0e-155c-4a31-a4f6-11aff024e5fc
Content-Type: application/json

--- request body ---
{"handle":"qa-c8484f7d2b4a","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a94cb0e-155c-4a31-a4f6-11aff024e5fc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89c329bf-8912-4100-bc54-05dcb7fca9d5"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-50324c9e-26ca-4360-be38-7bd6f96ba5ce

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cb4aa3dd660a451cae9dcbb855b60428
X-Correlation-Id: qa-50324c9e-26ca-4360-be38-7bd6f96ba5ce
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50324c9e-26ca-4360-be38-7bd6f96ba5ce
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-50324c9e-26ca-4360-be38-7bd6f96ba5ce","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a76176ca-0789-49bd-ab8f-1b188e7252ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a76176ca-0789-49bd-ab8f-1b188e7252ad
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a76176ca-0789-49bd-ab8f-1b188e7252ad
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
correlation: qa-0c1bc12e-6bd5-4159-872f-0c92aeaea3cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c1bc12e-6bd5-4159-872f-0c92aeaea3cf
Content-Type: application/json

--- request body ---
{"handle":"qa-c8484f7d2b4a","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c1bc12e-6bd5-4159-872f-0c92aeaea3cf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c1bc12e-6bd5-4159-872f-0c92aeaea3cf"}
```
