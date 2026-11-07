# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-5e0d3515-2f90-4630-bf4d-68bf41af5b83` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-598bba72-167c-4db2-a41d-94657213febb` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-dafab49d-55e1-44d9-b336-d9150624b274` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-b79434bd-e5cf-4495-a38a-1df36c1dfff7` |
| 5 | `POST /v1/accounts` | 422 | 21 | `qa-6ffe4ebc-2499-4b3b-a6fc-05cd408fe36a` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-91e0d361-8720-4038-902c-b88e80eb2c78` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-7bf58470-f27b-4b96-86eb-0376980943d7` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-ed81c116-39dd-4f70-b908-106666634a08` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a4328f07-58f8-4a90-8508-8ee2204acbaf` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-0b2d7218-aeb2-44e4-bb89-4dd9ad351d15` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e0d3515-2f90-4630-bf4d-68bf41af5b83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e0d3515-2f90-4630-bf4d-68bf41af5b83
Content-Type: application/json

--- request body ---
{"handle":"qa-0dbb62a3c87e","displayName":"QA 0dbb62a3c87e","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e0d3515-2f90-4630-bf4d-68bf41af5b83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Location: /v1/accounts/qa-0dbb62a3c87e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d650bc8f-0896-41d5-a20f-322d3b2507e1","handle":"qa-0dbb62a3c87e","displayName":"QA 0dbb62a3c87e","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.319996198Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-598bba72-167c-4db2-a41d-94657213febb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-598bba72-167c-4db2-a41d-94657213febb
Content-Type: application/json

--- request body ---
{"handle":"qa-f1b359d11b82","displayName":"QA f1b359d11b82","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-598bba72-167c-4db2-a41d-94657213febb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Location: /v1/accounts/qa-f1b359d11b82
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da8f6872-71e4-4305-be1b-c52efe8002cd","handle":"qa-f1b359d11b82","displayName":"QA f1b359d11b82","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.379012079Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dafab49d-55e1-44d9-b336-d9150624b274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dafab49d-55e1-44d9-b336-d9150624b274
Content-Type: application/json

--- request body ---
{"handle":"qa-0dbb62a3c87e","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-dafab49d-55e1-44d9-b336-d9150624b274
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d650bc8f-0896-41d5-a20f-322d3b2507e1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b79434bd-e5cf-4495-a38a-1df36c1dfff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b79434bd-e5cf-4495-a38a-1df36c1dfff7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f1b359d11b82","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b79434bd-e5cf-4495-a38a-1df36c1dfff7
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
Location: /v1/conversations/cnv_aa7c283b-46aa-4dd9-89e4-cfeb3d10e9fe
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_aa7c283b-46aa-4dd9-89e4-cfeb3d10e9fe","subject":"Error contract","status":"open","region":"eu","participants":["qa-0dbb62a3c87e","qa-f1b359d11b82"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.505285328Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-6ffe4ebc-2499-4b3b-a6fc-05cd408fe36a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ffe4ebc-2499-4b3b-a6fc-05cd408fe36a
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ffe4ebc-2499-4b3b-a6fc-05cd408fe36a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 9
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-6ffe4ebc-2499-4b3b-a6fc-05cd408fe36a","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-91e0d361-8720-4038-902c-b88e80eb2c78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91e0d361-8720-4038-902c-b88e80eb2c78
Content-Type: application/json

--- request body ---
{"handle":"qa-f1b359d11b82","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-91e0d361-8720-4038-902c-b88e80eb2c78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da8f6872-71e4-4305-be1b-c52efe8002cd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7bf58470-f27b-4b96-86eb-0376980943d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bf58470-f27b-4b96-86eb-0376980943d7
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7bf58470-f27b-4b96-86eb-0376980943d7
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-ed81c116-39dd-4f70-b908-106666634a08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed81c116-39dd-4f70-b908-106666634a08
Content-Type: application/json

--- request body ---
{"handle":"qa-f1b359d11b82","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed81c116-39dd-4f70-b908-106666634a08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed81c116-39dd-4f70-b908-106666634a08"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4328f07-58f8-4a90-8508-8ee2204acbaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4328f07-58f8-4a90-8508-8ee2204acbaf
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4328f07-58f8-4a90-8508-8ee2204acbaf
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0b2d7218-aeb2-44e4-bb89-4dd9ad351d15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b2d7218-aeb2-44e4-bb89-4dd9ad351d15
Content-Type: application/json

--- request body ---
{"handle":"qa-0dbb62a3c87e","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b2d7218-aeb2-44e4-bb89-4dd9ad351d15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b2d7218-aeb2-44e4-bb89-4dd9ad351d15"}
```
