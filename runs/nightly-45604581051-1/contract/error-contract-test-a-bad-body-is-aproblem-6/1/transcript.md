# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-43943c69-88af-464b-a520-1382de4e2e65` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-cb4cce3b-d3a5-4dcf-9fc9-8091f43c1e96` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-13bd1239-71a6-4787-8636-6006ce0698be` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-cb381bb5-ad78-426a-a9cc-643d6e3b9feb` |
| 5 | `PATCH /v1/accounts/me` | 400 | 19 | `qa-7ac0a655-ab16-42e8-87ee-b932d6ca1dd8` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-adadd31f-2c03-4f59-bbc4-daea85b645a9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-aa5db55e-6a08-4f2b-b2d3-e82c6ecbde07` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-394862b1-c90c-4a89-808a-8a83b6ddc3d4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-c7fea70e-cb03-4a67-aee6-bf0ee447dec7` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-51dda961-cacf-434c-8b29-fc96330792ab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43943c69-88af-464b-a520-1382de4e2e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43943c69-88af-464b-a520-1382de4e2e65
Content-Type: application/json

--- request body ---
{"handle":"qa-bce5fa798dbb","displayName":"QA bce5fa798dbb","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-43943c69-88af-464b-a520-1382de4e2e65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-bce5fa798dbb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1090f90d-a3ca-45a0-81cf-843dc52d252f","handle":"qa-bce5fa798dbb","displayName":"QA bce5fa798dbb","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.506933463Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cb4cce3b-d3a5-4dcf-9fc9-8091f43c1e96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb4cce3b-d3a5-4dcf-9fc9-8091f43c1e96
Content-Type: application/json

--- request body ---
{"handle":"qa-089c9c3b4337","displayName":"QA 089c9c3b4337","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb4cce3b-d3a5-4dcf-9fc9-8091f43c1e96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Location: /v1/accounts/qa-089c9c3b4337
X-Served-Region: eu
Content-Length: 181

{"id":"acc_082a0edb-4a0e-4ddd-8ae8-7f5053fd5791","handle":"qa-089c9c3b4337","displayName":"QA 089c9c3b4337","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.551625074Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-13bd1239-71a6-4787-8636-6006ce0698be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13bd1239-71a6-4787-8636-6006ce0698be
Content-Type: application/json

--- request body ---
{"handle":"qa-bce5fa798dbb","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-13bd1239-71a6-4787-8636-6006ce0698be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1090f90d-a3ca-45a0-81cf-843dc52d252f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cb381bb5-ad78-426a-a9cc-643d6e3b9feb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb381bb5-ad78-426a-a9cc-643d6e3b9feb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-089c9c3b4337","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb381bb5-ad78-426a-a9cc-643d6e3b9feb
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
Location: /v1/conversations/cnv_17248429-7a70-4b71-a8b9-bbeca68cb55e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_17248429-7a70-4b71-a8b9-bbeca68cb55e","subject":"Error contract","status":"open","region":"eu","participants":["qa-bce5fa798dbb","qa-089c9c3b4337"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.594286943Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-7ac0a655-ab16-42e8-87ee-b932d6ca1dd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ac0a655-ab16-42e8-87ee-b932d6ca1dd8
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ac0a655-ab16-42e8-87ee-b932d6ca1dd8
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-7ac0a655-ab16-42e8-87ee-b932d6ca1dd8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-adadd31f-2c03-4f59-bbc4-daea85b645a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adadd31f-2c03-4f59-bbc4-daea85b645a9
Content-Type: application/json

--- request body ---
{"handle":"qa-089c9c3b4337","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-adadd31f-2c03-4f59-bbc4-daea85b645a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_082a0edb-4a0e-4ddd-8ae8-7f5053fd5791"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa5db55e-6a08-4f2b-b2d3-e82c6ecbde07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa5db55e-6a08-4f2b-b2d3-e82c6ecbde07
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa5db55e-6a08-4f2b-b2d3-e82c6ecbde07
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
correlation: qa-394862b1-c90c-4a89-808a-8a83b6ddc3d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-394862b1-c90c-4a89-808a-8a83b6ddc3d4
Content-Type: application/json

--- request body ---
{"handle":"qa-089c9c3b4337","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-394862b1-c90c-4a89-808a-8a83b6ddc3d4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-394862b1-c90c-4a89-808a-8a83b6ddc3d4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7fea70e-cb03-4a67-aee6-bf0ee447dec7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7fea70e-cb03-4a67-aee6-bf0ee447dec7
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7fea70e-cb03-4a67-aee6-bf0ee447dec7
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
correlation: qa-51dda961-cacf-434c-8b29-fc96330792ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51dda961-cacf-434c-8b29-fc96330792ab
Content-Type: application/json

--- request body ---
{"handle":"qa-bce5fa798dbb","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51dda961-cacf-434c-8b29-fc96330792ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51dda961-cacf-434c-8b29-fc96330792ab"}
```
