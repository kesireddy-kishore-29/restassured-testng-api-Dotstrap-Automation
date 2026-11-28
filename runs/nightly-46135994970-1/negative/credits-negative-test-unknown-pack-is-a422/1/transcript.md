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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-7e0f8691-12ba-4107-be7e-6da19e913910` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-fb2ffefe-cf58-40c9-b5ed-814774b140fc` |
| 3 | `POST /v1/credits/purchases` | 422 | 15 | `qa-80fd8730-63dd-4348-928d-99a4e78c2b1e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-693660b5-940c-44ba-9d95-4598669b3e70` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-ecbffaca-bf2b-4f0b-ad58-50da8e772650` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7e0f8691-12ba-4107-be7e-6da19e913910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e0f8691-12ba-4107-be7e-6da19e913910
Content-Type: application/json

--- request body ---
{"handle":"qa-59b277230f01","displayName":"QA 59b277230f01","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e0f8691-12ba-4107-be7e-6da19e913910
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
Location: /v1/accounts/qa-59b277230f01
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e60f22cc-c079-45c2-a629-899a0b510853","handle":"qa-59b277230f01","displayName":"QA 59b277230f01","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.063456574Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fb2ffefe-cf58-40c9-b5ed-814774b140fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb2ffefe-cf58-40c9-b5ed-814774b140fc
Content-Type: application/json

--- request body ---
{"handle":"qa-59b277230f01","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb2ffefe-cf58-40c9-b5ed-814774b140fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e60f22cc-c079-45c2-a629-899a0b510853"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-80fd8730-63dd-4348-928d-99a4e78c2b1e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c6a37fc0717041a9aab6131f87676f91
X-Correlation-Id: qa-80fd8730-63dd-4348-928d-99a4e78c2b1e
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80fd8730-63dd-4348-928d-99a4e78c2b1e
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-80fd8730-63dd-4348-928d-99a4e78c2b1e","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-693660b5-940c-44ba-9d95-4598669b3e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-693660b5-940c-44ba-9d95-4598669b3e70
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-693660b5-940c-44ba-9d95-4598669b3e70
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
correlation: qa-ecbffaca-bf2b-4f0b-ad58-50da8e772650

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecbffaca-bf2b-4f0b-ad58-50da8e772650
Content-Type: application/json

--- request body ---
{"handle":"qa-59b277230f01","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ecbffaca-bf2b-4f0b-ad58-50da8e772650
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ecbffaca-bf2b-4f0b-ad58-50da8e772650"}
```
