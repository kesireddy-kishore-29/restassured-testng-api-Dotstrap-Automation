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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-a4702da1-3b25-4883-9661-83ad50ccac8e` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-506a50d8-a3f8-4f4f-b691-9d27728865a7` |
| 3 | `POST /v1/credits/purchases` | 422 | 17 | `qa-e8e81b51-6df4-428b-9509-d4c9f15a0a97` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-41e0af4d-9b85-43b8-9798-daaf5128a270` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-aad22d38-1020-4387-a846-415463331e41` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4702da1-3b25-4883-9661-83ad50ccac8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4702da1-3b25-4883-9661-83ad50ccac8e
Content-Type: application/json

--- request body ---
{"handle":"qa-072ba41d8a3d","displayName":"QA 072ba41d8a3d","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4702da1-3b25-4883-9661-83ad50ccac8e
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
Location: /v1/accounts/qa-072ba41d8a3d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd9dd0c3-84a6-433c-b765-fb10433f5f07","handle":"qa-072ba41d8a3d","displayName":"QA 072ba41d8a3d","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.589478859Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-506a50d8-a3f8-4f4f-b691-9d27728865a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506a50d8-a3f8-4f4f-b691-9d27728865a7
Content-Type: application/json

--- request body ---
{"handle":"qa-072ba41d8a3d","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-506a50d8-a3f8-4f4f-b691-9d27728865a7
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd9dd0c3-84a6-433c-b765-fb10433f5f07"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e8e81b51-6df4-428b-9509-d4c9f15a0a97

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2879efeb01294c77aecf1079fd351a9f
X-Correlation-Id: qa-e8e81b51-6df4-428b-9509-d4c9f15a0a97
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8e81b51-6df4-428b-9509-d4c9f15a0a97
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-e8e81b51-6df4-428b-9509-d4c9f15a0a97","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41e0af4d-9b85-43b8-9798-daaf5128a270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41e0af4d-9b85-43b8-9798-daaf5128a270
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41e0af4d-9b85-43b8-9798-daaf5128a270
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
correlation: qa-aad22d38-1020-4387-a846-415463331e41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aad22d38-1020-4387-a846-415463331e41
Content-Type: application/json

--- request body ---
{"handle":"qa-072ba41d8a3d","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aad22d38-1020-4387-a846-415463331e41
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aad22d38-1020-4387-a846-415463331e41"}
```
