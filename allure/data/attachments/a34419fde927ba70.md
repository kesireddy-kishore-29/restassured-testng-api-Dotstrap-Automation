# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-e7c1fde3-49b6-4c14-8324-71bfe53a7023` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-00e5ff06-b6e2-4fe8-8b04-b965bc111fd0` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-62dd9beb-6c14-4e61-9b31-6ac4a30cf00a` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-0cc2edf1-7f71-4212-938b-f93e7ec0f99a` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 25 | `qa-f5bb9dd9-d161-4739-8db5-e4b9cd0e5d56` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-6539f14a-3067-40cf-b7f9-c72628c21c52` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-676649c2-9aad-48e7-a39a-89d9d17578ec` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-dcc4740c-d3a7-4f74-842d-62ffcb79940a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-80646b40-5194-44c9-97b2-157a9080b74d` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-c8b51f03-e131-4375-a598-016838bf990f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e7c1fde3-49b6-4c14-8324-71bfe53a7023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7c1fde3-49b6-4c14-8324-71bfe53a7023
Content-Type: application/json

--- request body ---
{"handle":"qa-46fa8699a0a6","displayName":"QA 46fa8699a0a6","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7c1fde3-49b6-4c14-8324-71bfe53a7023
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Location: /v1/accounts/qa-46fa8699a0a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dec418de-5205-488a-a14e-6e2fc46c9e31","handle":"qa-46fa8699a0a6","displayName":"QA 46fa8699a0a6","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.260203349Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-00e5ff06-b6e2-4fe8-8b04-b965bc111fd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00e5ff06-b6e2-4fe8-8b04-b965bc111fd0
Content-Type: application/json

--- request body ---
{"handle":"qa-d80cfec8c384","displayName":"QA d80cfec8c384","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-00e5ff06-b6e2-4fe8-8b04-b965bc111fd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Location: /v1/accounts/qa-d80cfec8c384
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9cc3b0e7-4052-400a-ac4e-8039235637cc","handle":"qa-d80cfec8c384","displayName":"QA d80cfec8c384","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.305097784Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-62dd9beb-6c14-4e61-9b31-6ac4a30cf00a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62dd9beb-6c14-4e61-9b31-6ac4a30cf00a
Content-Type: application/json

--- request body ---
{"handle":"qa-46fa8699a0a6","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-62dd9beb-6c14-4e61-9b31-6ac4a30cf00a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dec418de-5205-488a-a14e-6e2fc46c9e31"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0cc2edf1-7f71-4212-938b-f93e7ec0f99a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cc2edf1-7f71-4212-938b-f93e7ec0f99a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d80cfec8c384","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cc2edf1-7f71-4212-938b-f93e7ec0f99a
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
Location: /v1/conversations/cnv_bde24a70-07c6-4fea-bf8e-3e50906990d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bde24a70-07c6-4fea-bf8e-3e50906990d8","subject":"Error contract","status":"open","region":"eu","participants":["qa-46fa8699a0a6","qa-d80cfec8c384"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.373041645Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_bde24a70-07c6-4fea-bf8e-3e50906990d8/messages
correlation: qa-f5bb9dd9-d161-4739-8db5-e4b9cd0e5d56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5bb9dd9-d161-4739-8db5-e4b9cd0e5d56
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5bb9dd9-d161-4739-8db5-e4b9cd0e5d56
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_bde24a70-07c6-4fea-bf8e-3e50906990d8/messages","correlationId":"qa-f5bb9dd9-d161-4739-8db5-e4b9cd0e5d56","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6539f14a-3067-40cf-b7f9-c72628c21c52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6539f14a-3067-40cf-b7f9-c72628c21c52
Content-Type: application/json

--- request body ---
{"handle":"qa-d80cfec8c384","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6539f14a-3067-40cf-b7f9-c72628c21c52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9cc3b0e7-4052-400a-ac4e-8039235637cc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-676649c2-9aad-48e7-a39a-89d9d17578ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-676649c2-9aad-48e7-a39a-89d9d17578ec
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-676649c2-9aad-48e7-a39a-89d9d17578ec
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
correlation: qa-dcc4740c-d3a7-4f74-842d-62ffcb79940a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcc4740c-d3a7-4f74-842d-62ffcb79940a
Content-Type: application/json

--- request body ---
{"handle":"qa-d80cfec8c384","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dcc4740c-d3a7-4f74-842d-62ffcb79940a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dcc4740c-d3a7-4f74-842d-62ffcb79940a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80646b40-5194-44c9-97b2-157a9080b74d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80646b40-5194-44c9-97b2-157a9080b74d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80646b40-5194-44c9-97b2-157a9080b74d
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
correlation: qa-c8b51f03-e131-4375-a598-016838bf990f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8b51f03-e131-4375-a598-016838bf990f
Content-Type: application/json

--- request body ---
{"handle":"qa-46fa8699a0a6","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8b51f03-e131-4375-a598-016838bf990f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8b51f03-e131-4375-a598-016838bf990f"}
```
