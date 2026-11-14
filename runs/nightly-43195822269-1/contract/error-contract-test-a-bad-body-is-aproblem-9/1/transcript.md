# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-863eab9c-1102-4cc2-bac8-f7cb5e19ddac` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-10fdf526-f4b6-46ef-bd3b-51c8cbcdf4af` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-b639a19c-9435-4608-8617-01ae4cc06ea6` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-3ea48710-141f-40f6-9d7f-c11e70384c53` |
| 5 | `POST /v1/conversations` | 400 | 7 | `qa-bb54c4ed-bf08-42f7-8cb6-77b259b4ae58` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-48f90b66-5109-4319-a2aa-7e27d2be30d4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-25e457e6-fd15-4706-acd5-ea382b69e440` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-26332183-7283-4799-ae9b-85272eb5ea03` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-cd1b37b5-da29-43c4-9aa0-c8443045bf87` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-e8fa11b4-ccbf-41a1-9544-291e310a0530` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-863eab9c-1102-4cc2-bac8-f7cb5e19ddac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-863eab9c-1102-4cc2-bac8-f7cb5e19ddac
Content-Type: application/json

--- request body ---
{"handle":"qa-5e8b9c519122","displayName":"QA 5e8b9c519122","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-863eab9c-1102-4cc2-bac8-f7cb5e19ddac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-5e8b9c519122
X-Served-Region: eu
Content-Length: 181

{"id":"acc_129030a2-035e-4e87-b4ed-1e8bb2bbf75c","handle":"qa-5e8b9c519122","displayName":"QA 5e8b9c519122","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.565280292Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-10fdf526-f4b6-46ef-bd3b-51c8cbcdf4af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10fdf526-f4b6-46ef-bd3b-51c8cbcdf4af
Content-Type: application/json

--- request body ---
{"handle":"qa-9235c2e0da79","displayName":"QA 9235c2e0da79","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-10fdf526-f4b6-46ef-bd3b-51c8cbcdf4af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Location: /v1/accounts/qa-9235c2e0da79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff593ec9-82d1-4886-abbb-d8cc9a51b834","handle":"qa-9235c2e0da79","displayName":"QA 9235c2e0da79","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.598349483Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b639a19c-9435-4608-8617-01ae4cc06ea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b639a19c-9435-4608-8617-01ae4cc06ea6
Content-Type: application/json

--- request body ---
{"handle":"qa-5e8b9c519122","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b639a19c-9435-4608-8617-01ae4cc06ea6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_129030a2-035e-4e87-b4ed-1e8bb2bbf75c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3ea48710-141f-40f6-9d7f-c11e70384c53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ea48710-141f-40f6-9d7f-c11e70384c53
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9235c2e0da79","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ea48710-141f-40f6-9d7f-c11e70384c53
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
Location: /v1/conversations/cnv_3580b496-fd9b-4a11-9333-4829a6a742d2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3580b496-fd9b-4a11-9333-4829a6a742d2","subject":"Error contract","status":"open","region":"eu","participants":["qa-5e8b9c519122","qa-9235c2e0da79"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.650220880Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-bb54c4ed-bf08-42f7-8cb6-77b259b4ae58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb54c4ed-bf08-42f7-8cb6-77b259b4ae58
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb54c4ed-bf08-42f7-8cb6-77b259b4ae58
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-bb54c4ed-bf08-42f7-8cb6-77b259b4ae58"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-48f90b66-5109-4319-a2aa-7e27d2be30d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48f90b66-5109-4319-a2aa-7e27d2be30d4
Content-Type: application/json

--- request body ---
{"handle":"qa-9235c2e0da79","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-48f90b66-5109-4319-a2aa-7e27d2be30d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff593ec9-82d1-4886-abbb-d8cc9a51b834"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25e457e6-fd15-4706-acd5-ea382b69e440

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25e457e6-fd15-4706-acd5-ea382b69e440
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25e457e6-fd15-4706-acd5-ea382b69e440
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
correlation: qa-26332183-7283-4799-ae9b-85272eb5ea03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26332183-7283-4799-ae9b-85272eb5ea03
Content-Type: application/json

--- request body ---
{"handle":"qa-9235c2e0da79","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26332183-7283-4799-ae9b-85272eb5ea03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-26332183-7283-4799-ae9b-85272eb5ea03"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd1b37b5-da29-43c4-9aa0-c8443045bf87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd1b37b5-da29-43c4-9aa0-c8443045bf87
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd1b37b5-da29-43c4-9aa0-c8443045bf87
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
correlation: qa-e8fa11b4-ccbf-41a1-9544-291e310a0530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8fa11b4-ccbf-41a1-9544-291e310a0530
Content-Type: application/json

--- request body ---
{"handle":"qa-5e8b9c519122","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8fa11b4-ccbf-41a1-9544-291e310a0530
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e8fa11b4-ccbf-41a1-9544-291e310a0530"}
```
