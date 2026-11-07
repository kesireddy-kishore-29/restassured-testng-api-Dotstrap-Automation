# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-cd392d8b-51ff-48d7-9ddf-512b0920e513` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-07594ee9-9298-45d0-8f2d-6d31588212d5` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-eb4601c7-2d77-47c9-be1e-29539217010f` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-39e53412-3ef7-421e-aa52-afcab3b4c230` |
| 5 | `PATCH /v1/accounts/me` | 422 | 17 | `qa-3849de75-02a9-49a0-8056-2014902a3633` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-9e09b370-1e0c-454c-835f-dae414f53326` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-1bcd9a21-5af4-42fb-bfb3-a66fbb84fed0` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-103433f6-2a5b-49e2-b444-4d7af7b5c888` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-04b99fb6-e3ce-4e4f-9f12-811cc6fee602` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-49d5aa96-def6-4347-93e0-d33484a03e17` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd392d8b-51ff-48d7-9ddf-512b0920e513

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd392d8b-51ff-48d7-9ddf-512b0920e513
Content-Type: application/json

--- request body ---
{"handle":"qa-b4ff077017ad","displayName":"QA b4ff077017ad","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd392d8b-51ff-48d7-9ddf-512b0920e513
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Location: /v1/accounts/qa-b4ff077017ad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9631e21c-7e46-406c-bced-40ad87da093e","handle":"qa-b4ff077017ad","displayName":"QA b4ff077017ad","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.875704058Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-07594ee9-9298-45d0-8f2d-6d31588212d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07594ee9-9298-45d0-8f2d-6d31588212d5
Content-Type: application/json

--- request body ---
{"handle":"qa-cad56f56bf10","displayName":"QA cad56f56bf10","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-07594ee9-9298-45d0-8f2d-6d31588212d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-cad56f56bf10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e6cc984-114d-4bd4-96e2-e5e5f7f9539e","handle":"qa-cad56f56bf10","displayName":"QA cad56f56bf10","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.912724714Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eb4601c7-2d77-47c9-be1e-29539217010f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb4601c7-2d77-47c9-be1e-29539217010f
Content-Type: application/json

--- request body ---
{"handle":"qa-b4ff077017ad","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb4601c7-2d77-47c9-be1e-29539217010f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9631e21c-7e46-406c-bced-40ad87da093e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-39e53412-3ef7-421e-aa52-afcab3b4c230

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39e53412-3ef7-421e-aa52-afcab3b4c230
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cad56f56bf10","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-39e53412-3ef7-421e-aa52-afcab3b4c230
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
Location: /v1/conversations/cnv_fe4109e7-21d9-4886-b4e6-1a8df0fa2b40
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fe4109e7-21d9-4886-b4e6-1a8df0fa2b40","subject":"Error contract","status":"open","region":"eu","participants":["qa-b4ff077017ad","qa-cad56f56bf10"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.008352767Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-3849de75-02a9-49a0-8056-2014902a3633

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3849de75-02a9-49a0-8056-2014902a3633
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3849de75-02a9-49a0-8056-2014902a3633
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-3849de75-02a9-49a0-8056-2014902a3633","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9e09b370-1e0c-454c-835f-dae414f53326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e09b370-1e0c-454c-835f-dae414f53326
Content-Type: application/json

--- request body ---
{"handle":"qa-cad56f56bf10","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e09b370-1e0c-454c-835f-dae414f53326
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e6cc984-114d-4bd4-96e2-e5e5f7f9539e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1bcd9a21-5af4-42fb-bfb3-a66fbb84fed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bcd9a21-5af4-42fb-bfb3-a66fbb84fed0
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1bcd9a21-5af4-42fb-bfb3-a66fbb84fed0
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
correlation: qa-103433f6-2a5b-49e2-b444-4d7af7b5c888

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-103433f6-2a5b-49e2-b444-4d7af7b5c888
Content-Type: application/json

--- request body ---
{"handle":"qa-cad56f56bf10","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-103433f6-2a5b-49e2-b444-4d7af7b5c888
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-103433f6-2a5b-49e2-b444-4d7af7b5c888"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04b99fb6-e3ce-4e4f-9f12-811cc6fee602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04b99fb6-e3ce-4e4f-9f12-811cc6fee602
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04b99fb6-e3ce-4e4f-9f12-811cc6fee602
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-49d5aa96-def6-4347-93e0-d33484a03e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49d5aa96-def6-4347-93e0-d33484a03e17
Content-Type: application/json

--- request body ---
{"handle":"qa-b4ff077017ad","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49d5aa96-def6-4347-93e0-d33484a03e17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-49d5aa96-def6-4347-93e0-d33484a03e17"}
```
