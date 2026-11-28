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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-f60ea7d8-541c-4d16-890e-eb1741da711f` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-a7bfbe9b-82d2-41ef-a9b7-969267f8f57c` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-ca205341-6271-40af-b2e0-79a0d224d2d6` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-13555bd1-d93a-49e4-9abb-714361939ee1` |
| 5 | `POST /v1/accounts` | 400 | 35 | `qa-62d0857f-4c74-4a4e-bd8a-fff529ccf84d` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-01fdb8d8-2896-42bc-8b3e-ece86740eb1f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-ec8edfb6-7895-4072-b82e-919863034f06` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-3d6fed77-91fe-445e-8569-d005f7928e8d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-30ac7170-6231-49a7-833a-4f1f3dea1aa0` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-692be370-3fa7-4aa9-b36f-d7cc8aa9d771` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f60ea7d8-541c-4d16-890e-eb1741da711f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f60ea7d8-541c-4d16-890e-eb1741da711f
Content-Type: application/json

--- request body ---
{"handle":"qa-d7f6f137b4f7","displayName":"QA d7f6f137b4f7","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f60ea7d8-541c-4d16-890e-eb1741da711f
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
Location: /v1/accounts/qa-d7f6f137b4f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ddc9401b-a7ad-40d3-8e95-58f5ce373c87","handle":"qa-d7f6f137b4f7","displayName":"QA d7f6f137b4f7","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.526283393Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a7bfbe9b-82d2-41ef-a9b7-969267f8f57c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7bfbe9b-82d2-41ef-a9b7-969267f8f57c
Content-Type: application/json

--- request body ---
{"handle":"qa-fc2a6dfceca8","displayName":"QA fc2a6dfceca8","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7bfbe9b-82d2-41ef-a9b7-969267f8f57c
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
Location: /v1/accounts/qa-fc2a6dfceca8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa112615-7175-42a8-960e-648bfacdbb6e","handle":"qa-fc2a6dfceca8","displayName":"QA fc2a6dfceca8","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.596590327Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ca205341-6271-40af-b2e0-79a0d224d2d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca205341-6271-40af-b2e0-79a0d224d2d6
Content-Type: application/json

--- request body ---
{"handle":"qa-d7f6f137b4f7","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca205341-6271-40af-b2e0-79a0d224d2d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ddc9401b-a7ad-40d3-8e95-58f5ce373c87"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-13555bd1-d93a-49e4-9abb-714361939ee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13555bd1-d93a-49e4-9abb-714361939ee1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fc2a6dfceca8","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-13555bd1-d93a-49e4-9abb-714361939ee1
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
Location: /v1/conversations/cnv_1e513986-2a30-4540-adfd-e885a0737508
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1e513986-2a30-4540-adfd-e885a0737508","subject":"Error contract","status":"open","region":"eu","participants":["qa-d7f6f137b4f7","qa-fc2a6dfceca8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.719179014Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-62d0857f-4c74-4a4e-bd8a-fff529ccf84d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62d0857f-4c74-4a4e-bd8a-fff529ccf84d
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62d0857f-4c74-4a4e-bd8a-fff529ccf84d
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-62d0857f-4c74-4a4e-bd8a-fff529ccf84d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-01fdb8d8-2896-42bc-8b3e-ece86740eb1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01fdb8d8-2896-42bc-8b3e-ece86740eb1f
Content-Type: application/json

--- request body ---
{"handle":"qa-fc2a6dfceca8","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-01fdb8d8-2896-42bc-8b3e-ece86740eb1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa112615-7175-42a8-960e-648bfacdbb6e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec8edfb6-7895-4072-b82e-919863034f06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec8edfb6-7895-4072-b82e-919863034f06
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec8edfb6-7895-4072-b82e-919863034f06
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
correlation: qa-3d6fed77-91fe-445e-8569-d005f7928e8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d6fed77-91fe-445e-8569-d005f7928e8d
Content-Type: application/json

--- request body ---
{"handle":"qa-fc2a6dfceca8","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d6fed77-91fe-445e-8569-d005f7928e8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d6fed77-91fe-445e-8569-d005f7928e8d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30ac7170-6231-49a7-833a-4f1f3dea1aa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30ac7170-6231-49a7-833a-4f1f3dea1aa0
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30ac7170-6231-49a7-833a-4f1f3dea1aa0
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
correlation: qa-692be370-3fa7-4aa9-b36f-d7cc8aa9d771

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-692be370-3fa7-4aa9-b36f-d7cc8aa9d771
Content-Type: application/json

--- request body ---
{"handle":"qa-d7f6f137b4f7","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-692be370-3fa7-4aa9-b36f-d7cc8aa9d771
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-692be370-3fa7-4aa9-b36f-d7cc8aa9d771"}
```
