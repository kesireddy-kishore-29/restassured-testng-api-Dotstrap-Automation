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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-ada5eeb6-6334-4ae7-b72e-3b0b3292d9e0` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-52b46245-9928-44f7-adce-a4875915a316` |
| 3 | `POST /v1/credits/purchases` | 422 | 28 | `qa-aa49a450-dce7-40f0-84d8-a5085d301043` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-c4b5e467-46d2-4080-baed-fb5b78e5192c` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-b8b8fc93-c067-415c-8637-fe217ec67bc3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ada5eeb6-6334-4ae7-b72e-3b0b3292d9e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ada5eeb6-6334-4ae7-b72e-3b0b3292d9e0
Content-Type: application/json

--- request body ---
{"handle":"qa-3d8cd9b45e4b","displayName":"QA 3d8cd9b45e4b","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-ada5eeb6-6334-4ae7-b72e-3b0b3292d9e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-3d8cd9b45e4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29bfe272-d5a5-41a3-9b2b-309a8215850f","handle":"qa-3d8cd9b45e4b","displayName":"QA 3d8cd9b45e4b","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.587424855Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-52b46245-9928-44f7-adce-a4875915a316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52b46245-9928-44f7-adce-a4875915a316
Content-Type: application/json

--- request body ---
{"handle":"qa-3d8cd9b45e4b","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-52b46245-9928-44f7-adce-a4875915a316
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29bfe272-d5a5-41a3-9b2b-309a8215850f"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-aa49a450-dce7-40f0-84d8-a5085d301043

--- request headers ---
Accept: application/json
Idempotency-Key: qa-af4cae89309a48a5a2442fabfed922de
X-Correlation-Id: qa-aa49a450-dce7-40f0-84d8-a5085d301043
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa49a450-dce7-40f0-84d8-a5085d301043
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-aa49a450-dce7-40f0-84d8-a5085d301043","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4b5e467-46d2-4080-baed-fb5b78e5192c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4b5e467-46d2-4080-baed-fb5b78e5192c
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4b5e467-46d2-4080-baed-fb5b78e5192c
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
correlation: qa-b8b8fc93-c067-415c-8637-fe217ec67bc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8b8fc93-c067-415c-8637-fe217ec67bc3
Content-Type: application/json

--- request body ---
{"handle":"qa-3d8cd9b45e4b","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8b8fc93-c067-415c-8637-fe217ec67bc3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8b8fc93-c067-415c-8637-fe217ec67bc3"}
```
