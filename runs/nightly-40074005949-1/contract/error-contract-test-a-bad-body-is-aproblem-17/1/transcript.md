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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-f65b6be9-9c82-4fa5-bdfa-ec712136b8a5` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-259ab44c-727f-4aaf-a1da-45e221420290` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-af207f03-2fd3-4461-8856-2ca4b873a6d6` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-f7f3d779-4e25-48d6-bc7a-513f1d0483d9` |
| 5 | `POST /v1/credits/purchases` | 422 | 17 | `qa-00519aa2-4680-4427-8879-bb610095f343` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-e2236420-6dc2-4d0d-9f07-26550418d1d1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-87d71619-5bd4-4bae-aa79-a643c5ed8505` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-430fde08-1650-42a5-aac3-ff73821f4510` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-22feb96e-74af-458b-9961-495b081df295` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-793fc721-d2c9-46d7-abf4-082fd44e3828` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f65b6be9-9c82-4fa5-bdfa-ec712136b8a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f65b6be9-9c82-4fa5-bdfa-ec712136b8a5
Content-Type: application/json

--- request body ---
{"handle":"qa-4f40ea5e4609","displayName":"QA 4f40ea5e4609","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f65b6be9-9c82-4fa5-bdfa-ec712136b8a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Location: /v1/accounts/qa-4f40ea5e4609
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1bef594e-1ee5-4838-95a2-b6f7bcbf9862","handle":"qa-4f40ea5e4609","displayName":"QA 4f40ea5e4609","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.984251460Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-259ab44c-727f-4aaf-a1da-45e221420290

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-259ab44c-727f-4aaf-a1da-45e221420290
Content-Type: application/json

--- request body ---
{"handle":"qa-597707633040","displayName":"QA 597707633040","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-259ab44c-727f-4aaf-a1da-45e221420290
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
Location: /v1/accounts/qa-597707633040
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90339f6a-15c5-4d16-a00c-625196dd9fd8","handle":"qa-597707633040","displayName":"QA 597707633040","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.037993867Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-af207f03-2fd3-4461-8856-2ca4b873a6d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af207f03-2fd3-4461-8856-2ca4b873a6d6
Content-Type: application/json

--- request body ---
{"handle":"qa-4f40ea5e4609","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-af207f03-2fd3-4461-8856-2ca4b873a6d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1bef594e-1ee5-4838-95a2-b6f7bcbf9862"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f7f3d779-4e25-48d6-bc7a-513f1d0483d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7f3d779-4e25-48d6-bc7a-513f1d0483d9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-597707633040","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7f3d779-4e25-48d6-bc7a-513f1d0483d9
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
Location: /v1/conversations/cnv_6c8e4eb6-bb22-462c-86a1-9bacb50ab62f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6c8e4eb6-bb22-462c-86a1-9bacb50ab62f","subject":"Error contract","status":"open","region":"eu","participants":["qa-4f40ea5e4609","qa-597707633040"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:04.087308024Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-00519aa2-4680-4427-8879-bb610095f343

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fb5acfb8716b4ee18b077a4c606a7a0e
X-Correlation-Id: qa-00519aa2-4680-4427-8879-bb610095f343
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00519aa2-4680-4427-8879-bb610095f343
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-00519aa2-4680-4427-8879-bb610095f343","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e2236420-6dc2-4d0d-9f07-26550418d1d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2236420-6dc2-4d0d-9f07-26550418d1d1
Content-Type: application/json

--- request body ---
{"handle":"qa-597707633040","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2236420-6dc2-4d0d-9f07-26550418d1d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90339f6a-15c5-4d16-a00c-625196dd9fd8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87d71619-5bd4-4bae-aa79-a643c5ed8505

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87d71619-5bd4-4bae-aa79-a643c5ed8505
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87d71619-5bd4-4bae-aa79-a643c5ed8505
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
correlation: qa-430fde08-1650-42a5-aac3-ff73821f4510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-430fde08-1650-42a5-aac3-ff73821f4510
Content-Type: application/json

--- request body ---
{"handle":"qa-597707633040","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-430fde08-1650-42a5-aac3-ff73821f4510
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-430fde08-1650-42a5-aac3-ff73821f4510"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22feb96e-74af-458b-9961-495b081df295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22feb96e-74af-458b-9961-495b081df295
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22feb96e-74af-458b-9961-495b081df295
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
correlation: qa-793fc721-d2c9-46d7-abf4-082fd44e3828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-793fc721-d2c9-46d7-abf4-082fd44e3828
Content-Type: application/json

--- request body ---
{"handle":"qa-4f40ea5e4609","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-793fc721-d2c9-46d7-abf4-082fd44e3828
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-793fc721-d2c9-46d7-abf4-082fd44e3828"}
```
