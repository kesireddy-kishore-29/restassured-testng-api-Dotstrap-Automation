# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-1f82f723-f6f0-4426-9262-c23d981261d0` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-726a5a7d-7d42-46b3-ada7-d16ecc320cb5` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-1e9a5f9d-0ab6-413c-90bc-aae8987a923d` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-251e50bb-abf8-4e82-9066-78187e56de19` |
| 5 | `POST /v1/auth/token` | 422 | 55 | `qa-faa4040c-dd7d-49b4-b1f1-2b14f2b89e42` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-f5c98391-a886-4e01-860e-915111f6ff62` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-c84b15b6-6738-45d9-9dec-2a64d3898fe4` |
| 8 | `POST /v1/auth/token` | 401 | 45 | `qa-78260f6f-eb10-4da0-b315-29d644de62fc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-0aa67e82-46a4-42fb-988d-b55168a5c64f` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-63e31985-0c60-4da1-822f-4f2e66a6806f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1f82f723-f6f0-4426-9262-c23d981261d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f82f723-f6f0-4426-9262-c23d981261d0
Content-Type: application/json

--- request body ---
{"handle":"qa-85dcd316f960","displayName":"QA 85dcd316f960","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f82f723-f6f0-4426-9262-c23d981261d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-85dcd316f960
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8cb4df5-cc44-4a9f-b72c-ffb5a038cac7","handle":"qa-85dcd316f960","displayName":"QA 85dcd316f960","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.502040792Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-726a5a7d-7d42-46b3-ada7-d16ecc320cb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-726a5a7d-7d42-46b3-ada7-d16ecc320cb5
Content-Type: application/json

--- request body ---
{"handle":"qa-4ac6fe548289","displayName":"QA 4ac6fe548289","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-726a5a7d-7d42-46b3-ada7-d16ecc320cb5
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
Location: /v1/accounts/qa-4ac6fe548289
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7492e2b-1770-49be-b394-b9e5c9e09caa","handle":"qa-4ac6fe548289","displayName":"QA 4ac6fe548289","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.572024404Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1e9a5f9d-0ab6-413c-90bc-aae8987a923d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e9a5f9d-0ab6-413c-90bc-aae8987a923d
Content-Type: application/json

--- request body ---
{"handle":"qa-85dcd316f960","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e9a5f9d-0ab6-413c-90bc-aae8987a923d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8cb4df5-cc44-4a9f-b72c-ffb5a038cac7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-251e50bb-abf8-4e82-9066-78187e56de19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-251e50bb-abf8-4e82-9066-78187e56de19
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4ac6fe548289","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-251e50bb-abf8-4e82-9066-78187e56de19
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
Location: /v1/conversations/cnv_8b642dd8-4670-4dd3-925e-e43cab8f17e0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8b642dd8-4670-4dd3-925e-e43cab8f17e0","subject":"Error contract","status":"open","region":"eu","participants":["qa-85dcd316f960","qa-4ac6fe548289"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.655722191Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-faa4040c-dd7d-49b4-b1f1-2b14f2b89e42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faa4040c-dd7d-49b4-b1f1-2b14f2b89e42
Content-Type: application/json

--- request body ---
{"handle":"qa-85dcd316f960","password":"****","ttlSeconds":0}

--- response: 422 in 55 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-faa4040c-dd7d-49b4-b1f1-2b14f2b89e42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-faa4040c-dd7d-49b4-b1f1-2b14f2b89e42","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f5c98391-a886-4e01-860e-915111f6ff62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5c98391-a886-4e01-860e-915111f6ff62
Content-Type: application/json

--- request body ---
{"handle":"qa-4ac6fe548289","password":"****"}

--- response: 200 in 51 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5c98391-a886-4e01-860e-915111f6ff62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7492e2b-1770-49be-b394-b9e5c9e09caa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c84b15b6-6738-45d9-9dec-2a64d3898fe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c84b15b6-6738-45d9-9dec-2a64d3898fe4
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c84b15b6-6738-45d9-9dec-2a64d3898fe4
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
correlation: qa-78260f6f-eb10-4da0-b315-29d644de62fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78260f6f-eb10-4da0-b315-29d644de62fc
Content-Type: application/json

--- request body ---
{"handle":"qa-4ac6fe548289","password":"****"}

--- response: 401 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78260f6f-eb10-4da0-b315-29d644de62fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78260f6f-eb10-4da0-b315-29d644de62fc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0aa67e82-46a4-42fb-988d-b55168a5c64f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa67e82-46a4-42fb-988d-b55168a5c64f
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0aa67e82-46a4-42fb-988d-b55168a5c64f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-63e31985-0c60-4da1-822f-4f2e66a6806f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63e31985-0c60-4da1-822f-4f2e66a6806f
Content-Type: application/json

--- request body ---
{"handle":"qa-85dcd316f960","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63e31985-0c60-4da1-822f-4f2e66a6806f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63e31985-0c60-4da1-822f-4f2e66a6806f"}
```
