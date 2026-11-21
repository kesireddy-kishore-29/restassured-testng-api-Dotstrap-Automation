# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-a7445e34-b244-4641-b459-842095231723` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-b85d5d8e-a6d3-4381-90b5-6a499a98795b` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-59956a8b-dada-4362-92f5-24b82ba97ca7` |
| 4 | `POST /v1/conversations` | 201 | 45 | `qa-ce5d41c8-cc91-4d30-bd2f-f31a17a9f1a3` |
| 5 | `POST /v1/conversations` | 422 | 9 | `qa-a9032f14-09dc-47c1-85fa-4d5e9f9885d2` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-cb58a6d1-53ed-4702-b4f7-2f09969a8a4d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-517d20dd-7f8f-4a3f-bf16-a209e79dc34a` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-ee9d7399-9fdd-4675-a1f9-2bb8327ef5ee` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-13d04c4a-77c6-4889-be12-11bdab1af550` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-5fcb58de-69a1-4ea6-a7f0-451b799bb69e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a7445e34-b244-4641-b459-842095231723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7445e34-b244-4641-b459-842095231723
Content-Type: application/json

--- request body ---
{"handle":"qa-82c6057c1d18","displayName":"QA 82c6057c1d18","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7445e34-b244-4641-b459-842095231723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Location: /v1/accounts/qa-82c6057c1d18
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37459646-b19d-472a-a491-8b98e8d343e4","handle":"qa-82c6057c1d18","displayName":"QA 82c6057c1d18","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.964095331Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b85d5d8e-a6d3-4381-90b5-6a499a98795b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b85d5d8e-a6d3-4381-90b5-6a499a98795b
Content-Type: application/json

--- request body ---
{"handle":"qa-a43ddfed4250","displayName":"QA a43ddfed4250","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b85d5d8e-a6d3-4381-90b5-6a499a98795b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Location: /v1/accounts/qa-a43ddfed4250
X-Served-Region: eu
Content-Length: 181

{"id":"acc_768f05f5-c026-4b6f-a9fa-04a8c07e8f28","handle":"qa-a43ddfed4250","displayName":"QA a43ddfed4250","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.982642050Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-59956a8b-dada-4362-92f5-24b82ba97ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59956a8b-dada-4362-92f5-24b82ba97ca7
Content-Type: application/json

--- request body ---
{"handle":"qa-82c6057c1d18","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-59956a8b-dada-4362-92f5-24b82ba97ca7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37459646-b19d-472a-a491-8b98e8d343e4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ce5d41c8-cc91-4d30-bd2f-f31a17a9f1a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce5d41c8-cc91-4d30-bd2f-f31a17a9f1a3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a43ddfed4250","subject":"Error contract","message":"Hi"}

--- response: 201 in 45 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce5d41c8-cc91-4d30-bd2f-f31a17a9f1a3
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
Location: /v1/conversations/cnv_461cb723-8b05-4f84-8673-580cc2e8be8c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_461cb723-8b05-4f84-8673-580cc2e8be8c","subject":"Error contract","status":"open","region":"eu","participants":["qa-82c6057c1d18","qa-a43ddfed4250"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.066784518Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a9032f14-09dc-47c1-85fa-4d5e9f9885d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9032f14-09dc-47c1-85fa-4d5e9f9885d2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a43ddfed4250","subject":" ","message":"Hi"}

--- response: 422 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9032f14-09dc-47c1-85fa-4d5e9f9885d2
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-a9032f14-09dc-47c1-85fa-4d5e9f9885d2","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cb58a6d1-53ed-4702-b4f7-2f09969a8a4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb58a6d1-53ed-4702-b4f7-2f09969a8a4d
Content-Type: application/json

--- request body ---
{"handle":"qa-a43ddfed4250","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb58a6d1-53ed-4702-b4f7-2f09969a8a4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_768f05f5-c026-4b6f-a9fa-04a8c07e8f28"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-517d20dd-7f8f-4a3f-bf16-a209e79dc34a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-517d20dd-7f8f-4a3f-bf16-a209e79dc34a
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-517d20dd-7f8f-4a3f-bf16-a209e79dc34a
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
correlation: qa-ee9d7399-9fdd-4675-a1f9-2bb8327ef5ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee9d7399-9fdd-4675-a1f9-2bb8327ef5ee
Content-Type: application/json

--- request body ---
{"handle":"qa-a43ddfed4250","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee9d7399-9fdd-4675-a1f9-2bb8327ef5ee
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee9d7399-9fdd-4675-a1f9-2bb8327ef5ee"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-13d04c4a-77c6-4889-be12-11bdab1af550

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13d04c4a-77c6-4889-be12-11bdab1af550
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-13d04c4a-77c6-4889-be12-11bdab1af550
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
correlation: qa-5fcb58de-69a1-4ea6-a7f0-451b799bb69e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fcb58de-69a1-4ea6-a7f0-451b799bb69e
Content-Type: application/json

--- request body ---
{"handle":"qa-82c6057c1d18","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5fcb58de-69a1-4ea6-a7f0-451b799bb69e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5fcb58de-69a1-4ea6-a7f0-451b799bb69e"}
```
