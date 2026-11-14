# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-b904450c-0728-4337-a8f5-559b0f11040d` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-f4abe90c-6e02-45fc-a00f-f449653deef7` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-6eb60866-3b9d-47fa-a437-ce1414d7352d` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-c890d260-fc45-4241-90d0-463805a348f7` |
| 5 | `POST /v1/accounts` | 400 | 11 | `qa-6fd01cba-b9df-4ebf-8259-af28707d34ca` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-eea168b3-601c-479b-8ab7-78556a30a316` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-d0e8252a-dbc2-48f3-b55b-e2af47a0028b` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-6732365f-d091-4a93-9266-8b4bb9085cf6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-978a4152-941b-427f-8165-3ec83cde33ff` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-aaaa4226-c479-4b0d-a45a-3572acb7ff26` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b904450c-0728-4337-a8f5-559b0f11040d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b904450c-0728-4337-a8f5-559b0f11040d
Content-Type: application/json

--- request body ---
{"handle":"qa-68e4ec7edd51","displayName":"QA 68e4ec7edd51","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b904450c-0728-4337-a8f5-559b0f11040d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-68e4ec7edd51
X-Served-Region: eu
Content-Length: 181

{"id":"acc_115d8dba-23a8-4882-b8ab-e195a4ed3473","handle":"qa-68e4ec7edd51","displayName":"QA 68e4ec7edd51","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.861329102Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f4abe90c-6e02-45fc-a00f-f449653deef7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4abe90c-6e02-45fc-a00f-f449653deef7
Content-Type: application/json

--- request body ---
{"handle":"qa-7d19334d09e9","displayName":"QA 7d19334d09e9","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4abe90c-6e02-45fc-a00f-f449653deef7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Location: /v1/accounts/qa-7d19334d09e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6282bcf4-7194-48d7-94e7-314730f21f75","handle":"qa-7d19334d09e9","displayName":"QA 7d19334d09e9","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.901647849Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6eb60866-3b9d-47fa-a437-ce1414d7352d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eb60866-3b9d-47fa-a437-ce1414d7352d
Content-Type: application/json

--- request body ---
{"handle":"qa-68e4ec7edd51","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eb60866-3b9d-47fa-a437-ce1414d7352d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_115d8dba-23a8-4882-b8ab-e195a4ed3473"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c890d260-fc45-4241-90d0-463805a348f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c890d260-fc45-4241-90d0-463805a348f7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7d19334d09e9","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c890d260-fc45-4241-90d0-463805a348f7
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
Location: /v1/conversations/cnv_b08c5ada-a3a6-41d1-91eb-679f52dbed90
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b08c5ada-a3a6-41d1-91eb-679f52dbed90","subject":"Error contract","status":"open","region":"eu","participants":["qa-68e4ec7edd51","qa-7d19334d09e9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:54.002332554Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-6fd01cba-b9df-4ebf-8259-af28707d34ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fd01cba-b9df-4ebf-8259-af28707d34ca
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fd01cba-b9df-4ebf-8259-af28707d34ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-6fd01cba-b9df-4ebf-8259-af28707d34ca"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eea168b3-601c-479b-8ab7-78556a30a316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eea168b3-601c-479b-8ab7-78556a30a316
Content-Type: application/json

--- request body ---
{"handle":"qa-7d19334d09e9","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-eea168b3-601c-479b-8ab7-78556a30a316
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6282bcf4-7194-48d7-94e7-314730f21f75"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0e8252a-dbc2-48f3-b55b-e2af47a0028b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0e8252a-dbc2-48f3-b55b-e2af47a0028b
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0e8252a-dbc2-48f3-b55b-e2af47a0028b
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
correlation: qa-6732365f-d091-4a93-9266-8b4bb9085cf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6732365f-d091-4a93-9266-8b4bb9085cf6
Content-Type: application/json

--- request body ---
{"handle":"qa-7d19334d09e9","password":"****"}

--- response: 401 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6732365f-d091-4a93-9266-8b4bb9085cf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6732365f-d091-4a93-9266-8b4bb9085cf6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-978a4152-941b-427f-8165-3ec83cde33ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-978a4152-941b-427f-8165-3ec83cde33ff
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-978a4152-941b-427f-8165-3ec83cde33ff
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
correlation: qa-aaaa4226-c479-4b0d-a45a-3572acb7ff26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaaa4226-c479-4b0d-a45a-3572acb7ff26
Content-Type: application/json

--- request body ---
{"handle":"qa-68e4ec7edd51","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aaaa4226-c479-4b0d-a45a-3572acb7ff26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aaaa4226-c479-4b0d-a45a-3572acb7ff26"}
```
