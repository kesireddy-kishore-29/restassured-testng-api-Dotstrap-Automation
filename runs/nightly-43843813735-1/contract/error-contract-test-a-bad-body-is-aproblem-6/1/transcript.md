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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-772fdd22-7efd-407e-a829-a0f454cef94f` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-7f1e8d27-e5a4-44e9-9a78-5ed6e68e34c5` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-c5f8beb6-3b8d-42fa-a304-ffdf0565b7d9` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-c78ae46b-f15e-4fba-b2b3-4360b7517522` |
| 5 | `PATCH /v1/accounts/me` | 400 | 22 | `qa-604832ef-76a9-4525-8344-cf830ee2287c` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-07447351-7733-4580-b948-bd3444ccc305` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-999fb70c-f6aa-4f94-859f-b60a371ec8f3` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-2cd0428d-86dc-4aa5-b47a-e7729a9ac850` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-be0b3a6a-45e0-4ce4-829e-c9884162691f` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-73089b95-a1ea-4213-9446-ccab131cc9ce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-772fdd22-7efd-407e-a829-a0f454cef94f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-772fdd22-7efd-407e-a829-a0f454cef94f
Content-Type: application/json

--- request body ---
{"handle":"qa-b0ec37b186cc","displayName":"QA b0ec37b186cc","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-772fdd22-7efd-407e-a829-a0f454cef94f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-b0ec37b186cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f318d7a7-39fa-4c31-aa9c-1ca5e0b9f3c7","handle":"qa-b0ec37b186cc","displayName":"QA b0ec37b186cc","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.189294152Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7f1e8d27-e5a4-44e9-9a78-5ed6e68e34c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1e8d27-e5a4-44e9-9a78-5ed6e68e34c5
Content-Type: application/json

--- request body ---
{"handle":"qa-9400539c6025","displayName":"QA 9400539c6025","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f1e8d27-e5a4-44e9-9a78-5ed6e68e34c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Location: /v1/accounts/qa-9400539c6025
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5cdc6cff-5c1c-48fd-b21b-1348a09fc371","handle":"qa-9400539c6025","displayName":"QA 9400539c6025","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.232292077Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c5f8beb6-3b8d-42fa-a304-ffdf0565b7d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5f8beb6-3b8d-42fa-a304-ffdf0565b7d9
Content-Type: application/json

--- request body ---
{"handle":"qa-b0ec37b186cc","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5f8beb6-3b8d-42fa-a304-ffdf0565b7d9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f318d7a7-39fa-4c31-aa9c-1ca5e0b9f3c7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c78ae46b-f15e-4fba-b2b3-4360b7517522

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c78ae46b-f15e-4fba-b2b3-4360b7517522
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9400539c6025","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c78ae46b-f15e-4fba-b2b3-4360b7517522
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
Location: /v1/conversations/cnv_317de283-4e85-4ea4-96d9-84df8a791ccb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_317de283-4e85-4ea4-96d9-84df8a791ccb","subject":"Error contract","status":"open","region":"eu","participants":["qa-b0ec37b186cc","qa-9400539c6025"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.332356572Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-604832ef-76a9-4525-8344-cf830ee2287c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-604832ef-76a9-4525-8344-cf830ee2287c
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-604832ef-76a9-4525-8344-cf830ee2287c
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-604832ef-76a9-4525-8344-cf830ee2287c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-07447351-7733-4580-b948-bd3444ccc305

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07447351-7733-4580-b948-bd3444ccc305
Content-Type: application/json

--- request body ---
{"handle":"qa-9400539c6025","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-07447351-7733-4580-b948-bd3444ccc305
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5cdc6cff-5c1c-48fd-b21b-1348a09fc371"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-999fb70c-f6aa-4f94-859f-b60a371ec8f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999fb70c-f6aa-4f94-859f-b60a371ec8f3
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-999fb70c-f6aa-4f94-859f-b60a371ec8f3
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
correlation: qa-2cd0428d-86dc-4aa5-b47a-e7729a9ac850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cd0428d-86dc-4aa5-b47a-e7729a9ac850
Content-Type: application/json

--- request body ---
{"handle":"qa-9400539c6025","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2cd0428d-86dc-4aa5-b47a-e7729a9ac850
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2cd0428d-86dc-4aa5-b47a-e7729a9ac850"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be0b3a6a-45e0-4ce4-829e-c9884162691f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be0b3a6a-45e0-4ce4-829e-c9884162691f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be0b3a6a-45e0-4ce4-829e-c9884162691f
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
correlation: qa-73089b95-a1ea-4213-9446-ccab131cc9ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73089b95-a1ea-4213-9446-ccab131cc9ce
Content-Type: application/json

--- request body ---
{"handle":"qa-b0ec37b186cc","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73089b95-a1ea-4213-9446-ccab131cc9ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73089b95-a1ea-4213-9446-ccab131cc9ce"}
```
