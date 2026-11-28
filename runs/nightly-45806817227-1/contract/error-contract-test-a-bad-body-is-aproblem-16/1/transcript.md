# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-75580a3b-ad33-42d8-b3e2-9b9d792cfd4e` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-60198754-0581-48a3-aea2-57d79120a490` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-2f89aa8b-cc67-42c0-9eee-37bdec5fa4de` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-a5e33f67-01f6-422d-a8c8-90ed1dc0b3d4` |
| 5 | `POST /v1/credits/purchases` | 415 | 15 | `qa-38b7b3af-dbc8-4062-8e78-bf15aa351415` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-ed8ff4c7-359d-4796-ae0c-e34fcdd3f545` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-044b58da-d5c0-49b1-a90d-b3a7484e146d` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-4d59f995-1480-42a1-ac87-7c7c13d413d4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-e4ee055d-5e63-485b-a043-a83fa990fbfd` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-900b55b2-4c4e-4669-bc26-023ef6596dbc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75580a3b-ad33-42d8-b3e2-9b9d792cfd4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75580a3b-ad33-42d8-b3e2-9b9d792cfd4e
Content-Type: application/json

--- request body ---
{"handle":"qa-5a8caa51c748","displayName":"QA 5a8caa51c748","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-75580a3b-ad33-42d8-b3e2-9b9d792cfd4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Location: /v1/accounts/qa-5a8caa51c748
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4886d889-f9a3-409a-a284-2705ce1f6bff","handle":"qa-5a8caa51c748","displayName":"QA 5a8caa51c748","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.741687308Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-60198754-0581-48a3-aea2-57d79120a490

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60198754-0581-48a3-aea2-57d79120a490
Content-Type: application/json

--- request body ---
{"handle":"qa-be7884453c6b","displayName":"QA be7884453c6b","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-60198754-0581-48a3-aea2-57d79120a490
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Location: /v1/accounts/qa-be7884453c6b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ea2c401-3754-4921-8cca-5bb0e2c9efcc","handle":"qa-be7884453c6b","displayName":"QA be7884453c6b","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.773772070Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2f89aa8b-cc67-42c0-9eee-37bdec5fa4de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f89aa8b-cc67-42c0-9eee-37bdec5fa4de
Content-Type: application/json

--- request body ---
{"handle":"qa-5a8caa51c748","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f89aa8b-cc67-42c0-9eee-37bdec5fa4de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4886d889-f9a3-409a-a284-2705ce1f6bff"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a5e33f67-01f6-422d-a8c8-90ed1dc0b3d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e33f67-01f6-422d-a8c8-90ed1dc0b3d4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-be7884453c6b","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5e33f67-01f6-422d-a8c8-90ed1dc0b3d4
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
Location: /v1/conversations/cnv_3c1200b8-f4c5-4d35-abf3-52a2bf6e522a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3c1200b8-f4c5-4d35-abf3-52a2bf6e522a","subject":"Error contract","status":"open","region":"eu","participants":["qa-5a8caa51c748","qa-be7884453c6b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.835368964Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-38b7b3af-dbc8-4062-8e78-bf15aa351415

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8034e23b60564a098508ef9a00a41795
X-Correlation-Id: qa-38b7b3af-dbc8-4062-8e78-bf15aa351415
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38b7b3af-dbc8-4062-8e78-bf15aa351415
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-38b7b3af-dbc8-4062-8e78-bf15aa351415"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ed8ff4c7-359d-4796-ae0c-e34fcdd3f545

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed8ff4c7-359d-4796-ae0c-e34fcdd3f545
Content-Type: application/json

--- request body ---
{"handle":"qa-be7884453c6b","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed8ff4c7-359d-4796-ae0c-e34fcdd3f545
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ea2c401-3754-4921-8cca-5bb0e2c9efcc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-044b58da-d5c0-49b1-a90d-b3a7484e146d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-044b58da-d5c0-49b1-a90d-b3a7484e146d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-044b58da-d5c0-49b1-a90d-b3a7484e146d
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
correlation: qa-4d59f995-1480-42a1-ac87-7c7c13d413d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d59f995-1480-42a1-ac87-7c7c13d413d4
Content-Type: application/json

--- request body ---
{"handle":"qa-be7884453c6b","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d59f995-1480-42a1-ac87-7c7c13d413d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d59f995-1480-42a1-ac87-7c7c13d413d4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e4ee055d-5e63-485b-a043-a83fa990fbfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4ee055d-5e63-485b-a043-a83fa990fbfd
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e4ee055d-5e63-485b-a043-a83fa990fbfd
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
correlation: qa-900b55b2-4c4e-4669-bc26-023ef6596dbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900b55b2-4c4e-4669-bc26-023ef6596dbc
Content-Type: application/json

--- request body ---
{"handle":"qa-5a8caa51c748","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-900b55b2-4c4e-4669-bc26-023ef6596dbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-900b55b2-4c4e-4669-bc26-023ef6596dbc"}
```
