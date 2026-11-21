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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-a5116f8d-3ce8-4990-a73c-cd21740b9916` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-a30a6fdc-51be-4463-92c0-da07d649facc` |
| 3 | `POST /v1/auth/token` | 200 | 95 | `qa-9a5c7474-76cf-45e3-b2e0-de0dc330f089` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-67a6bdb3-fac7-4916-bfb3-aff1bf8261fa` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 12 | `qa-85fdf0b2-2c0f-4652-848e-1ea0ebdcf5f1` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-59e435fe-28fd-4f26-9371-1addbfe5eefb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a9bccf10-8e28-421b-a090-56db5056983b` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-762e9733-ffd9-40ac-bc1c-d4e4fbd23f48` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-11c10d59-612a-4212-a159-60c129358a13` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-b93d885d-f616-4956-890d-a9adc2663d6e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a5116f8d-3ce8-4990-a73c-cd21740b9916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5116f8d-3ce8-4990-a73c-cd21740b9916
Content-Type: application/json

--- request body ---
{"handle":"qa-64f1eb6f8a19","displayName":"QA 64f1eb6f8a19","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5116f8d-3ce8-4990-a73c-cd21740b9916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-64f1eb6f8a19
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6d95ea6-ba59-466c-84b5-9dfe2b79e688","handle":"qa-64f1eb6f8a19","displayName":"QA 64f1eb6f8a19","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.300284956Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a30a6fdc-51be-4463-92c0-da07d649facc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a30a6fdc-51be-4463-92c0-da07d649facc
Content-Type: application/json

--- request body ---
{"handle":"qa-67d5f6445fca","displayName":"QA 67d5f6445fca","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a30a6fdc-51be-4463-92c0-da07d649facc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Location: /v1/accounts/qa-67d5f6445fca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1d1cd901-eb08-450e-8a74-ea1642665e22","handle":"qa-67d5f6445fca","displayName":"QA 67d5f6445fca","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.333640478Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9a5c7474-76cf-45e3-b2e0-de0dc330f089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a5c7474-76cf-45e3-b2e0-de0dc330f089
Content-Type: application/json

--- request body ---
{"handle":"qa-64f1eb6f8a19","password":"****"}

--- response: 200 in 95 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a5c7474-76cf-45e3-b2e0-de0dc330f089
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c6d95ea6-ba59-466c-84b5-9dfe2b79e688"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-67a6bdb3-fac7-4916-bfb3-aff1bf8261fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67a6bdb3-fac7-4916-bfb3-aff1bf8261fa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-67d5f6445fca","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-67a6bdb3-fac7-4916-bfb3-aff1bf8261fa
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
Location: /v1/conversations/cnv_15cfa4fe-c643-4dfc-979f-9581b8a85453
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_15cfa4fe-c643-4dfc-979f-9581b8a85453","subject":"Error contract","status":"open","region":"eu","participants":["qa-64f1eb6f8a19","qa-67d5f6445fca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.469608009Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_15cfa4fe-c643-4dfc-979f-9581b8a85453/messages
correlation: qa-85fdf0b2-2c0f-4652-848e-1ea0ebdcf5f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85fdf0b2-2c0f-4652-848e-1ea0ebdcf5f1
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85fdf0b2-2c0f-4652-848e-1ea0ebdcf5f1
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_15cfa4fe-c643-4dfc-979f-9581b8a85453/messages","correlationId":"qa-85fdf0b2-2c0f-4652-848e-1ea0ebdcf5f1","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-59e435fe-28fd-4f26-9371-1addbfe5eefb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59e435fe-28fd-4f26-9371-1addbfe5eefb
Content-Type: application/json

--- request body ---
{"handle":"qa-67d5f6445fca","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-59e435fe-28fd-4f26-9371-1addbfe5eefb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d1cd901-eb08-450e-8a74-ea1642665e22"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a9bccf10-8e28-421b-a090-56db5056983b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9bccf10-8e28-421b-a090-56db5056983b
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a9bccf10-8e28-421b-a090-56db5056983b
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
correlation: qa-762e9733-ffd9-40ac-bc1c-d4e4fbd23f48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-762e9733-ffd9-40ac-bc1c-d4e4fbd23f48
Content-Type: application/json

--- request body ---
{"handle":"qa-67d5f6445fca","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-762e9733-ffd9-40ac-bc1c-d4e4fbd23f48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-762e9733-ffd9-40ac-bc1c-d4e4fbd23f48"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11c10d59-612a-4212-a159-60c129358a13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11c10d59-612a-4212-a159-60c129358a13
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11c10d59-612a-4212-a159-60c129358a13
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
correlation: qa-b93d885d-f616-4956-890d-a9adc2663d6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b93d885d-f616-4956-890d-a9adc2663d6e
Content-Type: application/json

--- request body ---
{"handle":"qa-64f1eb6f8a19","password":"****"}

--- response: 401 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b93d885d-f616-4956-890d-a9adc2663d6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b93d885d-f616-4956-890d-a9adc2663d6e"}
```
