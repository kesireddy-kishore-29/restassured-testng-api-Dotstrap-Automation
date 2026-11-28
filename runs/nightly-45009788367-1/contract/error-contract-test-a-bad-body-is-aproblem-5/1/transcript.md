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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-ddb0959f-d44c-415d-96d1-2a373b25fe18` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-e7b66923-ce00-4dc7-8b9e-671b26ab757c` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-dc28d5c5-7d6e-4cdd-b690-aa21704cc5fb` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-9ba565e0-42cc-471d-bf52-6c38211a6261` |
| 5 | `POST /v1/accounts` | 422 | 10 | `qa-e03ba301-393d-420b-80c0-36da7b90b722` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-2c739dc4-a841-40d9-898d-21cfaf45f489` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-ca42161e-f0c4-40aa-b731-44a131cd57fb` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-1948bc88-a46a-4df6-a07a-62f38140030a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-4883d654-b3ad-49d8-a2b6-72a947a55b19` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-1a610210-33be-4e75-b799-dcd58c6cd6f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ddb0959f-d44c-415d-96d1-2a373b25fe18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddb0959f-d44c-415d-96d1-2a373b25fe18
Content-Type: application/json

--- request body ---
{"handle":"qa-a4f6aee9c9aa","displayName":"QA a4f6aee9c9aa","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddb0959f-d44c-415d-96d1-2a373b25fe18
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
Location: /v1/accounts/qa-a4f6aee9c9aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23acdfe5-12dc-408b-aba0-0986440014a0","handle":"qa-a4f6aee9c9aa","displayName":"QA a4f6aee9c9aa","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.375543195Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e7b66923-ce00-4dc7-8b9e-671b26ab757c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7b66923-ce00-4dc7-8b9e-671b26ab757c
Content-Type: application/json

--- request body ---
{"handle":"qa-65d134f68b76","displayName":"QA 65d134f68b76","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7b66923-ce00-4dc7-8b9e-671b26ab757c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 9
Location: /v1/accounts/qa-65d134f68b76
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e319ec2-8c39-4581-9e41-ef1033739f0f","handle":"qa-65d134f68b76","displayName":"QA 65d134f68b76","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.414200701Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dc28d5c5-7d6e-4cdd-b690-aa21704cc5fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc28d5c5-7d6e-4cdd-b690-aa21704cc5fb
Content-Type: application/json

--- request body ---
{"handle":"qa-a4f6aee9c9aa","password":"****"}

--- response: 200 in 50 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc28d5c5-7d6e-4cdd-b690-aa21704cc5fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23acdfe5-12dc-408b-aba0-0986440014a0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9ba565e0-42cc-471d-bf52-6c38211a6261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba565e0-42cc-471d-bf52-6c38211a6261
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-65d134f68b76","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ba565e0-42cc-471d-bf52-6c38211a6261
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
Location: /v1/conversations/cnv_5082efa4-6a91-4d11-8586-ec25a87c938f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5082efa4-6a91-4d11-8586-ec25a87c938f","subject":"Error contract","status":"open","region":"eu","participants":["qa-a4f6aee9c9aa","qa-65d134f68b76"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.508927622Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-e03ba301-393d-420b-80c0-36da7b90b722

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e03ba301-393d-420b-80c0-36da7b90b722
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e03ba301-393d-420b-80c0-36da7b90b722
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 9
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-e03ba301-393d-420b-80c0-36da7b90b722","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2c739dc4-a841-40d9-898d-21cfaf45f489

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c739dc4-a841-40d9-898d-21cfaf45f489
Content-Type: application/json

--- request body ---
{"handle":"qa-65d134f68b76","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c739dc4-a841-40d9-898d-21cfaf45f489
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e319ec2-8c39-4581-9e41-ef1033739f0f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca42161e-f0c4-40aa-b731-44a131cd57fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca42161e-f0c4-40aa-b731-44a131cd57fb
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca42161e-f0c4-40aa-b731-44a131cd57fb
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
correlation: qa-1948bc88-a46a-4df6-a07a-62f38140030a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1948bc88-a46a-4df6-a07a-62f38140030a
Content-Type: application/json

--- request body ---
{"handle":"qa-65d134f68b76","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1948bc88-a46a-4df6-a07a-62f38140030a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1948bc88-a46a-4df6-a07a-62f38140030a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4883d654-b3ad-49d8-a2b6-72a947a55b19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4883d654-b3ad-49d8-a2b6-72a947a55b19
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4883d654-b3ad-49d8-a2b6-72a947a55b19
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
correlation: qa-1a610210-33be-4e75-b799-dcd58c6cd6f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a610210-33be-4e75-b799-dcd58c6cd6f1
Content-Type: application/json

--- request body ---
{"handle":"qa-a4f6aee9c9aa","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a610210-33be-4e75-b799-dcd58c6cd6f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a610210-33be-4e75-b799-dcd58c6cd6f1"}
```
