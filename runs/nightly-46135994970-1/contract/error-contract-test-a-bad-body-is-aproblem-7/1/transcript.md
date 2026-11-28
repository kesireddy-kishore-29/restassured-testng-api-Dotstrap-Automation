# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-6e4637da-6d59-47e9-9bca-9e4dfb8f7431` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-8b72bbc6-df3f-4581-bc64-6ea46744638a` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-07bbc372-77ef-400d-adf9-e7792b997d34` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-1e841bde-ffc5-40e2-b39e-566ed2d70f20` |
| 5 | `PATCH /v1/accounts/me` | 415 | 29 | `qa-4f24755b-ee99-4ee2-bcee-57fcde795a03` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-5f884630-2758-4c0c-a336-b570c7cc5fb0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-6b921517-75a4-4f10-9812-a75c4b907e59` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-9898a25e-839f-45c5-9b11-b6054d5252cb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-cd1bb828-fbda-42f0-8b03-cee5cf2d4120` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-7e1d40d1-0932-40cb-ae85-7163fa75fb79` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e4637da-6d59-47e9-9bca-9e4dfb8f7431

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4637da-6d59-47e9-9bca-9e4dfb8f7431
Content-Type: application/json

--- request body ---
{"handle":"qa-67ce49df7910","displayName":"QA 67ce49df7910","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e4637da-6d59-47e9-9bca-9e4dfb8f7431
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Location: /v1/accounts/qa-67ce49df7910
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c80b5a8b-11f0-461b-ac2a-dec73190b92f","handle":"qa-67ce49df7910","displayName":"QA 67ce49df7910","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.370429356Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8b72bbc6-df3f-4581-bc64-6ea46744638a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b72bbc6-df3f-4581-bc64-6ea46744638a
Content-Type: application/json

--- request body ---
{"handle":"qa-2832ea44c694","displayName":"QA 2832ea44c694","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b72bbc6-df3f-4581-bc64-6ea46744638a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 7
Location: /v1/accounts/qa-2832ea44c694
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79a50131-8853-45d6-a976-68ade8d05d6d","handle":"qa-2832ea44c694","displayName":"QA 2832ea44c694","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.434020612Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-07bbc372-77ef-400d-adf9-e7792b997d34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07bbc372-77ef-400d-adf9-e7792b997d34
Content-Type: application/json

--- request body ---
{"handle":"qa-67ce49df7910","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-07bbc372-77ef-400d-adf9-e7792b997d34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c80b5a8b-11f0-461b-ac2a-dec73190b92f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1e841bde-ffc5-40e2-b39e-566ed2d70f20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e841bde-ffc5-40e2-b39e-566ed2d70f20
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2832ea44c694","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e841bde-ffc5-40e2-b39e-566ed2d70f20
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
Location: /v1/conversations/cnv_b465233c-039f-4da5-92ef-1da3c41709be
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b465233c-039f-4da5-92ef-1da3c41709be","subject":"Error contract","status":"open","region":"eu","participants":["qa-67ce49df7910","qa-2832ea44c694"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.531060592Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-4f24755b-ee99-4ee2-bcee-57fcde795a03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f24755b-ee99-4ee2-bcee-57fcde795a03
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 29 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f24755b-ee99-4ee2-bcee-57fcde795a03
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-4f24755b-ee99-4ee2-bcee-57fcde795a03"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5f884630-2758-4c0c-a336-b570c7cc5fb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f884630-2758-4c0c-a336-b570c7cc5fb0
Content-Type: application/json

--- request body ---
{"handle":"qa-2832ea44c694","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f884630-2758-4c0c-a336-b570c7cc5fb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79a50131-8853-45d6-a976-68ade8d05d6d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b921517-75a4-4f10-9812-a75c4b907e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b921517-75a4-4f10-9812-a75c4b907e59
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b921517-75a4-4f10-9812-a75c4b907e59
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
correlation: qa-9898a25e-839f-45c5-9b11-b6054d5252cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9898a25e-839f-45c5-9b11-b6054d5252cb
Content-Type: application/json

--- request body ---
{"handle":"qa-2832ea44c694","password":"****"}

--- response: 401 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9898a25e-839f-45c5-9b11-b6054d5252cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9898a25e-839f-45c5-9b11-b6054d5252cb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd1bb828-fbda-42f0-8b03-cee5cf2d4120

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd1bb828-fbda-42f0-8b03-cee5cf2d4120
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd1bb828-fbda-42f0-8b03-cee5cf2d4120
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
correlation: qa-7e1d40d1-0932-40cb-ae85-7163fa75fb79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e1d40d1-0932-40cb-ae85-7163fa75fb79
Content-Type: application/json

--- request body ---
{"handle":"qa-67ce49df7910","password":"****"}

--- response: 401 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e1d40d1-0932-40cb-ae85-7163fa75fb79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e1d40d1-0932-40cb-ae85-7163fa75fb79"}
```
