# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 84 | `qa-88d411d5-ed25-4bb2-b5c0-d8dfcb3f9d83` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-71e1abd8-59df-4fae-876d-c1d7ee505405` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-06c263ef-9c3a-401f-b0a4-92a89645bf20` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-7a7f3c0c-78cb-4673-830d-67f2e1da29ce` |
| 5 | `POST /v1/auth/token` | 415 | 49 | `qa-9754defe-30af-4a0d-8c28-04e03c29a6a8` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-adbbe6a7-1b38-4cfb-b884-ea33c2a35328` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-f8f1e688-fabd-4a54-b5b1-537520a94a0a` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-baed64e0-d238-4489-9557-b4a7a9c4b15f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-20a68255-6976-4872-a8a8-2e945794643d` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-fafdd71d-100b-4a38-9d0f-81355a731e05` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-88d411d5-ed25-4bb2-b5c0-d8dfcb3f9d83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88d411d5-ed25-4bb2-b5c0-d8dfcb3f9d83
Content-Type: application/json

--- request body ---
{"handle":"qa-a4cd996602c2","displayName":"QA a4cd996602c2","password":"****","region":"eu"}

--- response: 201 in 84 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-88d411d5-ed25-4bb2-b5c0-d8dfcb3f9d83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-a4cd996602c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24355bf7-9201-4013-ade0-bded8a1f9867","handle":"qa-a4cd996602c2","displayName":"QA a4cd996602c2","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.769477616Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-71e1abd8-59df-4fae-876d-c1d7ee505405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71e1abd8-59df-4fae-876d-c1d7ee505405
Content-Type: application/json

--- request body ---
{"handle":"qa-4d210b5f2657","displayName":"QA 4d210b5f2657","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-71e1abd8-59df-4fae-876d-c1d7ee505405
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
Location: /v1/accounts/qa-4d210b5f2657
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ff96a93-2f04-4a3b-8743-1fbedceb71c7","handle":"qa-4d210b5f2657","displayName":"QA 4d210b5f2657","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.818411809Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-06c263ef-9c3a-401f-b0a4-92a89645bf20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06c263ef-9c3a-401f-b0a4-92a89645bf20
Content-Type: application/json

--- request body ---
{"handle":"qa-a4cd996602c2","password":"****"}

--- response: 200 in 48 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-06c263ef-9c3a-401f-b0a4-92a89645bf20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24355bf7-9201-4013-ade0-bded8a1f9867"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7a7f3c0c-78cb-4673-830d-67f2e1da29ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a7f3c0c-78cb-4673-830d-67f2e1da29ce
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4d210b5f2657","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a7f3c0c-78cb-4673-830d-67f2e1da29ce
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
Location: /v1/conversations/cnv_d4421f65-3267-4197-8fa1-5a03e26d4f3f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d4421f65-3267-4197-8fa1-5a03e26d4f3f","subject":"Error contract","status":"open","region":"eu","participants":["qa-a4cd996602c2","qa-4d210b5f2657"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.937934645Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9754defe-30af-4a0d-8c28-04e03c29a6a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9754defe-30af-4a0d-8c28-04e03c29a6a8
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 49 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9754defe-30af-4a0d-8c28-04e03c29a6a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-9754defe-30af-4a0d-8c28-04e03c29a6a8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-adbbe6a7-1b38-4cfb-b884-ea33c2a35328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adbbe6a7-1b38-4cfb-b884-ea33c2a35328
Content-Type: application/json

--- request body ---
{"handle":"qa-4d210b5f2657","password":"****"}

--- response: 200 in 60 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-adbbe6a7-1b38-4cfb-b884-ea33c2a35328
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ff96a93-2f04-4a3b-8743-1fbedceb71c7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8f1e688-fabd-4a54-b5b1-537520a94a0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8f1e688-fabd-4a54-b5b1-537520a94a0a
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8f1e688-fabd-4a54-b5b1-537520a94a0a
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
correlation: qa-baed64e0-d238-4489-9557-b4a7a9c4b15f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baed64e0-d238-4489-9557-b4a7a9c4b15f
Content-Type: application/json

--- request body ---
{"handle":"qa-4d210b5f2657","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-baed64e0-d238-4489-9557-b4a7a9c4b15f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-baed64e0-d238-4489-9557-b4a7a9c4b15f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20a68255-6976-4872-a8a8-2e945794643d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20a68255-6976-4872-a8a8-2e945794643d
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20a68255-6976-4872-a8a8-2e945794643d
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
correlation: qa-fafdd71d-100b-4a38-9d0f-81355a731e05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fafdd71d-100b-4a38-9d0f-81355a731e05
Content-Type: application/json

--- request body ---
{"handle":"qa-a4cd996602c2","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fafdd71d-100b-4a38-9d0f-81355a731e05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fafdd71d-100b-4a38-9d0f-81355a731e05"}
```
