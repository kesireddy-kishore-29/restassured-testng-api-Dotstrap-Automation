# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-a070a476-e1c0-4042-bca0-6250115b1365` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-118aae20-0c6d-46df-93f6-3ebeacf1a628` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-4590618a-fd0c-4d95-96f1-da4189660cba` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-a69a041e-a5a8-46d9-8e79-bab8a907a2a1` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 9 | `qa-07b03217-4280-428c-9742-d905aa223184` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-afc39e4a-a8e3-4457-a4bc-8c8cb66bc24f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-43949687-6a8a-4ed3-b836-858a7c8118f2` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-8a3997f4-51f7-4d36-ab0e-0f5587ae80e8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-fc927437-2862-465d-92a6-f05101950aad` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-82fca07e-66f8-4803-8607-5a7ab7c609cf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a070a476-e1c0-4042-bca0-6250115b1365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a070a476-e1c0-4042-bca0-6250115b1365
Content-Type: application/json

--- request body ---
{"handle":"qa-200eda9e3a6f","displayName":"QA 200eda9e3a6f","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a070a476-e1c0-4042-bca0-6250115b1365
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Location: /v1/accounts/qa-200eda9e3a6f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ec1ed1a4-a7a3-449d-94dc-fa385ce2f305","handle":"qa-200eda9e3a6f","displayName":"QA 200eda9e3a6f","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.723499179Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-118aae20-0c6d-46df-93f6-3ebeacf1a628

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-118aae20-0c6d-46df-93f6-3ebeacf1a628
Content-Type: application/json

--- request body ---
{"handle":"qa-57ef17797d1b","displayName":"QA 57ef17797d1b","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-118aae20-0c6d-46df-93f6-3ebeacf1a628
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Location: /v1/accounts/qa-57ef17797d1b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4c1115e-bafb-4acf-b3be-95e184b54153","handle":"qa-57ef17797d1b","displayName":"QA 57ef17797d1b","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.778988508Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4590618a-fd0c-4d95-96f1-da4189660cba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4590618a-fd0c-4d95-96f1-da4189660cba
Content-Type: application/json

--- request body ---
{"handle":"qa-200eda9e3a6f","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4590618a-fd0c-4d95-96f1-da4189660cba
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ec1ed1a4-a7a3-449d-94dc-fa385ce2f305"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a69a041e-a5a8-46d9-8e79-bab8a907a2a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a69a041e-a5a8-46d9-8e79-bab8a907a2a1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-57ef17797d1b","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a69a041e-a5a8-46d9-8e79-bab8a907a2a1
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
Location: /v1/conversations/cnv_eb470a44-e173-4a29-ad12-502df01d666c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eb470a44-e173-4a29-ad12-502df01d666c","subject":"Error contract","status":"open","region":"eu","participants":["qa-200eda9e3a6f","qa-57ef17797d1b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.819783325Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_eb470a44-e173-4a29-ad12-502df01d666c/messages
correlation: qa-07b03217-4280-428c-9742-d905aa223184

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07b03217-4280-428c-9742-d905aa223184
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07b03217-4280-428c-9742-d905aa223184
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_eb470a44-e173-4a29-ad12-502df01d666c/messages","correlationId":"qa-07b03217-4280-428c-9742-d905aa223184"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-afc39e4a-a8e3-4457-a4bc-8c8cb66bc24f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afc39e4a-a8e3-4457-a4bc-8c8cb66bc24f
Content-Type: application/json

--- request body ---
{"handle":"qa-57ef17797d1b","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-afc39e4a-a8e3-4457-a4bc-8c8cb66bc24f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4c1115e-bafb-4acf-b3be-95e184b54153"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43949687-6a8a-4ed3-b836-858a7c8118f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43949687-6a8a-4ed3-b836-858a7c8118f2
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43949687-6a8a-4ed3-b836-858a7c8118f2
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
correlation: qa-8a3997f4-51f7-4d36-ab0e-0f5587ae80e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a3997f4-51f7-4d36-ab0e-0f5587ae80e8
Content-Type: application/json

--- request body ---
{"handle":"qa-57ef17797d1b","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a3997f4-51f7-4d36-ab0e-0f5587ae80e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8a3997f4-51f7-4d36-ab0e-0f5587ae80e8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc927437-2862-465d-92a6-f05101950aad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc927437-2862-465d-92a6-f05101950aad
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc927437-2862-465d-92a6-f05101950aad
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
correlation: qa-82fca07e-66f8-4803-8607-5a7ab7c609cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82fca07e-66f8-4803-8607-5a7ab7c609cf
Content-Type: application/json

--- request body ---
{"handle":"qa-200eda9e3a6f","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82fca07e-66f8-4803-8607-5a7ab7c609cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-82fca07e-66f8-4803-8607-5a7ab7c609cf"}
```
