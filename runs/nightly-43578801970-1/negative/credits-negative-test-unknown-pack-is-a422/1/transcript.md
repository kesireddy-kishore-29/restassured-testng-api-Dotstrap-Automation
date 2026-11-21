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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-fd0fec5c-3f76-4b3e-a9e9-7df8001bac9e` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-8ea0934e-d99d-4ef3-84cd-c8978d0a8a31` |
| 3 | `POST /v1/credits/purchases` | 422 | 16 | `qa-0866d0dc-c584-4cbb-a817-7b4f473f6010` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-81607457-0a2a-48c6-8ae2-d218a79ab395` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-cd457965-f2d2-4153-9720-ea9efac38787` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd0fec5c-3f76-4b3e-a9e9-7df8001bac9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd0fec5c-3f76-4b3e-a9e9-7df8001bac9e
Content-Type: application/json

--- request body ---
{"handle":"qa-7e5b10360570","displayName":"QA 7e5b10360570","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd0fec5c-3f76-4b3e-a9e9-7df8001bac9e
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
Location: /v1/accounts/qa-7e5b10360570
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f3f82d73-350d-43cd-b625-1f008bda9bcb","handle":"qa-7e5b10360570","displayName":"QA 7e5b10360570","region":"eu","role":"user","createdAt":"2026-11-14T09:05:21.997823302Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8ea0934e-d99d-4ef3-84cd-c8978d0a8a31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ea0934e-d99d-4ef3-84cd-c8978d0a8a31
Content-Type: application/json

--- request body ---
{"handle":"qa-7e5b10360570","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ea0934e-d99d-4ef3-84cd-c8978d0a8a31
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f82d73-350d-43cd-b625-1f008bda9bcb"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0866d0dc-c584-4cbb-a817-7b4f473f6010

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c27d06f78ea94c87af41d6980eabc9c0
X-Correlation-Id: qa-0866d0dc-c584-4cbb-a817-7b4f473f6010
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0866d0dc-c584-4cbb-a817-7b4f473f6010
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-0866d0dc-c584-4cbb-a817-7b4f473f6010","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81607457-0a2a-48c6-8ae2-d218a79ab395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81607457-0a2a-48c6-8ae2-d218a79ab395
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81607457-0a2a-48c6-8ae2-d218a79ab395
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
correlation: qa-cd457965-f2d2-4153-9720-ea9efac38787

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd457965-f2d2-4153-9720-ea9efac38787
Content-Type: application/json

--- request body ---
{"handle":"qa-7e5b10360570","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd457965-f2d2-4153-9720-ea9efac38787
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd457965-f2d2-4153-9720-ea9efac38787"}
```
