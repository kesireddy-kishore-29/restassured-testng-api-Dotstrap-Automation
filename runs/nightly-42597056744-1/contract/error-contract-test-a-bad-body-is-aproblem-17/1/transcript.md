# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-8cbcedf1-ba37-4891-b643-39fbacaded03` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-4d2c8fc7-057d-46a9-b223-71bc0a2508bb` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-0ffd8892-39cb-4de9-b557-ecf97d227f7d` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-2a2f7c06-bbc4-4ce6-b466-4425eace81d9` |
| 5 | `POST /v1/credits/purchases` | 422 | 18 | `qa-8d2a6542-63f8-456c-9f0a-b911dddc087d` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-96883530-519c-43e9-bf9d-eccdb0205a12` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-37048637-75d5-43a0-b814-125ab7f4e7b4` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-b8f689e6-128f-4284-8053-04fa872b083b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-91de21e6-9138-4579-a48a-c8cc28b488f4` |
| 10 | `POST /v1/auth/token` | 401 | 2 | `qa-b59e2c01-a9c4-4587-a10e-789e210136e8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8cbcedf1-ba37-4891-b643-39fbacaded03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cbcedf1-ba37-4891-b643-39fbacaded03
Content-Type: application/json

--- request body ---
{"handle":"qa-2661407d0764","displayName":"QA 2661407d0764","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cbcedf1-ba37-4891-b643-39fbacaded03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 8
Location: /v1/accounts/qa-2661407d0764
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2295310-e80d-4791-992e-4fa25e8f1cf0","handle":"qa-2661407d0764","displayName":"QA 2661407d0764","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.887630531Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4d2c8fc7-057d-46a9-b223-71bc0a2508bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d2c8fc7-057d-46a9-b223-71bc0a2508bb
Content-Type: application/json

--- request body ---
{"handle":"qa-8ab0e43e9378","displayName":"QA 8ab0e43e9378","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d2c8fc7-057d-46a9-b223-71bc0a2508bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 8
Location: /v1/accounts/qa-8ab0e43e9378
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d59d4d55-a3d5-4f17-8c68-5a0a14390320","handle":"qa-8ab0e43e9378","displayName":"QA 8ab0e43e9378","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.925588341Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0ffd8892-39cb-4de9-b557-ecf97d227f7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ffd8892-39cb-4de9-b557-ecf97d227f7d
Content-Type: application/json

--- request body ---
{"handle":"qa-2661407d0764","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ffd8892-39cb-4de9-b557-ecf97d227f7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2295310-e80d-4791-992e-4fa25e8f1cf0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2a2f7c06-bbc4-4ce6-b466-4425eace81d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a2f7c06-bbc4-4ce6-b466-4425eace81d9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8ab0e43e9378","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a2f7c06-bbc4-4ce6-b466-4425eace81d9
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
Location: /v1/conversations/cnv_3fd7aa47-265b-4e07-96e4-f51e8f4a99d7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3fd7aa47-265b-4e07-96e4-f51e8f4a99d7","subject":"Error contract","status":"open","region":"eu","participants":["qa-2661407d0764","qa-8ab0e43e9378"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.965724375Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8d2a6542-63f8-456c-9f0a-b911dddc087d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ddb014a955104e9fb9432e0b8c2d6e1a
X-Correlation-Id: qa-8d2a6542-63f8-456c-9f0a-b911dddc087d
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d2a6542-63f8-456c-9f0a-b911dddc087d
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-8d2a6542-63f8-456c-9f0a-b911dddc087d","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-96883530-519c-43e9-bf9d-eccdb0205a12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96883530-519c-43e9-bf9d-eccdb0205a12
Content-Type: application/json

--- request body ---
{"handle":"qa-8ab0e43e9378","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-96883530-519c-43e9-bf9d-eccdb0205a12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d59d4d55-a3d5-4f17-8c68-5a0a14390320"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37048637-75d5-43a0-b814-125ab7f4e7b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37048637-75d5-43a0-b814-125ab7f4e7b4
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37048637-75d5-43a0-b814-125ab7f4e7b4
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
correlation: qa-b8f689e6-128f-4284-8053-04fa872b083b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8f689e6-128f-4284-8053-04fa872b083b
Content-Type: application/json

--- request body ---
{"handle":"qa-8ab0e43e9378","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8f689e6-128f-4284-8053-04fa872b083b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8f689e6-128f-4284-8053-04fa872b083b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91de21e6-9138-4579-a48a-c8cc28b488f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91de21e6-9138-4579-a48a-c8cc28b488f4
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91de21e6-9138-4579-a48a-c8cc28b488f4
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
correlation: qa-b59e2c01-a9c4-4587-a10e-789e210136e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b59e2c01-a9c4-4587-a10e-789e210136e8
Content-Type: application/json

--- request body ---
{"handle":"qa-2661407d0764","password":"****"}

--- response: 401 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b59e2c01-a9c4-4587-a10e-789e210136e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b59e2c01-a9c4-4587-a10e-789e210136e8"}
```
