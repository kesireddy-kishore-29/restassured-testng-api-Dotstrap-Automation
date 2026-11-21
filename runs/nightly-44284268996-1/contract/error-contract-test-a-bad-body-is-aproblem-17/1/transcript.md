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
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-c374eb40-5e07-43c7-8060-4c62f1b52ab9` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-b5a11b47-cea2-4c36-be34-b17abe44912d` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-e13774ce-e8b9-4049-89e5-70386fc7f021` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-063bb624-29a5-423c-b998-bc55b4c0a349` |
| 5 | `POST /v1/credits/purchases` | 422 | 4 | `qa-455f4401-eb80-4a50-9abe-a2375411039f` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-ad6f2157-2969-4924-9757-c612b73a11eb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-036a5c73-0858-46f5-b8f1-e44cd7178426` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-3c75a6e0-3330-44f2-8bb5-98a8ef7022d2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-df9265a2-d31e-423f-8942-b78a739b8d32` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-cda1d7ac-03ce-49a8-bfb6-bdc0b0e17467` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c374eb40-5e07-43c7-8060-4c62f1b52ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c374eb40-5e07-43c7-8060-4c62f1b52ab9
Content-Type: application/json

--- request body ---
{"handle":"qa-26ea8f8b5dd6","displayName":"QA 26ea8f8b5dd6","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c374eb40-5e07-43c7-8060-4c62f1b52ab9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Location: /v1/accounts/qa-26ea8f8b5dd6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_06152e2a-7fa2-46ac-880b-6a7c3d408354","handle":"qa-26ea8f8b5dd6","displayName":"QA 26ea8f8b5dd6","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.060496867Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b5a11b47-cea2-4c36-be34-b17abe44912d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5a11b47-cea2-4c36-be34-b17abe44912d
Content-Type: application/json

--- request body ---
{"handle":"qa-50ade46f7716","displayName":"QA 50ade46f7716","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5a11b47-cea2-4c36-be34-b17abe44912d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Location: /v1/accounts/qa-50ade46f7716
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a407be56-5b62-4e63-ad71-7bd09ced7628","handle":"qa-50ade46f7716","displayName":"QA 50ade46f7716","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.097493656Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e13774ce-e8b9-4049-89e5-70386fc7f021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e13774ce-e8b9-4049-89e5-70386fc7f021
Content-Type: application/json

--- request body ---
{"handle":"qa-26ea8f8b5dd6","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e13774ce-e8b9-4049-89e5-70386fc7f021
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_06152e2a-7fa2-46ac-880b-6a7c3d408354"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-063bb624-29a5-423c-b998-bc55b4c0a349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-063bb624-29a5-423c-b998-bc55b4c0a349
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-50ade46f7716","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-063bb624-29a5-423c-b998-bc55b4c0a349
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
Location: /v1/conversations/cnv_54f2112a-abdb-4c55-b888-d74ceb7d709e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_54f2112a-abdb-4c55-b888-d74ceb7d709e","subject":"Error contract","status":"open","region":"eu","participants":["qa-26ea8f8b5dd6","qa-50ade46f7716"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:53.134908736Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-455f4401-eb80-4a50-9abe-a2375411039f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5e0ce17961d249da9a87f844809d0aaa
X-Correlation-Id: qa-455f4401-eb80-4a50-9abe-a2375411039f
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-455f4401-eb80-4a50-9abe-a2375411039f
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-455f4401-eb80-4a50-9abe-a2375411039f","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ad6f2157-2969-4924-9757-c612b73a11eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad6f2157-2969-4924-9757-c612b73a11eb
Content-Type: application/json

--- request body ---
{"handle":"qa-50ade46f7716","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad6f2157-2969-4924-9757-c612b73a11eb
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a407be56-5b62-4e63-ad71-7bd09ced7628"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-036a5c73-0858-46f5-b8f1-e44cd7178426

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-036a5c73-0858-46f5-b8f1-e44cd7178426
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-036a5c73-0858-46f5-b8f1-e44cd7178426
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
correlation: qa-3c75a6e0-3330-44f2-8bb5-98a8ef7022d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c75a6e0-3330-44f2-8bb5-98a8ef7022d2
Content-Type: application/json

--- request body ---
{"handle":"qa-50ade46f7716","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c75a6e0-3330-44f2-8bb5-98a8ef7022d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c75a6e0-3330-44f2-8bb5-98a8ef7022d2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-df9265a2-d31e-423f-8942-b78a739b8d32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df9265a2-d31e-423f-8942-b78a739b8d32
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-df9265a2-d31e-423f-8942-b78a739b8d32
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
correlation: qa-cda1d7ac-03ce-49a8-bfb6-bdc0b0e17467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cda1d7ac-03ce-49a8-bfb6-bdc0b0e17467
Content-Type: application/json

--- request body ---
{"handle":"qa-26ea8f8b5dd6","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cda1d7ac-03ce-49a8-bfb6-bdc0b0e17467
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cda1d7ac-03ce-49a8-bfb6-bdc0b0e17467"}
```
