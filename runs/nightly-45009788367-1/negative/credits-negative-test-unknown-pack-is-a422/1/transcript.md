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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-b02b780d-7f9c-4257-a7e3-c040d166fa0d` |
| 2 | `POST /v1/auth/token` | 200 | 38 | `qa-e645a8e7-bf66-437a-8aa5-f8ac97a8ea42` |
| 3 | `POST /v1/credits/purchases` | 422 | 17 | `qa-04759278-ed06-4075-bfcf-25f8637e04a3` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-98e5f210-80e5-44a2-acee-d4e0b58b08b1` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-c9c2080c-1360-40f6-ba43-01f27f86a862` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b02b780d-7f9c-4257-a7e3-c040d166fa0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b02b780d-7f9c-4257-a7e3-c040d166fa0d
Content-Type: application/json

--- request body ---
{"handle":"qa-2f4d0689dd39","displayName":"QA 2f4d0689dd39","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b02b780d-7f9c-4257-a7e3-c040d166fa0d
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
Location: /v1/accounts/qa-2f4d0689dd39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_641712b4-0ed2-412c-ac93-6f590880ce2b","handle":"qa-2f4d0689dd39","displayName":"QA 2f4d0689dd39","region":"eu","role":"user","createdAt":"2026-11-22T09:54:51.461814696Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e645a8e7-bf66-437a-8aa5-f8ac97a8ea42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e645a8e7-bf66-437a-8aa5-f8ac97a8ea42
Content-Type: application/json

--- request body ---
{"handle":"qa-2f4d0689dd39","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-e645a8e7-bf66-437a-8aa5-f8ac97a8ea42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_641712b4-0ed2-412c-ac93-6f590880ce2b"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-04759278-ed06-4075-bfcf-25f8637e04a3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2b67e5c221a487985b98a3865fb5fdd
X-Correlation-Id: qa-04759278-ed06-4075-bfcf-25f8637e04a3
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04759278-ed06-4075-bfcf-25f8637e04a3
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-04759278-ed06-4075-bfcf-25f8637e04a3","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98e5f210-80e5-44a2-acee-d4e0b58b08b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98e5f210-80e5-44a2-acee-d4e0b58b08b1
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98e5f210-80e5-44a2-acee-d4e0b58b08b1
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
correlation: qa-c9c2080c-1360-40f6-ba43-01f27f86a862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9c2080c-1360-40f6-ba43-01f27f86a862
Content-Type: application/json

--- request body ---
{"handle":"qa-2f4d0689dd39","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9c2080c-1360-40f6-ba43-01f27f86a862
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c9c2080c-1360-40f6-ba43-01f27f86a862"}
```
